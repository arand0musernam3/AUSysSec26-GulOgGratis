package com.adyen.checkout.googlepay;

import com.adyen.checkout.core.exception.CancellationException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adyen/checkout/googlepay/GooglePayCancellationException;", "Lcom/adyen/checkout/core/exception/CancellationException;", "errorMessage", "", "(Ljava/lang/String;)V", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GooglePayCancellationException extends CancellationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayCancellationException(@NotNull String str) {
        super(str);
        str.getClass();
    }
}
