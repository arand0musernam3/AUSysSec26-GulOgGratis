package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class AFd1dSDK {
    public final long AFAdRevenueData;

    public AFd1dSDK(long j9) {
        this.AFAdRevenueData = j9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.AFAdRevenueData == ((AFd1dSDK) obj).AFAdRevenueData;
    }

    public int hashCode() {
        long j9 = this.AFAdRevenueData;
        return (int) (j9 ^ (j9 >>> 32));
    }
}
