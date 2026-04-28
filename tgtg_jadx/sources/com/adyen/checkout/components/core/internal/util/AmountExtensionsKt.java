package com.adyen.checkout.components.core.internal.util;

import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.CheckoutCurrency;
import com.adyen.checkout.core.exception.CheckoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001a\f\u0010\t\u001a\u00020\n*\u00020\u0006H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"EMPTY_CURRENCY", "", "EMPTY_VALUE", "", "isEmpty", "", "Lcom/adyen/checkout/components/core/Amount;", "(Lcom/adyen/checkout/components/core/Amount;)Z", "isZero", "validate", "", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AmountExtensionsKt {

    @NotNull
    public static final String EMPTY_CURRENCY = "NONE";
    public static final long EMPTY_VALUE = -1;

    public static final boolean isEmpty(@NotNull Amount amount) {
        amount.getClass();
        return Intrinsics.areEqual(amount.getCurrency(), "NONE") || amount.getValue() == -1;
    }

    public static final boolean isZero(@NotNull Amount amount) {
        amount.getClass();
        return CheckoutCurrency.INSTANCE.isSupported(amount.getCurrency()) && amount.getValue() == 0;
    }

    public static final void validate(@NotNull Amount amount) {
        amount.getClass();
        if (!CheckoutCurrency.INSTANCE.isSupported(amount.getCurrency())) {
            throw new CheckoutException("Currency code is not valid.", null, 2, null);
        }
        if (amount.getValue() < 0) {
            throw new CheckoutException("Value cannot be less than 0.", null, 2, null);
        }
    }
}
