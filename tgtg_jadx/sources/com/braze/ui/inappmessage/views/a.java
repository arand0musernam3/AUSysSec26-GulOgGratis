package com.braze.ui.inappmessage.views;

import com.app.tgtg.model.remote.item.AppliedFilter;
import com.app.tgtg.model.remote.item.BasicItemInformation;
import com.app.tgtg.model.remote.item.CateringItemInformation;
import com.app.tgtg.model.remote.item.CharityItemInformation;
import com.app.tgtg.model.remote.item.FlashSalesItemInformation;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10943a;

    public /* synthetic */ a(int i11) {
        this.f10943a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10943a) {
            case 0:
                return IInAppMessageBackEventListener.onBackCancelled$lambda$1();
            case 1:
                return InAppMessageFullView.applyDisplayCutoutMarginsToCloseButton$lambda$6();
            case 2:
                return InAppMessageFullView.resetMessageMargins$lambda$3$lambda$2$lambda$1();
            case 3:
                return InAppMessageFullView.applyDisplayCutoutMarginsToContentArea$lambda$7();
            case 4:
                return InAppMessageHtmlBaseView._get_messageWebView_$lambda$0();
            case 5:
                return InAppMessageHtmlBaseView._get_messageWebView_$lambda$1();
            case 6:
                return InAppMessageHtmlBaseView._get_messageWebView_$lambda$3();
            case 7:
                return InAppMessageHtmlBaseView._get_messageWebView_$lambda$4();
            case 8:
                return InAppMessageHtmlBaseView.setWebViewContent$lambda$7();
            case 9:
                return InAppMessageHtmlBaseView.finishWebViewDisplay$lambda$5();
            case 10:
                return InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$1();
            case 11:
                return InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$2();
            case 12:
                return InAppMessageImageView.clipCanvasToPath$lambda$0();
            case 13:
                return InAppMessageImageView.clipCanvasToPath$lambda$1();
            case 14:
                return InAppMessageImmersiveBaseView.setupDirectionalNavigation$lambda$0();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return InAppMessageImmersiveBaseView.setLargerCloseButtonClickArea$lambda$7();
            case 16:
                return InAppMessageModalView.resetMessageMargins$lambda$1$lambda$0();
            case 17:
                return InAppMessageSlideupView.applyWindowInsets$lambda$2();
            case 18:
                return AppliedFilter._childSerializers$_anonymous_();
            case 19:
                return BasicItemInformation._init_$_anonymous_();
            case 20:
                return CateringItemInformation._childSerializers$_anonymous_();
            case 21:
                return CateringItemInformation._childSerializers$_anonymous_$0();
            case 22:
                return CateringItemInformation._childSerializers$_anonymous_$1();
            case 23:
                return CharityItemInformation._childSerializers$_anonymous_();
            case 24:
                return CharityItemInformation._childSerializers$_anonymous_$0();
            case 25:
                return CharityItemInformation._childSerializers$_anonymous_$1();
            case 26:
                return CharityItemInformation._childSerializers$_anonymous_$2();
            case 27:
                return CharityItemInformation._childSerializers$_anonymous_$3();
            case 28:
                return FlashSalesItemInformation._childSerializers$_anonymous_();
            default:
                return FlashSalesItemInformation._childSerializers$_anonymous_$0();
        }
    }
}
