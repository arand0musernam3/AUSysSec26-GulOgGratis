package zendesk.messaging.android.internal.di;

import ag.d;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import ea.f;
import java.util.Date;
import k.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import oa0.o0;
import s70.a;
import s70.c;
import v80.b0;
import v80.x;
import zendesk.android.ZendeskCredentials;
import zendesk.android.events.ZendeskEvent;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.core.android.internal.app.FeatureFlagManager;
import zendesk.core.android.internal.di.CoroutineDispatchersModule;
import zendesk.core.android.internal.di.CoroutineDispatchersModule_DefaultDispatcherFactory;
import zendesk.core.android.internal.di.CoroutineDispatchersModule_MainDispatcherFactory;
import zendesk.core.android.internal.di.CoroutineDispatchersModule_PersistenceDispatcherFactory;
import zendesk.core.android.internal.di.KotlinxSerializationModule_ProvideJsonFactory;
import zendesk.core.ui.android.internal.app.ProcessLifecycleEventObserver;
import zendesk.core.ui.android.internal.local.LocaleProvider;
import zendesk.core.ui.android.internal.local.LocaleProvider_Factory;
import zendesk.guidekit.android.GuideKit;
import zendesk.messaging.android.internal.ConversationTitleProvider;
import zendesk.messaging.android.internal.ConversationTitleProvider_Factory;
import zendesk.messaging.android.internal.MessagingEntryPointHandler;
import zendesk.messaging.android.internal.NewMessagesDividerHandler;
import zendesk.messaging.android.internal.UploadFileResourceProvider;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor_Factory;
import zendesk.messaging.android.internal.conversationscreen.ConversationFragment;
import zendesk.messaging.android.internal.conversationscreen.ConversationFragment_MembersInjector;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenRepository;
import zendesk.messaging.android.internal.conversationscreen.ConversationScreenViewModelFactory;
import zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity;
import zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity_MembersInjector;
import zendesk.messaging.android.internal.conversationscreen.ImageViewerViewModelFactory;
import zendesk.messaging.android.internal.conversationscreen.MessageContainerFactory;
import zendesk.messaging.android.internal.conversationscreen.MessageLogEntryMapper;
import zendesk.messaging.android.internal.conversationscreen.MessageLogLabelProvider;
import zendesk.messaging.android.internal.conversationscreen.MessageLogTimestampFormatter;
import zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorage;
import zendesk.messaging.android.internal.conversationscreen.cache.MessagingStorageSerializer_Factory;
import zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment;
import zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment_MembersInjector;
import zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionViewModelFactory;
import zendesk.messaging.android.internal.conversationscreen.conversationextension.di.ConversationExtensionFragmentComponent;
import zendesk.messaging.android.internal.conversationscreen.conversationextension.di.ConversationExtensionModule;
import zendesk.messaging.android.internal.conversationscreen.conversationextension.di.ConversationExtensionModule_ProvidesConversationExtensionViewModelFactoryFactory;
import zendesk.messaging.android.internal.conversationscreen.di.ConversationFragmentComponent;
import zendesk.messaging.android.internal.conversationscreen.di.ConversationScreenModule;
import zendesk.messaging.android.internal.conversationscreen.di.ConversationScreenModule_ProvidesConversationViewModelFactoryFactory;
import zendesk.messaging.android.internal.conversationscreen.di.ConversationScreenModule_ProvidesImageViewerViewModelFactoryFactory;
import zendesk.messaging.android.internal.conversationscreen.di.ConversationScreenModule_ProvidesResourceProviderFactory;
import zendesk.messaging.android.internal.conversationscreen.di.ImageViewerComponent;
import zendesk.messaging.android.internal.conversationscreen.di.MessageLogModule;
import zendesk.messaging.android.internal.conversationscreen.di.MessageLogModule_ProvidesMessageContainerFactoryFactory;
import zendesk.messaging.android.internal.conversationscreen.di.MessageLogModule_ProvidesMessageLogLabelProviderFactory;
import zendesk.messaging.android.internal.conversationscreen.di.MessageLogModule_ProvidesMessageLogTimestampFormatterFactory;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment_MembersInjector;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModelFactory;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.di.GuideArticleFragmentComponent;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.di.GuideArticleViewerModule;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.di.GuideArticleViewerModule_ProvidesGuideArticleViewerViewModelFactoryFactory;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.di.GuideKitModule;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.di.GuideKitModule_ProvidesGuideKitFactory;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment_MembersInjector;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModelFactory;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationLogEntryMapper_Factory;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationLogTimestampFormatter;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationLogTimestampFormatter_Factory;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationsListRepository_Factory;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListInMemoryCache_Factory;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageIOImpl_Factory;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.cache.ConversationsListLocalStorageSerializer_Factory;
import zendesk.messaging.android.internal.conversationslistscreen.di.ConversationListFragmentComponent;
import zendesk.messaging.android.internal.conversationslistscreen.di.ConversationsListLocalStorageModule;
import zendesk.messaging.android.internal.conversationslistscreen.di.ConversationsListLocalStorageModule_ProvidesConversationsListStorageFactory;
import zendesk.messaging.android.internal.conversationslistscreen.di.ConversationsListLocalStorageModule_ProvidesConversationsListStorageTypeFactory;
import zendesk.messaging.android.internal.conversationslistscreen.di.ConversationsListScreenModule;
import zendesk.messaging.android.internal.conversationslistscreen.di.ConversationsListScreenModule_ProvidesConversationsListScreenViewModelFactory;
import zendesk.messaging.android.internal.di.MessagingActivityComponent;
import zendesk.messaging.android.internal.di.MessagingComponent;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher_Factory;
import zendesk.messaging.android.internal.messagingscreen.BackNavigationResolver;
import zendesk.messaging.android.internal.messagingscreen.MessagingActivity;
import zendesk.messaging.android.internal.messagingscreen.MessagingActivity_MembersInjector;
import zendesk.messaging.android.internal.messagingscreen.MessagingNavigator;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModelFactory;
import zendesk.messaging.android.internal.messagingscreen.di.MessagingNavigatorModule;
import zendesk.messaging.android.internal.messagingscreen.di.MessagingNavigatorModule_ProvideFragmentManagerFactory;
import zendesk.messaging.android.internal.rest.HeaderFactory_Factory;
import zendesk.messaging.android.internal.rest.NetworkModule;
import zendesk.messaging.android.internal.rest.NetworkModule_OkHttpClientFactory;
import zendesk.messaging.android.internal.rest.NetworkModule_ProvideKotlinSerializationFactory;
import zendesk.messaging.android.internal.rest.NetworkModule_RetrofitFactory;
import zendesk.messaging.android.internal.validation.ConversationFieldManager;
import zendesk.messaging.android.internal.validation.ConversationFieldRepository;
import zendesk.messaging.android.internal.validation.ConversationFieldService;
import zendesk.messaging.android.internal.validation.ConversationFieldValidator;
import zendesk.messaging.android.internal.validation.ValidationRules;
import zendesk.messaging.android.internal.validation.di.ConversationFieldModule;
import zendesk.messaging.android.internal.validation.di.ConversationFieldModule_ProvideConversationFieldServiceFactory;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class DaggerMessagingComponent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class ConversationExtensionFragmentComponentImpl implements ConversationExtensionFragmentComponent {
        private final ConversationExtensionFragmentComponentImpl conversationExtensionFragmentComponentImpl = this;
        private final ConversationExtensionModule conversationExtensionModule;
        private final Bundle defaultArgs;
        private final MessagingComponentImpl messagingComponentImpl;
        private final f savedStateRegistryOwner;

        public ConversationExtensionFragmentComponentImpl(MessagingComponentImpl messagingComponentImpl, ConversationExtensionModule conversationExtensionModule, f fVar, Bundle bundle) {
            this.messagingComponentImpl = messagingComponentImpl;
            this.conversationExtensionModule = conversationExtensionModule;
            this.savedStateRegistryOwner = fVar;
            this.defaultArgs = bundle;
        }

        private ConversationExtensionBottomSheetFragment injectConversationExtensionBottomSheetFragment(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment) {
            ConversationExtensionBottomSheetFragment_MembersInjector.injectConversationExtensionViewModelFactory(conversationExtensionBottomSheetFragment, conversationExtensionViewModelFactory());
            ConversationExtensionBottomSheetFragment_MembersInjector.injectUserDarkColors(conversationExtensionBottomSheetFragment, this.messagingComponentImpl.userDarkColors);
            ConversationExtensionBottomSheetFragment_MembersInjector.injectUserLightColors(conversationExtensionBottomSheetFragment, this.messagingComponentImpl.userLightColors);
            ConversationExtensionBottomSheetFragment_MembersInjector.injectMessagingSettings(conversationExtensionBottomSheetFragment, this.messagingComponentImpl.messagingSettings);
            ConversationExtensionBottomSheetFragment_MembersInjector.injectFeatureFlagManager(conversationExtensionBottomSheetFragment, this.messagingComponentImpl.featureFlagManager);
            return conversationExtensionBottomSheetFragment;
        }

        public ConversationExtensionViewModelFactory conversationExtensionViewModelFactory() {
            return ConversationExtensionModule_ProvidesConversationExtensionViewModelFactoryFactory.providesConversationExtensionViewModelFactory(this.conversationExtensionModule, this.savedStateRegistryOwner, this.defaultArgs, (AnalyticsProcessor) this.messagingComponentImpl.analyticsProcessorProvider.get(), (MessagingEventDispatcher) this.messagingComponentImpl.messagingEventDispatcherProvider.get());
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.di.ConversationExtensionFragmentComponent
        public void inject(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment) {
            injectConversationExtensionBottomSheetFragment(conversationExtensionBottomSheetFragment);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class ConversationFragmentComponentImpl implements ConversationFragmentComponent {
        private final h activity;
        private final ConversationFragmentComponentImpl conversationFragmentComponentImpl = this;
        private final ConversationScreenModule conversationScreenModule;
        private final Bundle defaultArgs;
        private final MessageLogModule messageLogModule;
        private final MessagingComponentImpl messagingComponentImpl;
        private final MessagingNavigatorModule messagingNavigatorModule;
        private final f savedStateRegistryOwner;

        public ConversationFragmentComponentImpl(MessagingComponentImpl messagingComponentImpl, ConversationScreenModule conversationScreenModule, MessageLogModule messageLogModule, MessagingNavigatorModule messagingNavigatorModule, h hVar, f fVar, Bundle bundle) {
            this.messagingComponentImpl = messagingComponentImpl;
            this.conversationScreenModule = conversationScreenModule;
            this.messageLogModule = messageLogModule;
            this.activity = hVar;
            this.savedStateRegistryOwner = fVar;
            this.defaultArgs = bundle;
            this.messagingNavigatorModule = messagingNavigatorModule;
        }

        private ConversationFragment injectConversationFragment(ConversationFragment conversationFragment) {
            ConversationFragment_MembersInjector.injectConversationScreenViewModelFactory(conversationFragment, conversationScreenViewModelFactory());
            ConversationFragment_MembersInjector.injectMessagingSettings(conversationFragment, this.messagingComponentImpl.messagingSettings);
            ConversationFragment_MembersInjector.injectUserDarkColors(conversationFragment, this.messagingComponentImpl.userDarkColors);
            ConversationFragment_MembersInjector.injectUserLightColors(conversationFragment, this.messagingComponentImpl.userLightColors);
            ConversationFragment_MembersInjector.injectGuideKit(conversationFragment, (GuideKit) this.messagingComponentImpl.providesGuideKitProvider.get());
            ConversationFragment_MembersInjector.injectMessagingNavigator(conversationFragment, messagingNavigator());
            ConversationFragment_MembersInjector.injectBackNavigationResolver(conversationFragment, backNavigationResolver());
            ConversationFragment_MembersInjector.injectFeatureFlagManager(conversationFragment, this.messagingComponentImpl.featureFlagManager);
            return conversationFragment;
        }

        public BackNavigationResolver backNavigationResolver() {
            return new BackNavigationResolver(this.messagingComponentImpl.conversationKit, this.messagingComponentImpl.messagingSettings);
        }

        public ConversationLogTimestampFormatter conversationLogTimestampFormatter() {
            return new ConversationLogTimestampFormatter(this.messagingComponentImpl.context, this.messagingComponentImpl.localeProvider(), this.messagingComponentImpl.namedBoolean());
        }

        public ConversationScreenRepository conversationScreenRepository() {
            return new ConversationScreenRepository(this.messagingComponentImpl.conversationKit, messagingStorage(), CoroutineDispatchersModule_DefaultDispatcherFactory.defaultDispatcher(this.messagingComponentImpl.coroutineDispatchersModule), (MessagingEventDispatcher) this.messagingComponentImpl.messagingEventDispatcherProvider.get());
        }

        public ConversationScreenViewModelFactory conversationScreenViewModelFactory() {
            return ConversationScreenModule_ProvidesConversationViewModelFactoryFactory.providesConversationViewModelFactory(this.conversationScreenModule, this.messagingComponentImpl.messagingSettings, messageLogEntryMapper(), new NewMessagesDividerHandler(), this.activity, this.savedStateRegistryOwner, this.defaultArgs, this.messagingComponentImpl.coroutineScope, uploadFileResourceProvider(), conversationScreenRepository(), conversationTitleProvider(), this.messagingComponentImpl.conversationKit, (MessagingEventDispatcher) this.messagingComponentImpl.messagingEventDispatcherProvider.get(), this.messagingComponentImpl.processLifecycleEventObserver, (AnalyticsProcessor) this.messagingComponentImpl.analyticsProcessorProvider.get());
        }

        public ConversationTitleProvider conversationTitleProvider() {
            return new ConversationTitleProvider(this.messagingComponentImpl.context, this.messagingComponentImpl.localeProvider(), conversationLogTimestampFormatter(), this.messagingComponentImpl.namedBoolean());
        }

        public FragmentManager fragmentManager() {
            return MessagingNavigatorModule_ProvideFragmentManagerFactory.provideFragmentManager(this.messagingNavigatorModule, this.activity);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.di.ConversationFragmentComponent
        public void inject(ConversationFragment conversationFragment) {
            injectConversationFragment(conversationFragment);
        }

        public MessageContainerFactory messageContainerFactory() {
            return MessageLogModule_ProvidesMessageContainerFactoryFactory.providesMessageContainerFactory(this.messageLogModule, messageLogLabelProvider(), messageLogTimestampFormatter());
        }

        public MessageLogEntryMapper messageLogEntryMapper() {
            return new MessageLogEntryMapper(messageContainerFactory(), messageLogLabelProvider(), messageLogTimestampFormatter(), this.messagingComponentImpl.currentTimeProvider, this.messagingComponentImpl.idProvider, CoroutineDispatchersModule_DefaultDispatcherFactory.defaultDispatcher(this.messagingComponentImpl.coroutineDispatchersModule));
        }

        public MessageLogLabelProvider messageLogLabelProvider() {
            return MessageLogModule_ProvidesMessageLogLabelProviderFactory.providesMessageLogLabelProvider(this.messageLogModule, this.activity);
        }

        public MessageLogTimestampFormatter messageLogTimestampFormatter() {
            return MessageLogModule_ProvidesMessageLogTimestampFormatterFactory.providesMessageLogTimestampFormatter(this.messageLogModule, this.messagingComponentImpl.context, this.messagingComponentImpl.localeProvider());
        }

        public MessagingNavigator messagingNavigator() {
            return new MessagingNavigator(fragmentManager(), this.messagingNavigatorModule.provideFragmentContainerId());
        }

        public MessagingStorage messagingStorage() {
            return new MessagingStorage(CoroutineDispatchersModule_PersistenceDispatcherFactory.persistenceDispatcher(this.messagingComponentImpl.coroutineDispatchersModule), (Storage) this.messagingComponentImpl.providesStorageProvider.get());
        }

        public UploadFileResourceProvider uploadFileResourceProvider() {
            return ConversationScreenModule_ProvidesResourceProviderFactory.providesResourceProvider(this.conversationScreenModule, this.messagingComponentImpl.context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class ConversationListFragmentComponentImpl implements ConversationListFragmentComponent {
        private final h activity;
        c activityProvider;
        private final ConversationListFragmentComponentImpl conversationListFragmentComponentImpl = this;
        c conversationLogEntryMapperProvider;
        c conversationLogTimestampFormatterProvider;
        c conversationTitleProvider;
        c conversationsListLocalStorageIOImplProvider;
        c conversationsListLocalStorageSerializerProvider;
        c conversationsListRepositoryProvider;
        private final MessagingComponentImpl messagingComponentImpl;
        private final MessagingNavigatorModule messagingNavigatorModule;
        c providesConversationsListLocalStorageProvider;
        c providesConversationsListScreenViewModelProvider;
        c providesConversationsListStorageProvider;
        c providesConversationsListStorageTypeProvider;

        public ConversationListFragmentComponentImpl(MessagingComponentImpl messagingComponentImpl, ConversationsListScreenModule conversationsListScreenModule, ConversationsListLocalStorageModule conversationsListLocalStorageModule, MessagingNavigatorModule messagingNavigatorModule, h hVar) {
            this.messagingComponentImpl = messagingComponentImpl;
            this.messagingNavigatorModule = messagingNavigatorModule;
            this.activity = hVar;
            initialize(conversationsListScreenModule, conversationsListLocalStorageModule, messagingNavigatorModule, hVar);
        }

        private void initialize(ConversationsListScreenModule conversationsListScreenModule, ConversationsListLocalStorageModule conversationsListLocalStorageModule, MessagingNavigatorModule messagingNavigatorModule, h hVar) {
            this.activityProvider = d.a(hVar);
            MessagingComponentImpl messagingComponentImpl = this.messagingComponentImpl;
            this.conversationLogTimestampFormatterProvider = ConversationLogTimestampFormatter_Factory.create(messagingComponentImpl.contextProvider, messagingComponentImpl.localeProvider, messagingComponentImpl.providesIs24HoursProvider);
            ConversationsListLocalStorageSerializer_Factory conversationsListLocalStorageSerializer_FactoryCreate = ConversationsListLocalStorageSerializer_Factory.create(KotlinxSerializationModule_ProvideJsonFactory.create());
            this.conversationsListLocalStorageSerializerProvider = conversationsListLocalStorageSerializer_FactoryCreate;
            c cVarA = a.a(ConversationsListLocalStorageModule_ProvidesConversationsListStorageTypeFactory.create(conversationsListLocalStorageModule, conversationsListLocalStorageSerializer_FactoryCreate));
            this.providesConversationsListStorageTypeProvider = cVarA;
            MessagingComponentImpl messagingComponentImpl2 = this.messagingComponentImpl;
            c cVarA2 = a.a(ConversationsListLocalStorageModule_ProvidesConversationsListStorageFactory.create(conversationsListLocalStorageModule, messagingComponentImpl2.contextProvider, cVarA, messagingComponentImpl2.messagingSettingsProvider));
            this.providesConversationsListStorageProvider = cVarA2;
            ConversationsListLocalStorageIOImpl_Factory conversationsListLocalStorageIOImpl_FactoryCreate = ConversationsListLocalStorageIOImpl_Factory.create(this.messagingComponentImpl.persistenceDispatcherProvider, cVarA2);
            this.conversationsListLocalStorageIOImplProvider = conversationsListLocalStorageIOImpl_FactoryCreate;
            this.providesConversationsListLocalStorageProvider = a.a(conversationsListLocalStorageIOImpl_FactoryCreate);
            MessagingComponentImpl messagingComponentImpl3 = this.messagingComponentImpl;
            ConversationTitleProvider_Factory conversationTitleProvider_FactoryCreate = ConversationTitleProvider_Factory.create(messagingComponentImpl3.contextProvider, messagingComponentImpl3.localeProvider, this.conversationLogTimestampFormatterProvider, messagingComponentImpl3.providesIs24HoursProvider);
            this.conversationTitleProvider = conversationTitleProvider_FactoryCreate;
            MessagingComponentImpl messagingComponentImpl4 = this.messagingComponentImpl;
            ConversationLogEntryMapper_Factory conversationLogEntryMapper_FactoryCreate = ConversationLogEntryMapper_Factory.create(messagingComponentImpl4.contextProvider, this.conversationLogTimestampFormatterProvider, messagingComponentImpl4.messagingSettingsProvider, this.providesConversationsListLocalStorageProvider, conversationTitleProvider_FactoryCreate);
            this.conversationLogEntryMapperProvider = conversationLogEntryMapper_FactoryCreate;
            MessagingComponentImpl messagingComponentImpl5 = this.messagingComponentImpl;
            ConversationsListRepository_Factory conversationsListRepository_FactoryCreate = ConversationsListRepository_Factory.create(messagingComponentImpl5.conversationKitProvider, messagingComponentImpl5.defaultDispatcherProvider, conversationLogEntryMapper_FactoryCreate, ConversationsListInMemoryCache_Factory.create());
            this.conversationsListRepositoryProvider = conversationsListRepository_FactoryCreate;
            MessagingComponentImpl messagingComponentImpl6 = this.messagingComponentImpl;
            this.providesConversationsListScreenViewModelProvider = a.a(ConversationsListScreenModule_ProvidesConversationsListScreenViewModelFactory.create(conversationsListScreenModule, messagingComponentImpl6.messagingSettingsProvider, messagingComponentImpl6.conversationKitProvider, this.activityProvider, conversationsListRepository_FactoryCreate, messagingComponentImpl6.messagingEventDispatcherProvider, messagingComponentImpl6.analyticsProcessorProvider));
        }

        private ConversationListFragment injectConversationListFragment(ConversationListFragment conversationListFragment) {
            ConversationListFragment_MembersInjector.injectConversationsListScreenViewModelFactory(conversationListFragment, (ConversationsListScreenViewModelFactory) this.providesConversationsListScreenViewModelProvider.get());
            ConversationListFragment_MembersInjector.injectMessagingSettings(conversationListFragment, this.messagingComponentImpl.messagingSettings);
            ConversationListFragment_MembersInjector.injectUserDarkColors(conversationListFragment, this.messagingComponentImpl.userDarkColors);
            ConversationListFragment_MembersInjector.injectUserLightColors(conversationListFragment, this.messagingComponentImpl.userLightColors);
            ConversationListFragment_MembersInjector.injectFeatureFlagManager(conversationListFragment, this.messagingComponentImpl.featureFlagManager);
            ConversationListFragment_MembersInjector.injectMessagingNavigator(conversationListFragment, messagingNavigator());
            return conversationListFragment;
        }

        public FragmentManager fragmentManager() {
            return MessagingNavigatorModule_ProvideFragmentManagerFactory.provideFragmentManager(this.messagingNavigatorModule, this.activity);
        }

        @Override // zendesk.messaging.android.internal.conversationslistscreen.di.ConversationListFragmentComponent
        public void inject(ConversationListFragment conversationListFragment) {
            injectConversationListFragment(conversationListFragment);
        }

        public MessagingNavigator messagingNavigator() {
            return new MessagingNavigator(fragmentManager(), this.messagingNavigatorModule.provideFragmentContainerId());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class GuideArticleFragmentComponentImpl implements GuideArticleFragmentComponent {
        private final Bundle defaultArgs;
        private final GuideArticleFragmentComponentImpl guideArticleFragmentComponentImpl = this;
        private final MessagingComponentImpl messagingComponentImpl;
        private final f savedStateRegistryOwner;

        public GuideArticleFragmentComponentImpl(MessagingComponentImpl messagingComponentImpl, f fVar, Bundle bundle) {
            this.messagingComponentImpl = messagingComponentImpl;
            this.savedStateRegistryOwner = fVar;
            this.defaultArgs = bundle;
        }

        private GuideArticleViewerBottomSheetFragment injectGuideArticleViewerBottomSheetFragment(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment) {
            GuideArticleViewerBottomSheetFragment_MembersInjector.injectGuideKit(guideArticleViewerBottomSheetFragment, (GuideKit) this.messagingComponentImpl.providesGuideKitProvider.get());
            GuideArticleViewerBottomSheetFragment_MembersInjector.injectGuideArticleViewerViewModelFactory(guideArticleViewerBottomSheetFragment, guideArticleViewerViewModelFactory());
            GuideArticleViewerBottomSheetFragment_MembersInjector.injectUserDarkColors(guideArticleViewerBottomSheetFragment, this.messagingComponentImpl.userDarkColors);
            GuideArticleViewerBottomSheetFragment_MembersInjector.injectUserLightColors(guideArticleViewerBottomSheetFragment, this.messagingComponentImpl.userLightColors);
            GuideArticleViewerBottomSheetFragment_MembersInjector.injectBaseUrl(guideArticleViewerBottomSheetFragment, this.messagingComponentImpl.baseUrl);
            GuideArticleViewerBottomSheetFragment_MembersInjector.injectMessagingSettings(guideArticleViewerBottomSheetFragment, this.messagingComponentImpl.messagingSettings);
            return guideArticleViewerBottomSheetFragment;
        }

        public GuideArticleViewerViewModelFactory guideArticleViewerViewModelFactory() {
            return GuideArticleViewerModule_ProvidesGuideArticleViewerViewModelFactoryFactory.providesGuideArticleViewerViewModelFactory(this.messagingComponentImpl.guideArticleViewerModule, (GuideKit) this.messagingComponentImpl.providesGuideKitProvider.get(), (MessagingEventDispatcher) this.messagingComponentImpl.messagingEventDispatcherProvider.get(), this.savedStateRegistryOwner, this.defaultArgs);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.di.GuideArticleFragmentComponent
        public void inject(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment) {
            injectGuideArticleViewerBottomSheetFragment(guideArticleViewerBottomSheetFragment);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class ImageViewerComponentImpl implements ImageViewerComponent {
        private final ConversationScreenModule conversationScreenModule;
        private final Bundle defaultArgs;
        private final ImageViewerComponentImpl imageViewerComponentImpl = this;
        private final MessagingComponentImpl messagingComponentImpl;
        private final f savedStateRegistryOwner;

        public ImageViewerComponentImpl(MessagingComponentImpl messagingComponentImpl, ConversationScreenModule conversationScreenModule, h hVar, f fVar, Bundle bundle) {
            this.messagingComponentImpl = messagingComponentImpl;
            this.conversationScreenModule = conversationScreenModule;
            this.savedStateRegistryOwner = fVar;
            this.defaultArgs = bundle;
        }

        private ImageViewerActivity injectImageViewerActivity(ImageViewerActivity imageViewerActivity) {
            ImageViewerActivity_MembersInjector.injectImageViewerViewModelFactory(imageViewerActivity, imageViewerViewModelFactory());
            ImageViewerActivity_MembersInjector.injectMessagingSettings(imageViewerActivity, this.messagingComponentImpl.messagingSettings);
            ImageViewerActivity_MembersInjector.injectUserDarkColors(imageViewerActivity, this.messagingComponentImpl.userDarkColors);
            ImageViewerActivity_MembersInjector.injectUserLightColors(imageViewerActivity, this.messagingComponentImpl.userLightColors);
            ImageViewerActivity_MembersInjector.injectFeatureFlagManager(imageViewerActivity, this.messagingComponentImpl.featureFlagManager);
            return imageViewerActivity;
        }

        public ImageViewerViewModelFactory imageViewerViewModelFactory() {
            return ConversationScreenModule_ProvidesImageViewerViewModelFactoryFactory.providesImageViewerViewModelFactory(this.conversationScreenModule, this.savedStateRegistryOwner, this.defaultArgs);
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.di.ImageViewerComponent
        public void inject(ImageViewerActivity imageViewerActivity) {
            injectImageViewerActivity(imageViewerActivity);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class MessagingActivityComponentImpl implements MessagingActivityComponent {
        private final h activity;
        private final Bundle defaultArgs;
        private final MessagingActivityComponentImpl messagingActivityComponentImpl = this;
        private final MessagingComponentImpl messagingComponentImpl;
        private final MessagingNavigatorModule messagingNavigatorModule;
        private final MessagingScreenModule messagingScreenModule;
        private final f savedStateRegistryOwner;

        public MessagingActivityComponentImpl(MessagingComponentImpl messagingComponentImpl, MessagingScreenModule messagingScreenModule, MessagingNavigatorModule messagingNavigatorModule, h hVar, f fVar, Bundle bundle) {
            this.messagingComponentImpl = messagingComponentImpl;
            this.messagingScreenModule = messagingScreenModule;
            this.savedStateRegistryOwner = fVar;
            this.defaultArgs = bundle;
            this.messagingNavigatorModule = messagingNavigatorModule;
            this.activity = hVar;
        }

        private MessagingActivity injectMessagingActivity(MessagingActivity messagingActivity) {
            MessagingActivity_MembersInjector.injectMessagingSettings(messagingActivity, this.messagingComponentImpl.messagingSettings);
            MessagingActivity_MembersInjector.injectUserDarkColors(messagingActivity, this.messagingComponentImpl.userDarkColors);
            MessagingActivity_MembersInjector.injectUserLightColors(messagingActivity, this.messagingComponentImpl.userLightColors);
            MessagingActivity_MembersInjector.injectMessagingScreenViewModelFactory(messagingActivity, messagingScreenViewModelFactory());
            MessagingActivity_MembersInjector.injectMessagingNavigator(messagingActivity, messagingNavigator());
            return messagingActivity;
        }

        public FragmentManager fragmentManager() {
            return MessagingNavigatorModule_ProvideFragmentManagerFactory.provideFragmentManager(this.messagingNavigatorModule, this.activity);
        }

        @Override // zendesk.messaging.android.internal.di.MessagingActivityComponent
        public void inject(MessagingActivity messagingActivity) {
            injectMessagingActivity(messagingActivity);
        }

        public MessagingEntryPointHandler messagingEntryPointHandler() {
            return new MessagingEntryPointHandler(this.messagingComponentImpl.conversationKit, this.messagingComponentImpl.messagingSettings);
        }

        public MessagingNavigator messagingNavigator() {
            return new MessagingNavigator(fragmentManager(), this.messagingNavigatorModule.provideFragmentContainerId());
        }

        public MessagingScreenViewModelFactory messagingScreenViewModelFactory() {
            return MessagingScreenModule_ProvidesMessagingScreenViewModelFactoryFactory.providesMessagingScreenViewModelFactory(this.messagingScreenModule, messagingEntryPointHandler(), (AnalyticsProcessor) this.messagingComponentImpl.analyticsProcessorProvider.get(), (MessagingEventDispatcher) this.messagingComponentImpl.messagingEventDispatcherProvider.get(), this.savedStateRegistryOwner, this.defaultArgs);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class MessagingComponentImpl implements MessagingComponent {
        c analyticsProcessorProvider;
        private final String baseUrl;
        c baseUrlProvider;
        private final Context context;
        c contextProvider;
        private final ConversationFieldModule conversationFieldModule;
        private final ConversationKit conversationKit;
        c conversationKitProvider;
        private final CoroutineDispatchersModule coroutineDispatchersModule;
        private final b0 coroutineScope;
        c coroutineScopeProvider;
        private final Function0<? extends Date> currentTimeProvider;
        c defaultDispatcherProvider;
        c dispatchEventProvider;
        private final FeatureFlagManager featureFlagManager;
        private final GuideArticleViewerModule guideArticleViewerModule;
        c headerFactoryProvider;
        private final Function0<String> idProvider;
        c localeProvider;
        private final MessagingComponentImpl messagingComponentImpl = this;
        private final MessagingDateFormatModule messagingDateFormatModule;
        c messagingEventDispatcherProvider;
        private final MessagingSettings messagingSettings;
        c messagingSettingsProvider;
        c messagingStorageSerializerProvider;
        c okHttpClientProvider;
        c persistenceDispatcherProvider;
        private final ProcessLifecycleEventObserver processLifecycleEventObserver;
        c provideKotlinSerializationProvider;
        c providesAnalyticsKitProvider;
        c providesGuideKitProvider;
        c providesIdentifierProvider;
        c providesIs24HoursProvider;
        c providesStorageProvider;
        c providesStorageTypeProvider;
        c retrofitProvider;
        private final UserColors userDarkColors;
        private final UserColors userLightColors;

        public MessagingComponentImpl(StorageModule storageModule, NetworkModule networkModule, ConversationFieldModule conversationFieldModule, CoroutineDispatchersModule coroutineDispatchersModule, GuideKitModule guideKitModule, AnalyticsKitModule analyticsKitModule, GuideArticleViewerModule guideArticleViewerModule, MessagingDateFormatModule messagingDateFormatModule, Context context, ZendeskCredentials zendeskCredentials, String str, MessagingSettings messagingSettings, ConversationKit conversationKit, Function1<? super ZendeskEvent, Unit> function1, b0 b0Var, UserColors userColors, UserColors userColors2, FeatureFlagManager featureFlagManager, Function0<? extends Date> function0, Function0<String> function02, ProcessLifecycleEventObserver processLifecycleEventObserver) {
            this.conversationFieldModule = conversationFieldModule;
            this.conversationKit = conversationKit;
            this.featureFlagManager = featureFlagManager;
            this.coroutineDispatchersModule = coroutineDispatchersModule;
            this.messagingSettings = messagingSettings;
            this.userDarkColors = userColors2;
            this.userLightColors = userColors;
            this.context = context;
            this.currentTimeProvider = function0;
            this.idProvider = function02;
            this.coroutineScope = b0Var;
            this.messagingDateFormatModule = messagingDateFormatModule;
            this.processLifecycleEventObserver = processLifecycleEventObserver;
            this.guideArticleViewerModule = guideArticleViewerModule;
            this.baseUrl = str;
            initialize(storageModule, networkModule, conversationFieldModule, coroutineDispatchersModule, guideKitModule, analyticsKitModule, guideArticleViewerModule, messagingDateFormatModule, context, zendeskCredentials, str, messagingSettings, conversationKit, function1, b0Var, userColors, userColors2, featureFlagManager, function0, function02, processLifecycleEventObserver);
        }

        private void initialize(StorageModule storageModule, NetworkModule networkModule, ConversationFieldModule conversationFieldModule, CoroutineDispatchersModule coroutineDispatchersModule, GuideKitModule guideKitModule, AnalyticsKitModule analyticsKitModule, GuideArticleViewerModule guideArticleViewerModule, MessagingDateFormatModule messagingDateFormatModule, Context context, ZendeskCredentials zendeskCredentials, String str, MessagingSettings messagingSettings, ConversationKit conversationKit, Function1<? super ZendeskEvent, Unit> function1, b0 b0Var, UserColors userColors, UserColors userColors2, FeatureFlagManager featureFlagManager, Function0<? extends Date> function0, Function0<String> function02, ProcessLifecycleEventObserver processLifecycleEventObserver) {
            this.baseUrlProvider = d.a(str);
            d dVarA = d.a(context);
            this.contextProvider = dVarA;
            LocaleProvider_Factory localeProvider_FactoryCreate = LocaleProvider_Factory.create(dVarA);
            this.localeProvider = localeProvider_FactoryCreate;
            HeaderFactory_Factory headerFactory_FactoryCreate = HeaderFactory_Factory.create(localeProvider_FactoryCreate);
            this.headerFactoryProvider = headerFactory_FactoryCreate;
            this.okHttpClientProvider = a.a(NetworkModule_OkHttpClientFactory.create(networkModule, headerFactory_FactoryCreate));
            c cVarA = a.a(NetworkModule_ProvideKotlinSerializationFactory.create(networkModule, KotlinxSerializationModule_ProvideJsonFactory.create()));
            this.provideKotlinSerializationProvider = cVarA;
            this.retrofitProvider = a.a(NetworkModule_RetrofitFactory.create(networkModule, this.baseUrlProvider, this.okHttpClientProvider, cVarA));
            this.dispatchEventProvider = d.a(function1);
            d dVarA2 = d.a(conversationKit);
            this.conversationKitProvider = dVarA2;
            this.messagingEventDispatcherProvider = a.a(MessagingEventDispatcher_Factory.create(this.dispatchEventProvider, dVarA2));
            this.messagingSettingsProvider = d.a(messagingSettings);
            d dVarA3 = d.a(b0Var);
            this.coroutineScopeProvider = dVarA3;
            c cVarA2 = a.a(AnalyticsKitModule_ProvidesAnalyticsKitFactory.create(analyticsKitModule, this.contextProvider, this.baseUrlProvider, this.messagingSettingsProvider, dVarA3));
            this.providesAnalyticsKitProvider = cVarA2;
            this.analyticsProcessorProvider = a.a(AnalyticsProcessor_Factory.create(cVarA2, this.conversationKitProvider, this.localeProvider, this.messagingSettingsProvider));
            MessagingStorageSerializer_Factory messagingStorageSerializer_FactoryCreate = MessagingStorageSerializer_Factory.create(KotlinxSerializationModule_ProvideJsonFactory.create());
            this.messagingStorageSerializerProvider = messagingStorageSerializer_FactoryCreate;
            this.providesStorageTypeProvider = a.a(StorageModule_ProvidesStorageTypeFactory.create(storageModule, messagingStorageSerializer_FactoryCreate));
            c cVarA3 = a.a(StorageModule_ProvidesIdentifierFactory.create(storageModule, this.messagingSettingsProvider));
            this.providesIdentifierProvider = cVarA3;
            this.providesStorageProvider = a.a(StorageModule_ProvidesStorageFactory.create(storageModule, this.contextProvider, this.providesStorageTypeProvider, cVarA3));
            this.providesGuideKitProvider = a.a(GuideKitModule_ProvidesGuideKitFactory.create(guideKitModule, this.contextProvider, this.baseUrlProvider, this.messagingSettingsProvider, this.coroutineScopeProvider));
            this.defaultDispatcherProvider = CoroutineDispatchersModule_DefaultDispatcherFactory.create(coroutineDispatchersModule);
            this.providesIs24HoursProvider = MessagingDateFormatModule_ProvidesIs24HoursFactory.create(messagingDateFormatModule, this.contextProvider);
            this.persistenceDispatcherProvider = CoroutineDispatchersModule_PersistenceDispatcherFactory.create(coroutineDispatchersModule);
        }

        @Override // zendesk.messaging.android.internal.di.MessagingComponent
        public AnalyticsProcessor analyticsProcessor() {
            return (AnalyticsProcessor) this.analyticsProcessorProvider.get();
        }

        @Override // zendesk.messaging.android.internal.di.MessagingComponent
        public ConversationExtensionFragmentComponent.Factory conversationExtensionFragmentComponent() {
            return new ConversationExtensionFragmentComponentFactory(this.messagingComponentImpl, 0);
        }

        @Override // zendesk.messaging.android.internal.di.MessagingComponent
        public ConversationFieldManager conversationFieldManager() {
            return new ConversationFieldManager(conversationFieldValidator(), this.conversationKit, (MessagingEventDispatcher) this.messagingEventDispatcherProvider.get(), this.featureFlagManager);
        }

        public ConversationFieldRepository conversationFieldRepository() {
            return new ConversationFieldRepository(conversationFieldService());
        }

        public ConversationFieldService conversationFieldService() {
            return ConversationFieldModule_ProvideConversationFieldServiceFactory.provideConversationFieldService(this.conversationFieldModule, (o0) this.retrofitProvider.get());
        }

        public ConversationFieldValidator conversationFieldValidator() {
            return new ConversationFieldValidator(new ValidationRules(), conversationFieldRepository());
        }

        @Override // zendesk.messaging.android.internal.di.MessagingComponent
        public ConversationFragmentComponent.Factory conversationFragmentComponent() {
            return new ConversationFragmentComponentFactory(this.messagingComponentImpl, 0);
        }

        @Override // zendesk.messaging.android.internal.di.MessagingComponent
        public ConversationListFragmentComponent.Factory conversationListFragmentComponent() {
            return new ConversationListFragmentComponentFactory(this.messagingComponentImpl, 0);
        }

        @Override // zendesk.messaging.android.internal.di.MessagingComponent
        public GuideArticleFragmentComponent.Factory guideArticleFragmentComponent() {
            return new GuideArticleFragmentComponentFactory(this.messagingComponentImpl, 0);
        }

        @Override // zendesk.messaging.android.internal.di.MessagingComponent
        public ImageViewerComponent.Factory imageViewerActivityComponent() {
            return new ImageViewerComponentFactory(this.messagingComponentImpl, 0);
        }

        public LocaleProvider localeProvider() {
            return new LocaleProvider(this.context);
        }

        @Override // zendesk.messaging.android.internal.di.MessagingComponent
        public x mainDispatcher() {
            return CoroutineDispatchersModule_MainDispatcherFactory.mainDispatcher(this.coroutineDispatchersModule);
        }

        @Override // zendesk.messaging.android.internal.di.MessagingComponent
        public MessagingActivityComponent.Factory messagingActivityComponent() {
            return new MessagingActivityComponentFactory(this.messagingComponentImpl, 0);
        }

        @Override // zendesk.messaging.android.internal.di.MessagingComponent
        public MessagingEventDispatcher messagingEventDispatcher() {
            return (MessagingEventDispatcher) this.messagingEventDispatcherProvider.get();
        }

        public boolean namedBoolean() {
            return this.messagingDateFormatModule.providesIs24Hours(this.context);
        }
    }

    private DaggerMessagingComponent() {
    }

    public static MessagingComponent.Factory factory() {
        return new Factory(0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Factory implements MessagingComponent.Factory {
        public /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // zendesk.messaging.android.internal.di.MessagingComponent.Factory
        public MessagingComponent create(Context context, ZendeskCredentials zendeskCredentials, String str, MessagingSettings messagingSettings, ConversationKit conversationKit, Function1<? super ZendeskEvent, Unit> function1, b0 b0Var, UserColors userColors, UserColors userColors2, FeatureFlagManager featureFlagManager, Function0<? extends Date> function0, Function0<String> function02, ProcessLifecycleEventObserver processLifecycleEventObserver) {
            context.getClass();
            zendeskCredentials.getClass();
            str.getClass();
            messagingSettings.getClass();
            conversationKit.getClass();
            function1.getClass();
            b0Var.getClass();
            userColors.getClass();
            userColors2.getClass();
            featureFlagManager.getClass();
            function0.getClass();
            function02.getClass();
            processLifecycleEventObserver.getClass();
            return new MessagingComponentImpl(new StorageModule(), new NetworkModule(), new ConversationFieldModule(), new CoroutineDispatchersModule(), new GuideKitModule(), new AnalyticsKitModule(), new GuideArticleViewerModule(), new MessagingDateFormatModule(), context, zendeskCredentials, str, messagingSettings, conversationKit, function1, b0Var, userColors, userColors2, featureFlagManager, function0, function02, processLifecycleEventObserver);
        }

        private Factory() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class ConversationExtensionFragmentComponentFactory implements ConversationExtensionFragmentComponent.Factory {
        private final MessagingComponentImpl messagingComponentImpl;

        private ConversationExtensionFragmentComponentFactory(MessagingComponentImpl messagingComponentImpl) {
            this.messagingComponentImpl = messagingComponentImpl;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.conversationextension.di.ConversationExtensionFragmentComponent.Factory
        public ConversationExtensionFragmentComponent create(f fVar, Bundle bundle) {
            fVar.getClass();
            return new ConversationExtensionFragmentComponentImpl(this.messagingComponentImpl, new ConversationExtensionModule(), fVar, bundle);
        }

        public /* synthetic */ ConversationExtensionFragmentComponentFactory(MessagingComponentImpl messagingComponentImpl, int i11) {
            this(messagingComponentImpl);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class ConversationFragmentComponentFactory implements ConversationFragmentComponent.Factory {
        private final MessagingComponentImpl messagingComponentImpl;

        private ConversationFragmentComponentFactory(MessagingComponentImpl messagingComponentImpl) {
            this.messagingComponentImpl = messagingComponentImpl;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.di.ConversationFragmentComponent.Factory
        public ConversationFragmentComponent create(h hVar, f fVar, Bundle bundle) {
            hVar.getClass();
            fVar.getClass();
            return new ConversationFragmentComponentImpl(this.messagingComponentImpl, new ConversationScreenModule(), new MessageLogModule(), new MessagingNavigatorModule(), hVar, fVar, bundle);
        }

        public /* synthetic */ ConversationFragmentComponentFactory(MessagingComponentImpl messagingComponentImpl, int i11) {
            this(messagingComponentImpl);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class ConversationListFragmentComponentFactory implements ConversationListFragmentComponent.Factory {
        private final MessagingComponentImpl messagingComponentImpl;

        private ConversationListFragmentComponentFactory(MessagingComponentImpl messagingComponentImpl) {
            this.messagingComponentImpl = messagingComponentImpl;
        }

        @Override // zendesk.messaging.android.internal.conversationslistscreen.di.ConversationListFragmentComponent.Factory
        public ConversationListFragmentComponent create(h hVar) {
            hVar.getClass();
            return new ConversationListFragmentComponentImpl(this.messagingComponentImpl, new ConversationsListScreenModule(), new ConversationsListLocalStorageModule(), new MessagingNavigatorModule(), hVar);
        }

        public /* synthetic */ ConversationListFragmentComponentFactory(MessagingComponentImpl messagingComponentImpl, int i11) {
            this(messagingComponentImpl);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class GuideArticleFragmentComponentFactory implements GuideArticleFragmentComponent.Factory {
        private final MessagingComponentImpl messagingComponentImpl;

        private GuideArticleFragmentComponentFactory(MessagingComponentImpl messagingComponentImpl) {
            this.messagingComponentImpl = messagingComponentImpl;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.di.GuideArticleFragmentComponent.Factory
        public GuideArticleFragmentComponent create(f fVar, Bundle bundle) {
            fVar.getClass();
            return new GuideArticleFragmentComponentImpl(this.messagingComponentImpl, fVar, bundle);
        }

        public /* synthetic */ GuideArticleFragmentComponentFactory(MessagingComponentImpl messagingComponentImpl, int i11) {
            this(messagingComponentImpl);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class ImageViewerComponentFactory implements ImageViewerComponent.Factory {
        private final MessagingComponentImpl messagingComponentImpl;

        private ImageViewerComponentFactory(MessagingComponentImpl messagingComponentImpl) {
            this.messagingComponentImpl = messagingComponentImpl;
        }

        @Override // zendesk.messaging.android.internal.conversationscreen.di.ImageViewerComponent.Factory
        public ImageViewerComponent create(h hVar, f fVar, Bundle bundle) {
            hVar.getClass();
            fVar.getClass();
            return new ImageViewerComponentImpl(this.messagingComponentImpl, new ConversationScreenModule(), hVar, fVar, bundle);
        }

        public /* synthetic */ ImageViewerComponentFactory(MessagingComponentImpl messagingComponentImpl, int i11) {
            this(messagingComponentImpl);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class MessagingActivityComponentFactory implements MessagingActivityComponent.Factory {
        private final MessagingComponentImpl messagingComponentImpl;

        private MessagingActivityComponentFactory(MessagingComponentImpl messagingComponentImpl) {
            this.messagingComponentImpl = messagingComponentImpl;
        }

        @Override // zendesk.messaging.android.internal.di.MessagingActivityComponent.Factory
        public MessagingActivityComponent create(h hVar, f fVar, Bundle bundle) {
            hVar.getClass();
            fVar.getClass();
            return new MessagingActivityComponentImpl(this.messagingComponentImpl, new MessagingScreenModule(), new MessagingNavigatorModule(), hVar, fVar, bundle);
        }

        public /* synthetic */ MessagingActivityComponentFactory(MessagingComponentImpl messagingComponentImpl, int i11) {
            this(messagingComponentImpl);
        }
    }
}
