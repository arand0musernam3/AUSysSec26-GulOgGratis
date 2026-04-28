package co.datadome.sdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import co.datadome.sdk.DataDomeSDK;
import co.datadome.sdk.internal.SDKTestingMode;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.app.tgtg.R;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import q90.c0;
import q90.d0;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: loaded from: classes.dex */
public final class ChallengeActivity extends k.h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f8613m = {j4.s.t(ChallengeActivity.class, "isLoading", "isLoading()Z", 0), j4.s.t(ChallengeActivity.class, "isChallengeVisible", "isChallengeVisible()Z", 0)};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f8614n = x0.e(new Pair(-2, "ERROR_HOST_LOOKUP"), new Pair(-6, "ERROR_CONNECT"), new Pair(-8, "ERROR_TIMEOUT"), new Pair(-11, "ERROR_FAILED_SSL_HANDSHAKE"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mc.a f8615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f8616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8618e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f8621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f8622i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DataDomeSDK.BackBehaviour f8619f = DataDomeSDK.BackBehaviour.GO_BACKGROUND;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f8623j = new d0(new c0());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f8624k = new f(this, 0);
    public final f l = new f(this, 1);

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (((Boolean) this.l.getValue(this, f8613m[1])).booleanValue()) {
            return;
        }
        overridePendingTransition(0, 0);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int i11 = d.f8650a[this.f8619f.ordinal()];
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            try {
                mc.a aVar = this.f8615b;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aVar = null;
                }
                ((WebView) aVar.f29924d).stopLoading();
                finish();
                return;
            } catch (Exception unused) {
            } catch (Throwable th2) {
                finish();
                throw th2;
            }
        } else if (isFinishing() || !this.f8617d) {
            moveTaskToBack(true);
            return;
        }
        finish();
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mc.a aVar = null;
        int i11 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_challenge, (ViewGroup) null, false);
        int i12 = R.id.progressBar;
        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(R.id.progressBar);
        if (progressBar != null) {
            i12 = R.id.webview;
            WebView webView = (WebView) viewInflate.findViewById(R.id.webview);
            if (webView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f8615b = new mc.a(constraintLayout, progressBar, webView, i11);
                ViewCompat.k0(constraintLayout, new c50.w(2));
                Intent intent = getIntent();
                this.l.setValue(this, f8613m[1], Boolean.valueOf(intent.getBooleanExtra("responsePageVisibility", true)));
                this.f8618e = intent.getBooleanExtra("isSfcc", false);
                this.f8616c = intent.getStringExtra("captcha_url");
                DataDomeSDK.BackBehaviour backBehaviour = (DataDomeSDK.BackBehaviour) intent.getSerializableExtra("backBehaviour");
                if (backBehaviour == null) {
                    backBehaviour = DataDomeSDK.BackBehaviour.GO_BACKGROUND;
                }
                this.f8619f = backBehaviour;
                this.f8617d = intent.getBooleanExtra("is_response_type_hard_block", false);
                this.f8620g = getIntent().getBooleanExtra("is_response_type_HTML", false);
                this.f8621h = getIntent().getStringExtra("request_url");
                mc.a aVar2 = this.f8615b;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aVar2 = null;
                }
                setContentView((ConstraintLayout) aVar2.f29922b);
                CookieManager.getInstance().removeAllCookies(new c(new a(this, getIntent().getStringArrayListExtra("blockedResponseCookie"), 0), 2));
                CookieManager.getInstance().setAcceptCookie(true);
                String stringExtra = getIntent().getStringExtra("cookie");
                mc.a aVar3 = this.f8615b;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    aVar = aVar3;
                }
                WebView webView2 = (WebView) aVar.f29924d;
                webView2.setWebViewClient(new e(this, i11));
                webView2.setWebChromeClient(new WebChromeClient());
                WebSettings settings = webView2.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setAllowFileAccessFromFileURLs(false);
                if (SDKTestingMode.INSTANCE.isEnabled()) {
                    settings.setUserAgentString(settings.getUserAgentString() + getIntent().getStringExtra("user_agent"));
                }
                webView2.addJavascriptInterface(new t(new w2.z(21, stringExtra, this)), AnalyticsPlatformParams.channel);
                return;
            }
        }
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        mc.a aVar = this.f8615b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        ((WebView) aVar.f29924d).destroy();
        q.resetHandlingResponseInProgress();
        Intent intent = new Intent();
        intent.setAction("co.datadome.sdk.CAPTCHA_RESULT");
        intent.putExtra("captcha_result", 0);
        intent.putExtra("captcha_url", this.f8616c);
        d9.c.a(this).c(intent);
        super.onDestroy();
    }

    public final void z() {
        HashMap map = new HashMap();
        String stringExtra = getIntent().getStringExtra("responsePageLanguage");
        this.f8622i = stringExtra;
        if (!DataDomeUtils.isNullOrEmpty(stringExtra).booleanValue()) {
            map.put("Accept-Language", this.f8622i);
        }
        String str = this.f8616c;
        if (str != null) {
            boolean z11 = this.f8620g;
            mc.a aVar = this.f8615b;
            if (z11) {
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aVar = null;
                }
                ((WebView) aVar.f29924d).loadDataWithBaseURL(this.f8621h, str, ArticleContentView.TYPE_TEXT_HTML, ArticleContentView.UTF_8_ENCODING_TYPE, null);
            } else {
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aVar = null;
                }
                ((WebView) aVar.f29924d).loadUrl(str, map);
            }
            v.a("Loading challenge: ".concat(str));
        }
    }
}
