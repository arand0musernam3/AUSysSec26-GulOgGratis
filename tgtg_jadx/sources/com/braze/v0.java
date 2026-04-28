package com.braze;

import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10955b;

    public /* synthetic */ v0(String str, int i11) {
        this.f10954a = i11;
        this.f10955b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10954a) {
            case 0:
                return Braze._set_registeredPushToken_$lambda$32(this.f10955b);
            case 1:
                return Braze.getFeatureFlag$lambda$82(this.f10955b);
            case 2:
                return Braze.logBannerClick$lambda$97(this.f10955b);
            case 3:
                return Braze.logPushNotificationOpened$lambda$62$lambda$60(this.f10955b);
            case 4:
                return Braze.logBannerImpression$lambda$96(this.f10955b);
            case 5:
                return Braze.logPurchase$lambda$51(this.f10955b);
            case 6:
                return Braze.setSdkAuthenticationSignature$lambda$160$lambda$158(this.f10955b);
            case 7:
                return Braze.getBanner$lambda$95(this.f10955b);
            case 8:
                return Braze.deserializeInAppMessageString$lambda$148(this.f10955b);
            case 9:
                return Braze.changeUser$lambda$130(this.f10955b);
            case 10:
                return Braze.logPushNotificationOpened$lambda$55(this.f10955b);
            case 11:
                return Braze.changeUser$lambda$137$lambda$132(this.f10955b);
            case 12:
                return Braze.changeUser$lambda$137$lambda$133(this.f10955b);
            case 13:
                return Braze.changeUser$lambda$137$lambda$134(this.f10955b);
            case 14:
                return Braze.changeUser$lambda$137$lambda$136(this.f10955b);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return Braze.deserializeContentCard$lambda$146(this.f10955b);
            case 16:
                return Braze.verifyProperSdkSetup$lambda$207(this.f10955b);
            case 17:
                return Braze.logCustomEvent$lambda$44(this.f10955b);
            case 18:
                return Braze._set_registeredPushToken_$lambda$36$lambda$33(this.f10955b);
            case 19:
                return Braze._set_registeredPushToken_$lambda$36$lambda$35(this.f10955b);
            case 20:
                return Braze.setSdkAuthenticationSignature$lambda$157(this.f10955b);
            case 21:
                return Braze.logPushDelivery$lambda$193(this.f10955b);
            case 22:
                return BrazeUser.removeFromCustomAttributeArray$lambda$54(this.f10955b);
            case 23:
                return BrazeUser.unsetCustomUserAttribute$lambda$60(this.f10955b);
            case 24:
                return BrazeUser.addToSubscriptionGroup$lambda$29(this.f10955b);
            case 25:
                return BrazeUser.setPhoneNumber$lambda$36$lambda$35(this.f10955b);
            case 26:
                return BrazeUser.setCountry$lambda$20(this.f10955b);
            case 27:
                return BrazeUser.setCustomUserAttribute$lambda$46(this.f10955b);
            case 28:
                return BrazeUser.setCustomUserAttribute$lambda$47(this.f10955b);
            default:
                return BrazeUser.setCustomUserAttribute$lambda$48(this.f10955b);
        }
    }
}
