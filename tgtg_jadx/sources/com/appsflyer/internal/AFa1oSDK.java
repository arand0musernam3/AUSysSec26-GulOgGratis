package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1qSDK.AnonymousClass1;
import com.appsflyer.internal.AFf1zSDK;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFa1oSDK {
    public Intent AFAdRevenueData;
    public String[] component2;
    public long component3;
    public final AFd1zSDK component4;
    public Map<String, String> getCurrencyIso4217Code;
    public String getMonetizationNetwork;
    public DeepLinkListener getRevenue;

    @NonNull
    public List<List<String>> getMediationNetwork = new ArrayList();

    @NonNull
    public final List<String> areAllFieldsValid = new ArrayList();

    public AFa1oSDK(@NonNull AFd1zSDK aFd1zSDK) {
        this.component4 = aFd1zSDK;
    }

    private static void getRevenue(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1tSDK.getMediationNetwork().getCurrencyIso4217Code;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[LOOP:0: B:21:0x0047->B:66:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean h_(android.content.Intent r10, com.appsflyer.internal.AFa1jSDK r11) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1oSDK.h_(android.content.Intent, com.appsflyer.internal.AFa1jSDK):boolean");
    }

    private Uri i_(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri uri = Uri.parse(obj.toString());
                if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
                    return null;
                }
                return uri;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e5) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e5);
                return null;
            }
        }
        return null;
    }

    public final void AFAdRevenueData(Map<String, String> map) {
        if (this.getRevenue != null) {
            try {
                try {
                    DeepLink mediationNetwork = DeepLink.getMediationNetwork(map);
                    mediationNetwork.getMediationNetwork.put("is_deferred", false);
                    getCurrencyIso4217Code(new DeepLinkResult(mediationNetwork, null));
                    return;
                } catch (JSONException e5) {
                    AFLogger.INSTANCE.e(AFg1cSDK.DDL, "Error occurred", e5, true);
                    getCurrencyIso4217Code(new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED));
                    return;
                }
            } catch (Throwable th2) {
                getCurrencyIso4217Code(new DeepLinkResult(null, null));
                throw th2;
            }
        }
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1tSDK.getMediationNetwork().getCurrencyIso4217Code;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb2 = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb2.append(map.toString());
                AFLogger.afDebugLog(sb2.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th3) {
                AFLogger.afErrorLog(th3.getLocalizedMessage(), th3);
            }
        }
    }

    public final void f_(AFa1jSDK aFa1jSDK, Intent intent, Context context) {
        AFc1cSDK aFc1cSDK = (AFc1cSDK) this.component4;
        if (context != null) {
            aFc1cSDK.AFAdRevenueData.getCurrencyIso4217Code = context.getApplicationContext();
        }
        if (!h_(intent, aFa1jSDK) && this.getRevenue != null && this.component4.AFAdRevenueData().getCurrencyIso4217Code.getCurrencyIso4217Code("appsFlyerCount", 0) == 0 && !this.component4.getMediationNetwork().getRevenue("ddl_sent")) {
            AFa1pSDK aFa1pSDK = new AFa1pSDK();
            AFe1qSDK aFe1qSDKEquals = this.component4.equals();
            aFe1qSDKEquals.getMonetizationNetwork.execute(aFe1qSDKEquals.new AnonymousClass1(new AFf1wSDK(aFa1pSDK, this.component4)));
        }
        this.component4.getMediationNetwork().getRevenue("ddl_sent", true);
    }

    public final void g_(AFa1jSDK aFa1jSDK, Uri uri) {
        AFf1ySDK aFf1ySDK = new AFf1ySDK(this, aFa1jSDK, uri, this.areAllFieldsValid);
        AFe1qSDK aFe1qSDKEquals = this.component4.equals();
        aFe1qSDKEquals.getMonetizationNetwork.execute(aFe1qSDKEquals.new AnonymousClass1(aFf1ySDK));
        this.AFAdRevenueData = null;
    }

    public final void getCurrencyIso4217Code(DeepLinkResult deepLinkResult) {
        if (this.getRevenue == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.DDL, "skipping, no callback registered");
            return;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
        StringBuilder sb2 = new StringBuilder("Calling onDeepLinking with:\n");
        sb2.append(deepLinkResult.toString());
        aFLogger.d(aFg1cSDK, sb2.toString());
        try {
            this.getRevenue.onDeepLinking(deepLinkResult);
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
        }
    }

    public final void j_(AFa1jSDK aFa1jSDK, Uri uri, Uri uri2) {
        if (!aFa1jSDK.getCurrencyIso4217Code("af_deeplink")) {
            String string = uri.toString();
            if (string == null) {
                string = null;
            } else if (string.matches("fb\\d*?://authorize.*") && string.contains("access_token")) {
                int iIndexOf = string.indexOf(63);
                String strSubstring = iIndexOf == -1 ? "" : string.substring(iIndexOf);
                if (strSubstring.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    if (strSubstring.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(strSubstring.split("&")));
                    } else {
                        arrayList.add(strSubstring);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (str.contains("access_token")) {
                            it.remove();
                        } else {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            } else if (!str.startsWith("?")) {
                                sb2.append("?");
                            }
                            sb2.append(str);
                        }
                    }
                    string = string.replace(strSubstring, sb2.toString());
                }
            }
            String str2 = this.getMonetizationNetwork;
            if (str2 != null && this.getCurrencyIso4217Code != null && string.contains(str2)) {
                Uri.Builder builderBuildUpon = Uri.parse(string).buildUpon();
                Uri.Builder builderBuildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.getCurrencyIso4217Code.entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    builderBuildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                string = builderBuildUpon.build().toString();
                aFa1jSDK.getRevenue.put("appended_query_params", builderBuildUpon2.build().getEncodedQuery());
                AFa1gSDK aFa1gSDK = aFa1jSDK.AFAdRevenueData;
                if (aFa1gSDK != null) {
                    aFa1gSDK.getMonetizationNetwork(aFa1jSDK.getRevenue);
                }
            }
            aFa1jSDK.getRevenue.put("af_deeplink", string);
            AFa1gSDK aFa1gSDK2 = aFa1jSDK.AFAdRevenueData;
            if (aFa1gSDK2 != null) {
                aFa1gSDK2.getMonetizationNetwork(aFa1jSDK.getRevenue);
            }
        }
        final HashMap map = new HashMap();
        map.put("link", uri.toString());
        if (uri2 != null) {
            map.put("original_link", uri2.toString());
        }
        AFj1pSDK.M_(this.component4.AFAdRevenueData().n_(), map, uri);
        AFf1zSDK aFf1zSDK = new AFf1zSDK(this.component4, UUID.randomUUID(), uri);
        if (aFf1zSDK.equals()) {
            aFa1jSDK.getRevenue.put("isBrandedDomain", Boolean.TRUE);
            AFa1gSDK aFa1gSDK3 = aFa1jSDK.AFAdRevenueData;
            if (aFa1gSDK3 != null) {
                aFa1gSDK3.getMonetizationNetwork(aFa1jSDK.getRevenue);
            }
        }
        if (!aFf1zSDK.copydefault()) {
            this.component4.i().AFAdRevenueData(map);
            return;
        }
        aFf1zSDK.component2 = new AFf1zSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFa1oSDK.5
            @Override // com.appsflyer.internal.AFf1zSDK.AFa1vSDK
            public final void getMonetizationNetwork(Map<String, String> map2) {
                for (String str3 : map2.keySet()) {
                    map.put(str3, map2.get(str3));
                }
                AFa1oSDK.this.AFAdRevenueData(map);
            }

            @Override // com.appsflyer.internal.AFf1zSDK.AFa1vSDK
            public final void getRevenue(String str3) {
                AFa1oSDK.this.AFAdRevenueData(str3, DeepLinkResult.Error.NETWORK);
            }
        };
        AFe1qSDK aFe1qSDKEquals = this.component4.equals();
        aFe1qSDKEquals.getMonetizationNetwork.execute(aFe1qSDKEquals.new AnonymousClass1(aFf1zSDK));
    }

    public final void AFAdRevenueData(String str, DeepLinkResult.Error error) {
        if (this.getRevenue != null) {
            AFLogger.INSTANCE.d(AFg1cSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            getCurrencyIso4217Code(new DeepLinkResult(null, error));
        } else {
            getRevenue(str);
        }
    }
}
