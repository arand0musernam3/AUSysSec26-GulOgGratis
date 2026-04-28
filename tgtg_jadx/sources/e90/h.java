package e90;

import a3.m2;
import a90.t;
import a90.v;
import j4.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import v80.n2;
import wy.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15880c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f15881d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15882e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f15883f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15884g = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m2 f15886b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h(int i11, int i12) {
        this.f15885a = i11;
        if (i11 <= 0) {
            i4.a.i(s.f(i11, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i12 < 0 || i12 > i11) {
            i4.a.i(s.f(i11, "The number of acquired permits should be in 0.."));
            throw null;
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i11 - i12;
        this.f15886b = new m2(this, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r4.k(kotlin.Unit.f26487a, r3.f15886b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(z70.c r4) {
        /*
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = e90.h.f15884g
            int r1 = r0.getAndDecrement(r3)
            int r2 = r3.f15885a
            if (r1 > r2) goto L0
            if (r1 <= 0) goto Lf
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        Lf:
            x70.c r4 = y70.f.b(r4)
            v80.l r4 = v80.f0.u(r4)
            boolean r1 = r3.c(r4)     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L33
        L1d:
            int r1 = r0.getAndDecrement(r3)     // Catch: java.lang.Throwable -> L44
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2d
            kotlin.Unit r0 = kotlin.Unit.f26487a     // Catch: java.lang.Throwable -> L44
            a3.m2 r1 = r3.f15886b     // Catch: java.lang.Throwable -> L44
            r4.k(r0, r1)     // Catch: java.lang.Throwable -> L44
            goto L33
        L2d:
            boolean r1 = r3.c(r4)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L1d
        L33:
            java.lang.Object r4 = r4.s()
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            if (r4 != r0) goto L3c
            goto L3e
        L3c:
            kotlin.Unit r4 = kotlin.Unit.f26487a
        L3e:
            if (r4 != r0) goto L41
            return r4
        L41:
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        L44:
            r0 = move-exception
            r4.B()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e90.h.b(z70.c):java.lang.Object");
    }

    public final boolean c(n2 n2Var) {
        Object objA;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15882e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f15883f.getAndIncrement(this);
        f fVar = f.f15878a;
        long j9 = andIncrement / ((long) j.f15892f);
        loop0: while (true) {
            objA = a90.b.a(kVar, j9, fVar);
            if (!a90.g.f(objA)) {
                t tVarD = a90.g.d(objA);
                while (true) {
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f1048c >= tVarD.f1048c) {
                        break loop0;
                    }
                    if (!tVarD.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, tVarD)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (tVarD.f()) {
                                tVarD.e();
                            }
                        }
                    }
                    if (tVar.f()) {
                        tVar.e();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) a90.g.d(objA);
        AtomicReferenceArray atomicReferenceArray = kVar2.f15893e;
        int i11 = (int) (andIncrement % ((long) j.f15892f));
        while (!atomicReferenceArray.compareAndSet(i11, null, n2Var)) {
            if (atomicReferenceArray.get(i11) != null) {
                v vVar = j.f15888b;
                v vVar2 = j.f15889c;
                while (!atomicReferenceArray.compareAndSet(i11, vVar, vVar2)) {
                    if (atomicReferenceArray.get(i11) != vVar) {
                        return false;
                    }
                }
                ((v80.k) n2Var).k(Unit.f26487a, this.f15886b);
                return true;
            }
        }
        n2Var.a(kVar2, i11);
        return true;
    }

    public final void d() {
        int i11;
        Object objA;
        boolean zI;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15884g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i12 = this.f15885a;
            if (andIncrement >= i12) {
                do {
                    i11 = atomicIntegerFieldUpdater.get(this);
                    if (i11 <= i12) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, i12));
                o.n(i12, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15880c;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f15881d.getAndIncrement(this);
            long j9 = andIncrement2 / ((long) j.f15892f);
            g gVar = g.f15879a;
            while (true) {
                objA = a90.b.a(kVar, j9, gVar);
                if (a90.g.f(objA)) {
                    break;
                }
                t tVarD = a90.g.d(objA);
                while (true) {
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f1048c >= tVarD.f1048c) {
                        break;
                    }
                    if (!tVarD.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, tVarD)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (tVarD.f()) {
                                tVarD.e();
                            }
                        }
                    }
                    if (tVar.f()) {
                        tVar.e();
                    }
                }
            }
            k kVar2 = (k) a90.g.d(objA);
            kVar2.a();
            AtomicReferenceArray atomicReferenceArray = kVar2.f15893e;
            zI = false;
            if (kVar2.f1048c <= j9) {
                int i13 = (int) (andIncrement2 % ((long) j.f15892f));
                Object andSet = atomicReferenceArray.getAndSet(i13, j.f15888b);
                if (andSet == null) {
                    int i14 = j.f15887a;
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (atomicReferenceArray.get(i13) == j.f15889c) {
                            zI = true;
                            break;
                        }
                    }
                    v vVar = j.f15888b;
                    v vVar2 = j.f15890d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i13, vVar, vVar2)) {
                            if (atomicReferenceArray.get(i13) != vVar) {
                                break;
                            }
                        } else {
                            zI = true;
                            break;
                        }
                    }
                    zI = !zI;
                } else if (andSet != j.f15891e) {
                    if (andSet instanceof v80.k) {
                        v80.k kVar3 = (v80.k) andSet;
                        v vVarN = kVar3.n(Unit.f26487a, this.f15886b);
                        if (vVarN != null) {
                            kVar3.o(vVarN);
                            zI = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof d90.e)) {
                            org.bouncycastle.jce.provider.a.p(andSet, "unexpected: ");
                            return;
                        }
                        zI = ((d90.e) andSet).i(this, Unit.f26487a);
                    }
                }
            }
        } while (!zI);
    }
}
