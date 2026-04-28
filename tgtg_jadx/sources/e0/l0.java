package e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15364a;

    public static String a(long j9) {
        return f.i(j9, "Frame-");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l0) {
            return this.f15364a == ((l0) obj).f15364a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15364a);
    }

    public final String toString() {
        return a(this.f15364a);
    }
}
