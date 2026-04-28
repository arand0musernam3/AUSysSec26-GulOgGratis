package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFh1oSDK {

    @Nullable
    public final String AFAdRevenueData;

    @NotNull
    public final String getCurrencyIso4217Code;

    @Nullable
    public final Intent getMonetizationNetwork;

    public AFh1oSDK(@NotNull Activity activity, @NotNull AFi1rSDK aFi1rSDK) {
        activity.getClass();
        aFi1rSDK.getClass();
        this.getMonetizationNetwork = activity.getIntent();
        this.getCurrencyIso4217Code = aFi1rSDK.getMediationNetwork(activity);
        this.AFAdRevenueData = aFi1rSDK.getMonetizationNetwork(activity);
    }
}
