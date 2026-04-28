package com.braze.push;

import android.app.NotificationChannel;
import androidx.core.app.NotificationManagerCompat;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeFirebaseMessagingService;
import com.braze.push.BrazeNotificationStyleFactory;
import com.braze.push.BrazeNotificationUtils;
import com.braze.push.BrazePushReceiver;
import com.google.firebase.messaging.y;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10335b;

    public /* synthetic */ h(Object obj, int i11) {
        this.f10334a = i11;
        this.f10335b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10334a) {
            case 0:
                return BrazeNotificationUtils.sendPushActionIntent$lambda$78((BrazeNotificationUtils.BrazeNotificationBroadcastType) this.f10335b);
            case 1:
                return BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$3((y) this.f10335b);
            case 2:
                return BrazeNotificationActionUtils.addNotificationActions$lambda$2((BrazeNotificationPayload.ActionButton) this.f10335b);
            case 3:
                return BrazeNotificationStyleFactory.Companion.getConversationalPushStyle$lambda$22((BrazeNotificationPayload.ConversationMessage) this.f10335b);
            case 4:
                return BrazeNotificationUtils.wakeScreenIfAppropriate$lambda$25((NotificationChannel) this.f10335b);
            default:
                return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$23((NotificationManagerCompat) this.f10335b);
        }
    }
}
