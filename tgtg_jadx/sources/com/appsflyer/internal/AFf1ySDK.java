package com.appsflyer.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.appsflyer.AFLogger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.messaging.android.internal.conversationscreen.ConversationFragment;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFf1ySDK extends AFe1uSDK<Map<String, Object>> {
    private static final int component2 = (int) ConversationFragment.COORDINATOR_INITIALIZATION_TIMEOUT;
    private Map<String, Object> areAllFieldsValid;
    private final AFa1oSDK component1;
    private final AFa1jSDK component3;
    private final Uri component4;
    private final List<String> hashCode;

    public AFf1ySDK(AFa1oSDK aFa1oSDK, @NonNull AFa1jSDK aFa1jSDK, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFe1lSDK.RESOLVE_ESP, new AFe1lSDK[]{AFe1lSDK.RC_CDN}, "ResolveEsp");
        this.component1 = aFa1oSDK;
        this.component3 = aFa1jSDK;
        this.component4 = uri;
        this.hashCode = list;
    }

    private boolean getRevenue(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sbS = e0.f.s("Validate if link ", str, " belongs to ESP domains: ");
        sbS.append(this.hashCode);
        AFLogger.afRDLog(sbS.toString());
        try {
            return this.hashCode.contains(new URL(str).getHost());
        } catch (MalformedURLException e5) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e5);
            return false;
        }
    }

    private static Map<String, Object> r_(Uri uri) {
        HashMap map = new HashMap();
        try {
            StringBuilder sb2 = new StringBuilder("ESP deeplink resolving is started: ");
            sb2.append(uri.toString());
            AFLogger.afDebugLog(sb2.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            int i11 = component2;
            httpURLConnection.setReadTimeout(i11);
            httpURLConnection.setConnectTimeout(i11);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.18.0");
            int responseCode = httpURLConnection.getResponseCode();
            map.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                map.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
            return map;
        } catch (Throwable th2) {
            map.put(StatusResponseUtils.RESULT_ERROR, th2.getLocalizedMessage());
            AFLogger.afErrorLog(th2.getMessage(), th2);
            return map;
        }
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    @NonNull
    public final AFe1rSDK getMediationNetwork() throws Exception {
        Integer num = null;
        if (!getRevenue(this.component4.toString())) {
            this.component1.j_(this.component3, this.component4, null);
            return AFe1rSDK.SUCCESS;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = this.component4.toString();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        String str = null;
        while (i11 < 5) {
            Map<String, Object> mapR_ = r_(Uri.parse(string));
            String str2 = (String) mapR_.get("res");
            Integer num2 = (Integer) mapR_.get("status");
            String str3 = (String) mapR_.get(StatusResponseUtils.RESULT_ERROR);
            if (str2 == null || !getRevenue(str2)) {
                str = str3;
                string = str2;
                num = num2;
                break;
            }
            if (i11 < 4) {
                arrayList.add(str2);
            }
            i11++;
            str = str3;
            string = str2;
            num = num2;
        }
        HashMap map = new HashMap();
        map.put("res", string != null ? string : "");
        map.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            map.put(StatusResponseUtils.RESULT_ERROR, str);
        }
        if (!arrayList.isEmpty()) {
            map.put("redirects", arrayList);
        }
        map.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        synchronized (this.component3) {
            this.component3.getMediationNetwork("af_deeplink_r", map);
            this.component3.getMediationNetwork("af_deeplink", this.component4.toString());
        }
        this.component1.j_(this.component3, string != null ? Uri.parse(string) : this.component4, this.component4);
        this.areAllFieldsValid = map;
        return AFe1rSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final long getRevenue() {
        return TimeConstants.ONE_MINUTE_DIFFERENCE;
    }
}
