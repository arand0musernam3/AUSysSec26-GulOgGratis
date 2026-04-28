package e0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f15308b = kotlin.collections.d0.h(new b(0), new b(1), new b(2), new b(3), new b(4), new b(5));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15309a;

    public /* synthetic */ b(int i11) {
        this.f15309a = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f15309a == ((b) obj).f15309a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15309a);
    }

    public final String toString() {
        return w.a0.l("AfMode(value=", this.f15309a, ')');
    }
}
