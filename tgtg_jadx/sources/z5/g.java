package z5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47278a;

    public static String a(long j9) {
        if (j9 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.d(Float.intBitsToFloat((int) (j9 >> 32)))) + ", " + ((Object) f.d(Float.intBitsToFloat((int) (j9 & 4294967295L)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f47278a == ((g) obj).f47278a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f47278a);
    }

    public final String toString() {
        return a(this.f47278a);
    }
}
