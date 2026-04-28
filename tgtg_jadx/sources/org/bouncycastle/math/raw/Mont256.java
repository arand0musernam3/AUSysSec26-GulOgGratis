package org.bouncycastle.math.raw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Mont256 {
    private static final long M = 4294967295L;

    public static int inverse32(int i11) {
        int i12 = (2 - (i11 * i11)) * i11;
        int i13 = (2 - (i11 * i12)) * i12;
        int i14 = (2 - (i11 * i13)) * i13;
        return (2 - (i11 * i14)) * i14;
    }

    public static void multAdd(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i11) {
        char c3 = 0;
        long j9 = iArr2[0];
        long j11 = M;
        long j12 = j9 & M;
        int i12 = 0;
        int i13 = 0;
        while (i12 < 8) {
            long j13 = ((long) iArr3[c3]) & j11;
            long j14 = ((long) iArr[i12]) & j11;
            long j15 = j14 * j12;
            long j16 = (j15 & j11) + j13;
            char c7 = c3;
            long j17 = j11;
            long j18 = ((long) (((int) j16) * i11)) & j17;
            long j19 = (((long) iArr4[c7]) & j17) * j18;
            char c8 = ' ';
            long j21 = ((j16 + (j19 & j17)) >>> 32) + (j15 >>> 32) + (j19 >>> 32);
            int i14 = 1;
            while (i14 < 8) {
                long j22 = (((long) iArr2[i14]) & j17) * j14;
                char c11 = c8;
                long j23 = (((long) iArr4[i14]) & j17) * j18;
                long j24 = (j22 & j17) + (j23 & j17) + (((long) iArr3[i14]) & j17) + j21;
                iArr3[i14 - 1] = (int) j24;
                j21 = (j24 >>> c11) + (j22 >>> c11) + (j23 >>> c11);
                i14++;
                c8 = c11;
                j12 = j12;
                j18 = j18;
            }
            char c12 = c8;
            long j25 = j21 + (((long) i13) & j17);
            iArr3[7] = (int) j25;
            i13 = (int) (j25 >>> c12);
            i12++;
            c3 = c7;
            j11 = j17;
            j12 = j12;
        }
        if (i13 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void multAddXF(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        char c3 = 0;
        long j9 = iArr2[0];
        long j11 = M;
        long j12 = j9 & M;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= 8) {
                break;
            }
            long j13 = ((long) iArr[i11]) & j11;
            long j14 = (j13 * j12) + (((long) iArr3[c3]) & j11);
            long j15 = j14 & j11;
            long j16 = (j14 >>> 32) + j15;
            int i13 = 1;
            for (int i14 = 8; i13 < i14; i14 = 8) {
                long j17 = j11;
                long j18 = (((long) iArr2[i13]) & j17) * j13;
                int i15 = i13;
                long j19 = (((long) iArr4[i13]) & j17) * j15;
                long j21 = (j18 & j17) + (j19 & j17) + (((long) iArr3[i15]) & j17) + j16;
                iArr3[i15 - 1] = (int) j21;
                j16 = (j21 >>> 32) + (j18 >>> 32) + (j19 >>> 32);
                i13 = i15 + 1;
                j11 = j17;
                j12 = j12;
            }
            long j22 = j16 + (((long) i12) & j11);
            iArr3[7] = (int) j22;
            i12 = (int) (j22 >>> 32);
            i11++;
            j12 = j12;
            c3 = 0;
        }
        if (i12 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2, int i11) {
        char c3 = 0;
        int i12 = 0;
        while (i12 < 8) {
            int i13 = iArr[c3];
            long j9 = ((long) (i13 * i11)) & M;
            long j11 = (((((long) iArr2[c3]) & M) * j9) + (((long) i13) & M)) >>> 32;
            int i14 = 1;
            while (i14 < 8) {
                long j12 = ((((long) iArr2[i14]) & M) * j9) + (((long) iArr[i14]) & M) + j11;
                iArr[i14 - 1] = (int) j12;
                j11 = j12 >>> 32;
                i14++;
                i12 = i12;
            }
            iArr[7] = (int) j11;
            i12++;
            c3 = 0;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }

    public static void reduceXF(int[] iArr, int[] iArr2) {
        for (int i11 = 0; i11 < 8; i11++) {
            long j9 = ((long) iArr[0]) & M;
            long j11 = j9;
            for (int i12 = 1; i12 < 8; i12++) {
                long j12 = ((((long) iArr2[i12]) & M) * j9) + (((long) iArr[i12]) & M) + j11;
                iArr[i12 - 1] = (int) j12;
                j11 = j12 >>> 32;
            }
            iArr[7] = (int) j11;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }
}
