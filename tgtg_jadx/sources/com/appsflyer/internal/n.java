package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFj1rSDK f9557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f9558c;

    public /* synthetic */ n(AFj1rSDK aFj1rSDK, Runnable runnable, int i11) {
        this.f9556a = i11;
        this.f9557b = aFj1rSDK;
        this.f9558c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9556a) {
            case 0:
                this.f9557b.getMediationNetwork(this.f9558c);
                break;
            case 1:
                this.f9557b.getCurrencyIso4217Code(this.f9558c);
                break;
            case 2:
                this.f9557b.getMonetizationNetwork(this.f9558c);
                break;
            default:
                this.f9557b.areAllFieldsValid(this.f9558c);
                break;
        }
    }
}
