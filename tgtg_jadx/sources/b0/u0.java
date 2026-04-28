package b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0.h1 f5435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0.k1 f5436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f5437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.r1 f5438e;

    public /* synthetic */ u0(e0.h1 h1Var, e0.k1 k1Var, long j9, e0.r1 r1Var, int i11) {
        this.f5434a = i11;
        this.f5435b = h1Var;
        this.f5436c = k1Var;
        this.f5437d = j9;
        this.f5438e = r1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5434a) {
            case 0:
                this.f5435b.H(this.f5436c, this.f5437d, (e0.j1) this.f5438e);
                break;
            default:
                this.f5435b.u(this.f5436c, this.f5437d, (f0.o) this.f5438e);
                break;
        }
    }
}
