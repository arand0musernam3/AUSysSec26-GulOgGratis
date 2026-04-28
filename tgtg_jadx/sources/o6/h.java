package o6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class h extends g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f32014m;

    public h(t tVar) {
        super(tVar);
        if (tVar instanceof m) {
            this.f32007e = f.HORIZONTAL_DIMENSION;
        } else {
            this.f32007e = f.VERTICAL_DIMENSION;
        }
    }

    @Override // o6.g
    public final void d(int i11) {
        if (this.f32012j) {
            return;
        }
        this.f32012j = true;
        this.f32009g = i11;
        for (e eVar : this.f32013k) {
            eVar.a(eVar);
        }
    }
}
