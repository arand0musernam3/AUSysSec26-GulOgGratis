package com.braze.ui.inappmessage.views;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import r8.k;
import zendesk.messaging.android.internal.KnownUriSchemes;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J,\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/braze/ui/inappmessage/views/InAppMessageHtmlBaseView$messageWebView$6", "Landroid/webkit/WebChromeClient;", "onConsoleMessage", "", "cm", "Landroid/webkit/ConsoleMessage;", "onCreateWindow", "view", "Landroid/webkit/WebView;", "isDialog", "isUserGesture", "resultMsg", "Landroid/os/Message;", "getDefaultVideoPoster", "Landroid/graphics/Bitmap;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInAppMessageHtmlBaseView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageHtmlBaseView.kt\ncom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView$messageWebView$6\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,303:1\n29#2:304\n29#2:305\n29#2:306\n84#3,6:307\n*S KotlinDebug\n*F\n+ 1 InAppMessageHtmlBaseView.kt\ncom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView$messageWebView$6\n*L\n118#1:304\n124#1:305\n130#1:306\n151#1:307,6\n*E\n"})
public final class InAppMessageHtmlBaseView$messageWebView$6 extends WebChromeClient {
    final /* synthetic */ boolean $isLinkTargetSupported;
    final /* synthetic */ InAppMessageHtmlBaseView this$0;

    public InAppMessageHtmlBaseView$messageWebView$6(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, boolean z11) {
        this.this$0 = inAppMessageHtmlBaseView;
        this.$isLinkTargetSupported = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onConsoleMessage$lambda$0(ConsoleMessage consoleMessage) {
        return "Braze HTML In-app Message log. Line: " + consoleMessage.lineNumber() + ". SourceId: " + consoleMessage.sourceId() + ". Log Level: " + consoleMessage.messageLevel() + ". Message: " + consoleMessage.message();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$1() {
        return "linkTargetSupport not enabled, passing to super.onCreateWindow()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$2() {
        return "onCreateWindow webView is null, not opening link";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$3(WebView.HitTestResult hitTestResult) {
        return "onCreateWindow HitTestResult is " + hitTestResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$4(WebView.HitTestResult hitTestResult) {
        return k.h(hitTestResult.getType(), "onCreateWindow: hitTestResult type was ", ". Not doing anything.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$5(WebView.HitTestResult hitTestResult) {
        return "Failed to open link in new window. " + hitTestResult;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage cm2) {
        cm2.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.a(cm2, 1), 7, (Object) null);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
        if (!this.$isLinkTargetSupported) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new a(10), 6, (Object) null);
            return super.onCreateWindow(view, isDialog, isUserGesture, resultMsg);
        }
        if (view == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new a(11), 6, (Object) null);
            return false;
        }
        final WebView.HitTestResult hitTestResult = view.getHitTestResult();
        hitTestResult.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        final int i11 = 0;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.views.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$3(hitTestResult);
                    case 1:
                        return InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$4(hitTestResult);
                    default:
                        return InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$5(hitTestResult);
                }
            }
        }, 6, (Object) null);
        try {
            int type = hitTestResult.getType();
            if (type == 2) {
                this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(KnownUriSchemes.PHONE_NUMBER + hitTestResult.getExtra())));
                return false;
            }
            if (type == 4) {
                this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(KnownUriSchemes.EMAIL + hitTestResult.getExtra())));
                return false;
            }
            if (type != 7) {
                final int i12 = 1;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.views.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                return InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$3(hitTestResult);
                            case 1:
                                return InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$4(hitTestResult);
                            default:
                                return InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$5(hitTestResult);
                        }
                    }
                }, 6, (Object) null);
                return false;
            }
            String extra = hitTestResult.getExtra();
            this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", extra != null ? Uri.parse(extra) : null));
            return false;
        } catch (Exception e5) {
            final int i13 = 2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, new Function0() { // from class: com.braze.ui.inappmessage.views.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i13) {
                        case 0:
                            return InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$3(hitTestResult);
                        case 1:
                            return InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$4(hitTestResult);
                        default:
                            return InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$5(hitTestResult);
                    }
                }
            }, 4, (Object) null);
            return false;
        }
    }
}
