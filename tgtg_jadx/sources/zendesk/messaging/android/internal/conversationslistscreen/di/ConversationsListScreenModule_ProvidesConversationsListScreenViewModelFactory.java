package zendesk.messaging.android.internal.conversationslistscreen.di;

import k.h;
import o00.x0;
import s70.c;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModelFactory;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationsListScreenModule_ProvidesConversationsListScreenViewModelFactory implements c {
    private final c activityProvider;
    private final c analyticsProcessorProvider;
    private final c conversationKitProvider;
    private final c messagingEventDispatcherProvider;
    private final c messagingSettingsProvider;
    private final ConversationsListScreenModule module;
    private final c repositoryProvider;

    private ConversationsListScreenModule_ProvidesConversationsListScreenViewModelFactory(ConversationsListScreenModule conversationsListScreenModule, c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6) {
        this.module = conversationsListScreenModule;
        this.messagingSettingsProvider = cVar;
        this.conversationKitProvider = cVar2;
        this.activityProvider = cVar3;
        this.repositoryProvider = cVar4;
        this.messagingEventDispatcherProvider = cVar5;
        this.analyticsProcessorProvider = cVar6;
    }

    public static ConversationsListScreenModule_ProvidesConversationsListScreenViewModelFactory create(ConversationsListScreenModule conversationsListScreenModule, c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6) {
        return new ConversationsListScreenModule_ProvidesConversationsListScreenViewModelFactory(conversationsListScreenModule, cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static ConversationsListScreenViewModelFactory providesConversationsListScreenViewModel(ConversationsListScreenModule conversationsListScreenModule, MessagingSettings messagingSettings, ConversationKit conversationKit, h hVar, ConversationsListRepository conversationsListRepository, MessagingEventDispatcher messagingEventDispatcher, AnalyticsProcessor analyticsProcessor) {
        ConversationsListScreenViewModelFactory conversationsListScreenViewModelFactoryProvidesConversationsListScreenViewModel = conversationsListScreenModule.providesConversationsListScreenViewModel(messagingSettings, conversationKit, hVar, conversationsListRepository, messagingEventDispatcher, analyticsProcessor);
        x0.o(conversationsListScreenViewModelFactoryProvidesConversationsListScreenViewModel);
        return conversationsListScreenViewModelFactoryProvidesConversationsListScreenViewModel;
    }

    @Override // t70.a
    public ConversationsListScreenViewModelFactory get() {
        return providesConversationsListScreenViewModel(this.module, (MessagingSettings) this.messagingSettingsProvider.get(), (ConversationKit) this.conversationKitProvider.get(), (h) this.activityProvider.get(), (ConversationsListRepository) this.repositoryProvider.get(), (MessagingEventDispatcher) this.messagingEventDispatcherProvider.get(), (AnalyticsProcessor) this.analyticsProcessorProvider.get());
    }
}
