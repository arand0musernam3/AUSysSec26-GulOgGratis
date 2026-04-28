package com.braze;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f10352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10353c;

    public /* synthetic */ r0(Braze braze, boolean z11, int i11) {
        this.f10351a = i11;
        this.f10352b = braze;
        this.f10353c = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10351a) {
            case 0:
                return Braze.requestGeofenceRefresh$lambda$167(this.f10352b, this.f10353c);
            default:
                return Braze.setSyncPolicyOfflineStatus$lambda$204(this.f10352b, this.f10353c);
        }
    }
}
