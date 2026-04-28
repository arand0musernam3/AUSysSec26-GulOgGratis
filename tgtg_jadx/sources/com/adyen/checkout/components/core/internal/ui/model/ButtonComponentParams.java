package com.adyen.checkout.components.core.internal.ui.model;

import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.Environment;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u001e\u001a\u00020\u0004HÂ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/ButtonComponentParams;", "Lcom/adyen/checkout/components/core/internal/ui/model/ComponentParams;", "Lcom/adyen/checkout/components/core/internal/ui/model/ButtonParams;", "commonComponentParams", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;", "isSubmitButtonVisible", "", "(Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;Z)V", "amount", "Lcom/adyen/checkout/components/core/Amount;", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "analyticsParams", "Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "getAnalyticsParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "clientKey", "", "getClientKey", "()Ljava/lang/String;", "environment", "Lcom/adyen/checkout/core/Environment;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "isCreatedByDropIn", "()Z", "shopperLocale", "Ljava/util/Locale;", "getShopperLocale", "()Ljava/util/Locale;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ButtonComponentParams implements ComponentParams, ButtonParams {

    @NotNull
    private final CommonComponentParams commonComponentParams;
    private final boolean isSubmitButtonVisible;

    public ButtonComponentParams(@NotNull CommonComponentParams commonComponentParams, boolean z11) {
        commonComponentParams.getClass();
        this.commonComponentParams = commonComponentParams;
        this.isSubmitButtonVisible = z11;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final CommonComponentParams getCommonComponentParams() {
        return this.commonComponentParams;
    }

    public static /* synthetic */ ButtonComponentParams copy$default(ButtonComponentParams buttonComponentParams, CommonComponentParams commonComponentParams, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonComponentParams = buttonComponentParams.commonComponentParams;
        }
        if ((i11 & 2) != 0) {
            z11 = buttonComponentParams.isSubmitButtonVisible;
        }
        return buttonComponentParams.copy(commonComponentParams, z11);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSubmitButtonVisible() {
        return this.isSubmitButtonVisible;
    }

    @NotNull
    public final ButtonComponentParams copy(@NotNull CommonComponentParams commonComponentParams, boolean isSubmitButtonVisible) {
        commonComponentParams.getClass();
        return new ButtonComponentParams(commonComponentParams, isSubmitButtonVisible);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonComponentParams)) {
            return false;
        }
        ButtonComponentParams buttonComponentParams = (ButtonComponentParams) other;
        return Intrinsics.areEqual(this.commonComponentParams, buttonComponentParams.commonComponentParams) && this.isSubmitButtonVisible == buttonComponentParams.isSubmitButtonVisible;
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

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public Locale getShopperLocale() {
        return this.commonComponentParams.getShopperLocale();
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSubmitButtonVisible) + (this.commonComponentParams.hashCode() * 31);
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
        return "ButtonComponentParams(commonComponentParams=" + this.commonComponentParams + ", isSubmitButtonVisible=" + this.isSubmitButtonVisible + ")";
    }
}
