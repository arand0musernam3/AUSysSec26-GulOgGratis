package zendesk.android.internal.frontendevents.pageviewevents;

import s70.c;
import v80.x;
import zendesk.android.internal.frontendevents.FrontendEventsRepository;
import zendesk.android.internal.proactivemessaging.ProactiveMessagingManager;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class DefaultPageViewEvents_Factory implements c {
    private final c frontendEventsRepositoryProvider;
    private final c ioDispatcherProvider;
    private final c proactiveMessagingManagerProvider;

    private DefaultPageViewEvents_Factory(c cVar, c cVar2, c cVar3) {
        this.frontendEventsRepositoryProvider = cVar;
        this.ioDispatcherProvider = cVar2;
        this.proactiveMessagingManagerProvider = cVar3;
    }

    public static DefaultPageViewEvents_Factory create(c cVar, c cVar2, c cVar3) {
        return new DefaultPageViewEvents_Factory(cVar, cVar2, cVar3);
    }

    public static DefaultPageViewEvents newInstance(FrontendEventsRepository frontendEventsRepository, x xVar, ProactiveMessagingManager proactiveMessagingManager) {
        return new DefaultPageViewEvents(frontendEventsRepository, xVar, proactiveMessagingManager);
    }

    @Override // t70.a
    public DefaultPageViewEvents get() {
        return newInstance((FrontendEventsRepository) this.frontendEventsRepositoryProvider.get(), (x) this.ioDispatcherProvider.get(), (ProactiveMessagingManager) this.proactiveMessagingManagerProvider.get());
    }
}
