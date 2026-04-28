package com.braze.ui.actions.brazeactions.steps;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StepData f10904c;

    public /* synthetic */ b(int i11, StepData stepData, int i12) {
        this.f10902a = i12;
        this.f10903b = i11;
        this.f10904c = stepData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10902a) {
            case 0:
                return StepData.isArgString$lambda$5(this.f10903b, this.f10904c);
            case 1:
                return StepData.isArgOptionalJsonObject$lambda$6(this.f10903b, this.f10904c);
            default:
                return StepData.isArgCountInBounds$lambda$3(this.f10903b, this.f10904c);
        }
    }
}
