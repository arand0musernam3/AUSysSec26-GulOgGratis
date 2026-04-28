package zendesk.conversationkit.android.internal.extension;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y80.i;
import y80.r;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.Message;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lzendesk/conversationkit/android/model/Conversation;", "Lzendesk/conversationkit/android/internal/extension/ServerType;", "serverType", "(Lzendesk/conversationkit/android/model/Conversation;)Lzendesk/conversationkit/android/internal/extension/ServerType;", "", "MSG_AGENT_ID_KEY", "Ljava/lang/String;", "Lzendesk/conversationkit/android/ConversationKit;", "Ly80/i;", "Lzendesk/conversationkit/android/ConversationKitEvent;", "getEventFlow", "(Lzendesk/conversationkit/android/ConversationKit;)Ly80/i;", "eventFlow", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationKit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationKit.kt\nzendesk/conversationkit/android/internal/extension/ConversationKitKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n543#2,6:57\n*S KotlinDebug\n*F\n+ 1 ConversationKit.kt\nzendesk/conversationkit/android/internal/extension/ConversationKitKt\n*L\n33#1:57,6\n*E\n"})
public final class ConversationKitKt {

    @NotNull
    public static final String MSG_AGENT_ID_KEY = "__zendesk_msg.agent.id";

    @NotNull
    public static final i getEventFlow(@NotNull ConversationKit conversationKit) {
        conversationKit.getClass();
        return r.f(new ConversationKitKt$eventFlow$1(conversationKit, null));
    }

    @NotNull
    public static final ServerType serverType(@Nullable Conversation conversation) {
        List<Message> messages;
        Message messagePrevious;
        Map<String, Object> metadata;
        Object obj = null;
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
            if (message != null && (metadata = message.getMetadata()) != null) {
                obj = metadata.get(MSG_AGENT_ID_KEY);
            }
        }
        return obj != null ? ServerType.AGENT : ServerType.BOT;
    }
}
