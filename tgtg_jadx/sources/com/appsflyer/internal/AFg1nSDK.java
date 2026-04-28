package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFg1nSDK extends AFe1uSDK<Void> {
    private final AFe1ySDK<String> component2;
    private final AFc1jSDK component3;
    private final Throwable component4;

    public AFg1nSDK(AFf1tSDK aFf1tSDK, AFc1jSDK aFc1jSDK) {
        super(AFe1lSDK.GCDSDK, new AFe1lSDK[]{AFe1lSDK.RC_CDN}, "GCD-CHECK");
        this.component4 = aFf1tSDK.component2();
        this.component2 = ((AFe1bSDK) aFf1tSDK).component4;
        this.component3 = aFc1jSDK;
    }

    private Map<String, Object> component1() {
        String revenue = this.component3.getRevenue("attributionId", (String) null);
        if (revenue == null) {
            return null;
        }
        try {
            new AFd1gSDK();
            return AFd1gSDK.getMediationNetwork(revenue);
        } catch (JSONException e5) {
            StringBuilder sb2 = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb2.append(e5.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e5);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    @NonNull
    public final AFe1rSDK getMediationNetwork() throws Exception {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.component3.getCurrencyIso4217Code("appsFlyerCount", 0))));
        long mediationNetwork = this.component3.getMediationNetwork("appsflyerConversionDataCacheExpiration", 0L);
        if (mediationNetwork != 0 && System.currentTimeMillis() - mediationNetwork > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.component3.getRevenue("sixtyDayConversionData", true);
            this.component3.getMediationNetwork("attributionId", (String) null);
            this.component3.getRevenue("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> mapComponent1 = component1();
        if (mapComponent1 != null) {
            try {
                if (!mapComponent1.containsKey("is_first_launch")) {
                    mapComponent1.put("is_first_launch", Boolean.FALSE);
                }
                AFg1oSDK.getMonetizationNetwork(mapComponent1);
            } catch (Exception e5) {
                StringBuilder sb2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb2.append(e5.getLocalizedMessage());
                AFLogger.afErrorLog(sb2.toString(), e5);
            }
            return AFe1rSDK.SUCCESS;
        }
        try {
        } catch (Exception e11) {
            StringBuilder sb3 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb3.append(e11.getLocalizedMessage());
            AFLogger.afErrorLog(sb3.toString(), e11);
        }
        if (this.component4 != null) {
            StringBuilder sb4 = new StringBuilder("Launch exception: ");
            sb4.append(this.component4.getMessage());
            AFg1oSDK.AFAdRevenueData(sb4.toString());
            return AFe1rSDK.SUCCESS;
        }
        AFe1ySDK<String> aFe1ySDK = this.component2;
        if (aFe1ySDK != null && !aFe1ySDK.isSuccessful()) {
            StringBuilder sb5 = new StringBuilder("Launch status code: ");
            sb5.append(this.component2.getStatusCode());
            AFg1oSDK.AFAdRevenueData(sb5.toString());
            return AFe1rSDK.SUCCESS;
        }
        return AFe1rSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final long getRevenue() {
        return 1000L;
    }
}
