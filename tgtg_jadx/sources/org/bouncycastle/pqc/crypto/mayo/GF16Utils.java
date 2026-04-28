package org.bouncycastle.pqc.crypto.mayo;

import org.bouncycastle.util.GF16;

/* JADX INFO: loaded from: classes3.dex */
class GF16Utils {
    static final long MASK_LSB = 1229782938247303441L;
    static final long MASK_MSB = -8608480567731124088L;
    static final long NIBBLE_MASK_LSB = -1229782938247303442L;
    static final long NIBBLE_MASK_MSB = 8608480567731124087L;

    public static void mVecMulAdd(int i11, long[] jArr, int i12, int i13, long[] jArr2, int i14) {
        long j9 = i13;
        long j11 = 4294967295L & j9;
        long j12 = j9 & 1;
        char c3 = 1;
        long j13 = (j11 >>> 1) & 1;
        long j14 = (j11 >>> 2) & 1;
        char c7 = 3;
        long j15 = (j11 >>> 3) & 1;
        int i15 = i14;
        int i16 = 0;
        int i17 = i12;
        while (i16 < i11) {
            long j16 = jArr[i17];
            char c8 = c7;
            long j17 = (-j12) & j16;
            long j18 = (j16 & MASK_MSB) >>> c8;
            long j19 = ((j16 & NIBBLE_MASK_MSB) << c3) ^ (j18 + (j18 << c3));
            long j21 = j12;
            long j22 = ((-j13) & j19) ^ j17;
            long j23 = (j19 & MASK_MSB) >>> c8;
            long j24 = (j23 + (j23 << c3)) ^ ((j19 & NIBBLE_MASK_MSB) << c3);
            char c11 = c3;
            long j25 = (j24 & MASK_MSB) >>> c8;
            jArr2[i15] = ((j22 ^ ((-j14) & j24)) ^ ((-j15) & ((j25 + (j25 << c11)) ^ ((j24 & NIBBLE_MASK_MSB) << c11)))) ^ jArr2[i15];
            i16++;
            c7 = c8;
            i15++;
            i17++;
            c3 = c11;
            j12 = j21;
            j13 = j13;
        }
    }

    public static void matMul(byte[] bArr, byte[] bArr2, int i11, byte[] bArr3, int i12, int i13) {
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < i13) {
            int i17 = 0;
            byte bMul = 0;
            while (i17 < i12) {
                bMul = (byte) (GF16.mul(bArr[i15], bArr2[i11 + i17]) ^ bMul);
                i17++;
                i15++;
            }
            bArr3[i16] = bMul;
            i14++;
            i16++;
        }
    }

    public static void mulAddMUpperTriangularMatXMat(int i11, long[] jArr, byte[] bArr, long[] jArr2, int i12, int i13, int i14) {
        int i15 = i14 * i11;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i16 < i13) {
            int i21 = i17;
            int i22 = i19;
            int i23 = i16;
            while (i23 < i13) {
                int i24 = 0;
                int i25 = 0;
                while (i24 < i14) {
                    mVecMulAdd(i11, jArr, i22, bArr[i21 + i24], jArr2, i12 + i18 + i25);
                    i24++;
                    i25 += i11;
                }
                i22 += i11;
                i23++;
                i21 += i14;
            }
            i16++;
            i17 += i14;
            i18 += i15;
            i19 = i22;
        }
    }

    public static void mulAddMUpperTriangularMatXMatTrans(int i11, long[] jArr, byte[] bArr, long[] jArr2, int i12, int i13) {
        int i14 = i11 * i13;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < i12) {
            int i18 = i17;
            for (int i19 = i15; i19 < i12; i19++) {
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                while (i21 < i13) {
                    mVecMulAdd(i11, jArr, i18, bArr[i22 + i19], jArr2, i16 + i23);
                    i21++;
                    i22 += i12;
                    i23 += i11;
                }
                i18 += i11;
            }
            i15++;
            i16 += i14;
            i17 = i18;
        }
    }

    public static void mulAddMatTransXMMat(int i11, byte[] bArr, long[] jArr, int i12, long[] jArr2, int i13, int i14) {
        int i15 = i14 * i11;
        int i16 = 0;
        int i17 = 0;
        while (i16 < i14) {
            int i18 = 0;
            int i19 = 0;
            int i21 = 0;
            while (i18 < i13) {
                byte b8 = bArr[i19 + i16];
                int i22 = 0;
                int i23 = 0;
                while (i22 < i14) {
                    mVecMulAdd(i11, jArr, i12 + i21 + i23, b8, jArr2, i17 + i23);
                    i22++;
                    i23 += i11;
                }
                i18++;
                i19 += i14;
                i21 += i15;
            }
            i16++;
            i17 += i15;
        }
    }

    public static void mulAddMatXMMat(int i11, byte[] bArr, long[] jArr, int i12, long[] jArr2, int i13, int i14, int i15) {
        int i16 = i11 * i15;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < i13) {
            int i21 = 0;
            int i22 = 0;
            while (i21 < i14) {
                byte b8 = bArr[i19 + i21];
                int i23 = 0;
                int i24 = 0;
                while (i23 < i15) {
                    mVecMulAdd(i11, jArr, i22 + i24 + i12, b8, jArr2, i18 + i24);
                    i23++;
                    i24 += i11;
                }
                i21++;
                i22 += i16;
            }
            i17++;
            i18 += i16;
            i19 += i14;
        }
    }

    public static long mulFx8(byte b8, long j9) {
        int i11 = b8 & 255;
        long j11 = ((j9 << 3) & ((long) (-((i11 >> 3) & 1)))) ^ (((((long) (-(b8 & 1))) & j9) ^ (((long) (-((i11 >> 1) & 1))) & (j9 << 1))) ^ (((long) (-((i11 >> 2) & 1))) & (j9 << 2)));
        long j12 = (-1085102592571150096L) & j11;
        return ((j11 ^ (j12 >>> 4)) ^ (j12 >>> 3)) & 1085102592571150095L;
    }

    public static void mulAddMatXMMat(int i11, byte[] bArr, long[] jArr, long[] jArr2, int i12, int i13) {
        int i14 = i11 * i12;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < i12) {
            int i18 = 0;
            int i19 = 0;
            while (i18 < i13) {
                byte b8 = bArr[i16 + i18];
                int i21 = 0;
                int i22 = 0;
                while (i21 < i12) {
                    mVecMulAdd(i11, jArr, i19 + i22, b8, jArr2, i17 + i22);
                    i21++;
                    i22 += i11;
                }
                i18++;
                i19 += i14;
            }
            i15++;
            i16 += i13;
            i17 += i14;
        }
    }
}
