package kotlin.collections;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public c(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static void a(int i11, int i12, int i13) {
        if (i11 < 0 || i12 > i13) {
            org.bouncycastle.jce.provider.a.e(i13, r8.k.r(i11, i12, "startIndex: ", ", endIndex: ", ", size: "));
        } else {
            if (i11 <= i12) {
                return;
            }
            i4.a.f(r8.k.k("startIndex: ", i11, i12, " > endIndex: "));
        }
    }

    public static void b(int i11, int i12) {
        if (i11 < 0 || i11 >= i12) {
            org.bouncycastle.jce.provider.a.v(r8.k.k("index: ", i11, i12, ", size: "));
        }
    }

    public static void c(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            org.bouncycastle.jce.provider.a.v(r8.k.k("index: ", i11, i12, ", size: "));
        }
    }

    public static void d(int i11, int i12, int i13) {
        if (i11 < 0 || i12 > i13) {
            org.bouncycastle.jce.provider.a.e(i13, r8.k.r(i11, i12, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i11 <= i12) {
                return;
            }
            i4.a.f(r8.k.k("fromIndex: ", i11, i12, " > toIndex: "));
        }
    }

    public static int e(int i11, int i12) {
        int i13 = i11 + (i11 >> 1);
        if (i13 - i12 < 0) {
            i13 = i12;
        }
        return i13 - 2147483639 > 0 ? i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i13;
    }
}
