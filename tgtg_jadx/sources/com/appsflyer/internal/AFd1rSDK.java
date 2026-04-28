package com.appsflyer.internal;

import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFd1rSDK {
    public static boolean getRevenue(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        int iAFAdRevenueData = AFj1aSDK.AFAdRevenueData(str);
        int iAFAdRevenueData2 = AFj1aSDK.AFAdRevenueData(str2);
        Pair<Integer, Integer> mediationNetwork = AFd1pSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> currencyIso4217Code = AFd1pSDK.getCurrencyIso4217Code(str2);
        return (iAFAdRevenueData2 == -1 || mediationNetwork != null) ? currencyIso4217Code != null ? ((Number) currencyIso4217Code.f26485a).intValue() <= iAFAdRevenueData && iAFAdRevenueData <= ((Number) currencyIso4217Code.f26486b).intValue() : mediationNetwork != null && ((Number) mediationNetwork.f26485a).intValue() <= iAFAdRevenueData && iAFAdRevenueData <= ((Number) mediationNetwork.f26486b).intValue() : iAFAdRevenueData2 == iAFAdRevenueData;
    }
}
