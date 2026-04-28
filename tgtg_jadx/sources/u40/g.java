package u40;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d10.g f40760a;

    public g(d10.g gVar) {
        this.f40760a = gVar;
    }

    @Override // u40.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // u40.i
    public final boolean b(v40.b bVar) {
        v40.d dVar = bVar.f42007b;
        if (dVar != v40.d.UNREGISTERED && dVar != v40.d.REGISTERED && dVar != v40.d.REGISTER_ERROR) {
            return false;
        }
        this.f40760a.d(bVar.f42006a);
        return true;
    }
}
