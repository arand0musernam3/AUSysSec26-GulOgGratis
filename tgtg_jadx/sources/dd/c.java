package dd;

import zc.f;
import zc.l;
import zc.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bd.a f14870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f14871b;

    public c(bd.a aVar, l lVar) {
        this.f14870a = aVar;
        this.f14871b = lVar;
    }

    @Override // dd.e
    public final void d() {
        l lVar = this.f14871b;
        boolean z11 = lVar instanceof r;
        bd.a aVar = this.f14870a;
        if (z11) {
            aVar.b(((r) lVar).f47508a);
        } else if (lVar instanceof f) {
            aVar.b(((f) lVar).f47436a);
        } else {
            e40.a.f();
        }
    }
}
