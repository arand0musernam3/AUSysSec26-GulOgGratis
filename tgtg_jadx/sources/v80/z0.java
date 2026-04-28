package v80;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z0 extends u0 implements k0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42178f = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42179g = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42180h = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // v80.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long D0() {
        /*
            r10 = this;
            a90.v r0 = v80.f0.f42085c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = v80.z0.f42178f
            boolean r2 = r10.E0()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.G0()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof a90.o
            if (r6 == 0) goto L3e
            r6 = r2
            a90.o r6 = (a90.o) r6
            java.lang.Object r7 = r6.d()
            a90.v r8 = a90.o.f1039g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            a90.o r6 = r6.c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            kotlin.collections.t r2 = r10.f42166d
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof a90.o
            if (r2 == 0) goto L8d
            a90.o r1 = (a90.o) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = a90.o.f1038f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = v80.z0.f42179g
            java.lang.Object r0 = r0.get(r10)
            v80.y0 r0 = (v80.y0) r0
            if (r0 == 0) goto Lb8
            monitor-enter(r0)
            v80.x0[] r1 = r0.f1007a     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La5
            r2 = 0
            r5 = r1[r2]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r1 = move-exception
            goto Lb6
        La5:
            monitor-exit(r0)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.f42172a
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r0)
            throw r1
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: v80.z0.D0():long");
    }

    public void F0(Runnable runnable) {
        G0();
        if (!H0(runnable)) {
            g0.f42097i.F0(runnable);
            return;
        }
        Thread threadI0 = I0();
        if (Thread.currentThread() != threadI0) {
            LockSupport.unpark(threadI0);
        }
    }

    public final void G0() {
        x0 x0VarB;
        y0 y0Var = (y0) f42179g.get(this);
        if (y0Var == null || a90.a0.f1006b.get(y0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (y0Var) {
                try {
                    x0[] x0VarArr = y0Var.f1007a;
                    x0 x0Var = x0VarArr != null ? x0VarArr[0] : null;
                    if (x0Var != null) {
                        x0VarB = ((jNanoTime - x0Var.f42172a) > 0L ? 1 : ((jNanoTime - x0Var.f42172a) == 0L ? 0 : -1)) >= 0 ? H0(x0Var) : false ? y0Var.b(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (x0VarB != null);
    }

    public final boolean H0(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42178f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f42180h.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof a90.o)) {
                        if (obj != f0.f42085c) {
                            a90.o oVar = new a90.o(8, true);
                            oVar.a((Runnable) obj);
                            oVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    a90.o oVar2 = (a90.o) obj;
                    int iA = oVar2.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        a90.o oVarC = oVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA == 2) {
                        return false;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public abstract Thread I0();

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J0() {
        /*
            r7 = this;
            kotlin.collections.t r0 = r7.f42166d
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = v80.z0.f42179g
            java.lang.Object r0 = r0.get(r7)
            v80.y0 r0 = (v80.y0) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = a90.a0.f1006b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = v80.z0.f42178f
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof a90.o
            if (r3 == 0) goto L4f
            a90.o r0 = (a90.o) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = a90.o.f1038f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            a90.v r3 = v80.f0.f42085c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v80.z0.J0():boolean");
    }

    public void K0(long j9, x0 x0Var) {
        g0.f42097i.L0(j9, x0Var);
    }

    public r0 L(long j9, Runnable runnable, CoroutineContext coroutineContext) {
        return h0.f42105a.L(j9, runnable, coroutineContext);
    }

    public final void L0(long j9, x0 x0Var) {
        int iD;
        Thread threadI0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42179g;
        if (f42180h.get(this) == 1) {
            iD = 1;
        } else {
            y0 y0Var = (y0) atomicReferenceFieldUpdater.get(this);
            if (y0Var == null) {
                y0 y0Var2 = new y0();
                y0Var2.f42176c = j9;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, y0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                obj.getClass();
                y0Var = (y0) obj;
            }
            iD = x0Var.d(j9, y0Var, this);
        }
        if (iD != 0) {
            if (iD == 1) {
                K0(j9, x0Var);
                return;
            } else {
                if (iD == 2) {
                    return;
                }
                com.braze.h2.b("unexpected result");
                return;
            }
        }
        y0 y0Var3 = (y0) atomicReferenceFieldUpdater.get(this);
        if (y0Var3 != null) {
            synchronized (y0Var3) {
                x0[] x0VarArr = y0Var3.f1007a;
                x0Var = x0VarArr != null ? x0VarArr[0] : null;
            }
        }
        if (x0Var != x0Var || Thread.currentThread() == (threadI0 = I0())) {
            return;
        }
        LockSupport.unpark(threadI0);
    }

    @Override // v80.k0
    public final void r(long j9, l lVar) {
        long j11 = j9 > 0 ? j9 >= 9223372036854L ? LongCompanionObject.MAX_VALUE : 1000000 * j9 : 0L;
        if (j11 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            v0 v0Var = new v0(this, j11 + jNanoTime, lVar);
            L0(jNanoTime, v0Var);
            lVar.w(new i(v0Var, 2));
        }
    }

    @Override // v80.u0
    public void shutdown() {
        x0 x0VarB;
        f2.f42094a.set(null);
        f42180h.set(this, 1);
        a90.v vVar = f0.f42085c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42178f;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof a90.o)) {
                    if (obj != vVar) {
                        a90.o oVar = new a90.o(8, true);
                        oVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((a90.o) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, vVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (D0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            y0 y0Var = (y0) f42179g.get(this);
            if (y0Var == null) {
                return;
            }
            synchronized (y0Var) {
                x0VarB = a90.a0.f1006b.get(y0Var) > 0 ? y0Var.b(0) : null;
            }
            if (x0VarB == null) {
                return;
            } else {
                K0(jNanoTime, x0VarB);
            }
        }
    }

    @Override // v80.x
    public final void u0(CoroutineContext coroutineContext, Runnable runnable) {
        F0(runnable);
    }
}
