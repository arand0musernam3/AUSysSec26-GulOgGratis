package zendesk.ui.android.conversation.articleviewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qa.c0;
import qa.r;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentRendering;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentState;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;
import zendesk.ui.android.conversation.articleviewer.articleheader.ArticleHeaderRendering;
import zendesk.ui.android.conversation.articleviewer.articleheader.ArticleHeaderState;
import zendesk.ui.android.conversation.articleviewer.articleheader.ArticleHeaderView;
import zendesk.ui.android.conversation.articleviewer.feedbackbanner.ArticleFeedbackBannerRendering;
import zendesk.ui.android.conversation.articleviewer.feedbackbanner.ArticleFeedbackBannerState;
import zendesk.ui.android.conversation.articleviewer.feedbackbanner.ArticleFeedbackBannerView;
import zendesk.ui.android.conversation.quickreply.QuickReplyOption;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J(\u0010\u001b\u001a\u00020\u0015*\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u0002R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lzendesk/ui/android/conversation/articleviewer/ArticleViewer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/articleviewer/ArticleViewerRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "rendering", "header", "Lzendesk/ui/android/conversation/articleviewer/articleheader/ArticleHeaderView;", "articleContent", "Lzendesk/ui/android/conversation/articleviewer/articlecontent/ArticleContentView;", "feedbackBanner", "Lzendesk/ui/android/conversation/articleviewer/feedbackbanner/ArticleFeedbackBannerView;", "render", "", "renderingUpdate", "Lkotlin/Function1;", "renderArticleFeedbackBanner", "renderArticleContent", "renderArticleHeader", "setBannerVisibility", "parent", "Landroid/view/ViewGroup;", "show", "", InAppMessageBase.DURATION, "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArticleViewer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticleViewer.kt\nzendesk/ui/android/conversation/articleviewer/ArticleViewer\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,161:1\n257#2,2:162\n257#2,2:164\n*S KotlinDebug\n*F\n+ 1 ArticleViewer.kt\nzendesk/ui/android/conversation/articleviewer/ArticleViewer\n*L\n66#1:162,2\n158#1:164,2\n*E\n"})
public final class ArticleViewer extends ConstraintLayout implements Renderer<ArticleViewerRendering> {
    public static final int $stable = 8;

    @Nullable
    private final ArticleContentView articleContent;

    @Nullable
    private final ArticleFeedbackBannerView feedbackBanner;

    @Nullable
    private final ArticleHeaderView header;

