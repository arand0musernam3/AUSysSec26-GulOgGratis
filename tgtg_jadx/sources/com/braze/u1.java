package com.braze;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f10897b;

    public /* synthetic */ u1(int i11, Set set) {
        this.f10896a = i11;
        this.f10897b = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10896a) {
            case 0:
                return BrazeActivityLifecycleCallbackListener.setInAppMessagingRegistrationBlocklist$lambda$2(this.f10897b);
            default:
                return BrazeActivityLifecycleCallbackListener.setSessionHandlingBlocklist$lambda$3(this.f10897b);
        }
    }
}
