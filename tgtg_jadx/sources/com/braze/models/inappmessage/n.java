package com.braze.models.inappmessage;

import com.braze.models.outgoing.BrazeProperties;
import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.JavascriptInterfaceBase;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import com.braze.ui.inappmessage.views.InAppMessageBaseView;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10171b;

    public /* synthetic */ n(String str, int i11) {
        this.f10170a = i11;
        this.f10171b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10170a) {
            case 0:
                return InAppMessageHtmlBase.logButtonClick$lambda$0(this.f10171b);
            case 1:
                return b.a(this.f10171b);
            case 2:
                return BrazeWebViewActivity.C01441.handleUrlOverride$lambda$0(this.f10171b);
            case 3:
                return BrazeWebViewClient.handleUrlOverride$lambda$7$lambda$6(this.f10171b);
            case 4:
                return JavascriptInterfaceBase.parseProperties$lambda$2(this.f10171b);
            case 5:
                return JavascriptInterfaceBase.logPurchaseWithJSON$lambda$0(this.f10171b);
            case 6:
                return JavascriptInterfaceBase.logPurchaseWithJSON$lambda$1(this.f10171b);
            case 7:
                return UserJavascriptInterfaceBase.setEmailNotificationSubscriptionType$lambda$12(this.f10171b);
            case 8:
                return UserJavascriptInterfaceBase.setDateOfBirth$lambda$6(this.f10171b);
            case 9:
                return UserJavascriptInterfaceBase.setDateOfBirth$lambda$7(this.f10171b);
            case 10:
                return UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$25(this.f10171b);
            case 11:
                return UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$26(this.f10171b);
            case 12:
                return UserJavascriptInterfaceBase.incrementCustomUserAttribute$lambda$23(this.f10171b);
            case 13:
                return UserJavascriptInterfaceBase.setGender$lambda$3(this.f10171b);
            case 14:
                return UserJavascriptInterfaceBase.setCustomUserAttributeArray$lambda$19(this.f10171b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return UserJavascriptInterfaceBase.setPushNotificationSubscriptionType$lambda$14(this.f10171b);
            case 16:
                return UserJavascriptInterfaceBase.setDateOfBirth$lambda$5(this.f10171b);
            case 17:
                return BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$57$lambda$55(this.f10171b);
            case 18:
                return DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$6(this.f10171b);
            case 19:
                return DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$7(this.f10171b);
            case 20:
                return DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$8(this.f10171b);
            case 21:
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload$lambda$12(this.f10171b);
            case 22:
                return BackgroundInAppMessagePreparer.handleLocalImage$lambda$15(this.f10171b);
            case 23:
                return BackgroundInAppMessagePreparer.handleLocalImage$lambda$16(this.f10171b);
            case 24:
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml$lambda$4(this.f10171b);
            case 25:
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml$lambda$7(this.f10171b);
            case 26:
                return InAppMessageBaseView.Companion.getAppropriateImageUrl$lambda$0(this.f10171b);
            case 27:
                return BrazeProperties.addProperty$lambda$0(this.f10171b);
            case 28:
                return com.braze.models.outgoing.event.a.n(this.f10171b);
            default:
                return com.braze.models.outgoing.event.a.d(this.f10171b);
        }
    }
}
