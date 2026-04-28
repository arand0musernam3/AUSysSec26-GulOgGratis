package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFb1cSDK implements AFb1hSDK {

    @NotNull
    private final AFc1gSDK AFAdRevenueData;

    @NotNull
    private final AFc1fSDK getCurrencyIso4217Code;

    @NotNull
    private final AFf1kSDK getMediationNetwork;

    public AFb1cSDK(@NotNull AFc1gSDK aFc1gSDK, @NotNull AFc1fSDK aFc1fSDK, @NotNull AFf1kSDK aFf1kSDK) {
        aFc1gSDK.getClass();
        aFc1fSDK.getClass();
        aFf1kSDK.getClass();
        this.AFAdRevenueData = aFc1gSDK;
        this.getCurrencyIso4217Code = aFc1fSDK;
        this.getMediationNetwork = aFf1kSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFb1cSDK aFb1cSDK, AppSetIdInfo appSetIdInfo) {
        aFb1cSDK.getClass();
        AFc1gSDK aFc1gSDK = aFb1cSDK.AFAdRevenueData;
        int scope = appSetIdInfo.getScope();
        String id2 = appSetIdInfo.getId();
        id2.getClass();
        aFc1gSDK.equals = new AFb1gSDK(scope, id2);
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final boolean getCurrencyIso4217Code() {
        return !this.getMediationNetwork.getRevenue() && !this.AFAdRevenueData.getMonetizationNetwork() && AFj1pSDK.getMediationNetwork(this.getCurrencyIso4217Code.getCurrencyIso4217Code) && AFj1pSDK.getCurrencyIso4217Code(this.getCurrencyIso4217Code.getCurrencyIso4217Code);
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final void getMonetizationNetwork() {
        Context context = this.getCurrencyIso4217Code.getCurrencyIso4217Code;
        if (context != null) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().g(new d10.e() { // from class: com.appsflyer.internal.e
                    @Override // d10.e
                    public final void onSuccess(Object obj) {
                        AFb1cSDK.AFAdRevenueData(this.f9538a, (AppSetIdInfo) obj);
                    }
                });
            } catch (Throwable th2) {
                AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th2, false, false, false, false, 120, null);
            }
        }
    }
}
