package zendesk.messaging.android.internal.conversationscreen.di;

import android.os.Bundle;
import ea.f;
import k.h;
import o00.x0;
import s70.c;
import v80.b0;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.core.ui.android.internal.app.ProcessLifecycleEventObserver;
import zendesk.messaging.android.internal.ConversationTitleProvider;
import zendesk.messaging.android.internal.NewMessagesDividerHandler;
import zendesk.messaging.android.internal.UploadFileResourceProvider;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModelFactory;
import zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConversationScreenModule_ProvidesConversationViewModelFactoryFactory implements c {
    private final c activityProvider;
    private final c analyticsProcessorProvider;
    private final c conversationKitProvider;
    private final c conversationScreenRepositoryProvider;
    private final c conversationTitleProvider;
    private final c defaultArgsProvider;
    private final c messageLogEntryMapperProvider;
    private final c messagingEventDispatcherProvider;
    private final c messagingSettingsProvider;
    private final ConversationScreenModule module;
    private final c newMessagesDividerHandlerProvider;
    private final c processLifecycleEventObserverProvider;
    private final c savedStateRegistryOwnerProvider;
    private final c sdkCoroutineScopeProvider;
    private final c uploadFileResourceProvider;

    private ConversationScreenModule_ProvidesConversationViewModelFactoryFactory(ConversationScreenModule conversationScreenModule, c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6, c cVar7, c cVar8, c cVar9, c cVar10, c cVar11, c cVar12, c cVar13, c cVar14) {
        this.module = conversationScreenModule;
        this.messagingSettingsProvider = cVar;
        this.messageLogEntryMapperProvider = cVar2;
        this.newMessagesDividerHandlerProvider = cVar3;
        this.activityProvider = cVar4;
        this.savedStateRegistryOwnerProvider = cVar5;
        this.defaultArgsProvider = cVar6;
        this.sdkCoroutineScopeProvider = cVar7;
        this.uploadFileResourceProvider = cVar8;
        this.conversationScreenRepositoryProvider = cVar9;
        this.conversationTitleProvider = cVar10;
        this.conversationKitProvider = cVar11;
        this.messagingEventDispatcherProvider = cVar12;
        this.processLifecycleEventObserverProvider = cVar13;
        this.analyticsProcessorProvider = cVar14;
    }

    public static ConversationScreenModule_ProvidesConversationViewModelFactoryFactory create(ConversationScreenModule conversationScreenModule, c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6, c cVar7, c cVar8, c cVar9, c cVar10, c cVar11, c cVar12, c cVar13, c cVar14) {
        return new ConversationScreenModule_ProvidesConversationViewModelFactoryFactory(conversationScreenModule, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14);
    }

    public static ConversationScreenViewModelFactory providesConversationViewModelFactory(ConversationScreenModule conversationScreenModule, MessagingSettings messagingSettings, MessageLogEntryMapper messageLogEntryMapper, NewMessagesDividerHandler newMessagesDividerHandler, h hVar, f fVar, Bundle bundle, b0 b0Var, UploadFileResourceProvider uploadFileResourceProvider, ConversationScreenRepository conversationScreenRepository, ConversationTitleProvider conversationTitleProvider, ConversationKit conversationKit, MessagingEventDispatcher messagingEventDispatcher, ProcessLifecycleEventObserver processLifecycleEventObserver, AnalyticsProcessor analyticsProcessor) {
        ConversationScreenViewModelFactory conversationScreenViewModelFactoryProvidesConversationViewModelFactory = conversationScreenModule.providesConversationViewModelFactory(messagingSettings, messageLogEntryMapper, newMessagesDividerHandler, hVar, fVar, bundle, b0Var, uploadFileResourceProvider, conversationScreenRepository, conversationTitleProvider, conversationKit, messagingEventDispatcher, processLifecycleEventObserver, analyticsProcessor);
        x0.o(conversationScreenViewModelFactoryProvidesConversationViewModelFactory);
        return conversationScreenViewModelFactoryProvidesConversationViewModelFactory;
    }

    @Override // t70.a
    public ConversationScreenViewModelFactory get() {
        return providesConversationViewModelFactory(this.module, (MessagingSettings) this.messagingSettingsProvider.get(), (MessageLogEntryMapper) this.messageLogEntryMapperProvider.get(), (NewMessagesDividerHandler) this.newMessagesDividerHandlerProvider.get(), (h) this.activityProvider.get(), (f) this.savedStateRegistryOwnerProvider.get(), (Bundle) this.defaultArgsProvider.get(), (b0) this.sdkCoroutineScopeProvider.get(), (UploadFileResourceProvider) this.uploadFileResourceProvider.get(), (ConversationScreenRepository) this.conversationScreenRepositoryProvider.get(), (ConversationTitleProvider) this.conversationTitleProvider.get(), (ConversationKit) this.conversationKitProvider.get(), (MessagingEventDispatcher) this.messagingEventDispatcherProvider.get(), (ProcessLifecycleEventObserver) this.processLifecycleEventObserverProvider.get(), (AnalyticsProcessor) this.analyticsProcessorProvider.get());
    }
}
