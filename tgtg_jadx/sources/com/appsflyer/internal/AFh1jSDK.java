package com.appsflyer.internal;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFh1jSDK extends AFh1sSDK {
    public final AFe1lSDK hashCode;

    public AFh1jSDK(String str, byte[] bArr, String str2, AFe1lSDK aFe1lSDK, Map<String, String> map) {
        super(null, str, Boolean.FALSE);
        this.component4 = str2;
        getMediationNetwork(bArr);
        this.hashCode = aFe1lSDK;
        if (map != null) {
            this.getRevenue.putAll(map);
        }
    }

    @Override // com.appsflyer.internal.AFh1sSDK
    public final AFe1lSDK getRevenue() {
        AFe1lSDK aFe1lSDK = this.hashCode;
        return aFe1lSDK != null ? aFe1lSDK : AFe1lSDK.CACHED_EVENT;
    }

    @Deprecated
    public AFh1jSDK() {
        this.hashCode = null;
    }
}
