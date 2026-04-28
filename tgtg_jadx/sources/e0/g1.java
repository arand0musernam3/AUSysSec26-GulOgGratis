package e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15343a;

    public static final boolean a(long j9, long j11) {
        return j9 == j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g1) {
            return this.f15343a == ((g1) obj).f15343a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15343a);
    }

    public final String toString() {
        return "StreamUseHint(value=" + this.f15343a + ')';
    }
}
