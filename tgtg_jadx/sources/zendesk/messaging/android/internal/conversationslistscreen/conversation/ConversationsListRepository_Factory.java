package zendesk.messaging.android.internal.conversationslistscreen.conversation;

import s70.c;
import v80.x;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListInMemoryCache;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationsListRepository_Factory implements c {
    private final c conversationKitProvider;
    private final c conversationsListInMemoryCacheProvider;
    private final c defaultDispatcherProvider;
    private final c mapperProvider;

    private ConversationsListRepository_Factory(c cVar, c cVar2, c cVar3, c cVar4) {
        this.conversationKitProvider = cVar;
        this.defaultDispatcherProvider = cVar2;
        this.mapperProvider = cVar3;
        this.conversationsListInMemoryCacheProvider = cVar4;
    }

    public static ConversationsListRepository_Factory create(c cVar, c cVar2, c cVar3, c cVar4) {
        return new ConversationsListRepository_Factory(cVar, cVar2, cVar3, cVar4);
    }

    public static ConversationsListRepository newInstance(ConversationKit conversationKit, x xVar, ConversationLogEntryMapper conversationLogEntryMapper, ConversationsListInMemoryCache conversationsListInMemoryCache) {
        return new ConversationsListRepository(conversationKit, xVar, conversationLogEntryMapper, conversationsListInMemoryCache);
    }

    @Override // t70.a
    public ConversationsListRepository get() {
        return newInstance((ConversationKit) this.conversationKitProvider.get(), (x) this.defaultDispatcherProvider.get(), (ConversationLogEntryMapper) this.mapperProvider.get(), (ConversationsListInMemoryCache) this.conversationsListInMemoryCacheProvider.get());
    }
}
