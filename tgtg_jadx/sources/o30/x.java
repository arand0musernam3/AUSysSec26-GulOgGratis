package o30;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends w0.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31934f = AtomicReferenceFieldUpdater.newUpdater(z.class, Set.class, "h");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f31935g = AtomicIntegerFieldUpdater.newUpdater(z.class, "i");

    @Override // w0.e
    public final void l(d0 d0Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f31934f;
            if (atomicReferenceFieldUpdater.compareAndSet(d0Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(d0Var) == null);
    }

    @Override // w0.e
    public final int t(d0 d0Var) {
        return f31935g.decrementAndGet(d0Var);
    }
}
