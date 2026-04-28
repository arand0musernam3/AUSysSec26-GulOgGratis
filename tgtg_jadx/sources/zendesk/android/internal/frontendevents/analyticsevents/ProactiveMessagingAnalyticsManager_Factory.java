package zendesk.android.internal.frontendevents.analyticsevents;

import s70.c;
import v80.b0;
import zendesk.android.internal.frontendevents.FrontendEventsRepository;
import zendesk.conversationkit.android.ConversationKit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProactiveMessagingAnalyticsManager_Factory implements c {
    private final c conversationKitProvider;
    private final c coroutineScopeProvider;
    private final c frontendEventsRepositoryProvider;

    private ProactiveMessagingAnalyticsManager_Factory(c cVar, c cVar2, c cVar3) {
        this.frontendEventsRepositoryProvider = cVar;
        this.coroutineScopeProvider = cVar2;
        this.conversationKitProvider = cVar3;
    }

    public static ProactiveMessagingAnalyticsManager_Factory create(c cVar, c cVar2, c cVar3) {
        return new ProactiveMessagingAnalyticsManager_Factory(cVar, cVar2, cVar3);
    }

    public static ProactiveMessagingAnalyticsManager newInstance(FrontendEventsRepository frontendEventsRepository, b0 b0Var, ConversationKit conversationKit) {
        return new ProactiveMessagingAnalyticsManager(frontendEventsRepository, b0Var, conversationKit);
    }

    @Override // t70.a
    public ProactiveMessagingAnalyticsManager get() {
        return newInstance((FrontendEventsRepository) this.frontendEventsRepositoryProvider.get(), (b0) this.coroutineScopeProvider.get(), (ConversationKit) this.conversationKitProvider.get());
    }
}
