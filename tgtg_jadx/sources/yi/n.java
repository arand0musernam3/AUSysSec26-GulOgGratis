package yi;

import android.view.View;
import bg.k0;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.order.AbortState;
import com.app.tgtg.model.remote.payment.response.PaymentMethodsState;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f46011b;

    public /* synthetic */ n(r rVar, int i11) {
        this.f46010a = i11;
        this.f46011b = rVar;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        int i11 = this.f46010a;
        r rVar = this.f46011b;
        switch (i11) {
            case 0:
                PaymentMethodsState paymentMethodsState = (PaymentMethodsState) obj;
                if (paymentMethodsState != null) {
                    int i12 = m.$EnumSwitchMapping$0[paymentMethodsState.ordinal()];
                    if (i12 != 1) {
                        if (i12 == 2 || i12 == 3) {
                            rVar.dismissAllowingStateLoss();
                            k0 k0Var = new k0(rVar.requireActivity());
                            k0Var.e(R.string.generic_err_undefined_error);
                            k0Var.a(R.string.checkout_payment_method_no_available_methods);
                            k0Var.c(android.R.string.ok);
                            k0Var.f6179j = false;
                            k0Var.f6180k = true;
                            View viewRequireView = rVar.requireView();
                            viewRequireView.getClass();
                            k0Var.f6184p = viewRequireView;
                            k0Var.f();
                        } else if (i12 != 4) {
                            e40.a.f();
                        } else {
                            rVar.dismissAllowingStateLoss();
                            k0 k0Var2 = new k0(rVar.requireActivity());
                            k0Var2.e(R.string.generic_err_undefined_error);
                            k0Var2.a(R.string.checkout_payment_method_user_country_not_supported);
                            k0Var2.c(android.R.string.ok);
                            k0Var2.f6179j = false;
                            k0Var2.f6180k = true;
                            View viewRequireView2 = rVar.requireView();
                            viewRequireView2.getClass();
                            k0Var2.f6184p = viewRequireView2;
                            k0Var2.f();
                        }
                    }
                    break;
                }
                break;
            default:
                AbortState abortState = (AbortState) obj;
                if (!rVar.f46019j) {
                    rVar.v().j();
                } else {
                    int i13 = o.$EnumSwitchMapping$0[abortState.ordinal()];
                    if (i13 == 1) {
                        rVar.z(new Integer(R.string.order_has_been_canceled_popup_description), R.string.order_has_been_canceled_popup_title);
                        rVar.v().j();
                    } else if (i13 == 2) {
                        rVar.z(null, R.string.cancel_order_error_already_cancelled);
                        rVar.v().j();
                    } else if (i13 == 3) {
                        rVar.z(null, R.string.cancel_order_error_deadline_exceeded);
                    }
                    rVar.f46019j = false;
                }
                break;
        }
        return Unit.f26487a;
    }
}
