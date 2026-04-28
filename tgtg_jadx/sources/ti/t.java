package ti;

import a3.d0;
import android.app.Activity;
import cg.z;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.user.response.charity.LocalDivergenceDay;
import d2.g0;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import g3.g7;
import g3.r9;
import g3.s0;
import g3.v3;
import g3.w6;
import g3.x5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.b1;
import m3.w1;
import m5.k0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import s1.b0;
import s1.y;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f40272a = new u3.d(new o9.a(27), false, -1751983713);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f40273b = new u3.d(new o9.a(28), false, 770937194);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3.d f40274c = new u3.d(new s60.c(21, (byte) 0), false, 847162526);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u3.d f40275d = new u3.d(new s60.c(22, (byte) 0), false, -450535633);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u3.d f40276e = new u3.d(new d0(7), false, 2095477639);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f40277f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f40278g = 0;

    public static final void a(b4.t tVar, String str, boolean z11, m3.n nVar, int i11) {
        tVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(69235677);
        int i12 = i11 | (sVar.f(tVar) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.g(z11) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            long j9 = lv.s.f28217b;
            float f11 = lv.t.f28252f;
            b4.t tVarJ = v1.n.j(v1.n.k(d2.c.D(tVar, 0.0f, 0.0f, 0.0f, lv.t.f28253g, 7), 1, j9, l2.g.b(f11)), z11 ? j9 : lv.s.J, l2.g.b(f11));
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarJ, sVar);
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
            b4.j jVar = b4.d.f5693k;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarA = d2.c.A(b0.a(qVar, null, 3), f11, 6);
            i2 i2VarA = h2.a(d2.i.f13805e, jVar, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarA, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            int i13 = i12 >> 3;
            y.e(z11, null, null, null, null, f40272a, sVar, 1572870 | (i13 & 112), 30);
            long j11 = j9;
            m5.u0 u0Var = lv.v.f28274n;
            if (z11) {
                j11 = lv.s.J;
            }
            long j12 = j11;
            float f12 = lv.t.f28249c;
            r9.d(str, d2.c.A(qVar, f12, f12), j12, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, i13 & 14, 12582912, 130040);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.d(tVar, str, z11, i11, 14);
        }
    }

    public static final void b(b4.t tVar, s sVar, Function0 function0, m3.n nVar, int i11) {
        m3.s sVar2;
        b4.t tVar2;
        sVar.getClass();
        m3.s sVar3 = (m3.s) nVar;
        sVar3.c0(1318385693);
        int i12 = i11 | 6 | (sVar3.h(sVar) ? 32 : 16) | (sVar3.h(function0) ? 256 : 128);
        if (sVar3.R(i12 & 1, (i12 & 147) != 146)) {
            Object objJ = sVar3.j(e.k.f15295a);
            objJ.getClass();
            Activity activity = (Activity) objJ;
            b1 b1VarN = m3.i.n(sVar.f40265f, sVar3, 0);
            b1 b1VarN2 = m3.i.n(sVar.f40271m, sVar3, 0);
            b1 b1VarN3 = m3.i.n(sVar.f40269j, sVar3, 0);
            b1 b1VarN4 = m3.i.n(sVar.f40270k, sVar3, 0);
            Object objM = sVar3.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar3.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar3.M();
            if (objM2 == fVar) {
                objM2 = new g7();
                sVar3.k0(objM2);
            }
            g7 g7Var = (g7) objM2;
            Object objM3 = sVar3.M();
            if (objM3 == fVar) {
                objM3 = m3.i.o(kotlin.coroutines.g.f26549a, sVar3);
                sVar3.k0(objM3);
            }
            v80.b0 b0Var = (v80.b0) objM3;
            Boolean bool = Boolean.TRUE;
            boolean zH = sVar3.h(sVar) | sVar3.h(activity);
            Object objM4 = sVar3.M();
            if (zH || objM4 == fVar) {
                objM4 = new mn.g(sVar, activity, null, 29);
                sVar3.k0(objM4);
            }
            m3.i.h(bool, (Function2) objM4, sVar3);
            sVar2 = sVar3;
            x5.a(d2.c.F(m2.f13850c), u3.e.e(-1500625959, sVar3, new z(24, function0)), null, u3.e.e(-930354153, sVar3, new qk.i(g7Var, 1)), null, 0, lv.s.J, 0L, null, u3.e.e(1762227310, sVar3, new lo.d(b1VarN3, sVar, b1VarN, b1VarN2, b0Var, b1Var, b1VarN4, g7Var)), sVar2, 806882352, 436);
            tVar2 = b4.q.f5711a;
        } else {
            sVar2 = sVar3;
            sVar2.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar2.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rs.b(tVar2, sVar, function0, i11, 3);
        }
    }

    public static final void c(int i11, List list, Function0 function0, Function1 function1, m3.n nVar) {
        m3.s sVar;
        list.getClass();
        function1.getClass();
        function0.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1253403194);
        int i12 = i11 | (sVar2.h(list) ? 4 : 2) | (sVar2.h(function1) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            b4.t tVarD = d2.c.D(b4.q.f5711a, 0.0f, 30, 0.0f, 0.0f, 13);
            w6 w6VarF = v3.f(6, 2, null, sVar2);
            float f11 = lv.t.f28252f;
            sVar = sVar2;
            v3.a(function0, tVarD, w6VarF, 0.0f, false, l2.g.c(f11, f11, 0.0f, 0.0f, 12), lv.s.J, 0L, 0.0f, 0L, f40275d, null, null, u3.e.e(-511962468, sVar2, new ap.e(function0, list, function1, 20)), sVar, ((i12 >> 6) & 14) | 1572912, 3078, 7064);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.b0(list, function1, function0, i11, 3);
        }
    }

    public static final void d(int i11, List list, Function0 function0, m3.n nVar) {
        list.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-978280327);
        int i12 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarA = d2.c.A(m2.e(m2.d(qVar, 1.0f), lv.t.f28257k), lv.t.f28253g, lv.t.f28251e);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarA, sVar);
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
            String strF = list.size() == 1 ? f(((LocalDivergenceDay) CollectionsKt.O(list)).getDate(), "E, MMM dd, yyyy") : r8.k.m(f(((LocalDivergenceDay) CollectionsKt.O(list)).getDate(), "E, MMM dd, yyyy"), " - ", f(((LocalDivergenceDay) CollectionsKt.W(list)).getDate(), "E, MMM dd, yyyy"));
            m5.u0 u0Var = lv.v.f28274n;
            long j9 = lv.s.C;
            b4.k kVar = b4.d.f5686d;
            d2.u uVar = d2.u.f13938a;
            r9.d(strF, uVar.a(qVar, kVar), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar;
            g3.i2.a(x0.z(R.drawable.system_icon_close_neutral_10, sVar, 0), "chip icon", b4.a.a(uVar.a(qVar, b4.d.f5688f), c5.m2.f7291a, new on.l(14, function0)), j9, sVar, 3128, 0);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rk.a0(list, function0, i11, 8);
        }
    }

    public static final void e(Function0 function0, Function0 function02, m3.n nVar, int i11) {
        b5.g gVar;
        b5.d dVar;
        c5.s sVar;
        float f11;
        d2.e eVar;
        b4.j jVar;
        g0 g0Var;
        boolean z11;
        boolean z12;
        long j9;
        boolean z13;
        long j11;
        b5.h hVar;
        Function0 function03 = function02;
        function0.getClass();
        function03.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-2135952257);
        int i12 = i11 | (sVar2.h(function0) ? 4 : 2) | (sVar2.h(function03) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar2.M();
            if (objM == m3.m.f29332a) {
                objM = m3.i.w(Boolean.TRUE);
                sVar2.k0(objM);
            }
            b1 b1Var = (b1) objM;
            b4.q qVar = b4.q.f5711a;
            long j12 = lv.s.f28217b;
            float f12 = lv.t.f28251e;
            b4.t tVarK = v1.n.k(d2.c.z(m2.e(m2.d(qVar, 1.0f), lv.t.l), lv.t.f28253g), 1, j12, l2.g.b(f12));
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarK, sVar2);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar2);
            } else {
                sVar2.n0();
            }
            b5.g gVar2 = b5.i.f5843f;
            m3.i.C(i2VarA, gVar2, sVar2);
            b5.g gVar3 = b5.i.f5842e;
            m3.i.C(iVarL, gVar3, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar4 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf, gVar4);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar2, dVar2);
            b5.g gVar5 = b5.i.f5841d;
            m3.i.C(tVarC, gVar5, sVar2);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            b4.t tVarJ = v1.n.j(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ((Boolean) b1Var.getValue()).booleanValue() ? j12 : lv.s.J, l2.g.c(f12, 0.0f, 0.0f, f12, 6));
            rk.p pVar = new rk.p(function0, b1Var, 1);
            c5.s sVar3 = c5.m2.f7291a;
            b4.t tVarA = b4.a.a(tVarJ, sVar3, pVar);
            float f13 = lv.t.f28249c;
            float f14 = lv.t.f28252f;
            b4.t tVarA2 = d2.c.A(tVarA, f14, f13);
            b4.k kVar = b4.d.f5687e;
            u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            b4.t tVarC2 = b4.a.c(tVarA2, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar2);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD, gVar2, sVar2);
            m3.i.C(iVarL2, gVar3, sVar2);
            a0.y(iHashCode2, sVar2, gVar4, sVar2, dVar2);
            m3.i.C(tVarC2, gVar5, sVar2);
            g0 g0Var2 = m2.f13850c;
            b4.j jVar2 = b4.d.f5693k;
            d2.e eVar2 = d2.i.f13805e;
            i2 i2VarA2 = h2.a(eVar2, jVar2, sVar2, 54);
            int iHashCode3 = Long.hashCode(sVar2.T);
            u3.i iVarL3 = sVar2.l();
            b4.t tVarC3 = b4.a.c(g0Var2, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar2);
            } else {
                sVar2.n0();
            }
            m3.i.C(i2VarA2, gVar2, sVar2);
            m3.i.C(iVarL3, gVar3, sVar2);
            a0.y(iHashCode3, sVar2, gVar4, sVar2, dVar2);
            m3.i.C(tVarC3, gVar5, sVar2);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar2.a0(687757420);
                gVar = gVar3;
                dVar = dVar2;
                sVar = sVar3;
                f11 = f12;
                eVar = eVar2;
                jVar = jVar2;
                g0Var = g0Var2;
                z12 = true;
                j9 = j12;
                g3.i2.a(x0.z(R.drawable.ic_check_mark_icon, sVar2, 0), "check", d2.c.D(qVar, 0.0f, 0.0f, f13, 0.0f, 11), ((Boolean) b1Var.getValue()).booleanValue() ? lv.s.J : j12, sVar2, 440, 0);
                z11 = false;
                sVar2.q(false);
            } else {
                gVar = gVar3;
                dVar = dVar2;
                sVar = sVar3;
                f11 = f12;
                eVar = eVar2;
                jVar = jVar2;
                g0Var = g0Var2;
                z11 = false;
                z12 = true;
                j9 = j12;
                sVar2.a0(688091445);
                sVar2.q(false);
            }
            String strU = f0.U(sVar2, R.string.charity_conflict_dialog_keep_button);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                z13 = z11;
                j11 = lv.s.J;
            } else {
                z13 = z11;
                j11 = j9;
            }
            m5.u0 u0Var = lv.v.f28274n;
            boolean z14 = z12;
            r9.d(strU, null, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar2, 0, 12582912, 131066);
            sVar2.q(z14);
            sVar2.q(z14);
            s0.o(m2.e(qVar, lv.t.f28255i), 0.0f, j9, sVar2, 390, 2);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            float f15 = f11;
            b4.t tVarA3 = d2.c.A(b4.a.a(v1.n.j(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z14), !((Boolean) b1Var.getValue()).booleanValue() ? j9 : lv.s.J, l2.g.c(0.0f, f15, f15, 0.0f, 9)), sVar, new rk.p(function02, b1Var, 2)), f14, f13);
            u0 u0VarD2 = d2.p.d(kVar, false);
            int iHashCode4 = Long.hashCode(sVar2.T);
            u3.i iVarL4 = sVar2.l();
            b4.t tVarC4 = b4.a.c(tVarA3, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                hVar = hVar2;
                sVar2.k(hVar);
            } else {
                hVar = hVar2;
                sVar2.n0();
            }
            m3.i.C(u0VarD2, gVar2, sVar2);
            b5.g gVar6 = gVar;
            m3.i.C(iVarL4, gVar6, sVar2);
            b5.d dVar3 = dVar;
            a0.y(iHashCode4, sVar2, gVar4, sVar2, dVar3);
            m3.i.C(tVarC4, gVar5, sVar2);
            i2 i2VarA3 = h2.a(eVar, jVar, sVar2, 54);
            int iHashCode5 = Long.hashCode(sVar2.T);
            u3.i iVarL5 = sVar2.l();
            b4.t tVarC5 = b4.a.c(g0Var, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(i2VarA3, gVar2, sVar2);
            m3.i.C(iVarL5, gVar6, sVar2);
            a0.y(iHashCode5, sVar2, gVar4, sVar2, dVar3);
            m3.i.C(tVarC5, gVar5, sVar2);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar2.a0(556540958);
                sVar2.q(false);
            } else {
                sVar2.a0(556205972);
                g3.i2.a(x0.z(R.drawable.ic_check_mark_icon, sVar2, 0), "check", d2.c.D(qVar, 0.0f, 0.0f, f13, 0.0f, 11), !((Boolean) b1Var.getValue()).booleanValue() ? lv.s.J : j9, sVar2, 440, 0);
                sVar2.q(false);
            }
            function03 = function02;
            r9.d(f0.U(sVar2, R.string.charity_conflict_dialog_cancel_button), null, !((Boolean) b1Var.getValue()).booleanValue() ? lv.s.J : j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar2, 0, 12582912, 131066);
            sVar2 = sVar2;
            e0.f.D(sVar2, true, true, true);
        } else {
            sVar2.U();
        }
        w1 w1VarS = sVar2.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.g0(function0, function03, i11, 13);
        }
    }

    public static final String f(LocalDate localDate, String str) {
        localDate.getClass();
        String str2 = DateTimeFormatter.ofPattern(str).format(localDate);
        str2.getClass();
        return k0.c(str2, t5.d.f39798a.k().b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List g(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return n0.f26529a;
        }
        List listL0 = CollectionsKt.l0(arrayList, new a60.r(27));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = listL0.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (arrayList3.isEmpty()) {
                arrayList3.add(listL0.get(i11));
            } else if (Intrinsics.areEqual(((LocalDivergenceDay) CollectionsKt.W(arrayList3)).getDate().plusDays(1L), ((LocalDivergenceDay) listL0.get(i11)).getDate())) {
                arrayList3.add(listL0.get(i11));
            } else {
                arrayList2.add(arrayList3);
                arrayList3 = kotlin.collections.d0.j(listL0.get(i11));
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(arrayList3);
        }
        return arrayList2;
    }
}
