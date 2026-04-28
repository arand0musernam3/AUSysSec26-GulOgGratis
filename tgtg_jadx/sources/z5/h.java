package z5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47279a;

    public static final float a(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    public static final float b(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    public static String c(long j9) {
        if (j9 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) f.d(b(j9))) + " x " + ((Object) f.d(a(j9)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f47279a == ((h) obj).f47279a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f47279a);
    }

    public final String toString() {
        return c(this.f47279a);
    }
}
