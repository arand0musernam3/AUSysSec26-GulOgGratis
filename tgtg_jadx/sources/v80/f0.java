package v80;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a90.v f42083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a90.v f42084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a90.v f42085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a90.v f42086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a90.v f42087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a90.v f42088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a90.v f42089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a90.v f42090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t0 f42091i = new t0(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t0 f42092j = new t0(true);

    static {
        int i11 = 0;
        f42083a = new a90.v("RESUME_TOKEN", i11);
        f42084b = new a90.v("REMOVED_TASK", i11);
        f42085c = new a90.v("CLOSED_EMPTY", i11);
        f42086d = new a90.v("COMPLETING_ALREADY", i11);
        f42087e = new a90.v("COMPLETING_WAITING_CHILDREN", i11);
        f42088f = new a90.v("COMPLETING_RETRY", i11);
        f42089g = new a90.v("TOO_LATE_TO_CANCEL", i11);
        f42090h = new a90.v("SEALED", i11);
    }

    public static final b2 A(b0 b0Var, CoroutineContext coroutineContext, d0 d0Var, Function2 function2) {
        CoroutineContext coroutineContextB = v.b(b0Var, coroutineContext);
        d0Var.getClass();
        b2 u1Var = d0Var == d0.LAZY ? new u1(coroutineContextB, function2) : new b2(coroutineContextB, true);
        u1Var.k0(d0Var, u1Var, function2);
        return u1Var;
    }

    public static /* synthetic */ b2 B(b0 b0Var, CoroutineContext coroutineContext, d0 d0Var, Function2 function2, int i11) {
        if ((i11 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f26549a;
        }
        if ((i11 & 2) != 0) {
            d0Var = d0.DEFAULT;
        }
        return A(b0Var, coroutineContext, d0Var, function2);
    }

    public static final Object C(Object obj) {
        if (obj instanceof t) {
            u70.o oVar = u70.q.f40850b;
            return ba0.g.j(((t) obj).f42160a);
        }
        u70.o oVar2 = u70.q.f40850b;
        return obj;
    }

    public static final void D(l lVar, x70.c cVar, boolean z11) {
        Object objE;
        Object obj = l.f42116g.get(lVar);
        Throwable thD = lVar.d(obj);
        if (thD != null) {
            u70.o oVar = u70.q.f40850b;
            objE = new u70.p(thD);
        } else {
            u70.o oVar2 = u70.q.f40850b;
            objE = lVar.e(obj);
        }
        if (!z11) {
            cVar.resumeWith(objE);
            return;
        }
        cVar.getClass();
        a90.f fVar = (a90.f) cVar;
        z70.c cVar2 = fVar.f1019e;
        Object obj2 = fVar.f1021g;
        CoroutineContext context = cVar2.getContext();
        Object objC = a90.x.c(context, obj2);
        l2 l2VarC = objC != a90.x.f1053a ? v.c(cVar2, context, objC) : null;
        try {
            cVar2.resumeWith(objE);
            if (l2VarC == null || l2VarC.m0()) {
                a90.x.a(context, objC);
            }
        } catch (Throwable th2) {
            if (l2VarC == null || l2VarC.m0()) {
                a90.x.a(context, objC);
            }
            throw th2;
        }
    }

    public static final Object E(CoroutineContext coroutineContext, Function2 function2) throws Throwable {
        u0 u0VarA;
        CoroutineContext coroutineContextA;
        long jD0;
        Thread threadCurrentThread = Thread.currentThread();
        kotlin.coroutines.f fVar = kotlin.coroutines.d.f26548k0;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContext.get(fVar);
        if (dVar == null) {
            u0VarA = f2.a();
            coroutineContextA = v.a(kotlin.coroutines.g.f26549a, coroutineContext.plus(u0VarA), true);
            c90.f fVar2 = p0.f42144a;
            if (coroutineContextA != fVar2 && coroutineContextA.get(fVar) == null) {
                coroutineContextA = coroutineContextA.plus(fVar2);
            }
        } else {
            if (dVar instanceof u0) {
            }
            u0VarA = (u0) f2.f42094a.get();
            coroutineContextA = v.a(kotlin.coroutines.g.f26549a, coroutineContext, true);
            c90.f fVar3 = p0.f42144a;
            if (coroutineContextA != fVar3 && coroutineContextA.get(fVar) == null) {
                coroutineContextA = coroutineContextA.plus(fVar3);
            }
        }
        g gVar = new g(coroutineContextA, threadCurrentThread, u0VarA);
        gVar.k0(d0.DEFAULT, gVar, function2);
        u0 u0Var = gVar.f42096e;
        if (u0Var != null) {
            int i11 = u0.f42163e;
            u0Var.C0(false);
        }
        while (true) {
            if (u0Var != null) {
                try {
                    jD0 = u0Var.D0();
                } catch (Throwable th2) {
                    if (u0Var != null) {
                        int i12 = u0.f42163e;
                        u0Var.A0(false);
                    }
                    throw th2;
                }
            } else {
                jD0 = LongCompanionObject.MAX_VALUE;
            }
            if (gVar.a0()) {
                break;
            }
            LockSupport.parkNanos(gVar, jD0);
            if (Thread.interrupted()) {
                gVar.q(new InterruptedException());
            }
        }
        if (u0Var != null) {
            int i13 = u0.f42163e;
            u0Var.A0(false);
        }
        Object objJ = J(s1.f42157a.get(gVar));
        t tVar = objJ instanceof t ? (t) objJ : null;
        if (tVar == null) {
            return objJ;
        }
        throw tVar.f42160a;
    }

    public static Object G(Function0 function0, z70.c cVar) {
        return K(kotlin.coroutines.g.f26549a, new rf.c(function0, null, 15), cVar);
    }

    public static final Object H(Function2 function2, z70.c cVar) {
        c2 c2Var = new c2(cVar.getContext(), cVar, 0);
        Object objJ = d40.t1.J(c2Var, true, c2Var, function2);
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objJ;
    }

    public static final String I(x70.c cVar) {
        Object pVar;
        if (cVar instanceof a90.f) {
            return ((a90.f) cVar).toString();
        }
        try {
            u70.o oVar = u70.q.f40850b;
            pVar = cVar + '@' + s(cVar);
        } catch (Throwable th2) {
            u70.o oVar2 = u70.q.f40850b;
            pVar = new u70.p(th2);
        }
        if (u70.q.a(pVar) != null) {
            pVar = cVar.getClass().getName() + '@' + s(cVar);
        }
        return (String) pVar;
    }

    public static final Object J(Object obj) {
        e1 e1Var;
        f1 f1Var = obj instanceof f1 ? (f1) obj : null;
        return (f1Var == null || (e1Var = f1Var.f42093a) == null) ? obj : e1Var;
    }

    public static final Object K(CoroutineContext coroutineContext, Function2 function2, x70.c cVar) throws Throwable {
        Object objJ;
        CoroutineContext context = cVar.getContext();
        CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(Boolean.FALSE, new u60.a(10))).booleanValue() ? context.plus(coroutineContext) : v.a(context, coroutineContext, false);
        p(coroutineContextPlus);
        if (coroutineContextPlus == context) {
            a90.s sVar = new a90.s(coroutineContextPlus, cVar);
            objJ = d40.t1.J(sVar, true, sVar, function2);
        } else {
            x70.d dVar = kotlin.coroutines.d.f26548k0;
            if (Intrinsics.areEqual(coroutineContextPlus.get(dVar), context.get(dVar))) {
                l2 l2Var = new l2(coroutineContextPlus, cVar);
                CoroutineContext coroutineContext2 = l2Var.f42066c;
                Object objC = a90.x.c(coroutineContext2, null);
                try {
                    Object objJ2 = d40.t1.J(l2Var, true, l2Var, function2);
                    a90.x.a(coroutineContext2, objC);
                    objJ = objJ2;
                } catch (Throwable th2) {
                    a90.x.a(coroutineContext2, objC);
                    throw th2;
                }
            } else {
                m0 m0Var = new m0(coroutineContextPlus, cVar);
                bx.o.P(function2, m0Var, m0Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m0.f42125e;
                while (true) {
                    int i11 = atomicIntegerFieldUpdater.get(m0Var);
                    if (i11 != 0) {
                        if (i11 != 2) {
                            com.braze.h2.b("Already suspended");
                            return null;
                        }
                        objJ = J(s1.f42157a.get(m0Var));
                        if (objJ instanceof t) {
                            throw ((t) objJ).f42160a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(m0Var, 0, 1)) {
                        objJ = y70.a.COROUTINE_SUSPENDED;
                        break;
                    }
                }
            }
        }
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objJ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object L(z70.c cVar) {
        Object obj;
        CoroutineContext context = cVar.getContext();
        p(context);
        x70.c cVarB = y70.f.b(cVar);
        a90.f fVar = cVarB instanceof a90.f ? (a90.f) cVarB : null;
        if (fVar == null) {
            obj = Unit.f26487a;
        } else {
            x xVar = fVar.f1018d;
            if (a90.g.j(xVar, context)) {
                fVar.f1020f = Unit.f26487a;
                fVar.f42133c = 1;
                xVar.x0(context, fVar);
            } else {
                o2 o2Var = new o2(o2.f42141b);
                CoroutineContext coroutineContextPlus = context.plus(o2Var);
                Unit unit = Unit.f26487a;
                fVar.f1020f = unit;
                fVar.f42133c = 1;
                xVar.x0(coroutineContextPlus, fVar);
                if (o2Var.f42142a) {
                    u0 u0VarA = f2.a();
                    kotlin.collections.t tVar = u0VarA.f42166d;
                    if (tVar != null ? tVar.isEmpty() : true) {
                        obj = Unit.f26487a;
                    } else {
                        if (u0VarA.f42164b >= 4294967296L) {
                            fVar.f1020f = unit;
                            fVar.f42133c = 1;
                            u0VarA.B0(fVar);
                            obj = y70.a.COROUTINE_SUSPENDED;
                        } else {
                            u0VarA.C0(true);
                            try {
                                fVar.run();
                                do {
                                } while (u0VarA.E0());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            obj = Unit.f26487a;
                        }
                    }
                }
            }
            obj = y70.a.COROUTINE_SUSPENDED;
        }
        return obj == y70.a.COROUTINE_SUSPENDED ? obj : Unit.f26487a;
    }

    public static final q a(Object obj) {
        q qVar = new q();
        qVar.R(obj);
        return qVar;
    }

    public static final a90.d b(CoroutineContext coroutineContext) {
        if (coroutineContext.get(h1.f42106a) == null) {
            coroutineContext = coroutineContext.plus(c());
        }
        return new a90.d(coroutineContext);
    }

    public static j1 c() {
        return new j1(null);
    }

    public static d2 d() {
        return new d2(null);
    }

    public static final j0 e(b0 b0Var, CoroutineContext coroutineContext, d0 d0Var, Function2 function2) {
        CoroutineContext coroutineContextB = v.b(b0Var, coroutineContext);
        d0Var.getClass();
        j0 t1Var = d0Var == d0.LAZY ? new t1(coroutineContextB, function2) : new j0(coroutineContextB, true);
        t1Var.k0(d0Var, t1Var, function2);
        return t1Var;
    }

    public static /* synthetic */ j0 f(b0 b0Var, CoroutineContext coroutineContext, d0 d0Var, Function2 function2, int i11) {
        if ((i11 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f26549a;
        }
        if ((i11 & 2) != 0) {
            d0Var = d0.DEFAULT;
        }
        return e(b0Var, coroutineContext, d0Var, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object g(Collection collection, z70.c cVar) {
        if (collection.isEmpty()) {
            return kotlin.collections.n0.f26529a;
        }
        i0[] i0VarArr = (i0[]) collection.toArray(new i0[0]);
        e eVar = new e(i0VarArr);
        l lVar = new l(1, y70.f.b(cVar));
        lVar.t();
        int length = i0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i11 = 0; i11 < length; i11++) {
            j0 j0Var = i0VarArr[i11];
            j0Var.start();
            c cVar2 = new c(eVar, lVar);
            cVar2.f42073f = w(j0Var, cVar2);
            cVarArr[i11] = cVar2;
        }
        d dVar = new d(cVarArr);
        for (int i12 = 0; i12 < length; i12++) {
            c cVar3 = cVarArr[i12];
            cVar3.getClass();
            c.f42071h.set(cVar3, dVar);
        }
        if (lVar.x()) {
            dVar.a();
        } else {
            lVar.w(dVar);
        }
        Object objS = lVar.s();
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objS;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final y70.a h(z70.c r4) {
        /*
            boolean r0 = r4 instanceof v80.l0
            if (r0 == 0) goto L13
            r0 = r4
            v80.l0 r0 = (v80.l0) r0
            int r1 = r0.f42121k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42121k = r1
            goto L18
        L13:
            v80.l0 r0 = new v80.l0
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f42120j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f42121k
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 == r3) goto L2a
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
        L28:
            r4 = 0
            return r4
        L2a:
            ba0.g.M(r4)
            goto L46
        L2e:
            ba0.g.M(r4)
            r0.f42121k = r3
            v80.l r4 = new v80.l
            x70.c r0 = y70.f.b(r0)
            r4.<init>(r3, r0)
            r4.t()
            java.lang.Object r4 = r4.s()
            if (r4 != r1) goto L46
            return r1
        L46:
            qc.y.m()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: v80.f0.h(z70.c):y70.a");
    }

    public static final void i(CoroutineContext coroutineContext, CancellationException cancellationException) {
        i1 i1Var = (i1) coroutineContext.get(h1.f42106a);
        if (i1Var != null) {
            i1Var.a(cancellationException);
        }
    }

    public static final void j(b0 b0Var, CancellationException cancellationException) {
        i1 i1Var = (i1) b0Var.getCoroutineContext().get(h1.f42106a);
        if (i1Var != null) {
            i1Var.a(cancellationException);
        } else {
            org.bouncycastle.jce.provider.a.p(b0Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final Object k(i1 i1Var, z70.c cVar) {
        i1Var.a(null);
        Object objB = i1Var.B(cVar);
        return objB == y70.a.COROUTINE_SUSPENDED ? objB : Unit.f26487a;
    }

    public static void l(CoroutineContext coroutineContext) {
        Sequence children;
        i1 i1Var = (i1) coroutineContext.get(h1.f42106a);
        if (i1Var == null || (children = i1Var.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).a(null);
        }
    }

    public static void m(i1 i1Var) {
        Iterator it = i1Var.getChildren().iterator();
        while (it.hasNext()) {
            ((i1) it.next()).a(null);
        }
    }

    public static final Object n(Function2 function2, x70.c cVar) {
        a90.s sVar = new a90.s(cVar.getContext(), cVar);
        Object objJ = d40.t1.J(sVar, true, sVar, function2);
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objJ;
    }

    public static final Object o(long j9, x70.c cVar) {
        if (j9 <= 0) {
            return Unit.f26487a;
        }
        l lVar = new l(1, y70.f.b(cVar));
        lVar.t();
        if (j9 < LongCompanionObject.MAX_VALUE) {
            r(lVar.f42119e).r(j9, lVar);
        }
        Object objS = lVar.s();
        return objS == y70.a.COROUTINE_SUSPENDED ? objS : Unit.f26487a;
    }

    public static final void p(CoroutineContext coroutineContext) {
        i1 i1Var = (i1) coroutineContext.get(h1.f42106a);
        if (i1Var != null && !i1Var.g()) {
            throw i1Var.A();
        }
    }

    public static final x q(Executor executor) {
        return new b1(executor);
    }

    public static final k0 r(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.d.f26548k0);
        k0 k0Var = element instanceof k0 ? (k0) element : null;
        return k0Var == null ? h0.f42105a : k0Var;
    }

    public static final String s(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final i1 t(CoroutineContext coroutineContext) {
        i1 i1Var = (i1) coroutineContext.get(h1.f42106a);
        if (i1Var != null) {
            return i1Var;
        }
        org.bouncycastle.jce.provider.a.p(coroutineContext, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final l u(x70.c cVar) {
        l lVar;
        l lVar2;
        if (!(cVar instanceof a90.f)) {
            return new l(1, cVar);
        }
        a90.f fVar = (a90.f) cVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a90.f.f1017h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            lVar = null;
            a90.v vVar = a90.g.f1023b;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, vVar);
                lVar2 = null;
                break;
            }
            if (obj instanceof l) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, vVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                lVar2 = (l) obj;
                break loop0;
            }
            if (obj != vVar && !(obj instanceof Throwable)) {
                org.bouncycastle.jce.provider.a.p(obj, "Inconsistent state ");
                return null;
            }
        }
        if (lVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l.f42116g;
            Object obj2 = atomicReferenceFieldUpdater2.get(lVar2);
            if (!(obj2 instanceof s) || ((s) obj2).f42153d == null) {
                l.f42115f.set(lVar2, 536870911);
                atomicReferenceFieldUpdater2.set(lVar2, b.f42069a);
                lVar = lVar2;
            } else {
                lVar2.p();
            }
            if (lVar != null) {
                return lVar;
            }
        }
        return new l(2, cVar);
    }

    public static final void v(CoroutineContext coroutineContext, Throwable th2) {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).f26625a;
        }
        try {
            z zVar = (z) coroutineContext.get(y.f42175a);
            if (zVar != null) {
                zVar.handleException(coroutineContext, th2);
            } else {
                a90.g.e(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                u70.e.a(runtimeException, th2);
                th2 = runtimeException;
            }
            a90.g.e(coroutineContext, th2);
        }
    }

    public static r0 w(i1 i1Var, k1 k1Var) {
        if (i1Var instanceof s1) {
            return ((s1) i1Var).O(true, k1Var);
        }
        return i1Var.g0(k1Var.k(), true, new al.d(1, k1Var, k1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 26));
    }

    public static final boolean x(CoroutineContext coroutineContext) {
        i1 i1Var = (i1) coroutineContext.get(h1.f42106a);
        if (i1Var != null) {
            return i1Var.g();
        }
        return true;
    }

    public static final boolean y(b0 b0Var) {
        i1 i1Var = (i1) b0Var.getCoroutineContext().get(h1.f42106a);
        if (i1Var != null) {
            return i1Var.g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(java.util.Collection r4, x70.c r5) {
        /*
            boolean r0 = r5 instanceof v80.f
            if (r0 == 0) goto L13
            r0 = r5
            v80.f r0 = (v80.f) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            v80.f r0 = new v80.f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f42082k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.util.Iterator r4 = r0.f42081j
            ba0.g.M(r5)
            goto L39
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L30:
            ba0.g.M(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L39:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L50
            java.lang.Object r5 = r4.next()
            v80.i1 r5 = (v80.i1) r5
            r0.f42081j = r4
            r0.l = r3
            java.lang.Object r5 = r5.B(r0)
            if (r5 != r1) goto L39
            return r1
        L50:
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v80.f0.z(java.util.Collection, x70.c):java.lang.Object");
    }
}
