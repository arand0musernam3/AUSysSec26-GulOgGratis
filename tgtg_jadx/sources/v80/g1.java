package v80;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends k1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42099f = AtomicIntegerFieldUpdater.newUpdater(g1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final al.d f42100e;

    public g1(al.d dVar) {
        this.f42100e = dVar;
    }

    @Override // v80.k1
    public final boolean k() {
        return true;
    }

    @Override // v80.k1
    public final void l(Throwable th2) {
        if (f42099f.compareAndSet(this, 0, 1)) {
            this.f42100e.invoke(th2);
        }
    }
}
