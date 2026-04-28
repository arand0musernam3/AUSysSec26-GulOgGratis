package cc;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f7900b;

    public /* synthetic */ d(e eVar, int i11) {
        this.f7899a = i11;
        this.f7900b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7899a) {
            case 0:
                e eVar = this.f7900b;
                eVar.getClass();
                eVar.f7901a.getLifecycle().d(eVar);
                break;
            default:
                e eVar2 = this.f7900b;
                eVar2.getClass();
                eVar2.f7901a.getLifecycle().a(eVar2);
                break;
        }
    }
}
