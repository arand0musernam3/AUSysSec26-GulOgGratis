package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f46707a = t.f46685a;

    default float a(float f11, float f12, float f13) {
        f46707a.getClass();
        float f14 = f12 + f11;
        if ((f11 >= 0.0f && f14 <= f13) || (f11 < 0.0f && f14 > f13)) {
            return 0.0f;
        }
        float f15 = f14 - f13;
        return Math.abs(f11) < Math.abs(f15) ? f11 : f15;
    }
}
