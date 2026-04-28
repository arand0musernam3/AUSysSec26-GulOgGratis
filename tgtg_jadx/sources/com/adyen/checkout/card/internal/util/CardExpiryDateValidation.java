package com.adyen.checkout.card.internal.util;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/checkout/card/internal/util/CardExpiryDateValidation;", "", "(Ljava/lang/String;I)V", "VALID", "VALID_NOT_REQUIRED", "INVALID_TOO_FAR_IN_THE_FUTURE", "INVALID_TOO_OLD", "INVALID_OTHER_REASON", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardExpiryDateValidation {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CardExpiryDateValidation[] $VALUES;
    public static final CardExpiryDateValidation VALID = new CardExpiryDateValidation("VALID", 0);
    public static final CardExpiryDateValidation VALID_NOT_REQUIRED = new CardExpiryDateValidation("VALID_NOT_REQUIRED", 1);
    public static final CardExpiryDateValidation INVALID_TOO_FAR_IN_THE_FUTURE = new CardExpiryDateValidation("INVALID_TOO_FAR_IN_THE_FUTURE", 2);
    public static final CardExpiryDateValidation INVALID_TOO_OLD = new CardExpiryDateValidation("INVALID_TOO_OLD", 3);
    public static final CardExpiryDateValidation INVALID_OTHER_REASON = new CardExpiryDateValidation("INVALID_OTHER_REASON", 4);

    private static final /* synthetic */ CardExpiryDateValidation[] $values() {
        return new CardExpiryDateValidation[]{VALID, VALID_NOT_REQUIRED, INVALID_TOO_FAR_IN_THE_FUTURE, INVALID_TOO_OLD, INVALID_OTHER_REASON};
    }

    static {
        CardExpiryDateValidation[] cardExpiryDateValidationArr$values = $values();
        $VALUES = cardExpiryDateValidationArr$values;
        $ENTRIES = n.w(cardExpiryDateValidationArr$values);
    }

    private CardExpiryDateValidation(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CardExpiryDateValidation valueOf(String str) {
        return (CardExpiryDateValidation) Enum.valueOf(CardExpiryDateValidation.class, str);
    }

    public static CardExpiryDateValidation[] values() {
        return (CardExpiryDateValidation[]) $VALUES.clone();
    }
}
