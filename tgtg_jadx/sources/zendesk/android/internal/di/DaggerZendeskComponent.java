package zendesk.android.internal.di;

import android.content.Context;
import o00.x0;
import s70.a;
import s70.c;
import v80.b0;
import zendesk.android.Zendesk;
import zendesk.android.Zendesk_Factory;
import zendesk.android.events.internal.ZendeskEventDispatcher;
import zendesk.android.events.internal.ZendeskEventDispatcher_Factory;
import zendesk.android.internal.di.ZendeskInitializedComponent;
import zendesk.android.internal.frontendevents.FrontendEventsRepository_Factory;
import zendesk.android.internal.frontendevents.FrontendEventsStorage_Factory;
import zendesk.android.internal.frontendevents.analyticsevents.ProactiveMessagingAnalyticsManager_Factory;
import zendesk.android.internal.frontendevents.di.FrontendEventsModule;
import zendesk.android.internal.frontendevents.di.FrontendEventsModule_ProvidesFrontendEventsApiFactory;
import zendesk.android.internal.frontendevents.di.FrontendEventsModule_ProvidesFrontendEventsStorageFactory;
import zendesk.android.internal.frontendevents.pageviewevents.DefaultPageViewEvents_Factory;
import zendesk.android.internal.network.HeaderFactory_Factory;
import zendesk.android.internal.network.NetworkData_Factory;
import zendesk.android.internal.network.NetworkModule;
import zendesk.android.internal.network.NetworkModule_CacheDirFactory;
import zendesk.android.internal.network.NetworkModule_OkHttpClientFactory;
import zendesk.android.internal.network.NetworkModule_ProvideJsonFactory;
import zendesk.android.internal.network.NetworkModule_ProvideKotlinSerializationFactory;
import zendesk.android.internal.network.NetworkModule_RetrofitFactory;
import zendesk.android.internal.proactivemessaging.ProactiveMessagingManager_Factory;
import zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository_Factory;
import zendesk.android.internal.proactivemessaging.ProactiveMessagingStorage_Factory;
import zendesk.android.internal.proactivemessaging.VisitTypeProvider_Factory;
import zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.jwt.ProactiveMessageJwtDecoder_Factory;
import zendesk.android.internal.proactivemessaging.di.ProactiveMessagingModule;
import zendesk.android.internal.proactivemessaging.di.ProactiveMessagingModule_ProvidesCampaignTriggerServiceFactory;
import zendesk.android.internal.proactivemessaging.di.ProactiveMessagingModule_ProvidesCurrentTimeProviderFactory;
import zendesk.android.internal.proactivemessaging.di.ProactiveMessagingModule_ProvidesProactiveMessagingStorageFactory;
import zendesk.android.messaging.Messaging;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.settings.internal.SettingsRepository;
import zendesk.android.settings.internal.SettingsRepository_Factory;
import zendesk.android.settings.internal.SettingsRestClient_Factory;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.core.android.internal.app.FeatureFlagManager;
import zendesk.core.android.internal.di.CoroutineDispatchersModule;
import zendesk.core.android.internal.di.CoroutineDispatchersModule_IoDispatcherFactory;
import zendesk.core.android.internal.di.CoroutineDispatchersModule_MainDispatcherFactory;
import zendesk.core.android.internal.di.CoroutineDispatchersModule_PersistenceDispatcherFactory;
import zendesk.core.ui.android.internal.app.ProcessLifecycleEventObserver;
import zendesk.core.ui.android.internal.local.LocaleProvider_Factory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class DaggerZendeskComponent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class ZendeskComponentImpl implements ZendeskComponent {
        c applicationContextProvider;
        c cacheDirProvider;
        c componentDataProvider;
        c headerFactoryProvider;
        c ioDispatcherProvider;
        c localeProvider;
        c mainDispatcherProvider;
        c mainScopeProvider;
        c networkDataProvider;
        c okHttpClientProvider;
        c persistenceDispatcherProvider;
        c provideJsonProvider;
        c provideKotlinSerializationProvider;
        c provideProcessLifecycleEventObserverProvider;
        c retrofitProvider;
        c settingsApiProvider;
        c settingsRepositoryProvider;
        c settingsRestClientProvider;
        private final ZendeskComponentImpl zendeskComponentImpl = this;
        c zendeskEventDispatcherProvider;

        public ZendeskComponentImpl(ZendeskModule zendeskModule, NetworkModule networkModule, CoroutineDispatchersModule coroutineDispatchersModule) {
            initialize(zendeskModule, networkModule, coroutineDispatchersModule);
        }

        private void initialize(ZendeskModule zendeskModule, NetworkModule networkModule, CoroutineDispatchersModule coroutineDispatchersModule) {
            c cVarA = a.a(ZendeskModule_ComponentDataFactory.create(zendeskModule));
            this.componentDataProvider = cVarA;
            this.networkDataProvider = NetworkData_Factory.create(cVarA);
            c cVarA2 = a.a(ZendeskModule_ApplicationContextFactory.create(zendeskModule));
            this.applicationContextProvider = cVarA2;
            LocaleProvider_Factory localeProvider_FactoryCreate = LocaleProvider_Factory.create(cVarA2);
            this.localeProvider = localeProvider_FactoryCreate;
            this.headerFactoryProvider = a.a(HeaderFactory_Factory.create(this.componentDataProvider, this.networkDataProvider, localeProvider_FactoryCreate));
            c cVarA3 = a.a(NetworkModule_CacheDirFactory.create(networkModule, this.applicationContextProvider));
            this.cacheDirProvider = cVarA3;
            this.okHttpClientProvider = a.a(NetworkModule_OkHttpClientFactory.create(networkModule, this.headerFactoryProvider, cVarA3));
            c cVarA4 = a.a(NetworkModule_ProvideJsonFactory.create(networkModule));
            this.provideJsonProvider = cVarA4;
            c cVarA5 = a.a(NetworkModule_ProvideKotlinSerializationFactory.create(networkModule, cVarA4));
            this.provideKotlinSerializationProvider = cVarA5;
            c cVarA6 = a.a(NetworkModule_RetrofitFactory.create(networkModule, this.componentDataProvider, this.okHttpClientProvider, cVarA5));
            this.retrofitProvider = cVarA6;
            c cVarA7 = a.a(ZendeskModule_SettingsApiFactory.create(zendeskModule, cVarA6));
            this.settingsApiProvider = cVarA7;
            c cVarA8 = a.a(SettingsRestClient_Factory.create(cVarA7, this.provideJsonProvider, this.componentDataProvider));
            this.settingsRestClientProvider = cVarA8;
            this.settingsRepositoryProvider = a.a(SettingsRepository_Factory.create(cVarA8));
            CoroutineDispatchersModule_MainDispatcherFactory coroutineDispatchersModule_MainDispatcherFactoryCreate = CoroutineDispatchersModule_MainDispatcherFactory.create(coroutineDispatchersModule);
            this.mainDispatcherProvider = coroutineDispatchersModule_MainDispatcherFactoryCreate;
            this.zendeskEventDispatcherProvider = a.a(ZendeskEventDispatcher_Factory.create(coroutineDispatchersModule_MainDispatcherFactoryCreate));
            this.mainScopeProvider = a.a(ZendeskModule_MainScopeFactory.create(zendeskModule));
            this.provideProcessLifecycleEventObserverProvider = a.a(ZendeskModule_ProvideProcessLifecycleEventObserverFactory.create(zendeskModule));
            this.persistenceDispatcherProvider = CoroutineDispatchersModule_PersistenceDispatcherFactory.create(coroutineDispatchersModule);
            this.ioDispatcherProvider = CoroutineDispatchersModule_IoDispatcherFactory.create(coroutineDispatchersModule);
        }

        @Override // zendesk.android.internal.di.ZendeskComponent
        public ZendeskComponentConfig componentData() {
            return (ZendeskComponentConfig) this.componentDataProvider.get();
        }

        @Override // zendesk.android.internal.di.ZendeskComponent
        public Context context() {
            return (Context) this.applicationContextProvider.get();
        }

        @Override // zendesk.android.internal.di.ZendeskComponent
        public ZendeskInitializedComponent.Builder getZendeskInitializedComponent() {
            return new ZendeskInitializedComponentBuilder(this.zendeskComponentImpl, 0);
        }

        @Override // zendesk.android.internal.di.ZendeskComponent
        public b0 mainScope() {
            return (b0) this.mainScopeProvider.get();
        }

        @Override // zendesk.android.internal.di.ZendeskComponent
        public ProcessLifecycleEventObserver provideProcessLifecycleEventObserver() {
            return (ProcessLifecycleEventObserver) this.provideProcessLifecycleEventObserverProvider.get();
        }

        @Override // zendesk.android.internal.di.ZendeskComponent
        public SettingsRepository settingsRepository() {
            return (SettingsRepository) this.settingsRepositoryProvider.get();
        }

        @Override // zendesk.android.internal.di.ZendeskComponent
        public ZendeskEventDispatcher zendeskEventDispatcher() {
            return (ZendeskEventDispatcher) this.zendeskEventDispatcherProvider.get();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class ZendeskInitializedComponentImpl implements ZendeskInitializedComponent {
        c defaultPageViewEventsProvider;
        c frontendEventsRepositoryProvider;
        c frontendEventsStorageProvider;
        c proactiveMessageJwtDecoderProvider;
        c proactiveMessagingAnalyticsManagerProvider;
        c proactiveMessagingManagerProvider;
        c proactiveMessagingRepositoryProvider;
        c proactiveMessagingStorageProvider;
        c providesCampaignTriggerServiceProvider;
        c providesConversationKitProvider;
        c providesCurrentTimeProvider;
        c providesFeatureFlagManagerProvider;
        c providesFrontendEventsApiProvider;
        c providesFrontendEventsStorageProvider;
        c providesMessagingProvider;
        c providesProactiveMessagingStorageProvider;
        c providesSettingsProvider;
        c visitTypeProvider;
        private final ZendeskComponentImpl zendeskComponentImpl;
        private final ZendeskInitializedComponentImpl zendeskInitializedComponentImpl = this;
        c zendeskProvider;

        public ZendeskInitializedComponentImpl(ZendeskComponentImpl zendeskComponentImpl, ZendeskInitializedModule zendeskInitializedModule, ProactiveMessagingModule proactiveMessagingModule, FrontendEventsModule frontendEventsModule) {
            this.zendeskComponentImpl = zendeskComponentImpl;
            initialize(zendeskInitializedModule, proactiveMessagingModule, frontendEventsModule);
        }

        private void initialize(ZendeskInitializedModule zendeskInitializedModule, ProactiveMessagingModule proactiveMessagingModule, FrontendEventsModule frontendEventsModule) {
            this.providesConversationKitProvider = a.a(ZendeskInitializedModule_ProvidesConversationKitFactory.create(zendeskInitializedModule));
            this.providesMessagingProvider = a.a(ZendeskInitializedModule_ProvidesMessagingFactory.create(zendeskInitializedModule));
            this.providesFrontendEventsApiProvider = a.a(FrontendEventsModule_ProvidesFrontendEventsApiFactory.create(frontendEventsModule, this.zendeskComponentImpl.retrofitProvider));
            c cVarA = a.a(ZendeskInitializedModule_ProvidesSettingsFactory.create(zendeskInitializedModule));
            this.providesSettingsProvider = cVarA;
            c cVarA2 = a.a(FrontendEventsModule_ProvidesFrontendEventsStorageFactory.create(frontendEventsModule, this.zendeskComponentImpl.applicationContextProvider, cVarA));
            this.providesFrontendEventsStorageProvider = cVarA2;
            c cVarA3 = a.a(FrontendEventsStorage_Factory.create(cVarA2, this.zendeskComponentImpl.persistenceDispatcherProvider));
            this.frontendEventsStorageProvider = cVarA3;
            c cVar = this.providesFrontendEventsApiProvider;
            ZendeskComponentImpl zendeskComponentImpl = this.zendeskComponentImpl;
            this.frontendEventsRepositoryProvider = a.a(FrontendEventsRepository_Factory.create(cVar, zendeskComponentImpl.componentDataProvider, cVarA3, this.providesConversationKitProvider, zendeskComponentImpl.networkDataProvider, zendeskComponentImpl.localeProvider));
            this.visitTypeProvider = a.a(VisitTypeProvider_Factory.create(this.providesConversationKitProvider, this.zendeskComponentImpl.mainScopeProvider));
            c cVarA4 = a.a(ProactiveMessagingModule_ProvidesProactiveMessagingStorageFactory.create(proactiveMessagingModule, this.zendeskComponentImpl.applicationContextProvider, this.providesSettingsProvider));
            this.providesProactiveMessagingStorageProvider = cVarA4;
            this.proactiveMessagingStorageProvider = a.a(ProactiveMessagingStorage_Factory.create(cVarA4, this.zendeskComponentImpl.persistenceDispatcherProvider));
            this.proactiveMessageJwtDecoderProvider = ProactiveMessageJwtDecoder_Factory.create(this.zendeskComponentImpl.provideJsonProvider);
            c cVarA5 = a.a(ProactiveMessagingModule_ProvidesCampaignTriggerServiceFactory.create(proactiveMessagingModule, this.zendeskComponentImpl.retrofitProvider));
            this.providesCampaignTriggerServiceProvider = cVarA5;
            ZendeskComponentImpl zendeskComponentImpl2 = this.zendeskComponentImpl;
            this.proactiveMessagingRepositoryProvider = a.a(ProactiveMessagingRepository_Factory.create(zendeskComponentImpl2.settingsRepositoryProvider, this.proactiveMessagingStorageProvider, this.proactiveMessageJwtDecoderProvider, cVarA5, zendeskComponentImpl2.mainScopeProvider));
            this.providesCurrentTimeProvider = a.a(ProactiveMessagingModule_ProvidesCurrentTimeProviderFactory.create(proactiveMessagingModule));
            c cVarA6 = a.a(ProactiveMessagingAnalyticsManager_Factory.create(this.frontendEventsRepositoryProvider, this.zendeskComponentImpl.mainScopeProvider, this.providesConversationKitProvider));
            this.proactiveMessagingAnalyticsManagerProvider = cVarA6;
            ZendeskComponentImpl zendeskComponentImpl3 = this.zendeskComponentImpl;
            c cVarA7 = a.a(ProactiveMessagingManager_Factory.create(zendeskComponentImpl3.provideProcessLifecycleEventObserverProvider, zendeskComponentImpl3.mainScopeProvider, zendeskComponentImpl3.localeProvider, this.visitTypeProvider, this.providesConversationKitProvider, this.proactiveMessagingRepositoryProvider, this.providesCurrentTimeProvider, cVarA6));
            this.proactiveMessagingManagerProvider = cVarA7;
            c cVarA8 = a.a(DefaultPageViewEvents_Factory.create(this.frontendEventsRepositoryProvider, this.zendeskComponentImpl.ioDispatcherProvider, cVarA7));
            this.defaultPageViewEventsProvider = cVarA8;
            c cVar2 = this.providesMessagingProvider;
            ZendeskComponentImpl zendeskComponentImpl4 = this.zendeskComponentImpl;
            this.zendeskProvider = a.a(Zendesk_Factory.create(cVar2, zendeskComponentImpl4.mainScopeProvider, zendeskComponentImpl4.zendeskEventDispatcherProvider, this.providesConversationKitProvider, cVarA8));
            this.providesFeatureFlagManagerProvider = a.a(ZendeskInitializedModule_ProvidesFeatureFlagManagerFactory.create(zendeskInitializedModule));
        }

        @Override // zendesk.android.internal.di.ZendeskInitializedComponent
        public ConversationKit conversationKit() {
            return (ConversationKit) this.providesConversationKitProvider.get();
        }

        @Override // zendesk.android.internal.di.ZendeskInitializedComponent
        public FeatureFlagManager featureFlagManager() {
            return (FeatureFlagManager) this.providesFeatureFlagManagerProvider.get();
        }

        @Override // zendesk.android.internal.di.ZendeskInitializedComponent
        public Messaging messaging() {
            return (Messaging) this.providesMessagingProvider.get();
        }

        @Override // zendesk.android.internal.di.ZendeskInitializedComponent
        public MessagingSettings settings() {
            return (MessagingSettings) this.providesSettingsProvider.get();
        }

        @Override // zendesk.android.internal.di.ZendeskInitializedComponent
        public Zendesk zendesk() {
            return (Zendesk) this.zendeskProvider.get();
        }
    }

    private DaggerZendeskComponent() {
    }

    public static Builder builder() {
        return new Builder(0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Builder {
        private CoroutineDispatchersModule coroutineDispatchersModule;
        private NetworkModule networkModule;
        private ZendeskModule zendeskModule;

        public /* synthetic */ Builder(int i11) {
            this();
        }

        public ZendeskComponent build() {
            x0.n(ZendeskModule.class, this.zendeskModule);
            if (this.networkModule == null) {
                this.networkModule = new NetworkModule();
            }
            if (this.coroutineDispatchersModule == null) {
                this.coroutineDispatchersModule = new CoroutineDispatchersModule();
            }
            return new ZendeskComponentImpl(this.zendeskModule, this.networkModule, this.coroutineDispatchersModule);
        }

        public Builder coroutineDispatchersModule(CoroutineDispatchersModule coroutineDispatchersModule) {
            coroutineDispatchersModule.getClass();
            this.coroutineDispatchersModule = coroutineDispatchersModule;
            return this;
        }

        public Builder networkModule(NetworkModule networkModule) {
            networkModule.getClass();
            this.networkModule = networkModule;
            return this;
        }

        public Builder zendeskModule(ZendeskModule zendeskModule) {
            zendeskModule.getClass();
            this.zendeskModule = zendeskModule;
            return this;
        }

        private Builder() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class ZendeskInitializedComponentBuilder implements ZendeskInitializedComponent.Builder {
        private final ZendeskComponentImpl zendeskComponentImpl;
        private ZendeskInitializedModule zendeskInitializedModule;

        private ZendeskInitializedComponentBuilder(ZendeskComponentImpl zendeskComponentImpl) {
            this.zendeskComponentImpl = zendeskComponentImpl;
        }

        @Override // zendesk.android.internal.di.ZendeskInitializedComponent.Builder
        public ZendeskInitializedComponent build() {
            x0.n(ZendeskInitializedModule.class, this.zendeskInitializedModule);
            return new ZendeskInitializedComponentImpl(this.zendeskComponentImpl, this.zendeskInitializedModule, new ProactiveMessagingModule(), new FrontendEventsModule());
        }

        @Override // zendesk.android.internal.di.ZendeskInitializedComponent.Builder
        public ZendeskInitializedComponentBuilder zendeskInitializedModule(ZendeskInitializedModule zendeskInitializedModule) {
            zendeskInitializedModule.getClass();
            this.zendeskInitializedModule = zendeskInitializedModule;
            return this;
        }

        public /* synthetic */ ZendeskInitializedComponentBuilder(ZendeskComponentImpl zendeskComponentImpl, int i11) {
            this(zendeskComponentImpl);
        }
    }
}
