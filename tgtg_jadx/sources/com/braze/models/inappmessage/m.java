package com.braze.models.inappmessage;

import com.braze.models.p;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.braze.ui.actions.brazeactions.steps.BaseBrazeActionStep$Companion$runOnUser$1;
import com.braze.ui.banners.jsinterface.BannerJavascriptInterface;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import com.braze.ui.contentcards.ContentCardsFragment;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10169a;

    public /* synthetic */ m(int i11) {
        this.f10169a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10169a) {
            case 0:
                return InAppMessageHtmlBase.logButtonClick$lambda$3();
            case 1:
                return InAppMessageImmersiveBase.enableDarkTheme$lambda$5();
            case 2:
                return InAppMessageImmersiveBase.logButtonClick$lambda$2();
            case 3:
                return InAppMessageImmersiveBase.logButtonClick$lambda$3();
            case 4:
                return InAppMessageImmersiveBase.logButtonClick$lambda$1();
            case 5:
                return InAppMessageSlideup.enableDarkTheme$lambda$0();
            case 6:
                return InAppMessageSlideup.forJsonPut$lambda$2();
            case 7:
                return MessageButton.enableDarkTheme$lambda$2$lambda$1();
            case 8:
                return MessageButton.setClickBehavior$lambda$3();
            case 9:
                return MessageButton.setClickBehavior$lambda$4();
            case 10:
                return b.a();
            case 11:
                return p.c();
            case 12:
                return BrazeDeeplinkHandler.createUriActionFromUrlString$lambda$0();
            case 13:
                return BrazeDeeplinkHandler.createUriActionFromUrlString$lambda$1();
            case 14:
                return BrazeWebViewActivity.onCreate$lambda$1();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BrazeWebViewActivity.C01441.onRenderProcessGone$lambda$1();
            case 16:
                return BrazeWebViewClient.markPageFinished$lambda$5$lambda$4();
            case 17:
                return BrazeWebViewClient.onRenderProcessGone$lambda$13();
            case 18:
                return BrazeWebViewClient.onPageFinished$lambda$2$lambda$1();
            case 19:
                return UserJavascriptInterfaceBase.parseStringArrayFromJsonString$lambda$34();
            case 20:
                return BaseBrazeActionStep$Companion$runOnUser$1.onError$lambda$0();
            case 21:
                return BannerJavascriptInterface.logButtonClick$lambda$1();
            case 22:
                return BannerJavascriptInterface.logClick$lambda$2();
            case 23:
                return BannerJavascriptInterface.requestPushPermission$lambda$5();
            case 24:
                return BrazeContentCardUtils.handleCardClick$lambda$4();
            case 25:
                return BrazeContentCardUtils.getUriActionForCard$lambda$2();
            case 26:
                return ContentCardsFragment.networkUnavailable$lambda$16();
            case 27:
                return ContentCardsFragment.contentCardsUpdate$lambda$11();
            case 28:
                return ContentCardsFragment.contentCardsUpdate$lambda$12();
            default:
                return ContentCardsFragment.onPause$lambda$4();
        }
    }
}
