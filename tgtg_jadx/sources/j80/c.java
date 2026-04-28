package j80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends b {
    public static int a(double d3) {
        if (Double.isNaN(d3)) {
            i4.a.f("Cannot round NaN value.");
            return 0;
        }
        if (d3 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d3 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d3);
    }

    public static int b(float f11) {
        if (!Float.isNaN(f11)) {
            return Math.round(f11);
        }
        i4.a.f("Cannot round NaN value.");
        return 0;
    }

    public static long c(double d3) {
        if (!Double.isNaN(d3)) {
            return Math.round(d3);
        }
        i4.a.f("Cannot round NaN value.");
        return 0L;
    }
}
