package com.braze.push;

import com.braze.push.BrazePushReceiver;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10336a;

    public /* synthetic */ i(int i11) {
        this.f10336a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10336a) {
            case 0:
                return BrazeNotificationUtils.setTickerIfPresent$lambda$32();
            case 1:
                return BrazeNotificationUtils.handleNotificationOpened$lambda$0();
            case 2:
                return BrazeNotificationUtils.handleNotificationOpened$lambda$1();
            case 3:
                return BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$22();
            case 4:
                return BrazeNotificationUtils.setSummaryTextIfPresentAndSupported$lambda$47();
            case 5:
                return BrazeNotificationUtils.setSummaryTextIfPresentAndSupported$lambda$48();
            case 6:
                return BrazeNotificationUtils.cancelNotification$lambda$64();
            case 7:
                return BrazeNotificationUtils.setAccentColorIfPresentAndSupported$lambda$50();
            case 8:
                return BrazeNotificationUtils.setAccentColorIfPresentAndSupported$lambda$52$lambda$51();
            case 9:
                return BrazeNotificationUtils.setContentIntentIfPresent$lambda$33();
            case 10:
                return BrazeNotificationUtils.setTitleIfPresent$lambda$30();
            case 11:
                return BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$4();
            case 12:
                return BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$23();
            case 13:
                return BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$38();
            case 14:
                return BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$39();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$41();
            case 16:
                return BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$42();
            case 17:
                return BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$43();
            case 18:
                return BrazeNotificationUtils.setLargeIconIfPresentAndSupported$lambda$44();
            case 19:
                return BrazeNotificationUtils.handleCancelNotificationAction$lambda$62();
            case 20:
                return BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$24();
            case 21:
                return BrazeNotificationUtils.getOrCreateNotificationChannelId$lambda$68();
            case 22:
                return BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$26();
            case 23:
                return BrazeNotificationUtils.setContentIfPresent$lambda$31();
            case 24:
                return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$11();
            case 25:
                return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$18();
            case 26:
                return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$19();
            case 27:
                return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$20();
            case 28:
                return BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$5();
            default:
                return BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$6();
        }
    }
}
