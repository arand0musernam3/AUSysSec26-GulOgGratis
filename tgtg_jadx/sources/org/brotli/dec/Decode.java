package org.brotli.dec;

import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
final class Decode {
    private static final int CODE_LENGTH_CODES = 18;
    private static final int CODE_LENGTH_REPEAT_CODE = 16;
    private static final int DEFAULT_CODE_LENGTH = 8;
    private static final int DISTANCE_CONTEXT_BITS = 2;
    private static final int HUFFMAN_TABLE_BITS = 8;
    private static final int HUFFMAN_TABLE_MASK = 255;
    private static final int LITERAL_CONTEXT_BITS = 6;
    private static final int NUM_BLOCK_LENGTH_CODES = 26;
    private static final int NUM_DISTANCE_SHORT_CODES = 16;
    private static final int NUM_INSERT_AND_COPY_CODES = 704;
    private static final int NUM_LITERAL_CODES = 256;
    private static final int[] CODE_LENGTH_CODE_ORDER = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    private static final int[] DISTANCE_SHORT_CODE_INDEX_OFFSET = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};
    private static final int[] DISTANCE_SHORT_CODE_VALUE_OFFSET = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};
    private static final int[] FIXED_TABLE = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};

    private static void copyUncompressedData(State state) {
        BitReader bitReader = state.f33726br;
        byte[] bArr = state.ringBuffer;
        int i11 = state.metaBlockLength;
        if (i11 <= 0) {
            BitReader.reload(bitReader);
            state.runningState = 1;
            return;
        }
        int iMin = Math.min(state.ringBufferSize - state.pos, i11);
        BitReader.copyBytes(bitReader, bArr, state.pos, iMin);
        state.metaBlockLength -= iMin;
        int i12 = state.pos + iMin;
        state.pos = i12;
        int i13 = state.ringBufferSize;
        if (i12 != i13) {
            BitReader.reload(bitReader);
            state.runningState = 1;
        } else {
            state.nextRunningState = 5;
            state.bytesToWrite = i13;
            state.bytesWritten = 0;
            state.runningState = 12;
        }
    }

    private static void decodeBlockTypeAndLength(State state, int i11) {
        BitReader bitReader = state.f33726br;
        int[] iArr = state.blockTypeRb;
        int i12 = i11 * 2;
        BitReader.fillBitWindow(bitReader);
        int i13 = i11 * 1080;
        int symbol = readSymbol(state.blockTypeTrees, i13, bitReader);
        state.blockLength[i11] = readBlockLength(state.blockLenTrees, i13, bitReader);
        int i14 = symbol == 1 ? iArr[i12 + 1] + 1 : symbol == 0 ? iArr[i12] : symbol - 2;
        int i15 = state.numBlockTypes[i11];
        if (i14 >= i15) {
            i14 -= i15;
        }
        int i16 = i12 + 1;
        iArr[i12] = iArr[i16];
        iArr[i16] = i14;
    }

    private static void decodeCommandBlockSwitch(State state) {
        decodeBlockTypeAndLength(state, 1);
        state.treeCommandOffset = state.hGroup1.trees[state.blockTypeRb[3]];
    }

    private static int decodeContextMap(int i11, byte[] bArr, BitReader bitReader) {
        BitReader.readMoreInput(bitReader);
        int iDecodeVarLenUnsignedByte = decodeVarLenUnsignedByte(bitReader) + 1;
        if (iDecodeVarLenUnsignedByte == 1) {
            Utils.fillWithZeroes(bArr, 0, i11);
            return iDecodeVarLenUnsignedByte;
        }
        int bits = BitReader.readBits(bitReader, 1) == 1 ? BitReader.readBits(bitReader, 4) + 1 : 0;
        int[] iArr = new int[1080];
        readHuffmanCode(iDecodeVarLenUnsignedByte + bits, iArr, 0, bitReader);
        int i12 = 0;
        while (i12 < i11) {
            BitReader.readMoreInput(bitReader);
            BitReader.fillBitWindow(bitReader);
            int symbol = readSymbol(iArr, 0, bitReader);
            if (symbol == 0) {
                bArr[i12] = 0;
            } else if (symbol <= bits) {
                for (int bits2 = (1 << symbol) + BitReader.readBits(bitReader, symbol); bits2 != 0; bits2--) {
                    if (i12 >= i11) {
                        a.a("Corrupted context map");
                        return 0;
                    }
                    bArr[i12] = 0;
                    i12++;
                }
            } else {
                bArr[i12] = (byte) (symbol - bits);
            }
            i12++;
        }
        if (BitReader.readBits(bitReader, 1) == 1) {
            inverseMoveToFrontTransform(bArr, i11);
        }
        return iDecodeVarLenUnsignedByte;
    }

    private static void decodeDistanceBlockSwitch(State state) {
        decodeBlockTypeAndLength(state, 2);
        state.distContextMapSlice = state.blockTypeRb[5] << 2;
    }

    private static void decodeLiteralBlockSwitch(State state) {
        decodeBlockTypeAndLength(state, 0);
        int i11 = state.blockTypeRb[1];
        int i12 = i11 << 6;
        state.contextMapSlice = i12;
        int i13 = state.contextMap[i12] & 255;
        state.literalTreeIndex = i13;
        state.literalTree = state.hGroup0.trees[i13];
        byte b8 = state.contextModes[i11];
        int[] iArr = Context.LOOKUP_OFFSETS;
        state.contextLookupOffset1 = iArr[b8];
        state.contextLookupOffset2 = iArr[b8 + 1];
    }

    private static void decodeMetaBlockLength(BitReader bitReader, State state) {
        boolean z11 = BitReader.readBits(bitReader, 1) == 1;
        state.inputEnd = z11;
        state.metaBlockLength = 0;
        state.isUncompressed = false;
        state.isMetadata = false;
        if (!z11 || BitReader.readBits(bitReader, 1) == 0) {
            int bits = BitReader.readBits(bitReader, 2) + 4;
            if (bits == 7) {
                state.isMetadata = true;
                if (BitReader.readBits(bitReader, 1) != 0) {
                    a.a("Corrupted reserved bit");
                    return;
                }
                int bits2 = BitReader.readBits(bitReader, 2);
                if (bits2 == 0) {
                    return;
                }
                for (int i11 = 0; i11 < bits2; i11++) {
                    int bits3 = BitReader.readBits(bitReader, 8);
                    if (bits3 == 0 && i11 + 1 == bits2 && bits2 > 1) {
                        a.a("Exuberant nibble");
                        return;
                    }
                    state.metaBlockLength = (bits3 << (i11 * 8)) | state.metaBlockLength;
                }
            } else {
                for (int i12 = 0; i12 < bits; i12++) {
                    int bits4 = BitReader.readBits(bitReader, 4);
                    if (bits4 == 0 && i12 + 1 == bits && bits > 4) {
                        a.a("Exuberant nibble");
                        return;
                    }
                    state.metaBlockLength = (bits4 << (i12 * 4)) | state.metaBlockLength;
                }
            }
            state.metaBlockLength++;
            if (state.inputEnd) {
                return;
            }
            state.isUncompressed = BitReader.readBits(bitReader, 1) == 1;
        }
    }

    private static int decodeVarLenUnsignedByte(BitReader bitReader) {
        if (BitReader.readBits(bitReader, 1) == 0) {
            return 0;
        }
        int bits = BitReader.readBits(bitReader, 3);
        if (bits == 0) {
            return 1;
        }
        return BitReader.readBits(bitReader, bits) + (1 << bits);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        org.brotli.dec.a.a("Invalid backward reference");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133 A[LOOP:4: B:50:0x0133->B:175:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void decompress(org.brotli.dec.State r19) {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.brotli.dec.Decode.decompress(org.brotli.dec.State):void");
    }

    private static void inverseMoveToFrontTransform(byte[] bArr, int i11) {
        int[] iArr = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr[i12] = i12;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = bArr[i13] & 255;
            bArr[i13] = (byte) iArr[i14];
            if (i14 != 0) {
                moveToFront(iArr, i14);
            }
        }
    }

    private static void maybeReallocateRingBuffer(State state) {
        int i11;
        int i12 = state.maxRingBufferSize;
        long j9 = i12;
        long j11 = state.expectedTotalSize;
        if (j9 > j11) {
            while (true) {
                int i13 = i12 >> 1;
                if (i13 <= ((int) j11) + state.customDictionary.length) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            if (!state.inputEnd && i12 < 16384 && state.maxRingBufferSize >= 16384) {
                i12 = 16384;
            }
        }
        int i14 = state.ringBufferSize;
        if (i12 <= i14) {
            return;
        }
        byte[] bArr = new byte[i12 + 37];
        byte[] bArr2 = state.ringBuffer;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, 0, i14);
        } else {
            byte[] bArr3 = state.customDictionary;
            if (bArr3.length != 0) {
                int length = bArr3.length;
                int i15 = state.maxBackwardDistance;
                if (length > i15) {
                    i11 = length - i15;
                } else {
                    i15 = length;
                    i11 = 0;
                }
                System.arraycopy(bArr3, i11, bArr, 0, i15);
                state.pos = i15;
                state.bytesToIgnore = i15;
            }
        }
        state.ringBuffer = bArr;
        state.ringBufferSize = i12;
    }

    private static void moveToFront(int[] iArr, int i11) {
        int i12 = iArr[i11];
        while (i11 > 0) {
            iArr[i11] = iArr[i11 - 1];
            i11--;
        }
        iArr[0] = i12;
    }

    private static int readBlockLength(int[] iArr, int i11, BitReader bitReader) {
        BitReader.fillBitWindow(bitReader);
        int symbol = readSymbol(iArr, i11, bitReader);
        return Prefix.BLOCK_LENGTH_OFFSET[symbol] + BitReader.readBits(bitReader, Prefix.BLOCK_LENGTH_N_BITS[symbol]);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void readHuffmanCode(int r14, int[] r15, int r16, org.brotli.dec.BitReader r17) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.brotli.dec.Decode.readHuffmanCode(int, int[], int, org.brotli.dec.BitReader):void");
    }

    private static void readHuffmanCodeLengths(int[] iArr, int i11, int[] iArr2, BitReader bitReader) {
        int[] iArr3 = new int[32];
        Huffman.buildHuffmanTable(iArr3, 0, 5, iArr, 18);
        int i12 = 8;
        int i13 = 32768;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < i11 && i13 > 0) {
            BitReader.readMoreInput(bitReader);
            BitReader.fillBitWindow(bitReader);
            long j9 = bitReader.accumulator;
            int i17 = bitReader.bitOffset;
            int i18 = iArr3[((int) (j9 >>> i17)) & 31];
            bitReader.bitOffset = i17 + (i18 >> 16);
            int i19 = i18 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            if (i19 < 16) {
                int i21 = i14 + 1;
                iArr2[i14] = i19;
                if (i19 != 0) {
                    i13 -= 32768 >> i19;
                    i14 = i21;
                    i12 = i19;
                } else {
                    i14 = i21;
                }
                i16 = 0;
            } else {
                int i22 = i19 - 14;
                int i23 = i19 == 16 ? i12 : 0;
                if (i15 != i23) {
                    i16 = 0;
                    i15 = i23;
                }
                int bits = BitReader.readBits(bitReader, i22) + 3 + (i16 > 0 ? (i16 - 2) << i22 : i16);
                int i24 = bits - i16;
                if (i14 + i24 > i11) {
                    a.a("symbol + repeatDelta > numSymbols");
                    return;
                }
                int i25 = 0;
                while (i25 < i24) {
                    iArr2[i14] = i15;
                    i25++;
                    i14++;
                }
                if (i15 != 0) {
                    i13 -= i24 << (15 - i15);
                }
                i16 = bits;
            }
        }
        if (i13 == 0) {
            Utils.fillWithZeroes(iArr2, i14, i11 - i14);
        } else {
            a.a("Unused space");
        }
    }

    private static void readMetablockHuffmanCodesAndContextMaps(State state) {
        int i11;
        int[] iArr;
        BitReader bitReader = state.f33726br;
        for (int i12 = 0; i12 < 3; i12++) {
            state.numBlockTypes[i12] = decodeVarLenUnsignedByte(bitReader) + 1;
            state.blockLength[i12] = 268435456;
            int i13 = state.numBlockTypes[i12];
            if (i13 > 1) {
                int i14 = i12 * 1080;
                readHuffmanCode(i13 + 2, state.blockTypeTrees, i14, bitReader);
                readHuffmanCode(26, state.blockLenTrees, i14, bitReader);
                state.blockLength[i12] = readBlockLength(state.blockLenTrees, i14, bitReader);
            }
        }
        BitReader.readMoreInput(bitReader);
        state.distancePostfixBits = BitReader.readBits(bitReader, 2);
        int bits = BitReader.readBits(bitReader, 4);
        int i15 = state.distancePostfixBits;
        int i16 = (bits << i15) + 16;
        state.numDirectDistanceCodes = i16;
        state.distancePostfixMask = (1 << i15) - 1;
        int i17 = i16 + (48 << i15);
        state.contextModes = new byte[state.numBlockTypes[0]];
        int i18 = 0;
        while (true) {
            i11 = state.numBlockTypes[0];
            if (i18 >= i11) {
                break;
            }
            int iMin = Math.min(i18 + 96, i11);
            while (i18 < iMin) {
                state.contextModes[i18] = (byte) (BitReader.readBits(bitReader, 2) << 1);
                i18++;
            }
            BitReader.readMoreInput(bitReader);
        }
        byte[] bArr = new byte[i11 << 6];
        state.contextMap = bArr;
        int iDecodeContextMap = decodeContextMap(i11 << 6, bArr, bitReader);
        state.trivialLiteralContext = true;
        int i19 = 0;
        while (true) {
            iArr = state.numBlockTypes;
            if (i19 >= (iArr[0] << 6)) {
                break;
            }
            if (state.contextMap[i19] != (i19 >> 6)) {
                state.trivialLiteralContext = false;
                break;
            }
            i19++;
        }
        int i21 = iArr[2];
        byte[] bArr2 = new byte[i21 << 2];
        state.distContextMap = bArr2;
        int iDecodeContextMap2 = decodeContextMap(i21 << 2, bArr2, bitReader);
        HuffmanTreeGroup.init(state.hGroup0, 256, iDecodeContextMap);
        HuffmanTreeGroup.init(state.hGroup1, NUM_INSERT_AND_COPY_CODES, state.numBlockTypes[1]);
        HuffmanTreeGroup.init(state.hGroup2, i17, iDecodeContextMap2);
        HuffmanTreeGroup.decode(state.hGroup0, bitReader);
        HuffmanTreeGroup.decode(state.hGroup1, bitReader);
        HuffmanTreeGroup.decode(state.hGroup2, bitReader);
        state.contextMapSlice = 0;
        state.distContextMapSlice = 0;
        int[] iArr2 = Context.LOOKUP_OFFSETS;
        byte b8 = state.contextModes[0];
        state.contextLookupOffset1 = iArr2[b8];
        state.contextLookupOffset2 = iArr2[b8 + 1];
        state.literalTreeIndex = 0;
        state.literalTree = state.hGroup0.trees[0];
        state.treeCommandOffset = state.hGroup1.trees[0];
        int[] iArr3 = state.blockTypeRb;
        iArr3[4] = 1;
        iArr3[2] = 1;
        iArr3[0] = 1;
        iArr3[5] = 0;
        iArr3[3] = 0;
        iArr3[1] = 0;
    }

    private static void readMetablockInfo(State state) {
        BitReader bitReader = state.f33726br;
        if (state.inputEnd) {
            state.nextRunningState = 10;
            state.bytesToWrite = state.pos;
            state.bytesWritten = 0;
            state.runningState = 12;
            return;
        }
        HuffmanTreeGroup huffmanTreeGroup = state.hGroup0;
        huffmanTreeGroup.codes = null;
        huffmanTreeGroup.trees = null;
        HuffmanTreeGroup huffmanTreeGroup2 = state.hGroup1;
        huffmanTreeGroup2.codes = null;
        huffmanTreeGroup2.trees = null;
        HuffmanTreeGroup huffmanTreeGroup3 = state.hGroup2;
        huffmanTreeGroup3.codes = null;
        huffmanTreeGroup3.trees = null;
        BitReader.readMoreInput(bitReader);
        decodeMetaBlockLength(bitReader, state);
        if (state.metaBlockLength != 0 || state.isMetadata) {
            if (state.isUncompressed || state.isMetadata) {
                BitReader.jumpToByteBoundary(bitReader);
                state.runningState = state.isMetadata ? 4 : 5;
            } else {
                state.runningState = 2;
            }
            if (state.isMetadata) {
                return;
            }
            state.expectedTotalSize += (long) state.metaBlockLength;
            if (state.ringBufferSize < state.maxRingBufferSize) {
                maybeReallocateRingBuffer(state);
            }
        }
    }

    private static int readSymbol(int[] iArr, int i11, BitReader bitReader) {
        long j9 = bitReader.accumulator;
        int i12 = bitReader.bitOffset;
        int i13 = (int) (j9 >>> i12);
        int i14 = i11 + (i13 & 255);
        int i15 = iArr[i14];
        int i16 = i15 >> 16;
        int i17 = i15 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        if (i16 <= 8) {
            bitReader.bitOffset = i12 + i16;
            return i17;
        }
        int i18 = iArr[i14 + i17 + ((i13 & ((1 << i16) - 1)) >>> 8)];
        bitReader.bitOffset = (i18 >> 16) + 8 + i12;
        return i18 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    public static void setCustomDictionary(State state, byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        state.customDictionary = bArr;
    }

    private static int translateShortCodes(int i11, int[] iArr, int i12) {
        return i11 < 16 ? iArr[(i12 + DISTANCE_SHORT_CODE_INDEX_OFFSET[i11]) & 3] + DISTANCE_SHORT_CODE_VALUE_OFFSET[i11] : i11 - 15;
    }

    private static boolean writeRingBuffer(State state) {
        int i11 = state.bytesToIgnore;
        if (i11 != 0) {
            state.bytesWritten += i11;
            state.bytesToIgnore = 0;
        }
        int iMin = Math.min(state.outputLength - state.outputUsed, state.bytesToWrite - state.bytesWritten);
        if (iMin != 0) {
            System.arraycopy(state.ringBuffer, state.bytesWritten, state.output, state.outputOffset + state.outputUsed, iMin);
            state.outputUsed += iMin;
            state.bytesWritten += iMin;
        }
        return state.outputUsed < state.outputLength;
    }
}
