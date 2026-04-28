package com.braze.ui.contentcards.adapters;

import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10913a;

    public /* synthetic */ a(int i11) {
        this.f10913a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10913a) {
            case 0:
                return ContentCardAdapter.markOnScreenCardsAsRead$lambda$4();
            case 1:
                return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$28();
            case 2:
                return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$29();
            case 3:
                return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$30();
            case 4:
                return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$31();
            case 5:
                return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$32();
            case 6:
                return BrazeInAppMessageManager.registerInAppMessageManager$lambda$9();
            case 7:
                return BrazeInAppMessageManager.registerInAppMessageManager$lambda$11();
            case 8:
                return BrazeInAppMessageManager.registerInAppMessageManager$lambda$14$lambda$13();
            case 9:
                return BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$20();
            case 10:
                return BrazeInAppMessageManager.registerInAppMessageManager$lambda$16$lambda$15();
            case 11:
                return BrazeInAppMessageManager.registerInAppMessageManager$lambda$18();
            case 12:
                return BrazeInAppMessageManager.displayInAppMessage$lambda$47();
            case 13:
                return BrazeInAppMessageManager.displayInAppMessage$lambda$48();
            case 14:
                return BrazeInAppMessageManager.displayInAppMessage$lambda$38();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BrazeInAppMessageManager.displayInAppMessage$lambda$39();
            case 16:
                return BrazeInAppMessageManager.displayInAppMessage$lambda$40();
            case 17:
                return BrazeInAppMessageManager.displayInAppMessage$lambda$41();
            case 18:
                return BrazeInAppMessageManager.displayInAppMessage$lambda$42();
            case 19:
                return BrazeInAppMessageManager.displayInAppMessage$lambda$43();
            case 20:
                return BrazeInAppMessageManager.displayInAppMessage$lambda$44();
            case 21:
                return BrazeInAppMessageManager.displayInAppMessage$lambda$45();
            case 22:
                return BrazeInAppMessageManager.displayInAppMessage$lambda$46();
            case 23:
                return BrazeInAppMessageManager.resumeWebviewIfNecessary$lambda$63();
            case 24:
                return BrazeInAppMessageManager.resetAfterInAppMessageClose$lambda$35();
            case 25:
                return BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$22();
            case 26:
                return BrazeInAppMessageManager.displayInAppMessage$lambda$51$lambda$49();
            case 27:
                return BrazeInAppMessageManager.displayInAppMessage$lambda$51$lambda$50();
            case 28:
                return BrazeInAppMessageManager.verifyOrientationStatus$lambda$58();
            default:
                return BrazeInAppMessageManager.verifyOrientationStatus$lambda$59();
        }
    }
}
