package e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15417a;

    public final boolean equals(Object obj) {
        if (obj instanceof x0) {
            return this.f15417a == ((x0) obj).f15417a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15417a);
    }

    public final String toString() {
        return j4.s.f(this.f15417a, "Output-");
    }
}
