package yi;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.m f46003b;

    public /* synthetic */ h(com.google.android.material.bottomsheet.m mVar, int i11) {
        this.f46002a = i11;
        this.f46003b = mVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i11 = this.f46002a;
        int i12 = 3;
        com.google.android.material.bottomsheet.m mVar = this.f46003b;
        switch (i11) {
            case 0:
                r rVar = (r) mVar;
                Dialog dialog = rVar.getDialog();
                View viewFindViewById = dialog != null ? dialog.findViewById(R.id.design_bottom_sheet) : null;
                if (viewFindViewById != null) {
                    BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(viewFindViewById);
                    bottomSheetBehaviorB.H(false);
                    com.google.android.material.bottomsheet.j jVar = new com.google.android.material.bottomsheet.j(rVar, i12);
                    ArrayList arrayList = bottomSheetBehaviorB.t0;
                    if (!arrayList.contains(jVar)) {
                        arrayList.add(jVar);
                    }
                    rVar.f46021m = bottomSheetBehaviorB;
                }
                break;
            default:
                f0 f0Var = (f0) mVar;
                Boolean bool = (Boolean) f0Var.B().f8385a.a("paidHasBeenCalled");
                if (!(bool != null ? bool.booleanValue() : false) && !f0Var.requireArguments().getBoolean("resumePaymentFlow", false)) {
                    try {
                        f0Var.P();
                        if (((Boolean) f0Var.A().f8357s.f45488a.getValue()).booleanValue()) {
                            f0Var.J();
                        } else {
                            PaymentMethods paymentMethods = f0Var.f45988n;
                            if (paymentMethods != null) {
                                f0Var.B().p(paymentMethods);
                            } else {
                                f0Var.B().x(cv.i.DEBUG_CHECKOUT_FAILED, w0.b(new Pair(dv.a.CHECKOUT_ERROR_CAUSE, new dv.c("NO_PAYMENT_METHOD"))));
                                f0Var.dismissAllowingStateLoss();
                                f0.u(f0Var, null, 3);
                                Toast.makeText(f0Var.requireContext(), R.string.generic_err_undefined_error, 0).show();
                            }
                        }
                        f0Var.B().f8385a.d(Boolean.TRUE, "paidHasBeenCalled");
                    } catch (Exception e5) {
                        f0Var.B().x(cv.i.DEBUG_PAYMENT_FAILED, w0.b(new Pair(dv.a.EXCEPTION, new dv.c(String.valueOf(e5.getMessage())))));
                        f0Var.dismissAllowingStateLoss();
                        f0.u(f0Var, null, 3);
                        Toast.makeText(f0Var.requireContext(), R.string.generic_err_undefined_error, 0).show();
                    }
                    break;
                }
                break;
        }
    }
}
