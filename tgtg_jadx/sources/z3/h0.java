package z3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s3.b f47011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47012d;

    public h0(long j9, s3.b bVar) {
        super(j9);
        this.f47011c = bVar;
    }

    @Override // z3.f0
    public final void a(f0 f0Var) {
        synchronized (z.f47087a) {
            f0Var.getClass();
            this.f47011c = ((h0) f0Var).f47011c;
            this.f47012d = ((h0) f0Var).f47012d;
        }
    }

    @Override // z3.f0
    public final f0 b() {
        return new h0(l.j().g(), this.f47011c);
    }

    @Override // z3.f0
    public final f0 c(long j9) {
        return new h0(j9, this.f47011c);
    }
}
