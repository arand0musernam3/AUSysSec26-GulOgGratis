package com.appsflyer;

import com.appsflyer.internal.AFg1hSDK;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFg1hSDK[] f9507b;

    public /* synthetic */ a(AFg1hSDK[] aFg1hSDKArr, int i11) {
        this.f9506a = i11;
        this.f9507b = aFg1hSDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9506a) {
            case 0:
                AFLogger.getMediationNetwork(this.f9507b);
                break;
            default:
                AFLogger.getMonetizationNetwork(this.f9507b);
                break;
        }
    }
}
