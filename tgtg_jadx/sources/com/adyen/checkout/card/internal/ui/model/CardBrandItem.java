package com.adyen.checkout.card.internal.ui.model;

import com.adyen.checkout.core.CardBrand;
import com.adyen.checkout.core.Environment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/CardBrandItem;", "", "name", "", "brand", "Lcom/adyen/checkout/core/CardBrand;", "isSelected", "", "environment", "Lcom/adyen/checkout/core/Environment;", "(Ljava/lang/String;Lcom/adyen/checkout/core/CardBrand;ZLcom/adyen/checkout/core/Environment;)V", "getBrand", "()Lcom/adyen/checkout/core/CardBrand;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "()Z", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CardBrandItem {

    @NotNull
    private final CardBrand brand;

    @NotNull
    private final Environment environment;
    private final boolean isSelected;

    @NotNull
    private final String name;

    public CardBrandItem(@NotNull String str, @NotNull CardBrand cardBrand, boolean z11, @NotNull Environment environment) {
        str.getClass();
        cardBrand.getClass();
        environment.getClass();
        this.name = str;
        this.brand = cardBrand;
        this.isSelected = z11;
        this.environment = environment;
    }

    public static /* synthetic */ CardBrandItem copy$default(CardBrandItem cardBrandItem, String str, CardBrand cardBrand, boolean z11, Environment environment, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cardBrandItem.name;
        }
        if ((i11 & 2) != 0) {
            cardBrand = cardBrandItem.brand;
        }
        if ((i11 & 4) != 0) {
            z11 = cardBrandItem.isSelected;
        }
        if ((i11 & 8) != 0) {
            environment = cardBrandItem.environment;
        }
        return cardBrandItem.copy(str, cardBrand, z11, environment);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CardBrand getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final CardBrandItem copy(@NotNull String name, @NotNull CardBrand brand, boolean isSelected, @NotNull Environment environment) {
        name.getClass();
        brand.getClass();
        environment.getClass();
        return new CardBrandItem(name, brand, isSelected, environment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardBrandItem)) {
            return false;
        }
        CardBrandItem cardBrandItem = (CardBrandItem) other;
        return Intrinsics.areEqual(this.name, cardBrandItem.name) && Intrinsics.areEqual(this.brand, cardBrandItem.brand) && this.isSelected == cardBrandItem.isSelected && Intrinsics.areEqual(this.environment, cardBrandItem.environment);
    }

    @NotNull
    public final CardBrand getBrand() {
        return this.brand;
    }

    @NotNull
    public final Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.environment.hashCode() + k.e((this.brand.hashCode() + (this.name.hashCode() * 31)) * 31, 31, this.isSelected);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        return "CardBrandItem(name=" + this.name + ", brand=" + this.brand + ", isSelected=" + this.isSelected + ", environment=" + this.environment + ")";
    }
}
