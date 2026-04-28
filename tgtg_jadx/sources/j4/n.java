package j4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f24579b;

    public /* synthetic */ n(r rVar, int i11) {
        this.f24578a = i11;
        this.f24579b = rVar;
    }

    @Override // j4.j
    public final double a(double d3) {
        switch (this.f24578a) {
            case 0:
                return n80.p.a(this.f24579b.f24594k.a(d3), r10.f24588e, r10.f24589f);
            default:
                return this.f24579b.f24596n.a(n80.p.a(d3, r0.f24588e, r0.f24589f));
        }
    }
}
