package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFi1vSDK {
    public final String AFAdRevenueData;
    public final AFi1ySDK component1;
    public final Throwable component3;
    public final String component4;
    public final long getCurrencyIso4217Code;
    public final long getMediationNetwork;

    @NonNull
    public final String getMonetizationNetwork;
    public final int getRevenue;

    public AFi1vSDK(String str, @NonNull String str2, long j9, long j11, int i11, AFi1ySDK aFi1ySDK, String str3, Throwable th2) {
        this.AFAdRevenueData = str;
        this.getMonetizationNetwork = str2;
        this.getCurrencyIso4217Code = j9;
        this.getMediationNetwork = j11;
        this.getRevenue = i11;
        this.component1 = aFi1ySDK;
        this.component4 = str3;
        this.component3 = th2;
    }
}
