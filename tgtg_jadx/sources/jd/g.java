package jd;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f24984a;

    public g(c cVar) {
        this.f24984a = cVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f24984a.close();
    }
}
