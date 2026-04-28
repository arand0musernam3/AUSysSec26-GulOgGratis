package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFe1qSDK.AnonymousClass1;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFa1ySDK implements Runnable {
    final String AFAdRevenueData;
    private final String component1;
    private final String component2;
    private final Map<String, String> component4;
    final String getCurrencyIso4217Code;
    final String getMediationNetwork;
    private final WeakReference<Context> getMonetizationNetwork;
    private final String getRevenue;

    public AFa1ySDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.getMonetizationNetwork = new WeakReference<>(context);
        this.getRevenue = str;
        this.component2 = str2;
        this.AFAdRevenueData = str4;
        this.getCurrencyIso4217Code = str5;
        this.getMediationNetwork = str6;
        this.component4 = map;
        this.component1 = str3;
    }

    private static AFf1rSDK getCurrencyIso4217Code(Context context, @NonNull AFh1iSDK aFh1iSDK) {
        AFa1tSDK.getMediationNetwork().getMonetizationNetwork(context);
        AFd1zSDK revenue = AFa1tSDK.getMediationNetwork().getRevenue();
        aFh1iSDK.getMonetizationNetwork(revenue.AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0));
        AFf1rSDK aFf1rSDK = new AFf1rSDK(aFh1iSDK, revenue);
        AFe1qSDK aFe1qSDKEquals = revenue.equals();
        aFe1qSDKEquals.getMonetizationNetwork.execute(aFe1qSDKEquals.new AnonymousClass1(aFf1rSDK));
        return aFf1rSDK;
    }

    public static void getMediationNetwork(boolean z11, String str, String str2, String str3, String str4) {
        if (AFa1tSDK.getMediationNetwork != null) {
            StringBuilder sbT = e0.f.t("Validate callback parameters: ", str, " ", str2, " ");
            sbT.append(str3);
            AFLogger.afDebugLog(sbT.toString());
            if (z11) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFa1tSDK.getMediationNetwork.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFa1tSDK.getMediationNetwork;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.getRevenue;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.getMonetizationNetwork.get();
            if (context == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("public-key", this.component2);
            map.put("sig-data", this.AFAdRevenueData);
            map.put("signature", this.component1);
            Object map2 = new HashMap(map);
            Object obj = this.component4;
            String revenue = AFa1tSDK.getMediationNetwork().getRevenue().getMediationNetwork().getRevenue("referrer", "");
            AFh1hSDK aFh1hSDK = new AFh1hSDK();
            aFh1hSDK.component2 = revenue;
            AFa1tSDK mediationNetwork = AFa1tSDK.getMediationNetwork();
            Map<String, Object> mapAFAdRevenueData = mediationNetwork.AFAdRevenueData(aFh1hSDK);
            mapAFAdRevenueData.put("price", this.getCurrencyIso4217Code);
            mapAFAdRevenueData.put("currency", this.getMediationNetwork);
            mapAFAdRevenueData.put("receipt_data", map2);
            if (obj != null) {
                mapAFAdRevenueData.put("extra_prms", obj);
            }
            mapAFAdRevenueData.putAll(mediationNetwork.getRevenue().AFInAppEventParameterName().getCurrencyIso4217Code());
            aFh1hSDK.getCurrencyIso4217Code(mapAFAdRevenueData);
            getCurrencyIso4217Code(context, aFh1hSDK);
            map.put("dev_key", this.getRevenue);
            map.put("app_id", context.getPackageName());
            map.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            AFh1rSDK aFh1rSDK = AFa1tSDK.getMediationNetwork().getRevenue().AFAdRevenueData().getMediationNetwork.component2;
            AFb1mSDK aFb1mSDK = aFh1rSDK != null ? new AFb1mSDK(aFh1rSDK.AFAdRevenueData, aFh1rSDK.component4) : null;
            String str2 = aFb1mSDK != null ? aFb1mSDK.getRevenue : null;
            if (str2 != null) {
                map.put("advertiserId", str2);
            }
            AFh1fSDK aFh1fSDK = (AFh1fSDK) new AFh1fSDK().getCurrencyIso4217Code(map);
            final AFf1rSDK currencyIso4217Code = getCurrencyIso4217Code(context, aFh1fSDK);
            aFh1fSDK.getCurrencyIso4217Code = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1ySDK.5
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i11, @NonNull String str3) {
                    ResponseNetwork responseNetwork;
                    if (i11 == 50 && (responseNetwork = ((AFe1bSDK) currencyIso4217Code).component4) != null) {
                        str3 = responseNetwork.toString();
                    }
                    AFa1ySDK aFa1ySDK = AFa1ySDK.this;
                    AFa1ySDK.getMediationNetwork(false, aFa1ySDK.AFAdRevenueData, aFa1ySDK.getCurrencyIso4217Code, aFa1ySDK.getMediationNetwork, str3);
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFe1bSDK) currencyIso4217Code).component4.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        boolean zOptBoolean = jSONObject.optBoolean("result");
                        AFa1ySDK aFa1ySDK = AFa1ySDK.this;
                        AFa1ySDK.getMediationNetwork(zOptBoolean, aFa1ySDK.AFAdRevenueData, aFa1ySDK.getCurrencyIso4217Code, aFa1ySDK.getMediationNetwork, jSONObject.toString());
                    } catch (Exception e5) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e5)), e5);
                        AFa1ySDK aFa1ySDK2 = AFa1ySDK.this;
                        AFa1ySDK.getMediationNetwork(false, aFa1ySDK2.AFAdRevenueData, aFa1ySDK2.getCurrencyIso4217Code, aFa1ySDK2.getMediationNetwork, e5.getMessage());
                    }
                }
            };
        } catch (Throwable th2) {
            if (AFa1tSDK.getMediationNetwork != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th2);
                getMediationNetwork(false, this.AFAdRevenueData, this.getCurrencyIso4217Code, this.getMediationNetwork, th2.getMessage());
            }
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
    }
}
