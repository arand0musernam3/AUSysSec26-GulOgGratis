package com.braze;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f10350b;

    public /* synthetic */ q1(Class cls, int i11) {
        this.f10349a = i11;
        this.f10350b = cls;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10349a) {
            case 0:
                return Braze.removeSingleSubscription$lambda$129(this.f10350b);
            default:
                return Braze.addSingleSynchronousSubscription$lambda$125(this.f10350b);
        }
    }
}
