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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/CardListItem;", "", "cardBrand", "Lcom/adyen/checkout/core/CardBrand;", "isDetected", "", "environment", "Lcom/adyen/checkout/core/Environment;", "(Lcom/adyen/checkout/core/CardBrand;ZLcom/adyen/checkout/core/Environment;)V", "getCardBrand", "()Lcom/adyen/checkout/core/CardBrand;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CardListItem {

    @NotNull
    private final CardBrand cardBrand;

    @NotNull
    private final Environment environment;
    private final boolean isDetected;

    public CardListItem(@NotNull CardBrand cardBrand, boolean z11, @NotNull Environment environment) {
        cardBrand.getClass();
        environment.getClass();
        this.cardBrand = cardBrand;
        this.isDetected = z11;
        this.environment = environment;
    }

    public static /* synthetic */ CardListItem copy$default(CardListItem cardListItem, CardBrand cardBrand, boolean z11, Environment environment, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cardBrand = cardListItem.cardBrand;
        }
        if ((i11 & 2) != 0) {
            z11 = cardListItem.isDetected;
        }
        if ((i11 & 4) != 0) {
            environment = cardListItem.environment;
        }
        return cardListItem.copy(cardBrand, z11, environment);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsDetected() {
        return this.isDetected;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final CardListItem copy(@NotNull CardBrand cardBrand, boolean isDetected, @NotNull Environment environment) {
        cardBrand.getClass();
        environment.getClass();
        return new CardListItem(cardBrand, isDetected, environment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardListItem)) {
            return false;
        }
        CardListItem cardListItem = (CardListItem) other;
        return Intrinsics.areEqual(this.cardBrand, cardListItem.cardBrand) && this.isDetected == cardListItem.isDetected && Intrinsics.areEqual(this.environment, cardListItem.environment);
    }

    @NotNull
    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    @NotNull
    public final Environment getEnvironment() {
        return this.environment;
    }

    public int hashCode() {
        return this.environment.hashCode() + k.e(this.cardBrand.hashCode() * 31, 31, this.isDetected);
    }

    public final boolean isDetected() {
        return this.isDetected;
    }

    @NotNull
    public String toString() {
        return "CardListItem(cardBrand=" + this.cardBrand + ", isDetected=" + this.isDetected + ", environment=" + this.environment + ")";
    }
}
