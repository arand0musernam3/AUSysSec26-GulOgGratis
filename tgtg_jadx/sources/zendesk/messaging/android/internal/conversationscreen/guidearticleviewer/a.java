package zendesk.messaging.android.internal.conversationscreen.guidearticleviewer;

import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState;
import zendesk.ui.android.conversation.articleviewer.ArticleViewerRendering;
import zendesk.ui.android.conversation.articleviewer.ArticleViewerState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47672a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GuideArticleViewerBottomSheetFragment f47673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GuideArticleViewerState.SuccessGuideArticle f47674c;

    public /* synthetic */ a(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, GuideArticleViewerState.SuccessGuideArticle successGuideArticle) {
        this.f47673b = guideArticleViewerBottomSheetFragment;
        this.f47674c = successGuideArticle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47672a) {
            case 0:
                return GuideArticleViewerBottomSheetFragment.renderGuideArticleSuccess$lambda$7$lambda$6(this.f47674c, this.f47673b, (ArticleViewerState) obj);
            default:
                return GuideArticleViewerBottomSheetFragment.renderGuideArticleSuccess$lambda$7(this.f47673b, this.f47674c, (ArticleViewerRendering) obj);
        }
    }

    public /* synthetic */ a(GuideArticleViewerState.SuccessGuideArticle successGuideArticle, GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment) {
        this.f47674c = successGuideArticle;
        this.f47673b = guideArticleViewerBottomSheetFragment;
    }
}
