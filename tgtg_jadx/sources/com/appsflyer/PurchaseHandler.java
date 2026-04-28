package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFd1zSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFj1jSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseHandler {

    @NonNull
    public final AFe1qSDK AFAdRevenueData;

    @NonNull
    public final AFd1zSDK getCurrencyIso4217Code;

    @NonNull
    private final AFc1kSDK getRevenue;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public interface PurchaseValidationCallback {
        void onFailure(@NonNull Throwable th2);

        void onResponse(@NonNull ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(@NonNull AFd1zSDK aFd1zSDK) {
        this.getCurrencyIso4217Code = aFd1zSDK;
        this.getRevenue = aFd1zSDK.AFAdRevenueData();
        this.AFAdRevenueData = aFd1zSDK.equals();
    }

    public final boolean getRevenue(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean revenue = AFj1jSDK.getRevenue(map, strArr, this.getRevenue);
        if (!revenue && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return revenue;
    }
}
