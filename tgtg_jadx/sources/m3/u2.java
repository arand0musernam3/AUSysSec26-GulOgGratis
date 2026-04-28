package m3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends z3.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f29456c;

    public u2(long j9, Object obj) {
        super(j9);
        this.f29456c = obj;
    }

    @Override // z3.f0
    public final void a(z3.f0 f0Var) {
        f0Var.getClass();
        this.f29456c = ((u2) f0Var).f29456c;
    }

    @Override // z3.f0
    public final z3.f0 b() {
        return new u2(z3.l.j().g(), this.f29456c);
    }

    @Override // z3.f0
    public final z3.f0 c(long j9) {
        return new u2(z3.l.j().g(), this.f29456c);
    }
}
