package c1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f6880b;

    public /* synthetic */ i(m mVar, int i11) {
        this.f6879a = i11;
        this.f6880b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6879a) {
            case 0:
                this.f6880b.a();
                break;
            case 1:
                this.f6880b.b();
                break;
            default:
                m mVar = this.f6880b;
                o oVar = mVar.f6895q;
                if (oVar != null) {
                    oVar.g();
                }
                if (mVar.f6894p == null) {
                    mVar.f6893o.c();
                }
                mVar.f6894p = null;
                break;
        }
    }
}
