package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFa1rSDK implements AFe1wSDK<AFa1mSDK> {
    @Override // com.appsflyer.internal.AFe1wSDK
    public final /* synthetic */ AFa1mSDK getCurrencyIso4217Code(String str) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        DeepLink mediationNetwork = null;
        if (str == null || str.length() == 0) {
            return new AFa1mSDK(false, null, 3, null);
        }
        JSONObject jSONObject = new JSONObject(str);
        boolean zOptBoolean = jSONObject.optBoolean("found", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("is_second_ping", true);
        if (zOptBoolean && (jSONObjectOptJSONObject = jSONObject.optJSONObject("click_event")) != null) {
            mediationNetwork = DeepLink.getMediationNetwork(jSONObjectOptJSONObject);
            mediationNetwork.getMediationNetwork.put("is_deferred", true);
        }
        return new AFa1mSDK(zOptBoolean2, mediationNetwork);
    }
}
