package com.braze.push;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f10331b;

    public /* synthetic */ f(Integer num, int i11) {
        this.f10330a = i11;
        this.f10331b = num;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10330a) {
            case 0:
                return BrazeNotificationUtils.getNotificationId$lambda$16(this.f10331b);
            case 1:
                return BrazeNotificationUtils.getNotificationPriority$lambda$21$lambda$20(this.f10331b);
            default:
                return BrazeNotificationUtils.setVisibilityIfPresentAndSupported$lambda$56(this.f10331b);
        }
    }
}
