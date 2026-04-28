package pz;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f35689e;

    public /* synthetic */ p(l lVar) {
        super(false, null, null);
        this.f35689e = lVar;
    }

    @Override // pz.q
    public final String a() {
        try {
            return (String) this.f35689e.call();
        } catch (Exception e5) {
            org.bouncycastle.jce.provider.a.m(e5);
            return null;
        }
    }
}
