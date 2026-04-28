package b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0.p f5171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0.k1 f5172c;

    public /* synthetic */ f(s0.p pVar, j jVar, e0.k1 k1Var, int i11) {
        this.f5170a = i11;
        this.f5171b = pVar;
        this.f5172c = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5170a) {
            case 0:
                this.f5171b.e(j.c(this.f5172c));
                break;
            default:
                this.f5171b.a(j.c(this.f5172c));
                break;
        }
    }
}
