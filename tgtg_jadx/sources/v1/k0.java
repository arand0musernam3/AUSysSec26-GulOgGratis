package v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends b4.s implements b5.r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b2.k f41772o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f41773p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f41774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f41775r;

    public k0(b2.k kVar) {
        this.f41772o = kVar;
    }

    @Override // b5.r
    public final void n(b5.o0 o0Var) {
        o0Var.b();
        k4.b bVar = o0Var.f5908a;
        if (this.f41773p) {
            k4.d.B0(o0Var, i4.v.b(0.3f, i4.v.f23309b), 0L, bVar.d(), 0.0f, 122);
        } else if (this.f41774q || this.f41775r) {
            k4.d.B0(o0Var, i4.v.b(0.1f, i4.v.f23309b), 0L, bVar.d(), 0.0f, 122);
        }
    }

    @Override // b4.s
    public final void onAttach() {
        v80.f0.B(getCoroutineScope(), null, null, new j0(this, null), 3);
    }
}
