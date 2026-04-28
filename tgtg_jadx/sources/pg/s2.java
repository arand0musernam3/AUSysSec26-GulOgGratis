package pg;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends a8.k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f35156s;

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f35156s = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f35156s != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a8.k
    public final boolean c0(int i11, Object obj) {
        return false;
    }

    public final void f0() {
        synchronized (this) {
            this.f35156s = 1L;
        }
        e0();
    }
}
