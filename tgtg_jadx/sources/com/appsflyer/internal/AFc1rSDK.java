package com.appsflyer.internal;

import android.util.Base64;
import com.adyen.checkout.components.core.Address;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import kotlin.collections.o0;
import kotlin.jvm.internal.Intrinsics;
import o80.o;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFc1rSDK {
    public String AFAdRevenueData;
    private byte[] component3;
    public Map<String, String> getCurrencyIso4217Code;
    String getMediationNetwork;
    public AFe1lSDK getMonetizationNetwork;
    public String getRevenue;

    public AFc1rSDK(char[] cArr) {
        Map<String, String> map;
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            try {
                String strNextLine = scanner.nextLine();
                if (strNextLine.startsWith("url=")) {
                    this.getRevenue = strNextLine.substring(4).trim();
                } else if (strNextLine.startsWith("version=")) {
                    this.getMediationNetwork = strNextLine.substring(8).trim();
                } else if (strNextLine.startsWith("headers=")) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(strNextLine.substring(8).trim(), 2), Charset.defaultCharset()));
                        if (jSONObject.length() == 0) {
                            map = o0.f26530a;
                            map.getClass();
                        } else {
                            Iterator<String> itKeys = jSONObject.keys();
                            itKeys.getClass();
                            o80.a aVarB = o.b(itKeys);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj : aVarB) {
                                Object obj2 = jSONObject.get((String) obj);
                                linkedHashMap.put(obj, Intrinsics.areEqual(obj2, JSONObject.NULL) ? Address.ADDRESS_NULL_PLACEHOLDER : obj2.toString());
                            }
                            map = linkedHashMap;
                        }
                        this.getCurrencyIso4217Code = map;
                    } catch (Exception e5) {
                        AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error parsing headers", e5);
                        this.getCurrencyIso4217Code = new HashMap();
                    }
                } else if (strNextLine.startsWith("data=")) {
                    this.component3 = Base64.decode(strNextLine.substring(5).trim(), 2);
                } else if (strNextLine.startsWith("type=")) {
                    String strTrim = strNextLine.substring(5).trim();
                    try {
                        this.getMonetizationNetwork = AFe1lSDK.valueOf(strTrim);
                    } catch (Exception e11) {
                        AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Unknown task type: ".concat(String.valueOf(strTrim)), e11);
                    }
                }
            } catch (Throwable th2) {
                try {
                    scanner.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        scanner.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFc1rSDK.class == obj.getClass()) {
            AFc1rSDK aFc1rSDK = (AFc1rSDK) obj;
            if (Objects.equals(this.getMediationNetwork, aFc1rSDK.getMediationNetwork) && Arrays.equals(this.component3, aFc1rSDK.component3) && Objects.equals(this.getRevenue, aFc1rSDK.getRevenue) && Objects.equals(this.AFAdRevenueData, aFc1rSDK.AFAdRevenueData) && Objects.equals(this.getCurrencyIso4217Code, aFc1rSDK.getCurrencyIso4217Code) && this.getMonetizationNetwork == aFc1rSDK.getMonetizationNetwork) {
                return true;
            }
        }
        return false;
    }

    public final byte[] getCurrencyIso4217Code() {
        return this.component3;
    }

    public final int hashCode() {
        String str = this.getMediationNetwork;
        int iHashCode = (Arrays.hashCode(this.component3) + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.getRevenue;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.AFAdRevenueData;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFe1lSDK aFe1lSDK = this.getMonetizationNetwork;
        int iHashCode4 = (iHashCode3 + (aFe1lSDK != null ? aFe1lSDK.hashCode() : 0)) * 31;
        Map<String, String> map = this.getCurrencyIso4217Code;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public AFc1rSDK(String str, byte[] bArr, String str2, AFe1lSDK aFe1lSDK, Map<String, String> map) {
        this.getRevenue = str;
        this.component3 = bArr;
        this.getMediationNetwork = str2;
        this.getMonetizationNetwork = aFe1lSDK;
        this.getCurrencyIso4217Code = map;
    }
}
