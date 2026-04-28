package com.adyen.checkout.card.scanning;

import b3.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/adyen/checkout/card/scanning/AdyenCardScannerResult;", "", "pan", "", "expiryMonth", "", "expiryYear", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getExpiryMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpiryYear", "getPan", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/adyen/checkout/card/scanning/AdyenCardScannerResult;", "equals", "", "other", "hashCode", "toString", "card-scanning_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AdyenCardScannerResult {

    @Nullable
    private final Integer expiryMonth;

    @Nullable
    private final Integer expiryYear;

    @Nullable
    private final String pan;

    public AdyenCardScannerResult(@Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
        this.pan = str;
        this.expiryMonth = num;
        this.expiryYear = num2;
    }

    public static /* synthetic */ AdyenCardScannerResult copy$default(AdyenCardScannerResult adyenCardScannerResult, String str, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = adyenCardScannerResult.pan;
        }
        if ((i11 & 2) != 0) {
            num = adyenCardScannerResult.expiryMonth;
        }
        if ((i11 & 4) != 0) {
            num2 = adyenCardScannerResult.expiryYear;
        }
        return adyenCardScannerResult.copy(str, num, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPan() {
        return this.pan;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getExpiryMonth() {
        return this.expiryMonth;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getExpiryYear() {
        return this.expiryYear;
    }

    @NotNull
    public final AdyenCardScannerResult copy(@Nullable String pan, @Nullable Integer expiryMonth, @Nullable Integer expiryYear) {
        return new AdyenCardScannerResult(pan, expiryMonth, expiryYear);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdyenCardScannerResult)) {
            return false;
        }
        AdyenCardScannerResult adyenCardScannerResult = (AdyenCardScannerResult) other;
        return Intrinsics.areEqual(this.pan, adyenCardScannerResult.pan) && Intrinsics.areEqual(this.expiryMonth, adyenCardScannerResult.expiryMonth) && Intrinsics.areEqual(this.expiryYear, adyenCardScannerResult.expiryYear);
    }

    @Nullable
    public final Integer getExpiryMonth() {
        return this.expiryMonth;
    }

    @Nullable
    public final Integer getExpiryYear() {
        return this.expiryYear;
    }

    @Nullable
    public final String getPan() {
        return this.pan;
    }

    public int hashCode() {
        String str = this.pan;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.expiryMonth;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.expiryYear;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.pan;
        Integer num = this.expiryMonth;
        Integer num2 = this.expiryYear;
        StringBuilder sb2 = new StringBuilder("AdyenCardScannerResult(pan=");
        sb2.append(str);
        sb2.append(", expiryMonth=");
        sb2.append(num);
        sb2.append(", expiryYear=");
        return i.m(sb2, num2, ")");
    }
}
