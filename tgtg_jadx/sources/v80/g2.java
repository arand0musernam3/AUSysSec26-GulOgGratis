package v80;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g2 extends k1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42101g = AtomicIntegerFieldUpdater.newUpdater(g2.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Thread f42102e = Thread.currentThread();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r0 f42103f;

    public static void n(int i11) {
        throw new IllegalStateException(("Illegal state " + i11).toString());
    }

    @Override // v80.k1
    public final boolean k() {
        return true;
    }

    @Override // v80.k1
    public final void l(Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f42101g;
            i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 == 1 || i11 == 2 || i11 == 3) {
                    return;
                }
                n(i11);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 2));
        this.f42102e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void m() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42101g;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(i11);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i11, 1)) {
                r0 r0Var = this.f42103f;
                if (r0Var != null) {
                    r0Var.a();
                    return;
                }
                return;
            }
        }
    }
}
