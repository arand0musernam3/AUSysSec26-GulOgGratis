package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends j1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i1 f13798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13799q;

    @Override // d2.j1
    public final long L0(z4.t0 t0Var, long j9) {
        int iV = this.f13798p == i1.Min ? t0Var.V(z5.a.i(j9)) : t0Var.b(z5.a.i(j9));
        if (iV < 0) {
            iV = 0;
        }
        if (iV < 0) {
            z5.i.a("height must be >= 0");
        }
        return z5.b.h(0, Integer.MAX_VALUE, iV, iV);
    }

    @Override // d2.j1
    public final boolean M0() {
        return this.f13799q;
    }

    @Override // d2.j1, b5.c0
    public final int maxIntrinsicHeight(z4.u uVar, z4.t tVar, int i11) {
        return this.f13798p == i1.Min ? tVar.V(i11) : tVar.b(i11);
    }

    @Override // d2.j1, b5.c0
    public final int minIntrinsicHeight(z4.u uVar, z4.t tVar, int i11) {
        return this.f13798p == i1.Min ? tVar.V(i11) : tVar.b(i11);
    }
}
