package o00;

import com.braze.Constants;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c1 extends ox.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31634d = AtomicReferenceFieldUpdater.newUpdater(i1.class, Thread.class, Constants.BRAZE_PUSH_CONTENT_KEY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31635e = AtomicReferenceFieldUpdater.newUpdater(i1.class, i1.class, "b");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31636f = AtomicReferenceFieldUpdater.newUpdater(j1.class, i1.class, "c");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31637g = AtomicReferenceFieldUpdater.newUpdater(j1.class, b1.class, "b");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31638h = AtomicReferenceFieldUpdater.newUpdater(j1.class, Object.class, Constants.BRAZE_PUSH_CONTENT_KEY);

    @Override // ox.h
    public final void W(i1 i1Var, Thread thread) {
        f31634d.lazySet(i1Var, thread);
    }

    @Override // ox.h
    public final void X(i1 i1Var, i1 i1Var2) {
        f31635e.lazySet(i1Var, i1Var2);
    }

    @Override // ox.h
    public final boolean Y(j1 j1Var, i1 i1Var, i1 i1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f31636f;
            if (atomicReferenceFieldUpdater.compareAndSet(j1Var, i1Var, i1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(j1Var) == i1Var);
        return false;
    }

    @Override // ox.h
    public final i1 Z(t1 t1Var) {
        return (i1) f31636f.getAndSet(t1Var, i1.f31678c);
    }

    @Override // ox.h
    public final b1 a0(t1 t1Var) {
        return (b1) f31637g.getAndSet(t1Var, b1.f31625b);
    }

    @Override // ox.h
    public final boolean b0(j1 j1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f31638h;
            if (atomicReferenceFieldUpdater.compareAndSet(j1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(j1Var) == obj);
        return false;
    }
}
