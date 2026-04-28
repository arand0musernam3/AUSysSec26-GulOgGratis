package zendesk.messaging.android.internal.conversationslistscreen.list;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.ui.android.conversations.cell.ConversationCellState;
import zendesk.ui.android.conversations.cell.ConversationCellView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationListItemViewHolder;", "Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListViewHolder;", "conversationCellView", "Lzendesk/ui/android/conversations/cell/ConversationCellView;", "<init>", "(Lzendesk/ui/android/conversations/cell/ConversationCellView;)V", "onBind", "", "conversationCellState", "Lzendesk/ui/android/conversations/cell/ConversationCellState;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationListItemViewHolder extends ConversationsListViewHolder {

    @NotNull
    private final ConversationCellView conversationCellView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListItemViewHolder(@NotNull ConversationCellView conversationCellView) {
        super(conversationCellView);
        conversationCellView.getClass();
        this.conversationCellView = conversationCellView;
    }

    public final void onBind(@NotNull ConversationCellState conversationCellState) {
        conversationCellState.getClass();
        this.conversationCellView.onBind(conversationCellState);
    }
}
