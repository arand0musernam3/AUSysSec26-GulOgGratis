package zendesk.messaging.android.internal.conversationscreen;

import v80.x;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationScreenRepository_Factory implements s70.c {
    private final s70.c conversationKitProvider;
    private final s70.c defaultDispatcherProvider;
    private final s70.c messagingEventDispatcherProvider;
    private final s70.c messagingStorageProvider;

    private ConversationScreenRepository_Factory(s70.c cVar, s70.c cVar2, s70.c cVar3, s70.c cVar4) {
        this.conversationKitProvider = cVar;
        this.messagingStorageProvider = cVar2;
        this.defaultDispatcherProvider = cVar3;
        this.messagingEventDispatcherProvider = cVar4;
    }

    public static ConversationScreenRepository_Factory create(s70.c cVar, s70.c cVar2, s70.c cVar3, s70.c cVar4) {
        return new ConversationScreenRepository_Factory(cVar, cVar2, cVar3, cVar4);
    }

    public static ConversationScreenRepository newInstance(ConversationKit conversationKit, MessagingStorage messagingStorage, x xVar, MessagingEventDispatcher messagingEventDispatcher) {
        return new ConversationScreenRepository(conversationKit, messagingStorage, xVar, messagingEventDispatcher);
    }

    @Override // t70.a
    public ConversationScreenRepository get() {
        return newInstance((ConversationKit) this.conversationKitProvider.get(), (MessagingStorage) this.messagingStorageProvider.get(), (x) this.defaultDispatcherProvider.get(), (MessagingEventDispatcher) this.messagingEventDispatcherProvider.get());
    }
}
