package zendesk.ui.android.conversation.articleviewer;

import kotlin.jvm.functions.Function1;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentRendering;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentState;
import zendesk.ui.android.conversation.articleviewer.articleheader.ArticleHeaderRendering;
import zendesk.ui.android.conversation.articleviewer.articleheader.ArticleHeaderState;
import zendesk.ui.android.conversation.articleviewer.feedbackbanner.ArticleFeedbackBannerRendering;
import zendesk.ui.android.conversation.articleviewer.feedbackbanner.ArticleFeedbackBannerState;
import zendesk.ui.android.conversation.quickreply.QuickReplyOption;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArticleViewer f47797b;

    public /* synthetic */ a(ArticleViewer articleViewer, int i11) {
        this.f47796a = i11;
        this.f47797b = articleViewer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47796a) {
            case 0:
                return ArticleViewer.renderArticleHeader$lambda$7$lambda$6(this.f47797b, (ArticleHeaderState) obj);
            case 1:
                return ArticleViewer.renderArticleFeedbackBanner$lambda$2(this.f47797b, (ArticleFeedbackBannerRendering) obj);
            case 2:
                return ArticleViewer.renderArticleContent$lambda$5$lambda$3(this.f47797b, (ArticleContentState) obj);
            case 3:
                return ArticleViewer.renderArticleContent$lambda$5$lambda$4(this.f47797b, (ArticleContentState.ArticleLoadingStatus) obj);
            case 4:
                return ArticleViewer.renderArticleHeader$lambda$7(this.f47797b, (ArticleHeaderRendering) obj);
            case 5:
                return ArticleViewer.renderArticleFeedbackBanner$lambda$2$lambda$0(this.f47797b, (ArticleFeedbackBannerState) obj);
            case 6:
                return ArticleViewer.renderArticleFeedbackBanner$lambda$2$lambda$1(this.f47797b, (QuickReplyOption) obj);
            default:
                return ArticleViewer.renderArticleContent$lambda$5(this.f47797b, (ArticleContentRendering) obj);
        }
    }
}
