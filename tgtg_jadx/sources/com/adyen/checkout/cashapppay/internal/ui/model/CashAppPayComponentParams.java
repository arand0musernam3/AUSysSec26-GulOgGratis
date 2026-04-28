package com.adyen.checkout.cashapppay.internal.ui.model;

import b3.i;
import com.adyen.checkout.cashapppay.CashAppPayEnvironment;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.internal.ui.model.AnalyticsParams;
import com.adyen.checkout.components.core.internal.ui.model.ButtonParams;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParams;
import com.adyen.checkout.components.core.internal.ui.model.ComponentParams;
import com.adyen.checkout.core.Environment;
import e0.f;
import i4.a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000fJ\t\u0010,\u001a\u00020\u0004HÂ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003J_\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u00105\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\u0006\u0010:\u001a\u00020\nJ\t\u0010;\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0012\u0010\"\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0012\u0010&\u001a\u00020'X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#¨\u0006<"}, d2 = {"Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayComponentParams;", "Lcom/adyen/checkout/components/core/internal/ui/model/ComponentParams;", "Lcom/adyen/checkout/components/core/internal/ui/model/ButtonParams;", "commonComponentParams", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;", "isSubmitButtonVisible", "", "cashAppPayEnvironment", "Lcom/adyen/checkout/cashapppay/CashAppPayEnvironment;", "returnUrl", "", "showStorePaymentField", "storePaymentMethod", Bayeux.KEY_CLIENT_ID, "scopeId", "(Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;ZLcom/adyen/checkout/cashapppay/CashAppPayEnvironment;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "amount", "Lcom/adyen/checkout/components/core/Amount;", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "analyticsParams", "Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "getAnalyticsParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "getCashAppPayEnvironment", "()Lcom/adyen/checkout/cashapppay/CashAppPayEnvironment;", "getClientId", "()Ljava/lang/String;", "clientKey", "getClientKey", "environment", "Lcom/adyen/checkout/core/Environment;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "isCreatedByDropIn", "()Z", "getReturnUrl", "getScopeId", "shopperLocale", "Ljava/util/Locale;", "getShopperLocale", "()Ljava/util/Locale;", "getShowStorePaymentField", "getStorePaymentMethod", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "requireClientId", "toString", "cashapppay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CashAppPayComponentParams implements ComponentParams, ButtonParams {

    @NotNull
    private final CashAppPayEnvironment cashAppPayEnvironment;

    @Nullable
    private final String clientId;

    @NotNull
    private final CommonComponentParams commonComponentParams;
    private final boolean isSubmitButtonVisible;

    @Nullable
    private final String returnUrl;

    @Nullable
    private final String scopeId;
    private final boolean showStorePaymentField;
    private final boolean storePaymentMethod;

    public CashAppPayComponentParams(@NotNull CommonComponentParams commonComponentParams, boolean z11, @NotNull CashAppPayEnvironment cashAppPayEnvironment, @Nullable String str, boolean z12, boolean z13, @Nullable String str2, @Nullable String str3) {
        commonComponentParams.getClass();
        cashAppPayEnvironment.getClass();
        this.commonComponentParams = commonComponentParams;
        this.isSubmitButtonVisible = z11;
        this.cashAppPayEnvironment = cashAppPayEnvironment;
        this.returnUrl = str;
        this.showStorePaymentField = z12;
        this.storePaymentMethod = z13;
        this.clientId = str2;
        this.scopeId = str3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final CommonComponentParams getCommonComponentParams() {
        return this.commonComponentParams;
    }

    public static /* synthetic */ CashAppPayComponentParams copy$default(CashAppPayComponentParams cashAppPayComponentParams, CommonComponentParams commonComponentParams, boolean z11, CashAppPayEnvironment cashAppPayEnvironment, String str, boolean z12, boolean z13, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonComponentParams = cashAppPayComponentParams.commonComponentParams;
        }
        if ((i11 & 2) != 0) {
            z11 = cashAppPayComponentParams.isSubmitButtonVisible;
        }
        if ((i11 & 4) != 0) {
            cashAppPayEnvironment = cashAppPayComponentParams.cashAppPayEnvironment;
        }
        if ((i11 & 8) != 0) {
            str = cashAppPayComponentParams.returnUrl;
        }
        if ((i11 & 16) != 0) {
            z12 = cashAppPayComponentParams.showStorePaymentField;
        }
        if ((i11 & 32) != 0) {
            z13 = cashAppPayComponentParams.storePaymentMethod;
        }
        if ((i11 & 64) != 0) {
            str2 = cashAppPayComponentParams.clientId;
        }
        if ((i11 & 128) != 0) {
            str3 = cashAppPayComponentParams.scopeId;
        }
        String str4 = str2;
        String str5 = str3;
        boolean z14 = z12;
        boolean z15 = z13;
        return cashAppPayComponentParams.copy(commonComponentParams, z11, cashAppPayEnvironment, str, z14, z15, str4, str5);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSubmitButtonVisible() {
        return this.isSubmitButtonVisible;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CashAppPayEnvironment getCashAppPayEnvironment() {
        return this.cashAppPayEnvironment;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowStorePaymentField() {
        return this.showStorePaymentField;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getStorePaymentMethod() {
        return this.storePaymentMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getScopeId() {
        return this.scopeId;
    }

    @NotNull
    public final CashAppPayComponentParams copy(@NotNull CommonComponentParams commonComponentParams, boolean isSubmitButtonVisible, @NotNull CashAppPayEnvironment cashAppPayEnvironment, @Nullable String returnUrl, boolean showStorePaymentField, boolean storePaymentMethod, @Nullable String clientId, @Nullable String scopeId) {
        commonComponentParams.getClass();
        cashAppPayEnvironment.getClass();
        return new CashAppPayComponentParams(commonComponentParams, isSubmitButtonVisible, cashAppPayEnvironment, returnUrl, showStorePaymentField, storePaymentMethod, clientId, scopeId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashAppPayComponentParams)) {
            return false;
        }
        CashAppPayComponentParams cashAppPayComponentParams = (CashAppPayComponentParams) other;
        return Intrinsics.areEqual(this.commonComponentParams, cashAppPayComponentParams.commonComponentParams) && this.isSubmitButtonVisible == cashAppPayComponentParams.isSubmitButtonVisible && this.cashAppPayEnvironment == cashAppPayComponentParams.cashAppPayEnvironment && Intrinsics.areEqual(this.returnUrl, cashAppPayComponentParams.returnUrl) && this.showStorePaymentField == cashAppPayComponentParams.showStorePaymentField && this.storePaymentMethod == cashAppPayComponentParams.storePaymentMethod && Intrinsics.areEqual(this.clientId, cashAppPayComponentParams.clientId) && Intrinsics.areEqual(this.scopeId, cashAppPayComponentParams.scopeId);
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

    @NotNull
    public final CashAppPayEnvironment getCashAppPayEnvironment() {
        return this.cashAppPayEnvironment;
    }

    @Nullable
    public final String getClientId() {
        return this.clientId;
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

    @Nullable
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    @Nullable
    public final String getScopeId() {
        return this.scopeId;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public Locale getShopperLocale() {
        return this.commonComponentParams.getShopperLocale();
    }

    public final boolean getShowStorePaymentField() {
        return this.showStorePaymentField;
    }

    public final boolean getStorePaymentMethod() {
        return this.storePaymentMethod;
    }

    public int hashCode() {
        int iHashCode = (this.cashAppPayEnvironment.hashCode() + k.e(this.commonComponentParams.hashCode() * 31, 31, this.isSubmitButtonVisible)) * 31;
        String str = this.returnUrl;
        int iE = k.e(k.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.showStorePaymentField), 31, this.storePaymentMethod);
        String str2 = this.clientId;
        int iHashCode2 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scopeId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
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
    public final String requireClientId() {
        String str = this.clientId;
        if (str != null) {
            return str;
        }
        a.f("Required value was null.");
        return null;
    }

    @NotNull
    public String toString() {
        CommonComponentParams commonComponentParams = this.commonComponentParams;
        boolean z11 = this.isSubmitButtonVisible;
        CashAppPayEnvironment cashAppPayEnvironment = this.cashAppPayEnvironment;
        String str = this.returnUrl;
        boolean z12 = this.showStorePaymentField;
        boolean z13 = this.storePaymentMethod;
        String str2 = this.clientId;
        String str3 = this.scopeId;
        StringBuilder sb2 = new StringBuilder("CashAppPayComponentParams(commonComponentParams=");
        sb2.append(commonComponentParams);
        sb2.append(", isSubmitButtonVisible=");
        sb2.append(z11);
        sb2.append(", cashAppPayEnvironment=");
        sb2.append(cashAppPayEnvironment);
        sb2.append(", returnUrl=");
        sb2.append(str);
        sb2.append(", showStorePaymentField=");
        i.C(sb2, z12, ", storePaymentMethod=", z13, ", clientId=");
        return f.o(sb2, str2, ", scopeId=", str3, ")");
    }
}
