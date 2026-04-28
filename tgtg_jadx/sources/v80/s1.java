package v80;

import c5.l3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class s1 implements i1, a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42157a = AtomicReferenceFieldUpdater.newUpdater(s1.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42158b = AtomicReferenceFieldUpdater.newUpdater(s1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public s1(boolean z11) {
        this._state$volatile = z11 ? f0.f42092j : f0.f42091i;
    }

    public static p U(a90.l lVar) {
        while (lVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a90.l.f1033b;
            a90.l lVarE = lVar.e();
            if (lVarE == null) {
                Object obj = atomicReferenceFieldUpdater.get(lVar);
                while (true) {
                    lVar = (a90.l) obj;
                    if (!lVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVar);
                }
            } else {
                lVar = lVarE;
            }
        }
        while (true) {
            lVar = lVar.h();
            if (!lVar.i()) {
                if (lVar instanceof p) {
                    return (p) lVar;
                }
                if (lVar instanceof w1) {
                    return null;
                }
            }
        }
    }

    public static String d0(Object obj) {
        if (!(obj instanceof n1)) {
            return obj instanceof e1 ? ((e1) obj).g() ? "Active" : "New" : obj instanceof t ? "Cancelled" : "Completed";
        }
        n1 n1Var = (n1) obj;
        return n1Var.d() ? "Cancelling" : n1.f42134b.get(n1Var) == 1 ? "Completing" : "Active";
    }

    @Override // v80.i1
    public final CancellationException A() {
        CancellationException cancellationException;
        Object obj = f42157a.get(this);
        if (obj instanceof n1) {
            Throwable thC = ((n1) obj).c();
            if (thC == null) {
                org.bouncycastle.jce.provider.a.p(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
            return cancellationException == null ? new JobCancellationException(strConcat, thC, this) : cancellationException;
        }
        if (obj instanceof e1) {
            org.bouncycastle.jce.provider.a.p(this, "Job is still new or active: ");
            return null;
        }
        if (!(obj instanceof t)) {
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th2 = ((t) obj).f42160a;
        cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        return cancellationException == null ? new JobCancellationException(v(), th2, this) : cancellationException;
    }

    @Override // v80.i1
    public final Object B(x70.c cVar) {
        Object obj;
        do {
            obj = f42157a.get(this);
            if (!(obj instanceof e1)) {
                f0.p(cVar.getContext());
                return Unit.f26487a;
            }
        } while (c0(obj) < 0);
        l lVar = new l(1, y70.f.b(cVar));
        lVar.t();
        lVar.w(new i(f0.w(this, new n(lVar, 1)), 2));
        Object objS = lVar.s();
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        if (objS != aVar) {
            objS = Unit.f26487a;
        }
        return objS == aVar ? objS : Unit.f26487a;
    }

    public final Object C() throws Throwable {
        Object obj = f42157a.get(this);
        if (obj instanceof e1) {
            com.braze.h2.b("This job has not completed yet");
            return null;
        }
        if (obj instanceof t) {
            throw ((t) obj).f42160a;
        }
        return f0.J(obj);
    }

    public final Throwable D(n1 n1Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (n1Var.d()) {
                return new JobCancellationException(v(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th4 = (Throwable) next2;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public boolean E() {
        return true;
    }

    public boolean F() {
        return this instanceof q;
    }

    @Override // v80.i1
    public final o I(s1 s1Var) {
        p pVar = new p(s1Var);
        pVar.f42113d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42157a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof t0) {
                t0 t0Var = (t0) obj;
                if (t0Var.f42161a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Y(t0Var);
            } else {
                boolean z11 = obj instanceof e1;
                y1 y1Var = y1.f42177a;
                if (!z11) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    t tVar = obj2 instanceof t ? (t) obj2 : null;
                    pVar.l(tVar != null ? tVar.f42160a : null);
                    return y1Var;
                }
                w1 w1VarB = ((e1) obj).b();
                if (w1VarB == null) {
                    b0((k1) obj);
                } else if (!w1VarB.d(pVar, 7)) {
                    boolean zD = w1VarB.d(pVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof n1) {
                        thC = ((n1) obj3).c();
                    } else {
                        t tVar2 = obj3 instanceof t ? (t) obj3 : null;
                        if (tVar2 != null) {
                            thC = tVar2.f42160a;
                        }
                    }
                    pVar.l(thC);
                    if (zD) {
                        break loop0;
                    }
                    return y1Var;
                }
            }
        }
        return pVar;
    }

    @Override // v80.i1
    public final r0 J(Function1 function1) {
        return O(true, new s0(function1, 1));
    }

    public final w1 K(e1 e1Var) {
        w1 w1VarB = e1Var.b();
        if (w1VarB != null) {
            return w1VarB;
        }
        if (e1Var instanceof t0) {
            return new w1();
        }
        if (e1Var instanceof k1) {
            b0((k1) e1Var);
            return null;
        }
        org.bouncycastle.jce.provider.a.p(e1Var, "State should have list: ");
        return null;
    }

    public boolean L(Throwable th2) {
        return false;
    }

    public final void N(i1 i1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42158b;
        y1 y1Var = y1.f42177a;
        if (i1Var == null) {
            atomicReferenceFieldUpdater.set(this, y1Var);
            return;
        }
        i1Var.start();
        o oVarI = i1Var.I(this);
        atomicReferenceFieldUpdater.set(this, oVarI);
        if (a0()) {
            oVarI.a();
            atomicReferenceFieldUpdater.set(this, y1Var);
        }
    }

    public final r0 O(boolean z11, k1 k1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        y1 y1Var;
        boolean z12;
        boolean zD;
        k1Var.f42113d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f42157a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z13 = obj instanceof t0;
            y1Var = y1.f42177a;
            z12 = true;
            if (!z13) {
                if (!(obj instanceof e1)) {
                    z12 = false;
                    break;
                }
                e1 e1Var = (e1) obj;
                w1 w1VarB = e1Var.b();
                if (w1VarB == null) {
                    b0((k1) obj);
                } else {
                    if (k1Var.k()) {
                        n1 n1Var = e1Var instanceof n1 ? (n1) e1Var : null;
                        Throwable thC = n1Var != null ? n1Var.c() : null;
                        if (thC == null) {
                            zD = w1VarB.d(k1Var, 5);
                        } else if (z11) {
                            k1Var.l(thC);
                            return y1Var;
                        }
                    } else {
                        zD = w1VarB.d(k1Var, 1);
                    }
                    if (zD) {
                        break;
                    }
                }
            } else {
                t0 t0Var = (t0) obj;
                if (t0Var.f42161a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Y(t0Var);
            }
        }
        if (z12) {
            return k1Var;
        }
        if (z11) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t tVar = obj2 instanceof t ? (t) obj2 : null;
            k1Var.l(tVar != null ? tVar.f42160a : null);
        }
        return y1Var;
    }

    public boolean P() {
        return this instanceof g;
    }

    public final boolean R(Object obj) {
        Object objE0;
        do {
            objE0 = e0(f42157a.get(this), obj);
            if (objE0 == f0.f42086d) {
                return false;
            }
            if (objE0 == f0.f42087e) {
                return true;
            }
        } while (objE0 == f0.f42088f);
        i(objE0);
        return true;
    }

    public final Object S(Object obj) {
        Object objE0;
        do {
            objE0 = e0(f42157a.get(this), obj);
            if (objE0 == f0.f42086d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                t tVar = obj instanceof t ? (t) obj : null;
                throw new IllegalStateException(str, tVar != null ? tVar.f42160a : null);
            }
        } while (objE0 == f0.f42088f);
        return objE0;
    }

    public String T() {
        return getClass().getSimpleName();
    }

    public final void V(w1 w1Var, Throwable th2) {
        w1Var.d(new a90.i(4), 4);
        Object obj = a90.l.f1032a.get(w1Var);
        obj.getClass();
        CompletionHandlerException completionHandlerException = null;
        for (a90.l lVarH = (a90.l) obj; !Intrinsics.areEqual(lVarH, w1Var); lVarH = lVarH.h()) {
            if ((lVarH instanceof k1) && ((k1) lVarH).k()) {
                try {
                    ((k1) lVarH).l(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        u70.e.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lVarH + " for " + this, th3);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            M(completionHandlerException);
        }
        s(th2);
    }

    public final void Y(t0 t0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        w1 w1Var = new w1();
        Object d1Var = w1Var;
        if (!t0Var.f42161a) {
            d1Var = new d1(w1Var);
        }
        do {
            atomicReferenceFieldUpdater = f42157a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, t0Var, d1Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == t0Var);
    }

    @Override // v80.i1
    public final a8.h Z() {
        r1 r1Var = r1.f42149a;
        r1Var.getClass();
        return new a8.h(this, (i80.n) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1Var, 3));
    }

    @Override // v80.i1
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(v(), null, this);
        }
        r(cancellationException);
    }

    @Override // v80.i1
    public final boolean a0() {
        return !(f42157a.get(this) instanceof e1);
    }

    public final void b0(k1 k1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        w1 w1Var = new w1();
        k1Var.getClass();
        a90.l.f1033b.set(w1Var, k1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a90.l.f1032a;
        atomicReferenceFieldUpdater2.set(w1Var, k1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(k1Var) == k1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(k1Var, k1Var, w1Var)) {
                    if (atomicReferenceFieldUpdater2.get(k1Var) != k1Var) {
                        break;
                    }
                }
                w1Var.f(k1Var);
                break loop0;
            }
            break;
        }
        a90.l lVarH = k1Var.h();
        do {
            atomicReferenceFieldUpdater = f42157a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, k1Var, lVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == k1Var);
    }

    public final int c0(Object obj) {
        boolean z11 = obj instanceof t0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42157a;
        if (z11) {
            if (((t0) obj).f42161a) {
                return 0;
            }
            t0 t0Var = f0.f42092j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, t0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            X();
            return 1;
        }
        if (!(obj instanceof d1)) {
            return 0;
        }
        w1 w1Var = ((d1) obj).f42078a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        X();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final Object e0(Object obj, Object obj2) {
        if (!(obj instanceof e1)) {
            return f0.f42086d;
        }
        if (((obj instanceof t0) || (obj instanceof k1)) && !(obj instanceof p) && !(obj2 instanceof t)) {
            e1 e1Var = (e1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42157a;
            Object f1Var = obj2 instanceof e1 ? new f1((e1) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, e1Var, f1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != e1Var) {
                    return f0.f42088f;
                }
            }
            W(obj2);
            x(e1Var, obj2);
            return obj2;
        }
        e1 e1Var2 = (e1) obj;
        w1 w1VarK = K(e1Var2);
        if (w1VarK == null) {
            return f0.f42088f;
        }
        n1 n1Var = e1Var2 instanceof n1 ? (n1) e1Var2 : null;
        if (n1Var == null) {
            n1Var = new n1(w1VarK, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (n1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n1.f42134b;
            if (atomicIntegerFieldUpdater.get(n1Var) == 1) {
                return f0.f42086d;
            }
            atomicIntegerFieldUpdater.set(n1Var, 1);
            if (n1Var != e1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f42157a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, e1Var2, n1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != e1Var2) {
                        return f0.f42088f;
                    }
                }
            }
            boolean zD = n1Var.d();
            t tVar = obj2 instanceof t ? (t) obj2 : null;
            if (tVar != null) {
                n1Var.a(tVar.f42160a);
            }
            ?? C = zD ? 0 : n1Var.c();
            objectRef.element = C;
            if (C != 0) {
                V(w1VarK, C);
            }
            p pVarU = U(w1VarK);
            if (pVarU != null && f0(n1Var, pVarU, obj2)) {
                return f0.f42087e;
            }
            w1VarK.d(new a90.i(2), 2);
            p pVarU2 = U(w1VarK);
            return (pVarU2 == null || !f0(n1Var, pVarU2, obj2)) ? z(n1Var, obj2) : f0.f42087e;
        }
    }

    public final boolean f0(n1 n1Var, p pVar, Object obj) {
        while (pVar.f42143e.O(false, new m1(this, n1Var, pVar, obj)) == y1.f42177a) {
            pVar = U(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // v80.i1
    public boolean g() {
        Object obj = f42157a.get(this);
        return (obj instanceof e1) && ((e1) obj).g();
    }

    @Override // v80.i1
    public final r0 g0(boolean z11, boolean z12, al.d dVar) {
        return O(z12, z11 ? new g1(dVar) : new s0(dVar, 1));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // v80.i1
    public final Sequence getChildren() {
        return new l3(new a3.b1(this, null, 4));
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return h1.f42106a;
    }

    @Override // v80.i1
    public final boolean isCancelled() {
        Object obj = f42157a.get(this);
        if (obj instanceof t) {
            return true;
        }
        return (obj instanceof n1) && ((n1) obj).d();
    }

    public void l(Object obj) {
        i(obj);
    }

    public final Object m(x70.c cVar) {
        Object obj;
        do {
            obj = f42157a.get(this);
            if (!(obj instanceof e1)) {
                if (obj instanceof t) {
                    throw ((t) obj).f42160a;
                }
                return f0.J(obj);
            }
        } while (c0(obj) < 0);
        l1 l1Var = new l1(y70.f.b(cVar), this);
        l1Var.t();
        int i11 = 2;
        l1Var.w(new i(f0.w(this, new s0(l1Var, i11)), i11));
        Object objS = l1Var.s();
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objS;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    public Object p() {
        return C();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v80.s1.q(java.lang.Object):boolean");
    }

    public void r(Throwable th2) {
        q(th2);
    }

    public final boolean s(Throwable th2) {
        if (P()) {
            return true;
        }
        boolean z11 = th2 instanceof CancellationException;
        o oVar = (o) f42158b.get(this);
        return (oVar == null || oVar == y1.f42177a) ? z11 : oVar.c(th2) || z11;
    }

    @Override // v80.i1
    public final boolean start() {
        int iC0;
        do {
            iC0 = c0(f42157a.get(this));
            if (iC0 == 0) {
                return false;
            }
        } while (iC0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(T() + '{' + d0(f42157a.get(this)) + '}');
        sb2.append('@');
        sb2.append(f0.s(this));
        return sb2.toString();
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean w(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return q(th2) && E();
    }

    public final void x(e1 e1Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42158b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        if (oVar != null) {
            oVar.a();
            atomicReferenceFieldUpdater.set(this, y1.f42177a);
        }
        CompletionHandlerException completionHandlerException = null;
        t tVar = obj instanceof t ? (t) obj : null;
        Throwable th2 = tVar != null ? tVar.f42160a : null;
        if (e1Var instanceof k1) {
            try {
                ((k1) e1Var).l(th2);
                return;
            } catch (Throwable th3) {
                M(new CompletionHandlerException("Exception in completion handler " + e1Var + " for " + this, th3));
                return;
            }
        }
        w1 w1VarB = e1Var.b();
        if (w1VarB != null) {
            w1VarB.d(new a90.i(1), 1);
            Object obj2 = a90.l.f1032a.get(w1VarB);
            obj2.getClass();
            for (a90.l lVarH = (a90.l) obj2; !Intrinsics.areEqual(lVarH, w1VarB); lVarH = lVarH.h()) {
                if (lVarH instanceof k1) {
                    try {
                        ((k1) lVarH).l(th2);
                    } catch (Throwable th4) {
                        if (completionHandlerException != null) {
                            u70.e.a(completionHandlerException, th4);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lVarH + " for " + this, th4);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                M(completionHandlerException);
            }
        }
    }

    public final Throwable y(Object obj) {
        Throwable thC;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new JobCancellationException(v(), null, this) : th2;
        }
        obj.getClass();
        s1 s1Var = (s1) ((a2) obj);
        Object obj2 = f42157a.get(s1Var);
        if (obj2 instanceof n1) {
            thC = ((n1) obj2).c();
        } else if (obj2 instanceof t) {
            thC = ((t) obj2).f42160a;
        } else {
            if (obj2 instanceof e1) {
                org.bouncycastle.jce.provider.a.p(obj2, "Cannot be cancelling child in this state: ");
                return null;
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(d0(obj2)), thC, s1Var) : cancellationException;
    }

    public final Object z(n1 n1Var, Object obj) {
        Throwable thD;
        t tVar = obj instanceof t ? (t) obj : null;
        Throwable th2 = tVar != null ? tVar.f42160a : null;
        synchronized (n1Var) {
            n1Var.d();
            ArrayList<Throwable> arrayListE = n1Var.e(th2);
            thD = D(n1Var, arrayListE);
            if (thD != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th3 : arrayListE) {
                    if (th3 != thD && th3 != thD && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                        u70.e.a(thD, th3);
                    }
                }
            }
        }
        if (thD != null && thD != th2) {
            obj = new t(thD, false);
        }
        if (thD != null && (s(thD) || L(thD))) {
            obj.getClass();
            t.f42159b.compareAndSet((t) obj, 0, 1);
        }
        W(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42157a;
        Object f1Var = obj instanceof e1 ? new f1((e1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, n1Var, f1Var) && atomicReferenceFieldUpdater.get(this) == n1Var) {
        }
        x(n1Var, obj);
        return obj;
    }

    public void X() {
    }

    public void M(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public void W(Object obj) {
    }

    public void i(Object obj) {
    }
}
