package com.adyen.checkout.components.core;

import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0012\u0010\u000b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/components/core/PaymentComponentState;", "PaymentMethodDetailsT", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "", Bayeux.KEY_DATA, "Lcom/adyen/checkout/components/core/PaymentComponentData;", "getData", "()Lcom/adyen/checkout/components/core/PaymentComponentData;", "isInputValid", "", "()Z", "isReady", "isValid", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PaymentComponentState<PaymentMethodDetailsT extends PaymentMethodDetails> {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <PaymentMethodDetailsT extends PaymentMethodDetails> boolean isValid(@NotNull PaymentComponentState<PaymentMethodDetailsT> paymentComponentState) {
            return paymentComponentState.isInputValid() && paymentComponentState.isReady();
        }
    }

    @NotNull
    PaymentComponentData<PaymentMethodDetailsT> getData();

    boolean isInputValid();

    boolean isReady();

    boolean isValid();
}
