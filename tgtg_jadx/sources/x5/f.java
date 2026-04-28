package x5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f43842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f43843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f43844d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f43845a;

    static {
        a(0.0f);
        a(0.5f);
        f43842b = 0.5f;
        a(-1.0f);
        f43843c = -1.0f;
        a(1.0f);
        f43844d = 1.0f;
    }

    public static void a(float f11) {
        if ((0.0f > f11 || f11 > 1.0f) && f11 != -1.0f) {
            s5.a.c("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f11) {
        if (f11 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f11 == f43842b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f11 == f43843c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f11 == f43844d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f11 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f43845a, ((f) obj).f43845a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f43845a);
    }

    public final String toString() {
        return b(this.f43845a);
    }
}
