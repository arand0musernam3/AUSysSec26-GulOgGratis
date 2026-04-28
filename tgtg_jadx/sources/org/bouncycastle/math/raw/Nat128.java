package org.bouncycastle.math.raw;

import i4.a;
import j4.s;
import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Nat128 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j9 = (((long) iArr[0]) & M) + (((long) iArr2[0]) & M);
        iArr3[0] = (int) j9;
        long j11 = (((long) iArr[1]) & M) + (((long) iArr2[1]) & M) + (j9 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & M) + (((long) iArr2[2]) & M) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & M) + (((long) iArr2[3]) & M) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j9 = (((long) iArr[0]) & M) + (((long) iArr2[0]) & M) + (((long) iArr3[0]) & M);
        iArr3[0] = (int) j9;
        long j11 = (((long) iArr[1]) & M) + (((long) iArr2[1]) & M) + (((long) iArr3[1]) & M) + (j9 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & M) + (((long) iArr2[2]) & M) + (((long) iArr3[2]) & M) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & M) + (((long) iArr2[3]) & M) + (((long) iArr3[3]) & M) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static int addTo(int[] iArr, int i11, int[] iArr2, int i12, int i13) {
        long j9 = (((long) iArr[i11]) & M) + (((long) iArr2[i12]) & M) + (((long) i13) & M);
        iArr2[i12] = (int) j9;
        int i14 = i12 + 1;
        long j11 = (((long) iArr[i11 + 1]) & M) + (((long) iArr2[i14]) & M) + (j9 >>> 32);
        iArr2[i14] = (int) j11;
        int i15 = i12 + 2;
        long j12 = (((long) iArr[i11 + 2]) & M) + (((long) iArr2[i15]) & M) + (j11 >>> 32);
        iArr2[i15] = (int) j12;
        int i16 = i12 + 3;
        long j13 = (((long) iArr[i11 + 3]) & M) + (M & ((long) iArr2[i16])) + (j12 >>> 32);
        iArr2[i16] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i11, int[] iArr2, int i12) {
        long j9 = (((long) iArr[i11]) & M) + (((long) iArr2[i12]) & M);
        int i13 = (int) j9;
        iArr[i11] = i13;
        iArr2[i12] = i13;
        int i14 = i11 + 1;
        int i15 = i12 + 1;
        long j11 = (((long) iArr[i14]) & M) + (((long) iArr2[i15]) & M) + (j9 >>> 32);
        int i16 = (int) j11;
        iArr[i14] = i16;
        iArr2[i15] = i16;
        int i17 = i11 + 2;
        int i18 = i12 + 2;
        long j12 = (((long) iArr[i17]) & M) + (((long) iArr2[i18]) & M) + (j11 >>> 32);
        int i19 = (int) j12;
        iArr[i17] = i19;
        iArr2[i18] = i19;
        int i21 = i11 + 3;
        int i22 = i12 + 3;
        long j13 = (((long) iArr[i21]) & M) + (M & ((long) iArr2[i22])) + (j12 >>> 32);
        int i23 = (int) j13;
        iArr[i21] = i23;
        iArr2[i22] = i23;
        return (int) (j13 >>> 32);
    }

    public static void copy(int[] iArr, int i11, int[] iArr2, int i12) {
        iArr2[i12] = iArr[i11];
        iArr2[i12 + 1] = iArr[i11 + 1];
        iArr2[i12 + 2] = iArr[i11 + 2];
        iArr2[i12 + 3] = iArr[i11 + 3];
    }

    public static void copy64(long[] jArr, int i11, long[] jArr2, int i12) {
        jArr2[i12] = jArr[i11];
        jArr2[i12 + 1] = jArr[i11 + 1];
    }

    public static int[] create() {
        return new int[4];
    }

    public static long[] create64() {
        return new long[2];
    }

    public static int[] createExt() {
        return new int[8];
    }

    public static long[] createExt64() {
        return new long[4];
    }

    public static boolean diff(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        boolean zGte = gte(iArr, i11, iArr2, i12);
        if (zGte) {
            sub(iArr, i11, iArr2, i12, iArr3, i13);
            return zGte;
        }
        sub(iArr2, i12, iArr, i11, iArr3, i13);
        return zGte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i11 = 3; i11 >= 0; i11--) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i11 = 1; i11 >= 0; i11--) {
            if (jArr[i11] != jArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            a.h();
            return null;
        }
        int[] iArrCreate = create();
        for (int i11 = 0; i11 < 4; i11++) {
            iArrCreate[i11] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            a.h();
            return null;
        }
        long[] jArrCreate64 = create64();
        for (int i11 = 0; i11 < 2; i11++) {
            jArrCreate64[i11] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return jArrCreate64;
    }

    public static int getBit(int[] iArr, int i11) {
        int i12;
        if (i11 == 0) {
            i12 = iArr[0];
        } else {
            int i13 = i11 >> 5;
            if (i13 < 0 || i13 >= 4) {
                return 0;
            }
            i12 = iArr[i13] >>> (i11 & 31);
        }
        return i12 & 1;
    }

    public static boolean gte(int[] iArr, int i11, int[] iArr2, int i12) {
        for (int i13 = 3; i13 >= 0; i13--) {
            int i14 = iArr[i11 + i13] ^ Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE ^ iArr2[i12 + i13];
            if (i14 < i15) {
                return false;
            }
            if (i14 > i15) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i11 = 1; i11 < 4; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        return jArr[0] == 1 && jArr[1] == 0;
    }

    public static boolean isZero(int[] iArr) {
        for (int i11 = 0; i11 < 4; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i11 = 0; i11 < 2; i11++) {
            if (jArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j9 = ((long) iArr2[i12]) & M;
        long j11 = ((long) iArr2[i12 + 1]) & M;
        long j12 = ((long) iArr2[i12 + 2]) & M;
        long j13 = ((long) iArr2[i12 + 3]) & M;
        long j14 = ((long) iArr[i11]) & M;
        long j15 = j14 * j9;
        iArr3[i13] = (int) j15;
        char c3 = ' ';
        long j16 = (j15 >>> 32) + (j14 * j11);
        iArr3[i13 + 1] = (int) j16;
        long j17 = (j14 * j12) + (j16 >>> 32);
        iArr3[i13 + 2] = (int) j17;
        long j18 = (j14 * j13) + (j17 >>> 32);
        iArr3[i13 + 3] = (int) j18;
        iArr3[i13 + 4] = (int) (j18 >>> 32);
        int i14 = 1;
        int i15 = i13;
        while (i14 < 4) {
            int i16 = i15 + 1;
            long j19 = ((long) iArr[i11 + i14]) & M;
            char c7 = c3;
            long j21 = (j19 * j9) + (((long) iArr3[i16]) & M);
            iArr3[i16] = (int) j21;
            int i17 = i15 + 2;
            long j22 = j9;
            long j23 = (j19 * j11) + (((long) iArr3[i17]) & M) + (j21 >>> c7);
            iArr3[i17] = (int) j23;
            int i18 = i15 + 3;
            long j24 = (j19 * j12) + (((long) iArr3[i18]) & M) + (j23 >>> c7);
            iArr3[i18] = (int) j24;
            long j25 = j24 >>> c7;
            int i19 = i15 + 4;
            long j26 = (j19 * j13) + (((long) iArr3[i19]) & M) + j25;
            iArr3[i19] = (int) j26;
            iArr3[i15 + 5] = (int) (j26 >>> c7);
            i14++;
            c3 = c7;
            i15 = i16;
            j9 = j22;
        }
    }

    public static long mul33Add(int i11, int[] iArr, int i12, int[] iArr2, int i13, int[] iArr3, int i14) {
        long j9 = ((long) i11) & M;
        long j11 = ((long) iArr[i12]) & M;
        long j12 = (j9 * j11) + (((long) iArr2[i13]) & M);
        iArr3[i14] = (int) j12;
        long j13 = ((long) iArr[i12 + 1]) & M;
        long j14 = (j9 * j13) + j11 + (((long) iArr2[i13 + 1]) & M) + (j12 >>> 32);
        iArr3[i14 + 1] = (int) j14;
        long j15 = ((long) iArr[i12 + 2]) & M;
        long j16 = (j9 * j15) + j13 + (((long) iArr2[i13 + 2]) & M) + (j14 >>> 32);
        iArr3[i14 + 2] = (int) j16;
        long j17 = ((long) iArr[i12 + 3]) & M;
        long j18 = (j9 * j17) + j15 + (M & ((long) iArr2[i13 + 3])) + (j16 >>> 32);
        iArr3[i14 + 3] = (int) j18;
        return (j18 >>> 32) + j17;
    }

    public static int mul33DWordAdd(int i11, long j9, int[] iArr, int i12) {
        long j11 = ((long) i11) & M;
        long j12 = j9 & M;
        long j13 = (j11 * j12) + (((long) iArr[i12]) & M);
        iArr[i12] = (int) j13;
        long j14 = j9 >>> 32;
        long j15 = (j11 * j14) + j12;
        int i13 = i12 + 1;
        long j16 = j15 + (((long) iArr[i13]) & M) + (j13 >>> 32);
        iArr[i13] = (int) j16;
        int i14 = i12 + 2;
        long j17 = j14 + (((long) iArr[i14]) & M) + (j16 >>> 32);
        iArr[i14] = (int) j17;
        int i15 = i12 + 3;
        long j18 = (j17 >>> 32) + (((long) iArr[i15]) & M);
        iArr[i15] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static int mul33WordAdd(int i11, int i12, int[] iArr, int i13) {
        long j9 = ((long) i11) & M;
        long j11 = ((long) i12) & M;
        long j12 = (j9 * j11) + (((long) iArr[i13]) & M);
        iArr[i13] = (int) j12;
        int i14 = i13 + 1;
        long j13 = j11 + (((long) iArr[i14]) & M) + (j12 >>> 32);
        iArr[i14] = (int) j13;
        int i15 = i13 + 2;
        long j14 = (j13 >>> 32) + (((long) iArr[i15]) & M);
        iArr[i15] = (int) j14;
        if ((j14 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i13, 3);
    }

    public static int mulAddTo(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j9 = iArr2[i12];
        long j11 = M;
        long j12 = j9 & M;
        long j13 = ((long) iArr2[i12 + 1]) & M;
        long j14 = ((long) iArr2[i12 + 2]) & M;
        long j15 = ((long) iArr2[i12 + 3]) & M;
        int i14 = 0;
        long j16 = 0;
        while (true) {
            int i15 = i13;
            if (i14 >= 4) {
                return (int) j16;
            }
            long j17 = j11;
            long j18 = ((long) iArr[i11 + i14]) & j17;
            long j19 = (j18 * j12) + (((long) iArr3[i15]) & j17);
            long j21 = j12;
            iArr3[i15] = (int) j19;
            int i16 = i15 + 1;
            i13 = i16;
            long j22 = (j18 * j13) + (((long) iArr3[i16]) & j17) + (j19 >>> 32);
            iArr3[i13] = (int) j22;
            int i17 = i15 + 2;
            long j23 = (j18 * j14) + (((long) iArr3[i17]) & j17) + (j22 >>> 32);
            iArr3[i17] = (int) j23;
            long j24 = j23 >>> 32;
            int i18 = i15 + 3;
            long j25 = (j18 * j15) + (((long) iArr3[i18]) & j17) + j24;
            iArr3[i18] = (int) j25;
            int i19 = i15 + 4;
            long j26 = (j25 >>> 32) + (((long) iArr3[i19]) & j17) + j16;
            iArr3[i19] = (int) j26;
            j16 = j26 >>> 32;
            i14++;
            j11 = j17;
            j12 = j21;
        }
    }

    public static int mulWord(int i11, int[] iArr, int[] iArr2, int i12) {
        long j9 = ((long) i11) & M;
        long j11 = 0;
        int i13 = 0;
        do {
            long j12 = ((((long) iArr[i13]) & M) * j9) + j11;
            iArr2[i12 + i13] = (int) j12;
            j11 = j12 >>> 32;
            i13++;
        } while (i13 < 4);
        return (int) j11;
    }

    public static int mulWordAddExt(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        long j9 = ((long) i11) & M;
        long j11 = ((((long) iArr[i12]) & M) * j9) + (((long) iArr2[i13]) & M);
        iArr2[i13] = (int) j11;
        int i14 = i13 + 1;
        long j12 = ((((long) iArr[i12 + 1]) & M) * j9) + (((long) iArr2[i14]) & M) + (j11 >>> 32);
        iArr2[i14] = (int) j12;
        int i15 = i13 + 2;
        long j13 = ((((long) iArr[i12 + 2]) & M) * j9) + (((long) iArr2[i15]) & M) + (j12 >>> 32);
        iArr2[i15] = (int) j13;
        int i16 = i13 + 3;
        long j14 = (j9 * (((long) iArr[i12 + 3]) & M)) + (((long) iArr2[i16]) & M) + (j13 >>> 32);
        iArr2[i16] = (int) j14;
        return (int) (j14 >>> 32);
    }

    public static int mulWordDwordAdd(int i11, long j9, int[] iArr, int i12) {
        long j11 = ((long) i11) & M;
        long j12 = ((j9 & M) * j11) + (((long) iArr[i12]) & M);
        iArr[i12] = (int) j12;
        long j13 = j11 * (j9 >>> 32);
        int i13 = i12 + 1;
        long j14 = j13 + (((long) iArr[i13]) & M) + (j12 >>> 32);
        iArr[i13] = (int) j14;
        long j15 = j14 >>> 32;
        int i14 = i12 + 2;
        long j16 = j15 + (((long) iArr[i14]) & M);
        iArr[i14] = (int) j16;
        if ((j16 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i12, 3);
    }

    public static int mulWordsAdd(int i11, int i12, int[] iArr, int i13) {
        long j9 = ((((long) i12) & M) * (((long) i11) & M)) + (((long) iArr[i13]) & M);
        iArr[i13] = (int) j9;
        int i14 = i13 + 1;
        long j11 = (j9 >>> 32) + (M & ((long) iArr[i14]));
        iArr[i14] = (int) j11;
        if ((j11 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(4, iArr, i13, 2);
    }

    public static void square(int[] iArr, int i11, int[] iArr2, int i12) {
        long j9 = ((long) iArr[i11]) & M;
        int i13 = 0;
        int i14 = 8;
        int i15 = 3;
        while (true) {
            int i16 = i15 - 1;
            long j11 = ((long) iArr[i11 + i15]) & M;
            long j12 = j11 * j11;
            iArr2[(i14 - 1) + i12] = (i13 << 31) | ((int) (j12 >>> 33));
            i14 -= 2;
            iArr2[i12 + i14] = (int) (j12 >>> 1);
            i13 = (int) j12;
            if (i16 <= 0) {
                long j13 = j9 * j9;
                long j14 = (j13 >>> 33) | (((long) (i13 << 31)) & M);
                iArr2[i12] = (int) j13;
                int i17 = ((int) (j13 >>> 32)) & 1;
                long j15 = ((long) iArr[i11 + 1]) & M;
                int i18 = i12 + 2;
                long j16 = ((long) iArr2[i18]) & M;
                long j17 = (j15 * j9) + j14;
                int i19 = (int) j17;
                iArr2[i12 + 1] = (i19 << 1) | i17;
                long j18 = j16 + (j17 >>> 32);
                long j19 = ((long) iArr[i11 + 2]) & M;
                int i21 = i12 + 3;
                long j21 = ((long) iArr2[i21]) & M;
                int i22 = i12 + 4;
                long j22 = ((long) iArr2[i22]) & M;
                long j23 = (j19 * j9) + j18;
                int i23 = (int) j23;
                iArr2[i18] = (i23 << 1) | (i19 >>> 31);
                long jC = s.c(j19, j15, j23 >>> 32, j21);
                long j24 = j22 + (jC >>> 32);
                long j25 = jC & M;
                long j26 = ((long) iArr[i11 + 3]) & M;
                int i24 = i12 + 5;
                long j27 = (((long) iArr2[i24]) & M) + (j24 >>> 32);
                long j28 = j24 & M;
                int i25 = i12 + 6;
                long j29 = (((long) iArr2[i25]) & M) + (j27 >>> 32);
                long j31 = j27 & M;
                long j32 = (j9 * j26) + j25;
                int i26 = (int) j32;
                iArr2[i21] = (i23 >>> 31) | (i26 << 1);
                long jC2 = s.c(j26, j15, j32 >>> 32, j28);
                long jC3 = s.c(j26, j19, jC2 >>> 32, j31);
                long j33 = j29 + (jC3 >>> 32);
                int i27 = (int) jC2;
                iArr2[i22] = (i26 >>> 31) | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) jC3;
                iArr2[i24] = i28 | (i29 << 1);
                int i31 = i29 >>> 31;
                int i32 = (int) j33;
                iArr2[i25] = i31 | (i32 << 1);
                int i33 = i12 + 7;
                iArr2[i33] = ((iArr2[i33] + ((int) (j33 >>> 32))) << 1) | (i32 >>> 31);
                return;
            }
            i15 = i16;
        }
    }

    public static int sub(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j9 = (((long) iArr[i11]) & M) - (((long) iArr2[i12]) & M);
        iArr3[i13] = (int) j9;
        long j11 = ((((long) iArr[i11 + 1]) & M) - (((long) iArr2[i12 + 1]) & M)) + (j9 >> 32);
        iArr3[i13 + 1] = (int) j11;
        long j12 = ((((long) iArr[i11 + 2]) & M) - (((long) iArr2[i12 + 2]) & M)) + (j11 >> 32);
        iArr3[i13 + 2] = (int) j12;
        long j13 = ((((long) iArr[i11 + 3]) & M) - (((long) iArr2[i12 + 3]) & M)) + (j12 >> 32);
        iArr3[i13 + 3] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j9 = ((((long) iArr3[0]) & M) - (((long) iArr[0]) & M)) - (((long) iArr2[0]) & M);
        iArr3[0] = (int) j9;
        long j11 = (((((long) iArr3[1]) & M) - (((long) iArr[1]) & M)) - (((long) iArr2[1]) & M)) + (j9 >> 32);
        iArr3[1] = (int) j11;
        long j12 = (((((long) iArr3[2]) & M) - (((long) iArr[2]) & M)) - (((long) iArr2[2]) & M)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = (((((long) iArr3[3]) & M) - (((long) iArr[3]) & M)) - (((long) iArr2[3]) & M)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static int subFrom(int[] iArr, int i11, int[] iArr2, int i12) {
        long j9 = (((long) iArr2[i12]) & M) - (((long) iArr[i11]) & M);
        iArr2[i12] = (int) j9;
        int i13 = i12 + 1;
        long j11 = ((((long) iArr2[i13]) & M) - (((long) iArr[i11 + 1]) & M)) + (j9 >> 32);
        iArr2[i13] = (int) j11;
        int i14 = i12 + 2;
        long j12 = ((((long) iArr2[i14]) & M) - (((long) iArr[i11 + 2]) & M)) + (j11 >> 32);
        iArr2[i14] = (int) j12;
        int i15 = i12 + 3;
        long j13 = ((((long) iArr2[i15]) & M) - (((long) iArr[i11 + 3]) & M)) + (j12 >> 32);
        iArr2[i15] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                Pack.intToBigEndian(i12, bArr, (3 - i11) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i11 = 0; i11 < 2; i11++) {
            long j9 = jArr[i11];
            if (j9 != 0) {
                Pack.longToBigEndian(j9, bArr, (1 - i11) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i11 = 3; i11 >= 0; i11--) {
            int i12 = iArr[i11] ^ Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE ^ iArr2[i11];
            if (i12 < i13) {
                return false;
            }
            if (i12 > i13) {
                return true;
            }
        }
        return true;
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j9 = (((long) iArr2[0]) & M) - (((long) iArr[0]) & M);
        iArr2[0] = (int) j9;
        long j11 = ((((long) iArr2[1]) & M) - (((long) iArr[1]) & M)) + (j9 >> 32);
        iArr2[1] = (int) j11;
        long j12 = ((((long) iArr2[2]) & M) - (((long) iArr[2]) & M)) + (j11 >> 32);
        iArr2[2] = (int) j12;
        long j13 = ((((long) iArr2[3]) & M) - (M & ((long) iArr[3]))) + (j12 >> 32);
        iArr2[3] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j9 = (((long) iArr[0]) & M) + (((long) iArr2[0]) & M);
        iArr2[0] = (int) j9;
        long j11 = (((long) iArr[1]) & M) + (((long) iArr2[1]) & M) + (j9 >>> 32);
        iArr2[1] = (int) j11;
        long j12 = (((long) iArr[2]) & M) + (((long) iArr2[2]) & M) + (j11 >>> 32);
        iArr2[2] = (int) j12;
        long j13 = (((long) iArr[3]) & M) + (M & ((long) iArr2[3])) + (j12 >>> 32);
        iArr2[3] = (int) j13;
        return (int) (j13 >>> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j9 = (((long) iArr[0]) & M) - (((long) iArr2[0]) & M);
        iArr3[0] = (int) j9;
        long j11 = ((((long) iArr[1]) & M) - (((long) iArr2[1]) & M)) + (j9 >> 32);
        iArr3[1] = (int) j11;
        long j12 = ((((long) iArr[2]) & M) - (((long) iArr2[2]) & M)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = ((((long) iArr[3]) & M) - (((long) iArr2[3]) & M)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        return (int) (j13 >> 32);
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11 = 0;
        long j9 = iArr2[0];
        long j11 = M;
        long j12 = j9 & M;
        long j13 = ((long) iArr2[1]) & M;
        long j14 = ((long) iArr2[2]) & M;
        long j15 = ((long) iArr2[3]) & M;
        long j16 = 0;
        while (i11 < 4) {
            long j17 = ((long) iArr[i11]) & j11;
            long j18 = j11;
            long j19 = (((long) iArr3[i11]) & j18) + (j17 * j12);
            iArr3[i11] = (int) j19;
            int i12 = i11 + 1;
            int i13 = i11;
            long j21 = (j17 * j13) + (((long) iArr3[i12]) & j18) + (j19 >>> 32);
            iArr3[i12] = (int) j21;
            int i14 = i13 + 2;
            long j22 = (j17 * j14) + (((long) iArr3[i14]) & j18) + (j21 >>> 32);
            iArr3[i14] = (int) j22;
            long j23 = j22 >>> 32;
            int i15 = i13 + 3;
            long j24 = (j17 * j15) + (((long) iArr3[i15]) & j18) + j23;
            iArr3[i15] = (int) j24;
            int i16 = i13 + 4;
            long j25 = (j24 >>> 32) + (((long) iArr3[i16]) & j18) + j16;
            iArr3[i16] = (int) j25;
            j16 = j25 >>> 32;
            i11 = i12;
            j11 = j18;
            j12 = j12;
        }
        return (int) j16;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j9 = iArr2[0];
        long j11 = M;
        long j12 = j9 & M;
        int i11 = 1;
        long j13 = ((long) iArr2[1]) & M;
        long j14 = ((long) iArr2[2]) & M;
        long j15 = ((long) iArr2[3]) & M;
        long j16 = ((long) iArr[0]) & M;
        long j17 = j16 * j12;
        iArr3[0] = (int) j17;
        long j18 = (j16 * j13) + (j17 >>> 32);
        iArr3[1] = (int) j18;
        long j19 = (j16 * j14) + (j18 >>> 32);
        iArr3[2] = (int) j19;
        long j21 = (j16 * j15) + (j19 >>> 32);
        iArr3[3] = (int) j21;
        iArr3[4] = (int) (j21 >>> 32);
        for (int i12 = 4; i11 < i12; i12 = 4) {
            long j22 = ((long) iArr[i11]) & j11;
            long j23 = (j22 * j12) + (((long) iArr3[i11]) & j11);
            iArr3[i11] = (int) j23;
            int i13 = i11 + 1;
            long j24 = j11;
            long j25 = (j22 * j13) + (((long) iArr3[i13]) & j24) + (j23 >>> 32);
            iArr3[i13] = (int) j25;
            int i14 = i11 + 2;
            long j26 = (j22 * j14) + (((long) iArr3[i14]) & j24) + (j25 >>> 32);
            iArr3[i14] = (int) j26;
            long j27 = j26 >>> 32;
            int i15 = i11 + 3;
            long j28 = (j22 * j15) + (((long) iArr3[i15]) & j24) + j27;
            iArr3[i15] = (int) j28;
            iArr3[i11 + 4] = (int) (j28 >>> 32);
            i11 = i13;
            j11 = j24;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j9 = ((long) iArr[0]) & M;
        int i11 = 8;
        int i12 = 0;
        int i13 = 3;
        while (true) {
            int i14 = i13 - 1;
            long j11 = ((long) iArr[i13]) & M;
            long j12 = j11 * j11;
            iArr2[i11 - 1] = (i12 << 31) | ((int) (j12 >>> 33));
            i11 -= 2;
            iArr2[i11] = (int) (j12 >>> 1);
            i12 = (int) j12;
            if (i14 <= 0) {
                long j13 = j9 * j9;
                long j14 = (j13 >>> 33) | (((long) (i12 << 31)) & M);
                iArr2[0] = (int) j13;
                int i15 = ((int) (j13 >>> 32)) & 1;
                long j15 = ((long) iArr[1]) & M;
                long j16 = ((long) iArr2[2]) & M;
                long j17 = (j15 * j9) + j14;
                int i16 = (int) j17;
                iArr2[1] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                long j18 = ((long) iArr[2]) & M;
                long j19 = ((long) iArr2[3]) & M;
                long j21 = ((long) iArr2[4]) & M;
                long j22 = (j18 * j9) + j16 + (j17 >>> 32);
                int i18 = (int) j22;
                iArr2[2] = i17 | (i18 << 1);
                long jC = s.c(j18, j15, j22 >>> 32, j19);
                long j23 = j21 + (jC >>> 32);
                long j24 = jC & M;
                long j25 = ((long) iArr[3]) & M;
                long j26 = (((long) iArr2[5]) & M) + (j23 >>> 32);
                long j27 = j23 & M;
                long j28 = (((long) iArr2[6]) & M) + (j26 >>> 32);
                long j29 = j26 & M;
                long j31 = (j9 * j25) + j24;
                int i19 = (int) j31;
                iArr2[3] = (i18 >>> 31) | (i19 << 1);
                long jC2 = s.c(j25, j15, j31 >>> 32, j27);
                long jC3 = s.c(j25, j18, jC2 >>> 32, j29);
                long j32 = j28 + (jC3 >>> 32);
                long j33 = jC3 & M;
                int i21 = (int) jC2;
                iArr2[4] = (i19 >>> 31) | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) j33;
                iArr2[5] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j32;
                iArr2[6] = i24 | (i25 << 1);
                iArr2[7] = (i25 >>> 31) | ((iArr2[7] + ((int) (j32 >>> 32))) << 1);
                return;
            }
            i13 = i14;
        }
    }
}
