package ja;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f24773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f24774b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Throwable th2) {
        super(th2);
        eVar.getClass();
        this.f24773a = eVar;
        this.f24774b = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f24774b;
    }
}
