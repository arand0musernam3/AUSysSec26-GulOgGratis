package com.braze.push;

import com.braze.push.BrazeFirebaseMessagingService;
import com.braze.push.BrazeNotificationStyleFactory;
import com.braze.push.BrazePushReceiver;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10322b;

    public /* synthetic */ a(String str, int i11) {
        this.f10321a = i11;
        this.f10322b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10321a) {
            case 0:
                return BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$13(this.f10322b);
            case 1:
                return BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$14(this.f10322b);
            case 2:
                return BrazeFirebaseMessagingService.Companion.handleOnNewToken$lambda$0(this.f10322b);
            case 3:
                return BrazeFirebaseMessagingService.Companion.handleOnNewToken$lambda$1(this.f10322b);
            case 4:
                return BrazeFirebaseMessagingService.Companion.handleOnNewToken$lambda$2(this.f10322b);
            case 5:
                return BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$4(this.f10322b);
            case 6:
                return BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$9(this.f10322b);
            case 7:
                return BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$10(this.f10322b);
            case 8:
                return BrazeFirebaseMessagingService.Companion.invokeFallbackFirebaseService$lambda$11(this.f10322b);
            case 9:
                return BrazeNotificationActionUtils.addNotificationAction$lambda$8(this.f10322b);
            case 10:
                return BrazeNotificationActionUtils.addNotificationAction$lambda$9(this.f10322b);
            case 11:
                return BrazeNotificationStyleFactory.Companion.getBigPictureNotificationStyle$lambda$18(this.f10322b);
            case 12:
                return BrazeNotificationUtils.logBaiduNotificationClick$lambda$60(this.f10322b);
            case 13:
                return BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$6(this.f10322b);
            case 14:
                return BrazeNotificationUtils.getValidNotificationChannel$lambda$75(this.f10322b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BrazeNotificationUtils.getValidNotificationChannel$lambda$76(this.f10322b);
            case 16:
                return BrazeNotificationUtils.handlePushStoryPageClicked$lambda$70(this.f10322b);
            case 17:
                return BrazeNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush$lambda$29$lambda$28(this.f10322b);
            case 18:
                return BrazeNotificationUtils.getOrCreateNotificationChannelId$lambda$66(this.f10322b);
            case 19:
                return BrazeNotificationUtils.getOrCreateNotificationChannelId$lambda$67(this.f10322b);
            case 20:
                return BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$8(this.f10322b);
            case 21:
                return BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$9(this.f10322b);
            default:
                return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$16$lambda$15(this.f10322b);
        }
    }
}
