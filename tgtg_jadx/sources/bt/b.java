package bt;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ao.c;
import com.app.tgtg.customview.TGTGLoadingView;
import com.app.tgtg.model.remote.AppSettings;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f6701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TGTGLoadingView f6702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f6703c;

    public b(c cVar) {
        cVar.getClass();
        this.f6701a = cVar;
    }

    public final void a(Uri uri, WebView webView) {
        AppSettings appSettings = this.f6701a.f4197e;
        Collection webViewHostAllowlist = appSettings != null ? appSettings.getWebViewHostAllowlist() : null;
        if (webViewHostAllowlist == null) {
            webViewHostAllowlist = n0.f26529a;
        }
        if (webViewHostAllowlist == null || !webViewHostAllowlist.isEmpty()) {
            Iterator it = webViewHostAllowlist.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                String host = uri.getHost();
                if (host == null) {
                    host = "";
                }
                if (y.j(host, str, false)) {
                    if (Intrinsics.areEqual(uri.getScheme(), "https")) {
                        String path = uri.getPath();
                        if (path == null || !y.j(path, ".pdf", false)) {
                            webView.loadUrl(uri.toString());
                            return;
                        }
                        a aVar = this.f6703c;
                        if (aVar != null) {
                            aVar.m(uri);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        a aVar2 = this.f6703c;
        if (aVar2 != null) {
            aVar2.i(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        TGTGLoadingView tGTGLoadingView = this.f6702b;
        if (tGTGLoadingView != null) {
            tGTGLoadingView.setVisibility(8);
        }
        a aVar = this.f6703c;
        if (aVar != null) {
            aVar.onPageFinished();
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        TGTGLoadingView tGTGLoadingView = this.f6702b;
        if (tGTGLoadingView != null) {
            tGTGLoadingView.setVisibility(0);
        }
        a aVar = this.f6703c;
        if (aVar != null) {
            aVar.e();
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i11, String str, String str2) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        RuntimeException runtimeException = new RuntimeException("Error loading " + str2 + ": " + str + " (code: " + i11 + ")");
        a aVar = this.f6703c;
        if (aVar != null) {
            aVar.p(runtimeException);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        Uri url = webResourceRequest.getUrl();
        url.getClass();
        a(url, webView);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        a(Uri.parse(str), webView);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        RuntimeException runtimeException = new RuntimeException("Error loading " + webResourceRequest.getUrl() + ": " + ((Object) webResourceError.getDescription()));
        a aVar = this.f6703c;
        if (aVar != null) {
            aVar.p(runtimeException);
        }
    }
}
