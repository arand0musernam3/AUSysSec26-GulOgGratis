package zendesk.ui.android.conversation.articleviewer.articlecontent;

import kotlin.jvm.functions.Function1;
import zendesk.ui.android.common.retryerror.RetryErrorRendering;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentCarouselCellState;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentCarouselRendering;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentItem;
import zendesk.ui.android.conversations.LoadingIndicatorRendering;
import zendesk.ui.android.conversations.LoadingIndicatorState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArticleContentView f47802b;

    public /* synthetic */ a(ArticleContentView articleContentView, int i11) {
        this.f47801a = i11;
        this.f47802b = articleContentView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47801a) {
            case 0:
                return ArticleContentView.renderAttachmentListCarousel$lambda$5$lambda$3(this.f47802b, (ArticleAttachmentCarouselCellState) obj);
            case 1:
                return ArticleContentView.renderAttachmentListCarousel$lambda$5$lambda$4(this.f47802b, (ArticleAttachmentItem) obj);
            case 2:
                return ArticleContentView.renderRetryErrorView$lambda$12(this.f47802b, (RetryErrorRendering) obj);
            case 3:
                return ArticleContentView.renderLoadingIndicatorView$lambda$14(this.f47802b, (LoadingIndicatorRendering) obj);
            case 4:
                return ArticleContentView.renderLoadingIndicatorView$lambda$14$lambda$13(this.f47802b, (LoadingIndicatorState) obj);
            default:
                return ArticleContentView.renderAttachmentListCarousel$lambda$5(this.f47802b, (ArticleAttachmentCarouselRendering) obj);
        }
    }
}
