package com.braze;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f9587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f9588d;

    public /* synthetic */ c2(double d3, double d11, Braze braze) {
        this.f9585a = 2;
        this.f9587c = d3;
        this.f9588d = d11;
        this.f9586b = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9585a) {
            case 0:
                return BrazeUser.setLocationCustomAttribute$lambda$66((String) this.f9586b, this.f9587c, this.f9588d);
            case 1:
                return com.braze.models.outgoing.event.a.b((String) this.f9586b, this.f9587c, this.f9588d);
            default:
                return Braze.requestGeofences$lambda$152(this.f9587c, this.f9588d, (Braze) this.f9586b);
        }
    }

    public /* synthetic */ c2(String str, double d3, double d11, int i11) {
        this.f9585a = i11;
        this.f9586b = str;
        this.f9587c = d3;
        this.f9588d = d11;
    }
}
