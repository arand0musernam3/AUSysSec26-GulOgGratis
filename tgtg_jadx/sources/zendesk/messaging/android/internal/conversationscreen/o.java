package zendesk.messaging.android.internal.conversationscreen;

import kotlin.jvm.functions.Function1;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.core.ui.android.internal.model.ConversationEntry;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenRendering;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogListenersKt;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogRendering;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenRendering;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenView;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationCellFactory;
import zendesk.messaging.android.internal.conversationslistscreen.list.ConversationsListAdapter;
import zendesk.messaging.android.internal.conversationslistscreen.list.ConversationsListView;
import zendesk.messaging.android.internal.conversationslistscreen.list.ConversationsListViewRendering;
import zendesk.ui.android.common.button.ButtonRendering;
import zendesk.ui.android.common.button.ButtonView;
import zendesk.ui.android.common.buttonbanner.ButtonBannerRendering;
import zendesk.ui.android.common.buttonbanner.ButtonBannerView;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerRendering;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerView;
import zendesk.ui.android.common.loadmore.LoadMoreRendering;
import zendesk.ui.android.common.loadmore.LoadMoreView;
import zendesk.ui.android.conversation.actionbutton.ActionButtonRendering;
import zendesk.ui.android.conversation.actionbutton.ActionButtonView;
import zendesk.ui.android.conversation.activitymessage.ActivityMessageRendering;
import zendesk.ui.android.conversation.activitymessage.ActivityMessageView;
import zendesk.ui.android.conversation.articleviewer.ArticleViewerRendering;
import zendesk.ui.android.conversation.articleviewer.ArticleViewerState;
import zendesk.ui.android.conversation.carousel.CarouselAction;
import zendesk.ui.android.conversation.quickreply.QuickReplyOption;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47698a;

    public /* synthetic */ o(int i11) {
        this.f47698a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47698a) {
            case 0:
                return ConversationScreenRendering.Builder.onRetryLoadMoreClickedListener$lambda$10(((Double) obj).doubleValue());
            case 1:
                return ConversationScreenRendering.Builder.onAttachButtonClicked$lambda$2(((Integer) obj).intValue());
            case 2:
                return ConversationScreenRendering.Builder.onSendButtonClicked$lambda$3((String) obj);
            case 3:
                return ConversationScreenRendering.Builder.onMessageComposerTextChanged$lambda$5((String) obj);
            case 4:
                return ConversationScreenView._init_$lambda$24((ConversationScreenRendering) obj);
            case 5:
                return GuideArticleViewerBottomSheetFragment.defaultRendering$lambda$5$lambda$4((ArticleViewerState) obj);
            case 6:
                return MessageLogListenersKt.NOOP_ON_QUICK_REPLY_OPTION_SELECTED_LISTENER$lambda$0((MessageAction.Reply) obj);
            case 7:
                return MessageLogListenersKt.NOOP_ON_MESSAGE_CONTAINER_CLICKED_LISTENER$lambda$1((Message) obj);
            case 8:
                return MessageLogListenersKt.NOOP_ON_CAROUSEL_ACTION$lambda$3((CarouselAction) obj);
            case 9:
                return MessageLogListenersKt.NOOP_ON_COPY_TEXT_ACTION$lambda$5((String) obj);
            case 10:
                return MessageLogListenersKt.NOOP_ON_FORM_FOCUS_CHANGED_LISTENER$lambda$7(((Boolean) obj).booleanValue());
            case 11:
                return MessageLogListenersKt.NOOP_ON_FILE_ATTACHMENT_CLICKED_ACTION$lambda$9((Message) obj);
            case 12:
                return MessageLogRendering.Builder.onLoadMoreListener$lambda$2(((Boolean) obj).booleanValue());
            case 13:
                return MessageLogView._init_$lambda$2((MessageLogRendering) obj);
            case 14:
                return ConversationsListScreenRendering.Builder.onListItemClickLambda$lambda$2((ConversationEntry.ConversationItem) obj);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ConversationsListScreenRendering.Builder.onRetryPaginationClicked$lambda$4((ConversationEntry.LoadMore) obj);
            case 16:
                return ConversationsListScreenView._init_$lambda$18((ConversationsListScreenRendering) obj);
            case 17:
                return ConversationCellFactory.createConversationCellView$lambda$0((ConversationEntry.ConversationItem) obj);
            case 18:
                return ConversationsListAdapter.listItemClickListener$lambda$0((ConversationEntry.ConversationItem) obj);
            case 19:
                return ConversationsListAdapter.retryClickListener$lambda$1((ConversationEntry.LoadMore) obj);
            case 20:
                return ConversationsListView._init_$lambda$1((ConversationsListViewRendering) obj);
            case 21:
                return ConversationsListViewRendering.Builder.onListItemClickLambda$lambda$0((ConversationEntry.ConversationItem) obj);
            case 22:
                return ConversationsListViewRendering.Builder.onRetryItemClickLambda$lambda$1((ConversationEntry.LoadMore) obj);
            case 23:
                return ButtonView._init_$lambda$0((ButtonRendering) obj);
            case 24:
                return ButtonBannerView._init_$lambda$0((ButtonBannerRendering) obj);
            case 25:
                return ConnectionBannerView._init_$lambda$1((ConnectionBannerRendering) obj);
            case 26:
                return LoadMoreView._init_$lambda$1((LoadMoreRendering) obj);
            case 27:
                return ActionButtonView._init_$lambda$0((ActionButtonRendering) obj);
            case 28:
                return ActivityMessageView._init_$lambda$1((ActivityMessageRendering) obj);
            default:
                return ArticleViewerRendering.Builder.onFeedbackBannerOptionClicked$lambda$0((QuickReplyOption) obj);
        }
    }
}
