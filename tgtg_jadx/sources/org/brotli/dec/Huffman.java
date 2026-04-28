package org.brotli.dec;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
final class Huffman {
    static final int HUFFMAN_MAX_TABLE_SIZE = 1080;
    private static final int MAX_LENGTH = 15;

    public static void buildHuffmanTable(int[] iArr, int i11, int i12, int[] iArr2, int i13) {
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int nextKey = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = iArr2[i14];
            iArr4[i15] = iArr4[i15] + 1;
        }
        iArr5[1] = 0;
        int i16 = 1;
        while (i16 < 15) {
            int i17 = i16 + 1;
            iArr5[i17] = iArr5[i16] + iArr4[i16];
            i16 = i17;
        }
        for (int i18 = 0; i18 < i13; i18++) {
            int i19 = iArr2[i18];
            if (i19 != 0) {
                int i21 = iArr5[i19];
                iArr5[i19] = i21 + 1;
                iArr3[i21] = i18;
            }
        }
        int i22 = 1 << i12;
        if (iArr5[15] == 1) {
            for (int i23 = 0; i23 < i22; i23++) {
                iArr[i11 + i23] = iArr3[0];
            }
            return;
        }
        int i24 = 2;
        int i25 = 2;
        int i26 = 0;
        int i27 = 1;
        while (i27 <= i12) {
            while (iArr4[i27] > 0) {
                replicateValue(iArr, i11 + nextKey, i25, i22, iArr3[i26] | (i27 << 16));
                nextKey = getNextKey(nextKey, i27);
                iArr4[i27] = iArr4[i27] - 1;
                i26++;
            }
            i27++;
            i25 <<= 1;
        }
        int i28 = i22 - 1;
        int i29 = i12 + 1;
        int i31 = -1;
        int i32 = i11;
        while (i29 <= 15) {
            while (iArr4[i29] > 0) {
                int i33 = nextKey & i28;
                if (i33 != i31) {
                    i32 += i22;
                    int iNextTableBitSize = nextTableBitSize(iArr4, i29, i12);
                    iArr[i11 + i33] = ((iNextTableBitSize + i12) << 16) | ((i32 - i11) - i33);
                    i22 = 1 << iNextTableBitSize;
                    i31 = i33;
                }
                replicateValue(iArr, (nextKey >> i12) + i32, i24, i22, ((i29 - i12) << 16) | iArr3[i26]);
                nextKey = getNextKey(nextKey, i29);
                iArr4[i29] = iArr4[i29] - 1;
                i26++;
            }
            i29++;
            i24 <<= 1;
        }
    }

    private static int getNextKey(int i11, int i12) {
        int i13 = 1 << (i12 - 1);
        while ((i11 & i13) != 0) {
            i13 >>= 1;
        }
        return (i11 & (i13 - 1)) + i13;
    }

    private static int nextTableBitSize(int[] iArr, int i11, int i12) {
        int i13;
        int i14 = 1 << (i11 - i12);
        while (i11 < 15 && (i13 = i14 - iArr[i11]) > 0) {
            i11++;
            i14 = i13 << 1;
        }
        return i11 - i12;
    }

    private static void replicateValue(int[] iArr, int i11, int i12, int i13, int i14) {
        do {
            i13 -= i12;
            iArr[i11 + i13] = i14;
        } while (i13 > 0);
    }
}
