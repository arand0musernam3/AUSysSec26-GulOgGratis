package com.adyen.checkout.card.internal.ui.model;

import com.adyen.checkout.card.internal.ui.model.InstallmentOptionParams;
import com.adyen.checkout.components.core.Amount;
import e0.f;
import j4.s;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/InstallmentParams;", "", "defaultOptions", "Lcom/adyen/checkout/card/internal/ui/model/InstallmentOptionParams$DefaultInstallmentOptions;", "cardBasedOptions", "", "Lcom/adyen/checkout/card/internal/ui/model/InstallmentOptionParams$CardBasedInstallmentOptions;", "amount", "Lcom/adyen/checkout/components/core/Amount;", "shopperLocale", "Ljava/util/Locale;", "showInstallmentAmount", "", "(Lcom/adyen/checkout/card/internal/ui/model/InstallmentOptionParams$DefaultInstallmentOptions;Ljava/util/List;Lcom/adyen/checkout/components/core/Amount;Ljava/util/Locale;Z)V", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "getCardBasedOptions", "()Ljava/util/List;", "getDefaultOptions", "()Lcom/adyen/checkout/card/internal/ui/model/InstallmentOptionParams$DefaultInstallmentOptions;", "getShopperLocale", "()Ljava/util/Locale;", "getShowInstallmentAmount", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class InstallmentParams {

    @Nullable
    private final Amount amount;

    @NotNull
    private final List<InstallmentOptionParams.CardBasedInstallmentOptions> cardBasedOptions;

    @Nullable
    private final InstallmentOptionParams.DefaultInstallmentOptions defaultOptions;

    @NotNull
    private final Locale shopperLocale;
    private final boolean showInstallmentAmount;

    public InstallmentParams(InstallmentOptionParams.DefaultInstallmentOptions defaultInstallmentOptions, List list, Amount amount, Locale locale, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : defaultInstallmentOptions, (i11 & 2) != 0 ? n0.f26529a : list, (i11 & 4) != 0 ? null : amount, locale, (i11 & 16) != 0 ? false : z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstallmentParams copy$default(InstallmentParams installmentParams, InstallmentOptionParams.DefaultInstallmentOptions defaultInstallmentOptions, List list, Amount amount, Locale locale, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            defaultInstallmentOptions = installmentParams.defaultOptions;
        }
        if ((i11 & 2) != 0) {
            list = installmentParams.cardBasedOptions;
        }
        if ((i11 & 4) != 0) {
            amount = installmentParams.amount;
        }
        if ((i11 & 8) != 0) {
            locale = installmentParams.shopperLocale;
        }
        if ((i11 & 16) != 0) {
            z11 = installmentParams.showInstallmentAmount;
        }
        boolean z12 = z11;
        Amount amount2 = amount;
        return installmentParams.copy(defaultInstallmentOptions, list, amount2, locale, z12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final InstallmentOptionParams.DefaultInstallmentOptions getDefaultOptions() {
        return this.defaultOptions;
    }

    @NotNull
    public final List<InstallmentOptionParams.CardBasedInstallmentOptions> component2() {
        return this.cardBasedOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Locale getShopperLocale() {
        return this.shopperLocale;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowInstallmentAmount() {
        return this.showInstallmentAmount;
    }

    @NotNull
    public final InstallmentParams copy(@Nullable InstallmentOptionParams.DefaultInstallmentOptions defaultOptions, @NotNull List<InstallmentOptionParams.CardBasedInstallmentOptions> cardBasedOptions, @Nullable Amount amount, @NotNull Locale shopperLocale, boolean showInstallmentAmount) {
        cardBasedOptions.getClass();
        shopperLocale.getClass();
        return new InstallmentParams(defaultOptions, cardBasedOptions, amount, shopperLocale, showInstallmentAmount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentParams)) {
            return false;
        }
        InstallmentParams installmentParams = (InstallmentParams) other;
        return Intrinsics.areEqual(this.defaultOptions, installmentParams.defaultOptions) && Intrinsics.areEqual(this.cardBasedOptions, installmentParams.cardBasedOptions) && Intrinsics.areEqual(this.amount, installmentParams.amount) && Intrinsics.areEqual(this.shopperLocale, installmentParams.shopperLocale) && this.showInstallmentAmount == installmentParams.showInstallmentAmount;
    }

    @Nullable
    public final Amount getAmount() {
        return this.amount;
    }

    @NotNull
    public final List<InstallmentOptionParams.CardBasedInstallmentOptions> getCardBasedOptions() {
        return this.cardBasedOptions;
    }

    @Nullable
    public final InstallmentOptionParams.DefaultInstallmentOptions getDefaultOptions() {
        return this.defaultOptions;
    }

    @NotNull
    public final Locale getShopperLocale() {
        return this.shopperLocale;
    }

    public final boolean getShowInstallmentAmount() {
        return this.showInstallmentAmount;
    }

    public int hashCode() {
        InstallmentOptionParams.DefaultInstallmentOptions defaultInstallmentOptions = this.defaultOptions;
        int iC = f.c(this.cardBasedOptions, (defaultInstallmentOptions == null ? 0 : defaultInstallmentOptions.hashCode()) * 31, 31);
        Amount amount = this.amount;
        return Boolean.hashCode(this.showInstallmentAmount) + ((this.shopperLocale.hashCode() + ((iC + (amount != null ? amount.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        InstallmentOptionParams.DefaultInstallmentOptions defaultInstallmentOptions = this.defaultOptions;
        List<InstallmentOptionParams.CardBasedInstallmentOptions> list = this.cardBasedOptions;
        Amount amount = this.amount;
        Locale locale = this.shopperLocale;
        boolean z11 = this.showInstallmentAmount;
        StringBuilder sb2 = new StringBuilder("InstallmentParams(defaultOptions=");
        sb2.append(defaultInstallmentOptions);
        sb2.append(", cardBasedOptions=");
        sb2.append(list);
        sb2.append(", amount=");
        sb2.append(amount);
        sb2.append(", shopperLocale=");
        sb2.append(locale);
        sb2.append(", showInstallmentAmount=");
        return s.o(sb2, z11, ")");
    }

    public InstallmentParams(@Nullable InstallmentOptionParams.DefaultInstallmentOptions defaultInstallmentOptions, @NotNull List<InstallmentOptionParams.CardBasedInstallmentOptions> list, @Nullable Amount amount, @NotNull Locale locale, boolean z11) {
        list.getClass();
        locale.getClass();
        this.defaultOptions = defaultInstallmentOptions;
        this.cardBasedOptions = list;
        this.amount = amount;
        this.shopperLocale = locale;
        this.showInstallmentAmount = z11;
    }
}
