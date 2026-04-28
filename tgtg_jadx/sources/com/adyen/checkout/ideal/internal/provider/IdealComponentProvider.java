package com.adyen.checkout.ideal.internal.provider;

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
import com.adyen.checkout.components.core.internal.provider.DefaultSdkDataProvider;
import com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapper;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.components.core.internal.ui.model.GenericComponentParams;
import com.adyen.checkout.components.core.internal.ui.model.GenericComponentParamsMapper;
import com.adyen.checkout.components.core.internal.util.ViewModelExtKt;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.core.internal.data.api.HttpClient;
import com.adyen.checkout.core.internal.data.api.HttpClientFactory;
import com.adyen.checkout.core.internal.util.LocaleProvider;
import com.adyen.checkout.ideal.IdealComponent;
import com.adyen.checkout.ideal.IdealComponentState;
import com.adyen.checkout.ideal.IdealConfiguration;
import com.adyen.checkout.ideal.IdealConfigurationKt;
import com.adyen.checkout.ideal.internal.ui.DefaultIdealDelegate;
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
import e0.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00012 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u0006B+\b\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJg\u0010\"\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#Jg\u0010\"\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010%J_\u0010\"\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010(J_\u0010\"\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010/R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102¨\u00063"}, d2 = {"Lcom/adyen/checkout/ideal/internal/provider/IdealComponentProvider;", "Lcom/adyen/checkout/components/core/internal/provider/PaymentComponentProvider;", "Lcom/adyen/checkout/ideal/IdealComponent;", "Lcom/adyen/checkout/ideal/IdealConfiguration;", "Lcom/adyen/checkout/ideal/IdealComponentState;", "Lcom/adyen/checkout/components/core/ComponentCallback;", "Lcom/adyen/checkout/sessions/core/internal/provider/SessionPaymentComponentProvider;", "Lcom/adyen/checkout/sessions/core/SessionComponentCallback;", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "localeProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/core/internal/util/LocaleProvider;)V", "Lea/f;", "savedStateRegistryOwner", "Landroidx/lifecycle/s1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/adyen/checkout/components/core/PaymentMethod;", "paymentMethod", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "checkoutConfiguration", "Landroid/app/Application;", "application", "componentCallback", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/Order;", "order", "", "key", "get", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/ideal/IdealComponent;", "configuration", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/ideal/IdealConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/ideal/IdealComponent;", "Lcom/adyen/checkout/sessions/core/CheckoutSession;", "checkoutSession", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/ideal/IdealComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/ideal/IdealConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/ideal/IdealComponent;", "", "isPaymentMethodSupported", "(Lcom/adyen/checkout/components/core/PaymentMethod;)Z", "", "assertSupported", "(Lcom/adyen/checkout/components/core/PaymentMethod;)V", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "ideal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IdealComponentProvider implements PaymentComponentProvider<IdealComponent, IdealConfiguration, IdealComponentState, ComponentCallback<IdealComponentState>>, SessionPaymentComponentProvider<IdealComponent, IdealConfiguration, IdealComponentState, SessionComponentCallback<IdealComponentState>> {

    @Nullable
    private final AnalyticsManager analyticsManager;

    @Nullable
    private final DropInOverrideParams dropInOverrideParams;

    @NotNull
    private final LocaleProvider localeProvider;

    public /* synthetic */ IdealComponentProvider(DropInOverrideParams dropInOverrideParams, AnalyticsManager analyticsManager, LocaleProvider localeProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : dropInOverrideParams, (i11 & 2) != 0 ? null : analyticsManager, (i11 & 4) != 0 ? new LocaleProvider() : localeProvider);
    }

    private final void assertSupported(PaymentMethod paymentMethod) {
        if (!isPaymentMethodSupported(paymentMethod)) {
            throw new ComponentException(f.k("Unsupported payment method ", paymentMethod.getType()), null, 2, null);
        }
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public IdealComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final CheckoutSession checkoutSession, @NotNull final PaymentMethod paymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final SessionComponentCallback<IdealComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        paymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(paymentMethod);
        final IdealComponent idealComponent = (IdealComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, IdealComponent>() { // from class: com.adyen.checkout.ideal.internal.provider.IdealComponentProvider$get$genericFactory$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final IdealComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                GenericComponentParams genericComponentParamsMapToParams = new GenericComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, SessionParamsFactory.INSTANCE.create(checkoutSession));
                HttpClient httpClient = HttpClientFactory.INSTANCE.getHttpClient(genericComponentParamsMapToParams.getEnvironment());
                AnalyticsManager analyticsManagerProvide = this.analyticsManager;
                x xVar = null;
                Object[] objArr = 0;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = paymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(genericComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), null);
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                DefaultIdealDelegate defaultIdealDelegate = new DefaultIdealDelegate(new PaymentObserverRepository(null, 1, null), paymentMethod, checkoutSession.getOrder(), genericComponentParamsMapToParams, analyticsManager, new DefaultSdkDataProvider(analyticsManager));
                GenericActionDelegate delegate = new GenericActionComponentProvider(analyticsManager, this.dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, c1Var, application);
                SessionSavedStateHandleContainer sessionSavedStateHandleContainer = new SessionSavedStateHandleContainer(c1Var, checkoutSession);
                SessionRepository sessionRepository = new SessionRepository(new SessionService(httpClient, xVar, 2, objArr == true ? 1 : 0), genericComponentParamsMapToParams.getClientKey());
                SessionModel sessionModel = sessionSavedStateHandleContainer.getSessionModel();
                Boolean boolIsFlowTakenOver = sessionSavedStateHandleContainer.isFlowTakenOver();
                return new IdealComponent(defaultIdealDelegate, delegate, new DefaultActionHandlingComponent(delegate, defaultIdealDelegate), new SessionComponentEventHandler(new SessionInteractor(sessionRepository, sessionModel, boolIsFlowTakenOver != null ? boolIsFlowTakenOver.booleanValue() : false, analyticsManager), sessionSavedStateHandleContainer));
            }
        }), key, IdealComponent.class);
        idealComponent.observe$ideal_release(lifecycleOwner, new Function1<PaymentComponentEvent<IdealComponentState>, Unit>() { // from class: com.adyen.checkout.ideal.internal.provider.IdealComponentProvider$get$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<IdealComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                idealComponent.getComponentEventHandler$ideal_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<IdealComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return idealComponent;
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public boolean isPaymentMethodSupported(@NotNull PaymentMethod paymentMethod) {
        paymentMethod.getClass();
        return CollectionsKt.I(IdealComponent.PAYMENT_METHOD_TYPES, paymentMethod.getType());
    }

    public IdealComponentProvider(@Nullable DropInOverrideParams dropInOverrideParams, @Nullable AnalyticsManager analyticsManager, @NotNull LocaleProvider localeProvider) {
        localeProvider.getClass();
        this.dropInOverrideParams = dropInOverrideParams;
        this.analyticsManager = analyticsManager;
        this.localeProvider = localeProvider;
    }

    public IdealComponentProvider() {
        this(null, null, null, 7, null);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, PaymentMethod paymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, paymentMethod, (IdealConfiguration) configuration, (ComponentCallback<IdealComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, checkoutConfiguration, (SessionComponentCallback<IdealComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, (IdealConfiguration) configuration, (SessionComponentCallback<IdealComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, (SessionComponentCallback<IdealComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, paymentMethod, checkoutConfiguration, (ComponentCallback<IdealComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, PaymentMethod paymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, paymentMethod, (IdealConfiguration) configuration, (ComponentCallback<IdealComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, checkoutConfiguration, (SessionComponentCallback<IdealComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, (IdealConfiguration) configuration, (SessionComponentCallback<IdealComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, (SessionComponentCallback<IdealComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, paymentMethod, checkoutConfiguration, application, (ComponentCallback<IdealComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, PaymentMethod paymentMethod, Configuration configuration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, paymentMethod, (IdealConfiguration) configuration, application, (ComponentCallback<IdealComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, paymentMethod, checkoutConfiguration, application, (SessionComponentCallback<IdealComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, paymentMethod, (IdealConfiguration) configuration, application, (SessionComponentCallback<IdealComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public IdealComponent get(@NotNull ComponentActivity componentActivity, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<IdealComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (IdealComponent) PaymentComponentProvider.DefaultImpls.get((PaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<IdealComponentState>>) this, componentActivity, paymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public IdealComponent get(@NotNull ComponentActivity componentActivity, @NotNull PaymentMethod paymentMethod, @NotNull IdealConfiguration idealConfiguration, @NotNull ComponentCallback<IdealComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (IdealComponent) PaymentComponentProvider.DefaultImpls.get(this, componentActivity, paymentMethod, idealConfiguration, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public IdealComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<IdealComponentState> sessionComponentCallback, @Nullable String str) {
        return (IdealComponent) SessionPaymentComponentProvider.DefaultImpls.get((SessionPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<IdealComponentState>>) this, componentActivity, checkoutSession, paymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @NotNull
    public IdealComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull IdealConfiguration idealConfiguration, @NotNull SessionComponentCallback<IdealComponentState> sessionComponentCallback, @Nullable String str) {
        return (IdealComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, paymentMethod, idealConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public IdealComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull SessionComponentCallback<IdealComponentState> sessionComponentCallback, @Nullable String str) {
        return (IdealComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, paymentMethod, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public IdealComponent get(@NotNull Fragment fragment, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<IdealComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (IdealComponent) PaymentComponentProvider.DefaultImpls.get((PaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<IdealComponentState>>) this, fragment, paymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public IdealComponent get(@NotNull Fragment fragment, @NotNull PaymentMethod paymentMethod, @NotNull IdealConfiguration idealConfiguration, @NotNull ComponentCallback<IdealComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (IdealComponent) PaymentComponentProvider.DefaultImpls.get(this, fragment, paymentMethod, idealConfiguration, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public IdealComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<IdealComponentState> sessionComponentCallback, @Nullable String str) {
        return (IdealComponent) SessionPaymentComponentProvider.DefaultImpls.get((SessionPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<IdealComponentState>>) this, fragment, checkoutSession, paymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @NotNull
    public IdealComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull IdealConfiguration idealConfiguration, @NotNull SessionComponentCallback<IdealComponentState> sessionComponentCallback, @Nullable String str) {
        return (IdealComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, paymentMethod, idealConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public IdealComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull SessionComponentCallback<IdealComponentState> sessionComponentCallback, @Nullable String str) {
        return (IdealComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, paymentMethod, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public IdealComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final PaymentMethod paymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final ComponentCallback<IdealComponentState> componentCallback, @Nullable final OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        paymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(paymentMethod);
        final IdealComponent idealComponent = (IdealComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, IdealComponent>() { // from class: com.adyen.checkout.ideal.internal.provider.IdealComponentProvider$get$genericFactory$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final IdealComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                GenericComponentParams genericComponentParamsMapToParams = new GenericComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, null);
                AnalyticsManager analyticsManagerProvide = this.analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = paymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(genericComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), null);
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                DefaultIdealDelegate defaultIdealDelegate = new DefaultIdealDelegate(new PaymentObserverRepository(null, 1, null), paymentMethod, order, genericComponentParamsMapToParams, analyticsManager, new DefaultSdkDataProvider(analyticsManager));
                GenericActionDelegate delegate = new GenericActionComponentProvider(analyticsManager, this.dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, c1Var, application);
                return new IdealComponent(defaultIdealDelegate, delegate, new DefaultActionHandlingComponent(delegate, defaultIdealDelegate), new DefaultComponentEventHandler());
            }
        }), key, IdealComponent.class);
        idealComponent.observe$ideal_release(lifecycleOwner, new Function1<PaymentComponentEvent<IdealComponentState>, Unit>() { // from class: com.adyen.checkout.ideal.internal.provider.IdealComponentProvider$get$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<IdealComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                idealComponent.getComponentEventHandler$ideal_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<IdealComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return idealComponent;
    }

    @NotNull
    public IdealComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull PaymentMethod paymentMethod, @NotNull IdealConfiguration configuration, @NotNull Application application, @NotNull ComponentCallback<IdealComponentState> componentCallback, @Nullable OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        paymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, paymentMethod, IdealConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, order, key);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, paymentMethod, checkoutConfiguration, (ComponentCallback<IdealComponentState>) componentCallback, orderRequest, str);
    }

    @NotNull
    public IdealComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull IdealConfiguration configuration, @NotNull Application application, @NotNull SessionComponentCallback<IdealComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        paymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, checkoutSession, paymentMethod, IdealConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, key);
    }
}
