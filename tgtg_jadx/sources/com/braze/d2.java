package com.braze;

import com.braze.enums.NotificationSubscriptionType;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationSubscriptionType f9671b;

    public /* synthetic */ d2(NotificationSubscriptionType notificationSubscriptionType, int i11) {
        this.f9670a = i11;
        this.f9671b = notificationSubscriptionType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9670a) {
            case 0:
                return BrazeUser.setEmailNotificationSubscriptionType$lambda$25(this.f9671b);
            default:
                return BrazeUser.setPushNotificationSubscriptionType$lambda$26(this.f9671b);
        }
    }
}
