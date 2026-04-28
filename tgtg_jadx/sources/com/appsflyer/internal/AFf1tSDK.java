package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFj1zSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFf1tSDK extends AFf1rSDK {

    @NonNull
    private final AFa1gSDK AFInAppEventParameterName;

    @NonNull
    private final AFf1mSDK AFKeystoreWrapper;
    private final AFh1wSDK AFLogger;
    public Map<String, Object> copy;

    @NonNull
    private final AFh1uSDK copydefault;

    @NonNull
    private final AFj1rSDK hashCode;

    @NonNull
    private final AppsFlyerProperties registerClient;

    @NonNull
    private final AFc1jSDK toString;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1tSDK$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AFj1zSDK.AFa1ySDK.values().length];
            getRevenue = iArr;
            try {
                iArr[AFj1zSDK.AFa1ySDK.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getRevenue[AFj1zSDK.AFa1ySDK.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public AFf1tSDK(@NonNull AFh1sSDK aFh1sSDK, @NonNull AFd1zSDK aFd1zSDK) {
        super(aFh1sSDK, aFd1zSDK);
        this.hashCode = aFd1zSDK.copydefault();
        this.toString = aFd1zSDK.getMediationNetwork();
        this.copydefault = aFd1zSDK.component2();
        this.AFKeystoreWrapper = aFd1zSDK.component3();
        this.registerClient = AppsFlyerProperties.getInstance();
        this.AFInAppEventParameterName = aFd1zSDK.afErrorLog();
        this.AFLogger = aFd1zSDK.afErrorLogForExcManagerOnly();
        this.getMediationNetwork.add(AFe1lSDK.RESOLVE_ESP);
        this.getMediationNetwork.add(AFe1lSDK.DLSDK);
    }

    private boolean equals() {
        ResponseNetwork responseNetwork = ((AFe1bSDK) this).component4;
        boolean z11 = this.AFAdRevenueData == AFe1rSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
        AFe1lSDK aFe1lSDK = this.getMonetizationNetwork;
        return z11 && (aFe1lSDK == AFe1lSDK.CONVERSION || aFe1lSDK == AFe1lSDK.ATTR);
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void AFAdRevenueData(AFh1sSDK aFh1sSDK) {
        AFh1wSDK aFh1wSDK;
        AFh1wSDK aFh1wSDK2;
        super.AFAdRevenueData(aFh1sSDK);
        int i11 = aFh1sSDK.component1;
        AFh1uSDK aFh1uSDK = this.copydefault;
        if (aFh1uSDK.getCurrencyIso4217Code()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            aFh1uSDK.hashCode = jCurrentTimeMillis;
            long j9 = aFh1uSDK.component1;
            if (j9 != 0) {
                aFh1uSDK.getCurrencyIso4217Code.put("from_fg", Long.valueOf(jCurrentTimeMillis - j9));
                aFh1uSDK.AFAdRevenueData.getMediationNetwork("first_launch", new JSONObject(aFh1uSDK.getCurrencyIso4217Code).toString());
            } else {
                AFLogger.afInfoLog("Metrics: fg ts is missing");
            }
        }
        Map map = (Map) aFh1sSDK.AFAdRevenueData.get("meta");
        if (map == null) {
            map = new HashMap();
            aFh1sSDK.AFAdRevenueData.put("meta", map);
        }
        if (!aFh1sSDK.AFAdRevenueData.containsKey("af_deeplink")) {
            aFh1sSDK.getCurrencyIso4217Code(this.AFInAppEventParameterName.getMediationNetwork());
        }
        AFi1vSDK aFi1vSDKAFAdRevenueData = this.AFKeystoreWrapper.AFAdRevenueData();
        if (aFi1vSDKAFAdRevenueData != null) {
            HashMap map2 = new HashMap();
            map2.put("cdn_token", aFi1vSDKAFAdRevenueData.getMonetizationNetwork);
            String str = aFi1vSDKAFAdRevenueData.AFAdRevenueData;
            if (str != null) {
                map2.put("c_ver", str);
            }
            long j11 = aFi1vSDKAFAdRevenueData.getCurrencyIso4217Code;
            if (j11 > 0) {
                map2.put("latency", Long.valueOf(j11));
            }
            long j12 = aFi1vSDKAFAdRevenueData.getMediationNetwork;
            if (j12 > 0) {
                map2.put("delay", Long.valueOf(j12));
            }
            int i12 = aFi1vSDKAFAdRevenueData.getRevenue;
            if (i12 > 0) {
                map2.put("res_code", Integer.valueOf(i12));
            }
            if (aFi1vSDKAFAdRevenueData.component3 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aFi1vSDKAFAdRevenueData.component3.getClass().getSimpleName());
                sb2.append(": ");
                sb2.append(aFi1vSDKAFAdRevenueData.component3.getMessage());
                map2.put(StatusResponseUtils.RESULT_ERROR, sb2.toString());
            }
            AFi1ySDK aFi1ySDK = aFi1vSDKAFAdRevenueData.component1;
            if (aFi1ySDK != null) {
                map2.put("sig", aFi1ySDK.toString());
            }
            String str2 = aFi1vSDKAFAdRevenueData.component4;
            if (str2 != null) {
                map2.put("cdn_cache_status", str2);
            }
            map.put("rc", map2);
        }
        this.equals.getMediationNetwork(aFh1sSDK.AFAdRevenueData);
        if (i11 == 1) {
            if (this.registerClient.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFh1sSDK.AFAdRevenueData.put("wait_cid", Boolean.toString(true));
            }
            AFh1uSDK aFh1uSDK2 = this.copydefault;
            HashMap map3 = new HashMap(aFh1uSDK2.getMonetizationNetwork);
            aFh1uSDK2.getMonetizationNetwork.clear();
            if (!map3.isEmpty()) {
                map.put("ddl", map3);
            }
            HashMap map4 = new HashMap(this.copydefault.getCurrencyIso4217Code);
            if (!map4.isEmpty()) {
                map.put("first_launch", map4);
            }
            AFh1wSDK aFh1wSDK3 = this.AFLogger;
            if (aFh1wSDK3 != null) {
                aFh1wSDK3.getMonetizationNetwork(aFh1sSDK);
            }
        } else if (i11 == 2) {
            AFh1uSDK aFh1uSDK3 = this.copydefault;
            aFh1uSDK3.AFAdRevenueData.getCurrencyIso4217Code("first_launch");
            HashMap map5 = new HashMap(aFh1uSDK3.getCurrencyIso4217Code);
            if (!map5.isEmpty()) {
                map.put("first_launch", map5);
            }
            if ((aFh1sSDK instanceof AFh1pSDK) && (aFh1wSDK2 = this.AFLogger) != null && !aFh1wSDK2.AFAdRevenueData()) {
                this.AFLogger.getCurrencyIso4217Code(aFh1sSDK);
            }
        }
        if (map.isEmpty()) {
            aFh1sSDK.AFAdRevenueData.remove("meta");
        }
        if (i11 <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFj1zSDK aFj1zSDK : (AFj1zSDK[]) this.hashCode.AFAdRevenueData.toArray(new AFj1zSDK[0])) {
                boolean z11 = aFj1zSDK instanceof AFi1aSDK;
                int i13 = AnonymousClass2.getRevenue[aFj1zSDK.component2.ordinal()];
                if (i13 == 1) {
                    if (z11) {
                        aFh1sSDK.getMonetizationNetwork("rfr", ((AFi1aSDK) aFj1zSDK).getMediationNetwork);
                        this.toString.getRevenue(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFj1zSDK.getCurrencyIso4217Code);
                } else if (i13 == 2 && i11 == 2 && !z11) {
                    HashMap map6 = new HashMap();
                    map6.put("source", aFj1zSDK.AFAdRevenueData);
                    map6.put("response", "TIMEOUT");
                    map6.put("type", aFj1zSDK.component4);
                    arrayList.add(map6);
                }
            }
            if (!arrayList.isEmpty()) {
                aFh1sSDK.getMonetizationNetwork("referrers", arrayList);
            }
            Object obj = this.copy;
            if (obj != null) {
                aFh1sSDK.getMonetizationNetwork("fb_ddl", obj);
            }
        }
        if (aFh1sSDK.getRevenue() == AFe1lSDK.LAUNCH && (aFh1wSDK = this.AFLogger) != null && aFh1wSDK.getMediationNetwork()) {
            this.AFLogger.getMediationNetwork(aFh1sSDK);
        }
        this.equals.AFAdRevenueData(aFh1sSDK);
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final void getMonetizationNetwork() {
        super.getMonetizationNetwork();
        AFh1uSDK aFh1uSDK = this.copydefault;
        if (aFh1uSDK.getCurrencyIso4217Code()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j9 = aFh1uSDK.hashCode;
            if (j9 == 0) {
                AFLogger.afInfoLog("Metrics: launch start ts is missing");
                return;
            }
            aFh1uSDK.getCurrencyIso4217Code.put("net", Long.valueOf(jCurrentTimeMillis - j9));
            aFh1uSDK.AFAdRevenueData.getMediationNetwork("first_launch", new JSONObject(aFh1uSDK.getCurrencyIso4217Code).toString());
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return super.AFAdRevenueData() || equals();
    }
}
