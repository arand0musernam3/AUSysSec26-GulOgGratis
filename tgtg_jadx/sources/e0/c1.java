package e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15324a;

    public static String a(long j9) {
        return "DynamicRangeProfile(value=" + j9 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c1) {
            return this.f15324a == ((c1) obj).f15324a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15324a);
    }

    public final String toString() {
        return a(this.f15324a);
    }
}
