package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class AFe1ySDK<Body> implements ResponseNetwork<Body> {

    @NonNull
    public final AFd1dSDK AFAdRevenueData;

    @NonNull
    private final Body getCurrencyIso4217Code;

    @NonNull
    final Map<String, List<String>> getMediationNetwork;
    final boolean getMonetizationNetwork;
    final int getRevenue;

    public AFe1ySDK(@NonNull Body body, int i11, boolean z11, Map<String, List<String>> map, @NonNull AFd1dSDK aFd1dSDK) {
        this.getCurrencyIso4217Code = body;
        this.getRevenue = i11;
        this.getMonetizationNetwork = z11;
        this.getMediationNetwork = new HashMap(map);
        this.AFAdRevenueData = aFd1dSDK;
    }

    public final String AFAdRevenueData(@NonNull String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb2 = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1ySDK aFe1ySDK = (AFe1ySDK) obj;
        if (this.getRevenue == aFe1ySDK.getRevenue && this.getMonetizationNetwork == aFe1ySDK.getMonetizationNetwork && this.getCurrencyIso4217Code.equals(aFe1ySDK.getCurrencyIso4217Code) && this.getMediationNetwork.equals(aFe1ySDK.getMediationNetwork)) {
            return this.AFAdRevenueData.equals(aFe1ySDK.AFAdRevenueData);
        }
        return false;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    @NonNull
    public Body getBody() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public List<String> getHeaderField(@NonNull String str) {
        for (String str2 : this.getMediationNetwork.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.getMediationNetwork.get(str2);
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.getRevenue;
    }

    public int hashCode() {
        return this.AFAdRevenueData.hashCode() + ((this.getMediationNetwork.hashCode() + (((((this.getCurrencyIso4217Code.hashCode() * 31) + this.getRevenue) * 31) + (this.getMonetizationNetwork ? 1 : 0)) * 31)) * 31);
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.getMonetizationNetwork;
    }
}
