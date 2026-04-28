package yl;

import android.content.Context;
import androidx.lifecycle.s1;
import b4.k;
import b4.q;
import b4.t;
import b5.j;
import c5.v0;
import com.app.tgtg.R;
import com.app.tgtg.feature.logincharity.ui.model.Country;
import d2.b2;
import d2.g0;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.p;
import d2.u;
import d40.t1;
import g3.r9;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import lp.v;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import o00.x0;
import o30.e0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import s1.r0;
import s1.y;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f46139a = new u3.d(new tp.a(17), false, 831999089);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f46140b = new u3.d(new tp.a(18), false, -1119781656);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f46141c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f46142d = 0;

    public static final void a(t tVar, List list, Function1 function1, Function1 function12, n nVar, int i11) {
        s sVar;
        list.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(252672470);
        int i12 = i11 | (sVar2.h(list) ? 32 : 16) | (sVar2.h(function1) ? 256 : 128) | (sVar2.h(function12) ? NewHope.SENDB_BYTES : 1024);
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            Object objM = sVar2.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(null);
                sVar2.k0(objM);
            }
            b1 b1Var = (b1) objM;
            m5.h hVarT = w.b.t((Country) b1Var.getValue(), function12, sVar2, (i12 >> 6) & 112, 0);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVar, sVar2);
            j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            k kVar = b4.d.f5687e;
            u uVar = u.f13938a;
            q qVar = q.f5711a;
            t tVarA = uVar.a(qVar, kVar);
            b4.i iVar = b4.d.f5695n;
            b2 b2VarE = d2.c.e(0.0f, 0.0f, 0.0f, 150, 7);
            boolean zH = sVar2.h(list);
            Object objM2 = sVar2.M();
            if (zH || objM2 == fVar) {
                objM2 = new xq.a(5, list, b1Var);
                sVar2.k0(objM2);
            }
            sVar = sVar2;
            ox.h.c(tVarA, null, b2VarE, null, iVar, null, false, null, (Function1) objM2, sVar, 196992, 474);
            y.d(((Country) b1Var.getValue()) != null, uVar.a(qVar, b4.d.f5690h), r0.d(null, 3), r0.e(null, 3), null, u3.e.e(1756948404, sVar, new xh.g(function1, hVarT, b1Var)), sVar, 200064, 16);
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new v(tVar, list, function1, function12, i11);
        }
    }

    public static final void b(t tVar, Country country, boolean z11, Function1 function1, n nVar, int i11) {
        int i12;
        float f11;
        q qVar;
        country.getClass();
        s sVar = (s) nVar;
        sVar.c0(-258500373);
        int i13 = i11 | (sVar.f(country) ? 32 : 16) | (sVar.g(z11) ? 256 : 128);
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            t tVarT = m2.t(m2.d(v1.n.k(tVar, 1, z11 ? lv.s.f28217b : lv.s.G, l2.g.b(12)), 1.0f), 3);
            boolean z12 = (i13 & 112) == 32;
            Object objM = sVar.M();
            if (z12 || objM == m.f29332a) {
                objM = new e(0, function1, country);
                sVar.k0(objM);
            }
            t tVarC = androidx.compose.foundation.b.c(tVarT, false, null, null, (Function0) objM, 15);
            float f12 = lv.t.f28253g;
            float f13 = lv.t.f28252f;
            t tVarA = d2.c.A(tVarC, f12, f13);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC2 = b4.a.c(tVarA, sVar);
            j.R.getClass();
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
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            Integer iconRes = country.getIconRes();
            q qVar2 = q.f5711a;
            if (iconRes == null) {
                sVar.a0(1010749539);
                sVar.q(false);
                i12 = 3;
                qVar = qVar2;
                f11 = f13;
            } else {
                sVar.a0(1010749540);
                n4.b bVarZ = x0.z(iconRes.intValue(), sVar, 0);
                i12 = 3;
                f11 = f13;
                v1.n.d(bVarZ, "CountryFlag", qVar2, null, null, 0.0f, null, sVar, 440, 120);
                qVar = qVar2;
                sVar.q(false);
            }
            t tVarT2 = m2.t(qVar, i12);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            t tVarB = d2.c.B(b3.i.e(1.0f, tVarT2, true), f11, 0.0f, 2);
            q qVar3 = qVar;
            r9.d(country.getDisplayName(), tVarB, lv.s.f28217b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110584);
            sVar = sVar;
            if (z11) {
                sVar.a0(1011334727);
                v1.n.d(x0.z(R.drawable.ic_check_mark_icon, sVar, 0), "CheckMark", qVar3, null, null, 0.0f, null, sVar, 440, 120);
                sVar.q(false);
            } else {
                sVar.a0(1011517627);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.c(tVar, country, z11, function1, i11, 11);
        }
    }

    public static final void c(t tVar, i iVar, Function1 function1, n nVar, int i11) {
        t tVar2;
        i iVar2;
        int i12;
        Object eVar;
        f fVar;
        boolean z11;
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(-2139268152);
        int i13 = i11 | 16 | (sVar.h(function1) ? 256 : 128);
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                s1 s1VarA = z8.a.a(sVar);
                if (s1VarA == null) {
                    com.braze.h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i12 = i13 & (-113);
                    iVar2 = (i) t1.K(Reflection.getOrCreateKotlinClass(i.class), s1VarA, e0.r(s1VarA, sVar), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
                }
            } else {
                sVar.U();
                i12 = i13 & (-113);
                iVar2 = iVar;
            }
            sVar.r();
            f fVar2 = (f) m3.i.n(iVar2.f46164g, sVar, 0).getValue();
            Context context = (Context) sVar.j(v0.f7390b);
            Unit unit = Unit.f26487a;
            boolean zH = ((i12 & 896) == 256) | sVar.h(iVar2) | sVar.h(context);
            Object objM = sVar.M();
            m3.f fVar3 = m.f29332a;
            if (zH || objM == fVar3) {
                tg.g gVar = new tg.g(iVar2, function1, context, null, 18);
                sVar.k0(gVar);
                objM = gVar;
            }
            m3.i.h(unit, (Function2) objM, sVar);
            k kVar = b4.d.f5683a;
            u0 u0VarD = p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            tVar2 = tVar;
            t tVarC = b4.a.c(tVar2, sVar);
            j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar2 = b5.i.f5843f;
            m3.i.C(u0VarD, gVar2, sVar);
            b5.g gVar3 = b5.i.f5842e;
            m3.i.C(iVarL, gVar3, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar4 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar4);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar5 = b5.i.f5841d;
            m3.i.C(tVarC, gVar5, sVar);
            g0 g0Var = m2.f13850c;
            List list = fVar2.f46147a;
            boolean zH2 = sVar.h(iVar2);
            Object objM2 = sVar.M();
            if (zH2 || objM2 == fVar3) {
                objM2 = new sg.c(iVar2, 25);
                sVar.k0(objM2);
            }
            Function1 function12 = (Function1) objM2;
            boolean zH3 = sVar.h(iVar2);
            Object objM3 = sVar.M();
            if (zH3 || objM3 == fVar3) {
                fVar = fVar2;
                eVar = new al.e(1, iVar2, i.class, "trackEvent", "trackEvent(Lcom/app/tgtg/services/analytics/TrackingEvent;Lcom/app/tgtg/services/analytics/model/TrackingProperties;)V", 0, 4);
                sVar.k0(eVar);
            } else {
                eVar = objM3;
                fVar = fVar2;
            }
            a(g0Var, list, function12, (Function1) eVar, sVar, 6);
            if (fVar.f46148b) {
                sVar.a0(-1076731942);
                t tVarA = b4.a.a(g0Var, c5.m2.f7291a, new em.d(4));
                u0 u0VarD2 = p.d(kVar, false);
                int iHashCode2 = Long.hashCode(sVar.T);
                u3.i iVarL2 = sVar.l();
                t tVarC2 = b4.a.c(tVarA, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD2, gVar2, sVar);
                m3.i.C(iVarL2, gVar3, sVar);
                a0.y(iHashCode2, sVar, gVar4, sVar, dVar);
                m3.i.C(tVarC2, gVar5, sVar);
                cg.j.q(0, 0, u.f13938a.a(q.f5711a, b4.d.f5687e), sVar);
                z11 = true;
                sVar.q(true);
                sVar.q(false);
            } else {
                z11 = true;
                sVar.a0(-1076430188);
                sVar.q(false);
            }
            sVar.q(z11);
        } else {
            tVar2 = tVar;
            sVar.U();
            iVar2 = iVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rs.b(tVar2, iVar2, function1, i11, 17);
        }
    }
}
