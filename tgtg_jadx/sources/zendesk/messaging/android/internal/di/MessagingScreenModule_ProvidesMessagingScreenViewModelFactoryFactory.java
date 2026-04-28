package zendesk.messaging.android.internal.di;

import android.os.Bundle;
import ea.f;
import o00.x0;
import s70.c;
import zendesk.messaging.android.internal.MessagingEntryPointHandler;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModelFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class MessagingScreenModule_ProvidesMessagingScreenViewModelFactoryFactory implements c {
    private final c analyticsProcessorProvider;
    private final c defaultArgsProvider;
    private final c messagingEntryPointHandlerProvider;
    private final c messagingEventDispatcherProvider;
    private final MessagingScreenModule module;
    private final c savedStateRegistryOwnerProvider;

    private MessagingScreenModule_ProvidesMessagingScreenViewModelFactoryFactory(MessagingScreenModule messagingScreenModule, c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
        this.module = messagingScreenModule;
        this.messagingEntryPointHandlerProvider = cVar;
        this.analyticsProcessorProvider = cVar2;
        this.messagingEventDispatcherProvider = cVar3;
        this.savedStateRegistryOwnerProvider = cVar4;
        this.defaultArgsProvider = cVar5;
    }

    public static MessagingScreenModule_ProvidesMessagingScreenViewModelFactoryFactory create(MessagingScreenModule messagingScreenModule, c cVar, c cVar2, c cVar3, c cVar4, c cVar5) {
        return new MessagingScreenModule_ProvidesMessagingScreenViewModelFactoryFactory(messagingScreenModule, cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static MessagingScreenViewModelFactory providesMessagingScreenViewModelFactory(MessagingScreenModule messagingScreenModule, MessagingEntryPointHandler messagingEntryPointHandler, AnalyticsProcessor analyticsProcessor, MessagingEventDispatcher messagingEventDispatcher, f fVar, Bundle bundle) {
        MessagingScreenViewModelFactory messagingScreenViewModelFactoryProvidesMessagingScreenViewModelFactory = messagingScreenModule.providesMessagingScreenViewModelFactory(messagingEntryPointHandler, analyticsProcessor, messagingEventDispatcher, fVar, bundle);
        x0.o(messagingScreenViewModelFactoryProvidesMessagingScreenViewModelFactory);
        return messagingScreenViewModelFactoryProvidesMessagingScreenViewModelFactory;
    }

    @Override // t70.a
    public MessagingScreenViewModelFactory get() {
        return providesMessagingScreenViewModelFactory(this.module, (MessagingEntryPointHandler) this.messagingEntryPointHandlerProvider.get(), (AnalyticsProcessor) this.analyticsProcessorProvider.get(), (MessagingEventDispatcher) this.messagingEventDispatcherProvider.get(), (f) this.savedStateRegistryOwnerProvider.get(), (Bundle) this.defaultArgsProvider.get());
    }
}
