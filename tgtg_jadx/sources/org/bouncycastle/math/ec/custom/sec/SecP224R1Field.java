package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat224;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class SecP224R1Field {
    private static final long M = 4294967295L;
    private static final int P6 = -1;
    private static final int PExt13 = -1;
    static final int[] P = {1, 0, 0, -1, -1, -1, -1};
    private static final int[] PExt = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    private static final int[] PExtInv = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.add(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && Nat224.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(14, iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j9 = (((long) iArr[0]) & M) - 1;
        iArr[0] = (int) j9;
        long j11 = j9 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (((long) iArr[1]) & M);
            iArr[1] = (int) j12;
            long j13 = (j12 >> 32) + (((long) iArr[2]) & M);
            iArr[2] = (int) j13;
            j11 = j13 >> 32;
        }
        long j14 = (M & ((long) iArr[3])) + 1 + j11;
        iArr[3] = (int) j14;
        if ((j14 >> 32) != 0) {
            Nat.incAt(7, iArr, 4);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat224.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[6] == -1) {
            int[] iArr = P;
            if (Nat224.gte(iArrFromBigInteger, iArr)) {
                Nat224.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(7, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(7, iArr2, Nat224.add(iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 7; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.mulAddTo(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && Nat.gte(14, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat224.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            Nat224.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[28];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 7);
        } while (Nat.lessThan(7, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j9 = ((long) iArr[10]) & M;
        long j11 = ((long) iArr[11]) & M;
        long j12 = ((long) iArr[12]) & M;
        long j13 = ((long) iArr[13]) & M;
        long j14 = ((((long) iArr[7]) & M) + j11) - 1;
        long j15 = (((long) iArr[8]) & M) + j12;
        long j16 = (((long) iArr[9]) & M) + j13;
        long j17 = (((long) iArr[0]) & M) - j14;
        long j18 = j17 & M;
        long j19 = ((((long) iArr[1]) & M) - j15) + (j17 >> 32);
        int i11 = (int) j19;
        iArr2[1] = i11;
        long j21 = ((((long) iArr[2]) & M) - j16) + (j19 >> 32);
        int i12 = (int) j21;
        iArr2[2] = i12;
        long j22 = (((((long) iArr[3]) & M) + j14) - j9) + (j21 >> 32);
        long j23 = j22 & M;
        long j24 = (((((long) iArr[4]) & M) + j15) - j11) + (j22 >> 32);
        iArr2[4] = (int) j24;
        long j25 = (((((long) iArr[5]) & M) + j16) - j12) + (j24 >> 32);
        iArr2[5] = (int) j25;
        long j26 = (((((long) iArr[6]) & M) + j9) - j13) + (j25 >> 32);
        iArr2[6] = (int) j26;
        long j27 = (j26 >> 32) + 1;
        long j28 = j23 + j27;
        long j29 = j18 - j27;
        iArr2[0] = (int) j29;
        long j31 = j29 >> 32;
        if (j31 != 0) {
            long j32 = j31 + (((long) i11) & M);
            iArr2[1] = (int) j32;
            long j33 = (j32 >> 32) + (((long) i12) & M);
            iArr2[2] = (int) j33;
            j28 += j33 >> 32;
        }
        iArr2[3] = (int) j28;
        if (((j28 >> 32) == 0 || Nat.incAt(7, iArr2, 4) == 0) && !(iArr2[6] == -1 && Nat224.gte(iArr2, P))) {
            return;
        }
        addPInvTo(iArr2);
    }

    public static void reduce32(int i11, int[] iArr) {
        long j9;
        if (i11 != 0) {
            long j11 = ((long) i11) & M;
            long j12 = (((long) iArr[0]) & M) - j11;
            iArr[0] = (int) j12;
            long j13 = j12 >> 32;
            if (j13 != 0) {
                long j14 = j13 + (((long) iArr[1]) & M);
                iArr[1] = (int) j14;
                long j15 = (j14 >> 32) + (((long) iArr[2]) & M);
                iArr[2] = (int) j15;
                j13 = j15 >> 32;
            }
            long j16 = (M & ((long) iArr[3])) + j11 + j13;
            iArr[3] = (int) j16;
            j9 = j16 >> 32;
        } else {
            j9 = 0;
        }
        if ((j9 == 0 || Nat.incAt(7, iArr, 4) == 0) && !(iArr[6] == -1 && Nat224.gte(iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i11, int[] iArr2) {
        int[] iArrCreateExt = Nat224.createExt();
        Nat224.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                Nat224.square(iArr2, iArrCreateExt);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j9 = (((long) iArr[0]) & M) + 1;
        iArr[0] = (int) j9;
        long j11 = j9 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (((long) iArr[1]) & M);
            iArr[1] = (int) j12;
            long j13 = (j12 >> 32) + (((long) iArr[2]) & M);
            iArr[2] = (int) j13;
            j11 = j13 >> 32;
        }
        long j14 = ((M & ((long) iArr[3])) - 1) + j11;
        iArr[3] = (int) j14;
        if ((j14 >> 32) != 0) {
            Nat.decAt(7, iArr, 4);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat224.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(14, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(14, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && Nat224.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }
}
