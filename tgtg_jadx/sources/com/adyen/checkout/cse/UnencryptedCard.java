package com.adyen.checkout.cse;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u000fB9\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/cse/UnencryptedCard;", "", "number", "", "expiryMonth", "expiryYear", "cvc", "cardHolderName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardHolderName", "()Ljava/lang/String;", "getCvc", "getExpiryMonth", "getExpiryYear", "getNumber", "Builder", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UnencryptedCard {

    @Nullable
    private final String cardHolderName;

    @Nullable
    private final String cvc;

    @Nullable
    private final String expiryMonth;

    @Nullable
    private final String expiryYear;

    @Nullable
    private final String number;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/adyen/checkout/cse/UnencryptedCard$Builder;", "", "()V", "cardHolderName", "", "cvc", "expiryMonth", "expiryYear", "number", "build", "Lcom/adyen/checkout/cse/UnencryptedCard;", "removeWhiteSpaces", "string", "setCvc", "setExpiryDate", "setHolderName", "holderName", "setNumber", "trimAndRemoveMultipleWhiteSpaces", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nUnencryptedCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnencryptedCard.kt\ncom/adyen/checkout/cse/UnencryptedCard$Builder\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,103:1\n108#2:104\n80#2,22:105\n*S KotlinDebug\n*F\n+ 1 UnencryptedCard.kt\ncom/adyen/checkout/cse/UnencryptedCard$Builder\n*L\n99#1:104\n99#1:105,22\n*E\n"})
    public static final class Builder {

        @Nullable
        private String cardHolderName;

        @Nullable
        private String cvc;

        @Nullable
        private String expiryMonth;

        @Nullable
        private String expiryYear;

        @Nullable
        private String number;

        private final String removeWhiteSpaces(String string) {
            if (string != null) {
                return new Regex("\\s").replace(string, "");
            }
            return null;
        }

        private final String trimAndRemoveMultipleWhiteSpaces(String string) {
            if (string == null) {
                return null;
            }
            int length = string.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                boolean z12 = Intrinsics.compare((int) string.charAt(!z11 ? i11 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    }
                    length--;
                } else if (z12) {
                    i11++;
                } else {
                    z11 = true;
                }
            }
            String string2 = string.subSequence(i11, length + 1).toString();
            if (string2 != null) {
                return new Regex("\\s{2,}").replace(string2, " ");
            }
            return null;
        }

        @NotNull
        public final UnencryptedCard build() throws IllegalStateException, NullPointerException {
            return new UnencryptedCard(this.number, this.expiryMonth, this.expiryYear, this.cvc, this.cardHolderName);
        }

        @NotNull
        public final Builder setCvc(@NotNull String cvc) {
            cvc.getClass();
            this.cvc = removeWhiteSpaces(cvc);
            return this;
        }

        @NotNull
        public final Builder setExpiryDate(@NotNull String expiryMonth, @NotNull String expiryYear) {
            expiryMonth.getClass();
            expiryYear.getClass();
            this.expiryMonth = removeWhiteSpaces(expiryMonth);
            this.expiryYear = removeWhiteSpaces(expiryYear);
            return this;
        }

        @NotNull
        public final Builder setHolderName(@NotNull String holderName) {
            holderName.getClass();
            this.cardHolderName = trimAndRemoveMultipleWhiteSpaces(holderName);
            return this;
        }

        @NotNull
        public final Builder setNumber(@NotNull String number) {
            number.getClass();
            this.number = removeWhiteSpaces(number);
            return this;
        }
    }

    public UnencryptedCard(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.number = str;
        this.expiryMonth = str2;
        this.expiryYear = str3;
        this.cvc = str4;
        this.cardHolderName = str5;
    }

    @Nullable
    public final String getCardHolderName() {
        return this.cardHolderName;
    }

    @Nullable
    public final String getCvc() {
        return this.cvc;
    }

    @Nullable
    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    @Nullable
    public final String getExpiryYear() {
        return this.expiryYear;
    }

    @Nullable
    public final String getNumber() {
        return this.number;
    }
}
