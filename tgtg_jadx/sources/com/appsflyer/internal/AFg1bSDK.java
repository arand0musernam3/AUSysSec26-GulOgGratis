package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFg1bSDK implements AFh1ySDK {

    @Nullable
    private AFg1gSDK getCurrencyIso4217Code;

    @Nullable
    private AFg1aSDK getMediationNetwork;

    @NotNull
    private final AFd1zSDK getMonetizationNetwork;

    @Nullable
    private AFg1eSDK getRevenue;

    public AFg1bSDK(@NotNull AFd1zSDK aFd1zSDK) {
        aFd1zSDK.getClass();
        this.getMonetizationNetwork = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void AFAdRevenueData() {
        AFg1eSDK aFg1eSDK = this.getRevenue;
        if (aFg1eSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1hSDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1eSDK);
            this.getRevenue = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void areAllFieldsValid() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.getRevenue == null) {
            this.getRevenue = new AFg1eSDK();
        }
        AFg1eSDK aFg1eSDK = this.getRevenue;
        aFg1eSDK.getClass();
        aFLogger.registerClient(aFg1eSDK);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void getCurrencyIso4217Code() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.getCurrencyIso4217Code == null) {
            this.getCurrencyIso4217Code = new AFg1gSDK(this.getMonetizationNetwork);
        }
        AFg1gSDK aFg1gSDK = this.getCurrencyIso4217Code;
        aFg1gSDK.getClass();
        aFLogger.registerClient(aFg1gSDK);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void getMediationNetwork() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        if (this.getMediationNetwork == null) {
            this.getMediationNetwork = new AFg1aSDK(this.getMonetizationNetwork);
        }
        AFg1aSDK aFg1aSDK = this.getMediationNetwork;
        aFg1aSDK.getClass();
        aFLogger.registerClient(aFg1aSDK);
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void getMonetizationNetwork() {
        AFg1aSDK aFg1aSDK = this.getMediationNetwork;
        if (aFg1aSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1hSDK.v$default(aFLogger, AFg1cSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1aSDK);
            this.getMediationNetwork = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void getRevenue() {
        AFg1gSDK aFg1gSDK = this.getCurrencyIso4217Code;
        if (aFg1gSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1hSDK.v$default(aFLogger, AFg1cSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1gSDK);
            this.getCurrencyIso4217Code = null;
        }
    }
}
