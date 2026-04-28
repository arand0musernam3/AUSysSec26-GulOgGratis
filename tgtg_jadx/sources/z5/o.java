package z5;

import b0.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p[] f47288b = {new p(0), new p(4294967296L), new p(8589934592L)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f47289c = a0.F(Float.NaN, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47290a;

    public static final boolean a(long j9, long j11) {
        return j9 == j11;
    }

    public static final long b(long j9) {
        return f47288b[(int) ((j9 & 1095216660480L) >>> 32)].f47291a;
    }

    public static final float c(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }

    public static String d(long j9) {
        long jB = b(j9);
        if (p.a(jB, 0L)) {
            return "Unspecified";
        }
        if (p.a(jB, 4294967296L)) {
            return c(j9) + ".sp";
        }
        if (!p.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j9) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f47290a == ((o) obj).f47290a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f47290a);
    }

    public final String toString() {
        return d(this.f47290a);
    }
}
