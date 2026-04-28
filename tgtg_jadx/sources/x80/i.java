package x80;

import com.braze.h2;
import com.google.firebase.messaging.a0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import v80.f0;
import v80.n2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class i implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f44043d = AtomicLongFieldUpdater.newUpdater(i.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f44044e = AtomicLongFieldUpdater.newUpdater(i.class, "receivers$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f44045f = AtomicLongFieldUpdater.newUpdater(i.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f44046g = AtomicLongFieldUpdater.newUpdater(i.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f44047h = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f44048i = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f44049j = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f44050k = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f44052b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tq.c f44053c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public i(int i11, Function1 function1) {
        this.f44051a = i11;
        this.f44052b = function1;
        if (i11 < 0) {
            i4.a.i(r8.k.h(i11, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        q qVar = k.f44055a;
        this.bufferEnd$volatile = i11 != 0 ? i11 != Integer.MAX_VALUE ? i11 : LongCompanionObject.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f44045f.get(this);
        q qVar2 = new q(0L, null, this, 3);
        this.sendSegment$volatile = qVar2;
        this.receiveSegment$volatile = qVar2;
        if (C()) {
            qVar2 = k.f44055a;
            qVar2.getClass();
        }
        this.bufferEndSegment$volatile = qVar2;
        this.f44053c = function1 != null ? new tq.c(this, 7) : null;
        this._closeCause$volatile = k.f44072s;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object F(x80.i r13, z70.c r14) {
        /*
            boolean r0 = r14 instanceof x80.g
            if (r0 == 0) goto L14
            r0 = r14
            x80.g r0 = (x80.g) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.l = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            x80.g r0 = new x80.g
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f44039j
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r6.l
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            ba0.g.M(r14)
            x80.p r14 = (x80.p) r14
            java.lang.Object r13 = r14.f44078a
            return r13
        L2d:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r13)
            r13 = 0
            return r13
        L34:
            ba0.g.M(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = x80.i.f44048i
            java.lang.Object r14 = r14.get(r13)
            x80.q r14 = (x80.q) r14
        L3f:
            boolean r1 = r13.z()
            if (r1 == 0) goto L4f
            java.lang.Throwable r13 = r13.s()
            x80.n r14 = new x80.n
            r14.<init>(r13)
            return r14
        L4f:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = x80.i.f44044e
            long r4 = r1.getAndIncrement(r13)
            int r1 = x80.k.f44056b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.f1048c
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L6c
            x80.q r1 = r13.r(r9, r14)
            if (r1 != 0) goto L6a
            goto L3f
        L6a:
            r8 = r1
            goto L6d
        L6c:
            r8 = r14
        L6d:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.K(r8, r9, r10, r12)
            r1 = r7
            a90.v r14 = x80.k.f44066m
            if (r13 == r14) goto L9f
            a90.v r14 = x80.k.f44068o
            if (r13 != r14) goto L8c
            long r13 = r1.w()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L89
            r8.a()
        L89:
            r13 = r1
            r14 = r8
            goto L3f
        L8c:
            a90.v r14 = x80.k.f44067n
            if (r13 != r14) goto L9b
            r6.l = r2
            r2 = r8
            java.lang.Object r13 = r1.G(r2, r3, r4, r6)
            if (r13 != r0) goto L9a
            return r0
        L9a:
            return r13
        L9b:
            r8.a()
            return r13
        L9f:
            java.lang.String r13 = "unexpected"
            com.braze.h2.b(r13)
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: x80.i.F(x80.i, z70.c):java.lang.Object");
    }

    public static final q g(i iVar, long j9, q qVar) {
        Object objA;
        i iVar2;
        q qVar2 = k.f44055a;
        j jVar = j.f44054a;
        loop0: while (true) {
            objA = a90.b.a(qVar, j9, jVar);
            if (!a90.g.f(objA)) {
                a90.t tVarD = a90.g.d(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44047h;
                    a90.t tVar = (a90.t) atomicReferenceFieldUpdater.get(iVar);
                    if (tVar.f1048c >= tVarD.f1048c) {
                        break loop0;
                    }
                    if (!tVarD.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(iVar, tVar, tVarD)) {
                        if (atomicReferenceFieldUpdater.get(iVar) != tVar) {
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
        boolean zF = a90.g.f(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f44044e;
        if (zF) {
            iVar.A();
            if (qVar.f1048c * ((long) k.f44056b) < atomicLongFieldUpdater.get(iVar)) {
                qVar.a();
                return null;
            }
        } else {
            q qVar3 = (q) a90.g.d(objA);
            long j11 = qVar3.f1048c;
            if (j11 <= j9) {
                return qVar3;
            }
            long j12 = ((long) k.f44056b) * j11;
            while (true) {
                long j13 = f44043d.get(iVar);
                long j14 = 1152921504606846975L & j13;
                if (j14 >= j12) {
                    iVar2 = iVar;
                    break;
                }
                iVar2 = iVar;
                if (f44043d.compareAndSet(iVar2, j13, (((long) ((int) (j13 >> 60))) << 60) + j14)) {
                    break;
                }
                iVar = iVar2;
            }
            if (j11 * ((long) k.f44056b) < atomicLongFieldUpdater.get(iVar2)) {
                qVar3.a();
            }
        }
        return null;
    }

    public static final void i(i iVar, Object obj, v80.l lVar) {
        Function1 function1 = iVar.f44052b;
        if (function1 != null) {
            a90.g.a(function1, obj, lVar.f42119e);
        }
        Throwable thV = iVar.v();
        u70.o oVar = u70.q.f40850b;
        lVar.resumeWith(new u70.p(thV));
    }

    public static final void j(i iVar, d90.e eVar) {
        q qVar;
        i iVar2;
        d90.e eVar2;
        int i11;
        iVar.getClass();
        q qVar2 = (q) f44048i.get(iVar);
        while (!iVar.z()) {
            long andIncrement = f44044e.getAndIncrement(iVar);
            long j9 = k.f44056b;
            long j11 = andIncrement / j9;
            int i12 = (int) (andIncrement % j9);
            if (qVar2.f1048c != j11) {
                q qVarR = iVar.r(j11, qVar2);
                if (qVarR == null) {
                    continue;
                } else {
                    qVar = qVarR;
                    eVar2 = eVar;
                    i11 = i12;
                    iVar2 = iVar;
                }
            } else {
                qVar = qVar2;
                iVar2 = iVar;
                eVar2 = eVar;
                i11 = i12;
            }
            Object objK = iVar2.K(qVar, i11, andIncrement, eVar2);
            qVar2 = qVar;
            if (objK == k.f44066m) {
                d90.e eVar3 = eVar2 != null ? eVar2 : null;
                if (eVar3 != null) {
                    eVar3.f14783c = qVar2;
                    eVar3.f14784d = i11;
                    return;
                }
                return;
            }
            if (objK != k.f44068o) {
                if (objK == k.f44067n) {
                    h2.b("unexpected");
                    return;
                } else {
                    qVar2.a();
                    eVar2.f14785e = objK;
                    return;
                }
            }
            if (andIncrement < iVar2.w()) {
                qVar2.a();
            }
            iVar = iVar2;
            eVar = eVar2;
        }
        eVar.f14785e = k.l;
    }

    public static final int k(i iVar, q qVar, int i11, Object obj, long j9, Object obj2, boolean z11) {
        qVar.n(i11, obj);
        if (z11) {
            return iVar.L(qVar, i11, obj, j9, obj2, z11);
        }
        Object objL = qVar.l(i11);
        if (objL == null) {
            if (iVar.l(j9)) {
                if (qVar.k(i11, null, k.f44058d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (qVar.k(i11, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof n2) {
            qVar.n(i11, null);
            if (iVar.I(objL, obj)) {
                qVar.o(i11, k.f44063i);
                return 0;
            }
            a90.v vVar = k.f44065k;
            if (qVar.f44080f.getAndSet((i11 * 2) + 1, vVar) == vVar) {
                return 5;
            }
            qVar.m(i11, true);
            return 5;
        }
        return iVar.L(qVar, i11, obj, j9, obj2, z11);
    }

    public static void x(i iVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f44046g;
        if ((atomicLongFieldUpdater.addAndGet(iVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(iVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A() {
        return y(f44043d.get(this), false);
    }

    public boolean B() {
        return false;
    }

    public final boolean C() {
        long j9 = f44045f.get(this);
        return j9 == 0 || j9 == LongCompanionObject.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(long r5, x80.q r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f1048c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            a90.c r0 = r7.c()
            x80.q r0 = (x80.q) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            a90.c r5 = r7.c()
            x80.q r5 = (x80.q) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = x80.i.f44049j
            java.lang.Object r6 = r5.get(r4)
            a90.t r6 = (a90.t) r6
            long r0 = r6.f1048c
            long r2 = r7.f1048c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: x80.i.D(long, x80.q):void");
    }

    public final Object E(Object obj, x70.c cVar) {
        UndeliveredElementException undeliveredElementExceptionB;
        v80.l lVar = new v80.l(1, y70.f.b(cVar));
        lVar.t();
        Function1 function1 = this.f44052b;
        if (function1 == null || (undeliveredElementExceptionB = a90.g.b(function1, obj, null)) == null) {
            Throwable thV = v();
            u70.o oVar = u70.q.f40850b;
            lVar.resumeWith(new u70.p(thV));
        } else {
            u70.e.a(undeliveredElementExceptionB, v());
            u70.o oVar2 = u70.q.f40850b;
            lVar.resumeWith(new u70.p(undeliveredElementExceptionB));
        }
        Object objS = lVar.s();
        return objS == y70.a.COROUTINE_SUSPENDED ? objS : Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(x80.q r17, int r18, long r19, z70.c r21) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x80.i.G(x80.q, int, long, z70.c):java.lang.Object");
    }

    public final void H(n2 n2Var, boolean z11) {
        if (n2Var instanceof v80.k) {
            x70.c cVar = (x70.c) n2Var;
            u70.o oVar = u70.q.f40850b;
            cVar.resumeWith(new u70.p(z11 ? u() : v()));
            return;
        }
        if (n2Var instanceof v) {
            v80.l lVar = ((v) n2Var).f44085a;
            u70.o oVar2 = u70.q.f40850b;
            lVar.resumeWith(new p(new n(s())));
            return;
        }
        if (!(n2Var instanceof b)) {
            if (n2Var instanceof d90.e) {
                ((d90.e) n2Var).i(this, k.l);
                return;
            } else {
                org.bouncycastle.jce.provider.a.p(n2Var, "Unexpected waiter: ");
                return;
            }
        }
        b bVar = (b) n2Var;
        v80.l lVar2 = bVar.f44033b;
        lVar2.getClass();
        bVar.f44033b = null;
        bVar.f44032a = k.l;
        Throwable thS = bVar.f44034c.s();
        if (thS == null) {
            u70.o oVar3 = u70.q.f40850b;
            lVar2.resumeWith(Boolean.FALSE);
        } else {
            u70.o oVar4 = u70.q.f40850b;
            lVar2.resumeWith(new u70.p(thS));
        }
    }

    public final boolean I(Object obj, Object obj2) {
        if (obj instanceof d90.e) {
            return ((d90.e) obj).i(this, obj2);
        }
        boolean z11 = obj instanceof v;
        Function1 function1 = this.f44052b;
        if (z11) {
            return k.a(((v) obj).f44085a, new p(obj2), function1 != null ? new c5.q(this, 5) : null);
        }
        if (!(obj instanceof b)) {
            if (obj instanceof v80.k) {
                return k.a((v80.k) obj, obj2, function1 != null ? new c5.q(this, 4) : null);
            }
            org.bouncycastle.jce.provider.a.p(obj, "Unexpected receiver type: ");
            return false;
        }
        b bVar = (b) obj;
        v80.l lVar = bVar.f44033b;
        lVar.getClass();
        bVar.f44033b = null;
        bVar.f44032a = obj2;
        Boolean bool = Boolean.TRUE;
        Function1 function12 = bVar.f44034c.f44052b;
        return k.a(lVar, bool, function12 != null ? new oo.s(12, obj2, function12) : null);
    }

    public final boolean J(Object obj, q qVar, int i11) {
        d90.h hVar;
        if (obj instanceof v80.k) {
            return k.a((v80.k) obj, Unit.f26487a, null);
        }
        if (!(obj instanceof d90.e)) {
            org.bouncycastle.jce.provider.a.p(obj, "Unexpected waiter: ");
            return false;
        }
        int iJ = ((d90.e) obj).j(this, Unit.f26487a);
        if (iJ == 0) {
            hVar = d90.h.SUCCESSFUL;
        } else if (iJ == 1) {
            hVar = d90.h.REREGISTER;
        } else if (iJ == 2) {
            hVar = d90.h.CANCELLED;
        } else {
            if (iJ != 3) {
                wy.o.n(iJ, "Unexpected internal result: ");
                return false;
            }
            hVar = d90.h.ALREADY_SELECTED;
        }
        if (hVar == d90.h.REREGISTER) {
            qVar.n(i11, null);
        }
        return hVar == d90.h.SUCCESSFUL;
    }

    public final Object K(q qVar, int i11, long j9, Object obj) {
        Object objL = qVar.l(i11);
        AtomicReferenceArray atomicReferenceArray = qVar.f44080f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f44043d;
        if (objL == null) {
            if (j9 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return k.f44067n;
                }
                if (qVar.k(i11, objL, obj)) {
                    q();
                    return k.f44066m;
                }
            }
        } else if (objL == k.f44058d && qVar.k(i11, objL, k.f44063i)) {
            q();
            Object obj2 = atomicReferenceArray.get(i11 * 2);
            qVar.n(i11, null);
            return obj2;
        }
        while (true) {
            Object objL2 = qVar.l(i11);
            if (objL2 == null || objL2 == k.f44059e) {
                if (j9 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (qVar.k(i11, objL2, k.f44062h)) {
                        q();
                        return k.f44068o;
                    }
                } else {
                    if (obj == null) {
                        return k.f44067n;
                    }
                    if (qVar.k(i11, objL2, obj)) {
                        q();
                        return k.f44066m;
                    }
                }
            } else if (objL2 != k.f44058d) {
                a90.v vVar = k.f44064j;
                if (objL2 == vVar) {
                    return k.f44068o;
                }
                if (objL2 == k.f44062h) {
                    return k.f44068o;
                }
                if (objL2 == k.l) {
                    q();
                    return k.f44068o;
                }
                if (objL2 != k.f44061g && qVar.k(i11, objL2, k.f44060f)) {
                    boolean z11 = objL2 instanceof y;
                    if (z11) {
                        objL2 = ((y) objL2).f44086a;
                    }
                    if (J(objL2, qVar, i11)) {
                        qVar.o(i11, k.f44063i);
                        q();
                        Object obj3 = atomicReferenceArray.get(i11 * 2);
                        qVar.n(i11, null);
                        return obj3;
                    }
                    qVar.o(i11, vVar);
                    qVar.i();
                    if (z11) {
                        q();
                    }
                    return k.f44068o;
                }
            } else if (qVar.k(i11, objL2, k.f44063i)) {
                q();
                Object obj4 = atomicReferenceArray.get(i11 * 2);
                qVar.n(i11, null);
                return obj4;
            }
        }
    }

    public final int L(q qVar, int i11, Object obj, long j9, Object obj2, boolean z11) {
        while (true) {
            Object objL = qVar.l(i11);
            if (objL == null) {
                if (!l(j9) || z11) {
                    if (z11) {
                        if (qVar.k(i11, null, k.f44064j)) {
                            qVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (qVar.k(i11, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (qVar.k(i11, null, k.f44058d)) {
                    break;
                }
            } else {
                if (objL != k.f44059e) {
                    a90.v vVar = k.f44065k;
                    if (objL == vVar) {
                        qVar.n(i11, null);
                        return 5;
                    }
                    if (objL == k.f44062h) {
                        qVar.n(i11, null);
                        return 5;
                    }
                    if (objL == k.l) {
                        qVar.n(i11, null);
                        A();
                        return 4;
                    }
                    qVar.n(i11, null);
                    if (objL instanceof y) {
                        objL = ((y) objL).f44086a;
                    }
                    if (I(objL, obj)) {
                        qVar.o(i11, k.f44063i);
                        return 0;
                    }
                    if (qVar.f44080f.getAndSet((i11 * 2) + 1, vVar) != vVar) {
                        qVar.m(i11, true);
                    }
                    return 5;
                }
                if (qVar.k(i11, objL, k.f44058d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void M(long j9) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        i iVar = this;
        if (iVar.C()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f44045f;
            if (atomicLongFieldUpdater.get(iVar) > j9) {
                break;
            } else {
                iVar = this;
            }
        }
        int i11 = k.f44057c;
        int i12 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f44046g;
            if (i12 < i11) {
                long j11 = atomicLongFieldUpdater.get(iVar);
                if (j11 == (4611686018427387903L & atomicLongFieldUpdater2.get(iVar)) && j11 == atomicLongFieldUpdater.get(iVar)) {
                    return;
                } else {
                    i12++;
                }
            } else {
                while (true) {
                    long j12 = atomicLongFieldUpdater2.get(iVar);
                    if (atomicLongFieldUpdater2.compareAndSet(iVar, j12, (j12 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        iVar = this;
                    }
                }
                while (true) {
                    long j13 = atomicLongFieldUpdater.get(iVar);
                    long j14 = atomicLongFieldUpdater2.get(iVar);
                    long j15 = j14 & 4611686018427387903L;
                    boolean z11 = (j14 & 4611686018427387904L) != 0;
                    if (j13 == j15 && j13 == atomicLongFieldUpdater.get(iVar)) {
                        break;
                    }
                    if (z11) {
                        iVar = this;
                    } else {
                        iVar = this;
                        atomicLongFieldUpdater2.compareAndSet(iVar, j14, 4611686018427387904L + j15);
                    }
                }
                while (true) {
                    long j16 = atomicLongFieldUpdater2.get(iVar);
                    if (atomicLongFieldUpdater2.compareAndSet(iVar, j16, j16 & 4611686018427387903L)) {
                        return;
                    } else {
                        iVar = this;
                    }
                }
            }
        }
    }

    @Override // x80.w
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        n(cancellationException, true);
    }

    @Override // x80.w
    public final Object b(x70.c cVar) {
        q qVar;
        Throwable th2;
        long andIncrement;
        long j9;
        int i11;
        q qVar2;
        i iVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44048i;
        q qVar3 = (q) atomicReferenceFieldUpdater.get(this);
        while (!z()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f44044e;
            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = k.f44056b;
            long j12 = andIncrement2 / j11;
            int i12 = (int) (andIncrement2 % j11);
            if (qVar3.f1048c != j12) {
                q qVarR = r(j12, qVar3);
                if (qVarR == null) {
                    continue;
                } else {
                    qVar = qVarR;
                }
            } else {
                qVar = qVar3;
            }
            Object objK = K(qVar, i12, andIncrement2, null);
            a90.v vVar = k.f44066m;
            c5.q qVar4 = null;
            if (objK == vVar) {
                h2.b("unexpected");
                return null;
            }
            a90.v vVar2 = k.f44068o;
            if (objK == vVar2) {
                if (andIncrement2 < w()) {
                    qVar.a();
                }
                qVar3 = qVar;
            } else {
                if (objK != k.f44067n) {
                    qVar.a();
                    return objK;
                }
                v80.l lVarU = f0.u(y70.f.b(cVar));
                i iVar2 = this;
                try {
                    Object objK2 = iVar2.K(qVar, i12, andIncrement2, lVarU);
                    if (objK2 == vVar) {
                        lVarU.a(qVar, i12);
                    } else {
                        Function1 function1 = iVar2.f44052b;
                        if (objK2 == vVar2) {
                            if (andIncrement2 < w()) {
                                qVar.a();
                            }
                            q qVar5 = (q) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (z()) {
                                    u70.o oVar = u70.q.f40850b;
                                    lVarU.resumeWith(new u70.p(u()));
                                    break;
                                }
                                v80.l lVar = lVarU;
                                try {
                                    andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j13 = k.f44056b;
                                    j9 = andIncrement / j13;
                                    i11 = (int) (andIncrement % j13);
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                try {
                                    if (qVar5.f1048c != j9) {
                                        try {
                                            q qVarR2 = r(j9, qVar5);
                                            if (qVarR2 == null) {
                                                lVarU = lVar;
                                            } else {
                                                qVar2 = qVarR2;
                                            }
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            lVarU = lVar;
                                            lVarU.B();
                                            throw th2;
                                        }
                                    } else {
                                        qVar2 = qVar5;
                                    }
                                    objK2 = iVar.K(qVar2, i11, andIncrement, lVar);
                                    iVar2 = iVar;
                                    q qVar6 = qVar2;
                                    lVarU = lVar;
                                    if (objK2 == k.f44066m) {
                                        lVarU.a(qVar6, i11);
                                        break;
                                    }
                                    if (objK2 == k.f44068o) {
                                        if (andIncrement < w()) {
                                            qVar6.a();
                                        }
                                        qVar5 = qVar6;
                                    } else {
                                        if (objK2 == k.f44067n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        qVar6.a();
                                        if (function1 != null) {
                                            qVar4 = new c5.q(this, 4);
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    lVarU = lVar;
                                    th2 = th;
                                    lVarU.B();
                                    throw th2;
                                }
                                iVar = iVar2;
                            }
                        } else {
                            qVar.a();
                            if (function1 != null) {
                                qVar4 = new c5.q(this, 4);
                            }
                        }
                        lVarU.k(objK2, qVar4);
                    }
                    Object objS = lVarU.s();
                    y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                    return objS;
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        }
        Throwable thU = u();
        int i13 = a90.u.f1049a;
        throw thU;
    }

    @Override // x80.w
    public final a0 c() {
        e eVar = e.f44037a;
        eVar.getClass();
        i80.n nVar = (i80.n) TypeIntrinsics.beforeCheckcastToFunctionOfArity(eVar, 3);
        f fVar = f.f44038a;
        fVar.getClass();
        return new a0(6, this, nVar, (i80.n) TypeIntrinsics.beforeCheckcastToFunctionOfArity(fVar, 3), this.f44053c);
    }

    @Override // x80.w
    public final Object d() {
        q qVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f44044e;
        long j9 = atomicLongFieldUpdater.get(this);
        long j11 = f44043d.get(this);
        if (y(j11, true)) {
            return new n(s());
        }
        long j12 = j11 & 1152921504606846975L;
        o oVar = p.f44077b;
        if (j9 >= j12) {
            return oVar;
        }
        Object obj = k.f44065k;
        q qVar2 = (q) f44048i.get(this);
        while (!z()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j13 = k.f44056b;
            long j14 = andIncrement / j13;
            int i11 = (int) (andIncrement % j13);
            if (qVar2.f1048c != j14) {
                q qVarR = r(j14, qVar2);
                if (qVarR == null) {
                    continue;
                } else {
                    qVar = qVarR;
                }
            } else {
                qVar = qVar2;
            }
            Object objK = K(qVar, i11, andIncrement, obj);
            q qVar3 = qVar;
            if (objK == k.f44066m) {
                n2 n2Var = obj instanceof n2 ? (n2) obj : null;
                if (n2Var != null) {
                    n2Var.a(qVar3, i11);
                }
                M(andIncrement);
                qVar3.i();
                return oVar;
            }
            if (objK != k.f44068o) {
                if (objK != k.f44067n) {
                    qVar3.a();
                    return objK;
                }
                h2.b("unexpected");
                return null;
            }
            if (andIncrement < w()) {
                qVar3.a();
            }
            qVar2 = qVar3;
        }
        return new n(s());
    }

    @Override // x80.w
    public final Object e(z80.o oVar) {
        return F(this, oVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x018f, code lost:
    
        return kotlin.Unit.f26487a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        i(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0173 A[RETURN] */
    @Override // x80.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.lang.Object r23, x70.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x80.i.f(java.lang.Object, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be A[SYNTHETIC] */
    @Override // x80.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = x80.i.f44043d
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.y(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.l(r1)
            r1 = r1 ^ r10
        L1b:
            x80.o r13 = x80.p.f44077b
            if (r1 == 0) goto L20
            return r13
        L20:
            a90.v r6 = x80.k.f44064j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = x80.i.f44047h
            java.lang.Object r1 = r1.get(r15)
            x80.q r1 = (x80.q) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.y(r2, r9)
            int r14 = x80.k.f44056b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f1048c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            x80.q r3 = g(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.v()
            x80.n r2 = new x80.n
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = k(r0, r1, r2, r3, r4, r6, r7)
            if (r9 == 0) goto Lbe
            r3 = 1
            if (r9 == r3) goto Lbb
            r10 = 2
            if (r9 == r10) goto L9a
            r2 = 3
            if (r9 == r2) goto L93
            r2 = 4
            if (r9 == r2) goto L7c
            r2 = 5
            if (r9 == r2) goto L76
            goto L79
        L76:
            r1.a()
        L79:
            r10 = r3
            r9 = 0
            goto L56
        L7c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = x80.i.f44044e
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L89
            r1.a()
        L89:
            java.lang.Throwable r1 = r15.v()
            x80.n r2 = new x80.n
            r2.<init>(r1)
            return r2
        L93:
            java.lang.String r1 = "unexpected"
            com.braze.h2.b(r1)
            r1 = 0
            return r1
        L9a:
            if (r7 == 0) goto La9
            r1.i()
            java.lang.Throwable r1 = r15.v()
            x80.n r2 = new x80.n
            r2.<init>(r1)
            return r2
        La9:
            boolean r3 = r6 instanceof v80.n2
            if (r3 == 0) goto Lb0
            v80.n2 r6 = (v80.n2) r6
            goto Lb1
        Lb0:
            r6 = 0
        Lb1:
            if (r6 == 0) goto Lb7
            int r2 = r2 + r14
            r6.a(r1, r2)
        Lb7:
            r1.i()
            return r13
        Lbb:
            kotlin.Unit r1 = kotlin.Unit.f26487a
            return r1
        Lbe:
            r1.a()
            kotlin.Unit r1 = kotlin.Unit.f26487a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x80.i.h(java.lang.Object):java.lang.Object");
    }

    @Override // x80.w
    public final b iterator() {
        return new b(this);
    }

    public final boolean l(long j9) {
        return j9 < f44045f.get(this) || j9 < f44044e.get(this) + ((long) this.f44051a);
    }

    public final boolean m(Throwable th2) {
        return n(th2, false);
    }

    public final boolean n(Throwable th2, boolean z11) {
        i iVar;
        boolean z12;
        long j9;
        long j11;
        long j12;
        Object obj;
        long j13;
        long j14;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f44043d;
        if (!z11) {
            iVar = this;
            break;
        }
        do {
            j14 = atomicLongFieldUpdater.get(this);
            if (((int) (j14 >> 60)) != 0) {
                iVar = this;
                break;
            }
            q qVar = k.f44055a;
            iVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(iVar, j14, (j14 & 1152921504606846975L) + (((long) 1) << 60)));
        a90.v vVar = k.f44072s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44050k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, th2)) {
                z12 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != vVar) {
                z12 = false;
                break;
            }
        }
        if (z11) {
            do {
                j13 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(iVar, j13, (((long) 3) << 60) + (j13 & 1152921504606846975L)));
        } else {
            do {
                j9 = atomicLongFieldUpdater.get(this);
                int i11 = (int) (j9 >> 60);
                if (i11 == 0) {
                    j11 = j9 & 1152921504606846975L;
                    j12 = 2;
                } else {
                    if (i11 != 1) {
                        break;
                    }
                    j11 = j9 & 1152921504606846975L;
                    j12 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(iVar, j9, (j12 << 60) + j11));
        }
        A();
        if (z12) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l;
                obj = atomicReferenceFieldUpdater2.get(this);
                a90.v vVar2 = obj == null ? k.f44070q : k.f44071r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, vVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                ((Function1) obj).invoke(s());
                return z12;
            }
        }
        return z12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (x80.q) ((a90.c) a90.c.f1014b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x80.q o(long r13) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x80.i.o(long):x80.q");
    }

    public final void p(long j9) {
        UndeliveredElementException undeliveredElementExceptionB;
        q qVar = (q) f44048i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f44044e;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j9 < Math.max(((long) this.f44051a) + j11, f44045f.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, 1 + j11)) {
                long j12 = k.f44056b;
                long j13 = j11 / j12;
                int i11 = (int) (j11 % j12);
                if (qVar.f1048c != j13) {
                    q qVarR = r(j13, qVar);
                    if (qVarR == null) {
                        continue;
                    } else {
                        qVar = qVarR;
                    }
                }
                q qVar2 = qVar;
                Object objK = K(qVar2, i11, j11, null);
                if (objK != k.f44068o) {
                    qVar2.a();
                    Function1 function1 = this.f44052b;
                    if (function1 != null && (undeliveredElementExceptionB = a90.g.b(function1, objK, null)) != null) {
                        throw undeliveredElementExceptionB;
                    }
                } else if (j11 < w()) {
                    qVar2.a();
                }
                qVar = qVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017d, code lost:
    
        x(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0180, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x80.i.q():void");
    }

    public final q r(long j9, q qVar) {
        Object objA;
        long j11;
        q qVar2 = k.f44055a;
        j jVar = j.f44054a;
        loop0: while (true) {
            objA = a90.b.a(qVar, j9, jVar);
            if (!a90.g.f(objA)) {
                a90.t tVarD = a90.g.d(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44048i;
                    a90.t tVar = (a90.t) atomicReferenceFieldUpdater.get(this);
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
        if (a90.g.f(objA)) {
            A();
            if (qVar.f1048c * ((long) k.f44056b) < w()) {
                qVar.a();
                return null;
            }
        } else {
            q qVar3 = (q) a90.g.d(objA);
            long j12 = qVar3.f1048c;
            if (!C() && j9 <= f44045f.get(this) / ((long) k.f44056b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f44049j;
                    a90.t tVar2 = (a90.t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f1048c >= j12 || !qVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, qVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != tVar2) {
                            if (qVar3.f()) {
                                qVar3.e();
                            }
                        }
                    }
                    if (tVar2.f()) {
                        tVar2.e();
                    }
                }
            }
            if (j12 <= j9) {
                return qVar3;
            }
            long j13 = j12 * ((long) k.f44056b);
            do {
                j11 = f44044e.get(this);
                if (j11 >= j13) {
                    break;
                }
            } while (!f44044e.compareAndSet(this, j11, j13));
            if (j12 * ((long) k.f44056b) < w()) {
                qVar3.a();
            }
        }
        return null;
    }

    public final Throwable s() {
        return (Throwable) f44050k.get(this);
    }

    public final a0 t() {
        c cVar = c.f44035a;
        cVar.getClass();
        i80.n nVar = (i80.n) TypeIntrinsics.beforeCheckcastToFunctionOfArity(cVar, 3);
        d dVar = d.f44036a;
        dVar.getClass();
        return new a0(6, this, nVar, (i80.n) TypeIntrinsics.beforeCheckcastToFunctionOfArity(dVar, 3), this.f44053c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b7, code lost:
    
        r16 = r7;
        r3 = (x80.q) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c0, code lost:
    
        if (r3 != null) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x80.i.toString():java.lang.String");
    }

    public final Throwable u() {
        Throwable thS = s();
        return thS == null ? new ClosedReceiveChannelException("Channel was closed") : thS;
    }

    public final Throwable v() {
        Throwable thS = s();
        return thS == null ? new ClosedSendChannelException("Channel was closed") : thS;
    }

    public final long w() {
        return f44043d.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x019f, code lost:
    
        x80.i.f44044e.compareAndSet(r1, r3, 1 + r3);
        r1 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        r16 = r7 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        r16 = r7 ? 1 : 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(long r19, boolean r21) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x80.i.y(long, boolean):boolean");
    }

    public final boolean z() {
        return y(f44043d.get(this), true);
    }
}
