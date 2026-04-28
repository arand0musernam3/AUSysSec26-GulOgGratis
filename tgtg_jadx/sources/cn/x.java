package cn;

import a3.v2;
import android.content.Context;
import android.webkit.WebView;
import b0.f3;
import bg.a1;
import c5.d2;
import c5.q2;
import c5.v0;
import c5.x1;
import c5.x3;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import com.app.tgtg.feature.postpurchase.phone.AddPhoneNumberFragment;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.local.LatestBasketInteraction;
import com.app.tgtg.model.local.LatestInteractionOrigin;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.Server;
import com.app.tgtg.model.remote.badge.Badge;
import com.app.tgtg.model.remote.badge.BadgeButton;
import com.app.tgtg.model.remote.badge.BadgeCTA;
import com.app.tgtg.model.remote.badge.BadgeProgress;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.item.response.HighlightedItemMnuV2;
import com.app.tgtg.model.remote.item.response.Item;
import com.app.tgtg.model.remote.manufacturer.response.Brand;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemProperties;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.profile.response.StoreSignupCardDetails;
import com.app.tgtg.model.remote.user.response.C2CReferralResponse;
import com.app.tgtg.model.remote.user.response.C2CRewardDetails;
import com.app.tgtg.model.remote.user.response.charity.CharityPlanCollectorType;
import com.app.tgtg.model.remote.voucher.CountryBasedVoucher;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import com.google.android.gms.internal.measurement.cg;
import com.tgtg.componentlibrary.component.iconbutton.variant.SubtlePantryIconButtonKt;
import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderColors;
import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderGeometry;
import d2.b2;
import d2.h2;
import d2.i2;
import d2.j2;
import d2.m2;
import d2.n1;
import d2.z1;
import d40.t1;
import g3.b7;
import g3.c4;
import g3.d7;
import g3.f5;
import g3.f6;
import g3.g7;
import g3.j3;
import g3.j4;
import g3.j5;
import g3.l7;
import g3.m5;
import g3.p0;
import g3.r9;
import g3.s0;
import g3.w6;
import g3.y0;
import i4.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import m2.e1;
import m3.b1;
import m3.c3;
import m3.g1;
import m3.h1;
import m3.i1;
import m5.t0;
import m5.u0;
import o00.x0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import z4.c1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8605e;

    public /* synthetic */ x(PageHeaderGeometry pageHeaderGeometry, PageHeaderColors pageHeaderColors, String str, String str2) {
        this.f8601a = 21;
        this.f8605e = pageHeaderGeometry;
        this.f8604d = pageHeaderColors;
        this.f8602b = str;
        this.f8603c = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v24, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r15v25, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r15v26, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r30v13, types: [m3.n, m3.s] */
    private final Object a(Object obj, Object obj2, Object obj3) {
        b4.q qVar;
        b4.i iVar;
        boolean z11;
        Function1 function1;
        d2.d dVar;
        Object obj4;
        b4.q qVar2;
        boolean z12;
        m3.s sVar;
        m3.s sVar2;
        ?? arrayList;
        boolean z13;
        ?? r15;
        ?? r152;
        gh.i iVar2 = (gh.i) this.f8605e;
        Function1 function12 = (Function1) this.f8602b;
        Function1 function13 = (Function1) this.f8603c;
        Function1 function14 = (Function1) this.f8604d;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        m3.s sVar3 = (m3.s) nVar;
        if (sVar3.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b4.q qVar3 = b4.q.f5711a;
            b4.t tVarR = v1.n.r(d2.c.D(m2.t(m2.d(qVar3, 1.0f), 3), 0.0f, 0.0f, 0.0f, o30.e0.s(sVar3, R.dimen.bottom_nav_view_height), 7), v1.n.q(sVar3), true);
            d2.d dVar2 = d2.i.f13803c;
            b4.i iVar3 = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar2, iVar3, sVar3, 0);
            int iHashCode = Long.hashCode(sVar3.T);
            u3.i iVarL = sVar3.l();
            b4.t tVarC = b4.a.c(tVarR, sVar3);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(hVar);
            } else {
                sVar3.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar3);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar3, numValueOf, gVar3);
            b5.d dVar3 = b5.i.f5845h;
            m3.i.z(sVar3, dVar3);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar3);
            b4.i iVar4 = b4.d.f5695n;
            b4.t tVarD = d2.c.D(m2.t(m2.d(qVar3, 1.0f), 3), o30.e0.s(sVar3, R.dimen.spacing_4), 0.0f, o30.e0.s(sVar3, R.dimen.spacing_4), 0.0f, 10);
            d2.y yVarA2 = d2.w.a(dVar2, iVar4, sVar3, 48);
            int iHashCode2 = Long.hashCode(sVar3.T);
            u3.i iVarL2 = sVar3.l();
            b4.t tVarC2 = b4.a.c(tVarD, sVar3);
            sVar3.e0();
            if (sVar3.S) {
                sVar3.k(hVar);
            } else {
                sVar3.n0();
            }
            m3.i.C(yVarA2, gVar, sVar3);
            m3.i.C(iVarL2, gVar2, sVar3);
            w.a0.y(iHashCode2, sVar3, gVar3, sVar3, dVar3);
            m3.i.C(tVarC2, gVar4, sVar3);
            float f11 = 176;
            b4.t tVarQ = m2.q(m2.e(qVar3, f11), f11);
            String str = iVar2.f20450b;
            BadgeCTA badgeCTA = iVar2.f20455g;
            gd.o.a(str, null, tVarQ, z4.l.f47166a, sVar3, 1573296, 0, 1976);
            b4.t tVarD2 = d2.c.D(qVar3, 0.0f, o30.e0.s(sVar3, R.dimen.spacing_2), 0.0f, 0.0f, 13);
            String str2 = iVar2.f20451c;
            u0 u0Var = lv.v.f28270i;
            long j9 = lv.s.f28217b;
            r9.d(str2, tVarD2, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(u0Var, j9, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar3, 0, 0, 131068);
            m3.s sVar4 = sVar3;
            String str3 = iVar2.f20452d;
            if (str3 == null) {
                sVar4.a0(800677079);
                z11 = false;
                sVar4.q(false);
                qVar = qVar3;
                iVar = iVar3;
            } else {
                sVar4.a0(800677080);
                qVar = qVar3;
                iVar = iVar3;
                r9.d(str3, d2.c.D(qVar3, 0.0f, o30.e0.s(sVar4, R.dimen.spacing_0_5), 0.0f, 0.0f, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(lv.v.f28276p, lv.s.D, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar4, 0, 0, 131068);
                sVar4 = sVar4;
                z11 = false;
                sVar4.q(false);
            }
            BadgeProgress badgeProgress = iVar2.f20454f;
            Object obj5 = m3.m.f29332a;
            if (badgeProgress == null) {
                sVar4.a0(801191896);
                sVar4.q(z11);
                function1 = function12;
                dVar = dVar2;
                obj4 = obj5;
                qVar2 = qVar;
            } else {
                sVar4.a0(801191897);
                Object objM = sVar4.M();
                if (objM == obj5) {
                    objM = new g1(0.0f);
                    sVar4.k0(objM);
                }
                g1 g1Var = (g1) objM;
                function1 = function12;
                dVar = dVar2;
                obj4 = obj5;
                float fFloatValue = ((Number) t1.d.b(g1Var.h(), f5.f18611g, "", null, sVar4, 3072, 20).getValue()).floatValue();
                boolean zC = sVar4.c(fFloatValue);
                Object objM2 = sVar4.M();
                if (zC || objM2 == obj4) {
                    objM2 = new defpackage.f(fFloatValue);
                    sVar4.k0(objM2);
                }
                Function0 function0 = (Function0) objM2;
                b4.t tVarD3 = d2.c.D(m2.e(m2.d(qVar, 1.0f), 24), 0.0f, o30.e0.s(sVar4, R.dimen.spacing_2), 0.0f, 0.0f, 13);
                boolean zH = sVar4.h(badgeProgress);
                Object objM3 = sVar4.M();
                if (zH || objM3 == obj4) {
                    objM3 = new jh.b(badgeProgress, g1Var, 0);
                    sVar4.k0(objM3);
                }
                m3.s sVar5 = sVar4;
                m5.b(function0, z4.c0.o(tVarD3, (Function1) objM3), j9, lv.s.H, 1, 0.0f, null, sVar5, 3456, 96);
                b4.q qVar4 = qVar;
                b4.t tVarD4 = d2.c.D(qVar4, 0.0f, o30.e0.s(sVar5, R.dimen.spacing_0_5), 0.0f, 0.0f, 13);
                qVar2 = qVar4;
                i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar5, 0);
                int iHashCode3 = Long.hashCode(sVar5.T);
                u3.i iVarL3 = sVar5.l();
                b4.t tVarC3 = b4.a.c(tVarD4, sVar5);
                sVar5.e0();
                if (sVar5.S) {
                    sVar5.k(hVar);
                } else {
                    sVar5.n0();
                }
                m3.i.C(i2VarA, gVar, sVar5);
                m3.i.C(iVarL3, gVar2, sVar5);
                w.a0.y(iHashCode3, sVar5, gVar3, sVar5, dVar3);
                m3.i.C(tVarC3, gVar4, sVar5);
                String strValueOf = String.valueOf(badgeProgress.getCurrentProgress());
                u0 u0Var2 = lv.v.f28275o;
                r9.d(strValueOf, null, badgeProgress.getCurrentProgress() == 0 ? lv.s.E : j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(u0Var2, 0L, 0L, null, null, 0L, null, 3, 0L, null, null, 16744447), sVar5, 0, 0, 131066);
                r9.d(j4.s.f(badgeProgress.getMaxProgress(), ExpiryDateInput.SEPARATOR), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(u0Var2, lv.s.E, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar5, 0, 0, 131070);
                sVar4 = sVar5;
                sVar4.q(true);
                sVar4.q(false);
            }
            b4.q qVar5 = qVar2;
            b4.t tVarD5 = d2.c.D(qVar5, 0.0f, o30.e0.s(sVar4, R.dimen.spacing_2), 0.0f, o30.e0.s(sVar4, R.dimen.spacing_3), 5);
            String str4 = iVar2.f20453e;
            u0 u0Var3 = lv.v.f28274n;
            long j11 = lv.s.C;
            m3.s sVar6 = sVar4;
            r9.d(str4, tVarD5, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(u0Var3, j11, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar6, 0, 0, 131068);
            m3.s sVar7 = sVar6;
            int i11 = 12;
            if (badgeCTA == null) {
                sVar7.a0(803885238);
                z12 = false;
                sVar7.q(false);
                sVar2 = sVar7;
            } else {
                z12 = false;
                sVar7.a0(803885239);
                BadgeButton badgeButton = badgeCTA.getBadgeButton();
                if (badgeButton == null) {
                    sVar7.a0(-317655728);
                    sVar7.q(false);
                    sVar = sVar7;
                } else {
                    sVar7.a0(-317655727);
                    b4.t tVarD6 = d2.c.D(m2.d(qVar5, 1.0f), 0.0f, o30.e0.s(sVar7, R.dimen.spacing_2), 0.0f, o30.e0.s(sVar7, R.dimen.spacing_3), 5);
                    b2 b2Var = g3.p.f19254b;
                    g3.o oVarA = g3.p.a(j9, 0L, 0L, 0L, sVar7, 14);
                    Function1 function15 = function1;
                    boolean zF = sVar7.f(function15) | sVar7.h(badgeButton);
                    Object objM4 = sVar7.M();
                    if (zF || objM4 == obj4) {
                        objM4 = new i2.e(8, function15, badgeButton);
                        sVar7.k0(objM4);
                    }
                    s0.a((Function0) objM4, tVarD6, false, null, oVarA, null, null, b2Var, null, u3.e.e(-1013338779, sVar7, new a3.m2(badgeButton, i11)), sVar7, 805306368, 364);
                    m3.s sVar8 = sVar7;
                    z12 = false;
                    sVar8.q(false);
                    sVar = sVar8;
                }
                sVar.q(z12);
                sVar2 = sVar;
            }
            sVar2.q(true);
            if (badgeCTA == null) {
                sVar2.a0(-1159871612);
                sVar2.q(z12);
                z13 = true;
                r152 = sVar2;
            } else {
                sVar2.a0(-1159871611);
                DiscoverBucket badgeBucket = badgeCTA.getBadgeBucket();
                if (badgeBucket == null) {
                    sVar2.a0(-226352514);
                    sVar2.q(z12);
                    z13 = true;
                    r15 = sVar2;
                } else {
                    sVar2.a0(-226352513);
                    b4.t tVarD7 = d2.c.D(m2.t(m2.d(qVar5, 1.0f), 3), 0.0f, 0.0f, 0.0f, o30.e0.s(sVar2, R.dimen.spacing_3), 7);
                    d2.y yVarA3 = d2.w.a(dVar, iVar, sVar2, 0);
                    int iHashCode4 = Long.hashCode(sVar2.T);
                    u3.i iVarL4 = sVar2.l();
                    b4.t tVarC4 = b4.a.c(tVarD7, sVar2);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(yVarA3, gVar, sVar2);
                    m3.i.C(iVarL4, gVar2, sVar2);
                    w.a0.y(iHashCode4, sVar2, gVar3, sVar2, dVar3);
                    m3.i.C(tVarC4, gVar4, sVar2);
                    ?? r302 = sVar2;
                    r9.d(badgeBucket.getTitle(), d2.c.C(m2.d(qVar5, 1.0f), o30.e0.s(sVar2, R.dimen.spacing_3), o30.e0.s(sVar2, R.dimen.spacing_3), o30.e0.s(sVar2, R.dimen.spacing_3), o30.e0.s(sVar2, R.dimen.spacing_1_5)), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(lv.v.l, j11, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), r302, 0, 0, 131068);
                    ArrayList<BasicItem> items = badgeBucket.getItems();
                    if (items != null) {
                        arrayList = new ArrayList();
                        for (Object obj6 : items) {
                            if (obj6 instanceof Item) {
                                arrayList.add(obj6);
                            }
                        }
                    } else {
                        arrayList = n0.f26529a;
                    }
                    b4.t tVarD8 = m2.d(qVar5, 1.0f);
                    b2 b2VarE = d2.c.e(16, 0.0f, 12, 0.0f, 10);
                    boolean zH2 = r302.h(arrayList) | r302.f(function13) | r302.f(function14);
                    Object objM5 = r302.M();
                    if (zH2 || objM5 == obj4) {
                        objM5 = new gn.k(arrayList, function13, function14, 1);
                        r302.k0(objM5);
                    }
                    ox.h.d(tVarD8, null, b2VarE, false, null, null, null, false, null, (Function1) objM5, r302, 390, 506);
                    ?? r153 = r302;
                    z13 = true;
                    r153.q(true);
                    z12 = false;
                    r153.q(false);
                    r15 = r153;
                }
                r15.q(z12);
                r152 = r15;
            }
            r152.q(z13);
        } else {
            sVar3.U();
        }
        return Unit.f26487a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        List list = (List) this.f8605e;
        v80.b0 b0Var = (v80.b0) this.f8602b;
        w6 w6Var = (w6) this.f8603c;
        Function0 function0 = (Function0) this.f8604d;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b4.q qVar = b4.q.f5711a;
            int i11 = 3;
            b4.t tVarA = d2.c.A(m2.t(m2.d(qVar, 1.0f), 3), lv.t.f28253g, lv.t.f28255i);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            String strU = o30.f0.U(sVar, R.string.charity_home_bottomsheet_welcome_title);
            u0 u0Var = lv.v.f28264c;
            long j9 = lv.s.f28217b;
            float f11 = lv.t.f28254h;
            r9.d(strU, d2.c.D(qVar, 0.0f, 0.0f, 0.0f, f11, 7), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 432, 12582912, 131064);
            r9.d(o30.f0.H(R.plurals.charity_home_bottomsheet_welcome_body, sVar, list.size()), d2.c.D(qVar, 0.0f, 0.0f, 0.0f, f11, 7), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 432, 12582912, 130040);
            b4.t tVarD = m2.d(qVar, 1.0f);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            b4.t tVarE = b3.i.e(1.0f, tVarD, false);
            boolean zH = sVar.h(list);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                objM = new f3(list, 1);
                sVar.k0(objM);
            }
            ox.h.c(tVarE, null, null, null, null, null, false, null, (Function1) objM, sVar, 0, 510);
            String strU2 = o30.f0.U(sVar, R.string.charity_home_bottomsheet_welcome_button);
            b4.t tVarD2 = d2.c.D(m2.d(qVar, 1.0f), 0.0f, f11, 0.0f, 0.0f, 13);
            boolean zH2 = sVar.h(b0Var) | sVar.f(w6Var) | sVar.f(function0);
            Object objM2 = sVar.M();
            if (zH2 || objM2 == fVar) {
                objM2 = new j3(b0Var, w6Var, function0, i11);
                sVar.k0(objM2);
            }
            v0.n.l(tVarD2, strU2, null, null, null, false, false, null, null, (Function0) objM2, sVar, 6, 508);
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f8602b;
        String str2 = (String) this.f8603c;
        String str3 = (String) this.f8604d;
        CharityPlanCollectorType charityPlanCollectorType = (CharityPlanCollectorType) this.f8605e;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            b4.q qVar = b4.q.f5711a;
            float f11 = 16;
            b4.t tVarZ = d2.c.z(m2.d(qVar, 1.0f), f11);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
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
            b4.t tVarD = d2.c.D(qVar, 0.0f, 0.0f, f11, 0.0f, 11);
            l2.f fVar = l2.g.f26790a;
            gd.o.c(str, "PlanStoreLogo", v1.n.k(v1.n.j(m2.m(f4.g.b(tVarD, fVar), 40), lv.s.J, i4.g0.f23254b), (float) 0.8d, lv.s.H, fVar), null, x0.z(R.drawable.gfx_tgtg_logo_green_small, sVar, 0), null, z4.l.f47172g, 0.0f, null, sVar, 32816, 6, 31720);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(qVar, sVar);
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
            b4.t tVarJ = d2.j(m2.t(m2.d(qVar, 1.0f), 3), "PlanStoreNameBranch");
            String strM = r8.k.m(str2, " - ", str3);
            u0 u0Var = lv.v.f28277q;
            long j9 = lv.s.C;
            r9.d(strM, tVarJ, j9, 0L, null, 0L, null, new x5.k(5), 0L, 2, false, 1, 0, null, u0Var, sVar, 432, 12607872, 109560);
            r9.d(o30.f0.U(sVar, charityPlanCollectorType.getNameRes()), m2.t(m2.d(qVar, 1.0f), 3), j9, 0L, null, 0L, null, new x5.k(5), 0L, 2, false, 1, 0, null, lv.v.f28276p, sVar, 432, 12607872, 109560);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0160  */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r55, java.lang.Object r56, java.lang.Object r57) {
        /*
            Method dump skipped, instruction units count: 1260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.x.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        boolean z11;
        String strA;
        x60.m mVar = (x60.m) this.f8605e;
        DiscountVoucher discountVoucher = (DiscountVoucher) this.f8602b;
        x60.j jVar = (x60.j) this.f8603c;
        x60.h hVar = (x60.h) this.f8604d;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            float f11 = mVar.f44017n;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarZ = d2.c.z(qVar, f11);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarZ, sVar);
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
            v1.n.d(x0.z(R.drawable.percent_discount, sVar, 0), null, d2.c.B(qVar, 0.0f, mVar.l, 1), null, null, 0.0f, null, sVar, 56, 120);
            d2.c.f(m2.m(qVar, mVar.f44015k), sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, true);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(n1Var, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            r9.d(discountVoucher.getName(), null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43958g, sVar, 0, 0, 131066);
            m3.s sVar2 = sVar;
            String strR = rs.k.r(discountVoucher, sVar2);
            if (strR == null) {
                sVar2.a0(157917159);
                z11 = false;
                sVar2.q(false);
            } else {
                sVar2.a0(157917160);
                r9.d(strR, null, rs.k.s(discountVoucher, sVar2), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, rs.k.t(discountVoucher, sVar2), sVar2, 0, 0, 131066);
                sVar2 = sVar2;
                z11 = false;
                sVar2.q(false);
            }
            sVar2.q(true);
            if (discountVoucher.getDiscountPercentage() != null) {
                sVar2.a0(-901003278);
                strA = d70.a.a(discountVoucher.getDiscountPercentage().doubleValue(), sVar2);
                sVar2.q(z11);
            } else {
                sVar2.a0(-900889570);
                sVar2.q(z11);
                strA = "-";
            }
            m3.s sVar3 = sVar2;
            r9.d(o30.f0.T(R.string.voucher_discount_value_off, new Object[]{strA}, sVar2), null, hVar.Y, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43959h, sVar3, 0, 0, 131066);
            sVar3.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        x60.m mVar = (x60.m) this.f8605e;
        CountryBasedVoucher countryBasedVoucher = (CountryBasedVoucher) this.f8602b;
        x60.j jVar = (x60.j) this.f8603c;
        x60.h hVar = (x60.h) this.f8604d;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            float f11 = mVar.f44017n;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(d2.c.z(qVar, f11), 1.0f);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
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
            v1.n.d(x0.z(R.drawable.voucher_icon_small, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            d2.c.f(m2.m(qVar, mVar.f44015k), sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, true);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(n1Var, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            r9.d(countryBasedVoucher.getName(), null, hVar.Y, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43959h, sVar, 0, 0, 131066);
            m3.s sVar2 = sVar;
            String strR = rs.k.r(countryBasedVoucher, sVar2);
            if (strR == null) {
                sVar2.a0(-2120037388);
                sVar2.q(false);
            } else {
                sVar2.a0(-2120037387);
                r9.d(strR, null, rs.k.s(countryBasedVoucher, sVar2), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, rs.k.t(countryBasedVoucher, sVar2), sVar2, 0, 0, 131066);
                sVar2 = sVar2;
                sVar2.q(false);
            }
            sVar2.q(true);
            sVar2.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.x.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        PageHeaderGeometry pageHeaderGeometry = (PageHeaderGeometry) this.f8605e;
        PageHeaderColors pageHeaderColors = (PageHeaderColors) this.f8604d;
        String str = (String) this.f8602b;
        String str2 = (String) this.f8603c;
        m3.n nVar = (m3.n) obj2;
        ((Integer) obj3).getClass();
        ((s1.z) obj).getClass();
        d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, nVar, 0);
        m3.s sVar = (m3.s) nVar;
        int iHashCode = Long.hashCode(sVar.T);
        u3.i iVarL = sVar.l();
        b4.q qVar = b4.q.f5711a;
        b4.t tVarC = b4.a.c(qVar, nVar);
        b5.j.R.getClass();
        b5.h hVar = b5.i.f5839b;
        sVar.e0();
        if (sVar.S) {
            sVar.k(hVar);
        } else {
            sVar.n0();
        }
        m3.i.C(yVarA, b5.i.f5843f, nVar);
        m3.i.C(iVarL, b5.i.f5842e, nVar);
        m3.i.v(nVar, Integer.valueOf(iHashCode), b5.i.f5844g);
        m3.i.z(nVar, b5.i.f5845h);
        m3.i.C(tVarC, b5.i.f5841d, nVar);
        u0 collapsedTitleStyle = pageHeaderGeometry.getCollapsedTitleStyle();
        long jM894getTitleColor0d7_KjU = pageHeaderColors.m894getTitleColor0d7_KjU();
        Object objM = sVar.M();
        if (objM == m3.m.f29332a) {
            objM = new rk.z(3);
            sVar.k0(objM);
        }
        r9.d(str, j5.r.c(qVar, false, (Function1) objM), jM894getTitleColor0d7_KjU, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, collapsedTitleStyle, nVar, 0, 0, 131064);
        if (str2 != null) {
            sVar.a0(-335846903);
            u0 subtitleStyle = pageHeaderGeometry.getSubtitleStyle();
            r9.d(str2, d2.c.D(qVar, 0.0f, pageHeaderGeometry.m903getSubtitleTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13), pageHeaderColors.m893getSupportingTextColor0d7_KjU(), 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, subtitleStyle, nVar, 0, 0, 131064);
            sVar.q(false);
        } else {
            sVar.a0(-335562850);
            sVar.q(false);
        }
        sVar.q(true);
        return Unit.f26487a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        g7 g7Var = (g7) this.f8605e;
        Ref.ObjectRef objectRef = (Ref.ObjectRef) this.f8602b;
        b1 b1Var = (b1) this.f8603c;
        b1 b1Var2 = (b1) this.f8604d;
        d7 d7Var = (d7) obj;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        d7Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((m3.s) nVar).f(d7Var) ? 4 : 2;
        }
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            float f11 = lv.t.f28251e;
            l7.b(d2.c.D(b4.q.f5711a, f11, 0.0f, f11, 100, 2), u3.e.e(-1286689170, sVar, new ti.a(g7Var, objectRef, b1Var, b1Var2, 1)), null, null, 0L, 0L, lv.s.f28227g, 0L, u3.e.e(2067183974, sVar, new ti.b(d7Var, 0)), sVar, 817889334, 380);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        ti.s sVar = (ti.s) this.f8605e;
        c3 c3Var = (c3) this.f8602b;
        c3 c3Var2 = (c3) this.f8603c;
        b1 b1Var = (b1) this.f8604d;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        m3.s sVar2 = (m3.s) nVar;
        if (sVar2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            List list = (List) c3Var.getValue();
            Set setV0 = CollectionsKt.v0((List) c3Var2.getValue());
            boolean zH = sVar2.h(sVar);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                objM = new ry.b(9, b1Var, sVar);
                sVar2.k0(objM);
            }
            Function1 function1 = (Function1) objM;
            boolean zH2 = sVar2.h(sVar);
            Object objM2 = sVar2.M();
            if (zH2 || objM2 == fVar) {
                objM2 = new rk.a0(7, sVar, b1Var);
                sVar2.k0(objM2);
            }
            ti.h.a(list, setV0, function1, (Function2) objM2, sVar2, 0);
        } else {
            sVar2.U();
        }
        return Unit.f26487a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f8602b;
        boolean z11 = ((oq.s) this.f8605e).f32953b;
        jd.f fVar = (jd.f) this.f8603c;
        C2CReferralResponse c2CReferralResponse = (C2CReferralResponse) this.f8604d;
        z1 z1Var = (z1) obj;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        z1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((m3.s) nVar).f(z1Var) ? 4 : 2;
        }
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            long j9 = lv.s.J;
            r0 r0Var = i4.g0.f23254b;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarR = d2.c.r(m2.c(m2.d(v1.n.r(d2.c.y(v1.n.j(qVar, j9, r0Var), z1Var), v1.n.q(sVar), true), 1.0f), 1.0f));
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar, iVar, sVar, 0);
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
            float f11 = lv.t.f28253g;
            b4.t tVarT = m2.t(m2.d(d2.c.z(qVar, f11), 1.0f), 3);
            d2.y yVarA2 = d2.w.a(dVar, iVar, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarT, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            String strT = o30.f0.T(R.string.c2c_p_a_i_a_o_screen_header, new Object[]{str}, sVar);
            String strT2 = o30.f0.T(z11 ? R.string.c2c_p_a_i_a_o_screen_parcel_description : R.string.c2c_p_a_i_a_o_screen_description, new Object[]{str}, sVar);
            boolean zH = sVar.h(fVar);
            Object objM = sVar.M();
            m3.f fVar2 = m3.m.f29332a;
            if (zH || objM == fVar2) {
                objM = new tq.b(fVar, 5);
                sVar.k0(objM);
            }
            Function0 function0 = (Function0) objM;
            boolean zH2 = sVar.h(fVar);
            Object objM2 = sVar.M();
            if (zH2 || objM2 == fVar2) {
                objM2 = new tq.b(fVar, 6);
                sVar.k0(objM2);
            }
            xz.b.e(strT, strT2, function0, (Function0) objM2, sVar, 0);
            r9.d(o30.f0.U(sVar, R.string.c2c_v3_invite_friends_expiry_date_title), d2.c.D(m2.d(qVar, 1.0f), 0.0f, lv.t.f28256j, 0.0f, f11, 5), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28278r, sVar, 432, 12582912, 131064);
            C2CRewardDetails c2cReferralRewardDetails = c2CReferralResponse.getC2cReferralRewardDetails();
            int rewardUsageDuration = c2cReferralRewardDetails != null ? c2cReferralRewardDetails.getRewardUsageDuration() : 0;
            cg.u uVar = new cg.u(R.drawable.ic_invite_friends_invite, o30.f0.U(sVar, R.string.c2c_p_a_i_a_o_screen_info_item_invite_title), o30.f0.U(sVar, z11 ? R.string.c2c_p_a_i_a_o_screen_parcel_info_item_invite_body : R.string.c2c_p_a_i_a_o_screen_info_item_invite_body), (String) null, (String) null, (Function0) null, 56);
            cg.u uVar2 = new cg.u(R.drawable.ic_invite_friends_signup, o30.f0.U(sVar, R.string.c2c_p_a_i_a_o_screen_info_item_signup_title), o30.f0.U(sVar, R.string.c2c_p_a_i_a_o_screen_info_item_signup_body), (String) null, (String) null, (Function0) null, 56);
            String strU = o30.f0.U(sVar, R.string.c2c_v3_invite_friends_perks_item_notification_title);
            String strU2 = o30.f0.U(sVar, R.string.c2c_v3_invite_friends_perks_item_notification_body);
            String strU3 = o30.f0.U(sVar, R.string.c2c_v3_invite_friends_perks_item_notification_link);
            boolean zH3 = sVar.h(fVar);
            Object objM3 = sVar.M();
            if (zH3 || objM3 == fVar2) {
                objM3 = new tq.b(fVar, 7);
                sVar.k0(objM3);
            }
            cg.u uVar3 = new cg.u(R.drawable.ic_invite_friends_notification, strU, strU2, (String) null, strU3, (Function0) objM3, 8);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            y9.w.g(kotlin.collections.d0.h(uVar, uVar2, uVar3, new cg.u(R.drawable.ic_invite_friends_usage, String.format(o30.f0.U(sVar, R.string.c2c_p_a_i_a_o_screen_perks_item_usage_title), Arrays.copyOf(new Object[]{Integer.valueOf(rewardUsageDuration)}, 1)), String.format(o30.f0.U(sVar, R.string.c2c_p_a_i_a_o_screen_perks_item_usage_body), Arrays.copyOf(new Object[]{Integer.valueOf(rewardUsageDuration)}, 1)), (String) null, (String) null, (Function0) null, 120)), sVar, 0);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        x60.m mVar = (x60.m) this.f8605e;
        float f11 = mVar.f44015k;
        d7 d7Var = (d7) this.f8602b;
        x60.j jVar = (x60.j) this.f8603c;
        x60.h hVar = (x60.h) this.f8604d;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            float f12 = mVar.f44017n;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarA = d2.c.A(qVar, f11, f12);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarA, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(d7Var.f18461a.f18537a, new n1(1.0f, true), hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43958g, sVar, 0, 0, 131064);
            d2.c.f(m2.m(qVar, f11), sVar);
            String str = d7Var.f18461a.f18538b;
            if (str == null) {
                sVar.a0(1170768535);
                sVar.q(false);
            } else {
                sVar.a0(1170768536);
                boolean zF = sVar.f(d7Var);
                Object objM = sVar.M();
                if (zF || objM == m3.m.f29332a) {
                    objM = new b7(d7Var, 1);
                    sVar.k0(objM);
                }
                s0.n((Function0) objM, null, false, null, null, null, null, u3.e.e(-2075400350, sVar, new ap.e(jVar, hVar, str, 23)), sVar, 805306368, 510);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        f2.c0 c0Var = (f2.c0) this.f8605e;
        ArrayList arrayList = (ArrayList) this.f8602b;
        BasketManager basketManager = (BasketManager) this.f8603c;
        um.u uVar = (um.u) this.f8604d;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
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
            r9.d(r8.k.f(lv.t.f28255i, R.string.mnu_basket_adjust_order_title, qVar, sVar, sVar), null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28271j, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            d2.c.f(m2.m(qVar, f11), sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, false);
            boolean zH = sVar.h(arrayList);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                objM = new v2(3, arrayList);
                sVar.k0(objM);
            }
            ox.h.c(n1Var, c0Var, null, null, null, null, false, null, (Function1) objM, sVar, 0, 508);
            d2.c.f(m2.m(qVar, f11), sVar);
            b4.t tVarD2 = m2.d(qVar, 1.0f);
            String strU = o30.f0.U(sVar, R.string.mnu_basket_screen_update_basket_cta);
            lv.q qVar2 = lv.q.REGULAR;
            lv.e eVar = lv.e.LARGE;
            boolean zH2 = sVar.h(basketManager) | sVar.h(arrayList) | sVar.h(uVar);
            Object objM2 = sVar.M();
            if (zH2 || objM2 == fVar) {
                objM2 = new lw.o(basketManager, arrayList, uVar, 27);
                sVar.k0(objM2);
            }
            v0.n.l(tVarD2, strU, null, qVar2, eVar, false, false, null, null, (Function0) objM2, sVar, 27654, 484);
            b3.i.y(qVar, f11, sVar, true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        BasketManager basketManager = (BasketManager) this.f8605e;
        ym.z zVar = (ym.z) this.f8602b;
        b1 b1Var = (b1) this.f8603c;
        i1 i1Var = (i1) this.f8604d;
        String str = (String) obj;
        int iIntValue = ((Integer) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        str.getClass();
        if (zBooleanValue && iIntValue != basketManager.getQuantity(str)) {
            basketManager.setQuantity(str, iIntValue, iIntValue > basketManager.getQuantity(str) ? LatestBasketInteraction.ADD : LatestBasketInteraction.REMOVE, LatestInteractionOrigin.SCREEN_BASKET);
            zVar.i(ItemId.m198constructorimpl(str), iIntValue, false);
            b1Var.setValue(Boolean.TRUE);
            i1Var.i(i1Var.h() + 1);
        }
        return Unit.f26487a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        AddPhoneNumberFragment addPhoneNumberFragment = (AddPhoneNumberFragment) this.f8605e;
        b1 b1Var = (b1) this.f8602b;
        b1 b1Var2 = (b1) this.f8603c;
        h1 h1Var = (h1) this.f8604d;
        m3.n nVar = (m3.n) obj2;
        ((Integer) obj3).getClass();
        ((s1.z) obj).getClass();
        b4.t tVarD = m2.d(d2.u.f13938a.a(d2.c.B(b4.q.f5711a, 16, 0.0f, 2), b4.d.f5690h), 1.0f);
        l2.f fVarB = l2.g.b(20);
        b2 b2Var = g3.p.f19253a;
        g3.o oVarA = g3.p.a(lv.s.f28217b, 0L, 0L, 0L, nVar, 14);
        m3.s sVar = (m3.s) nVar;
        boolean zH = sVar.h(addPhoneNumberFragment);
        Object objM = sVar.M();
        if (zH || objM == m3.m.f29332a) {
            androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c cVar = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c(27, addPhoneNumberFragment, b1Var, b1Var2, h1Var);
            sVar.k0(cVar);
            objM = cVar;
        }
        s0.a((Function0) objM, tVarD, false, fVarB, oVarA, null, null, null, null, vo.f.f42508b, sVar, 805306368, 484);
        return Unit.f26487a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z11;
        boolean z12;
        Brand brand;
        Picture brandLogo;
        String currentUrl;
        String currentUrl2;
        Unit unit;
        boolean z13;
        com.google.firebase.messaging.a0 a0Var;
        int i11 = this.f8601a;
        int i12 = 12;
        boolean z14 = false;
        b4.t tVarF = b4.q.f5711a;
        int i13 = 19;
        m3.f fVar = m3.m.f29332a;
        int i14 = 1;
        Object obj4 = this.f8604d;
        Object obj5 = this.f8603c;
        Object obj6 = this.f8602b;
        Object obj7 = this.f8605e;
        switch (i11) {
            case 0:
                HighlightedItemMnuV2 highlightedItemMnuV2 = (HighlightedItemMnuV2) obj7;
                String str = (String) obj6;
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC = b4.a.c(tVarF, sVar);
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
                    b4.t tVarD = m2.d(m2.e(tVarF, 232), 0.5f);
                    Picture coverPicture = highlightedItemMnuV2.getItem().getCoverPicture();
                    String currentUrl3 = coverPicture != null ? coverPicture.getCurrentUrl() : null;
                    c1 c1Var = z4.l.f47166a;
                    gd.o.a(currentUrl3, null, tVarD, c1Var, sVar, 1573296, 0, 1976);
                    b4.t tVarD2 = m2.d(m2.c(tVarF, 1.0f), 1.0f);
                    long j9 = lv.s.f28225f;
                    r0 r0Var = i4.g0.f23254b;
                    b4.t tVarJ = v1.n.j(tVarD2, j9, r0Var);
                    z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    u3.i iVarL2 = sVar.l();
                    b4.t tVarC2 = b4.a.c(tVarJ, sVar);
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
                    b4.t tVarD3 = m2.d(m2.c(tVarF, 1.0f), 1.0f);
                    float f11 = lv.t.f28252f;
                    b4.t tVarA = d2.c.A(tVarD3, f11, lv.t.f28253g);
                    d2.y yVarA = d2.w.a(d2.i.f13805e, b4.d.f5695n, sVar, 54);
                    int iHashCode3 = Long.hashCode(sVar.T);
                    u3.i iVarL3 = sVar.l();
                    b4.t tVarC3 = b4.a.c(tVarA, sVar);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(yVarA, gVar, sVar);
                    m3.i.C(iVarL3, gVar2, sVar);
                    w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
                    m3.i.C(tVarC3, gVar4, sVar);
                    ManufacturerItemProperties manufacturerItemProperties = highlightedItemMnuV2.getItem().getManufacturerItemProperties();
                    String currentUrl4 = (manufacturerItemProperties == null || (brand = manufacturerItemProperties.getBrand()) == null || (brandLogo = brand.getBrandLogo()) == null) ? null : brandLogo.getCurrentUrl();
                    if (currentUrl4 == null) {
                        sVar.a0(1622404581);
                        z11 = false;
                        sVar.q(false);
                    } else {
                        sVar.a0(1622404582);
                        gd.o.a(currentUrl4, null, f4.g.b(m2.m(tVarF, 48), l2.g.f26790a), c1Var, sVar, 1572912, 0, 1976);
                        z11 = false;
                        sVar.q(false);
                    }
                    d2.c.f(m2.e(tVarF, f11), sVar);
                    if (str == null) {
                        sVar.a0(1622999161);
                        sVar.q(z11);
                    } else {
                        sVar.a0(1622999162);
                        r9.d(str, null, lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(lv.v.f28276p, 0L, 0L, null, null, 0L, x5.l.f43855d, 0, 0L, null, null, 16773119), sVar, MLKEMEngine.KyberPolyBytes, 0, 131066);
                        z11 = false;
                        sVar.q(false);
                    }
                    if (str2 == null) {
                        sVar.a0(1623457248);
                        sVar.q(z11);
                    } else {
                        sVar.a0(1623457249);
                        r9.d(str2, null, lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, u0.a(lv.v.f28264c, 0L, b0.a0.C(22), null, null, 0L, null, 0, 0L, null, null, 16777213), sVar, MLKEMEngine.KyberPolyBytes, 24576, 114682);
                        z11 = false;
                        sVar.q(false);
                    }
                    d2.c.f(m2.e(tVarF, f11), sVar);
                    String itemName = highlightedItemMnuV2.getItem().getItemName();
                    if (itemName == null) {
                        sVar.a0(1623977335);
                        sVar.q(z11);
                    } else {
                        sVar.a0(1623977336);
                        r9.d(itemName, null, lv.s.J, 0L, null, 0L, null, new x5.k(3), 0L, 2, false, 2, 0, null, lv.v.l, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 109562);
                        z11 = false;
                        sVar.q(false);
                    }
                    ManufacturerItemProperties manufacturerItemProperties2 = highlightedItemMnuV2.getItem().getManufacturerItemProperties();
                    if ((manufacturerItemProperties2 != null ? manufacturerItemProperties2.getBottleDeposit() : null) == null) {
                        sVar.a0(1624574767);
                        sVar.q(z11);
                        z12 = true;
                    } else {
                        sVar.a0(1624574768);
                        d2.c.f(m2.e(tVarF, f11), sVar);
                        b4.t tVarA2 = d2.c.A(v1.n.j(f4.g.b(tVarF, l2.g.b(8)), lv.s.I, r0Var), lv.t.f28251e, lv.t.f28249c);
                        b4.k kVar = b4.d.f5687e;
                        z4.u0 u0VarD2 = d2.p.d(kVar, false);
                        int iHashCode4 = Long.hashCode(sVar.T);
                        u3.i iVarL4 = sVar.l();
                        b4.t tVarC4 = b4.a.c(tVarA2, sVar);
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(hVar);
                        } else {
                            sVar.n0();
                        }
                        m3.i.C(u0VarD2, gVar, sVar);
                        m3.i.C(iVarL4, gVar2, sVar);
                        w.a0.y(iHashCode4, sVar, gVar3, sVar, dVar);
                        m3.i.C(tVarC4, gVar4, sVar);
                        r9.d(mv.r0.f((Context) sVar.j(v0.f7390b), str3), d2.u.f13938a.a(tVarF, kVar), lv.s.f28221d, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28277q, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110584);
                        z12 = true;
                        sVar.q(true);
                        sVar.q(false);
                    }
                    e0.f.D(sVar, z12, z12, z12);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 1:
                BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) obj7;
                String str4 = (String) obj6;
                String str5 = (String) obj5;
                String str6 = (String) obj4;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    d2.y yVarA2 = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
                    int iHashCode5 = Long.hashCode(sVar2.T);
                    u3.i iVarL5 = sVar2.l();
                    b4.t tVarC5 = b4.a.c(tVarF, sVar2);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(yVarA2, b5.i.f5843f, sVar2);
                    m3.i.C(iVarL5, b5.i.f5842e, sVar2);
                    m3.i.v(sVar2, Integer.valueOf(iHashCode5), b5.i.f5844g);
                    m3.i.z(sVar2, b5.i.f5845h);
                    m3.i.C(tVarC5, b5.i.f5841d, sVar2);
                    o30.e0.d(baseItemMnuV2, sVar2, 0);
                    o30.e0.g(baseItemMnuV2, sVar2, 0);
                    d2.c.f(m2.e(tVarF, lv.t.f28252f), sVar2);
                    ex.i.h(m2.d(m2.e(tVarF, 2), 1.0f), lv.s.H, sVar2, 54);
                    d2.c.f(m2.e(tVarF, lv.t.f28249c), sVar2);
                    o30.e0.l(baseItemMnuV2, str4, str5, str6, sVar2, 0);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
            case 2:
                at.h0 h0Var = (at.h0) obj7;
                a50.c cVar = (a50.c) obj6;
                WebView webView = (WebView) obj5;
                bt.b bVar = (bt.b) obj4;
                z1 z1Var = (z1) obj;
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                z1Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((m3.s) nVar3).f(z1Var) ? 4 : 2;
                }
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    b4.t tVarJ2 = v1.n.j(d2.c.y(m2.f13850c, z1Var), lv.s.J, i4.g0.f23254b);
                    z4.u0 u0VarD3 = d2.p.d(b4.d.f5687e, false);
                    int iHashCode6 = Long.hashCode(sVar3.T);
                    u3.i iVarL6 = sVar3.l();
                    b4.t tVarC6 = b4.a.c(tVarJ2, sVar3);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar3);
                    } else {
                        sVar3.n0();
                    }
                    m3.i.C(u0VarD3, b5.i.f5843f, sVar3);
                    m3.i.C(iVarL6, b5.i.f5842e, sVar3);
                    m3.i.v(sVar3, Integer.valueOf(iHashCode6), b5.i.f5844g);
                    m3.i.z(sVar3, b5.i.f5845h);
                    m3.i.C(tVarC6, b5.i.f5841d, sVar3);
                    if (h0Var instanceof at.e0) {
                        sVar3.a0(1430131967);
                        m5.a(null, 0L, 0.0f, 0L, 0, 0.0f, sVar3, 0, 63);
                        sVar3.q(false);
                    } else if (h0Var instanceof at.g0) {
                        sVar3.a0(1430246977);
                        t1.n((at.g0) h0Var, cVar, webView, bVar, sVar3, 0);
                        sVar3.q(false);
                    } else {
                        sVar3.a0(1430520552);
                        sVar3.q(false);
                    }
                    sVar3.q(true);
                } else {
                    sVar3.U();
                }
                return Unit.f26487a;
            case 3:
                d7 d7Var = (d7) obj7;
                d7 d7Var2 = (d7) obj5;
                g3.d2 d2Var = (g3.d2) obj4;
                String str7 = (String) obj6;
                Function2 function2 = (Function2) obj;
                m3.n nVar4 = (m3.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((m3.s) nVar4).h(function2) ? 4 : 2;
                }
                m3.s sVar4 = (m3.s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    boolean zAreEqual = Intrinsics.areEqual(d7Var, d7Var2);
                    t1.b1 b1VarD = s0.D(l3.f0.FastEffects, sVar4);
                    boolean zF = sVar4.f(d7Var) | sVar4.h(d2Var);
                    Object objM = sVar4.M();
                    Object obj8 = objM;
                    if (zF || objM == fVar) {
                        ep.l lVar = new ep.l(i12, d7Var, d2Var);
                        sVar4.k0(lVar);
                        obj8 = lVar;
                    }
                    Function0 function0 = (Function0) obj8;
                    Object objM2 = sVar4.M();
                    Object obj9 = objM2;
                    if (objM2 == fVar) {
                        t1.b bVarA = t1.c.a(zAreEqual ? 0.0f : 1.0f);
                        sVar4.k0(bVarA);
                        obj9 = bVarA;
                    }
                    t1.b bVar2 = (t1.b) obj9;
                    Boolean boolValueOf = Boolean.valueOf(zAreEqual);
                    boolean zH = sVar4.h(bVar2) | sVar4.g(zAreEqual) | sVar4.h(b1VarD) | sVar4.f(function0);
                    Object objM3 = sVar4.M();
                    if (zH || objM3 == fVar) {
                        ep.a0 a0Var2 = new ep.a0(bVar2, zAreEqual, b1VarD, function0, null);
                        sVar4.k0(a0Var2);
                        objM3 = a0Var2;
                    }
                    m3.i.h(boolValueOf, (Function2) objM3, sVar4);
                    t1.j jVar = bVar2.f39359c;
                    t1.b1 b1VarD2 = s0.D(l3.f0.FastSpatial, sVar4);
                    Object objM4 = sVar4.M();
                    Object obj10 = objM4;
                    if (objM4 == fVar) {
                        t1.b bVarA2 = t1.c.a(!zAreEqual ? 1.0f : 0.8f);
                        sVar4.k0(bVarA2);
                        obj10 = bVarA2;
                    }
                    t1.b bVar3 = (t1.b) obj10;
                    Boolean boolValueOf2 = Boolean.valueOf(zAreEqual);
                    boolean zH2 = sVar4.h(bVar3) | sVar4.g(zAreEqual) | sVar4.h(b1VarD2);
                    Object objM5 = sVar4.M();
                    if (zH2 || objM5 == fVar) {
                        b0.v vVar = new b0.v(bVar3, zAreEqual, b1VarD2, (x70.c) null, 4);
                        sVar4.k0(vVar);
                        objM5 = vVar;
                    }
                    m3.i.h(boolValueOf2, (Function2) objM5, sVar4);
                    t1.j jVar2 = bVar3.f39359c;
                    b4.t tVarQ = i4.g0.q(b4.q.f5711a, ((Number) jVar2.f39464b.getValue()).floatValue(), ((Number) jVar2.f39464b.getValue()).floatValue(), ((Number) jVar.f39464b.getValue()).floatValue(), 0.0f, null, 131064);
                    boolean zG = sVar4.g(zAreEqual) | sVar4.f(d7Var) | sVar4.f(str7);
                    Object objM6 = sVar4.M();
                    Object obj11 = objM6;
                    if (zG || objM6 == fVar) {
                        f6 f6Var = new f6(zAreEqual, str7, d7Var, 1);
                        sVar4.k0(f6Var);
                        obj11 = f6Var;
                    }
                    b4.t tVarC7 = j5.r.c(tVarQ, false, (Function1) obj11);
                    z4.u0 u0VarD4 = d2.p.d(b4.d.f5683a, false);
                    int iHashCode7 = Long.hashCode(sVar4.T);
                    u3.i iVarL7 = sVar4.l();
                    b4.t tVarC8 = b4.a.c(tVarC7, sVar4);
                    b5.j.R.getClass();
                    b5.h hVar4 = b5.i.f5839b;
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(hVar4);
                    } else {
                        sVar4.n0();
                    }
                    m3.i.C(u0VarD4, b5.i.f5843f, sVar4);
                    m3.i.C(iVarL7, b5.i.f5842e, sVar4);
                    b5.g gVar5 = b5.i.f5844g;
                    if (sVar4.S || !Intrinsics.areEqual(sVar4.M(), Integer.valueOf(iHashCode7))) {
                        e0.f.y(iHashCode7, sVar4, iHashCode7, gVar5);
                    }
                    m3.i.C(tVarC8, b5.i.f5841d, sVar4);
                    w.a0.w(iIntValue4 & 14, function2, sVar4, true);
                } else {
                    sVar4.U();
                }
                return Unit.f26487a;
            case 4:
                List<ii.h> list = (List) obj7;
                ii.h hVar5 = (ii.h) obj6;
                g9.f0 f0Var = (g9.f0) obj5;
                Integer num = (Integer) obj4;
                j2 j2Var = (j2) obj;
                m3.n nVar5 = (m3.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                j2Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((m3.s) nVar5).f(j2Var) ? 4 : 2;
                }
                m3.s sVar5 = (m3.s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    for (ii.h hVar6 : list) {
                        boolean zAreEqual2 = Intrinsics.areEqual(hVar5, hVar6);
                        long jL = cg.l(sVar5, R.color.neutral_60);
                        long jL2 = cg.l(sVar5, R.color.primary_30);
                        long jL3 = cg.l(sVar5, R.color.neutral_60);
                        long jL4 = cg.l(sVar5, R.color.primary_30);
                        long j11 = i4.v.f23310c;
                        long j12 = i4.v.f23315h;
                        c4 c4VarA = s0.A((p0) sVar5.j(g3.r0.f19375a));
                        if (jL4 == 16) {
                            jL4 = c4VarA.f18408a;
                        }
                        long j13 = jL4;
                        long j14 = jL2 != 16 ? jL2 : c4VarA.f18409b;
                        long j15 = j11 != 16 ? j11 : c4VarA.f18410c;
                        long j16 = jL3 != 16 ? jL3 : c4VarA.f18411d;
                        if (jL == 16) {
                            jL = c4VarA.f18412e;
                        }
                        c4 c4Var = new c4(j13, j14, j15, j16, jL, j12 != 16 ? j12 : c4VarA.f18413f, j12 != 16 ? j12 : c4VarA.f18414g);
                        boolean zH3 = sVar5.h(f0Var) | sVar5.f(hVar6);
                        Object objM7 = sVar5.M();
                        if (zH3 || objM7 == fVar) {
                            objM7 = new i2.e(5, f0Var, hVar6);
                            sVar5.k0(objM7);
                        }
                        j4.b(j2Var, zAreEqual2, (Function0) objM7, u3.e.e(1586659285, sVar5, new an.d(hVar5, hVar6, num, 22)), null, false, u3.e.e(654955058, sVar5, new y0(hVar6, i13)), false, c4Var, sVar5, (iIntValue5 & 14) | 1575936);
                    }
                } else {
                    sVar5.U();
                }
                return Unit.f26487a;
            case 5:
                Order order = (Order) obj7;
                Ref.ObjectRef objectRef = (Ref.ObjectRef) obj6;
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) obj5;
                Ref.LongRef longRef = (Ref.LongRef) obj4;
                m3.n nVar6 = (m3.n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar6 = (m3.s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    b4.t tVarB = d2.c.B(tVarF, 0.0f, lv.t.f28253g, 1);
                    Picture itemLogo = order.getItemLogo();
                    if (itemLogo == null || (currentUrl2 = itemLogo.getCurrentUrl()) == null) {
                        Picture storeLogo = order.getStoreLogo();
                        currentUrl = storeLogo != null ? storeLogo.getCurrentUrl() : null;
                    } else {
                        currentUrl = currentUrl2;
                    }
                    String storeNameAndBranch = order.getStoreNameAndBranch();
                    if (storeNameAndBranch == null) {
                        storeNameAndBranch = "";
                    }
                    ii.q.b(tVarB, currentUrl, storeNameAndBranch, (String) objectRef.element, (Integer) objectRef2.element, longRef.element, sVar6, 0, 0);
                } else {
                    sVar6.U();
                }
                return Unit.f26487a;
            case 6:
                ArrayList arrayList = (ArrayList) obj7;
                ArrayList arrayList2 = (ArrayList) obj6;
                ArrayList arrayList3 = (ArrayList) obj5;
                b1 b1Var = (b1) obj4;
                m3.n nVar7 = (m3.n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                boolean z15 = (iIntValue7 & 17) != 16;
                int i15 = iIntValue7 & 1;
                m3.s sVar7 = (m3.s) nVar7;
                if (sVar7.R(i15, z15)) {
                    ii.l.m((List) b1Var.getValue(), arrayList, arrayList2, arrayList3, sVar7, 0);
                } else {
                    sVar7.U();
                }
                return Unit.f26487a;
            case 7:
                return a(obj, obj2, obj3);
            case 8:
                gh.l lVar2 = (gh.l) obj7;
                ih.i iVar = (ih.i) obj6;
                Function1 function1 = (Function1) obj5;
                Function0 function02 = (Function0) obj4;
                g2.l lVar3 = (g2.l) obj;
                m3.n nVar8 = (m3.n) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                lVar3.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((m3.s) nVar8).f(lVar3) ? 4 : 2;
                }
                m3.s sVar8 = (m3.s) nVar8;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    Badge badge = lVar2.f20458a;
                    if (badge == null) {
                        sVar8.a0(1448765724);
                        sVar8.q(false);
                        unit = null;
                    } else {
                        sVar8.a0(1448765725);
                        boolean zF2 = sVar8.f(function1);
                        Object objM8 = sVar8.M();
                        if (zF2 || objM8 == fVar) {
                            objM8 = new defpackage.d(function1, 21);
                            sVar8.k0(objM8);
                        }
                        jh.f.e(null, badge, iVar, (Function1) objM8, sVar8, 0);
                        sVar8.q(false);
                        unit = Unit.f26487a;
                    }
                    if (unit == null) {
                        sVar8.a0(1449051638);
                        boolean zF3 = sVar8.f(function02);
                        Object objM9 = sVar8.M();
                        if (zF3 || objM9 == fVar) {
                            objM9 = new j5(19, function02);
                            sVar8.k0(objM9);
                        }
                        jh.f.f(0, null, (Function0) objM9, sVar8);
                        sVar8.q(false);
                    } else {
                        sVar8.a0(-1200191967);
                        sVar8.q(false);
                    }
                } else {
                    sVar8.U();
                }
                return Unit.f26487a;
            case 9:
                v2.h hVar7 = (v2.h) obj6;
                g4.l lVar4 = (g4.l) obj5;
                Function2 function22 = (Function2) obj4;
                m3.n nVar9 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                b4.t tVarM = m2.m(tVarF, ((x60.l) obj7).f43995g);
                z4.u0 u0VarD5 = d2.p.d(b4.d.f5683a, false);
                m3.s sVar9 = (m3.s) nVar9;
                int iHashCode8 = Long.hashCode(sVar9.T);
                u3.i iVarL8 = sVar9.l();
                b4.t tVarC9 = b4.a.c(tVarM, nVar9);
                b5.j.R.getClass();
                b5.h hVar8 = b5.i.f5839b;
                sVar9.e0();
                if (sVar9.S) {
                    sVar9.k(hVar8);
                } else {
                    sVar9.n0();
                }
                m3.i.C(u0VarD5, b5.i.f5843f, nVar9);
                m3.i.C(iVarL8, b5.i.f5842e, nVar9);
                m3.i.v(nVar9, Integer.valueOf(iHashCode8), b5.i.f5844g);
                m3.i.z(nVar9, b5.i.f5845h);
                m3.i.C(tVarC9, b5.i.f5841d, nVar9);
                boolean zF4 = sVar9.f(hVar7) | sVar9.h(lVar4) | sVar9.f(function22);
                Object objM10 = sVar9.M();
                if (zF4 || objM10 == fVar) {
                    objM10 = new a0.g(hVar7, lVar4, function22, 26);
                    sVar9.k0(objM10);
                }
                SubtlePantryIconButtonKt.TinySubtlePantryIconButton((Function0) objM10, null, null, false, false, kg.a.f26365a, nVar9, 196608, 30);
                sVar9.q(true);
                return Unit.f26487a;
            case 10:
                b1 b1Var2 = (b1) obj7;
                CharityItem charityItem = (CharityItem) obj6;
                Function1 function12 = (Function1) obj5;
                Function1 function13 = (Function1) obj4;
                m3.n nVar10 = (m3.n) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                m3.s sVar10 = (m3.s) nVar10;
                if (sVar10.R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    ki.j.m(3, ki.j.b(b1Var2), u3.e.e(856311948, sVar10, new ap.e(charityItem, function12, function13, i12)), sVar10, 390);
                } else {
                    sVar10.U();
                }
                return Unit.f26487a;
            case 11:
                hp.g gVar6 = (hp.g) obj7;
                f2.c0 c0Var = (f2.c0) obj6;
                Function1 function14 = (Function1) obj5;
                h1 h1Var = (h1) obj4;
                z1 z1Var2 = (z1) obj;
                m3.n nVar11 = (m3.n) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                z1Var2.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= ((m3.s) nVar11).f(z1Var2) ? 4 : 2;
                }
                m3.s sVar11 = (m3.s) nVar11;
                if (sVar11.R(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    lp.d.p(gVar6, c0Var, h1Var.h(), function14, d2.c.y(tVarF, z1Var2), sVar11, 0);
                } else {
                    sVar11.U();
                }
                return Unit.f26487a;
            case 12:
                i4.r rVar = (i4.r) obj7;
                e1 e1Var = (e1) obj6;
                r5.y yVar = (r5.y) obj5;
                r5.s sVar12 = (r5.s) obj4;
                b4.t tVar = (b4.t) obj;
                ((Integer) obj3).getClass();
                m3.s sVar13 = (m3.s) ((m3.n) obj2);
                sVar13.a0(-84507373);
                boolean zBooleanValue = ((Boolean) sVar13.j(x1.f7430w)).booleanValue();
                boolean zG2 = sVar13.g(zBooleanValue);
                Object objM11 = sVar13.M();
                if (zG2 || objM11 == fVar) {
                    objM11 = new w2.q(zBooleanValue);
                    sVar13.k0(objM11);
                }
                w2.q qVar = (w2.q) objM11;
                if ((rVar instanceof i4.x0) && ((i4.x0) rVar).f23332a == 16) {
                    i14 = 0;
                }
                if (((q2) ((x3) sVar13.j(x1.f7427t))).b() && e1Var.b() && t0.d(yVar.f37715b) && i14 != 0) {
                    sVar13.a0(-707487962);
                    m5.h hVar9 = yVar.f37714a;
                    t0 t0Var = new t0(yVar.f37715b);
                    boolean zH4 = sVar13.h(qVar);
                    Object objM12 = sVar13.M();
                    if (zH4 || objM12 == fVar) {
                        objM12 = new h2.b1(qVar, z14 ? 1 : 0, 13);
                        sVar13.k0(objM12);
                    }
                    m3.i.g(hVar9, t0Var, (Function2) objM12, sVar13);
                    boolean zH5 = sVar13.h(qVar) | sVar13.h(sVar12) | sVar13.f(yVar) | sVar13.h(e1Var) | sVar13.f(rVar);
                    Object objM13 = sVar13.M();
                    if (zH5 || objM13 == fVar) {
                        a1 a1Var = new a1(qVar, sVar12, yVar, e1Var, rVar, 5);
                        sVar13.k0(a1Var);
                        objM13 = a1Var;
                    }
                    tVarF = f4.g.f(tVar, (Function1) objM13);
                    z13 = false;
                    sVar13.q(false);
                } else {
                    z13 = false;
                    sVar13.a0(-705473241);
                    sVar13.q(false);
                }
                sVar13.q(z13);
                return tVarF;
            case 13:
                ng.d dVar2 = (ng.d) obj7;
                b1 b1Var3 = (b1) obj5;
                b1 b1Var4 = (b1) obj4;
                m3.n nVar12 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                List list2 = (List) ((b1) obj6).getValue();
                if (list2 == null) {
                    list2 = (List) b1Var3.getValue();
                }
                dVar2.r(null, list2, (Server) b1Var4.getValue(), nVar12, 0);
                return Unit.f26487a;
            case 14:
                return b(obj, obj2, obj3);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return c(obj, obj2, obj3);
            case 16:
                MapBottomSheet mapBottomSheet = (MapBottomSheet) obj7;
                com.google.firebase.messaging.a0 a0Var3 = (com.google.firebase.messaging.a0) obj6;
                tm.e eVar = (tm.e) obj5;
                b1 b1Var5 = (b1) obj4;
                m3.n nVar13 = (m3.n) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                int i16 = MapBottomSheet.f9095y;
                ((d2.t) obj).getClass();
                m3.s sVar14 = (m3.s) nVar13;
                if (sVar14.R(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    Object objM14 = sVar14.M();
                    x70.c cVar2 = null;
                    if (objM14 == fVar) {
                        objM14 = m3.i.w(null);
                        sVar14.k0(objM14);
                    }
                    b1 b1Var6 = (b1) objM14;
                    Object objM15 = sVar14.M();
                    if (objM15 == fVar) {
                        objM15 = m3.i.w(Boolean.FALSE);
                        sVar14.k0(objM15);
                    }
                    b1 b1Var7 = (b1) objM15;
                    Float fValueOf = Float.valueOf(((z1.r) a0Var3.f12782e).f46655j.h());
                    boolean zF5 = sVar14.f(a0Var3);
                    Object objM16 = sVar14.M();
                    if (zF5 || objM16 == fVar) {
                        a0Var = a0Var3;
                        ao.e1 e1Var2 = new ao.e1(a0Var, b1Var6, b1Var7, cVar2, 15);
                        sVar14.k0(e1Var2);
                        objM16 = e1Var2;
                    } else {
                        a0Var = a0Var3;
                    }
                    m3.i.h(fValueOf, (Function2) objM16, sVar14);
                    boolean zBooleanValue2 = ((Boolean) b1Var7.getValue()).booleanValue();
                    pm.y sheetData = mapBottomSheet.getSheetData();
                    Long listScrollToTopRequestId = mapBottomSheet.getListScrollToTopRequestId();
                    boolean zE = eVar.f40311f.e();
                    boolean z16 = a0Var.I() == pm.j.Expanded;
                    boolean zBooleanValue3 = ((Boolean) b1Var5.getValue()).booleanValue();
                    Function1 function15 = mapBottomSheet.l;
                    Function1 function16 = mapBottomSheet.f9099m;
                    boolean zH6 = sVar14.h(mapBottomSheet);
                    Object objM17 = sVar14.M();
                    if (zH6 || objM17 == fVar) {
                        objM17 = new pm.n(mapBottomSheet, 0);
                        sVar14.k0(objM17);
                    }
                    pm.a.d(sheetData, listScrollToTopRequestId, zE, z16, zBooleanValue3, zBooleanValue2, function15, function16, (Function1) objM17, sVar14, 0);
                } else {
                    sVar14.U();
                }
                return Unit.f26487a;
            case 17:
                return d(obj, obj2, obj3);
            case 18:
                return e(obj, obj2, obj3);
            case 19:
                return f(obj, obj2, obj3);
            case 20:
                return g(obj, obj2, obj3);
            case 21:
                return h(obj, obj2, obj3);
            case 22:
                return i(obj, obj2, obj3);
            case 23:
                return j(obj, obj2, obj3);
            case 24:
                return k(obj, obj2, obj3);
            case 25:
                return l(obj, obj2, obj3);
            case 26:
                return m(obj, obj2, obj3);
            case 27:
                return n(obj, obj2, obj3);
            case 28:
                return o(obj, obj2, obj3);
            default:
                StoreSignupCardDetails storeSignupCardDetails = (StoreSignupCardDetails) obj7;
                mn.l lVar5 = (mn.l) obj6;
                Function0 function03 = (Function0) obj5;
                b1 b1Var8 = (b1) obj4;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                m3.s sVar15 = (m3.s) ((m3.n) obj2);
                boolean zH7 = sVar15.h(lVar5);
                Object objM18 = sVar15.M();
                if (zH7 || objM18 == fVar) {
                    objM18 = new nn.j(lVar5, b1Var8, i14);
                    sVar15.k0(objM18);
                }
                bx.k.h(storeSignupCardDetails, (Function0) objM18, function03, sVar15, 0);
                return Unit.f26487a;
        }
    }

    public /* synthetic */ x(Order order, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.LongRef longRef) {
        this.f8601a = 5;
        this.f8605e = order;
        this.f8602b = objectRef;
        this.f8603c = objectRef2;
        this.f8604d = longRef;
    }

    public /* synthetic */ x(int i11, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f8601a = i11;
        this.f8605e = obj;
        this.f8602b = obj2;
        this.f8603c = obj3;
        this.f8604d = obj4;
    }

    public /* synthetic */ x(d7 d7Var, d7 d7Var2, g3.d2 d2Var, String str) {
        this.f8601a = 3;
        this.f8605e = d7Var;
        this.f8603c = d7Var2;
        this.f8604d = d2Var;
        this.f8602b = str;
    }

    public /* synthetic */ x(gh.i iVar, Function1 function1, Function1 function12, Function1 function13) {
        this.f8601a = 7;
        this.f8605e = iVar;
        this.f8602b = function1;
        this.f8603c = function12;
        this.f8604d = function13;
    }

    public /* synthetic */ x(String str, String str2, String str3, CharityPlanCollectorType charityPlanCollectorType) {
        this.f8601a = 15;
        this.f8602b = str;
        this.f8603c = str2;
        this.f8604d = str3;
        this.f8605e = charityPlanCollectorType;
    }

    public /* synthetic */ x(String str, oq.s sVar, jd.f fVar, C2CReferralResponse c2CReferralResponse) {
        this.f8601a = 24;
        this.f8602b = str;
        this.f8605e = sVar;
        this.f8603c = fVar;
        this.f8604d = c2CReferralResponse;
    }
}
