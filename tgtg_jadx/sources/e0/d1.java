package e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15328a;

    public static String a(int i11) {
        return w.a0.l("MirrorMode(value=", i11, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d1) {
            return this.f15328a == ((d1) obj).f15328a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15328a);
    }

    public final String toString() {
        return a(this.f15328a);
    }
}
