package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public interface AFd1xSDK {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public interface AFa1tSDK {
        void onConfigurationChanged(boolean z11);
    }

    void getCurrencyIso4217Code();

    void getMediationNetwork(@NonNull Throwable th2, @NonNull String str);

    void getMonetizationNetwork(AFa1tSDK aFa1tSDK);

    void getRevenue();
}
