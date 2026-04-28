package com.braze.ui.support;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import b6.a;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import xa.c;
import ya.b;
import ya.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"TAG", "", "setWebViewSettings", "", "settings", "Landroid/webkit/WebSettings;", "context", "Landroid/content/Context;", "android-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WebViewUtilsKt {

    @NotNull
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("WebViewUtils");

    @SuppressLint({"SetJavaScriptEnabled"})
    public static final void setWebViewSettings(@NotNull WebSettings webSettings, @NotNull Context context) {
        webSettings.getClass();
        context.getClass();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAllowFileAccess(false);
        try {
            if (f0.F("FORCE_DARK") && ViewUtils.isDeviceInNightMode(context)) {
                b bVar = k.f45798f;
                if (bVar.a()) {
                    a.v(webSettings);
                } else {
                    if (!bVar.b()) {
                        throw k.a();
                    }
                    c.a(webSettings).e();
                }
            }
            if (f0.F("FORCE_DARK_STRATEGY")) {
                if (!k.f45799g.b()) {
                    throw k.a();
                }
                c.a(webSettings).f();
            }
        } catch (Throwable th2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th2, false, (Function0) new yu.a(9), 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setWebViewSettings$lambda$0() {
        return "Failed to set dark mode WebView settings.";
    }
}
