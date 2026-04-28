package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFj1mSDK f9555b;

    public /* synthetic */ m(AFj1mSDK aFj1mSDK, int i11) {
        this.f9554a = i11;
        this.f9555b = aFj1mSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9554a) {
            case 0:
                this.f9555b.component1();
                break;
            case 1:
                this.f9555b.component2();
                break;
            default:
                this.f9555b.component3();
                break;
        }
    }
}
