package ji;

import a3.m3;
import android.content.Context;
import android.widget.Toast;
import androidx.lifecycle.c1;
import b4.k;
import b4.q;
import b4.t;
import b5.j;
import bn.x;
import c5.d2;
import c5.v0;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.user.response.charity.Product;
import com.app.tgtg.model.remote.user.response.charity.ProductChangelog;
import com.app.tgtg.model.remote.user.response.charity.ProductStatus;
import d2.g0;
import d2.h2;
import d2.i2;
import d2.k2;
import d2.m2;
import d2.n0;
import d2.p;
import d2.w;
import d2.y;
import g3.j5;
import g3.r9;
import g3.s0;
import g3.u;
import g3.w2;
import ii.m;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.d0;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lv.v;
import m3.n;
import m3.s;
import m3.w1;
import mv.p0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import w.a0;
import x5.l;
import xh.r;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f25281a = new u3.d(new m(6), false, 1741761780);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25282b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f25283c = 0;

    public static final void a(t tVar, String str, n nVar, int i11) {
        String str2;
        s sVar;
        str.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-220080666);
        int i12 = i11 | (sVar2.f(tVar) ? 4 : 2) | (sVar2.f(str) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            float f11 = 8;
            float f12 = 16;
            sVar = sVar2;
            str2 = str;
            r9.d(str2, d2.c.A(m2.u(v1.n.k(d2.c.D(tVar, 0.0f, 0.0f, f11, f12, 3), 1, lv.s.H, l2.g.b(f12)), null, 3), f11, 4), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28273m, sVar, ((i12 >> 3) & 14) | MLKEMEngine.KyberPolyBytes, 12582912, 131064);
        } else {
            str2 = str;
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cp.g(str2, tVar, i11, 5);
        }
    }

    public static final void b(t tVar, ArrayList arrayList, boolean z11, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(1907234945);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(arrayList) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if (!sVar.R(i12 & 1, (i12 & 147) != 146)) {
            sVar.U();
        } else if (z11) {
            sVar.a0(314356867);
            t tVarR = v1.n.r(tVar, v1.n.q(sVar), false);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarR, sVar);
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
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            sVar.a0(200843804);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                a(d2.j(q.f5711a, str), str, sVar, 0);
            }
            e0.f.D(sVar, false, true, false);
        } else {
            sVar.a0(314054648);
            n0.a(tVar, null, null, null, 0, 0, u3.e.e(330873345, sVar, new a(0, arrayList)), sVar, (i12 & 14) | 1572864, 62);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new m3(tVar, arrayList, z11, i11, 7);
        }
    }

    public static final void c(t tVar, Product product, n nVar, int i11) {
        int i12;
        product.getClass();
        s sVar = (s) nVar;
        sVar.c0(-490361152);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.f(tVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        int i13 = i12 | (sVar.f(product) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                String expiryDate = product.getExpiryDate();
                objM = (expiryDate == null || expiryDate.length() == 0) ? null : p0.E(product.getExpiryDate());
                sVar.k0(objM);
            }
            LocalDate localDate = (LocalDate) objM;
            t tVarB = d2.c.B(tVar, 0.0f, lv.t.f28253g, 1);
            b4.j jVar = b4.d.f5693k;
            d2.b bVar = d2.i.f13801a;
            i2 i2VarA = h2.a(bVar, jVar, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarB, sVar);
            j.R.getClass();
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
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            q qVar = q.f5711a;
            t tVarC2 = b4.a.c(qVar, sVar);
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
            s0.b(m2.m(qVar, 50), l2.g.f26790a, s0.p(i4.v.f23310c, sVar, 6), s0.q(5, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(2027220508, sVar, new b(product, 1)), sVar, 196614, 16);
            sVar.q(true);
            float f11 = 16;
            t tVarV = m2.v(d2.c.B(m2.d(qVar, 1.0f), f11, 0.0f, 2), 3);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(tVarV, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            b4.j jVar2 = b4.d.f5692j;
            i2 i2VarA2 = h2.a(bVar, jVar2, sVar, 0);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            t tVarC4 = b4.a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            a0.y(iHashCode4, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC4, gVar4, sVar);
            k2 k2Var = k2.f13824a;
            t tVarB2 = k2Var.b(jVar, k2Var.a(1.0f, qVar, true));
            i2 i2VarA3 = h2.a(bVar, jVar2, sVar, 0);
            int iHashCode5 = Long.hashCode(sVar.T);
            u3.i iVarL5 = sVar.l();
            t tVarC5 = b4.a.c(tVarB2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA3, gVar, sVar);
            m3.i.C(iVarL5, gVar2, sVar);
            a0.y(iHashCode5, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC5, gVar4, sVar);
            t tVarA = k2Var.a(1.0f, m2.v(qVar, 2), false);
            String name = product.getName();
            m5.u0 u0Var = v.f28274n;
            long j9 = lv.s.C;
            q qVar2 = qVar;
            r9.d(name, tVarA, j9, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110584);
            s sVar2 = sVar;
            String measurement = product.getMeasurement();
            if (measurement == null) {
                sVar2.a0(-1762958435);
                sVar2.q(false);
            } else {
                sVar2.a0(-1762958434);
                t tVarJ = d2.j(d2.c.D(m2.v(qVar2, 3), 4, 0.0f, 0.0f, 0.0f, 14), "MeasurementText");
                qVar2 = qVar2;
                r9.d(a0.p("(", measurement, ")"), tVarJ, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar2, 432, 12582912, 131064);
                sVar2 = sVar2;
                sVar2.q(false);
            }
            sVar2.q(true);
            s sVar3 = sVar2;
            q qVar3 = qVar2;
            r9.d(f0.T(R.string.charity_item_product_quantity, new Object[]{Long.valueOf(product.getQuantity())}, sVar2), k2Var.b(jVar, d2.c.D(qVar2, f11, 0.0f, 0.0f, 0.0f, 14)), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28275o, sVar3, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar3;
            sVar.q(true);
            if (localDate == null) {
                sVar.a0(1069707028);
                sVar.q(false);
            } else {
                sVar.a0(1069707029);
                r9.d(f0.T(R.string.charity_item_expiry_date, new Object[]{ti.t.f(localDate, "dd/MM/yyyy")}, sVar), m2.d(qVar3, 1.0f), lv.s.D, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, v.f28276p, sVar, 432, 12607872, 110584);
                sVar = sVar;
                sVar.q(false);
            }
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new x(tVar, product, i11, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final void d(t tVar, Product product, n nVar, int i11) {
        Product product2;
        s sVar;
        q qVar;
        boolean z11;
        float f11;
        b5.d dVar;
        d2.b bVar;
        Function0 function0;
        LocalDate localDate;
        b5.g gVar;
        b5.g gVar2;
        k2 k2Var;
        b5.g gVar3;
        b5.g gVar4;
        q qVar2;
        ?? r22;
        s sVar2;
        Function0 function02;
        s sVar3;
        q qVar3;
        int i12;
        s sVar4;
        boolean z12;
        s sVar5;
        product.getClass();
        s sVar6 = (s) nVar;
        sVar6.c0(-177526492);
        int i13 = i11 | (sVar6.f(product) ? 32 : 16);
        if (sVar6.R(i13 & 1, (i13 & 19) != 18)) {
            Object objM = sVar6.M();
            if (objM == m3.m.f29332a) {
                String expiryDate = product.getExpiryDate();
                objM = (expiryDate == null || expiryDate.length() == 0) ? null : p0.E(product.getExpiryDate());
                sVar6.k0(objM);
            }
            LocalDate localDate2 = (LocalDate) objM;
            float f12 = 16;
            t tVarB = d2.c.B(tVar, 0.0f, f12, 1);
            b4.j jVar = b4.d.f5693k;
            d2.b bVar2 = d2.i.f13801a;
            i2 i2VarA = h2.a(bVar2, jVar, sVar6, 48);
            int iHashCode = Long.hashCode(sVar6.T);
            u3.i iVarL = sVar6.l();
            t tVarC = b4.a.c(tVarB, sVar6);
            j.R.getClass();
            Function0 function03 = b5.i.f5839b;
            sVar6.e0();
            if (sVar6.S) {
                sVar6.k(function03);
            } else {
                sVar6.n0();
            }
            b5.g gVar5 = b5.i.f5843f;
            m3.i.C(i2VarA, gVar5, sVar6);
            b5.g gVar6 = b5.i.f5842e;
            m3.i.C(iVarL, gVar6, sVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar7 = b5.i.f5844g;
            m3.i.v(sVar6, numValueOf, gVar7);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar6, dVar2);
            b5.g gVar8 = b5.i.f5841d;
            m3.i.C(tVarC, gVar8, sVar6);
            k kVar = b4.d.f5683a;
            u0 u0VarD = p.d(kVar, false);
            int iHashCode2 = Long.hashCode(sVar6.T);
            u3.i iVarL2 = sVar6.l();
            q qVar4 = q.f5711a;
            t tVarC2 = b4.a.c(qVar4, sVar6);
            sVar6.e0();
            if (sVar6.S) {
                sVar6.k(function03);
            } else {
                sVar6.n0();
            }
            m3.i.C(u0VarD, gVar5, sVar6);
            m3.i.C(iVarL2, gVar6, sVar6);
            a0.y(iHashCode2, sVar6, gVar7, sVar6, dVar2);
            m3.i.C(tVarC2, gVar8, sVar6);
            float f13 = 50;
            t tVarM = m2.m(qVar4, f13);
            u uVarP = s0.p(i4.v.f23310c, sVar6, 6);
            l2.f fVar = l2.g.f26790a;
            s0.b(tVarM, fVar, uVarP, s0.q(5, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(-1660696192, sVar6, new b(product, 0)), sVar6, 196614, 16);
            if (product.getChangelog() == null) {
                sVar6.a0(-1288584083);
                sVar6.q(false);
                qVar = qVar4;
                z11 = true;
            } else {
                sVar6.a0(-1288584082);
                float f14 = 2;
                qVar = qVar4;
                t tVarJ = v1.n.j(d2.c.D(qVar4, 0.0f, f14, f14, 0.0f, 9), lv.s.J, fVar);
                k kVar2 = b4.d.f5685c;
                d2.u uVar = d2.u.f13938a;
                t tVarA = uVar.a(tVarJ, kVar2);
                u0 u0VarD2 = p.d(kVar, false);
                int iHashCode3 = Long.hashCode(sVar6.T);
                u3.i iVarL3 = sVar6.l();
                t tVarC3 = b4.a.c(tVarA, sVar6);
                sVar6.e0();
                if (sVar6.S) {
                    sVar6.k(function03);
                } else {
                    sVar6.n0();
                }
                m3.i.C(u0VarD2, gVar5, sVar6);
                m3.i.C(iVarL3, gVar6, sVar6);
                a0.y(iHashCode3, sVar6, gVar7, sVar6, dVar2);
                m3.i.C(tVarC3, gVar8, sVar6);
                a.a.e(d2.j(d2.c.z(uVar.a(qVar, b4.d.f5687e), f14), "CharityUpdateDot"), sVar6, 0);
                z11 = true;
                sVar6.q(true);
                sVar6.q(false);
            }
            sVar6.q(z11);
            t tVarH = m2.h(d2.c.B(qVar, f12, 0.0f, 2), f13);
            k2 k2Var2 = k2.f13824a;
            t tVarA2 = k2Var2.a(1.0f, tVarH, z11);
            y yVarA = w.a(d2.i.f13806f, b4.d.f5695n, sVar6, 54);
            int iHashCode4 = Long.hashCode(sVar6.T);
            u3.i iVarL4 = sVar6.l();
            t tVarC4 = b4.a.c(tVarA2, sVar6);
            sVar6.e0();
            if (sVar6.S) {
                sVar6.k(function03);
            } else {
                sVar6.n0();
            }
            m3.i.C(yVarA, gVar5, sVar6);
            m3.i.C(iVarL4, gVar6, sVar6);
            a0.y(iHashCode4, sVar6, gVar7, sVar6, dVar2);
            m3.i.C(tVarC4, gVar8, sVar6);
            if (product.getChangelog() == null) {
                sVar6.a0(-1966588744);
                sVar6.q(false);
                localDate = localDate2;
                dVar = dVar2;
                gVar3 = gVar7;
                gVar4 = gVar6;
                f11 = f12;
                r22 = 0;
                qVar2 = qVar;
                k2Var = k2Var2;
                function0 = function03;
                gVar = gVar5;
                gVar2 = gVar8;
                bVar = bVar2;
                sVar2 = sVar6;
            } else {
                sVar6.a0(-1966588743);
                f11 = f12;
                dVar = dVar2;
                bVar = bVar2;
                function0 = function03;
                localDate = localDate2;
                gVar = gVar5;
                gVar2 = gVar8;
                k2Var = k2Var2;
                gVar3 = gVar7;
                gVar4 = gVar6;
                qVar2 = qVar;
                r22 = 0;
                r9.d(f0.U(sVar6, product.getChangelog().getStatus().getStringRes()), d2.j(m2.d(qVar, 1.0f), "ChangelogStatus"), lv.s.C, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, v.f28277q, sVar6, 432, 12607872, 110584);
                s sVar7 = sVar6;
                sVar7.q(false);
                sVar2 = sVar7;
            }
            t tVarD = m2.d(qVar2, 1.0f);
            b4.j jVar2 = b4.d.f5692j;
            i2 i2VarA2 = h2.a(bVar, jVar2, sVar2, r22);
            int iHashCode5 = Long.hashCode(sVar2.T);
            u3.i iVarL5 = sVar2.l();
            t tVarC5 = b4.a.c(tVarD, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                function02 = function0;
                sVar2.k(function02);
            } else {
                function02 = function0;
                sVar2.n0();
            }
            b5.g gVar9 = gVar;
            m3.i.C(i2VarA2, gVar9, sVar2);
            b5.g gVar10 = gVar4;
            m3.i.C(iVarL5, gVar10, sVar2);
            b5.d dVar3 = dVar;
            b5.g gVar11 = gVar3;
            a0.y(iHashCode5, sVar2, gVar11, sVar2, dVar3);
            b5.g gVar12 = gVar2;
            m3.i.C(tVarC5, gVar12, sVar2);
            k2 k2Var3 = k2Var;
            t tVarA3 = k2Var3.a(1.0f, qVar2, true);
            i2 i2VarA3 = h2.a(bVar, jVar2, sVar2, r22);
            int iHashCode6 = Long.hashCode(sVar2.T);
            u3.i iVarL6 = sVar2.l();
            t tVarC6 = b4.a.c(tVarA3, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(function02);
            } else {
                sVar2.n0();
            }
            m3.i.C(i2VarA3, gVar9, sVar2);
            m3.i.C(iVarL6, gVar10, sVar2);
            a0.y(iHashCode6, sVar2, gVar11, sVar2, dVar3);
            m3.i.C(tVarC6, gVar12, sVar2);
            t tVarA4 = k2Var3.a(1.0f, m2.v(qVar2, 2), r22);
            String name = product.getName();
            m5.u0 u0Var = v.f28274n;
            s sVar8 = sVar2;
            r9.d(name, tVarA4, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, e(u0Var, product), sVar8, 0, 24960, 110588);
            s sVar9 = sVar8;
            String measurement = product.getMeasurement();
            if (measurement == null) {
                sVar9.a0(1942793950);
                sVar9.q(r22);
                product2 = product;
                sVar3 = sVar9;
            } else {
                sVar9.a0(1942793951);
                t tVarJ2 = d2.j(d2.c.D(m2.v(qVar2, 3), 4, 0.0f, 0.0f, 0.0f, 14), "MeasurementText");
                String strP = a0.p("(", measurement, ")");
                m5.u0 u0VarE = e(u0Var, product);
                product2 = product;
                r9.d(strP, tVarJ2, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0VarE, sVar9, 48, 0, 131068);
                s sVar10 = sVar9;
                sVar10.q(r22);
                sVar3 = sVar10;
            }
            sVar3.q(true);
            ProductChangelog changelog = product2.getChangelog();
            Integer quantity = changelog != null ? changelog.getQuantity() : null;
            if (quantity == null) {
                sVar3.a0(-1195189329);
                sVar3.q(r22);
                qVar3 = qVar2;
                i12 = R.string.charity_item_product_quantity;
                sVar4 = sVar3;
            } else {
                sVar3.a0(-1195189328);
                int iIntValue = quantity.intValue();
                q qVar5 = qVar2;
                qVar3 = qVar5;
                t tVarJ3 = d2.j(d2.c.D(qVar5, f11, 0.0f, 0.0f, 0.0f, 14), "ChangelogQuantityText");
                String strT = f0.T(R.string.charity_item_product_quantity, new Object[]{Integer.valueOf(iIntValue)}, sVar3);
                m5.u0 u0VarA = m5.u0.a(v.f28275o, 0L, 0L, null, null, 0L, l.f43855d, 0, 0L, null, null, 16773119);
                long j9 = lv.s.E;
                s sVar11 = sVar3;
                i12 = R.string.charity_item_product_quantity;
                r9.d(strT, tVarJ3, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0VarA, sVar11, 432, 0, 131064);
                s sVar12 = sVar11;
                sVar12.q(r22);
                sVar4 = sVar12;
            }
            ProductChangelog changelog2 = product2.getChangelog();
            s sVar13 = sVar4;
            q qVar6 = qVar3;
            r9.d(f0.T(i12, new Object[]{Long.valueOf(product2.getQuantity())}, sVar4), d2.j(d2.c.D(qVar3, (changelog2 != null ? changelog2.getQuantity() : null) != null ? 8 : f11, 0.0f, 0.0f, 0.0f, 14), "QuantityText"), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, e(v.f28275o, product2), sVar13, 0, 0, 131068);
            s sVar14 = sVar13;
            sVar14.q(true);
            LocalDate localDate3 = localDate;
            if (localDate3 == null) {
                sVar14.a0(-1964030128);
                sVar14.q(r22);
                z12 = true;
                sVar5 = sVar14;
            } else {
                sVar14.a0(-1964030127);
                t tVarD2 = m2.d(qVar6, 1.0f);
                z12 = true;
                r9.d(f0.T(R.string.charity_item_expiry_date, new Object[]{ti.t.f(localDate3, "dd/MM/yyyy")}, sVar14), tVarD2, lv.s.D, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, v.f28276p, sVar14, 432, 12607872, 110584);
                s sVar15 = sVar14;
                sVar15.q(r22);
                sVar5 = sVar15;
            }
            sVar5.q(z12);
            sVar5.q(z12);
            sVar = sVar5;
        } else {
            product2 = product;
            sVar6.U();
            sVar = sVar6;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.i(tVar, product2, i11, 21);
        }
    }

    public static final m5.u0 e(m5.u0 u0Var, Product product) {
        ProductChangelog changelog = product.getChangelog();
        ProductStatus status = changelog != null ? changelog.getStatus() : null;
        ProductStatus productStatus = ProductStatus.REMOVED;
        l lVar = status == productStatus ? l.f43855d : l.f43853b;
        ProductChangelog changelog2 = product.getChangelog();
        return m5.u0.a(u0Var, (changelog2 != null ? changelog2.getStatus() : null) == productStatus ? lv.s.E : lv.s.C, 0L, null, null, 0L, lVar, 0, 0L, null, null, 16773118);
    }

    public static final void f(h hVar, Function0 function0, n nVar, int i11) {
        hVar.getClass();
        c1 c1Var = hVar.f25277b;
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1676319764);
        int i12 = (sVar.h(hVar) ? 4 : 2) | i11 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            o0 o0Var = o0.f26530a;
            boolean z11 = ((r) e0.f.f(o0Var, r.class, c1Var, o0Var)).f44340c;
            String str = ((r) a.a.Q(c1Var, Reflection.getOrCreateKotlinClass(r.class), o0Var)).f44341d;
            g gVar = (g) m3.i.n(hVar.f25280e, sVar, 0).getValue();
            if (gVar instanceof f) {
                sVar.a0(-1657027180);
                f fVar = (f) gVar;
                List list = fVar.f25274a;
                ArrayList arrayList = fVar.f25275b;
                boolean z12 = (i12 & 112) == 32;
                Object objM = sVar.M();
                if (z12 || objM == m3.m.f29332a) {
                    objM = new j5(22, function0);
                    sVar.k0(objM);
                }
                g(list, arrayList, z11, str, (Function0) objM, sVar, 0);
                sVar.q(false);
            } else if (Intrinsics.areEqual(gVar, e.f25273a)) {
                sVar.a0(-1656717552);
                k kVar = b4.d.f5687e;
                g0 g0Var = m2.f13850c;
                u0 u0VarD = p.d(kVar, false);
                int iHashCode = Long.hashCode(sVar.T);
                u3.i iVarL = sVar.l();
                t tVarC = b4.a.c(g0Var, sVar);
                j.R.getClass();
                b5.h hVar2 = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar2);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD, b5.i.f5843f, sVar);
                m3.i.C(iVarL, b5.i.f5842e, sVar);
                m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(sVar, b5.i.f5845h);
                m3.i.C(tVarC, b5.i.f5841d, sVar);
                cg.j.o(sVar, 0);
                sVar.q(true);
                sVar.q(false);
            } else {
                if (!Intrinsics.areEqual(gVar, d.f25272a)) {
                    throw e0.f.v(sVar, -330549893, false);
                }
                sVar.a0(-1656501079);
                Toast.makeText((Context) sVar.j(v0.f7390b), f0.U(sVar, R.string.item_view_error_on_load_store), 0).show();
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.i(hVar, function0, i11, 22);
        }
    }

    public static final void g(List list, ArrayList arrayList, boolean z11, String str, Function0 function0, n nVar, int i11) {
        list.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1556141486);
        int i12 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.h(arrayList) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.f(str) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function0) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((Product) obj).getChangelog() != null) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                ProductChangelog changelog = ((Product) obj2).getChangelog();
                if ((changelog != null ? changelog.getStatus() : null) != ProductStatus.REMOVED) {
                    arrayList3.add(obj2);
                }
            }
            q qVar = q.f5711a;
            t tVarF = d2.c.F(v1.n.j(m2.d(qVar, 1.0f), lv.s.J, i4.g0.f23254b));
            y yVarA = w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarF, sVar);
            j.R.getClass();
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
            Iterator it = arrayList3.iterator();
            long quantity = 0;
            while (it.hasNext()) {
                quantity += ((Product) it.next()).getQuantity();
            }
            cg.j.s(f0.T(R.string.charity_item_donation_inventory, new Object[]{Long.valueOf(quantity)}, sVar), null, 0L, 0L, function0, Integer.valueOf(R.string.charity_item_donation_inventory), null, null, sVar, i12 & 57344, 206);
            sVar = sVar;
            t tVarJ = d2.j(qVar, "ProductsTag");
            Iterator it2 = list.iterator();
            long quantity2 = 0;
            while (it2.hasNext()) {
                quantity2 += ((Product) it2.next()).getQuantity();
            }
            zz.f.a((int) quantity2, 6, 0, tVarJ, sVar);
            t tVarJ2 = d2.j(m2.f13850c, "CharityInventoryScroll");
            boolean zH = sVar.h(arrayList2) | ((i12 & 896) == 256) | ((i12 & 7168) == 2048) | sVar.h(arrayList) | sVar.h(arrayList3);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                w2 w2Var = new w2(arrayList2, z11, arrayList, arrayList3, str);
                sVar.k0(w2Var);
                objM = w2Var;
            }
            ox.h.c(tVarJ2, null, null, null, null, null, false, null, (Function1) objM, sVar, 6, 510);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bg.d(list, arrayList, z11, str, function0, i11);
        }
    }

    public static final void h(t tVar, ArrayList arrayList, String str, n nVar, int i11) {
        q qVar;
        float f11;
        s sVar = (s) nVar;
        sVar.c0(1690857828);
        int i12 = i11 | (sVar.h(arrayList) ? 32 : 16) | (sVar.f(str) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Product) obj).getChangelog() != null) {
                    arrayList2.add(obj);
                }
            }
            int size = arrayList2.size();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, HH:mm", Locale.getDefault());
            float f12 = 8;
            t tVarB = d2.c.B(d2.c.D(v1.n.j(m2.t(m2.d(tVar, 1.0f), 3), lv.s.f28222d0, l2.g.b(12)), 0.0f, 24, 0.0f, f12, 5), 16, 0.0f, 2);
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            y yVarA = w.a(dVar, iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarB, sVar);
            j.R.getClass();
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
            q qVar2 = q.f5711a;
            t tVarJ = d2.j(m2.d(qVar2, 1.0f), "InventoryUpdatesCount");
            String strG = f0.G(R.plurals.charity_inventory_update_title, size, new Object[]{Integer.valueOf(size)}, sVar);
            m5.u0 u0Var = v.f28275o;
            long j9 = lv.s.C;
            r9.d(strG, tVarJ, j9, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, u0Var, sVar, 432, 12607872, 110584);
            sVar = sVar;
            if (str == null) {
                sVar.a0(504980692);
                sVar.q(false);
                qVar = qVar2;
                f11 = 1.0f;
            } else {
                sVar.a0(504980693);
                t tVarJ2 = d2.j(d2.c.D(m2.d(qVar2, 1.0f), 0.0f, 4, 0.0f, 0.0f, 13), "InventoryUpdatesDate");
                String str2 = simpleDateFormat.format(Long.valueOf(p0.h(str)));
                str2.getClass();
                qVar = qVar2;
                f11 = 1.0f;
                r9.d(f0.T(R.string.charity_inventory_update_date, new Object[]{str2}, sVar), tVarJ2, j9, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, v.f28276p, sVar, 432, 12607872, 110584);
                sVar = sVar;
                sVar.q(false);
            }
            q qVar3 = qVar;
            t tVarT = m2.t(m2.d(d2.c.D(qVar3, 0.0f, f12, 0.0f, 0.0f, 13), f11), 3);
            y yVarA2 = w.a(dVar, iVar, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarT, sVar);
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
            sVar.a0(-1099011466);
            int i13 = 0;
            for (Object obj2 : arrayList) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    d0.n();
                    throw null;
                }
                d(d2.j(qVar3, "InventoryUpdatesChangelog"), (Product) obj2, sVar, 6);
                if (i13 < arrayList.size() - 1) {
                    sVar.a0(-1421340350);
                    s0.g(d2.j(qVar3, "InventoryUpdatesDivider"), 1, lv.s.H, sVar, 438, 0);
                    sVar.q(false);
                } else {
                    sVar.a0(-1421071270);
                    sVar.q(false);
                }
                i13 = i14;
            }
            e0.f.D(sVar, false, true, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(tVar, arrayList, str, i11, 27);
        }
    }
}
