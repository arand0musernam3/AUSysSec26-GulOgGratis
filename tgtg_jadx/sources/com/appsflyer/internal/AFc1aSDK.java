package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public interface AFc1aSDK {
    @NotNull
    List<AFc1bSDK> AFAdRevenueData();

    void AFAdRevenueData(int i11, int i12);

    @Nullable
    String getCurrencyIso4217Code(@NotNull Throwable th2, @NotNull String str);

    boolean getMediationNetwork();

    int getRevenue();

    boolean getRevenue(@NotNull String... strArr);
}
