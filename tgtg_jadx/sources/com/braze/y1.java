package com.braze;

import com.braze.BrazeActivityLifecycleCallbackListener;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BrazeActivityLifecycleCallbackListener f10968b;

    public /* synthetic */ y1(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener, int i11) {
        this.f10967a = i11;
        this.f10968b = brazeActivityLifecycleCallbackListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10967a) {
            case 0:
                return BrazeActivityLifecycleCallbackListener.AnonymousClass2.invokeSuspend$lambda$1(this.f10968b);
            case 1:
                return BrazeActivityLifecycleCallbackListener._init_$lambda$1(this.f10968b);
            case 2:
                return BrazeActivityLifecycleCallbackListener.onActivityPaused$lambda$9(this.f10968b);
            default:
                return BrazeActivityLifecycleCallbackListener._init_$lambda$0(this.f10968b);
        }
    }
}
