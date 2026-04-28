package yj;

import android.content.Context;
import androidx.lifecycle.s1;
import c5.v0;
import cn.w;
import com.app.tgtg.R;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.local.SnackBarType;
import com.braze.h2;
import d2.g0;
import d2.m2;
import d2.u;
import d2.z1;
import d40.t1;
import f2.c0;
import g3.g7;
import g3.v3;
import g3.w6;
import g3.x5;
import i4.r0;
import java.util.List;
import k3.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import m3.b1;
import m3.c3;
import m3.s;
import m3.w1;
import o30.e0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import s1.y;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q {
    /* JADX WARN: Type inference failed for: r11v4, types: [T, java.lang.Object] */
    public static final void a(xj.k kVar, final Function1 function1, final Function1 function12, final Function2 function2, final Function0 function0, boolean z11, m3.n nVar, int i11) {
        s sVar;
        xj.k kVar2;
        final xj.k kVar3;
        float fD;
        float fD2;
        function1.getClass();
        function12.getClass();
        function2.getClass();
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1315393795);
        int i12 = i11 | 2 | (sVar2.h(function1) ? 32 : 16) | (sVar2.h(function12) ? 256 : 128) | (sVar2.h(function2) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function0) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.g(z11) ? 131072 : 65536);
        if (sVar2.R(i12 & 1, (74899 & i12) != 74898)) {
            sVar2.W();
            if ((i11 & 1) == 0 || sVar2.z()) {
                s1 s1VarA = z8.a.a(sVar2);
                if (s1VarA == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                kVar3 = (xj.k) t1.K(Reflection.getOrCreateKotlinClass(xj.k.class), s1VarA, e0.r(s1VarA, sVar2), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar2);
            } else {
                sVar2.U();
                kVar3 = kVar;
            }
            sVar2.r();
            final Context context = (Context) sVar2.j(v0.f7390b);
            final b1 b1VarN = m3.i.n(kVar3.f44418n, sVar2, 0);
            final b1 b1VarN2 = m3.i.n(kVar3.f44420p, sVar2, 0);
            final b1 b1VarN3 = m3.i.n(kVar3.f44422r, sVar2, 0);
            b1 b1VarN4 = m3.i.n(kVar3.f44415j, sVar2, 0);
            b1 b1VarN5 = m3.i.n(kVar3.l, sVar2, 0);
            final b1 b1VarN6 = m3.i.n(kVar3.f44424t, sVar2, 0);
            final b1 b1VarN7 = m3.i.n(kVar3.f44426v, sVar2, 0);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = m3.i.n(kVar3.f44428x, sVar2, 0).getValue();
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM);
            }
            final b1 b1Var = (b1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM2);
            }
            final b1 b1Var2 = (b1) objM2;
            final t tVarE = k3.m.e(sVar2);
            b1 b1VarN8 = m3.i.n(kVar3.E, sVar2, 0);
            final w6 w6VarF = v3.f(6, 2, null, sVar2);
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = e0.f.w(z11, sVar2);
            }
            final b1 b1Var3 = (b1) objM3;
            Object objM4 = sVar2.M();
            if (objM4 == fVar) {
                objM4 = new g7();
                sVar2.k0(objM4);
            }
            g7 g7Var = (g7) objM4;
            final b1 b1VarN9 = m3.i.n(kVar3.C, sVar2, 0);
            SnackBarType snackBarType = (SnackBarType) b1VarN8.getValue();
            boolean zF = sVar2.f(b1VarN8) | sVar2.h(kVar3);
            Object objM5 = sVar2.M();
            if (zF || objM5 == fVar) {
                objM5 = new os.c(b1VarN8, g7Var, kVar3, (x70.c) null);
                sVar2.k0(objM5);
            }
            m3.i.h(snackBarType, (Function2) objM5, sVar2);
            g0 g0Var = m2.f13850c;
            float f11 = 0;
            if (((Number) b1VarN4.getValue()).intValue() > 0) {
                sVar2.a0(-383269220);
                fD = d70.a.e(sVar2, ((Number) b1VarN4.getValue()).intValue());
                sVar2.q(false);
            } else {
                sVar2.a0(-383193735);
                fD = d70.a.d(context.getResources().getDimension(R.dimen.status_bar_height), sVar2);
                sVar2.q(false);
            }
            if (((Number) b1VarN5.getValue()).intValue() > 0) {
                sVar2.a0(-382956647);
                fD2 = d70.a.e(sVar2, ((Number) b1VarN5.getValue()).intValue());
                sVar2.q(false);
            } else {
                sVar2.a0(-382878124);
                fD2 = d70.a.d(context.getResources().getDimension(R.dimen.bottom_nav_view_height), sVar2);
                sVar2.q(false);
            }
            sVar = sVar2;
            x5.a(d2.c.C(g0Var, f11, fD, f11, fD2), a.f46045e, null, u3.e.e(-1354002359, sVar2, new qk.i(g7Var, 3)), null, 0, 0L, 0L, null, u3.e.e(-970792750, sVar2, new i80.n() { // from class: yj.j
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v19 */
                /* JADX WARN: Type inference failed for: r1v20, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r1v26 */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // i80.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Context context2;
                    Object cVar;
                    xj.k kVar4;
                    b1 b1Var4;
                    b1 b1Var5;
                    s sVar3;
                    ?? r12;
                    z1 z1Var = (z1) obj;
                    m3.n nVar2 = (m3.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    z1Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((s) nVar2).f(z1Var) ? 4 : 2;
                    }
                    s sVar4 = (s) nVar2;
                    if (sVar4.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        xj.k kVar5 = kVar3;
                        c0 c0VarA = f2.e0.a(kVar5.M.h(), kVar5.N.h(), 0, 0, sVar4);
                        boolean zF2 = sVar4.f(c0VarA) | sVar4.h(kVar5);
                        Object objM6 = sVar4.M();
                        x70.c cVar2 = null;
                        Object obj4 = m3.m.f29332a;
                        if (zF2 || objM6 == obj4) {
                            objM6 = new tm.d(c0VarA, kVar5, null, 25);
                            sVar4.k0(objM6);
                        }
                        m3.i.h(c0VarA, (Function2) objM6, sVar4);
                        boolean zF3 = sVar4.f(c0VarA) | sVar4.h(kVar5);
                        Context context3 = context;
                        boolean zH = zF3 | sVar4.h(context3);
                        Object objM7 = sVar4.M();
                        if (zH || objM7 == obj4) {
                            tg.g gVar = new tg.g(c0VarA, kVar5, context3, cVar2, 16);
                            kVar5 = kVar5;
                            context2 = context3;
                            sVar4.k0(gVar);
                            objM7 = gVar;
                        } else {
                            context2 = context3;
                        }
                        m3.i.h(c0VarA, (Function2) objM7, sVar4);
                        long j9 = lv.s.J;
                        r0 r0Var = i4.g0.f23254b;
                        b4.q qVar = b4.q.f5711a;
                        b4.t tVarR = d2.c.r(d2.c.y(v1.n.j(qVar, j9, r0Var), z1Var).then(m2.f13850c));
                        c3 c3Var = b1VarN7;
                        boolean zBooleanValue = ((Boolean) c3Var.getValue()).booleanValue();
                        boolean zH2 = sVar4.h(kVar5) | sVar4.h(context2);
                        Object objM8 = sVar4.M();
                        if (zH2 || objM8 == obj4) {
                            objM8 = new us.j(29, kVar5, context2);
                            sVar4.k0(objM8);
                        }
                        t tVar = tVarE;
                        b4.t tVarD = k3.m.d(tVarR, zBooleanValue, tVar, (Function0) objM8);
                        u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                        int iHashCode = Long.hashCode(sVar4.T);
                        u3.i iVarL = sVar4.l();
                        b4.t tVarC = b4.a.c(tVarD, sVar4);
                        b5.j.R.getClass();
                        b5.h hVar = b5.i.f5839b;
                        sVar4.e0();
                        if (sVar4.S) {
                            sVar4.k(hVar);
                        } else {
                            sVar4.n0();
                        }
                        m3.i.C(u0VarD, b5.i.f5843f, sVar4);
                        m3.i.C(iVarL, b5.i.f5842e, sVar4);
                        m3.i.v(sVar4, Integer.valueOf(iHashCode), b5.i.f5844g);
                        m3.i.z(sVar4, b5.i.f5845h);
                        m3.i.C(tVarC, b5.i.f5841d, sVar4);
                        b4.k kVar6 = b4.d.f5684b;
                        u uVar = u.f13938a;
                        b4.t tVarC2 = m2.c(m2.s(uVar.a(qVar, kVar6), 0.0f, 500, 1), 1.0f);
                        c3 c3Var2 = b1VarN3;
                        boolean zF4 = sVar4.f(c3Var2);
                        c3 c3Var3 = b1VarN2;
                        boolean zF5 = zF4 | sVar4.f(c3Var3);
                        Function0 function02 = function0;
                        boolean zF6 = zF5 | sVar4.f(function02);
                        c3 c3Var4 = b1VarN;
                        boolean zF7 = zF6 | sVar4.f(c3Var4);
                        c3 c3Var5 = b1VarN9;
                        boolean zF8 = zF7 | sVar4.f(c3Var5) | sVar4.h(kVar5);
                        Function1 function13 = function1;
                        boolean zF9 = zF8 | sVar4.f(function13);
                        Function1 function14 = function12;
                        boolean zF10 = zF9 | sVar4.f(function14);
                        Function2 function22 = function2;
                        boolean zF11 = zF10 | sVar4.f(function22);
                        Object objM9 = sVar4.M();
                        b1 b1Var6 = b1Var;
                        b1 b1Var7 = b1Var3;
                        if (zF11 || objM9 == obj4) {
                            cVar = new is.c(kVar5, c3Var2, function02, c3Var3, c3Var4, function13, function14, c3Var5, b1Var6, function22, b1Var7);
                            kVar4 = kVar5;
                            b1Var4 = b1Var6;
                            b1Var5 = b1Var7;
                            sVar4.k0(cVar);
                        } else {
                            cVar = objM9;
                            b1Var5 = b1Var7;
                            kVar4 = kVar5;
                            b1Var4 = b1Var6;
                        }
                        ox.h.c(tVarC2, c0VarA, null, null, null, null, false, null, (Function1) cVar, sVar4, 0, 508);
                        k3.i.f25821a.a(tVar, ((Boolean) c3Var.getValue()).booleanValue(), uVar.a(qVar, kVar6), 0L, 0L, 0.0f, sVar4, 0, 56);
                        s sVar5 = sVar4;
                        sVar5.q(true);
                        boolean zBooleanValue2 = ((Boolean) b1Var4.getValue()).booleanValue();
                        b1 b1Var8 = b1Var2;
                        if (zBooleanValue2) {
                            sVar5.a0(1429132704);
                            Integer numValueOf = Integer.valueOf(R.string.notification_settings_push_notifications_body);
                            boolean zH3 = sVar5.h(kVar4);
                            Object objM10 = sVar5.M();
                            if (zH3 || objM10 == obj4) {
                                objM10 = new l((Object) kVar4, (Object) b1Var4, (Object) b1Var8, 0);
                                sVar5.k0(objM10);
                            }
                            Function0 function03 = (Function0) objM10;
                            Integer numValueOf2 = Integer.valueOf(R.string.notification_settings_push_notifications_cancel_button);
                            boolean zH4 = sVar5.h(kVar4);
                            Object objM11 = sVar5.M();
                            if (zH4 || objM11 == obj4) {
                                objM11 = new lq.b(kVar4, b1Var4, 2);
                                sVar5.k0(objM11);
                            }
                            cg.j.i(null, numValueOf, null, null, R.string.notification_settings_push_notifications_confirm_button, 0L, function03, numValueOf2, (Function0) objM11, 0L, 0L, null, null, null, sVar5, 0, 0, 15917);
                            s sVar6 = sVar5;
                            sVar6.q(false);
                            sVar3 = sVar6;
                        } else {
                            sVar5.a0(1429824624);
                            sVar5.q(false);
                            sVar3 = sVar5;
                        }
                        if (((Boolean) b1Var5.getValue()).booleanValue()) {
                            sVar3.a0(1429862227);
                            boolean zD = kVar4.f44407b.d();
                            Object objM12 = sVar3.M();
                            if (objM12 == obj4) {
                                objM12 = new xq.b(b1Var5, 4);
                                sVar3.k0(objM12);
                            }
                            a.k(w6VarF, zD, (Function0) objM12, sVar3, MLKEMEngine.KyberPolyBytes);
                            r12 = 0;
                            sVar3.q(false);
                        } else {
                            r12 = 0;
                            sVar3.a0(1430136112);
                            sVar3.q(false);
                        }
                        Ref.ObjectRef objectRef2 = objectRef;
                        GenericErrors genericErrors = (GenericErrors) objectRef2.element;
                        if (genericErrors == null) {
                            sVar3.a0(1430159423);
                            sVar3.q(r12);
                        } else {
                            sVar3.a0(1430159424);
                            cg.o.a(genericErrors, null, null, sVar3, 0, 6);
                            objectRef2.element = null;
                            sVar3.q(r12);
                        }
                        if (((Boolean) b1VarN6.getValue()).booleanValue()) {
                            j4.s.y(1430262220, r12, sVar3, sVar3, r12);
                        } else {
                            sVar3.a0(1430296816);
                            sVar3.q(r12);
                        }
                        Boolean bool = (Boolean) b1Var8.getValue();
                        bool.getClass();
                        boolean zH5 = sVar3.h(kVar4);
                        Object objM13 = sVar3.M();
                        if (zH5 || objM13 == obj4) {
                            objM13 = new rf.c(kVar4, b1Var8, null, 26);
                            sVar3.k0(objM13);
                        }
                        m3.i.h(bool, (Function2) objM13, sVar3);
                    } else {
                        sVar4.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, 805309488, 500);
            kVar2 = kVar3;
        } else {
            sVar = sVar2;
            sVar.U();
            kVar2 = kVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new w(kVar2, function1, function12, function2, function0, z11, i11);
        }
    }

    public static final void b(xj.k kVar, List list, Function1 function1, Function2 function2, m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(1631094329);
        int i12 = (sVar.h(kVar) ? 4 : 2) | i11 | (sVar.h(list) ? 32 : 16) | (sVar.h(function1) ? 256 : 128) | (sVar.h(function2) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            y.d(!list.isEmpty(), null, null, s1.r0.o(3, null).a(s1.r0.j(null, 15)).a(s1.r0.e(null, 3)), null, u3.e.e(1304455777, sVar, new y1.d(list, function1, function2, kVar)), sVar, 199680, 22);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new i(kVar, list, function1, function2, i11);
        }
    }
}
