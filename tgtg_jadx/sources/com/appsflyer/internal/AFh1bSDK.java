package com.appsflyer.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFh1bSDK {
    public final int AFAdRevenueData;
    public final int getCurrencyIso4217Code;
    public final long getMediationNetwork;
    public final String getMonetizationNetwork;

    public AFh1bSDK(String str, int i11, int i12, long j9) {
        this.getMonetizationNetwork = str;
        this.getCurrencyIso4217Code = i11;
        this.AFAdRevenueData = i12;
        this.getMediationNetwork = j9;
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && AFh1bSDK.class == obj.getClass()) {
            AFh1bSDK aFh1bSDK = (AFh1bSDK) obj;
            if (this.getCurrencyIso4217Code == aFh1bSDK.getCurrencyIso4217Code && this.AFAdRevenueData == aFh1bSDK.AFAdRevenueData && this.getMediationNetwork == aFh1bSDK.getMediationNetwork && (str = this.getMonetizationNetwork) != null && str.equals(aFh1bSDK.getMonetizationNetwork)) {
                return true;
            }
        }
        return false;
    }

    public final String getMonetizationNetwork() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.getMonetizationNetwork);
            jSONObject.put("min", this.getCurrencyIso4217Code);
            jSONObject.put("expire", this.AFAdRevenueData);
            jSONObject.put("ttl", this.getMediationNetwork);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final int hashCode() {
        String str = this.getMonetizationNetwork;
        return ((((((str != null ? str.hashCode() : 0) * 31) + this.getCurrencyIso4217Code) * 31) + this.AFAdRevenueData) * 31) + ((int) this.getMediationNetwork);
    }
}
