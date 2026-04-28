package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFi1wSDK {

    @NotNull
    public final String AFAdRevenueData;

    @Nullable
    public final String getCurrencyIso4217Code;
    private final boolean getMediationNetwork;

    @Nullable
    public final String getMonetizationNetwork;

    public AFi1wSDK(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z11) {
        str.getClass();
        this.AFAdRevenueData = str;
        this.getMonetizationNetwork = str2;
        this.getCurrencyIso4217Code = str3;
        this.getMediationNetwork = z11;
    }

    public final boolean getRevenue() {
        return this.getMediationNetwork;
    }
}
