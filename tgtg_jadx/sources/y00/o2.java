package y00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f45040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f45041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f45042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t2 f45043e;

    public /* synthetic */ o2(t2 t2Var, b2 b2Var, long j9, boolean z11, int i11) {
        this.f45039a = i11;
        this.f45040b = b2Var;
        this.f45041c = j9;
        this.f45042d = z11;
        this.f45043e = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45039a) {
            case 0:
                t2 t2Var = this.f45043e;
                b2 b2Var = this.f45040b;
                t2Var.P(b2Var);
                t2Var.F(b2Var, this.f45041c, this.f45042d);
                break;
            default:
                t2 t2Var2 = this.f45043e;
                b2 b2Var2 = this.f45040b;
                t2Var2.P(b2Var2);
                t2Var2.F(b2Var2, this.f45041c, this.f45042d);
                break;
        }
    }
}
