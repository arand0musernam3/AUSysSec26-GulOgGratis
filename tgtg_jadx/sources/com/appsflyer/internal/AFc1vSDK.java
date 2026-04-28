package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public interface AFc1vSDK {
    @NotNull
    List<AFc1rSDK> AFAdRevenueData();

    void getCurrencyIso4217Code();

    void getMonetizationNetwork();

    boolean getMonetizationNetwork(@Nullable String str);

    @Nullable
    String getRevenue(@NotNull AFc1rSDK aFc1rSDK);
}
