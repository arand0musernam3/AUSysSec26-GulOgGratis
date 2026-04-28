package com.appsflyer.internal;

import com.appsflyer.internal.AFe1qSDK.AnonymousClass1;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFa1uSDK implements Runnable {

    @Nullable
    private final Map<String, Object> getCurrencyIso4217Code;

    @NotNull
    private final AFd1zSDK getMediationNetwork;

    @NotNull
    private final AFh1sSDK getRevenue;

    public AFa1uSDK(@NotNull AFd1zSDK aFd1zSDK, @NotNull AFh1sSDK aFh1sSDK, @Nullable Map<String, ? extends Object> map) {
        aFd1zSDK.getClass();
        aFh1sSDK.getClass();
        this.getMediationNetwork = aFd1zSDK;
        this.getRevenue = aFh1sSDK;
        this.getCurrencyIso4217Code = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFe1uSDK aFf1xSDK;
        if (this.getRevenue.AFAdRevenueData()) {
            AFf1tSDK aFf1tSDK = new AFf1tSDK(this.getRevenue, this.getMediationNetwork);
            aFf1tSDK.copy = this.getCurrencyIso4217Code;
            aFf1xSDK = aFf1tSDK;
        } else {
            aFf1xSDK = this.getRevenue instanceof AFh1qSDK ? new AFf1xSDK((AFh1qSDK) this.getRevenue, this.getMediationNetwork) : new AFf1rSDK(this.getRevenue, this.getMediationNetwork);
        }
        AFe1qSDK aFe1qSDKEquals = this.getMediationNetwork.equals();
        aFe1qSDKEquals.getMonetizationNetwork.execute(aFe1qSDKEquals.new AnonymousClass1(aFf1xSDK));
    }
}
