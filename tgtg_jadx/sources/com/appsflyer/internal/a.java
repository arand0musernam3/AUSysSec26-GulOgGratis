package com.appsflyer.internal;

import com.appsflyer.internal.AFd1xSDK;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements AFf1uSDK, AFd1xSDK.AFa1tSDK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFa1tSDK f9531a;

    public /* synthetic */ a(AFa1tSDK aFa1tSDK) {
        this.f9531a = aFa1tSDK;
    }

    @Override // com.appsflyer.internal.AFd1xSDK.AFa1tSDK
    public void onConfigurationChanged(boolean z11) {
        this.f9531a.getCurrencyIso4217Code(z11);
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public void onRemoteConfigUpdateFinished(AFf1nSDK aFf1nSDK) {
        this.f9531a.AFAdRevenueData(aFf1nSDK);
    }
}
