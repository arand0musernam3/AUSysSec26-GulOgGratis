package a40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cz.j f765c;

    public /* synthetic */ p(u uVar, cz.j jVar, int i11) {
        this.f763a = i11;
        this.f764b = uVar;
        this.f765c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f763a) {
            case 0:
                this.f764b.a(this.f765c);
                break;
            default:
                this.f764b.a(this.f765c);
                break;
        }
    }
}
