package com.adyen.checkout.card.internal.util;

import com.adyen.checkout.card.internal.data.model.Brand;
import com.adyen.checkout.card.internal.data.model.DetectedCardType;
import com.adyen.checkout.card.internal.ui.model.InputFieldUIState;
import com.adyen.checkout.core.internal.util.StringUtil;
import com.adyen.checkout.core.ui.validation.CardExpiryDateValidationResult;
import com.adyen.checkout.core.ui.validation.CardExpiryDateValidator;
import com.adyen.checkout.core.ui.validation.CardNumberValidationResult;
import com.adyen.checkout.core.ui.validation.CardNumberValidator;
import com.adyen.checkout.core.ui.validation.CardSecurityCodeValidationResult;
import com.adyen.checkout.core.ui.validation.CardSecurityCodeValidator;
import e40.a;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\tJ%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u001f\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0002\b\u0012J'\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0001¢\u0006\u0002\b\u0012J'\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u001cH\u0001¢\u0006\u0002\b\u001b¨\u0006\u001d"}, d2 = {"Lcom/adyen/checkout/card/internal/util/CardValidationUtils;", "", "()V", "validateCardNumber", "Lcom/adyen/checkout/card/internal/util/CardNumberValidation;", "validationResult", "Lcom/adyen/checkout/core/ui/validation/CardNumberValidationResult;", "isBrandSupported", "", "validateCardNumber$card_release", "number", "", "enableLuhnCheck", "validateExpiryDate", "Lcom/adyen/checkout/card/internal/util/CardExpiryDateValidation;", "expiryDate", "fieldPolicy", "Lcom/adyen/checkout/card/internal/data/model/Brand$FieldPolicy;", "validateExpiryDate$card_release", "Lcom/adyen/checkout/core/ui/validation/CardExpiryDateValidationResult;", "validateSecurityCode", "Lcom/adyen/checkout/card/internal/util/CardSecurityCodeValidation;", "securityCode", "detectedCardType", "Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;", "uiState", "Lcom/adyen/checkout/card/internal/ui/model/InputFieldUIState;", "validateSecurityCode$card_release", "Lcom/adyen/checkout/core/ui/validation/CardSecurityCodeValidationResult;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardValidationUtils {

    @NotNull
    public static final CardValidationUtils INSTANCE = new CardValidationUtils();

    private CardValidationUtils() {
    }

    @NotNull
    public final CardNumberValidation validateCardNumber$card_release(@NotNull CardNumberValidationResult validationResult, boolean isBrandSupported) {
        validationResult.getClass();
        if (validationResult instanceof CardNumberValidationResult.Invalid) {
            return validationResult instanceof CardNumberValidationResult.Invalid.IllegalCharacters ? CardNumberValidation.INVALID_ILLEGAL_CHARACTERS : validationResult instanceof CardNumberValidationResult.Invalid.TooLong ? CardNumberValidation.INVALID_TOO_LONG : validationResult instanceof CardNumberValidationResult.Invalid.TooShort ? CardNumberValidation.INVALID_TOO_SHORT : validationResult instanceof CardNumberValidationResult.Invalid.LuhnCheck ? CardNumberValidation.INVALID_LUHN_CHECK : CardNumberValidation.INVALID_OTHER_REASON;
        }
        if (validationResult instanceof CardNumberValidationResult.Valid) {
            return !isBrandSupported ? CardNumberValidation.INVALID_UNSUPPORTED_BRAND : CardNumberValidation.VALID;
        }
        a.f();
        return null;
    }

    @NotNull
    public final CardExpiryDateValidation validateExpiryDate$card_release(@NotNull String expiryDate, @NotNull CardExpiryDateValidationResult validationResult, @Nullable Brand.FieldPolicy fieldPolicy) {
        expiryDate.getClass();
        validationResult.getClass();
        if (validationResult instanceof CardExpiryDateValidationResult.Valid) {
            return CardExpiryDateValidation.VALID;
        }
        if (validationResult instanceof CardExpiryDateValidationResult.Invalid) {
            return validationResult instanceof CardExpiryDateValidationResult.Invalid.TooFarInTheFuture ? CardExpiryDateValidation.INVALID_TOO_FAR_IN_THE_FUTURE : validationResult instanceof CardExpiryDateValidationResult.Invalid.TooOld ? CardExpiryDateValidation.INVALID_TOO_OLD : validationResult instanceof CardExpiryDateValidationResult.Invalid.NonParseableDate ? (!StringsKt.H(expiryDate) || fieldPolicy == null || fieldPolicy.isRequired()) ? CardExpiryDateValidation.INVALID_OTHER_REASON : CardExpiryDateValidation.VALID_NOT_REQUIRED : CardExpiryDateValidation.INVALID_OTHER_REASON;
        }
        a.f();
        return null;
    }

    @NotNull
    public final CardSecurityCodeValidation validateSecurityCode$card_release(@NotNull String securityCode, @NotNull InputFieldUIState uiState, @NotNull CardSecurityCodeValidationResult validationResult) {
        securityCode.getClass();
        uiState.getClass();
        validationResult.getClass();
        int length = StringUtil.normalize(securityCode, new char[0]).length();
        if (uiState == InputFieldUIState.HIDDEN) {
            return CardSecurityCodeValidation.VALID_HIDDEN;
        }
        if (uiState == InputFieldUIState.OPTIONAL && length == 0) {
            return CardSecurityCodeValidation.VALID_OPTIONAL_EMPTY;
        }
        if (validationResult instanceof CardSecurityCodeValidationResult.Invalid) {
            return CardSecurityCodeValidation.INVALID;
        }
        if (validationResult instanceof CardSecurityCodeValidationResult.Valid) {
            return CardSecurityCodeValidation.VALID;
        }
        a.f();
        return null;
    }

    @NotNull
    public final CardNumberValidation validateCardNumber$card_release(@NotNull String number, boolean enableLuhnCheck, boolean isBrandSupported) {
        number.getClass();
        return validateCardNumber$card_release(CardNumberValidator.INSTANCE.validateCardNumber(number, enableLuhnCheck), isBrandSupported);
    }

    @NotNull
    public final CardSecurityCodeValidation validateSecurityCode$card_release(@NotNull String securityCode, @Nullable DetectedCardType detectedCardType, @NotNull InputFieldUIState uiState) {
        securityCode.getClass();
        uiState.getClass();
        return validateSecurityCode$card_release(securityCode, uiState, CardSecurityCodeValidator.INSTANCE.validateSecurityCode(securityCode, detectedCardType != null ? detectedCardType.getCardBrand() : null));
    }

    @NotNull
    public final CardExpiryDateValidation validateExpiryDate$card_release(@NotNull String expiryDate, @Nullable Brand.FieldPolicy fieldPolicy) {
        expiryDate.getClass();
        return validateExpiryDate$card_release(expiryDate, CardExpiryDateValidator.INSTANCE.validateExpiryDate(expiryDate), fieldPolicy);
    }
}
