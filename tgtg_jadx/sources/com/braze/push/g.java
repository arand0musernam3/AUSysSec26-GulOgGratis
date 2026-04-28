package com.braze.push;

import android.content.Intent;
import com.braze.push.BrazePushReceiver;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f10333b;

    public /* synthetic */ g(int i11, Intent intent) {
        this.f10332a = i11;
        this.f10333b = intent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10332a) {
            case 0:
                return BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$7(this.f10333b);
            case 1:
                return BrazeNotificationUtils.sendPushActionIntent$lambda$79(this.f10333b);
            case 2:
                return BrazePushReceiver.Companion.handleAdmRegistrationEventIfEnabled$lambda$4(this.f10333b);
            case 3:
                return BrazePushReceiver.Companion.handlePush$performWork$lambda$0(this.f10333b);
            case 4:
                return BrazePushReceiver.Companion.handlePush$performWork$lambda$1(this.f10333b);
            default:
                return NotificationTrampolineActivity.onResume$lambda$3(this.f10333b);
        }
    }
}
