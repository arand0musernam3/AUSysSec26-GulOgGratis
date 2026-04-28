package com.braze;

import com.braze.models.IBrazeLocation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10893a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f10894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBrazeLocation f10895c;

    public /* synthetic */ u0(Braze braze, IBrazeLocation iBrazeLocation) {
        this.f10894b = braze;
        this.f10895c = iBrazeLocation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10893a) {
            case 0:
                return Braze.requestGeofenceRefresh$lambda$165(this.f10895c, this.f10894b);
            default:
                return Braze.logLocationRecordedEventFromLocationUpdate$lambda$174(this.f10894b, this.f10895c);
        }
    }

    public /* synthetic */ u0(IBrazeLocation iBrazeLocation, Braze braze) {
        this.f10895c = iBrazeLocation;
        this.f10894b = braze;
    }
}
