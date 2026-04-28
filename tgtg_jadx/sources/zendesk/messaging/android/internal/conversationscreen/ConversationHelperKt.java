package zendesk.messaging.android.internal.conversationscreen;

import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.model.Author;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.Message;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000¨\u0006\u0004"}, d2 = {"mostRecentAuthorThatIsNotMySelf", "Lzendesk/conversationkit/android/model/Author;", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "Lzendesk/conversationkit/android/model/Conversation;", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationHelper.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,21:1\n543#2,6:22\n*S KotlinDebug\n*F\n+ 1 ConversationHelper.kt\nzendesk/messaging/android/internal/conversationscreen/ConversationHelperKt\n*L\n16#1:22,6\n*E\n"})
public final class ConversationHelperKt {
    @Nullable
    public static final Author mostRecentAuthorThatIsNotMySelf(@Nullable Conversation conversation) {
        List<Message> messages;
        Message messagePrevious;
        Author author;
        if (conversation != null && (messages = conversation.getMessages()) != null) {
            ListIterator<Message> listIterator = messages.listIterator(messages.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    messagePrevious = null;
                    break;
                }
                messagePrevious = listIterator.previous();
                if (!messagePrevious.isAuthoredBy(conversation.getMyself())) {
                    break;
                }
            }
            Message message = messagePrevious;
            if (message != null && (author = message.getAuthor()) != null) {
                return author;
            }
        }
        return null;
    }
}
