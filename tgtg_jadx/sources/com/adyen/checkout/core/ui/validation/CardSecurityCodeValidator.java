package com.adyen.checkout.core.ui.validation;

import com.adyen.checkout.core.CardBrand;
import com.adyen.checkout.core.CardType;
import com.adyen.checkout.core.internal.util.StringUtil;
import com.adyen.checkout.core.ui.validation.CardSecurityCodeValidationResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/core/ui/validation/CardSecurityCodeValidator;", "", "()V", "AMEX_SECURITY_CODE_SIZE", "", "GENERAL_CARD_SECURITY_CODE_SIZE", "validateSecurityCode", "Lcom/adyen/checkout/core/ui/validation/CardSecurityCodeValidationResult;", "securityCode", "", "cardBrand", "Lcom/adyen/checkout/core/CardBrand;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardSecurityCodeValidator {
    private static final int AMEX_SECURITY_CODE_SIZE = 4;
    private static final int GENERAL_CARD_SECURITY_CODE_SIZE = 3;

    @NotNull
    public static final CardSecurityCodeValidator INSTANCE = new CardSecurityCodeValidator();

    private CardSecurityCodeValidator() {
    }

    public static /* synthetic */ CardSecurityCodeValidationResult validateSecurityCode$default(CardSecurityCodeValidator cardSecurityCodeValidator, String str, CardBrand cardBrand, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            cardBrand = null;
        }
        return cardSecurityCodeValidator.validateSecurityCode(str, cardBrand);
    }

    @NotNull
    public final CardSecurityCodeValidationResult validateSecurityCode(@NotNull String securityCode, @Nullable CardBrand cardBrand) {
        securityCode.getClass();
        String strNormalize = StringUtil.normalize(securityCode, new char[0]);
        int length = strNormalize.length();
        if (!StringUtil.INSTANCE.isDigitsAndSeparatorsOnly(strNormalize, new char[0])) {
            return new CardSecurityCodeValidationResult.Invalid();
        }
        CardType cardType = CardType.AMERICAN_EXPRESS;
        return (Intrinsics.areEqual(cardBrand, new CardBrand(cardType)) && length == 4) ? new CardSecurityCodeValidationResult.Valid() : (Intrinsics.areEqual(cardBrand, new CardBrand(cardType)) || length != 3) ? new CardSecurityCodeValidationResult.Invalid() : new CardSecurityCodeValidationResult.Valid();
    }
}
