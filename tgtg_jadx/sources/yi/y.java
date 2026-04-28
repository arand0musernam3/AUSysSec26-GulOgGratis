package yi;

import android.view.View;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f46037b;

    public /* synthetic */ y(f0 f0Var, int i11) {
        this.f46036a = i11;
        this.f46037b = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f46036a) {
            case 0:
                ((View) obj).getClass();
                f0 f0Var = this.f46037b;
                v vVar = f0Var.f45990p;
                if (vVar != null) {
                    vVar.b();
                }
                f0.u(f0Var, "Payment - onBackArrow", 1);
                break;
            case 1:
                ((View) obj).getClass();
                f0 f0Var2 = this.f46037b;
                v vVar2 = f0Var2.f45990p;
                if (vVar2 != null) {
                    vVar2.b();
                }
                f0.u(f0Var2, "Payment - onClose", 1);
                f0Var2.A().s(cv.i.DEBUG_CHECKOUT_FAILED, h0.g.E(new Pair(dv.a.CHECKOUT_ERROR_CAUSE, new dv.c(aj.d.ORDER_ABORTED + ", PaymentFragment, onClose"))));
                break;
            default:
                ((androidx.activity.y) obj).getClass();
                f0.u(this.f46037b, "Payments - OnBackPressed", 1);
                break;
        }
        return Unit.f26487a;
    }
}
