package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AFi1hSDK extends AFj1zSDK {
    private AFc1kSDK getMediationNetwork;

    public AFi1hSDK(String str, String str2, AFc1kSDK aFc1kSDK, Runnable runnable) {
        super(str, str2, runnable);
        this.getMediationNetwork = aFc1kSDK;
    }

    public final boolean getMonetizationNetwork() {
        if (this.getMediationNetwork.getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0) <= 0) {
            return true;
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Install referrer will not load, the counter >= 1, ");
        return false;
    }
}
