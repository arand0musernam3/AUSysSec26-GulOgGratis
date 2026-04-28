package org.bouncycastle.math.raw;

import i4.a;
import j4.s;
import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Nat256 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j9 = (((long) iArr[i11]) & M) + (((long) iArr2[i12]) & M);
        iArr3[i13] = (int) j9;
        long j11 = (((long) iArr[i11 + 1]) & M) + (((long) iArr2[i12 + 1]) & M) + (j9 >>> 32);
        iArr3[i13 + 1] = (int) j11;
        long j12 = (((long) iArr[i11 + 2]) & M) + (((long) iArr2[i12 + 2]) & M) + (j11 >>> 32);
        iArr3[i13 + 2] = (int) j12;
        long j13 = (((long) iArr[i11 + 3]) & M) + (((long) iArr2[i12 + 3]) & M) + (j12 >>> 32);
        iArr3[i13 + 3] = (int) j13;
        long j14 = (((long) iArr[i11 + 4]) & M) + (((long) iArr2[i12 + 4]) & M) + (j13 >>> 32);
        iArr3[i13 + 4] = (int) j14;
        long j15 = (((long) iArr[i11 + 5]) & M) + (((long) iArr2[i12 + 5]) & M) + (j14 >>> 32);
        iArr3[i13 + 5] = (int) j15;
        long j16 = (((long) iArr[i11 + 6]) & M) + (((long) iArr2[i12 + 6]) & M) + (j15 >>> 32);
        iArr3[i13 + 6] = (int) j16;
        long j17 = (((long) iArr[i11 + 7]) & M) + (((long) iArr2[i12 + 7]) & M) + (j16 >>> 32);
        iArr3[i13 + 7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j9 = (((long) iArr[i11]) & M) + (((long) iArr2[i12]) & M) + (((long) iArr3[i13]) & M);
        iArr3[i13] = (int) j9;
        int i14 = i13 + 1;
        long j11 = (((long) iArr[i11 + 1]) & M) + (((long) iArr2[i12 + 1]) & M) + (((long) iArr3[i14]) & M) + (j9 >>> 32);
        iArr3[i14] = (int) j11;
        int i15 = i13 + 2;
        long j12 = (((long) iArr[i11 + 2]) & M) + (((long) iArr2[i12 + 2]) & M) + (((long) iArr3[i15]) & M) + (j11 >>> 32);
        iArr3[i15] = (int) j12;
        int i16 = i13 + 3;
        long j13 = (((long) iArr[i11 + 3]) & M) + (((long) iArr2[i12 + 3]) & M) + (((long) iArr3[i16]) & M) + (j12 >>> 32);
        iArr3[i16] = (int) j13;
        int i17 = i13 + 4;
        long j14 = (((long) iArr[i11 + 4]) & M) + (((long) iArr2[i12 + 4]) & M) + (((long) iArr3[i17]) & M) + (j13 >>> 32);
        iArr3[i17] = (int) j14;
        int i18 = i13 + 5;
        long j15 = (((long) iArr[i11 + 5]) & M) + (((long) iArr2[i12 + 5]) & M) + (((long) iArr3[i18]) & M) + (j14 >>> 32);
        iArr3[i18] = (int) j15;
        int i19 = i13 + 6;
        long j16 = (((long) iArr[i11 + 6]) & M) + (((long) iArr2[i12 + 6]) & M) + (((long) iArr3[i19]) & M) + (j15 >>> 32);
        iArr3[i19] = (int) j16;
        int i21 = i13 + 7;
        long j17 = (((long) iArr[i11 + 7]) & M) + (((long) iArr2[i12 + 7]) & M) + (((long) iArr3[i21]) & M) + (j16 >>> 32);
        iArr3[i21] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j13 = (((long) iArr[i11 + 3]) & M) + (((long) iArr2[i16]) & M) + (j12 >>> 32);
        iArr2[i16] = (int) j13;
        int i17 = i12 + 4;
        long j14 = (((long) iArr[i11 + 4]) & M) + (((long) iArr2[i17]) & M) + (j13 >>> 32);
        iArr2[i17] = (int) j14;
        int i18 = i12 + 5;
        long j15 = (((long) iArr[i11 + 5]) & M) + (((long) iArr2[i18]) & M) + (j14 >>> 32);
        iArr2[i18] = (int) j15;
        int i19 = i12 + 6;
        long j16 = (((long) iArr[i11 + 6]) & M) + (((long) iArr2[i19]) & M) + (j15 >>> 32);
        iArr2[i19] = (int) j16;
        int i21 = i12 + 7;
        long j17 = (((long) iArr[i11 + 7]) & M) + (M & ((long) iArr2[i21])) + (j16 >>> 32);
        iArr2[i21] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j13 = (((long) iArr[i21]) & M) + (((long) iArr2[i22]) & M) + (j12 >>> 32);
        int i23 = (int) j13;
        iArr[i21] = i23;
        iArr2[i22] = i23;
        int i24 = i11 + 4;
        int i25 = i12 + 4;
        long j14 = (((long) iArr[i24]) & M) + (((long) iArr2[i25]) & M) + (j13 >>> 32);
        int i26 = (int) j14;
        iArr[i24] = i26;
        iArr2[i25] = i26;
        int i27 = i11 + 5;
        int i28 = i12 + 5;
        long j15 = (((long) iArr[i27]) & M) + (((long) iArr2[i28]) & M) + (j14 >>> 32);
        int i29 = (int) j15;
        iArr[i27] = i29;
        iArr2[i28] = i29;
        int i31 = i11 + 6;
        int i32 = i12 + 6;
        long j16 = (((long) iArr[i31]) & M) + (((long) iArr2[i32]) & M) + (j15 >>> 32);
        int i33 = (int) j16;
        iArr[i31] = i33;
        iArr2[i32] = i33;
        int i34 = i11 + 7;
        int i35 = i12 + 7;
        long j17 = (((long) iArr[i34]) & M) + (M & ((long) iArr2[i35])) + (j16 >>> 32);
        int i36 = (int) j17;
        iArr[i34] = i36;
        iArr2[i35] = i36;
        return (int) (j17 >>> 32);
    }

    public static void copy(int[] iArr, int i11, int[] iArr2, int i12) {
        iArr2[i12] = iArr[i11];
        iArr2[i12 + 1] = iArr[i11 + 1];
        iArr2[i12 + 2] = iArr[i11 + 2];
        iArr2[i12 + 3] = iArr[i11 + 3];
        iArr2[i12 + 4] = iArr[i11 + 4];
        iArr2[i12 + 5] = iArr[i11 + 5];
        iArr2[i12 + 6] = iArr[i11 + 6];
        iArr2[i12 + 7] = iArr[i11 + 7];
    }

    public static void copy64(long[] jArr, int i11, long[] jArr2, int i12) {
        jArr2[i12] = jArr[i11];
        jArr2[i12 + 1] = jArr[i11 + 1];
        jArr2[i12 + 2] = jArr[i11 + 2];
        jArr2[i12 + 3] = jArr[i11 + 3];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static long[] createExt64() {
        return new long[8];
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
        for (int i11 = 7; i11 >= 0; i11--) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i11 = 3; i11 >= 0; i11--) {
            if (jArr[i11] != jArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            a.h();
            return null;
        }
        int[] iArrCreate = create();
        for (int i11 = 0; i11 < 8; i11++) {
            iArrCreate[i11] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            a.h();
            return null;
        }
        long[] jArrCreate64 = create64();
        for (int i11 = 0; i11 < 4; i11++) {
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
            if ((i11 & 255) != i11) {
                return 0;
            }
            i12 = iArr[i11 >>> 5] >>> (i11 & 31);
        }
        return i12 & 1;
    }

    public static boolean gte(int[] iArr, int i11, int[] iArr2, int i12) {
        for (int i13 = 7; i13 >= 0; i13--) {
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
        for (int i11 = 1; i11 < 8; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i11 = 1; i11 < 4; i11++) {
            if (jArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i11 = 0; i11 < 8; i11++) {
            if (iArr[i11] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i11 = 0; i11 < 4; i11++) {
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
        long j14 = ((long) iArr2[i12 + 4]) & M;
        long j15 = ((long) iArr2[i12 + 5]) & M;
        long j16 = ((long) iArr2[i12 + 6]) & M;
        long j17 = ((long) iArr2[i12 + 7]) & M;
        long j18 = ((long) iArr[i11]) & M;
        long j19 = j18 * j9;
        iArr3[i13] = (int) j19;
        long j21 = (j18 * j11) + (j19 >>> 32);
        iArr3[i13 + 1] = (int) j21;
        long j22 = (j18 * j12) + (j21 >>> 32);
        iArr3[i13 + 2] = (int) j22;
        long j23 = (j18 * j13) + (j22 >>> 32);
        iArr3[i13 + 3] = (int) j23;
        long j24 = (j18 * j14) + (j23 >>> 32);
        iArr3[i13 + 4] = (int) j24;
        long j25 = (j18 * j15) + (j24 >>> 32);
        iArr3[i13 + 5] = (int) j25;
        long j26 = (j18 * j16) + (j25 >>> 32);
        iArr3[i13 + 6] = (int) j26;
        long j27 = (j18 * j17) + (j26 >>> 32);
        iArr3[i13 + 7] = (int) j27;
        iArr3[i13 + 8] = (int) (j27 >>> 32);
        int i14 = 1;
        int i15 = i13;
        while (i14 < 8) {
            int i16 = i15 + 1;
            int i17 = i15;
            long j28 = ((long) iArr[i11 + i14]) & M;
            long j29 = (j28 * j9) + (((long) iArr3[i16]) & M);
            iArr3[i16] = (int) j29;
            int i18 = i17 + 2;
            long j31 = (j28 * j11) + (((long) iArr3[i18]) & M) + (j29 >>> 32);
            iArr3[i18] = (int) j31;
            int i19 = i17 + 3;
            long j32 = (j28 * j12) + (((long) iArr3[i19]) & M) + (j31 >>> 32);
            iArr3[i19] = (int) j32;
            int i21 = i17 + 4;
            long j33 = (j28 * j13) + (((long) iArr3[i21]) & M) + (j32 >>> 32);
            iArr3[i21] = (int) j33;
            int i22 = i17 + 5;
            long j34 = (j28 * j14) + (((long) iArr3[i22]) & M) + (j33 >>> 32);
            iArr3[i22] = (int) j34;
            int i23 = i17 + 6;
            long j35 = (j28 * j15) + (((long) iArr3[i23]) & M) + (j34 >>> 32);
            iArr3[i23] = (int) j35;
            int i24 = i17 + 7;
            long j36 = (j28 * j16) + (((long) iArr3[i24]) & M) + (j35 >>> 32);
            iArr3[i24] = (int) j36;
            int i25 = i17 + 8;
            long j37 = (j28 * j17) + (((long) iArr3[i25]) & M) + (j36 >>> 32);
            iArr3[i25] = (int) j37;
            iArr3[i17 + 9] = (int) (j37 >>> 32);
            i14++;
            i15 = i16;
        }
    }

    public static void mul128(int[] iArr, int[] iArr2, int[] iArr3) {
        long j9 = ((long) iArr[0]) & M;
        long j11 = ((long) iArr[1]) & M;
        long j12 = ((long) iArr[2]) & M;
        long j13 = ((long) iArr[3]) & M;
        long j14 = ((long) iArr[4]) & M;
        long j15 = ((long) iArr[5]) & M;
        long j16 = ((long) iArr[6]) & M;
        long j17 = ((long) iArr[7]) & M;
        long j18 = ((long) iArr2[0]) & M;
        long j19 = j18 * j9;
        iArr3[0] = (int) j19;
        long j21 = (j18 * j11) + (j19 >>> 32);
        iArr3[1] = (int) j21;
        long j22 = (j18 * j12) + (j21 >>> 32);
        iArr3[2] = (int) j22;
        long j23 = (j18 * j13) + (j22 >>> 32);
        iArr3[3] = (int) j23;
        long j24 = (j18 * j14) + (j23 >>> 32);
        iArr3[4] = (int) j24;
        long j25 = (j18 * j15) + (j24 >>> 32);
        iArr3[5] = (int) j25;
        long j26 = (j18 * j16) + (j25 >>> 32);
        iArr3[6] = (int) j26;
        long j27 = (j18 * j17) + (j26 >>> 32);
        iArr3[7] = (int) j27;
        iArr3[8] = (int) (j27 >>> 32);
        int i11 = 1;
        for (int i12 = 4; i11 < i12; i12 = 4) {
            long j28 = ((long) iArr2[i11]) & M;
            long j29 = j14;
            long j31 = (j28 * j9) + (((long) iArr3[i11]) & M);
            iArr3[i11] = (int) j31;
            int i13 = i11 + 1;
            long j32 = (j28 * j11) + (((long) iArr3[i13]) & M) + (j31 >>> 32);
            iArr3[i13] = (int) j32;
            int i14 = i11 + 2;
            long j33 = (j28 * j12) + (((long) iArr3[i14]) & M) + (j32 >>> 32);
            iArr3[i14] = (int) j33;
            int i15 = i11 + 3;
            long j34 = (j28 * j13) + (((long) iArr3[i15]) & M) + (j33 >>> 32);
            iArr3[i15] = (int) j34;
            int i16 = i11 + 4;
            long j35 = (j28 * j29) + (((long) iArr3[i16]) & M) + (j34 >>> 32);
            iArr3[i16] = (int) j35;
            int i17 = i11 + 5;
            long j36 = (j28 * j15) + (((long) iArr3[i17]) & M) + (j35 >>> 32);
            iArr3[i17] = (int) j36;
            int i18 = i11 + 6;
            long j37 = (j28 * j16) + (((long) iArr3[i18]) & M) + (j36 >>> 32);
            iArr3[i18] = (int) j37;
            long j38 = j37 >>> 32;
            int i19 = i11 + 7;
            long j39 = (j28 * j17) + (((long) iArr3[i19]) & M) + j38;
            iArr3[i19] = (int) j39;
            iArr3[i11 + 8] = (int) (j39 >>> 32);
            i11 = i13;
            j14 = j29;
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
        long j18 = (j9 * j17) + j15 + (((long) iArr2[i13 + 3]) & M) + (j16 >>> 32);
        iArr3[i14 + 3] = (int) j18;
        long j19 = ((long) iArr[i12 + 4]) & M;
        long j21 = (j9 * j19) + j17 + (((long) iArr2[i13 + 4]) & M) + (j18 >>> 32);
        iArr3[i14 + 4] = (int) j21;
        long j22 = ((long) iArr[i12 + 5]) & M;
        long j23 = (j9 * j22) + j19 + (((long) iArr2[i13 + 5]) & M) + (j21 >>> 32);
        iArr3[i14 + 5] = (int) j23;
        long j24 = ((long) iArr[i12 + 6]) & M;
        long j25 = (j9 * j24) + j22 + (((long) iArr2[i13 + 6]) & M) + (j23 >>> 32);
        iArr3[i14 + 6] = (int) j25;
        long j26 = ((long) iArr[i12 + 7]) & M;
        long j27 = (j9 * j26) + j24 + (M & ((long) iArr2[i13 + 7])) + (j25 >>> 32);
        iArr3[i14 + 7] = (int) j27;
        return (j27 >>> 32) + j26;
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
        if ((j18 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i12, 4);
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
        return Nat.incAt(8, iArr, i13, 3);
    }

    public static int mulAddTo(int[] iArr, int i11, int[] iArr2, int i12, int[] iArr3, int i13) {
        long j9 = ((long) iArr2[i12]) & M;
        long j11 = ((long) iArr2[i12 + 1]) & M;
        long j12 = ((long) iArr2[i12 + 2]) & M;
        long j13 = ((long) iArr2[i12 + 3]) & M;
        long j14 = ((long) iArr2[i12 + 4]) & M;
        long j15 = ((long) iArr2[i12 + 5]) & M;
        long j16 = ((long) iArr2[i12 + 6]) & M;
        long j17 = ((long) iArr2[i12 + 7]) & M;
        int i14 = i13;
        int i15 = 0;
        long j18 = 0;
        while (i15 < 8) {
            long j19 = j11;
            long j21 = ((long) iArr[i11 + i15]) & M;
            long j22 = (j21 * j9) + (((long) iArr3[i14]) & M);
            iArr3[i14] = (int) j22;
            int i16 = i14 + 1;
            long j23 = (j21 * j19) + (((long) iArr3[i16]) & M) + (j22 >>> 32);
            iArr3[i16] = (int) j23;
            int i17 = i14 + 2;
            int i18 = i15;
            long j24 = (j21 * j12) + (((long) iArr3[i17]) & M) + (j23 >>> 32);
            iArr3[i17] = (int) j24;
            int i19 = i14 + 3;
            long j25 = (j21 * j13) + (((long) iArr3[i19]) & M) + (j24 >>> 32);
            iArr3[i19] = (int) j25;
            int i21 = i14 + 4;
            long j26 = (j21 * j14) + (((long) iArr3[i21]) & M) + (j25 >>> 32);
            iArr3[i21] = (int) j26;
            int i22 = i14 + 5;
            long j27 = (j21 * j15) + (((long) iArr3[i22]) & M) + (j26 >>> 32);
            iArr3[i22] = (int) j27;
            int i23 = i14 + 6;
            long j28 = (j21 * j16) + (((long) iArr3[i23]) & M) + (j27 >>> 32);
            iArr3[i23] = (int) j28;
            int i24 = i14 + 7;
            long j29 = (j21 * j17) + (((long) iArr3[i24]) & M) + (j28 >>> 32);
            iArr3[i24] = (int) j29;
            int i25 = i14 + 8;
            long j31 = (j29 >>> 32) + (((long) iArr3[i25]) & M) + j18;
            iArr3[i25] = (int) j31;
            j18 = j31 >>> 32;
            i15 = i18 + 1;
            j11 = j19;
            i14 = i16;
        }
        return (int) j18;
    }

    public static int mulByWord(int i11, int[] iArr) {
        long j9 = ((long) i11) & M;
        long j11 = (((long) iArr[0]) & M) * j9;
        iArr[0] = (int) j11;
        long j12 = ((((long) iArr[1]) & M) * j9) + (j11 >>> 32);
        iArr[1] = (int) j12;
        long j13 = ((((long) iArr[2]) & M) * j9) + (j12 >>> 32);
        iArr[2] = (int) j13;
        long j14 = ((((long) iArr[3]) & M) * j9) + (j13 >>> 32);
        iArr[3] = (int) j14;
        long j15 = ((((long) iArr[4]) & M) * j9) + (j14 >>> 32);
        iArr[4] = (int) j15;
        long j16 = ((((long) iArr[5]) & M) * j9) + (j15 >>> 32);
        iArr[5] = (int) j16;
        long j17 = ((((long) iArr[6]) & M) * j9) + (j16 >>> 32);
        iArr[6] = (int) j17;
        long j18 = (j9 * (M & ((long) iArr[7]))) + (j17 >>> 32);
        iArr[7] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static int mulByWordAddTo(int i11, int[] iArr, int[] iArr2) {
        long j9 = ((long) i11) & M;
        long j11 = ((((long) iArr2[0]) & M) * j9) + (((long) iArr[0]) & M);
        iArr2[0] = (int) j11;
        long j12 = ((((long) iArr2[1]) & M) * j9) + (((long) iArr[1]) & M) + (j11 >>> 32);
        iArr2[1] = (int) j12;
        long j13 = ((((long) iArr2[2]) & M) * j9) + (((long) iArr[2]) & M) + (j12 >>> 32);
        iArr2[2] = (int) j13;
        long j14 = ((((long) iArr2[3]) & M) * j9) + (((long) iArr[3]) & M) + (j13 >>> 32);
        iArr2[3] = (int) j14;
        long j15 = ((((long) iArr2[4]) & M) * j9) + (((long) iArr[4]) & M) + (j14 >>> 32);
        iArr2[4] = (int) j15;
        long j16 = ((((long) iArr2[5]) & M) * j9) + (((long) iArr[5]) & M) + (j15 >>> 32);
        iArr2[5] = (int) j16;
        long j17 = ((((long) iArr2[6]) & M) * j9) + (((long) iArr[6]) & M) + (j16 >>> 32);
        iArr2[6] = (int) j17;
        long j18 = (j9 * (((long) iArr2[7]) & M)) + (M & ((long) iArr[7])) + (j17 >>> 32);
        iArr2[7] = (int) j18;
        return (int) (j18 >>> 32);
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
        } while (i13 < 8);
        return (int) j11;
    }

    public static int mulWordAddTo(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
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
        long j14 = ((((long) iArr[i12 + 3]) & M) * j9) + (((long) iArr2[i16]) & M) + (j13 >>> 32);
        iArr2[i16] = (int) j14;
        int i17 = i13 + 4;
        long j15 = ((((long) iArr[i12 + 4]) & M) * j9) + (((long) iArr2[i17]) & M) + (j14 >>> 32);
        iArr2[i17] = (int) j15;
        int i18 = i13 + 5;
        long j16 = ((((long) iArr[i12 + 5]) & M) * j9) + (((long) iArr2[i18]) & M) + (j15 >>> 32);
        iArr2[i18] = (int) j16;
        int i19 = i13 + 6;
        long j17 = ((((long) iArr[i12 + 6]) & M) * j9) + (((long) iArr2[i19]) & M) + (j16 >>> 32);
        iArr2[i19] = (int) j17;
        int i21 = i13 + 7;
        long j18 = (j9 * (((long) iArr[i12 + 7]) & M)) + (((long) iArr2[i21]) & M) + (j17 >>> 32);
        iArr2[i21] = (int) j18;
        return (int) (j18 >>> 32);
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
        return Nat.incAt(8, iArr, i12, 3);
    }

    public static void square(int[] iArr, int i11, int[] iArr2, int i12) {
        long j9 = ((long) iArr[i11]) & M;
        int i13 = 0;
        int i14 = 16;
        int i15 = 7;
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
                long j32 = (j26 * j9) + j25;
                int i26 = (int) j32;
                iArr2[i21] = (i23 >>> 31) | (i26 << 1);
                long jC2 = s.c(j26, j15, j32 >>> 32, j28);
                long jC3 = s.c(j26, j19, jC2 >>> 32, j31);
                long j33 = jC2 & M;
                long j34 = j29 + (jC3 >>> 32);
                long j35 = jC3 & M;
                long j36 = ((long) iArr[i11 + 4]) & M;
                int i27 = i12 + 7;
                long j37 = (((long) iArr2[i27]) & M) + (j34 >>> 32);
                long j38 = j34 & M;
                int i28 = i12 + 8;
                long j39 = (((long) iArr2[i28]) & M) + (j37 >>> 32);
                long j41 = j37 & M;
                long j42 = (j36 * j9) + j33;
                int i29 = (int) j42;
                iArr2[i22] = (i26 >>> 31) | (i29 << 1);
                int i31 = i29 >>> 31;
                long jC4 = s.c(j36, j15, j42 >>> 32, j35);
                long jC5 = s.c(j36, j19, jC4 >>> 32, j38);
                long j43 = jC4 & M;
                long jC6 = s.c(j36, j26, jC5 >>> 32, j41);
                long j44 = jC5 & M;
                long j45 = j39 + (jC6 >>> 32);
                long j46 = jC6 & M;
                long j47 = ((long) iArr[i11 + 5]) & M;
                int i32 = i12 + 9;
                long j48 = (((long) iArr2[i32]) & M) + (j45 >>> 32);
                long j49 = j45 & M;
                int i33 = i12 + 10;
                long j51 = (((long) iArr2[i33]) & M) + (j48 >>> 32);
                long j52 = j48 & M;
                long j53 = (j47 * j9) + j43;
                int i34 = (int) j53;
                iArr2[i24] = i31 | (i34 << 1);
                int i35 = i34 >>> 31;
                long jC7 = s.c(j47, j15, j53 >>> 32, j44);
                long jC8 = s.c(j47, j19, jC7 >>> 32, j46);
                long j54 = jC7 & M;
                long jC9 = s.c(j47, j26, jC8 >>> 32, j49);
                long j55 = jC8 & M;
                long jC10 = s.c(j47, j36, jC9 >>> 32, j52);
                long j56 = jC9 & M;
                long j57 = j51 + (jC10 >>> 32);
                long j58 = jC10 & M;
                long j59 = ((long) iArr[i11 + 6]) & M;
                int i36 = i12 + 11;
                long j61 = (((long) iArr2[i36]) & M) + (j57 >>> 32);
                long j62 = j57 & M;
                int i37 = i12 + 12;
                long j63 = (((long) iArr2[i37]) & M) + (j61 >>> 32);
                long j64 = j61 & M;
                long j65 = (j59 * j9) + j54;
                int i38 = (int) j65;
                iArr2[i25] = (i38 << 1) | i35;
                int i39 = i38 >>> 31;
                long jC11 = s.c(j59, j15, j65 >>> 32, j55);
                long jC12 = s.c(j59, j19, jC11 >>> 32, j56);
                long j66 = jC11 & M;
                long jC13 = s.c(j59, j26, jC12 >>> 32, j58);
                long j67 = jC12 & M;
                long jC14 = s.c(j59, j36, jC13 >>> 32, j62);
                long j68 = jC13 & M;
                long jC15 = s.c(j59, j47, jC14 >>> 32, j64);
                long j69 = jC14 & M;
                long j71 = j63 + (jC15 >>> 32);
                long j72 = jC15 & M;
                long j73 = ((long) iArr[i11 + 7]) & M;
                int i41 = i12 + 13;
                long j74 = (((long) iArr2[i41]) & M) + (j71 >>> 32);
                long j75 = j71 & M;
                int i42 = i12 + 14;
                long j76 = (((long) iArr2[i42]) & M) + (j74 >>> 32);
                long j77 = j74 & M;
                long j78 = (j73 * j9) + j66;
                int i43 = (int) j78;
                iArr2[i27] = (i43 << 1) | i39;
                int i44 = i43 >>> 31;
                long jC16 = s.c(j73, j15, j78 >>> 32, j67);
                long jC17 = s.c(j73, j19, jC16 >>> 32, j68);
                long jC18 = s.c(j73, j26, jC17 >>> 32, j69);
                long jC19 = s.c(j73, j36, jC18 >>> 32, j72);
                long jC20 = s.c(j73, j47, jC19 >>> 32, j75);
                long jC21 = s.c(j73, j59, jC20 >>> 32, j77);
                long j79 = j76 + (jC21 >>> 32);
                int i45 = (int) jC16;
                iArr2[i28] = (i45 << 1) | i44;
                int i46 = (int) jC17;
                iArr2[i32] = (i45 >>> 31) | (i46 << 1);
                int i47 = i46 >>> 31;
                int i48 = (int) jC18;
                iArr2[i33] = i47 | (i48 << 1);
                int i49 = i48 >>> 31;
                int i51 = (int) jC19;
                iArr2[i36] = i49 | (i51 << 1);
                int i52 = i51 >>> 31;
                int i53 = (int) jC20;
                iArr2[i37] = i52 | (i53 << 1);
                int i54 = i53 >>> 31;
                int i55 = (int) jC21;
                iArr2[i41] = i54 | (i55 << 1);
                int i56 = i55 >>> 31;
                int i57 = (int) j79;
                iArr2[i42] = i56 | (i57 << 1);
                int i58 = i57 >>> 31;
                int i59 = i12 + 15;
                iArr2[i59] = i58 | ((iArr2[i59] + ((int) (j79 >>> 32))) << 1);
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
        long j14 = ((((long) iArr[i11 + 4]) & M) - (((long) iArr2[i12 + 4]) & M)) + (j13 >> 32);
        iArr3[i13 + 4] = (int) j14;
        long j15 = ((((long) iArr[i11 + 5]) & M) - (((long) iArr2[i12 + 5]) & M)) + (j14 >> 32);
        iArr3[i13 + 5] = (int) j15;
        long j16 = ((((long) iArr[i11 + 6]) & M) - (((long) iArr2[i12 + 6]) & M)) + (j15 >> 32);
        iArr3[i13 + 6] = (int) j16;
        long j17 = ((((long) iArr[i11 + 7]) & M) - (((long) iArr2[i12 + 7]) & M)) + (j16 >> 32);
        iArr3[i13 + 7] = (int) j17;
        return (int) (j17 >> 32);
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
        long j14 = (((((long) iArr3[4]) & M) - (((long) iArr[4]) & M)) - (((long) iArr2[4]) & M)) + (j13 >> 32);
        iArr3[4] = (int) j14;
        long j15 = (((((long) iArr3[5]) & M) - (((long) iArr[5]) & M)) - (((long) iArr2[5]) & M)) + (j14 >> 32);
        iArr3[5] = (int) j15;
        long j16 = (((((long) iArr3[6]) & M) - (((long) iArr[6]) & M)) - (((long) iArr2[6]) & M)) + (j15 >> 32);
        iArr3[6] = (int) j16;
        long j17 = (((((long) iArr3[7]) & M) - (((long) iArr[7]) & M)) - (((long) iArr2[7]) & M)) + (j16 >> 32);
        iArr3[7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int subFrom(int[] iArr, int i11, int[] iArr2, int i12, int i13) {
        long j9 = ((((long) iArr2[i12]) & M) - (((long) iArr[i11]) & M)) + (((long) i13) & M);
        iArr2[i12] = (int) j9;
        long j11 = j9 >> 32;
        int i14 = i12 + 1;
        long j12 = ((((long) iArr2[i14]) & M) - (((long) iArr[i11 + 1]) & M)) + j11;
        iArr2[i14] = (int) j12;
        int i15 = i12 + 2;
        long j13 = ((((long) iArr2[i15]) & M) - (((long) iArr[i11 + 2]) & M)) + (j12 >> 32);
        iArr2[i15] = (int) j13;
        int i16 = i12 + 3;
        long j14 = ((((long) iArr2[i16]) & M) - (((long) iArr[i11 + 3]) & M)) + (j13 >> 32);
        iArr2[i16] = (int) j14;
        int i17 = i12 + 4;
        long j15 = ((((long) iArr2[i17]) & M) - (((long) iArr[i11 + 4]) & M)) + (j14 >> 32);
        iArr2[i17] = (int) j15;
        int i18 = i12 + 5;
        long j16 = ((((long) iArr2[i18]) & M) - (((long) iArr[i11 + 5]) & M)) + (j15 >> 32);
        iArr2[i18] = (int) j16;
        int i19 = i12 + 6;
        long j17 = ((((long) iArr2[i19]) & M) - (((long) iArr[i11 + 6]) & M)) + (j16 >> 32);
        iArr2[i19] = (int) j17;
        int i21 = i12 + 7;
        long j18 = ((((long) iArr2[i21]) & M) - (((long) iArr[i11 + 7]) & M)) + (j17 >> 32);
        iArr2[i21] = (int) j18;
        return (int) (j18 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = iArr[i11];
            if (i12 != 0) {
                Pack.intToBigEndian(i12, bArr, (7 - i11) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i11 = 0; i11 < 4; i11++) {
            long j9 = jArr[i11];
            if (j9 != 0) {
                Pack.longToBigEndian(j9, bArr, (3 - i11) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i11 = 7; i11 >= 0; i11--) {
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

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j9 = (((long) iArr[0]) & M) + (((long) iArr2[0]) & M);
        iArr2[0] = (int) j9;
        long j11 = (((long) iArr[1]) & M) + (((long) iArr2[1]) & M) + (j9 >>> 32);
        iArr2[1] = (int) j11;
        long j12 = (((long) iArr[2]) & M) + (((long) iArr2[2]) & M) + (j11 >>> 32);
        iArr2[2] = (int) j12;
        long j13 = (((long) iArr[3]) & M) + (((long) iArr2[3]) & M) + (j12 >>> 32);
        iArr2[3] = (int) j13;
        long j14 = (((long) iArr[4]) & M) + (((long) iArr2[4]) & M) + (j13 >>> 32);
        iArr2[4] = (int) j14;
        long j15 = (((long) iArr[5]) & M) + (((long) iArr2[5]) & M) + (j14 >>> 32);
        iArr2[5] = (int) j15;
        long j16 = (((long) iArr[6]) & M) + (((long) iArr2[6]) & M) + (j15 >>> 32);
        iArr2[6] = (int) j16;
        long j17 = (((long) iArr[7]) & M) + (M & ((long) iArr2[7])) + (j16 >>> 32);
        iArr2[7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2, int i11) {
        long j9 = (((long) iArr[0]) & M) + (((long) iArr2[0]) & M) + (((long) i11) & M);
        iArr2[0] = (int) j9;
        long j11 = (((long) iArr[1]) & M) + (((long) iArr2[1]) & M) + (j9 >>> 32);
        iArr2[1] = (int) j11;
        long j12 = (((long) iArr[2]) & M) + (((long) iArr2[2]) & M) + (j11 >>> 32);
        iArr2[2] = (int) j12;
        long j13 = (((long) iArr[3]) & M) + (((long) iArr2[3]) & M) + (j12 >>> 32);
        iArr2[3] = (int) j13;
        long j14 = (((long) iArr[4]) & M) + (((long) iArr2[4]) & M) + (j13 >>> 32);
        iArr2[4] = (int) j14;
        long j15 = (((long) iArr[5]) & M) + (((long) iArr2[5]) & M) + (j14 >>> 32);
        iArr2[5] = (int) j15;
        long j16 = (((long) iArr[6]) & M) + (((long) iArr2[6]) & M) + (j15 >>> 32);
        iArr2[6] = (int) j16;
        long j17 = (((long) iArr[7]) & M) + (M & ((long) iArr2[7])) + (j16 >>> 32);
        iArr2[7] = (int) j17;
        return (int) (j17 >>> 32);
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
        int i16 = i12 + 4;
        long j14 = ((((long) iArr2[i16]) & M) - (((long) iArr[i11 + 4]) & M)) + (j13 >> 32);
        iArr2[i16] = (int) j14;
        int i17 = i12 + 5;
        long j15 = ((((long) iArr2[i17]) & M) - (((long) iArr[i11 + 5]) & M)) + (j14 >> 32);
        iArr2[i17] = (int) j15;
        int i18 = i12 + 6;
        long j16 = ((((long) iArr2[i18]) & M) - (((long) iArr[i11 + 6]) & M)) + (j15 >> 32);
        iArr2[i18] = (int) j16;
        int i19 = i12 + 7;
        long j17 = ((((long) iArr2[i19]) & M) - (((long) iArr[i11 + 7]) & M)) + (j16 >> 32);
        iArr2[i19] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j9 = (((long) iArr2[0]) & M) - (((long) iArr[0]) & M);
        iArr2[0] = (int) j9;
        long j11 = ((((long) iArr2[1]) & M) - (((long) iArr[1]) & M)) + (j9 >> 32);
        iArr2[1] = (int) j11;
        long j12 = ((((long) iArr2[2]) & M) - (((long) iArr[2]) & M)) + (j11 >> 32);
        iArr2[2] = (int) j12;
        long j13 = ((((long) iArr2[3]) & M) - (((long) iArr[3]) & M)) + (j12 >> 32);
        iArr2[3] = (int) j13;
        long j14 = ((((long) iArr2[4]) & M) - (((long) iArr[4]) & M)) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = ((((long) iArr2[5]) & M) - (((long) iArr[5]) & M)) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = ((((long) iArr2[6]) & M) - (((long) iArr[6]) & M)) + (j15 >> 32);
        iArr2[6] = (int) j16;
        long j17 = ((((long) iArr2[7]) & M) - (M & ((long) iArr[7]))) + (j16 >> 32);
        iArr2[7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2, int i11) {
        long j9 = ((((long) iArr2[0]) & M) - (((long) iArr[0]) & M)) + (((long) i11) & M);
        iArr2[0] = (int) j9;
        long j11 = ((((long) iArr2[1]) & M) - (((long) iArr[1]) & M)) + (j9 >> 32);
        iArr2[1] = (int) j11;
        long j12 = ((((long) iArr2[2]) & M) - (((long) iArr[2]) & M)) + (j11 >> 32);
        iArr2[2] = (int) j12;
        long j13 = ((((long) iArr2[3]) & M) - (((long) iArr[3]) & M)) + (j12 >> 32);
        iArr2[3] = (int) j13;
        long j14 = ((((long) iArr2[4]) & M) - (((long) iArr[4]) & M)) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = ((((long) iArr2[5]) & M) - (((long) iArr[5]) & M)) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = ((((long) iArr2[6]) & M) - (((long) iArr[6]) & M)) + (j15 >> 32);
        iArr2[6] = (int) j16;
        long j17 = ((((long) iArr2[7]) & M) - (M & ((long) iArr[7]))) + (j16 >> 32);
        iArr2[7] = (int) j17;
        return (int) (j17 >> 32);
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j9 = (((long) iArr[0]) & M) + (((long) iArr2[0]) & M);
        iArr3[0] = (int) j9;
        long j11 = (((long) iArr[1]) & M) + (((long) iArr2[1]) & M) + (j9 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & M) + (((long) iArr2[2]) & M) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & M) + (((long) iArr2[3]) & M) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (((long) iArr[4]) & M) + (((long) iArr2[4]) & M) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (((long) iArr[5]) & M) + (((long) iArr2[5]) & M) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (((long) iArr[6]) & M) + (((long) iArr2[6]) & M) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (((long) iArr[7]) & M) + (((long) iArr2[7]) & M) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        return (int) (j17 >>> 32);
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
        long j14 = ((((long) iArr[4]) & M) - (((long) iArr2[4]) & M)) + (j13 >> 32);
        iArr3[4] = (int) j14;
        long j15 = ((((long) iArr[5]) & M) - (((long) iArr2[5]) & M)) + (j14 >> 32);
        iArr3[5] = (int) j15;
        long j16 = ((((long) iArr[6]) & M) - (((long) iArr2[6]) & M)) + (j15 >> 32);
        iArr3[6] = (int) j16;
        long j17 = ((((long) iArr[7]) & M) - (((long) iArr2[7]) & M)) + (j16 >> 32);
        iArr3[7] = (int) j17;
        return (int) (j17 >> 32);
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
        long j14 = (((long) iArr[4]) & M) + (((long) iArr2[4]) & M) + (((long) iArr3[4]) & M) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (((long) iArr[5]) & M) + (((long) iArr2[5]) & M) + (((long) iArr3[5]) & M) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (((long) iArr[6]) & M) + (((long) iArr2[6]) & M) + (((long) iArr3[6]) & M) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (((long) iArr[7]) & M) + (((long) iArr2[7]) & M) + (((long) iArr3[7]) & M) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        return (int) (j17 >>> 32);
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j9 = ((long) iArr2[0]) & M;
        long j11 = ((long) iArr2[1]) & M;
        long j12 = ((long) iArr2[2]) & M;
        long j13 = ((long) iArr2[3]) & M;
        long j14 = ((long) iArr2[4]) & M;
        long j15 = ((long) iArr2[5]) & M;
        long j16 = ((long) iArr2[6]) & M;
        long j17 = ((long) iArr2[7]) & M;
        long j18 = 0;
        int i11 = 0;
        while (i11 < 8) {
            long j19 = ((long) iArr[i11]) & M;
            long j21 = (j19 * j9) + (((long) iArr3[i11]) & M);
            int i12 = i11;
            iArr3[i12] = (int) j21;
            int i13 = i12 + 1;
            long j22 = (j19 * j11) + (((long) iArr3[i13]) & M) + (j21 >>> 32);
            iArr3[i13] = (int) j22;
            int i14 = i12 + 2;
            long j23 = (j19 * j12) + (((long) iArr3[i14]) & M) + (j22 >>> 32);
            iArr3[i14] = (int) j23;
            int i15 = i12 + 3;
            long j24 = (j19 * j13) + (((long) iArr3[i15]) & M) + (j23 >>> 32);
            iArr3[i15] = (int) j24;
            int i16 = i12 + 4;
            long j25 = (j19 * j14) + (((long) iArr3[i16]) & M) + (j24 >>> 32);
            iArr3[i16] = (int) j25;
            int i17 = i12 + 5;
            long j26 = (j19 * j15) + (((long) iArr3[i17]) & M) + (j25 >>> 32);
            iArr3[i17] = (int) j26;
            int i18 = i12 + 6;
            long j27 = (j19 * j16) + (((long) iArr3[i18]) & M) + (j26 >>> 32);
            iArr3[i18] = (int) j27;
            int i19 = i12 + 7;
            long j28 = (j19 * j17) + (((long) iArr3[i19]) & M) + (j27 >>> 32);
            iArr3[i19] = (int) j28;
            int i21 = i12 + 8;
            long j29 = (j28 >>> 32) + (((long) iArr3[i21]) & M) + j18;
            iArr3[i21] = (int) j29;
            j18 = j29 >>> 32;
            i11 = i13;
        }
        return (int) j18;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j9 = ((long) iArr2[0]) & M;
        long j11 = ((long) iArr2[1]) & M;
        long j12 = ((long) iArr2[2]) & M;
        long j13 = ((long) iArr2[3]) & M;
        long j14 = ((long) iArr2[4]) & M;
        long j15 = ((long) iArr2[5]) & M;
        long j16 = ((long) iArr2[6]) & M;
        long j17 = ((long) iArr2[7]) & M;
        long j18 = ((long) iArr[0]) & M;
        long j19 = j18 * j9;
        iArr3[0] = (int) j19;
        long j21 = (j18 * j11) + (j19 >>> 32);
        iArr3[1] = (int) j21;
        long j22 = (j18 * j12) + (j21 >>> 32);
        iArr3[2] = (int) j22;
        long j23 = (j18 * j13) + (j22 >>> 32);
        iArr3[3] = (int) j23;
        long j24 = (j18 * j14) + (j23 >>> 32);
        iArr3[4] = (int) j24;
        long j25 = (j18 * j15) + (j24 >>> 32);
        iArr3[5] = (int) j25;
        long j26 = (j18 * j16) + (j25 >>> 32);
        iArr3[6] = (int) j26;
        long j27 = (j18 * j17) + (j26 >>> 32);
        iArr3[7] = (int) j27;
        int i11 = (int) (j27 >>> 32);
        iArr3[8] = i11;
        int i12 = 1;
        for (int i13 = 8; i12 < i13; i13 = 8) {
            long j28 = ((long) iArr[i12]) & M;
            long j29 = j14;
            long j31 = (j28 * j9) + (((long) iArr3[i12]) & M);
            iArr3[i12] = (int) j31;
            int i14 = i12 + 1;
            long j32 = (j28 * j11) + (((long) iArr3[i14]) & M) + (j31 >>> 32);
            iArr3[i14] = (int) j32;
            int i15 = i12 + 2;
            long j33 = (j28 * j12) + (((long) iArr3[i15]) & M) + (j32 >>> 32);
            iArr3[i15] = (int) j33;
            int i16 = i12 + 3;
            long j34 = (j28 * j13) + (((long) iArr3[i16]) & M) + (j33 >>> 32);
            iArr3[i16] = (int) j34;
            int i17 = i12 + 4;
            long j35 = (j28 * j29) + (((long) iArr3[i17]) & M) + (j34 >>> 32);
            iArr3[i17] = (int) j35;
            int i18 = i12 + 5;
            long j36 = (j28 * j15) + (((long) iArr3[i18]) & M) + (j35 >>> 32);
            iArr3[i18] = (int) j36;
            int i19 = i12 + 6;
            long j37 = (j28 * j16) + (((long) iArr3[i19]) & M) + (j36 >>> 32);
            iArr3[i19] = (int) j37;
            long j38 = j37 >>> 32;
            int i21 = i12 + 7;
            long j39 = (j28 * j17) + (((long) iArr3[i21]) & M) + j38;
            iArr3[i21] = (int) j39;
            iArr3[i12 + 8] = (int) (j39 >>> 32);
            i12 = i14;
            j14 = j29;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j9 = ((long) iArr[0]) & M;
        int i11 = 16;
        int i12 = 0;
        int i13 = 7;
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
                long j18 = ((long) iArr[2]) & M;
                long j19 = ((long) iArr2[3]) & M;
                long j21 = ((long) iArr2[4]) & M;
                long j22 = (j18 * j9) + j16 + (j17 >>> 32);
                int i17 = (int) j22;
                iArr2[2] = (i17 << 1) | (i16 >>> 31);
                long jC = s.c(j18, j15, j22 >>> 32, j19);
                long j23 = j21 + (jC >>> 32);
                long j24 = jC & M;
                long j25 = ((long) iArr[3]) & M;
                long j26 = (((long) iArr2[5]) & M) + (j23 >>> 32);
                long j27 = j23 & M;
                long j28 = (((long) iArr2[6]) & M) + (j26 >>> 32);
                long j29 = j26 & M;
                long j31 = (j25 * j9) + j24;
                int i18 = (int) j31;
                iArr2[3] = (i17 >>> 31) | (i18 << 1);
                int i19 = i18 >>> 31;
                long jC2 = s.c(j25, j15, j31 >>> 32, j27);
                long jC3 = s.c(j25, j18, jC2 >>> 32, j29);
                long j32 = jC2 & M;
                long j33 = j28 + (jC3 >>> 32);
                long j34 = jC3 & M;
                long j35 = ((long) iArr[4]) & M;
                long j36 = (((long) iArr2[7]) & M) + (j33 >>> 32);
                long j37 = j33 & M;
                long j38 = (((long) iArr2[8]) & M) + (j36 >>> 32);
                long j39 = j36 & M;
                long j41 = (j35 * j9) + j32;
                int i21 = (int) j41;
                iArr2[4] = i19 | (i21 << 1);
                long jC4 = s.c(j35, j15, j41 >>> 32, j34);
                long jC5 = s.c(j35, j18, jC4 >>> 32, j37);
                long j42 = jC4 & M;
                long jC6 = s.c(j35, j25, jC5 >>> 32, j39);
                long j43 = jC5 & M;
                long j44 = j38 + (jC6 >>> 32);
                long j45 = jC6 & M;
                long j46 = ((long) iArr[5]) & M;
                long j47 = (((long) iArr2[9]) & M) + (j44 >>> 32);
                long j48 = j44 & M;
                long j49 = (((long) iArr2[10]) & M) + (j47 >>> 32);
                long j51 = j47 & M;
                long j52 = (j46 * j9) + j42;
                int i22 = (int) j52;
                iArr2[5] = (i21 >>> 31) | (i22 << 1);
                int i23 = i22 >>> 31;
                long jC7 = s.c(j46, j15, j52 >>> 32, j43);
                long jC8 = s.c(j46, j18, jC7 >>> 32, j45);
                long j53 = jC7 & M;
                long jC9 = s.c(j46, j25, jC8 >>> 32, j48);
                long j54 = jC8 & M;
                long jC10 = s.c(j46, j35, jC9 >>> 32, j51);
                long j55 = jC9 & M;
                long j56 = j49 + (jC10 >>> 32);
                long j57 = jC10 & M;
                long j58 = ((long) iArr[6]) & M;
                long j59 = (((long) iArr2[11]) & M) + (j56 >>> 32);
                long j61 = j56 & M;
                long j62 = (((long) iArr2[12]) & M) + (j59 >>> 32);
                long j63 = j59 & M;
                long j64 = (j58 * j9) + j53;
                int i24 = (int) j64;
                iArr2[6] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                long jC11 = s.c(j58, j15, j64 >>> 32, j54);
                long jC12 = s.c(j58, j18, jC11 >>> 32, j55);
                long j65 = jC11 & M;
                long jC13 = s.c(j58, j25, jC12 >>> 32, j57);
                long j66 = jC12 & M;
                long jC14 = s.c(j58, j35, jC13 >>> 32, j61);
                long j67 = jC13 & M;
                long jC15 = s.c(j58, j46, jC14 >>> 32, j63);
                long j68 = jC14 & M;
                long j69 = j62 + (jC15 >>> 32);
                long j71 = jC15 & M;
                long j72 = ((long) iArr[7]) & M;
                long j73 = (((long) iArr2[13]) & M) + (j69 >>> 32);
                long j74 = j69 & M;
                long j75 = (((long) iArr2[14]) & M) + (j73 >>> 32);
                long j76 = j73 & M;
                long j77 = (j72 * j9) + j65;
                int i26 = (int) j77;
                iArr2[7] = (i26 << 1) | i25;
                int i27 = i26 >>> 31;
                long jC16 = s.c(j72, j15, j77 >>> 32, j66);
                long jC17 = s.c(j72, j18, jC16 >>> 32, j67);
                long jC18 = s.c(j72, j25, jC17 >>> 32, j68);
                long jC19 = s.c(j72, j35, jC18 >>> 32, j71);
                long jC20 = s.c(j72, j46, jC19 >>> 32, j74);
                long jC21 = s.c(j72, j58, jC20 >>> 32, j76);
                long j78 = j75 + (jC21 >>> 32);
                int i28 = (int) jC16;
                iArr2[8] = (i28 << 1) | i27;
                int i29 = (int) jC17;
                iArr2[9] = (i28 >>> 31) | (i29 << 1);
                int i31 = i29 >>> 31;
                int i32 = (int) jC18;
                iArr2[10] = i31 | (i32 << 1);
                int i33 = i32 >>> 31;
                int i34 = (int) jC19;
                iArr2[11] = i33 | (i34 << 1);
                int i35 = i34 >>> 31;
                int i36 = (int) jC20;
                iArr2[12] = i35 | (i36 << 1);
                int i37 = i36 >>> 31;
                int i38 = (int) jC21;
                iArr2[13] = i37 | (i38 << 1);
                int i39 = i38 >>> 31;
                int i41 = (int) j78;
                iArr2[14] = i39 | (i41 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j78 >>> 32))) << 1) | (i41 >>> 31);
                return;
            }
            i13 = i14;
        }
    }
}
