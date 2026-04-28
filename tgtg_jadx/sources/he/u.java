package he;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f21973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f21974c;

    public /* synthetic */ u(z zVar, float f11, int i11) {
        this.f21972a = i11;
        this.f21973b = zVar;
        this.f21974c = f11;
    }

    @Override // he.x
    public final void run() {
        switch (this.f21972a) {
            case 0:
                z zVar = this.f21973b;
                k kVar = zVar.f21981a;
                float f11 = this.f21974c;
                if (kVar != null) {
                    ve.e eVar = zVar.f21982b;
                    eVar.k(eVar.f42261j, ve.g.f(kVar.l, kVar.f21937m, f11));
                } else {
                    zVar.f21987g.add(new u(zVar, f11, 0));
                }
                break;
            case 1:
                z zVar2 = this.f21973b;
                k kVar2 = zVar2.f21981a;
                float f12 = this.f21974c;
                if (kVar2 != null) {
                    zVar2.x((int) ve.g.f(kVar2.l, kVar2.f21937m, f12));
                } else {
                    zVar2.f21987g.add(new u(zVar2, f12, 1));
                }
                break;
            default:
                this.f21973b.z(this.f21974c);
                break;
        }
    }
}
