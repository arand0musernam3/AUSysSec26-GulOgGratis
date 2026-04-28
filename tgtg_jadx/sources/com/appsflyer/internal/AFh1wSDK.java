package com.appsflyer.internal;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public interface AFh1wSDK {
    boolean AFAdRevenueData();

    void getCurrencyIso4217Code(@NotNull AFf1tSDK aFf1tSDK, @NotNull Function0<Unit> function0);

    void getCurrencyIso4217Code(@NotNull AFh1sSDK aFh1sSDK);

    void getMediationNetwork(@NotNull AFh1sSDK aFh1sSDK);

    boolean getMediationNetwork();

    void getMonetizationNetwork(@NotNull AFh1sSDK aFh1sSDK);

    void getRevenue();

    void u_(@NotNull Intent intent, @NotNull AFa1oSDK aFa1oSDK);
}
