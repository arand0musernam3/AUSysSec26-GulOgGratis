package com.braze;

import android.content.Intent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f9885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Braze f9886c;

    public /* synthetic */ j1(Intent intent, Braze braze, int i11) {
        this.f9884a = i11;
        this.f9885b = intent;
        this.f9886c = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9884a) {
            case 0:
                return Braze.handleInAppMessageTestPush$lambda$180(this.f9885b, this.f9886c);
            default:
                return Braze.logPushNotificationOpened$lambda$62(this.f9885b, this.f9886c);
        }
    }
}
