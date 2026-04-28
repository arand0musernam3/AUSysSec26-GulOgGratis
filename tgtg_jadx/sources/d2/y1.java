package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends b4.s implements b5.c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f13975o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f13976p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f13977q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f13978r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13979s;

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        int iQ0 = w0Var.q0(this.f13977q) + w0Var.q0(this.f13975o);
        int iQ02 = w0Var.q0(this.f13978r) + w0Var.q0(this.f13976p);
        z4.m1 m1VarD = t0Var.D(z5.b.i(-iQ0, -iQ02, j9));
        return z4.w0.f(w0Var, z5.b.g(m1VarD.f47183a + iQ0, j9), z5.b.f(m1VarD.f47184b + iQ02, j9), new a3.p(23, this, m1VarD));
    }
}
