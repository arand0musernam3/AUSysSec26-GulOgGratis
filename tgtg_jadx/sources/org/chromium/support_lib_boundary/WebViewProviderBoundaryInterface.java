package org.chromium.support_lib_boundary;

import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public interface WebViewProviderBoundaryInterface {
    InvocationHandler addDocumentStartJavaScript(String str, String[] strArr);

    void addWebMessageListener(String str, String[] strArr, InvocationHandler invocationHandler);

    InvocationHandler[] createWebMessageChannel();

    InvocationHandler getProfile();

    WebChromeClient getWebChromeClient();

    WebViewClient getWebViewClient();

    InvocationHandler getWebViewNavigationClient();

    InvocationHandler getWebViewRenderer();

    InvocationHandler getWebViewRendererClient();

    void insertVisualStateCallback(long j9, InvocationHandler invocationHandler);

    boolean isAudioMuted();

    void postMessageToMainFrame(InvocationHandler invocationHandler, Uri uri);

    void prerenderUrl(String str, CancellationSignal cancellationSignal, Executor executor, ValueCallback<Void> valueCallback, ValueCallback<Throwable> valueCallback2);

    void prerenderUrl(String str, CancellationSignal cancellationSignal, Executor executor, InvocationHandler invocationHandler, ValueCallback<Void> valueCallback, ValueCallback<Throwable> valueCallback2);

    void removeWebMessageListener(String str);

    void saveState(Bundle bundle, int i11, boolean z11);

    void setAudioMuted(boolean z11);

    void setProfile(String str);

    void setWebViewNavigationClient(InvocationHandler invocationHandler);

    void setWebViewRendererClient(InvocationHandler invocationHandler);
}
