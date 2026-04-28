package zendesk.messaging.android.internal.conversationslistscreen.conversation;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yl.e;
import zendesk.core.ui.android.internal.model.ConversationEntry;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.conversationscreen.o;
import zendesk.ui.android.common.loadmore.LoadMoreView;
import zendesk.ui.android.conversation.avatar.AvatarImageState;
import zendesk.ui.android.conversation.avatar.AvatarMask;
import zendesk.ui.android.conversations.cell.ConversationCellState;
import zendesk.ui.android.conversations.cell.ConversationCellView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tJ3\u0010\u000f\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0002\b\u0011J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0014"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationCellFactory;", "", "<init>", "()V", "createConversationCellView", "Lzendesk/ui/android/conversations/cell/ConversationCellView;", "item", "Lzendesk/core/ui/android/internal/model/ConversationEntry$ConversationItem;", "parentView", "Landroid/view/View;", "clickListener", "Lkotlin/Function1;", "", "createLoadMoreCellView", "Lzendesk/ui/android/common/loadmore/LoadMoreView;", "mapToConversationCellState", "Lzendesk/ui/android/conversations/cell/ConversationCellState;", "mapToConversationCellState$zendesk_messaging_messaging_android", "createAvatarImageState", "Lzendesk/ui/android/conversation/avatar/AvatarImageState;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationCellFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationCellFactory.kt\nzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationCellFactory\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,87:1\n29#2:88\n*S KotlinDebug\n*F\n+ 1 ConversationCellFactory.kt\nzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationCellFactory\n*L\n79#1:88\n*E\n"})
public final class ConversationCellFactory {

    @NotNull
    public static final ConversationCellFactory INSTANCE = new ConversationCellFactory();

    private ConversationCellFactory() {
    }

    private final AvatarImageState createAvatarImageState(View parentView, ConversationEntry.ConversationItem item) {
        if (item.getAvatarUrl().length() <= 0) {
            return new AvatarImageState(null, false, 0, null, null, 31, null);
        }
        int color = parentView.getContext().getColor(R.color.zma_color_background);
        return new AvatarImageState(Uri.parse(item.getAvatarUrl()), false, zendesk.ui.android.R.dimen.zuia_conversation_cell_avatar_image_size, Integer.valueOf(color), AvatarMask.CIRCLE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationCellView createConversationCellView$default(ConversationCellFactory conversationCellFactory, ConversationEntry.ConversationItem conversationItem, View view, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            conversationItem = null;
        }
        if ((i11 & 4) != 0) {
            function1 = new o(17);
        }
        return conversationCellFactory.createConversationCellView(conversationItem, view, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createConversationCellView$lambda$0(ConversationEntry.ConversationItem conversationItem) {
        conversationItem.getClass();
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapToConversationCellState$lambda$3(Function1 function1, ConversationEntry.ConversationItem conversationItem) {
        function1.invoke(conversationItem);
        return Unit.f26487a;
    }

    @NotNull
    public final ConversationCellView createConversationCellView(@Nullable ConversationEntry.ConversationItem item, @NotNull View parentView, @NotNull Function1<? super ConversationEntry.ConversationItem, Unit> clickListener) {
        parentView.getClass();
        clickListener.getClass();
        Context context = parentView.getContext();
        context.getClass();
        ConversationCellView conversationCellView = new ConversationCellView(context, null, 0, 0, 14, null);
        conversationCellView.onBind(INSTANCE.mapToConversationCellState$zendesk_messaging_messaging_android(item, parentView, clickListener));
        return conversationCellView;
    }

    @NotNull
    public final LoadMoreView createLoadMoreCellView(@NotNull View parentView) {
        parentView.getClass();
        Context context = parentView.getContext();
        context.getClass();
        LoadMoreView loadMoreView = new LoadMoreView(context, null, 0, 0, 14, null);
        loadMoreView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return loadMoreView;
    }

    @NotNull
    public final ConversationCellState mapToConversationCellState$zendesk_messaging_messaging_android(@Nullable ConversationEntry.ConversationItem item, @NotNull View parentView, @NotNull Function1<? super ConversationEntry.ConversationItem, Unit> clickListener) {
        parentView.getClass();
        clickListener.getClass();
        if (item != null) {
            AvatarImageState avatarImageStateCreateAvatarImageState = createAvatarImageState(parentView, item);
            String latestMessage = item.getLatestMessage();
            String latestMessageOwner = item.getLatestMessageOwner();
            String participantName = item.getParticipantName();
            String conversationTitle = item.getConversationTitle();
            String formattedDateTimeStampString = item.getFormattedDateTimeStampString();
            int unreadMessages = item.getUnreadMessages();
            int unreadMessagesCountBackgroundColor = item.getUnreadMessagesCountBackgroundColor();
            int unreadMessagesCountTextColor = item.getUnreadMessagesCountTextColor();
            int dateTimestampTextColor = item.getDateTimestampTextColor();
            int lastMessageTextColor = item.getLastMessageTextColor();
            int conversationParticipantsTextColor = item.getConversationParticipantsTextColor();
            int conversationTitleTextColor = item.getConversationTitleTextColor();
            int conversationCellDividerColor = item.getConversationCellDividerColor();
            return new ConversationCellState(participantName, conversationTitle, latestMessage, latestMessageOwner, avatarImageStateCreateAvatarImageState, formattedDateTimeStampString, unreadMessages, new e(7, clickListener, item), item.getAccessibilityTitle(), false, unreadMessagesCountBackgroundColor, unreadMessagesCountTextColor, dateTimestampTextColor, lastMessageTextColor, conversationParticipantsTextColor, conversationTitleTextColor, conversationCellDividerColor, 0, 131584, null);
        }
        return new ConversationCellState(null, null, null, null, null, null, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, 262143, null);
    }
}
