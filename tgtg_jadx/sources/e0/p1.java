package e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15397a;

    public static String a(int i11) {
        return j4.s.f(i11, "Stream-");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p1) {
            return this.f15397a == ((p1) obj).f15397a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15397a);
    }

    public final String toString() {
        return a(this.f15397a);
    }
}
