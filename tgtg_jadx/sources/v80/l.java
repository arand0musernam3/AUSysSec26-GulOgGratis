package v80;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class l extends n0 implements k, z70.d, n2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42115f = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42116g = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42117h = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x70.c f42118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineContext f42119e;

    public l(int i11, x70.c cVar) {
        super(i11);
        this.f42118d = cVar;
        this.f42119e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f42069a;
    }

    public static Object E(z1 z1Var, Object obj, int i11, i80.n nVar) {
        if (obj instanceof t) {
            return obj;
        }
        if (i11 != 1 && i11 != 2) {
            return obj;
        }
        if (nVar != null || (z1Var instanceof j)) {
            return new s(obj, z1Var instanceof j ? (j) z1Var : null, nVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        x70.c cVar = this.f42118d;
        Throwable th2 = null;
        a90.f fVar = cVar instanceof a90.f ? (a90.f) cVar : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a90.f.f1017h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                a90.v vVar = a90.g.f1023b;
                if (obj == vVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, vVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != vVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        org.bouncycastle.jce.provider.a.p(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            i4.a.f("Failed requirement.");
                            return;
                        }
                    }
                    th2 = (Throwable) obj;
                }
            }
            if (th2 == null) {
                return;
            }
            p();
            j(th2);
        }
    }

    public final void C(int i11, i80.n nVar, Object obj) throws DispatchException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42116g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof z1) {
                Object objE = E((z1) obj2, obj, i11, nVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!y()) {
                    p();
                }
                q(i11);
                return;
            }
            if (obj2 instanceof m) {
                m mVar = (m) obj2;
                if (m.f42124c.compareAndSet(mVar, 0, 1)) {
                    if (nVar != null) {
                        l(nVar, mVar.f42160a, obj);
                        return;
                    }
                    return;
                }
            }
            org.bouncycastle.jce.provider.a.p(obj, "Already resumed, but proposed with update ");
            return;
        }
    }

    public final void D(x xVar, Object obj) throws DispatchException {
        x70.c cVar = this.f42118d;
        a90.f fVar = cVar instanceof a90.f ? (a90.f) cVar : null;
        C((fVar != null ? fVar.f1018d : null) == xVar ? 4 : this.f42133c, null, obj);
    }

    public final a90.v F(Object obj, i80.n nVar) {
        a90.v vVar = f0.f42083a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42116g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof z1)) {
                return null;
            }
            Object objE = E((z1) obj2, obj, this.f42133c, nVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!y()) {
                p();
            }
            return vVar;
        }
    }

    @Override // v80.n2
    public final void a(a90.t tVar, int i11) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i12;
        do {
            atomicIntegerFieldUpdater = f42115f;
            i12 = atomicIntegerFieldUpdater.get(this);
            if ((i12 & 536870911) != 536870911) {
                com.braze.h2.b("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i12, ((i12 >> 29) << 29) + i11));
        w(tVar);
    }

    @Override // v80.n0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42116g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof z1) {
                com.braze.h2.b("Not completed");
                return;
            }
            if (obj instanceof t) {
                return;
            }
            if (!(obj instanceof s)) {
                cancellationException2 = cancellationException;
                s sVar = new s(obj, (j) null, (i80.n) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            s sVar2 = (s) obj;
            if (sVar2.f42154e != null) {
                com.braze.h2.b("Must be called at most once");
                return;
            }
            s sVarA = s.a(sVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            j jVar = sVar2.f42151b;
            if (jVar != null) {
                i(jVar, cancellationException);
            }
            i80.n nVar = sVar2.f42152c;
            if (nVar != null) {
                l(nVar, cancellationException, sVar2.f42150a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // v80.n0
    public final x70.c c() {
        return this.f42118d;
    }

    @Override // v80.n0
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // v80.n0
    public final Object e(Object obj) {
        return obj instanceof s ? ((s) obj).f42150a : obj;
    }

    @Override // v80.k
    public final boolean g() {
        return f42116g.get(this) instanceof z1;
    }

    @Override // z70.d
    public final z70.d getCallerFrame() {
        x70.c cVar = this.f42118d;
        if (cVar instanceof z70.d) {
            return (z70.d) cVar;
        }
        return null;
    }

    @Override // x70.c
    public final CoroutineContext getContext() {
        return this.f42119e;
    }

    @Override // v80.n0
    public final Object h() {
        return f42116g.get(this);
    }

    public final void i(j jVar, Throwable th2) {
        try {
            jVar.b(th2);
        } catch (Throwable th3) {
            f0.v(this.f42119e, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    @Override // v80.k
    public final boolean j(Throwable th2) throws DispatchException {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42116g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof z1)) {
                return false;
            }
            boolean z11 = (obj instanceof j) || (obj instanceof a90.t);
            if (th2 == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th2;
            }
            m mVar = new m(cancellationException, z11);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            z1 z1Var = (z1) obj;
            if (z1Var instanceof j) {
                i((j) obj, th2);
            } else if (z1Var instanceof a90.t) {
                m((a90.t) obj, th2);
            }
            if (!y()) {
                p();
            }
            q(this.f42133c);
            return true;
        }
    }

    @Override // v80.k
    public final void k(Object obj, i80.n nVar) throws DispatchException {
        C(this.f42133c, nVar, obj);
    }

    public final void l(i80.n nVar, Throwable th2, Object obj) {
        CoroutineContext coroutineContext = this.f42119e;
        try {
            nVar.invoke(th2, obj, coroutineContext);
        } catch (Throwable th3) {
            f0.v(coroutineContext, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void m(a90.t tVar, Throwable th2) {
        CoroutineContext coroutineContext = this.f42119e;
        int i11 = f42115f.get(this) & 536870911;
        if (i11 == 536870911) {
            com.braze.h2.b("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            tVar.h(i11, coroutineContext);
        } catch (Throwable th3) {
            f0.v(coroutineContext, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    @Override // v80.k
    public final a90.v n(Object obj, i80.n nVar) {
        return F(obj, nVar);
    }

    @Override // v80.k
    public final void o(Object obj) throws DispatchException {
        q(this.f42133c);
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42117h;
        r0 r0Var = (r0) atomicReferenceFieldUpdater.get(this);
        if (r0Var == null) {
            return;
        }
        r0Var.a();
        atomicReferenceFieldUpdater.set(this, y1.f42177a);
    }

    public final void q(int i11) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i12;
        do {
            atomicIntegerFieldUpdater = f42115f;
            i12 = atomicIntegerFieldUpdater.get(this);
            int i13 = i12 >> 29;
            if (i13 != 0) {
                if (i13 != 1) {
                    com.braze.h2.b("Already resumed");
                    return;
                }
                boolean z11 = i11 == 4;
                x70.c cVar = this.f42118d;
                if (!z11 && (cVar instanceof a90.f)) {
                    boolean z12 = i11 == 1 || i11 == 2;
                    int i14 = this.f42133c;
                    if (z12 == (i14 == 1 || i14 == 2)) {
                        a90.f fVar = (a90.f) cVar;
                        x xVar = fVar.f1018d;
                        CoroutineContext context = fVar.f1019e.getContext();
                        if (a90.g.j(xVar, context)) {
                            a90.g.i(xVar, context, this);
                            return;
                        }
                        u0 u0VarA = f2.a();
                        if (u0VarA.f42164b >= 4294967296L) {
                            u0VarA.B0(this);
                            return;
                        }
                        u0VarA.C0(true);
                        try {
                            f0.D(this, cVar, true);
                            do {
                            } while (u0VarA.E0());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                f0.D(this, cVar, z11);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i12, 1073741824 + (536870911 & i12)));
    }

    public Throwable r(s1 s1Var) {
        return s1Var.A();
    }

    @Override // x70.c
    public final void resumeWith(Object obj) {
        Throwable thA = u70.q.a(obj);
        if (thA != null) {
            obj = new t(thA, false);
        }
        C(this.f42133c, null, obj);
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        i1 i1Var;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = f42115f;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 2) {
                    com.braze.h2.b("Already suspended");
                    return null;
                }
                if (zY) {
                    B();
                }
                Object obj = f42116g.get(this);
                if (obj instanceof t) {
                    throw ((t) obj).f42160a;
                }
                int i13 = this.f42133c;
                if ((i13 != 1 && i13 != 2) || (i1Var = (i1) this.f42119e.get(h1.f42106a)) == null || i1Var.g()) {
                    return e(obj);
                }
                CancellationException cancellationExceptionA = i1Var.A();
                b(cancellationExceptionA);
                throw cancellationExceptionA;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 536870912 + (536870911 & i11)));
        if (((r0) f42117h.get(this)) == null) {
            u();
        }
        if (zY) {
            B();
        }
        return y70.a.COROUTINE_SUSPENDED;
    }

    public final void t() {
        r0 r0VarU = u();
        if (r0VarU != null && x()) {
            r0VarU.a();
            f42117h.set(this, y1.f42177a);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A());
        sb2.append('(');
        sb2.append(f0.I(this.f42118d));
        sb2.append("){");
        Object obj = f42116g.get(this);
        sb2.append(obj instanceof z1 ? "Active" : obj instanceof m ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(f0.s(this));
        return sb2.toString();
    }

    public final r0 u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        i1 i1Var = (i1) this.f42119e.get(h1.f42106a);
        if (i1Var == null) {
            return null;
        }
        r0 r0VarW = f0.w(i1Var, new n(this, 0));
        do {
            atomicReferenceFieldUpdater = f42117h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, r0VarW)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return r0VarW;
    }

    public final void v(Function1 function1) {
        w(new i(function1, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00aa, code lost:
    
        z(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ad, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(v80.z1 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = v80.l.f42116g
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof v80.b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto La1
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof v80.j
            r3 = 0
            if (r1 != 0) goto Laa
            boolean r1 = r2 instanceof a90.t
            if (r1 != 0) goto Laa
            boolean r1 = r2 instanceof v80.t
            if (r1 == 0) goto L50
            r0 = r2
            v80.t r0 = (v80.t) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = v80.t.f42159b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L4c
            boolean r1 = r2 instanceof v80.m
            if (r1 == 0) goto La1
            java.lang.Throwable r0 = r0.f42160a
            boolean r1 = r8 instanceof v80.j
            if (r1 == 0) goto L43
            v80.j r8 = (v80.j) r8
            r7.i(r8, r0)
            return
        L43:
            r8.getClass()
            a90.t r8 = (a90.t) r8
            r7.m(r8, r0)
            return
        L4c:
            z(r8, r2)
            throw r3
        L50:
            boolean r1 = r2 instanceof v80.s
            if (r1 == 0) goto L87
            r1 = r2
            v80.s r1 = (v80.s) r1
            v80.j r4 = r1.f42151b
            if (r4 != 0) goto L83
            boolean r4 = r8 instanceof a90.t
            if (r4 == 0) goto L60
            return
        L60:
            r8.getClass()
            r4 = r8
            v80.j r4 = (v80.j) r4
            java.lang.Throwable r5 = r1.f42154e
            if (r5 == 0) goto L6e
            r7.i(r4, r5)
            return
        L6e:
            r5 = 29
            v80.s r1 = v80.s.a(r1, r4, r3, r5)
        L74:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L7b
            goto La1
        L7b:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L74
            goto L0
        L83:
            z(r8, r2)
            throw r3
        L87:
            boolean r1 = r8 instanceof a90.t
            if (r1 == 0) goto L8c
            return
        L8c:
            r8.getClass()
            r3 = r8
            v80.j r3 = (v80.j) r3
            v80.s r1 = new v80.s
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L9b:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto La2
        La1:
            return
        La2:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L9b
            goto L0
        Laa:
            z(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v80.l.w(v80.z1):void");
    }

    public final boolean x() {
        return !(f42116g.get(this) instanceof z1);
    }

    public final boolean y() {
        if (this.f42133c != 2) {
            return false;
        }
        x70.c cVar = this.f42118d;
        cVar.getClass();
        a90.f fVar = (a90.f) cVar;
        fVar.getClass();
        return a90.f.f1017h.get(fVar) != null;
    }
}
