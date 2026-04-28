package rk;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f38091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f38092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f38093c;

    public n(boolean z11, Function0 function0, b1 b1Var) {
        this.f38091a = z11;
        this.f38092b = function0;
        this.f38093c = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (!this.f38091a) {
            this.f38093c.setValue(Boolean.TRUE);
        }
        this.f38092b.invoke();
        return Unit.f26487a;
    }
}
