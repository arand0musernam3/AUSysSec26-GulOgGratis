package com.braze;

import com.braze.Braze;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9853a;

    public /* synthetic */ h1(int i11) {
        this.f9853a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9853a) {
            case 0:
                return Braze.subscribeToContentCardsUpdates$lambda$107();
            case 1:
                return Braze.requestBannersRefresh$lambda$85();
            case 2:
                return Braze.handleInAppMessageTestPush$lambda$179();
            case 3:
                return Braze.subscribeToNoMatchingTriggerForEvent$lambda$103();
            case 4:
                return Braze.subscribeToChangeUserEvents$lambda$121();
            case 5:
                return Braze.subscribeToChangeUserEvents$lambda$124();
            case 6:
                return Braze.closeSession$lambda$41();
            case 7:
                return Braze._get_currentUser_$lambda$30();
            case 8:
                return Braze.closeSession$lambda$42();
            case 9:
                return Braze.requestGeofenceRefresh$lambda$165$lambda$164();
            case 10:
                return Braze.requestLocationInitialization$lambda$153();
            case 11:
                return Braze.subscribeToChangeUserEvents$lambda$123$lambda$122();
            case 12:
                return Braze.applyPendingRuntimeConfiguration$lambda$188$lambda$185();
            case 13:
                return Braze.applyPendingRuntimeConfiguration$lambda$188$lambda$186();
            case 14:
                return Braze.verifyProperSdkSetup$lambda$208();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return Braze.verifyProperSdkSetup$lambda$209();
            case 16:
                return Braze.openSession$lambda$38();
            case 17:
                return Braze.openSession$lambda$39();
            case 18:
                return Braze.getContentCardCount$lambda$140();
            case 19:
                return Braze.requestGeofencesInitialization$lambda$175();
            case 20:
                return Braze._set_registeredPushToken_$lambda$36$lambda$34();
            case 21:
                return Braze.subscribeToNewInAppMessages$lambda$102();
            case 22:
                return Braze.logLocationRecordedEventFromLocationUpdate$lambda$174$lambda$172();
            case 23:
                return Braze.Companion.enableDelayedInitialization$lambda$32();
            case 24:
                return Braze.Companion.clearSharedPreferencesData$lambda$40();
            case 25:
                return Braze.Companion.stopInstance$lambda$48();
            case 26:
                return Braze.Companion.stopInstance$lambda$51$lambda$49();
            case 27:
                return Braze.Companion.stopInstance$lambda$51$lambda$50();
            case 28:
                return Braze.Companion.stopInstance$lambda$52();
            default:
                return Braze.Companion.getInstance$lambda$8$lambda$7();
        }
    }
}
