package yi;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.lifecycle.m1;
import bg.w0;
import cj.h0;
import cj.r0;
import cj.s0;
import com.adyen.checkout.components.core.ActionComponentCallback;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.ComponentError;
import com.adyen.checkout.core.PermissionHandlerCallback;
import com.app.tgtg.R;
import com.app.tgtg.model.local.payment.ResumePaymentData;
import com.app.tgtg.model.remote.order.AuthPayloadType;
import com.app.tgtg.model.remote.order.AuthorizationPayload;
import com.app.tgtg.model.remote.order.response.PaymentProvider;
import kotlin.Pair;
import kotlin.collections.x0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements ActionComponentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f45965a;

    public c0(f0 f0Var) {
        this.f45965a = f0Var;
    }

    @Override // com.adyen.checkout.components.core.ActionComponentCallback
    public final void onAdditionalDetails(ActionComponentData actionComponentData) {
        String strM196getPaymentIdTaD0F3M;
        actionComponentData.getClass();
        f0 f0Var = this.f45965a;
        x70.c cVar = null;
        if (f0Var.B().g() == null) {
            ResumePaymentData resumePaymentData = (ResumePaymentData) v80.f0.E(kotlin.coroutines.g.f26549a, new h0(f0Var.B(), cVar, 1));
            if (resumePaymentData == null || (strM196getPaymentIdTaD0F3M = resumePaymentData.m196getPaymentIdTaD0F3M()) == null) {
                w0 w0Var = f0Var.l;
                if (w0Var != null) {
                    w0Var.a();
                }
                f0Var.B().x(cv.i.DEBUG_CHECKOUT_FAILED, kotlin.collections.w0.b(new Pair(dv.a.CHECKOUT_ERROR_CAUSE, new dv.c("ADDITIONAL_AUTH_PAYMENT_ID_NULL"))));
                Toast.makeText(f0Var.requireContext(), R.string.generic_err_undefined_error, 0).show();
                return;
            }
            f0Var.B().v(strM196getPaymentIdTaD0F3M);
        }
        f0Var.B().x(cv.i.DEBUG_ADYEN_REDIRECT_SENDING_ADDITIONAL_DETAILS, kotlin.collections.w0.b(new Pair(dv.a.TYPE, new dv.c("ActionCallback"))));
        b2 b2Var = f0Var.B().f8393i;
        if (b2Var != null) {
            b2Var.a(null);
        }
        s0 s0VarB = f0Var.B();
        String strG = f0Var.B().g();
        strG.getClass();
        PaymentProvider paymentProvider = PaymentProvider.ADYEN;
        AuthorizationPayload authorizationPayload = new AuthorizationPayload((String) null, (String) null, f0Var.B().f8398o, (String) null, AuthPayloadType.ADYEN_ADDITIONAL_AUTH_PAYLOAD, (String) null, String.valueOf(actionComponentData.getDetails()), (String) null, (String) null, 427, (DefaultConstructorMarker) null);
        paymentProvider.getClass();
        if (s0VarB.f8407x) {
            s0VarB.f8392h = v80.f0.B(m1.d(s0VarB), null, null, new r0(s0VarB, strG, paymentProvider, authorizationPayload, null, 1), 3);
        }
    }

    @Override // com.adyen.checkout.components.core.ActionComponentCallback
    public final void onError(ComponentError componentError) {
        componentError.getClass();
        f0 f0Var = this.f45965a;
        if (!f0Var.f45987m || !StringsKt.z(componentError.getErrorMessage(), "Launching redirect failed", true)) {
            if (StringsKt.z(componentError.getErrorMessage(), "Error while polling status", true)) {
                f0Var.B().x(cv.i.DEBUG_ADYEN_COMPONENT_POLLING_ERROR, null);
                return;
            }
            f0Var.t("Payment - componentError", true);
            f0Var.D(null);
            sa0.a.f38953a.d(componentError.getException());
            f0Var.B().x(cv.i.CORE_PURCHASE_ERROR, x0.d(new Pair(dv.a.TYPE, new dv.c(f0Var.f45985j)), new Pair(dv.a.MESSAGE, new dv.c(componentError.getErrorMessage()))));
            return;
        }
        f0.v(f0Var, true, 2);
        new Handler(Looper.getMainLooper()).postDelayed(new a0(f0Var, 0), 100L);
        s0 s0VarB = f0Var.B();
        b2 b2Var = s0VarB.f8392h;
        if (b2Var != null) {
            b2Var.a(null);
        }
        b2 b2Var2 = s0VarB.f8393i;
        if (b2Var2 != null) {
            b2Var2.a(null);
        }
        f0Var.B().x(cv.i.DEBUG_ADYEN_REDIRECT_FAIL, null);
    }

    @Override // com.adyen.checkout.components.core.ActionComponentCallback
    public final /* bridge */ void onPermissionRequest(String str, PermissionHandlerCallback permissionHandlerCallback) {
        ActionComponentCallback.DefaultImpls.onPermissionRequest(this, str, permissionHandlerCallback);
    }
}
