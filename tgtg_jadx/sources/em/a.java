package em;

import a3.p0;
import android.content.Context;
import androidx.lifecycle.p;
import androidx.lifecycle.s1;
import b4.k;
import b4.q;
import b4.t;
import c5.d2;
import c5.v0;
import c5.x1;
import c6.y;
import cn.u;
import com.app.tgtg.R;
import com.app.tgtg.feature.logincharity.ui.model.Country;
import com.braze.h2;
import d2.m2;
import d2.n1;
import d2.w;
import d40.t1;
import g3.d9;
import g3.q4;
import g3.r9;
import g3.s0;
import g3.z4;
import g4.l;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import lv.v;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import o30.e0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import s1.b0;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f16081a = new u3.d(new u(20, (byte) 0), false, 1726938258);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f16082b = new u3.d(new u(21, (byte) 0), false, 1875947580);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3.d f16083c = new u3.d(new u(22, (byte) 0), false, -753158594);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f16084d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f16085e = 0;

    public static final void a(t tVar, j jVar, Function0 function0, Function0 function02, Function0 function03, n nVar, int i11) {
        t tVar2;
        j jVar2;
        int i12;
        j jVar3;
        t tVar3;
        b1 b1Var;
        b5.h hVar;
        Object yVar;
        b5.g gVar;
        boolean z11;
        s sVar = (s) nVar;
        sVar.c0(77057993);
        int i13 = i11 | 22 | (sVar.h(function03) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i13 & 1, (i13 & 9363) != 9362)) {
            sVar.W();
            int i14 = i11 & 1;
            q qVar = q.f5711a;
            if (i14 == 0 || sVar.z()) {
                s1 s1VarA = z8.a.a(sVar);
                if (s1VarA == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i12 = i13 & (-113);
                    jVar3 = (j) t1.K(Reflection.getOrCreateKotlinClass(j.class), s1VarA, e0.r(s1VarA, sVar), s1VarA instanceof p ? ((p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
                    tVar3 = qVar;
                }
            } else {
                sVar.U();
                i12 = i13 & (-113);
                tVar3 = tVar;
                jVar3 = jVar;
            }
            sVar.r();
            i iVar = (i) m3.i.n(jVar3.f16100e, sVar, 0).getValue();
            Context context = (Context) sVar.j(v0.f7390b);
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var2 = (b1) objM;
            Unit unit = Unit.f26487a;
            boolean zH = sVar.h(jVar3) | sVar.h(context);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                al.n nVar2 = new al.n(jVar3, function02, context, b1Var2, (x70.c) null, 9);
                b1Var = b1Var2;
                sVar.k0(nVar2);
                objM2 = nVar2;
            } else {
                b1Var = b1Var2;
            }
            m3.i.h(unit, (Function2) objM2, sVar);
            k kVar = b4.d.f5683a;
            u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVar3, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
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
            List list = iVar.f16094a;
            boolean zH2 = sVar.h(jVar3);
            int i15 = i12;
            Object objM3 = sVar.M();
            if (zH2 || objM3 == fVar) {
                hVar = hVar2;
                gVar = gVar2;
                j jVar4 = jVar3;
                yVar = new y(2, jVar4, j.class, "submit", "submit(Ljava/lang/String;Lcom/app/tgtg/feature/logincharity/ui/model/Country;)V", 0, 1);
                jVar3 = jVar4;
                sVar.k0(yVar);
            } else {
                yVar = objM3;
                hVar = hVar2;
                gVar = gVar2;
            }
            int i16 = 3456 | ((i15 << 3) & 458752);
            b5.h hVar3 = hVar;
            j jVar5 = jVar3;
            b5.g gVar6 = gVar;
            t tVar4 = tVar3;
            b(null, list, b1Var, function0, (Function2) ((KFunction) yVar), function03, sVar, i16);
            if (iVar.f16095b) {
                sVar.a0(287180857);
                t tVarA = b4.a.a(m2.f13850c, c5.m2.f7291a, new d(0));
                u0 u0VarD2 = d2.p.d(kVar, false);
                int iHashCode2 = Long.hashCode(sVar.T);
                u3.i iVarL2 = sVar.l();
                t tVarC2 = b4.a.c(tVarA, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar3);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD2, gVar6, sVar);
                m3.i.C(iVarL2, gVar3, sVar);
                a0.y(iHashCode2, sVar, gVar4, sVar, dVar);
                m3.i.C(tVarC2, gVar5, sVar);
                cg.j.q(0, 0, d2.u.f13938a.a(qVar, b4.d.f5687e), sVar);
                z11 = true;
                sVar.q(true);
                sVar.q(false);
            } else {
                z11 = true;
                sVar.a0(287482611);
                sVar.q(false);
            }
            sVar.q(z11);
            jVar2 = jVar5;
            tVar2 = tVar4;
        } else {
            sVar.U();
            tVar2 = tVar;
            jVar2 = jVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.b(tVar2, jVar2, function0, function02, function03, i11, 6);
        }
    }

    public static final void b(t tVar, List list, b1 b1Var, Function0 function0, Function2 function2, Function0 function02, n nVar, int i11) {
        t tVar2;
        t tVar3;
        boolean z11;
        m5.u0 u0Var;
        b1 b1Var2;
        boolean z12;
        s sVar = (s) nVar;
        sVar.c0(-1156799583);
        int i12 = i11 | 6;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(list) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(b1Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function0) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(function2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(function02) ? 131072 : 65536;
        }
        if (sVar.R(i12 & 1, (74899 & i12) != 74898)) {
            sVar.W();
            int i13 = i11 & 1;
            q qVar = q.f5711a;
            if (i13 == 0 || sVar.z()) {
                tVar3 = qVar;
            } else {
                sVar.U();
                tVar3 = tVar;
            }
            sVar.r();
            l lVar = (l) sVar.j(x1.f7417i);
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var3 = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w("");
                sVar.k0(objM2);
            }
            b1 b1Var4 = (b1) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(null);
                sVar.k0(objM3);
            }
            b1 b1Var5 = (b1) objM3;
            m5.h hVarT = w.b.t((Country) b1Var5.getValue(), null, sVar, 0, 2);
            t tVarA = b0.a(v1.n.r(tVar3.then(m2.f13850c), v1.n.q(sVar), true), null, 3);
            d2.y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
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
            t tVar4 = tVar3;
            cg.j.s("", null, 0L, lv.s.J, function0, null, c0.c(new cg.a(R.drawable.system_icon_close_neutral_80, Integer.valueOf(R.string.login_charity_accessibility_close), function02)), null, sVar, ((i12 << 3) & 57344) | 3078, 166);
            t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
            float f11 = lv.t.f28253g;
            r9.d(f0.U(sVar, R.string.login_charity_contact_how_to_reach_title), d2.c.B(tVarT, f11, 0.0f, 2), lv.s.f28215a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28264c, sVar, 432, 12582912, 131064);
            t tVarB = d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), f11, 0.0f, 2);
            float f12 = lv.t.f28254h;
            t tVarD = d2.c.D(tVarB, 0.0f, f12, 0.0f, 0.0f, 13);
            String strU = f0.U(sVar, R.string.login_charity_contact_how_to_reach_text);
            m5.u0 u0Var2 = v.f28274n;
            long j9 = lv.s.C;
            r9.d(strU, tVarD, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 432, 12582912, 131064);
            t tVarD2 = d2.c.D(d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), f11, 0.0f, 2), 0.0f, f12, 0.0f, 0.0f, 13);
            String strU2 = f0.U(sVar, R.string.login_charity_contact_how_to_reach_email);
            m5.u0 u0Var3 = v.f28276p;
            r9.d(strU2, tVarD2, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var3, sVar, 432, 12582912, 131064);
            t tVarB2 = d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), f11, 0.0f, 2);
            float f13 = lv.t.f28249c;
            t tVarD3 = d2.c.D(tVarB2, 0.0f, f13, 0.0f, 0.0f, 13);
            String str = (String) b1Var4.getValue();
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            l2.f fVarB = l2.g.b(8);
            q4 q4Var = q4.f19349a;
            long j11 = lv.s.G;
            long j12 = lv.s.f28231k;
            d9 d9VarD = q4.d(0L, j11, j11, j11, j12, 0L, 0L, sVar, 2147452927);
            boolean z13 = (((i12 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && sVar.f(b1Var)) || (i12 & MLKEMEngine.KyberPolyBytes) == 256;
            Object objM4 = sVar.M();
            if (z13 || objM4 == fVar) {
                z11 = true;
                objM4 = new co.g(b1Var, b1Var4, 1);
                sVar.k0(objM4);
            } else {
                z11 = true;
            }
            z4.a(str, (Function1) objM4, tVarD3, false, false, null, null, f16081a, null, null, zBooleanValue, null, null, null, true, 0, 0, fVarB, d9VarD, sVar, 12583296, 12582912, 1957752);
            s sVar2 = sVar;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar2.a0(-1187188942);
                u0Var = u0Var3;
                r9.d(f0.U(sVar2, R.string.login_charity_error_invalid_email), d2.c.A(m2.d(qVar, 1.0f), f11, f13), j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar2, 432, 12582912, 131064);
                sVar2 = sVar2;
                sVar2.q(false);
            } else {
                u0Var = u0Var3;
                sVar2.a0(-1186774441);
                sVar2.q(false);
            }
            s sVar3 = sVar2;
            r9.d(f0.U(sVar2, R.string.login_charity_contact_how_to_reach_country), d2.c.D(d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), f11, 0.0f, 2), 0.0f, f12, 0.0f, 0.0f, 13), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar3, 432, 12582912, 131064);
            boolean zBooleanValue2 = ((Boolean) b1Var3.getValue()).booleanValue();
            Object objM5 = sVar3.M();
            if (objM5 == fVar) {
                b1Var2 = b1Var3;
                objM5 = new p0(b1Var2, 7);
                sVar3.k0(objM5);
            } else {
                b1Var2 = b1Var3;
            }
            s0.e(zBooleanValue2, (Function1) objM5, null, u3.e.e(-1972056939, sVar3, new b(b1Var5, b1Var2, list)), sVar3, 3120);
            r9.d(f0.U(sVar3, R.string.login_charity_contact_how_to_reach_country_info), d2.c.D(d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), f11, 0.0f, 2), 0.0f, f13, 0.0f, 0.0f, 13), lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar3, 432, 12582912, 131064);
            sVar = sVar3;
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(new n1(1.0f, true), sVar);
            if (((Country) b1Var5.getValue()) != null) {
                sVar.a0(-1183460045);
                t tVarB3 = d2.c.B(m2.d(qVar, 1.0f), f11, 0.0f, 2);
                String strU3 = f0.U(sVar, R.string.login_charity_contact_submit);
                boolean zH = ((i12 & 57344) == 16384) | sVar.h(lVar);
                Object objM6 = sVar.M();
                if (zH || objM6 == fVar) {
                    androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c cVar = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c(6, b1Var5, lVar, function2, b1Var4);
                    sVar.k0(cVar);
                    objM6 = cVar;
                }
                z12 = true;
                v0.n.l(tVarB3, strU3, null, null, null, false, false, null, null, (Function0) objM6, sVar, 6, 508);
                r9.e(hVarT, d2.j(d2.c.B(d2.c.D(m2.t(m2.d(qVar, 1.0f), 3), 0.0f, lv.t.f28252f, 0.0f, 0.0f, 13), f11, 0.0f, 2), "TermsConditions"), j9, 0L, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, null, m5.u0.a(u0Var2, 0L, 0L, null, null, 0L, null, 0, b0.a0.C(30), null, null, 16646143), sVar, 432, 0, 261112);
                sVar = sVar;
                sVar.q(false);
            } else {
                z12 = true;
                sVar.a0(-1182533641);
                sVar.q(false);
            }
            sVar.q(z12);
            tVar2 = tVar4;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.a0(tVar2, list, b1Var, function0, function2, function02, i11, 2);
        }
    }
}
