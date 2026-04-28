package zendesk.ui.android.conversation.articleviewer.feedbackbanner;

import java.util.List;
import kotlin.jvm.functions.Function1;
import zendesk.ui.android.conversation.quickreply.QuickReplyRendering;
import zendesk.ui.android.conversation.quickreply.QuickReplyState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47806a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f47807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArticleFeedbackBannerView f47808c;

    public /* synthetic */ a(List list, ArticleFeedbackBannerView articleFeedbackBannerView) {
        this.f47807b = list;
        this.f47808c = articleFeedbackBannerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47806a) {
            case 0:
                return ArticleFeedbackBannerView.render$lambda$3$lambda$2$lambda$1(this.f47808c, this.f47807b, (QuickReplyRendering) obj);
            default:
                return ArticleFeedbackBannerView.render$lambda$3$lambda$2$lambda$1$lambda$0(this.f47807b, this.f47808c, (QuickReplyState) obj);
        }
    }

    public /* synthetic */ a(ArticleFeedbackBannerView articleFeedbackBannerView, List list) {
        this.f47808c = articleFeedbackBannerView;
        this.f47807b = list;
    }
}
