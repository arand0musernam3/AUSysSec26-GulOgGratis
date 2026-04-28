package m2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements a3.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2.w f29055b;

    public /* synthetic */ r(x2.w wVar, int i11) {
        this.f29054a = i11;
        this.f29055b = wVar;
    }

    @Override // a3.t
    public final long a() {
        switch (this.f29054a) {
            case 0:
                return this.f29055b.j(true).f43728b;
            case 1:
                return this.f29055b.p(true, true).f43728b;
            default:
                return this.f29055b.p(false, true).f43728b;
        }
    }
}
