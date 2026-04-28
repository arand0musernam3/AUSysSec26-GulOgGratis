package zendesk.messaging.android.internal.conversationscreen.conversationextension.di;

import android.os.Bundle;
import ea.f;
import o00.x0;
import s70.c;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionViewModelFactory;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationExtensionModule_ProvidesConversationExtensionViewModelFactoryFactory implements c {
    private final c analyticsProcessorProvider;
    private final c defaultArgsProvider;
    private final c messagingEventDispatcherProvider;
    private final ConversationExtensionModule module;
    private final c savedStateRegistryOwnerProvider;

    private ConversationExtensionModule_ProvidesConversationExtensionViewModelFactoryFactory(ConversationExtensionModule conversationExtensionModule, c cVar, c cVar2, c cVar3, c cVar4) {
        this.module = conversationExtensionModule;
        this.savedStateRegistryOwnerProvider = cVar;
        this.defaultArgsProvider = cVar2;
        this.analyticsProcessorProvider = cVar3;
        this.messagingEventDispatcherProvider = cVar4;
    }

    public static ConversationExtensionModule_ProvidesConversationExtensionViewModelFactoryFactory create(ConversationExtensionModule conversationExtensionModule, c cVar, c cVar2, c cVar3, c cVar4) {
        return new ConversationExtensionModule_ProvidesConversationExtensionViewModelFactoryFactory(conversationExtensionModule, cVar, cVar2, cVar3, cVar4);
    }

    public static ConversationExtensionViewModelFactory providesConversationExtensionViewModelFactory(ConversationExtensionModule conversationExtensionModule, f fVar, Bundle bundle, AnalyticsProcessor analyticsProcessor, MessagingEventDispatcher messagingEventDispatcher) {
        ConversationExtensionViewModelFactory conversationExtensionViewModelFactoryProvidesConversationExtensionViewModelFactory = conversationExtensionModule.providesConversationExtensionViewModelFactory(fVar, bundle, analyticsProcessor, messagingEventDispatcher);
        x0.o(conversationExtensionViewModelFactoryProvidesConversationExtensionViewModelFactory);
        return conversationExtensionViewModelFactoryProvidesConversationExtensionViewModelFactory;
    }

    @Override // t70.a
    public ConversationExtensionViewModelFactory get() {
        return providesConversationExtensionViewModelFactory(this.module, (f) this.savedStateRegistryOwnerProvider.get(), (Bundle) this.defaultArgsProvider.get(), (AnalyticsProcessor) this.analyticsProcessorProvider.get(), (MessagingEventDispatcher) this.messagingEventDispatcherProvider.get());
    }
}
