package com.adyen.checkout.card.internal.util;

import com.adyen.checkout.card.R;
import com.adyen.checkout.components.core.internal.ui.model.FieldState;
import com.adyen.checkout.components.core.internal.ui.model.Validation;
import com.adyen.checkout.components.core.internal.util.DateUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/adyen/checkout/card/internal/util/KcpValidationUtils;", "", "()V", "KCP_BIRTH_DATE_FORMAT", "", "KCP_BIRTH_DATE_LENGTH", "", "KCP_CARD_PASSWORD_REQUIRED_LENGTH", "KCP_TAX_NUMBER_LENGTH", "validateKcpBirthDateOrTaxNumber", "Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "birthDateOrTaxNumber", "validateKcpCardPassword", "cardPassword", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class KcpValidationUtils {

    @NotNull
    public static final KcpValidationUtils INSTANCE = new KcpValidationUtils();

    @NotNull
    private static final String KCP_BIRTH_DATE_FORMAT = "yyMMdd";
    public static final int KCP_BIRTH_DATE_LENGTH = 6;
    private static final int KCP_CARD_PASSWORD_REQUIRED_LENGTH = 2;
    private static final int KCP_TAX_NUMBER_LENGTH = 10;

    private KcpValidationUtils() {
    }

    @NotNull
    public final FieldState<String> validateKcpBirthDateOrTaxNumber(@NotNull String birthDateOrTaxNumber) {
        birthDateOrTaxNumber.getClass();
        int length = birthDateOrTaxNumber.length();
        Validation invalid = ((length == 6 && DateUtils.INSTANCE.matchesFormat(birthDateOrTaxNumber, KCP_BIRTH_DATE_FORMAT)) || length == 10) ? Validation.Valid.INSTANCE : new Validation.Invalid(R.string.checkout_kcp_birth_date_or_tax_number_invalid, false, 2, null);
        return new FieldState<>(birthDateOrTaxNumber, invalid);
    }

    @NotNull
    public final FieldState<String> validateKcpCardPassword(@NotNull String cardPassword) {
        cardPassword.getClass();
        return new FieldState<>(cardPassword, cardPassword.length() == 2 ? Validation.Valid.INSTANCE : new Validation.Invalid(R.string.checkout_kcp_password_invalid, false, 2, null));
    }
}
