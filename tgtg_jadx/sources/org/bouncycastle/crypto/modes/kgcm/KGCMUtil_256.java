package org.bouncycastle.crypto.modes.kgcm;

import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes3.dex */
public class KGCMUtil_256 {
    public static final int SIZE = 4;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[3] ^ jArr[3]) | (((jArr[0] ^ jArr2[0]) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2]))) == 0;
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        char c3;
        char c7;
        long j9;
        int i11 = 0;
        long j11 = jArr[0];
        char c8 = 1;
        long j12 = jArr[1];
        char c11 = 2;
        long j13 = jArr[2];
        char c12 = 3;
        long j14 = jArr[3];
        long j15 = jArr2[0];
        long j16 = jArr2[1];
        long j17 = jArr2[2];
        long j18 = jArr2[3];
        long j19 = 0;
        long j21 = 0;
        long j22 = 0;
        long j23 = 0;
        long j24 = 0;
        while (true) {
            c3 = c8;
            c7 = c11;
            j9 = j13;
            if (i11 >= 64) {
                break;
            }
            long j25 = -(j11 & 1);
            j11 >>>= c3;
            j19 ^= j15 & j25;
            char c13 = c12;
            long j26 = -(j12 & 1);
            j12 >>>= c3;
            j21 = (j21 ^ (j16 & j25)) ^ (j15 & j26);
            j22 = (j22 ^ (j17 & j25)) ^ (j16 & j26);
            j23 = (j23 ^ (j18 & j25)) ^ (j17 & j26);
            j24 ^= j18 & j26;
            long j27 = j18 >> 63;
            j18 = (j18 << c3) | (j17 >>> 63);
            j17 = (j17 << c3) | (j16 >>> 63);
            j16 = (j15 >>> 63) | (j16 << c3);
            j15 = (j15 << c3) ^ (j27 & 1061);
            i11++;
            c12 = c13;
            c8 = c3;
            c11 = c7;
            j13 = j9;
            j14 = j14;
        }
        char c14 = c12;
        long j28 = j14;
        char c15 = '>';
        long j29 = (((j18 >>> 62) ^ j15) ^ (j18 >>> 59)) ^ (j18 >>> 54);
        long j31 = ((j18 ^ (j18 << c7)) ^ (j18 << 5)) ^ (j18 << 10);
        int i12 = 0;
        while (i12 < 64) {
            long j32 = -(j9 & 1);
            j9 >>>= c3;
            j19 ^= j31 & j32;
            char c16 = c15;
            long j33 = j29;
            long j34 = -(j28 & 1);
            j28 >>>= c3;
            long j35 = (j21 ^ (j29 & j32)) ^ (j31 & j34);
            j22 = (j22 ^ (j16 & j32)) ^ (j33 & j34);
            j23 = (j23 ^ (j17 & j32)) ^ (j16 & j34);
            j24 ^= j17 & j34;
            long j36 = j17 >> 63;
            j17 = (j17 << c3) | (j16 >>> 63);
            j16 = (j33 >>> 63) | (j16 << c3);
            long j37 = (j33 << c3) | (j31 >>> 63);
            j31 = (j31 << c3) ^ (j36 & 1061);
            i12++;
            c15 = c16;
            j29 = j37;
            j21 = j35;
        }
        jArr3[0] = j19 ^ (((j24 ^ (j24 << c7)) ^ (j24 << 5)) ^ (j24 << 10));
        jArr3[c3] = j21 ^ (((j24 >>> c15) ^ (j24 >>> 59)) ^ (j24 >>> 54));
        jArr3[c7] = j22;
        jArr3[c14] = j23;
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j9 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        jArr2[0] = ((j13 >> 63) & 1061) ^ (j9 << 1);
        jArr2[1] = (j9 >>> 63) | (j11 << 1);
        jArr2[2] = (j12 << 1) | (j11 >>> 63);
        jArr2[3] = (j13 << 1) | (j12 >>> 63);
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j9 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = j13 >>> 56;
        jArr2[0] = ((((j9 << 8) ^ j14) ^ (j14 << 2)) ^ (j14 << 5)) ^ (j14 << 10);
        jArr2[1] = (j9 >>> 56) | (j11 << 8);
        jArr2[2] = (j12 << 8) | (j11 >>> 56);
        jArr2[3] = (j13 << 8) | (j12 >>> 56);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        int i11 = 8;
        long[] jArr3 = new long[8];
        for (int i12 = 0; i12 < 4; i12++) {
            Interleave.expand64To128(jArr[i12], jArr3, i12 << 1);
        }
        while (true) {
            int i13 = i11 - 1;
            if (i13 < 4) {
                copy(jArr3, jArr2);
                return;
            }
            long j9 = jArr3[i13];
            int i14 = i11 - 5;
            jArr3[i14] = jArr3[i14] ^ ((((j9 << 2) ^ j9) ^ (j9 << 5)) ^ (j9 << 10));
            int i15 = i11 - 4;
            jArr3[i15] = ((j9 >>> 54) ^ ((j9 >>> 62) ^ (j9 >>> 59))) ^ jArr3[i15];
            i11 = i13;
        }
    }

    public static void x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }
}
