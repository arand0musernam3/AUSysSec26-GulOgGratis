package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9540b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f9539a = i11;
        this.f9540b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9539a) {
            case 0:
                AFb1lSDK.getCurrencyIso4217Code((AFb1lSDK) this.f9540b);
                break;
            case 1:
                AFa1tSDK.getMediationNetwork((AFd1zSDK) this.f9540b);
                break;
            default:
                ((AFd1nSDK) this.f9540b).getMediationNetwork();
                break;
        }
    }
}
