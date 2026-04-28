package com.braze.ui.banners;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.managers.IBannerView;
import com.braze.models.Banner;
import com.braze.ui.R;
import com.braze.ui.banners.jsinterface.BannerJavascriptInterface;
import com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener;
import com.braze.ui.banners.utils.BannerWebViewClient;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.WebViewUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import m0.l;
import mr.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sg.c;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\fB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u000fJ\u001a\u0010!\u001a\u00020\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010#\u001a\u00020\u001b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010%\u001a\u00020\u001bH\u0002R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/braze/ui/banners/BannerView;", "Landroid/webkit/WebView;", "Lcom/braze/managers/IBannerView;", "context", "Landroid/content/Context;", "placementId", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_placementId", "loadedHtml", "currentUserId", "value", "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "(Ljava/lang/String;)V", "heightCallback", "Lkotlin/Function1;", "", "", "getHeightCallback", "()Lkotlin/jvm/functions/Function1;", "setHeightCallback", "(Lkotlin/jvm/functions/Function1;)V", "internalHeightCallback", "init", "configureWebView", "initBanner", "loadHtmlData", "setWebviewToEmpty", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBannerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerView.kt\ncom/braze/ui/banners/BannerView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n58#2,2:161\n1#3:163\n*S KotlinDebug\n*F\n+ 1 BannerView.kt\ncom/braze/ui/banners/BannerView\n*L\n70#1:161,2\n*E\n"})
public final class BannerView extends WebView implements IBannerView {

    @Nullable
    private String _placementId;

    @Nullable
    private String currentUserId;

    @Nullable
    private Function1<? super Double, Unit> heightCallback;

    @NotNull
    private final Function1<Double, Unit> internalHeightCallback;

    @Nullable
    private String loadedHtml;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView(@NotNull Context context, @Nullable String str) {
        super(context);
        context.getClass();
        this.internalHeightCallback = new c(this, 13);
        this._placementId = str;
        init(null, 0);
    }

    private final void configureWebView(String placementId) {
        WebSettings settings = getSettings();
        settings.getClass();
        Context context = getContext();
        context.getClass();
        WebViewUtilsKt.setWebViewSettings(settings, context);
        setLayerType(2, null);
        setBackgroundColor(0);
        DefaultBannerWebViewClientListener defaultBannerWebViewClientListener = new DefaultBannerWebViewClientListener();
        Context context2 = getContext();
        context2.getClass();
        setWebViewClient(new BannerWebViewClient(context2, defaultBannerWebViewClientListener));
        Context context3 = getContext();
        context3.getClass();
        addJavascriptInterface(new BannerJavascriptInterface(context3, placementId, this.internalHeightCallback), InAppMessageHtmlBaseView.BRAZE_BRIDGE_PREFIX);
    }

    private final void init(AttributeSet attrs, int defStyle) {
        setBackgroundColor(0);
        Context context = getContext();
        context.getClass();
        int[] iArr = R.styleable.BannerView;
        iArr.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, iArr, defStyle, 0);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BannerView_placementId)) {
            this._placementId = typedArrayObtainStyledAttributes.getString(R.styleable.BannerView_placementId);
        }
        typedArrayObtainStyledAttributes.recycle();
        initBanner(get_placementId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit internalHeightCallback$lambda$0(BannerView bannerView, double d3) {
        Function1<? super Double, Unit> function1 = bannerView.heightCallback;
        if (function1 != null) {
            function1.invoke(Double.valueOf(d3));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadHtmlData(String placementId) {
        configureWebView(placementId);
        String str = this.loadedHtml;
        if (str != null) {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            String strEncodeToString = Base64.encodeToString(bytes, 1);
            if (strEncodeToString == null) {
                strEncodeToString = "";
            }
            loadData(strEncodeToString, ArticleContentView.TYPE_TEXT_HTML, "base64");
            invalidate();
        }
    }

    private final void setWebviewToEmpty() {
        this.loadedHtml = null;
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            new Handler(Looper.getMainLooper()).post(new l(this, 27));
            return;
        }
        loadData("", ArticleContentView.TYPE_TEXT_HTML, "base64");
        invalidate();
        this.internalHeightCallback.invoke(Double.valueOf(0.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setWebviewToEmpty$lambda$5(BannerView bannerView) {
        bannerView.loadData("", ArticleContentView.TYPE_TEXT_HTML, "base64");
        bannerView.invalidate();
        bannerView.internalHeightCallback.invoke(Double.valueOf(0.0d));
    }

    @Nullable
    public final Function1<Double, Unit> getHeightCallback() {
        return this.heightCallback;
    }

    @Nullable
    /* JADX INFO: renamed from: getPlacementId, reason: from getter */
    public final String get_placementId() {
        return this._placementId;
    }

    @Override // com.braze.managers.IBannerView
    public void initBanner(@Nullable String placementId) {
        Banner banner;
        if (placementId != null) {
            Braze.Companion companion = Braze.INSTANCE;
            Context context = getContext();
            context.getClass();
            banner = companion.getInstance(context).getBanner(placementId);
        } else {
            banner = null;
        }
        if (banner == null) {
            this.currentUserId = null;
            setWebviewToEmpty();
            if (placementId != null) {
                BrazeInternal.INSTANCE.addBannerViewMonitor(placementId, this, true);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(banner.getHtml(), this.loadedHtml) && Intrinsics.areEqual(banner.getUserId(), this.currentUserId)) {
            return;
        }
        this.loadedHtml = banner.getHtml();
        this.currentUserId = banner.getUserId();
        if (banner.getIsControl()) {
            setWebviewToEmpty();
        } else if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            loadHtmlData(placementId);
        } else {
            new Handler(Looper.getMainLooper()).post(new h(28, this, placementId));
        }
        BrazeInternal.INSTANCE.addBannerViewMonitor(banner.getPlacementId(), this, false);
    }

    public final void setHeightCallback(@Nullable Function1<? super Double, Unit> function1) {
        this.heightCallback = function1;
    }

    public final void setPlacementId(@Nullable String str) {
        this._placementId = str;
        initBanner(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView(@NotNull Context context) {
        super(context);
        context.getClass();
        this.internalHeightCallback = new c(this, 13);
        init(null, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.internalHeightCallback = new c(this, 13);
        init(attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        attributeSet.getClass();
        this.internalHeightCallback = new c(this, 13);
        init(attributeSet, i11);
    }
}
