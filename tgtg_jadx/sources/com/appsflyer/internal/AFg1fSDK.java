package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFg1fSDK {
    public static void AFAdRevenueData(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    jSONObject.put("appsflyerKey", getCurrencyIso4217Code(jSONObject.getString("appsflyerKey")));
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", getMediationNetwork("tcstring"));
                }
                if (jSONObject.has("referrer")) {
                    jSONObject.put("referrer", getMediationNetwork("referrer"));
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(jSONObject);
                aFLogger.i(aFg1cSDK, sb2.toString());
            } catch (JSONException e5) {
                AFLogger.INSTANCE.e(AFg1cSDK.OTHER, "Not able to log the payload", e5);
            }
        }
    }

    private static String getCurrencyIso4217Code(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (i11 == 0 || i11 == str.length() - 1) {
                sb2.append(str.charAt(i11));
            } else {
                sb2.append("*");
            }
        }
        return sb2.toString();
    }

    public static String getMediationNetwork(String str) {
        return str.length() > 20 ? str.substring(0, 10).concat("...") : str;
    }
}
