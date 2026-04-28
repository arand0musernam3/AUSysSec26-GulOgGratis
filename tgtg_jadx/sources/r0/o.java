package r0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f37494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f37495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e6.l f37496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e6.l f37497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e6.i f37498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e6.i f37499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37500g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f37501h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x0.b f37502i;

    public o(f fVar, q qVar) {
        this.f37494a = fVar;
        this.f37495b = qVar;
        e6.i iVar = new e6.i();
        iVar.f15778c = new e6.n();
        e6.l lVar = new e6.l(iVar);
        iVar.f15777b = lVar;
        try {
            this.f37498e = iVar;
            iVar.f15776a = "CaptureCompleteFuture";
        } catch (Exception e5) {
            lVar.b(e5);
        }
        this.f37496c = lVar;
        e6.i iVar2 = new e6.i();
        iVar2.f15778c = new e6.n();
        e6.l lVar2 = new e6.l(iVar2);
        iVar2.f15777b = lVar2;
        try {
            this.f37499f = iVar2;
            iVar2.f15776a = "RequestCompleteFuture";
        } catch (Exception e11) {
            lVar2.b(e11);
        }
        this.f37497d = lVar2;
    }

    public final void a() {
        f fVar = this.f37494a;
        boolean z11 = fVar.f37460k;
        if (!z11 || fVar.a()) {
            if (!z11) {
                pd.g.n("The callback can only complete once.", !this.f37497d.f15782b.isDone());
            }
            this.f37499f.b(null);
        }
    }
}
