package b5;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f5962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h2 f5965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(u0 u0Var, long j9, long j11, h2 h2Var) {
        super(0);
        this.f5962a = u0Var;
        this.f5963b = j9;
        this.f5964c = j11;
        this.f5965d = h2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        u0 u0Var = this.f5962a;
        u0Var.O0().f5952a = false;
        u0Var.O0().f5953b = this.f5963b;
        u0Var.O0().f5954c = this.f5964c;
        Function1 function1D = this.f5965d.f5836a.d();
        if (function1D != null) {
            function1D.invoke(u0Var.O0());
        }
        return Unit.f26487a;
    }
}
