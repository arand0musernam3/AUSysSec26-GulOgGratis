package zendesk.guidekit.android.internal.di;

import ag.d;
import android.content.Context;
import s70.a;
import s70.c;
import v80.b0;
import v80.x;
import zendesk.core.android.internal.di.CoroutineDispatchersModule;
import zendesk.core.android.internal.di.CoroutineDispatchersModule_IoDispatcherFactory;
import zendesk.core.android.internal.di.KotlinxSerializationModule_ProvideJsonFactory;
import zendesk.core.ui.android.internal.local.LocaleProvider_Factory;
import zendesk.guidekit.android.GuideKit;
import zendesk.guidekit.android.internal.DefaultGuideKit_Factory;
import zendesk.guidekit.android.internal.data.ArticleInMemoryDataSource_Factory;
import zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource_Factory;
import zendesk.guidekit.android.internal.data.GuideKitRepository_Factory;
import zendesk.guidekit.android.internal.di.GuideKitComponent;
import zendesk.guidekit.android.internal.di.module.BrandsModule;
import zendesk.guidekit.android.internal.di.module.BrandsModule_ProvidesBrandsApiFactory;
import zendesk.guidekit.android.internal.di.module.GuideKitModule;
import zendesk.guidekit.android.internal.di.module.GuideKitModule_ProvidesBaseUrlFactory;
import zendesk.guidekit.android.internal.di.module.HelpCenterModule;
import zendesk.guidekit.android.internal.di.module.HelpCenterModule_ProvidesFrontendEventsApiFactory;
import zendesk.guidekit.android.internal.di.module.NetworkModule;
import zendesk.guidekit.android.internal.di.module.NetworkModule_CacheDirFactory;
import zendesk.guidekit.android.internal.di.module.NetworkModule_ProvideKotlinSerializationFactory;
import zendesk.guidekit.android.internal.di.module.NetworkModule_ProvidesHeaderInterceptorFactory;
import zendesk.guidekit.android.internal.di.module.NetworkModule_ProvidesHttpLoggingInterceptorFactory;
import zendesk.guidekit.android.internal.di.module.NetworkModule_ProvidesOkHttpClientFactory;
import zendesk.guidekit.android.internal.di.module.NetworkModule_RetrofitFactory;
import zendesk.guidekit.android.model.GuideKitSettings;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class DaggerGuideKitComponent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class GuideKitComponentImpl implements GuideKitComponent {
        c cacheDirProvider;
        c contextProvider;
        private final CoroutineDispatchersModule coroutineDispatchersModule;
        c coroutineScopeProvider;
        c defaultGuideKitProvider;
        private final GuideKitComponentImpl guideKitComponentImpl = this;
        c guideKitRepositoryProvider;
        c localeProvider;
        c provideKotlinSerializationProvider;
        c providesBaseUrlProvider;
        c providesBrandsApiProvider;
        c providesFrontendEventsApiProvider;
        c providesGuideKitProvider;
        c providesHeaderInterceptorProvider;
        c providesHttpLoggingInterceptorProvider;
        c providesOkHttpClientProvider;
        c retrofitProvider;
        c settingsProvider;

        public GuideKitComponentImpl(CoroutineDispatchersModule coroutineDispatchersModule, NetworkModule networkModule, HelpCenterModule helpCenterModule, GuideKitModule guideKitModule, BrandsModule brandsModule, GuideKitSettings guideKitSettings, Context context, b0 b0Var) {
            this.coroutineDispatchersModule = coroutineDispatchersModule;
            initialize(coroutineDispatchersModule, networkModule, helpCenterModule, guideKitModule, brandsModule, guideKitSettings, context, b0Var);
        }

        private void initialize(CoroutineDispatchersModule coroutineDispatchersModule, NetworkModule networkModule, HelpCenterModule helpCenterModule, GuideKitModule guideKitModule, BrandsModule brandsModule, GuideKitSettings guideKitSettings, Context context, b0 b0Var) {
            d dVarA = d.a(guideKitSettings);
            this.settingsProvider = dVarA;
            this.providesBaseUrlProvider = a.a(GuideKitModule_ProvidesBaseUrlFactory.create(guideKitModule, dVarA));
            this.providesHttpLoggingInterceptorProvider = a.a(NetworkModule_ProvidesHttpLoggingInterceptorFactory.create(networkModule));
            d dVarA2 = d.a(context);
            this.contextProvider = dVarA2;
            LocaleProvider_Factory localeProvider_FactoryCreate = LocaleProvider_Factory.create(dVarA2);
            this.localeProvider = localeProvider_FactoryCreate;
            this.providesHeaderInterceptorProvider = a.a(NetworkModule_ProvidesHeaderInterceptorFactory.create(networkModule, localeProvider_FactoryCreate));
            c cVarA = a.a(NetworkModule_CacheDirFactory.create(networkModule, this.contextProvider));
            this.cacheDirProvider = cVarA;
            this.providesOkHttpClientProvider = a.a(NetworkModule_ProvidesOkHttpClientFactory.create(networkModule, this.providesHttpLoggingInterceptorProvider, this.providesHeaderInterceptorProvider, cVarA));
            c cVarA2 = a.a(NetworkModule_ProvideKotlinSerializationFactory.create(networkModule, KotlinxSerializationModule_ProvideJsonFactory.create()));
            this.provideKotlinSerializationProvider = cVarA2;
            c cVarA3 = a.a(NetworkModule_RetrofitFactory.create(networkModule, this.providesBaseUrlProvider, this.providesOkHttpClientProvider, cVarA2));
            this.retrofitProvider = cVarA3;
            this.providesFrontendEventsApiProvider = a.a(HelpCenterModule_ProvidesFrontendEventsApiFactory.create(helpCenterModule, cVarA3));
            this.providesBrandsApiProvider = a.a(BrandsModule_ProvidesBrandsApiFactory.create(brandsModule, this.retrofitProvider));
            this.coroutineScopeProvider = d.a(b0Var);
            GuideKitRepository_Factory guideKitRepository_FactoryCreate = GuideKitRepository_Factory.create(this.providesFrontendEventsApiProvider, this.providesBrandsApiProvider, ArticleInMemoryDataSource_Factory.create(), BrandsInMemoryDataSource_Factory.create(), this.settingsProvider, this.coroutineScopeProvider);
            this.guideKitRepositoryProvider = guideKitRepository_FactoryCreate;
            DefaultGuideKit_Factory defaultGuideKit_FactoryCreate = DefaultGuideKit_Factory.create(guideKitRepository_FactoryCreate);
            this.defaultGuideKitProvider = defaultGuideKit_FactoryCreate;
            this.providesGuideKitProvider = a.a(defaultGuideKit_FactoryCreate);
        }

        @Override // zendesk.guidekit.android.internal.di.GuideKitComponent
        public GuideKit guideKit() {
            return (GuideKit) this.providesGuideKitProvider.get();
        }

        @Override // zendesk.guidekit.android.internal.di.GuideKitComponent
        public x ioDispatcher() {
            return CoroutineDispatchersModule_IoDispatcherFactory.ioDispatcher(this.coroutineDispatchersModule);
        }
    }

    private DaggerGuideKitComponent() {
    }

    public static GuideKitComponent.Factory factory() {
        return new Factory(0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Factory implements GuideKitComponent.Factory {
        public /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // zendesk.guidekit.android.internal.di.GuideKitComponent.Factory
        public GuideKitComponent create(GuideKitSettings guideKitSettings, Context context, b0 b0Var) {
            guideKitSettings.getClass();
            context.getClass();
            b0Var.getClass();
            return new GuideKitComponentImpl(new CoroutineDispatchersModule(), new NetworkModule(), new HelpCenterModule(), new GuideKitModule(), new BrandsModule(), guideKitSettings, context, b0Var);
        }

        private Factory() {
        }
    }
}
