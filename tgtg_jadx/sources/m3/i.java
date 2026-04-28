package m3;

import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f29297a = new u3.d(new j60.a(25), false, 954879418);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f29298b = new u3.d(new j60.a(26), false, 1918065384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f29299c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l0 f29300d = new l0();

    public static final q A(n nVar) {
        s sVar = (s) nVar;
        sVar.X(206, v.f29461e);
        if (sVar.S) {
            q2.z(sVar.I);
        }
        Object objE = sVar.E();
        f2 j2Var = objE instanceof f2 ? (f2) objE : null;
        if (j2Var == null) {
            j2Var = new j2(new p(new q(sVar, sVar.T, sVar.f29432q, sVar.C, sVar.f29424h.f29193t)), -1);
            sVar.l0(j2Var);
        }
        e2 e2Var = j2Var.f29279a;
        e2Var.getClass();
        q qVar = ((p) e2Var).f29358a;
        qVar.f29379f.setValue(sVar.l());
        sVar.q(false);
        return qVar;
    }

    public static final b1 B(Object obj, n nVar) {
        s sVar = (s) nVar;
        Object objM = sVar.M();
        if (objM == m.f29332a) {
            objM = w(obj);
            sVar.k0(objM);
        }
        b1 b1Var = (b1) objM;
        b1Var.setValue(obj);
        return b1Var;
    }

    public static final void C(Object obj, Function2 function2, n nVar) {
        s sVar = (s) nVar;
        if (sVar.S || !Intrinsics.areEqual(sVar.M(), obj)) {
            sVar.k0(obj);
            sVar.b(obj, function2);
        }
    }

    public static final at.o D(Function0 function0) {
        return new at.o(new b0.c2(function0, (x70.c) null));
    }

    public static final int E(q1.f0 f0Var) {
        int iA;
        int i11 = f0Var.f35790b;
        int iA2 = f0Var.a(0);
        while (f0Var.f35790b != 0 && f0Var.a(0) == iA2) {
            f0Var.f(0, f0Var.b());
            f0Var.e(f0Var.f35790b - 1);
            int i12 = f0Var.f35790b;
            int i13 = i12 >>> 1;
            int i14 = 0;
            while (i14 < i13) {
                int iA3 = f0Var.a(i14);
                int i15 = (i14 + 1) * 2;
                int i16 = i15 - 1;
                int iA4 = f0Var.a(i16);
                if (i15 >= i12 || (iA = f0Var.a(i15)) <= iA4) {
                    if (iA4 > iA3) {
                        f0Var.f(i14, iA4);
                        f0Var.f(i16, iA3);
                        i14 = i16;
                    }
                } else if (iA > iA3) {
                    f0Var.f(i14, iA);
                    f0Var.f(i15, iA3);
                    i14 = i15;
                }
            }
        }
        return iA2;
    }

    public static final int F(int i11) {
        int i12 = 306783378 & i11;
        int i13 = 613566756 & i11;
        return (i11 & (-920350135)) | (i13 >> 1) | i12 | ((i12 << 1) & i13);
    }

    public static final u3.i G(v1[] v1VarArr, u3.i iVar, u3.i iVar2) {
        u3.i iVar3 = u3.i.f40658g;
        u3.h hVar = new u3.h(iVar3);
        hVar.f40657g = iVar3;
        for (v1 v1Var : v1VarArr) {
            u1 u1Var = (u1) v1Var.f29469d;
            if (v1Var.f29468c || !iVar.containsKey(u1Var)) {
                hVar.put(u1Var, u1Var.c(v1Var, (f3) iVar2.get(u1Var)));
            }
        }
        return hVar.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(m3.v1 r11, kotlin.jvm.functions.Function2 r12, m3.n r13, int r14) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.i.a(m3.v1, kotlin.jvm.functions.Function2, m3.n, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(m3.v1[] r10, kotlin.jvm.functions.Function2 r11, m3.n r12, int r13) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.i.b(m3.v1[], kotlin.jvm.functions.Function2, m3.n, int):void");
    }

    public static final void c(Object obj, Object obj2, Function1 function1, n nVar) {
        s sVar = (s) nVar;
        boolean zF = sVar.f(obj) | sVar.f(obj2);
        Object objM = sVar.M();
        if (zF || objM == m.f29332a) {
            objM = new j0(function1);
            sVar.k0(objM);
        }
    }

    public static final void d(Object obj, Function1 function1, n nVar) {
        s sVar = (s) nVar;
        boolean zF = sVar.f(obj);
        Object objM = sVar.M();
        if (zF || objM == m.f29332a) {
            objM = new j0(function1);
            sVar.k0(objM);
        }
    }

    public static final void e(Object[] objArr, Function1 function1, n nVar) {
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= ((s) nVar).f(obj);
        }
        s sVar = (s) nVar;
        Object objM = sVar.M();
        if (zF || objM == m.f29332a) {
            sVar.k0(new j0(function1));
        }
    }

    public static final void f(Object obj, Object obj2, Object obj3, Function2 function2, n nVar) {
        s sVar = (s) nVar;
        CoroutineContext coroutineContext = sVar.R;
        boolean zF = sVar.f(obj) | sVar.f(obj2) | sVar.f(obj3);
        Object objM = sVar.M();
        if (zF || objM == m.f29332a) {
            objM = new v0(coroutineContext, function2);
            sVar.k0(objM);
        }
    }

    public static final void g(Object obj, Object obj2, Function2 function2, n nVar) {
        s sVar = (s) nVar;
        CoroutineContext coroutineContext = sVar.R;
        boolean zF = sVar.f(obj) | sVar.f(obj2);
        Object objM = sVar.M();
        if (zF || objM == m.f29332a) {
            objM = new v0(coroutineContext, function2);
            sVar.k0(objM);
        }
    }

    public static final void h(Object obj, Function2 function2, n nVar) {
        s sVar = (s) nVar;
        CoroutineContext coroutineContext = sVar.R;
        boolean zF = sVar.f(obj);
        Object objM = sVar.M();
        if (zF || objM == m.f29332a) {
            objM = new v0(coroutineContext, function2);
            sVar.k0(objM);
        }
    }

    public static final void i(Object[] objArr, Function2 function2, n nVar) {
        s sVar = (s) nVar;
        CoroutineContext coroutineContext = sVar.R;
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= sVar.f(obj);
        }
        Object objM = sVar.M();
        if (zF || objM == m.f29332a) {
            sVar.k0(new v0(coroutineContext, function2));
        }
    }

    public static final void j(Function0 function0, n nVar) {
        n3.m0 m0Var = ((s) nVar).M.f30440b.f30437h;
        m0Var.K(n3.c0.f30453c);
        na0.a.t0(m0Var, 0, function0);
    }

    public static final void k(q1.f0 f0Var, int i11) {
        if (f0Var.f35790b == 0 || !(f0Var.a(0) == i11 || f0Var.a(f0Var.f35790b - 1) == i11)) {
            int i12 = f0Var.f35790b;
            f0Var.c(i11);
            while (i12 > 0) {
                int i13 = ((i12 + 1) >>> 1) - 1;
                int iA = f0Var.a(i13);
                if (i11 <= iA) {
                    break;
                }
                f0Var.f(i12, iA);
                i12 = i13;
            }
            f0Var.f(i12, i11);
        }
    }

    public static void l(q2 q2Var, List list, x1 x1Var) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iC = q2Var.c((a) list.get(i11));
            int iP = q2Var.P(q2Var.r(iC), q2Var.f29383b);
            Object obj = iP < q2Var.g(q2Var.r(iC + 1), q2Var.f29383b) ? q2Var.f29384c[q2Var.h(iP)] : m.f29332a;
            w1 w1Var = obj instanceof w1 ? (w1) obj : null;
            if (w1Var != null) {
                w1Var.f29473a = x1Var;
            }
        }
    }

    public static final b1 m(y80.i iVar, Object obj, CoroutineContext coroutineContext, n nVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            coroutineContext = kotlin.coroutines.g.f26549a;
        }
        s sVar = (s) nVar;
        boolean zH = sVar.h(coroutineContext) | sVar.h(iVar);
        Object objM = sVar.M();
        x70.c cVar = null;
        f fVar = m.f29332a;
        if (zH || objM == fVar) {
            objM = new h2.a0(coroutineContext, iVar, cVar, 21);
            sVar.k0(objM);
        }
        Function2 function2 = (Function2) objM;
        Object objM2 = sVar.M();
        if (objM2 == fVar) {
            objM2 = w(obj);
            sVar.k0(objM2);
        }
        b1 b1Var = (b1) objM2;
        boolean zH2 = sVar.h(function2);
        Object objM3 = sVar.M();
        if (zH2 || objM3 == fVar) {
            objM3 = new x2(function2, b1Var, cVar, 2);
            sVar.k0(objM3);
        }
        g(iVar, coroutineContext, (Function2) objM3, sVar);
        return b1Var;
    }

    public static final b1 n(y80.y1 y1Var, n nVar, int i11) {
        return m(y1Var, y1Var.getValue(), kotlin.coroutines.g.f26549a, nVar, (i11 & 14) | ((i11 << 3) & 896), 0);
    }

    public static final v80.b0 o(kotlin.coroutines.g gVar, n nVar) {
        gVar.getClass();
        return new h2(((s) nVar).R, gVar);
    }

    public static final o3.e p() {
        t5.a aVar = w2.f29481b;
        o3.e eVar = (o3.e) aVar.j();
        if (eVar != null) {
            return eVar;
        }
        o3.e eVar2 = new o3.e(new r[0], 0);
        aVar.I(eVar2);
        return eVar2;
    }

    public static final i0 q(Function0 function0) {
        t5.a aVar = w2.f29480a;
        return new i0(function0, null);
    }

    public static final i0 r(Function0 function0, v2 v2Var) {
        t5.a aVar = w2.f29480a;
        return new i0(function0, v2Var);
    }

    public static final int s(n nVar) {
        nVar.getClass();
        return Long.hashCode(((s) nVar).T);
    }

    public static final w1 t(n nVar) {
        s sVar = (s) nVar;
        w1 w1VarY = sVar.y();
        if (w1VarY == null) {
            com.braze.h2.b("no recompose scope found");
            return null;
        }
        sVar.getClass();
        w1VarY.f29474b |= 1;
        return w1VarY;
    }

    public static final x0 u(CoroutineContext coroutineContext) {
        x0 x0Var = (x0) coroutineContext.get(f.f29271c);
        if (x0Var != null) {
            return x0Var;
        }
        com.braze.h2.b("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final void v(n nVar, Integer num, Function2 function2) {
        s sVar = (s) nVar;
        if (sVar.S) {
            sVar.b(num, function2);
        }
    }

    public static k1 w(Object obj) {
        return new k1(obj, f.f29275g);
    }

    public static final b1 x(Object obj, Function2 function2, n nVar) {
        s sVar = (s) nVar;
        Object objM = sVar.M();
        f fVar = m.f29332a;
        if (objM == fVar) {
            objM = w(obj);
            sVar.k0(objM);
        }
        b1 b1Var = (b1) objM;
        Unit unit = Unit.f26487a;
        boolean zH = sVar.h(function2);
        Object objM2 = sVar.M();
        if (zH || objM2 == fVar) {
            objM2 = new x2(function2, b1Var, null, 0);
            sVar.k0(objM2);
        }
        h(unit, (Function2) objM2, sVar);
        return b1Var;
    }

    public static final Object y(u3.i iVar, u1 u1Var) {
        u1Var.getClass();
        Object objB = iVar.get(u1Var);
        if (objB == null) {
            objB = u1Var.b();
        }
        return ((f3) objB).a(iVar);
    }

    public static final void z(n nVar, Function1 function1) {
        ((s) nVar).b(Unit.f26487a, new g2.h(function1, 1));
    }
}
