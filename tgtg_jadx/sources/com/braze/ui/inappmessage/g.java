package com.braze.ui.inappmessage;

import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.views.IInAppMessageBackEventListener;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10934a;

    public /* synthetic */ g(int i11) {
        this.f10934a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10934a) {
            case 0:
                return DefaultInAppMessageViewWrapper.AnonymousClass1.onAnimationEnd$lambda$0();
            case 1:
                return DefaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1.onBackInvoked$lambda$0();
            case 2:
                return DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1.handleOnBackPressed$lambda$0();
            case 3:
                return InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1.onBackInvoked$lambda$0();
            case 4:
                return InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1.onBackProgressed$lambda$2();
            case 5:
                return InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1.onBackCancelled$lambda$3();
            case 6:
                return InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1.onBackStarted$lambda$1();
            case 7:
                return InAppMessageManagerBase.setCustomInAppMessageManagerListener$lambda$4();
            case 8:
                return InAppMessageManagerBase.setCustomInAppMessageViewWrapperFactory$lambda$9();
            case 9:
                return InAppMessageManagerBase.setCustomControlInAppMessageManagerListener$lambda$5();
            case 10:
                return InAppMessageManagerBase.setCustomHtmlInAppMessageActionListener$lambda$6();
            case 11:
                return InAppMessageManagerBase.setCustomInAppMessageAnimationFactory$lambda$7();
            case 12:
                return InAppMessageManagerBase.setCustomInAppMessageViewFactory$lambda$8();
            case 13:
                return DefaultInAppMessageViewLifecycleListener.performClickAction$lambda$7();
            case 14:
                return DefaultInAppMessageViewLifecycleListener.performClickAction$lambda$8();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return DefaultInAppMessageViewLifecycleListener.performClickAction$lambda$9();
            case 16:
                return DefaultInAppMessageViewLifecycleListener.afterOpened$lambda$1();
            case 17:
                return DefaultInAppMessageViewLifecycleListener.onButtonClicked$lambda$5();
            case 18:
                return DefaultInAppMessageViewLifecycleListener.onDismissed$lambda$6();
            case 19:
                return DefaultInAppMessageViewLifecycleListener.beforeClosed$lambda$2();
            case 20:
                return DefaultInAppMessageViewLifecycleListener.onClicked$lambda$4();
            case 21:
                return DefaultInAppMessageViewLifecycleListener.afterClosed$lambda$3();
            case 22:
                return DefaultInAppMessageViewLifecycleListener.beforeOpened$lambda$0();
            case 23:
                return DefaultInAppMessageWebViewClientListener.onCloseAction$lambda$0();
            case 24:
                return DefaultInAppMessageWebViewClientListener.onCloseAction$lambda$1();
            case 25:
                return DefaultInAppMessageWebViewClientListener.onCustomEventAction$lambda$2();
            case 26:
                return DefaultInAppMessageWebViewClientListener.onCustomEventAction$lambda$3();
            case 27:
                return DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$5();
            case 28:
                return IInAppMessageBackEventListener.onBackStarted$lambda$0();
            default:
                return IInAppMessageBackEventListener.onBackInvoked$lambda$2();
        }
    }
}
