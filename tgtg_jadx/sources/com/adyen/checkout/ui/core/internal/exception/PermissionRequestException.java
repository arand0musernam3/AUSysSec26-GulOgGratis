package com.adyen.checkout.ui.core.internal.exception;

import com.adyen.checkout.core.exception.CheckoutException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/exception/PermissionRequestException;", "Lcom/adyen/checkout/core/exception/CheckoutException;", "errorMessage", "", "(Ljava/lang/String;)V", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PermissionRequestException extends CheckoutException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionRequestException(@NotNull String str) {
        super(str, null, 2, null);
        str.getClass();
    }
}
