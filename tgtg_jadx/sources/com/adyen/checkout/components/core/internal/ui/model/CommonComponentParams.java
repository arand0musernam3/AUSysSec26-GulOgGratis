package com.adyen.checkout.components.core.internal.ui.model;

import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.Environment;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003JG\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;", "Lcom/adyen/checkout/components/core/internal/ui/model/ComponentParams;", "shopperLocale", "Ljava/util/Locale;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "analyticsParams", "Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "isCreatedByDropIn", "", "amount", "Lcom/adyen/checkout/components/core/Amount;", "(Ljava/util/Locale;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;ZLcom/adyen/checkout/components/core/Amount;)V", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "getAnalyticsParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "getClientKey", "()Ljava/lang/String;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "()Z", "getShopperLocale", "()Ljava/util/Locale;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CommonComponentParams implements ComponentParams {

    @Nullable
    private final Amount amount;

    @NotNull
    private final AnalyticsParams analyticsParams;

    @NotNull
    private final String clientKey;

    @NotNull
    private final Environment environment;
    private final boolean isCreatedByDropIn;

    @NotNull
    private final Locale shopperLocale;

    public CommonComponentParams(@NotNull Locale locale, @NotNull Environment environment, @NotNull String str, @NotNull AnalyticsParams analyticsParams, boolean z11, @Nullable Amount amount) {
        locale.getClass();
        environment.getClass();
        str.getClass();
        analyticsParams.getClass();
        this.shopperLocale = locale;
        this.environment = environment;
        this.clientKey = str;
        this.analyticsParams = analyticsParams;
        this.isCreatedByDropIn = z11;
        this.amount = amount;
    }

    public static /* synthetic */ CommonComponentParams copy$default(CommonComponentParams commonComponentParams, Locale locale, Environment environment, String str, AnalyticsParams analyticsParams, boolean z11, Amount amount, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            locale = commonComponentParams.shopperLocale;
        }
        if ((i11 & 2) != 0) {
            environment = commonComponentParams.environment;
        }
        if ((i11 & 4) != 0) {
            str = commonComponentParams.clientKey;
        }
        if ((i11 & 8) != 0) {
            analyticsParams = commonComponentParams.analyticsParams;
        }
        if ((i11 & 16) != 0) {
            z11 = commonComponentParams.isCreatedByDropIn;
        }
        if ((i11 & 32) != 0) {
            amount = commonComponentParams.amount;
        }
        boolean z12 = z11;
        Amount amount2 = amount;
        return commonComponentParams.copy(locale, environment, str, analyticsParams, z12, amount2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Locale getShopperLocale() {
        return this.shopperLocale;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getClientKey() {
        return this.clientKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AnalyticsParams getAnalyticsParams() {
        return this.analyticsParams;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsCreatedByDropIn() {
        return this.isCreatedByDropIn;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    @NotNull
    public final CommonComponentParams copy(@NotNull Locale shopperLocale, @NotNull Environment environment, @NotNull String clientKey, @NotNull AnalyticsParams analyticsParams, boolean isCreatedByDropIn, @Nullable Amount amount) {
        shopperLocale.getClass();
        environment.getClass();
        clientKey.getClass();
        analyticsParams.getClass();
        return new CommonComponentParams(shopperLocale, environment, clientKey, analyticsParams, isCreatedByDropIn, amount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonComponentParams)) {
            return false;
        }
        CommonComponentParams commonComponentParams = (CommonComponentParams) other;
        return Intrinsics.areEqual(this.shopperLocale, commonComponentParams.shopperLocale) && Intrinsics.areEqual(this.environment, commonComponentParams.environment) && Intrinsics.areEqual(this.clientKey, commonComponentParams.clientKey) && Intrinsics.areEqual(this.analyticsParams, commonComponentParams.analyticsParams) && this.isCreatedByDropIn == commonComponentParams.isCreatedByDropIn && Intrinsics.areEqual(this.amount, commonComponentParams.amount);
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @Nullable
    public Amount getAmount() {
        return this.amount;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public AnalyticsParams getAnalyticsParams() {
        return this.analyticsParams;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public String getClientKey() {
        return this.clientKey;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public Environment getEnvironment() {
        return this.environment;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public Locale getShopperLocale() {
        return this.shopperLocale;
    }

    public int hashCode() {
        int iE = k.e((this.analyticsParams.hashCode() + l1.b((this.environment.hashCode() + (this.shopperLocale.hashCode() * 31)) * 31, 31, this.clientKey)) * 31, 31, this.isCreatedByDropIn);
        Amount amount = this.amount;
        return iE + (amount == null ? 0 : amount.hashCode());
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    public boolean isCreatedByDropIn() {
        return this.isCreatedByDropIn;
    }

    @NotNull
    public String toString() {
        return "CommonComponentParams(shopperLocale=" + this.shopperLocale + ", environment=" + this.environment + ", clientKey=" + this.clientKey + ", analyticsParams=" + this.analyticsParams + ", isCreatedByDropIn=" + this.isCreatedByDropIn + ", amount=" + this.amount + ")";
    }
}
