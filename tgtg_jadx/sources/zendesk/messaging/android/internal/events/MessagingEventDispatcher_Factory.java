package zendesk.messaging.android.internal.events;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import s70.c;
import zendesk.android.events.ZendeskEvent;
import zendesk.conversationkit.android.ConversationKit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class MessagingEventDispatcher_Factory implements c {
    private final c conversationKitProvider;
    private final c dispatchEventProvider;

    private MessagingEventDispatcher_Factory(c cVar, c cVar2) {
        this.dispatchEventProvider = cVar;
        this.conversationKitProvider = cVar2;
    }

    public static MessagingEventDispatcher_Factory create(c cVar, c cVar2) {
        return new MessagingEventDispatcher_Factory(cVar, cVar2);
    }

    public static MessagingEventDispatcher newInstance(Function1<? super ZendeskEvent, Unit> function1, ConversationKit conversationKit) {
        return new MessagingEventDispatcher(function1, conversationKit);
    }

    @Override // t70.a
    public MessagingEventDispatcher get() {
        return newInstance((Function1) this.dispatchEventProvider.get(), (ConversationKit) this.conversationKitProvider.get());
    }
}
