package zendesk.android;

import s70.c;
import v80.b0;
import zendesk.android.events.internal.ZendeskEventDispatcher;
import zendesk.android.internal.frontendevents.pageviewevents.PageViewEvents;
import zendesk.android.messaging.Messaging;
import zendesk.conversationkit.android.ConversationKit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class Zendesk_Factory implements c {
    private final c conversationKitProvider;
    private final c eventDispatcherProvider;
    private final c messagingProvider;
    private final c pageViewEventsProvider;
    private final c scopeProvider;

    private Zendesk_Factory(c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
        this.messagingProvider = cVar;
        this.scopeProvider = cVar2;
        this.eventDispatcherProvider = cVar3;
        this.conversationKitProvider = cVar4;
        this.pageViewEventsProvider = cVar5;
    }

    public static Zendesk_Factory create(c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
        return new Zendesk_Factory(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static Zendesk newInstance(Messaging messaging, b0 b0Var, ZendeskEventDispatcher zendeskEventDispatcher, ConversationKit conversationKit, PageViewEvents pageViewEvents) {
        return new Zendesk(messaging, b0Var, zendeskEventDispatcher, conversationKit, pageViewEvents);
    }

    @Override // t70.a
    public Zendesk get() {
        return newInstance((Messaging) this.messagingProvider.get(), (b0) this.scopeProvider.get(), (ZendeskEventDispatcher) this.eventDispatcherProvider.get(), (ConversationKit) this.conversationKitProvider.get(), (PageViewEvents) this.pageViewEventsProvider.get());
    }
}
