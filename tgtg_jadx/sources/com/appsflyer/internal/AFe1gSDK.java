package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AFe1gSDK extends AFe1hSDK {

    @Nullable
    private final PurchaseHandler.PurchaseValidationCallback component2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1gSDK(@NotNull AFe1lSDK aFe1lSDK, @NotNull AFe1lSDK[] aFe1lSDKArr, @NotNull AFd1zSDK aFd1zSDK, @NotNull Map<String, ? extends Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFe1lSDK, aFe1lSDKArr, aFd1zSDK, null, map);
        aFe1lSDK.getClass();
        aFe1lSDKArr.getClass();
        aFd1zSDK.getClass();
        map.getClass();
        this.component2 = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public boolean AFAdRevenueData() {
        ResponseNetwork responseNetwork = ((AFe1bSDK) this).component4;
        if (responseNetwork != null) {
            responseNetwork.getClass();
            if (responseNetwork.getStatusCode() == 503) {
                return true;
            }
        }
        return super.AFAdRevenueData();
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    public final boolean areAllFieldsValid() {
        return true;
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    @Nullable
    public final String getCurrencyIso4217Code(@NotNull Map<String, Object> map) {
        map.getClass();
        if (map.containsKey("connector_version")) {
            Object objRemove = map.remove("connector_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final void getMonetizationNetwork() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.getMonetizationNetwork();
        Throwable thComponent2 = component2();
        if (thComponent2 != null && (purchaseValidationCallback2 = this.component2) != null) {
            purchaseValidationCallback2.onFailure(thComponent2);
        }
        ResponseNetwork<String> responseNetwork = ((AFe1bSDK) this).component4;
        if (responseNetwork == null || (purchaseValidationCallback = this.component2) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    @Override // com.appsflyer.internal.AFe1hSDK
    @Nullable
    public final String getMonetizationNetwork(@NotNull Map<String, Object> map) {
        map.getClass();
        if (map.containsKey("billing_library_version")) {
            Object objRemove = map.remove("billing_library_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }
}
