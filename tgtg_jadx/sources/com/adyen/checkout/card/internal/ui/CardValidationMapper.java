package com.adyen.checkout.card.internal.ui;

import com.adyen.checkout.card.R;
import com.adyen.checkout.card.internal.util.CardExpiryDateValidation;
import com.adyen.checkout.card.internal.util.CardNumberValidation;
import com.adyen.checkout.card.internal.util.CardSecurityCodeValidation;
import com.adyen.checkout.components.core.internal.ui.model.FieldState;
import com.adyen.checkout.components.core.internal.ui.model.Validation;
import com.adyen.checkout.core.internal.util.StringUtil;
import e40.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/CardValidationMapper;", "", "()V", "mapCardNumberValidation", "Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "", "cardNumber", "validation", "Lcom/adyen/checkout/card/internal/util/CardNumberValidation;", "mapExpiryDateValidation", "expiryDate", "validationResult", "Lcom/adyen/checkout/card/internal/util/CardExpiryDateValidation;", "mapSecurityCodeValidation", "securityCode", "Lcom/adyen/checkout/card/internal/util/CardSecurityCodeValidation;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardValidationMapper {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[CardNumberValidation.values().length];
            try {
                iArr[CardNumberValidation.INVALID_ILLEGAL_CHARACTERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardNumberValidation.INVALID_TOO_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardNumberValidation.INVALID_TOO_LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardNumberValidation.INVALID_UNSUPPORTED_BRAND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardNumberValidation.INVALID_LUHN_CHECK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CardNumberValidation.INVALID_OTHER_REASON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CardNumberValidation.VALID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CardExpiryDateValidation.values().length];
            try {
                iArr2[CardExpiryDateValidation.VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CardExpiryDateValidation.VALID_NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CardExpiryDateValidation.INVALID_TOO_FAR_IN_THE_FUTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CardExpiryDateValidation.INVALID_TOO_OLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CardExpiryDateValidation.INVALID_OTHER_REASON.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CardSecurityCodeValidation.values().length];
            try {
                iArr3[CardSecurityCodeValidation.VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[CardSecurityCodeValidation.VALID_HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[CardSecurityCodeValidation.VALID_OPTIONAL_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[CardSecurityCodeValidation.INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @NotNull
    public final FieldState<String> mapCardNumberValidation(@NotNull String cardNumber, @NotNull CardNumberValidation validation) {
        Validation invalid;
        cardNumber.getClass();
        validation.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[validation.ordinal()]) {
            case 1:
                invalid = new Validation.Invalid(R.string.checkout_card_number_not_valid, false, 2, null);
                break;
            case 2:
                invalid = new Validation.Invalid(R.string.checkout_card_number_not_valid, false, 2, null);
                break;
            case 3:
                invalid = new Validation.Invalid(R.string.checkout_card_number_not_valid, false, 2, null);
                break;
            case 4:
                invalid = new Validation.Invalid(R.string.checkout_card_brand_not_supported, true);
                break;
            case 5:
                invalid = new Validation.Invalid(R.string.checkout_card_number_not_valid, false, 2, null);
                break;
            case 6:
                invalid = new Validation.Invalid(R.string.checkout_card_number_not_valid, false, 2, null);
                break;
            case 7:
                invalid = Validation.Valid.INSTANCE;
                break;
            default:
                a.f();
                return null;
        }
        return new FieldState<>(cardNumber, invalid);
    }

    @NotNull
    public final FieldState<String> mapExpiryDateValidation(@NotNull String expiryDate, @NotNull CardExpiryDateValidation validationResult) {
        Validation invalid;
        expiryDate.getClass();
        validationResult.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$1[validationResult.ordinal()];
        if (i11 == 1 || i11 == 2) {
            invalid = Validation.Valid.INSTANCE;
        } else if (i11 == 3) {
            invalid = new Validation.Invalid(R.string.checkout_expiry_date_not_valid_too_far_in_future, false, 2, null);
        } else if (i11 == 4) {
            invalid = new Validation.Invalid(R.string.checkout_expiry_date_not_valid_too_old, false, 2, null);
        } else {
            if (i11 != 5) {
                a.f();
                return null;
            }
            invalid = new Validation.Invalid(R.string.checkout_expiry_date_not_valid, false, 2, null);
        }
        return new FieldState<>(expiryDate, invalid);
    }

    @NotNull
    public final FieldState<String> mapSecurityCodeValidation(@NotNull String securityCode, @NotNull CardSecurityCodeValidation validationResult) {
        Validation invalid;
        securityCode.getClass();
        validationResult.getClass();
        String strNormalize = StringUtil.normalize(securityCode, new char[0]);
        int i11 = WhenMappings.$EnumSwitchMapping$2[validationResult.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            invalid = Validation.Valid.INSTANCE;
        } else {
            if (i11 != 4) {
                a.f();
                return null;
            }
            invalid = new Validation.Invalid(R.string.checkout_security_code_not_valid, false, 2, null);
        }
        return new FieldState<>(strNormalize, invalid);
    }
}
