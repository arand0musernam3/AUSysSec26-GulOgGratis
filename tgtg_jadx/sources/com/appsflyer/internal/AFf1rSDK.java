package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class AFf1rSDK extends AFe1bSDK<String> {
    private static final AFe1lSDK[] registerClient = {AFe1lSDK.DLSDK, AFe1lSDK.ONELINK, AFe1lSDK.REGISTER};
    private final AFc1fSDK AFInAppEventParameterName;
    private final AFf1gSDK AFLogger;
    protected final AFc1jSDK component2;

    @NonNull
    private final AFc1kSDK copy;
    private final AFf1mSDK copydefault;
    protected final AFg1vSDK equals;
    private final AFe1vSDK hashCode;
    private final AFh1sSDK toString;

    public AFf1rSDK(@NonNull AFh1sSDK aFh1sSDK, @NonNull AFd1zSDK aFd1zSDK, String str) {
        super(aFh1sSDK.getRevenue(), new AFe1lSDK[]{AFe1lSDK.RC_CDN, AFe1lSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, str);
        this.toString = aFh1sSDK;
        this.hashCode = aFd1zSDK.AFInAppEventType();
        this.component2 = aFd1zSDK.getMediationNetwork();
        this.copydefault = aFd1zSDK.component3();
        this.AFInAppEventParameterName = aFd1zSDK.registerClient();
        this.copy = aFd1zSDK.AFAdRevenueData();
        this.equals = aFd1zSDK.areAllFieldsValid();
        this.AFLogger = aFd1zSDK.force();
        for (AFe1lSDK aFe1lSDK : registerClient) {
            if (this.getMonetizationNetwork == aFe1lSDK) {
                return;
            }
        }
        int i11 = this.toString.component1;
        AFe1lSDK aFe1lSDK2 = this.getMonetizationNetwork;
        if (i11 > 0) {
            this.getMediationNetwork.add(AFe1lSDK.CONVERSION);
        } else {
            AFe1lSDK aFe1lSDK3 = AFe1lSDK.CONVERSION;
            if (aFe1lSDK2 != aFe1lSDK3) {
                this.getRevenue.add(aFe1lSDK3);
            }
        }
    }

    public void AFAdRevenueData(AFh1sSDK aFh1sSDK) {
        try {
            try {
                getRevenue(aFh1sSDK);
                getMonetizationNetwork(aFh1sSDK);
                getMediationNetwork(aFh1sSDK);
                getCurrencyIso4217Code(aFh1sSDK);
                component3(aFh1sSDK);
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while collecting payload params", th2, true, true, false);
            }
            if (aFh1sSDK.getMonetizationNetwork()) {
                aFh1sSDK.getCurrencyIso4217Code(((AFe1bSDK) this).component1.AFAdRevenueData(aFh1sSDK.AFAdRevenueData));
                aFh1sSDK.getCurrencyIso4217Code(((AFe1bSDK) this).component1.getMediationNetwork(aFh1sSDK.AFAdRevenueData));
            }
            if (aFh1sSDK.component4()) {
                aFh1sSDK.getCurrencyIso4217Code(((AFe1bSDK) this).component1.getCurrencyIso4217Code());
            }
            Set<AFe1lSDK> set = this.getRevenue;
            boolean z11 = set.contains(AFe1lSDK.LAUNCH) || set.contains(AFe1lSDK.CONVERSION);
            if (component3() && z11) {
                aFh1sSDK.getMonetizationNetwork(this.component2.getCurrencyIso4217Code("appsFlyerCount", 0));
            }
            if (aFh1sSDK.component3()) {
                Map<String, Object> mapAFAdRevenueData = AFj1cSDK.AFAdRevenueData(aFh1sSDK.AFAdRevenueData);
                AFe1vSDK aFe1vSDK = this.hashCode;
                AFe1zSDK aFe1zSDK = new AFe1zSDK(aFe1vSDK.getCurrencyIso4217Code(), aFe1vSDK.getMonetizationNetwork(), AFe1vSDK.getMediationNetwork() ? AFe1sSDK.DEFAULT : AFe1sSDK.API);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", aFe1zSDK.AFAdRevenueData);
                AFe1sSDK aFe1sSDK = aFe1zSDK.getMonetizationNetwork;
                if (aFe1sSDK != AFe1sSDK.DEFAULT) {
                    jSONObject.put("method", aFe1sSDK.getCurrencyIso4217Code);
                }
                String str = aFe1zSDK.getMediationNetwork;
                if (str != null && !StringsKt.H(str)) {
                    jSONObject.put("prefix", aFe1zSDK.getMediationNetwork);
                }
                mapAFAdRevenueData.put("host", jSONObject);
            }
            if (this.copy.getMediationNetwork("AF_PREINSTALL_DISABLED")) {
                AFj1cSDK.AFAdRevenueData(aFh1sSDK.AFAdRevenueData).put("preinstall_disabled", Boolean.TRUE);
            }
            this.AFLogger.getCurrencyIso4217Code(aFh1sSDK.AFAdRevenueData, aFh1sSDK.getRevenue());
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while preparing to send event", th3, true, true, false);
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AppsFlyerRequestListener component1() {
        return this.toString.getCurrencyIso4217Code;
    }

    public void component3(AFh1sSDK aFh1sSDK) {
        this.equals.getRevenue(aFh1sSDK);
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public boolean copy() {
        return true;
    }

    public void getCurrencyIso4217Code(AFh1sSDK aFh1sSDK) {
        this.equals.getMonetizationNetwork(aFh1sSDK);
    }

    public void getMediationNetwork(AFh1sSDK aFh1sSDK) {
        this.equals.getMediationNetwork(aFh1sSDK);
    }

    public void getMonetizationNetwork(AFh1sSDK aFh1sSDK) {
        this.equals.getRevenue(aFh1sSDK.AFAdRevenueData);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0169  */
    @Override // com.appsflyer.internal.AFe1bSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFd1fSDK<java.lang.String> getRevenue(@androidx.annotation.NonNull java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1rSDK.getRevenue(java.lang.String):com.appsflyer.internal.AFd1fSDK");
    }

    public AFf1rSDK(@NonNull AFh1sSDK aFh1sSDK, @NonNull AFd1zSDK aFd1zSDK) {
        this(aFh1sSDK, aFd1zSDK, null);
    }

    public void getRevenue(AFh1sSDK aFh1sSDK) {
        this.equals.getCurrencyIso4217Code(aFh1sSDK);
    }
}
