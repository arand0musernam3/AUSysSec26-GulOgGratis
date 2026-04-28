package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat576;
import qc.y;

/* JADX INFO: loaded from: classes3.dex */
public class SecT571Field {
    private static final long M59 = 576460752303423487L;
    private static final long[] ROOT_Z = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    private static void add(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13) {
        for (int i14 = 0; i14 < 9; i14++) {
            jArr3[i13 + i14] = jArr[i11 + i14] ^ jArr2[i12 + i14];
        }
    }

    private static void addBothTo(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13) {
        for (int i14 = 0; i14 < 9; i14++) {
            int i15 = i13 + i14;
            jArr3[i15] = jArr3[i15] ^ (jArr[i11 + i14] ^ jArr2[i12 + i14]);
        }
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 18; i11++) {
            jArr3[i11] = jArr[i11] ^ jArr2[i11];
        }
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i11 = 1; i11 < 9; i11++) {
            jArr2[i11] = jArr[i11];
        }
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        for (int i11 = 0; i11 < 9; i11++) {
            jArr2[i11] = jArr2[i11] ^ jArr[i11];
        }
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(571, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        Nat576.copy64(jArr, jArr2);
        for (int i11 = 1; i11 < 571; i11 += 2) {
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            addTo(jArr, jArr2);
        }
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[16];
        for (int i11 = 0; i11 < 9; i11++) {
            implMulwAcc(jArr4, jArr[i11], jArr2[i11], jArr3, i11 << 1);
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
        long j31 = j27 ^ jArr3[13];
        long j32 = j28 ^ jArr3[14];
        long j33 = j32 ^ j31;
        jArr3[7] = j33;
        long j34 = j31 ^ jArr3[15];
        long j35 = j32 ^ jArr3[16];
        long j36 = j35 ^ j34;
        jArr3[8] = j36;
        long j37 = (j34 ^ jArr3[17]) ^ j35;
        jArr3[9] = j9 ^ j37;
        jArr3[10] = j13 ^ j37;
        jArr3[11] = j16 ^ j37;
        jArr3[12] = j19 ^ j37;
        jArr3[13] = j23 ^ j37;
        jArr3[14] = j26 ^ j37;
        jArr3[15] = j29 ^ j37;
        jArr3[16] = j33 ^ j37;
        jArr3[17] = j36 ^ j37;
        implMulwAcc(jArr4, jArr[0] ^ jArr[1], jArr2[0] ^ jArr2[1], jArr3, 1);
        implMulwAcc(jArr4, jArr[0] ^ jArr[2], jArr2[0] ^ jArr2[2], jArr3, 2);
        implMulwAcc(jArr4, jArr[0] ^ jArr[3], jArr2[0] ^ jArr2[3], jArr3, 3);
        implMulwAcc(jArr4, jArr[1] ^ jArr[2], jArr2[1] ^ jArr2[2], jArr3, 3);
        implMulwAcc(jArr4, jArr[0] ^ jArr[4], jArr2[0] ^ jArr2[4], jArr3, 4);
        implMulwAcc(jArr4, jArr[1] ^ jArr[3], jArr2[1] ^ jArr2[3], jArr3, 4);
        implMulwAcc(jArr4, jArr[0] ^ jArr[5], jArr2[0] ^ jArr2[5], jArr3, 5);
        implMulwAcc(jArr4, jArr[1] ^ jArr[4], jArr2[1] ^ jArr2[4], jArr3, 5);
        implMulwAcc(jArr4, jArr[2] ^ jArr[3], jArr2[2] ^ jArr2[3], jArr3, 5);
        implMulwAcc(jArr4, jArr[0] ^ jArr[6], jArr2[0] ^ jArr2[6], jArr3, 6);
        implMulwAcc(jArr4, jArr[1] ^ jArr[5], jArr2[1] ^ jArr2[5], jArr3, 6);
        implMulwAcc(jArr4, jArr[2] ^ jArr[4], jArr2[2] ^ jArr2[4], jArr3, 6);
        implMulwAcc(jArr4, jArr[0] ^ jArr[7], jArr2[0] ^ jArr2[7], jArr3, 7);
        implMulwAcc(jArr4, jArr[1] ^ jArr[6], jArr2[1] ^ jArr2[6], jArr3, 7);
        implMulwAcc(jArr4, jArr[2] ^ jArr[5], jArr2[2] ^ jArr2[5], jArr3, 7);
        implMulwAcc(jArr4, jArr[3] ^ jArr[4], jArr2[3] ^ jArr2[4], jArr3, 7);
        implMulwAcc(jArr4, jArr[0] ^ jArr[8], jArr2[0] ^ jArr2[8], jArr3, 8);
        implMulwAcc(jArr4, jArr[1] ^ jArr[7], jArr2[1] ^ jArr2[7], jArr3, 8);
        implMulwAcc(jArr4, jArr[2] ^ jArr[6], jArr2[2] ^ jArr2[6], jArr3, 8);
        implMulwAcc(jArr4, jArr[3] ^ jArr[5], jArr2[3] ^ jArr2[5], jArr3, 8);
        implMulwAcc(jArr4, jArr[1] ^ jArr[8], jArr2[1] ^ jArr2[8], jArr3, 9);
        implMulwAcc(jArr4, jArr[2] ^ jArr[7], jArr2[2] ^ jArr2[7], jArr3, 9);
        implMulwAcc(jArr4, jArr[3] ^ jArr[6], jArr2[3] ^ jArr2[6], jArr3, 9);
        implMulwAcc(jArr4, jArr[4] ^ jArr[5], jArr2[4] ^ jArr2[5], jArr3, 9);
        implMulwAcc(jArr4, jArr[2] ^ jArr[8], jArr2[2] ^ jArr2[8], jArr3, 10);
        implMulwAcc(jArr4, jArr[3] ^ jArr[7], jArr2[3] ^ jArr2[7], jArr3, 10);
        implMulwAcc(jArr4, jArr[4] ^ jArr[6], jArr2[4] ^ jArr2[6], jArr3, 10);
        implMulwAcc(jArr4, jArr[3] ^ jArr[8], jArr2[3] ^ jArr2[8], jArr3, 11);
        implMulwAcc(jArr4, jArr[4] ^ jArr[7], jArr2[4] ^ jArr2[7], jArr3, 11);
        implMulwAcc(jArr4, jArr[5] ^ jArr[6], jArr2[5] ^ jArr2[6], jArr3, 11);
        implMulwAcc(jArr4, jArr[4] ^ jArr[8], jArr2[4] ^ jArr2[8], jArr3, 12);
        implMulwAcc(jArr4, jArr[5] ^ jArr[7], jArr2[5] ^ jArr2[7], jArr3, 12);
        implMulwAcc(jArr4, jArr[5] ^ jArr[8], jArr2[5] ^ jArr2[8], jArr3, 13);
        implMulwAcc(jArr4, jArr[6] ^ jArr[7], jArr2[6] ^ jArr2[7], jArr3, 13);
        implMulwAcc(jArr4, jArr[6] ^ jArr[8], jArr2[6] ^ jArr2[8], jArr3, 14);
        implMulwAcc(jArr4, jArr[7] ^ jArr[8], jArr2[7] ^ jArr2[8], jArr3, 15);
    }

    public static void implMultiplyPrecomp(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 56; i11 >= 0; i11 -= 8) {
            for (int i12 = 1; i12 < 9; i12 += 2) {
                int i13 = (int) (jArr[i12] >>> i11);
                addBothTo(jArr2, (i13 & 15) * 9, jArr2, (((i13 >>> 4) & 15) + 16) * 9, jArr3, i12 - 1);
            }
            Nat.shiftUpBits64(16, jArr3, 0, 8, 0L);
        }
        for (int i14 = 56; i14 >= 0; i14 -= 8) {
            int i15 = 0;
            while (i15 < 9) {
                int i16 = (int) (jArr[i15] >>> i14);
                int i17 = i15;
                addBothTo(jArr2, (i16 & 15) * 9, jArr2, (((i16 >>> 4) & 15) + 16) * 9, jArr3, i17);
                i15 = i17 + 2;
            }
            if (i14 > 0) {
                Nat.shiftUpBits64(18, jArr3, 0, 8, 0L);
            }
        }
    }

    public static void implMulwAcc(long[] jArr, long j9, long j11, long[] jArr2, int i11) {
        long j12 = j9;
        jArr[1] = j11;
        for (int i12 = 2; i12 < 16; i12 += 2) {
            long j13 = jArr[i12 >>> 1] << 1;
            jArr[i12] = j13;
            jArr[i12 + 1] = j13 ^ j11;
        }
        int i13 = (int) j12;
        long j14 = jArr[i13 & 15] ^ (jArr[(i13 >>> 4) & 15] << 4);
        long j15 = 0;
        int i14 = 56;
        do {
            int i15 = (int) (j12 >>> i14);
            long j16 = jArr[i15 & 15] ^ (jArr[(i15 >>> 4) & 15] << 4);
            j14 ^= j16 << i14;
            j15 ^= j16 >>> (-i14);
            i14 -= 8;
        } while (i14 > 0);
        for (int i16 = 0; i16 < 7; i16++) {
            j12 = (j12 & (-72340172838076674L)) >>> 1;
            j15 ^= ((j11 << i16) >> 63) & j12;
        }
        jArr2[i11] = jArr2[i11] ^ j14;
        int i17 = i11 + 1;
        jArr2[i17] = jArr2[i17] ^ j15;
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 9, jArr2, 0);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat576.isZero64(jArr)) {
            y.e();
            return;
        }
        long[] jArrCreate64 = Nat576.create64();
        long[] jArrCreate642 = Nat576.create64();
        long[] jArrCreate643 = Nat576.create64();
        square(jArr, jArrCreate643);
        square(jArrCreate643, jArrCreate64);
        square(jArrCreate64, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 2, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        multiply(jArrCreate64, jArrCreate643, jArrCreate64);
        squareN(jArrCreate64, 5, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 5, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 15, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate643);
        squareN(jArrCreate643, 30, jArrCreate64);
        squareN(jArrCreate64, 30, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 60, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 60, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 180, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate642, 180, jArrCreate642);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        multiply(jArrCreate64, jArrCreate643, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static void multiplyPrecomp(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implMultiplyPrecomp(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyPrecompAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implMultiplyPrecomp(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static long[] precompMultiplicand(long[] jArr) {
        long[] jArr2 = new long[288];
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i11 = 7;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = i12 + 18;
            Nat.shiftUpBit64(9, jArr2, i13 >>> 1, 0L, jArr2, i13);
            reduce5(jArr2, i13);
            long[] jArr3 = jArr2;
            add(jArr3, 9, jArr3, i13, jArr3, i12 + 27);
            jArr2 = jArr3;
            i11--;
            i12 = i13;
        }
        Nat.shiftUpBits64(144, jArr2, 0, 4, 0L, jArr2, 144);
        return jArr2;
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j9 = jArr[9];
        long j11 = jArr[17];
        long j12 = (((j9 ^ (j11 >>> 59)) ^ (j11 >>> 57)) ^ (j11 >>> 54)) ^ (j11 >>> 49);
        long j13 = (j11 << 15) ^ (((jArr[8] ^ (j11 << 5)) ^ (j11 << 7)) ^ (j11 << 10));
        for (int i11 = 16; i11 >= 10; i11--) {
            long j14 = jArr[i11];
            jArr2[i11 - 8] = (((j13 ^ (j14 >>> 59)) ^ (j14 >>> 57)) ^ (j14 >>> 54)) ^ (j14 >>> 49);
            j13 = (((jArr[i11 - 9] ^ (j14 << 5)) ^ (j14 << 7)) ^ (j14 << 10)) ^ (j14 << 15);
        }
        jArr2[1] = (((j13 ^ (j12 >>> 59)) ^ (j12 >>> 57)) ^ (j12 >>> 54)) ^ (j12 >>> 49);
        long j15 = (j12 << 15) ^ (((jArr[0] ^ (j12 << 5)) ^ (j12 << 7)) ^ (j12 << 10));
        long j16 = jArr2[8];
        long j17 = j16 >>> 59;
        jArr2[0] = (((j15 ^ j17) ^ (j17 << 2)) ^ (j17 << 5)) ^ (j17 << 10);
        jArr2[8] = M59 & j16;
    }

    public static void reduce5(long[] jArr, int i11) {
        int i12 = i11 + 8;
        long j9 = jArr[i12];
        long j11 = j9 >>> 59;
        jArr[i11] = ((j11 << 10) ^ (((j11 << 2) ^ j11) ^ (j11 << 5))) ^ jArr[i11];
        jArr[i12] = j9 & M59;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat576.create64();
        long[] jArrCreate642 = Nat576.create64();
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = i11 + 1;
            long jUnshuffle = Interleave.unshuffle(jArr[i11]);
            i11 += 2;
            long jUnshuffle2 = Interleave.unshuffle(jArr[i13]);
            jArrCreate64[i12] = (4294967295L & jUnshuffle) | (jUnshuffle2 << 32);
            jArrCreate642[i12] = (jUnshuffle >>> 32) | ((-4294967296L) & jUnshuffle2);
        }
        long jUnshuffle3 = Interleave.unshuffle(jArr[i11]);
        jArrCreate64[4] = 4294967295L & jUnshuffle3;
        jArrCreate642[4] = jUnshuffle3 >>> 32;
        multiply(jArrCreate642, ROOT_Z, jArr2);
        add(jArr2, jArrCreate64, jArr2);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i11, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implSquare(jArr, jArrCreateExt64);
        while (true) {
            reduce(jArrCreateExt64, jArr2);
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                implSquare(jArr2, jArrCreateExt64);
            }
        }
    }

    public static int trace(long[] jArr) {
        long j9 = jArr[0];
        long j11 = jArr[8];
        return ((int) ((j9 ^ (j11 >>> 49)) ^ (j11 >>> 57))) & 1;
    }

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 9; i11++) {
            jArr3[i11] = jArr[i11] ^ jArr2[i11];
        }
    }

    public static void addBothTo(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i11 = 0; i11 < 9; i11++) {
            jArr3[i11] = jArr3[i11] ^ (jArr[i11] ^ jArr2[i11]);
        }
    }
}
