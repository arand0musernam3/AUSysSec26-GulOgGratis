package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public interface AFd1zSDK {
    @NonNull
    AFc1kSDK AFAdRevenueData();

    @NonNull
    AFf1kSDK AFInAppEventParameterName();

    @NonNull
    AFe1vSDK AFInAppEventType();

    @NonNull
    AFc1vSDK AFKeystoreWrapper();

    @NonNull
    AFi1lSDK AFLogger();

    @NonNull
    AFh1ySDK afDebugLog();

    @NonNull
    AFa1gSDK afErrorLog();

    AFh1wSDK afErrorLogForExcManagerOnly();

    @NonNull
    AFb1bSDK afInfoLog();

    @NonNull
    AFd1xSDK afLogForce();

    @NonNull
    AFb1hSDK afVerboseLog();

    @NonNull
    AFg1vSDK areAllFieldsValid();

    @NonNull
    PurchaseHandler component1();

    @NonNull
    AFh1uSDK component2();

    @NonNull
    AFf1mSDK component3();

    @NonNull
    AFj1oSDK component4();

    @NonNull
    AFd1lSDK copy();

    @NonNull
    AFj1rSDK copydefault();

    @NonNull
    AFi1xSDK d();

    @NonNull
    AFc1gSDK e();

    @NonNull
    AFe1qSDK equals();

    @NonNull
    AFf1gSDK force();

    @NonNull
    ExecutorService getCurrencyIso4217Code();

    @NonNull
    AFc1jSDK getMediationNetwork();

    @NonNull
    ScheduledExecutorService getMonetizationNetwork();

    @NonNull
    AFd1mSDK getRevenue();

    @NonNull
    AFa1oSDK i();

    @NonNull
    AFc1fSDK registerClient();

    @NonNull
    AFa1aSDK unregisterClient();

    AFi1nSDK v();

    @NonNull
    AFi1rSDK w();
}
