package com.adyen.checkout.cashapppay.internal.ui.model;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayOnFileData;", "", "grantId", "", "cashTag", "customerId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCashTag", "()Ljava/lang/String;", "getCustomerId", "getGrantId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cashapppay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CashAppPayOnFileData {

    @Nullable
    private final String cashTag;

    @Nullable
    private final String customerId;

    @Nullable
    private final String grantId;

    public CashAppPayOnFileData(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.grantId = str;
        this.cashTag = str2;
        this.customerId = str3;
    }

    public static /* synthetic */ CashAppPayOnFileData copy$default(CashAppPayOnFileData cashAppPayOnFileData, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cashAppPayOnFileData.grantId;
        }
        if ((i11 & 2) != 0) {
            str2 = cashAppPayOnFileData.cashTag;
        }
        if ((i11 & 4) != 0) {
            str3 = cashAppPayOnFileData.customerId;
        }
        return cashAppPayOnFileData.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGrantId() {
        return this.grantId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCashTag() {
        return this.cashTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @NotNull
    public final CashAppPayOnFileData copy(@Nullable String grantId, @Nullable String cashTag, @Nullable String customerId) {
        return new CashAppPayOnFileData(grantId, cashTag, customerId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashAppPayOnFileData)) {
            return false;
        }
        CashAppPayOnFileData cashAppPayOnFileData = (CashAppPayOnFileData) other;
        return Intrinsics.areEqual(this.grantId, cashAppPayOnFileData.grantId) && Intrinsics.areEqual(this.cashTag, cashAppPayOnFileData.cashTag) && Intrinsics.areEqual(this.customerId, cashAppPayOnFileData.customerId);
    }

    @Nullable
    public final String getCashTag() {
        return this.cashTag;
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
        String str2 = this.cashTag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.grantId;
        String str2 = this.cashTag;
        return k.p(f.t("CashAppPayOnFileData(grantId=", str, ", cashTag=", str2, ", customerId="), this.customerId, ")");
    }
}
