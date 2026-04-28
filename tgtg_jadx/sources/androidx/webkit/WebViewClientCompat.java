package androidx.webkit;

import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c4.i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import na0.a;
import o30.f0;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import xa.b;
import ya.e;
import ya.g;
import ya.k;
import ya.l;
import ya.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        g gVar = new g();
        gVar.f45790b = (WebResourceErrorBoundaryInterface) a.W(WebResourceErrorBoundaryInterface.class, invocationHandler);
        onReceivedError(webView, webResourceRequest, gVar);
    }

    public abstract void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, b bVar);

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i11, xa.a aVar) {
        if (!f0.F("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            throw k.a();
        }
        e eVar = (e) aVar;
        eVar.getClass();
        ya.b bVar = k.f45795c;
        if (bVar.a()) {
            if (eVar.f45786a == null) {
                eVar.f45786a = l.f45800a.a(Proxy.getInvocationHandler(eVar.f45787b));
            }
            i.b(eVar.f45786a);
        } else {
            if (!bVar.b()) {
                throw k.a();
            }
            if (eVar.f45787b == null) {
                o oVar = l.f45800a;
                eVar.f45787b = (SafeBrowsingResponseBoundaryInterface) a.W(SafeBrowsingResponseBoundaryInterface.class, oVar.f45802a.convertSafeBrowsingResponse(eVar.f45786a));
            }
            eVar.f45787b.showInterstitial(true);
        }
    }

    public boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        g gVar = new g();
        gVar.f45789a = webResourceError;
        onReceivedError(webView, webResourceRequest, gVar);
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i11, SafeBrowsingResponse safeBrowsingResponse) {
        e eVar = new e();
        eVar.f45786a = safeBrowsingResponse;
        onSafeBrowsingHit(webView, webResourceRequest, i11, eVar);
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i11, InvocationHandler invocationHandler) {
        e eVar = new e();
        eVar.f45787b = (SafeBrowsingResponseBoundaryInterface) a.W(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
        onSafeBrowsingHit(webView, webResourceRequest, i11, eVar);
    }
}