    @NotNull
    private ArticleViewerRendering rendering;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArticleContentState.ArticleLoadingStatus.values().length];
            try {
                iArr[ArticleContentState.ArticleLoadingStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ArticleContentState.ArticleLoadingStatus.FAILED.ordinal()] = 2;
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
    public ArticleViewer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new ArticleViewerRendering();
        View.inflate(context, R.layout.zuia_view_article_viewer, this);
        this.header = (ArticleHeaderView) findViewById(R.id.zuia_article_viewer_header);
        this.articleContent = (ArticleContentView) findViewById(R.id.zuia_article_viewer_content);
        this.feedbackBanner = (ArticleFeedbackBannerView) findViewById(R.id.zuia_article_viewer_feedback_banner);
    }

    private final void renderArticleContent() {
        ArticleContentView articleContentView = this.articleContent;
        if (articleContentView != null) {
            articleContentView.render(new a(this, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleContentRendering renderArticleContent$lambda$5(ArticleViewer articleViewer, ArticleContentRendering articleContentRendering) {
        articleContentRendering.getClass();
        return articleContentRendering.toBuilder().state(new a(articleViewer, 2)).shouldOverrideUrl(articleViewer.rendering.getShouldOverrideUrl$zendesk_ui_ui_android()).onLoadingUpdated(new a(articleViewer, 3)).onRetryButtonClicked(articleViewer.rendering.getOnRetryButtonClicked$zendesk_ui_ui_android()).onAttachmentItemClicked(articleViewer.rendering.getOnAttachmentItemClicked$zendesk_ui_ui_android()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleContentState renderArticleContent$lambda$5$lambda$3(ArticleViewer articleViewer, ArticleContentState articleContentState) {
        articleContentState.getClass();
        return articleContentState.copy(articleViewer.rendering.getState().getArticleData$zendesk_ui_ui_android(), articleViewer.rendering.getState().getTextColor$zendesk_ui_ui_android(), articleViewer.rendering.getState().getBackgroundColor$zendesk_ui_ui_android(), articleViewer.rendering.getState().getIndicatorColor$zendesk_ui_ui_android(), articleViewer.rendering.getState().getContentState$zendesk_ui_ui_android(), articleViewer.rendering.getState().getAttachmentList$zendesk_ui_ui_android(), articleViewer.rendering.getState().getAttachmentListTextColor(), articleViewer.rendering.getState().getNavigationButtonBackgroundColor(), articleViewer.rendering.getState().getFocusedStateBorderColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderArticleContent$lambda$5$lambda$4(ArticleViewer articleViewer, ArticleContentState.ArticleLoadingStatus articleLoadingStatus) {
        articleLoadingStatus.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[articleLoadingStatus.ordinal()];
        if (i11 == 1) {
            ArticleFeedbackBannerView articleFeedbackBannerView = articleViewer.feedbackBanner;
            if (articleFeedbackBannerView != null) {
                setBannerVisibility$default(articleViewer, articleFeedbackBannerView, articleViewer, articleViewer.rendering.getState().getShouldShowFeedbackBanner$zendesk_ui_ui_android(), 0L, 4, null);
            }
        } else if (i11 != 2 && i11 != 3 && i11 != 4) {
            e40.a.f();
            return null;
        }
        return Unit.f26487a;
    }

    private final void renderArticleFeedbackBanner() {
        ArticleFeedbackBannerView articleFeedbackBannerView = this.feedbackBanner;
        if (articleFeedbackBannerView != null) {
            articleFeedbackBannerView.render(new a(this, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleFeedbackBannerRendering renderArticleFeedbackBanner$lambda$2(ArticleViewer articleViewer, ArticleFeedbackBannerRendering articleFeedbackBannerRendering) {
        articleFeedbackBannerRendering.getClass();
        return articleFeedbackBannerRendering.toBuilder().state(new a(articleViewer, 5)).onFeedbackBannerOptionClicked(new a(articleViewer, 6)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleFeedbackBannerState renderArticleFeedbackBanner$lambda$2$lambda$0(ArticleViewer articleViewer, ArticleFeedbackBannerState articleFeedbackBannerState) {
        articleFeedbackBannerState.getClass();
        return articleFeedbackBannerState.copy(articleViewer.rendering.getState().getTextColor$zendesk_ui_ui_android(), articleViewer.rendering.getState().getBackgroundColor$zendesk_ui_ui_android(), articleViewer.rendering.getState().getButtonColor$zendesk_ui_ui_android(), articleViewer.rendering.getState().getFeedBackBannerOptions$zendesk_ui_ui_android());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderArticleFeedbackBanner$lambda$2$lambda$1(ArticleViewer articleViewer, QuickReplyOption quickReplyOption) {
        quickReplyOption.getClass();
        articleViewer.rendering.getOnFeedbackBannerOptionClicked$zendesk_ui_ui_android().invoke(quickReplyOption);
        setBannerVisibility$default(articleViewer, articleViewer.feedbackBanner, articleViewer, false, 0L, 4, null);
        return Unit.f26487a;
    }

    private final void renderArticleHeader() {
        ArticleHeaderView articleHeaderView = this.header;
        if (articleHeaderView != null) {
            articleHeaderView.render(new a(this, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleHeaderRendering renderArticleHeader$lambda$7(ArticleViewer articleViewer, ArticleHeaderRendering articleHeaderRendering) {
        articleHeaderRendering.getClass();
        return articleHeaderRendering.toBuilder().state(new a(articleViewer, 0)).onMenuItemClicked(articleViewer.rendering.getOnMenuItemClicked$zendesk_ui_ui_android()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleHeaderState renderArticleHeader$lambda$7$lambda$6(ArticleViewer articleViewer, ArticleHeaderState articleHeaderState) {
        articleHeaderState.getClass();
        boolean showShareButton$zendesk_ui_ui_android = articleViewer.rendering.getState().getShowShareButton$zendesk_ui_ui_android();
        boolean showBackButton$zendesk_ui_ui_android = articleViewer.rendering.getState().getShowBackButton$zendesk_ui_ui_android();
        return ArticleHeaderState.copy$default(articleHeaderState, articleViewer.rendering.getState().getBackgroundColor$zendesk_ui_ui_android(), articleViewer.rendering.getState().getButtonBackgroundColor$zendesk_ui_ui_android(), articleViewer.rendering.getState().getIconColor$zendesk_ui_ui_android(), 0, showShareButton$zendesk_ui_ui_android, showBackButton$zendesk_ui_ui_android, 8, null);
    }

    private final void setBannerVisibility(ArticleFeedbackBannerView articleFeedbackBannerView, ViewGroup viewGroup, boolean z11, long j9) {
        r rVar = new r();
        rVar.I = r.Q;
        rVar.X(80);
        rVar.f36751c = j9;
        rVar.b(articleFeedbackBannerView);
        if (viewGroup != null) {
            c0.a(viewGroup, rVar);
        }
        articleFeedbackBannerView.setVisibility(z11 ? 0 : 8);
    }

    public static /* synthetic */ void setBannerVisibility$default(ArticleViewer articleViewer, ArticleFeedbackBannerView articleFeedbackBannerView, ViewGroup viewGroup, boolean z11, long j9, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j9 = 600;
        }
        articleViewer.setBannerVisibility(articleFeedbackBannerView, viewGroup, z11, j9);
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ArticleViewerRendering, ? extends ArticleViewerRendering> renderingUpdate) {
        renderingUpdate.getClass();
        ArticleViewerRendering articleViewerRendering = (ArticleViewerRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = articleViewerRendering;
        setBackgroundColor(articleViewerRendering.getState().getBackgroundColor$zendesk_ui_ui_android());
        renderArticleHeader();
        renderArticleContent();
        if (this.rendering.getState().getShouldShowFeedbackBanner$zendesk_ui_ui_android()) {
            renderArticleFeedbackBanner();
            return;
        }
        ArticleFeedbackBannerView articleFeedbackBannerView = this.feedbackBanner;
        if (articleFeedbackBannerView != null) {
            articleFeedbackBannerView.setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleViewer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleViewer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ArticleViewer(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticleViewer(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
