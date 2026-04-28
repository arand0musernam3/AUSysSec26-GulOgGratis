package zendesk.ui.android.conversation.conversationextension;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.logger.Logger;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.common.retryerror.RetryErrorRendering;
import zendesk.ui.android.common.retryerror.RetryErrorState;
import zendesk.ui.android.common.retryerror.RetryErrorView;
import zendesk.ui.android.conversation.conversationextension.conversationextensionheader.ConversationExtensionHeaderRendering;
import zendesk.ui.android.conversation.conversationextension.conversationextensionheader.ConversationExtensionHeaderState;
import zendesk.ui.android.conversation.conversationextension.conversationextensionheader.ConversationExtensionHeaderView;
import zendesk.ui.android.conversations.LoadingIndicatorRendering;
import zendesk.ui.android.conversations.LoadingIndicatorState;
import zendesk.ui.android.conversations.LoadingIndicatorView;
import zendesk.ui.android.internal.WebViewKtxKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 12\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u00011B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u000f\u0010\u001f\u001a\u0004\u0018\u00010 H\u0003¢\u0006\u0002\u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0002\u0010!J\u0012\u0010#\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\b\u0010&\u001a\u00020 H\u0002J\b\u0010'\u001a\u00020 H\u0002J\u001c\u0010(\u001a\u00020 2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030*H\u0016J\b\u0010+\u001a\u00020 H\u0002J\b\u0010,\u001a\u00020 H\u0002J\b\u0010-\u001a\u00020 H\u0002J\b\u0010.\u001a\u00020 H\u0002J\b\u0010/\u001a\u00020 H\u0002J\b\u00100\u001a\u00020 H\u0002R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "rendering", "header", "Lzendesk/ui/android/conversation/conversationextension/conversationextensionheader/ConversationExtensionHeaderView;", "webView", "Landroid/webkit/WebView;", "webViewContainer", "Landroid/widget/FrameLayout;", "loadingIndicatorView", "Lzendesk/ui/android/conversations/LoadingIndicatorView;", "retryErrorView", "Lzendesk/ui/android/common/retryerror/RetryErrorView;", "errorReceived", "", "hasCompletedLoading", "isRedirect", "webViewJavaScriptApi", "Lzendesk/ui/android/conversation/conversationextension/WebViewJavaScriptApi;", "createWebView", "configureWebView", "", "()Lkotlin/Unit;", "setupWebViewClient", "handleError", "request", "Landroid/webkit/WebResourceRequest;", "onErrorReceived", "showContentView", "render", "renderingUpdate", "Lkotlin/Function1;", "renderHeader", "renderLoadingIndicatorView", "renderRetryErrorView", "renderWebViewContent", "showLoading", "showErrorView", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationExtensionView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationExtensionView.kt\nzendesk/ui/android/conversation/conversationextension/ConversationExtensionView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,312:1\n257#2,2:313\n257#2,2:315\n257#2,2:317\n257#2,2:319\n257#2,2:321\n257#2,2:323\n257#2,2:325\n257#2,2:327\n257#2,2:329\n*S KotlinDebug\n*F\n+ 1 ConversationExtensionView.kt\nzendesk/ui/android/conversation/conversationextension/ConversationExtensionView\n*L\n191#1:313,2\n192#1:315,2\n193#1:317,2\n296#1:319,2\n297#1:321,2\n298#1:323,2\n302#1:325,2\n303#1:327,2\n304#1:329,2\n*E\n"})
public final class ConversationExtensionView extends ConstraintLayout implements Renderer<ConversationExtensionRendering> {

    @Deprecated
    public static final int COMPLETED_LOADING = 100;

    @Deprecated
    @NotNull
    public static final String JAVASCRIPT_INTERFACE_API_NAME = "AndroidWebviewInterface";
    private boolean errorReceived;
    private boolean hasCompletedLoading;

    @NotNull
    private final ConversationExtensionHeaderView header;
    private boolean isRedirect;

    @NotNull
    private final LoadingIndicatorView loadingIndicatorView;

    @NotNull
    private ConversationExtensionRendering rendering;

