package com.braze.push;

import com.braze.push.BrazePushReceiver;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10337a;

    public /* synthetic */ j(int i11) {
        this.f10337a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10337a) {
            case 0:
                return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$22();
            case 1:
                return BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$10();
            case 2:
                return BrazePushReceiver.Companion.handlePush$performWork$lambda$2();
            case 3:
                return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$24();
            case 4:
                return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$26();
            case 5:
                return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$14();
            case 6:
                return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$17();
            case 7:
                return NotificationTrampolineActivity.onResume$lambda$1();
            case 8:
                return NotificationTrampolineActivity.onResume$lambda$2();
            case 9:
                return NotificationTrampolineActivity.onResume$lambda$5();
            case 10:
                return NotificationTrampolineActivity.onResume$lambda$6();
            case 11:
                return NotificationTrampolineActivity.onCreate$lambda$0();
            default:
                return NotificationTrampolineActivity.onPause$lambda$7();
        }
    }
}
