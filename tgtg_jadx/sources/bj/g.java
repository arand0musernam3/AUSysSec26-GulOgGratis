package bj;

import com.adyen.checkout.cashapppay.CashAppPayComponentState;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.ComponentCallback;
import com.adyen.checkout.components.core.ComponentError;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import com.adyen.checkout.core.PermissionHandlerCallback;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.app.tgtg.model.remote.order.AuthPayloadType;
import com.app.tgtg.model.remote.order.AuthorizationPayload;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yi.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements ComponentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f6309a;

    public g(h hVar) {
        this.f6309a = hVar;
    }

    @Override // com.adyen.checkout.components.core.ComponentCallback
    public final void onAdditionalDetails(ActionComponentData actionComponentData) {
        actionComponentData.getClass();
    }

    @Override // com.adyen.checkout.components.core.ComponentCallback
    public final void onError(ComponentError componentError) {
        componentError.getClass();
        ((f0) this.f6309a.f6311b).G("CASH_APP_PAY", componentError.getErrorMessage());
    }

    @Override // com.adyen.checkout.components.core.ComponentCallback
    public final /* bridge */ void onPermissionRequest(String str, PermissionHandlerCallback permissionHandlerCallback) {
        ComponentCallback.DefaultImpls.onPermissionRequest(this, str, permissionHandlerCallback);
    }

    @Override // com.adyen.checkout.components.core.ComponentCallback
    public final /* bridge */ void onStateChanged(PaymentComponentState paymentComponentState) {
        ComponentCallback.DefaultImpls.onStateChanged(this, (CashAppPayComponentState) paymentComponentState);
    }

    @Override // com.adyen.checkout.components.core.ComponentCallback
    public final void onSubmit(PaymentComponentState paymentComponentState) {
        CashAppPayComponentState cashAppPayComponentState = (CashAppPayComponentState) paymentComponentState;
        cashAppPayComponentState.getClass();
        ModelObject.Serializer<PaymentMethodDetails> serializer = PaymentMethodDetails.SERIALIZER;
        PaymentMethodDetails paymentMethod = cashAppPayComponentState.getData().getPaymentMethod();
        paymentMethod.getClass();
        String string = serializer.serialize(paymentMethod).toString();
        string.getClass();
        AuthPayloadType authPayloadType = AuthPayloadType.ADYEN_AUTH_PAYLOAD;
        Boolean storePaymentMethod = cashAppPayComponentState.getData().getStorePaymentMethod();
        AuthorizationPayload authorizationPayload = new AuthorizationPayload((String) null, (String) null, storePaymentMethod != null ? storePaymentMethod.booleanValue() : false, "CASH_APP_PAY", authPayloadType, string, (String) null, (String) null, (String) null, 451, (DefaultConstructorMarker) null);
        if (cashAppPayComponentState.isValid()) {
            f0 f0Var = this.f6309a.f6310a.f46035b;
            f0Var.P();
            f0Var.I(authorizationPayload);
        }
    }
}
