package z3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r3.b f47057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47058d;

    public t(long j9, r3.b bVar) {
        super(j9);
        this.f47057c = bVar;
    }

    @Override // z3.f0
    public final void a(f0 f0Var) {
        f0Var.getClass();
        t tVar = (t) f0Var;
        synchronized (v.f47063a) {
            this.f47057c = tVar.f47057c;
            this.f47058d = tVar.f47058d;
        }
    }

    @Override // z3.f0
    public final f0 b() {
        return new t(l.j().g(), this.f47057c);
    }

    @Override // z3.f0
    public final f0 c(long j9) {
        return new t(j9, this.f47057c);
    }
}
