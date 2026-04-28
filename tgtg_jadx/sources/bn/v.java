package bn;

import android.content.Context;
import b0.f3;
import b0.x1;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.impact.moneysaved.MoneySavedActivity;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.item.response.AllergensInfo;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.mapService.response.FilterCategory;
import com.app.tgtg.model.remote.mapService.response.FilterChipOption;
import com.app.tgtg.model.remote.mapService.response.FilterDiet;
import com.app.tgtg.model.remote.mapService.response.MapFilters;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import com.app.tgtg.model.remote.user.response.MoneySavedResponse;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import d2.b2;
import d2.h2;
import d2.i2;
import d2.k2;
import d2.m2;
import d2.n1;
import d2.w0;
import d2.w2;
import d2.z1;
import g3.d9;
import g3.j3;
import g3.j5;
import g3.q4;
import g3.r9;
import g3.s0;
import g3.w6;
import g3.z4;
import i4.q0;
import i4.r0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt__StringsKt;
import m2.c1;
import m2.d1;
import m3.b1;
import m3.h1;
import m5.u0;
import mv.p0;
import o00.x0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import y00.i4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6524f;

    public /* synthetic */ v(jh.c cVar, v80.b0 b0Var, w6 w6Var, Function0 function0, String str) {
        this.f6519a = 5;
        this.f6520b = cVar;
        this.f6522d = b0Var;
        this.f6523e = w6Var;
        this.f6524f = function0;
        this.f6521c = str;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        jh.c cVar = (jh.c) this.f6520b;
        v80.b0 b0Var = (v80.b0) this.f6522d;
        w6 w6Var = (w6) this.f6523e;
        Function0 function0 = (Function0) this.f6524f;
        String str = (String) this.f6521c;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        b4.i iVar = b4.d.f5695n;
        ((d2.z) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarR = v1.n.r(d2.c.D(m2.t(m2.d(qVar, 1.0f), 3), o30.e0.s(sVar, R.dimen.spacing_3), 0.0f, o30.e0.s(sVar, R.dimen.spacing_3), o30.e0.s(sVar, R.dimen.bottom_nav_view_height), 2), v1.n.q(sVar), true);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarR, sVar);
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
            v1.n.d(x0.z(R.drawable.gfx_badges_info_bottomsheet_header, sVar, 0), null, new w0(iVar), null, z4.l.f47166a, 0.0f, null, sVar, 24632, 104);
            sVar.a0(2144151259);
            Iterator it = StringsKt__StringsKt.split$default(o30.f0.U(sVar, R.string.badges_info_bottomsheet_header), new String[]{"\n"}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                r9.d((String) it.next(), new w0(iVar), lv.s.f28217b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28267f, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            }
            sVar.q(false);
            b4.t tVarD = d2.c.D(m2.t(m2.d(qVar, 1.0f), 3), 0.0f, o30.e0.s(sVar, R.dimen.spacing_3), 0.0f, 0.0f, 13);
            d2.b bVar = d2.i.f13801a;
            b4.j jVar = b4.d.f5692j;
            i2 i2VarA = h2.a(bVar, jVar, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarD, sVar);
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
            m3.i.C(iVarL2, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode2);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC2, gVar4, sVar);
            b4.t tVarD2 = d2.c.D(qVar, 0.0f, 0.0f, o30.e0.s(sVar, R.dimen.spacing_2), 0.0f, 11);
            b4.j jVar2 = b4.d.f5693k;
            v1.n.d(x0.z(R.drawable.gfx_badges_info_bottomsheet_body_1, sVar, 0), null, b3.i.g(jVar2, tVarD2), null, null, 0.0f, null, sVar, 56, 120);
            w2 w2Var = new w2(jVar2);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format(o30.f0.U(sVar, R.string.badges_info_bottomsheet_body_1), Arrays.copyOf(new Object[]{str}, 1));
            u0 u0Var = lv.v.f28274n;
            long j9 = lv.s.C;
            r9.d(str2, w2Var, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(u0Var, j9, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar, 0, 0, 131068);
            sVar.q(true);
            b4.t tVarD3 = d2.c.D(m2.t(m2.d(qVar, 1.0f), 3), 0.0f, o30.e0.s(sVar, R.dimen.spacing_2), 0.0f, 0.0f, 13);
            i2 i2VarA2 = h2.a(bVar, jVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarD3, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            v1.n.d(x0.z(R.drawable.gfx_badges_info_bottomsheet_body_2, sVar, 0), null, b3.i.g(jVar2, d2.c.D(qVar, 0.0f, 0.0f, o30.e0.s(sVar, R.dimen.spacing_2), 0.0f, 11)), null, null, 0.0f, null, sVar, 56, 120);
            r9.d(o30.f0.U(sVar, R.string.badges_info_bottomsheet_body_2), new w2(jVar2), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(u0Var, j9, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar, 0, 0, 131068);
            sVar.q(true);
            if (cVar == jh.c.DISCOVER) {
                sVar.a0(2046709749);
                b4.t tVarB = d2.c.B(m2.d(qVar, 1.0f), 0.0f, o30.e0.s(sVar, R.dimen.spacing_3), 1);
                b2 b2Var = g3.p.f19254b;
                g3.o oVarA = g3.p.a(lv.s.f28217b, 0L, 0L, 0L, sVar, 14);
                boolean zH = sVar.h(b0Var) | sVar.f(w6Var) | sVar.f(function0);
                Object objM = sVar.M();
                if (zH || objM == m3.m.f29332a) {
                    objM = new j3(b0Var, w6Var, function0, 2);
                    sVar.k0(objM);
                }
                s0.a((Function0) objM, tVarB, false, null, oVarA, null, null, b2Var, null, jh.f.f25260a, sVar, 805306368, 364);
                sVar.q(false);
            } else {
                sVar.a0(2047733648);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        h1 h1Var = (h1) this.f6520b;
        h1 h1Var2 = (h1) this.f6521c;
        Function1 function1 = (Function1) this.f6522d;
        LoyaltyCardDetails loyaltyCardDetails = (LoyaltyCardDetails) this.f6523e;
        Function0 function0 = (Function0) this.f6524f;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b4.k kVar = b4.d.f5683a;
            z4.u0 u0VarD = d2.p.d(kVar, false);
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
            b4.t tVarA = b4.a.a(v1.n.i(v1.n.j(m2.t(m2.d(qVar, 1.0f), 3), lv.s.A, i4.g0.f23254b), new q0(kotlin.collections.d0.h(new i4.v(lv.s.Z), new i4.v(lv.s.Y)), (((long) Float.floatToRawIntBits((float) (((double) h1Var.h()) * 0.35d))) << 32) | (((long) Float.floatToRawIntBits((float) (((double) h1Var2.h()) * 0.7d))) & 4294967295L), Float.POSITIVE_INFINITY), 0.0f, 6), c5.m2.f7291a, new c0(7, function1, loyaltyCardDetails));
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new hb0.o(18, h1Var, h1Var2);
                sVar.k0(objM);
            }
            b4.t tVarO = z4.c0.o(tVarA, (Function1) objM);
            d2.d dVar2 = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar2, iVar, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarO, sVar);
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
            b4.t tVarD = m2.d(qVar, 1.0f);
            float f11 = lv.t.f28254h;
            float f12 = lv.t.f28253g;
            b4.t tVarC3 = d2.c.C(tVarD, f11, f11, f11, f12);
            d2.y yVarA2 = d2.w.a(dVar2, iVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC4 = b4.a.c(tVarC3, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC4, gVar4, sVar);
            b4.t tVarD2 = m2.d(qVar, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            b4.t tVarC5 = b4.a.c(tVarD2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            w.a0.y(iHashCode4, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC5, gVar4, sVar);
            cg.j.n(qVar, o30.f0.U(sVar, R.string.discover_loyalty_card_tag), o30.f0.U(sVar, R.string.discover_loyalty_card_tag_voice_over), 0L, 0L, sVar, 6, 24);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(new n1(1.0f, true), sVar);
            v1.n.d(x0.z(R.drawable.ic_close24, sVar, 0), o30.f0.U(sVar, R.string.discover_loyalty_card_cross_voice_over), androidx.compose.foundation.b.c(m2.m(qVar, 24), false, null, new j5.j(0), function0, 11), null, null, 0.0f, null, sVar, 8, 120);
            sVar.q(true);
            d2.c.f(m2.e(qVar, lv.t.f28252f), sVar);
            String strU = o30.f0.U(sVar, R.string.discover_loyalty_card_promo_header_voice_over);
            boolean zF = sVar.f(strU);
            Object objM2 = sVar.M();
            if (zF || objM2 == fVar) {
                objM2 = new gt.e(strU, 10);
                sVar.k0(objM2);
            }
            b4.t tVarC6 = j5.r.c(qVar, false, (Function1) objM2);
            String strU2 = o30.f0.U(sVar, R.string.discover_loyalty_card_promo_header);
            u0 u0Var = lv.v.f28263b;
            long j9 = lv.s.C;
            r9.d(strU2, tVarC6, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            d2.c.f(m2.e(qVar, lv.t.f28251e), sVar);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(o30.f0.U(sVar, R.string.discover_loyalty_card_promo_body_voice_over), Arrays.copyOf(new Object[]{loyaltyCardDetails != null ? Integer.valueOf(loyaltyCardDetails.getMaxPoints()) : null, mv.d.i(loyaltyCardDetails != null ? loyaltyCardDetails.getVoucherValue() : null, 1)}, 2));
            boolean zF2 = sVar.f(str);
            Object objM3 = sVar.M();
            if (zF2 || objM3 == fVar) {
                objM3 = new gt.e(str, 11);
                sVar.k0(objM3);
            }
            r9.d(String.format(o30.f0.U(sVar, R.string.discover_loyalty_card_promo_body), Arrays.copyOf(new Object[]{loyaltyCardDetails != null ? Integer.valueOf(loyaltyCardDetails.getMaxPoints()) : null, mv.d.i(loyaltyCardDetails != null ? loyaltyCardDetails.getVoucherValue() : null, 1)}, 2)), j5.r.c(qVar, false, (Function1) objM3), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar.q(true);
            v1.n.d(x0.z(R.drawable.gfx_lc_promo, sVar, 0), null, d2.c.D(b3.i.f(iVar, m2.d(qVar, 1.0f)), 0.0f, 0.0f, f11, 0.0f, 11), null, null, 0.0f, null, sVar, 56, 120);
            b4.t tVarD3 = d2.c.D(m2.t(m2.d(qVar, 1.0f), 3), 0.0f, 0.0f, f12, f12, 3);
            z4.u0 u0VarD2 = d2.p.d(kVar, false);
            int iHashCode5 = Long.hashCode(sVar.T);
            u3.i iVarL5 = sVar.l();
            b4.t tVarC7 = b4.a.c(tVarD3, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL5, gVar2, sVar);
            w.a0.y(iHashCode5, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC7, gVar4, sVar);
            v1.n.d(x0.z(R.drawable.ic_arrow_back, sVar, 0), null, d2.u.f13938a.a(f4.g.i(m2.m(qVar, 25), 180.0f), b4.d.f5691i), null, null, 0.0f, new i4.o(lv.s.f28217b, 5), sVar, 1572920, 56);
            e0.f.D(sVar, true, true, true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        b1 b1Var = (b1) this.f6520b;
        b1 b1Var2 = (b1) this.f6521c;
        Function2 function2 = (Function2) this.f6522d;
        Function0 function0 = (Function0) this.f6523e;
        g4.l lVar = (g4.l) this.f6524f;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(qVar, 1.0f);
            float f11 = lv.t.f28253g;
            b4.t tVarA = s1.b0.a(d2.c.B(tVarD, f11, 0.0f, 2), null, 3);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
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
            v1.n.d(x0.z(R.drawable.ic_close24, sVar, 0), "CloseButton", b3.i.f(b4.d.f5696o, b4.a.a(d2.c.B(qVar, 0.0f, lv.t.f28255i, 1), c5.m2.f7291a, new bm.f(23, function0))), null, null, 0.0f, null, sVar, 56, 120);
            b4.t tVarD2 = m2.d(qVar, 1.0f);
            String strU = o30.f0.U(sVar, R.string.charity_notifications_settings_phone_title);
            u0 u0Var = lv.v.f28270i;
            long j9 = lv.s.C;
            r9.d(strU, tVarD2, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 432, 12582912, 131064);
            b4.t tVarD3 = m2.d(qVar, 1.0f);
            float f12 = lv.t.f28251e;
            b4.t tVarD4 = d2.c.D(tVarD3, 0.0f, f12, 0.0f, 0.0f, 13);
            String strU2 = o30.f0.U(sVar, R.string.charity_notifications_settings_phone_body);
            u0 u0Var2 = lv.v.f28274n;
            r9.d(strU2, tVarD4, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 432, 12582912, 131064);
            b4.t tVarB = d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), 0.0f, lv.t.f28254h, 1);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarB, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            String str = (String) b1Var.getValue();
            i4 i4Var = new i4(2);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            u0 u0VarA = u0.a(u0Var2, 0L, b0.a0.C(16), null, null, 0L, null, 0, 0L, null, null, 16777213);
            q4 q4Var = q4.f19349a;
            long j11 = lv.s.G;
            long j12 = lv.s.F;
            long j13 = lv.s.f28231k;
            d9 d9VarD = q4.d(0L, j11, j12, j12, j13, 0L, 0L, sVar, 2147452927);
            float f13 = 8;
            l2.f fVarB = l2.g.b(f13);
            d1 d1Var = new d1(4, 6, 115);
            boolean zH = sVar.h(lVar);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                objM = new li.h(lVar, 0);
                sVar.k0(objM);
            }
            Function1 function1 = (Function1) objM;
            c1 c1Var = new c1(function1, function1, function1, function1, function1, function1);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new li.c(b1Var, 3);
                sVar.k0(objM2);
            }
            z4.a(str, (Function1) objM2, n1Var, false, false, u0VarA, null, null, null, null, false, i4Var, d1Var, c1Var, false, 1, 0, fVarB, d9VarD, sVar, 48, 100859904, 1720280);
            String str2 = (String) b1Var2.getValue();
            if (3.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            b4.t tVarD5 = d2.c.D(new n1(3.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 3.0f, true), f12, 0.0f, 0.0f, 0.0f, 14);
            u0 u0VarA2 = u0.a(u0Var2, 0L, b0.a0.C(16), null, null, 0L, null, 0, 0L, null, null, 16777213);
            d9 d9VarD2 = q4.d(0L, j11, j12, j12, j13, 0L, 0L, sVar, 2147452927);
            l2.f fVarB2 = l2.g.b(f13);
            d1 d1Var2 = new d1(3, 7, 115);
            boolean zH2 = sVar.h(lVar);
            Object objM3 = sVar.M();
            if (zH2 || objM3 == fVar) {
                objM3 = new li.h(lVar, 1);
                sVar.k0(objM3);
            }
            Function1 function12 = (Function1) objM3;
            c1 c1Var2 = new c1(function12, function12, function12, function12, function12, function12);
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = new li.c(b1Var2, 4);
                sVar.k0(objM4);
            }
            z4.a(str2, (Function1) objM4, tVarD5, false, false, u0VarA2, null, li.a.f27842d, null, null, false, null, d1Var2, c1Var2, false, 1, 0, fVarB2, d9VarD2, sVar, 12582960, 100859904, 1736536);
            m3.s sVar2 = sVar;
            sVar2.q(true);
            if (((CharSequence) b1Var.getValue()).length() <= 0 || ((CharSequence) b1Var2.getValue()).length() <= 0) {
                sVar2.a0(750289346);
                sVar2.q(false);
            } else {
                sVar2.a0(749900141);
                b4.t tVarD6 = d2.c.D(m2.d(qVar, 1.0f), 0.0f, 0.0f, 0.0f, f11, 7);
                String strU3 = o30.f0.U(sVar2, R.string.charity_notifications_settings_save);
                boolean zF = sVar2.f(function2) | sVar2.f(function0);
                Object objM5 = sVar2.M();
                if (zF || objM5 == fVar) {
                    objM5 = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c(11, function2, b1Var, b1Var2, function0);
                    sVar2.k0(objM5);
                }
                v0.n.l(tVarD6, strU3, null, null, null, false, false, null, null, (Function0) objM5, sVar2, 6, 508);
                sVar2 = sVar2;
                sVar2.q(false);
            }
            sVar2.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        float f11;
        h1 h1Var;
        h1 h1Var2;
        Function0 function0 = (Function0) this.f6520b;
        Function1 function1 = (Function1) this.f6521c;
        h1 h1Var3 = (h1) this.f6522d;
        h1 h1Var4 = (h1) this.f6523e;
        h1 h1Var5 = (h1) this.f6524f;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarT, sVar);
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
            v1.n.d(x0.z(R.drawable.system_icon_close_neutral_10, sVar, 0), o30.f0.U(sVar, R.string.profile_avatar_picker_voice_over_close), b4.a.a(d2.u.f13938a.a(d2.c.z(qVar, o30.e0.s(sVar, R.dimen.spacing_2)), b4.d.f5685c), c5.m2.f7291a, new on.l(0, function0)), null, null, 0.0f, null, sVar, 8, 120);
            b4.t tVarZ = d2.c.z(m2.t(m2.d(qVar, 1.0f), 3), o30.e0.s(sVar, R.dimen.spacing_3));
            d2.d dVar2 = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar2, iVar, sVar, 0);
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
            b4.t tVarD = m2.d(qVar, 1.0f);
            String strU = o30.f0.U(sVar, R.string.profile_page_avatar_picker_header);
            u0 u0Var = lv.v.f28272k;
            long j9 = lv.s.J;
            r9.d(strU, tVarD, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(u0Var, j9, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar, 48, 0, 131068);
            d2.c.f(m2.m(qVar, o30.e0.s(sVar, R.dimen.spacing_3)), sVar);
            w0 w0Var = new w0(b4.d.f5695n);
            kn.c cVar = new kn.c(h1Var3.h(), h1Var4.h(), h1Var5.h());
            float f12 = 64;
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                f11 = f12;
                objM = new n90.p(21);
                sVar.k0(objM);
            } else {
                f11 = f12;
            }
            on.g.a(w0Var, cVar, false, null, f11, (Function0) objM, sVar, 221184, 12);
            d2.c.f(m2.m(qVar, o30.e0.s(sVar, R.dimen.spacing_3)), sVar);
            b4.t tVarB = d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), o30.e0.s(sVar, R.dimen.spacing_4), 0.0f, 2);
            d2.y yVarA2 = d2.w.a(dVar2, iVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarB, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            on.d.f(R.string.profile_page_avatar_picker_style_header, sVar, 0);
            d2.c.f(m2.m(qVar, o30.e0.s(sVar, R.dimen.spacing_2)), sVar);
            int iH = h1Var3.h();
            int iH2 = h1Var5.h();
            int iH3 = h1Var4.h();
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new co.t(h1Var4, 9);
                sVar.k0(objM2);
            }
            on.d.d(iH, iH2, iH3, (Function1) objM2, sVar, 3072);
            d2.c.f(m2.m(qVar, o30.e0.s(sVar, R.dimen.spacing_3)), sVar);
            on.d.f(R.string.profile_page_avatar_picker_color_header, sVar, 0);
            d2.c.f(m2.m(qVar, o30.e0.s(sVar, R.dimen.spacing_2)), sVar);
            int iH4 = h1Var3.h();
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                h1Var = h1Var5;
                h1Var2 = h1Var3;
                objM3 = new kq.c(20, h1Var2, h1Var);
                sVar.k0(objM3);
            } else {
                h1Var = h1Var5;
                h1Var2 = h1Var3;
            }
            on.d.b(iH4, (Function2) objM3, sVar, 48);
            sVar.q(true);
            d2.c.f(m2.m(qVar, o30.e0.s(sVar, R.dimen.spacing_3)), sVar);
            b4.t tVarD2 = m2.d(qVar, 1.0f);
            b2 b2Var = g3.p.f19254b;
            g3.o oVarA = g3.p.a(j9, 0L, 0L, 0L, sVar, 14);
            boolean zF = sVar.f(function1) | sVar.f(function0);
            Object objM4 = sVar.M();
            if (zF || objM4 == fVar) {
                cg.d dVar3 = new cg.d(function0, function1, h1Var2, h1Var4, h1Var);
                sVar.k0(dVar3);
                objM4 = dVar3;
            }
            s0.a((Function0) objM4, tVarD2, false, null, oVarA, null, null, b2Var, null, on.d.f32694a, sVar, 805306416, 364);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        BasicItem basicItem = (BasicItem) this.f6520b;
        v80.b0 b0Var = (v80.b0) this.f6521c;
        w6 w6Var = (w6) this.f6522d;
        Function0 function0 = (Function0) this.f6523e;
        Function1 function1 = (Function1) this.f6524f;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarB = d2.c.B(qVar, 16, 0.0f, 2);
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
            float f11 = lv.t.f28254h;
            d2.c.f(m2.m(qVar, f11), sVar);
            boolean zH = sVar.h(b0Var) | sVar.f(w6Var) | sVar.f(function0) | sVar.f(function1);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                x1 x1Var = new x1(21, b0Var, function1, w6Var, function0);
                sVar.k0(x1Var);
                objM = x1Var;
            }
            oo.a.H(null, basicItem, (Function1) objM, sVar, 0);
            String strF = r8.k.f(f11, R.string.order_recommendation_cta_dismiss, qVar, sVar, sVar);
            boolean zH2 = sVar.h(b0Var) | sVar.f(w6Var) | sVar.f(function0);
            Object objM2 = sVar.M();
            if (zH2 || objM2 == fVar) {
                objM2 = new j3(b0Var, w6Var, function0, 8);
                sVar.k0(objM2);
            }
            v0.n.o(qVar, strF, null, null, null, false, (Function0) objM2, sVar, 6, 0, 1020);
            b3.i.y(qVar, f11, sVar, true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        f2.c0 c0Var = (f2.c0) this.f6520b;
        List list = (List) this.f6521c;
        nk.q0 q0Var = (nk.q0) this.f6522d;
        m1.a aVar = (m1.a) this.f6523e;
        rk.d dVar = (rk.d) this.f6524f;
        z1 z1Var = (z1) obj;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        z1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((m3.s) nVar).f(z1Var) ? 4 : 2;
        }
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            b4.t tVarThen = v1.n.j(b4.q.f5711a, lv.s.J, i4.g0.f23254b).then(m2.f13850c);
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarThen, sVar);
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
            b2 b2VarE = d2.c.e(0.0f, 0.0f, 0.0f, z1Var.a() + lv.t.f28253g, 7);
            boolean zH = sVar.h(list);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new f3(list, 3);
                sVar.k0(objM);
            }
            ox.h.c(null, c0Var, b2VarE, null, null, null, false, null, (Function1) objM, sVar, 0, 505);
            rk.e.A(q0Var, aVar, dVar, sVar, 0);
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11;
        float f11;
        int i12;
        b4.q qVar;
        d2.b bVar;
        b5.g gVar;
        b5.g gVar2;
        boolean z11;
        int i13;
        int i14;
        int i15 = this.f6519a;
        d2.u uVar = d2.u.f13938a;
        b4.q qVar2 = b4.q.f5711a;
        m3.f fVar = m3.m.f29332a;
        Object obj4 = this.f6524f;
        Object obj5 = this.f6523e;
        Object obj6 = this.f6522d;
        Object obj7 = this.f6521c;
        Object obj8 = this.f6520b;
        switch (i15) {
            case 0:
                BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) obj8;
                String str = (String) obj7;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC = b4.a.c(qVar2, sVar);
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
                    lx.u.e(baseItemMnuV2, sVar, 0);
                    lx.u.f(baseItemMnuV2, sVar, 0);
                    d2.c.f(m2.e(qVar2, lv.t.f28252f), sVar);
                    ex.i.h(m2.d(m2.e(qVar2, 2), 1.0f), lv.s.H, sVar, 54);
                    d2.c.f(m2.e(qVar2, lv.t.f28249c), sVar);
                    lx.u.l(baseItemMnuV2, str, str2, str3, str4, sVar, 0);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                Integer num = (Integer) obj8;
                Integer num2 = (Integer) obj7;
                Function0 function0 = (Function0) obj6;
                u0 u0Var = (u0) obj5;
                u0 u0Var2 = (u0) obj4;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    b4.q qVar3 = b4.q.f5711a;
                    b4.t tVarD = m2.d(qVar3, 1.0f);
                    z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    u3.i iVarL2 = sVar2.l();
                    b4.t tVarC2 = b4.a.c(tVarD, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar2);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar2);
                    m3.i.v(sVar2, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    m3.i.z(sVar2, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar2);
                    if (num2 == null) {
                        sVar2.a0(-548949498);
                        i12 = 0;
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-548949497);
                        String strU = o30.f0.U(sVar2, num2.intValue());
                        if (num != null) {
                            f11 = 32;
                            i11 = 16;
                        } else {
                            i11 = 16;
                            f11 = 16;
                        }
                        float f12 = 24;
                        r9.d(strU, uVar.a(d2.c.C(qVar3, f12, f11, f12, num != null ? 8 : i11), b4.d.f5687e), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar2, MLKEMEngine.KyberPolyBytes, 0, 130040);
                        i12 = 0;
                        sVar2.q(false);
                    }
                    sVar2.a0(-548160485);
                    n4.b bVarZ = x0.z(R.drawable.system_icon_close_neutral_80, sVar2, i12);
                    b4.t tVarA = uVar.a(d2.c.z(qVar3, 16), b4.d.f5685c);
                    boolean zF = sVar2.f(function0);
                    Object objM = sVar2.M();
                    if (zF || objM == fVar) {
                        objM = new ar.d(11, function0);
                        sVar2.k0(objM);
                    }
                    v1.n.d(bVarZ, null, androidx.compose.foundation.b.c(tVarA, false, null, null, (Function0) objM, 15), null, null, 0.0f, null, sVar2, 56, 120);
                    sVar2.q(false);
                    sVar2.q(true);
                    if (num == null) {
                        sVar2.a0(-1303171006);
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-1303171005);
                        float f13 = 24;
                        r9.d(o30.f0.U(sVar2, num.intValue()), d2.c.D(qVar3, f13, 0.0f, f13, f13, 2), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar2, 432, 0, 131064);
                        sVar2.q(false);
                    }
                    d2.c.f(m2.m(qVar3, 16), sVar2);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                Function0 function02 = (Function0) obj8;
                Function0 function03 = (Function0) obj7;
                e.n nVar3 = (e.n) obj6;
                Context context = (Context) obj5;
                Function0 function04 = (Function0) obj4;
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar3 = (m3.s) nVar4;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    long j9 = lv.s.J;
                    b4.q qVar4 = b4.q.f5711a;
                    r0 r0Var = i4.g0.f23254b;
                    b4.t tVarJ = v1.n.j(qVar4, j9, r0Var);
                    d2.y yVarA2 = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar3, 0);
                    int iHashCode3 = Long.hashCode(sVar3.T);
                    u3.i iVarL3 = sVar3.l();
                    b4.t tVarC3 = b4.a.c(tVarJ, sVar3);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar3);
                    } else {
                        sVar3.n0();
                    }
                    b5.g gVar3 = b5.i.f5843f;
                    m3.i.C(yVarA2, gVar3, sVar3);
                    b5.g gVar4 = b5.i.f5842e;
                    m3.i.C(iVarL3, gVar4, sVar3);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    b5.g gVar5 = b5.i.f5844g;
                    m3.i.v(sVar3, numValueOf, gVar5);
                    b5.d dVar = b5.i.f5845h;
                    m3.i.z(sVar3, dVar);
                    b5.g gVar6 = b5.i.f5841d;
                    m3.i.C(tVarC3, gVar6, sVar3);
                    boolean zF2 = sVar3.f(function02) | sVar3.f(function03);
                    Object objM2 = sVar3.M();
                    if (zF2 || objM2 == fVar) {
                        objM2 = new cp.m(function02, function03, 0);
                        sVar3.k0(objM2);
                    }
                    b4.t tVarC4 = androidx.compose.foundation.b.c(qVar4, false, null, null, (Function0) objM2, 15);
                    float f14 = lv.t.f28252f;
                    b4.t tVarB = d2.c.B(tVarC4, 0.0f, f14, 1);
                    b4.j jVar = b4.d.f5693k;
                    d2.b bVar2 = d2.i.f13801a;
                    i2 i2VarA = h2.a(bVar2, jVar, sVar3, 48);
                    int iHashCode4 = Long.hashCode(sVar3.T);
                    u3.i iVarL4 = sVar3.l();
                    b4.t tVarC5 = b4.a.c(tVarB, sVar3);
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar3);
                    } else {
                        sVar3.n0();
                    }
                    m3.i.C(i2VarA, gVar3, sVar3);
                    m3.i.C(iVarL4, gVar4, sVar3);
                    w.a0.y(iHashCode4, sVar3, gVar5, sVar3, dVar);
                    m3.i.C(tVarC5, gVar6, sVar3);
                    k2 k2Var = k2.f13824a;
                    b4.t tVarA2 = k2Var.a(0.5f, qVar4, true);
                    float f15 = lv.t.f28253g;
                    b4.t tVarD2 = d2.c.D(tVarA2, f15, 0.0f, 0.0f, 0.0f, 14);
                    String strU2 = o30.f0.U(sVar3, R.string.rating_source_selector_gallery);
                    u0 u0Var3 = lv.v.f28274n;
                    r9.d(strU2, tVarD2, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var3, sVar3, 0, 12582912, 131068);
                    v1.n.d(x0.z(R.drawable.icon_gallery, sVar3, 0), "", d2.c.D(k2Var.a(0.1f, qVar4, true), 0.0f, 0.0f, f15, 0.0f, 11), null, null, 0.0f, null, sVar3, 56, 120);
                    sVar3.q(true);
                    d2.c.f(v1.n.j(m2.d(m2.e(qVar4, (float) 0.5d), 1.0f), lv.s.F, r0Var), sVar3);
                    boolean zH = sVar3.h(nVar3) | sVar3.h(context) | sVar3.f(function04) | sVar3.f(function03);
                    Object objM3 = sVar3.M();
                    if (zH || objM3 == fVar) {
                        qVar = qVar4;
                        bVar = bVar2;
                        gVar = gVar6;
                        gVar2 = gVar5;
                        androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c cVar = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c(4, nVar3, context, function04, function03);
                        sVar3.k0(cVar);
                        objM3 = cVar;
                    } else {
                        gVar2 = gVar5;
                        qVar = qVar4;
                        gVar = gVar6;
                        bVar = bVar2;
                    }
                    b4.q qVar5 = qVar;
                    b4.t tVarB2 = d2.c.B(androidx.compose.foundation.b.c(qVar, false, null, null, (Function0) objM3, 15), 0.0f, f14, 1);
                    i2 i2VarA2 = h2.a(bVar, jVar, sVar3, 48);
                    int iHashCode5 = Long.hashCode(sVar3.T);
                    u3.i iVarL5 = sVar3.l();
                    b4.t tVarC6 = b4.a.c(tVarB2, sVar3);
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar3);
                    } else {
                        sVar3.n0();
                    }
                    m3.i.C(i2VarA2, gVar3, sVar3);
                    m3.i.C(iVarL5, gVar4, sVar3);
                    w.a0.y(iHashCode5, sVar3, gVar2, sVar3, dVar);
                    m3.i.C(tVarC6, gVar, sVar3);
                    r9.d(o30.f0.U(sVar3, R.string.rating_source_selector_camera), d2.c.D(k2Var.a(0.5f, qVar5, true), f15, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var3, sVar3, 0, 12582912, 131068);
                    v1.n.d(x0.z(R.drawable.icon_take_picture, sVar3, 0), "", d2.c.D(k2Var.a(0.1f, qVar5, true), 0.0f, 0.0f, f15, 0.0f, 11), null, null, 0.0f, null, sVar3, 56, 120);
                    sVar3.q(true);
                    sVar3.q(true);
                } else {
                    sVar3.U();
                }
                break;
            case 3:
                x60.m mVar = (x60.m) obj8;
                x60.l lVar = (x60.l) obj7;
                float f16 = lVar.f43990b;
                BasicVoucher basicVoucher = (BasicVoucher) obj6;
                x60.j jVar2 = (x60.j) obj5;
                x60.h hVar4 = (x60.h) obj4;
                m3.n nVar5 = (m3.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar4 = (m3.s) nVar5;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    b4.t tVarZ = d2.c.z(qVar2, mVar.f44014j);
                    d2.d dVar2 = d2.i.f13803c;
                    b4.i iVar = b4.d.f5694m;
                    d2.y yVarA3 = d2.w.a(dVar2, iVar, sVar4, 0);
                    int iHashCode6 = Long.hashCode(sVar4.T);
                    u3.i iVarL6 = sVar4.l();
                    b4.t tVarC7 = b4.a.c(tVarZ, sVar4);
                    b5.j.R.getClass();
                    b5.h hVar5 = b5.i.f5839b;
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(hVar5);
                    } else {
                        sVar4.n0();
                    }
                    b5.g gVar7 = b5.i.f5843f;
                    m3.i.C(yVarA3, gVar7, sVar4);
                    b5.g gVar8 = b5.i.f5842e;
                    m3.i.C(iVarL6, gVar8, sVar4);
                    Integer numValueOf2 = Integer.valueOf(iHashCode6);
                    b5.g gVar9 = b5.i.f5844g;
                    m3.i.v(sVar4, numValueOf2, gVar9);
                    b5.d dVar3 = b5.i.f5845h;
                    m3.i.z(sVar4, dVar3);
                    b5.g gVar10 = b5.i.f5841d;
                    m3.i.C(tVarC7, gVar10, sVar4);
                    float f17 = lVar.f43993e;
                    b4.t tVarB3 = m2.b(qVar2, 0.0f, f16, 1);
                    d2.y yVarA4 = d2.w.a(dVar2, iVar, sVar4, 0);
                    int iHashCode7 = Long.hashCode(sVar4.T);
                    u3.i iVarL7 = sVar4.l();
                    b4.t tVarC8 = b4.a.c(tVarB3, sVar4);
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(hVar5);
                    } else {
                        sVar4.n0();
                    }
                    m3.i.C(yVarA4, gVar7, sVar4);
                    m3.i.C(iVarL7, gVar8, sVar4);
                    w.a0.y(iHashCode7, sVar4, gVar9, sVar4, dVar3);
                    m3.i.C(tVarC8, gVar10, sVar4);
                    b4.j jVar3 = b4.d.f5692j;
                    b4.t tVarG = m2.g(qVar2, f17, 0.0f, 2);
                    d2.b bVar3 = d2.i.f13801a;
                    i2 i2VarA3 = h2.a(bVar3, jVar3, sVar4, 48);
                    int iHashCode8 = Long.hashCode(sVar4.T);
                    u3.i iVarL8 = sVar4.l();
                    b4.t tVarC9 = b4.a.c(tVarG, sVar4);
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(hVar5);
                    } else {
                        sVar4.n0();
                    }
                    m3.i.C(i2VarA3, gVar7, sVar4);
                    m3.i.C(iVarL8, gVar8, sVar4);
                    w.a0.y(iHashCode8, sVar4, gVar9, sVar4, dVar3);
                    m3.i.C(tVarC9, gVar10, sVar4);
                    ig.b.e(basicVoucher, sVar4, 0);
                    if (1.0f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    d2.c.f(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), sVar4);
                    ig.b.f(basicVoucher, sVar4, 0);
                    sVar4.q(true);
                    ig.b.a(basicVoucher, sVar4, 0);
                    sVar4.q(true);
                    r9.d(basicVoucher.getName(), d2.c.B(m2.b(qVar2, 0.0f, f16, 1), 0.0f, mVar.f44017n, 1), hVar4.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar2.f43957f, sVar4, 0, 0, 131064);
                    b4.j jVar4 = b4.d.l;
                    b4.t tVarG2 = m2.g(qVar2, f17, 0.0f, 2);
                    i2 i2VarA4 = h2.a(bVar3, jVar4, sVar4, 48);
                    int iHashCode9 = Long.hashCode(sVar4.T);
                    u3.i iVarL9 = sVar4.l();
                    b4.t tVarC10 = b4.a.c(tVarG2, sVar4);
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(hVar5);
                    } else {
                        sVar4.n0();
                    }
                    m3.i.C(i2VarA4, gVar7, sVar4);
                    m3.i.C(iVarL9, gVar8, sVar4);
                    w.a0.y(iHashCode9, sVar4, gVar9, sVar4, dVar3);
                    m3.i.C(tVarC10, gVar10, sVar4);
                    a.a.a(basicVoucher, sVar4, 0);
                    if (1.0f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    d2.c.f(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), sVar4);
                    r9.d(o30.f0.T(R.string.voucher_discount_valid_until, new Object[]{p0.n(basicVoucher.getValidToUtc())}, sVar4), null, hVar4.K, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar2.f43960i, sVar4, 0, 0, 131066);
                    sVar4.q(true);
                    sVar4.q(true);
                } else {
                    sVar4.U();
                }
                break;
            case 4:
                Function0 function05 = (Function0) obj8;
                Order order = (Order) obj7;
                DiscoverBucket discoverBucket = (DiscoverBucket) obj6;
                h1 h1Var = (h1) obj5;
                Function1 function1 = (Function1) obj4;
                m3.n nVar6 = (m3.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar5 = (m3.s) nVar6;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    z4.u0 u0VarD2 = d2.p.d(b4.d.f5683a, false);
                    int iHashCode10 = Long.hashCode(sVar5.T);
                    u3.i iVarL10 = sVar5.l();
                    b4.t tVarC11 = b4.a.c(qVar2, sVar5);
                    b5.j.R.getClass();
                    b5.h hVar6 = b5.i.f5839b;
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(hVar6);
                    } else {
                        sVar5.n0();
                    }
                    b5.g gVar11 = b5.i.f5843f;
                    m3.i.C(u0VarD2, gVar11, sVar5);
                    b5.g gVar12 = b5.i.f5842e;
                    m3.i.C(iVarL10, gVar12, sVar5);
                    Integer numValueOf3 = Integer.valueOf(iHashCode10);
                    b5.g gVar13 = b5.i.f5844g;
                    m3.i.v(sVar5, numValueOf3, gVar13);
                    b5.d dVar4 = b5.i.f5845h;
                    m3.i.z(sVar5, dVar4);
                    b5.g gVar14 = b5.i.f5841d;
                    m3.i.C(tVarC11, gVar14, sVar5);
                    n4.b bVarZ2 = x0.z(R.drawable.system_icon_close_neutral_80, sVar5, 0);
                    String strU3 = o30.f0.U(sVar5, R.string.voice_over_close);
                    b4.t tVarA3 = uVar.a(qVar2, b4.d.f5685c);
                    float f18 = lv.t.f28253g;
                    b4.t tVarD3 = d2.c.D(tVarA3, 0.0f, f18, f18, 0.0f, 9);
                    boolean zF3 = sVar5.f(function05);
                    Object objM4 = sVar5.M();
                    if (zF3 || objM4 == fVar) {
                        objM4 = new j5(14, function05);
                        sVar5.k0(objM4);
                    }
                    b4.t tVarC12 = androidx.compose.foundation.b.c(tVarD3, false, null, null, (Function0) objM4, 15);
                    long j11 = lv.s.f28217b;
                    v1.n.d(bVarZ2, strU3, tVarC12, null, null, 0.0f, new i4.o(j11, 5), sVar5, 1572872, 56);
                    b4.t tVarD4 = m2.d(qVar2, 1.0f);
                    float f19 = lv.t.f28256j;
                    b4.t tVarD5 = d2.c.D(tVarD4, 0.0f, f19, 0.0f, f19, 5);
                    d2.y yVarA5 = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar5, 48);
                    int iHashCode11 = Long.hashCode(sVar5.T);
                    u3.i iVarL11 = sVar5.l();
                    b4.t tVarC13 = b4.a.c(tVarD5, sVar5);
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(hVar6);
                    } else {
                        sVar5.n0();
                    }
                    m3.i.C(yVarA5, gVar11, sVar5);
                    m3.i.C(iVarL11, gVar12, sVar5);
                    w.a0.y(iHashCode11, sVar5, gVar13, sVar5, dVar4);
                    m3.i.C(tVarC13, gVar14, sVar5);
                    gd.i iVarG = gd.o.g(order != null ? order.getItemOrStoreLogoUrl() : null, x0.z(R.drawable.default_logo, sVar5, 0), x0.z(R.drawable.default_logo, sVar5, 0), x0.z(R.drawable.default_logo, sVar5, 0), sVar5);
                    b4.t tVarM = m2.m(qVar2, 80);
                    l2.f fVar2 = l2.g.f26790a;
                    v1.n.d(iVarG, null, v1.n.j(v1.n.k(f4.g.b(tVarM, fVar2), 1, j11, fVar2), lv.s.J, i4.g0.f23254b), null, z4.l.f47172g, 0.0f, null, sVar5, 24624, 104);
                    d2.c.f(m2.e(qVar2, f18), sVar5);
                    String storeNameAndBranch = order != null ? order.getStoreNameAndBranch() : null;
                    String str5 = storeNameAndBranch == null ? "" : storeNameAndBranch;
                    u0 u0VarA = u0.a(lv.v.f28274n, 0L, b0.a0.C(20), null, null, 0L, null, 0, 0L, null, null, 16777213);
                    long j12 = lv.s.C;
                    r9.d(str5, d2.c.B(m2.d(qVar2, 1.0f), f18, 0.0f, 2), j12, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0VarA, sVar5, 432, 0, 130040);
                    d2.c.f(m2.e(qVar2, lv.t.f28249c), sVar5);
                    String ratingCollectedOn = discoverBucket != null ? discoverBucket.getRatingCollectedOn() : null;
                    r9.d(ratingCollectedOn == null ? "" : ratingCollectedOn, d2.c.B(m2.d(qVar2, 1.0f), f18, 0.0f, 2), lv.s.E, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar5, 432, 12582912, 130040);
                    d2.c.f(m2.e(qVar2, lv.t.f28255i), sVar5);
                    r9.d(o30.f0.U(sVar5, R.string.order_rating_overall_question), d2.c.B(m2.d(qVar2, 1.0f), f18, 0.0f, 2), j12, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28272k, sVar5, 432, 12582912, 130040);
                    d2.c.f(m2.e(qVar2, lv.t.f28251e), sVar5);
                    int iH = h1Var.h();
                    b4.t tVarB4 = d2.c.B(m2.d(qVar2, 1.0f), lv.t.f28257k, 0.0f, 2);
                    boolean zH2 = sVar5.h(order) | sVar5.f(function1);
                    Object objM5 = sVar5.M();
                    if (zH2 || objM5 == fVar) {
                        objM5 = new iq.f(order, h1Var, function1, 0);
                        sVar5.k0(objM5);
                    }
                    cp.a.i(iH, false, tVarB4, 0L, 0L, (Function1) objM5, sVar5, 3072, 182);
                    sVar5.q(true);
                    sVar5.q(true);
                } else {
                    sVar5.U();
                }
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                FilterChipOption filterChipOption = (FilterChipOption) obj8;
                List list = (List) obj7;
                gj.c0 c0Var = (gj.c0) obj6;
                jj.c cVar2 = (jj.c) obj5;
                MapFilters mapFilters = (MapFilters) obj4;
                m3.n nVar7 = (m3.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar6 = (m3.s) nVar7;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    int i16 = lj.c.$EnumSwitchMapping$0[filterChipOption.getId().ordinal()];
                    if (i16 == 1) {
                        sVar6.a0(986194162);
                        List<FilterCategory> categories = mapFilters.getCategories();
                        Set set = c0Var.f20483d;
                        boolean zH3 = sVar6.h(cVar2);
                        Object objM6 = sVar6.M();
                        if (zH3 || objM6 == fVar) {
                            objM6 = new al.d(cVar2, 19);
                            sVar6.k0(objM6);
                        }
                        jj.b.a(categories, set, (Function1) ((KFunction) objM6), null, sVar6, 0);
                        sVar6.q(false);
                    } else if (i16 == 2) {
                        sVar6.a0(986202836);
                        List<FilterDiet> diets = mapFilters.getDiets();
                        Set set2 = c0Var.f20485f;
                        boolean zH4 = sVar6.h(cVar2);
                        Object objM7 = sVar6.M();
                        if (zH4 || objM7 == fVar) {
                            objM7 = new al.d(cVar2, 20);
                            sVar6.k0(objM7);
                        }
                        y9.w.e(diets, set2, (Function1) ((KFunction) objM7), null, sVar6, 0);
                        sVar6.q(false);
                    } else if (i16 == 3) {
                        sVar6.a0(986168518);
                        String str6 = c0Var.f20487h;
                        boolean zH5 = sVar6.h(cVar2);
                        Object objM8 = sVar6.M();
                        if (zH5 || objM8 == fVar) {
                            objM8 = new al.d(cVar2, 15);
                            sVar6.k0(objM8);
                        }
                        zz.f.h(list, str6, (Function1) ((KFunction) objM8), null, sVar6, 0);
                        sVar6.q(false);
                    } else if (i16 != 4) {
                        sVar6.a0(507737907);
                        sVar6.q(false);
                    } else {
                        sVar6.a0(986177456);
                        int i17 = c0Var.l;
                        int i18 = c0Var.f20491m;
                        gj.a aVar = c0Var.f20492n;
                        boolean zH6 = sVar6.h(cVar2);
                        Object objM9 = sVar6.M();
                        if (zH6 || objM9 == fVar) {
                            objM9 = new al.d(cVar2, 16);
                            sVar6.k0(objM9);
                        }
                        Function1 function12 = (Function1) ((KFunction) objM9);
                        boolean zH7 = sVar6.h(cVar2);
                        Object objM10 = sVar6.M();
                        if (zH7 || objM10 == fVar) {
                            objM10 = new al.d(cVar2, 17);
                            sVar6.k0(objM10);
                        }
                        Function1 function13 = (Function1) ((KFunction) objM10);
                        boolean zH8 = sVar6.h(cVar2);
                        Object objM11 = sVar6.M();
                        if (zH8 || objM11 == fVar) {
                            objM11 = new al.d(cVar2, 18);
                            sVar6.k0(objM11);
                        }
                        u00.d.f(i17, i18, aVar, function12, function13, (Function1) ((KFunction) objM11), sVar6, 0);
                        sVar6.q(false);
                    }
                } else {
                    sVar6.U();
                }
                break;
            case 9:
                break;
            case 10:
                no.e eVar = (no.e) obj8;
                Function0 function06 = (Function0) obj7;
                Function0 function07 = (Function0) obj6;
                AllergensInfo allergensInfo = (AllergensInfo) obj5;
                Function1 function14 = (Function1) obj4;
                m3.n nVar8 = (m3.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar7 = (m3.s) nVar8;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    s1.i.a(eVar, null, null, null, "", null, u3.e.e(1780734900, sVar7, new dp.s(5, function06, function07, allergensInfo, function14)), sVar7, 1597440, 46);
                } else {
                    sVar7.U();
                }
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                x60.m mVar2 = (x60.m) obj8;
                f2.c0 c0Var2 = (f2.c0) obj7;
                b1 b1Var = (b1) obj6;
                b1 b1Var2 = (b1) obj5;
                cj.q qVar6 = (cj.q) obj4;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                b4.t tVarB5 = d2.c.B(m2.d(qVar2, 1.0f), 0.0f, mVar2.l, 1);
                d2.b bVar4 = d2.i.f13801a;
                d2.g gVarG = d2.i.g(mVar2.l);
                b2 b2VarC = d2.c.c(mVar2.f44015k, 0.0f, 2);
                m3.s sVar8 = (m3.s) ((m3.n) obj2);
                boolean zF4 = sVar8.f(b1Var) | sVar8.f(b1Var2) | sVar8.h(qVar6);
                Object objM12 = sVar8.M();
                if (zF4 || objM12 == fVar) {
                    objM12 = new m2.h0(b1Var, qVar6, b1Var2, 19);
                    sVar8.k0(objM12);
                }
                ox.h.d(tVarB5, c0Var2, b2VarC, false, gVarG, null, null, false, null, (Function1) objM12, sVar8, 0, 488);
                break;
            default:
                MoneySavedResponse moneySavedResponse = (MoneySavedResponse) obj8;
                f2.c0 c0Var3 = (f2.c0) obj7;
                v80.b0 b0Var = (v80.b0) obj6;
                MoneySavedActivity moneySavedActivity = (MoneySavedActivity) obj5;
                b1 b1Var3 = (b1) obj4;
                f2.d dVar5 = (f2.d) obj;
                m3.n nVar9 = (m3.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i19 = MoneySavedActivity.f9312g;
                dVar5.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((m3.s) nVar9).f(dVar5) ? 4 : 2;
                }
                m3.s sVar9 = (m3.s) nVar9;
                if (!sVar9.R(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    sVar9.U();
                } else if (moneySavedResponse == null) {
                    sVar9.a0(-370920926);
                    sVar9.q(false);
                } else {
                    sVar9.a0(-370920925);
                    b4.t tVarT = m2.t(m2.d(qVar2, 1.0f), 3);
                    d2.y yVarA6 = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar9, 0);
                    int iHashCode12 = Long.hashCode(sVar9.T);
                    u3.i iVarL12 = sVar9.l();
                    b4.t tVarC14 = b4.a.c(tVarT, sVar9);
                    b5.j.R.getClass();
                    b5.h hVar7 = b5.i.f5839b;
                    sVar9.e0();
                    if (sVar9.S) {
                        sVar9.k(hVar7);
                    } else {
                        sVar9.n0();
                    }
                    m3.i.C(yVarA6, b5.i.f5843f, sVar9);
                    m3.i.C(iVarL12, b5.i.f5842e, sVar9);
                    m3.i.v(sVar9, Integer.valueOf(iHashCode12), b5.i.f5844g);
                    m3.i.z(sVar9, b5.i.f5845h);
                    m3.i.C(tVarC14, b5.i.f5841d, sVar9);
                    b4.t tVarB6 = f2.d.b(dVar5, qVar2);
                    a2.j jVarG = b0.a0.G(c0Var3, sVar9, 0, 2);
                    boolean zH9 = sVar9.h(moneySavedResponse) | sVar9.h(b0Var) | sVar9.f(c0Var3);
                    Object objM13 = sVar9.M();
                    if (zH9 || objM13 == fVar) {
                        objM13 = new yj.k(moneySavedResponse, b0Var, c0Var3, 4);
                        sVar9.k0(objM13);
                    }
                    ox.h.d(tVarB6, c0Var3, null, true, null, null, jVarG, false, null, (Function1) objM13, sVar9, 3072, 436);
                    b4.t tVarD6 = d2.c.D(m2.d(qVar2, 1.0f), 0.0f, lv.t.f28251e, 0.0f, 0.0f, 13);
                    if (((Boolean) b1Var3.getValue()).booleanValue()) {
                        i13 = 845895054;
                        i14 = R.string.money_saved_no_magic_saved;
                        z11 = false;
                    } else {
                        z11 = false;
                        i13 = 846028044;
                        i14 = R.string.money_saved_estimate_message;
                    }
                    r9.d(b3.i.j(i13, i14, sVar9, sVar9, z11), tVarD6, lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar9, 432, 12582912, 130040);
                    b4.t tVarD7 = d2.c.D(new w0(b4.d.f5695n), 0.0f, lv.t.f28254h, 0.0f, 0.0f, 13);
                    String strU4 = o30.f0.U(sVar9, R.string.money_saved_btn_save_magic_bags);
                    lv.q qVar7 = lv.q.REGULAR;
                    lv.e eVar2 = lv.e.MEDIUM;
                    boolean zH10 = sVar9.h(moneySavedActivity);
                    Object objM14 = sVar9.M();
                    if (zH10 || objM14 == fVar) {
                        objM14 = new zq.b(moneySavedActivity, 1);
                        sVar9.k0(objM14);
                    }
                    v0.n.l(tVarD7, strU4, null, qVar7, eVar2, false, false, null, null, (Function0) objM14, sVar9, 27648, 484);
                    sVar9.q(true);
                    sVar9.q(false);
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f6519a = i11;
        this.f6520b = obj;
        this.f6521c = obj2;
        this.f6522d = obj3;
        this.f6523e = obj4;
        this.f6524f = obj5;
    }
}
