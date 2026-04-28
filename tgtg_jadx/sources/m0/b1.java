package m0;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f28473d;

    public b1(n0 n0Var) {
        super(n0Var);
        this.f28473d = new AtomicBoolean(false);
    }

    @Override // m0.f0, java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f28473d.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
