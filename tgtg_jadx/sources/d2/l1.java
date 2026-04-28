package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends j1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i1 f13835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13836q;

    @Override // d2.j1
    public final long L0(z4.t0 t0Var, long j9) {
        int iW = this.f13835p == i1.Min ? t0Var.w(z5.a.h(j9)) : t0Var.y(z5.a.h(j9));
        if (iW < 0) {
            iW = 0;
        }
        if (iW < 0) {
            z5.i.a("width must be >= 0");
        }
        return z5.b.h(iW, iW, 0, Integer.MAX_VALUE);
    }

    @Override // d2.j1
    public final boolean M0() {
        return this.f13836q;
    }

    @Override // d2.j1, b5.c0
    public final int maxIntrinsicWidth(z4.u uVar, z4.t tVar, int i11) {
        return this.f13835p == i1.Min ? tVar.w(i11) : tVar.y(i11);
    }

    @Override // d2.j1, b5.c0
    public final int minIntrinsicWidth(z4.u uVar, z4.t tVar, int i11) {
        return this.f13835p == i1.Min ? tVar.w(i11) : tVar.y(i11);
    }
}
