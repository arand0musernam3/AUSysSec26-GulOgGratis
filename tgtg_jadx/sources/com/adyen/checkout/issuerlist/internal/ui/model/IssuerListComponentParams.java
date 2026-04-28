package com.adyen.checkout.issuerlist.internal.ui.model;

import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.internal.ui.model.AnalyticsParams;
import com.adyen.checkout.components.core.internal.ui.model.ButtonParams;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParams;
import com.adyen.checkout.components.core.internal.ui.model.ComponentParams;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.issuerlist.IssuerListViewType;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010$\u001a\u00020\u0004HÂ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J1\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010)\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u0018X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001cR\u0012\u0010\u001e\u001a\u00020\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006/"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListComponentParams;", "Lcom/adyen/checkout/components/core/internal/ui/model/ComponentParams;", "Lcom/adyen/checkout/components/core/internal/ui/model/ButtonParams;", "commonComponentParams", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;", "isSubmitButtonVisible", "", "viewType", "Lcom/adyen/checkout/issuerlist/IssuerListViewType;", "hideIssuerLogos", "(Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;ZLcom/adyen/checkout/issuerlist/IssuerListViewType;Z)V", "amount", "Lcom/adyen/checkout/components/core/Amount;", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "analyticsParams", "Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "getAnalyticsParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "clientKey", "", "getClientKey", "()Ljava/lang/String;", "environment", "Lcom/adyen/checkout/core/Environment;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "getHideIssuerLogos", "()Z", "isCreatedByDropIn", "shopperLocale", "Ljava/util/Locale;", "getShopperLocale", "()Ljava/util/Locale;", "getViewType", "()Lcom/adyen/checkout/issuerlist/IssuerListViewType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class IssuerListComponentParams implements ComponentParams, ButtonParams {

    @NotNull
    private final CommonComponentParams commonComponentParams;
    private final boolean hideIssuerLogos;
    private final boolean isSubmitButtonVisible;

    @NotNull
    private final IssuerListViewType viewType;

    public IssuerListComponentParams(@NotNull CommonComponentParams commonComponentParams, boolean z11, @NotNull IssuerListViewType issuerListViewType, boolean z12) {
        commonComponentParams.getClass();
        issuerListViewType.getClass();
        this.commonComponentParams = commonComponentParams;
        this.isSubmitButtonVisible = z11;
        this.viewType = issuerListViewType;
        this.hideIssuerLogos = z12;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final CommonComponentParams getCommonComponentParams() {
        return this.commonComponentParams;
    }

    public static /* synthetic */ IssuerListComponentParams copy$default(IssuerListComponentParams issuerListComponentParams, CommonComponentParams commonComponentParams, boolean z11, IssuerListViewType issuerListViewType, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonComponentParams = issuerListComponentParams.commonComponentParams;
        }
        if ((i11 & 2) != 0) {
            z11 = issuerListComponentParams.isSubmitButtonVisible;
        }
        if ((i11 & 4) != 0) {
            issuerListViewType = issuerListComponentParams.viewType;
        }
        if ((i11 & 8) != 0) {
            z12 = issuerListComponentParams.hideIssuerLogos;
        }
        return issuerListComponentParams.copy(commonComponentParams, z11, issuerListViewType, z12);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSubmitButtonVisible() {
        return this.isSubmitButtonVisible;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final IssuerListViewType getViewType() {
        return this.viewType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHideIssuerLogos() {
        return this.hideIssuerLogos;
    }

    @NotNull
    public final IssuerListComponentParams copy(@NotNull CommonComponentParams commonComponentParams, boolean isSubmitButtonVisible, @NotNull IssuerListViewType viewType, boolean hideIssuerLogos) {
        commonComponentParams.getClass();
        viewType.getClass();
        return new IssuerListComponentParams(commonComponentParams, isSubmitButtonVisible, viewType, hideIssuerLogos);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IssuerListComponentParams)) {
            return false;
        }
        IssuerListComponentParams issuerListComponentParams = (IssuerListComponentParams) other;
        return Intrinsics.areEqual(this.commonComponentParams, issuerListComponentParams.commonComponentParams) && this.isSubmitButtonVisible == issuerListComponentParams.isSubmitButtonVisible && this.viewType == issuerListComponentParams.viewType && this.hideIssuerLogos == issuerListComponentParams.hideIssuerLogos;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @Nullable
    public Amount getAmount() {
        return this.commonComponentParams.getAmount();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public AnalyticsParams getAnalyticsParams() {
        return this.commonComponentParams.getAnalyticsParams();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public String getClientKey() {
        return this.commonComponentParams.getClientKey();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public Environment getEnvironment() {
        return this.commonComponentParams.getEnvironment();
    }

    public final boolean getHideIssuerLogos() {
        return this.hideIssuerLogos;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public Locale getShopperLocale() {
        return this.commonComponentParams.getShopperLocale();
    }

    @NotNull
    public final IssuerListViewType getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hideIssuerLogos) + ((this.viewType.hashCode() + k.e(this.commonComponentParams.hashCode() * 31, 31, this.isSubmitButtonVisible)) * 31);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    public boolean isCreatedByDropIn() {
        return this.commonComponentParams.isCreatedByDropIn();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ButtonParams
    public boolean isSubmitButtonVisible() {
        return this.isSubmitButtonVisible;
    }

    @NotNull
    public String toString() {
        return "IssuerListComponentParams(commonComponentParams=" + this.commonComponentParams + ", isSubmitButtonVisible=" + this.isSubmitButtonVisible + ", viewType=" + this.viewType + ", hideIssuerLogos=" + this.hideIssuerLogos + ")";
    }
}
