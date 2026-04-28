package com.adyen.checkout.cashapppay.internal.ui.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayOneTimeData;", "", "grantId", "", "customerId", "(Ljava/lang/String;Ljava/lang/String;)V", "getCustomerId", "()Ljava/lang/String;", "getGrantId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cashapppay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CashAppPayOneTimeData {

    @Nullable
    private final String customerId;

    @Nullable
    private final String grantId;

    public CashAppPayOneTimeData(@Nullable String str, @Nullable String str2) {
        this.grantId = str;
        this.customerId = str2;
    }

    public static /* synthetic */ CashAppPayOneTimeData copy$default(CashAppPayOneTimeData cashAppPayOneTimeData, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cashAppPayOneTimeData.grantId;
        }
        if ((i11 & 2) != 0) {
            str2 = cashAppPayOneTimeData.customerId;
        }
        return cashAppPayOneTimeData.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGrantId() {
        return this.grantId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @NotNull
    public final CashAppPayOneTimeData copy(@Nullable String grantId, @Nullable String customerId) {
        return new CashAppPayOneTimeData(grantId, customerId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashAppPayOneTimeData)) {
            return false;
        }
        CashAppPayOneTimeData cashAppPayOneTimeData = (CashAppPayOneTimeData) other;
        return Intrinsics.areEqual(this.grantId, cashAppPayOneTimeData.grantId) && Intrinsics.areEqual(this.customerId, cashAppPayOneTimeData.customerId);
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getGrantId() {
        return this.grantId;
    }

    public int hashCode() {
        String str = this.grantId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.customerId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return a.d("CashAppPayOneTimeData(grantId=", this.grantId, ", customerId=", this.customerId, ")");
    }
}
