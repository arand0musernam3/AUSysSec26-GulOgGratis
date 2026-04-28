package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public interface AFg1vSDK {
    void AFAdRevenueData(@NotNull AFh1sSDK aFh1sSDK);

    void AFAdRevenueData(@NotNull Map<String, Object> map);

    long getCurrencyIso4217Code();

    void getCurrencyIso4217Code(@NotNull AFh1sSDK aFh1sSDK);

    void getCurrencyIso4217Code(@NotNull Map<String, Object> map);

    void getMediationNetwork(@NotNull AFh1sSDK aFh1sSDK);

    void getMediationNetwork(@NotNull Map<String, Object> map);

    void getMonetizationNetwork(@NotNull AFh1sSDK aFh1sSDK);

    void getMonetizationNetwork(@NotNull Map<String, Object> map, int i11, int i12);

    void getRevenue(@NotNull AFh1sSDK aFh1sSDK);

    void getRevenue(@NotNull Map<String, Object> map);

    void getRevenue(@NotNull Map<String, Object> map, @NotNull AFe1lSDK aFe1lSDK);
}
