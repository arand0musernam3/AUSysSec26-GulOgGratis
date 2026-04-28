package b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0.h1 f5421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0.k1 f5422c;

    public /* synthetic */ t0(e0.h1 h1Var, e0.k1 k1Var, int i11) {
        this.f5420a = i11;
        this.f5421b = h1Var;
        this.f5422c = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5420a) {
            case 0:
                this.f5421b.A(this.f5422c);
                break;
            case 1:
                this.f5421b.e(this.f5422c);
                break;
            default:
                this.f5421b.J(this.f5422c);
                break;
        }
    }
}
