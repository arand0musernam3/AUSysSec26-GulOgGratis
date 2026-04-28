package com.braze.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.o0;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.enums.Channel;
import com.braze.models.inappmessage.m;
import com.braze.models.inappmessage.n;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.ViewUtils;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/braze/ui/BrazeWebViewActivity;", "Landroidx/fragment/app/o0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/webkit/WebChromeClient;", "createWebChromeClient", "()Landroid/webkit/WebChromeClient;", "Landroid/webkit/WebViewClient;", "createWebViewClient", "()Landroid/webkit/WebViewClient;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
public class BrazeWebViewActivity extends o0 {

    /* JADX INFO: renamed from: com.braze.ui.BrazeWebViewActivity$createWebChromeClient$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/braze/ui/BrazeWebViewActivity$createWebChromeClient$1", "Landroid/webkit/WebChromeClient;", "onConsoleMessage", "", "cm", "Landroid/webkit/ConsoleMessage;", "getDefaultVideoPoster", "Landroid/graphics/Bitmap;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBrazeWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeWebViewActivity.kt\ncom/braze/ui/BrazeWebViewActivity$createWebChromeClient$1\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,164:1\n84#2,6:165\n*S KotlinDebug\n*F\n+ 1 BrazeWebViewActivity.kt\ncom/braze/ui/BrazeWebViewActivity$createWebChromeClient$1\n*L\n105#1:165,6\n*E\n"})
    public static final class AnonymousClass1 extends WebChromeClient {
        /* JADX INFO: Access modifiers changed from: private */
        public static final String onConsoleMessage$lambda$0(ConsoleMessage consoleMessage) {
            return "Braze WebView Activity log. Line: " + consoleMessage.lineNumber() + ". SourceId: " + consoleMessage.sourceId() + ". Log Level: " + consoleMessage.messageLevel() + ". Message: " + consoleMessage.message();
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage cm2) {
            cm2.getClass();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(cm2, 0), 7, (Object) null);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreate$lambda$1() {
        return "Error creating BrazeWebViewActivity. Webview will not display.";
    }

    @NotNull
    public WebChromeClient createWebChromeClient() {
        return new AnonymousClass1();
    }

    @NotNull
    public WebViewClient createWebViewClient() {
        return new C01441();
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        try {
            super.onCreate(savedInstanceState);
            getWindow().setFlags(16777216, 16777216);
            if (BrazeInternal.INSTANCE.getConfigurationProvider(this).getShouldUseWindowFlagSecureInActivities()) {
                getWindow().setFlags(8192, 8192);
            }
            setContentView(R.layout.com_braze_webview_activity);
            WebView webView = (WebView) findViewById(R.id.com_braze_webview_activity_webview);
            webView.setLayerType(2, null);
            WebSettings settings = webView.getSettings();
            settings.getClass();
            settings.setAllowFileAccess(false);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setDisplayZoomControls(false);
            settings.setDomStorageEnabled(true);
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            if (ViewUtils.isDeviceInNightMode(applicationContext)) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    settings.setAlgorithmicDarkeningAllowed(true);
                } else if (i11 >= 29) {
                    settings.setForceDark(2);
                }
            }
            webView.setWebChromeClient(createWebChromeClient());
            webView.setWebViewClient(createWebViewClient());
            Bundle extras = getIntent().getExtras();
            if (extras == null || (string = extras.getString(Constants.BRAZE_WEBVIEW_URL_EXTRA)) == null) {
                return;
            }
            webView.loadUrl(string);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new m(14), 4, (Object) null);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.BrazeWebViewActivity$createWebViewClient$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0017J\u001f\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"com/braze/ui/BrazeWebViewActivity$createWebViewClient$1", "Landroid/webkit/WebViewClient;", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "handleUrlOverride", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Boolean;", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBrazeWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeWebViewActivity.kt\ncom/braze/ui/BrazeWebViewActivity$createWebViewClient$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,164:1\n29#2:165\n*S KotlinDebug\n*F\n+ 1 BrazeWebViewActivity.kt\ncom/braze/ui/BrazeWebViewActivity$createWebViewClient$1\n*L\n135#1:165\n*E\n"})
    public static final class C01441 extends WebViewClient {
        public C01441() {
        }

        private final Boolean handleUrlOverride(Context context, String url) {
            try {
                if (CollectionsKt.I(BrazeFileUtils.REMOTE_SCHEMES, Uri.parse(url).getScheme())) {
                    return null;
                }
                UriAction uriActionCreateUriActionFromUrlString = BrazeDeeplinkHandler.INSTANCE.getInstance().createUriActionFromUrlString(url, BrazeWebViewActivity.this.getIntent().getExtras(), false, Channel.UNKNOWN);
                if (uriActionCreateUriActionFromUrlString == null) {
                    return Boolean.FALSE;
                }
                uriActionCreateUriActionFromUrlString.execute(context);
                BrazeWebViewActivity.this.finish();
                return Boolean.TRUE;
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new n(url, 2), 4, (Object) null);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleUrlOverride$lambda$0(String str) {
            return a0.p("Unexpected exception while processing url ", str, ". Passing url back to WebView.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onRenderProcessGone$lambda$1() {
            return "The webview rendering process crashed, returning true";
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
            view.getClass();
            detail.getClass();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new m(15), 6, (Object) null);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.getClass();
            request.getClass();
            Context context = view.getContext();
            context.getClass();
            String string = request.getUrl().toString();
            string.getClass();
            Boolean boolHandleUrlOverride = handleUrlOverride(context, string);
            return boolHandleUrlOverride != null ? boolHandleUrlOverride.booleanValue() : super.shouldOverrideUrlLoading(view, request);
        }

        @Override // android.webkit.WebViewClient
        @d
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.getClass();
            url.getClass();
            Context context = view.getContext();
            context.getClass();
            Boolean boolHandleUrlOverride = handleUrlOverride(context, url);
            return boolHandleUrlOverride != null ? boolHandleUrlOverride.booleanValue() : super.shouldOverrideUrlLoading(view, url);
        }
    }
}
