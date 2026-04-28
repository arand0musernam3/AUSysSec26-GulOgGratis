package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class SecP256R1Field {
    private static final long M = 4294967295L;
    private static final int P7 = -1;
    private static final int PExt15s1 = Integer.MAX_VALUE;
    static final int[] P = {-1, -1, -1, 0, 0, 0, 1, -1};
    private static final int[] PExt = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.add(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && Nat256.gte(iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(16, iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, P))) {
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
            long j13 = (j12 >> 32) + (((long) iArr[2]) & M);
            iArr[2] = (int) j13;
            j11 = j13 >> 32;
        }
        long j14 = ((((long) iArr[3]) & M) - 1) + j11;
        iArr[3] = (int) j14;
        long j15 = j14 >> 32;
        if (j15 != 0) {
            long j16 = j15 + (((long) iArr[4]) & M);
            iArr[4] = (int) j16;
            long j17 = (j16 >> 32) + (((long) iArr[5]) & M);
            iArr[5] = (int) j17;
            j15 = j17 >> 32;
        }
        long j18 = ((((long) iArr[6]) & M) - 1) + j15;
        iArr[6] = (int) j18;
        iArr[7] = (int) ((M & ((long) iArr[7])) + 1 + (j18 >> 32));
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat256.fromBigInteger(bigInteger);
        if (iArrFromBigInteger[7] == -1) {
            int[] iArr = P;
            if (Nat256.gte(iArrFromBigInteger, iArr)) {
                Nat256.subFrom(iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(8, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(8, iArr2, Nat256.add(iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.mul(iArr, iArr2, iArrCreateExt);
        reduce(iArrCreateExt, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.mulAddTo(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && Nat.gte(16, iArr3, PExt))) {
            Nat.subFrom(16, PExt, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat256.sub(P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            Nat256.sub(iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[32];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 8);
        } while (Nat.lessThan(8, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j9 = ((long) iArr[8]) & M;
        long j11 = ((long) iArr[9]) & M;
        long j12 = ((long) iArr[10]) & M;
        long j13 = ((long) iArr[11]) & M;
        long j14 = ((long) iArr[12]) & M;
        long j15 = ((long) iArr[13]) & M;
        long j16 = ((long) iArr[14]) & M;
        long j17 = ((long) iArr[15]) & M;
        long j18 = j9 - 6;
        long j19 = j18 + j11;
        long j21 = j11 + j12;
        long j22 = (j12 + j13) - j17;
        long j23 = j13 + j14;
        long j24 = j14 + j15;
        long j25 = j15 + j16;
        long j26 = j16 + j17;
        long j27 = j25 - j19;
        long j28 = ((((long) iArr[0]) & M) - j23) - j27;
        iArr2[0] = (int) j28;
        long j29 = ((((((long) iArr[1]) & M) + j21) - j24) - j26) + (j28 >> 32);
        iArr2[1] = (int) j29;
        long j31 = (((((long) iArr[2]) & M) + j22) - j25) + (j29 >> 32);
        iArr2[2] = (int) j31;
        long j32 = ((((((long) iArr[3]) & M) + (j23 << 1)) + j27) - j26) + (j31 >> 32);
        iArr2[3] = (int) j32;
        long j33 = ((((((long) iArr[4]) & M) + (j24 << 1)) + j16) - j21) + (j32 >> 32);
        iArr2[4] = (int) j33;
        long j34 = (((((long) iArr[5]) & M) + (j25 << 1)) - j22) + (j33 >> 32);
        iArr2[5] = (int) j34;
        long j35 = (((long) iArr[6]) & M) + (j26 << 1) + j27 + (j34 >> 32);
        iArr2[6] = (int) j35;
        long j36 = (((((((long) iArr[7]) & M) + (j17 << 1)) + j18) - j22) - j24) + (j35 >> 32);
        iArr2[7] = (int) j36;
        reduce32((int) ((j36 >> 32) + 6), iArr2);
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
                long j15 = (j14 >> 32) + (((long) iArr[2]) & M);
                iArr[2] = (int) j15;
                j13 = j15 >> 32;
            }
            long j16 = ((((long) iArr[3]) & M) - j11) + j13;
            iArr[3] = (int) j16;
            long j17 = j16 >> 32;
            if (j17 != 0) {
                long j18 = j17 + (((long) iArr[4]) & M);
                iArr[4] = (int) j18;
                long j19 = (j18 >> 32) + (((long) iArr[5]) & M);
                iArr[5] = (int) j19;
                j17 = j19 >> 32;
            }
            long j21 = ((((long) iArr[6]) & M) - j11) + j17;
            iArr[6] = (int) j21;
            long j22 = (M & ((long) iArr[7])) + j11 + (j21 >> 32);
            iArr[7] = (int) j22;
            j9 = j22 >> 32;
        } else {
            j9 = 0;
        }
        if (j9 != 0 || (iArr[7] == -1 && Nat256.gte(iArr, P))) {
            addPInvTo(iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        reduce(iArrCreateExt, iArr2);
    }

    public static void squareN(int[] iArr, int i11, int[] iArr2) {
        int[] iArrCreateExt = Nat256.createExt();
        Nat256.square(iArr, iArrCreateExt);
        while (true) {
            reduce(iArrCreateExt, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                Nat256.square(iArr2, iArrCreateExt);
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
            long j13 = (j12 >> 32) + (((long) iArr[2]) & M);
            iArr[2] = (int) j13;
            j11 = j13 >> 32;
        }
        long j14 = (((long) iArr[3]) & M) + 1 + j11;
        iArr[3] = (int) j14;
        long j15 = j14 >> 32;
        if (j15 != 0) {
            long j16 = j15 + (((long) iArr[4]) & M);
            iArr[4] = (int) j16;
            long j17 = (j16 >> 32) + (((long) iArr[5]) & M);
            iArr[5] = (int) j17;
            j15 = j17 >> 32;
        }
        long j18 = (((long) iArr[6]) & M) + 1 + j15;
        iArr[6] = (int) j18;
        iArr[7] = (int) (((M & ((long) iArr[7])) - 1) + (j18 >> 32));
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat256.sub(iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(16, iArr, iArr2, iArr3) != 0) {
            Nat.addTo(16, PExt, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && Nat256.gte(iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        Nat256.mul(iArr, iArr2, iArr4);
        reduce(iArr4, iArr3);
    }

    public static void square(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat256.square(iArr, iArr3);
        reduce(iArr3, iArr2);
    }

    public static void squareN(int[] iArr, int i11, int[] iArr2, int[] iArr3) {
        Nat256.square(iArr, iArr3);
        while (true) {
            reduce(iArr3, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                Nat256.square(iArr2, iArr3);
            }
        }
    }
}
