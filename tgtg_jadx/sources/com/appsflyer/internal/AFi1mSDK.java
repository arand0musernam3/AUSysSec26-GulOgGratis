package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFi1mSDK {

    @Nullable
    public final String AFAdRevenueData;
    public final long getCurrencyIso4217Code;

    @Nullable
    public final String getMediationNetwork;
    public final long getMonetizationNetwork;

    public AFi1mSDK(long j9, long j11, @Nullable String str, @Nullable String str2) {
        this.getMonetizationNetwork = j9;
        this.getCurrencyIso4217Code = j11;
        this.AFAdRevenueData = str;
        this.getMediationNetwork = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1mSDK)) {
            return false;
        }
        AFi1mSDK aFi1mSDK = (AFi1mSDK) obj;
        return this.getMonetizationNetwork == aFi1mSDK.getMonetizationNetwork && this.getCurrencyIso4217Code == aFi1mSDK.getCurrencyIso4217Code && Intrinsics.areEqual(this.AFAdRevenueData, aFi1mSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getMediationNetwork, aFi1mSDK.getMediationNetwork);
    }

    public final int hashCode() {
        int iB = e0.f.b(Long.hashCode(this.getMonetizationNetwork) * 31, 31, this.getCurrencyIso4217Code);
        String str = this.AFAdRevenueData;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.getMediationNetwork;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        long j9 = this.getMonetizationNetwork;
        long j11 = this.getCurrencyIso4217Code;
        String str = this.AFAdRevenueData;
        String str2 = this.getMediationNetwork;
        StringBuilder sbG = l1.g("PlayIntegrityApiData(piaTimestamp=", j9, ", ttrMillis=");
        sbG.append(j11);
        sbG.append(", piaToken=");
        sbG.append(str);
        return e0.f.n(sbG, ", errorCode=", str2, ")");
    }
}
