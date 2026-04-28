package bj;

import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.ComponentCallback;
import com.adyen.checkout.components.core.ComponentError;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import com.adyen.checkout.core.PermissionHandlerCallback;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.googlepay.GooglePayCancellationException;
import com.adyen.checkout.googlepay.GooglePayComponentState;
import com.adyen.checkout.googlepay.GooglePayUnavailableException;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.order.AuthPayloadType;
import com.app.tgtg.model.remote.order.AuthorizationPayload;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yi.f0;
import yi.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements ComponentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f6313a;

    public i(j jVar) {
        this.f6313a = jVar;
    }

    @Override // com.adyen.checkout.components.core.ComponentCallback
    public final void onAdditionalDetails(ActionComponentData actionComponentData) {
        actionComponentData.getClass();
    }

    @Override // com.adyen.checkout.components.core.ComponentCallback
    public final void onError(ComponentError componentError) {
        j jVar = this.f6313a;
        u6.f fVar = jVar.f6316c;
        componentError.getClass();
        CheckoutException exception = componentError.getException();
        if (exception instanceof GooglePayUnavailableException) {
            if (fVar != null) {
                ((f0) fVar.f40820a).D(AppConstants.RESULT_CARD_NOT_SUPPORTED);
            }
        } else if (exception instanceof GooglePayCancellationException) {
            if (fVar != null) {
                f0.u((f0) fVar.f40820a, "Payments - Goggle Pay cancelled", 1);
            }
        } else {
            zi.f fVar2 = jVar.f6315b;
            if (fVar2 != null) {
                ((f0) fVar2).G("GOOGLEPAY", componentError.getErrorMessage());
            }
        }
    }

    @Override // com.adyen.checkout.components.core.ComponentCallback
    public final /* bridge */ void onPermissionRequest(String str, PermissionHandlerCallback permissionHandlerCallback) {
        ComponentCallback.DefaultImpls.onPermissionRequest(this, str, permissionHandlerCallback);
    }

    @Override // com.adyen.checkout.components.core.ComponentCallback
    public final /* bridge */ void onStateChanged(PaymentComponentState paymentComponentState) {
        ComponentCallback.DefaultImpls.onStateChanged(this, (GooglePayComponentState) paymentComponentState);
    }

    @Override // com.adyen.checkout.components.core.ComponentCallback
    public final void onSubmit(PaymentComponentState paymentComponentState) {
        x xVar;
        GooglePayComponentState googlePayComponentState = (GooglePayComponentState) paymentComponentState;
        googlePayComponentState.getClass();
        ModelObject.Serializer<PaymentMethodDetails> serializer = PaymentMethodDetails.SERIALIZER;
        PaymentMethodDetails paymentMethod = googlePayComponentState.getData().getPaymentMethod();
        paymentMethod.getClass();
        String string = serializer.serialize(paymentMethod).toString();
        string.getClass();
        AuthPayloadType authPayloadType = AuthPayloadType.ADYEN_AUTH_PAYLOAD;
        Boolean storePaymentMethod = googlePayComponentState.getData().getStorePaymentMethod();
        AuthorizationPayload authorizationPayload = new AuthorizationPayload((String) null, (String) null, storePaymentMethod != null ? storePaymentMethod.booleanValue() : false, "GOOGLEPAY", authPayloadType, string, (String) null, (String) null, (String) null, 451, (DefaultConstructorMarker) null);
        if (!googlePayComponentState.isValid() || (xVar = this.f6313a.f6314a) == null) {
            return;
        }
        int i11 = xVar.f46034a;
        f0 f0Var = xVar.f46035b;
        switch (i11) {
            case 0:
                f0Var.P();
                f0Var.I(authorizationPayload);
                break;
            case 1:
                f0Var.P();
                f0Var.I(authorizationPayload);
                break;
            case 2:
                f0Var.P();
                f0Var.I(authorizationPayload);
                break;
            case 3:
                f0Var.P();
                f0Var.I(authorizationPayload);
                break;
            case 4:
                f0Var.P();
                f0Var.I(authorizationPayload);
                break;
            case 5:
                f0Var.P();
                f0Var.I(authorizationPayload);
                break;
            default:
                f0Var.P();
                f0Var.I(authorizationPayload);
                break;
        }
    }
}
