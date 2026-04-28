package z5;

import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47271a;

    public /* synthetic */ a(long j9) {
        this.f47271a = j9;
    }

    public static final long a(int i11, int i12, int i13, int i14) {
        if (i12 < i11 || i14 < i13 || i11 < 0 || i13 < 0) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.h(i11, i12, i13, i14);
    }

    public static /* synthetic */ long b(long j9, int i11, int i12, int i13, int i14, int i15) {
        if ((i15 & 1) != 0) {
            i11 = k(j9);
        }
        if ((i15 & 2) != 0) {
            i12 = i(j9);
        }
        if ((i15 & 4) != 0) {
            i13 = j(j9);
        }
        if ((i15 & 8) != 0) {
            i14 = h(j9);
        }
        return a(i11, i12, i13, i14);
    }

    public static final boolean c(long j9, long j11) {
        return j9 == j11;
    }

    public static final boolean d(long j9) {
        int i11 = (int) (3 & j9);
        int i12 = (((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1);
        return (((int) (j9 >> (i12 + 46))) & ((1 << (18 - i12)) - 1)) != 0;
    }

    public static final boolean e(long j9) {
        int i11 = (int) (3 & j9);
        return (((int) (j9 >> 33)) & ((1 << l1.a((i11 & 2) >> 1, 3, (i11 & 1) << 1, 13)) - 1)) != 0;
    }

    public static final boolean f(long j9) {
        int i11 = (int) (3 & j9);
        int i12 = (((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1);
        int i13 = (1 << (18 - i12)) - 1;
        int i14 = ((int) (j9 >> (i12 + 15))) & i13;
        int i15 = ((int) (j9 >> (i12 + 46))) & i13;
        return i14 == (i15 == 0 ? Integer.MAX_VALUE : i15 - 1);
    }

    public static final boolean g(long j9) {
        int i11 = (int) (3 & j9);
        int iA = (1 << l1.a((i11 & 2) >> 1, 3, (i11 & 1) << 1, 13)) - 1;
        int i12 = ((int) (j9 >> 2)) & iA;
        int i13 = ((int) (j9 >> 33)) & iA;
        return i12 == (i13 == 0 ? Integer.MAX_VALUE : i13 - 1);
    }

    public static final int h(long j9) {
        int i11 = (int) (3 & j9);
        int i12 = (((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1);
        int i13 = ((int) (j9 >> (i12 + 46))) & ((1 << (18 - i12)) - 1);
        if (i13 == 0) {
            return Integer.MAX_VALUE;
        }
        return i13 - 1;
    }

    public static final int i(long j9) {
        int i11 = (int) (3 & j9);
        int i12 = (int) (j9 >> 33);
        int iA = i12 & ((1 << l1.a((i11 & 2) >> 1, 3, (i11 & 1) << 1, 13)) - 1);
        if (iA == 0) {
            return Integer.MAX_VALUE;
        }
        return iA - 1;
    }

    public static final int j(long j9) {
        int i11 = (int) (3 & j9);
        int i12 = (((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1);
        return ((int) (j9 >> (i12 + 15))) & ((1 << (18 - i12)) - 1);
    }

    public static final int k(long j9) {
        int i11 = (int) (3 & j9);
        return ((int) (j9 >> 2)) & ((1 << l1.a((i11 & 2) >> 1, 3, (i11 & 1) << 1, 13)) - 1);
    }

    public static final boolean l(long j9) {
        int i11 = (int) (3 & j9);
        int i12 = (((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1);
        return ((((int) (j9 >> 33)) & ((1 << (i12 + 13)) - 1)) - 1 == 0) | ((((int) (j9 >> (i12 + 46))) & ((1 << (18 - i12)) - 1)) - 1 == 0);
    }

    public static String m(long j9) {
        int i11 = i(j9);
        String strValueOf = i11 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(i11);
        int iH = h(j9);
        String strValueOf2 = iH != Integer.MAX_VALUE ? String.valueOf(iH) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(k(j9));
        sb2.append(", maxWidth = ");
        sb2.append(strValueOf);
        sb2.append(", minHeight = ");
        sb2.append(j(j9));
        sb2.append(", maxHeight = ");
        return l1.f(sb2, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f47271a == ((a) obj).f47271a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f47271a);
    }

    public final String toString() {
        return m(this.f47271a);
    }
}
