package he;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f21960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21961c;

    public /* synthetic */ q(z zVar, int i11, int i12) {
        this.f21959a = i12;
        this.f21960b = zVar;
        this.f21961c = i11;
    }

    @Override // he.x
    public final void run() {
        switch (this.f21959a) {
            case 0:
                this.f21960b.q(this.f21961c);
                break;
            case 1:
                this.f21960b.r(this.f21961c);
                break;
            default:
                this.f21960b.x(this.f21961c);
                break;
        }
    }
}
