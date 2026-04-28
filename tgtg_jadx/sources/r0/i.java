package r0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ld.k f37464b;

    public /* synthetic */ i(ld.k kVar, int i11) {
        this.f37463a = i11;
        this.f37464b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37463a) {
            case 0:
                this.f37464b.l();
                break;
            case 1:
                ld.k kVar = this.f37464b;
                if (kVar != null) {
                    kVar.l();
                }
                break;
            case 2:
                ld.k kVar2 = this.f37464b;
                if (kVar2 != null) {
                    kVar2.l();
                }
                break;
            case 3:
                this.f37464b.l();
                break;
            default:
                this.f37464b.l();
                break;
        }
    }
}
