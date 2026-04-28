package org.bouncycastle.pqc.crypto.hqc;

/* JADX INFO: loaded from: classes3.dex */
class GF2PolynomialCalculator {
    private final int PARAM_N;
    private final long RED_MASK;
    private final int VEC_N_SIZE_64;

    public GF2PolynomialCalculator(int i11, int i12, long j9) {
        this.VEC_N_SIZE_64 = i11;
        this.PARAM_N = i12;
        this.RED_MASK = j9;
    }

    public static void addLongs(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < jArr2.length; i11++) {
            jArr[i11] = jArr2[i11] ^ jArr3[i11];
        }
    }

    private void base_mul(long[] jArr, int i11, long j9, long j11) {
        int i12;
        long[] jArr2;
        int i13 = 16;
        int i14 = 0;
        long j12 = j11 & 1152921504606846975L;
        boolean z11 = true;
        long j13 = j12 << 1;
        long j14 = j13 ^ j12;
        long j15 = j12 << 2;
        long j16 = j15 ^ j12;
        long j17 = j14 << 1;
        long j18 = j17 ^ j12;
        long j19 = j12 << 3;
        long j21 = j16 << 1;
        long j22 = j14 << 2;
        long j23 = j18 << 1;
        long[] jArr3 = {0, j12, j13, j14, j15, j16, j17, j18, j19, j19 ^ j12, j21, j21 ^ j12, j22, j22 ^ j12, j23, j12 ^ j23};
        long j24 = 15;
        long j25 = j9 & 15;
        int i15 = 0;
        long j26 = 0;
        while (true) {
            i12 = i14;
            if (i15 >= 16) {
                break;
            }
            long j27 = j25 - ((long) i15);
            j26 ^= jArr3[i15] & (-(1 - ((j27 | (-j27)) >>> 63)));
            i15++;
            i14 = i12;
            j24 = j24;
        }
        long j28 = j24;
        byte b8 = 4;
        long j29 = 0;
        while (b8 < 64) {
            long j31 = (j9 >> b8) & j28;
            int i16 = i12;
            long j32 = 0;
            while (true) {
                jArr2 = jArr3;
                if (i16 < i13) {
                    long j33 = j31 - ((long) i16);
                    j32 ^= jArr2[i16] & (-(1 - ((j33 | (-j33)) >>> 63)));
                    i16++;
                    jArr3 = jArr2;
                    z11 = z11;
                    i13 = 16;
                }
            }
            j26 ^= j32 << b8;
            j29 ^= j32 >>> (64 - b8);
            b8 = (byte) (b8 + 4);
            jArr3 = jArr2;
            i13 = 16;
        }
        boolean z12 = z11;
        long[] jArr4 = new long[4];
        jArr4[i12] = -((j11 >> 60) & 1);
        jArr4[z12 ? 1 : 0] = -((j11 >> 61) & 1);
        jArr4[2] = -((j11 >> 62) & 1);
        jArr4[3] = -((j11 >> 63) & 1);
        long j34 = jArr4[i12];
        long j35 = jArr4[z12 ? 1 : 0];
        long j36 = jArr4[2];
        long j37 = jArr4[3];
        long j38 = (((j29 ^ (j34 & (j9 >>> 4))) ^ ((j9 >>> 3) & j35)) ^ ((j9 >>> 2) & j36)) ^ ((j9 >>> (z12 ? 1L : 0L)) & j37);
        jArr[i11] = (((((j9 << 60) & j34) ^ j26) ^ ((j9 << 61) & j35)) ^ ((j9 << 62) & j36)) ^ ((j9 << 63) & j37);
        jArr[i11 + 1] = j38;
    }

    private void karatsuba(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13, int i14, long[] jArr4, int i15) {
        if (i14 == 1) {
            base_mul(jArr, i11, jArr2[i12], jArr3[i13]);
            return;
        }
        int i16 = i14 / 2;
        int i17 = (i14 + 1) / 2;
        int i18 = i15 + i17;
        int i19 = i18 + i17;
        int i21 = (i17 * 2) + i11;
        int i22 = (i17 * 4) + i15;
        karatsuba(jArr, i11, jArr2, i12, jArr3, i13, i17, jArr4, i22);
        karatsuba(jArr, i21, jArr2, i12 + i17, jArr3, i13 + i17, i16, jArr4, i22);
        karatsuba_add1(jArr4, i15, jArr4, i18, jArr2, i12, jArr3, i13, i17, i16);
        karatsuba(jArr4, i19, jArr4, i15, jArr4, i18, i17, jArr4, i22);
        karatsuba_add2(jArr, i11, jArr4, i19, jArr, i21, i17, i16);
    }

    private void karatsuba_add1(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13, long[] jArr4, int i14, int i15, int i16) {
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i17 + i15;
            jArr[i17 + i11] = jArr3[i17 + i13] ^ jArr3[i18 + i13];
            jArr2[i17 + i12] = jArr4[i17 + i14] ^ jArr4[i18 + i14];
        }
        if (i16 < i15) {
            jArr[i11 + i16] = jArr3[i13 + i16];
            jArr2[i16 + i12] = jArr4[i16 + i14];
        }
    }

    private void karatsuba_add2(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13, int i14, int i15) {
        int i16;
        int i17 = 0;
        while (true) {
            i16 = i14 * 2;
            if (i17 >= i16) {
                break;
            }
            int i18 = i17 + i12;
            jArr2[i18] = jArr2[i18] ^ jArr[i17 + i11];
            i17++;
        }
        for (int i19 = 0; i19 < i15 * 2; i19++) {
            int i21 = i19 + i12;
            jArr2[i21] = jArr2[i21] ^ jArr3[i19 + i13];
        }
        for (int i22 = 0; i22 < i16; i22++) {
            int i23 = i22 + i14 + i11;
            jArr[i23] = jArr[i23] ^ jArr2[i22 + i12];
        }
    }

    private void reduce(long[] jArr, long[] jArr2) {
        int i11 = 0;
        while (true) {
            int i12 = this.VEC_N_SIZE_64;
            if (i11 >= i12) {
                int i13 = i12 - 1;
                jArr[i13] = jArr[i13] & this.RED_MASK;
                return;
            }
            long j9 = jArr2[(i11 + i12) - 1];
            int i14 = this.PARAM_N;
            jArr[i11] = (jArr2[i11] ^ (j9 >>> (i14 & 63))) ^ (jArr2[i12 + i11] << ((int) (64 - (((long) i14) & 63))));
            i11++;
        }
    }

    public void multLongs(long[] jArr, long[] jArr2, long[] jArr3) {
        int i11 = this.VEC_N_SIZE_64;
        long[] jArr4 = new long[(i11 << 1) + 1];
        karatsuba(jArr4, 0, jArr2, 0, jArr3, 0, i11, new long[i11 << 3], 0);
        reduce(jArr, jArr4);
    }
}
