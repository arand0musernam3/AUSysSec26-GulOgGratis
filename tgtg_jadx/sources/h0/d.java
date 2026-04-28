package h0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20962a;

    public static final int a(long j9, long j11) {
        if (j9 == j11) {
            return 0;
        }
        return j9 < j11 ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f20962a == ((d) obj).f20962a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20962a);
    }

    public final String toString() {
        return "DurationNs(value=" + this.f20962a + ')';
    }
}
