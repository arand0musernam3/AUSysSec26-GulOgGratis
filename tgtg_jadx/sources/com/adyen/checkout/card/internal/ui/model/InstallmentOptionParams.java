package com.adyen.checkout.card.internal.ui.model;

import com.adyen.checkout.core.CardBrand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/InstallmentOptionParams;", "", "()V", "includeRevolving", "", "getIncludeRevolving", "()Z", "values", "", "", "getValues", "()Ljava/util/List;", "CardBasedInstallmentOptions", "DefaultInstallmentOptions", "Lcom/adyen/checkout/card/internal/ui/model/InstallmentOptionParams$CardBasedInstallmentOptions;", "Lcom/adyen/checkout/card/internal/ui/model/InstallmentOptionParams$DefaultInstallmentOptions;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class InstallmentOptionParams {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/InstallmentOptionParams$CardBasedInstallmentOptions;", "Lcom/adyen/checkout/card/internal/ui/model/InstallmentOptionParams;", "values", "", "", "includeRevolving", "", "cardBrand", "Lcom/adyen/checkout/core/CardBrand;", "(Ljava/util/List;ZLcom/adyen/checkout/core/CardBrand;)V", "getCardBrand", "()Lcom/adyen/checkout/core/CardBrand;", "getIncludeRevolving", "()Z", "getValues", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CardBasedInstallmentOptions extends InstallmentOptionParams {

        @NotNull
        private final CardBrand cardBrand;
        private final boolean includeRevolving;

        @NotNull
        private final List<Integer> values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardBasedInstallmentOptions(@NotNull List<Integer> list, boolean z11, @NotNull CardBrand cardBrand) {
            super(null);
            list.getClass();
            cardBrand.getClass();
            this.values = list;
            this.includeRevolving = z11;
            this.cardBrand = cardBrand;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CardBasedInstallmentOptions copy$default(CardBasedInstallmentOptions cardBasedInstallmentOptions, List list, boolean z11, CardBrand cardBrand, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = cardBasedInstallmentOptions.values;
            }
            if ((i11 & 2) != 0) {
                z11 = cardBasedInstallmentOptions.includeRevolving;
            }
            if ((i11 & 4) != 0) {
                cardBrand = cardBasedInstallmentOptions.cardBrand;
            }
            return cardBasedInstallmentOptions.copy(list, z11, cardBrand);
        }

        @NotNull
        public final List<Integer> component1() {
            return this.values;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIncludeRevolving() {
            return this.includeRevolving;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final CardBrand getCardBrand() {
            return this.cardBrand;
        }

        @NotNull
        public final CardBasedInstallmentOptions copy(@NotNull List<Integer> values, boolean includeRevolving, @NotNull CardBrand cardBrand) {
            values.getClass();
            cardBrand.getClass();
            return new CardBasedInstallmentOptions(values, includeRevolving, cardBrand);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardBasedInstallmentOptions)) {
                return false;
            }
            CardBasedInstallmentOptions cardBasedInstallmentOptions = (CardBasedInstallmentOptions) other;
            return Intrinsics.areEqual(this.values, cardBasedInstallmentOptions.values) && this.includeRevolving == cardBasedInstallmentOptions.includeRevolving && Intrinsics.areEqual(this.cardBrand, cardBasedInstallmentOptions.cardBrand);
        }

        @NotNull
        public final CardBrand getCardBrand() {
            return this.cardBrand;
        }

        @Override // com.adyen.checkout.card.internal.ui.model.InstallmentOptionParams
        public boolean getIncludeRevolving() {
            return this.includeRevolving;
        }

        @Override // com.adyen.checkout.card.internal.ui.model.InstallmentOptionParams
        @NotNull
        public List<Integer> getValues() {
            return this.values;
        }

        public int hashCode() {
            return this.cardBrand.hashCode() + k.e(this.values.hashCode() * 31, 31, this.includeRevolving);
        }

        @NotNull
        public String toString() {
            return "CardBasedInstallmentOptions(values=" + this.values + ", includeRevolving=" + this.includeRevolving + ", cardBrand=" + this.cardBrand + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/InstallmentOptionParams$DefaultInstallmentOptions;", "Lcom/adyen/checkout/card/internal/ui/model/InstallmentOptionParams;", "values", "", "", "includeRevolving", "", "(Ljava/util/List;Z)V", "getIncludeRevolving", "()Z", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DefaultInstallmentOptions extends InstallmentOptionParams {
        private final boolean includeRevolving;

        @NotNull
        private final List<Integer> values;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultInstallmentOptions(@NotNull List<Integer> list, boolean z11) {
            super(null);
            list.getClass();
            this.values = list;
            this.includeRevolving = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DefaultInstallmentOptions copy$default(DefaultInstallmentOptions defaultInstallmentOptions, List list, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = defaultInstallmentOptions.values;
            }
            if ((i11 & 2) != 0) {
                z11 = defaultInstallmentOptions.includeRevolving;
            }
            return defaultInstallmentOptions.copy(list, z11);
        }

        @NotNull
        public final List<Integer> component1() {
            return this.values;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIncludeRevolving() {
            return this.includeRevolving;
        }

        @NotNull
        public final DefaultInstallmentOptions copy(@NotNull List<Integer> values, boolean includeRevolving) {
            values.getClass();
            return new DefaultInstallmentOptions(values, includeRevolving);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DefaultInstallmentOptions)) {
                return false;
            }
            DefaultInstallmentOptions defaultInstallmentOptions = (DefaultInstallmentOptions) other;
            return Intrinsics.areEqual(this.values, defaultInstallmentOptions.values) && this.includeRevolving == defaultInstallmentOptions.includeRevolving;
        }

        @Override // com.adyen.checkout.card.internal.ui.model.InstallmentOptionParams
        public boolean getIncludeRevolving() {
            return this.includeRevolving;
        }

        @Override // com.adyen.checkout.card.internal.ui.model.InstallmentOptionParams
        @NotNull
        public List<Integer> getValues() {
            return this.values;
        }

        public int hashCode() {
            return Boolean.hashCode(this.includeRevolving) + (this.values.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "DefaultInstallmentOptions(values=" + this.values + ", includeRevolving=" + this.includeRevolving + ")";
        }
    }

    public /* synthetic */ InstallmentOptionParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean getIncludeRevolving();

    @NotNull
    public abstract List<Integer> getValues();

    private InstallmentOptionParams() {
    }
}
