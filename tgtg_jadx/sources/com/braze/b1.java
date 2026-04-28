package com.braze;

import android.os.Build;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9573a;

    public /* synthetic */ b1(int i11) {
        this.f9573a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9573a) {
            case 0:
                return Braze.requestSingleLocationUpdate$lambda$177();
            case 1:
                return Braze.logPushNotificationOpened$lambda$62$lambda$61();
            case 2:
                return Braze.getCachedContentCards$lambda$143();
            case 3:
                return Braze.performPushDeliveryFlush$lambda$197();
            case 4:
                return Braze._get_registeredPushToken_$lambda$31();
            case 5:
                return Braze.subscribeToFeatureFlagsUpdates$lambda$110$lambda$109();
            case 6:
                return Braze.getContentCardUnviewedCount$lambda$141();
            case 7:
                return Braze.refreshFeatureFlags$lambda$78();
            case 8:
                return Braze.schedulePushDelivery$lambda$195();
            case 9:
                return Braze.getAllFeatureFlags$lambda$81();
            case 10:
                return Braze.setSdkAuthenticationSignature$lambda$160$lambda$159();
            case 11:
                return Braze.subscribeToFeatureFlagsUpdates$lambda$108();
            case 12:
                return Braze.subscribeToFeatureFlagsUpdates$lambda$111();
            case 13:
                return Braze.subscribeToNetworkFailures$lambda$118();
            case 14:
                String str = Build.MODEL;
                return Braze.lambda$2$lambda$1(Build.MODEL);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return Braze.getCurrentUser$lambda$138();
            case 16:
                return Braze.getDeviceIdAsync$lambda$139();
            case 17:
                return Braze.recordGeofenceTransition$lambda$161();
            case 18:
                return Braze.logLocationRecordedEventFromLocationUpdate$lambda$171();
            case 19:
                return Braze.logPushStoryPageClicked$lambda$71$lambda$69();
            case 20:
                return Braze.logPushStoryPageClicked$lambda$71$lambda$70();
            case 21:
                return Braze.subscribeToBannersErrors$lambda$116();
            case 22:
                return Braze._init_$lambda$3();
            case 23:
                return Braze.changeUser$lambda$137$lambda$131();
            case 24:
                return Braze.subscribeToSdkAuthenticationFailures$lambda$119();
            case 25:
                return Braze._get_deviceId_$lambda$29();
            case 26:
                return Braze.deserializeContentCard$lambda$145();
            case 27:
                return Braze.areCachedContentCardsStale$lambda$144();
            case 28:
                return Braze._get_cachedContentCardsUpdatedEvent_$lambda$37();
            default:
                return Braze.subscribeToContentCardsUpdates$lambda$104();
        }
    }
}
