package com.braze;

import com.braze.Braze;
import com.braze.configuration.BrazeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BrazeConfig f9900b;

    public /* synthetic */ l1(BrazeConfig brazeConfig, int i11) {
        this.f9899a = i11;
        this.f9900b = brazeConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9899a) {
            case 0:
                return Braze.applyPendingRuntimeConfiguration$lambda$188$lambda$187(this.f9900b);
            default:
                return Braze.Companion.configure$lambda$15(this.f9900b);
        }
    }
}
