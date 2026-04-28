package com.braze.ui.inappmessage.utils;

import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10942a;

    public /* synthetic */ a(int i11) {
        this.f10942a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10942a) {
            case 0:
                return BackgroundInAppMessagePreparer.AnonymousClass2.invokeSuspend$lambda$0();
            case 1:
                return BackgroundInAppMessagePreparer.AnonymousClass1.invokeSuspend$lambda$0();
            case 2:
                return BackgroundInAppMessagePreparer.AnonymousClass1.invokeSuspend$lambda$1();
            case 3:
                return BackgroundInAppMessagePreparer.prepareInAppMessage$lambda$0();
            case 4:
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload$lambda$10();
            case 5:
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload$lambda$11();
            case 6:
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload$lambda$13();
            case 7:
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload$lambda$14();
            case 8:
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithHtml$lambda$17();
            case 9:
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithHtml$lambda$18();
            case 10:
                return BackgroundInAppMessagePreparer.prepareInAppMessage$lambda$1();
            case 11:
                return BackgroundInAppMessagePreparer.prepareInAppMessage$lambda$2();
            case 12:
                return BackgroundInAppMessagePreparer.prepareInAppMessage$lambda$3();
            case 13:
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml$lambda$5();
            case 14:
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml$lambda$6();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload$lambda$9();
            case 16:
                return InAppMessageViewUtils.closeInAppMessageOnKeycodeBack$lambda$3();
            case 17:
                return InAppMessageViewUtils.setIcon$lambda$0();
            default:
                return InAppMessageViewUtils.setDrawableColor$lambda$2();
        }
    }
}
