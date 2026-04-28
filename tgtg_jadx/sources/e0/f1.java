package e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15337a;

    public static final boolean a(long j9, long j11) {
        return j9 == j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f1) {
            return this.f15337a == ((f1) obj).f15337a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15337a);
    }

    public final String toString() {
        return "StreamUseCase(value=" + this.f15337a + ')';
    }
}
