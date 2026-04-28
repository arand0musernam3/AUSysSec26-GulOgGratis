package y00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j3 extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f44878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m3 f44879f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3(m3 m3Var, n1 n1Var, int i11) {
        super(n1Var);
        this.f44878e = i11;
        this.f44879f = m3Var;
    }

    @Override // y00.n
    public final void a() {
        switch (this.f44878e) {
            case 0:
                m3 m3Var = this.f44879f;
                m3Var.p();
                if (m3Var.G()) {
                    w0 w0Var = ((n1) m3Var.f21216b).f44987f;
                    n1.m(w0Var);
                    w0Var.f45267o.a("Inactivity, disconnecting from the service");
                    m3Var.x();
                    break;
                }
                break;
            default:
                w0 w0Var2 = ((n1) this.f44879f.f21216b).f44987f;
                n1.m(w0Var2);
                w0Var2.f45263j.a("Tasks have been queued for a long time");
                break;
        }
    }
}
