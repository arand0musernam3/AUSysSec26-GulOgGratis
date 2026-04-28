package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFh1cSDK {

    @NonNull
    public final String AFAdRevenueData;

    @NonNull
    public final AFh1gSDK getCurrencyIso4217Code;
    public final AFh1aSDK getMediationNetwork;
    private final boolean getMonetizationNetwork;

    @NonNull
    public final String getRevenue;

    public AFh1cSDK(@NonNull String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.AFAdRevenueData = string;
            this.getMonetizationNetwork = jSONObject.optBoolean("test_mode");
            this.getRevenue = str;
            this.getCurrencyIso4217Code = string.startsWith("default") ? AFh1gSDK.DEFAULT : AFh1gSDK.CUSTOM;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("features");
            this.getMediationNetwork = jSONObjectOptJSONObject != null ? new AFh1aSDK(jSONObjectOptJSONObject) : null;
        } catch (JSONException e5) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e5);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFh1cSDK.class != obj.getClass()) {
            return false;
        }
        AFh1cSDK aFh1cSDK = (AFh1cSDK) obj;
        if (this.getMonetizationNetwork == aFh1cSDK.getMonetizationNetwork && this.AFAdRevenueData.equals(aFh1cSDK.AFAdRevenueData)) {
            return this.getRevenue.equals(aFh1cSDK.getRevenue);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.getRevenue.hashCode() + ((this.AFAdRevenueData.hashCode() + ((this.getMonetizationNetwork ? 1 : 0) * 31)) * 31);
        AFh1aSDK aFh1aSDK = this.getMediationNetwork;
        if (aFh1aSDK == null) {
            return iHashCode;
        }
        return aFh1aSDK.hashCode() + (iHashCode * 31);
    }
}
