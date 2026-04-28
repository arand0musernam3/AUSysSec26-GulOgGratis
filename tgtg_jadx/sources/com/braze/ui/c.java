package com.braze.ui;

import com.braze.BrazeUser;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.ui.actions.brazeactions.steps.SetEmailSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationSubscriptionType f10910b;

    public /* synthetic */ c(NotificationSubscriptionType notificationSubscriptionType, int i11) {
        this.f10909a = i11;
        this.f10910b = notificationSubscriptionType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10909a) {
            case 0:
                return UserJavascriptInterfaceBase.setEmailNotificationSubscriptionType$lambda$13(this.f10910b, (BrazeUser) obj);
            case 1:
                return UserJavascriptInterfaceBase.setPushNotificationSubscriptionType$lambda$15(this.f10910b, (BrazeUser) obj);
            case 2:
                return SetEmailSubscriptionStep.run$lambda$2(this.f10910b, (BrazeUser) obj);
            default:
                return SetPushNotificationSubscriptionStep.run$lambda$2(this.f10910b, (BrazeUser) obj);
        }
    }
}
