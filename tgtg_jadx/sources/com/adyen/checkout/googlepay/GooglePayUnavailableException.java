package com.adyen.checkout.googlepay;

import com.adyen.checkout.components.core.PaymentMethodUnavailableException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adyen/checkout/googlepay/GooglePayUnavailableException;", "Lcom/adyen/checkout/components/core/PaymentMethodUnavailableException;", "cause", "", "(Ljava/lang/Throwable;)V", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GooglePayUnavailableException extends PaymentMethodUnavailableException {
    public /* synthetic */ GooglePayUnavailableException(Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GooglePayUnavailableException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public GooglePayUnavailableException(@Nullable Throwable th2) {
        super("Google Pay is not available", th2);
    }
}
