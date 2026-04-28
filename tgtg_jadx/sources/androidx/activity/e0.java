package androidx.activity;

import android.os.Parcelable;
import android.webkit.WebView;
import androidx.fragment.app.o0;
import androidx.recyclerview.widget.y1;
import androidx.viewpager2.widget.ViewPager2;
import bg.k0;
import com.app.tgtg.R;
import com.app.tgtg.feature.badges.ui.BadgesActivity;
import com.app.tgtg.feature.flashsales.list.FlashSalesListActivity;
import com.app.tgtg.feature.helpdesk.HelpCenterActivity;
import com.app.tgtg.feature.login.email.EmailAccessActivity;
import com.app.tgtg.feature.login.email.EmailCodeAccessActivity;
import com.app.tgtg.feature.login.optin.OptInActivity;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.feature.rating.RatingActivity;
import com.app.tgtg.feature.recipegenerator.RecipeGeneratorActivity;
import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity;
import com.app.tgtg.feature.tabprofile.legal.LegalActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.privacyaction.PrivacyActionActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.trackingconsent.TrackingConsentActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.trackingconsent.TrackingConsentDetailActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.ManageAccountActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.SettingsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.ui.HiddenStoresActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.notificationsettings.ui.NotificationSettingsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.paymentoptions.PaymentOptionsActivity;
import com.app.tgtg.feature.webview.ui.WebViewActivity;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemsV2Response;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mv.r0;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.c2;
import pg.t2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1722b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj, int i11) {
        super(true);
        this.f1721a = i11;
        this.f1722b = obj;
    }

    @Override // androidx.activity.y
    public void handleOnBackCancelled() {
        switch (this.f1721a) {
            case 11:
                ((c5.b) this.f1722b).o();
                break;
            default:
                super.handleOnBackCancelled();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [cv.b] */
    /* JADX WARN: Type inference failed for: r3v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.app.Activity, com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity, en.g] */
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
    @Override // androidx.activity.y
    public final void handleOnBackPressed() throws Throwable {
        int i11 = this.f1721a;
        bo.d dVar = null;
        WebView webView = null;
        int i12 = 2;
        int i13 = 6;
        Object obj = this.f1722b;
        switch (i11) {
            case 0:
                ((Function1) obj).invoke(this);
                break;
            case 1:
                ((RatingActivity) obj).finish();
                break;
            case 2:
                bl.d dVar2 = (bl.d) obj;
                dVar2.p().c(false);
                ft.s sVar = dVar2.p().f20821d;
                sVar.getClass();
                v80.f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar, A, i12));
                if (dVar2.p().b()) {
                    dVar2.p().a();
                }
                dVar2.p().d();
                gr.k kVarP = dVar2.p();
                cv.i iVar = cv.i.ACTION_TRACKING_OPTIN;
                dv.a aVar = dv.a.OPT_IN;
                dv.d dVar3 = dv.d.BACK;
                A = dVar3 != null ? dVar3.a() : 0;
                iVar.getClass();
                aVar.getClass();
                kVarP.f20820c.d(iVar, aVar, A);
                dVar2.dismiss();
                break;
            case 3:
                r0.m((OrderListActivity) obj, (6 & 2) == 0, (6 & 4) == 0);
                break;
            case 4:
                r0.m((HiddenStoresActivity) obj, (6 & 2) == 0, (6 & 4) == 0);
                break;
            case 5:
                r0.m((LegalActivity) obj, (6 & 2) == 0, (6 & 4) == 0);
                break;
            case 6:
                FlashSalesListActivity flashSalesListActivity = (FlashSalesListActivity) obj;
                int i14 = FlashSalesListActivity.f8995p;
                flashSalesListActivity.finish();
                flashSalesListActivity.overridePendingTransition(R.anim.slide_in_from_left_to_right, R.anim.slide_out_from_left_to_right);
                break;
            case 7:
                WebViewActivity webViewActivity = (WebViewActivity) obj;
                WebView webView2 = webViewActivity.f9462i;
                if (webView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webView");
                    webView2 = null;
                }
                if (webView2.canGoBack()) {
                    WebView webView3 = webViewActivity.f9462i;
                    if (webView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webView");
                    } else {
                        webView = webView3;
                    }
                    webView.goBack();
                } else if (!webViewActivity.isTaskRoot()) {
                    webViewActivity.finish();
                } else {
                    new mv.a0().c(webViewActivity);
                }
                break;
            case 8:
                r0.m((HelpCenterActivity) obj, (6 & 2) == 0, (6 & 4) == 0);
                break;
            case 9:
                ?? r62 = (ManufacturerItemDetailsActivity) obj;
                r62.H();
                r62.C(r62, r62.isTaskRoot());
                break;
            case 10:
                RecipeGeneratorActivity recipeGeneratorActivity = (RecipeGeneratorActivity) obj;
                int i15 = RecipeGeneratorActivity.f9238k;
                recipeGeneratorActivity.a0().p(recipeGeneratorActivity);
                r0.m(recipeGeneratorActivity, (6 & 2) == 0, (6 & 4) == 0);
                break;
            case 11:
                ((c5.b) obj).p();
                break;
            case 12:
                r0.m((EmailAccessActivity) obj, (6 & 2) == 0, (6 & 4) == 0);
                break;
            case 13:
                EmailCodeAccessActivity emailCodeAccessActivity = (EmailCodeAccessActivity) obj;
                r0.p(emailCodeAccessActivity);
                jb.s sVarD = jb.s.d(emailCodeAccessActivity);
                sVarD.getClass();
                sVarD.a("UserPolling2");
                emailCodeAccessActivity.finish();
                break;
            case 14:
                o0 activity = ((fn.t) obj).getActivity();
                if (activity != null) {
                    activity.finish();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                PrivacyActionActivity privacyActionActivity = (PrivacyActionActivity) obj;
                if (!privacyActionActivity.f9334i) {
                    r0.m(privacyActionActivity, (6 & 2) == 0, (6 & 4) == 0);
                }
                break;
            case 16:
                ((g9.p) obj).h();
                break;
            case 17:
                gl.l lVar = (gl.l) obj;
                t2 t2Var = lVar.f20556h;
                t2Var.getClass();
                if (((ViewPager2) t2Var.f35173j).getCurrentItem() != 0) {
                    t2 t2Var2 = lVar.f20556h;
                    t2Var2.getClass();
                    pd.g.G((ViewPager2) t2Var2.f35173j);
                    break;
                }
                break;
            case 18:
                r0.m((CharityOrderActivity) obj, (6 & 2) == 0, (6 & 4) == 0);
                break;
            case 19:
                TrackingConsentActivity trackingConsentActivity = (TrackingConsentActivity) obj;
                int i16 = TrackingConsentActivity.f9336k;
                if (trackingConsentActivity.a0().b() && Intrinsics.areEqual((Boolean) trackingConsentActivity.a0().f20818a.a("IS_LOGGED_IN"), Boolean.TRUE)) {
                    trackingConsentActivity.finishAffinity();
                } else if (!trackingConsentActivity.a0().b()) {
                    trackingConsentActivity.finish();
                } else {
                    trackingConsentActivity.a0().c(false);
                    ft.s sVar2 = trackingConsentActivity.a0().f20821d;
                    sVar2.getClass();
                    v80.f0.E(kotlin.coroutines.g.f26549a, new ft.q(sVar2, A, i12));
                    if (trackingConsentActivity.a0().b()) {
                        trackingConsentActivity.a0().a();
                    }
                    trackingConsentActivity.a0().d();
                    cv.b bVar = trackingConsentActivity.f9340i;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
                        bVar = null;
                    }
                    cv.i iVar2 = cv.i.ACTION_TRACKING_OPTIN;
                    dv.a aVar2 = dv.a.OPT_IN;
                    dv.d dVar4 = dv.d.BACK;
                    bVar.d(iVar2, aVar2, dVar4 != null ? dVar4.a() : null);
                    trackingConsentActivity.c0();
                }
                break;
            case 20:
                r0.m((TrackingConsentDetailActivity) obj, (6 & 2) == 0, (6 & 4) == 0);
                break;
            case 21:
                MainActivity mainActivity = (MainActivity) obj;
                bo.d dVar5 = mainActivity.l;
                if (dVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fragmentManager");
                    dVar5 = null;
                }
                km.a aVarA = dVar5.a();
                if (aVarA instanceof eo.f) {
                    bo.d dVar6 = mainActivity.l;
                    if (dVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("fragmentManager");
                    } else {
                        dVar = dVar6;
                    }
                    km.a aVarA2 = dVar.a();
                    aVarA2.getClass();
                    eo.f fVar = (eo.f) aVarA2;
                    if (!fVar.r().canGoBack()) {
                        mainActivity.finish();
                    } else {
                        fVar.r().goBack();
                    }
                } else if (!(aVarA instanceof fn.t)) {
                    boolean z11 = aVarA instanceof ym.u;
                    int i17 = R.id.item_discover;
                    if (!z11) {
                        if (mainActivity.g0().c() && ft.c.C()) {
                            i17 = R.id.item_my_store;
                        }
                        if (mainActivity.f0().getVisibility() == 0) {
                            mainActivity.f0().setSelectedItemId(i17);
                        }
                    } else {
                        bo.d dVar7 = mainActivity.l;
                        if (dVar7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("fragmentManager");
                            dVar7 = null;
                        }
                        km.a aVarA3 = dVar7.a();
                        aVarA3.getClass();
                        ym.u uVar = (ym.u) aVarA3;
                        if (!uVar.f46245t && uVar.r().f46271t == null) {
                            mainActivity.f0().setSelectedItemId(R.id.item_discover);
                        } else {
                            uVar.f46245t = false;
                            if (uVar.f46246u) {
                                uVar.u();
                            } else if (uVar.r().f46271t == null) {
                                ManufacturerItemsV2Response manufacturerItemsV2Response = uVar.f46243r;
                                if (manufacturerItemsV2Response == null) {
                                    uVar.u();
                                } else {
                                    uVar.f46245t = false;
                                    if (uVar.f46236j == null) {
                                        uVar.t();
                                    }
                                    ym.o oVar = uVar.f46236j;
                                    if (oVar != null) {
                                        ArrayList arrayList = oVar.f46203c;
                                        arrayList.getClass();
                                        arrayList.clear();
                                        oVar.notifyDataSetChanged();
                                    }
                                    uVar.r().d();
                                    uVar.r().f46262j.i(Boolean.FALSE);
                                    uVar.s(manufacturerItemsV2Response);
                                    Parcelable parcelable = uVar.f46244s;
                                    if (parcelable != null) {
                                        c2 c2Var = uVar.f46233g;
                                        c2Var.getClass();
                                        y1 layoutManager = c2Var.C.getLayoutManager();
                                        if (layoutManager != null) {
                                            layoutManager.onRestoreInstanceState(parcelable);
                                        }
                                    }
                                }
                            } else {
                                dn.m mVar = uVar.f46249x;
                                if (mVar != null) {
                                    mVar.c(null);
                                }
                            }
                        }
                    }
                } else {
                    mainActivity.finish();
                }
                break;
            case 22:
                r0.m((ManageAccountActivity) obj, true, true);
                break;
            case 23:
                r0.m((SettingsActivity) obj, (6 & 2) == 0, (6 & 4) == 0);
                break;
            case 24:
                NotificationSettingsActivity notificationSettingsActivity = (NotificationSettingsActivity) obj;
                int i18 = NotificationSettingsActivity.f9422k;
                if (!notificationSettingsActivity.a0().c()) {
                    r0.m(notificationSettingsActivity, (6 & 2) == 0, (6 & 4) == 0);
                } else {
                    k0 k0Var = new k0(notificationSettingsActivity);
                    k0Var.e(R.string.notification_settings_confirm_exit_alert_title);
                    k0Var.a(R.string.notification_settings_confirm_exit_alert_description);
                    k0Var.c(R.string.notification_settings_confirm_exit_alert_positive_btn);
                    k0Var.l = new hs.a(notificationSettingsActivity, i13);
                    k0Var.b(R.string.notification_settings_confirm_exit_alert_negative_btn);
                    k0Var.f6182n = new hs.a(notificationSettingsActivity, 7);
                    k0Var.f();
                }
                break;
            case 25:
                r0.m((BadgesActivity) obj, true, true);
                break;
            case 26:
                ik.b bVar2 = (ik.b) obj;
                g9.p pVarT = o30.e0.t(bVar2);
                o0 o0VarRequireActivity = bVar2.requireActivity();
                o0VarRequireActivity.getClass();
                if (!pVarT.g()) {
                    o0VarRequireActivity.finish();
                    break;
                }
                break;
            case 27:
                r0.m((PaymentOptionsActivity) obj, (6 & 2) == 0, (6 & 4) == 0);
                break;
            case 28:
                OptInActivity optInActivity = (OptInActivity) obj;
                if (!optInActivity.f9062i) {
                    optInActivity.finish();
                } else {
                    optInActivity.a0().d();
                }
                break;
            default:
                r0.m((ManufacturerOrderActivity) obj, (6 & 2) == 0, (6 & 4) == 0);
                break;
        }
    }

    @Override // androidx.activity.y
    public void handleOnBackProgressed(b bVar) {
        switch (this.f1721a) {
            case 11:
                ((c5.b) this.f1722b).q(bVar);
                break;
            default:
                super.handleOnBackProgressed(bVar);
                break;
        }
    }

    @Override // androidx.activity.y
    public void handleOnBackStarted(b bVar) {
        switch (this.f1721a) {
            case 11:
                ((c5.b) this.f1722b).r();
                break;
            default:
                super.handleOnBackStarted(bVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj, boolean z11, int i11) {
        super(false);
        this.f1721a = i11;
        this.f1722b = obj;
    }
}
