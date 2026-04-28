package com.braze;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f10961b;

    public /* synthetic */ x0(Braze braze, int i11) {
        this.f10960a = i11;
        this.f10961b = braze;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10960a) {
            case 0:
                return Braze.safeCallFlushDelayedInitPushAnalyticsQueue$lambda$213(this.f10961b);
            case 1:
                return Braze.subscribeToBannersUpdates$lambda$114(this.f10961b);
            case 2:
                return Braze.requestContentCardsRefresh$lambda$75(this.f10961b);
            case 3:
                return Braze.requestContentCardsRefreshFromCache$lambda$77(this.f10961b);
            case 4:
                return Braze.handleInternalBannerRefresh$lambda$182(this.f10961b);
            case 5:
                return Braze.requestImmediateDataFlush$lambda$101(this.f10961b);
            case 6:
                return Braze.deleteRegisteredGeofenceCache$lambda$184(this.f10961b);
            case 7:
                return Braze.requestSingleLocationUpdate$lambda$178(this.f10961b);
            case 8:
                return Braze.performPushDeliveryFlush$lambda$198(this.f10961b);
            case 9:
                return Braze.refreshFeatureFlags$lambda$80(this.f10961b);
            case 10:
                return Braze.subscribeToFeatureFlagsUpdates$lambda$110(this.f10961b);
            case 11:
                return Braze.subscribeToContentCardsUpdates$lambda$106(this.f10961b);
            case 12:
                return Braze.subscribeToChangeUserEvents$lambda$123(this.f10961b);
            default:
                return Braze.requestGeofencesInitialization$lambda$176(this.f10961b);
        }
    }
}
