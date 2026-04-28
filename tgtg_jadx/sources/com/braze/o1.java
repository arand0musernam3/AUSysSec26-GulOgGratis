package com.braze;

import android.content.Intent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f10306b;

    public /* synthetic */ o1(int i11, Intent intent) {
        this.f10305a = i11;
        this.f10306b = intent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10305a) {
            case 0:
                return Braze.logPushNotificationOpened$lambda$58(this.f10306b);
            case 1:
                return BrazeBootReceiver.onReceive$lambda$0(this.f10306b);
            case 2:
                return BrazeBootReceiver.handleIncomingIntent$lambda$1(this.f10306b);
            case 3:
                return BrazeBootReceiver.handleIncomingIntent$lambda$3(this.f10306b);
            default:
                return BrazeFlushPushDeliveryReceiver.onReceive$lambda$0(this.f10306b);
        }
    }
}
