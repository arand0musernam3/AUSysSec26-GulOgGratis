package com.adyen.checkout.googlepay.internal.provider;

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
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.ComponentAvailableCallback;
import com.adyen.checkout.components.core.ComponentCallback;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.internal.Configuration;
import com.adyen.checkout.components.core.internal.DefaultComponentEventHandler;
import com.adyen.checkout.components.core.internal.PaymentComponent;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.PaymentMethodAvailabilityCheck;
import com.adyen.checkout.components.core.internal.PaymentObserverRepository;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManagerFactory;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsSource;
import com.adyen.checkout.components.core.internal.provider.DefaultSdkDataProvider;
import com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapper;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.components.core.internal.util.ViewModelExtKt;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.core.internal.data.api.HttpClient;
import com.adyen.checkout.core.internal.data.api.HttpClientFactory;
import com.adyen.checkout.core.internal.util.LocaleProvider;
import com.adyen.checkout.googlepay.GooglePayComponent;
import com.adyen.checkout.googlepay.GooglePayComponentState;
import com.adyen.checkout.googlepay.GooglePayConfiguration;
import com.adyen.checkout.googlepay.GooglePayConfigurationKt;
import com.adyen.checkout.googlepay.internal.ui.DefaultGooglePayDelegate;
import com.adyen.checkout.googlepay.internal.ui.model.GooglePayComponentParams;
import com.adyen.checkout.googlepay.internal.ui.model.GooglePayComponentParamsMapper;
import com.adyen.checkout.googlepay.internal.util.GooglePayAvailabilityCheck;
import com.adyen.checkout.googlepay.internal.util.GooglePayUtils;
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
import com.adyen.checkout.ui.core.internal.ui.SubmitHandler;
import com.google.android.gms.common.api.k;
import e0.f;
import e10.p;
import e10.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00012 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00062\b\u0012\u0004\u0012\u00020\u00030\bB+\b\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Jg\u0010#\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$Jg\u0010#\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010&J_\u0010#\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010)J_\u0010#\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010*J/\u0010.\u001a\u00020-2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010/J1\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010%\u001a\u0004\u0018\u00010\u00032\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b.\u00101J\u0017\u00103\u001a\u0002022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020-2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b5\u00106R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00108R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00109¨\u0006:"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/provider/GooglePayComponentProvider;", "Lcom/adyen/checkout/components/core/internal/provider/PaymentComponentProvider;", "Lcom/adyen/checkout/googlepay/GooglePayComponent;", "Lcom/adyen/checkout/googlepay/GooglePayConfiguration;", "Lcom/adyen/checkout/googlepay/GooglePayComponentState;", "Lcom/adyen/checkout/components/core/ComponentCallback;", "Lcom/adyen/checkout/sessions/core/internal/provider/SessionPaymentComponentProvider;", "Lcom/adyen/checkout/sessions/core/SessionComponentCallback;", "Lcom/adyen/checkout/components/core/internal/PaymentMethodAvailabilityCheck;", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "localeProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/core/internal/util/LocaleProvider;)V", "Lea/f;", "savedStateRegistryOwner", "Landroidx/lifecycle/s1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/adyen/checkout/components/core/PaymentMethod;", "paymentMethod", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "checkoutConfiguration", "Landroid/app/Application;", "application", "componentCallback", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/Order;", "order", "", "key", "get", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/googlepay/GooglePayComponent;", "configuration", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/googlepay/GooglePayConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/googlepay/GooglePayComponent;", "Lcom/adyen/checkout/sessions/core/CheckoutSession;", "checkoutSession", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/googlepay/GooglePayComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/googlepay/GooglePayConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/googlepay/GooglePayComponent;", "Lcom/adyen/checkout/components/core/ComponentAvailableCallback;", "callback", "", "isAvailable", "(Landroid/app/Application;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Lcom/adyen/checkout/components/core/ComponentAvailableCallback;)V", "applicationContext", "(Landroid/app/Application;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/googlepay/GooglePayConfiguration;Lcom/adyen/checkout/components/core/ComponentAvailableCallback;)V", "", "isPaymentMethodSupported", "(Lcom/adyen/checkout/components/core/PaymentMethod;)Z", "assertSupported", "(Lcom/adyen/checkout/components/core/PaymentMethod;)V", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GooglePayComponentProvider implements PaymentComponentProvider<GooglePayComponent, GooglePayConfiguration, GooglePayComponentState, ComponentCallback<GooglePayComponentState>>, SessionPaymentComponentProvider<GooglePayComponent, GooglePayConfiguration, GooglePayComponentState, SessionComponentCallback<GooglePayComponentState>>, PaymentMethodAvailabilityCheck<GooglePayConfiguration> {

    @Nullable
    private final AnalyticsManager analyticsManager;

    @Nullable
    private final DropInOverrideParams dropInOverrideParams;

    @NotNull
    private final LocaleProvider localeProvider;

    public /* synthetic */ GooglePayComponentProvider(DropInOverrideParams dropInOverrideParams, AnalyticsManager analyticsManager, LocaleProvider localeProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : dropInOverrideParams, (i11 & 2) != 0 ? null : analyticsManager, (i11 & 4) != 0 ? new LocaleProvider() : localeProvider);
    }

    private final void assertSupported(PaymentMethod paymentMethod) {
        if (!isPaymentMethodSupported(paymentMethod)) {
            throw new ComponentException(f.k("Unsupported payment method ", paymentMethod.getType()), null, 2, null);
        }
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public GooglePayComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final CheckoutSession checkoutSession, @NotNull final PaymentMethod paymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final SessionComponentCallback<GooglePayComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        paymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(paymentMethod);
        final GooglePayComponent googlePayComponent = (GooglePayComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, GooglePayComponent>() { // from class: com.adyen.checkout.googlepay.internal.provider.GooglePayComponentProvider$get$googlePayFactory$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final GooglePayComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                GooglePayComponentParams googlePayComponentParamsMapToParams = new GooglePayComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, SessionParamsFactory.INSTANCE.create(checkoutSession), paymentMethod);
                HttpClient httpClient = HttpClientFactory.INSTANCE.getHttpClient(googlePayComponentParamsMapToParams.getEnvironment());
                AnalyticsManager analyticsManagerProvide = this.analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = paymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(googlePayComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), checkoutSession.getSessionSetupResponse().getId());
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                DefaultGooglePayDelegate defaultGooglePayDelegate = new DefaultGooglePayDelegate(new SubmitHandler(c1Var), new PaymentObserverRepository(null, 1, null), paymentMethod, checkoutSession.getOrder(), googlePayComponentParamsMapToParams, analyticsManager, new p(application, null, v.f15550a, GooglePayUtils.INSTANCE.createWalletOptions(googlePayComponentParamsMapToParams), k.f11084c), new GooglePayAvailabilityCheck(application), new DefaultSdkDataProvider(analyticsManager));
                GenericActionDelegate delegate = new GenericActionComponentProvider(analyticsManager, this.dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, c1Var, application);
                SessionSavedStateHandleContainer sessionSavedStateHandleContainer = new SessionSavedStateHandleContainer(c1Var, checkoutSession);
                SessionRepository sessionRepository = new SessionRepository(new SessionService(httpClient, null, 2, null), googlePayComponentParamsMapToParams.getClientKey());
                SessionModel sessionModel = sessionSavedStateHandleContainer.getSessionModel();
                Boolean boolIsFlowTakenOver = sessionSavedStateHandleContainer.isFlowTakenOver();
                return new GooglePayComponent(defaultGooglePayDelegate, delegate, new DefaultActionHandlingComponent(delegate, defaultGooglePayDelegate), new SessionComponentEventHandler(new SessionInteractor(sessionRepository, sessionModel, boolIsFlowTakenOver != null ? boolIsFlowTakenOver.booleanValue() : false, analyticsManager), sessionSavedStateHandleContainer));
            }
        }), key, GooglePayComponent.class);
        googlePayComponent.observe$googlepay_release(lifecycleOwner, new Function1<PaymentComponentEvent<GooglePayComponentState>, Unit>() { // from class: com.adyen.checkout.googlepay.internal.provider.GooglePayComponentProvider$get$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<GooglePayComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                googlePayComponent.getComponentEventHandler$googlepay_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<GooglePayComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return googlePayComponent;
    }

    @Override // com.adyen.checkout.components.core.internal.PaymentMethodAvailabilityCheck
    public void isAvailable(@NotNull Application application, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentAvailableCallback callback) {
        application.getClass();
        paymentMethod.getClass();
        checkoutConfiguration.getClass();
        callback.getClass();
        new GooglePayAvailabilityCheck(application).isAvailable(paymentMethod, new GooglePayComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, null, paymentMethod), callback);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public boolean isPaymentMethodSupported(@NotNull PaymentMethod paymentMethod) {
        paymentMethod.getClass();
        return CollectionsKt.I(GooglePayComponent.PAYMENT_METHOD_TYPES, paymentMethod.getType());
    }

    public GooglePayComponentProvider(@Nullable DropInOverrideParams dropInOverrideParams, @Nullable AnalyticsManager analyticsManager, @NotNull LocaleProvider localeProvider) {
        localeProvider.getClass();
        this.dropInOverrideParams = dropInOverrideParams;
        this.analyticsManager = analyticsManager;
        this.localeProvider = localeProvider;
    }

    public GooglePayComponentProvider() {
        this(null, null, null, 7, null);
    }

    @Override // com.adyen.checkout.components.core.internal.PaymentMethodAvailabilityCheck
    public void isAvailable(@NotNull Application applicationContext, @NotNull PaymentMethod paymentMethod, @Nullable GooglePayConfiguration configuration, @NotNull ComponentAvailableCallback callback) {
        applicationContext.getClass();
        paymentMethod.getClass();
        callback.getClass();
        if (configuration != null) {
            isAvailable(applicationContext, paymentMethod, GooglePayConfigurationKt.toCheckoutConfiguration(configuration), callback);
            return;
        }
        throw new CheckoutException("GooglePayConfiguration cannot be null", null, 2, null);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, PaymentMethod paymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, paymentMethod, (GooglePayConfiguration) configuration, (ComponentCallback<GooglePayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, checkoutConfiguration, (SessionComponentCallback<GooglePayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, (GooglePayConfiguration) configuration, (SessionComponentCallback<GooglePayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, (SessionComponentCallback<GooglePayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, paymentMethod, checkoutConfiguration, (ComponentCallback<GooglePayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, PaymentMethod paymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, paymentMethod, (GooglePayConfiguration) configuration, (ComponentCallback<GooglePayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, checkoutConfiguration, (SessionComponentCallback<GooglePayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, (GooglePayConfiguration) configuration, (SessionComponentCallback<GooglePayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, (SessionComponentCallback<GooglePayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, paymentMethod, checkoutConfiguration, application, (ComponentCallback<GooglePayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, PaymentMethod paymentMethod, Configuration configuration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, paymentMethod, (GooglePayConfiguration) configuration, application, (ComponentCallback<GooglePayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, paymentMethod, checkoutConfiguration, application, (SessionComponentCallback<GooglePayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, paymentMethod, (GooglePayConfiguration) configuration, application, (SessionComponentCallback<GooglePayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public GooglePayComponent get(@NotNull ComponentActivity componentActivity, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<GooglePayComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (GooglePayComponent) PaymentComponentProvider.DefaultImpls.get((PaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<GooglePayComponentState>>) this, componentActivity, paymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public GooglePayComponent get(@NotNull ComponentActivity componentActivity, @NotNull PaymentMethod paymentMethod, @NotNull GooglePayConfiguration googlePayConfiguration, @NotNull ComponentCallback<GooglePayComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (GooglePayComponent) PaymentComponentProvider.DefaultImpls.get(this, componentActivity, paymentMethod, googlePayConfiguration, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public GooglePayComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<GooglePayComponentState> sessionComponentCallback, @Nullable String str) {
        return (GooglePayComponent) SessionPaymentComponentProvider.DefaultImpls.get((SessionPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<GooglePayComponentState>>) this, componentActivity, checkoutSession, paymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @NotNull
    public GooglePayComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull GooglePayConfiguration googlePayConfiguration, @NotNull SessionComponentCallback<GooglePayComponentState> sessionComponentCallback, @Nullable String str) {
        return (GooglePayComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, paymentMethod, googlePayConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public GooglePayComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull SessionComponentCallback<GooglePayComponentState> sessionComponentCallback, @Nullable String str) {
        return (GooglePayComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, paymentMethod, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public GooglePayComponent get(@NotNull Fragment fragment, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<GooglePayComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (GooglePayComponent) PaymentComponentProvider.DefaultImpls.get((PaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<GooglePayComponentState>>) this, fragment, paymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public GooglePayComponent get(@NotNull Fragment fragment, @NotNull PaymentMethod paymentMethod, @NotNull GooglePayConfiguration googlePayConfiguration, @NotNull ComponentCallback<GooglePayComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (GooglePayComponent) PaymentComponentProvider.DefaultImpls.get(this, fragment, paymentMethod, googlePayConfiguration, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public GooglePayComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<GooglePayComponentState> sessionComponentCallback, @Nullable String str) {
        return (GooglePayComponent) SessionPaymentComponentProvider.DefaultImpls.get((SessionPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<GooglePayComponentState>>) this, fragment, checkoutSession, paymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @NotNull
    public GooglePayComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull GooglePayConfiguration googlePayConfiguration, @NotNull SessionComponentCallback<GooglePayComponentState> sessionComponentCallback, @Nullable String str) {
        return (GooglePayComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, paymentMethod, googlePayConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public GooglePayComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull SessionComponentCallback<GooglePayComponentState> sessionComponentCallback, @Nullable String str) {
        return (GooglePayComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, paymentMethod, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public GooglePayComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final PaymentMethod paymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final ComponentCallback<GooglePayComponentState> componentCallback, @Nullable final OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        paymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(paymentMethod);
        final GooglePayComponent googlePayComponent = (GooglePayComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, GooglePayComponent>() { // from class: com.adyen.checkout.googlepay.internal.provider.GooglePayComponentProvider$get$googlePayFactory$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final GooglePayComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                GooglePayComponentParams googlePayComponentParamsMapToParams = new GooglePayComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, null, paymentMethod);
                AnalyticsManager analyticsManagerProvide = this.analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = paymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(googlePayComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), null);
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                DefaultGooglePayDelegate defaultGooglePayDelegate = new DefaultGooglePayDelegate(new SubmitHandler(c1Var), new PaymentObserverRepository(null, 1, null), paymentMethod, order, googlePayComponentParamsMapToParams, analyticsManager, new p(application, null, v.f15550a, GooglePayUtils.INSTANCE.createWalletOptions(googlePayComponentParamsMapToParams), k.f11084c), new GooglePayAvailabilityCheck(application), new DefaultSdkDataProvider(analyticsManager));
                GenericActionDelegate delegate = new GenericActionComponentProvider(analyticsManager, this.dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, c1Var, application);
                return new GooglePayComponent(defaultGooglePayDelegate, delegate, new DefaultActionHandlingComponent(delegate, defaultGooglePayDelegate), new DefaultComponentEventHandler());
            }
        }), key, GooglePayComponent.class);
        googlePayComponent.observe$googlepay_release(lifecycleOwner, new Function1<PaymentComponentEvent<GooglePayComponentState>, Unit>() { // from class: com.adyen.checkout.googlepay.internal.provider.GooglePayComponentProvider$get$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<GooglePayComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                googlePayComponent.getComponentEventHandler$googlepay_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<GooglePayComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return googlePayComponent;
    }

    @NotNull
    public GooglePayComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull PaymentMethod paymentMethod, @NotNull GooglePayConfiguration configuration, @NotNull Application application, @NotNull ComponentCallback<GooglePayComponentState> componentCallback, @Nullable OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        paymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, paymentMethod, GooglePayConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, order, key);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, paymentMethod, checkoutConfiguration, (ComponentCallback<GooglePayComponentState>) componentCallback, orderRequest, str);
    }

    @NotNull
    public GooglePayComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull GooglePayConfiguration configuration, @NotNull Application application, @NotNull SessionComponentCallback<GooglePayComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        paymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, checkoutSession, paymentMethod, GooglePayConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, key);
    }
}
