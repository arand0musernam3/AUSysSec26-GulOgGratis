package z5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47292a;

    public static long a(long j9, float f11, float f12, int i11) {
        if ((i11 & 1) != 0) {
            f11 = Float.intBitsToFloat((int) (j9 >> 32));
        }
        if ((i11 & 2) != 0) {
            f12 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L);
    }

    public static final float b(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    public static final float c(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    public static final long d(long j9, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long e(long j9, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (j9 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat((int) (j9 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long f(float f11, long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) * f11;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)) * f11)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static String g(long j9) {
        return "(" + b(j9) + ", " + c(j9) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f47292a == ((q) obj).f47292a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f47292a);
    }

    public final String toString() {
        return g(this.f47292a);
    }
}
