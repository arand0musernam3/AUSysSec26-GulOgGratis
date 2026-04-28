package com.braze;

import com.braze.BrazeActivityLifecycleCallbackListener;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10962a;

    public /* synthetic */ x1(int i11) {
        this.f10962a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10962a) {
            case 0:
                return BrazeActivityLifecycleCallbackListener.AnonymousClass2.invokeSuspend$lambda$0();
            case 1:
                return Braze._init_$lambda$0();
            case 2:
                return Braze.refreshFeatureFlags$lambda$80$lambda$79();
            case 3:
                return Braze.requestContentCardsRefresh$lambda$75$lambda$73();
            case 4:
                return Braze.requestContentCardsRefresh$lambda$75$lambda$74();
            case 5:
                return Braze.waitForUserDependencyThread$lambda$214();
            case 6:
                return Braze.waitForUserDependencyThread$lambda$215();
            case 7:
                return Braze.logPushNotificationActionClicked$lambda$67$lambda$66();
            case 8:
                return Braze.logPushNotificationActionClicked$lambda$67$lambda$65();
            case 9:
                return Braze.logPushNotificationActionClicked$lambda$67$lambda$64();
            case 10:
                return Braze.validateAndStorePushId$lambda$201();
            case 11:
                return Braze.logPushNotificationOpened$lambda$57$lambda$56();
            case 12:
                return Braze.logFeatureFlagImpression$lambda$83();
            case 13:
                return Braze.requestBannersRefresh$lambda$94$lambda$93();
            case 14:
                return Braze.publishError$lambda$205();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return Braze.getConfigurationProviderSafe$lambda$216();
            case 16:
                return Braze.isEphemeralEventKey$lambda$210();
            case 17:
                return Braze.requestGeofences$lambda$149();
            case 18:
                return Braze.requestGeofenceRefresh$lambda$163();
            case 19:
                return Braze.lambda$27$lambda$4();
            case 20:
                return Braze.lambda$27$lambda$14();
            case 21:
                return Braze.lambda$27$lambda$15();
            case 22:
                return Braze.lambda$27$lambda$17();
            case 23:
                return Braze.lambda$27$lambda$18();
            case 24:
                return Braze.lambda$27$lambda$19();
            case 25:
                return Braze.lambda$27$lambda$20();
            case 26:
                return Braze.lambda$27$lambda$21();
            case 27:
                return Braze.lambda$27$lambda$22();
            case 28:
                return Braze.lambda$27$lambda$23();
            default:
                return Braze.lambda$27$lambda$24();
        }
    }
}
