package com.adyen.checkout.ui.core.internal.util;

import android.content.Context;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.internal.util.AmountExtensionsKt;
import com.adyen.checkout.components.core.internal.util.CurrencyUtils;
import com.adyen.checkout.ui.core.R;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\f¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/util/PayButtonFormatter;", "", "()V", "getPayButtonText", "", "amount", "Lcom/adyen/checkout/components/core/Amount;", "locale", "Ljava/util/Locale;", "localizedContext", "Landroid/content/Context;", "emptyAmountStringResId", "", "zeroAmountStringResId", "positiveAmountStringResId", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PayButtonFormatter {

    @NotNull
    public static final PayButtonFormatter INSTANCE = new PayButtonFormatter();

    private PayButtonFormatter() {
    }

    public static /* synthetic */ String getPayButtonText$default(PayButtonFormatter payButtonFormatter, Amount amount, Locale locale, Context context, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i11 = R.string.pay_button;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = R.string.confirm_preauthorization;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = R.string.pay_button_with_value;
        }
        return payButtonFormatter.getPayButtonText(amount, locale, context, i15, i16, i13);
    }

    @NotNull
    public final String getPayButtonText(@Nullable Amount amount, @NotNull Locale locale, @NotNull Context localizedContext, int emptyAmountStringResId, int zeroAmountStringResId, int positiveAmountStringResId) {
        locale.getClass();
        localizedContext.getClass();
        if (amount == null) {
            String string = localizedContext.getString(emptyAmountStringResId);
            string.getClass();
            return string;
        }
        if (AmountExtensionsKt.isZero(amount)) {
            String string2 = localizedContext.getString(zeroAmountStringResId);
            string2.getClass();
            return string2;
        }
        String string3 = localizedContext.getString(positiveAmountStringResId, CurrencyUtils.INSTANCE.formatAmount(amount, locale));
        string3.getClass();
        return string3;
    }
}
