package com.braze;

import android.app.Activity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f10957b;

    public /* synthetic */ v1(Activity activity, int i11) {
        this.f10956a = i11;
        this.f10957b = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10956a) {
            case 0:
                return BrazeActivityLifecycleCallbackListener.onActivityStopped$lambda$5(this.f10957b);
            case 1:
                return BrazeActivityLifecycleCallbackListener.onActivityPaused$lambda$8(this.f10957b);
            case 2:
                return BrazeActivityLifecycleCallbackListener.onActivityStarted$lambda$4(this.f10957b);
            case 3:
                return BrazeActivityLifecycleCallbackListener.onActivityCreated$lambda$10(this.f10957b);
            default:
                return BrazeActivityLifecycleCallbackListener.onActivityResumed$lambda$7(this.f10957b);
        }
    }
}
