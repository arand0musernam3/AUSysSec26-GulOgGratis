package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat384;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class SecP384R1Field {
    private static final long M = 4294967295L;
    private static final int P11 = -1;
    private static final int PExt23 = -1;
    static final int[] P = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExt = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExtInv = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && Nat.gte(24, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j9 = (((long) iArr[0]) & M) + 1;
        iArr[0] = (int) j9;
        long j11 = ((((long) iArr[1]) & M) - 1) + (j9 >> 32);
        iArr[1] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            long j13 = j12 + (((long) iArr[2]) & M);
            iArr[2] = (int) j13;
            j12 = j13 >> 32;
        }
        long j14 = (((long) iArr[3]) & M) + 1 + j12;
        iArr[3] = (int) j14;
        long j15 = (M & ((long) iArr[4])) + 1 + (j14 >> 32);
        iArr[4] = (int) j15;
        if ((j15 >> 32) != 0) {
            Nat.incAt(12, iArr, 5);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrFromBigInteger = Nat.fromBigInteger(MLKEMEngine.KyberPolyBytes, bigInteger);
        if (iArrFromBigInteger[11] == -1) {
            int[] iArr = P;
            if (Nat.gte(12, iArrFromBigInteger, iArr)) {
                Nat.subFrom(12, iArr, iArrFromBigInteger);
            }
        }
        return iArrFromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(12, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(12, iArr2, Nat.add(12, iArr, P, iArr2));
        }
    }

    public static void inv(int[] iArr, int[] iArr2) {
        Mod.checkedModOddInverse(P, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 12; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = Nat.create(24);
        Nat384.mul(iArr, iArr2, iArrCreate);
        reduce(iArrCreate, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (isZero(iArr) == 0) {
            Nat.sub(12, P, iArr, iArr2);
        } else {
            int[] iArr3 = P;
            Nat.sub(12, iArr3, iArr3, iArr2);
        }
    }

    public static void random(SecureRandom secureRandom, int[] iArr) {
        byte[] bArr = new byte[48];
        do {
            secureRandom.nextBytes(bArr);
            Pack.littleEndianToInt(bArr, 0, iArr, 0, 12);
        } while (Nat.lessThan(12, iArr, P) == 0);
    }

    public static void randomMult(SecureRandom secureRandom, int[] iArr) {
        do {
            random(secureRandom, iArr);
        } while (isZero(iArr) != 0);
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j9 = ((long) iArr[16]) & M;
        long j11 = ((long) iArr[17]) & M;
        long j12 = ((long) iArr[18]) & M;
        long j13 = ((long) iArr[19]) & M;
        long j14 = ((long) iArr[20]) & M;
        long j15 = ((long) iArr[21]) & M;
        long j16 = ((long) iArr[22]) & M;
        long j17 = ((long) iArr[23]) & M;
        long j18 = ((((long) iArr[12]) & M) + j14) - 1;
        long j19 = (((long) iArr[13]) & M) + j16;
        long j21 = (((long) iArr[14]) & M) + j16 + j17;
        long j22 = (((long) iArr[15]) & M) + j17;
        long j23 = j11 + j15;
        long j24 = j15 - j17;
        long j25 = j16 - j17;
        long j26 = j18 + j24;
        long j27 = (((long) iArr[0]) & M) + j26;
        iArr2[0] = (int) j27;
        long j28 = (((((long) iArr[1]) & M) + j17) - j18) + j19 + (j27 >> 32);
        iArr2[1] = (int) j28;
        long j29 = (((((long) iArr[2]) & M) - j15) - j19) + j21 + (j28 >> 32);
        iArr2[2] = (int) j29;
        long j31 = ((((long) iArr[3]) & M) - j21) + j22 + j26 + (j29 >> 32);
        iArr2[3] = (int) j31;
        long j32 = (((((((long) iArr[4]) & M) + j9) + j15) + j19) - j22) + j26 + (j31 >> 32);
        iArr2[4] = (int) j32;
        long j33 = ((((long) iArr[5]) & M) - j9) + j19 + j21 + j23 + (j32 >> 32);
        iArr2[5] = (int) j33;
        long j34 = (((((long) iArr[6]) & M) + j12) - j11) + j21 + j22 + (j33 >> 32);
        iArr2[6] = (int) j34;
        long j35 = ((((((long) iArr[7]) & M) + j9) + j13) - j12) + j22 + (j34 >> 32);
        iArr2[7] = (int) j35;
        long j36 = (((((((long) iArr[8]) & M) + j9) + j11) + j14) - j13) + (j35 >> 32);
        iArr2[8] = (int) j36;
        long j37 = (((((long) iArr[9]) & M) + j12) - j14) + j23 + (j36 >> 32);
        iArr2[9] = (int) j37;
        long j38 = ((((((long) iArr[10]) & M) + j12) + j13) - j24) + j25 + (j37 >> 32);
        iArr2[10] = (int) j38;
        long j39 = ((((((long) iArr[11]) & M) + j13) + j14) - j25) + (j38 >> 32);
        iArr2[11] = (int) j39;
        reduce32((int) ((j39 >> 32) + 1), iArr2);
    }

    public static void reduce32(int i11, int[] iArr) {
        long j9;
        if (i11 != 0) {
            long j11 = ((long) i11) & M;
            long j12 = (((long) iArr[0]) & M) + j11;
            iArr[0] = (int) j12;
            long j13 = ((((long) iArr[1]) & M) - j11) + (j12 >> 32);
            iArr[1] = (int) j13;
            long j14 = j13 >> 32;
            if (j14 != 0) {
                long j15 = j14 + (((long) iArr[2]) & M);
                iArr[2] = (int) j15;
                j14 = j15 >> 32;
            }
            long j16 = (((long) iArr[3]) & M) + j11 + j14;
            iArr[3] = (int) j16;
            long j17 = (M & ((long) iArr[4])) + j11 + (j16 >> 32);
            iArr[4] = (int) j17;
            j9 = j17 >> 32;
        } else {
            j9 = 0;
        }
        if ((j9 == 0 || Nat.incAt(12, iArr, 5) == 0) && !(iArr[11] == -1 && Nat.gte(12, iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrCreate = Nat.create(24);
        Nat384.square(iArr, iArrCreate);
        reduce(iArrCreate, iArr2);
    }

    public static void squareN(int[] iArr, int i11, int[] iArr2) {
        int[] iArrCreate = Nat.create(24);
        Nat384.square(iArr, iArrCreate);
        while (true) {
            reduce(iArrCreate, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                Nat384.square(iArr2, iArrCreate);
            }
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j9 = (((long) iArr[0]) & M) - 1;
        iArr[0] = (int) j9;
        long j11 = (((long) iArr[1]) & M) + 1 + (j9 >> 32);
        iArr[1] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            long j13 = j12 + (((long) iArr[2]) & M);
            iArr[2] = (int) j13;
            j12 = j13 >> 32;
        }
        long j14 = ((((long) iArr[3]) & M) - 1) + j12;
        iArr[3] = (int) j14;
        long j15 = ((M & ((long) iArr[4])) - 1) + (j14 >> 32);
        iArr[4] = (int) j15;
        if ((j15 >> 32) != 0) {
            Nat.decAt(12, iArr, 5);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(24, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        Nat384.mul(iArr, iArr2, iArr4);
        reduce(iArr4, iArr3);
    }

    public static void square(int[] iArr, int[] iArr2, int[] iArr3) {
        Nat384.square(iArr, iArr3);
        reduce(iArr3, iArr2);
    }

    public static void squareN(int[] iArr, int i11, int[] iArr2, int[] iArr3) {
        Nat384.square(iArr, iArr3);
        while (true) {
            reduce(iArr3, iArr2);
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                Nat384.square(iArr2, iArr3);
            }
        }
    }
}
