package g3;

import androidx.lifecycle.LifecycleOwner;
import com.app.tgtg.R;
import com.app.tgtg.feature.badges.ui.BadgesActivity;
import com.app.tgtg.feature.charity.ui.help.CharityContactUsActivity;
import com.app.tgtg.feature.helpdesk.ui.answer.AnswerFragment;
import com.app.tgtg.feature.helpdesk.ui.question.QuestionFragment;
import com.app.tgtg.feature.main.fragments.discover.herocomponent.DiscoverSheetView;
import com.app.tgtg.feature.recipegenerator.ui.DiscoverRecipeGeneratorPromoView;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.DiscoverAlmostSoldOutComposeView;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.DiscoverDeliveryTabComposeView;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.DiscoverNotLiveHereView;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.DiscoverNothingWithinDistanceComposeView;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.RatingCardComposeView;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.StoreReferralCardComposeView;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.loyaltycardpromo.DiscoverLoyaltyCardPromoView;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.quickFilters.FilterNoResultView;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.quickFilters.QuickFilterView;
import com.app.tgtg.feature.tabprofile.manageaccount.ManageAccountActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.notificationsettings.ui.NotificationSettingsActivity;
import com.app.tgtg.model.remote.mapService.response.FilterCategory;
import com.app.tgtg.model.remote.mapService.response.MapClustersResponse;
import com.app.tgtg.model.remote.order.Order;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarIllustrationKt;
import com.tgtg.componentlibrary.component.chip.model.ChipGeometry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19809b;

    public /* synthetic */ y0(Object obj, int i11) {
        this.f19808a = i11;
        this.f19809b = obj;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        x6 x6Var;
        int i11 = this.f19808a;
        i4.r0 r0Var = i4.g0.f23254b;
        b4.q qVar = b4.q.f5711a;
        x70.c cVar = null;
        m3.f fVar = m3.m.f29332a;
        int i12 = 2;
        int i13 = 3;
        Object obj3 = this.f19809b;
        int i14 = 1;
        switch (i11) {
            case 0:
                z6 z6Var = (z6) obj3;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d2.b bVar = d2.i.f13802b;
                    b4.j jVar = b4.d.f5693k;
                    i80.n nVar2 = z6Var.f19894g;
                    d2.i2 i2VarA = d2.h2.a(bVar, jVar, sVar, 54);
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
                    m3.i.C(i2VarA, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    b5.g gVar = b5.i.f5844g;
                    if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                        e0.f.y(iHashCode, sVar, iHashCode, gVar);
                    }
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    nVar2.invoke(d2.k2.f13824a, sVar, 6);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((b3) obj3).a((m3.n) obj, m3.i.F(1));
                break;
            case 2:
                w6 w6Var = (w6) obj3;
                z1.a0 a0VarA = z1.k.a(new l3(z5.a.h(((z5.a) obj2).f47271a), (z5.l) obj, w6Var, false ? 1 : 0));
                int i15 = u3.$EnumSwitchMapping$0[((x6) w6Var.f19706e.f46654i.getValue()).ordinal()];
                if (i15 == 1) {
                    x6Var = x6.Hidden;
                } else if (i15 == 2) {
                    x6Var = x6.PartiallyExpanded;
                    if (!a0VarA.c(x6Var)) {
                        x6Var = x6.Expanded;
                        if (!a0VarA.c(x6Var)) {
                            x6Var = x6.Hidden;
                        }
                    }
                } else if (i15 != 3) {
                    e40.a.f();
                } else {
                    x6Var = x6.Expanded;
                    if (!a0VarA.c(x6Var)) {
                        x6Var = x6.Hidden;
                    }
                }
                break;
            case 3:
                i3.a0 a0Var = (i3.a0) obj3;
                m3.n nVar3 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar3;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    d2.p.a(v1.b1.a(f4.g.b(z4.c0.m(qVar, "indicatorRipple"), m6.b(l3.h0.f26968c, sVar2)), a0Var, s5.a(0.0f, 7, 0L, false)), sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                int i16 = DiscoverSheetView.f9147q;
                ((DiscoverSheetView) obj3).a((m3.n) obj, m3.i.F(1));
                break;
            case 5:
                Order order = (Order) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                order.getClass();
                ((fn.c) obj3).f(order, iIntValue3);
                break;
            case 6:
                CharityContactUsActivity charityContactUsActivity = (CharityContactUsActivity) obj3;
                m3.n nVar4 = (m3.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i17 = CharityContactUsActivity.f8983f;
                m3.s sVar3 = (m3.s) nVar4;
                if (sVar3.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    hi.e eVar = (hi.e) charityContactUsActivity.f8987e.getValue();
                    boolean zH = sVar3.h(charityContactUsActivity);
                    Object objM = sVar3.M();
                    if (zH || objM == fVar) {
                        objM = new cw.b(charityContactUsActivity, 29);
                        sVar3.k0(objM);
                    }
                    android.support.v4.media.session.a.b(null, eVar, (Function0) objM, sVar3, 0);
                } else {
                    sVar3.U();
                }
                break;
            case 7:
                hj.d dVar = (hj.d) obj3;
                androidx.lifecycle.n1 n1Var = dVar.f22086b;
                m3.n nVar5 = (m3.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                m3.s sVar4 = (m3.s) nVar5;
                if (sVar4.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    androidx.lifecycle.o0 o0Var = ((tm.e) dVar.f22085a.getValue()).f40322r;
                    m3.b1 b1VarW = b0.z.w(o0Var, o0Var.d(), sVar4, 0);
                    m3.b1 b1VarN = m3.i.n(((ej.c) n1Var.getValue()).f16044b, sVar4, 0);
                    MapClustersResponse mapClustersResponse = (MapClustersResponse) b1VarW.getValue();
                    if (mapClustersResponse == null) {
                        sVar4.a0(1596042458);
                        sVar4.q(false);
                    } else {
                        sVar4.a0(1596042459);
                        gj.c0 c0Var = (gj.c0) b1VarN.getValue();
                        jj.c cVar2 = ((ej.c) n1Var.getValue()).f16045c;
                        boolean zH2 = sVar4.h(dVar);
                        Object objM2 = sVar4.M();
                        if (zH2 || objM2 == fVar) {
                            objM2 = new hi.d(dVar, i14);
                            sVar4.k0(objM2);
                        }
                        hj.e.a(mapClustersResponse, c0Var, cVar2, (Function0) objM2, sVar4, 0);
                        sVar4.q(false);
                    }
                } else {
                    sVar4.U();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                int i18 = DiscoverAlmostSoldOutComposeView.f9265k;
                ((DiscoverAlmostSoldOutComposeView) obj3).a((m3.n) obj, m3.i.F(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                int i19 = DiscoverDeliveryTabComposeView.f9268k;
                ((DiscoverDeliveryTabComposeView) obj3).a((m3.n) obj, m3.i.F(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                int i21 = DiscoverNotLiveHereView.f9271m;
                ((DiscoverNotLiveHereView) obj3).a((m3.n) obj, m3.i.F(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                int i22 = DiscoverNothingWithinDistanceComposeView.f9275j;
                ((DiscoverNothingWithinDistanceComposeView) obj3).a((m3.n) obj, m3.i.F(1));
                break;
            case 12:
                Order order2 = (Order) obj;
                Integer num = (Integer) obj2;
                num.getClass();
                order2.getClass();
                fn.g gVar2 = ((hq.i) obj3).f22370i;
                if (gVar2 != null) {
                    gVar2.invoke(order2, num);
                }
                break;
            case 13:
                ((Integer) obj2).getClass();
                int i23 = RatingCardComposeView.f9277m;
                ((RatingCardComposeView) obj3).a((m3.n) obj, m3.i.F(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                int i24 = StoreReferralCardComposeView.f9281k;
                ((StoreReferralCardComposeView) obj3).a((m3.n) obj, m3.i.F(1));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ManageAccountActivity manageAccountActivity = (ManageAccountActivity) obj3;
                m3.n nVar6 = (m3.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i25 = ManageAccountActivity.f9348i;
                m3.s sVar5 = (m3.s) nVar6;
                if (sVar5.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    g9.f0 f0VarI = a.a.I(new g9.t0[0], sVar5);
                    if (((Boolean) m3.i.n(manageAccountActivity.a0().f22440m, sVar5, 0).getValue()).booleanValue()) {
                        j4.s.y(924101302, 0, sVar5, sVar5, false);
                    } else {
                        sVar5.a0(924143586);
                        sVar5.q(false);
                    }
                    if (((Boolean) m3.i.n(manageAccountActivity.a0().f22442o, sVar5, 0).getValue()).booleanValue()) {
                        sVar5.a0(924304135);
                        Object objM3 = sVar5.M();
                        Object obj4 = objM3;
                        if (objM3 == fVar) {
                            v80.b0 b0VarO = m3.i.o(kotlin.coroutines.g.f26549a, sVar5);
                            sVar5.k0(b0VarO);
                            obj4 = b0VarO;
                        }
                        v80.b0 b0Var = (v80.b0) obj4;
                        w6 w6VarF = v3.f(6, 2, null, sVar5);
                        boolean zBooleanValue = ((Boolean) m3.i.n(manageAccountActivity.a0().f22444q, sVar5, 0).getValue()).booleanValue();
                        boolean zH3 = sVar5.h(manageAccountActivity);
                        Object objM4 = sVar5.M();
                        Object obj5 = objM4;
                        if (zH3 || objM4 == fVar) {
                            hr.a aVar = new hr.a(manageAccountActivity, false ? 1 : 0);
                            sVar5.k0(aVar);
                            obj5 = aVar;
                        }
                        Function1 function1 = (Function1) obj5;
                        boolean zH4 = sVar5.h(b0Var) | sVar5.f(w6VarF) | sVar5.h(manageAccountActivity);
                        Object objM5 = sVar5.M();
                        Object obj6 = objM5;
                        if (zH4 || objM5 == fVar) {
                            a0.g gVar3 = new a0.g(b0Var, w6VarF, manageAccountActivity, 19);
                            sVar5.k0(gVar3);
                            obj6 = gVar3;
                        }
                        cg.j.a(w6VarF, zBooleanValue, function1, (Function0) obj6, sVar5, 0);
                        sVar5.q(false);
                    } else {
                        sVar5.a0(925098882);
                        sVar5.q(false);
                    }
                    b4.t tVarJ = v1.n.j(d2.m2.f13850c, lv.s.J, r0Var);
                    boolean zH5 = sVar5.h(manageAccountActivity);
                    Object objM6 = sVar5.M();
                    Object obj7 = objM6;
                    if (zH5 || objM6 == fVar) {
                        hr.a aVar2 = new hr.a(manageAccountActivity, i14);
                        sVar5.k0(aVar2);
                        obj7 = aVar2;
                    }
                    b0.z.h(f0VarI, "screen_list", tVarJ, null, null, null, null, null, null, (Function1) obj7, sVar5, MLKEMEngine.KyberPolyBytes, 1016);
                } else {
                    sVar5.U();
                }
                break;
            case 16:
                NotificationSettingsActivity notificationSettingsActivity = (NotificationSettingsActivity) obj3;
                m3.n nVar7 = (m3.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i26 = NotificationSettingsActivity.f9422k;
                m3.s sVar6 = (m3.s) nVar7;
                if (sVar6.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zB0 = notificationSettingsActivity.b0();
                    boolean zH6 = sVar6.h(notificationSettingsActivity);
                    Object objM7 = sVar6.M();
                    if (zH6 || objM7 == fVar) {
                        objM7 = new hs.a(notificationSettingsActivity, false ? 1 : 0);
                        sVar6.k0(objM7);
                    }
                    Function0 function0 = (Function0) objM7;
                    boolean zH7 = sVar6.h(notificationSettingsActivity);
                    Object objM8 = sVar6.M();
                    if (zH7 || objM8 == fVar) {
                        objM8 = new hs.a(notificationSettingsActivity, i14);
                        sVar6.k0(objM8);
                    }
                    Function0 function02 = (Function0) objM8;
                    boolean zH8 = sVar6.h(notificationSettingsActivity);
                    Object objM9 = sVar6.M();
                    if (zH8 || objM9 == fVar) {
                        objM9 = new hs.a(notificationSettingsActivity, i12);
                        sVar6.k0(objM9);
                    }
                    Function0 function03 = (Function0) objM9;
                    boolean zH9 = sVar6.h(notificationSettingsActivity);
                    Object objM10 = sVar6.M();
                    if (zH9 || objM10 == fVar) {
                        objM10 = new hs.a(notificationSettingsActivity, i13);
                        sVar6.k0(objM10);
                    }
                    Function0 function04 = (Function0) objM10;
                    boolean zH10 = sVar6.h(notificationSettingsActivity);
                    Object objM11 = sVar6.M();
                    if (zH10 || objM11 == fVar) {
                        objM11 = new hs.a(notificationSettingsActivity, 4);
                        sVar6.k0(objM11);
                    }
                    Function0 function05 = (Function0) objM11;
                    boolean zH11 = sVar6.h(notificationSettingsActivity);
                    Object objM12 = sVar6.M();
                    if (zH11 || objM12 == fVar) {
                        objM12 = new hs.a(notificationSettingsActivity, 5);
                        sVar6.k0(objM12);
                    }
                    js.c.a(null, zB0, function0, function02, function03, function04, function05, (Function0) objM12, sVar6, 0);
                } else {
                    sVar6.U();
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                i9.n.a((i9.p) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 18:
                BadgesActivity badgesActivity = (BadgesActivity) obj3;
                m3.n nVar8 = (m3.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i27 = BadgesActivity.f8964i;
                m3.s sVar7 = (m3.s) nVar8;
                if (sVar7.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    g9.f0 f0VarI2 = a.a.I(new g9.t0[0], sVar7);
                    b4.t tVarJ2 = v1.n.j(d2.m2.f13850c, lv.s.J, r0Var);
                    boolean zH12 = sVar7.h(badgesActivity);
                    Object objM13 = sVar7.M();
                    if (zH12 || objM13 == fVar) {
                        objM13 = new ih.a(badgesActivity, false ? 1 : 0);
                        sVar7.k0(objM13);
                    }
                    b0.z.h(f0VarI2, "screen_overview", tVarJ2, null, null, null, null, null, null, (Function1) objM13, sVar7, MLKEMEngine.KyberPolyBytes, 1016);
                } else {
                    sVar7.U();
                }
                break;
            case 19:
                ii.h hVar2 = (ii.h) obj3;
                m3.n nVar9 = (m3.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                m3.s sVar8 = (m3.s) nVar9;
                if (sVar8.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    r9.d(o30.f0.U(sVar8, hVar2.f23901c), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar8, 0, 0, 262142);
                } else {
                    sVar8.U();
                }
                break;
            case 20:
                ii.j0 j0Var = (ii.j0) obj3;
                androidx.lifecycle.w wVar = (androidx.lifecycle.w) obj2;
                ((LifecycleOwner) obj).getClass();
                wVar.getClass();
                if (ii.d0.$EnumSwitchMapping$0[wVar.ordinal()] == 1) {
                    j0Var.a();
                    v80.f0.B(androidx.lifecycle.m1.d(j0Var), null, null, new gf.g(j0Var, cVar, 15), 3);
                }
                break;
            case 21:
                FilterCategory filterCategory = (FilterCategory) obj3;
                m3.n nVar10 = (m3.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                m3.s sVar9 = (m3.s) nVar10;
                if (sVar9.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    PantryAvatarIllustrationKt.PantryAvatarIllustration(u3.e.e(1875572444, sVar9, new a3.m2(filterCategory, 14)), null, null, null, sVar9, 6, 14);
                } else {
                    sVar9.U();
                }
                break;
            case 22:
                AnswerFragment answerFragment = (AnswerFragment) obj3;
                m3.n nVar11 = (m3.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                m3.s sVar10 = (m3.s) nVar11;
                if (sVar10.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    jk.d.a(answerFragment.o(), sVar10, 0);
                } else {
                    sVar10.U();
                }
                break;
            case 23:
                ((Integer) obj2).getClass();
                int i28 = DiscoverLoyaltyCardPromoView.l;
                ((DiscoverLoyaltyCardPromoView) obj3).a((m3.n) obj, m3.i.F(1));
                break;
            case 24:
                QuestionFragment questionFragment = (QuestionFragment) obj3;
                m3.n nVar12 = (m3.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                m3.s sVar11 = (m3.s) nVar12;
                if (sVar11.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    w0.e.i(questionFragment.o(), sVar11, 0);
                } else {
                    sVar11.U();
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                wd.a.h((jl.d) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                int i29 = DiscoverRecipeGeneratorPromoView.l;
                ((DiscoverRecipeGeneratorPromoView) obj3).a((m3.n) obj, m3.i.F(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                int i31 = FilterNoResultView.f9287m;
                ((FilterNoResultView) obj3).a((m3.n) obj, m3.i.F(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                int i32 = QuickFilterView.f9291k;
                ((QuickFilterView) obj3).a((m3.n) obj, m3.i.F(1));
                break;
            default:
                ChipGeometry chipGeometry = (ChipGeometry) obj3;
                m3.n nVar13 = (m3.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                m3.s sVar12 = (m3.s) nVar13;
                if (sVar12.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    d2.c.f(d2.m2.m(qVar, chipGeometry.m780getGapD9Ej5fM()), sVar12);
                    i2.a(o00.x0.z(R.drawable.chevron_down, sVar12, 0), null, d2.m2.m(qVar, chipGeometry.m782getIconSizeD9Ej5fM()), ((i4.v) sVar12.j(v0.f19606a)).f23317a, sVar12, 56, 0);
                } else {
                    sVar12.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ y0(Object obj, int i11, int i12) {
        this.f19808a = i12;
        this.f19809b = obj;
    }
}
