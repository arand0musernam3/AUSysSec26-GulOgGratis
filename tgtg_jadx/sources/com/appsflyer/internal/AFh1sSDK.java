package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AFh1sSDK {
    public Map<String, Object> AFAdRevenueData;
    public String areAllFieldsValid;
    public int component1;
    public String component2;
    public String component3;
    public String component4;
    private final boolean copy;
    public String equals;
    public AppsFlyerRequestListener getCurrencyIso4217Code;
    public Map<String, Object> getMediationNetwork;
    public String getMonetizationNetwork;
    public final Map<String, String> getRevenue;
    private byte[] hashCode;

    public AFh1sSDK(String str, String str2, Boolean bool) {
        this.AFAdRevenueData = new HashMap();
        this.getRevenue = new HashMap();
        this.areAllFieldsValid = str;
        this.component3 = str2;
        this.copy = bool != null ? bool.booleanValue() : true;
    }

    public final boolean AFAdRevenueData() {
        return this.areAllFieldsValid == null && this.component4 == null;
    }

    public boolean component1() {
        return true;
    }

    public boolean component3() {
        return false;
    }

    public boolean component4() {
        return true;
    }

    public final AFh1sSDK getCurrencyIso4217Code(Map<String, ?> map) {
        synchronized (map) {
            this.AFAdRevenueData.putAll(map);
        }
        return this;
    }

    public final AFh1sSDK getMediationNetwork(byte[] bArr) {
        this.hashCode = bArr;
        return this;
    }

    public final AFh1sSDK getMonetizationNetwork(int i11) {
        this.component1 = i11;
        synchronized (this.AFAdRevenueData) {
            try {
                if (this.AFAdRevenueData.containsKey("counter")) {
                    this.AFAdRevenueData.put("counter", Integer.toString(i11));
                }
                if (this.AFAdRevenueData.containsKey("launch_counter")) {
                    this.AFAdRevenueData.put("launch_counter", Integer.toString(i11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    public abstract AFe1lSDK getRevenue();

    public final boolean getMediationNetwork() {
        return this.copy;
    }

    public final byte[] getCurrencyIso4217Code() {
        return this.hashCode;
    }

    public AFh1sSDK() {
        this(null, null, null);
    }

    public final AFh1sSDK getMonetizationNetwork(String str, Object obj) {
        synchronized (this.AFAdRevenueData) {
            this.AFAdRevenueData.put(str, obj);
        }
        return this;
    }

    public boolean getMonetizationNetwork() {
        return true;
    }

    public static boolean getMonetizationNetwork(double d3) {
        if (d3 < 0.0d || d3 >= 1.0d) {
            return false;
        }
        if (d3 == 0.0d) {
            return true;
        }
        int i11 = (int) (1.0d / d3);
        if (i11 + 1 > 0) {
            return ((int) ((Math.random() * ((double) i11)) + 1.0d)) != i11;
        }
        i4.a.f("Unsupported max value");
        return false;
    }
}
