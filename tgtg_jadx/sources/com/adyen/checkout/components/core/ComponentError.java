package com.adyen.checkout.components.core;

import com.adyen.checkout.core.exception.CheckoutException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/components/core/ComponentError;", "", "exception", "Lcom/adyen/checkout/core/exception/CheckoutException;", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "getException", "()Lcom/adyen/checkout/core/exception/CheckoutException;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComponentError {

    @NotNull
    private final CheckoutException exception;

    public ComponentError(@NotNull CheckoutException checkoutException) {
        checkoutException.getClass();
        this.exception = checkoutException;
    }

    @NotNull
    public final String getErrorMessage() {
        String message = this.exception.getMessage();
        return message == null ? "" : message;
    }

    @NotNull
    public final CheckoutException getException() {
        return this.exception;
    }
}
