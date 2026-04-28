package m3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v80.b0 f29260a;

    public d0(v80.b0 b0Var) {
        this.f29260a = b0Var;
    }

    @Override // m3.e2
    public final void b() {
        v80.b0 b0Var = this.f29260a;
        if (b0Var instanceof h2) {
            ((h2) b0Var).a();
        } else {
            v80.f0.j(b0Var, new n0(1));
        }
    }

    @Override // m3.e2
    public final void c() {
        v80.b0 b0Var = this.f29260a;
        if (b0Var instanceof h2) {
            ((h2) b0Var).a();
        } else {
            v80.f0.j(b0Var, new n0(1));
        }
    }

    @Override // m3.e2
    public final void d() {
    }
}
