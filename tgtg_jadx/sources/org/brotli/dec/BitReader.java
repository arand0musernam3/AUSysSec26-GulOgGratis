package org.brotli.dec;

import com.braze.h2;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
final class BitReader {
    private static final int BYTE_BUFFER_SIZE = 4160;
    private static final int BYTE_READ_SIZE = 4096;
    private static final int CAPACITY = 1024;
    private static final int INT_BUFFER_SIZE = 1040;
    private static final int SLACK = 16;
    long accumulator;
    int bitOffset;
    private boolean endOfStreamReached;
    private InputStream input;
    private int intOffset;
    private final byte[] byteBuffer = new byte[BYTE_BUFFER_SIZE];
    private final int[] intBuffer = new int[INT_BUFFER_SIZE];
    private final IntReader intReader = new IntReader();
    private int tailBytes = 0;

    public static void checkHealth(BitReader bitReader, boolean z11) {
        if (bitReader.endOfStreamReached) {
            int i11 = ((bitReader.intOffset << 2) + ((bitReader.bitOffset + 7) >> 3)) - 8;
            int i12 = bitReader.tailBytes;
            if (i11 > i12) {
                a.a("Read after end");
            } else {
                if (!z11 || i11 == i12) {
                    return;
                }
                a.a("Unused bytes after end");
            }
        }
    }

    public static void close(BitReader bitReader) throws IOException {
        InputStream inputStream = bitReader.input;
        bitReader.input = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public static void copyBytes(BitReader bitReader, byte[] bArr, int i11, int i12) {
        if ((bitReader.bitOffset & 7) != 0) {
            a.a("Unaligned copyBytes");
            return;
        }
        while (true) {
            int i13 = bitReader.bitOffset;
            if (i13 == 64 || i12 == 0) {
                break;
            }
            bArr[i11] = (byte) (bitReader.accumulator >>> i13);
            bitReader.bitOffset = i13 + 8;
            i12--;
            i11++;
        }
        if (i12 == 0) {
            return;
        }
        int iMin = Math.min(intAvailable(bitReader), i12 >> 2);
        if (iMin > 0) {
            int i14 = iMin << 2;
            System.arraycopy(bitReader.byteBuffer, bitReader.intOffset << 2, bArr, i11, i14);
            i11 += i14;
            i12 -= i14;
            bitReader.intOffset += iMin;
        }
        if (i12 == 0) {
            return;
        }
        if (intAvailable(bitReader) <= 0) {
            while (i12 > 0) {
                try {
                    int i15 = bitReader.input.read(bArr, i11, i12);
                    if (i15 == -1) {
                        throw new BrotliRuntimeException("Unexpected end of input");
                    }
                    i11 += i15;
                    i12 -= i15;
                } catch (IOException e5) {
                    throw new BrotliRuntimeException("Failed to read input", e5);
                }
            }
            return;
        }
        fillBitWindow(bitReader);
        while (i12 != 0) {
            long j9 = bitReader.accumulator;
            int i16 = bitReader.bitOffset;
            bArr[i11] = (byte) (j9 >>> i16);
            bitReader.bitOffset = i16 + 8;
            i12--;
            i11++;
        }
        checkHealth(bitReader, false);
    }

    public static void fillBitWindow(BitReader bitReader) {
        int i11 = bitReader.bitOffset;
        if (i11 >= 32) {
            int[] iArr = bitReader.intBuffer;
            int i12 = bitReader.intOffset;
            bitReader.intOffset = i12 + 1;
            bitReader.accumulator = (((long) iArr[i12]) << 32) | (bitReader.accumulator >>> 32);
            bitReader.bitOffset = i11 - 32;
        }
    }

    public static void init(BitReader bitReader, InputStream inputStream) {
        if (bitReader.input != null) {
            h2.b("Bit reader already has associated input stream");
            return;
        }
        IntReader.init(bitReader.intReader, bitReader.byteBuffer, bitReader.intBuffer);
        bitReader.input = inputStream;
        bitReader.accumulator = 0L;
        bitReader.bitOffset = 64;
        bitReader.intOffset = 1024;
        bitReader.endOfStreamReached = false;
        prepare(bitReader);
    }

    public static int intAvailable(BitReader bitReader) {
        return (bitReader.endOfStreamReached ? (bitReader.tailBytes + 3) >> 2 : 1024) - bitReader.intOffset;
    }

    public static void jumpToByteBoundary(BitReader bitReader) {
        int i11 = (64 - bitReader.bitOffset) & 7;
        if (i11 == 0 || readBits(bitReader, i11) == 0) {
            return;
        }
        a.a("Corrupted padding bits");
    }

    private static void prepare(BitReader bitReader) {
        readMoreInput(bitReader);
        checkHealth(bitReader, false);
        fillBitWindow(bitReader);
        fillBitWindow(bitReader);
    }

    public static int readBits(BitReader bitReader, int i11) {
        fillBitWindow(bitReader);
        long j9 = bitReader.accumulator;
        int i12 = bitReader.bitOffset;
        int i13 = ((int) (j9 >>> i12)) & ((1 << i11) - 1);
        bitReader.bitOffset = i12 + i11;
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r4.endOfStreamReached = true;
        r4.tailBytes = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        r1 = r1 + 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void readMoreInput(org.brotli.dec.BitReader r4) {
        /*
            int r0 = r4.intOffset
            r1 = 1015(0x3f7, float:1.422E-42)
            if (r0 > r1) goto L7
            goto L12
        L7:
            boolean r1 = r4.endOfStreamReached
            if (r1 == 0) goto L19
            int r4 = intAvailable(r4)
            r0 = -2
            if (r4 < r0) goto L13
        L12:
            return
        L13:
            java.lang.String r4 = "No more input"
            org.brotli.dec.a.a(r4)
            return
        L19:
            int r0 = r0 << 2
            int r1 = 4096 - r0
            byte[] r2 = r4.byteBuffer
            r3 = 0
            java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            r4.intOffset = r3
        L25:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 >= r0) goto L48
            java.io.InputStream r0 = r4.input     // Catch: java.io.IOException -> L3f
            byte[] r2 = r4.byteBuffer     // Catch: java.io.IOException -> L3f
            int r3 = 4096 - r1
            int r0 = r0.read(r2, r1, r3)     // Catch: java.io.IOException -> L3f
            if (r0 > 0) goto L3d
            r0 = 1
            r4.endOfStreamReached = r0     // Catch: java.io.IOException -> L3f
            r4.tailBytes = r1     // Catch: java.io.IOException -> L3f
            int r1 = r1 + 3
            goto L48
        L3d:
            int r1 = r1 + r0
            goto L25
        L3f:
            r4 = move-exception
            org.brotli.dec.BrotliRuntimeException r0 = new org.brotli.dec.BrotliRuntimeException
            java.lang.String r1 = "Failed to read input"
            r0.<init>(r1, r4)
            throw r0
        L48:
            org.brotli.dec.IntReader r4 = r4.intReader
            int r0 = r1 >> 2
            org.brotli.dec.IntReader.convert(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.brotli.dec.BitReader.readMoreInput(org.brotli.dec.BitReader):void");
    }

    public static void reload(BitReader bitReader) {
        if (bitReader.bitOffset == 64) {
            prepare(bitReader);
        }
    }
}
