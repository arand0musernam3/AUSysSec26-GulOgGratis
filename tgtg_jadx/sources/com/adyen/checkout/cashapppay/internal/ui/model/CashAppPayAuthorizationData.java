package com.adyen.checkout.cashapppay.internal.ui.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayAuthorizationData;", "", "oneTimeData", "Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayOneTimeData;", "onFileData", "Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayOnFileData;", "(Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayOneTimeData;Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayOnFileData;)V", "getOnFileData", "()Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayOnFileData;", "getOneTimeData", "()Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayOneTimeData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cashapppay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CashAppPayAuthorizationData {

    @Nullable
    private final CashAppPayOnFileData onFileData;

    @Nullable
    private final CashAppPayOneTimeData oneTimeData;

    public CashAppPayAuthorizationData(@Nullable CashAppPayOneTimeData cashAppPayOneTimeData, @Nullable CashAppPayOnFileData cashAppPayOnFileData) {
        this.oneTimeData = cashAppPayOneTimeData;
        this.onFileData = cashAppPayOnFileData;
    }

    public static /* synthetic */ CashAppPayAuthorizationData copy$default(CashAppPayAuthorizationData cashAppPayAuthorizationData, CashAppPayOneTimeData cashAppPayOneTimeData, CashAppPayOnFileData cashAppPayOnFileData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cashAppPayOneTimeData = cashAppPayAuthorizationData.oneTimeData;
        }
        if ((i11 & 2) != 0) {
            cashAppPayOnFileData = cashAppPayAuthorizationData.onFileData;
        }
        return cashAppPayAuthorizationData.copy(cashAppPayOneTimeData, cashAppPayOnFileData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CashAppPayOneTimeData getOneTimeData() {
        return this.oneTimeData;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CashAppPayOnFileData getOnFileData() {
        return this.onFileData;
    }

    @NotNull
    public final CashAppPayAuthorizationData copy(@Nullable CashAppPayOneTimeData oneTimeData, @Nullable CashAppPayOnFileData onFileData) {
        return new CashAppPayAuthorizationData(oneTimeData, onFileData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashAppPayAuthorizationData)) {
            return false;
        }
        CashAppPayAuthorizationData cashAppPayAuthorizationData = (CashAppPayAuthorizationData) other;
        return Intrinsics.areEqual(this.oneTimeData, cashAppPayAuthorizationData.oneTimeData) && Intrinsics.areEqual(this.onFileData, cashAppPayAuthorizationData.onFileData);
    }

    @Nullable
    public final CashAppPayOnFileData getOnFileData() {
        return this.onFileData;
    }

    @Nullable
    public final CashAppPayOneTimeData getOneTimeData() {
        return this.oneTimeData;
    }

    public int hashCode() {
        CashAppPayOneTimeData cashAppPayOneTimeData = this.oneTimeData;
        int iHashCode = (cashAppPayOneTimeData == null ? 0 : cashAppPayOneTimeData.hashCode()) * 31;
        CashAppPayOnFileData cashAppPayOnFileData = this.onFileData;
        return iHashCode + (cashAppPayOnFileData != null ? cashAppPayOnFileData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CashAppPayAuthorizationData(oneTimeData=" + this.oneTimeData + ", onFileData=" + this.onFileData + ")";
    }
}
