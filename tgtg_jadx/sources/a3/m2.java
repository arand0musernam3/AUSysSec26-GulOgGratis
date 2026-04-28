package a3;

import com.app.tgtg.R;
import com.app.tgtg.feature.postpurchase.email.AddEmailFragment;
import com.app.tgtg.model.remote.badge.BadgeButton;
import com.app.tgtg.model.remote.badge.BadgeCollection;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.mapService.response.FilterCategory;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.voucher.VoucherMode;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import g3.l8;
import g3.p8;
import g3.r9;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m2 implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f482b;

    public /* synthetic */ m2(e90.c cVar, e90.b bVar) {
        this.f481a = 5;
        this.f482b = cVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        qk.m mVar = (qk.m) this.f482b;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((f2.d) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            String str = mVar.f37191a;
            u3.d dVar = mVar.f37192b;
            if (Intrinsics.areEqual(str, "header")) {
                sVar.a0(-19121864);
                dVar.invoke(sVar, 0);
                sVar.q(false);
            } else {
                sVar.a0(-19025454);
                float f11 = lv.t.f28252f;
                b4.q qVar = b4.q.f5711a;
                d2.c.f(d2.m2.m(qVar, f11), sVar);
                b4.t tVarB = d2.c.B(qVar, lv.t.f28253g, 0.0f, 2);
                z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
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
                m3.i.C(u0VarD, b5.i.f5843f, sVar);
                m3.i.C(iVarL, b5.i.f5842e, sVar);
                m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(sVar, b5.i.f5845h);
                m3.i.C(tVarC, b5.i.f5841d, sVar);
                dVar.invoke(sVar, 0);
                sVar.q(true);
                d2.c.f(d2.m2.m(qVar, f11), sVar);
                g3.s0.g(null, 1, lv.s.H, sVar, 432, 1);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        Price price = (Price) this.f482b;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = d2.m2.d(qVar, 1.0f);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            r9.d(o30.f0.U(sVar, R.string.profile_page_impact_money_card_header), d2.m2.d(d2.c.z(qVar, o30.e0.s(sVar, R.dimen.spacing_2)), 1.0f), lv.s.f28217b, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28272k, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            m3.s sVar2 = sVar;
            v1.n.d(o00.x0.z(R.drawable.gfx_profile_impact_money, sVar2, 0), null, d2.m2.m(qVar, 64), null, null, 0.0f, null, sVar2, 440, 120);
            if (price == null) {
                sVar2.a0(-981676397);
                sVar2.q(false);
            } else {
                sVar2.a0(-981676396);
                b4.t tVarD2 = d2.m2.d(d2.c.D(qVar, o30.e0.s(sVar2, R.dimen.spacing_2), o30.e0.s(sVar2, R.dimen.spacing_2), o30.e0.s(sVar2, R.dimen.spacing_2), 0.0f, 8), 1.0f);
                String strValueOf = String.valueOf((int) price.getValue());
                m5.u0 u0Var = lv.v.l;
                long j9 = lv.s.C;
                r9.d(strValueOf, tVarD2, j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                r9.d(price.getCurrency(), d2.m2.d(d2.c.D(qVar, o30.e0.s(sVar2, R.dimen.spacing_2), 0.0f, o30.e0.s(sVar2, R.dimen.spacing_2), o30.e0.s(sVar2, R.dimen.spacing_2), 2), 1.0f), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                sVar2 = sVar2;
                sVar2.q(false);
            }
            sVar2.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        ItemTagInfo itemTagInfo = (ItemTagInfo) this.f482b;
        m3.n nVar = (m3.n) obj2;
        ((Integer) obj3).getClass();
        ((s1.z) obj).getClass();
        b4.t tVarA = d2.c.A(v1.n.j(d2.m2.d(b4.q.f5711a, 1.0f), itemTagInfo.getId().m354getBgColorWaAFU9c(nVar, 0), i4.g0.f23254b), lv.t.f28253g, lv.t.f28249c);
        z4.u0 u0VarD = d2.p.d(b4.d.f5687e, false);
        m3.s sVar = (m3.s) nVar;
        int iHashCode = Long.hashCode(sVar.T);
        u3.i iVarL = sVar.l();
        b4.t tVarC = b4.a.c(tVarA, nVar);
        b5.j.R.getClass();
        b5.h hVar = b5.i.f5839b;
        sVar.e0();
        if (sVar.S) {
            sVar.k(hVar);
        } else {
            sVar.n0();
        }
        m3.i.C(u0VarD, b5.i.f5843f, nVar);
        m3.i.C(iVarL, b5.i.f5842e, nVar);
        m3.i.v(nVar, Integer.valueOf(iHashCode), b5.i.f5844g);
        m3.i.z(nVar, b5.i.f5845h);
        m3.i.C(tVarC, b5.i.f5841d, nVar);
        String longText = itemTagInfo.getLongText();
        if (longText == null) {
            longText = "";
        }
        String str = longText;
        r9.d(str, null, itemTagInfo.getId().m357getTextColorWaAFU9c(nVar, 0), 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28275o, nVar, 0, 12582912, 130042);
        sVar.q(true);
        return Unit.f26487a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        VoucherMode voucherMode = (VoucherMode) this.f482b;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.j2) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            r9.d(o30.f0.U(sVar, voucherMode.getUsedAndExpiredBtn()), null, ((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).K, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography())).f43973w, sVar, 0, 0, 131066);
            g3.i2.a(o00.x0.z(R.drawable.ic_chevron_right, sVar, 0), null, null, ((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).K, sVar, 56, 4);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        AddEmailFragment addEmailFragment = (AddEmailFragment) this.f482b;
        ((Integer) obj3).getClass();
        ((s1.z) obj).getClass();
        b4.t tVarA = d2.u.f13938a.a(d2.c.D(b4.q.f5711a, 0.0f, 0.0f, 0.0f, 24, 7), b4.d.f5690h);
        m3.s sVar = (m3.s) ((m3.n) obj2);
        boolean zH = sVar.h(addEmailFragment);
        Object objM = sVar.M();
        if (zH || objM == m3.m.f29332a) {
            objM = new to.c(addEmailFragment, 0);
            sVar.k0(objM);
        }
        r9.d(o30.f0.U(sVar, R.string.post_purchase_add_maybe_later), androidx.compose.foundation.b.c(tVarA, false, null, null, (Function0) objM, 15), lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28281u, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
        return Unit.f26487a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        op.c cVar = (op.c) this.f482b;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((f2.d) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b4.q qVar = b4.q.f5711a;
            r9.d(o30.f0.U(sVar, R.string.station_picker_select_stations), d2.m2.d(qVar, 1.0f), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.l, sVar, 432, 12582912, 131064);
            float f11 = lv.t.f28253g;
            d2.c.f(d2.m2.e(qVar, f11), sVar);
            b4.t tVarB = d2.c.B(d2.m2.d(qVar, 1.0f), 0.0f, lv.t.f28251e, 1);
            String str = cVar != null ? cVar.f32897b : null;
            if (str == null) {
                str = "";
            }
            r9.d(str, tVarB, lv.s.F, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28279s, sVar, 432, 12582912, 131064);
            g3.s0.g(null, 1, lv.s.H, sVar, 432, 1);
            d2.c.f(d2.m2.e(qVar, f11), sVar);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? r11;
        Object obj4;
        boolean z11;
        int i11 = this.f481a;
        m3.f fVar = m3.m.f29332a;
        b4.q qVar = b4.q.f5711a;
        Object obj5 = this.f482b;
        switch (i11) {
            case 0:
                j2 j2Var = (j2) obj5;
                b4.t tVar = (b4.t) obj;
                ((Integer) obj3).getClass();
                m3.s sVar = (m3.s) ((m3.n) obj2);
                sVar.a0(-1914520728);
                z5.c cVar = (z5.c) sVar.j(c5.x1.f7416h);
                Object objM = sVar.M();
                Object obj6 = objM;
                if (objM == fVar) {
                    m3.k1 k1VarW = m3.i.w(new z5.l(0L));
                    sVar.k0(k1VarW);
                    obj6 = k1VarW;
                }
                m3.b1 b1Var = (m3.b1) obj6;
                boolean zH = sVar.h(j2Var);
                Object objM2 = sVar.M();
                Object obj7 = objM2;
                if (zH || objM2 == fVar) {
                    n2 n2Var = new n2(0, j2Var, b1Var);
                    sVar.k0(n2Var);
                    obj7 = n2Var;
                }
                Function0 function0 = (Function0) obj7;
                boolean zF = sVar.f(cVar);
                Object objM3 = sVar.M();
                if (zF || objM3 == fVar) {
                    r11 = 0;
                    o2 o2Var = new o2(cVar, b1Var, false ? 1 : 0);
                    sVar.k0(o2Var);
                    obj4 = o2Var;
                } else {
                    r11 = 0;
                    obj4 = objM3;
                }
                t1.l lVar = y1.f633a;
                b4.t tVarA = b4.a.a(tVar, c5.m2.f7291a, new u1(r11, function0, (Function1) obj4));
                sVar.q(r11);
                return tVarA;
            case 1:
                l3 l3Var = (l3) obj5;
                b4.t tVar2 = (b4.t) obj;
                ((Integer) obj3).getClass();
                m3.s sVar2 = (m3.s) ((m3.n) obj2);
                sVar2.a0(1980580247);
                z5.c cVar2 = (z5.c) sVar2.j(c5.x1.f7416h);
                Object objM4 = sVar2.M();
                Object obj8 = objM4;
                if (objM4 == fVar) {
                    m3.k1 k1VarW2 = m3.i.w(new z5.l(0L));
                    sVar2.k0(k1VarW2);
                    obj8 = k1VarW2;
                }
                m3.b1 b1Var2 = (m3.b1) obj8;
                boolean zH2 = sVar2.h(l3Var);
                Object objM5 = sVar2.M();
                Object obj9 = objM5;
                if (zH2 || objM5 == fVar) {
                    n2 n2Var2 = new n2(1, l3Var, b1Var2);
                    sVar2.k0(n2Var2);
                    obj9 = n2Var2;
                }
                Function0 function02 = (Function0) obj9;
                boolean zF2 = sVar2.f(cVar2);
                Object objM6 = sVar2.M();
                Object obj10 = objM6;
                if (zF2 || objM6 == fVar) {
                    o2 o2Var2 = new o2(cVar2, b1Var2, 3);
                    sVar2.k0(o2Var2);
                    obj10 = o2Var2;
                }
                t1.l lVar2 = y1.f633a;
                b4.t tVarA2 = b4.a.a(tVar2, c5.m2.f7291a, new u1(0, function02, (Function1) obj10));
                sVar2.q(false);
                return tVarA2;
            case 2:
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                ((u3.d) obj5).invoke((m3.n) obj2, 0);
                return Unit.f26487a;
            case 3:
                List<cg.a> list = (List) obj5;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d2.j2) obj).getClass();
                m3.s sVar3 = (m3.s) nVar;
                if (!sVar3.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    sVar3.U();
                } else if (list == null) {
                    sVar3.a0(-1411086588);
                    sVar3.q(false);
                } else {
                    sVar3.a0(-1411086587);
                    d2.i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5692j, sVar3, 0);
                    int iHashCode = Long.hashCode(sVar3.T);
                    u3.i iVarL = sVar3.l();
                    b4.t tVarC = b4.a.c(qVar, sVar3);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar);
                    } else {
                        sVar3.n0();
                    }
                    m3.i.C(i2VarA, b5.i.f5843f, sVar3);
                    m3.i.C(iVarL, b5.i.f5842e, sVar3);
                    m3.i.v(sVar3, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar3, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar3);
                    sVar3.a0(46001751);
                    for (cg.a aVar : list) {
                        boolean zF3 = sVar3.f(aVar);
                        Object objM7 = sVar3.M();
                        if (zF3 || objM7 == fVar) {
                            objM7 = new aa.e(aVar, 23);
                            sVar3.k0(objM7);
                        }
                        g3.s0.h((Function0) objM7, null, false, null, null, null, u3.e.e(-554585522, sVar3, new f1(aVar, 15)), sVar3, 1572864, 62);
                    }
                    e0.f.D(sVar3, false, true, false);
                }
                return Unit.f26487a;
            case 4:
                ((Integer) obj3).intValue();
                ((s1.z) obj).getClass();
                w.b.f((Order) obj5, (m3.n) obj2, 0);
                return Unit.f26487a;
            case 5:
                e90.c cVar3 = (e90.c) obj5;
                e90.c.f15876h.set(cVar3, null);
                cVar3.e(null);
                return Unit.f26487a;
            case 6:
                ((e90.h) obj5).d();
                return Unit.f26487a;
            case 7:
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                str.getClass();
                str2.getClass();
                str3.getClass();
                ((fn.t) obj5).s().e(str, str2, str3);
                return Unit.f26487a;
            case 8:
                l8 l8Var = (l8) obj5;
                ((Integer) obj3).getClass();
                m3.s sVar4 = (m3.s) ((m3.n) obj2);
                sVar4.a0(-1541271084);
                float f11 = l8Var.f19039b;
                l3.f0 f0Var = l3.f0.DefaultSpatial;
                m3.c3 c3VarA = t1.d.a(f11, g3.s0.D(f0Var, sVar4), null, sVar4, 0, 12);
                m3.c3 c3VarA2 = t1.d.a(l8Var.f19038a, g3.s0.D(f0Var, sVar4), null, sVar4, 0, 12);
                b4.t tVarU = d2.m2.u(d2.m2.d((b4.t) obj, 1.0f), b4.d.f5689g, 2);
                boolean zF4 = sVar4.f(c3VarA2);
                Object objM8 = sVar4.M();
                Object obj11 = objM8;
                if (zF4 || objM8 == fVar) {
                    dp.r rVar = new dp.r(c3VarA2, 3);
                    sVar4.k0(rVar);
                    obj11 = rVar;
                }
                b4.t tVarQ = d2.m2.q(d2.c.u(tVarU, (Function1) obj11), ((z5.f) c3VarA.getValue()).f47277a);
                sVar4.q(false);
                return tVarQ;
            case 9:
                go.a aVar2 = (go.a) obj5;
                b4.t tVar3 = (b4.t) obj;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                tVar3.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((m3.s) nVar2).f(tVar3) ? 4 : 2;
                }
                m3.s sVar5 = (m3.s) nVar2;
                if (sVar5.R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    b4.t tVarT = d2.m2.t(d2.m2.d(tVar3, 1.0f), 3);
                    String itemCollectionInfo = aVar2.f20698a.getItemCollectionInfo();
                    m5.u0 u0Var = lv.v.f28274n;
                    cg.j.j(tVarT, itemCollectionInfo, 3, m5.u0.a(u0Var, lv.s.C, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), m5.u0.a(u0Var, lv.s.f28217b, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), null, null, sVar5, MLKEMEngine.KyberPolyBytes);
                } else {
                    sVar5.U();
                }
                return Unit.f26487a;
            case 10:
                d2.t tVar4 = (d2.t) obj5;
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar6 = (m3.s) nVar3;
                if (sVar6.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strU = o30.f0.U(sVar6, R.string.charity_home_title_history);
                    m5.u0 u0Var2 = lv.v.f28272k;
                    long j9 = lv.s.C;
                    float f12 = lv.t.f28253g;
                    r9.d(strU, tVar4.a(d2.c.D(d2.c.z(qVar, f12), 0.0f, lv.t.f28254h, 0.0f, 0.0f, 13), b4.d.f5686d), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar6, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                    ii.l.e(R.drawable.ic_donations_history_empty_state, R.string.charity_home_empty_history, 6, d2.c.B(qVar, f12, 0.0f, 2), sVar6);
                } else {
                    sVar6.U();
                }
                return Unit.f26487a;
            case 11:
                m3.c3 c3Var = (m3.c3) obj5;
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar7 = (m3.s) nVar4;
                if (sVar7.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String upperCase = o30.f0.T(R.string.charity_hi_name, new Object[]{(String) c3Var.getValue()}, sVar7).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    r9.d(upperCase, d2.c.z(qVar, lv.t.f28253g), lv.s.f28217b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28265d, sVar7, 432, 12582912, 131064);
                } else {
                    sVar7.U();
                }
                return Unit.f26487a;
            case 12:
                BadgeButton badgeButton = (BadgeButton) obj5;
                m3.n nVar5 = (m3.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((d2.j2) obj).getClass();
                m3.s sVar8 = (m3.s) nVar5;
                if (sVar8.R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    r9.d(badgeButton.getTitle(), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.f28281u, lv.s.J, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar8, 0, 0, 131070);
                } else {
                    sVar8.U();
                }
                return Unit.f26487a;
            case 13:
                BadgeCollection badgeCollection = (BadgeCollection) obj5;
                m3.n nVar6 = (m3.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((g2.l) obj).getClass();
                m3.s sVar9 = (m3.s) nVar6;
                if (sVar9.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    r9.d(badgeCollection.getTitle(), d2.c.z(qVar, o30.e0.s(sVar9, R.dimen.spacing_3)), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.l, lv.s.C, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar9, 0, 0, 131068);
                } else {
                    sVar9.U();
                }
                return Unit.f26487a;
            case 14:
                FilterCategory filterCategory = (FilterCategory) obj5;
                m3.n nVar7 = (m3.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((b4.t) obj).getClass();
                m3.s sVar10 = (m3.s) nVar7;
                if (sVar10.R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    wd.a.a(filterCategory, null, sVar10, 48);
                } else {
                    sVar10.U();
                }
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                z5.a aVar3 = (z5.a) obj3;
                long j11 = ((m2.z1) obj5).f29162f;
                long j12 = aVar3.f47271a;
                int iK = z5.a.k(j12);
                long j13 = aVar3.f47271a;
                z4.m1 m1VarD = ((z4.t0) obj2).D(z5.a.b(j12, n80.p.c((int) (j11 >> 32), iK, z5.a.i(j13)), 0, n80.p.c((int) (j11 & 4294967295L), z5.a.j(j13), z5.a.h(j13)), 0, 10));
                return z4.w0.f((z4.w0) obj, m1VarD.f47183a, m1VarD.f47184b, new d2.k(m1VarD, 12));
            case 16:
                m5.u0 u0Var3 = (m5.u0) obj5;
                ((Integer) obj3).getClass();
                m3.s sVar11 = (m3.s) ((m3.n) obj2);
                sVar11.a0(1582736677);
                z5.c cVar4 = (z5.c) sVar11.j(c5.x1.f7416h);
                q5.h hVar2 = (q5.h) sVar11.j(c5.x1.f7419k);
                z5.m mVar = (z5.m) sVar11.j(c5.x1.f7421n);
                boolean zF5 = sVar11.f(u0Var3) | sVar11.d(mVar.ordinal());
                Object objM9 = sVar11.M();
                Object obj12 = objM9;
                if (zF5 || objM9 == fVar) {
                    m5.u0 u0VarK = m5.k0.k(u0Var3, mVar);
                    sVar11.k0(u0VarK);
                    obj12 = u0VarK;
                }
                m5.u0 u0Var4 = (m5.u0) obj12;
                boolean zF6 = sVar11.f(hVar2) | sVar11.f(u0Var4);
                Object objM10 = sVar11.M();
                Object obj13 = objM10;
                if (zF6 || objM10 == fVar) {
                    m5.l0 l0Var = u0Var4.f29655a;
                    q5.i iVar = l0Var.f29580f;
                    q5.r rVar2 = l0Var.f29577c;
                    if (rVar2 == null) {
                        rVar2 = q5.r.f36043h;
                    }
                    q5.n nVar8 = l0Var.f29578d;
                    int i12 = nVar8 != null ? nVar8.f36034a : 0;
                    q5.o oVar = l0Var.f29579e;
                    q5.g0 g0VarB = ((q5.j) hVar2).b(iVar, rVar2, i12, oVar != null ? oVar.f36035a : Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                    sVar11.k0(g0VarB);
                    obj13 = g0VarB;
                }
                m3.c3 c3Var2 = (m3.c3) obj13;
                Object objM11 = sVar11.M();
                Object obj14 = objM11;
                if (objM11 == fVar) {
                    Object value = c3Var2.getValue();
                    m2.z1 z1Var = new m2.z1();
                    z1Var.f29157a = mVar;
                    z1Var.f29158b = cVar4;
                    z1Var.f29159c = hVar2;
                    z1Var.f29160d = u0Var3;
                    z1Var.f29161e = value;
                    z1Var.f29162f = m2.o1.a(u0Var3, cVar4, hVar2, m2.o1.f29050a, 1);
                    sVar11.k0(z1Var);
                    obj14 = z1Var;
                }
                m2.z1 z1Var2 = (m2.z1) obj14;
                Object value2 = c3Var2.getValue();
                if (mVar != z1Var2.f29157a || !Intrinsics.areEqual(cVar4, z1Var2.f29158b) || !Intrinsics.areEqual(hVar2, z1Var2.f29159c) || !Intrinsics.areEqual(u0Var4, z1Var2.f29160d) || !Intrinsics.areEqual(value2, z1Var2.f29161e)) {
                    z1Var2.f29157a = mVar;
                    z1Var2.f29158b = cVar4;
                    z1Var2.f29159c = hVar2;
                    z1Var2.f29160d = u0Var4;
                    z1Var2.f29161e = value2;
                    z1Var2.f29162f = m2.o1.a(u0Var4, cVar4, hVar2, m2.o1.f29050a, 1);
                }
                boolean zH3 = sVar11.h(z1Var2);
                Object objM12 = sVar11.M();
                Object obj15 = objM12;
                if (zH3 || objM12 == fVar) {
                    m2 m2Var = new m2(z1Var2, 15);
                    sVar11.k0(m2Var);
                    obj15 = m2Var;
                }
                b4.t tVarL = z4.c0.l(qVar, (i80.n) obj15);
                sVar11.q(false);
                return tVarL;
            case 17:
                m3.y0 y0Var = (m3.y0) obj5;
                m3.n nVar9 = (m3.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= (iIntValue8 & 8) == 0 ? ((m3.s) nVar9).f(obj) : ((m3.s) nVar9).h(obj) ? 4 : 2;
                }
                m3.s sVar12 = (m3.s) nVar9;
                if (sVar12.R(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    sVar12.D(y0Var, sVar12.l(), obj, false);
                } else {
                    sVar12.U();
                }
                return Unit.f26487a;
            case 18:
                com.google.firebase.messaging.a0 a0Var = (com.google.firebase.messaging.a0) obj5;
                int iIntValue9 = ((Integer) obj).intValue();
                String str4 = (String) obj2;
                g9.q0 q0Var = (g9.q0) obj3;
                str4.getClass();
                q0Var.getClass();
                int i13 = m9.h.$EnumSwitchMapping$0[(((q0Var instanceof g9.e) || ((KSerializer) a0Var.f12780c).getDescriptor().i(iIntValue9)) ? m9.g.QUERY : m9.g.PATH).ordinal()];
                if (i13 == 1) {
                    a0Var.f12781d = ((String) a0Var.f12781d) + '/' + e0.f.g('}', "{", str4);
                } else {
                    if (i13 != 2) {
                        e40.a.f();
                        return null;
                    }
                    a0Var.v(str4, "{" + str4 + '}');
                }
                return Unit.f26487a;
            case 19:
                y3.b bVar = (y3.b) obj5;
                n9.e eVar = (n9.e) obj;
                m3.n nVar10 = (m3.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= ((m3.s) nVar10).f(eVar) ? 4 : 2;
                }
                int i14 = 1;
                m3.s sVar13 = (m3.s) nVar10;
                if (sVar13.R(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    bVar.e(eVar.f30742b, u3.e.e(121262920, sVar13, new n9.d(eVar, i14, (byte) 0)), sVar13, 48);
                } else {
                    sVar13.U();
                }
                return Unit.f26487a;
            case 20:
                z3.u uVar = (z3.u) obj5;
                n9.e eVar2 = (n9.e) obj;
                m3.n nVar11 = (m3.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((m3.s) nVar11).f(eVar2) ? 4 : 2;
                }
                m3.s sVar14 = (m3.s) nVar11;
                if (sVar14.R(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    Object obj16 = eVar2.f30742b;
                    if (((Set) sVar14.j(o9.h.f32139a)).contains(obj16)) {
                        z11 = false;
                        sVar14.a0(1572145905);
                    } else {
                        sVar14.a0(1574916499);
                        sVar14.Y(1159182959, obj16);
                        Object objM13 = sVar14.M();
                        if (objM13 == fVar) {
                            Object dVar = uVar.get(obj16);
                            if (dVar == null) {
                                dVar = new u3.d(new m2(new m3.y0(), 17), true, 1032736913);
                                uVar.put(obj16, dVar);
                            }
                            objM13 = (i80.n) dVar;
                            sVar14.k0(objM13);
                        }
                        z11 = false;
                        ((i80.n) objM13).invoke(u3.e.e(-804085656, sVar14, new n9.d(eVar2, 3, false ? 1 : 0)), sVar14, 54);
                        sVar14.q(false);
                    }
                    sVar14.q(z11);
                } else {
                    sVar14.U();
                }
                return Unit.f26487a;
            case 21:
                List list2 = (List) obj;
                ((Integer) obj3).getClass();
                list2.getClass();
                float f13 = 2;
                p8.f19327a.a(f4.g.k(d2.c.B(b4.a.a(qVar, c5.m2.f7291a, new m2((l8) list2.get(((m3.h1) obj5).h()), 8)), 30, 0.0f, 2), f13, l2.g.b(f13), false, 0L, 0L, 28), 3, lv.s.f28217b, (m3.n) obj2, 432);
                return Unit.f26487a;
            case 22:
                return a(obj, obj2, obj3);
            case 23:
                return b(obj, obj2, obj3);
            case 24:
                x60.m mVar2 = (x60.m) obj5;
                m3.n nVar12 = (m3.n) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar15 = (m3.s) nVar12;
                if (sVar15.R(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    d2.c.f(d2.m2.m(qVar, mVar2.f44014j), sVar15);
                    d2.c.f(d2.m2.m(qVar, mVar2.f44018o), sVar15);
                } else {
                    sVar15.U();
                }
                return Unit.f26487a;
            case 25:
                return c(obj, obj2, obj3);
            case 26:
                return d(obj, obj2, obj3);
            case 27:
                return e(obj, obj2, obj3);
            case 28:
                return f(obj, obj2, obj3);
            default:
                jd.f fVar2 = (jd.f) obj5;
                d2.z1 z1Var3 = (d2.z1) obj;
                m3.n nVar13 = (m3.n) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                z1Var3.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= ((m3.s) nVar13).f(z1Var3) ? 4 : 2;
                }
                m3.s sVar16 = (m3.s) nVar13;
                if (sVar16.R(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    long j14 = lv.s.J;
                    i4.r0 r0Var = i4.g0.f23254b;
                    b4.t tVarR = d2.c.r(d2.m2.c(d2.m2.d(v1.n.r(d2.c.y(v1.n.j(qVar, j14, r0Var), z1Var3), v1.n.q(sVar16), true), 1.0f), 1.0f));
                    d2.d dVar2 = d2.i.f13803c;
                    b4.i iVar2 = b4.d.f5694m;
                    d2.y yVarA = d2.w.a(dVar2, iVar2, sVar16, 0);
                    int iHashCode2 = Long.hashCode(sVar16.T);
                    u3.i iVarL2 = sVar16.l();
                    b4.t tVarC2 = b4.a.c(tVarR, sVar16);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar16.e0();
                    if (sVar16.S) {
                        sVar16.k(hVar3);
                    } else {
                        sVar16.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(yVarA, gVar, sVar16);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL2, gVar2, sVar16);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar16, numValueOf, gVar3);
                    b5.d dVar3 = b5.i.f5845h;
                    m3.i.z(sVar16, dVar3);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC2, gVar4, sVar16);
                    b4.t tVarT2 = d2.m2.t(d2.m2.d(v1.n.j(d2.c.z(qVar, o30.e0.s(sVar16, R.dimen.spacing_2)), j14, r0Var), 1.0f), 3);
                    d2.y yVarA2 = d2.w.a(dVar2, iVar2, sVar16, 0);
                    int iHashCode3 = Long.hashCode(sVar16.T);
                    u3.i iVarL3 = sVar16.l();
                    b4.t tVarC3 = b4.a.c(tVarT2, sVar16);
                    sVar16.e0();
                    if (sVar16.S) {
                        sVar16.k(hVar3);
                    } else {
                        sVar16.n0();
                    }
                    m3.i.C(yVarA2, gVar, sVar16);
                    m3.i.C(iVarL3, gVar2, sVar16);
                    w.a0.y(iHashCode3, sVar16, gVar3, sVar16, dVar3);
                    m3.i.C(tVarC3, gVar4, sVar16);
                    b4.t tVarZ = d2.c.z(d2.m2.t(d2.m2.d(v1.n.k(qVar, 1, lv.s.H, l2.g.b(12)), 1.0f), 3), o30.e0.s(sVar16, R.dimen.spacing_3));
                    d2.y yVarA3 = d2.w.a(dVar2, iVar2, sVar16, 0);
                    int iHashCode4 = Long.hashCode(sVar16.T);
                    u3.i iVarL4 = sVar16.l();
                    b4.t tVarC4 = b4.a.c(tVarZ, sVar16);
                    sVar16.e0();
                    if (sVar16.S) {
                        sVar16.k(hVar3);
                    } else {
                        sVar16.n0();
                    }
                    m3.i.C(yVarA3, gVar, sVar16);
                    m3.i.C(iVarL4, gVar2, sVar16);
                    w.a0.y(iHashCode4, sVar16, gVar3, sVar16, dVar3);
                    m3.i.C(tVarC4, gVar4, sVar16);
                    r9.d(o30.f0.U(sVar16, R.string.c2c_always_on_invite_friends_screen_header), d2.m2.d(qVar, 1.0f), lv.s.f28215a, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28268g, sVar16, 432, 12582912, 130040);
                    b4.t tVarD = d2.c.D(d2.m2.d(qVar, 1.0f), 0.0f, o30.e0.s(sVar16, R.dimen.spacing_1_5), 0.0f, 0.0f, 13);
                    String strU2 = o30.f0.U(sVar16, R.string.c2c_always_on_invite_friends_screen_description);
                    m5.u0 u0Var5 = lv.v.f28274n;
                    long j15 = lv.s.C;
                    r9.d(strU2, tVarD, j15, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var5, sVar16, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                    z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                    int iHashCode5 = Long.hashCode(sVar16.T);
                    u3.i iVarL5 = sVar16.l();
                    b4.t tVarC5 = b4.a.c(qVar, sVar16);
                    sVar16.e0();
                    if (sVar16.S) {
                        sVar16.k(hVar3);
                    } else {
                        sVar16.n0();
                    }
                    m3.i.C(u0VarD, gVar, sVar16);
                    m3.i.C(iVarL5, gVar2, sVar16);
                    w.a0.y(iHashCode5, sVar16, gVar3, sVar16, dVar3);
                    m3.i.C(tVarC5, gVar4, sVar16);
                    b4.k kVar = b4.d.f5687e;
                    d2.u uVar2 = d2.u.f13938a;
                    v1.n.d(o00.x0.z(2131231622, sVar16, 0), null, d2.c.D(uVar2.a(qVar, kVar), 0.0f, o30.e0.s(sVar16, R.dimen.spacing_3), 0.0f, 44, 5), null, null, 0.0f, null, sVar16, 56, 120);
                    b4.t tVarA3 = uVar2.a(d2.m2.d(qVar, 1.0f), b4.d.f5690h);
                    String strU3 = o30.f0.U(sVar16, R.string.c2c_always_on_invite_friends_button);
                    lv.q qVar2 = lv.q.REGULAR;
                    lv.e eVar3 = lv.e.MEDIUM;
                    boolean zH4 = sVar16.h(fVar2);
                    Object objM14 = sVar16.M();
                    if (zH4 || objM14 == fVar) {
                        objM14 = new tq.b(fVar2, 0);
                        sVar16.k0(objM14);
                    }
                    v0.n.l(tVarA3, strU3, null, qVar2, eVar3, false, false, null, null, (Function0) objM14, sVar16, 27648, 484);
                    sVar16.q(true);
                    r9.d(o30.f0.U(sVar16, R.string.c2c_always_on_invite_friends_see_full_terms), b4.a.a(d2.c.D(d2.m2.d(qVar, 1.0f), 0.0f, o30.e0.s(sVar16, R.dimen.spacing_3), 0.0f, 0.0f, 13), c5.m2.f7291a, new go.s(fVar2, 8)), lv.s.f28217b, 0L, null, 0L, x5.l.f43854c, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28283w, sVar16, 805306752, 12582912, 129528);
                    sVar16.q(true);
                    r9.d(o30.f0.U(sVar16, R.string.c2c_always_on_invite_friends_how_it_works), d2.c.D(d2.m2.d(qVar, 1.0f), 0.0f, o30.e0.s(sVar16, R.dimen.spacing_3), 0.0f, o30.e0.s(sVar16, R.dimen.spacing_0_5), 5), j15, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.l, sVar16, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                    cg.u uVar3 = new cg.u(0, "1", o30.f0.U(sVar16, R.string.c2c_always_on_invite_friends_how_it_works_download_app), (String) null, (String) null, (Function0) null, 121);
                    cg.u uVar4 = new cg.u(0, "2", o30.f0.U(sVar16, R.string.c2c_always_on_invite_friends_how_it_works_invitation_link), (String) null, (String) null, (Function0) null, 121);
                    String strU4 = o30.f0.U(sVar16, R.string.c2c_always_on_invite_friends_how_it_works_notifications);
                    String strU5 = o30.f0.U(sVar16, R.string.c2c_always_on_invite_friends_how_it_works_notifications_link);
                    boolean zH5 = sVar16.h(fVar2);
                    Object objM15 = sVar16.M();
                    if (zH5 || objM15 == fVar) {
                        objM15 = new tq.b(fVar2, 1);
                        sVar16.k0(objM15);
                    }
                    List listH = kotlin.collections.d0.h(uVar3, uVar4, new cg.u(0, "3", strU4, (String) null, strU5, (Function0) objM15, 73));
                    sVar16.a0(-1281807942);
                    Iterator it = listH.iterator();
                    while (it.hasNext()) {
                        wd.a.d((cg.u) it.next(), sVar16, 0);
                    }
                    e0.f.D(sVar16, false, true, true);
                } else {
                    sVar16.U();
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ m2(Object obj, int i11) {
        this.f481a = i11;
        this.f482b = obj;
    }
}
