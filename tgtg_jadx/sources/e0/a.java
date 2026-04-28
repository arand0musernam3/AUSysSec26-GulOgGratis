package e0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f15305b = kotlin.collections.d0.h(new a(0), new a(1), new a(2), new a(3), new a(4), new a(5), new a(6));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15306a;

    public /* synthetic */ a(int i11) {
        this.f15306a = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f15306a == ((a) obj).f15306a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15306a);
    }

    public final String toString() {
        return w.a0.l("AeMode(value=", this.f15306a, ')');
    }
}
