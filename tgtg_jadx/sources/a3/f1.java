package a3;

import android.content.Context;
import android.webkit.WebView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.app.tgtg.R;
import com.app.tgtg.customview.BasketButtonRow;
import com.app.tgtg.customview.SearchAndFilterView;
import com.app.tgtg.customview.TagContainerView;
import com.app.tgtg.feature.authentication.ui.AuthenticationActivity;
import com.app.tgtg.feature.charity.ui.MainCharityActivity;
import com.app.tgtg.feature.login.LoginActivity;
import com.app.tgtg.feature.logincharity.ui.model.Country;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.compose.vertitems.DeliveryCategoryCarousel;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import com.app.tgtg.feature.rating.RatingActivity;
import com.app.tgtg.feature.survey.bringmagic.BringBackMagicActivity;
import com.app.tgtg.feature.webview.ui.WebViewActivity;
import com.app.tgtg.model.remote.item.LocalHero;
import com.app.tgtg.model.remote.order.OrderType;
import com.tgtg.componentlibrary.component.iconbutton.variant.SubtlePantryIconButtonKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import g3.j4;
import g3.k4;
import g3.r9;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KFunction;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f344b;

    public /* synthetic */ f1(Object obj, int i11) {
        this.f343a = i11;
        this.f344b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        char c3;
        long j9;
        long jFloatToRawIntBits;
        long jG;
        long jFloatToRawIntBits2;
        Object objJ;
        WebView webView;
        int i11 = this.f343a;
        m3.f fVar = m3.m.f29332a;
        b4.q qVar = b4.q.f5711a;
        int i12 = 3;
        Object obj3 = this.f344b;
        switch (i11) {
            case 0:
                ((w4.v) obj).a();
                ((Ref.LongRef) obj3).element = ((h4.b) obj2).f21378a;
                break;
            case 1:
                j2 j2Var = (j2) obj3;
                o2.a aVar = (o2.a) obj;
                Context context = (Context) obj2;
                Pair pairD = j2Var.d();
                e0.a(aVar, context, false, pairD != null ? (m5.h) pairD.f26485a : null, pairD != null ? (m5.t0) pairD.f26486b : null, j2Var.f423w, new p(i12, j2Var, context));
                break;
            case 2:
                z4.z zVar = (z4.z) obj3;
                z4.z zVarC = ((s) obj).c();
                z4.z zVarC2 = ((s) obj2).c();
                long jG2 = 0;
                if (zVarC != null) {
                    jG = zVar.g(zVarC, 0L);
                    c3 = ' ';
                    j9 = 4294967295L;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jG & 4294967295L)) + ((int) (zVarC.u() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jG >> 32)) + ((int) (zVarC.u() >> 32)))) << 32);
                } else {
                    c3 = ' ';
                    j9 = 4294967295L;
                    jFloatToRawIntBits = 0;
                    jG = 0;
                }
                if (zVarC2 != null) {
                    jG2 = zVar.g(zVarC2, 0L);
                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jG2 & j9)) + ((int) (zVarC2.u() & j9)))) & j9) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jG2 >> c3)) + ((int) (zVarC2.u() >> c3)))) << c3);
                } else {
                    jFloatToRawIntBits2 = 0;
                }
                int i13 = (int) (jFloatToRawIntBits & j9);
                int i14 = (int) (jG & j9);
                float fIntBitsToFloat = Float.intBitsToFloat(i13) - Float.intBitsToFloat(i14);
                int i15 = (int) (jFloatToRawIntBits >> c3);
                int i16 = (int) (jG >> c3);
                float fIntBitsToFloat2 = Float.intBitsToFloat(i15) - Float.intBitsToFloat(i16);
                int i17 = (int) (jFloatToRawIntBits2 & j9);
                char c7 = c3;
                int i18 = (int) (jG2 & j9);
                float fIntBitsToFloat3 = Float.intBitsToFloat(i17) - Float.intBitsToFloat(i18);
                int i19 = (int) (jFloatToRawIntBits2 >> (c7 == true ? 1L : 0L));
                float fIntBitsToFloat4 = Float.intBitsToFloat(i19);
                int i21 = (int) (jG2 >> (c7 == true ? 1L : 0L));
                float fIntBitsToFloat5 = fIntBitsToFloat4 - Float.intBitsToFloat(i21);
                float fMax = Math.max(0.0f, Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i17)) - Math.max(Float.intBitsToFloat(i14), Float.intBitsToFloat(i18)));
                float fMax2 = Math.max(0.0f, Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i19)) - Math.max(Float.intBitsToFloat(i16), Float.intBitsToFloat(i21)));
                break;
            case 3:
                AuthenticationActivity authenticationActivity = (AuthenticationActivity) obj3;
                androidx.lifecycle.n1 n1Var = authenticationActivity.f8963h;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i22 = AuthenticationActivity.f8960i;
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xg.b0 b0Var = (xg.b0) m3.i.m(((ah.k) n1Var.getValue()).f1469b, xg.a0.f44258a, null, sVar, 48, 2).getValue();
                    g9.f0 f0VarI = a.a.I(new g9.t0[0], sVar);
                    f0VarI.getClass();
                    authenticationActivity.f8962g = f0VarI;
                    ah.l.a(f0VarI, b0Var, ((ah.k) n1Var.getValue()).f1470c, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 4:
                LoginActivity loginActivity = (LoginActivity) obj3;
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                f70.b bVar = LoginActivity.f9032j;
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    v70.e eVarB = kotlin.collections.c0.b();
                    eVarB.add(al.h.Google);
                    eVarB.add(al.h.Facebook);
                    eVarB.add(al.h.Email);
                    eVarB.add(al.h.Other);
                    v70.e eVarA = kotlin.collections.c0.a(eVarB);
                    boolean zH = sVar2.h(loginActivity);
                    Object objM = sVar2.M();
                    if (zH || objM == fVar) {
                        objM = new al.d(loginActivity, 0);
                        sVar2.k0(objM);
                    }
                    Function1 function1 = (Function1) ((KFunction) objM);
                    al.p pVarA0 = loginActivity.a0();
                    boolean zH2 = sVar2.h(pVarA0);
                    Object objM2 = sVar2.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new al.e(1, pVarA0, al.p.class, "trackEvent", "trackEvent(Lcom/app/tgtg/services/analytics/TrackingEvent;Lcom/app/tgtg/services/analytics/model/TrackingProperties;)V", 0, 0);
                        sVar2.k0(objM2);
                    }
                    b0.a0.d(eVarA, function1, (Function1) objM2, sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
            case 5:
                an.j jVar = (an.j) obj3;
                m3.n nVar3 = (m3.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    jb.u.e(jVar.f1648a, jVar.f1649b, jVar.f1650c, jVar.f1651d, jVar.f1652e, sVar3, 0);
                } else {
                    sVar3.U();
                }
                break;
            case 6:
                RatingActivity ratingActivity = (RatingActivity) obj3;
                m3.n nVar4 = (m3.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i23 = RatingActivity.f9233f;
                m3.s sVar4 = (m3.s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    g9.f0 f0VarI2 = a.a.I(new g9.t0[0], sVar4);
                    f0VarI2.l(ratingActivity);
                    OnBackPressedDispatcher onBackPressedDispatcher = ratingActivity.getOnBackPressedDispatcher();
                    onBackPressedDispatcher.getClass();
                    androidx.activity.e0 e0Var = f0VarI2.f20191g;
                    l9.f fVar2 = f0VarI2.f20186b;
                    if (!Intrinsics.areEqual(onBackPressedDispatcher, f0VarI2.f20190f)) {
                        LifecycleOwner lifecycleOwner = fVar2.f27544n;
                        androidx.lifecycle.s sVar5 = fVar2.f27548r;
                        if (lifecycleOwner == null) {
                            com.braze.h2.b("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
                        } else {
                            e0Var.remove();
                            f0VarI2.f20190f = onBackPressedDispatcher;
                            onBackPressedDispatcher.b(e0Var, lifecycleOwner);
                            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                            lifecycle.d(sVar5);
                            lifecycle.a(sVar5);
                        }
                    }
                    o00.x0.h(f0VarI2, sVar4, 0);
                } else {
                    sVar4.U();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                ox.h.e((LocalHero) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                int i24 = BasketButtonRow.f8878t;
                ((BasketButtonRow) obj3).a((m3.n) obj, m3.i.F(1));
                break;
            case 9:
                SearchAndFilterView searchAndFilterView = (SearchAndFilterView) obj3;
                m3.n nVar5 = (m3.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i25 = SearchAndFilterView.f8913k;
                m3.s sVar6 = (m3.s) nVar5;
                if (sVar6.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x60.k kVar = (x60.k) sVar6.j(PantryThemeKt.getLocalPantryRadius());
                    x60.i iVar = (x60.i) sVar6.j(PantryThemeKt.getLocalPantryShadow());
                    boolean zH3 = sVar6.h(searchAndFilterView);
                    Object objM3 = sVar6.M();
                    if (zH3 || objM3 == fVar) {
                        objM3 = new aa.e(searchAndFilterView, 15);
                        sVar6.k0(objM3);
                    }
                    SubtlePantryIconButtonKt.MediumSubtlePantryIconButton((Function0) objM3, f4.g.g(qVar, l2.g.b(kVar.f43979c), iVar.f43950a), null, false, false, bg.m.f6202a, sVar6, 196608, 28);
                } else {
                    sVar6.U();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                int i26 = TagContainerView.f8924j;
                ((TagContainerView) obj3).a((m3.n) obj, m3.i.F(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                int i27 = bq.e.f6590j;
                ((bq.e) obj3).a((m3.n) obj, m3.i.F(1));
                break;
            case 12:
                String str = (String) obj;
                OrderType orderType = (OrderType) obj2;
                str.getClass();
                orderType.getClass();
                br.a.b((br.a) ((br.i) obj3).f6629c, null, str, orderType, 1);
                break;
            case 13:
                le.p pVar = (le.p) obj3;
                m3.n nVar6 = (m3.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                m3.s sVar7 = (m3.s) nVar6;
                if (sVar7.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    g3.s0.b(c5.d2.j(d2.m2.m(qVar, 70), "TGTGLoader"), l2.g.b(12), g3.s0.p(lv.s.f28215a, sVar7, 6), null, null, u3.e.e(1114452380, sVar7, new cg.o0(pVar, false ? 1 : 0)), sVar7, 196614, 24);
                } else {
                    sVar7.U();
                }
                break;
            case 14:
                Integer num = (Integer) obj3;
                m3.n nVar7 = (m3.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                m3.s sVar8 = (m3.s) nVar7;
                if (sVar8.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    n4.b bVarZ = o00.x0.z(R.drawable.system_icon_arrow_back_neutral_80, sVar8, 0);
                    if (num == null) {
                        sVar8.a0(244987181);
                        sVar8.q(false);
                    } else {
                        sVar8.a0(244987182);
                        Object objU = o30.f0.U(sVar8, num.intValue());
                        sVar8.q(false);
                        objU = objU;
                    }
                    if (objU == null) {
                        objJ = b3.i.j(-269189106, R.string.voice_over_back, sVar8, sVar8, false);
                    } else {
                        sVar8.a0(-269192857);
                        sVar8.q(false);
                        objJ = objU;
                    }
                    g3.i2.a(bVarZ, objJ, null, 0L, sVar8, 8, 12);
                } else {
                    sVar8.U();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                cg.a aVar2 = (cg.a) obj3;
                m3.n nVar8 = (m3.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                m3.s sVar9 = (m3.s) nVar8;
                if (sVar9.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    n4.b bVarZ2 = o00.x0.z(aVar2.f7916a, sVar9, 0);
                    Integer num2 = aVar2.f7917b;
                    if (num2 == null) {
                        sVar9.a0(1082089268);
                    } else {
                        sVar9.a0(1082089269);
                        objU = o30.f0.U(sVar9, num2.intValue());
                    }
                    sVar9.q(false);
                    g3.i2.a(bVarZ2, objU, null, 0L, sVar9, 8, 12);
                } else {
                    sVar9.U();
                }
                break;
            case 16:
                MainCharityActivity mainCharityActivity = (MainCharityActivity) obj3;
                m3.n nVar9 = (m3.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i28 = MainCharityActivity.f8980h;
                m3.s sVar10 = (m3.s) nVar9;
                if (sVar10.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    g9.f0 f0VarI3 = a.a.I(new g9.t0[0], sVar10);
                    boolean z11 = ((ci.c) mainCharityActivity.f8981f.getValue()).f8163a.n().getCharityUserDetails() != null;
                    boolean zH4 = sVar10.h(mainCharityActivity);
                    Object objM4 = sVar10.M();
                    if (zH4 || objM4 == fVar) {
                        objM4 = new b40.d(mainCharityActivity, 4);
                        sVar10.k0(objM4);
                    }
                    xh.a.a(f0VarI3, z11, (Function0) ((KFunction) objM4), sVar10, 0);
                } else {
                    sVar10.U();
                }
                break;
            case 17:
                ((Integer) obj2).getClass();
                int i29 = DeliveryCategoryCarousel.f9125q;
                ((DeliveryCategoryCarousel) obj3).a((m3.n) obj, m3.i.F(1));
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                dn.m mVar = (dn.m) obj3;
                String str2 = (String) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                str2.getClass();
                mVar.f15026d = str2;
                mVar.f15029g = iIntValue10;
                break;
            case 23:
                BringBackMagicActivity bringBackMagicActivity = (BringBackMagicActivity) obj3;
                m3.n nVar10 = (m3.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i31 = BringBackMagicActivity.f9257i;
                m3.s sVar11 = (m3.s) nVar10;
                if (sVar11.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    g9.f0 f0VarI4 = a.a.I(new g9.t0[0], sVar11);
                    boolean zH5 = sVar11.h(bringBackMagicActivity);
                    Object objM5 = sVar11.M();
                    if (zH5 || objM5 == fVar) {
                        objM5 = new b40.d(bringBackMagicActivity, 5);
                        sVar11.k0(objM5);
                    }
                    dq.j.b(f0VarI4, (Function0) ((KFunction) objM5), sVar11, 0);
                } else {
                    sVar11.U();
                }
                break;
            case 24:
                WebViewActivity webViewActivity = (WebViewActivity) obj3;
                androidx.lifecycle.n1 n1Var2 = webViewActivity.f9461h;
                m3.n nVar11 = (m3.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i32 = WebViewActivity.f9458k;
                m3.s sVar12 = (m3.s) nVar11;
                if (sVar12.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    at.h0 h0Var = (at.h0) m3.i.m(((dt.c) n1Var2.getValue()).f15173d, at.f0.f4775a, null, sVar12, 48, 2).getValue();
                    a50.c cVar = ((dt.c) n1Var2.getValue()).f15172c;
                    WebView webView2 = webViewActivity.f9462i;
                    if (webView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webView");
                        webView = null;
                    } else {
                        webView = webView2;
                    }
                    Object obj4 = webViewActivity.f9459f;
                    if (obj4 != null) {
                        objU = obj4;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("webViewClient");
                    }
                    d40.t1.p(h0Var, cVar, webView, objU, sVar12, 0);
                } else {
                    sVar12.U();
                }
                break;
            case 25:
                Country country = (Country) obj3;
                m3.n nVar12 = (m3.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                m3.s sVar13 = (m3.s) nVar12;
                if (sVar13.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    r9.d(country.getDisplayName(), d2.c.B(d2.m2.t(d2.m2.d(qVar, 1.0f), 3), lv.t.f28253g, 0.0f, 2), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar13, 48, 0, 262140);
                } else {
                    sVar13.U();
                }
                break;
            case 26:
                ManufacturerItemDetailsActivity manufacturerItemDetailsActivity = (ManufacturerItemDetailsActivity) obj3;
                String str3 = (String) obj;
                String string = (String) obj2;
                int i33 = ManufacturerItemDetailsActivity.f9137q;
                en.o oVarG = manufacturerItemDetailsActivity.G();
                ct.a aVar3 = ct.a.FAQ_ITEM_MANUFACTURER;
                Integer numValueOf = Integer.valueOf(R.string.item_view_description_tab_text);
                if (string == null) {
                    string = manufacturerItemDetailsActivity.getString(R.string.item_view_description_tab_text);
                    string.getClass();
                }
                aVar3.getClass();
                oVarG.f16172g.b(str3, aVar3, numValueOf, true, string);
                break;
            case 27:
                i80.n nVar13 = (i80.n) obj3;
                m3.n nVar14 = (m3.n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                m3.s sVar14 = (m3.s) nVar14;
                if (sVar14.R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar14, 0);
                    int iHashCode = Long.hashCode(sVar14.T);
                    u3.i iVarL = sVar14.l();
                    b4.t tVarC = b4.a.c(qVar, sVar14);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar14.e0();
                    if (sVar14.S) {
                        sVar14.k(hVar);
                    } else {
                        sVar14.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar14);
                    m3.i.C(iVarL, b5.i.f5842e, sVar14);
                    b5.g gVar = b5.i.f5844g;
                    if (sVar14.S || !Intrinsics.areEqual(sVar14.M(), Integer.valueOf(iHashCode))) {
                        e0.f.y(iHashCode, sVar14, iHashCode, gVar);
                    }
                    m3.i.C(tVarC, b5.i.f5841d, sVar14);
                    nVar13.invoke(d2.z.f13980a, sVar14, 6);
                    sVar14.q(true);
                } else {
                    sVar14.U();
                }
                break;
            case 28:
                a8.h hVar2 = (a8.h) obj3;
                m3.n nVar15 = (m3.n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                m3.s sVar15 = (m3.s) nVar15;
                if (sVar15.R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    String strJ = i3.r.j(sVar15, R.string.m3c_dialog);
                    float f11 = g3.a.f18299a;
                    float f12 = g3.a.f18300b;
                    b4.q qVar2 = b4.q.f5711a;
                    b4.t tVarP = d2.m2.p(qVar2, f11, 0.0f, f12, 0.0f, 10);
                    boolean zF = sVar15.f(strJ);
                    Object objM6 = sVar15.M();
                    Object obj5 = objM6;
                    if (zF || objM6 == fVar) {
                        c60.e eVar = new c60.e(strJ, 24);
                        sVar15.k0(eVar);
                        obj5 = eVar;
                    }
                    b4.t tVarThen = tVarP.then(j5.r.c(qVar2, false, (Function1) obj5));
                    z4.u0 u0VarD = d2.p.d(b4.d.f5683a, true);
                    int iHashCode2 = Long.hashCode(sVar15.T);
                    u3.i iVarL2 = sVar15.l();
                    b4.t tVarC2 = b4.a.c(tVarThen, sVar15);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar15.e0();
                    if (sVar15.S) {
                        sVar15.k(hVar3);
                    } else {
                        sVar15.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar15);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar15);
                    b5.g gVar2 = b5.i.f5844g;
                    if (sVar15.S || !Intrinsics.areEqual(sVar15.M(), Integer.valueOf(iHashCode2))) {
                        e0.f.y(iHashCode2, sVar15, iHashCode2, gVar2);
                    }
                    m3.i.C(tVarC2, b5.i.f5841d, sVar15);
                    r8.k.w(0, (u3.d) hVar2.f975d, sVar15, true);
                } else {
                    sVar15.U();
                }
                break;
            default:
                k4 k4Var = (k4) obj3;
                m3.n nVar16 = (m3.n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                m3.s sVar16 = (m3.s) nVar16;
                if (sVar16.R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    b4.t tVarB = k2.c.b(d2.m2.b(d2.c.K(d2.m2.d(qVar, 1.0f), k4Var.f18953e), 0.0f, j4.f18882a, 1));
                    d2.b bVar2 = d2.i.f13801a;
                    d2.g gVarG = d2.i.g(j4.f18883b);
                    b4.j jVar2 = b4.d.f5693k;
                    u3.d dVar = k4Var.f18954f;
                    d2.i2 i2VarA = d2.h2.a(gVarG, jVar2, sVar16, 54);
                    int iHashCode3 = Long.hashCode(sVar16.T);
                    u3.i iVarL3 = sVar16.l();
                    b4.t tVarC3 = b4.a.c(tVarB, sVar16);
                    b5.j.R.getClass();
                    b5.h hVar4 = b5.i.f5839b;
                    sVar16.e0();
                    if (sVar16.S) {
                        sVar16.k(hVar4);
                    } else {
                        sVar16.n0();
                    }
                    m3.i.C(i2VarA, b5.i.f5843f, sVar16);
                    m3.i.C(iVarL3, b5.i.f5842e, sVar16);
                    b5.g gVar3 = b5.i.f5844g;
                    if (sVar16.S || !Intrinsics.areEqual(sVar16.M(), Integer.valueOf(iHashCode3))) {
                        e0.f.y(iHashCode3, sVar16, iHashCode3, gVar3);
                    }
                    m3.i.C(tVarC3, b5.i.f5841d, sVar16);
                    dVar.invoke(d2.k2.f13824a, sVar16, 6);
                    sVar16.q(true);
                } else {
                    sVar16.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ f1(Object obj, int i11, int i12) {
        this.f343a = i12;
        this.f344b = obj;
    }
}
