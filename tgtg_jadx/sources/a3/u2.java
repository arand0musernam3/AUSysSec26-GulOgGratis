package a3;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.o0;
import com.app.tgtg.R;
import com.app.tgtg.feature.recipegenerator.RecipeGeneratorActivity;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.BasketIntroBannerMnu;
import com.app.tgtg.model.remote.item.response.IntroBanner;
import com.app.tgtg.model.remote.item.response.ItemMnu;
import com.app.tgtg.model.remote.item.response.SortingChoice;
import com.app.tgtg.model.remote.manufacturer.response.GetRecommendedManufacturerItemsResponse;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureType;
import g3.a9;
import g3.c4;
import g3.d7;
import g3.k4;
import g3.m6;
import g3.p4;
import g3.s6;
import g3.v3;
import g3.w5;
import g3.w6;
import g3.y8;
import g3.z6;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mv.a0;
import mv.z;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f587c;

    public /* synthetic */ u2(int i11, i80.n nVar, Object obj) {
        this.f585a = i11;
        this.f587c = nVar;
        this.f586b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        k8.d dVar;
        int i11 = this.f585a;
        int i12 = 11;
        int i13 = 9;
        b4.q qVar = b4.q.f5711a;
        m3.f fVar = m3.m.f29332a;
        final int i14 = 1;
        Object obj3 = this.f587c;
        Object obj4 = this.f586b;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                jf.e.m((b4.t) obj4, (u3.d) obj3, (m3.n) obj, m3.i.F(49));
                break;
            case 1:
                l3 l3Var = (l3) obj4;
                v80.b0 b0Var = (v80.b0) obj3;
                o2.a aVar = (o2.a) obj;
                Context context = (Context) obj2;
                boolean zJ = l3Var.j();
                m5.h hVarM = l3Var.m();
                String str = hVarM != null ? hVarM.f29538b : null;
                m5.t0 t0Var = l3Var.f468v;
                if (t0Var != null) {
                    long j9 = t0Var.f29650a;
                    r5.s sVar = l3Var.f449b;
                    t0Var = new m5.t0(m5.k0.b(sVar.r((int) (j9 >> 32)), sVar.r((int) (j9 & 4294967295L))));
                }
                e0.a(aVar, context, zJ, str, t0Var, l3Var.f456i, new y0(l3Var, b0Var, context, i14));
                break;
            case 2:
                ItemMnu itemMnu = (ItemMnu) obj4;
                ym.y yVar = (ym.y) obj3;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o30.e0.c(itemMnu.getItem(), yVar, sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
            case 3:
                i80.n nVar2 = (i80.n) obj3;
                Object obj5 = (b4.t) obj4;
                m3.n nVar3 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nVar2.invoke(obj5, sVar3, 0);
                } else {
                    sVar3.U();
                }
                break;
            case 4:
                Function0 function0 = (Function0) obj4;
                Integer num = (Integer) obj3;
                m3.n nVar4 = (m3.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                m3.s sVar4 = (m3.s) nVar4;
                if (!sVar4.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sVar4.U();
                } else if (function0 == null) {
                    sVar4.a0(590841861);
                    sVar4.q(false);
                } else {
                    sVar4.a0(590841862);
                    boolean zF = sVar4.f(function0);
                    Object objM = sVar4.M();
                    if (zF || objM == fVar) {
                        objM = new ar.d(12, function0);
                        sVar4.k0(objM);
                    }
                    g3.s0.h((Function0) objM, null, false, null, null, null, u3.e.e(2091337665, sVar4, new f1(num, 14)), sVar4, 1572864, 62);
                    sVar4.q(false);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                h0.g.e((BasketIntroBannerMnu) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                nx.d.b((IntroBanner) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                o30.e0.c((BaseItemMnuV2) obj4, (ym.y) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 8:
                z4.z1 z1Var = (z4.z1) obj;
                z5.a aVar2 = (z5.a) obj2;
                break;
            case 9:
                u3.d dVar2 = (u3.d) obj3;
                Object obj6 = (d2.v) obj4;
                m3.n nVar5 = (m3.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                m3.s sVar5 = (m3.s) nVar5;
                if (sVar5.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dVar2.invoke(obj6, sVar5, 0);
                } else {
                    sVar5.U();
                }
                break;
            case 10:
                dn.m mVar = (dn.m) obj4;
                pg.c2 c2Var = (pg.c2) obj3;
                SortingChoice sortingChoice = (SortingChoice) obj;
                if (((Boolean) obj2).booleanValue()) {
                    if (sortingChoice != null ? Intrinsics.areEqual(sortingChoice.getAlreadySelected(), Boolean.TRUE) : false) {
                        mVar.f15024b.f46271t = null;
                        ImageView imageView = c2Var.B;
                        imageView.getClass();
                        imageView.setVisibility(8);
                        c2Var.J.setSelectedSortingId(null);
                        mVar.f15024b.a("");
                    } else {
                        mVar.c(sortingChoice);
                    }
                }
                c2Var.J.setShowBs(false);
                break;
            case 11:
                ((Integer) obj2).getClass();
                b0.a0.f((bp.b) obj4, (ap.n) obj3, (m3.n) obj, m3.i.F(7));
                break;
            case 12:
                ((Integer) obj2).getClass();
                d40.t1.q((at.h0) obj4, (u3.d) obj3, (m3.n) obj, m3.i.F(49));
                break;
            case 13:
                GetRecommendedManufacturerItemsResponse getRecommendedManufacturerItemsResponse = (GetRecommendedManufacturerItemsResponse) obj4;
                com.google.firebase.messaging.a0 a0Var = (com.google.firebase.messaging.a0) obj3;
                en.o oVar = (en.o) a0Var.f12780c;
                m3.n nVar6 = (m3.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                m3.s sVar6 = (m3.s) nVar6;
                if (sVar6.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    nx.d.h(getRecommendedManufacturerItemsResponse, oVar.g(), o30.f0.U(sVar6, R.string.mnu_details_recommendation_title), oVar.f16174i, a0Var, a0Var, sVar6, 0);
                } else {
                    sVar6.U();
                }
                break;
            case 14:
                RecipeGeneratorActivity recipeGeneratorActivity = (RecipeGeneratorActivity) obj4;
                String str2 = (String) obj3;
                m3.n nVar7 = (m3.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i15 = RecipeGeneratorActivity.f9238k;
                m3.s sVar7 = (m3.s) nVar7;
                if (sVar7.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    g9.f0 f0VarI = a.a.I(new g9.t0[0], sVar7);
                    recipeGeneratorActivity.f9242i = f0VarI;
                    f0VarI.getClass();
                    ep.d0 d0VarA0 = recipeGeneratorActivity.a0();
                    k8.d dVar3 = recipeGeneratorActivity.f9241h;
                    if (dVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("galleryManager");
                        dVar = null;
                    } else {
                        dVar = dVar3;
                    }
                    boolean zH = sVar7.h(recipeGeneratorActivity);
                    Object objM2 = sVar7.M();
                    if (zH || objM2 == fVar) {
                        objM2 = new cw.b(recipeGeneratorActivity, i13);
                        sVar7.k0(objM2);
                    }
                    o00.h0.e(f0VarI, str2, d0VarA0, dVar, (Function0) objM2, sVar7, 0);
                } else {
                    sVar7.U();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                final fn.t tVar = (fn.t) obj4;
                LoyaltyCardDetails loyaltyCardDetails = (LoyaltyCardDetails) obj3;
                m3.n nVar8 = (m3.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                m3.s sVar8 = (m3.s) nVar8;
                if (sVar8.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    w6 w6VarF = v3.f(6, 2, null, sVar8);
                    Object objM3 = sVar8.M();
                    if (objM3 == fVar) {
                        objM3 = m3.i.w(Boolean.TRUE);
                        sVar8.k0(objM3);
                    }
                    final m3.b1 b1Var = (m3.b1) objM3;
                    if (((Boolean) b1Var.getValue()).booleanValue()) {
                        sVar8.a0(-1954459115);
                        fn.c cVarS = tVar.s();
                        cv.i iVar = cv.i.ACTION_OPEN_LOYALTY_CARD_PAGE;
                        dv.a aVar3 = dv.a.CLICK_FROM;
                        dv.d dVar4 = dv.d.DISCOVER_CARD;
                        String strA = dVar4 != null ? dVar4.a() : null;
                        cVarS.getClass();
                        iVar.getClass();
                        aVar3.getClass();
                        cVarS.f17796c.d(iVar, aVar3, strA);
                        ProfileFeature profileFeature = new ProfileFeature(ProfileFeatureType.LOYALTY_CARD, ProfileFeatureState.ACTIVE, loyaltyCardDetails, null, null, null);
                        boolean showManufacturerItems = tVar.s().f17795b.n().getShowManufacturerItems();
                        f70.i iVar2 = f70.i.DISCOVER;
                        boolean zH2 = sVar8.h(tVar);
                        Object objM4 = sVar8.M();
                        if (zH2 || objM4 == fVar) {
                            objM4 = new fn.e(tVar, i12);
                            sVar8.k0(objM4);
                        }
                        Function0 function02 = (Function0) objM4;
                        boolean zH3 = sVar8.h(tVar);
                        Object objM5 = sVar8.M();
                        if (zH3 || objM5 == fVar) {
                            final int i16 = false ? 1 : 0;
                            objM5 = new Function1() { // from class: fn.j
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    dv.d dVar5 = (dv.d) obj7;
                                    switch (i16) {
                                        case 0:
                                            dVar5.getClass();
                                            b1Var.setValue(Boolean.FALSE);
                                            c cVarS2 = tVar.s();
                                            cv.i iVar3 = cv.i.ACTION_CLOSE_LOYALTY_CARD_PAGE;
                                            dv.a aVar4 = dv.a.CLICK_FROM;
                                            String strA2 = dVar5.a();
                                            cVarS2.getClass();
                                            iVar3.getClass();
                                            aVar4.getClass();
                                            cVarS2.f17796c.d(iVar3, aVar4, strA2);
                                            break;
                                        default:
                                            dVar5.getClass();
                                            b1Var.setValue(Boolean.FALSE);
                                            a0 a0Var2 = new a0();
                                            z zVar = z.PROFILE;
                                            zVar.getClass();
                                            a0Var2.f30138a = zVar;
                                            t tVar2 = tVar;
                                            o0 o0VarRequireActivity = tVar2.requireActivity();
                                            o0VarRequireActivity.getClass();
                                            a0Var2.c(o0VarRequireActivity);
                                            c cVarS3 = tVar2.s();
                                            cv.i iVar4 = cv.i.ACTION_CLOSE_LOYALTY_CARD_PAGE;
                                            dv.a aVar5 = dv.a.CLICK_FROM;
                                            String strA3 = dVar5.a();
                                            cVarS3.getClass();
                                            iVar4.getClass();
                                            aVar5.getClass();
                                            cVarS3.f17796c.d(iVar4, aVar5, strA3);
                                            break;
                                    }
                                    return Unit.f26487a;
                                }
                            };
                            sVar8.k0(objM5);
                        }
                        Function1 function1 = (Function1) objM5;
                        boolean zH4 = sVar8.h(tVar);
                        Object objM6 = sVar8.M();
                        if (zH4 || objM6 == fVar) {
                            objM6 = new Function1() { // from class: fn.j
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    dv.d dVar5 = (dv.d) obj7;
                                    switch (i14) {
                                        case 0:
                                            dVar5.getClass();
                                            b1Var.setValue(Boolean.FALSE);
                                            c cVarS2 = tVar.s();
                                            cv.i iVar3 = cv.i.ACTION_CLOSE_LOYALTY_CARD_PAGE;
                                            dv.a aVar4 = dv.a.CLICK_FROM;
                                            String strA2 = dVar5.a();
                                            cVarS2.getClass();
                                            iVar3.getClass();
                                            aVar4.getClass();
                                            cVarS2.f17796c.d(iVar3, aVar4, strA2);
                                            break;
                                        default:
                                            dVar5.getClass();
                                            b1Var.setValue(Boolean.FALSE);
                                            a0 a0Var2 = new a0();
                                            z zVar = z.PROFILE;
                                            zVar.getClass();
                                            a0Var2.f30138a = zVar;
                                            t tVar2 = tVar;
                                            o0 o0VarRequireActivity = tVar2.requireActivity();
                                            o0VarRequireActivity.getClass();
                                            a0Var2.c(o0VarRequireActivity);
                                            c cVarS3 = tVar2.s();
                                            cv.i iVar4 = cv.i.ACTION_CLOSE_LOYALTY_CARD_PAGE;
                                            dv.a aVar5 = dv.a.CLICK_FROM;
                                            String strA3 = dVar5.a();
                                            cVarS3.getClass();
                                            iVar4.getClass();
                                            aVar5.getClass();
                                            cVarS3.f17796c.d(iVar4, aVar5, strA3);
                                            break;
                                    }
                                    return Unit.f26487a;
                                }
                            };
                            sVar8.k0(objM6);
                        }
                        sn.a.a(w6VarF, profileFeature, showManufacturerItems, iVar2, function02, function1, (Function1) objM6, sVar8, 3072);
                        fn.c cVarS2 = tVar.s();
                        cv.i iVar3 = cv.i.SCREEN_LOYALTY_CARD_PAGE;
                        dv.b bVarE = h0.g.E(new Pair(dv.a.LOYALTY_CARD_STATE, new dv.c("ACTIVE")), new Pair(dv.a.LOYALTY_CARD_STAMPS, new dv.c(loyaltyCardDetails != null ? Integer.valueOf(loyaltyCardDetails.getOrderCount()) : null)));
                        cVarS2.getClass();
                        iVar3.getClass();
                        cVarS2.f17796c.c(iVar3, bVarE);
                        sVar8.q(false);
                    } else {
                        sVar8.a0(-1951720265);
                        sVar8.q(false);
                    }
                } else {
                    sVar8.U();
                }
                break;
            case 16:
                g2.a aVar4 = (g2.a) obj4;
                d2.f fVar2 = (d2.f) obj3;
                z5.c cVar = (z5.c) obj;
                z5.a aVar5 = (z5.a) obj2;
                if (z5.a.i(aVar5.f47271a) == Integer.MAX_VALUE) {
                    c2.a.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int i17 = z5.a.i(aVar5.f47271a);
                int iQ0 = cVar.q0(fVar2.a());
                int i18 = aVar4.f18119a;
                int i19 = i17 - ((i18 - 1) * iQ0);
                int i21 = i19 / i18;
                int i22 = i19 % i18;
                ArrayList arrayList = new ArrayList(i18);
                int i23 = 0;
                while (i23 < i18) {
                    arrayList.add(Integer.valueOf((i23 < i22 ? 1 : 0) + i21));
                    i23++;
                }
                int[] iArrQ0 = CollectionsKt.q0(arrayList);
                int[] iArr = new int[iArrQ0.length];
                fVar2.c(cVar, i17, iArrQ0, z5.m.Ltr, iArr);
                break;
            case 17:
                d2.z1 z1Var2 = (d2.z1) obj4;
                i80.n nVar9 = (i80.n) obj3;
                m3.n nVar10 = (m3.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                m3.s sVar9 = (m3.s) nVar10;
                if (sVar9.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    b4.t tVarY = d2.c.y(d2.m2.a(qVar, g3.p.f19256d, g3.p.f19257e), z1Var2);
                    d2.i2 i2VarA = d2.h2.a(d2.i.f13805e, b4.d.f5693k, sVar9, 54);
                    int iHashCode = Long.hashCode(sVar9.T);
                    u3.i iVarL = sVar9.l();
                    b4.t tVarC = b4.a.c(tVarY, sVar9);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar9.e0();
                    if (sVar9.S) {
                        sVar9.k(hVar);
                    } else {
                        sVar9.n0();
                    }
                    m3.i.C(i2VarA, b5.i.f5843f, sVar9);
                    m3.i.C(iVarL, b5.i.f5842e, sVar9);
                    b5.g gVar = b5.i.f5844g;
                    if (sVar9.S || !Intrinsics.areEqual(sVar9.M(), Integer.valueOf(iHashCode))) {
                        e0.f.y(iHashCode, sVar9, iHashCode, gVar);
                    }
                    m3.i.C(tVarC, b5.i.f5841d, sVar9);
                    nVar9.invoke(d2.k2.f13824a, sVar9, 6);
                    sVar9.q(true);
                } else {
                    sVar9.U();
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                ((g3.w0) obj4).a((a8.h) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ((g3.x0) obj4).a((k4) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ((g3.d1) obj4).a((z6) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 21:
                m3.c3 c3Var = (m3.c3) obj4;
                c4 c4Var = (c4) obj3;
                m3.n nVar11 = (m3.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                m3.s sVar10 = (m3.s) nVar11;
                if (sVar10.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    b4.t tVarM = z4.c0.m(qVar, "indicator");
                    boolean zF2 = sVar10.f(c3Var);
                    Object objM7 = sVar10.M();
                    if (zF2 || objM7 == fVar) {
                        objM7 = new dp.r(c3Var, 2);
                        sVar10.k0(objM7);
                    }
                    d2.p.a(v1.n.j(i4.g0.p(tVarM, (Function1) objM7), c4Var.f18410c, m6.b(l3.h0.f26968c, sVar10)), sVar10, 0);
                } else {
                    sVar10.U();
                }
                break;
            case 22:
                ((Integer) obj2).getClass();
                ((p4) obj4).a((u3.d) obj3, (m3.n) obj, m3.i.F(7));
                break;
            case 23:
                u3.d dVar5 = (u3.d) obj3;
                Object obj7 = (w5) obj4;
                m3.n nVar12 = (m3.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                m3.s sVar11 = (m3.s) nVar12;
                if (sVar11.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                    int iHashCode2 = Long.hashCode(sVar11.T);
                    u3.i iVarL2 = sVar11.l();
                    b4.t tVarC2 = b4.a.c(qVar, sVar11);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar11.e0();
                    if (sVar11.S) {
                        sVar11.k(hVar2);
                    } else {
                        sVar11.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar11);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar11);
                    b5.g gVar2 = b5.i.f5844g;
                    if (sVar11.S || !Intrinsics.areEqual(sVar11.M(), Integer.valueOf(iHashCode2))) {
                        e0.f.y(iHashCode2, sVar11, iHashCode2, gVar2);
                    }
                    m3.i.C(tVarC2, b5.i.f5841d, sVar11);
                    dVar5.invoke(obj7, sVar11, 6);
                    sVar11.q(true);
                } else {
                    sVar11.U();
                }
                break;
            case 24:
                ((Integer) obj2).getClass();
                s6.a((b4.t) obj4, (Function2) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 25:
                u3.d dVar6 = (u3.d) obj3;
                Object obj8 = (d7) obj4;
                m3.n nVar13 = (m3.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                m3.s sVar12 = (m3.s) nVar13;
                if (sVar12.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    obj8.getClass();
                    dVar6.invoke(obj8, sVar12, 0);
                } else {
                    sVar12.U();
                }
                break;
            case 26:
                u3.d dVar7 = (u3.d) obj3;
                Object obj9 = (y8) obj4;
                m3.n nVar14 = (m3.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                m3.s sVar13 = (m3.s) nVar14;
                if (sVar13.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    dVar7.invoke(obj9, sVar13, 6);
                } else {
                    sVar13.U();
                }
                break;
            case 27:
                u3.d dVar8 = (u3.d) obj3;
                Object obj10 = (ArrayList) obj4;
                m3.n nVar15 = (m3.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                m3.s sVar14 = (m3.s) nVar15;
                if (sVar14.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    dVar8.invoke(obj10, sVar14, 0);
                } else {
                    sVar14.U();
                }
                break;
            case 28:
                i80.n nVar16 = (i80.n) obj4;
                Object obj11 = (a9) obj3;
                m3.n nVar17 = (m3.n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                m3.s sVar15 = (m3.s) nVar17;
                if (sVar15.R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    nVar16.invoke(obj11, sVar15, 6);
                } else {
                    sVar15.U();
                }
                break;
            default:
                m3.b1 b1Var2 = (m3.b1) obj4;
                Function2 function2 = (Function2) obj3;
                m3.n nVar18 = (m3.n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                m3.s sVar16 = (m3.s) nVar18;
                if (sVar16.R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    Object objM8 = sVar16.M();
                    if (objM8 == fVar) {
                        objM8 = new p0(b1Var2, 11);
                        sVar16.k0(objM8);
                    }
                    b4.t tVarO = z4.c0.o(qVar, (Function1) objM8);
                    z4.u0 u0VarD2 = d2.p.d(b4.d.f5683a, false);
                    int iHashCode3 = Long.hashCode(sVar16.T);
                    u3.i iVarL3 = sVar16.l();
                    b4.t tVarC3 = b4.a.c(tVarO, sVar16);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar16.e0();
                    if (sVar16.S) {
                        sVar16.k(hVar3);
                    } else {
                        sVar16.n0();
                    }
                    m3.i.C(u0VarD2, b5.i.f5843f, sVar16);
                    m3.i.C(iVarL3, b5.i.f5842e, sVar16);
                    b5.g gVar3 = b5.i.f5844g;
                    if (sVar16.S || !Intrinsics.areEqual(sVar16.M(), Integer.valueOf(iHashCode3))) {
                        e0.f.y(iHashCode3, sVar16, iHashCode3, gVar3);
                    }
                    m3.i.C(tVarC3, b5.i.f5841d, sVar16);
                    w.a0.w(0, function2, sVar16, true);
                } else {
                    sVar16.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ u2(int i11, Object obj, Object obj2) {
        this.f585a = i11;
        this.f586b = obj;
        this.f587c = obj2;
    }

    public /* synthetic */ u2(Object obj, Object obj2, int i11, int i12) {
        this.f585a = i12;
        this.f586b = obj;
        this.f587c = obj2;
    }
}
