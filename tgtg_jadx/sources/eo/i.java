package eo;

import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.g1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityResultLauncher f16212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueCallback f16213b;

    public i(f fVar) {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fVar.registerForActivityResult(new g1(4), new e.b(this, 3));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.f16212a = activityResultLauncherRegisterForActivityResult;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z11, boolean z12, Message message) {
        webView.getClass();
        message.getClass();
        WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        hitTestResult.getClass();
        String extra = hitTestResult.getExtra();
        if (extra == null) {
            return false;
        }
        webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(extra)));
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent intentCreateIntent;
        this.f16213b = valueCallback;
        if (fileChooserParams == null || (intentCreateIntent = fileChooserParams.createIntent()) == null) {
            return true;
        }
        this.f16212a.a(intentCreateIntent, null);
        return true;
    }
}
