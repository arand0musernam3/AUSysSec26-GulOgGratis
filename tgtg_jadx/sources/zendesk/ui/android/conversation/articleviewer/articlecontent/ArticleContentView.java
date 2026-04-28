package zendesk.ui.android.conversation.articleviewer.articlecontent;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.q;
import androidx.webkit.WebViewClientCompat;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.braze.Constants;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.d;
import o30.f0;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xa.b;
import ya.g;
import ya.k;
import ya.l;
import ya.o;
import yi.a0;
import zendesk.logger.Logger;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.common.retryerror.RetryErrorRendering;
import zendesk.ui.android.common.retryerror.RetryErrorState;
import zendesk.ui.android.common.retryerror.RetryErrorView;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentCarouselCellState;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentCarouselCellView;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentCarouselRendering;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentItem;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentState;
import zendesk.ui.android.conversations.LoadingIndicatorRendering;
import zendesk.ui.android.conversations.LoadingIndicatorState;
import zendesk.ui.android.conversations.LoadingIndicatorView;
import zendesk.ui.android.internal.WebViewKtxKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 -2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001-B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u001c\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030#H\u0016J\b\u0010$\u001a\u00020!H\u0002J\b\u0010%\u001a\u00020!H\u0002J\b\u0010&\u001a\u00020!H\u0002J\b\u0010'\u001a\u00020!H\u0002J\b\u0010(\u001a\u00020!H\u0002J\b\u0010)\u001a\u00020!H\u0002J\b\u0010*\u001a\u00020!H\u0002J\b\u0010+\u001a\u00020!H\u0002J\b\u0010,\u001a\u00020!H\u0002R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "rendering", MessageBundle.TITLE_ENTRY, "Landroid/widget/TextView;", "webViewContainer", "Landroid/widget/FrameLayout;", "webView", "Lzendesk/ui/android/conversation/articleviewer/articlecontent/NonScrollingWebView;", "scrollView", "Landroid/widget/ScrollView;", "loadingIndicatorView", "Lzendesk/ui/android/conversations/LoadingIndicatorView;", "retryErrorView", "Lzendesk/ui/android/common/retryerror/RetryErrorView;", "articleAttachmentCarousel", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentCarouselCellView;", "constraintLayout", "bottomSpacer", "Landroid/view/View;", "createWebView", "render", "", "renderingUpdate", "Lkotlin/Function1;", "renderAttachmentListCarousel", "renderWebViewContent", "renderHtmlBodyWithCss", "setupWebViewClient", "renderRetryErrorView", "renderLoadingIndicatorView", "showArticleView", "showLoading", "showErrorView", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
@SourceDebugExtension({"SMAP\nArticleContentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticleContentView.kt\nzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n257#2,2:315\n257#2,2:318\n257#2,2:320\n257#2,2:322\n257#2,2:324\n257#2,2:326\n257#2,2:328\n257#2,2:330\n257#2,2:332\n257#2,2:334\n257#2,2:336\n257#2,2:338\n257#2,2:340\n257#2,2:342\n1#3:317\n*S KotlinDebug\n*F\n+ 1 ArticleContentView.kt\nzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentView\n*L\n147#1:315,2\n265#1:318,2\n266#1:320,2\n267#1:322,2\n268#1:324,2\n269#1:326,2\n271#1:328,2\n282#1:330,2\n296#1:332,2\n297#1:334,2\n298#1:336,2\n302#1:338,2\n303#1:340,2\n304#1:342,2\n*E\n"})
public final class ArticleContentView extends ConstraintLayout implements Renderer<ArticleContentRendering> {

    @Deprecated
    public static final int COMPLETED_LOADING = 100;

    @Deprecated
    public static final int REMOVE_ALPHA = 2;

    @Deprecated
    @NotNull
    public static final String TYPE_TEXT_HTML = "text/html";

