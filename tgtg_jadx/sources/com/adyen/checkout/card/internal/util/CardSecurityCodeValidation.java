package com.adyen.checkout.card.internal.util;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/card/internal/util/CardSecurityCodeValidation;", "", "(Ljava/lang/String;I)V", "VALID", "VALID_HIDDEN", "VALID_OPTIONAL_EMPTY", "INVALID", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardSecurityCodeValidation {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CardSecurityCodeValidation[] $VALUES;
    public static final CardSecurityCodeValidation VALID = new CardSecurityCodeValidation("VALID", 0);
    public static final CardSecurityCodeValidation VALID_HIDDEN = new CardSecurityCodeValidation("VALID_HIDDEN", 1);
    public static final CardSecurityCodeValidation VALID_OPTIONAL_EMPTY = new CardSecurityCodeValidation("VALID_OPTIONAL_EMPTY", 2);
    public static final CardSecurityCodeValidation INVALID = new CardSecurityCodeValidation("INVALID", 3);

    private static final /* synthetic */ CardSecurityCodeValidation[] $values() {
        return new CardSecurityCodeValidation[]{VALID, VALID_HIDDEN, VALID_OPTIONAL_EMPTY, INVALID};
    }

    static {
        CardSecurityCodeValidation[] cardSecurityCodeValidationArr$values = $values();
        $VALUES = cardSecurityCodeValidationArr$values;
        $ENTRIES = n.w(cardSecurityCodeValidationArr$values);
    }

    private CardSecurityCodeValidation(String str, int i11) {
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CardSecurityCodeValidation valueOf(String str) {
        return (CardSecurityCodeValidation) Enum.valueOf(CardSecurityCodeValidation.class, str);
    }

    public static CardSecurityCodeValidation[] values() {
        return (CardSecurityCodeValidation[]) $VALUES.clone();
    }
}
