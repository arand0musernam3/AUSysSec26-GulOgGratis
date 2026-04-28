package r8;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f37776a = q1.h.a(0.0f, 0.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f37777b = 3.1415927f;

    public static final long a(float f11, float f12) {
        float fSqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11));
        if (fSqrt > 0.0f) {
            return q1.h.a(f11 / fSqrt, f12 / fSqrt);
        }
        i4.a.f("Required distance greater than zero");
        return 0L;
    }

    public static final float b(float f11, float f12, float f13) {
        return (f13 * f12) + ((1 - f13) * f11);
    }

    public static long c(float f11, float f12) {
        double d3 = f12;
        return pd.g.F(pd.g.J(f11, q1.h.a((float) Math.cos(d3), (float) Math.sin(d3))), f37776a);
    }
}
