package com.adyen.checkout.components.core.internal.util;

import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.CheckoutCurrency;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.exception.CheckoutException;
import com.appsflyer.AppsFlyerProperties;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/components/core/internal/util/AmountFormat;", "", "()V", "getFractionDigits", "", AppsFlyerProperties.CURRENCY_CODE, "", "toBigDecimal", "Ljava/math/BigDecimal;", "amount", "Lcom/adyen/checkout/components/core/Amount;", "value", "", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAmountFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmountFormat.kt\ncom/adyen/checkout/components/core/internal/util/AmountFormat\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,66:1\n21#2,12:67\n21#2,12:79\n*S KotlinDebug\n*F\n+ 1 AmountFormat.kt\ncom/adyen/checkout/components/core/internal/util/AmountFormat\n*L\n52#1:67,12\n61#1:79,12\n*E\n"})
public final class AmountFormat {

    @NotNull
    public static final AmountFormat INSTANCE = new AmountFormat();

    private AmountFormat() {
    }

    private final int getFractionDigits(String currencyCode) {
        String strReplace = new Regex("[^A-Z]").replace(currencyCode, "");
        Locale locale = Locale.ROOT;
        locale.getClass();
        String upperCase = strReplace.toUpperCase(locale);
        upperCase.getClass();
        try {
            return CheckoutCurrency.INSTANCE.find(upperCase).getFractionDigits();
        } catch (CheckoutException e5) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = AmountFormat.class.getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), upperCase.concat(" is an unsupported currency. Falling back to information from java.util.Currency."), e5);
            }
            try {
                int defaultFractionDigits = Currency.getInstance(upperCase).getDefaultFractionDigits();
                if (defaultFractionDigits < 0) {
                    return 0;
                }
                return defaultFractionDigits;
            } catch (IllegalArgumentException e11) {
                AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.ERROR;
                AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
                if (!companion2.getLogger().shouldLog(adyenLogLevel2)) {
                    return 0;
                }
                String name2 = AmountFormat.class.getName();
                String strY2 = StringsKt.Y(name2, '$');
                String strW2 = StringsKt.W('.', strY2, strY2);
                if (strW2.length() != 0) {
                    name2 = StringsKt.O(strW2, "Kt");
                }
                companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "Could not determine fraction digits for ".concat(upperCase), e11);
                return 0;
            }
        }
    }

    @NotNull
    public static final BigDecimal toBigDecimal(@NotNull Amount amount) {
        amount.getClass();
        AmountFormat amountFormat = INSTANCE;
        long value = amount.getValue();
        String currency = amount.getCurrency();
        currency.getClass();
        return amountFormat.toBigDecimal(value, currency);
    }

    private final BigDecimal toBigDecimal(long value, String currencyCode) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(value, getFractionDigits(currencyCode));
        bigDecimalValueOf.getClass();
        return bigDecimalValueOf;
    }
}
