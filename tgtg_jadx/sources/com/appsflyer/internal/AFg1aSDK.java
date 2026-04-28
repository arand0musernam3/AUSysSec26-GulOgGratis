package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFg1aSDK extends AFg1hSDK {
    private final boolean AFAdRevenueData;

    @NotNull
    private final AFd1zSDK getMediationNetwork;

    public AFg1aSDK(@NotNull AFd1zSDK aFd1zSDK) {
        aFd1zSDK.getClass();
        this.getMediationNetwork = aFd1zSDK;
        this.AFAdRevenueData = true;
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z11) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z11) {
            this.getMediationNetwork.copy().getMediationNetwork("D", getMonetizationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2, boolean z11, boolean z12, boolean z13, boolean z14) {
        aFg1cSDK.getClass();
        str.getClass();
        th2.getClass();
        if (z14) {
            this.getMediationNetwork.copy().getMediationNetwork("E", getMonetizationNetwork(str, aFg1cSDK));
        }
        if (z14) {
            this.getMediationNetwork.copy().getCurrencyIso4217Code(th2);
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void force(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        aFg1cSDK.getClass();
        str.getClass();
        this.getMediationNetwork.copy().getMediationNetwork("F", getMonetizationNetwork(str, aFg1cSDK));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final boolean getShouldExtendMsg() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z11) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z11) {
            this.getMediationNetwork.copy().getMediationNetwork("I", getMonetizationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z11) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z11) {
            this.getMediationNetwork.copy().getMediationNetwork("V", getMonetizationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z11) {
        aFg1cSDK.getClass();
        str.getClass();
        if (z11) {
            this.getMediationNetwork.copy().getMediationNetwork("W", getMonetizationNetwork(str, aFg1cSDK));
        }
    }
}
