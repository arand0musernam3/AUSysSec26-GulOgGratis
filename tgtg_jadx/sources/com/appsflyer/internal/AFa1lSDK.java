package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.collections.o0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFa1lSDK implements AFa1gSDK {

    @NotNull
    private final AFc1jSDK getMediationNetwork;

    public AFa1lSDK(@NotNull AFc1jSDK aFc1jSDK) {
        aFc1jSDK.getClass();
        this.getMediationNetwork = aFc1jSDK;
    }

    @Override // com.appsflyer.internal.AFa1gSDK
    @NotNull
    public final Map<String, Object> getMediationNetwork() {
        if (this.getMediationNetwork.getMonetizationNetwork("deeplink_data")) {
            try {
                String revenue = this.getMediationNetwork.getRevenue("deeplink_data", (String) null);
                if (revenue != null) {
                    return AFj1eSDK.getMonetizationNetwork(new JSONObject(revenue));
                }
                o0 o0Var = o0.f26530a;
                o0Var.getClass();
                return o0Var;
            } catch (Throwable th2) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th2, true, false);
            }
        }
        o0 o0Var2 = o0.f26530a;
        o0Var2.getClass();
        return o0Var2;
    }

    @Override // com.appsflyer.internal.AFa1gSDK
    public final void getMonetizationNetwork(@NotNull Map<String, ? extends Object> map) {
        map.getClass();
        this.getMediationNetwork.getMediationNetwork("deeplink_data", new JSONObject(map).toString());
    }

    @Override // com.appsflyer.internal.AFa1gSDK
    public final void getRevenue() {
        this.getMediationNetwork.getCurrencyIso4217Code("deeplink_data");
    }
}
