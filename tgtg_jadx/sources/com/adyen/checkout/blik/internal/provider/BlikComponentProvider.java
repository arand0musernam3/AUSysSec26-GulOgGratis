package com.adyen.checkout.blik.internal.provider;

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
import com.adyen.checkout.blik.BlikComponent;
import com.adyen.checkout.blik.BlikComponentState;
import com.adyen.checkout.blik.BlikConfiguration;
import com.adyen.checkout.blik.BlikConfigurationKt;
import com.adyen.checkout.blik.internal.ui.DefaultBlikDelegate;
import com.adyen.checkout.blik.internal.ui.StoredBlikDelegate;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.ComponentCallback;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.StoredPaymentMethod;
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
import com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider;
import com.adyen.checkout.components.core.internal.ui.model.ButtonComponentParams;
import com.adyen.checkout.components.core.internal.ui.model.ButtonComponentParamsMapper;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapper;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.components.core.internal.util.ViewModelExtKt;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.core.internal.data.api.HttpClient;
import com.adyen.checkout.core.internal.data.api.HttpClientFactory;
import com.adyen.checkout.core.internal.util.LocaleProvider;
import com.adyen.checkout.sessions.core.CheckoutSession;
import com.adyen.checkout.sessions.core.SessionComponentCallback;
import com.adyen.checkout.sessions.core.SessionModel;
import com.adyen.checkout.sessions.core.internal.SessionComponentEventHandler;
import com.adyen.checkout.sessions.core.internal.SessionInteractor;
import com.adyen.checkout.sessions.core.internal.SessionSavedStateHandleContainer;
import com.adyen.checkout.sessions.core.internal.data.api.SessionRepository;
import com.adyen.checkout.sessions.core.internal.data.api.SessionService;
import com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider;
import com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider;
import com.adyen.checkout.sessions.core.internal.ui.model.SessionParamsFactory;
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
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00012 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00062 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00072 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\tB+\b\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jg\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%Jg\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010'Jg\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010*Jg\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010+J_\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010.J_\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010/J_\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u00100J_\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u00101J\u0017\u00103\u001a\u0002022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00103\u001a\u0002022\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b3\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b7\u00108J\u0017\u00107\u001a\u0002062\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b7\u00109R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<¨\u0006="}, d2 = {"Lcom/adyen/checkout/blik/internal/provider/BlikComponentProvider;", "Lcom/adyen/checkout/components/core/internal/provider/PaymentComponentProvider;", "Lcom/adyen/checkout/blik/BlikComponent;", "Lcom/adyen/checkout/blik/BlikConfiguration;", "Lcom/adyen/checkout/blik/BlikComponentState;", "Lcom/adyen/checkout/components/core/ComponentCallback;", "Lcom/adyen/checkout/components/core/internal/provider/StoredPaymentComponentProvider;", "Lcom/adyen/checkout/sessions/core/internal/provider/SessionPaymentComponentProvider;", "Lcom/adyen/checkout/sessions/core/SessionComponentCallback;", "Lcom/adyen/checkout/sessions/core/internal/provider/SessionStoredPaymentComponentProvider;", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "localeProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/core/internal/util/LocaleProvider;)V", "Lea/f;", "savedStateRegistryOwner", "Landroidx/lifecycle/s1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/adyen/checkout/components/core/PaymentMethod;", "paymentMethod", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "checkoutConfiguration", "Landroid/app/Application;", "application", "componentCallback", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/Order;", "order", "", "key", "get", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/blik/BlikComponent;", "configuration", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/blik/BlikConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/blik/BlikComponent;", "Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "storedPaymentMethod", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/blik/BlikComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/blik/BlikConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/blik/BlikComponent;", "Lcom/adyen/checkout/sessions/core/CheckoutSession;", "checkoutSession", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/blik/BlikComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/blik/BlikConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/blik/BlikComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/blik/BlikComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/blik/BlikConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/blik/BlikComponent;", "", "isPaymentMethodSupported", "(Lcom/adyen/checkout/components/core/PaymentMethod;)Z", "(Lcom/adyen/checkout/components/core/StoredPaymentMethod;)Z", "", "assertSupported", "(Lcom/adyen/checkout/components/core/PaymentMethod;)V", "(Lcom/adyen/checkout/components/core/StoredPaymentMethod;)V", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "blik_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BlikComponentProvider implements PaymentComponentProvider<BlikComponent, BlikConfiguration, BlikComponentState, ComponentCallback<BlikComponentState>>, StoredPaymentComponentProvider<BlikComponent, BlikConfiguration, BlikComponentState, ComponentCallback<BlikComponentState>>, SessionPaymentComponentProvider<BlikComponent, BlikConfiguration, BlikComponentState, SessionComponentCallback<BlikComponentState>>, SessionStoredPaymentComponentProvider<BlikComponent, BlikConfiguration, BlikComponentState, SessionComponentCallback<BlikComponentState>> {

    @Nullable
    private final AnalyticsManager analyticsManager;

    @Nullable
    private final DropInOverrideParams dropInOverrideParams;

    @NotNull
    private final LocaleProvider localeProvider;

    public /* synthetic */ BlikComponentProvider(DropInOverrideParams dropInOverrideParams, AnalyticsManager analyticsManager, LocaleProvider localeProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : dropInOverrideParams, (i11 & 2) != 0 ? null : analyticsManager, (i11 & 4) != 0 ? new LocaleProvider() : localeProvider);
    }

    private final void assertSupported(PaymentMethod paymentMethod) {
        if (!isPaymentMethodSupported(paymentMethod)) {
            throw new ComponentException(f.k("Unsupported payment method ", paymentMethod.getType()), null, 2, null);
        }
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public BlikComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final CheckoutSession checkoutSession, @NotNull final PaymentMethod paymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final SessionComponentCallback<BlikComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        paymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(paymentMethod);
        final BlikComponent blikComponent = (BlikComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, BlikComponent>() { // from class: com.adyen.checkout.blik.internal.provider.BlikComponentProvider$get$genericFactory$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final BlikComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                ButtonComponentParams buttonComponentParamsMapToParams = new ButtonComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, SessionParamsFactory.INSTANCE.create(checkoutSession), BlikConfigurationKt.getBlikConfiguration(checkoutConfiguration));
                HttpClient httpClient = HttpClientFactory.INSTANCE.getHttpClient(buttonComponentParamsMapToParams.getEnvironment());
                AnalyticsManager analyticsManagerProvide = this.analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = paymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(buttonComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), checkoutSession.getSessionSetupResponse().getId());
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                DefaultBlikDelegate defaultBlikDelegate = new DefaultBlikDelegate(new PaymentObserverRepository(null, 1, null), buttonComponentParamsMapToParams, paymentMethod, checkoutSession.getOrder(), analyticsManager, new SubmitHandler(c1Var), new DefaultSdkDataProvider(analyticsManager));
                GenericActionDelegate delegate = new GenericActionComponentProvider(analyticsManager, this.dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, c1Var, application);
                SessionSavedStateHandleContainer sessionSavedStateHandleContainer = new SessionSavedStateHandleContainer(c1Var, checkoutSession);
                SessionRepository sessionRepository = new SessionRepository(new SessionService(httpClient, null, 2, 0 == true ? 1 : 0), buttonComponentParamsMapToParams.getClientKey());
                SessionModel sessionModel = sessionSavedStateHandleContainer.getSessionModel();
                Boolean boolIsFlowTakenOver = sessionSavedStateHandleContainer.isFlowTakenOver();
                return new BlikComponent(defaultBlikDelegate, delegate, new DefaultActionHandlingComponent(delegate, defaultBlikDelegate), new SessionComponentEventHandler(new SessionInteractor(sessionRepository, sessionModel, boolIsFlowTakenOver != null ? boolIsFlowTakenOver.booleanValue() : false, analyticsManager), sessionSavedStateHandleContainer));
            }
        }), key, BlikComponent.class);
        blikComponent.observe$blik_release(lifecycleOwner, new Function1<PaymentComponentEvent<BlikComponentState>, Unit>() { // from class: com.adyen.checkout.blik.internal.provider.BlikComponentProvider$get$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<BlikComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                blikComponent.getComponentEventHandler$blik_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<BlikComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return blikComponent;
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public boolean isPaymentMethodSupported(@NotNull PaymentMethod paymentMethod) {
        paymentMethod.getClass();
        return CollectionsKt.I(BlikComponent.PAYMENT_METHOD_TYPES, paymentMethod.getType());
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public boolean isPaymentMethodSupported(@NotNull StoredPaymentMethod storedPaymentMethod) {
        storedPaymentMethod.getClass();
        return CollectionsKt.I(BlikComponent.PAYMENT_METHOD_TYPES, storedPaymentMethod.getType());
    }

    public BlikComponentProvider(@Nullable DropInOverrideParams dropInOverrideParams, @Nullable AnalyticsManager analyticsManager, @NotNull LocaleProvider localeProvider) {
        localeProvider.getClass();
        this.dropInOverrideParams = dropInOverrideParams;
        this.analyticsManager = analyticsManager;
        this.localeProvider = localeProvider;
    }

    private final void assertSupported(StoredPaymentMethod storedPaymentMethod) {
        if (!isPaymentMethodSupported(storedPaymentMethod)) {
            throw new ComponentException(f.k("Unsupported payment method ", storedPaymentMethod.getType()), null, 2, null);
        }
    }

    public BlikComponentProvider() {
        this(null, null, null, 7, null);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public BlikComponent get(@NotNull ComponentActivity componentActivity, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<BlikComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (BlikComponent) PaymentComponentProvider.DefaultImpls.get((PaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<BlikComponentState>>) this, componentActivity, paymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public BlikComponent get(@NotNull ComponentActivity componentActivity, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull BlikConfiguration blikConfiguration, @NotNull ComponentCallback<BlikComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (BlikComponent) StoredPaymentComponentProvider.DefaultImpls.get(this, componentActivity, storedPaymentMethod, blikConfiguration, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    @NotNull
    public BlikComponent get(@NotNull ComponentActivity componentActivity, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<BlikComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (BlikComponent) StoredPaymentComponentProvider.DefaultImpls.get((StoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<BlikComponentState>>) this, componentActivity, storedPaymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public BlikComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull BlikConfiguration blikConfiguration, @NotNull SessionComponentCallback<BlikComponentState> sessionComponentCallback, @Nullable String str) {
        return (BlikComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, paymentMethod, blikConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public BlikComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<BlikComponentState> sessionComponentCallback, @Nullable String str) {
        return (BlikComponent) SessionPaymentComponentProvider.DefaultImpls.get((SessionPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<BlikComponentState>>) this, componentActivity, checkoutSession, paymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public BlikComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull SessionComponentCallback<BlikComponentState> sessionComponentCallback, @Nullable String str) {
        return (BlikComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, paymentMethod, sessionComponentCallback, str);
    }

    @NotNull
    public BlikComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull BlikConfiguration blikConfiguration, @NotNull SessionComponentCallback<BlikComponentState> sessionComponentCallback, @Nullable String str) {
        return (BlikComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, storedPaymentMethod, blikConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    @NotNull
    public BlikComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<BlikComponentState> sessionComponentCallback, @Nullable String str) {
        return (BlikComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get((SessionStoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<BlikComponentState>>) this, componentActivity, checkoutSession, storedPaymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    @NotNull
    public BlikComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull SessionComponentCallback<BlikComponentState> sessionComponentCallback, @Nullable String str) {
        return (BlikComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, storedPaymentMethod, sessionComponentCallback, str);
    }

    @NotNull
    public BlikComponent get(@NotNull Fragment fragment, @NotNull PaymentMethod paymentMethod, @NotNull BlikConfiguration blikConfiguration, @NotNull ComponentCallback<BlikComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (BlikComponent) PaymentComponentProvider.DefaultImpls.get(this, fragment, paymentMethod, blikConfiguration, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public BlikComponent get(@NotNull Fragment fragment, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<BlikComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (BlikComponent) PaymentComponentProvider.DefaultImpls.get((PaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<BlikComponentState>>) this, fragment, paymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public BlikComponent get(@NotNull Fragment fragment, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull BlikConfiguration blikConfiguration, @NotNull ComponentCallback<BlikComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (BlikComponent) StoredPaymentComponentProvider.DefaultImpls.get(this, fragment, storedPaymentMethod, blikConfiguration, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    @NotNull
    public BlikComponent get(@NotNull Fragment fragment, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<BlikComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (BlikComponent) StoredPaymentComponentProvider.DefaultImpls.get((StoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<BlikComponentState>>) this, fragment, storedPaymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public BlikComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull BlikConfiguration blikConfiguration, @NotNull SessionComponentCallback<BlikComponentState> sessionComponentCallback, @Nullable String str) {
        return (BlikComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, paymentMethod, blikConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public BlikComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<BlikComponentState> sessionComponentCallback, @Nullable String str) {
        return (BlikComponent) SessionPaymentComponentProvider.DefaultImpls.get((SessionPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<BlikComponentState>>) this, fragment, checkoutSession, paymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public BlikComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull SessionComponentCallback<BlikComponentState> sessionComponentCallback, @Nullable String str) {
        return (BlikComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, paymentMethod, sessionComponentCallback, str);
    }

    @NotNull
    public BlikComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull BlikConfiguration blikConfiguration, @NotNull SessionComponentCallback<BlikComponentState> sessionComponentCallback, @Nullable String str) {
        return (BlikComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, storedPaymentMethod, blikConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    @NotNull
    public BlikComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<BlikComponentState> sessionComponentCallback, @Nullable String str) {
        return (BlikComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get((SessionStoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<BlikComponentState>>) this, fragment, checkoutSession, storedPaymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    @NotNull
    public BlikComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull SessionComponentCallback<BlikComponentState> sessionComponentCallback, @Nullable String str) {
        return (BlikComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, storedPaymentMethod, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, paymentMethod, checkoutConfiguration, (ComponentCallback<BlikComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, PaymentMethod paymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, paymentMethod, (BlikConfiguration) configuration, (ComponentCallback<BlikComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, storedPaymentMethod, checkoutConfiguration, (ComponentCallback<BlikComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, StoredPaymentMethod storedPaymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, storedPaymentMethod, (BlikConfiguration) configuration, (ComponentCallback<BlikComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, checkoutConfiguration, (SessionComponentCallback<BlikComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, (BlikConfiguration) configuration, (SessionComponentCallback<BlikComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, (SessionComponentCallback<BlikComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, storedPaymentMethod, checkoutConfiguration, (SessionComponentCallback<BlikComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, storedPaymentMethod, (BlikConfiguration) configuration, (SessionComponentCallback<BlikComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, storedPaymentMethod, (SessionComponentCallback<BlikComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, paymentMethod, checkoutConfiguration, (ComponentCallback<BlikComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, PaymentMethod paymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, paymentMethod, (BlikConfiguration) configuration, (ComponentCallback<BlikComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, storedPaymentMethod, checkoutConfiguration, (ComponentCallback<BlikComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, StoredPaymentMethod storedPaymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, storedPaymentMethod, (BlikConfiguration) configuration, (ComponentCallback<BlikComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, checkoutConfiguration, (SessionComponentCallback<BlikComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, (BlikConfiguration) configuration, (SessionComponentCallback<BlikComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, (SessionComponentCallback<BlikComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, storedPaymentMethod, checkoutConfiguration, (SessionComponentCallback<BlikComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, storedPaymentMethod, (BlikConfiguration) configuration, (SessionComponentCallback<BlikComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, storedPaymentMethod, (SessionComponentCallback<BlikComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, paymentMethod, checkoutConfiguration, application, (ComponentCallback<BlikComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, PaymentMethod paymentMethod, Configuration configuration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, paymentMethod, (BlikConfiguration) configuration, application, (ComponentCallback<BlikComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, storedPaymentMethod, checkoutConfiguration, application, (ComponentCallback<BlikComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, StoredPaymentMethod storedPaymentMethod, Configuration configuration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, storedPaymentMethod, (BlikConfiguration) configuration, application, (ComponentCallback<BlikComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, paymentMethod, checkoutConfiguration, application, (SessionComponentCallback<BlikComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, paymentMethod, (BlikConfiguration) configuration, application, (SessionComponentCallback<BlikComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, storedPaymentMethod, checkoutConfiguration, application, (SessionComponentCallback<BlikComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, Configuration configuration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, storedPaymentMethod, (BlikConfiguration) configuration, application, (SessionComponentCallback<BlikComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public BlikComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final PaymentMethod paymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final ComponentCallback<BlikComponentState> componentCallback, @Nullable final OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        paymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(paymentMethod);
        final BlikComponent blikComponent = (BlikComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, BlikComponent>() { // from class: com.adyen.checkout.blik.internal.provider.BlikComponentProvider$get$genericFactory$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final BlikComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                ButtonComponentParams buttonComponentParamsMapToParams = new ButtonComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, null, BlikConfigurationKt.getBlikConfiguration(checkoutConfiguration));
                AnalyticsManager analyticsManagerProvide = this.analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = paymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(buttonComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), null);
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                DefaultBlikDelegate defaultBlikDelegate = new DefaultBlikDelegate(new PaymentObserverRepository(null, 1, null), buttonComponentParamsMapToParams, paymentMethod, order, analyticsManager, new SubmitHandler(c1Var), new DefaultSdkDataProvider(analyticsManager));
                GenericActionDelegate delegate = new GenericActionComponentProvider(analyticsManager, this.dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, c1Var, application);
                return new BlikComponent(defaultBlikDelegate, delegate, new DefaultActionHandlingComponent(delegate, defaultBlikDelegate), new DefaultComponentEventHandler());
            }
        }), key, BlikComponent.class);
        blikComponent.observe$blik_release(lifecycleOwner, new Function1<PaymentComponentEvent<BlikComponentState>, Unit>() { // from class: com.adyen.checkout.blik.internal.provider.BlikComponentProvider$get$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<BlikComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                blikComponent.getComponentEventHandler$blik_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<BlikComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return blikComponent;
    }

    @NotNull
    public BlikComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull PaymentMethod paymentMethod, @NotNull BlikConfiguration configuration, @NotNull Application application, @NotNull ComponentCallback<BlikComponentState> componentCallback, @Nullable OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        paymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, paymentMethod, BlikConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, order, key);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    @NotNull
    public BlikComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final StoredPaymentMethod storedPaymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final ComponentCallback<BlikComponentState> componentCallback, @Nullable final OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        storedPaymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(storedPaymentMethod);
        final BlikComponent blikComponent = (BlikComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, BlikComponent>() { // from class: com.adyen.checkout.blik.internal.provider.BlikComponentProvider$get$genericStoredFactory$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final BlikComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                ButtonComponentParams buttonComponentParamsMapToParams = new ButtonComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, null, BlikConfigurationKt.getBlikConfiguration(checkoutConfiguration));
                AnalyticsManager analyticsManagerProvide = this.analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = storedPaymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(buttonComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), null);
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                StoredBlikDelegate storedBlikDelegate = new StoredBlikDelegate(new PaymentObserverRepository(null, 1, null), buttonComponentParamsMapToParams, storedPaymentMethod, order, analyticsManager, new SubmitHandler(c1Var), new DefaultSdkDataProvider(analyticsManager));
                GenericActionDelegate delegate = new GenericActionComponentProvider(analyticsManager, this.dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, c1Var, application);
                return new BlikComponent(storedBlikDelegate, delegate, new DefaultActionHandlingComponent(delegate, storedBlikDelegate), new DefaultComponentEventHandler());
            }
        }), key, BlikComponent.class);
        blikComponent.observe$blik_release(lifecycleOwner, new Function1<PaymentComponentEvent<BlikComponentState>, Unit>() { // from class: com.adyen.checkout.blik.internal.provider.BlikComponentProvider$get$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<BlikComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                blikComponent.getComponentEventHandler$blik_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<BlikComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return blikComponent;
    }

    @NotNull
    public BlikComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull BlikConfiguration configuration, @NotNull Application application, @NotNull ComponentCallback<BlikComponentState> componentCallback, @Nullable OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        storedPaymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, storedPaymentMethod, BlikConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, order, key);
    }

    @NotNull
    public BlikComponent get(@NotNull ComponentActivity componentActivity, @NotNull PaymentMethod paymentMethod, @NotNull BlikConfiguration blikConfiguration, @NotNull ComponentCallback<BlikComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (BlikComponent) PaymentComponentProvider.DefaultImpls.get(this, componentActivity, paymentMethod, blikConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public BlikComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull BlikConfiguration configuration, @NotNull Application application, @NotNull SessionComponentCallback<BlikComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        paymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, checkoutSession, paymentMethod, BlikConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, key);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    @NotNull
    public BlikComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final CheckoutSession checkoutSession, @NotNull final StoredPaymentMethod storedPaymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final SessionComponentCallback<BlikComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        storedPaymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(storedPaymentMethod);
        final BlikComponent blikComponent = (BlikComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, BlikComponent>() { // from class: com.adyen.checkout.blik.internal.provider.BlikComponentProvider$get$genericStoredFactory$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final BlikComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                ButtonComponentParams buttonComponentParamsMapToParams = new ButtonComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, SessionParamsFactory.INSTANCE.create(checkoutSession), BlikConfigurationKt.getBlikConfiguration(checkoutConfiguration));
                HttpClient httpClient = HttpClientFactory.INSTANCE.getHttpClient(buttonComponentParamsMapToParams.getEnvironment());
                AnalyticsManager analyticsManagerProvide = this.analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = storedPaymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(buttonComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), checkoutSession.getSessionSetupResponse().getId());
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                StoredBlikDelegate storedBlikDelegate = new StoredBlikDelegate(new PaymentObserverRepository(null, 1, null), buttonComponentParamsMapToParams, storedPaymentMethod, checkoutSession.getOrder(), analyticsManager, new SubmitHandler(c1Var), new DefaultSdkDataProvider(analyticsManager));
                GenericActionDelegate delegate = new GenericActionComponentProvider(analyticsManager, this.dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, c1Var, application);
                SessionSavedStateHandleContainer sessionSavedStateHandleContainer = new SessionSavedStateHandleContainer(c1Var, checkoutSession);
                SessionRepository sessionRepository = new SessionRepository(new SessionService(httpClient, null, 2, 0 == true ? 1 : 0), buttonComponentParamsMapToParams.getClientKey());
                SessionModel sessionModel = sessionSavedStateHandleContainer.getSessionModel();
                Boolean boolIsFlowTakenOver = sessionSavedStateHandleContainer.isFlowTakenOver();
                return new BlikComponent(storedBlikDelegate, delegate, new DefaultActionHandlingComponent(delegate, storedBlikDelegate), new SessionComponentEventHandler(new SessionInteractor(sessionRepository, sessionModel, boolIsFlowTakenOver != null ? boolIsFlowTakenOver.booleanValue() : false, analyticsManager), sessionSavedStateHandleContainer));
            }
        }), key, BlikComponent.class);
        blikComponent.observe$blik_release(lifecycleOwner, new Function1<PaymentComponentEvent<BlikComponentState>, Unit>() { // from class: com.adyen.checkout.blik.internal.provider.BlikComponentProvider$get$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<BlikComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                blikComponent.getComponentEventHandler$blik_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<BlikComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return blikComponent;
    }

    @NotNull
    public BlikComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull BlikConfiguration configuration, @NotNull Application application, @NotNull SessionComponentCallback<BlikComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        storedPaymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, checkoutSession, storedPaymentMethod, BlikConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, key);
    }
}
