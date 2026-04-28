package m0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f28487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f28488c;

    public /* synthetic */ c1(g1 g1Var, j jVar, int i11) {
        this.f28486a = i11;
        this.f28487b = g1Var;
        this.f28488c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28486a) {
            case 0:
                this.f28487b.c(this.f28488c);
                break;
            default:
                this.f28487b.c(this.f28488c);
                break;
        }
    }
}
