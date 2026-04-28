package com.braze;

import com.braze.push.BrazeNotificationUtils;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f9844c;

    public /* synthetic */ g1(String str, boolean z11, int i11) {
        this.f9842a = i11;
        this.f9843b = str;
        this.f9844c = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9842a) {
            case 0:
                return Braze.setGoogleAdvertisingId$lambda$154(this.f9843b, this.f9844c);
            case 1:
                return Braze.setGoogleAdvertisingId$lambda$156$lambda$155(this.f9843b, this.f9844c);
            default:
                return BrazeNotificationUtils.routeUserWithNotificationOpenedIntent$lambda$8(this.f9843b, this.f9844c);
        }
    }
}
