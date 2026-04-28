package com.adyen.checkout.cse;

import com.adyen.checkout.core.exception.CheckoutException;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/cse/EncryptionException;", "Lcom/adyen/checkout/core/exception/CheckoutException;", InAppMessageBase.MESSAGE, "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EncryptionException extends CheckoutException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptionException(@NotNull String str, @Nullable Throwable th2) {
        super(str, th2);
        str.getClass();
    }
}
