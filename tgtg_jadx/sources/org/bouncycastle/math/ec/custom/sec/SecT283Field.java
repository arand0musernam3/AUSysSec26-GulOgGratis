package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat320;
import qc.y;

/* JADX INFO: loaded from: classes3.dex */
public class SecT283Field {
    private static final long M27 = 134217727;
    private static final long M57 = 144115188075855871L;
    private static final long[] ROOT_Z = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(283, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(9);
        Nat320.copy64(jArr, jArr2);
        for (int i11 = 1; i11 < 283; i11 += 2) {
            implSquare(jArr2, jArrCreate64);
            reduce(jArrCreate64, jArr2);
            implSquare(jArr2, jArrCreate64);
            reduce(jArrCreate64, jArr2);
            addTo(jArr, jArr2);
        }
    }

    public static void implCompactExt(long[] jArr) {
        long j9 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = jArr[8];
        long j19 = jArr[9];
        jArr[0] = j9 ^ (j11 << 57);
        jArr[1] = (j11 >>> 7) ^ (j12 << 50);
        jArr[2] = (j12 >>> 14) ^ (j13 << 43);
        jArr[3] = (j13 >>> 21) ^ (j14 << 36);
        jArr[4] = (j14 >>> 28) ^ (j15 << 29);
        jArr[5] = (j15 >>> 35) ^ (j16 << 22);
        jArr[6] = (j16 >>> 42) ^ (j17 << 15);
        jArr[7] = (j17 >>> 49) ^ (j18 << 8);
        jArr[8] = (j18 >>> 56) ^ (j19 << 1);
        jArr[9] = j19 >>> 63;
    }

