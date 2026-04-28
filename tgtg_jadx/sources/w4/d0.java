package w4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43116a;

    public static String a(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            return this.f43116a == ((d0) obj).f43116a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43116a);
    }

    public final String toString() {
        return a(this.f43116a);
    }
}
