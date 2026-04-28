package oa0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f32350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(m0 m0Var, q90.d0 d0Var, k kVar, f fVar, int i11) {
        super(m0Var, d0Var, kVar);
        this.f32349d = i11;
        this.f32350e = fVar;
    }

    @Override // oa0.p
    public final Object a(w wVar, Object[] objArr) {
        int i11 = this.f32349d;
        f fVar = this.f32350e;
        switch (i11) {
            case 0:
                return fVar.l(wVar);
            default:
                d dVar = (d) fVar.l(wVar);
                x70.c cVar = (x70.c) objArr[objArr.length - 1];
                try {
                    v80.l lVar = new v80.l(1, y70.f.b(cVar));
                    lVar.t();
                    lVar.v(new r(dVar, 2));
                    dVar.g(new jd.f(lVar, 16));
                    Object objS = lVar.s();
                    y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                    return objS;
                } catch (Exception e5) {
                    return u0.q(e5, cVar);
                }
        }
    }
}