    public static void implExpand(long[] jArr, long[] jArr2) {
        long j9 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        jArr2[0] = j9 & M57;
        jArr2[1] = ((j9 >>> 57) ^ (j11 << 7)) & M57;
        jArr2[2] = ((j11 >>> 50) ^ (j12 << 14)) & M57;
        jArr2[3] = ((j12 >>> 43) ^ (j13 << 21)) & M57;
        jArr2[4] = (j13 >>> 36) ^ (j14 << 28);
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[26];
        implMulw(jArr3, jArr4[0], jArr5[0], jArr6, 0);
        implMulw(jArr3, jArr4[1], jArr5[1], jArr6, 2);
        implMulw(jArr3, jArr4[2], jArr5[2], jArr6, 4);
        implMulw(jArr3, jArr4[3], jArr5[3], jArr6, 6);
        implMulw(jArr3, jArr4[4], jArr5[4], jArr6, 8);
        long j9 = jArr4[0];
        long j11 = j9 ^ jArr4[1];
        long j12 = jArr5[0];
        long j13 = j12 ^ jArr5[1];
        long j14 = jArr4[2];
        long j15 = j9 ^ j14;
        long j16 = jArr5[2];
        long j17 = j12 ^ j16;
        long j18 = jArr4[4];
        long j19 = j14 ^ j18;
        long j21 = jArr5[4];
        long j22 = j16 ^ j21;
        long j23 = jArr4[3];
        long j24 = j23 ^ j18;
        long j25 = jArr5[3];
        long j26 = j25 ^ j21;
        implMulw(jArr3, j15 ^ j23, j17 ^ j25, jArr6, 18);
        implMulw(jArr3, j19 ^ jArr4[1], j22 ^ jArr5[1], jArr6, 20);
        long j27 = j11 ^ j24;
        long j28 = j13 ^ j26;
        long j29 = j27 ^ jArr4[2];
        long j31 = jArr5[2] ^ j28;
        implMulw(jArr3, j27, j28, jArr6, 22);
        implMulw(jArr3, j29, j31, jArr6, 24);
        implMulw(jArr3, j11, j13, jArr6, 10);
        implMulw(jArr3, j15, j17, jArr6, 12);
        implMulw(jArr3, j19, j22, jArr6, 14);
        implMulw(jArr3, j24, j26, jArr6, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j32 = jArr6[0];
        long j33 = jArr6[1] ^ j32;
        long j34 = jArr6[2] ^ j33;
        long j35 = jArr6[10] ^ j34;
        jArr3[1] = j35;
        long j36 = jArr6[3] ^ jArr6[4];
        long j37 = j34 ^ (j36 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j37;
        long j38 = j33 ^ j36;
        long j39 = jArr6[5] ^ jArr6[6];
        long j41 = jArr6[8];
        long j42 = (j38 ^ j39) ^ j41;
        long j43 = jArr6[13] ^ jArr6[14];
        long j44 = jArr6[18];
        long j45 = jArr6[22];
        long j46 = jArr6[24];
        jArr3[3] = (j42 ^ j43) ^ ((j44 ^ j45) ^ j46);
        long j47 = jArr6[7] ^ j41;
        long j48 = jArr6[9];
        long j49 = j47 ^ j48;
        long j51 = j49 ^ jArr6[17];
        jArr3[8] = j51;
        long j52 = (j49 ^ j39) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j52;
        long j53 = j52 ^ j35;
        long j54 = jArr6[19] ^ jArr6[20];
        long j55 = jArr6[25];
        long j56 = j55 ^ j46;
        long j57 = jArr6[23];
        long j58 = j54 ^ j56;
        jArr3[4] = (j58 ^ (j44 ^ j57)) ^ j53;
        long j59 = jArr6[21];
        jArr3[5] = ((j37 ^ j51) ^ j58) ^ (j59 ^ j45);
        jArr3[6] = (((((j42 ^ j32) ^ j48) ^ j43) ^ j59) ^ j57) ^ j55;
        implCompactExt(jArr3);
    }

    public static void implMulw(long[] jArr, long j9, long j11, long[] jArr2, int i11) {
        jArr[1] = j11;
        long j12 = j11 << 1;
        jArr[2] = j12;
        long j13 = j12 ^ j11;
        jArr[3] = j13;
        long j14 = j11 << 2;
        jArr[4] = j14;
        jArr[5] = j14 ^ j11;
        long j15 = j13 << 1;
        jArr[6] = j15;
        jArr[7] = j15 ^ j11;
        long j16 = jArr[((int) j9) & 7];
        long j17 = 0;
        int i12 = 48;
        do {
            int i13 = (int) (j9 >>> i12);
            long j18 = (jArr[i13 & 7] ^ (jArr[(i13 >>> 3) & 7] << 3)) ^ (jArr[(i13 >>> 6) & 7] << 6);
            j16 ^= j18 << i12;
            j17 ^= j18 >>> (-i12);
            i12 -= 9;
        } while (i12 > 0);
        jArr2[i11] = M57 & j16;
        jArr2[i11 + 1] = (((((j9 & 72198606942111744L) & ((j11 << 7) >> 63)) >>> 8) ^ j17) << 7) ^ (j16 >>> 57);
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 4, jArr2, 0);
        jArr2[8] = Interleave.expand32to64((int) jArr[4]);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat320.isZero64(jArr)) {
            y.e();
            return;
        }
        long[] jArrCreate64 = Nat320.create64();
        long[] jArrCreate642 = Nat320.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 2, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        squareN(jArrCreate642, 4, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 8, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArrCreate642);
        multiply(jArrCreate642, jArr, jArrCreate642);
        squareN(jArrCreate642, 17, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 35, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        squareN(jArrCreate642, 70, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 141, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat320.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat320.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j9 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = jArr[8];
        long j19 = j14 ^ ((((j18 >>> 27) ^ (j18 >>> 22)) ^ (j18 >>> 20)) ^ (j18 >>> 15));
        long j21 = j9 ^ ((((j15 << 37) ^ (j15 << 42)) ^ (j15 << 44)) ^ (j15 << 49));
        long j22 = (j11 ^ ((((j16 << 37) ^ (j16 << 42)) ^ (j16 << 44)) ^ (j16 << 49))) ^ ((((j15 >>> 27) ^ (j15 >>> 22)) ^ (j15 >>> 20)) ^ (j15 >>> 15));
        long j23 = j19 >>> 27;
        jArr2[0] = (((j21 ^ j23) ^ (j23 << 5)) ^ (j23 << 7)) ^ (j23 << 12);
        jArr2[1] = j22;
        jArr2[2] = (j12 ^ ((((j17 << 37) ^ (j17 << 42)) ^ (j17 << 44)) ^ (j17 << 49))) ^ ((((j16 >>> 27) ^ (j16 >>> 22)) ^ (j16 >>> 20)) ^ (j16 >>> 15));
        jArr2[3] = (j13 ^ ((((j18 << 37) ^ (j18 << 42)) ^ (j18 << 44)) ^ (j18 << 49))) ^ ((((j17 >>> 27) ^ (j17 >>> 22)) ^ (j17 >>> 20)) ^ (j17 >>> 15));
        jArr2[4] = M27 & j19;
    }

    public static void reduce37(long[] jArr, int i11) {
        int i12 = i11 + 4;
        long j9 = jArr[i12];
        long j11 = j9 >>> 27;
        jArr[i11] = ((j11 << 12) ^ (((j11 << 5) ^ j11) ^ (j11 << 7))) ^ jArr[i11];
        jArr[i12] = j9 & M27;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat320.create64();
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j9 = (jUnshuffle & 4294967295L) | (jUnshuffle2 << 32);
        jArrCreate64[0] = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long jUnshuffle4 = Interleave.unshuffle(jArr[3]);
        long j11 = (jUnshuffle3 & 4294967295L) | (jUnshuffle4 << 32);
        jArrCreate64[1] = (jUnshuffle3 >>> 32) | ((-4294967296L) & jUnshuffle4);
        long jUnshuffle5 = Interleave.unshuffle(jArr[4]);
        jArrCreate64[2] = jUnshuffle5 >>> 32;
        multiply(jArrCreate64, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ j9;
        jArr2[1] = jArr2[1] ^ j11;
        jArr2[2] = jArr2[2] ^ (4294967295L & jUnshuffle5);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(9);
        implSquare(jArr, jArrCreate64);
        reduce(jArrCreate64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(9);
        implSquare(jArr, jArrCreate64);
        addExt(jArr2, jArrCreate64, jArr2);
    }

    public static void squareN(long[] jArr, int i11, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(9);
        implSquare(jArr, jArrCreate64);
        while (true) {
            reduce(jArrCreate64, jArr2);
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                implSquare(jArr2, jArrCreate64);
            }
        }
    }

    public static int trace(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }
}
