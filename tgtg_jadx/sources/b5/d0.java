package b5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends v0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e0 f5792v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var) {
        super(e0Var);
        this.f5792v = e0Var;
    }

    @Override // z4.t0
    public final z4.m1 D(long j9) {
        p0(j9);
        new z5.a(j9);
        e0 e0Var = this.f5792v;
        c0 c0Var = e0Var.Y;
        s1 s1Var = e0Var.f5967q;
        s1Var.getClass();
        v0 v0VarB1 = s1Var.b1();
        v0VarB1.getClass();
        v0.S0(this, c0Var.mo58measure3p2s80s(this, v0VarB1, j9));
        return this;
    }

    @Override // z4.t
    public final int V(int i11) {
        e0 e0Var = this.f5792v;
        c0 c0Var = e0Var.Y;
        s1 s1Var = e0Var.f5967q;
        s1Var.getClass();
        v0 v0VarB1 = s1Var.b1();
        v0VarB1.getClass();
        return c0Var.minIntrinsicHeight(this, v0VarB1, i11);
    }

    @Override // z4.t
    public final int b(int i11) {
        e0 e0Var = this.f5792v;
        c0 c0Var = e0Var.Y;
        s1 s1Var = e0Var.f5967q;
        s1Var.getClass();
        v0 v0VarB1 = s1Var.b1();
        v0VarB1.getClass();
        return c0Var.maxIntrinsicHeight(this, v0VarB1, i11);
    }

    @Override // b5.u0
    public final int v0(z4.a aVar) {
        int iB = o.b(this, aVar);
        this.f6012u.g(iB, aVar);
        return iB;
    }

    @Override // z4.t
    public final int w(int i11) {
        e0 e0Var = this.f5792v;
        c0 c0Var = e0Var.Y;
        s1 s1Var = e0Var.f5967q;
        s1Var.getClass();
        v0 v0VarB1 = s1Var.b1();
        v0VarB1.getClass();
        return c0Var.minIntrinsicWidth(this, v0VarB1, i11);
    }

    @Override // z4.t
    public final int y(int i11) {
        e0 e0Var = this.f5792v;
        c0 c0Var = e0Var.Y;
        s1 s1Var = e0Var.f5967q;
        s1Var.getClass();
        v0 v0VarB1 = s1Var.b1();
        v0VarB1.getClass();
        return c0Var.maxIntrinsicWidth(this, v0VarB1, i11);
    }
}
