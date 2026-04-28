package com.adyen.checkout.card;

import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/adyen/checkout/card/BinLookupData;", "", "brand", "", "paymentMethodVariant", "isReliable", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getBrand", "()Ljava/lang/String;", "()Z", "getPaymentMethodVariant", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BinLookupData {

    @NotNull
    private final String brand;
    private final boolean isReliable;

    @Nullable
    private final String paymentMethodVariant;

    public BinLookupData(@NotNull String str, @Nullable String str2, boolean z11) {
        str.getClass();
        this.brand = str;
        this.paymentMethodVariant = str2;
        this.isReliable = z11;
    }

    public static /* synthetic */ BinLookupData copy$default(BinLookupData binLookupData, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = binLookupData.brand;
        }
        if ((i11 & 2) != 0) {
            str2 = binLookupData.paymentMethodVariant;
        }
        if ((i11 & 4) != 0) {
            z11 = binLookupData.isReliable;
        }
        return binLookupData.copy(str, str2, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentMethodVariant() {
        return this.paymentMethodVariant;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsReliable() {
        return this.isReliable;
    }

    @NotNull
    public final BinLookupData copy(@NotNull String brand, @Nullable String paymentMethodVariant, boolean isReliable) {
        brand.getClass();
        return new BinLookupData(brand, paymentMethodVariant, isReliable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BinLookupData)) {
            return false;
        }
        BinLookupData binLookupData = (BinLookupData) other;
        return Intrinsics.areEqual(this.brand, binLookupData.brand) && Intrinsics.areEqual(this.paymentMethodVariant, binLookupData.paymentMethodVariant) && this.isReliable == binLookupData.isReliable;
    }

    @NotNull
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    public final String getPaymentMethodVariant() {
        return this.paymentMethodVariant;
    }

    public int hashCode() {
        int iHashCode = this.brand.hashCode() * 31;
        String str = this.paymentMethodVariant;
        return Boolean.hashCode(this.isReliable) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final boolean isReliable() {
        return this.isReliable;
    }

    @NotNull
    public String toString() {
        String str = this.brand;
        String str2 = this.paymentMethodVariant;
        return s.o(f.t("BinLookupData(brand=", str, ", paymentMethodVariant=", str2, ", isReliable="), this.isReliable, ")");
    }
}
