package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z0 implements i3.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19863b;

    public /* synthetic */ z0(Object obj, int i11) {
        this.f19862a = i11;
        this.f19863b = obj;
    }

    @Override // i3.u
    public final float invoke() {
        ka state;
        switch (this.f19862a) {
            case 0:
                ja jaVar = ((z6) this.f19863b).l;
                if (jaVar == null || (state = jaVar.getState()) == null) {
                    return 0.0f;
                }
                return state.f18985c.h();
            default:
                return ((Number) ((k3.t) this.f19863b).f25869a.d()).floatValue();
        }
    }
}
