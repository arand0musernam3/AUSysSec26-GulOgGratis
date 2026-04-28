package org.bouncycastle.pqc.crypto.snova;

import org.bouncycastle.util.GF16;

/* JADX INFO: loaded from: classes3.dex */
class GF16Utils {
    private static final int GF16_MASK = 585;

    public static int ctGF16IsNotZero(byte b8) {
        int i11 = b8 & 255;
        return ((i11 >>> 3) | (i11 >>> 1) | i11 | (i11 >>> 2)) & 1;
    }

    public static void decodeMergeInHalf(byte[] bArr, byte[] bArr2, int i11) {
        int i12 = (i11 + 1) >>> 1;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr2[i13] = (byte) (bArr[i13] & 15);
            bArr2[i13 + i12] = (byte) ((bArr[i13] >>> 4) & 15);
        }
    }

    public static void encodeMergeInHalf(byte[] bArr, int i11, byte[] bArr2) {
        int i12 = (i11 + 1) >>> 1;
        int i13 = 0;
        while (i13 < i11 / 2) {
            bArr2[i13] = (byte) (bArr[i13] | (bArr[i12] << 4));
            i13++;
            i12++;
        }
        if ((i11 & 1) == 1) {
            bArr2[i13] = bArr[i13];
        }
    }

    public static int gf16FromNibble(int i11) {
        int i12 = i11 | (i11 << 4);
        return ((i12 << 2) & 520) | (i12 & 65);
    }

    private static int gf16Reduce(int i11) {
        int i12 = 1227133513 & i11;
        int i13 = i11 >>> 12;
        int i14 = (i13 ^ (i13 << 3)) ^ i12;
        int i15 = i14 >>> 12;
        int i16 = i14 ^ (i15 ^ (i15 << 3));
        int i17 = i16 >>> 12;
        return (i16 ^ (i17 ^ (i17 << 3))) & GF16_MASK;
    }

    public static byte gf16ToNibble(int i11) {
        int iGf16Reduce = gf16Reduce(i11);
        int i12 = iGf16Reduce | (iGf16Reduce >>> 4);
        return (byte) (((i12 >>> 2) & 10) | (i12 & 5));
    }

    public static void gf16mMul(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11) {
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i11) {
            int i15 = 0;
            while (i15 < i11) {
                bArr3[i14] = GF16.innerProduct(bArr, i13, bArr2, i15, i11);
                i15++;
                i14++;
            }
            i12++;
            i13 += i11;
        }
    }

    public static void gf16mMulMul(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i11) {
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i11) {
            for (int i15 = 0; i15 < i11; i15++) {
                bArr4[i15] = GF16.innerProduct(bArr, i13, bArr2, i15, i11);
            }
            int i16 = 0;
            while (i16 < i11) {
                bArr5[i14] = GF16.innerProduct(bArr4, 0, bArr3, i16, i11);
                i16++;
                i14++;
            }
            i12++;
            i13 += i11;
        }
    }

    public static void gf16mMulMulTo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i11) {
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i11) {
            for (int i15 = 0; i15 < i11; i15++) {
                bArr4[i15] = GF16.innerProduct(bArr, i13, bArr2, i15, i11);
            }
            int i16 = 0;
            while (i16 < i11) {
                bArr5[i14] = (byte) (bArr5[i14] ^ GF16.innerProduct(bArr4, 0, bArr3, i16, i11));
                i16++;
                i14++;
            }
            i12++;
            i13 += i11;
        }
    }

    public static void gf16mMulTo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = 0;
            while (i15 < i12) {
                bArr5[i11] = (byte) (bArr5[i11] ^ (GF16.innerProduct(bArr, i14, bArr2, i15, i12) ^ GF16.innerProduct(bArr3, i14, bArr4, i15, i12)));
                i15++;
                i11++;
            }
            i13++;
            i14 += i12;
        }
    }

    public static void gf16mMulToTo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i11) {
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i11) {
            int i15 = 0;
            while (i15 < i11) {
                bArr4[i14] = (byte) (bArr4[i14] ^ GF16.innerProduct(bArr, i13, bArr2, i15, i11));
                bArr5[i14] = (byte) (bArr5[i14] ^ GF16.innerProduct(bArr2, i13, bArr3, i15, i11));
                i15++;
                i14++;
            }
            i12++;
            i13 += i11;
        }
    }

    public static void gf16mTranMulMul(byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < i12) {
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = i11 + i16;
                int i18 = 0;
                byte bMul = 0;
                int i19 = i13;
                while (i18 < i12) {
                    bMul = (byte) (bMul ^ GF16.mul(bArr[i17], bArr4[i19]));
                    i18++;
                    i17 += i12;
                    i19 += i12;
                }
                bArr6[i16] = bMul;
            }
            int i21 = 0;
            int i22 = 0;
            while (i21 < i12) {
                byte bMul2 = 0;
                for (int i23 = 0; i23 < i12; i23++) {
                    bMul2 = (byte) (bMul2 ^ GF16.mul(bArr2[i22 + i23], bArr6[i23]));
                }
                bArr7[i13 + i22] = bMul2;
                i21++;
                i22 += i12;
            }
            for (int i24 = 0; i24 < i12; i24++) {
                bArr6[i24] = GF16.innerProduct(bArr5, i14, bArr, i11 + i24, i12);
            }
            int i25 = 0;
            while (i25 < i12) {
                bArr8[i15] = GF16.innerProduct(bArr6, 0, bArr3, i25, i12);
                i25++;
                i15++;
            }
            i13++;
            i14 += i12;
        }
    }

    public static void gf16mMulTo(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11) {
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i11) {
            int i15 = 0;
            while (i15 < i11) {
                bArr3[i14] = (byte) (bArr3[i14] ^ GF16.innerProduct(bArr, i13, bArr2, i15, i11));
                i15++;
                i14++;
            }
            i12++;
            i13 += i11;
        }
    }

    public static void gf16mMulTo(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = 0;
            while (i15 < i12) {
                bArr3[i11] = (byte) (bArr3[i11] ^ GF16.innerProduct(bArr, i14, bArr2, i15, i12));
                i15++;
                i11++;
            }
            i13++;
            i14 += i12;
        }
    }

    public static void gf16mMulTo(byte[] bArr, byte[] bArr2, int i11, byte[] bArr3, int i12, int i13) {
        int i14 = 0;
        int i15 = 0;
        while (i14 < i13) {
            int i16 = 0;
            while (i16 < i13) {
                bArr3[i12] = (byte) (bArr3[i12] ^ GF16.innerProduct(bArr, i15, bArr2, i11 + i16, i13));
                i16++;
                i12++;
            }
            i14++;
            i15 += i13;
        }
    }
}
