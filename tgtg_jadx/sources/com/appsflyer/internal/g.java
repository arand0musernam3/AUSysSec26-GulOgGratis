package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9543c;

    public /* synthetic */ g(int i11, Object obj, Object obj2) {
        this.f9541a = i11;
        this.f9542b = obj;
        this.f9543c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9541a) {
            case 0:
                AFb1lSDK.getCurrencyIso4217Code((AFb1lSDK) this.f9542b, (AFh1oSDK) this.f9543c);
                break;
            case 1:
                ((AFa1tSDK) this.f9542b).getMediationNetwork((AFh1sSDK) this.f9543c);
                break;
            case 2:
                ((AFi1aSDK) this.f9542b).AFAdRevenueData((Context) this.f9543c);
                break;
            case 3:
                ((AFi1eSDK) this.f9542b).getRevenue((Context) this.f9543c);
                break;
            case 4:
                AFj1qSDK.AFAdRevenueData((AFj1qSDK) this.f9542b, (Context) this.f9543c);
                break;
            case 5:
                ((AFj1tSDK) this.f9542b).G_((SensorEvent) this.f9543c);
                break;
            default:
                AFj1xSDK.AFAdRevenueData((AFj1xSDK) this.f9542b, (Context) this.f9543c);
                break;
        }
    }
}
