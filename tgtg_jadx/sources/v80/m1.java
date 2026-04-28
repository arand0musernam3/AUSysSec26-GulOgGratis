package v80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class m1 extends k1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s1 f42126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f42127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f42128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f42129h;

    public m1(s1 s1Var, n1 n1Var, p pVar, Object obj) {
        this.f42126e = s1Var;
        this.f42127f = n1Var;
        this.f42128g = pVar;
        this.f42129h = obj;
    }

    @Override // v80.k1
    public final boolean k() {
        return false;
    }

    @Override // v80.k1
    public final void l(Throwable th2) {
        p pVar = this.f42128g;
        p pVarU = s1.U(pVar);
        s1 s1Var = this.f42126e;
        n1 n1Var = this.f42127f;
        Object obj = this.f42129h;
        if (pVarU == null || !s1Var.f0(n1Var, pVarU, obj)) {
            n1Var.f42137a.d(new a90.i(2), 2);
            p pVarU2 = s1.U(pVar);
            if (pVarU2 == null || !s1Var.f0(n1Var, pVarU2, obj)) {
                s1Var.i(s1Var.z(n1Var, obj));
            }
        }
    }
}
