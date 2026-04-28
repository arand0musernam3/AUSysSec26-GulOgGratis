package rt;

import om.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements t00.b, t00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f38232a;

    public /* synthetic */ c(d dVar) {
        this.f38232a = dVar;
    }

    @Override // t00.b
    public void a(int i11) {
        n nVar;
        d dVar = this.f38232a;
        n nVar2 = dVar.f38236d;
        if (nVar2 != null && !nVar2.f32690a) {
            nVar2.f32690a = true;
            nVar2.b();
        }
        if (i11 != 1 || (nVar = dVar.f38236d) == null || nVar.f32690a) {
            return;
        }
        nVar.f32690a = true;
        nVar.b();
    }

    @Override // t00.a
    public void b() {
        d dVar = this.f38232a;
        dVar.f38237e = dVar.f38233a.q().f12142b;
        n nVar = dVar.f38236d;
        if (nVar == null || !nVar.f32690a) {
            return;
        }
        nVar.f32690a = false;
        nVar.a();
    }
}
