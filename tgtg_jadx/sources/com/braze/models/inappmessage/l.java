package com.braze.models.inappmessage;

import com.braze.configuration.BrazeConfig;
import com.braze.enums.Month;
import com.braze.push.BrazeNotificationUtils;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import com.braze.support.ValidationUtils;
import com.braze.support.p;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10168b;

    public /* synthetic */ l(int i11, int i12) {
        this.f10167a = i12;
        this.f10168b = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10167a) {
            case 0:
                return InAppMessageBase._set_durationInMilliseconds_$lambda$0(this.f10168b);
            case 1:
                return InAppMessageBase._set_durationInMilliseconds_$lambda$1(this.f10168b);
            case 2:
                return BrazeNotificationUtils.getNotificationId$lambda$19(this.f10168b);
            case 3:
                return BrazeNotificationUtils.setNotificationDurationAlarm$lambda$15(this.f10168b);
            case 4:
                return BrazeNotificationUtils.cancelNotification$lambda$63(this.f10168b);
            case 5:
                return BrazeNotificationUtils.handleCancelNotificationAction$lambda$61(this.f10168b);
            case 6:
                return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$12(this.f10168b);
            case 7:
                return ContentCardAdapter.onViewAttachedToWindow$lambda$1(this.f10168b);
            case 8:
                return ContentCardAdapter.onViewDetachedFromWindow$lambda$2(this.f10168b);
            case 9:
                return DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$7(this.f10168b);
            case 10:
                return DefaultInAppMessageViewWrapper.open$lambda$1(this.f10168b);
            case 11:
                return InAppMessageHtmlBaseView._get_messageWebView_$lambda$2(this.f10168b);
            case 12:
                return InAppMessageImmersiveBaseView.setupDirectionalNavigation$lambda$1(this.f10168b);
            case 13:
                return BrazeLogger._set_logLevel_$lambda$0(this.f10168b);
            case 14:
                return PermissionUtils.wouldPushPermissionPromptDisplay$lambda$9(this.f10168b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return PermissionUtils.wouldPushPermissionPromptDisplay$lambda$7(this.f10168b);
            case 16:
                return ValidationUtils.isValidLogPurchaseInput$lambda$6(this.f10168b);
            case 17:
                return ValidationUtils.isValidLogPurchaseInput$lambda$7(this.f10168b);
            case 18:
                return p.a(this.f10168b);
            case 19:
                return com.braze.triggers.managers.c.a(this.f10168b);
            case 20:
                return BrazeConfig.Builder.setInAppMessageWebViewClientMaxOnPageFinishedWaitMs$lambda$34(this.f10168b);
            case 21:
                return Month.Companion.getMonth$lambda$2$lambda$1(this.f10168b);
            case 22:
                return com.braze.managers.n.a(this.f10168b);
            default:
                return com.braze.managers.n.b(this.f10168b);
        }
    }
}
