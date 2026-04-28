package com.adyen.checkout.card.internal.data.model;

import com.adyen.checkout.card.internal.data.model.Brand;
import com.adyen.checkout.core.CardBrand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jn\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\fHÖ\u0001J\t\u0010,\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019¨\u0006-"}, d2 = {"Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;", "", "cardBrand", "Lcom/adyen/checkout/core/CardBrand;", "isReliable", "", "enableLuhnCheck", "cvcPolicy", "Lcom/adyen/checkout/card/internal/data/model/Brand$FieldPolicy;", "expiryDatePolicy", "isSupported", "panLength", "", "paymentMethodVariant", "", "localizedBrand", "(Lcom/adyen/checkout/core/CardBrand;ZZLcom/adyen/checkout/card/internal/data/model/Brand$FieldPolicy;Lcom/adyen/checkout/card/internal/data/model/Brand$FieldPolicy;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getCardBrand", "()Lcom/adyen/checkout/core/CardBrand;", "getCvcPolicy", "()Lcom/adyen/checkout/card/internal/data/model/Brand$FieldPolicy;", "getEnableLuhnCheck", "()Z", "getExpiryDatePolicy", "getLocalizedBrand", "()Ljava/lang/String;", "getPanLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPaymentMethodVariant", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/adyen/checkout/core/CardBrand;ZZLcom/adyen/checkout/card/internal/data/model/Brand$FieldPolicy;Lcom/adyen/checkout/card/internal/data/model/Brand$FieldPolicy;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/card/internal/data/model/DetectedCardType;", "equals", "other", "hashCode", "toString", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DetectedCardType {

    @NotNull
    private final CardBrand cardBrand;

    @NotNull
    private final Brand.FieldPolicy cvcPolicy;
    private final boolean enableLuhnCheck;

    @NotNull
    private final Brand.FieldPolicy expiryDatePolicy;
    private final boolean isReliable;
    private final boolean isSupported;

    @Nullable
    private final String localizedBrand;

    @Nullable
    private final Integer panLength;

    @Nullable
    private final String paymentMethodVariant;

    public DetectedCardType(@NotNull CardBrand cardBrand, boolean z11, boolean z12, @NotNull Brand.FieldPolicy fieldPolicy, @NotNull Brand.FieldPolicy fieldPolicy2, boolean z13, @Nullable Integer num, @Nullable String str, @Nullable String str2) {
        cardBrand.getClass();
        fieldPolicy.getClass();
        fieldPolicy2.getClass();
        this.cardBrand = cardBrand;
        this.isReliable = z11;
        this.enableLuhnCheck = z12;
        this.cvcPolicy = fieldPolicy;
        this.expiryDatePolicy = fieldPolicy2;
        this.isSupported = z13;
        this.panLength = num;
        this.paymentMethodVariant = str;
        this.localizedBrand = str2;
    }

    public static /* synthetic */ DetectedCardType copy$default(DetectedCardType detectedCardType, CardBrand cardBrand, boolean z11, boolean z12, Brand.FieldPolicy fieldPolicy, Brand.FieldPolicy fieldPolicy2, boolean z13, Integer num, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cardBrand = detectedCardType.cardBrand;
        }
        if ((i11 & 2) != 0) {
            z11 = detectedCardType.isReliable;
        }
        if ((i11 & 4) != 0) {
            z12 = detectedCardType.enableLuhnCheck;
        }
        if ((i11 & 8) != 0) {
            fieldPolicy = detectedCardType.cvcPolicy;
        }
        if ((i11 & 16) != 0) {
            fieldPolicy2 = detectedCardType.expiryDatePolicy;
        }
        if ((i11 & 32) != 0) {
            z13 = detectedCardType.isSupported;
        }
        if ((i11 & 64) != 0) {
            num = detectedCardType.panLength;
        }
        if ((i11 & 128) != 0) {
            str = detectedCardType.paymentMethodVariant;
        }
        if ((i11 & 256) != 0) {
            str2 = detectedCardType.localizedBrand;
        }
        String str3 = str;
        String str4 = str2;
        boolean z14 = z13;
        Integer num2 = num;
        Brand.FieldPolicy fieldPolicy3 = fieldPolicy2;
        boolean z15 = z12;
        return detectedCardType.copy(cardBrand, z11, z15, fieldPolicy, fieldPolicy3, z14, num2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsReliable() {
        return this.isReliable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnableLuhnCheck() {
        return this.enableLuhnCheck;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Brand.FieldPolicy getCvcPolicy() {
        return this.cvcPolicy;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Brand.FieldPolicy getExpiryDatePolicy() {
        return this.expiryDatePolicy;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsSupported() {
        return this.isSupported;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getPanLength() {
        return this.panLength;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPaymentMethodVariant() {
        return this.paymentMethodVariant;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLocalizedBrand() {
        return this.localizedBrand;
    }

    @NotNull
    public final DetectedCardType copy(@NotNull CardBrand cardBrand, boolean isReliable, boolean enableLuhnCheck, @NotNull Brand.FieldPolicy cvcPolicy, @NotNull Brand.FieldPolicy expiryDatePolicy, boolean isSupported, @Nullable Integer panLength, @Nullable String paymentMethodVariant, @Nullable String localizedBrand) {
        cardBrand.getClass();
        cvcPolicy.getClass();
        expiryDatePolicy.getClass();
        return new DetectedCardType(cardBrand, isReliable, enableLuhnCheck, cvcPolicy, expiryDatePolicy, isSupported, panLength, paymentMethodVariant, localizedBrand);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetectedCardType)) {
            return false;
        }
        DetectedCardType detectedCardType = (DetectedCardType) other;
        return Intrinsics.areEqual(this.cardBrand, detectedCardType.cardBrand) && this.isReliable == detectedCardType.isReliable && this.enableLuhnCheck == detectedCardType.enableLuhnCheck && this.cvcPolicy == detectedCardType.cvcPolicy && this.expiryDatePolicy == detectedCardType.expiryDatePolicy && this.isSupported == detectedCardType.isSupported && Intrinsics.areEqual(this.panLength, detectedCardType.panLength) && Intrinsics.areEqual(this.paymentMethodVariant, detectedCardType.paymentMethodVariant) && Intrinsics.areEqual(this.localizedBrand, detectedCardType.localizedBrand);
    }

    @NotNull
    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    @NotNull
    public final Brand.FieldPolicy getCvcPolicy() {
        return this.cvcPolicy;
    }

    public final boolean getEnableLuhnCheck() {
        return this.enableLuhnCheck;
    }

    @NotNull
    public final Brand.FieldPolicy getExpiryDatePolicy() {
        return this.expiryDatePolicy;
    }

    @Nullable
    public final String getLocalizedBrand() {
        return this.localizedBrand;
    }

    @Nullable
    public final Integer getPanLength() {
        return this.panLength;
    }

    @Nullable
    public final String getPaymentMethodVariant() {
        return this.paymentMethodVariant;
    }

    public int hashCode() {
        int iE = k.e((this.expiryDatePolicy.hashCode() + ((this.cvcPolicy.hashCode() + k.e(k.e(this.cardBrand.hashCode() * 31, 31, this.isReliable), 31, this.enableLuhnCheck)) * 31)) * 31, 31, this.isSupported);
        Integer num = this.panLength;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.paymentMethodVariant;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.localizedBrand;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isReliable() {
        return this.isReliable;
    }

    public final boolean isSupported() {
        return this.isSupported;
    }

    @NotNull
    public String toString() {
        CardBrand cardBrand = this.cardBrand;
        boolean z11 = this.isReliable;
        boolean z12 = this.enableLuhnCheck;
        Brand.FieldPolicy fieldPolicy = this.cvcPolicy;
        Brand.FieldPolicy fieldPolicy2 = this.expiryDatePolicy;
        boolean z13 = this.isSupported;
        Integer num = this.panLength;
        String str = this.paymentMethodVariant;
        String str2 = this.localizedBrand;
        StringBuilder sb2 = new StringBuilder("DetectedCardType(cardBrand=");
        sb2.append(cardBrand);
        sb2.append(", isReliable=");
        sb2.append(z11);
        sb2.append(", enableLuhnCheck=");
        sb2.append(z12);
        sb2.append(", cvcPolicy=");
        sb2.append(fieldPolicy);
        sb2.append(", expiryDatePolicy=");
        sb2.append(fieldPolicy2);
        sb2.append(", isSupported=");
        sb2.append(z13);
        sb2.append(", panLength=");
        sb2.append(num);
        sb2.append(", paymentMethodVariant=");
        sb2.append(str);
        sb2.append(", localizedBrand=");
        return k.p(sb2, str2, ")");
    }
}
