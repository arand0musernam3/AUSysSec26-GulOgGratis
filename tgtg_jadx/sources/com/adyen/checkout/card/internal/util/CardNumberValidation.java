package com.adyen.checkout.card.internal.util;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/card/internal/util/CardNumberValidation;", "", "(Ljava/lang/String;I)V", "VALID", "INVALID_ILLEGAL_CHARACTERS", "INVALID_LUHN_CHECK", "INVALID_TOO_SHORT", "INVALID_TOO_LONG", "INVALID_UNSUPPORTED_BRAND", "INVALID_OTHER_REASON", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardNumberValidation {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CardNumberValidation[] $VALUES;
    public static final CardNumberValidation VALID = new CardNumberValidation("VALID", 0);
    public static final CardNumberValidation INVALID_ILLEGAL_CHARACTERS = new CardNumberValidation("INVALID_ILLEGAL_CHARACTERS", 1);
    public static final CardNumberValidation INVALID_LUHN_CHECK = new CardNumberValidation("INVALID_LUHN_CHECK", 2);
    public static final CardNumberValidation INVALID_TOO_SHORT = new CardNumberValidation("INVALID_TOO_SHORT", 3);
    public static final CardNumberValidation INVALID_TOO_LONG = new CardNumberValidation("INVALID_TOO_LONG", 4);
    public static final CardNumberValidation INVALID_UNSUPPORTED_BRAND = new CardNumberValidation("INVALID_UNSUPPORTED_BRAND", 5);
    public static final CardNumberValidation INVALID_OTHER_REASON = new CardNumberValidation("INVALID_OTHER_REASON", 6);

    private static final /* synthetic */ CardNumberValidation[] $values() {
        return new CardNumberValidation[]{VALID, INVALID_ILLEGAL_CHARACTERS, INVALID_LUHN_CHECK, INVALID_TOO_SHORT, INVALID_TOO_LONG, INVALID_UNSUPPORTED_BRAND, INVALID_OTHER_REASON};
    }

    static {
        CardNumberValidation[] cardNumberValidationArr$values = $values();
        $VALUES = cardNumberValidationArr$values;
        $ENTRIES = n.w(cardNumberValidationArr$values);
    }

    private CardNumberValidation(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CardNumberValidation valueOf(String str) {
        return (CardNumberValidation) Enum.valueOf(CardNumberValidation.class, str);
    }

    public static CardNumberValidation[] values() {
        return (CardNumberValidation[]) $VALUES.clone();
    }
}
