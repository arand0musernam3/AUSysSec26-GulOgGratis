package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes3.dex */
abstract class ScalarUtil {
    private static final long M = 4294967295L;

    public static void addShifted_NP(int i11, int i12, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i13 = i11;
        int[] iArr5 = iArr3;
        char c3 = ' ';
        int i14 = 0;
        long j9 = M;
        long j11 = 0;
        if (i12 == 0) {
            long j12 = 0;
            while (i14 <= i13) {
                int i15 = iArr5[i14];
                long j13 = j11 + (((long) iArr[i14]) & M);
                long j14 = ((long) i15) & M;
                long j15 = j12 + j14 + (((long) iArr2[i14]) & M);
                int i16 = (int) j15;
                j12 = j15 >>> 32;
                iArr5[i14] = i16;
                long j16 = j13 + j14 + (((long) i16) & M);
                iArr[i14] = (int) j16;
                j11 = j16 >>> 32;
                i14++;
            }
            return;
        }
        if (i12 < 32) {
            int i17 = 0;
            long j17 = 0;
            long j18 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i14 <= i13) {
                int i21 = iArr5[i14];
                char c7 = c3;
                int i22 = -i12;
                long j19 = j9;
                long j21 = j17 + (((long) iArr[i14]) & j19) + (((long) ((i17 >>> i22) | (i21 << i12))) & j19);
                int i23 = iArr2[i14];
                long j22 = j18 + (((long) i21) & j19) + (((long) ((i23 << i12) | (i18 >>> i22))) & j19);
                int i24 = (int) j22;
                j18 = j22 >>> c7;
                iArr5[i14] = i24;
                long j23 = j21 + (((long) ((i19 >>> i22) | (i24 << i12))) & j19);
                iArr[i14] = (int) j23;
                j17 = j23 >>> c7;
                i14++;
                i18 = i23;
                i19 = i24;
                i17 = i21;
                c3 = c7;
                j9 = j19;
            }
            return;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, i13);
        int i25 = i12 >>> 5;
        int i26 = i12 & 31;
        if (i26 == 0) {
            long j24 = 0;
            for (int i27 = i25; i27 <= i13; i27++) {
                int i28 = i27 - i25;
                long j25 = j11 + (((long) iArr[i27]) & M) + (((long) iArr4[i28]) & M);
                long j26 = j24 + (((long) iArr5[i27]) & M) + (((long) iArr2[i28]) & M);
                iArr5[i27] = (int) j26;
                j24 = j26 >>> 32;
                long j27 = j25 + (((long) iArr5[i28]) & M);
                iArr[i27] = (int) j27;
                j11 = j27 >>> 32;
            }
            return;
        }
        int i29 = i25;
        int i31 = 0;
        int i32 = 0;
        long j28 = 0;
        while (i29 <= i13) {
            int i33 = i29 - i25;
            int i34 = iArr4[i33];
            int i35 = -i26;
            int i36 = i26;
            long j29 = j11 + (((long) iArr[i29]) & M) + (((long) ((i14 >>> i35) | (i34 << i26))) & M);
            int i37 = iArr2[i33];
            long j31 = j28 + (((long) iArr5[i29]) & M) + (((long) ((i37 << i36) | (i31 >>> i35))) & M);
            iArr3[i29] = (int) j31;
            j28 = j31 >>> 32;
            int i38 = iArr3[i33];
            long j32 = j29 + (((long) ((i38 << i36) | (i32 >>> i35))) & M);
            iArr[i29] = (int) j32;
            j11 = j32 >>> 32;
            i29++;
            i26 = i36;
            iArr5 = iArr3;
            i32 = i38;
            i31 = i37;
            i14 = i34;
            i13 = i11;
        }
    }

    public static void addShifted_UV(int i11, int i12, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i13 = i12 >>> 5;
        int i14 = i12 & 31;
        char c3 = ' ';
        long j9 = M;
        long j11 = 0;
        if (i14 == 0) {
            long j12 = 0;
            for (int i15 = i13; i15 <= i11; i15++) {
                long j13 = j11 + (((long) iArr[i15]) & M);
                long j14 = j12 + (((long) iArr2[i15]) & M);
                int i16 = i15 - i13;
                long j15 = j13 + (((long) iArr3[i16]) & M);
                long j16 = j14 + (((long) iArr4[i16]) & M);
                iArr[i15] = (int) j15;
                j11 = j15 >>> 32;
                iArr2[i15] = (int) j16;
                j12 = j16 >>> 32;
            }
            return;
        }
        int i17 = i13;
        int i18 = 0;
        int i19 = 0;
        long j17 = 0;
        while (i17 <= i11) {
            int i21 = i17 - i13;
            int i22 = iArr3[i21];
            int i23 = iArr4[i21];
            char c7 = c3;
            int i24 = -i14;
            long j18 = j9;
            long j19 = j11 + (((long) iArr[i17]) & j18);
            long j21 = j19 + (((long) ((i18 >>> i24) | (i22 << i14))) & j18);
            long j22 = j17 + (((long) iArr2[i17]) & j18) + (((long) ((i19 >>> i24) | (i23 << i14))) & j18);
            iArr[i17] = (int) j21;
            j11 = j21 >>> c7;
            iArr2[i17] = (int) j22;
            j17 = j22 >>> c7;
            i17++;
            c3 = c7;
            i19 = i23;
            i18 = i22;
            j9 = j18;
        }
    }

    public static int getBitLength(int i11, int[] iArr) {
        int i12 = iArr[i11] >> 31;
        while (i11 > 0 && iArr[i11] == i12) {
            i11--;
        }
        return ((i11 * 32) + 32) - Integers.numberOfLeadingZeros(iArr[i11] ^ i12);
    }

    public static int getBitLengthPositive(int i11, int[] iArr) {
        while (i11 > 0 && iArr[i11] == 0) {
            i11--;
        }
        return ((i11 * 32) + 32) - Integers.numberOfLeadingZeros(iArr[i11]);
    }

    public static boolean lessThan(int i11, int[] iArr, int[] iArr2) {
        do {
            int i12 = iArr[i11] - Integer.MIN_VALUE;
            int i13 = iArr2[i11] - Integer.MIN_VALUE;
            if (i12 < i13) {
                return true;
            }
            if (i12 > i13) {
                return false;
            }
            i11--;
        } while (i11 >= 0);
        return false;
    }

    public static void subShifted_NP(int i11, int i12, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i13 = i11;
        int[] iArr5 = iArr3;
        char c3 = ' ';
        int i14 = 0;
        long j9 = M;
        long j11 = 0;
        if (i12 == 0) {
            long j12 = 0;
            while (i14 <= i13) {
                int i15 = iArr5[i14];
                long j13 = j11 + (((long) iArr[i14]) & M);
                long j14 = ((long) i15) & M;
                long j15 = (j12 + j14) - (((long) iArr2[i14]) & M);
                int i16 = (int) j15;
                j12 = j15 >> 32;
                iArr5[i14] = i16;
                long j16 = (j13 - j14) - (((long) i16) & M);
                iArr[i14] = (int) j16;
                j11 = j16 >> 32;
                i14++;
            }
            return;
        }
        if (i12 < 32) {
            int i17 = 0;
            long j17 = 0;
            long j18 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i14 <= i13) {
                int i21 = iArr5[i14];
                char c7 = c3;
                int i22 = -i12;
                long j19 = j9;
                long j21 = (j17 + (((long) iArr[i14]) & j19)) - (((long) ((i17 >>> i22) | (i21 << i12))) & j19);
                int i23 = iArr2[i14];
                long j22 = (j18 + (((long) i21) & j19)) - (((long) ((i23 << i12) | (i18 >>> i22))) & j19);
                int i24 = (int) j22;
                j18 = j22 >> c7;
                iArr5[i14] = i24;
                long j23 = j21 - (((long) ((i19 >>> i22) | (i24 << i12))) & j19);
                iArr[i14] = (int) j23;
                j17 = j23 >> c7;
                i14++;
                i18 = i23;
                i19 = i24;
                i17 = i21;
                c3 = c7;
                j9 = j19;
            }
            return;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, i13);
        int i25 = i12 >>> 5;
        int i26 = i12 & 31;
        if (i26 == 0) {
            long j24 = 0;
            for (int i27 = i25; i27 <= i13; i27++) {
                int i28 = i27 - i25;
                long j25 = (j11 + (((long) iArr[i27]) & M)) - (((long) iArr4[i28]) & M);
                long j26 = (j24 + (((long) iArr5[i27]) & M)) - (((long) iArr2[i28]) & M);
                iArr5[i27] = (int) j26;
                j24 = j26 >> 32;
                long j27 = j25 - (((long) iArr5[i28]) & M);
                iArr[i27] = (int) j27;
                j11 = j27 >> 32;
            }
            return;
        }
        int i29 = i25;
        int i31 = 0;
        int i32 = 0;
        long j28 = 0;
        while (i29 <= i13) {
            int i33 = i29 - i25;
            int i34 = iArr4[i33];
            int i35 = -i26;
            int i36 = i26;
            long j29 = (j11 + (((long) iArr[i29]) & M)) - (((long) ((i14 >>> i35) | (i34 << i26))) & M);
            int i37 = iArr2[i33];
            long j31 = (j28 + (((long) iArr5[i29]) & M)) - (((long) ((i37 << i36) | (i31 >>> i35))) & M);
            iArr3[i29] = (int) j31;
            j28 = j31 >> 32;
            int i38 = iArr3[i33];
            long j32 = j29 - (((long) ((i38 << i36) | (i32 >>> i35))) & M);
            iArr[i29] = (int) j32;
            j11 = j32 >> 32;
            i29++;
            i26 = i36;
            iArr5 = iArr3;
            i32 = i38;
            i31 = i37;
            i14 = i34;
            i13 = i11;
        }
    }

    public static void subShifted_UV(int i11, int i12, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i13 = i12 >>> 5;
        int i14 = i12 & 31;
        char c3 = ' ';
        long j9 = M;
        long j11 = 0;
        if (i14 == 0) {
            long j12 = 0;
            for (int i15 = i13; i15 <= i11; i15++) {
                long j13 = j11 + (((long) iArr[i15]) & M);
                long j14 = j12 + (((long) iArr2[i15]) & M);
                int i16 = i15 - i13;
                long j15 = j13 - (((long) iArr3[i16]) & M);
                long j16 = j14 - (((long) iArr4[i16]) & M);
                iArr[i15] = (int) j15;
                j11 = j15 >> 32;
                iArr2[i15] = (int) j16;
                j12 = j16 >> 32;
            }
            return;
        }
        int i17 = i13;
        int i18 = 0;
        int i19 = 0;
        long j17 = 0;
        while (i17 <= i11) {
            int i21 = i17 - i13;
            int i22 = iArr3[i21];
            int i23 = iArr4[i21];
            char c7 = c3;
            int i24 = -i14;
            long j18 = j9;
            long j19 = j11 + (((long) iArr[i17]) & j18);
            long j21 = j19 - (((long) ((i18 >>> i24) | (i22 << i14))) & j18);
            long j22 = (j17 + (((long) iArr2[i17]) & j18)) - (((long) ((i19 >>> i24) | (i23 << i14))) & j18);
            iArr[i17] = (int) j21;
            j11 = j21 >> c7;
            iArr2[i17] = (int) j22;
            j17 = j22 >> c7;
            i17++;
            c3 = c7;
            i19 = i23;
            i18 = i22;
            j9 = j18;
        }
    }
}
