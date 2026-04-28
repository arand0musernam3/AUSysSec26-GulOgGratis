package z5;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final long a(int i11, int i12, int i13, int i14) {
        if (!((i13 >= 0) & (i12 >= i11) & (i14 >= i13) & (i11 >= 0))) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i11, i12, i13, i14);
    }

    public static /* synthetic */ long b(int i11, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return a(0, i11, 0, i12);
    }

    public static final int c(int i11) {
        if (i11 < 8191) {
            return 13;
        }
        if (i11 < 32767) {
            return 15;
        }
        if (i11 < 65535) {
            return 16;
        }
        return i11 < 262143 ? 18 : 255;
    }

    public static final long d(long j9, long j11) {
        int i11 = (int) (j11 >> 32);
        int iK = a.k(j9);
        int i12 = a.i(j9);
        if (i11 < iK) {
            i11 = iK;
        }
        if (i11 <= i12) {
            i12 = i11;
        }
        int i13 = (int) (j11 & 4294967295L);
        int iJ = a.j(j9);
        int iH = a.h(j9);
        if (i13 < iJ) {
            i13 = iJ;
        }
        if (i13 <= iH) {
            iH = i13;
        }
        return (((long) i12) << 32) | (((long) iH) & 4294967295L);
    }

    public static final long e(long j9, long j11) {
        int iK = a.k(j9);
        int i11 = a.i(j9);
        int iJ = a.j(j9);
        int iH = a.h(j9);
        int iK2 = a.k(j11);
        if (iK2 < iK) {
            iK2 = iK;
        }
        if (iK2 > i11) {
            iK2 = i11;
        }
        int i12 = a.i(j11);
        if (i12 >= iK) {
            iK = i12;
        }
        if (iK <= i11) {
            i11 = iK;
        }
        int iJ2 = a.j(j11);
        if (iJ2 < iJ) {
            iJ2 = iJ;
        }
        if (iJ2 > iH) {
            iJ2 = iH;
        }
        int iH2 = a.h(j11);
        if (iH2 >= iJ) {
            iJ = iH2;
        }
        if (iJ <= iH) {
            iH = iJ;
        }
        return a(iK2, i11, iJ2, iH);
    }

    public static final int f(int i11, long j9) {
        int iJ = a.j(j9);
        int iH = a.h(j9);
        if (i11 < iJ) {
            i11 = iJ;
        }
        return i11 > iH ? iH : i11;
    }

    public static final int g(int i11, long j9) {
        int iK = a.k(j9);
        int i12 = a.i(j9);
        if (i11 < iK) {
            i11 = iK;
        }
        return i11 > i12 ? i12 : i11;
    }

    public static final long h(int i11, int i12, int i13, int i14) {
        int i15 = i14 == Integer.MAX_VALUE ? i13 : i14;
        int iC = c(i15);
        int i16 = i12 == Integer.MAX_VALUE ? i11 : i12;
        int iC2 = c(i16);
        if (iC + iC2 > 31) {
            k(i16, i15);
        }
        int i17 = i12 + 1;
        int i18 = i14 + 1;
        int i19 = iC2 - 13;
        return (((long) (i17 & (~(i17 >> 31)))) << 33) | ((long) ((i19 >> 1) + (i19 & 1))) | (((long) i11) << 2) | (((long) i13) << (iC2 + 2)) | (((long) (i18 & (~(i18 >> 31)))) << (iC2 + 33));
    }

    public static final long i(int i11, int i12, long j9) {
        int iK = a.k(j9) + i11;
        if (iK < 0) {
            iK = 0;
        }
        int i13 = a.i(j9);
        if (i13 != Integer.MAX_VALUE && (i13 = i13 + i11) < 0) {
            i13 = 0;
        }
        int iJ = a.j(j9) + i12;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = a.h(j9);
        return a(iK, i13, iJ, (iH == Integer.MAX_VALUE || (iH = iH + i12) >= 0) ? iH : 0);
    }

    public static /* synthetic */ long j(int i11, int i12, int i13, long j9) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return i(i11, i12, j9);
    }

    public static final void k(int i11, int i12) {
        throw new IllegalArgumentException(r8.k.g(i11, i12, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    @NotNull
    public static final Void l(int i11) {
        throw new IllegalArgumentException(r8.k.h(i11, "Can't represent a size of ", " in Constraints"));
    }
}
