package com.adyen.checkout.card.internal.ui.view;

import com.adyen.checkout.card.internal.ui.model.InstallmentOption;
import com.adyen.checkout.components.core.Amount;
import j4.s;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JD\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/view/InstallmentModel;", "", "numberOfInstallments", "", "option", "Lcom/adyen/checkout/card/internal/ui/model/InstallmentOption;", "amount", "Lcom/adyen/checkout/components/core/Amount;", "shopperLocale", "Ljava/util/Locale;", "showAmount", "", "(Ljava/lang/Integer;Lcom/adyen/checkout/card/internal/ui/model/InstallmentOption;Lcom/adyen/checkout/components/core/Amount;Ljava/util/Locale;Z)V", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "getNumberOfInstallments", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOption", "()Lcom/adyen/checkout/card/internal/ui/model/InstallmentOption;", "getShopperLocale", "()Ljava/util/Locale;", "getShowAmount", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Lcom/adyen/checkout/card/internal/ui/model/InstallmentOption;Lcom/adyen/checkout/components/core/Amount;Ljava/util/Locale;Z)Lcom/adyen/checkout/card/internal/ui/view/InstallmentModel;", "equals", "other", "hashCode", "toString", "", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class InstallmentModel {

    @Nullable
    private final Amount amount;

    @Nullable
    private final Integer numberOfInstallments;

    @NotNull
    private final InstallmentOption option;

    @NotNull
    private final Locale shopperLocale;
    private final boolean showAmount;

    public InstallmentModel(@Nullable Integer num, @NotNull InstallmentOption installmentOption, @Nullable Amount amount, @NotNull Locale locale, boolean z11) {
        installmentOption.getClass();
        locale.getClass();
        this.numberOfInstallments = num;
        this.option = installmentOption;
        this.amount = amount;
        this.shopperLocale = locale;
        this.showAmount = z11;
    }

    public static /* synthetic */ InstallmentModel copy$default(InstallmentModel installmentModel, Integer num, InstallmentOption installmentOption, Amount amount, Locale locale, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = installmentModel.numberOfInstallments;
        }
        if ((i11 & 2) != 0) {
            installmentOption = installmentModel.option;
        }
        if ((i11 & 4) != 0) {
            amount = installmentModel.amount;
        }
        if ((i11 & 8) != 0) {
            locale = installmentModel.shopperLocale;
        }
        if ((i11 & 16) != 0) {
            z11 = installmentModel.showAmount;
        }
        boolean z12 = z11;
        Amount amount2 = amount;
        return installmentModel.copy(num, installmentOption, amount2, locale, z12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getNumberOfInstallments() {
        return this.numberOfInstallments;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InstallmentOption getOption() {
        return this.option;
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
    public final boolean getShowAmount() {
        return this.showAmount;
    }

    @NotNull
    public final InstallmentModel copy(@Nullable Integer numberOfInstallments, @NotNull InstallmentOption option, @Nullable Amount amount, @NotNull Locale shopperLocale, boolean showAmount) {
        option.getClass();
        shopperLocale.getClass();
        return new InstallmentModel(numberOfInstallments, option, amount, shopperLocale, showAmount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentModel)) {
            return false;
        }
        InstallmentModel installmentModel = (InstallmentModel) other;
        return Intrinsics.areEqual(this.numberOfInstallments, installmentModel.numberOfInstallments) && this.option == installmentModel.option && Intrinsics.areEqual(this.amount, installmentModel.amount) && Intrinsics.areEqual(this.shopperLocale, installmentModel.shopperLocale) && this.showAmount == installmentModel.showAmount;
    }

    @Nullable
    public final Amount getAmount() {
        return this.amount;
    }

    @Nullable
    public final Integer getNumberOfInstallments() {
        return this.numberOfInstallments;
    }

    @NotNull
    public final InstallmentOption getOption() {
        return this.option;
    }

    @NotNull
    public final Locale getShopperLocale() {
        return this.shopperLocale;
    }

    public final boolean getShowAmount() {
        return this.showAmount;
    }

    public int hashCode() {
        Integer num = this.numberOfInstallments;
        int iHashCode = (this.option.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        Amount amount = this.amount;
        return Boolean.hashCode(this.showAmount) + ((this.shopperLocale.hashCode() + ((iHashCode + (amount != null ? amount.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        Integer num = this.numberOfInstallments;
        InstallmentOption installmentOption = this.option;
        Amount amount = this.amount;
        Locale locale = this.shopperLocale;
        boolean z11 = this.showAmount;
        StringBuilder sb2 = new StringBuilder("InstallmentModel(numberOfInstallments=");
        sb2.append(num);
        sb2.append(", option=");
        sb2.append(installmentOption);
        sb2.append(", amount=");
        sb2.append(amount);
        sb2.append(", shopperLocale=");
        sb2.append(locale);
        sb2.append(", showAmount=");
        return s.o(sb2, z11, ")");
    }
}
