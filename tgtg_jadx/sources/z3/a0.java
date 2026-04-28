package z3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q3.c f46971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46973e;

    public a0(long j9, q3.c cVar) {
        super(j9);
        this.f46971c = cVar;
    }

    @Override // z3.f0
    public final void a(f0 f0Var) {
        synchronized (s.f47056a) {
            f0Var.getClass();
            this.f46971c = ((a0) f0Var).f46971c;
            this.f46972d = ((a0) f0Var).f46972d;
            this.f46973e = ((a0) f0Var).f46973e;
        }
    }

    @Override // z3.f0
    public final f0 b() {
        return c(l.j().g());
    }

    @Override // z3.f0
    public final f0 c(long j9) {
        return new a0(j9, this.f46971c);
    }
}
