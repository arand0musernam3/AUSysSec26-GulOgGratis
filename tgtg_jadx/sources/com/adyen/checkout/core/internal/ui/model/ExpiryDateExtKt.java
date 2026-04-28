package com.adyen.checkout.core.internal.ui.model;

import com.adyen.checkout.core.ui.model.ExpiryDate;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import kotlin.text.b0;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"EMPTY_DATE", "Lcom/adyen/checkout/core/ui/model/ExpiryDate;", "INVALID_DATE", "toMMyyString", "", "expiryMonth", "expiryYear", "checkout-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ExpiryDateExtKt {

    @NotNull
    public static final ExpiryDate EMPTY_DATE = new ExpiryDate(0, 0);

    @NotNull
    public static final ExpiryDate INVALID_DATE = new ExpiryDate(-1, -1);

    @NotNull
    public static final String toMMyyString(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        return k.m(StringsKt.M(2, str), ExpiryDateInput.SEPARATOR, StringsKt.M(2, b0.y(2, str2)));
    }
}
