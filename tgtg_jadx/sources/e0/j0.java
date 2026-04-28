package e0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f15361b = kotlin.collections.d0.h(new j0(0), new j0(1), new j0(2));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15362a;

    public /* synthetic */ j0(int i11) {
        this.f15362a = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            return this.f15362a == ((j0) obj).f15362a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15362a);
    }

    public final String toString() {
        return w.a0.l("FlashMode(value=", this.f15362a, ')');
    }
}
