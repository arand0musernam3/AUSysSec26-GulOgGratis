package zl;

import androidx.lifecycle.c1;
import androidx.lifecycle.s1;
import b4.k;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import bn.z;
import c5.x1;
import com.app.tgtg.R;
import com.braze.h2;
import d2.g0;
import d2.m2;
import d2.p;
import d2.u;
import d2.w;
import d2.w0;
import d2.y;
import d40.t1;
import g3.d9;
import g3.g9;
import g3.k9;
import g3.r1;
import g3.r9;
import g3.v3;
import g3.w6;
import g4.l;
import g4.v;
import kotlin.Unit;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import m3.b1;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import o30.e0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.brotli.dec.BrotliInputStream;
import v80.b0;
import w.a0;
import z1.a2;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f47964a = new u3.d(new yn.a(28), false, 649874602);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f47965b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f47966c = 0;

    public static final void a(w6 w6Var, Function0 function0, n nVar, int i11) {
        s sVar;
        w6Var.getClass();
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1275206837);
        int i12 = i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.h(function0) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            boolean z11 = (i12 & 112) == 32;
            Object objM = sVar2.M();
            if (z11 || objM == m.f29332a) {
                objM = new yk.d(3, function0);
                sVar2.k0(objM);
            }
            sVar = sVar2;
            v3.a((Function0) objM, null, w6Var, 0.0f, false, null, 0L, 0L, 0.0f, 0L, f47964a, null, null, u3.e.e(1741898519, sVar2, new bm.c(7, function0)), sVar, (i12 << 6) & 896, 3078, 7162);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bm.d(w6Var, function0, i11, 2);
        }
    }

    public static final void b(t tVar, v vVar, String str, Integer num, Function1 function1, Function0 function0, n nVar, int i11) {
        s sVar;
        b1 b1Var;
        Function1 function12 = function1;
        vVar.getClass();
        str.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1426726323);
        int i12 = i11 | (sVar2.f(str) ? 256 : 128) | (sVar2.f(num) ? 2048 : 1024) | (sVar2.h(function12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar2.R(i12 & 1, (74899 & i12) != 74898)) {
            l lVar = (l) sVar2.j(x1.f7417i);
            Object objM = sVar2.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = i.w(str);
                sVar2.k0(objM);
            }
            b1 b1Var2 = (b1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = i.w(num);
                sVar2.k0(objM2);
            }
            b1 b1Var3 = (b1) objM2;
            boolean z11 = (i12 & 7168) == 2048;
            Object objM3 = sVar2.M();
            if (z11 || objM3 == fVar) {
                objM3 = new rf.c(num, b1Var3, null, 28);
                sVar2.k0(objM3);
            }
            i.h(num, (Function2) objM3, sVar2);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVar, sVar2);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            b5.g gVar = b5.i.f5843f;
            i.C(u0VarD, gVar, sVar2);
            b5.g gVar2 = b5.i.f5842e;
            i.C(iVarL, gVar2, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            i.v(sVar2, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            i.z(sVar2, dVar);
            b5.g gVar4 = b5.i.f5841d;
            i.C(tVarC, gVar4, sVar2);
            k kVar = b4.d.f5687e;
            u uVar = u.f13938a;
            q qVar = q.f5711a;
            t tVarA = uVar.a(qVar, kVar);
            b4.i iVar = b4.d.f5695n;
            d2.d dVar2 = d2.i.f13803c;
            y yVarA = w.a(dVar2, iVar, sVar2, 48);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            t tVarC2 = b4.a.c(tVarA, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            i.C(yVarA, gVar, sVar2);
            i.C(iVarL2, gVar2, sVar2);
            a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
            i.C(tVarC2, gVar4, sVar2);
            t tVarU = m2.u(qVar, null, 3);
            float f11 = lv.t.f28253g;
            r9.d(f0.U(sVar2, R.string.login_charity_provide_email), d2.c.B(tVarU, f11, 0.0f, 2), lv.s.f28215a, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28264c, sVar2, 432, 12582912, 130040);
            t tVarD = g4.d.d(d2.c.D(d2.c.B(m2.d(qVar, 1.0f), f11, 0.0f, 2), 0.0f, lv.t.f28256j, 0.0f, 0.0f, 13).then(new w0(iVar)), vVar);
            String str2 = (String) b1Var2.getValue();
            g9 g9Var = g9.f18691a;
            long j9 = lv.s.f28217b;
            long j11 = lv.s.I;
            d9 d9VarC = g9.c(j9, j9, 0L, j11, j11, 0L, 0L, 0L, 0L, 0L, sVar2, 2147483596);
            m5.u0 u0VarA = m5.u0.a(lv.v.f28274n, 0L, 0L, null, null, 0L, null, 3, 0L, null, null, 16744447);
            Object objM4 = sVar2.M();
            if (objM4 == fVar) {
                b1Var = b1Var3;
                objM4 = new co.g(b1Var, b1Var2, 5);
                sVar2.k0(objM4);
            } else {
                b1Var = b1Var3;
            }
            k9.a(str2, (Function1) objM4, tVarD, false, u0VarA, u3.e.e(-1713192530, sVar2, new r1(b1Var, 12)), null, null, null, true, 0, 0, null, null, d9VarC, sVar2, 48, 12583296, 0, 4059096);
            sVar2.q(true);
            t tVarB = d2.c.B(uVar.a(qVar, b4.d.f5690h), f11, 0.0f, 2);
            y yVarA2 = w.a(dVar2, b4.d.f5694m, sVar2, 0);
            int iHashCode3 = Long.hashCode(sVar2.T);
            u3.i iVarL3 = sVar2.l();
            t tVarC3 = b4.a.c(tVarB, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            i.C(yVarA2, gVar, sVar2);
            i.C(iVarL3, gVar2, sVar2);
            a0.y(iHashCode3, sVar2, gVar3, sVar2, dVar);
            i.C(tVarC3, gVar4, sVar2);
            r9.d(f0.U(sVar2, R.string.login_charity_email_helper_title), b4.a.a(m2.d(qVar, 1.0f), c5.m2.f7291a, new on.l(29, function0)), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28281u, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            t tVarB2 = d2.c.B(m2.d(qVar, 1.0f), 0.0f, lv.t.f28252f, 1);
            String strU = f0.U(sVar2, R.string.login_charity_next);
            boolean zH = sVar2.h(lVar) | ((i12 & 57344) == 16384);
            Object objM5 = sVar2.M();
            if (zH || objM5 == fVar) {
                function12 = function1;
                objM5 = new yj.l((Object) lVar, (Object) function12, b1Var2, 7);
                sVar2.k0(objM5);
            } else {
                function12 = function1;
            }
            v0.n.l(tVarB2, strU, null, null, null, false, false, null, null, (Function0) objM5, sVar2, 6, 508);
            sVar = sVar2;
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new z(tVar, vVar, str, num, function12, function0, i11, 10);
        }
    }

    public static final void c(t tVar, g gVar, Function1 function1, n nVar, int i11) {
        g gVar2;
        g gVar3;
        int i12;
        b0 b0Var;
        Object cVar;
        g0 g0Var;
        boolean z11;
        boolean z12;
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1028735478);
        int i13 = i11 | 16 | (sVar.h(function1) ? 256 : 128);
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                s1 s1VarA = z8.a.a(sVar);
                if (s1VarA == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    gVar3 = (g) t1.K(Reflection.getOrCreateKotlinClass(g.class), s1VarA, e0.r(s1VarA, sVar), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
                    i12 = i13 & (-113);
                }
            } else {
                sVar.U();
                i12 = i13 & (-113);
                gVar3 = gVar;
            }
            sVar.r();
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = new v();
                sVar.k0(objM);
            }
            v vVar = (v) objM;
            d dVar = (d) i.n(gVar3.f47980e, sVar, 0).getValue();
            c1 c1Var = gVar3.f47977b;
            o0 o0Var = o0.f26530a;
            String str = ((am.i) e0.f.f(o0Var, am.i.class, c1Var, o0Var)).f1611b;
            w6 w6VarF = v3.f(6, 2, null, sVar);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = i.w(Boolean.FALSE);
                sVar.k0(objM2);
            }
            b1 b1Var = (b1) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM3);
            }
            b0 b0Var2 = (b0) objM3;
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = new wi.s(vVar, null, 3);
                sVar.k0(objM4);
            }
            i.h(vVar, (Function2) objM4, sVar);
            Unit unit = Unit.f26487a;
            boolean zH = ((i12 & 896) == 256) | sVar.h(gVar3);
            Object objM5 = sVar.M();
            if (zH || objM5 == fVar) {
                objM5 = new a2(gVar3, function1, null, 9);
                sVar.k0(objM5);
            }
            i.h(unit, (Function2) objM5, sVar);
            k kVar = b4.d.f5683a;
            u0 u0VarD = p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVar, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar4 = b5.i.f5843f;
            i.C(u0VarD, gVar4, sVar);
            b5.g gVar5 = b5.i.f5842e;
            i.C(iVarL, gVar5, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar6 = b5.i.f5844g;
            i.v(sVar, numValueOf, gVar6);
            b5.d dVar2 = b5.i.f5845h;
            i.z(sVar, dVar2);
            b5.g gVar7 = b5.i.f5841d;
            i.C(tVarC, gVar7, sVar);
            g0 g0Var2 = m2.f13850c;
            Integer num = dVar.f47969a;
            boolean zH2 = sVar.h(gVar3);
            g gVar8 = gVar3;
            Object objM6 = sVar.M();
            if (zH2 || objM6 == fVar) {
                b0Var = b0Var2;
                cVar = new c(1, gVar8, g.class, "submitEmail", "submitEmail(Ljava/lang/String;)V", 0);
                sVar.k0(cVar);
            } else {
                cVar = objM6;
                b0Var = b0Var2;
            }
            Function1 function12 = (Function1) ((KFunction) cVar);
            Object objM7 = sVar.M();
            if (objM7 == fVar) {
                g0Var = g0Var2;
                objM7 = new xq.b(b1Var, 8);
                sVar.k0(objM7);
            } else {
                g0Var = g0Var2;
            }
            g0 g0Var3 = g0Var;
            b(g0Var3, vVar, str, num, function12, (Function0) objM7, sVar, 196662);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(1149767596);
                boolean zH3 = sVar.h(b0Var) | sVar.f(w6VarF);
                Object objM8 = sVar.M();
                if (zH3 || objM8 == fVar) {
                    objM8 = new go.f(b0Var, w6VarF, b1Var, 6);
                    sVar.k0(objM8);
                }
                z11 = false;
                a(w6VarF, (Function0) objM8, sVar, 0);
                sVar.q(false);
            } else {
                z11 = false;
                sVar.a0(1150061662);
                sVar.q(false);
            }
            if (dVar.f47970b) {
                sVar.a0(1150102148);
                t tVarA = b4.a.a(g0Var3, c5.m2.f7291a, new em.d(5));
                u0 u0VarD2 = p.d(kVar, z11);
                int iHashCode2 = Long.hashCode(sVar.T);
                u3.i iVarL2 = sVar.l();
                t tVarC2 = b4.a.c(tVarA, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                i.C(u0VarD2, gVar4, sVar);
                i.C(iVarL2, gVar5, sVar);
                a0.y(iHashCode2, sVar, gVar6, sVar, dVar2);
                i.C(tVarC2, gVar7, sVar);
                cg.j.q(0, 0, u.f13938a.a(q.f5711a, b4.d.f5687e), sVar);
                z12 = true;
                sVar.q(true);
                sVar.q(false);
            } else {
                z12 = true;
                sVar.a0(1150403902);
                sVar.q(z11);
            }
            sVar.q(z12);
            gVar2 = gVar8;
        } else {
            sVar.U();
            gVar2 = gVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rs.b(tVar, gVar2, function1, i11, 19);
        }
    }
}
