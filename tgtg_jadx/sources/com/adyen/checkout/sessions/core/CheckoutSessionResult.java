package com.adyen.checkout.sessions.core;

import com.adyen.checkout.core.exception.CheckoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/sessions/core/CheckoutSessionResult;", "", "()V", "Error", "Success", "Lcom/adyen/checkout/sessions/core/CheckoutSessionResult$Error;", "Lcom/adyen/checkout/sessions/core/CheckoutSessionResult$Success;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class CheckoutSessionResult {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/sessions/core/CheckoutSessionResult$Error;", "Lcom/adyen/checkout/sessions/core/CheckoutSessionResult;", "exception", "Lcom/adyen/checkout/core/exception/CheckoutException;", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V", "getException", "()Lcom/adyen/checkout/core/exception/CheckoutException;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error extends CheckoutSessionResult {

        @NotNull
        private final CheckoutException exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull CheckoutException checkoutException) {
            super(null);
            checkoutException.getClass();
            this.exception = checkoutException;
        }

        @NotNull
        public final CheckoutException getException() {
            return this.exception;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/sessions/core/CheckoutSessionResult$Success;", "Lcom/adyen/checkout/sessions/core/CheckoutSessionResult;", "checkoutSession", "Lcom/adyen/checkout/sessions/core/CheckoutSession;", "(Lcom/adyen/checkout/sessions/core/CheckoutSession;)V", "getCheckoutSession", "()Lcom/adyen/checkout/sessions/core/CheckoutSession;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Success extends CheckoutSessionResult {

        @NotNull
        private final CheckoutSession checkoutSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull CheckoutSession checkoutSession) {
            super(null);
            checkoutSession.getClass();
            this.checkoutSession = checkoutSession;
        }

        @NotNull
        public final CheckoutSession getCheckoutSession() {
            return this.checkoutSession;
        }
    }

    public /* synthetic */ CheckoutSessionResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CheckoutSessionResult() {
    }
}
