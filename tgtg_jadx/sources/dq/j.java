package dq;

import a3.l0;
import a3.u1;
import b4.q;
import b4.t;
import bn.c0;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import com.google.android.gms.internal.measurement.cg;
import d2.b2;
import d2.g0;
import d2.m2;
import d2.u;
import d2.w0;
import d2.y;
import d2.z;
import g3.d9;
import g3.p;
import g3.q4;
import g3.r9;
import g3.s0;
import g3.z4;
import g9.f0;
import i4.o;
import i4.r0;
import i4.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lv.w;
import m3.b1;
import m3.c3;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import o00.x0;
import o30.e0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import s1.d1;
import w.a0;
import y80.h1;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f15163a = new u3.d(new c60.a(17), false, -437348681);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15164b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f15165c = 0;

    public static final void a(t tVar, String str, k kVar, Function0 function0, n nVar, int i11) {
        long j9;
        long j11;
        long j12;
        str.getClass();
        kVar.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-786919483);
        int i12 = i11 | (sVar.f(tVar) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.d(kVar.ordinal()) ? 256 : 128) | (sVar.h(function0) ? 2048 : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            int[] iArr = c.$EnumSwitchMapping$0;
            int i13 = iArr[kVar.ordinal()];
            if (i13 == 1) {
                j9 = lv.s.f28217b;
            } else if (i13 == 2) {
                j9 = lv.s.J;
            } else {
                if (i13 != 3) {
                    e40.a.f();
                    return;
                }
                j9 = lv.s.I;
            }
            c3 c3VarA = d1.a(j9, null, "", sVar, MLKEMEngine.KyberPolyBytes, 10);
            int i14 = iArr[kVar.ordinal()];
            if (i14 == 1) {
                j11 = lv.s.J;
            } else if (i14 == 2) {
                j11 = lv.s.f28217b;
            } else {
                if (i14 != 3) {
                    e40.a.f();
                    return;
                }
                j11 = lv.s.D;
            }
            c3 c3VarA2 = d1.a(j11, null, "", sVar, MLKEMEngine.KyberPolyBytes, 10);
            int i15 = iArr[kVar.ordinal()];
            if (i15 == 1 || i15 == 2) {
                j12 = lv.s.f28217b;
            } else {
                if (i15 != 3) {
                    e40.a.f();
                    return;
                }
                j12 = lv.s.H;
            }
            c3 c3VarA3 = d1.a(j12, null, "", sVar, MLKEMEngine.KyberPolyBytes, 10);
            boolean z11 = (i12 & 7168) == 2048;
            Object objM = sVar.M();
            if (z11 || objM == m.f29332a) {
                objM = new ar.d(23, function0);
                sVar.k0(objM);
            }
            Function0 function02 = (Function0) objM;
            l2.f fVarB = l2.g.b(24);
            b2 b2Var = p.f19253a;
            s0.a(function02, tVar, false, fVarB, p.a(((v) c3VarA.getValue()).f23317a, 0L, 0L, 0L, sVar, 14), null, v1.n.b(1, ((v) c3VarA3.getValue()).f23317a), null, null, u3.e.e(921871829, sVar, new u1(4, str, c3VarA2)), sVar, ((i12 << 3) & 112) | 805306368, 420);
            sVar = sVar;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.p(tVar, str, i11, kVar, function0, 6);
        }
    }

    public static final void b(f0 f0Var, Function0 function0, n nVar, int i11) {
        f0Var.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1342350254);
        int i12 = (sVar.h(f0Var) ? 4 : 2) | i11 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            w.a(false, u3.e.e(-2048547640, sVar, new d(f0Var, function0)), sVar, MLKEMEngine.KyberPolyBytes);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d(f0Var, function0, i11);
        }
    }

    public static final void c(i iVar, Function0 function0, Function0 function02, n nVar, int i11) {
        i iVar2;
        Function0 function03;
        int i12;
        float f11;
        int i13;
        k kVar;
        iVar.getClass();
        h1 h1Var = iVar.f15160e;
        function0.getClass();
        function02.getClass();
        s sVar = (s) nVar;
        sVar.c0(-658229817);
        int i14 = i11 | (sVar.h(iVar) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | (sVar.h(function02) ? 256 : 128);
        if (sVar.R(i14 & 1, (i14 & 147) != 146)) {
            int i15 = iVar.f15158c;
            List list = (List) m3.i.n(h1Var, sVar, 0).getValue();
            boolean zBooleanValue = ((Boolean) ((List) m3.i.n(h1Var, sVar, 0).getValue()).get(i15 - 1)).booleanValue();
            String str = (String) m3.i.n(iVar.f15162g, sVar, 0).getValue();
            Iterable iterable = (Iterable) m3.i.n(h1Var, sVar, 0).getValue();
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                i12 = 0;
            } else {
                Iterator it = iterable.iterator();
                i12 = 0;
                while (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue() && (i12 = i12 + 1) < 0) {
                        d0.m();
                        throw null;
                    }
                }
            }
            boolean z11 = i12 == 0;
            g0 g0Var = m2.f13850c;
            long j9 = lv.s.J;
            r0 r0Var = i4.g0.f23254b;
            t tVarT = d2.c.t(v1.n.r(v1.n.j(g0Var, j9, r0Var), v1.n.q(sVar), true));
            d2.d dVar = d2.i.f13803c;
            b4.i iVar3 = b4.d.f5694m;
            y yVarA = d2.w.a(dVar, iVar3, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarT, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            boolean z12 = z11;
            long j11 = lv.s.I;
            q qVar = q.f5711a;
            t tVarE = m2.e(d2.c.E(m2.d(v1.n.j(qVar, j11, r0Var), 1.0f)), 260);
            y yVarA2 = d2.w.a(dVar, iVar3, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarE, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            t tVarT2 = m2.t(m2.d(qVar, 1.0f), 3);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(tVarT2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC3, gVar4, sVar);
            float f12 = 16;
            int i16 = i15;
            List list2 = list;
            v1.n.d(x0.z(R.drawable.system_icon_close_neutral_80, sVar, 0), null, u.f13938a.a(b4.a.a(d2.c.D(qVar, 0.0f, f12, f12, 0.0f, 9), c5.m2.f7291a, new c0(1, iVar, function02)), b4.d.f5685c), null, null, 0.0f, new o(lv.s.f28217b, 5), sVar, 1572920, 56);
            sVar.q(true);
            b4.i iVar4 = b4.d.f5695n;
            d2.e eVar = d2.i.f13805e;
            t tVarD = d2.c.D(m2.c(qVar, 1.0f), 0.0f, f12, 0.0f, 0.0f, 13);
            y yVarA3 = d2.w.a(eVar, iVar4, sVar, 54);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            t tVarC4 = b4.a.c(tVarD, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA3, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            a0.y(iHashCode4, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC4, gVar4, sVar);
            float f13 = 40;
            float f14 = 8;
            r9.d(o30.f0.U(sVar, R.string.bring_back_magic_question), d2.c.D(qVar, f13, 0.0f, f13, f14, 2), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.f28270i, lv.s.f28215a, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar, 48, 0, 131068);
            String strU = o30.f0.U(sVar, R.string.bring_back_magic_description);
            t tVarD2 = d2.c.D(qVar, f13, f14, f13, 0.0f, 8);
            m5.u0 u0Var = lv.v.f28274n;
            long j12 = lv.s.D;
            r9.d(strU, tVarD2, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j12, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar, 0, 0, 131068);
            sVar.q(true);
            sVar.q(true);
            t tVarD3 = d2.c.D(v1.n.j(new w0(iVar4).then(g0Var), j9, r0Var), 0.0f, 0.0f, 0.0f, f12, 7);
            y yVarA4 = d2.w.a(dVar, iVar3, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            u3.i iVarL5 = sVar.l();
            t tVarC5 = b4.a.c(tVarD3, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA4, gVar, sVar);
            m3.i.C(iVarL5, gVar2, sVar);
            a0.y(iHashCode5, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC5, gVar4, sVar);
            r9.d(o30.f0.U(sVar, R.string.bring_back_magic_options), d2.c.C(m2.d(qVar, 1.0f), f12, 32, f12, f12), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j12, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar, 0, 0, 131068);
            s sVar2 = sVar;
            sVar2.a0(-320687734);
            int i17 = 0;
            while (true) {
                m3.f fVar = m.f29332a;
                int i18 = i16;
                if (i17 < i18) {
                    t tVarD4 = d2.c.D(m2.d(qVar, 1.0f), f12, 0.0f, f12, f12, 2);
                    String strU2 = o30.f0.U(sVar2, i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? R.string.bring_back_magic_answer_other : R.string.bring_back_magic_answer_5 : R.string.bring_back_magic_answer_4 : R.string.bring_back_magic_answer_3 : R.string.bring_back_magic_answer_2 : R.string.bring_back_magic_answer_1);
                    List list3 = list2;
                    if (((Boolean) list3.get(i17)).booleanValue()) {
                        kVar = k.Selected;
                    } else {
                        if (list3.isEmpty()) {
                            i13 = 0;
                        } else {
                            Iterator it2 = list3.iterator();
                            i13 = 0;
                            while (it2.hasNext()) {
                                if (((Boolean) it2.next()).booleanValue() && (i13 = i13 + 1) < 0) {
                                    d0.m();
                                    throw null;
                                }
                            }
                        }
                        kVar = i13 > 1 ? k.Disabled : k.Unselected;
                    }
                    boolean zH = sVar2.h(iVar) | sVar2.d(i17);
                    Object objM = sVar2.M();
                    if (zH || objM == fVar) {
                        objM = new l0(iVar, i17, 1);
                        sVar2.k0(objM);
                    }
                    a(tVarD4, strU2, kVar, (Function0) objM, sVar2, 0);
                    i17++;
                    i16 = i18;
                    list2 = list3;
                } else {
                    sVar2.q(false);
                    if (zBooleanValue) {
                        sVar2.a0(-1350106968);
                        String strU3 = o30.f0.U(sVar2, R.string.bring_back_magic_explain);
                        t tVarD5 = d2.c.D(m2.d(qVar, 1.0f), f12, 0.0f, f12, 0.0f, 10);
                        m5.u0 u0Var2 = lv.v.f28274n;
                        iVar2 = iVar;
                        f11 = f12;
                        r9.d(strU3, tVarD5, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var2, lv.s.D, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar2, 48, 0, 131068);
                        long j13 = lv.s.C;
                        m5.u0 u0VarA = m5.u0.a(u0Var2, j13, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                        t tVarZ = d2.c.z(m2.e(m2.d(qVar, 1.0f), 120), f11);
                        l2.f fVarB = l2.g.b(f14);
                        q4 q4Var = q4.f19349a;
                        d9 d9VarD = q4.d(j13, lv.s.f28227g, lv.s.F, 0L, 0L, 0L, 0L, sVar2, 2147477247);
                        m2.d1 d1Var = new m2.d1(0, 7, 119);
                        boolean zH2 = sVar2.h(iVar2);
                        Object objM2 = sVar2.M();
                        if (zH2 || objM2 == fVar) {
                            objM2 = new c50.p(iVar2, 11);
                            sVar2.k0(objM2);
                        }
                        z4.a(str, (Function1) objM2, tVarZ, false, false, u0VarA, null, null, null, null, false, null, d1Var, null, false, 0, 0, fVarB, d9VarD, sVar2, MLKEMEngine.KyberPolyBytes, 196608, 2064344);
                        sVar2 = sVar2;
                        sVar2.q(false);
                    } else {
                        iVar2 = iVar;
                        f11 = f12;
                        sVar2.a0(-1348646248);
                        sVar2.q(false);
                    }
                    sVar2.q(true);
                    d2.c.f(z.a(), sVar2);
                    t tVarE2 = m2.e(d2.c.D(m2.f13850c, f11, 0.0f, f11, f11, 2), f13);
                    l2.f fVarB2 = l2.g.b(24);
                    b2 b2Var = p.f19253a;
                    g3.o oVarC = p.c(((v) d1.a(z12 ? v.f23314g : lv.s.f28217b, null, "", sVar2, MLKEMEngine.KyberPolyBytes, 10).getValue()).f23317a, 0L, sVar2, 14);
                    boolean zH3 = sVar2.h(iVar2) | ((i14 & 112) == 32);
                    Object objM3 = sVar2.M();
                    if (zH3 || objM3 == fVar) {
                        function03 = function0;
                        objM3 = new bs.b(19, iVar2, function03);
                        sVar2.k0(objM3);
                    } else {
                        function03 = function0;
                    }
                    s sVar3 = sVar2;
                    s0.n((Function0) objM3, tVarE2, false, fVarB2, oVarC, null, null, u3.e.e(-326538502, sVar2, new h(z12, 0)), sVar3, 805306416, 484);
                    sVar = sVar3;
                    sVar.q(true);
                }
            }
        } else {
            iVar2 = iVar;
            function03 = function0;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(iVar2, function03, function02, i11, 8);
        }
    }

    public static final void d(Function0 function0, n nVar, int i11) {
        int i12;
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1295954479);
        int i13 = i11 | (sVar.h(function0) ? 4 : 2);
        if (sVar.R(i13 & 1, (i13 & 3) != 2)) {
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            c3 c3VarB = t1.d.b(((Boolean) b1Var.getValue()).booleanValue() ? 1.0f : 0.0f, new t1.u1(0, 0, t1.w.f39594b, 3), "", null, sVar, 3072, 20);
            Unit unit = Unit.f26487a;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new co.j(b1Var, null, 2);
                sVar.k0(objM2);
            }
            m3.i.h(unit, (Function2) objM2, sVar);
            le.p pVarD = e0.D(new le.q("smiley_heart.json"), sVar, 6);
            le.h hVarJ = cg.j((he.k) pVarD.getValue(), false, false, 0.0f, 0, sVar, 1022);
            t tVarA = f4.g.a(v1.n.j(m2.f13850c, lv.s.f28217b, i4.g0.f23254b), ((Number) c3VarB.getValue()).floatValue());
            y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarA, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            he.k kVar = (he.k) pVarD.getValue();
            boolean zF = sVar.f(hVarJ);
            Object objM3 = sVar.M();
            if (zF || objM3 == fVar) {
                objM3 = new cg.f(hVarJ, 3);
                sVar.k0(objM3);
            }
            q qVar = q.f5711a;
            x0.g(kVar, (Function0) objM3, m2.q(m2.e(d2.c.D(qVar, 0.0f, 180, 0.0f, 0.0f, 13), AppConstants.RESULT_CODE_ORDER_COLLECTED), 110), false, false, false, false, null, false, b4.d.f5687e, null, false, false, null, null, false, sVar, MLKEMEngine.KyberPolyBytes, 6, 130040);
            float f11 = 16;
            r9.d(o30.f0.U(sVar, R.string.bring_back_magic_thanks), d2.c.D(qVar, 0.0f, f11, 0.0f, 0.0f, 13), lv.s.f28235p, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28266e, sVar, 432, 12582912, 131064);
            String strU = o30.f0.U(sVar, R.string.bring_back_magic_thank_you_message);
            t tVarD = d2.c.D(qVar, f11, f11, f11, 0.0f, 8);
            m5.u0 u0Var = lv.v.f28274n;
            long j9 = lv.s.J;
            r9.d(strU, tVarD, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j9, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar, 0, 0, 131068);
            boolean z11 = (i13 & 14) == 4;
            Object objM4 = sVar.M();
            if (z11 || objM4 == fVar) {
                objM4 = new ar.d(24, function0);
                sVar.k0(objM4);
            }
            s0.a((Function0) objM4, m2.q(m2.h(d2.c.D(qVar, 0.0f, 48, 0.0f, 0.0f, 13), 40), 280), false, l2.g.b(24), p.a(j9, 0L, 0L, 0L, sVar, 14), null, null, null, null, f15163a, sVar, 805306416, 484);
            sVar = sVar;
            i12 = 1;
            sVar.q(true);
        } else {
            i12 = 1;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.z(i11, i12, function0);
        }
    }
}
