package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public interface AFd1lSDK {
    void AFAdRevenueData();

    boolean component3();

    void getCurrencyIso4217Code();

    void getCurrencyIso4217Code(@NotNull Throwable th2);

    void getMediationNetwork();

    void getMediationNetwork(@NotNull String str, @NotNull String str2);

    void getMediationNetwork(@NotNull String str, @NotNull String... strArr);

    void getMonetizationNetwork();

    void getMonetizationNetwork(@Nullable String str, @NotNull String str2);

    void getRevenue(@NotNull String str, int i11, @NotNull String str2);

    boolean getRevenue();

    void q_(@Nullable String str, @Nullable PackageManager packageManager);
}
