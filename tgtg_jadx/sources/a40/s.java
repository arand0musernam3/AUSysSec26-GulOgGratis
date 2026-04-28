package a40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f775d;

    public /* synthetic */ s(u uVar, long j9, String str, int i11) {
        this.f772a = i11;
        this.f773b = uVar;
        this.f774c = j9;
        this.f775d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f772a) {
            case 0:
                u uVar = this.f773b;
                uVar.f790o.f5743b.a(new s(uVar, this.f774c, this.f775d, 1));
                break;
            default:
                o oVar = this.f773b.f783g;
                w wVar = oVar.f759n;
                if (wVar == null || !wVar.f802e.get()) {
                    ((c40.d) oVar.f755i.f7066b).j(this.f774c, this.f775d);
                }
                break;
        }
    }
}
