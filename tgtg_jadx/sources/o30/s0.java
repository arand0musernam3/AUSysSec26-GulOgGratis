package o30;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f31923a;

    public s0(t0 t0Var) {
        this.f31923a = t0Var;
    }

    public static void a(s0 s0Var, Thread thread) {
        s0Var.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f31923a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
