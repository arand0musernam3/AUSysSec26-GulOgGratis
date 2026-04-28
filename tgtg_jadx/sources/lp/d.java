package lp;

import android.net.Uri;
import androidx.fragment.app.g1;
import ao.e1;
import c5.x1;
import com.app.tgtg.R;
import com.braze.models.BrazeGeofence;
import com.braze.models.inappmessage.InAppMessageBase;
import d2.g0;
import d2.h2;
import d2.i1;
import d2.i2;
import d2.m2;
import d2.n0;
import d2.n1;
import g3.h4;
import g3.p3;
import g3.r9;
import g3.s0;
import g3.x5;
import hp.o0;
import i4.k0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import m3.b1;
import m3.c3;
import m3.d3;
import m3.h1;
import m3.w1;
import o00.x0;
import o30.e0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import t1.p0;
import v80.f0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f28017a = new u3.d(new j60.a(16), false, 1144196982);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f28018b = new u3.d(new j60.a(17), false, -570710057);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3.d f28019c = new u3.d(new a3.d0(4), false, -1846287493);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u3.d f28020d = new u3.d(new a3.d0(5), false, -1931887852);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u3.d f28021e = new u3.d(new ii.m(11), false, -154502037);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u3.d f28022f = new u3.d(new j60.a(18), false, -1572746123);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u3.d f28023g = new u3.d(new ii.m(12), false, 1816977216);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u3.d f28024h = new u3.d(new ii.m(13), false, 1695809800);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u3.d f28025i = new u3.d(new ii.m(14), false, 1007660171);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u3.d f28026j = new u3.d(new j60.a(19), false, -987629548);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u3.d f28027k = new u3.d(new ii.m(15), false, 806758635);
    public static final u3.d l = new u3.d(new ii.m(16), false, -651003335);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u3.d f28028m = new u3.d(new ii.m(17), false, 225478691);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u3.d f28029n = new u3.d(new j60.a(20), false, -1531030796);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u3.d f28030o = new u3.d(new j60.a(21), false, 1612294604);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u3.d f28031p = new u3.d(new j60.a(22), false, -1130949016);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u3.d f28032q = new u3.d(new ii.m(18), false, 711432327);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u3.d f28033r = new u3.d(new ii.m(19), false, -946902402);

    public static final void a(b4.t tVar, boolean z11, boolean z12, Function0 function0, final Function0 function02, Function0 function03, m3.n nVar, int i11) {
        int i12;
        final boolean z13;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1447904140);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z12) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function0) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(function02) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(function03) ? 131072 : 65536;
        }
        if (sVar.R(i12 & 1, (74899 & i12) != 74898)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM);
            }
            final v80.b0 b0Var = (v80.b0) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = t1.c.a(2.0f);
                sVar.k0(objM2);
            }
            final t1.b bVar = (t1.b) objM2;
            i2 i2VarA = h2.a(d2.i.f13807g, b4.d.f5693k, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
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
            float f11 = 48;
            b4.q qVar = b4.q.f5711a;
            s0.h(function0, m2.m(qVar, f11), false, null, null, null, f28017a, sVar, ((i12 >> 9) & 14) | 1572912, 60);
            sVar = sVar;
            b4.t tVarM = m2.m(qVar, 64);
            long j9 = z12 ? lv.s.J : lv.s.G;
            l2.f fVar2 = l2.g.f26790a;
            b4.t tVarK = v1.n.k(v1.n.j(tVarM, j9, fVar2), 2, z12 ? lv.s.J : lv.s.G, fVar2);
            int i13 = i12 & 896;
            boolean zH = (i13 == 256) | sVar.h(b0Var) | sVar.h(bVar) | ((57344 & i12) == 16384);
            Object objM3 = sVar.M();
            if (zH || objM3 == fVar) {
                z13 = z12;
                objM3 = new Function0() { // from class: lp.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (z13) {
                            f0.B(b0Var, null, null, new p3(bVar, null, 1), 3);
                            function02.invoke();
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM3);
            } else {
                z13 = z12;
            }
            int i14 = i12;
            s0.h((Function0) objM3, tVarK, z13, null, null, null, u3.e.e(921042157, sVar, new an.b(bVar, z13, 6)), sVar, i13 | 1572864, 56);
            b4.t tVarM2 = m2.m(qVar, f11);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarM2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            if (z11) {
                sVar.a0(974949377);
                s0.h(function03, d2.u.f13938a.b(), false, null, null, null, f28018b, sVar, ((i14 >> 15) & 14) | 1572864, 60);
                sVar.q(false);
            } else {
                sVar.a0(975352036);
                sVar.q(false);
            }
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b(tVar, z11, z12, function0, function02, function03, i11);
        }
    }

    public static final void b(n4.b bVar, String str, String str2, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(65187538);
        int i12 = i11 | (sVar.h(bVar) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.f(str2) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            float f11 = 1;
            long j9 = lv.s.H;
            l2.f fVarB = l2.g.b(20);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarK = v1.n.k(qVar, f11, j9, fVarB);
            float f12 = lv.t.f28251e;
            b4.t tVarA = d2.c.A(tVarK, f12, lv.t.f28249c);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
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
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            d(bVar, o30.f0.U(sVar, R.string.fridge_recipe_details_prep), str, false, sVar, ((i12 << 3) & 896) | (i12 & 14) | 3080, 0);
            d2.c.f(m2.q(qVar, f12), sVar);
            s0.o(m2.q(m2.e(qVar, 12), f11), 0.0f, j9, sVar, 390, 2);
            d2.c.f(m2.q(qVar, f12), sVar);
            d(null, o30.f0.U(sVar, R.string.fridge_recipe_details_cook), str2, false, sVar, (i12 & 896) | 3078, 0);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(bVar, str, str2, i11, 3);
        }
    }

    public static final void c(k0 k0Var, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-607412756);
        int i12 = (sVar.f(k0Var) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            d2.b bVar = d2.i.f13801a;
            d2.y yVarA = d2.w.a(d2.i.g(lv.t.f28249c), b4.d.f5694m, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
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
            sVar.a0(1319622016);
            Iterator it = kotlin.collections.d0.h(Float.valueOf(1.0f), Float.valueOf(0.9f), Float.valueOf(0.75f)).iterator();
            while (it.hasNext()) {
                d2.p.a(v1.n.i(f4.g.b(m2.d(m2.e(qVar, 14), ((Number) it.next()).floatValue()), l2.g.b(InAppMessageBase.INAPP_MESSAGE_DURATION_MIN_MILLIS)), k0Var, 0.0f, 6), sVar, 0);
            }
            sVar.q(false);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lk.a(k0Var, i11, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(n4.b r36, java.lang.String r37, java.lang.String r38, boolean r39, m3.n r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lp.d.d(n4.b, java.lang.String, java.lang.String, boolean, m3.n, int, int):void");
    }

    public static final void e(o0 o0Var, m3.n nVar, int i11) {
        boolean z11;
        o0Var.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1900607068);
        int i12 = i11 | (sVar.f(o0Var) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarA = d2.c.A(m2.d(qVar, 1.0f), lv.t.f28253g, lv.t.f28252f);
            b4.j jVar = b4.d.f5693k;
            i2 i2VarA = h2.a(d2.i.f13807g, jVar, sVar, 54);
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
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            i2 i2VarA2 = h2.a(d2.i.f13801a, jVar, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(n1Var, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            String str = o0Var.f22311a;
            m5.u0 u0Var = lv.v.f28274n;
            long j9 = lv.s.C;
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(str, new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), j9, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110584);
            m3.s sVar2 = sVar;
            if (o0Var.f22314d) {
                sVar2.a0(1173321968);
                float f11 = lv.t.f28251e;
                d2.c.f(m2.q(qVar, f11), sVar2);
                b4.t tVarJ = d2.c.J(d2.c.A(v1.n.k(v1.n.j(qVar, lv.s.f28229i, l2.g.a(50)), 1, lv.s.f28228h, l2.g.a(50)), f11, lv.t.f28248b), i1.Min);
                u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                int iHashCode3 = Long.hashCode(sVar2.T);
                u3.i iVarL3 = sVar2.l();
                b4.t tVarC3 = b4.a.c(tVarJ, sVar2);
                sVar2.e0();
                if (sVar2.S) {
                    sVar2.k(hVar);
                } else {
                    sVar2.n0();
                }
                m3.i.C(u0VarD, gVar, sVar2);
                m3.i.C(iVarL3, gVar2, sVar2);
                w.a0.y(iHashCode3, sVar2, gVar3, sVar2, dVar);
                m3.i.C(tVarC3, gVar4, sVar2);
                r9.d(o30.f0.U(sVar2, R.string.fridge_recipe_details_optional), null, j9, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, lv.v.f28276p, sVar2, MLKEMEngine.KyberPolyBytes, 12610560, 106490);
                sVar2 = sVar2;
                z11 = true;
                sVar2.q(true);
                sVar2.q(false);
            } else {
                z11 = true;
                sVar2.a0(1174319486);
                sVar2.q(false);
            }
            sVar2.q(z11);
            m3.s sVar3 = sVar2;
            r9.d(o0Var.f22312b, d2.c.D(qVar, lv.t.f28251e, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, m5.u0.a(u0Var, j9, 0L, q5.r.f36046k, null, 0L, null, 0, 0L, null, null, 16777210), sVar3, 48, 24576, 114684);
            sVar = sVar3;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lk.a(o0Var, i11, 2);
        }
    }

    public static final void f(b4.t tVar, boolean z11, Function0 function0, Function1 function1, m3.n nVar, int i11) {
        m3.s sVar;
        b4.t tVar2;
        function0.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-991917039);
        int i12 = i11 | 6 | (sVar2.g(z11) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128) | (sVar2.h(function1) ? 2048 : 1024);
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = w.a0.s(0, sVar2);
            }
            h1 h1Var = (h1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = w.a0.s(0, sVar2);
            }
            h1 h1Var2 = (h1) objM2;
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = w.a0.s(0, sVar2);
            }
            h1 h1Var3 = (h1) objM3;
            Integer numValueOf = Integer.valueOf(h1Var.h());
            boolean z12 = (i12 & 7168) == 2048;
            Object objM4 = sVar2.M();
            if (z12 || objM4 == fVar) {
                objM4 = new is.h(function1, h1Var, null, 4);
                sVar2.k0(objM4);
            }
            m3.i.h(numValueOf, (Function2) objM4, sVar2);
            List listH = kotlin.collections.d0.h(new hp.b(o30.f0.U(sVar2, R.string.fridge_intro_title_step_1), o30.f0.U(sVar2, R.string.fridge_intro_body_step_1), R.raw.introduction_recipe_step1), new hp.b(o30.f0.U(sVar2, R.string.fridge_intro_title_step_2), o30.f0.U(sVar2, R.string.fridge_intro_body_step_2), R.raw.introduction_recipe_step2), new hp.b(o30.f0.U(sVar2, R.string.fridge_intro_title_step_3), o30.f0.U(sVar2, R.string.fridge_intro_body_step_3), R.raw.introduction_recipe_step3));
            hp.b bVar = (hp.b) listH.get(n80.p.c(h1Var.h(), 0, kotlin.collections.d0.g(listH)));
            g0 g0Var = m2.f13850c;
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(g0Var, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar2);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf2, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar2, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar2);
            r.i(bVar.f22254c, false, false, false, null, sVar2, 0);
            bn.c0 c0Var = new bn.c0(9, h1Var, h1Var3);
            c5.s sVar3 = c5.m2.f7291a;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(m2.c(b4.a.a(qVar, sVar3, c0Var), 0.75f), 0.5f);
            b4.k kVar = b4.d.f5686d;
            d2.u uVar = d2.u.f13938a;
            d2.p.a(uVar.a(tVarD, kVar), sVar2, 0);
            d2.p.a(uVar.a(m2.d(m2.c(b4.a.a(qVar, sVar3, new go.s(h1Var2, 2)), 0.75f), 0.5f), b4.d.f5688f), sVar2, 0);
            b4.t tVarE = d2.c.E(qVar);
            float f11 = lv.t.f28253g;
            b4.t tVarD2 = d2.c.D(tVarE, f11, f11, f11, 0.0f, 8);
            d2.d dVar2 = d2.i.f13803c;
            d2.y yVarA = d2.w.a(dVar2, b4.d.f5694m, sVar2, 0);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            b4.t tVarC2 = b4.a.c(tVarD2, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA, gVar, sVar2);
            m3.i.C(iVarL2, gVar2, sVar2);
            w.a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
            m3.i.C(tVarC2, gVar4, sVar2);
            int iH = h1Var2.h();
            int iH2 = h1Var3.h();
            Object objM5 = sVar2.M();
            if (objM5 == fVar) {
                objM5 = new co.t(h1Var, 6);
                sVar2.k0(objM5);
            }
            Function1 function12 = (Function1) objM5;
            Object objM6 = sVar2.M();
            if (objM6 == fVar) {
                objM6 = new jq.a(22);
                sVar2.k0(objM6);
            }
            android.support.v4.media.session.a.h(iH, iH2, function12, (Function0) objM6, sVar2, 3456);
            sVar2.q(true);
            b4.t tVarT = d2.c.t(uVar.a(d2.c.z(m2.d(qVar, 1.0f), f11), b4.d.f5690h));
            d2.y yVarA2 = d2.w.a(dVar2, b4.d.f5695n, sVar2, 48);
            int iHashCode3 = Long.hashCode(sVar2.T);
            u3.i iVarL3 = sVar2.l();
            b4.t tVarC3 = b4.a.c(tVarT, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA2, gVar, sVar2);
            m3.i.C(iVarL3, gVar2, sVar2);
            w.a0.y(iHashCode3, sVar2, gVar3, sVar2, dVar);
            m3.i.C(tVarC3, gVar4, sVar2);
            Integer numValueOf3 = Integer.valueOf(h1Var.h());
            Object objM7 = sVar2.M();
            if (objM7 == fVar) {
                objM7 = new k9.f(13);
                sVar2.k0(objM7);
            }
            s1.i.a(numValueOf3, null, (Function1) objM7, null, null, null, u3.e.e(-724075506, sVar2, new e(listH, 0)), sVar2, 1573248, 58);
            d2.c.f(m2.e(qVar, f11), sVar2);
            Integer numValueOf4 = Integer.valueOf(h1Var.h());
            Object objM8 = sVar2.M();
            if (objM8 == fVar) {
                objM8 = new k9.f(14);
                sVar2.k0(objM8);
            }
            s1.i.a(numValueOf4, null, (Function1) objM8, null, null, null, u3.e.e(1819591813, sVar2, new e(listH, 1)), sVar2, 1573248, 58);
            d2.c.f(m2.e(qVar, f11), sVar2);
            v0.n.l(d2.c.z(m2.d(qVar, 1.0f), f11), o30.f0.U(sVar2, R.string.fridge_intro_cta_get_started), null, lv.q.INVERTED, lv.e.LARGE, !z11, false, Integer.valueOf(R.drawable.camera_icon), null, function0, sVar2, ((i12 << 21) & 1879048192) | 27654, 324);
            sVar = sVar2;
            sVar.q(true);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.c(tVar2, z11, function0, function1, i11, 5);
        }
    }

    public static final void g(b4.t tVar, List list, ep.d0 d0Var, g9.p pVar, m3.n nVar, int i11) {
        b4.t tVar2;
        b4.t tVar3;
        list.getClass();
        pVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-385831442);
        int i12 = i11 | 6 | (sVar.h(list) ? 32 : 16) | (sVar.h(d0Var) ? 256 : 128) | (sVar.h(pVar) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            sVar.W();
            int i13 = i11 & 1;
            b4.q qVar = b4.q.f5711a;
            if (i13 == 0 || sVar.z()) {
                tVar3 = qVar;
            } else {
                sVar.U();
                tVar3 = tVar;
            }
            sVar.r();
            List listH = kotlin.collections.d0.h(o30.f0.U(sVar, R.string.fridge_recipe_loading_animation_title1), o30.f0.U(sVar, R.string.fridge_recipe_loading_animation_title2), o30.f0.U(sVar, R.string.fridge_recipe_loading_animation_title3), o30.f0.U(sVar, R.string.fridge_recipe_loading_animation_title4), o30.f0.U(sVar, R.string.fridge_recipe_loading_animation_title5), o30.f0.U(sVar, R.string.fridge_recipe_loading_animation_title6), o30.f0.U(sVar, R.string.fridge_recipe_loading_animation_title7), o30.f0.U(sVar, R.string.fridge_recipe_loading_animation_title8));
            b1 b1VarN = m3.i.n(d0Var.F, sVar, 0);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = w.a0.s(0, sVar);
            }
            h1 h1Var = (h1) objM;
            String str = (String) listH.get(h1Var.h() % listH.size());
            x70.c cVar = null;
            Uri uri = !list.isEmpty() ? (Uri) list.get(h1Var.h() % list.size()) : null;
            Object value = b1VarN.getValue();
            boolean zF = sVar.f(b1VarN) | sVar.h(pVar);
            Object objM2 = sVar.M();
            if (zF || objM2 == fVar) {
                objM2 = new is.h(b1VarN, pVar, (x70.c) null);
                sVar.k0(objM2);
            }
            m3.i.h(value, (Function2) objM2, sVar);
            nv.b.a(sVar, 0);
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = new h2.b1(h1Var, cVar, 12);
                sVar.k0(objM3);
            }
            m3.i.g(list, listH, (Function2) objM3, sVar);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(qVar, sVar);
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
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = new k9.f(15);
                sVar.k0(objM4);
            }
            s1.i.a(uri, null, (Function1) objM4, null, null, null, f28019c, sVar, 1573248, 58);
            v1.n.d(x0.z(R.drawable.gradient_overlay_green, sVar, 0), null, m2.f13850c, null, z4.l.f47166a, 0.0f, null, sVar, 25016, 104);
            le.p pVarD = e0.D(new le.q("fridge_loading.lottie"), sVar, 6);
            b4.t tVarB = d2.c.B(tVar3, lv.t.f28253g, 0.0f, 2);
            b4.k kVar = b4.d.f5687e;
            d2.u uVar = d2.u.f13938a;
            x0.f((he.k) pVarD.getValue(), uVar.a(tVarB, kVar), false, 0.0f, Integer.MAX_VALUE, false, null, sVar, 1572864, 0, 4194236);
            b4.t tVarZ = d2.c.z(d2.c.t(m2.d(uVar.a(qVar, b4.d.f5690h), 1.0f)), lv.t.f28254h);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarZ, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                objM5 = new k9.f(16);
                sVar.k0(objM5);
            }
            s1.i.a(str, null, (Function1) objM5, null, null, null, f28020d, sVar, 1573248, 58);
            d2.c.f(m2.e(qVar, lv.t.f28252f), sVar);
            l(0, sVar, 0);
            d2.c.f(m2.e(qVar, lv.t.f28256j), sVar);
            sVar.q(true);
            sVar.q(true);
            tVar2 = tVar3;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.p(tVar2, list, i11, d0Var, pVar, 27);
        }
    }

    public static final void h(int i11, b4.t tVar, k0 k0Var, m3.n nVar, int i12) {
        b4.t tVar2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1272538462);
        int i13 = i12 | (sVar.d(i11) ? 4 : 2) | 48 | (sVar.f(k0Var) ? 256 : 128);
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            sVar.W();
            int i14 = i12 & 1;
            b4.q qVar = b4.q.f5711a;
            if (i14 == 0 || sVar.z()) {
                tVar2 = qVar;
            } else {
                sVar.U();
                tVar2 = tVar;
            }
            sVar.r();
            b4.t tVarQ = m2.q(m2.e(tVar2, 24), 65);
            float f11 = InAppMessageBase.INAPP_MESSAGE_DURATION_MIN_MILLIS;
            b4.t tVarD = d2.c.D(v1.n.i(v1.n.k(f4.g.b(tVarQ, l2.g.b(f11)), 1, lv.s.H, l2.g.b(f11)), k0Var, 0.0f, 6), lv.t.f28249c, 0.0f, 0.0f, 0.0f, 14);
            u0 u0VarD = d2.p.d(b4.d.f5686d, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
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
            g3.i2.a(x0.z(i11, sVar, i13 & 14), null, m2.m(qVar, 16), lv.s.E, sVar, 3512, 0);
            sVar.q(true);
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(i11, tVar2, k0Var, i12, 14);
        }
    }

    public static final void i(int i11, int i12, b4.t tVar, String str, String str2, m3.n nVar) {
        b4.t tVar2;
        str.getClass();
        str2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(465465829);
        int i13 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.f(str2) ? 256 : 128) | 3072;
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            float f11 = lv.t.f28253g;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarB = d2.c.B(qVar, f11, 0.0f, 2);
            d2.b bVar = d2.i.f13801a;
            d2.y yVarA = d2.w.a(d2.i.g(lv.t.f28249c), b4.d.f5694m, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarB, sVar);
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
            r9.d(o30.f0.T(R.string.fridge_recipe_details_preparation_step, new Object[]{Integer.valueOf(i11)}, sVar), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.f28279s, lv.s.f28217b, 0L, q5.r.f36044i, null, 0L, null, 0, 0L, null, null, 16777210), sVar, 0, 0, 131070);
            b4.t tVarD = d2.c.D(qVar, 0.0f, 0.0f, 0.0f, lv.t.f28251e, 7);
            m5.u0 u0Var = lv.v.f28272k;
            long j9 = lv.s.C;
            r9.d(str, tVarD, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j9, 0L, q5.r.f36046k, null, 0L, null, 0, 0L, null, null, 16777210), sVar, (i13 >> 3) & 14, 0, 131068);
            r9.d(str2, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, ((i13 >> 6) & 14) | MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar = sVar;
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(i11, i12, tVar2, str, str2);
        }
    }

    public static final void j(boolean z11, Function0 function0, m3.n nVar, int i11) {
        int i12;
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-516476201);
        int i13 = (sVar.g(z11) ? 4 : 2) | i11 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            float f11 = lv.t.f28253g;
            float f12 = lv.t.f28255i;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(d2.c.D(qVar, f11, f12, f11, 0.0f, 8), 1.0f);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
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
            b4.t tVarD2 = m2.d(qVar, 1.0f);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(o30.f0.U(sVar, R.string.fridge_recipe_profile_header_title), b3.i.e(1.0f, tVarD2, true), lv.s.C, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, lv.v.l, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            sVar = sVar;
            if (z11) {
                sVar.a0(-191448858);
                r9.d(o30.f0.U(sVar, R.string.fridge_recipe_profile_header_cta), b4.a.a(m2.v(qVar, 3), c5.m2.f7291a, new bm.f(24, function0)), lv.s.f28217b, 0L, null, 0L, x5.l.f43854c, new x5.k(5), 0L, 0, false, 0, 0, null, lv.v.f28283w, sVar, 805306752, 12582912, 129528);
                sVar = sVar;
                i12 = 0;
                sVar.q(false);
            } else {
                i12 = 0;
                sVar.a0(-191030513);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            i12 = 0;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f(z11, function0, i11, i12);
        }
    }

    public static final void k(Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1460499299);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            s0.b(b4.a.a(d2.c.z(m2.t(m2.d(b4.q.f5711a, 1.0f), 3), lv.t.f28253g), c5.m2.f7291a, new bm.f(25, function0)), l2.g.b(12), null, s0.q(3, 0.0f, 0.0f, 0.0f, 62), null, f28021e, sVar, 196608, 20);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.z(i11, 6, function0);
        }
    }

    public static final void l(int i11, m3.n nVar, int i12) {
        m3.s sVar;
        int i13;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1673882676);
        int i14 = i12 | 6;
        if (sVar2.R(i14 & 1, (i14 & 3) != 2)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = w.a0.s(0, sVar2);
            }
            h1 h1Var = (h1) objM;
            Unit unit = Unit.f26487a;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = new a3.y(h1Var, (x70.c) null, 17);
                sVar2.k0(objM2);
            }
            m3.i.h(unit, (Function2) objM2, sVar2);
            c3 c3VarC = t1.d.c(h1Var.h(), t1.c.k(BrazeGeofence.DEFAULT_NOTIFICATION_RESPONSIVENESS_MS, 0, t1.w.f39596d, 2), "", sVar2, 8);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            sVar = sVar2;
            r9.d(String.format(o30.f0.U(sVar2, R.string.fridge_recipe_progressing_text), Arrays.copyOf(new Object[]{Integer.valueOf(((Number) c3VarC.getValue()).intValue())}, 1)), d2.c.B(m2.d(b4.q.f5711a, 1.0f), lv.t.f28254h, 0.0f, 2), lv.s.J, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.f28274n, 0L, 0L, null, null, 0L, null, 0, 0L, null, null, 16777151), sVar, 432, 0, 130040);
            i13 = 99;
        } else {
            sVar = sVar2;
            sVar.U();
            i13 = i11;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.b(i13, i12, 21);
        }
    }

    public static final void m(hp.g gVar, Function1 function1, boolean z11, Function0 function0, b4.t tVar, m3.n nVar, int i11) {
        b4.t tVar2;
        gVar.getClass();
        function1.getClass();
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(807191619);
        int i12 = i11 | (sVar.h(gVar) ? 4 : 2) | (sVar.h(function1) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            tVar2 = tVar;
            b4.t tVarD = m2.d(tVar2, 1.0f);
            boolean zH = sVar.h(gVar) | ((i12 & 112) == 32);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new g(function1, gVar, 0);
                sVar.k0(objM);
            }
            float f11 = 10;
            s0.b(androidx.compose.foundation.b.c(tVarD, false, null, null, (Function0) objM, 15), l2.g.b(lv.t.f28252f), s0.p(lv.s.J, sVar, 6), s0.q(8, 12, f11, f11, 48), null, u3.e.e(940624657, sVar, new co.x(gVar, z11, function0, 2)), sVar, 196608, 16);
        } else {
            tVar2 = tVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bg.d(gVar, function1, z11, function0, tVar2, i11);
        }
    }

    public static final void n(b4.t tVar, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(649799492);
        if (sVar.R(i11 & 1, (i11 & 3) != 2)) {
            float f11 = 10;
            s0.b(m2.d(tVar, 1.0f), l2.g.b(lv.t.f28252f), s0.p(lv.s.J, sVar, 6), s0.q(8, 12, f11, f11, 48), null, u3.e.e(-1437025354, sVar, new i(v(sVar), 1)), sVar, 196608, 16);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bm.b(tVar, i11, 7);
        }
    }

    public static final void o(hp.g gVar, boolean z11, Function0 function0, Function0 function02, boolean z12, Function0 function03, boolean z13, Function1 function1, Function1 function12, m3.n nVar, int i11) {
        int i12;
        Function1 function13;
        m3.s sVar;
        int i13;
        f2.c0 c0Var;
        function1.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-645548531);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(gVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.h(function0) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(function02) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.g(z12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(function03) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.g(z13) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            function13 = function1;
            i12 |= sVar2.h(function13) ? 8388608 : 4194304;
        } else {
            function13 = function1;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar2.h(function12) ? 67108864 : 33554432;
        }
        if (sVar2.R(i12 & 1, (38347923 & i12) != 38347922)) {
            f2.c0 c0VarA = f2.e0.a(0, 0, 0, 3, sVar2);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.q(new f2.f(c0VarA, 5));
                sVar2.k0(objM);
            }
            c3 c3Var = (c3) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                i13 = 0;
                objM2 = w.a0.s(0, sVar2);
            } else {
                i13 = 0;
            }
            h1 h1Var = (h1) objM2;
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = w.a0.s(i13, sVar2);
            }
            h1 h1Var2 = (h1) objM3;
            Object objM4 = sVar2.M();
            if (objM4 == fVar) {
                objM4 = w.a0.s(i13, sVar2);
            }
            h1 h1Var3 = (h1) objM4;
            Object objM5 = sVar2.M();
            if (objM5 == fVar) {
                objM5 = w.a0.s(i13, sVar2);
            }
            h1 h1Var4 = (h1) objM5;
            Object objM6 = sVar2.M();
            if (objM6 == fVar) {
                objM6 = w.a0.s(i13, sVar2);
            }
            h1 h1Var5 = (h1) objM6;
            Integer numValueOf = Integer.valueOf(h1Var.h());
            boolean zF = sVar2.f(c0VarA);
            Object objM7 = sVar2.M();
            if (zF || objM7 == fVar) {
                objM7 = new al.j(c0VarA, h1Var, h1Var2, h1Var3, h1Var4, h1Var5, (x70.c) null);
                sVar2.k0(objM7);
            }
            m3.i.h(numValueOf, (Function2) objM7, sVar2);
            Boolean bool = (Boolean) c3Var.getValue();
            bool.getClass();
            boolean z14 = (234881024 & i12) == 67108864;
            Object objM8 = sVar2.M();
            if (z14 || objM8 == fVar) {
                objM8 = new is.h(function12, c3Var, null, 6);
                sVar2.k0(objM8);
            }
            m3.i.h(bool, (Function2) objM8, sVar2);
            boolean zF2 = ((29360128 & i12) == 8388608) | sVar2.f(c0VarA);
            Object objM9 = sVar2.M();
            if (zF2 || objM9 == fVar) {
                i9.s sVar3 = new i9.s(function13, c0VarA, h1Var, h1Var2, h1Var3, h1Var4, h1Var5);
                c0Var = c0VarA;
                sVar2.k0(sVar3);
                objM9 = sVar3;
            } else {
                c0Var = c0VarA;
            }
            Function1 function14 = (Function1) objM9;
            if (!z12 || z11) {
                sVar2.a0(1330143253);
                sVar2.q(false);
            } else {
                sVar2.a0(1329507846);
                String strU = o30.f0.U(sVar2, R.string.fridge_recipe_details_save_popup_title);
                String strU2 = o30.f0.U(sVar2, R.string.fridge_recipe_details_save_popup_description);
                String strU3 = o30.f0.U(sVar2, R.string.fridge_recipe_details_save_recipe);
                String strU4 = o30.f0.U(sVar2, R.string.charity_home_action_dismiss);
                int i14 = 458752 & i12;
                boolean z15 = i14 == 131072;
                Object objM10 = sVar2.M();
                if (z15 || objM10 == fVar) {
                    objM10 = new ki.a(13, function03);
                    sVar2.k0(objM10);
                }
                Function0 function04 = (Function0) objM10;
                boolean z16 = ((i12 & 896) == 256) | (i14 == 131072);
                Object objM11 = sVar2.M();
                if (z16 || objM11 == fVar) {
                    objM11 = new cp.m(function03, function0, 1);
                    sVar2.k0(objM11);
                }
                ox.h.f(strU, strU2, true, function04, (Function0) objM11, strU3, strU4, Integer.valueOf(R.drawable.recipe_generator_bookmark), sVar2, MLKEMEngine.KyberPolyBytes, 0);
                sVar2.q(false);
            }
            sVar = sVar2;
            x5.a(d2.c.F(v1.n.j(b4.q.f5711a, lv.s.J, i4.g0.f23254b)), null, u3.e.e(-1496542318, sVar2, new hg.g(z13, function02, z11, function0)), null, null, 0, 0L, 0L, null, u3.e.e(-390706724, sVar2, new cn.x(11, gVar, c0Var, function14, h1Var)), sVar, 805306752, 506);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new h4(gVar, z11, function0, function02, z12, function03, z13, function1, function12, i11);
        }
    }

    public static final void p(hp.g gVar, f2.c0 c0Var, int i11, Function1 function1, b4.t tVar, m3.n nVar, int i12) {
        c0Var.getClass();
        function1.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(23475445);
        int i13 = (sVar.h(gVar) ? 4 : 2) | i12 | (sVar.f(c0Var) ? 32 : 16) | (sVar.d(i11) ? 256 : 128) | (sVar.h(function1) ? NewHope.SENDB_BYTES : 1024) | (sVar.f(tVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i13 & 1, (i13 & 9363) != 9362)) {
            d3 d3Var = x1.f7416h;
            m3.i.a(b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), u3.e.e(-1629751243, sVar, new k(tVar, c0Var, gVar, i11, function1)), sVar, 56);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new k(gVar, c0Var, i11, function1, tVar, i12);
        }
    }

    public static final void q(hp.g gVar, m3.n nVar, int i11) {
        hp.g gVar2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(206410349);
        int i12 = i11 | (sVar.h(gVar) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarZ = d2.c.z(m2.d(qVar, 1.0f), lv.t.f28253g);
            b4.i iVar = b4.d.f5695n;
            d2.y yVarA = d2.w.a(d2.i.f13803c, iVar, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarZ, sVar);
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
            float f11 = lv.t.f28251e;
            d2.c.f(m2.e(qVar, f11), sVar);
            String str = gVar.f22277c;
            if (str == null) {
                str = "";
            }
            r9.d(str, null, 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.f28274n, lv.s.C, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), sVar, 0, 0, 130046);
            sVar = sVar;
            d2.c.f(m2.e(qVar, lv.t.f28254h), sVar);
            gVar2 = gVar;
            n0.a(m2.d(qVar, 1.0f), d2.i.h(f11, iVar), d2.i.g(f11), null, 0, 0, u3.e.e(1721529352, sVar, new h(2, gVar2)), sVar, 1573302, 56);
            sVar.q(true);
        } else {
            gVar2 = gVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lk.a(gVar2, i11, 4);
        }
    }

    public static final void r(g9.f0 f0Var, ep.d0 d0Var, Function1 function1, Function1 function12, m3.n nVar, int i11) {
        m3.s sVar;
        g9.z zVar;
        f0Var.getClass();
        d0Var.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-858797603);
        int i12 = i11 | (sVar2.h(f0Var) ? 4 : 2) | (sVar2.h(d0Var) ? 32 : 16) | (sVar2.h(function1) ? 256 : 128);
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            b1 b1VarN = m3.i.n(d0Var.f16259t, sVar2, 0);
            g9.l lVarB = f0Var.b();
            x70.c cVar = null;
            String str = (lVarB == null || (zVar = lVarB.f20163b) == null) ? null : zVar.f20258b.f27564f;
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM);
            }
            b1 b1Var = (b1) objM;
            dv.d dVar = Intrinsics.areEqual(str, hp.v.INSTANCE.f22335a) ? dv.d.SCREEN_SAVED_RECIPES : Intrinsics.areEqual(str, hp.u.INSTANCE.f22335a) ? dv.d.SCREEN_RECIPE_LIST : dv.d.NONE;
            nv.b.a(sVar2, 0);
            Unit unit = Unit.f26487a;
            boolean zH = sVar2.h(d0Var) | sVar2.f(b1VarN) | sVar2.d(dVar.ordinal());
            Object objM2 = sVar2.M();
            if (zH || objM2 == fVar) {
                e1 e1Var = new e1(d0Var, b1VarN, dVar, cVar, 10);
                sVar2.k0(e1Var);
                objM2 = e1Var;
            }
            m3.i.h(unit, (Function2) objM2, sVar2);
            g1 g1Var = new g1(4);
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = new li.c(b1Var, 5);
                sVar2.k0(objM3);
            }
            e.n nVarN = jb.u.N(g1Var, (Function1) objM3, sVar2, 48);
            boolean zH2 = sVar2.h(d0Var) | sVar2.h(nVarN);
            Object objM4 = sVar2.M();
            if (zH2 || objM4 == fVar) {
                objM4 = new gf.g(d0Var, nVarN, cVar, 27);
                sVar2.k0(objM4);
            }
            m3.i.h(unit, (Function2) objM4, sVar2);
            hp.g gVar = (hp.g) b1VarN.getValue();
            if (gVar == null) {
                sVar2.a0(682935539);
                sVar2.q(false);
                sVar = sVar2;
            } else {
                sVar2.a0(682935540);
                mv.u uVar = d0Var.f16246f;
                uVar.getClass();
                String strA = uVar.a(mv.k.APPTRK_CM_RECIPE_SHARING);
                boolean zW = strA != null ? ox.h.w(strA, mv.r.TREATMENT.a()) : false;
                boolean z11 = gVar.f22285k;
                boolean zH3 = sVar2.h(gVar) | ((i12 & 896) == 256);
                Object objM5 = sVar2.M();
                if (zH3 || objM5 == fVar) {
                    objM5 = new g(function1, gVar, 1);
                    sVar2.k0(objM5);
                }
                Function0 function0 = (Function0) objM5;
                boolean zH4 = sVar2.h(d0Var) | sVar2.h(gVar);
                Object objM6 = sVar2.M();
                if (zH4 || objM6 == fVar) {
                    objM6 = new i2.e(25, d0Var, gVar);
                    sVar2.k0(objM6);
                }
                Function0 function02 = (Function0) objM6;
                boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                Object objM7 = sVar2.M();
                if (objM7 == fVar) {
                    objM7 = new h2.n0(b1Var, 23);
                    sVar2.k0(objM7);
                }
                Function0 function03 = (Function0) objM7;
                boolean zH5 = sVar2.h(d0Var) | sVar2.h(gVar);
                Object objM8 = sVar2.M();
                if (zH5 || objM8 == fVar) {
                    objM8 = new hb0.o(23, d0Var, gVar);
                    sVar2.k0(objM8);
                }
                o(gVar, z11, function0, function02, zBooleanValue, function03, zW, (Function1) objM8, function12, sVar2, 100859904);
                sVar = sVar2;
                sVar.q(false);
            }
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.p(f0Var, d0Var, i11, function1, function12, 28);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(b4.t r17, com.app.tgtg.model.remote.discover.response.DiscoverBucket r18, kotlin.jvm.functions.Function0 r19, kotlin.jvm.functions.Function0 r20, boolean r21, m3.n r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lp.d.s(b4.t, com.app.tgtg.model.remote.discover.response.DiscoverBucket, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, m3.n, int, int):void");
    }

    public static final void t(final ep.d0 d0Var, final Function1 function1, final Function0 function0, final Function1 function12, m3.n nVar, int i11) {
        m3.s sVar;
        d0Var.getClass();
        function1.getClass();
        function0.getClass();
        function12.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1414772778);
        int i12 = i11 | (sVar2.h(d0Var) ? 4 : 2) | (sVar2.h(function1) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128) | (sVar2.h(function12) ? NewHope.SENDB_BYTES : 1024);
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            final b1 b1VarN = m3.i.n(d0Var.f16253n, sVar2, 0);
            final b1 b1VarN2 = m3.i.n(d0Var.D, sVar2, 0);
            b1 b1VarN3 = m3.i.n(d0Var.F, sVar2, 0);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.TRUE);
                sVar2.k0(objM);
            }
            final b1 b1Var = (b1) objM;
            boolean z11 = Intrinsics.areEqual(b1VarN3.getValue(), "PENDING") || Intrinsics.areEqual(b1VarN3.getValue(), "PARTIAL");
            final int size = (!z11 || ((List) b1VarN.getValue()).size() >= 4) ? 0 : 4 - ((List) b1VarN.getValue()).size();
            b4.t tVarD = d2.c.D(d2.c.F(m2.f13850c), 0.0f, lv.t.l, 0.0f, 0.0f, 13);
            boolean zF = ((i12 & 112) == 32) | sVar2.f(b1VarN) | ((i12 & 7168) == 2048) | sVar2.d(size) | sVar2.g(z11) | sVar2.f(b1VarN2) | ((i12 & 896) == 256) | sVar2.h(d0Var);
            Object objM2 = sVar2.M();
            if (zF || objM2 == fVar) {
                final boolean z12 = z11;
                Function1 function13 = new Function1() { // from class: lp.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        f2.l lVar = (f2.l) obj;
                        lVar.getClass();
                        f2.l.q(lVar, null, d.f28027k, 3);
                        List list = (List) b1VarN.getValue();
                        lVar.r(list.size(), null, new cn.n(list, 11), new u3.d(new gn.p(list, function1, function12, 2), true, 802480018));
                        for (int i13 = 0; i13 < size; i13++) {
                            f2.l.q(lVar, null, d.l, 3);
                        }
                        f2.l.q(lVar, null, new u3.d(new n(z12, b1VarN2, function0, d0Var, b1Var, 0), true, 1735320034), 3);
                        return Unit.f26487a;
                    }
                };
                sVar2.k0(function13);
                objM2 = function13;
            }
            sVar = sVar2;
            ox.h.c(tVarD, null, null, null, null, null, false, null, (Function1) objM2, sVar, 0, 510);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.p(d0Var, function1, i11, function0, function12, 29);
        }
    }

    public static final void u(int i11, b4.t tVar, String str, String str2, m3.n nVar) {
        b4.t tVar2;
        str.getClass();
        str2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1177187580);
        int i12 = i11 | 6 | (sVar.f(str) ? 32 : 16) | (sVar.f(str2) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(qVar, 1.0f);
            float f11 = lv.t.f28253g;
            b4.t tVarB = d2.c.B(tVarD, f11, 0.0f, 2);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarB, sVar);
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
            r9.d(str, null, lv.s.f28215a, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28264c, sVar, ((i12 >> 3) & 14) | MLKEMEngine.KyberPolyBytes, 12582912, 130042);
            d2.c.f(m2.e(qVar, f11), sVar);
            r9.d(str2, null, lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 2, false, 2, 0, null, lv.v.f28274n, sVar, ((i12 >> 6) & 14) | MLKEMEngine.KyberPolyBytes, 12607872, 109562);
            sVar = sVar;
            d2.c.f(m2.e(qVar, lv.t.f28254h), sVar);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p(i11, 0, tVar2, str, str2);
        }
    }

    public static final k0 v(m3.n nVar) {
        long j9 = lv.s.I;
        List listH = kotlin.collections.d0.h(new i4.v(i4.v.b(0.6f, j9)), new i4.v(i4.v.b(0.9f, lv.s.H)), new i4.v(i4.v.b(0.6f, j9)));
        t1.d0 d0VarC = t1.c.c(t1.c.h(nVar), 0.0f, 1000.0f, t1.c.g(t1.c.k(1800, 0, t1.w.f39596d, 2), p0.Reverse, 4), nVar, 4536);
        return new k0(listH, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(((Number) d0VarC.f39409c.getValue()).floatValue()) << 32), (((long) Float.floatToRawIntBits(((Number) d0VarC.f39409c.getValue()).floatValue() + 300.0f)) << 32) | (((long) Float.floatToRawIntBits(300.0f)) & 4294967295L));
    }
}
