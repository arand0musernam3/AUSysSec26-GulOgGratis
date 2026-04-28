package com.adyen.checkout.components.core.internal.util;

import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.CheckoutCurrency;
import com.adyen.checkout.core.exception.CheckoutException;
import com.appsflyer.AppsFlyerProperties;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/components/core/internal/util/CurrencyUtils;", "", "()V", "assertCurrency", "", AppsFlyerProperties.CURRENCY_CODE, "", "formatAmount", "amount", "Lcom/adyen/checkout/components/core/Amount;", "locale", "Ljava/util/Locale;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CurrencyUtils {

    @NotNull
    public static final CurrencyUtils INSTANCE = new CurrencyUtils();

    private CurrencyUtils() {
    }

    public final void assertCurrency(@Nullable String currencyCode) {
        if (!CheckoutCurrency.INSTANCE.isSupported(currencyCode)) {
            throw new CheckoutException(a0.p("Currency ", currencyCode, " not supported"), null, 2, null);
        }
    }

    @NotNull
    public final String formatAmount(@NotNull Amount amount, @NotNull Locale locale) {
        amount.getClass();
        locale.getClass();
        String currency = amount.getCurrency();
        CheckoutCurrency checkoutCurrencyFind = CheckoutCurrency.INSTANCE.find(currency == null ? "" : currency);
        Currency currency2 = Currency.getInstance(currency);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(currency2);
        currencyInstance.setMinimumFractionDigits(checkoutCurrencyFind.getFractionDigits());
        currencyInstance.setMaximumFractionDigits(checkoutCurrencyFind.getFractionDigits());
        String str = currencyInstance.format(BigDecimal.valueOf(amount.getValue(), checkoutCurrencyFind.getFractionDigits()));
        str.getClass();
        return str;
    }
}
