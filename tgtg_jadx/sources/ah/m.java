package ah;

import al.t;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.app.tgtg.feature.authentication.ui.AuthenticationActivity;
import com.app.tgtg.feature.badges.ui.BadgesActivity;
import com.app.tgtg.feature.charity.ui.MainCharityActivity;
import com.app.tgtg.feature.charity.ui.help.CharityContactUsActivity;
import com.app.tgtg.feature.flashsales.list.FlashSalesListActivity;
import com.app.tgtg.feature.helpdesk.HelpCenterActivity;
import com.app.tgtg.feature.login.LoginActivity;
import com.app.tgtg.feature.login.SplashActivity;
import com.app.tgtg.feature.login.email.EmailAccessActivity;
import com.app.tgtg.feature.login.email.EmailCodeAccessActivity;
import com.app.tgtg.feature.login.onboarding.OnboardingActivity;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.feature.rating.RatingActivity;
import com.app.tgtg.feature.recipegenerator.RecipeGeneratorActivity;
import com.app.tgtg.feature.survey.bringmagic.BringBackMagicActivity;
import com.app.tgtg.feature.survey.rewards.RewardsSurveyActivity;
import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity;
import com.app.tgtg.feature.tabprofile.legal.LegalActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.privacyaction.PrivacyActionActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.trackingconsent.TrackingConsentActivity;
import com.app.tgtg.feature.tabprofile.legal.privacy.trackingconsent.TrackingConsentDetailActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.ManageAccountActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.SettingsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.AccountDetailsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.ui.HiddenStoresActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.notificationsettings.ui.NotificationSettingsActivity;
import com.app.tgtg.feature.webview.ui.WebViewActivity;
import ft.o;
import ft.s;
import hm.w;
import mv.e0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements OnContextAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k.h f1475b;

    public /* synthetic */ m(k.h hVar, int i11) {
        this.f1474a = i11;
        this.f1475b = hVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void a(ComponentActivity componentActivity) {
        switch (this.f1474a) {
            case 0:
                AuthenticationActivity authenticationActivity = (AuthenticationActivity) this.f1475b;
                if (!authenticationActivity.f1479e) {
                    authenticationActivity.f1479e = true;
                    authenticationActivity.f8961f = (e70.c) ((ag.b) ((b) authenticationActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 1:
                LoginActivity loginActivity = (LoginActivity) this.f1475b;
                if (!loginActivity.f1479e) {
                    loginActivity.f1479e = true;
                    loginActivity.f9033f = (e70.c) ((ag.b) ((al.g) loginActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 2:
                SplashActivity splashActivity = (SplashActivity) this.f1475b;
                if (!splashActivity.f1479e) {
                    splashActivity.f1479e = true;
                    ag.i iVar = ((ag.b) ((t) splashActivity.a())).f1288a;
                    splashActivity.f9040i = (o) iVar.f1330k.get();
                    splashActivity.f9041j = (s) iVar.A.get();
                    splashActivity.f9042k = (e70.c) iVar.f1325h0.get();
                }
                break;
            case 3:
                RatingActivity ratingActivity = (RatingActivity) this.f1475b;
                if (!ratingActivity.f9236d) {
                    ratingActivity.f9236d = true;
                    ((ap.a) ratingActivity.a()).getClass();
                }
                break;
            case 4:
                OrderListActivity orderListActivity = (OrderListActivity) this.f1475b;
                if (!orderListActivity.f1479e) {
                    orderListActivity.f1479e = true;
                    ((br.f) orderListActivity.a()).getClass();
                }
                break;
            case 5:
                HiddenStoresActivity hiddenStoresActivity = (HiddenStoresActivity) this.f1475b;
                if (!hiddenStoresActivity.f9415d) {
                    hiddenStoresActivity.f9415d = true;
                    ((bs.g) hiddenStoresActivity.a()).getClass();
                }
                break;
            case 6:
                MainCharityActivity mainCharityActivity = (MainCharityActivity) this.f1475b;
                if (!mainCharityActivity.f1479e) {
                    mainCharityActivity.f1479e = true;
                    mainCharityActivity.f8982g = (e70.c) ((ag.b) ((ci.b) mainCharityActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 7:
                LegalActivity legalActivity = (LegalActivity) this.f1475b;
                if (!legalActivity.f1479e) {
                    legalActivity.f1479e = true;
                    legalActivity.f9325f = (e70.c) ((ag.b) ((cr.d) legalActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 8:
                FlashSalesListActivity flashSalesListActivity = (FlashSalesListActivity) this.f1475b;
                if (!flashSalesListActivity.f1479e) {
                    flashSalesListActivity.f1479e = true;
                    ag.i iVar2 = ((ag.b) ((dk.d) flashSalesListActivity.a())).f1288a;
                    flashSalesListActivity.f8996f = (e70.c) iVar2.f1325h0.get();
                    flashSalesListActivity.f9000j = (e0) iVar2.f1327i0.get();
                }
                break;
            case 9:
                BringBackMagicActivity bringBackMagicActivity = (BringBackMagicActivity) this.f1475b;
                if (!bringBackMagicActivity.f1479e) {
                    bringBackMagicActivity.f1479e = true;
                    ag.i iVar3 = ((ag.b) ((dq.b) bringBackMagicActivity.a())).f1288a;
                    bringBackMagicActivity.f9259g = (o) iVar3.f1330k.get();
                    bringBackMagicActivity.f9260h = (e70.c) iVar3.f1325h0.get();
                }
                break;
            case 10:
                WebViewActivity webViewActivity = (WebViewActivity) this.f1475b;
                if (!webViewActivity.f1479e) {
                    webViewActivity.f1479e = true;
                    ag.b bVar = (ag.b) ((dt.b) webViewActivity.a());
                    bVar.getClass();
                    ag.i iVar4 = bVar.f1288a;
                    webViewActivity.f9459f = new bt.b((ao.c) iVar4.P.get());
                    webViewActivity.f9460g = (e70.c) iVar4.f1325h0.get();
                }
                break;
            case 11:
                HelpCenterActivity helpCenterActivity = (HelpCenterActivity) this.f1475b;
                if (!helpCenterActivity.f1479e) {
                    helpCenterActivity.f1479e = true;
                    helpCenterActivity.f9009h = (e70.c) ((ag.b) ((ek.e) helpCenterActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 12:
                ((ManufacturerItemDetailsActivity) this.f1475b).D();
                break;
            case 13:
                RecipeGeneratorActivity recipeGeneratorActivity = (RecipeGeneratorActivity) this.f1475b;
                if (!recipeGeneratorActivity.f1479e) {
                    recipeGeneratorActivity.f1479e = true;
                    recipeGeneratorActivity.f9239f = (e70.c) ((ag.b) ((ep.b) recipeGeneratorActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 14:
                EmailAccessActivity emailAccessActivity = (EmailAccessActivity) this.f1475b;
                if (!emailAccessActivity.f1479e) {
                    emailAccessActivity.f1479e = true;
                    emailAccessActivity.f9044f = (e70.c) ((ag.b) ((fl.c) emailAccessActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                EmailCodeAccessActivity emailCodeAccessActivity = (EmailCodeAccessActivity) this.f1475b;
                if (!emailCodeAccessActivity.f1479e) {
                    emailCodeAccessActivity.f1479e = true;
                    emailCodeAccessActivity.f9049f = (e70.c) ((ag.b) ((fl.h) emailCodeAccessActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 16:
                PrivacyActionActivity privacyActionActivity = (PrivacyActionActivity) this.f1475b;
                if (!privacyActionActivity.f1479e) {
                    privacyActionActivity.f1479e = true;
                    privacyActionActivity.f9331f = (e70.c) ((ag.b) ((fr.h) privacyActionActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 17:
                OnboardingActivity onboardingActivity = (OnboardingActivity) this.f1475b;
                if (!onboardingActivity.f9057d) {
                    onboardingActivity.f9057d = true;
                    ((gl.a) onboardingActivity.a()).getClass();
                }
                break;
            case 18:
                ((CharityOrderActivity) this.f1475b).D();
                break;
            case 19:
                RewardsSurveyActivity rewardsSurveyActivity = (RewardsSurveyActivity) this.f1475b;
                if (!rewardsSurveyActivity.f1479e) {
                    rewardsSurveyActivity.f1479e = true;
                    ag.i iVar5 = ((ag.b) ((gq.f) rewardsSurveyActivity.a())).f1288a;
                    rewardsSurveyActivity.f9263g = (o) iVar5.f1330k.get();
                    rewardsSurveyActivity.f9264h = (e70.c) iVar5.f1325h0.get();
                }
                break;
            case 20:
                TrackingConsentActivity trackingConsentActivity = (TrackingConsentActivity) this.f1475b;
                if (!trackingConsentActivity.f1479e) {
                    trackingConsentActivity.f1479e = true;
                    ag.i iVar6 = ((ag.b) ((gr.h) trackingConsentActivity.a())).f1288a;
                    trackingConsentActivity.f9339h = (e70.c) iVar6.f1325h0.get();
                    trackingConsentActivity.f9340i = (cv.b) iVar6.E.get();
                }
                break;
            case 21:
                TrackingConsentDetailActivity trackingConsentDetailActivity = (TrackingConsentDetailActivity) this.f1475b;
                if (!trackingConsentDetailActivity.f9345d) {
                    trackingConsentDetailActivity.f9345d = true;
                    ((gr.i) trackingConsentDetailActivity.a()).getClass();
                }
                break;
            case 22:
                CharityContactUsActivity charityContactUsActivity = (CharityContactUsActivity) this.f1475b;
                if (!charityContactUsActivity.f8986d) {
                    charityContactUsActivity.f8986d = true;
                    ((hi.b) charityContactUsActivity.a()).getClass();
                }
                break;
            case 23:
                MainActivity mainActivity = (MainActivity) this.f1475b;
                if (!mainActivity.f1479e) {
                    mainActivity.f1479e = true;
                    ag.i iVar7 = ((ag.b) ((w) mainActivity.a())).f1288a;
                    mainActivity.f9079f = (e70.c) iVar7.f1325h0.get();
                    mainActivity.f9080g = (o) iVar7.f1330k.get();
                }
                break;
            case 24:
                ((go.w) this.f1475b).D();
                break;
            case 25:
                ManageAccountActivity manageAccountActivity = (ManageAccountActivity) this.f1475b;
                if (!manageAccountActivity.f1479e) {
                    manageAccountActivity.f1479e = true;
                    manageAccountActivity.f9350g = (e70.c) ((ag.b) ((hr.e) manageAccountActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 26:
                SettingsActivity settingsActivity = (SettingsActivity) this.f1475b;
                if (!settingsActivity.f1479e) {
                    settingsActivity.f1479e = true;
                    settingsActivity.f9352f = (e70.c) ((ag.b) ((hr.m) settingsActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 27:
                NotificationSettingsActivity notificationSettingsActivity = (NotificationSettingsActivity) this.f1475b;
                if (!notificationSettingsActivity.f1479e) {
                    notificationSettingsActivity.f1479e = true;
                    notificationSettingsActivity.f9423f = (e70.c) ((ag.b) ((hs.c) notificationSettingsActivity.a())).f1288a.f1325h0.get();
                }
                break;
            case 28:
                BadgesActivity badgesActivity = (BadgesActivity) this.f1475b;
                if (!badgesActivity.f1479e) {
                    badgesActivity.f1479e = true;
                    badgesActivity.f8965f = (e70.c) ((ag.b) ((ih.d) badgesActivity.a())).f1288a.f1325h0.get();
                }
                break;
            default:
                AccountDetailsActivity accountDetailsActivity = (AccountDetailsActivity) this.f1475b;
                if (!accountDetailsActivity.f1479e) {
                    accountDetailsActivity.f1479e = true;
                    accountDetailsActivity.f9358f = (e70.c) ((ag.b) ((ir.a) accountDetailsActivity.a())).f1288a.f1325h0.get();
                }
                break;
        }
    }
}
