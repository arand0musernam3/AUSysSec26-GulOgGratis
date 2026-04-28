package bm;

import a3.m2;
import a3.m3;
import a3.r2;
import a3.x1;
import android.content.Context;
import androidx.lifecycle.c1;
import androidx.lifecycle.s1;
import b4.q;
import b4.t;
import c5.v0;
import com.app.tgtg.R;
import com.braze.h2;
import d2.u;
import d2.w;
import d2.w0;
import d40.t1;
import g3.d9;
import g3.g9;
import g3.k9;
import g3.r9;
import g3.v3;
import g3.w6;
import kotlin.Unit;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import lv.v;
import m3.b1;
import m3.s;
import m3.w1;
import o30.e0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import s1.r0;
import s1.y;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f6343a = new u3.d(new r2(15), false, 2000047279);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f6344b = new u3.d(new r2(16), false, -2039895834);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3.d f6345c = new u3.d(new r2(17), false, -785113817);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u3.d f6346d = new u3.d(new r2(18), false, 469668200);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u3.d f6347e = new u3.d(new r2(19), false, 1724450217);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f6348f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f6349g = 0;

    public static final void a(t tVar, boolean z11, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(2028936093);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.f(tVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        int i13 = i12 | (sVar.g(z11) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            y.d(z11, tVar, r0.f(t1.c.j(0.4f, 300.0f, null, 4), 0.0f, 4), null, null, u3.e.e(2108537461, sVar, new m2(dVar, 2)), sVar, ((i13 >> 3) & 14) | 196992 | ((i13 << 3) & 112), 24);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new m3(i11, 1, tVar, dVar, z11);
        }
    }

    public static final void b(int i11, t tVar, String str, Function1 function1, m3.n nVar) {
        int i12;
        Function1 function12;
        str.getClass();
        s sVar = (s) nVar;
        sVar.c0(832916957);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function1) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(1403221251);
                w6 w6VarF = v3.f(6, 2, null, sVar);
                Object objM2 = sVar.M();
                if (objM2 == fVar) {
                    objM2 = new j(b1Var, 0);
                    sVar.k0(objM2);
                }
                d(w6VarF, (Function0) objM2, sVar, 48);
                sVar.q(false);
            } else {
                sVar.a0(1403438437);
                sVar.q(false);
            }
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            b4.k kVar = b4.d.f5687e;
            u uVar = u.f13938a;
            q qVar = q.f5711a;
            t tVarA = uVar.a(qVar, kVar);
            b4.i iVar = b4.d.f5695n;
            d2.y yVarA = w.a(d2.i.f13803c, iVar, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarA, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            t tVarU = d2.m2.u(qVar, null, 3);
            float f11 = lv.t.f28253g;
            int i13 = i12;
            r9.d(f0.U(sVar, R.string.login_charity_verify_email), d2.c.B(tVarU, f11, 0.0f, 2), lv.s.f28215a, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28264c, sVar, 432, 12582912, 130040);
            t tVarB = d2.c.B(d2.m2.d(qVar, 1.0f), f11, 0.0f, 2);
            float f12 = lv.t.f28256j;
            t tVarF = b3.i.f(iVar, d2.c.D(tVarB, 0.0f, f12, 0.0f, 0.0f, 13));
            g9 g9Var = g9.f18691a;
            long j9 = lv.s.f28217b;
            long j11 = lv.s.I;
            d9 d9VarC = g9.c(0L, j9, j9, 0L, j11, j11, 0L, 0L, 0L, 0L, sVar, 2147483545);
            m5.u0 u0VarA = m5.u0.a(v.f28274n, 0L, 0L, null, null, 0L, null, 3, 0L, null, null, 16744447);
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = new defpackage.g(15);
                sVar.k0(objM3);
            }
            k9.a(str, (Function1) objM3, tVarF, false, u0VarA, null, null, null, null, true, 0, 0, null, null, d9VarC, sVar, ((i13 >> 3) & 14) | 3120, 12582912, 0, 4063184);
            c(d2.c.D(d2.m2.d(qVar, 1.0f), 0.0f, f12, 0.0f, 0.0f, 13).then(new w0(iVar)), sVar, 0);
            sVar.q(true);
            t tVarT = d2.m2.t(d2.m2.d(uVar.a(qVar, b4.d.f5690h), 1.0f), 3);
            boolean z11 = (i13 & 896) == 256;
            Object objM4 = sVar.M();
            if (z11 || objM4 == fVar) {
                function12 = function1;
                objM4 = new k(function12, b1Var, 0);
                sVar.k0(objM4);
            } else {
                function12 = function1;
            }
            r9.d(f0.U(sVar, R.string.login_charity_did_not_receive_email_button), d2.c.A(androidx.compose.foundation.b.c(tVarT, false, null, null, (Function0) objM4, 15), f11, lv.t.f28254h), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28281u, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            sVar = sVar;
            sVar.q(true);
        } else {
            function12 = function1;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new l(tVar, str, function12, i11);
        }
    }

    public static final void c(t tVar, m3.n nVar, int i11) {
        b1 b1Var;
        b1 b1Var2;
        b1 b1Var3;
        b1 b1Var4;
        b1 b1Var5;
        s sVar = (s) nVar;
        sVar.c0(-510844875);
        int i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var6 = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM2);
            }
            b1 b1Var7 = (b1) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM3);
            }
            b1 b1Var8 = (b1) objM3;
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM4);
            }
            b1 b1Var9 = (b1) objM4;
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                objM5 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM5);
            }
            b1 b1Var10 = (b1) objM5;
            Unit unit = Unit.f26487a;
            Object objM6 = sVar.M();
            if (objM6 == fVar) {
                objM6 = new af.b(b1Var8, b1Var7, b1Var9, b1Var6, b1Var10, (x70.c) null, 1);
                b1Var = b1Var8;
                b1Var2 = b1Var7;
                b1Var3 = b1Var9;
                b1Var4 = b1Var6;
                b1Var5 = b1Var10;
                sVar.k0(objM6);
            } else {
                b1Var = b1Var8;
                b1Var2 = b1Var7;
                b1Var3 = b1Var9;
                b1Var4 = b1Var6;
                b1Var5 = b1Var10;
            }
            m3.i.h(unit, (Function2) objM6, sVar);
            float f11 = lv.t.f28253g;
            q qVar = q.f5711a;
            r9.d(f0.U(sVar, R.string.login_charity_verify_email_text), d2.c.z(v1.n.j(d2.c.B(qVar, f11, 0.0f, 2), lv.s.f28228h, l2.g.b(12)), lv.t.f28252f), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            sVar = sVar;
            a(d2.c.h(qVar, 67, -20), ((Boolean) b1Var4.getValue()).booleanValue(), f6343a, sVar, 390);
            a(d2.c.h(qVar, 77, -10), ((Boolean) b1Var2.getValue()).booleanValue(), f6344b, sVar, 390);
            b4.k kVar = b4.d.f5691i;
            u uVar = u.f13938a;
            a(d2.c.h(uVar.a(qVar, kVar), -60, 13), ((Boolean) b1Var.getValue()).booleanValue(), f6345c, sVar, MLKEMEngine.KyberPolyBytes);
            a(d2.c.h(uVar.a(qVar, kVar), -34, 36), ((Boolean) b1Var3.getValue()).booleanValue(), f6346d, sVar, MLKEMEngine.KyberPolyBytes);
            a(d2.c.h(uVar.a(qVar, kVar), -63, 90), ((Boolean) b1Var5.getValue()).booleanValue(), f6347e, sVar, MLKEMEngine.KyberPolyBytes);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b(tVar, i11, 0);
        }
    }

    public static final void d(w6 w6Var, Function0 function0, m3.n nVar, int i11) {
        s sVar;
        w6Var.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-2088569980);
        int i12 = i11 | (sVar2.f(w6Var) ? 4 : 2);
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            long j9 = lv.s.J;
            Object objM = sVar2.M();
            if (objM == m3.m.f29332a) {
                objM = new ar.d(3, function0);
                sVar2.k0(objM);
            }
            sVar = sVar2;
            v3.a((Function0) objM, null, w6Var, 0.0f, false, null, j9, 0L, 0.0f, 0L, null, null, null, u3.e.e(-1003560990, sVar2, new c(0, function0)), sVar, ((i12 << 6) & 896) | 1572864, 3078, 7098);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d(w6Var, function0, i11, 0);
        }
    }

    public static final void e(t tVar, p pVar, Function1 function1, m3.n nVar, int i11) {
        t tVar2;
        p pVar2;
        int i12;
        p pVar3;
        p pVar4;
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(-2176890);
        int i13 = i11 | 16 | (sVar.h(function1) ? 256 : 128);
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                s1 s1VarA = z8.a.a(sVar);
                if (s1VarA == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i12 = i13 & (-113);
                    pVar3 = (p) t1.K(Reflection.getOrCreateKotlinClass(p.class), s1VarA, e0.r(s1VarA, sVar), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
                }
            } else {
                sVar.U();
                i12 = i13 & (-113);
                pVar3 = pVar;
            }
            sVar.r();
            Context context = (Context) sVar.j(v0.f7390b);
            Unit unit = Unit.f26487a;
            boolean zH = sVar.h(pVar3) | ((i12 & 896) == 256) | sVar.h(context);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                pVar4 = pVar3;
                objM = new x1(pVar4, function1, context, (x70.c) null, 10);
                sVar.k0(objM);
            } else {
                pVar4 = pVar3;
            }
            m3.i.h(unit, (Function2) objM, sVar);
            c1 c1Var = pVar4.f6381c;
            o0 o0Var = o0.f26530a;
            String str = ((am.l) e0.f.f(o0Var, am.l.class, c1Var, o0Var)).f1613b;
            boolean zH2 = sVar.h(pVar4);
            Object objM2 = sVar.M();
            if (zH2 || objM2 == fVar) {
                al.d dVar = new al.d(1, pVar4, p.class, "trackEvent", "trackEvent(Lcom/app/tgtg/services/analytics/TrackingEvent;)V", 0, 1);
                sVar.k0(dVar);
                objM2 = dVar;
            }
            tVar2 = tVar;
            b(6, tVar2, str, (Function1) ((KFunction) objM2), sVar);
            pVar2 = pVar4;
        } else {
            tVar2 = tVar;
            sVar.U();
            pVar2 = pVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(tVar2, pVar2, function1, i11, 2);
        }
    }
}
