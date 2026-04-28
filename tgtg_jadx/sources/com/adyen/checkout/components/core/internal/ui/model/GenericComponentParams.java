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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u001c\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u0012X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006$"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/GenericComponentParams;", "Lcom/adyen/checkout/components/core/internal/ui/model/ComponentParams;", "commonComponentParams", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;", "(Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;)V", "amount", "Lcom/adyen/checkout/components/core/Amount;", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "analyticsParams", "Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "getAnalyticsParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "clientKey", "", "getClientKey", "()Ljava/lang/String;", "environment", "Lcom/adyen/checkout/core/Environment;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "isCreatedByDropIn", "", "()Z", "shopperLocale", "Ljava/util/Locale;", "getShopperLocale", "()Ljava/util/Locale;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GenericComponentParams implements ComponentParams {

    @NotNull
    private final CommonComponentParams commonComponentParams;

    public GenericComponentParams(@NotNull CommonComponentParams commonComponentParams) {
        commonComponentParams.getClass();
        this.commonComponentParams = commonComponentParams;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final CommonComponentParams getCommonComponentParams() {
        return this.commonComponentParams;
    }

    public static /* synthetic */ GenericComponentParams copy$default(GenericComponentParams genericComponentParams, CommonComponentParams commonComponentParams, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonComponentParams = genericComponentParams.commonComponentParams;
        }
        return genericComponentParams.copy(commonComponentParams);
    }

    @NotNull
    public final GenericComponentParams copy(@NotNull CommonComponentParams commonComponentParams) {
        commonComponentParams.getClass();
        return new GenericComponentParams(commonComponentParams);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GenericComponentParams) && Intrinsics.areEqual(this.commonComponentParams, ((GenericComponentParams) other).commonComponentParams);
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
        return this.commonComponentParams.hashCode();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    public boolean isCreatedByDropIn() {
        return this.commonComponentParams.isCreatedByDropIn();
    }

    @NotNull
    public String toString() {
        return "GenericComponentParams(commonComponentParams=" + this.commonComponentParams + ")";
    }
}
