package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class d1 extends z0 implements b5.c0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public y2 f13773q;

    public d1(y2 y2Var) {
        this.f13773q = y2Var;
    }

    @Override // d2.z0
    public final y2 L0(y2 y2Var) {
        return new q2(y2Var, this.f13773q);
    }

    @Override // d2.z0
    public final void M0() {
        super.M0();
        b5.m.g(this).F();
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        int iA = this.f13982p.a(w0Var, w0Var.getLayoutDirection()) - this.f13981o.a(w0Var, w0Var.getLayoutDirection());
        int iD = this.f13982p.d(w0Var) - this.f13981o.d(w0Var);
        int iB = (this.f13982p.b(w0Var, w0Var.getLayoutDirection()) - this.f13981o.b(w0Var, w0Var.getLayoutDirection())) + iA;
        int iC = (this.f13982p.c(w0Var) - this.f13981o.c(w0Var)) + iD;
        z4.m1 m1VarD = t0Var.D(z5.b.i(-iB, -iC, j9));
        return z4.w0.f(w0Var, z5.b.g(m1VarD.f47183a + iB, j9), z5.b.f(m1VarD.f47184b + iC, j9), new c1(m1VarD, iA, iD, 0));
    }
}
