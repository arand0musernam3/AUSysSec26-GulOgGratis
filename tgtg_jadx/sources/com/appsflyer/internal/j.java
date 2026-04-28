package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFd1wSDK f9547b;

    public /* synthetic */ j(AFd1wSDK aFd1wSDK, int i11) {
        this.f9546a = i11;
        this.f9547b = aFd1wSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9546a) {
            case 0:
                AFd1wSDK.getCurrencyIso4217Code(this.f9547b);
                break;
            case 1:
                AFd1wSDK.AFAdRevenueData(this.f9547b);
                break;
            default:
                AFd1wSDK.getMediationNetwork(this.f9547b);
                break;
        }
    }
}
