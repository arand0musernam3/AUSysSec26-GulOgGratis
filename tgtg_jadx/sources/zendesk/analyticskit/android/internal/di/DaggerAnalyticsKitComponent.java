package zendesk.analyticskit.android.internal.di;

import ag.d;
import android.content.Context;
import s70.a;
import s70.c;
import v80.b0;
import zendesk.analyticskit.android.AnalyticsKit;
import zendesk.analyticskit.android.internal.DefaultAnalyticsKit_Factory;
import zendesk.analyticskit.android.internal.data.AnalyticsRepository_Factory;
import zendesk.analyticskit.android.internal.di.AnalyticsKitComponent;
import zendesk.analyticskit.android.internal.storage.AnalyticsStorageSerializer_Factory;
import zendesk.analyticskit.android.internal.storage.AnalyticsStorage_Factory;
import zendesk.analyticskit.android.model.AnalyticsSettings;
import zendesk.core.android.internal.di.CoroutineDispatchersModule;
import zendesk.core.android.internal.di.CoroutineDispatchersModule_IoDispatcherFactory;
import zendesk.core.android.internal.di.CoroutineDispatchersModule_PersistenceDispatcherFactory;
import zendesk.core.android.internal.di.KotlinxSerializationModule_ProvideJsonFactory;
import zendesk.core.ui.android.internal.local.LocaleProvider_Factory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class DaggerAnalyticsKitComponent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class AnalyticsKitComponentImpl implements AnalyticsKitComponent {
        private final AnalyticsKitComponentImpl analyticsKitComponentImpl = this;
        c analyticsRepositoryProvider;
        c analyticsSettingsProvider;
        c analyticsStorageProvider;
        c analyticsStorageSerializerProvider;
        c contextProvider;
        c coroutineScopeProvider;
        c defaultAnalyticsKitProvider;
        c ioDispatcherProvider;
        c localeProvider;
        c persistenceDispatcherProvider;
        c provideKotlinSerializationProvider;
        c providesAnalyticsKitStorageProvider;
        c providesAnalyticsManagerProvider;
        c providesAnalyticsServiceProvider;
        c providesBaseUrlProvider;
        c providesCacheDirProvider;
        c providesHeaderInterceptorProvider;
        c providesHttpLoggingInterceptorProvider;
        c providesOkHttpClientProvider;
        c providesRetrofitProvider;
        c providesStorageTypeProvider;

        public AnalyticsKitComponentImpl(AnalyticsKitModule analyticsKitModule, AnalyticsKitNetworkModule analyticsKitNetworkModule, CoroutineDispatchersModule coroutineDispatchersModule, Context context, AnalyticsSettings analyticsSettings, b0 b0Var) {
            initialize(analyticsKitModule, analyticsKitNetworkModule, coroutineDispatchersModule, context, analyticsSettings, b0Var);
        }

        private void initialize(AnalyticsKitModule analyticsKitModule, AnalyticsKitNetworkModule analyticsKitNetworkModule, CoroutineDispatchersModule coroutineDispatchersModule, Context context, AnalyticsSettings analyticsSettings, b0 b0Var) {
            d dVarA = d.a(analyticsSettings);
            this.analyticsSettingsProvider = dVarA;
            this.providesBaseUrlProvider = a.a(AnalyticsKitModule_ProvidesBaseUrlFactory.create(analyticsKitModule, dVarA));
            this.providesHttpLoggingInterceptorProvider = a.a(AnalyticsKitNetworkModule_ProvidesHttpLoggingInterceptorFactory.create(analyticsKitNetworkModule));
            d dVarA2 = d.a(context);
            this.contextProvider = dVarA2;
            LocaleProvider_Factory localeProvider_FactoryCreate = LocaleProvider_Factory.create(dVarA2);
            this.localeProvider = localeProvider_FactoryCreate;
            this.providesHeaderInterceptorProvider = a.a(AnalyticsKitNetworkModule_ProvidesHeaderInterceptorFactory.create(analyticsKitNetworkModule, localeProvider_FactoryCreate));
            c cVarA = a.a(AnalyticsKitNetworkModule_ProvidesCacheDirFactory.create(analyticsKitNetworkModule, this.contextProvider));
            this.providesCacheDirProvider = cVarA;
            this.providesOkHttpClientProvider = a.a(AnalyticsKitNetworkModule_ProvidesOkHttpClientFactory.create(analyticsKitNetworkModule, this.providesHttpLoggingInterceptorProvider, this.providesHeaderInterceptorProvider, cVarA));
            c cVarA2 = a.a(AnalyticsKitNetworkModule_ProvideKotlinSerializationFactory.create(analyticsKitNetworkModule, KotlinxSerializationModule_ProvideJsonFactory.create()));
            this.provideKotlinSerializationProvider = cVarA2;
            c cVarA3 = a.a(AnalyticsKitNetworkModule_ProvidesRetrofitFactory.create(analyticsKitNetworkModule, this.providesBaseUrlProvider, this.providesOkHttpClientProvider, cVarA2));
            this.providesRetrofitProvider = cVarA3;
            this.providesAnalyticsServiceProvider = a.a(AnalyticsKitNetworkModule_ProvidesAnalyticsServiceFactory.create(analyticsKitNetworkModule, cVarA3));
            AnalyticsStorageSerializer_Factory analyticsStorageSerializer_FactoryCreate = AnalyticsStorageSerializer_Factory.create(KotlinxSerializationModule_ProvideJsonFactory.create());
            this.analyticsStorageSerializerProvider = analyticsStorageSerializer_FactoryCreate;
            c cVarA4 = a.a(AnalyticsKitModule_ProvidesStorageTypeFactory.create(analyticsKitModule, analyticsStorageSerializer_FactoryCreate));
            this.providesStorageTypeProvider = cVarA4;
            this.providesAnalyticsKitStorageProvider = a.a(AnalyticsKitModule_ProvidesAnalyticsKitStorageFactory.create(analyticsKitModule, this.analyticsSettingsProvider, cVarA4, this.contextProvider));
            CoroutineDispatchersModule_PersistenceDispatcherFactory coroutineDispatchersModule_PersistenceDispatcherFactoryCreate = CoroutineDispatchersModule_PersistenceDispatcherFactory.create(coroutineDispatchersModule);
            this.persistenceDispatcherProvider = coroutineDispatchersModule_PersistenceDispatcherFactoryCreate;
            this.analyticsStorageProvider = AnalyticsStorage_Factory.create(this.providesAnalyticsKitStorageProvider, coroutineDispatchersModule_PersistenceDispatcherFactoryCreate, KotlinxSerializationModule_ProvideJsonFactory.create());
            this.coroutineScopeProvider = d.a(b0Var);
            CoroutineDispatchersModule_IoDispatcherFactory coroutineDispatchersModule_IoDispatcherFactoryCreate = CoroutineDispatchersModule_IoDispatcherFactory.create(coroutineDispatchersModule);
            this.ioDispatcherProvider = coroutineDispatchersModule_IoDispatcherFactoryCreate;
            AnalyticsRepository_Factory analyticsRepository_FactoryCreate = AnalyticsRepository_Factory.create(this.analyticsSettingsProvider, this.providesAnalyticsServiceProvider, this.analyticsStorageProvider, this.coroutineScopeProvider, coroutineDispatchersModule_IoDispatcherFactoryCreate);
            this.analyticsRepositoryProvider = analyticsRepository_FactoryCreate;
            DefaultAnalyticsKit_Factory defaultAnalyticsKit_FactoryCreate = DefaultAnalyticsKit_Factory.create(analyticsRepository_FactoryCreate);
            this.defaultAnalyticsKitProvider = defaultAnalyticsKit_FactoryCreate;
            this.providesAnalyticsManagerProvider = a.a(defaultAnalyticsKit_FactoryCreate);
        }

        @Override // zendesk.analyticskit.android.internal.di.AnalyticsKitComponent
        public AnalyticsKit analyticsKit() {
            return (AnalyticsKit) this.providesAnalyticsManagerProvider.get();
        }
    }

    private DaggerAnalyticsKitComponent() {
    }

    public static AnalyticsKitComponent.Factory factory() {
        return new Factory(0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Factory implements AnalyticsKitComponent.Factory {
        public /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // zendesk.analyticskit.android.internal.di.AnalyticsKitComponent.Factory
        public AnalyticsKitComponent create(Context context, AnalyticsSettings analyticsSettings, b0 b0Var) {
            context.getClass();
            analyticsSettings.getClass();
            b0Var.getClass();
            return new AnalyticsKitComponentImpl(new AnalyticsKitModule(), new AnalyticsKitNetworkModule(), new CoroutineDispatchersModule(), context, analyticsSettings, b0Var);
        }

        private Factory() {
        }
    }
}
