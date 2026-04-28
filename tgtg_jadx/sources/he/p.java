package he;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f21957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21958c;

    public /* synthetic */ p(z zVar, String str, int i11) {
        this.f21956a = i11;
        this.f21957b = zVar;
        this.f21958c = str;
    }

    @Override // he.x
    public final void run() {
        switch (this.f21956a) {
            case 0:
                this.f21957b.u(this.f21958c);
                break;
            case 1:
                this.f21957b.s(this.f21958c);
                break;
            default:
                this.f21957b.y(this.f21958c);
                break;
        }
    }
}
