package com.braze;

import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9706b;

    public /* synthetic */ e2(String str, int i11) {
        this.f9705a = i11;
        this.f9706b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9705a) {
            case 0:
                return BrazeUser.setCustomUserAttribute$lambda$45(this.f9706b);
            case 1:
                return BrazeUser.setPhoneNumber$lambda$37(this.f9706b);
            case 2:
                return BrazeUser.setCustomUserAttribute$lambda$44(this.f9706b);
            case 3:
                return BrazeUser.setLanguage$lambda$24(this.f9706b);
            case 4:
                return BrazeUser.setFirstName$lambda$9(this.f9706b);
            case 5:
                return BrazeUser.addToCustomAttributeArray$lambda$52(this.f9706b);
            case 6:
                return BrazeUser._set_userId_$lambda$1(this.f9706b);
            case 7:
                return BrazeUser.setCustomUserAttributeToNow$lambda$56(this.f9706b);
            case 8:
                return BrazeUser.unsetLocationCustomAttribute$lambda$69(this.f9706b);
            case 9:
                return BrazeUser.setLastName$lambda$11(this.f9706b);
            case 10:
                return BrazeUser.setHomeCity$lambda$22(this.f9706b);
            case 11:
                return BrazeUser.removeFromSubscriptionGroup$lambda$32(this.f9706b);
            case 12:
                return BrazeUser.setCustomUserAttribute$lambda$43(this.f9706b);
            case 13:
                return BrazeUser.setLineId$lambda$41$lambda$40(this.f9706b);
            case 14:
                return BrazeUser.setLineId$lambda$42(this.f9706b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BrazeUser.addAlias$lambda$7(this.f9706b);
            case 16:
                return BrazeUser.setCustomAttributeArray$lambda$55(this.f9706b);
            case 17:
                return BrazeUser.setEmail$lambda$15$lambda$14(this.f9706b);
            case 18:
                return BrazeUser.setEmail$lambda$16(this.f9706b);
            case 19:
                return g.a(this.f9706b);
            default:
                return j0.a(this.f9706b);
        }
    }
}
