package h0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20991a;

    public static String a(long j9) {
        return "TimestampNs(value=" + j9 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f20991a == ((o) obj).f20991a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20991a);
    }

    public final String toString() {
        return a(this.f20991a);
    }
}
