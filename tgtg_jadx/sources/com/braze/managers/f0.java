package com.braze.managers;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f0 extends FunctionReferenceImpl implements Function1 {
    public f0(g0 g0Var) {
        super(1, g0Var, g0.class, "onConnectionFailed", "onConnectionFailed(Ljava/lang/Integer;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((g0) this.receiver).a((Integer) obj);
        return Unit.f26487a;
    }
}
