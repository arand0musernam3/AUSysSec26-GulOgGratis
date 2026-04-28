package r0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f37504b;

    public /* synthetic */ p(q qVar, int i11) {
        this.f37503a = i11;
        this.f37504b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37503a) {
            case 0:
                q qVar = this.f37504b;
                qVar.f37508d = null;
                qVar.b();
                break;
            default:
                this.f37504b.b();
                break;
        }
    }
}
