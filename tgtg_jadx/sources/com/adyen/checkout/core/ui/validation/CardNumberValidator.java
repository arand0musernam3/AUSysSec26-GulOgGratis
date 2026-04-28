package com.adyen.checkout.core.ui.validation;

import com.adyen.checkout.core.internal.util.StringUtil;
import com.adyen.checkout.core.ui.validation.CardNumberValidationResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/core/ui/validation/CardNumberValidator;", "", "()V", "FIVE_DIGIT", "", "MAXIMUM_CARD_NUMBER_LENGTH", "MINIMUM_CARD_NUMBER_LENGTH", "RADIX", "isLuhnChecksumValid", "", "normalizedNumber", "", "validateCardNumber", "Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult;", "number", "enableLuhnCheck", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardNumberValidator {
    private static final int FIVE_DIGIT = 5;

    @NotNull
    public static final CardNumberValidator INSTANCE = new CardNumberValidator();
    public static final int MAXIMUM_CARD_NUMBER_LENGTH = 19;
    private static final int MINIMUM_CARD_NUMBER_LENGTH = 12;
    private static final int RADIX = 10;

    private CardNumberValidator() {
    }

    private final boolean isLuhnChecksumValid(String normalizedNumber) {
        String string = new StringBuffer(normalizedNumber).reverse().toString();
        string.getClass();
        int length = string.length();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int iDigit = Character.digit(string.charAt(i13), 10);
            if (i13 % 2 == 0) {
                i11 += iDigit;
            } else {
                i12 += iDigit * 2;
                if (iDigit >= 5) {
                    i12 -= 9;
                }
            }
        }
        return (i11 + i12) % 10 == 0;
    }

    @NotNull
    public final CardNumberValidationResult validateCardNumber(@NotNull String number, boolean enableLuhnCheck) {
        number.getClass();
        String strNormalize = StringUtil.normalize(number, new char[0]);
        int length = strNormalize.length();
        return !StringUtil.INSTANCE.isDigitsAndSeparatorsOnly(strNormalize, new char[0]) ? new CardNumberValidationResult.Invalid.IllegalCharacters() : length > 19 ? new CardNumberValidationResult.Invalid.TooLong() : length < 12 ? new CardNumberValidationResult.Invalid.TooShort() : (!enableLuhnCheck || isLuhnChecksumValid(strNormalize)) ? new CardNumberValidationResult.Valid() : new CardNumberValidationResult.Invalid.LuhnCheck();
    }
}