    @Deprecated
    @NotNull
    public static final String UTF_8_ENCODING_TYPE = "UTF-8";

    @NotNull
    private final ArticleAttachmentCarouselCellView articleAttachmentCarousel;

    @Nullable
    private final View bottomSpacer;

    @Nullable
    private final ConstraintLayout constraintLayout;

    @NotNull
    private final LoadingIndicatorView loadingIndicatorView;

    @NotNull
    private ArticleContentRendering rendering;

    @NotNull
    private final RetryErrorView retryErrorView;

    @NotNull
    private final ScrollView scrollView;

    @NotNull
    private final TextView title;

    @Nullable
    private final NonScrollingWebView webView;

    @NotNull
    private final FrameLayout webViewContainer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArticleContentState.ArticleLoadingStatus.values().length];
            try {
                iArr[ArticleContentState.ArticleLoadingStatus.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ArticleContentState.ArticleLoadingStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ArticleContentState.ArticleLoadingStatus.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ArticleContentState.ArticleLoadingStatus.IDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleContentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        WebSettings settings;
        WebSettings settings2;
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new ArticleContentRendering();
        View.inflate(context, R.layout.zuia_view_article_content, this);
        View viewFindViewById = findViewById(R.id.zuia_article_webview_container);
        viewFindViewById.getClass();
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        this.webViewContainer = frameLayout;
        NonScrollingWebView nonScrollingWebViewCreateWebView = createWebView(context);
        this.webView = nonScrollingWebViewCreateWebView;
        if (nonScrollingWebViewCreateWebView != null) {
            frameLayout.addView(nonScrollingWebViewCreateWebView);
        }
        View viewFindViewById2 = findViewById(R.id.zuia_article_loading_indicator_view);
        viewFindViewById2.getClass();
        this.loadingIndicatorView = (LoadingIndicatorView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.zuia_article_retry_error_view);
        viewFindViewById3.getClass();
        this.retryErrorView = (RetryErrorView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.zuia_article_title);
        viewFindViewById4.getClass();
        this.title = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.zuia_article_scrollview);
        viewFindViewById5.getClass();
        this.scrollView = (ScrollView) viewFindViewById5;
        this.bottomSpacer = findViewById(R.id.zuia_article_bottom_spacer);
        this.constraintLayout = (ConstraintLayout) findViewById(R.id.zuia_article_content_constraint_layout);
        View viewFindViewById6 = findViewById(R.id.zuia_article_attachment_carousel);
        viewFindViewById6.getClass();
        this.articleAttachmentCarousel = (ArticleAttachmentCarouselCellView) viewFindViewById6;
        if (nonScrollingWebViewCreateWebView != null && (settings2 = nonScrollingWebViewCreateWebView.getSettings()) != null) {
            settings2.setJavaScriptEnabled(true);
        }
        if (nonScrollingWebViewCreateWebView != null && (settings = nonScrollingWebViewCreateWebView.getSettings()) != null) {
            settings.setDomStorageEnabled(true);
        }
        if (nonScrollingWebViewCreateWebView != null) {
            WebViewKtxKt.setupContentTheming(nonScrollingWebViewCreateWebView);
        }
        setupWebViewClient();
    }

    private final NonScrollingWebView createWebView(Context context) {
        try {
            NonScrollingWebView nonScrollingWebView = new NonScrollingWebView(context, null, 0, 0, 14, null);
            nonScrollingWebView.setLayoutParams(new ConstraintLayout.a(-1, -2));
            return nonScrollingWebView;
        } catch (Exception unused) {
            return null;
        }
    }

    private final void renderAttachmentListCarousel() {
        this.articleAttachmentCarousel.render(new a(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleAttachmentCarouselRendering renderAttachmentListCarousel$lambda$5(ArticleContentView articleContentView, ArticleAttachmentCarouselRendering articleAttachmentCarouselRendering) {
        articleAttachmentCarouselRendering.getClass();
        return articleAttachmentCarouselRendering.toBuilder().state(new a(articleContentView, 0)).onAttachmentItemClicked(new a(articleContentView, 1)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleAttachmentCarouselCellState renderAttachmentListCarousel$lambda$5$lambda$3(ArticleContentView articleContentView, ArticleAttachmentCarouselCellState articleAttachmentCarouselCellState) {
        articleAttachmentCarouselCellState.getClass();
        return articleAttachmentCarouselCellState.copy(articleContentView.rendering.getState().getAttachmentList$zendesk_ui_ui_android(), articleContentView.rendering.getState().getAttachmentListTextColor(), articleContentView.rendering.getState().getNavigationButtonBackgroundColor(), articleContentView.rendering.getState().getFocusedStateBorderColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderAttachmentListCarousel$lambda$5$lambda$4(ArticleContentView articleContentView, ArticleAttachmentItem articleAttachmentItem) {
        articleAttachmentItem.getClass();
        articleContentView.rendering.getOnAttachmentItemClicked$zendesk_ui_ui_android().invoke(articleAttachmentItem);
        return Unit.f26487a;
    }

    private final void renderHtmlBodyWithCss() {
        String title;
        ArticleContentState.ArticleData articleData$zendesk_ui_ui_android = this.rendering.getState().getArticleData$zendesk_ui_ui_android();
        if (articleData$zendesk_ui_ui_android != null && (title = articleData$zendesk_ui_ui_android.getTitle()) != null) {
            this.title.setText(title);
        }
        this.title.setTextColor(this.rendering.getState().getTextColor$zendesk_ui_ui_android());
        ArticleContentState.ArticleData articleData$zendesk_ui_ui_android2 = this.rendering.getState().getArticleData$zendesk_ui_ui_android();
        if (articleData$zendesk_ui_ui_android2 != null) {
            String strCreateHTML = ArticleHTMLGenerator.INSTANCE.createHTML(d.a(this.rendering.getState().getTextColor$zendesk_ui_ui_android()).substring(2), d.a(this.rendering.getState().getBackgroundColor$zendesk_ui_ui_android()).substring(2), articleData$zendesk_ui_ui_android2.getHtmlBody());
            NonScrollingWebView nonScrollingWebView = this.webView;
            if (nonScrollingWebView != null) {
                nonScrollingWebView.loadDataWithBaseURL(articleData$zendesk_ui_ui_android2.getBaseUrl(), strCreateHTML, TYPE_TEXT_HTML, UTF_8_ENCODING_TYPE, null);
            }
        }
    }

    private final void renderLoadingIndicatorView() {
        this.loadingIndicatorView.render(new a(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoadingIndicatorRendering renderLoadingIndicatorView$lambda$14(ArticleContentView articleContentView, LoadingIndicatorRendering loadingIndicatorRendering) {
        loadingIndicatorRendering.getClass();
        return loadingIndicatorRendering.toBuilder().state(new a(articleContentView, 4)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoadingIndicatorState renderLoadingIndicatorView$lambda$14$lambda$13(ArticleContentView articleContentView, LoadingIndicatorState loadingIndicatorState) {
        loadingIndicatorState.getClass();
        return loadingIndicatorState.copy(true, articleContentView.rendering.getState().getIndicatorColor$zendesk_ui_ui_android());
    }

    private final void renderRetryErrorView() {
        this.retryErrorView.render(new a(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetryErrorRendering renderRetryErrorView$lambda$12(ArticleContentView articleContentView, RetryErrorRendering retryErrorRendering) {
        retryErrorRendering.getClass();
        String string = articleContentView.getContext().getString(R.string.zuia_guide_article_view_article_failed_to_load_label);
        string.getClass();
        return retryErrorRendering.toBuilder().state(new xq.a(16, articleContentView, string)).onButtonClicked(new y.a(articleContentView, 27)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderRetryErrorView$lambda$12$lambda$11(ArticleContentView articleContentView) {
        if (articleContentView.webView != null) {
            articleContentView.rendering.getOnRetryButtonClicked$zendesk_ui_ui_android().invoke();
            articleContentView.showLoading();
        } else {
            Logger.e("ArticleContentView", "Failed to render WebView", new Object[0]);
            articleContentView.showErrorView();
            articleContentView.rendering.getOnLoadingUpdated$zendesk_ui_ui_android().invoke(ArticleContentState.ArticleLoadingStatus.FAILED);
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetryErrorState renderRetryErrorView$lambda$12$lambda$8(ArticleContentView articleContentView, String str, RetryErrorState retryErrorState) {
        retryErrorState.getClass();
        int textColor$zendesk_ui_ui_android = articleContentView.rendering.getState().getTextColor$zendesk_ui_ui_android();
        String string = articleContentView.getContext().getString(R.string.zuia_guide_article_view_tap_to_retry_label);
        string.getClass();
        return retryErrorState.copy(str, articleContentView.rendering.getState().getTextColor$zendesk_ui_ui_android(), string, textColor$zendesk_ui_ui_android);
    }

    private final void renderWebViewContent() {
        this.title.setVisibility(8);
        renderHtmlBodyWithCss();
    }

    private final void setupWebViewClient() {
        NonScrollingWebView nonScrollingWebView = this.webView;
        if (nonScrollingWebView != null) {
            nonScrollingWebView.setWebChromeClient(new WebChromeClient());
        }
        NonScrollingWebView nonScrollingWebView2 = this.webView;
        if (nonScrollingWebView2 != null) {
            nonScrollingWebView2.setWebViewClient(new AnonymousClass1());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showArticleView() {
        this.retryErrorView.setVisibility(8);
        this.loadingIndicatorView.setVisibility(8);
        this.scrollView.setVisibility(0);
        this.title.setVisibility(0);
        this.articleAttachmentCarousel.setVisibility(!this.rendering.getState().getAttachmentList$zendesk_ui_ui_android().isEmpty() ? 0 : 8);
        boolean zIsEmpty = this.rendering.getState().getAttachmentList$zendesk_ui_ui_android().isEmpty();
        ArticleAttachmentCarouselCellView articleAttachmentCarouselCellView = this.articleAttachmentCarousel;
        if (zIsEmpty) {
            articleAttachmentCarouselCellView.setVisibility(8);
            q qVar = new q();
            qVar.e(this.constraintLayout);
            qVar.f(R.id.zuia_article_bottom_spacer, 3, R.id.zuia_article_webview_container, 4);
            qVar.b(this.constraintLayout);
            return;
        }
        articleAttachmentCarouselCellView.setVisibility(0);
        q qVar2 = new q();
        qVar2.e(this.constraintLayout);
        qVar2.f(R.id.zuia_article_bottom_spacer, 3, R.id.zuia_article_attachment_carousel, 4);
        qVar2.b(this.constraintLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorView() {
        this.loadingIndicatorView.setVisibility(8);
        this.scrollView.setVisibility(8);
        this.retryErrorView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading() {
        this.retryErrorView.setVisibility(8);
        this.scrollView.setVisibility(8);
        this.loadingIndicatorView.setVisibility(0);
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ArticleContentRendering, ? extends ArticleContentRendering> renderingUpdate) {
        renderingUpdate.getClass();
        ArticleContentState state = this.rendering.getState();
        ArticleContentRendering articleContentRendering = (ArticleContentRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = articleContentRendering;
        ArticleContentState state2 = articleContentRendering.getState();
        renderLoadingIndicatorView();
        renderRetryErrorView();
        if (!this.rendering.getState().getAttachmentList$zendesk_ui_ui_android().isEmpty()) {
            renderAttachmentListCarousel();
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.rendering.getState().getStatus$zendesk_ui_ui_android().ordinal()];
        if (i11 == 1) {
            showErrorView();
            return;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                showLoading();
                return;
            } else {
                if (i11 == 4) {
                    return;
                }
                e40.a.f();
                return;
            }
        }
        if (this.webView != null) {
            if (Intrinsics.areEqual(state, state2)) {
                return;
            }
            renderWebViewContent();
        } else {
            Logger.e("ArticleContentView", "Failed to render WebView", new Object[0]);
            showErrorView();
            this.rendering.getOnLoadingUpdated$zendesk_ui_ui_android().invoke(ArticleContentState.ArticleLoadingStatus.FAILED);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentView$Companion;", "", "<init>", "()V", "TYPE_TEXT_HTML", "", "UTF_8_ENCODING_TYPE", "COMPLETED_LOADING", "", "REMOVE_ALPHA", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView$setupWebViewClient$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0007\u0010\u000bJ-\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"zendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentView$setupWebViewClient$1", "Landroidx/webkit/WebViewClientCompat;", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Landroid/graphics/Bitmap;", "facIcon", "", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Lxa/b;", StatusResponseUtils.RESULT_ERROR, "onReceivedError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Lxa/b;)V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends WebViewClientCompat {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onPageStarted$lambda$0(ArticleContentView articleContentView) {
            articleContentView.scrollView.smoothScrollTo(0, 0);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            if (view == null || view.getProgress() != 100) {
                return;
            }
            ArticleContentView.this.showArticleView();
            ArticleContentView.this.rendering.getOnLoadingUpdated$zendesk_ui_ui_android().invoke(ArticleContentState.ArticleLoadingStatus.SUCCESS);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap facIcon) {
            ArticleContentView.this.showLoading();
            ArticleContentView.this.scrollView.post(new a0(ArticleContentView.this, 3));
            ArticleContentView.this.rendering.getOnLoadingUpdated$zendesk_ui_ui_android().invoke(ArticleContentState.ArticleLoadingStatus.LOADING);
        }

        @Override // androidx.webkit.WebViewClientCompat
        public void onReceivedError(WebView view, WebResourceRequest request, b error) {
            view.getClass();
            request.getClass();
            error.getClass();
            ArticleContentView.this.showErrorView();
            ArticleContentView.this.rendering.getOnLoadingUpdated$zendesk_ui_ui_android().invoke(ArticleContentState.ArticleLoadingStatus.FAILED);
            if (f0.F("WEB_RESOURCE_ERROR_GET_CODE") && f0.F("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && request.isForMainFrame()) {
                g gVar = (g) error;
                k.f45794b.getClass();
                if (gVar.f45789a == null) {
                    o oVar = l.f45800a;
                    gVar.f45789a = (WebResourceError) oVar.f45802a.convertWebResourceError(Proxy.getInvocationHandler(gVar.f45790b));
                }
                int errorCode = gVar.f45789a.getErrorCode();
                k.f45793a.getClass();
                if (gVar.f45789a == null) {
                    o oVar2 = l.f45800a;
                    gVar.f45789a = (WebResourceError) oVar2.f45802a.convertWebResourceError(Proxy.getInvocationHandler(gVar.f45790b));
                }
                onReceivedError(view, errorCode, gVar.f45789a.getDescription().toString(), request.getUrl().toString());
            }
        }

        @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.getClass();
            request.getClass();
            return ((Boolean) ArticleContentView.this.rendering.getShouldOverrideUrl$zendesk_ui_ui_android().invoke(request.getUrl().toString())).booleanValue();
        }

        @Override // android.webkit.WebViewClient
        @u70.d
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (url != null) {
                return ((Boolean) ArticleContentView.this.rendering.getShouldOverrideUrl$zendesk_ui_ui_android().invoke(url)).booleanValue();
            }
            return super.shouldOverrideUrlLoading(view, url);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleContentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleContentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ArticleContentView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleContentView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
