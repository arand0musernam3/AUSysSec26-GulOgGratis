package com.adyen.checkout.bcmc.internal.provider;

import android.app.Application;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c1;
import androidx.lifecycle.s1;
import b3.i;
import com.adyen.checkout.action.core.internal.DefaultActionHandlingComponent;
import com.adyen.checkout.action.core.internal.provider.GenericActionComponentProvider;
import com.adyen.checkout.action.core.internal.ui.GenericActionDelegate;
import com.adyen.checkout.bcmc.BcmcComponent;
import com.adyen.checkout.bcmc.BcmcConfiguration;
import com.adyen.checkout.bcmc.BcmcConfigurationKt;
import com.adyen.checkout.bcmc.internal.ui.model.BcmcComponentParamsMapper;
import com.adyen.checkout.card.CardComponentState;
import com.adyen.checkout.card.internal.data.api.BinLookupService;
import com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository;
import com.adyen.checkout.card.internal.ui.CardConfigDataGenerator;
import com.adyen.checkout.card.internal.ui.CardValidationMapper;
import com.adyen.checkout.card.internal.ui.DefaultCardDelegate;
import com.adyen.checkout.card.internal.ui.model.CardComponentParams;
import com.adyen.checkout.card.internal.util.DualBrandedCardHandler;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.ComponentCallback;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.internal.Configuration;
import com.adyen.checkout.components.core.internal.DefaultComponentEventHandler;
import com.adyen.checkout.components.core.internal.PaymentComponent;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.PaymentObserverRepository;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManagerFactory;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsSource;
import com.adyen.checkout.components.core.internal.data.api.DefaultPublicKeyRepository;
import com.adyen.checkout.components.core.internal.data.api.PublicKeyService;
import com.adyen.checkout.components.core.internal.provider.DefaultSdkDataProvider;
import com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapper;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.components.core.internal.util.ViewModelExtKt;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.core.internal.data.api.HttpClient;
import com.adyen.checkout.core.internal.data.api.HttpClientFactory;
import com.adyen.checkout.core.internal.util.LocaleProvider;
import com.adyen.checkout.cse.internal.BaseCardEncryptor;
import com.adyen.checkout.cse.internal.BaseGenericEncryptor;
import com.adyen.checkout.cse.internal.CardEncryptorFactory;
import com.adyen.checkout.cse.internal.GenericEncryptorFactory;
import com.adyen.checkout.sessions.core.CheckoutSession;
import com.adyen.checkout.sessions.core.SessionComponentCallback;
import com.adyen.checkout.sessions.core.SessionModel;
import com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler;
import com.adyen.checkout.sessions.core.internal.SessionInteractor;
import com.adyen.checkout.sessions.core.internal.SessionSavedStateHandleContainer;
import com.adyen.checkout.sessions.core.internal.data.api.SessionRepository;
import com.adyen.checkout.sessions.core.internal.data.api.SessionService;
import com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider;
import com.adyen.checkout.sessions.core.internal.ui.model.SessionParamsFactory;
import com.adyen.checkout.ui.core.internal.data.api.AddressService;
import com.adyen.checkout.ui.core.internal.data.api.DefaultAddressRepository;
import com.adyen.checkout.ui.core.internal.ui.DefaultAddressLookupDelegate;
import com.adyen.checkout.ui.core.internal.ui.SubmitHandler;
import e0.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002(\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00060\u00012(\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\b0\u0007B+\b\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Jk\u0010#\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0010\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00062\u000e\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$Jk\u0010#\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\u0010\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00062\u000e\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010&Jc\u0010#\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0010\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010)Jc\u0010#\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\u0010\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b/\u00100R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00103¨\u00064"}, d2 = {"Lcom/adyen/checkout/bcmc/internal/provider/BcmcComponentProvider;", "Lcom/adyen/checkout/components/core/internal/provider/PaymentComponentProvider;", "Lcom/adyen/checkout/bcmc/BcmcComponent;", "Lcom/adyen/checkout/bcmc/BcmcConfiguration;", "Lcom/adyen/checkout/card/CardComponentState;", "Lcom/adyen/checkout/bcmc/BcmcComponentState;", "Lcom/adyen/checkout/components/core/ComponentCallback;", "Lcom/adyen/checkout/sessions/core/internal/provider/SessionPaymentComponentProvider;", "Lcom/adyen/checkout/sessions/core/SessionComponentCallback;", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "localeProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/core/internal/util/LocaleProvider;)V", "Lea/f;", "savedStateRegistryOwner", "Landroidx/lifecycle/s1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/adyen/checkout/components/core/PaymentMethod;", "paymentMethod", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "checkoutConfiguration", "Landroid/app/Application;", "application", "componentCallback", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/Order;", "order", "", "key", "get", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/bcmc/BcmcComponent;", "configuration", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/bcmc/BcmcConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/bcmc/BcmcComponent;", "Lcom/adyen/checkout/sessions/core/CheckoutSession;", "checkoutSession", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/bcmc/BcmcComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/bcmc/BcmcConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/bcmc/BcmcComponent;", "", "isPaymentMethodSupported", "(Lcom/adyen/checkout/components/core/PaymentMethod;)Z", "", "assertSupported", "(Lcom/adyen/checkout/components/core/PaymentMethod;)V", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "bcmc_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BcmcComponentProvider implements PaymentComponentProvider<BcmcComponent, BcmcConfiguration, CardComponentState, ComponentCallback<CardComponentState>>, SessionPaymentComponentProvider<BcmcComponent, BcmcConfiguration, CardComponentState, SessionComponentCallback<CardComponentState>> {

    @Nullable
    private final AnalyticsManager analyticsManager;

    @Nullable
    private final DropInOverrideParams dropInOverrideParams;

    @NotNull
    private final LocaleProvider localeProvider;

    public /* synthetic */ BcmcComponentProvider(DropInOverrideParams dropInOverrideParams, AnalyticsManager analyticsManager, LocaleProvider localeProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : dropInOverrideParams, (i11 & 2) != 0 ? null : analyticsManager, (i11 & 4) != 0 ? new LocaleProvider() : localeProvider);
    }

    private final void assertSupported(PaymentMethod paymentMethod) {
        if (!isPaymentMethodSupported(paymentMethod)) {
            throw new ComponentException(f.k("Unsupported payment method ", paymentMethod.getType()), null, 2, null);
        }
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public BcmcComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final CheckoutSession checkoutSession, @NotNull final PaymentMethod paymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final SessionComponentCallback<CardComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        paymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(paymentMethod);
        final BcmcComponent bcmcComponent = (BcmcComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, BcmcComponent>() { // from class: com.adyen.checkout.bcmc.internal.provider.BcmcComponentProvider$get$bcmcFactory$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final BcmcComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                CardComponentParams cardComponentParamsMapToParams = new BcmcComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, SessionParamsFactory.INSTANCE.create(checkoutSession), paymentMethod);
                HttpClient httpClient = HttpClientFactory.INSTANCE.getHttpClient(cardComponentParamsMapToParams.getEnvironment());
                int i11 = 2;
                DefaultPublicKeyRepository defaultPublicKeyRepository = new DefaultPublicKeyRepository(new PublicKeyService(httpClient, null, 2, null));
                CardValidationMapper cardValidationMapper = new CardValidationMapper();
                BaseCardEncryptor baseCardEncryptorProvide = CardEncryptorFactory.INSTANCE.provide();
                BaseGenericEncryptor baseGenericEncryptorProvide = GenericEncryptorFactory.INSTANCE.provide();
                DefaultAddressRepository defaultAddressRepository = new DefaultAddressRepository(new AddressService(httpClient, null, i11, 0 == true ? 1 : 0), null, 2, null);
                DefaultDetectCardTypeRepository defaultDetectCardTypeRepository = new DefaultDetectCardTypeRepository(baseCardEncryptorProvide, new BinLookupService(httpClient, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0));
                AnalyticsManager analyticsManagerProvide = this.analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = paymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(cardComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), checkoutSession.getSessionSetupResponse().getId());
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                DefaultCardDelegate defaultCardDelegate = new DefaultCardDelegate(new PaymentObserverRepository(null, 1, null), defaultPublicKeyRepository, cardComponentParamsMapToParams, paymentMethod, checkoutSession.getOrder(), analyticsManager, defaultAddressRepository, defaultDetectCardTypeRepository, cardValidationMapper, baseCardEncryptorProvide, baseGenericEncryptorProvide, new SubmitHandler(c1Var), new DefaultAddressLookupDelegate(defaultAddressRepository, cardComponentParamsMapToParams.getShopperLocale()), new CardConfigDataGenerator(), new DualBrandedCardHandler(cardComponentParamsMapToParams.getEnvironment()), new DefaultSdkDataProvider(analyticsManager));
                GenericActionDelegate delegate = new GenericActionComponentProvider(analyticsManager, this.dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, c1Var, application);
                SessionSavedStateHandleContainer sessionSavedStateHandleContainer = new SessionSavedStateHandleContainer(c1Var, checkoutSession);
                SessionRepository sessionRepository = new SessionRepository(new SessionService(httpClient, null, 2, 0 == true ? 1 : 0), cardComponentParamsMapToParams.getClientKey());
                SessionModel sessionModel = sessionSavedStateHandleContainer.getSessionModel();
                Boolean boolIsFlowTakenOver = sessionSavedStateHandleContainer.isFlowTakenOver();
                return new BcmcComponent(defaultCardDelegate, delegate, new DefaultActionHandlingComponent(delegate, defaultCardDelegate), new SessionComponentEventHandler(new SessionInteractor(sessionRepository, sessionModel, boolIsFlowTakenOver != null ? boolIsFlowTakenOver.booleanValue() : false, analyticsManager), sessionSavedStateHandleContainer));
            }
        }), key, BcmcComponent.class);
        bcmcComponent.observe(lifecycleOwner, new Function1<PaymentComponentEvent<CardComponentState>, Unit>() { // from class: com.adyen.checkout.bcmc.internal.provider.BcmcComponentProvider$get$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<CardComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                bcmcComponent.getComponentEventHandler$bcmc_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<CardComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return bcmcComponent;
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public boolean isPaymentMethodSupported(@NotNull PaymentMethod paymentMethod) {
        paymentMethod.getClass();
        return CollectionsKt.I(BcmcComponent.PAYMENT_METHOD_TYPES, paymentMethod.getType());
    }

    public BcmcComponentProvider(@Nullable DropInOverrideParams dropInOverrideParams, @Nullable AnalyticsManager analyticsManager, @NotNull LocaleProvider localeProvider) {
        localeProvider.getClass();
        this.dropInOverrideParams = dropInOverrideParams;
        this.analyticsManager = analyticsManager;
        this.localeProvider = localeProvider;
    }

    public BcmcComponentProvider() {
        this(null, null, null, 7, null);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public BcmcComponent get(@NotNull ComponentActivity componentActivity, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<CardComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (BcmcComponent) PaymentComponentProvider.DefaultImpls.get((PaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<CardComponentState>>) this, componentActivity, paymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public BcmcComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull BcmcConfiguration bcmcConfiguration, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (BcmcComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, paymentMethod, bcmcConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public BcmcComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (BcmcComponent) SessionPaymentComponentProvider.DefaultImpls.get((SessionPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<CardComponentState>>) this, componentActivity, checkoutSession, paymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public BcmcComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (BcmcComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, paymentMethod, sessionComponentCallback, str);
    }

    @NotNull
    public BcmcComponent get(@NotNull Fragment fragment, @NotNull PaymentMethod paymentMethod, @NotNull BcmcConfiguration bcmcConfiguration, @NotNull ComponentCallback<CardComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (BcmcComponent) PaymentComponentProvider.DefaultImpls.get(this, fragment, paymentMethod, bcmcConfiguration, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public BcmcComponent get(@NotNull Fragment fragment, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<CardComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (BcmcComponent) PaymentComponentProvider.DefaultImpls.get((PaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<CardComponentState>>) this, fragment, paymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public BcmcComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull BcmcConfiguration bcmcConfiguration, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (BcmcComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, paymentMethod, bcmcConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public BcmcComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (BcmcComponent) SessionPaymentComponentProvider.DefaultImpls.get((SessionPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<CardComponentState>>) this, fragment, checkoutSession, paymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public BcmcComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (BcmcComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, paymentMethod, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, paymentMethod, checkoutConfiguration, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, PaymentMethod paymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, paymentMethod, (BcmcConfiguration) configuration, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, checkoutConfiguration, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, (BcmcConfiguration) configuration, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, paymentMethod, checkoutConfiguration, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, PaymentMethod paymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, paymentMethod, (BcmcConfiguration) configuration, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, checkoutConfiguration, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, (BcmcConfiguration) configuration, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, paymentMethod, checkoutConfiguration, application, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, PaymentMethod paymentMethod, Configuration configuration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, paymentMethod, (BcmcConfiguration) configuration, application, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, paymentMethod, checkoutConfiguration, application, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, paymentMethod, (BcmcConfiguration) configuration, application, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public BcmcComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final PaymentMethod paymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final ComponentCallback<CardComponentState> componentCallback, @Nullable final OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        paymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(paymentMethod);
        final BcmcComponent bcmcComponent = (BcmcComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, BcmcComponent>() { // from class: com.adyen.checkout.bcmc.internal.provider.BcmcComponentProvider$get$bcmcFactory$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final BcmcComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                CardComponentParams cardComponentParamsMapToParams = new BcmcComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, null, paymentMethod);
                HttpClient httpClient = HttpClientFactory.INSTANCE.getHttpClient(cardComponentParamsMapToParams.getEnvironment());
                int i11 = 2;
                DefaultPublicKeyRepository defaultPublicKeyRepository = new DefaultPublicKeyRepository(new PublicKeyService(httpClient, null, 2, null));
                CardValidationMapper cardValidationMapper = new CardValidationMapper();
                BaseCardEncryptor baseCardEncryptorProvide = CardEncryptorFactory.INSTANCE.provide();
                BaseGenericEncryptor baseGenericEncryptorProvide = GenericEncryptorFactory.INSTANCE.provide();
                DefaultAddressRepository defaultAddressRepository = new DefaultAddressRepository(new AddressService(httpClient, null, i11, 0 == true ? 1 : 0), null, 2, null);
                DefaultDetectCardTypeRepository defaultDetectCardTypeRepository = new DefaultDetectCardTypeRepository(baseCardEncryptorProvide, new BinLookupService(httpClient, 0 == true ? 1 : 0, i11, 0 == true ? 1 : 0));
                AnalyticsManager analyticsManagerProvide = this.analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = paymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(cardComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), null);
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                DefaultCardDelegate defaultCardDelegate = new DefaultCardDelegate(new PaymentObserverRepository(null, 1, null), defaultPublicKeyRepository, cardComponentParamsMapToParams, paymentMethod, order, analyticsManager, defaultAddressRepository, defaultDetectCardTypeRepository, cardValidationMapper, baseCardEncryptorProvide, baseGenericEncryptorProvide, new SubmitHandler(c1Var), new DefaultAddressLookupDelegate(defaultAddressRepository, cardComponentParamsMapToParams.getShopperLocale()), new CardConfigDataGenerator(), new DualBrandedCardHandler(cardComponentParamsMapToParams.getEnvironment()), new DefaultSdkDataProvider(analyticsManager));
                GenericActionDelegate delegate = new GenericActionComponentProvider(analyticsManager, this.dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, c1Var, application);
                return new BcmcComponent(defaultCardDelegate, delegate, new DefaultActionHandlingComponent(delegate, defaultCardDelegate), new DefaultComponentEventHandler());
            }
        }), key, BcmcComponent.class);
        bcmcComponent.observe(lifecycleOwner, new Function1<PaymentComponentEvent<CardComponentState>, Unit>() { // from class: com.adyen.checkout.bcmc.internal.provider.BcmcComponentProvider$get$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<CardComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                bcmcComponent.getComponentEventHandler$bcmc_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<CardComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return bcmcComponent;
    }

    @NotNull
    public BcmcComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull PaymentMethod paymentMethod, @NotNull BcmcConfiguration configuration, @NotNull Application application, @NotNull ComponentCallback<CardComponentState> componentCallback, @Nullable OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        paymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, paymentMethod, BcmcConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, order, key);
    }

    @NotNull
    public BcmcComponent get(@NotNull ComponentActivity componentActivity, @NotNull PaymentMethod paymentMethod, @NotNull BcmcConfiguration bcmcConfiguration, @NotNull ComponentCallback<CardComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (BcmcComponent) PaymentComponentProvider.DefaultImpls.get(this, componentActivity, paymentMethod, bcmcConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public BcmcComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull BcmcConfiguration configuration, @NotNull Application application, @NotNull SessionComponentCallback<CardComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        paymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, checkoutSession, paymentMethod, BcmcConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, key);
    }
}
