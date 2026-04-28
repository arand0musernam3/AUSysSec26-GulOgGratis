package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends b4.s implements b5.c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public z1 f13768o;

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        float fD = this.f13768o.d(w0Var.getLayoutDirection());
        float fC = this.f13768o.c();
        float fB = this.f13768o.b(w0Var.getLayoutDirection());
        float fA = this.f13768o.a();
        float f11 = 0;
        if (!((z5.f.a(fA, f11) >= 0) & (z5.f.a(fD, f11) >= 0) & (z5.f.a(fC, f11) >= 0) & (z5.f.a(fB, f11) >= 0))) {
            e2.a.a("Padding must be non-negative");
        }
        int iQ0 = w0Var.q0(fD);
        int iQ02 = w0Var.q0(fB) + iQ0;
        int iQ03 = w0Var.q0(fC);
        int iQ04 = w0Var.q0(fA) + iQ03;
        z4.m1 m1VarD = t0Var.D(z5.b.i(-iQ02, -iQ04, j9));
        return z4.w0.f(w0Var, z5.b.g(m1VarD.f47183a + iQ02, j9), z5.b.f(m1VarD.f47184b + iQ04, j9), new c1(m1VarD, iQ0, iQ03, 1));
    }
}
