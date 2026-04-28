package c90;

import a90.r;
import a90.v;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import v80.f0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Executor, Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7823h = AtomicLongFieldUpdater.newUpdater(d.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7824i = AtomicLongFieldUpdater.newUpdater(d.class, "controlState$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7825j = AtomicIntegerFieldUpdater.newUpdater(d.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v f7826k = new v("NOT_IN_STACK", 0);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7829c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f7831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f7832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f7833g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public d(String str, int i11, int i12, long j9) {
        this.f7827a = i11;
        this.f7828b = i12;
        this.f7829c = j9;
        this.f7830d = str;
        if (i11 < 1) {
            i4.a.i(r8.k.h(i11, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i12 < i11) {
            i4.a.i(r8.k.k("Max pool size ", i12, i11, " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i12 > 2097150) {
            i4.a.i(r8.k.h(i12, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j9 <= 0) {
            i4.a.i(l1.e("Idle worker keep alive time ", j9, " must be positive"));
            throw null;
        }
        this.f7831e = new g();
        this.f7832f = new g();
        this.f7833g = new r((i11 + 1) * 2);
        this.controlState$volatile = ((long) i11) << 42;
    }

    public static /* synthetic */ void p(d dVar, Runnable runnable, int i11) {
        dVar.g(runnable, false, (i11 & 4) == 0);
    }

    public final int a() {
        synchronized (this.f7833g) {
            try {
                if (f7825j.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f7824i;
                long j9 = atomicLongFieldUpdater.get(this);
                int i11 = (int) (j9 & 2097151);
                int i12 = i11 - ((int) ((j9 & 4398044413952L) >> 21));
                if (i12 < 0) {
                    i12 = 0;
                }
                if (i12 >= this.f7827a) {
                    return 0;
                }
                if (i11 >= this.f7828b) {
                    return 0;
                }
                int i13 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i13 <= 0 || this.f7833g.b(i13) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                b bVar = new b(this, i13);
                this.f7833g.c(i13, bVar);
                if (i13 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i14 = i12 + 1;
                bVar.start();
                return i14;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = c90.d.f7825j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof c90.b
            r3 = 0
            if (r1 == 0) goto L17
            c90.b r0 = (c90.b) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            c90.d r1 = r0.f7822h
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            a90.r r1 = r8.f7833g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = c90.d.f7824i     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            a90.r r5 = r8.f7833g
            java.lang.Object r5 = r5.b(r1)
            r5.getClass()
            c90.b r5 = (c90.b) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            c90.m r5 = r5.f7815a
            c90.g r6 = r8.f7832f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = c90.m.f7849b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            c90.i r7 = (c90.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            c90.i r7 = r5.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            c90.g r1 = r8.f7832f
            r1.b()
            c90.g r1 = r8.f7831e
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            c90.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            c90.g r1 = r8.f7831e
            java.lang.Object r1 = r1.d()
            c90.i r1 = (c90.i) r1
            if (r1 != 0) goto Lb2
            c90.g r1 = r8.f7832f
            java.lang.Object r1 = r1.d()
            c90.i r1 = (c90.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            c90.c r1 = c90.c.TERMINATED
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = c90.d.f7823h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = c90.d.f7824i
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c90.d.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p(this, runnable, 6);
    }

    public final void g(Runnable runnable, boolean z11, boolean z12) {
        i jVar;
        c cVar;
        k.f7847f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f7839a = jNanoTime;
            jVar.f7840b = z11;
        } else {
            jVar = new j(runnable, jNanoTime, z11);
        }
        boolean z13 = jVar.f7840b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7824i;
        long jAddAndGet = z13 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        b bVar = threadCurrentThread instanceof b ? (b) threadCurrentThread : null;
        if (bVar == null || !Intrinsics.areEqual(bVar.f7822h, this)) {
            bVar = null;
        }
        if (bVar != null && (cVar = bVar.f7817c) != c.TERMINATED && (jVar.f7840b || cVar != c.BLOCKING)) {
            bVar.f7821g = true;
            m mVar = bVar.f7815a;
            if (z12) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f7849b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f7840b ? this.f7832f.a(jVar) : this.f7831e.a(jVar))) {
                throw new RejectedExecutionException(r8.k.p(new StringBuilder(), this.f7830d, " was terminated"));
            }
        }
        if (z13) {
            if (u() || t(jAddAndGet)) {
                return;
            }
            u();
            return;
        }
        if (u() || t(atomicLongFieldUpdater.get(this))) {
            return;
        }
        u();
    }

    public final void r(b bVar, int i11, int i12) {
        while (true) {
            long j9 = f7823h.get(this);
            int i13 = (int) (2097151 & j9);
            long j11 = (2097152 + j9) & (-2097152);
            if (i13 == i11) {
                if (i12 == 0) {
                    Object objC = bVar.c();
                    while (true) {
                        if (objC == f7826k) {
                            i13 = -1;
                            break;
                        }
                        if (objC == null) {
                            i13 = 0;
                            break;
                        }
                        b bVar2 = (b) objC;
                        int iB = bVar2.b();
                        if (iB != 0) {
                            i13 = iB;
                            break;
                        }
                        objC = bVar2.c();
                    }
                } else {
                    i13 = i12;
                }
            }
            if (i13 >= 0) {
                if (f7823h.compareAndSet(this, j9, ((long) i13) | j11)) {
                    return;
                }
            }
        }
    }

    public final boolean t(long j9) {
        int i11 = ((int) (2097151 & j9)) - ((int) ((j9 & 4398044413952L) >> 21));
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = this.f7827a;
        if (i11 < i12) {
            int iA = a();
            if (iA == 1 && i12 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        r rVar = this.f7833g;
        int iA = rVar.a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 1; i16 < iA; i16++) {
            b bVar = (b) rVar.b(i16);
            if (bVar != null) {
                m mVar = bVar.f7815a;
                mVar.getClass();
                int i17 = m.f7849b.get(mVar) != null ? (m.f7850c.get(mVar) - m.f7851d.get(mVar)) + 1 : m.f7850c.get(mVar) - m.f7851d.get(mVar);
                int i18 = a.$EnumSwitchMapping$0[bVar.f7817c.ordinal()];
                if (i18 == 1) {
                    i13++;
                } else if (i18 == 2) {
                    i12++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i17);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i18 == 3) {
                    i11++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i17);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i18 == 4) {
                    i14++;
                    if (i17 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i17);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i18 != 5) {
                        e40.a.f();
                        return null;
                    }
                    i15++;
                }
            }
        }
        long j9 = f7824i.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f7830d);
        sb5.append('@');
        sb5.append(f0.s(this));
        sb5.append("[Pool Size {core = ");
        int i19 = this.f7827a;
        sb5.append(i19);
        sb5.append(", max = ");
        e0.f.C(sb5, this.f7828b, "}, Worker States {CPU = ", i11, ", blocking = ");
        e0.f.C(sb5, i12, ", parked = ", i13, ", dormant = ");
        e0.f.C(sb5, i14, ", terminated = ", i15, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f7831e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f7832f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j9));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j9) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i19 - ((int) ((j9 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }

    public final boolean u() {
        v vVar;
        int iB;
        while (true) {
            long j9 = f7823h.get(this);
            b bVar = (b) this.f7833g.b((int) (2097151 & j9));
            if (bVar == null) {
                bVar = null;
            } else {
                long j11 = (2097152 + j9) & (-2097152);
                Object objC = bVar.c();
                while (true) {
                    vVar = f7826k;
                    if (objC == vVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    b bVar2 = (b) objC;
                    iB = bVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = bVar2.c();
                }
                if (iB >= 0) {
                    if (f7823h.compareAndSet(this, j9, ((long) iB) | j11)) {
                        bVar.g(vVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (bVar == null) {
                return false;
            }
            if (b.f7814i.compareAndSet(bVar, -1, 0)) {
                LockSupport.unpark(bVar);
                return true;
            }
        }
    }
}
