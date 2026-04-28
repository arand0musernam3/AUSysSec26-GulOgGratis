package com.braze.push;

import com.braze.push.BrazeFirebaseMessagingService;
import com.braze.push.BrazeNotificationFactory;
import com.braze.push.BrazeNotificationStyleFactory;
import com.braze.push.NotificationTrampolineActivity;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10338a;

    public /* synthetic */ k(int i11) {
        this.f10338a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10338a) {
            case 0:
                return NotificationTrampolineActivity.AnonymousClass7.invokeSuspend$lambda$0();
            case 1:
                return BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$5();
            case 2:
                return BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$6();
            case 3:
                return BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$12();
            case 4:
                return BrazeHuaweiPushHandler.handleHmsRemoteMessageData$lambda$1();
            case 5:
                return BrazeHuaweiPushHandler.handleHmsRemoteMessageData$lambda$2();
            case 6:
                return BrazeNotificationActionUtils.handleNotificationActionClicked$lambda$3();
            case 7:
                return BrazeNotificationActionUtils.handleNotificationActionClicked$lambda$4();
            case 8:
                return BrazeNotificationActionUtils.handleNotificationActionClicked$lambda$5();
            case 9:
                return BrazeNotificationActionUtils.handleNotificationActionClicked$lambda$6();
            case 10:
                return BrazeNotificationActionUtils.addNotificationActions$lambda$0();
            case 11:
                return BrazeNotificationActionUtils.addNotificationActions$lambda$1();
            case 12:
                return BrazeNotificationActionUtils.addNotificationAction$lambda$7();
            case 13:
                return BrazeNotificationFactory.createNotification$lambda$0();
            case 14:
                return BrazeNotificationFactory.Companion.populateNotificationBuilder$lambda$1();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BrazeNotificationFactory.Companion.populateNotificationBuilder$lambda$2();
            case 16:
                return BrazeNotificationStyleFactory.Companion.getNotificationStyle$lambda$5();
            case 17:
                return BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$11();
            case 18:
                return BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$12();
            case 19:
                return BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$13();
            case 20:
                return BrazeNotificationStyleFactory.Companion.getInlineImageStyle$lambda$15();
            case 21:
                return BrazeNotificationStyleFactory.Companion.setStyleIfSupported$lambda$0();
            case 22:
                return BrazeNotificationStyleFactory.Companion.getStoryStyle$lambda$9();
            case 23:
                return BrazeNotificationStyleFactory.Companion.getStoryStyle$lambda$10();
            case 24:
                return BrazeNotificationStyleFactory.Companion.populatePushStoryPage$lambda$25();
            case 25:
                return BrazeNotificationStyleFactory.Companion.populatePushStoryPage$lambda$26();
            case 26:
                return BrazeNotificationStyleFactory.Companion.getBigPictureNotificationStyle$lambda$19();
            case 27:
                return BrazeNotificationStyleFactory.Companion.populatePushStoryPage$lambda$27();
            case 28:
                return BrazeNotificationStyleFactory.Companion.getBigPictureNotificationStyle$lambda$20();
            default:
                return BrazeNotificationStyleFactory.Companion.getConversationalPushStyle$lambda$21();
        }
    }
}
