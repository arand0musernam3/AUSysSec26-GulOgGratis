package co.datadome.sdk;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.n1;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.app.tgtg.feature.ServerMessageActivity;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookServiceException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import q90.d0;
import q90.g0;
import q90.p0;
import q90.r0;
import tx.n0;
import tx.t0;
import tx.u0;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: loaded from: classes.dex */
public final class e extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8652b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f8651a = i11;
        this.f8652b = obj;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ProgressDialog progressDialog;
        switch (this.f8651a) {
            case 0:
                super.onPageFinished(webView, str);
                ChallengeActivity challengeActivity = (ChallengeActivity) this.f8652b;
                challengeActivity.f8624k.setValue(challengeActivity, ChallengeActivity.f8613m[0], Boolean.FALSE);
                Intent intent = new Intent();
                intent.setAction("co.datadome.sdk.CAPTCHA_RESULT");
                if (!challengeActivity.f8618e) {
                    intent.putExtra("captcha_result", 1);
                    d9.c.a(challengeActivity).c(intent);
                }
                break;
            case 1:
                webView.getClass();
                str.getClass();
                ((ServerMessageActivity) this.f8652b).z().f34894t.setVisibility(8);
                break;
            default:
                webView.getClass();
                str.getClass();
                super.onPageFinished(webView, str);
                u0 u0Var = (u0) this.f8652b;
                if (!u0Var.f40567j && (progressDialog = u0Var.f40562e) != null) {
                    progressDialog.dismiss();
                }
                FrameLayout frameLayout = u0Var.f40564g;
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(0);
                }
                t0 t0Var = u0Var.f40561d;
                if (t0Var != null) {
                    t0Var.setVisibility(0);
                }
                ImageView imageView = u0Var.f40563f;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                u0Var.f40568k = true;
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ProgressDialog progressDialog;
        int i11 = this.f8651a;
        Object obj = this.f8652b;
        switch (i11) {
            case 0:
                super.onPageStarted(webView, str, bitmap);
                ChallengeActivity challengeActivity = (ChallengeActivity) obj;
                challengeActivity.f8624k.setValue(challengeActivity, ChallengeActivity.f8613m[0], Boolean.TRUE);
                break;
            case 1:
                webView.getClass();
                str.getClass();
                ((ServerMessageActivity) obj).z().f34894t.setVisibility(0);
                break;
            default:
                webView.getClass();
                str.getClass();
                ax.a0 a0Var = ax.a0.f4849a;
                super.onPageStarted(webView, str, bitmap);
                u0 u0Var = (u0) obj;
                if (!u0Var.f40567j && (progressDialog = u0Var.f40562e) != null) {
                    progressDialog.show();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int i11 = this.f8651a;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        switch (i11) {
            case 0:
                if (webResourceError != null) {
                    int errorCode = webResourceError.getErrorCode();
                    String str = (String) ChallengeActivity.f8614n.get(Integer.valueOf(errorCode));
                    if (str != null) {
                        Log.e("DataDome", "Get Webview error (" + errorCode + "): " + str + ". Dismiss challenge");
                    }
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.f8651a) {
            case 2:
                webView.getClass();
                sslErrorHandler.getClass();
                sslError.getClass();
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                sslErrorHandler.cancel();
                ((u0) this.f8652b).e(new FacebookDialogException(null, -11, null));
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f8651a) {
            case 0:
                ChallengeActivity challengeActivity = (ChallengeActivity) this.f8652b;
                webView.getClass();
                webResourceRequest.getClass();
                String string = webResourceRequest.getUrl().toString();
                string.getClass();
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                if (requestHeaders == null) {
                    requestHeaders = new LinkedHashMap<>();
                }
                String str = requestHeaders.get("Accept");
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String strZ = ArticleContentView.TYPE_TEXT_HTML;
                if (StringsKt.z(str, ArticleContentView.TYPE_TEXT_HTML, false)) {
                    try {
                        n1 n1Var = new n1();
                        n1Var.D(string);
                        for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            if (value != null) {
                                n1Var.e(key, value);
                            }
                        }
                        String str3 = challengeActivity.f8622i;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        n1Var.u("Accept-Language", str2);
                        d0 d0Var = challengeActivity.f8623j;
                        g0 g0Var = new g0(n1Var);
                        d0Var.getClass();
                        p0 p0VarF = new u90.n(d0Var, g0Var, false).f();
                        r0 r0Var = p0VarF.f36588g;
                        if (r0Var != null) {
                            String strE = p0.e("Content-Type", p0VarF);
                            if (strE != null) {
                                strZ = StringsKt.Z(strE, ";");
                            }
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                break;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i11;
        int i12 = this.f8651a;
        Object obj = this.f8652b;
        switch (i12) {
            case 0:
                webView.getClass();
                str.getClass();
                ChallengeActivity challengeActivity = (ChallengeActivity) obj;
                if (DataDomeUtils.isNullOrEmpty(challengeActivity.f8622i).booleanValue()) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                HashMap map = new HashMap();
                map.put("Accept-Language", challengeActivity.f8622i);
                webView.loadUrl(str, map);
                return true;
            case 1:
            default:
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                u0 u0Var = (u0) obj;
                webView.getClass();
                str.getClass();
                ax.a0 a0Var = ax.a0.f4849a;
                Uri uri = Uri.parse(str);
                boolean z11 = uri.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", uri.getPath());
                if (!kotlin.text.y.p(str, u0Var.f40559b, false)) {
                    if (kotlin.text.y.p(str, "fbconnect://cancel", false)) {
                        u0Var.cancel();
                        return true;
                    }
                    if (!z11 && !StringsKt.z(str, "touch", false)) {
                        try {
                            u0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            return true;
                        } catch (ActivityNotFoundException unused) {
                        }
                    }
                    return false;
                }
                Bundle bundleC = u0Var.c(str);
                String string = bundleC.getString(StatusResponseUtils.RESULT_ERROR);
                if (string == null) {
                    string = bundleC.getString("error_type");
                }
                String string2 = bundleC.getString("error_msg");
                if (string2 == null) {
                    string2 = bundleC.getString("error_message");
                }
                if (string2 == null) {
                    string2 = bundleC.getString("error_description");
                }
                String string3 = bundleC.getString("error_code");
                if (string3 != null && !n0.x(string3)) {
                    try {
                        i11 = Integer.parseInt(string3);
                    } catch (NumberFormatException unused2) {
                        i11 = -1;
                    }
                    break;
                } else {
                    i11 = -1;
                }
                if (n0.x(string) && n0.x(string2) && i11 == -1) {
                    tx.p0 p0Var = u0Var.f40560c;
                    if (p0Var == null || u0Var.f40566i) {
                        return true;
                    }
                    u0Var.f40566i = true;
                    p0Var.a(bundleC, null);
                    u0Var.dismiss();
                    return true;
                }
                if (string != null && (Intrinsics.areEqual(string, "access_denied") || Intrinsics.areEqual(string, "OAuthAccessDeniedException"))) {
                    u0Var.cancel();
                    return true;
                }
                if (i11 == 4201) {
                    u0Var.cancel();
                    return true;
                }
                u0Var.e(new FacebookServiceException(new ax.w(i11, string, string2), string2));
                return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i11, String str, String str2) {
        switch (this.f8651a) {
            case 2:
                webView.getClass();
                str.getClass();
                str2.getClass();
                super.onReceivedError(webView, i11, str, str2);
                ((u0) this.f8652b).e(new FacebookDialogException(str, i11, str2));
                break;
            default:
                super.onReceivedError(webView, i11, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f8651a) {
            case 0:
                webView.getClass();
                webResourceRequest.getClass();
                ChallengeActivity challengeActivity = (ChallengeActivity) this.f8652b;
                if (!DataDomeUtils.isNullOrEmpty(challengeActivity.f8622i).booleanValue()) {
                    Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                    if (requestHeaders == null) {
                        requestHeaders = new LinkedHashMap<>();
                    }
                    requestHeaders.put("Accept-Language", challengeActivity.f8622i);
                    webView.loadUrl(webResourceRequest.getUrl().toString(), requestHeaders);
                }
                break;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
