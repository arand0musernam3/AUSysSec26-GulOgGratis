package q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35762a;

    public static long a(float f11, float f12) {
        return (((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    public static String b(long j9) {
        return "(" + Float.intBitsToFloat((int) (j9 >> 32)) + ", " + Float.intBitsToFloat((int) (j9 & 4294967295L)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f35762a == ((h) obj).f35762a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35762a);
    }

    public final String toString() {
        return b(this.f35762a);
    }
}
