package h4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21392a;

    public static final boolean a(long j9, long j11) {
        return j9 == j11;
    }

    public static final float b(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    public static final float c(long j9) {
        return Math.min(Float.intBitsToFloat((int) ((j9 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j9 & 2147483647L)));
    }

    public static final float d(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    public static final boolean e(long j9) {
        return (j9 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j9 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j9 & 4294967295L)) <= 0.0f);
    }

    public static String f(long j9) {
        if (j9 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + m0.c.q0(Float.intBitsToFloat((int) (j9 >> 32))) + ", " + m0.c.q0(Float.intBitsToFloat((int) (j9 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f21392a == ((e) obj).f21392a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21392a);
    }

    public final String toString() {
        return f(this.f21392a);
    }
}
