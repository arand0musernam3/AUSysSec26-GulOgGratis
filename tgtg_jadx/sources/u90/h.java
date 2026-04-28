package u90;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f40910a;

    public h(Throwable th2) {
        this.f40910a = new s(this, null, th2, 2);
    }

    @Override // u90.t
    public final t a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // u90.t
    public final o b() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // u90.t
    public final s c() {
        return this.f40910a;
    }

    @Override // u90.t, v90.d
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // u90.t
    public final s f() {
        return this.f40910a;
    }

    @Override // u90.t
    public final boolean isReady() {
        return false;
    }
}
