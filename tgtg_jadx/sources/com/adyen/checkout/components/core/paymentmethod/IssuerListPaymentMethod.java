package com.adyen.checkout.components.core.paymentmethod;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/IssuerListPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "()V", IssuerListPaymentMethod.ISSUER, "", "getIssuer", "()Ljava/lang/String;", "setIssuer", "(Ljava/lang/String;)V", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class IssuerListPaymentMethod extends PaymentMethodDetails {

    @NotNull
    public static final String ISSUER = "issuer";

    @Nullable
    public abstract String getIssuer();

    public abstract void setIssuer(@Nullable String str);
}
