package o30;

import com.braze.Constants;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends w.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31892c = AtomicReferenceFieldUpdater.newUpdater(r.class, Thread.class, Constants.BRAZE_PUSH_CONTENT_KEY);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31893d = AtomicReferenceFieldUpdater.newUpdater(r.class, r.class, "b");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31894e = AtomicReferenceFieldUpdater.newUpdater(s.class, r.class, "c");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31895f = AtomicReferenceFieldUpdater.newUpdater(s.class, g.class, "b");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f31896g = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, Constants.BRAZE_PUSH_CONTENT_KEY);

    @Override // w.b
    public final g H(j jVar) {
        return (g) f31895f.getAndSet(jVar, g.f31883d);
    }

    @Override // w.b
    public final r I(j jVar) {
        return (r) f31894e.getAndSet(jVar, r.f31910c);
    }

    @Override // w.b
    public final void X(r rVar, r rVar2) {
        f31893d.lazySet(rVar, rVar2);
    }

    @Override // w.b
    public final void Y(r rVar, Thread thread) {
        f31892c.lazySet(rVar, thread);
    }

    @Override // w.b
    public final boolean v(j jVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f31895f;
            if (atomicReferenceFieldUpdater.compareAndSet(jVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(jVar) == gVar);
        return false;
    }

    @Override // w.b
    public final boolean w(s sVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f31896g;
            if (atomicReferenceFieldUpdater.compareAndSet(sVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(sVar) == obj);
        return false;
    }

    @Override // w.b
    public final boolean x(s sVar, r rVar, r rVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f31894e;
            if (atomicReferenceFieldUpdater.compareAndSet(sVar, rVar, rVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(sVar) == rVar);
        return false;
    }
}
