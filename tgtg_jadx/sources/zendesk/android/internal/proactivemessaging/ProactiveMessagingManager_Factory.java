package zendesk.android.internal.proactivemessaging;

import kotlin.jvm.functions.Function0;
import s70.c;
import v80.b0;
import zendesk.android.internal.frontendevents.analyticsevents.ProactiveMessagingAnalyticsManager;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.core.ui.android.internal.app.ProcessLifecycleEventObserver;
import zendesk.core.ui.android.internal.local.LocaleProvider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProactiveMessagingManager_Factory implements c {
    private final c conversationKitProvider;
    private final c coroutineScopeProvider;
    private final c currentTimeProvider;
    private final c localeProvider;
    private final c proactiveMessagingAnalyticsManagerProvider;
    private final c proactiveMessagingRepositoryProvider;
    private final c processLifecycleEventObserverProvider;
    private final c visitTypeProvider;

    private ProactiveMessagingManager_Factory(c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6, c cVar7, c cVar8) {
        this.processLifecycleEventObserverProvider = cVar;
        this.coroutineScopeProvider = cVar2;
        this.localeProvider = cVar3;
        this.visitTypeProvider = cVar4;
        this.conversationKitProvider = cVar5;
        this.proactiveMessagingRepositoryProvider = cVar6;
        this.currentTimeProvider = cVar7;
        this.proactiveMessagingAnalyticsManagerProvider = cVar8;
    }

    public static ProactiveMessagingManager_Factory create(c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6, c cVar7, c cVar8) {
        return new ProactiveMessagingManager_Factory(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8);
    }

    public static ProactiveMessagingManager newInstance(ProcessLifecycleEventObserver processLifecycleEventObserver, b0 b0Var, LocaleProvider localeProvider, VisitTypeProvider visitTypeProvider, ConversationKit conversationKit, ProactiveMessagingRepository proactiveMessagingRepository, Function0<Long> function0, ProactiveMessagingAnalyticsManager proactiveMessagingAnalyticsManager) {
        return new ProactiveMessagingManager(processLifecycleEventObserver, b0Var, localeProvider, visitTypeProvider, conversationKit, proactiveMessagingRepository, function0, proactiveMessagingAnalyticsManager);
    }

    @Override // t70.a
    public ProactiveMessagingManager get() {
        return newInstance((ProcessLifecycleEventObserver) this.processLifecycleEventObserverProvider.get(), (b0) this.coroutineScopeProvider.get(), (LocaleProvider) this.localeProvider.get(), (VisitTypeProvider) this.visitTypeProvider.get(), (ConversationKit) this.conversationKitProvider.get(), (ProactiveMessagingRepository) this.proactiveMessagingRepositoryProvider.get(), (Function0) this.currentTimeProvider.get(), (ProactiveMessagingAnalyticsManager) this.proactiveMessagingAnalyticsManagerProvider.get());
    }
}
