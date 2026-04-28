package com.braze;

import com.braze.events.InAppMessageEvent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f10972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InAppMessageEvent f10973c;

    public /* synthetic */ z0(Braze braze, InAppMessageEvent inAppMessageEvent, int i11) {
        this.f10971a = i11;
        this.f10972b = braze;
        this.f10973c = inAppMessageEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10971a) {
            case 0:
                return Braze.reenqueueInAppMessage$lambda$192(this.f10972b, this.f10973c);
            default:
                return Braze.retryInAppMessage$lambda$190(this.f10972b, this.f10973c);
        }
    }
}
