package e0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f15325b = kotlin.collections.d0.h(new d(0), new d(1), new d(6), new d(5), new d(2), new d(3), new d(8), new d(7));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15326a;

    public /* synthetic */ d(int i11) {
        this.f15326a = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f15326a == ((d) obj).f15326a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15326a);
    }

    public final String toString() {
        return w.a0.l("AwbMode(value=", this.f15326a, ')');
    }
}
