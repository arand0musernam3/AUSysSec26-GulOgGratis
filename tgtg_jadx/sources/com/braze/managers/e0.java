package com.braze.managers;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e0 extends FunctionReferenceImpl implements Function0 {
    public e0(g0 g0Var) {
        super(0, g0Var, g0.class, "onConnectionSuccess", "onConnectionSuccess()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((g0) this.receiver).g();
        return Unit.f26487a;
    }
}
