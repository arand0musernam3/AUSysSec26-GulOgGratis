package com.braze.ui.actions.brazeactions.steps;

import com.braze.ui.actions.brazeactions.BrazeActionParser;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StepData f10901b;

    public /* synthetic */ a(int i11, StepData stepData) {
        this.f10900a = i11;
        this.f10901b = stepData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10900a) {
            case 0:
                return SetEmailSubscriptionStep.run$lambda$1(this.f10901b);
            case 1:
                return SetPushNotificationSubscriptionStep.run$lambda$1(this.f10901b);
            case 2:
                return StepData.args_delegate$lambda$0(this.f10901b);
            case 3:
                return StepData.firstArg_delegate$lambda$1(this.f10901b);
            case 4:
                return StepData.secondArg_delegate$lambda$2(this.f10901b);
            default:
                return BrazeActionParser.parse$lambda$6(this.f10901b);
        }
    }
}
