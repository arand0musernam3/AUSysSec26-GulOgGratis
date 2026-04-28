package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFb1qSDK {
    public final Map<String, Object> getMonetizationNetwork = new HashMap();
    public Map<String, Object> getMediationNetwork = new HashMap();

    public final void AFAdRevenueData(Map<String, Object> map) {
        if (!this.getMonetizationNetwork.isEmpty()) {
            map.put("partner_data", this.getMonetizationNetwork);
        }
        if (this.getMediationNetwork.isEmpty()) {
            return;
        }
        AFa1tSDK.getMonetizationNetwork(map).put("partner_data", this.getMediationNetwork);
        this.getMediationNetwork = new HashMap();
    }
}
