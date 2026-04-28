package com.adyen.checkout.cashapppay.internal.ui.model;

import com.adyen.checkout.components.core.internal.ui.model.InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayInputData;", "Lcom/adyen/checkout/components/core/internal/ui/model/InputData;", "isStorePaymentSelected", "", "authorizationData", "Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayAuthorizationData;", "(ZLcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayAuthorizationData;)V", "getAuthorizationData", "()Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayAuthorizationData;", "setAuthorizationData", "(Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayAuthorizationData;)V", "()Z", "setStorePaymentSelected", "(Z)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "cashapppay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CashAppPayInputData implements InputData {

    @Nullable
    private CashAppPayAuthorizationData authorizationData;
    private boolean isStorePaymentSelected;

    public /* synthetic */ CashAppPayInputData(boolean z11, CashAppPayAuthorizationData cashAppPayAuthorizationData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : cashAppPayAuthorizationData);
    }

    public static /* synthetic */ CashAppPayInputData copy$default(CashAppPayInputData cashAppPayInputData, boolean z11, CashAppPayAuthorizationData cashAppPayAuthorizationData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = cashAppPayInputData.isStorePaymentSelected;
        }
        if ((i11 & 2) != 0) {
            cashAppPayAuthorizationData = cashAppPayInputData.authorizationData;
        }
        return cashAppPayInputData.copy(z11, cashAppPayAuthorizationData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsStorePaymentSelected() {
        return this.isStorePaymentSelected;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CashAppPayAuthorizationData getAuthorizationData() {
        return this.authorizationData;
    }

    @NotNull
    public final CashAppPayInputData copy(boolean isStorePaymentSelected, @Nullable CashAppPayAuthorizationData authorizationData) {
        return new CashAppPayInputData(isStorePaymentSelected, authorizationData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashAppPayInputData)) {
            return false;
        }
        CashAppPayInputData cashAppPayInputData = (CashAppPayInputData) other;
        return this.isStorePaymentSelected == cashAppPayInputData.isStorePaymentSelected && Intrinsics.areEqual(this.authorizationData, cashAppPayInputData.authorizationData);
    }

    @Nullable
    public final CashAppPayAuthorizationData getAuthorizationData() {
        return this.authorizationData;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isStorePaymentSelected) * 31;
        CashAppPayAuthorizationData cashAppPayAuthorizationData = this.authorizationData;
        return iHashCode + (cashAppPayAuthorizationData == null ? 0 : cashAppPayAuthorizationData.hashCode());
    }

    public final boolean isStorePaymentSelected() {
        return this.isStorePaymentSelected;
    }

    public final void setAuthorizationData(@Nullable CashAppPayAuthorizationData cashAppPayAuthorizationData) {
        this.authorizationData = cashAppPayAuthorizationData;
    }

    public final void setStorePaymentSelected(boolean z11) {
        this.isStorePaymentSelected = z11;
    }

    @NotNull
    public String toString() {
        return "CashAppPayInputData(isStorePaymentSelected=" + this.isStorePaymentSelected + ", authorizationData=" + this.authorizationData + ")";
    }

    public CashAppPayInputData(boolean z11, @Nullable CashAppPayAuthorizationData cashAppPayAuthorizationData) {
        this.isStorePaymentSelected = z11;
        this.authorizationData = cashAppPayAuthorizationData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CashAppPayInputData() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
