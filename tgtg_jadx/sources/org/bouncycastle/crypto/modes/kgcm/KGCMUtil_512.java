package org.bouncycastle.crypto.modes.kgcm;

import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes3.dex */
public class KGCMUtil_512 {
    public static final int SIZE = 8;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
        jArr2[7] = jArr[7];
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[7] ^ jArr[7]) | (((((((jArr[0] ^ jArr2[0]) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2])) | (jArr[3] ^ jArr2[3])) | (jArr[4] ^ jArr2[4])) | (jArr[5] ^ jArr2[5])) | (jArr[6] ^ jArr2[6]))) == 0;
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        int i11 = 0;
        long j9 = jArr2[0];
        char c3 = 1;
        long j11 = jArr2[1];
        char c7 = 2;
        long j12 = jArr2[2];
        char c8 = 3;
        long j13 = jArr2[3];
        long j14 = jArr2[4];
        long j15 = jArr2[5];
        long j16 = jArr2[6];
        long j17 = jArr2[7];
        long j18 = 0;
        long j19 = 0;
        long j21 = 0;
        long j22 = 0;
        long j23 = 0;
        long j24 = 0;
        long j25 = 0;
        long j26 = 0;
        long j27 = 0;
        while (true) {
            char c11 = c3;
            if (i11 >= 8) {
                char c12 = c7;
                jArr3[0] = j18 ^ (((j19 ^ (j19 << c12)) ^ (j19 << 5)) ^ (j19 << 8));
                jArr3[c11] = j21 ^ (((j19 >>> 62) ^ (j19 >>> 59)) ^ (j19 >>> 56));
                jArr3[c12] = j22;
                jArr3[c8] = j23;
                jArr3[4] = j24;
                jArr3[5] = j25;
                jArr3[6] = j26;
                jArr3[7] = j27;
                return;
            }
            long j28 = jArr[i11];
            long j29 = jArr[i11 + 1];
            long j31 = j12;
            long j32 = j11;
            long j33 = j16;
            j16 = j15;
            j15 = j14;
            j14 = j13;
            long j34 = j31;
            char c13 = c7;
            int i12 = 0;
            while (i12 < 64) {
                char c14 = c8;
                long j35 = j34;
                long j36 = -(j28 & 1);
                j28 >>>= c11;
                j18 ^= j9 & j36;
                long j37 = j32;
                long j38 = -(j29 & 1);
                j29 >>>= c11;
                j21 = (j21 ^ (j32 & j36)) ^ (j9 & j38);
                j22 = (j22 ^ (j35 & j36)) ^ (j37 & j38);
                j23 = (j23 ^ (j14 & j36)) ^ (j35 & j38);
                j24 = (j24 ^ (j15 & j36)) ^ (j14 & j38);
                j25 = (j25 ^ (j16 & j36)) ^ (j15 & j38);
                j26 = (j26 ^ (j33 & j36)) ^ (j16 & j38);
                j27 = (j27 ^ (j17 & j36)) ^ (j33 & j38);
                j19 ^= j17 & j38;
                long j39 = j17 >> 63;
                j17 = (j17 << c11) | (j33 >>> 63);
                j33 = (j33 << c11) | (j16 >>> 63);
                j16 = (j16 << c11) | (j15 >>> 63);
                j15 = (j15 << c11) | (j14 >>> 63);
                j14 = (j14 << c11) | (j35 >>> 63);
                long j41 = (j37 << c11) | (j9 >>> 63);
                j9 = (j9 << c11) ^ (j39 & 293);
                i12++;
                c8 = c14;
                j34 = (j35 << c11) | (j37 >>> 63);
                j32 = j41;
            }
            long j42 = ((j9 ^ (j17 >>> 62)) ^ (j17 >>> 59)) ^ (j17 >>> 56);
            long j43 = ((j17 ^ (j17 << c13)) ^ (j17 << 5)) ^ (j17 << 8);
            i11 += 2;
            j17 = j33;
            c8 = c8;
            c3 = c11;
            j13 = j34;
            j11 = j42;
            j9 = j43;
            c7 = c13;
            j12 = j32;
        }
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j9 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        jArr2[0] = (j9 << 1) ^ ((j17 >> 63) & 293);
        jArr2[1] = (j11 << 1) | (j9 >>> 63);
        jArr2[2] = (j12 << 1) | (j11 >>> 63);
        jArr2[3] = (j13 << 1) | (j12 >>> 63);
        jArr2[4] = (j14 << 1) | (j13 >>> 63);
        jArr2[5] = (j15 << 1) | (j14 >>> 63);
        jArr2[6] = (j16 << 1) | (j15 >>> 63);
        jArr2[7] = (j17 << 1) | (j16 >>> 63);
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j9 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = j17 >>> 56;
        jArr2[0] = ((((j9 << 8) ^ j18) ^ (j18 << 2)) ^ (j18 << 5)) ^ (j18 << 8);
        jArr2[1] = (j11 << 8) | (j9 >>> 56);
        jArr2[2] = (j12 << 8) | (j11 >>> 56);
        jArr2[3] = (j13 << 8) | (j12 >>> 56);
        jArr2[4] = (j14 << 8) | (j13 >>> 56);
        jArr2[5] = (j15 << 8) | (j14 >>> 56);
        jArr2[6] = (j16 << 8) | (j15 >>> 56);
        jArr2[7] = (j17 << 8) | (j16 >>> 56);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        int i11 = 16;
        long[] jArr3 = new long[16];
        for (int i12 = 0; i12 < 8; i12++) {
            Interleave.expand64To128(jArr[i12], jArr3, i12 << 1);
        }
        while (true) {
            int i13 = i11 - 1;
            if (i13 < 8) {
                copy(jArr3, jArr2);
                return;
            }
            long j9 = jArr3[i13];
            int i14 = i11 - 9;
            jArr3[i14] = jArr3[i14] ^ ((((j9 << 2) ^ j9) ^ (j9 << 5)) ^ (j9 << 8));
            int i15 = i11 - 8;
            jArr3[i15] = ((j9 >>> 56) ^ ((j9 >>> 62) ^ (j9 >>> 59))) ^ jArr3[i15];
            i11 = i13;
        }
    }

    public static void x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }
}
