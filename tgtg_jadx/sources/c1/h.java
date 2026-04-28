package c1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f6878b;

    public /* synthetic */ h(n nVar, int i11) {
        this.f6877a = i11;
        this.f6878b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6877a) {
            case 0:
                w.b.U().execute(new h(this.f6878b, 1));
                break;
            default:
                n nVar = this.f6878b;
                if (!nVar.f6908n) {
                    nVar.d();
                }
                break;
        }
    }
}
