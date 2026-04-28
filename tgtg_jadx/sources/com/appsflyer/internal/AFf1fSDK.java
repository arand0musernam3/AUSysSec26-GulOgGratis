package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFf1fSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;
    final int getMediationNetwork;
    final int getMonetizationNetwork;

    @NotNull
    final String getRevenue;

    public AFf1fSDK(int i11, int i12, int i13, int i14, @NotNull String str) {
        str.getClass();
        this.getCurrencyIso4217Code = i11;
        this.getMediationNetwork = i12;
        this.getMonetizationNetwork = i13;
        this.AFAdRevenueData = i14;
        this.getRevenue = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1fSDK)) {
            return false;
        }
        AFf1fSDK aFf1fSDK = (AFf1fSDK) obj;
        return this.getCurrencyIso4217Code == aFf1fSDK.getCurrencyIso4217Code && this.getMediationNetwork == aFf1fSDK.getMediationNetwork && this.getMonetizationNetwork == aFf1fSDK.getMonetizationNetwork && this.AFAdRevenueData == aFf1fSDK.AFAdRevenueData && Intrinsics.areEqual(this.getRevenue, aFf1fSDK.getRevenue);
    }

    public final int hashCode() {
        return this.getRevenue.hashCode() + r8.k.b(this.AFAdRevenueData, r8.k.b(this.getMonetizationNetwork, r8.k.b(this.getMediationNetwork, Integer.hashCode(this.getCurrencyIso4217Code) * 31, 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        int i11 = this.getCurrencyIso4217Code;
        int i12 = this.getMediationNetwork;
        int i13 = this.getMonetizationNetwork;
        int i14 = this.AFAdRevenueData;
        String str = this.getRevenue;
        StringBuilder sbR = r8.k.r(i11, i12, "CmpTcfData(policyVersion=", ", gdprApplies=", ", cmpSdkId=");
        e0.f.C(sbR, i13, ", cmpSdkVersion=", i14, ", tcString=");
        return r8.k.p(sbR, str, ")");
    }
}
