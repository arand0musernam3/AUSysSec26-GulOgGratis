package com.adyen.checkout.cashapppay.internal.ui.model;

import com.adyen.checkout.components.core.internal.ui.model.OutputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0014\u0010\n\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayOutputData;", "Lcom/adyen/checkout/components/core/internal/ui/model/OutputData;", "isStorePaymentSelected", "", "authorizationData", "Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayAuthorizationData;", "(ZLcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayAuthorizationData;)V", "getAuthorizationData", "()Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayAuthorizationData;", "()Z", "isValid", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "cashapppay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CashAppPayOutputData implements OutputData {

    @Nullable
    private final CashAppPayAuthorizationData authorizationData;
    private final boolean isStorePaymentSelected;

    public CashAppPayOutputData(boolean z11, @Nullable CashAppPayAuthorizationData cashAppPayAuthorizationData) {
        this.isStorePaymentSelected = z11;
        this.authorizationData = cashAppPayAuthorizationData;
    }

    public static /* synthetic */ CashAppPayOutputData copy$default(CashAppPayOutputData cashAppPayOutputData, boolean z11, CashAppPayAuthorizationData cashAppPayAuthorizationData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = cashAppPayOutputData.isStorePaymentSelected;
        }
        if ((i11 & 2) != 0) {
            cashAppPayAuthorizationData = cashAppPayOutputData.authorizationData;
        }
        return cashAppPayOutputData.copy(z11, cashAppPayAuthorizationData);
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
    public final CashAppPayOutputData copy(boolean isStorePaymentSelected, @Nullable CashAppPayAuthorizationData authorizationData) {
        return new CashAppPayOutputData(isStorePaymentSelected, authorizationData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashAppPayOutputData)) {
            return false;
        }
        CashAppPayOutputData cashAppPayOutputData = (CashAppPayOutputData) other;
        return this.isStorePaymentSelected == cashAppPayOutputData.isStorePaymentSelected && Intrinsics.areEqual(this.authorizationData, cashAppPayOutputData.authorizationData);
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

    @Override // com.adyen.checkout.components.core.internal.ui.model.OutputData
    public boolean isValid() {
        return this.authorizationData != null;
    }

    @NotNull
    public String toString() {
        return "CashAppPayOutputData(isStorePaymentSelected=" + this.isStorePaymentSelected + ", authorizationData=" + this.authorizationData + ")";
    }
}
