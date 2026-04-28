package com.adyen.checkout.card.internal.ui.model;

import com.adyen.checkout.core.CardBrand;
import e0.f;
import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u0011\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/DualBrandData;", "", "selectedBrand", "Lcom/adyen/checkout/core/CardBrand;", "Lcom/adyen/checkout/card/CardBrand;", "brandOptions", "", "Lcom/adyen/checkout/card/internal/ui/model/CardBrandItem;", "selectable", "", "(Lcom/adyen/checkout/core/CardBrand;Ljava/util/List;Z)V", "getBrandOptions", "()Ljava/util/List;", "getSelectable", "()Z", "getSelectedBrand", "()Lcom/adyen/checkout/core/CardBrand;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DualBrandData {

    @NotNull
    private final List<CardBrandItem> brandOptions;
    private final boolean selectable;

    @Nullable
    private final CardBrand selectedBrand;

    public DualBrandData(@Nullable CardBrand cardBrand, @NotNull List<CardBrandItem> list, boolean z11) {
        list.getClass();
        this.selectedBrand = cardBrand;
        this.brandOptions = list;
        this.selectable = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DualBrandData copy$default(DualBrandData dualBrandData, CardBrand cardBrand, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cardBrand = dualBrandData.selectedBrand;
        }
        if ((i11 & 2) != 0) {
            list = dualBrandData.brandOptions;
        }
        if ((i11 & 4) != 0) {
            z11 = dualBrandData.selectable;
        }
        return dualBrandData.copy(cardBrand, list, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CardBrand getSelectedBrand() {
        return this.selectedBrand;
    }

    @NotNull
    public final List<CardBrandItem> component2() {
        return this.brandOptions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSelectable() {
        return this.selectable;
    }

    @NotNull
    public final DualBrandData copy(@Nullable CardBrand selectedBrand, @NotNull List<CardBrandItem> brandOptions, boolean selectable) {
        brandOptions.getClass();
        return new DualBrandData(selectedBrand, brandOptions, selectable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DualBrandData)) {
            return false;
        }
        DualBrandData dualBrandData = (DualBrandData) other;
        return Intrinsics.areEqual(this.selectedBrand, dualBrandData.selectedBrand) && Intrinsics.areEqual(this.brandOptions, dualBrandData.brandOptions) && this.selectable == dualBrandData.selectable;
    }

    @NotNull
    public final List<CardBrandItem> getBrandOptions() {
        return this.brandOptions;
    }

    public final boolean getSelectable() {
        return this.selectable;
    }

    @Nullable
    public final CardBrand getSelectedBrand() {
        return this.selectedBrand;
    }

    public int hashCode() {
        CardBrand cardBrand = this.selectedBrand;
        return Boolean.hashCode(this.selectable) + f.c(this.brandOptions, (cardBrand == null ? 0 : cardBrand.hashCode()) * 31, 31);
    }

    @NotNull
    public String toString() {
        CardBrand cardBrand = this.selectedBrand;
        List<CardBrandItem> list = this.brandOptions;
        boolean z11 = this.selectable;
        StringBuilder sb2 = new StringBuilder("DualBrandData(selectedBrand=");
        sb2.append(cardBrand);
        sb2.append(", brandOptions=");
        sb2.append(list);
        sb2.append(", selectable=");
        return s.o(sb2, z11, ")");
    }
}
