package os;

import b4.t;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.google.android.gms.internal.measurement.cg;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.w;
import d2.w2;
import d2.y;
import g3.r9;
import g3.s0;
import g3.v3;
import g3.w6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import le.p;
import le.q;
import lp.v;
import lw.o;
import m3.b1;
import m3.g1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import o00.x0;
import o30.e0;
import o30.f0;
import oo.z;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import v80.b0;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f33731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f33732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3.d f33733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u3.d f33734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u3.d f33735e;

    static {
        new u3.d(new o60.a(19), false, -804016676);
        f33731a = new u3.d(new o60.a(20), false, -1731232732);
        f33732b = new u3.d(new o9.a(13), false, 798709870);
        f33733c = new u3.d(new o60.a(21), false, 1924940076);
        f33734d = new u3.d(new o60.a(22), false, 1489617763);
        f33735e = new u3.d(new o9.a(14), false, 509127665);
    }

    public static final void a(SpecialReward specialReward, ns.g gVar, Function0 function0, Function0 function02, n nVar, int i11) {
        s sVar;
        Object nVar2;
        b0 b0Var;
        Function0 function03;
        gVar.getClass();
        function0.getClass();
        function02.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(856089840);
        int i12 = i11 | (sVar2.f(specialReward) ? 4 : 2) | (sVar2.h(gVar) ? 32 : 16) | (sVar2.h(function02) ? NewHope.SENDB_BYTES : 1024);
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            Object objM = sVar2.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM);
            }
            b0 b0Var2 = (b0) objM;
            w6 w6VarF = v3.f(6, 2, null, sVar2);
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = e0.f.w(ns.e.valueOf(specialReward.getStatus()) == ns.e.CLAIMED, sVar2);
            }
            b1 b1Var = (b1) objM2;
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM3);
            }
            b1 b1Var2 = (b1) objM3;
            Object objM4 = sVar2.M();
            if (objM4 == fVar) {
                objM4 = new g1(100.0f);
                sVar2.k0(objM4);
            }
            g1 g1Var = (g1) objM4;
            p pVarD = e0.D(new q("reward_collection_confirmed.json"), sVar2, 6);
            Boolean bool = (Boolean) b1Var2.getValue();
            bool.getClass();
            boolean zH = sVar2.h(b0Var2) | sVar2.h(gVar) | ((i12 & 14) == 4);
            Object objM5 = sVar2.M();
            if (zH || objM5 == fVar) {
                b0Var = b0Var2;
                nVar2 = new co.n(b0Var, gVar, specialReward, b1Var2, (x70.c) null);
                sVar2.k0(nVar2);
            } else {
                nVar2 = objM5;
                b0Var = b0Var2;
            }
            m3.i.h(bool, (Function2) nVar2, sVar2);
            l2.f fVarC = l2.g.c(e0.s(sVar2, R.dimen.profile_card_corner_radius), e0.s(sVar2, R.dimen.profile_card_corner_radius), 0.0f, 0.0f, 12);
            long j9 = lv.s.J;
            boolean zH2 = sVar2.h(gVar);
            Object objM6 = sVar2.M();
            if (zH2 || objM6 == fVar) {
                function03 = function0;
                objM6 = new o(function03, gVar, b1Var2, 8);
                sVar2.k0(objM6);
            } else {
                function03 = function0;
            }
            sVar = sVar2;
            v3.a((Function0) objM6, null, w6VarF, 0.0f, false, fVarC, j9, 0L, 0.0f, 0L, null, null, null, u3.e.e(-300778546, sVar2, new ni.b(gVar, b1Var, specialReward, b0Var, w6VarF, function03, b1Var2, function02, g1Var, pVarD)), sVar, 1572864, 3072, 8090);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new v(specialReward, gVar, function0, function02, i11, 7);
        }
    }

    public static final void b(t tVar, Integer num, Function0 function0, n nVar, int i11) {
        b4.k kVar;
        b5.g gVar;
        b5.h hVar;
        b5.g gVar2;
        b4.q qVar;
        b5.g gVar3;
        boolean z11;
        float f11;
        b5.d dVar;
        b5.g gVar4;
        Function0 function02 = function0;
        tVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(1585652635);
        int i12 = i11 | (sVar.f(num) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (sVar.h(function02) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            t tVarT = m2.t(tVar, 3);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarT, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            b5.g gVar5 = b5.i.f5843f;
            m3.i.C(i2VarA, gVar5, sVar);
            b5.g gVar6 = b5.i.f5842e;
            m3.i.C(iVarL, gVar6, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar7 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar7);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            b5.g gVar8 = b5.i.f5841d;
            m3.i.C(tVarC, gVar8, sVar);
            float f12 = lv.t.f28255i;
            b4.q qVar2 = b4.q.f5711a;
            t tVarQ = m2.q(qVar2, f12);
            b4.k kVar2 = b4.d.f5683a;
            u0 u0VarD = d2.p.d(kVar2, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarQ, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar5, sVar);
            m3.i.C(iVarL2, gVar6, sVar);
            a0.y(iHashCode2, sVar, gVar7, sVar, dVar2);
            m3.i.C(tVarC2, gVar8, sVar);
            sVar.a0(-1815561710);
            sVar.q(false);
            sVar.q(true);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, true);
            u0 u0VarD2 = d2.p.d(b4.d.f5687e, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(n1Var, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar5, sVar);
            m3.i.C(iVarL3, gVar6, sVar);
            a0.y(iHashCode3, sVar, gVar7, sVar, dVar2);
            m3.i.C(tVarC3, gVar8, sVar);
            if (num == null) {
                sVar.a0(364655651);
                z11 = false;
                sVar.q(false);
                kVar = kVar2;
                f11 = f12;
                gVar3 = gVar6;
                dVar = dVar2;
                gVar4 = gVar7;
                hVar = hVar2;
                gVar = gVar5;
                gVar2 = gVar8;
                qVar = qVar2;
            } else {
                sVar.a0(364655652);
                kVar = kVar2;
                gVar = gVar5;
                hVar = hVar2;
                gVar2 = gVar8;
                qVar = qVar2;
                gVar3 = gVar6;
                z11 = false;
                f11 = f12;
                dVar = dVar2;
                gVar4 = gVar7;
                r9.d(f0.U(sVar, num.intValue()), null, lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28272k, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
                sVar = sVar;
                sVar.q(false);
            }
            sVar.q(true);
            t tVarQ2 = m2.q(qVar, f11);
            u0 u0VarD3 = d2.p.d(kVar, z11);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            t tVarC4 = b4.a.c(tVarQ2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD3, gVar, sVar);
            m3.i.C(iVarL4, gVar3, sVar);
            a0.y(iHashCode4, sVar, gVar4, sVar, dVar);
            m3.i.C(tVarC4, gVar2, sVar);
            if (function0 == null) {
                sVar.a0(-1982574733);
                sVar.q(z11);
                function02 = function0;
            } else {
                sVar.a0(-1982574732);
                boolean z12 = (i12 & 7168) == 2048 ? true : z11;
                Object objM = sVar.M();
                if (z12 || objM == m.f29332a) {
                    function02 = function0;
                    objM = new z(3, function02);
                    sVar.k0(objM);
                } else {
                    function02 = function0;
                }
                s0.h((Function0) objM, null, false, null, null, null, f33731a, sVar, 1572864, 62);
                sVar.q(z11);
            }
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(tVar, num, function02, i11, 16);
        }
    }

    public static final void c(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1032499588);
        if (sVar.R(i11 & 1, i11 != 0)) {
            s0.b(v1.n.k(d2.c.z(m2.t(m2.d(b4.q.f5711a, 1.0f), 3), lv.t.f28253g), 1, cg.l(sVar, R.color.neutral_30), l2.g.b(e0.s(sVar, R.dimen.profile_card_corner_radius))), l2.g.b(e0.s(sVar, R.dimen.profile_card_corner_radius)), s0.p(lv.s.I, sVar, 6), null, null, f33732b, sVar, 196608, 24);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new o60.a(i11, 23);
        }
    }

    public static final void d(final long j9, final int i11, final long j11, n nVar, final int i12) {
        s sVar = (s) nVar;
        sVar.c0(-1705939806);
        int i13 = i12 | (sVar.d(i11) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            b4.q qVar = b4.q.f5711a;
            t tVarZ = d2.c.z(m2.t(m2.d(qVar, 1.0f), 3), lv.t.f28253g);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarZ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            t tVarM = m2.m(qVar, 20);
            b4.j jVar = b4.d.f5693k;
            v1.n.d(x0.z(R.drawable.ic_info, sVar, 0), "InfoIcon", b3.i.g(jVar, tVarM), null, null, 0.0f, new i4.o(j9, 5), sVar, 56, 56);
            r9.d(f0.U(sVar, i11), b3.i.g(jVar, d2.c.D(qVar, lv.t.f28251e, 0.0f, 0.0f, 0.0f, 14)), j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(i11, i12, j9, j11) { // from class: os.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f33751a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f33752b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f33753c;

                {
                    this.f33751a = j9;
                    this.f33753c = j11;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(391);
                    a.d(this.f33751a, this.f33752b, this.f33753c, (n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(b4.t r22, com.app.tgtg.model.remote.specialrewards.SpecialReward r23, boolean r24, kotlin.jvm.functions.Function1 r25, m3.n r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.a.e(b4.t, com.app.tgtg.model.remote.specialrewards.SpecialReward, boolean, kotlin.jvm.functions.Function1, m3.n, int, int):void");
    }

    public static final void f(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(1691249187);
        if (sVar.R(i11 & 1, i11 != 0)) {
            s0.b(v1.n.k(d2.c.A(b4.q.f5711a, lv.t.f28253g, lv.t.f28251e), 1, lv.s.H, l2.g.b(e0.s(sVar, R.dimen.profile_card_corner_radius))), l2.g.b(e0.s(sVar, R.dimen.profile_card_corner_radius)), s0.p(lv.s.J, sVar, 6), null, null, f33735e, sVar, 196608, 24);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new o60.a(i11, 24);
        }
    }

    public static final void g(int i11, int i12, n nVar, int i13) {
        s sVar = (s) nVar;
        sVar.c0(-908005080);
        int i14 = (sVar.d(i11) ? 4 : 2) | i13 | (sVar.d(i12) ? 32 : 16);
        if (sVar.R(i14 & 1, (i14 & 147) != 146)) {
            b4.q qVar = b4.q.f5711a;
            t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
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
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            b4.j jVar = b4.d.f5693k;
            v1.n.d(x0.z(i11, sVar, i14 & 14), "", new w2(jVar), null, null, 0.0f, null, sVar, 56, 120);
            t tVarG = b3.i.g(jVar, d2.c.D(qVar, lv.t.f28253g, 0.0f, 0.0f, 0.0f, 14));
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(f0.U(sVar, i12), tVarG.then(new n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new oo.v(i11, i12, i13, 1);
        }
    }

    public static final void h(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-810505893);
        if (sVar.R(i11 & 1, i11 != 0)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.k kVar = (x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius());
            s0.b(v1.n.k(d2.c.B(b4.q.f5711a, 0.0f, mVar.f44007c, 1), 1, hVar.f43922i0, l2.g.b(kVar.f43983g)), l2.g.b(kVar.f43983g), s0.p(lv.s.J, sVar, 6), null, null, u3.e.e(1909782441, sVar, new ap.e(mVar, jVar, hVar, 15)), sVar, 196608, 24);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new o60.a(i11, 25);
        }
    }

    public static final void i(final int i11, int i12, int i13, final int i14, n nVar) {
        final int i15;
        final int i16 = i12;
        s sVar = (s) nVar;
        sVar.c0(-1513718509);
        int i17 = i14 | (sVar.d(i11) ? 4 : 2) | (sVar.d(i16) ? 32 : 16) | (sVar.d(i13) ? 256 : 128);
        if (sVar.R(i17 & 1, (i17 & 1171) != 1170)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            b4.q qVar = b4.q.f5711a;
            t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
            b4.j jVar2 = b4.d.f5693k;
            i2 i2VarA = h2.a(d2.i.f13801a, jVar2, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarT, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            v1.n.d(x0.z(i11, sVar, i17 & 14), "", new w2(jVar2), null, null, 0.0f, null, sVar, 56, 120);
            t tVarG = b3.i.g(jVar2, d2.c.D(qVar, mVar.f44017n, 0.0f, 0.0f, 0.0f, 14));
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            t tVarThen = tVarG.then(new n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarThen, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            i16 = i12;
            r9.d(f0.U(sVar, i16), null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28275o, sVar, 0, 12582912, 131066);
            d2.c.f(m2.e(qVar, mVar.f44016m), sVar);
            i15 = i13;
            r9.d(f0.U(sVar, i15), null, hVar.K, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43958g, sVar, 0, 0, 131066);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
        } else {
            i15 = i13;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(i11, i16, i15, i14) { // from class: os.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f33757a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f33758b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f33759c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(3073);
                    a.i(this.f33757a, this.f33758b, this.f33759c, iF, (n) obj);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final float j(SpecialReward specialReward) {
        int i11 = i.$EnumSwitchMapping$0[ns.e.valueOf(specialReward.getStatus()).ordinal()];
        if (i11 == 1 || i11 == 2) {
            return 1.0f;
        }
        if (i11 == 3 || i11 == 4) {
            return 0.6f;
        }
        e40.a.f();
        return 0.0f;
    }
}
