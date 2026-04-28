package com.braze.push;

import android.os.Bundle;
import com.braze.push.BrazePushReceiver;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f10326b;

    public /* synthetic */ c(Bundle bundle, int i11) {
        this.f10325a = i11;
        this.f10326b = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10325a) {
            case 0:
                return BrazeHuaweiPushHandler.handleHmsRemoteMessageData$lambda$3(this.f10326b);
            case 1:
                return BrazeNotificationActionUtils.addNotificationAction$lambda$10(this.f10326b);
            default:
                return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$13(this.f10326b);
        }
    }
}
