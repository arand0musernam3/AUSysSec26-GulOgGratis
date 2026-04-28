package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat448;
import qc.y;

/* JADX INFO: loaded from: classes3.dex */
public class SecT409Field {
    private static final long M25 = 33554431;
    private static final long M59 = 576460752303423487L;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 13; i11++) {
            jArr3[i11] = jArr[i11] ^ jArr2[i11];
        }
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
        jArr2[3] = jArr2[3] ^ jArr[3];
        jArr2[4] = jArr2[4] ^ jArr[4];
        jArr2[5] = jArr2[5] ^ jArr[5];
        jArr2[6] = jArr2[6] ^ jArr[6];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(409, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(13);
        Nat448.copy64(jArr, jArr2);
        for (int i11 = 1; i11 < 409; i11 += 2) {
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
        long j21 = jArr[10];
        long j22 = jArr[11];
        long j23 = jArr[12];
        long j24 = jArr[13];
        jArr[0] = j9 ^ (j11 << 59);
        jArr[1] = (j11 >>> 5) ^ (j12 << 54);
        jArr[2] = (j12 >>> 10) ^ (j13 << 49);
        jArr[3] = (j13 >>> 15) ^ (j14 << 44);
        jArr[4] = (j14 >>> 20) ^ (j15 << 39);
        jArr[5] = (j15 >>> 25) ^ (j16 << 34);
        jArr[6] = (j16 >>> 30) ^ (j17 << 29);
        jArr[7] = (j17 >>> 35) ^ (j18 << 24);
        jArr[8] = (j18 >>> 40) ^ (j19 << 19);
        jArr[9] = (j19 >>> 45) ^ (j21 << 14);
        jArr[10] = (j21 >>> 50) ^ (j22 << 9);
        jArr[11] = ((j22 >>> 55) ^ (j23 << 4)) ^ (j24 << 63);
        jArr[12] = j24 >>> 1;
    }

    public static void implExpand(long[] jArr, long[] jArr2) {
        long j9 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        jArr2[0] = j9 & M59;
        jArr2[1] = ((j9 >>> 59) ^ (j11 << 5)) & M59;
        jArr2[2] = ((j11 >>> 54) ^ (j12 << 10)) & M59;
        jArr2[3] = ((j12 >>> 49) ^ (j13 << 15)) & M59;
        jArr2[4] = ((j13 >>> 44) ^ (j14 << 20)) & M59;
        jArr2[5] = ((j14 >>> 39) ^ (j15 << 25)) & M59;
        jArr2[6] = (j15 >>> 34) ^ (j16 << 30);
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        long[] jArr6 = new long[8];
        for (int i11 = 0; i11 < 7; i11++) {
            implMulwAcc(jArr6, jArr4[i11], jArr5[i11], jArr3, i11 << 1);
        }
        long j9 = jArr3[0];
        long j11 = jArr3[1];
        long j12 = jArr3[2] ^ j9;
        long j13 = j12 ^ j11;
        jArr3[1] = j13;
        long j14 = j11 ^ jArr3[3];
        long j15 = j12 ^ jArr3[4];
        long j16 = j15 ^ j14;
        jArr3[2] = j16;
        long j17 = j14 ^ jArr3[5];
        long j18 = j15 ^ jArr3[6];
        long j19 = j18 ^ j17;
        jArr3[3] = j19;
        long j21 = j17 ^ jArr3[7];
        long j22 = j18 ^ jArr3[8];
        long j23 = j22 ^ j21;
        jArr3[4] = j23;
        long j24 = j21 ^ jArr3[9];
        long j25 = j22 ^ jArr3[10];
        long j26 = j25 ^ j24;
        jArr3[5] = j26;
        long j27 = j24 ^ jArr3[11];
        long j28 = j25 ^ jArr3[12];
        long j29 = j28 ^ j27;
        jArr3[6] = j29;
        long j31 = (j27 ^ jArr3[13]) ^ j28;
        jArr3[7] = j9 ^ j31;
        jArr3[8] = j13 ^ j31;
        jArr3[9] = j16 ^ j31;
        jArr3[10] = j19 ^ j31;
        jArr3[11] = j23 ^ j31;
        jArr3[12] = j26 ^ j31;
        jArr3[13] = j29 ^ j31;
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[2], jArr5[0] ^ jArr5[2], jArr3, 2);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[3], jArr5[0] ^ jArr5[3], jArr3, 3);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[2], jArr5[1] ^ jArr5[2], jArr3, 3);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[4], jArr5[0] ^ jArr5[4], jArr3, 4);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[3], jArr5[1] ^ jArr5[3], jArr3, 4);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[5], jArr5[0] ^ jArr5[5], jArr3, 5);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[4], jArr5[1] ^ jArr5[4], jArr3, 5);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 5);
        implMulwAcc(jArr6, jArr4[0] ^ jArr4[6], jArr5[0] ^ jArr5[6], jArr3, 6);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[5], jArr5[1] ^ jArr5[5], jArr3, 6);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[4], jArr5[2] ^ jArr5[4], jArr3, 6);
        implMulwAcc(jArr6, jArr4[1] ^ jArr4[6], jArr5[1] ^ jArr5[6], jArr3, 7);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[5], jArr5[2] ^ jArr5[5], jArr3, 7);
        implMulwAcc(jArr6, jArr4[3] ^ jArr4[4], jArr5[3] ^ jArr5[4], jArr3, 7);
        implMulwAcc(jArr6, jArr4[2] ^ jArr4[6], jArr5[2] ^ jArr5[6], jArr3, 8);
        implMulwAcc(jArr6, jArr4[3] ^ jArr4[5], jArr5[3] ^ jArr5[5], jArr3, 8);
        implMulwAcc(jArr6, jArr4[3] ^ jArr4[6], jArr5[3] ^ jArr5[6], jArr3, 9);
        implMulwAcc(jArr6, jArr4[4] ^ jArr4[5], jArr5[4] ^ jArr5[5], jArr3, 9);
        implMulwAcc(jArr6, jArr4[4] ^ jArr4[6], jArr5[4] ^ jArr5[6], jArr3, 10);
        implMulwAcc(jArr6, jArr4[5] ^ jArr4[6], jArr5[6] ^ jArr5[5], jArr3, 11);
        implCompactExt(jArr3);
    }

    public static void implMulwAcc(long[] jArr, long j9, long j11, long[] jArr2, int i11) {
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
        int i12 = (int) j9;
        long j16 = (jArr[(i12 >>> 3) & 7] << 3) ^ jArr[i12 & 7];
        long j17 = 0;
        int i13 = 54;
        do {
            int i14 = (int) (j9 >>> i13);
            long j18 = jArr[i14 & 7] ^ (jArr[(i14 >>> 3) & 7] << 3);
            j16 ^= j18 << i13;
            j17 ^= j18 >>> (-i13);
            i13 -= 6;
        } while (i13 > 0);
        jArr2[i11] = jArr2[i11] ^ (M59 & j16);
        int i15 = i11 + 1;
        jArr2[i15] = jArr2[i15] ^ ((j16 >>> 59) ^ (j17 << 5));
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 6, jArr2, 0);
        jArr2[12] = Interleave.expand32to64((int) jArr[6]);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat448.isZero64(jArr)) {
            y.e();
            return;
        }
        long[] jArrCreate64 = Nat448.create64();
        long[] jArrCreate642 = Nat448.create64();
        long[] jArrCreate643 = Nat448.create64();
        square(jArr, jArrCreate64);
        squareN(jArrCreate64, 1, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 1, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 6, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 12, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate643);
        squareN(jArrCreate643, 24, jArrCreate64);
        squareN(jArrCreate64, 24, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 48, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 96, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, BERTags.PRIVATE, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        multiply(jArrCreate64, jArrCreate643, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat448.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat448.createExt64();
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
        long j18 = jArr[12];
        long j19 = j15 ^ (j18 << 39);
        long j21 = j16 ^ ((j18 >>> 25) ^ (j18 << 62));
        long j22 = j17 ^ (j18 >>> 2);
        long j23 = jArr[11];
        long j24 = j14 ^ (j23 << 39);
        long j25 = j19 ^ ((j23 >>> 25) ^ (j23 << 62));
        long j26 = j21 ^ (j23 >>> 2);
        long j27 = jArr[10];
        long j28 = j13 ^ (j27 << 39);
        long j29 = j24 ^ ((j27 >>> 25) ^ (j27 << 62));
        long j31 = j25 ^ (j27 >>> 2);
        long j32 = jArr[9];
        long j33 = j12 ^ (j32 << 39);
        long j34 = j28 ^ ((j32 >>> 25) ^ (j32 << 62));
        long j35 = j29 ^ (j32 >>> 2);
        long j36 = jArr[8];
        long j37 = j9 ^ (j22 << 39);
        long j38 = (j11 ^ (j36 << 39)) ^ ((j22 >>> 25) ^ (j22 << 62));
        long j39 = (j33 ^ ((j36 >>> 25) ^ (j36 << 62))) ^ (j22 >>> 2);
        long j41 = j26 >>> 25;
        jArr2[0] = j37 ^ j41;
        jArr2[1] = (j41 << 23) ^ j38;
        jArr2[2] = j39;
        jArr2[3] = j34 ^ (j36 >>> 2);
        jArr2[4] = j35;
        jArr2[5] = j31;
        jArr2[6] = j26 & M25;
    }

    public static void reduce39(long[] jArr, int i11) {
        int i12 = i11 + 6;
        long j9 = jArr[i12];
        long j11 = j9 >>> 25;
        jArr[i11] = jArr[i11] ^ j11;
        int i13 = i11 + 1;
        jArr[i13] = (j11 << 23) ^ jArr[i13];
        jArr[i12] = j9 & M25;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j9 = (jUnshuffle & 4294967295L) | (jUnshuffle2 << 32);
        long j11 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long jUnshuffle4 = Interleave.unshuffle(jArr[3]);
        long j12 = (jUnshuffle3 & 4294967295L) | (jUnshuffle4 << 32);
        long j13 = (jUnshuffle3 >>> 32) | (jUnshuffle4 & (-4294967296L));
        long jUnshuffle5 = Interleave.unshuffle(jArr[4]);
        long jUnshuffle6 = Interleave.unshuffle(jArr[5]);
        long j14 = (jUnshuffle5 >>> 32) | (jUnshuffle6 & (-4294967296L));
        long jUnshuffle7 = Interleave.unshuffle(jArr[6]);
        long j15 = jUnshuffle7 >>> 32;
        jArr2[0] = j9 ^ (j11 << 44);
        jArr2[1] = (j12 ^ (j13 << 44)) ^ (j11 >>> 20);
        jArr2[2] = (((jUnshuffle5 & 4294967295L) | (jUnshuffle6 << 32)) ^ (j14 << 44)) ^ (j13 >>> 20);
        jArr2[3] = (((j15 << 44) ^ (jUnshuffle7 & 4294967295L)) ^ (j14 >>> 20)) ^ (j11 << 13);
        jArr2[4] = (j11 >>> 51) ^ ((jUnshuffle7 >>> 52) ^ (j13 << 13));
        jArr2[5] = (j14 << 13) ^ (j13 >>> 51);
        jArr2[6] = (j15 << 13) ^ (j14 >>> 51);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(13);
        implSquare(jArr, jArrCreate64);
        reduce(jArrCreate64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(13);
        implSquare(jArr, jArrCreate64);
        addExt(jArr2, jArrCreate64, jArr2);
    }

    public static void squareN(long[] jArr, int i11, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(13);
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
        return ((int) jArr[0]) & 1;
    }
}
