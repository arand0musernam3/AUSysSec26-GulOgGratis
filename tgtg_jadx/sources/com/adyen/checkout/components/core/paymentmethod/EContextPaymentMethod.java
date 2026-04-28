package com.adyen.checkout.components.core.paymentmethod;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b&\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/EContextPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "()V", EContextPaymentMethod.FIRST_NAME, "", "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", EContextPaymentMethod.LAST_NAME, "getLastName", "setLastName", EContextPaymentMethod.SHOPPER_EMAIL, "getShopperEmail", "setShopperEmail", EContextPaymentMethod.TELEPHONE_NUMBER, "getTelephoneNumber", "setTelephoneNumber", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class EContextPaymentMethod extends PaymentMethodDetails {

    @NotNull
    public static final String FIRST_NAME = "firstName";

    @NotNull
    public static final String LAST_NAME = "lastName";

    @NotNull
    public static final String SHOPPER_EMAIL = "shopperEmail";

    @NotNull
    public static final String TELEPHONE_NUMBER = "telephoneNumber";

    @Nullable
    public abstract String getFirstName();

    @Nullable
    public abstract String getLastName();

    @Nullable
    public abstract String getShopperEmail();

    @Nullable
    public abstract String getTelephoneNumber();

    public abstract void setFirstName(@Nullable String str);

    public abstract void setLastName(@Nullable String str);

    public abstract void setShopperEmail(@Nullable String str);

    public abstract void setTelephoneNumber(@Nullable String str);
}
