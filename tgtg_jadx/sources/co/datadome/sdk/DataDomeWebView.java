package co.datadome.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0;
import com.braze.Constants;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001;B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0016¢\u0006\u0004\b\u000f\u0010\u0012J?\u0010\u0018\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\u000eJ'\u0010&\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0002¢\u0006\u0004\b&\u0010'R \u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b*\u0010+\u0012\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010+R\u0018\u00109\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lco/datadome/sdk/DataDomeWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "setupUrlFragmentLifecycleCallback", "(Ljava/lang/String;)V", "loadUrl", "", "additionalHttpHeaders", "(Ljava/lang/String;Ljava/util/Map;)V", "baseUrl", Bayeux.KEY_DATA, "mimeType", "encoding", "historyUrl", "loadDataWithBaseURL", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "postData", "postUrl", "(Ljava/lang/String;[B)V", "Landroid/webkit/WebViewClient;", "client", "setWebViewClient", "(Landroid/webkit/WebViewClient;)V", "syncCookieFromWebView", "Landroid/webkit/ValueCallback;", "", "callback", "syncCookieToWebView", "(Ljava/lang/String;Landroid/webkit/ValueCallback;)V", "", "Landroid/app/FragmentManager$FragmentLifecycleCallbacks;", "legacyFragmentLifecycleCallbacks", "Ljava/util/List;", "getLegacyFragmentLifecycleCallbacks$annotations", "()V", "Landroidx/fragment/app/FragmentManager$a;", "androidXFragmentLifecycleCallbacks", "Lkotlin/text/Regex;", "domainAttrPattern", "Lkotlin/text/Regex;", "fromShouldOverrideUrlLoading", "Z", "initialUrl", "Ljava/lang/String;", "Landroid/app/FragmentManager$OnBackStackChangedListener;", "legacyBackStackListeners", "userWebViewClient", "Landroid/webkit/WebViewClient;", "CompositeWebViewClient", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
@SourceDebugExtension({"SMAP\nDataDomeWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataDomeWebView.kt\nco/datadome/sdk/DataDomeWebView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,384:1\n1#2:385\n1855#3,2:386\n1855#3,2:388\n1855#3,2:390\n*S KotlinDebug\n*F\n+ 1 DataDomeWebView.kt\nco/datadome/sdk/DataDomeWebView\n*L\n75#1:386,2\n84#1:388,2\n91#1:390,2\n*E\n"})
public class DataDomeWebView extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f8634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebViewClient f8635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f8637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f8638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f8639f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataDomeWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f8634a = new Regex("(?i)\\bDomain\\b\\s*=\\s*[^;]+");
        this.f8638e = new ArrayList();
        this.f8639f = new ArrayList();
        new ArrayList();
        super.setWebViewClient(new j(this));
        CookieManager.getInstance().setAcceptCookie(true);
        getSettings().setJavaScriptEnabled(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public static void a(DataDomeWebView dataDomeWebView, String str) {
        str.getClass();
        super.loadUrl(str);
    }

    public static void b(DataDomeWebView dataDomeWebView, String str, byte[] bArr) {
        str.getClass();
        bArr.getClass();
        super.postUrl(str, bArr);
    }

    public static void c(DataDomeWebView dataDomeWebView, String str, Map map) {
        str.getClass();
        map.getClass();
        super.loadUrl(str, map);
    }

    public static void d(DataDomeWebView dataDomeWebView, String str, String str2, String str3, String str4, String str5) {
        str2.getClass();
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    private final void setupUrlFragmentLifecycleCallback(String url) {
        ArrayList arrayList;
        Object obj;
        this.f8637d = url;
        Context context = getContext();
        if (context instanceof o0) {
            k kVar = new k(this);
            Context context2 = getContext();
            context2.getClass();
            ((o0) context2).getSupportFragmentManager().W(kVar, true);
            arrayList = this.f8638e;
            obj = kVar;
        } else {
            if (!(context instanceof Activity)) {
                return;
            }
            l lVar = new l(this);
            Context context3 = getContext();
            context3.getClass();
            ((Activity) context3).getFragmentManager().registerFragmentLifecycleCallbacks(lVar, true);
            arrayList = this.f8639f;
            obj = lVar;
        }
        arrayList.add(obj);
    }

    private static final void setupUrlFragmentLifecycleCallback$lambda$11(DataDomeWebView dataDomeWebView) {
        dataDomeWebView.getClass();
        String str = dataDomeWebView.f8637d;
        str.getClass();
        dataDomeWebView.e(str);
    }

    public final void e(String str) {
        String cookie = CookieManager.getInstance().getCookie(str);
        if (cookie != null) {
            Matcher matcher = Pattern.compile("datadome=([^;]*)").matcher(cookie);
            String str2 = "";
            while (matcher.find()) {
                str2 = "datadome=" + matcher.group(1);
            }
            w wVarA = w.a(getContext(), q.f8678w);
            if (Intrinsics.areEqual(wVarA.d(), str2)) {
                return;
            }
            wVarA.c(str2);
        }
    }

    public final void f(String str, ValueCallback valueCallback) {
        String strD;
        if (!this.f8636c && (strD = w.a(getContext(), q.f8678w).d()) != null) {
            if (this.f8634a.a(strD)) {
                DataDomeUtils.d(str, c0.c(strD), valueCallback);
            } else {
                valueCallback.onReceiveValue(Boolean.FALSE);
            }
            if (Unit.f26487a != null) {
                return;
            }
        }
        valueCallback.onReceiveValue(Boolean.FALSE);
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(@Nullable final String baseUrl, @NotNull final String data, @Nullable final String mimeType, @Nullable final String encoding, @Nullable final String historyUrl) {
        Unit unit;
        data.getClass();
        if (baseUrl != null) {
            setupUrlFragmentLifecycleCallback(baseUrl);
            f(baseUrl, new ValueCallback() { // from class: co.datadome.sdk.i
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    DataDomeWebView.d(this.f8663a, baseUrl, data, mimeType, encoding, historyUrl);
                }
            });
            unit = Unit.f26487a;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.loadDataWithBaseURL(baseUrl, data, mimeType, encoding, historyUrl);
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(@NotNull String url, @NotNull Map<String, String> additionalHttpHeaders) {
        url.getClass();
        additionalHttpHeaders.getClass();
        setupUrlFragmentLifecycleCallback(url);
        f(url, new h(this, url, additionalHttpHeaders, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        String str = this.f8637d;
        if (str != null) {
            e(str);
        }
        Context context = getContext();
        if (context instanceof o0) {
            for (FragmentManager.a aVar : this.f8638e) {
                Context context2 = getContext();
                context2.getClass();
                ((o0) context2).getSupportFragmentManager().k0(aVar);
            }
            return;
        }
        if (context instanceof Activity) {
            for (FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks : this.f8639f) {
                Context context3 = getContext();
                context3.getClass();
                ((Activity) context3).getFragmentManager().unregisterFragmentLifecycleCallbacks(fragmentLifecycleCallbacks);
            }
        }
    }

    @Override // android.webkit.WebView
    public void postUrl(@NotNull String url, @NotNull byte[] postData) {
        url.getClass();
        postData.getClass();
        setupUrlFragmentLifecycleCallback(url);
        f(url, new h(this, url, postData, 1));
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(@NotNull WebViewClient client) {
        client.getClass();
        this.f8635b = client;
    }

    @Override // android.webkit.WebView
    public void loadUrl(@NotNull String url) {
        url.getClass();
        setupUrlFragmentLifecycleCallback(url);
        f(url, new a(this, url, 1));
    }

    private static /* synthetic */ void getLegacyFragmentLifecycleCallbacks$annotations() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataDomeWebView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataDomeWebView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ DataDomeWebView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
