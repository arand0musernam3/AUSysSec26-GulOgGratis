package h4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21378a;

    public static long a(float f11, int i11, long j9) {
        float fIntBitsToFloat = (i11 & 1) != 0 ? Float.intBitsToFloat((int) (j9 >> 32)) : 0.0f;
        if ((i11 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
    }

    public static final boolean b(long j9, long j11) {
        return j9 == j11;
    }

    public static final float c(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    public static final float d(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        return (fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat);
    }

    public static final long e(long j9, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final long f(long j9, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (j9 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat((int) (j9 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final long g(float f11, long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) * f11;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)) * f11)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static String h(long j9) {
        if ((9223372034707292159L & j9) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + m0.c.q0(Float.intBitsToFloat((int) (j9 >> 32))) + ", " + m0.c.q0(Float.intBitsToFloat((int) (j9 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f21378a == ((b) obj).f21378a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21378a);
    }

    public final String toString() {
        return h(this.f21378a);
    }
}
