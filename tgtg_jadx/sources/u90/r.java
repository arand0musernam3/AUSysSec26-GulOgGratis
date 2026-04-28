package u90;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f40975a;

    public r(o oVar) {
        oVar.getClass();
        this.f40975a = oVar;
    }

    @Override // u90.t
    public final t a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // u90.t
    public final o b() {
        return this.f40975a;
    }

    @Override // u90.t
    public final s c() {
        throw new IllegalStateException("already connected");
    }

    @Override // u90.t, v90.d
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // u90.t
    public final s f() {
        throw new IllegalStateException("already connected");
    }

    @Override // u90.t
    public final boolean isReady() {
        return true;
    }
}
