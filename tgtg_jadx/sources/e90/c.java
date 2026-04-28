package e90;

import a90.v;
import com.braze.h2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15876h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c(boolean z11) {
        super(1, z11 ? 1 : 0);
        this.owner$volatile = z11 ? null : d.f15877a;
    }

    @Override // e90.a
    public final boolean a() {
        return Math.max(h.f15884g.get(this), 0) == 0;
    }

    @Override // e90.a
    public final void e(Object obj) {
        while (a()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15876h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            v vVar = d.f15877a;
            if (obj2 != vVar) {
                if (obj2 != obj && obj != null) {
                    e40.a.k("This mutex is locked by ", obj2, ", but ", obj, " is expected");
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, vVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                d();
                return;
            }
        }
        h2.b("This mutex is not locked");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r0.k(kotlin.Unit.f26487a, r3.f15886b);
     */
    @Override // e90.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(x70.c r4) {
        /*
            r3 = this;
            boolean r0 = r3.tryLock()
            if (r0 == 0) goto L9
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        L9:
            x70.c r4 = y70.f.b(r4)
            v80.l r4 = v80.f0.u(r4)
            e90.b r0 = new e90.b     // Catch: java.lang.Throwable -> L41
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L41
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = e90.h.f15884g     // Catch: java.lang.Throwable -> L41
            int r1 = r1.getAndDecrement(r3)     // Catch: java.lang.Throwable -> L41
            int r2 = r3.f15885a     // Catch: java.lang.Throwable -> L41
            if (r1 > r2) goto L16
            if (r1 <= 0) goto L2a
            kotlin.Unit r1 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L41
            a3.m2 r2 = r3.f15886b     // Catch: java.lang.Throwable -> L41
            r0.k(r1, r2)     // Catch: java.lang.Throwable -> L41
            goto L30
        L2a:
            boolean r1 = r3.c(r0)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L16
        L30:
            java.lang.Object r4 = r4.s()
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            if (r4 != r0) goto L39
            goto L3b
        L39:
            kotlin.Unit r4 = kotlin.Unit.f26487a
        L3b:
            if (r4 != r0) goto L3e
            return r4
        L3e:
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        L41:
            r0 = move-exception
            r4.B()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e90.c.g(x70.c):java.lang.Object");
    }

    public final String toString() {
        return "Mutex@" + f0.s(this) + "[isLocked=" + a() + ",owner=" + f15876h.get(this) + ']';
    }

    @Override // e90.a
    public final boolean tryLock() {
        int i11;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f15884g;
            int i12 = atomicIntegerFieldUpdater.get(this);
            int i13 = this.f15885a;
            if (i12 > i13) {
                do {
                    i11 = atomicIntegerFieldUpdater.get(this);
                    if (i11 > i13) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, i13));
            } else {
                if (i12 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i12, i12 - 1)) {
                    f15876h.set(this, null);
                    return true;
                }
            }
        }
    }
}
