package com.braze;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f9703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f9704c;

    public /* synthetic */ e1(double d3, double d11, int i11) {
        this.f9702a = i11;
        this.f9703b = d3;
        this.f9704c = d11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9702a) {
            case 0:
                return Braze.requestGeofences$lambda$152$lambda$150(this.f9703b, this.f9704c);
            case 1:
                return Braze.requestGeofences$lambda$152$lambda$151(this.f9703b, this.f9704c);
            default:
                return BrazeUser.setLocationCustomAttribute$lambda$64(this.f9703b, this.f9704c);
        }
    }
}
