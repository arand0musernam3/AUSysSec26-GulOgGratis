package com.braze;

import com.braze.events.InAppMessageEvent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InAppMessageEvent f10966b;

    public /* synthetic */ y0(InAppMessageEvent inAppMessageEvent, int i11) {
        this.f10965a = i11;
        this.f10966b = inAppMessageEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10965a) {
            case 0:
                return Braze.reenqueueInAppMessage$lambda$191(this.f10966b);
            default:
                return Braze.retryInAppMessage$lambda$189(this.f10966b);
        }
    }
}
