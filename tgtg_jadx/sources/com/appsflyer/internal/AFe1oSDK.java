package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFe1oSDK extends AFe1gSDK {
    public AFe1oSDK(@NonNull Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFd1zSDK aFd1zSDK) {
        super(AFe1lSDK.ARS_VALIDATE, new AFe1lSDK[]{AFe1lSDK.RC_CDN, AFe1lSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, map, purchaseValidationCallback);
        this.getMediationNetwork.add(AFe1lSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFe1gSDK, com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        ResponseNetwork responseNetwork = ((AFe1bSDK) this).component4;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 424) {
            return super.AFAdRevenueData();
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final AFd1fSDK<String> getCurrencyIso4217Code(@NonNull Map<String, Object> map, @NonNull String str, String str2) {
        AFd1mSDK aFd1mSDK = ((AFe1bSDK) this).component3;
        return (AFd1fSDK) AFd1mSDK.getCurrencyIso4217Code(new Object[]{aFd1mSDK, map, str, str2}, 158494896, -158494896, System.identityHashCode(aFd1mSDK));
    }
}
