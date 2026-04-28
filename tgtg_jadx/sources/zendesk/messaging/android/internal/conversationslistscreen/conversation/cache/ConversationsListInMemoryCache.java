package zendesk.messaging.android.internal.conversationslistscreen.conversation.cache;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.core.ui.android.internal.model.ConversationEntry;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u0006\u0010\f\u001a\u00020\tJ\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListInMemoryCache;", "", "<init>", "()V", "conversationsInMemoryCache", "", "", "Lzendesk/core/ui/android/internal/model/ConversationEntry;", "updateConversations", "", "conversationEntries", "", "clearAll", "conversations", "", "getConversationById", "conversationId", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationsListInMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsListInMemoryCache.kt\nzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListInMemoryCache\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1869#2,2:25\n*S KotlinDebug\n*F\n+ 1 ConversationsListInMemoryCache.kt\nzendesk/messaging/android/internal/conversationslistscreen/conversation/cache/ConversationsListInMemoryCache\n*L\n11#1:25,2\n*E\n"})
public final class ConversationsListInMemoryCache {

    @NotNull
    private final Map<String, ConversationEntry> conversationsInMemoryCache = new LinkedHashMap();

    public final void clearAll() {
        this.conversationsInMemoryCache.clear();
    }

    @NotNull
    public final Map<String, ConversationEntry> conversations() {
        return x0.k(this.conversationsInMemoryCache);
    }

    @Nullable
    public final ConversationEntry getConversationById(@NotNull String conversationId) {
        conversationId.getClass();
        return this.conversationsInMemoryCache.get(conversationId);
    }

    public final void updateConversations(@NotNull List<? extends ConversationEntry> conversationEntries) {
        conversationEntries.getClass();
        for (ConversationEntry conversationEntry : conversationEntries) {
            this.conversationsInMemoryCache.put(conversationEntry.getId(), conversationEntry);
        }
    }
}
