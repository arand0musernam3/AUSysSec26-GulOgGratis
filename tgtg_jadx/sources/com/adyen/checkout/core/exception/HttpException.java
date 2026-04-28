package com.adyen.checkout.core.exception;

import com.adyen.checkout.core.internal.data.model.ErrorResponseBody;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/core/exception/HttpException;", "Lcom/adyen/checkout/core/exception/CheckoutException;", "code", "", InAppMessageBase.MESSAGE, "", "errorBody", "Lcom/adyen/checkout/core/internal/data/model/ErrorResponseBody;", "(ILjava/lang/String;Lcom/adyen/checkout/core/internal/data/model/ErrorResponseBody;)V", "getCode", "()I", "getErrorBody", "()Lcom/adyen/checkout/core/internal/data/model/ErrorResponseBody;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HttpException extends CheckoutException {
    private final int code;

    @Nullable
    private final ErrorResponseBody errorBody;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpException(int i11, @NotNull String str, @Nullable ErrorResponseBody errorResponseBody) {
        super(str, null, 2, null);
        str.getClass();
        this.code = i11;
        this.errorBody = errorResponseBody;
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final ErrorResponseBody getErrorBody() {
        return this.errorBody;
    }
}
