package com.braze;

import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10958a;

    public /* synthetic */ w0(int i11) {
        this.f10958a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10958a) {
            case 0:
                return Braze.lambda$27$lambda$5();
            case 1:
                return Braze.lambda$27$lambda$25();
            case 2:
                return Braze.lambda$27$lambda$26();
            case 3:
                return Braze.lambda$27$lambda$6();
            case 4:
                return Braze.lambda$27$lambda$7();
            case 5:
                return Braze.lambda$27$lambda$8();
            case 6:
                return Braze.lambda$27$lambda$9();
            case 7:
                return Braze.lambda$27$lambda$10();
            case 8:
                return Braze.lambda$27$lambda$11();
            case 9:
                return Braze.lambda$27$lambda$12();
            case 10:
                return Braze.lambda$27$lambda$13();
            case 11:
                return Braze.safeCallFlushDelayedInitPushAnalyticsQueue$lambda$212();
            case 12:
                return Braze.subscribeToContentCardsUpdates$lambda$106$lambda$105();
            case 13:
                return Braze.subscribeToSessionUpdates$lambda$117();
            case 14:
                return Braze.getContentCardsLastUpdatedInSecondsFromEpoch$lambda$142();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return Braze.subscribeToBannersUpdates$lambda$112();
            case 16:
                return Braze.subscribeToBannersUpdates$lambda$115();
            case 17:
                return Braze.requestContentCardsRefresh$lambda$72();
            case 18:
                return Braze.logPushNotificationOpened$lambda$62$lambda$59();
            case 19:
                return Braze.subscribeToBannersUpdates$lambda$114$lambda$113();
            case 20:
                return Braze.logPushNotificationActionClicked$lambda$63();
            case 21:
                return Braze.requestImmediateDataFlush$lambda$101$lambda$100();
            case 22:
                return Braze.subscribeToPushNotificationEvents$lambda$120();
            case 23:
                return Braze.requestContentCardsRefreshFromCache$lambda$76();
            case 24:
                return Braze.handleInternalBannerRefresh$lambda$181();
            case 25:
                return Braze.logPushMaxCampaign$lambda$199();
            case 26:
                return Braze.logPurchase$lambda$54$lambda$52();
            case 27:
                return Braze.logPurchase$lambda$54$lambda$53();
            case 28:
                return Braze.requestImmediateDataFlush$lambda$99();
            default:
                return Braze.deleteRegisteredGeofenceCache$lambda$183();
        }
    }
}
