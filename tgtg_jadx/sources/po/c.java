package po;

import b4.q;
import b4.t;
import b5.h;
import b5.j;
import bn.h0;
import bn.v;
import bn.x;
import bn.z;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.AllergensInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import d2.b2;
import d2.i;
import d2.m2;
import d2.u;
import d2.w;
import d2.y;
import g3.f8;
import g3.p;
import g3.r9;
import g3.s0;
import g3.v3;
import g3.w6;
import i4.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import l2.f;
import l2.g;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import m5.l0;
import m5.u0;
import o30.f0;
import oo.r;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import q5.o;
import r8.k;
import v1.y1;
import v80.b0;
import w.a0;
import x5.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f35579a = new u3.d(new o9.a(16), false, -220546261);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f35580b = new u3.d(new o9.a(17), false, 748853347);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3.d f35581c = new u3.d(new o9.a(18), false, -770027735);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u3.d f35582d = new u3.d(new o9.a(19), false, -1884805837);

    public static final void a(w6 w6Var, Function0 function0, Function1 function1, Function0 function02, AllergensInfo allergensInfo, no.e eVar, n nVar, int i11) {
        s sVar;
        w6Var.getClass();
        function0.getClass();
        function02.getClass();
        eVar.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(844529225);
        int i12 = i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.h(function0) ? 32 : 16) | (sVar2.h(function1) ? 256 : 128) | (sVar2.f(allergensInfo) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.f(eVar) ? 131072 : 65536);
        if (sVar2.R(i12 & 1, (74899 & i12) != 74898)) {
            float f11 = 12;
            sVar = sVar2;
            v3.a(function02, null, w6Var, 0.0f, false, g.c(f11, f11, 0.0f, 0.0f, 12), lv.s.J, 0L, 0.0f, 0L, null, null, null, u3.e.e(-1884726873, sVar2, new v(eVar, function0, function02, allergensInfo, function1, 10)), sVar, 1572870 | ((i12 << 6) & 896), 3078, 7066);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new z(w6Var, function0, function1, function02, allergensInfo, eVar, i11, 5);
        }
    }

    public static final void b(Function0 function0, Function0 function02, AllergensInfo allergensInfo, Function1 function1, n nVar, int i11) {
        String strJ;
        Function0 function03 = function02;
        s sVar = (s) nVar;
        sVar.c0(-904757763);
        int i12 = i11 | (sVar.h(function0) ? 4 : 2) | (sVar.h(function03) ? 32 : 16) | (sVar.f(allergensInfo) ? 256 : 128) | (sVar.h(function1) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            y1 y1VarQ = v1.n.q(sVar);
            q qVar = q.f5711a;
            t tVarR = v1.n.r(qVar, y1VarQ, true);
            y yVarA = w.a(i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarR, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
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
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            float f11 = 40;
            String strF = k.f(f11, R.string.allergens_popup_header, qVar, sVar, sVar);
            u0 u0Var = lv.v.f28271j;
            long j9 = lv.s.C;
            r9.d(strF, m2.d(qVar, 1.0f), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, 432, 12582912, 130040);
            float f12 = 24;
            d2.c.f(m2.m(qVar, f12), sVar);
            int i13 = i12 >> 6;
            if (allergensInfo == null || !allergensInfo.getShownOnCheckout() || allergensInfo.getTitle() == null) {
                strJ = b3.i.j(537325405, R.string.allergens_popup_title, sVar, sVar, false);
            } else {
                sVar.a0(537324655);
                sVar.q(false);
                strJ = allergensInfo.getTitle();
            }
            r9.d(strJ, d2.c.B(qVar, f11, 0.0f, 2), j9, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, lv.v.f28275o, sVar, 432, 12582912, 130040);
            d2.c.f(m2.m(qVar, 8), sVar);
            m(allergensInfo, function1, sVar, i13 & 126);
            d2.c.f(m2.m(qVar, f12), sVar);
            float f13 = 16;
            float f14 = 44;
            t tVarD = m2.d(m2.b(d2.c.B(qVar, f13, 0.0f, 2), 0.0f, f14, 1), 1.0f);
            f fVarB = g.b(20);
            b2 b2Var = p.f19253a;
            s0.a(function0, tVarD, false, fVarB, p.a(lv.s.f28217b, 0L, 0L, 0L, sVar, 14), null, null, null, null, f35580b, sVar, (i12 & 14) | 805306416, 484);
            d2.c.f(m2.m(qVar, f13), sVar);
            t tVarJ = v1.n.j(m2.d(m2.b(d2.c.D(qVar, 0.0f, 0.0f, 0.0f, f13, 7), 0.0f, f14, 1), 1.0f), i4.v.f23314g, g0.f23254b);
            boolean z11 = (i12 & 112) == 32;
            Object objM = sVar.M();
            if (z11 || objM == m.f29332a) {
                function03 = function02;
                objM = new oo.z(10, function03);
                sVar.k0(objM);
            } else {
                function03 = function02;
            }
            t tVarF = b3.i.f(b4.d.f5695n, androidx.compose.foundation.b.c(tVarJ, false, null, null, (Function0) objM, 15));
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarF, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            r9.d(f0.U(sVar, R.string.orderview_delegate_accept_invitation_cta_decline), u.f13938a.a(qVar, b4.d.f5687e), lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar, MLKEMEngine.KyberPolyBytes, 0, 262136);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.v(function0, function03, allergensInfo, function1, i11);
        }
    }

    public static final void c(Function0 function0, Function0 function02, Function0 function03, n nVar, int i11) {
        s sVar;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-1868969089);
        int i12 = i11 | (sVar2.h(function0) ? 4 : 2) | (sVar2.h(function02) ? 32 : 16) | (sVar2.h(function03) ? 256 : 128);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            w6 w6VarF = v3.f(6, 2, null, sVar2);
            Object objM = sVar2.M();
            if (objM == m.f29332a) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM);
            }
            float f11 = 12;
            sVar = sVar2;
            v3.a(function0, null, w6VarF, 0.0f, false, g.c(f11, f11, 0.0f, 0.0f, 12), lv.s.J, 0L, 0.0f, 0L, null, null, null, u3.e.e(271481181, sVar2, new b((b0) objM, w6VarF, function02, function03, 0)), sVar, (i12 & 14) | 1572864, 3078, 7066);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r(function0, function02, function03, i11, 2);
        }
    }

    public static final void d(Function0 function0, Function0 function02, n nVar, int i11) {
        s sVar;
        function0.getClass();
        function02.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1580547153);
        int i12 = (sVar2.h(function02) ? 32 : 16) | i11;
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            w6 w6VarF = v3.f(6, 2, null, sVar2);
            Object objM = sVar2.M();
            if (objM == m.f29332a) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM);
            }
            float f11 = 12;
            sVar = sVar2;
            v3.a(function0, null, w6VarF, 0.0f, false, g.c(f11, f11, 0.0f, 0.0f, 12), lv.s.J, 0L, 0.0f, 0L, null, null, null, u3.e.e(-573969873, sVar2, new b((b0) objM, w6VarF, function0, function02, 1)), sVar, 1572870, 3078, 7066);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.g0(function0, function02, i11, 11);
        }
    }

    public static final void e(w6 w6Var, Function0 function0, boolean z11, boolean z12, Function1 function1, Function1 function12, n nVar, int i11) {
        s sVar;
        w6Var.getClass();
        function0.getClass();
        function1.getClass();
        function12.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(584524257);
        int i12 = i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.h(function0) ? 32 : 16) | (sVar2.g(z11) ? 256 : 128) | (sVar2.g(z12) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function1) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.h(function12) ? 131072 : 65536);
        if (sVar2.R(i12 & 1, (74899 & i12) != 74898)) {
            float f11 = 12;
            sVar = sVar2;
            v3.a(function0, null, w6Var, 0.0f, false, g.c(f11, f11, 0.0f, 0.0f, 12), lv.s.J, 0L, 0.0f, 0L, null, null, null, u3.e.e(-918657341, sVar2, new ar.b(z11, z12, function1, function12, function0)), sVar, ((i12 >> 3) & 14) | 1572864 | ((i12 << 6) & 896), 3078, 7066);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f8(w6Var, function0, z11, z12, function1, function12, i11);
        }
    }

    public static final void f(String str, n nVar, int i11) {
        s sVar;
        str.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(474106843);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.R(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            r9.d(str, d2.c.B(q.f5711a, 40, 0.0f, 2), lv.s.C, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, (i12 & 14) | 432, 12582912, 130040);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new h0(str, i11, 6);
        }
    }

    public static final void g(String str, Function1 function1, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(322798760);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.a0(971967885);
            m5.e eVar = new m5.e();
            String strU = f0.U(sVar, R.string.orderview_delegate_accept_invitation_description_with_url_placeholder);
            String strT = f0.T(R.string.orderview_delegate_accept_invitation_description_with_url, new Object[]{strU}, sVar);
            int iG = StringsKt.G(strT, strU, 0, false, 6);
            int length = strU.length() + iG;
            eVar.c(strT);
            eVar.b(new l0(lv.s.f28215a, 0L, (q5.r) null, (q5.n) null, (o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, l.f43854c, (i4.u0) null, 61438), iG, length);
            eVar.a("URL", iG, length, str);
            m5.h hVarJ = eVar.j();
            sVar.q(false);
            t tVarD = m2.d(d2.c.B(q.f5711a, 40, 0.0f, 2), 1.0f);
            u0 u0VarA = u0.a(lv.v.f28274n, lv.s.C, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
            boolean zF = ((i12 & 112) == 32) | sVar.f(hVarJ);
            Object objM = sVar.M();
            if (zF || objM == m.f29332a) {
                objM = new os.j(hVarJ, function1, 1);
                sVar.k0(objM);
            }
            m2.g0.c(hVarJ, tVarD, u0VarA, false, 0, 0, null, (Function1) objM, sVar, 48, 120);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a(str, function1, i11, 0);
        }
    }

    public static final void h(w6 w6Var, Function0 function0, Function0 function02, float f11, n nVar, int i11) {
        s sVar;
        w6Var.getClass();
        function0.getClass();
        function02.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(81451249);
        int i12 = i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.h(function0) ? 32 : 16) | (sVar2.c(f11) ? NewHope.SENDB_BYTES : 1024);
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            float f12 = 12;
            sVar = sVar2;
            v3.a(function02, null, w6Var, 0.0f, false, g.c(f12, f12, 0.0f, 0.0f, 12), lv.s.J, 0L, 0.0f, 0L, null, null, null, u3.e.e(661891535, sVar2, new d(f11, 0, function0, function02)), sVar, 1572870 | ((i12 << 6) & 896), 3078, 7066);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e(w6Var, function0, function02, f11, i11, 0);
        }
    }

    public static final void i(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(682052330);
        if (sVar.R(i11 & 1, i11 != 0)) {
            t tVarD = m2.d(m2.b(q.f5711a, 0.0f, 400, 1), 1.0f);
            y yVarA = w.a(i.f13805e, b4.d.f5695n, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
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
            cg.j.p(sVar, 6);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p60.a(i11, 6);
        }
    }

    public static final void j(BasicItem basicItem, Function1 function1, Function0 function0, n nVar, int i11) {
        s sVar;
        function1.getClass();
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(788751767);
        int i12 = i11 | (sVar2.h(basicItem) ? 4 : 2) | (sVar2.h(function1) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            w6 w6VarF = v3.f(6, 2, null, sVar2);
            Object objM = sVar2.M();
            if (objM == m.f29332a) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM);
            }
            float f11 = 12;
            sVar = sVar2;
            v3.a(function0, q.f5711a, w6VarF, 0.0f, false, g.c(f11, f11, 0.0f, 0.0f, 12), lv.s.B, 0L, 0.0f, 0L, null, null, null, u3.e.e(1454503029, sVar2, new v(basicItem, (b0) objM, w6VarF, function0, function1, 11)), sVar, 1572918, 3078, 7064);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(basicItem, function1, function0, i11, 19);
        }
    }

    public static final void k(w6 w6Var, Function0 function0, Function0 function02, float f11, n nVar, int i11) {
        s sVar;
        w6Var.getClass();
        function0.getClass();
        function02.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(342711547);
        int i12 = i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.h(function0) ? 32 : 16) | (sVar2.c(f11) ? NewHope.SENDB_BYTES : 1024);
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            float f12 = 12;
            sVar = sVar2;
            v3.a(function02, null, w6Var, 0.0f, false, g.c(f12, f12, 0.0f, 0.0f, 12), lv.s.J, 0L, 0.0f, 0L, null, null, null, u3.e.e(-199922087, sVar2, new d(f11, 1, function0, function02)), sVar, 1572870 | ((i12 << 6) & 896), 3078, 7066);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e(w6Var, function0, function02, f11, i11, 1);
        }
    }

    public static final void l(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1208645885);
        if (sVar.R(i11 & 1, i11 != 0)) {
            s1.y.d(true, null, null, null, null, f35579a, sVar, 196614, 30);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p60.a(i11, 7);
        }
    }

    public static final void m(AllergensInfo allergensInfo, Function1 function1, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(1840641960);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(allergensInfo) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        if (!sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.U();
        } else if (allergensInfo != null && allergensInfo.getShownOnCheckout() && allergensInfo.getDescription() != null) {
            sVar.a0(1341028608);
            f(allergensInfo.getDescription(), sVar, 0);
            sVar.q(false);
        } else if (allergensInfo == null || !allergensInfo.getShownOnCheckout() || allergensInfo.getUrl() == null) {
            sVar.a0(1341035660);
            f(f0.U(sVar, R.string.allergens_popup_text_v2), sVar, 0);
            sVar.q(false);
        } else {
            sVar.a0(-1377663660);
            g(allergensInfo.getUrl(), function1, sVar, i12 & 112);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new x(allergensInfo, function1, i11, 23);
        }
    }
}
