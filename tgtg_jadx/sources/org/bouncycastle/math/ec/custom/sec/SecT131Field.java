package org.bouncycastle.math.ec.custom.sec;

import com.app.tgtg.model.local.AppConstants;
import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;
import qc.y;

/* JADX INFO: loaded from: classes3.dex */
public class SecT131Field {
    private static final long M03 = 7;
    private static final long M44 = 17592186044415L;
    private static final long[] ROOT_Z = {2791191049453778211L, 2791191049453778402L, 6};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    private static void addTo(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr2[0] ^ jArr[0];
        jArr2[1] = jArr2[1] ^ jArr[1];
        jArr2[2] = jArr2[2] ^ jArr[2];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(AppConstants.RESULT_CODE_ORDER_NOT_COLLECTED, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        Nat192.copy64(jArr, jArr2);
        for (int i11 = 1; i11 < 131; i11 += 2) {
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
        jArr[0] = j9 ^ (j11 << 44);
        jArr[1] = (j11 >>> 20) ^ (j12 << 24);
        jArr[2] = ((j12 >>> 40) ^ (j13 << 4)) ^ (j14 << 48);
        jArr[3] = ((j13 >>> 60) ^ (j15 << 28)) ^ (j14 >>> 16);
        jArr[4] = j15 >>> 36;
        jArr[5] = 0;
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j9 = jArr[0];
        long j11 = jArr[1];
        long j12 = ((jArr[2] << 40) ^ (j11 >>> 24)) & M44;
        long j13 = ((j9 >>> 44) ^ (j11 << 20)) & M44;
        long j14 = j9 & M44;
        long j15 = jArr2[0];
        long j16 = jArr2[1];
        long j17 = ((j16 >>> 24) ^ (jArr2[2] << 40)) & M44;
        long j18 = ((j15 >>> 44) ^ (j16 << 20)) & M44;
        long j19 = j15 & M44;
        long[] jArr4 = new long[10];
        implMulw(jArr3, j14, j19, jArr4, 0);
        implMulw(jArr3, j12, j17, jArr4, 2);
        long j21 = (j14 ^ j13) ^ j12;
        long j22 = (j19 ^ j18) ^ j17;
        implMulw(jArr3, j21, j22, jArr4, 4);
        long j23 = (j13 << 1) ^ (j12 << 2);
        long j24 = (j18 << 1) ^ (j17 << 2);
        implMulw(jArr3, j14 ^ j23, j19 ^ j24, jArr4, 6);
        implMulw(jArr3, j21 ^ j23, j22 ^ j24, jArr4, 8);
        long j25 = jArr4[6];
        long j26 = jArr4[8] ^ j25;
        long j27 = jArr4[7];
        long j28 = jArr4[9] ^ j27;
        long j29 = (j26 << 1) ^ j25;
        long j31 = (j26 ^ (j28 << 1)) ^ j27;
        long j32 = jArr4[0];
        long j33 = jArr4[1];
        long j34 = (j33 ^ j32) ^ jArr4[4];
        long j35 = j33 ^ jArr4[5];
        long j36 = jArr4[2];
        long j37 = ((j29 ^ j32) ^ (j36 << 4)) ^ (j36 << 1);
        long j38 = jArr4[3];
        long j39 = (((j34 ^ j31) ^ (j38 << 4)) ^ (j38 << 1)) ^ (j37 >>> 44);
        long j41 = (j35 ^ j28) ^ (j39 >>> 44);
        long j42 = ((j37 & M44) >>> 1) ^ ((j39 & 1) << 43);
        long j43 = ((j39 & M44) >>> 1) ^ ((j41 & 1) << 43);
        long j44 = j42 ^ (j42 << 1);
        long j45 = j44 ^ (j44 << 2);
        long j46 = j45 ^ (j45 << 4);
        long j47 = j46 ^ (j46 << 8);
        long j48 = j47 ^ (j47 << 16);
        long j49 = (j48 ^ (j48 << 32)) & M44;
        long j51 = j43 ^ (j49 >>> 43);
        long j52 = j51 ^ (j51 << 1);
        long j53 = j52 ^ (j52 << 2);
        long j54 = j53 ^ (j53 << 4);
        long j55 = j54 ^ (j54 << 8);
        long j56 = j55 ^ (j55 << 16);
        long j57 = (j56 ^ (j56 << 32)) & M44;
        long j58 = (j57 >>> 43) ^ (j41 >>> 1);
        long j59 = j58 ^ (j58 << 1);
        long j61 = j59 ^ (j59 << 2);
        long j62 = j61 ^ (j61 << 4);
        long j63 = j62 ^ (j62 << 8);
        long j64 = j63 ^ (j63 << 16);
        long j65 = j64 ^ (j64 << 32);
        jArr3[0] = j32;
        jArr3[1] = (j34 ^ j49) ^ j36;
        jArr3[2] = ((j35 ^ j57) ^ j49) ^ j38;
        jArr3[3] = j65 ^ j57;
        jArr3[4] = jArr4[2] ^ j65;
        jArr3[5] = jArr4[3];
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
        int i12 = (int) j9;
        long j16 = (((jArr[i12 & 7] ^ (jArr[(i12 >>> 3) & 7] << 3)) ^ (jArr[(i12 >>> 6) & 7] << 6)) ^ (jArr[(i12 >>> 9) & 7] << 9)) ^ (jArr[(i12 >>> 12) & 7] << 12);
        long j17 = 0;
        int i13 = 30;
        do {
            int i14 = (int) (j9 >>> i13);
            long j18 = (((jArr[i14 & 7] ^ (jArr[(i14 >>> 3) & 7] << 3)) ^ (jArr[(i14 >>> 6) & 7] << 6)) ^ (jArr[(i14 >>> 9) & 7] << 9)) ^ (jArr[(i14 >>> 12) & 7] << 12);
            j16 ^= j18 << i13;
            j17 ^= j18 >>> (-i13);
            i13 -= 15;
        } while (i13 > 0);
        jArr2[i11] = M44 & j16;
        jArr2[i11 + 1] = (j16 >>> 44) ^ (j17 << 20);
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr, 0, 2, jArr2, 0);
        jArr2[4] = ((long) Interleave.expand8to16((int) jArr[2])) & 4294967295L;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat192.isZero64(jArr)) {
            y.e();
            return;
        }
        long[] jArrCreate64 = Nat192.create64();
        long[] jArrCreate642 = Nat192.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 2, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        squareN(jArrCreate642, 4, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 8, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        squareN(jArrCreate642, 16, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        squareN(jArrCreate64, 32, jArrCreate642);
        multiply(jArrCreate642, jArrCreate64, jArrCreate642);
        square(jArrCreate642, jArrCreate642);
        multiply(jArrCreate642, jArr, jArrCreate642);
        squareN(jArrCreate642, 65, jArrCreate64);
        multiply(jArrCreate64, jArrCreate642, jArrCreate64);
        square(jArrCreate64, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        implMultiply(jArr, jArr2, jArr4);
        reduce(jArr4, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        implMultiply(jArr, jArr2, jArr4);
        addExt(jArr3, jArr4, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j9 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = j13 ^ (j14 >>> 59);
        long j16 = j9 ^ ((j15 << 61) ^ (j15 << 63));
        long j17 = (j11 ^ ((j14 << 61) ^ (j14 << 63))) ^ ((((j15 >>> 3) ^ (j15 >>> 1)) ^ j15) ^ (j15 << 5));
        long j18 = (j12 ^ ((((j14 >>> 3) ^ (j14 >>> 1)) ^ j14) ^ (j14 << 5))) ^ (j15 >>> 59);
        long j19 = j18 >>> 3;
        jArr2[0] = (((j16 ^ j19) ^ (j19 << 2)) ^ (j19 << 3)) ^ (j19 << 8);
        jArr2[1] = (j18 >>> 59) ^ j17;
        jArr2[2] = M03 & j18;
    }

    public static void reduce61(long[] jArr, int i11) {
        int i12 = i11 + 2;
        long j9 = jArr[i12];
        long j11 = j9 >>> 3;
        jArr[i11] = ((j11 << 8) ^ (((j11 << 2) ^ j11) ^ (j11 << 3))) ^ jArr[i11];
        int i13 = i11 + 1;
        jArr[i13] = jArr[i13] ^ (j9 >>> 59);
        jArr[i12] = j9 & M03;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat192.create64();
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j9 = (jUnshuffle & 4294967295L) | (jUnshuffle2 << 32);
        jArrCreate64[0] = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        jArrCreate64[1] = jUnshuffle3 >>> 32;
        multiply(jArrCreate64, ROOT_Z, jArr2);
        jArr2[0] = jArr2[0] ^ j9;
        jArr2[1] = jArr2[1] ^ (jUnshuffle3 & 4294967295L);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        implSquare(jArr, jArrCreate64);
        reduce(jArrCreate64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        implSquare(jArr, jArrCreate64);
        addExt(jArr2, jArrCreate64, jArr2);
    }

    public static void squareN(long[] jArr, int i11, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
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
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
    }
}
