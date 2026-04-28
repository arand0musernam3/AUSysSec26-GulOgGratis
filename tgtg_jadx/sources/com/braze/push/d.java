package com.braze.push;

import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.BrazeNotificationFactory;
import com.braze.push.BrazePushReceiver;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BrazeNotificationPayload f10328b;

    public /* synthetic */ d(BrazeNotificationPayload brazeNotificationPayload, int i11) {
        this.f10327a = i11;
        this.f10328b = brazeNotificationPayload;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10327a) {
            case 0:
                return BrazeNotificationFactory.Companion.populateNotificationBuilder$lambda$0(this.f10328b);
            case 1:
                return BrazeNotificationUtils.setPublicVersionIfPresentAndSupported$lambda$57(this.f10328b);
            default:
                return BrazePushReceiver.Companion.handlePushNotificationPayload$lambda$21(this.f10328b);
        }
    }
}
