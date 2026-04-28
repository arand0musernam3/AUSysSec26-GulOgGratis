package b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0.h1 f5403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0.k1 f5404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0.n f5406e;

    public /* synthetic */ s0(e0.h1 h1Var, e0.k1 k1Var, long j9, f0.n nVar, int i11) {
        this.f5402a = i11;
        this.f5403b = h1Var;
        this.f5404c = k1Var;
        this.f5405d = j9;
        this.f5406e = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5402a) {
            case 0:
                this.f5403b.L(this.f5404c, this.f5405d, this.f5406e);
                break;
            default:
                this.f5403b.G(this.f5404c, this.f5405d, this.f5406e);
                break;
        }
    }
}
