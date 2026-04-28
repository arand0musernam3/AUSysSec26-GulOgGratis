package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFd1oSDK {
    final ExecutorService getMonetizationNetwork;
    final AFd1jSDK getRevenue;

    public AFd1oSDK(AFd1jSDK aFd1jSDK, ExecutorService executorService) {
        this.getRevenue = aFd1jSDK;
        this.getMonetizationNetwork = executorService;
    }
}
