package com.braze.ui.inappmessage;

import com.braze.managers.g0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f10929b;

    public /* synthetic */ c(Integer num, int i11) {
        this.f10928a = i11;
        this.f10929b = num;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10928a) {
            case 0:
                return BrazeInAppMessageManager.resetAfterInAppMessageClose$lambda$36(this.f10929b);
            default:
                return g0.b(this.f10929b);
        }
    }
}
