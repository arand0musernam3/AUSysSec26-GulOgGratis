package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f13947a = new v0();

    @Override // d2.j2
    public final b4.t a(float f11, b4.t tVar, boolean z11) {
        if (f11 <= 0.0d) {
            e2.a.a("invalid weight; must be greater than zero");
        }
        if (f11 > Float.MAX_VALUE) {
            f11 = Float.MAX_VALUE;
        }
        return tVar.then(new n1(f11, true));
    }
}
