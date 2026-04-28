package com.adyen.checkout.core.exception;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/checkout/core/exception/PermissionException;", "Lcom/adyen/checkout/core/exception/CheckoutException;", "errorMessage", "", "requiredPermission", "(Ljava/lang/String;Ljava/lang/String;)V", "getRequiredPermission", "()Ljava/lang/String;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class PermissionException extends CheckoutException {

    @NotNull
    private final String requiredPermission;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionException(@NotNull String str, @NotNull String str2) {
        super(str, null, 2, null);
        str.getClass();
        str2.getClass();
        this.requiredPermission = str2;
    }

    @NotNull
    public final String getRequiredPermission() {
        return this.requiredPermission;
    }
}
