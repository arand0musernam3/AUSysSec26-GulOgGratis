package com.braze;

import com.braze.Braze;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10354a;

    public /* synthetic */ r1(int i11) {
        this.f10354a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10354a) {
            case 0:
                return Braze.Companion._get_isDelayedInitializationEnabled_$lambda$5();
            case 1:
                return Braze.Companion._get_isDelayedInitializationEnabled_$lambda$6();
            case 2:
                return Braze.Companion.enableDelayedInitialization$lambda$33();
            case 3:
                return Braze.Companion.clearInstance$lambda$55$lambda$53();
            case 4:
                return Braze.Companion.configure$lambda$18$lambda$16();
            case 5:
                return Braze.Companion.configure$lambda$18$lambda$17();
            case 6:
                return Braze.Companion._get_isDisabled_$lambda$2();
            case 7:
                return Braze.Companion._get_isDisabled_$lambda$3();
            case 8:
                return Braze.Companion._get_isDisabled_$lambda$4();
            case 9:
                return Braze.Companion.shouldAllowSingletonInitialization$lambda$44();
            case 10:
                return Braze.Companion.shouldAllowSingletonInitialization$lambda$45();
            case 11:
                return Braze.Companion.shouldAllowSingletonInitialization$lambda$46();
            case 12:
                return Braze.Companion.enableDelayedInitialization$lambda$34();
            case 13:
                return Braze.Companion.wipeData$lambda$36();
            case 14:
                return Braze.Companion.getApiEndpoint$lambda$14$lambda$13$lambda$12();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return Braze.Companion.clearDataStoreData$lambda$41();
            case 16:
                return Braze.Companion.enableSdk$lambda$28();
            case 17:
                return Braze.Companion.enableSdk$lambda$29();
            case 18:
                return Braze.Companion.requestTriggersIfInAppMessageTestPush$lambda$47();
            case 19:
                return Braze.Companion.getConfiguredApiKey$lambda$9();
            case 20:
                return Braze.Companion.disableDelayedInitialization$lambda$30();
            case 21:
                return Braze.Companion.disableDelayedInitialization$lambda$31();
            case 22:
                return Braze.Companion.disableSdk$lambda$25();
            case 23:
                return Braze.Companion.disableSdk$lambda$26();
            case 24:
                return Braze.Companion.disableSdk$lambda$27();
            case 25:
                return Braze.Companion.enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$21();
            case 26:
                return Braze.Companion.enableMockNetworkRequestsAndDropEventsMode$lambda$23$lambda$22();
            case 27:
                return Braze.Companion.enableMockNetworkRequestsAndDropEventsMode$lambda$24();
            case 28:
                return BrazeActivityLifecycleCallbackListener.registerOnApplication$lambda$12();
            default:
                return BrazeActivityLifecycleCallbackListener.shouldHandleLifecycleMethodsInActivity$lambda$11();
        }
    }
}