    @NotNull
    private final RetryErrorView retryErrorView;

    @Nullable
    private final WebView webView;

    @NotNull
    private final FrameLayout webViewContainer;

    @NotNull
    private final WebViewJavaScriptApi webViewJavaScriptApi;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ConversationExtensionHeaderState.ButtonName.values().length];
            try {
                iArr[ConversationExtensionHeaderState.ButtonName.CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConversationExtensionHeaderState.ButtonName.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConversationExtensionLoadingState.values().length];
            try {
                iArr2[ConversationExtensionLoadingState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ConversationExtensionLoadingState.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ConversationExtensionLoadingState.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ConversationExtensionLoadingState.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationExtensionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new ConversationExtensionRendering();
        this.webViewJavaScriptApi = new WebViewJavaScriptApi(new a(this, 0), new b(this, 0));
        View.inflate(context, R.layout.zuia_view_conversation_extension, this);
        View viewFindViewById = findViewById(R.id.zuia_conversation_extension_header_view);
        viewFindViewById.getClass();
        this.header = (ConversationExtensionHeaderView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_conversation_extension_web_view_container);
        viewFindViewById2.getClass();
        FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
        this.webViewContainer = frameLayout;
        WebView webViewCreateWebView = createWebView(context);
        this.webView = webViewCreateWebView;
        if (webViewCreateWebView != null) {
            frameLayout.addView(webViewCreateWebView);
        }
        View viewFindViewById3 = findViewById(R.id.zuia_conversation_extension_loading_indicator_view);
        viewFindViewById3.getClass();
        this.loadingIndicatorView = (LoadingIndicatorView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.zuia_conversation_extension_retry_error_view);
        viewFindViewById4.getClass();
        this.retryErrorView = (RetryErrorView) viewFindViewById4;
        configureWebView();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final Unit configureWebView() {
        WebView webView = this.webView;
        if (webView == null) {
            return null;
        }
        WebViewKtxKt.setupContentTheming(webView);
        setupWebViewClient();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.addJavascriptInterface(this.webViewJavaScriptApi, JAVASCRIPT_INTERFACE_API_NAME);
        return Unit.f26487a;
    }

    private final WebView createWebView(Context context) {
        try {
            WebView webView = new WebView(context);
            webView.setLayoutParams(new ConstraintLayout.a(-1, -1));
            return webView;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(WebResourceRequest request) {
        if (request == null || !request.isForMainFrame()) {
            return;
        }
        onErrorReceived();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onErrorReceived() {
        this.rendering.getOnWebViewError$zendesk_ui_ui_android().invoke();
        this.errorReceived = true;
    }

    private final void renderHeader() {
        this.header.render(new b(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationExtensionHeaderRendering renderHeader$lambda$7(ConversationExtensionView conversationExtensionView, ConversationExtensionHeaderRendering conversationExtensionHeaderRendering) {
        conversationExtensionHeaderRendering.getClass();
        return conversationExtensionHeaderRendering.toBuilder().state(new b(conversationExtensionView, 5)).onMenuItemClicked(new b(conversationExtensionView, 6)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationExtensionHeaderState renderHeader$lambda$7$lambda$5(ConversationExtensionView conversationExtensionView, ConversationExtensionHeaderState conversationExtensionHeaderState) {
        conversationExtensionHeaderState.getClass();
        boolean showBackButton$zendesk_ui_ui_android = conversationExtensionView.rendering.getState().getShowBackButton$zendesk_ui_ui_android();
        return ConversationExtensionHeaderState.copy$default(conversationExtensionHeaderState, conversationExtensionView.rendering.getState().getBackgroundColor$zendesk_ui_ui_android(), conversationExtensionView.rendering.getState().getButtonBackgroundColor$zendesk_ui_ui_android(), conversationExtensionView.rendering.getState().getIconColor$zendesk_ui_ui_android(), 0, showBackButton$zendesk_ui_ui_android, conversationExtensionView.rendering.getState().getTitle$zendesk_ui_ui_android(), conversationExtensionView.rendering.getState().getTextColor$zendesk_ui_ui_android(), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderHeader$lambda$7$lambda$6(ConversationExtensionView conversationExtensionView, ConversationExtensionHeaderState.ButtonName buttonName) {
        buttonName.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[buttonName.ordinal()];
        if (i11 == 1) {
            conversationExtensionView.rendering.getOnCloseButtonClicked$zendesk_ui_ui_android().invoke();
        } else {
            if (i11 != 2) {
                e40.a.f();
                return null;
            }
            conversationExtensionView.rendering.getOnBackButtonClicked$zendesk_ui_ui_android().invoke();
        }
        return Unit.f26487a;
    }

    private final void renderLoadingIndicatorView() {
        this.loadingIndicatorView.render(new b(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoadingIndicatorRendering renderLoadingIndicatorView$lambda$9(ConversationExtensionView conversationExtensionView, LoadingIndicatorRendering loadingIndicatorRendering) {
        loadingIndicatorRendering.getClass();
        return loadingIndicatorRendering.toBuilder().state(new b(conversationExtensionView, 2)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoadingIndicatorState renderLoadingIndicatorView$lambda$9$lambda$8(ConversationExtensionView conversationExtensionView, LoadingIndicatorState loadingIndicatorState) {
        loadingIndicatorState.getClass();
        return loadingIndicatorState.copy(true, conversationExtensionView.rendering.getState().getIndicatorColor$zendesk_ui_ui_android());
    }

    private final void renderRetryErrorView() {
        this.retryErrorView.render(new b(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetryErrorRendering renderRetryErrorView$lambda$12(ConversationExtensionView conversationExtensionView, RetryErrorRendering retryErrorRendering) {
        retryErrorRendering.getClass();
        String string = conversationExtensionView.getContext().getString(R.string.zuia_guide_article_view_article_failed_to_load_label);
        string.getClass();
        return retryErrorRendering.toBuilder().state(new xq.a(18, conversationExtensionView, string)).onButtonClicked(new a(conversationExtensionView, 1)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetryErrorState renderRetryErrorView$lambda$12$lambda$10(ConversationExtensionView conversationExtensionView, String str, RetryErrorState retryErrorState) {
        retryErrorState.getClass();
        int textColor$zendesk_ui_ui_android = conversationExtensionView.rendering.getState().getTextColor$zendesk_ui_ui_android();
        String string = conversationExtensionView.getContext().getString(R.string.zuia_guide_article_view_tap_to_retry_label);
        string.getClass();
        return retryErrorState.copy(str, conversationExtensionView.rendering.getState().getTextColor$zendesk_ui_ui_android(), string, textColor$zendesk_ui_ui_android);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderRetryErrorView$lambda$12$lambda$11(ConversationExtensionView conversationExtensionView) {
        conversationExtensionView.rendering.getOnRetryButtonClicked$zendesk_ui_ui_android().invoke();
        return Unit.f26487a;
    }

    private final void renderWebViewContent() {
        int i11 = WhenMappings.$EnumSwitchMapping$1[this.rendering.getState().getContentState$zendesk_ui_ui_android().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    showErrorView();
                    return;
                } else if (i11 == 4) {
                    showContentView();
                    return;
                } else {
                    e40.a.f();
                    return;
                }
            }
            WebView webView = this.webView;
            if (webView == null) {
                Logger.e("ConversationExtensionView", "Error inflating WebView", new Object[0]);
                this.errorReceived = true;
                showErrorView();
                return;
            }
            this.errorReceived = false;
            showLoading();
            webView.getSettings().setUserAgentString(webView.getSettings().getUserAgentString() + " AndroidWebview/" + this.rendering.getState().getUserAgent$zendesk_ui_ui_android());
            webView.loadUrl(this.rendering.getState().getUrl$zendesk_ui_ui_android());
        }
    }

    private final Unit setupWebViewClient() {
        WebView webView = this.webView;
        if (webView == null) {
            return null;
        }
        webView.setWebViewClient(new WebViewClient() { // from class: zendesk.ui.android.conversation.conversationextension.ConversationExtensionView$setupWebViewClient$1$1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                String strReplaceFirst;
                super.onPageFinished(view, url);
                if (view == null || view.getProgress() != 100 || this.this$0.errorReceived) {
                    return;
                }
                String url2 = view.getUrl();
                if (url2 != null) {
                    strReplaceFirst = new Regex("^https?://").f26587a.matcher(url2).replaceFirst("");
                    strReplaceFirst.getClass();
                } else {
                    strReplaceFirst = null;
                }
                if (!Intrinsics.areEqual(view.getTitle(), strReplaceFirst) && !Intrinsics.areEqual(view.getTitle(), view.getUrl())) {
                    this.this$0.rendering.getOnWebSdkUpdateTitle$zendesk_ui_ui_android().invoke(view.getTitle());
                }
                if (!this.this$0.hasCompletedLoading || this.this$0.isRedirect) {
                    this.this$0.rendering.getOnPageLoadingComplete$zendesk_ui_ui_android().invoke();
                    this.this$0.hasCompletedLoading = true;
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                if (!this.this$0.hasCompletedLoading || this.this$0.isRedirect) {
                    this.this$0.hasCompletedLoading = false;
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                this.this$0.handleError(request);
                super.onReceivedError(view, request, error);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
                this.this$0.handleError(request);
                super.onReceivedHttpError(view, request, errorResponse);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Uri url;
                boolean zIsValidUrl = (request == null || (url = request.getUrl()) == null) ? false : URLUtil.isValidUrl(url.toString());
                if (request == null || !request.isForMainFrame() || !zIsValidUrl) {
                    return super.shouldOverrideUrlLoading(view, request);
                }
                this.this$0.isRedirect = true;
                this.this$0.showLoading();
                Uri url2 = request.getUrl();
                if (url2 != null) {
                    Function1<String, Unit> onUrlUpdated$zendesk_ui_ui_android = this.this$0.rendering.getOnUrlUpdated$zendesk_ui_ui_android();
                    String string = url2.toString();
                    string.getClass();
                    onUrlUpdated$zendesk_ui_ui_android.invoke(string);
                }
                return true;
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                this.this$0.onErrorReceived();
                super.onReceivedError(view, errorCode, description, failingUrl);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url != null ? URLUtil.isValidUrl(url) : false) {
                    this.this$0.isRedirect = true;
                    this.this$0.showLoading();
                    this.this$0.rendering.getOnUrlUpdated$zendesk_ui_ui_android().invoke(url);
                    return true;
                }
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
        return Unit.f26487a;
    }

    private final void showContentView() {
        this.retryErrorView.setVisibility(8);
        this.loadingIndicatorView.setVisibility(8);
        this.webViewContainer.setVisibility(0);
    }

    private final void showErrorView() {
        this.loadingIndicatorView.setVisibility(8);
        this.webViewContainer.setVisibility(8);
        this.retryErrorView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading() {
        this.retryErrorView.setVisibility(8);
        this.webViewContainer.setVisibility(8);
        this.loadingIndicatorView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webViewJavaScriptApi$lambda$0(ConversationExtensionView conversationExtensionView) {
        conversationExtensionView.rendering.getOnWebSdkClose$zendesk_ui_ui_android().invoke();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webViewJavaScriptApi$lambda$1(ConversationExtensionView conversationExtensionView, String str) {
        conversationExtensionView.rendering.getOnWebSdkUpdateTitle$zendesk_ui_ui_android().invoke(str);
        return Unit.f26487a;
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ConversationExtensionRendering, ? extends ConversationExtensionRendering> renderingUpdate) {
        renderingUpdate.getClass();
        ConversationExtensionRendering conversationExtensionRendering = (ConversationExtensionRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = conversationExtensionRendering;
        setBackgroundColor(conversationExtensionRendering.getState().getBackgroundColor$zendesk_ui_ui_android());
        renderHeader();
        renderLoadingIndicatorView();
        renderRetryErrorView();
        renderWebViewContent();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionView$Companion;", "", "<init>", "()V", "COMPLETED_LOADING", "", "JAVASCRIPT_INTERFACE_API_NAME", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationExtensionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationExtensionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ConversationExtensionView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationExtensionView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
