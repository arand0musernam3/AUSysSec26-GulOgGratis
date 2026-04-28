package com.braze;

import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10959a;

    public /* synthetic */ w1(int i11) {
        this.f10959a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10959a) {
            case 0:
                return BrazeActivityLifecycleCallbackListener.onActivityResumed$lambda$6();
            case 1:
                return BrazeBootReceiver.handleIncomingIntent$lambda$2();
            case 2:
                return BrazeUser.setPhoneNumber$lambda$33();
            case 3:
                return BrazeUser.setCustomAttribute$lambda$70();
            case 4:
                return BrazeUser.unsetCustomUserAttribute$lambda$59();
            case 5:
                return BrazeUser.addToSubscriptionGroup$lambda$27();
            case 6:
                return BrazeUser.setCountry$lambda$19();
            case 7:
                return BrazeUser.setLocationCustomAttribute$lambda$63();
            case 8:
                return BrazeUser.setLanguage$lambda$23();
            case 9:
                return BrazeUser.setFirstName$lambda$8();
            case 10:
                return BrazeUser.addToCustomAttributeArray$lambda$51();
            case 11:
                return BrazeUser.removeFromSubscriptionGroup$lambda$30();
            case 12:
                return BrazeUser.unsetLocationCustomAttribute$lambda$67();
            case 13:
                return BrazeUser.setLastName$lambda$10();
            case 14:
                return BrazeUser.setHomeCity$lambda$21();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BrazeUser.setAttributionData$lambda$61();
            case 16:
                return BrazeUser.setLastKnownLocation$lambda$62();
            case 17:
                return BrazeUser.setLineId$lambda$38();
            case 18:
                return BrazeUser.addAlias$lambda$4();
            case 19:
                return BrazeUser.addAlias$lambda$5();
            case 20:
                return BrazeUser.setEmail$lambda$12();
            case 21:
                return BrazeUser.removeFromCustomAttributeArray$lambda$53();
            case 22:
                return c.a();
            case 23:
                return c.b();
            default:
                return v.a();
        }
    }
}
