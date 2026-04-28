package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class SecP192R1Field {
    private static final long M = 4294967295L;
    private static final int P5 = -1;
    private static final int PExt11 = -1;
    static final int[] P = {-1, -1, -2, -1, -1, -1};
    private static final int[] PExt = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.add(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && Nat192.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && Nat192.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j9 = (((long) iArr[0]) & M) + 1;
        iArr[0] = (int) j9;
        long j11 = j9 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (((long) iArr[1]) & M);
            iArr[1] = (int) j12;
            j11 = j12 >> 32;
        }
        long j13 = (M & ((long) iArr[2])) + 1 + j11;
        iArr[2] = (int) j13;
        if ((j13 >> 32) != 0) {
            Nat.incAt(6, iArr, 3);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat192.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[5] == -1) {
            int[] iArr = P;
            if (Nat192.gte(iArrFromBigInteger, iArr)) {
                Nat192.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(6, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(6, iArr2, Nat192.add(iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat192.createExt();
        Nat192.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat192.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            Nat192.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[24];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 6);
        } while (Nat.lessThan(6, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j9 = ((long) iArr[6]) & M;
        long j11 = ((long) iArr[7]) & M;
        long j12 = ((long) iArr[8]) & M;
        long j13 = ((long) iArr[9]) & M;
        long j14 = (((long) iArr[10]) & M) + j9;
        long j15 = (((long) iArr[11]) & M) + j11;
        long j16 = (((long) iArr[0]) & M) + j14;
        int i11 = (int) j16;
        long j17 = (((long) iArr[1]) & M) + j15 + (j16 >> 32);
        int i12 = (int) j17;
        iArr2[1] = i12;
        long j18 = j14 + j12;
        long j19 = j15 + j13;
        long j21 = (((long) iArr[2]) & M) + j18 + (j17 >> 32);
        long j22 = j21 & M;
        long j23 = (((long) iArr[3]) & M) + j19 + (j21 >> 32);
        iArr2[3] = (int) j23;
        long j24 = (((long) iArr[4]) & M) + (j18 - j9) + (j23 >> 32);
        iArr2[4] = (int) j24;
        long j25 = (((long) iArr[5]) & M) + (j19 - j11) + (j24 >> 32);
        iArr2[5] = (int) j25;
        long j26 = j25 >> 32;
        long j27 = j22 + j26;
        long j28 = j26 + (((long) i11) & M);
        iArr2[0] = (int) j28;
        long j29 = j28 >> 32;
        if (j29 != 0) {
            long j31 = j29 + (((long) i12) & M);
            iArr2[1] = (int) j31;
            j27 += j31 >> 32;
        }
        iArr2[2] = (int) j27;
        if (((j27 >> 32) == 0 || Nat.incAt(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && Nat192.gte(iArr2, P))) {
            return;
        }
        addPInvTo(iArr2);
    }

    public static void reduce32(int i11, int[] iArr) {
        long j9;
        if (i11 != 0) {
            long j11 = ((long) i11) & M;
            long j12 = (((long) iArr[0]) & M) + j11;
            iArr[0] = (int) j12;
            long j13 = j12 >> 32;
            if (j13 != 0) {
                long j14 = j13 + (((long) iArr[1]) & M);
                iArr[1] = (int) j14;
                j13 = j14 >> 32;
            }
            long j15 = (M & ((long) iArr[2])) + j11 + j13;
            iArr[2] = (int) j15;
            j9 = j15 >> 32;
        } else {
            j9 = 0;
        }
        if ((j9 == 0 || Nat.incAt(6, iArr, 3) == 0) && !(iArr[5] == -1 && Nat192.gte(iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat192.createExt();
        Nat192.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i11, int[] iArr2) {
        int[] iArrCreateExt = Nat192.createExt();
        Nat192.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                Nat192.square(iArr2, iArrCreateExt);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j9 = (((long) iArr[0]) & M) - 1;
        iArr[0] = (int) j9;
        long j11 = j9 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (((long) iArr[1]) & M);
            iArr[1] = (int) j12;
            j11 = j12 >> 32;
        }
        long j13 = ((M & ((long) iArr[2])) - 1) + j11;
        iArr[2] = (int) j13;
        if ((j13 >> 32) != 0) {
            Nat.decAt(6, iArr, 3);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat192.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(12, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && Nat192.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}
