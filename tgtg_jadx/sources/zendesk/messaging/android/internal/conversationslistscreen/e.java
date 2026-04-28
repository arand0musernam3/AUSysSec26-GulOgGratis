package zendesk.messaging.android.internal.conversationslistscreen;

import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.conversationslistscreen.list.ConversationsListViewRendering;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerRendering;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerState;
import zendesk.ui.android.conversation.header.ConversationHeaderRendering;
import zendesk.ui.android.conversation.header.ConversationHeaderState;
import zendesk.ui.android.conversations.LoadingIndicatorRendering;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationsListScreenView f47745b;

    public /* synthetic */ e(ConversationsListScreenView conversationsListScreenView, int i11) {
        this.f47744a = i11;
        this.f47745b = conversationsListScreenView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47744a) {
            case 0:
                return ConversationsListScreenView.connectionBannerViewRenderingUpdate$lambda$17(this.f47745b, (ConnectionBannerRendering) obj);
            case 1:
                return ConversationsListScreenView.conversationHeaderRenderingUpdate$lambda$1$lambda$0(this.f47745b, (ConversationHeaderState) obj);
            case 2:
                return ConversationsListScreenView.conversationsListViewRenderingUpdate$lambda$5$lambda$4(this.f47745b, (zendesk.messaging.android.internal.conversationslistscreen.list.ConversationsListState) obj);
            case 3:
                return ConversationsListScreenView.connectionBannerViewRenderingUpdate$lambda$17$lambda$16(this.f47745b, (ConnectionBannerState) obj);
            case 4:
                return ConversationsListScreenView.conversationHeaderRenderingUpdate$lambda$1(this.f47745b, (ConversationHeaderRendering) obj);
            case 5:
                return ConversationsListScreenView.conversationsLoaderRenderingUpdate$lambda$3(this.f47745b, (LoadingIndicatorRendering) obj);
            default:
                return ConversationsListScreenView.conversationsListViewRenderingUpdate$lambda$5(this.f47745b, (ConversationsListViewRendering) obj);
        }
    }
}
