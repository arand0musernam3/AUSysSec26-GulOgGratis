package com.adyen.checkout.core.exception;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adyen/checkout/core/exception/CancellationException;", "Lcom/adyen/checkout/core/exception/ComponentException;", "errorMessage", "", "(Ljava/lang/String;)V", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class CancellationException extends ComponentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CancellationException(@NotNull String str) {
        super(str, null, 2, 0 == true ? 1 : 0);
        str.getClass();
    }
}
