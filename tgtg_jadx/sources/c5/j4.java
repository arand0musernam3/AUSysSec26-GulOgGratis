package c5;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j4 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k4 f7264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f7265b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(k4 k4Var, Function2 function2) {
        super(1);
        this.f7264a = k4Var;
        this.f7265b = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        n nVar = (n) obj;
        k4 k4Var = this.f7264a;
        if (!k4Var.f7278c) {
            Lifecycle lifecycle = nVar.f7294a.getLifecycle();
            Function2 function2 = this.f7265b;
            k4Var.f7280e = function2;
            if (k4Var.f7279d == null) {
                k4Var.f7279d = lifecycle;
                lifecycle.a(k4Var);
            } else if (lifecycle.b().a(Lifecycle.State.CREATED)) {
                k4Var.f7277b.C(new u3.d(new i4(k4Var, function2, 1), true, 1330788943));
            }
        }
        return Unit.f26487a;
    }
}
