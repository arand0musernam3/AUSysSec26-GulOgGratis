package z20;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements a30.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u6.f f46946b;

    public /* synthetic */ d(u6.f fVar, int i11) {
        this.f46945a = i11;
        this.f46946b = fVar;
    }

    @Override // a30.c
    public final Object a() {
        switch (this.f46945a) {
            case 0:
                return new c(((l8.m) this.f46946b.f40820a).f27469a);
            default:
                return new k(((l8.m) this.f46946b.f40820a).f27469a);
        }
    }
}
