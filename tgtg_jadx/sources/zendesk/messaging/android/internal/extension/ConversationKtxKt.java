package zendesk.messaging.android.internal.extension;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w70.a;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.ConversationStatus;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageContent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0003H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"TEN_FIRST_TOP_CONVERSATIONS", "", "latestUpdatedTopConversation", "Lzendesk/conversationkit/android/model/Conversation;", "", "status", "Lzendesk/conversationkit/android/model/ConversationStatus;", "blockChatInput", "", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationKtx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationKtx.kt\nzendesk/messaging/android/internal/extension/ConversationKtxKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n774#2:60\n865#2,2:61\n1068#2:63\n1068#2:64\n*S KotlinDebug\n*F\n+ 1 ConversationKtx.kt\nzendesk/messaging/android/internal/extension/ConversationKtxKt\n*L\n20#1:60\n20#1:61,2\n21#1:63\n33#1:64\n*E\n"})
public final class ConversationKtxKt {
    public static final int TEN_FIRST_TOP_CONVERSATIONS = 10;

    public static final boolean blockChatInput(@NotNull Conversation conversation) {
        MessageContent content;
        conversation.getClass();
        Message message = (Message) CollectionsKt.X(conversation.getMessages());
        if (message == null || (content = message.getContent()) == null) {
            return false;
        }
        Boolean blockChatInput = ((content instanceof MessageContent.Form) || (content instanceof MessageContent.Text) || (content instanceof MessageContent.File) || (content instanceof MessageContent.Image) || (content instanceof MessageContent.Carousel)) ? content.getBlockChatInput() : Boolean.FALSE;
        if (blockChatInput != null) {
            return blockChatInput.booleanValue();
        }
        return false;
    }

    @Nullable
    public static final Conversation latestUpdatedTopConversation(@NotNull List<Conversation> list, @NotNull ConversationStatus conversationStatus) {
        list.getClass();
        conversationStatus.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Conversation) obj).getStatus() == conversationStatus) {
                arrayList.add(obj);
            }
        }
        return (Conversation) CollectionsKt.firstOrNull(CollectionsKt.m0(CollectionsKt.l0(arrayList, new Comparator() { // from class: zendesk.messaging.android.internal.extension.ConversationKtxKt$latestUpdatedTopConversation$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t9, T t11) {
                return a.a(((Conversation) t11).getLastUpdatedAt(), ((Conversation) t9).getLastUpdatedAt());
            }
        }), 10));
    }

    @Nullable
    public static final Conversation latestUpdatedTopConversation(@NotNull List<Conversation> list) {
        list.getClass();
        return (Conversation) CollectionsKt.firstOrNull(CollectionsKt.m0(CollectionsKt.l0(list, new Comparator() { // from class: zendesk.messaging.android.internal.extension.ConversationKtxKt$latestUpdatedTopConversation$$inlined$sortedByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t9, T t11) {
                return a.a(((Conversation) t11).getLastUpdatedAt(), ((Conversation) t9).getLastUpdatedAt());
            }
        }), 10));
    }
}
