package com.braze.ui.inappmessage;

import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10930a;

    public /* synthetic */ d(int i11) {
        this.f10930a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10930a) {
            case 0:
                return BrazeInAppMessageManager.verifyOrientationStatus$lambda$60();
            case 1:
                return BrazeInAppMessageManager.verifyOrientationStatus$lambda$61();
            case 2:
                return BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$23();
            case 3:
                return BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$0();
            case 4:
                return BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$1();
            case 5:
                return BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$3();
            case 6:
                return BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$4();
            case 7:
                return BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$7();
            case 8:
                return BrazeInAppMessageManager.pauseWebviewIfNecessary$lambda$62();
            case 9:
                return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$24();
            case 10:
                return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$34();
            case 11:
                return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$25();
            case 12:
                return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$26();
            case 13:
                return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$27();
            case 14:
                return DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$12$lambda$8();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$13();
            case 16:
                return DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$14();
            case 17:
                return DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$15();
            case 18:
                return DefaultInAppMessageViewWrapper.close$lambda$3();
            case 19:
                return DefaultInAppMessageViewWrapper.close$lambda$5$lambda$4();
            case 20:
                return DefaultInAppMessageViewWrapper.createButtonClickListeners$lambda$21$lambda$17();
            case 21:
                return DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$12$lambda$9();
            case 22:
                return DefaultInAppMessageViewWrapper.open$lambda$0();
            case 23:
                return DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$12$lambda$10();
            case 24:
                return DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$12$lambda$11();
            case 25:
                return DefaultInAppMessageViewWrapper.closeInAppMessageView$lambda$24();
            case 26:
                return DefaultInAppMessageViewWrapper.closeInAppMessageView$lambda$26();
            case 27:
                return DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$6();
            case 28:
                return DefaultInAppMessageViewWrapper.Companion.setAllViewGroupChildrenAsNonAccessibilityImportant$lambda$0();
            default:
                return DefaultInAppMessageViewWrapper.Companion.resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto$lambda$1();
        }
    }
}
