package com.adyen.checkout.cashapppay.internal.provider;

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
import com.adyen.checkout.cashapppay.CashAppPayComponent;
import com.adyen.checkout.cashapppay.CashAppPayComponentState;
import com.adyen.checkout.cashapppay.CashAppPayConfiguration;
import com.adyen.checkout.cashapppay.CashAppPayConfigurationKt;
import com.adyen.checkout.cashapppay.internal.ui.CashAppPayDelegate;
import com.adyen.checkout.cashapppay.internal.ui.DefaultCashAppPayDelegate;
import com.adyen.checkout.cashapppay.internal.ui.StoredCashAppPayDelegate;
import com.adyen.checkout.cashapppay.internal.ui.model.CashAppPayComponentParams;
import com.adyen.checkout.cashapppay.internal.ui.model.CashAppPayComponentParamsMapper;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.ComponentCallback;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.StoredPaymentMethod;
import com.adyen.checkout.components.core.internal.ComponentEventHandler;
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
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapper;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.components.core.internal.ui.model.SessionParams;
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
import yb.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00012 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00062 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00072 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\tB+\b\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jg\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%Jg\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010'Jg\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010*Jg\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010+J_\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010.J_\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010/J_\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u00100J_\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u00101J\u0017\u00103\u001a\u0002022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00103\u001a\u0002022\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b3\u00105J=\u0010<\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00107\u001a\u0002062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00109\u001a\u0002082\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040:H\u0002¢\u0006\u0004\b<\u0010=J5\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00040B2\u0006\u00107\u001a\u0002062\u0006\u0010-\u001a\u00020,2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020E2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010F\u001a\u00020E2\u0006\u0010\u0019\u001a\u00020(H\u0002¢\u0006\u0004\bF\u0010HR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010IR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010JR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010K¨\u0006L"}, d2 = {"Lcom/adyen/checkout/cashapppay/internal/provider/CashAppPayComponentProvider;", "Lcom/adyen/checkout/components/core/internal/provider/PaymentComponentProvider;", "Lcom/adyen/checkout/cashapppay/CashAppPayComponent;", "Lcom/adyen/checkout/cashapppay/CashAppPayConfiguration;", "Lcom/adyen/checkout/cashapppay/CashAppPayComponentState;", "Lcom/adyen/checkout/components/core/ComponentCallback;", "Lcom/adyen/checkout/components/core/internal/provider/StoredPaymentComponentProvider;", "Lcom/adyen/checkout/sessions/core/internal/provider/SessionPaymentComponentProvider;", "Lcom/adyen/checkout/sessions/core/SessionComponentCallback;", "Lcom/adyen/checkout/sessions/core/internal/provider/SessionStoredPaymentComponentProvider;", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "localeProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/core/internal/util/LocaleProvider;)V", "Lea/f;", "savedStateRegistryOwner", "Landroidx/lifecycle/s1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/adyen/checkout/components/core/PaymentMethod;", "paymentMethod", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "checkoutConfiguration", "Landroid/app/Application;", "application", "componentCallback", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/Order;", "order", "", "key", "get", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/cashapppay/CashAppPayComponent;", "configuration", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/cashapppay/CashAppPayConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/cashapppay/CashAppPayComponent;", "Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "storedPaymentMethod", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/cashapppay/CashAppPayComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/cashapppay/CashAppPayConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/cashapppay/CashAppPayComponent;", "Lcom/adyen/checkout/sessions/core/CheckoutSession;", "checkoutSession", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/cashapppay/CashAppPayComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/cashapppay/CashAppPayConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/cashapppay/CashAppPayComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/cashapppay/CashAppPayComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/cashapppay/CashAppPayConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/cashapppay/CashAppPayComponent;", "", "isPaymentMethodSupported", "(Lcom/adyen/checkout/components/core/PaymentMethod;)Z", "(Lcom/adyen/checkout/components/core/StoredPaymentMethod;)Z", "Landroidx/lifecycle/c1;", "savedStateHandle", "Lcom/adyen/checkout/cashapppay/internal/ui/CashAppPayDelegate;", "delegate", "Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "componentEventHandler", "createComponent", "(Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroidx/lifecycle/c1;Landroid/app/Application;Lcom/adyen/checkout/cashapppay/internal/ui/CashAppPayDelegate;Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;)Lcom/adyen/checkout/cashapppay/CashAppPayComponent;", "Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "httpClient", "Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayComponentParams;", "componentParams", "Lcom/adyen/checkout/sessions/core/internal/SessionComponentEventHandler;", "createSessionComponentEventHandler", "(Landroidx/lifecycle/c1;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/core/internal/data/api/HttpClient;Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayComponentParams;)Lcom/adyen/checkout/sessions/core/internal/SessionComponentEventHandler;", "", "assertSupported", "(Lcom/adyen/checkout/components/core/PaymentMethod;)V", "(Lcom/adyen/checkout/components/core/StoredPaymentMethod;)V", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "cashapppay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CashAppPayComponentProvider implements PaymentComponentProvider<CashAppPayComponent, CashAppPayConfiguration, CashAppPayComponentState, ComponentCallback<CashAppPayComponentState>>, StoredPaymentComponentProvider<CashAppPayComponent, CashAppPayConfiguration, CashAppPayComponentState, ComponentCallback<CashAppPayComponentState>>, SessionPaymentComponentProvider<CashAppPayComponent, CashAppPayConfiguration, CashAppPayComponentState, SessionComponentCallback<CashAppPayComponentState>>, SessionStoredPaymentComponentProvider<CashAppPayComponent, CashAppPayConfiguration, CashAppPayComponentState, SessionComponentCallback<CashAppPayComponentState>> {

    @Nullable
    private final AnalyticsManager analyticsManager;

    @Nullable
    private final DropInOverrideParams dropInOverrideParams;

    @NotNull
    private final LocaleProvider localeProvider;

    public /* synthetic */ CashAppPayComponentProvider(DropInOverrideParams dropInOverrideParams, AnalyticsManager analyticsManager, LocaleProvider localeProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : dropInOverrideParams, (i11 & 2) != 0 ? null : analyticsManager, (i11 & 4) != 0 ? new LocaleProvider() : localeProvider);
    }

    private final void assertSupported(PaymentMethod paymentMethod) {
        if (!isPaymentMethodSupported(paymentMethod)) {
            throw new ComponentException(f.k("Unsupported payment method ", paymentMethod.getType()), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CashAppPayComponent createComponent(CheckoutConfiguration checkoutConfiguration, c1 savedStateHandle, Application application, CashAppPayDelegate delegate, ComponentEventHandler<CashAppPayComponentState> componentEventHandler) {
        GenericActionDelegate delegate2 = new GenericActionComponentProvider(this.analyticsManager, this.dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, savedStateHandle, application);
        return new CashAppPayComponent(delegate, delegate2, new DefaultActionHandlingComponent(delegate2, delegate), componentEventHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final SessionComponentEventHandler<CashAppPayComponentState> createSessionComponentEventHandler(c1 savedStateHandle, CheckoutSession checkoutSession, HttpClient httpClient, CashAppPayComponentParams componentParams) {
        SessionSavedStateHandleContainer sessionSavedStateHandleContainer = new SessionSavedStateHandleContainer(savedStateHandle, checkoutSession);
        SessionRepository sessionRepository = new SessionRepository(new SessionService(httpClient, null, 2, 0 == true ? 1 : 0), componentParams.getClientKey());
        SessionModel sessionModel = sessionSavedStateHandleContainer.getSessionModel();
        Boolean boolIsFlowTakenOver = sessionSavedStateHandleContainer.isFlowTakenOver();
        return new SessionComponentEventHandler<>(new SessionInteractor(sessionRepository, sessionModel, boolIsFlowTakenOver != null ? boolIsFlowTakenOver.booleanValue() : false, this.analyticsManager), sessionSavedStateHandleContainer);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public CashAppPayComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final CheckoutSession checkoutSession, @NotNull final PaymentMethod paymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final SessionComponentCallback<CashAppPayComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        paymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(paymentMethod);
        final CashAppPayComponent cashAppPayComponent = (CashAppPayComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, CashAppPayComponent>() { // from class: com.adyen.checkout.cashapppay.internal.provider.CashAppPayComponentProvider$get$viewModelFactory$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CashAppPayComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                CashAppPayComponentParams cashAppPayComponentParamsMapToParams = new CashAppPayComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, SessionParamsFactory.INSTANCE.create(checkoutSession), paymentMethod, application);
                HttpClient httpClient = HttpClientFactory.INSTANCE.getHttpClient(cashAppPayComponentParamsMapToParams.getEnvironment());
                AnalyticsManager analyticsManagerProvide = this.analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = paymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(cashAppPayComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), checkoutSession.getSessionSetupResponse().getId());
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                return this.createComponent(checkoutConfiguration, c1Var, application, new DefaultCashAppPayDelegate(new SubmitHandler(c1Var), analyticsManager, new PaymentObserverRepository(null, 1, null), paymentMethod, checkoutSession.getOrder(), cashAppPayComponentParamsMapToParams, b.f45803a, null, new DefaultSdkDataProvider(analyticsManager), 128, null), this.createSessionComponentEventHandler(c1Var, checkoutSession, httpClient, cashAppPayComponentParamsMapToParams));
            }
        }), key, CashAppPayComponent.class);
        cashAppPayComponent.observe$cashapppay_release(lifecycleOwner, new Function1<PaymentComponentEvent<CashAppPayComponentState>, Unit>() { // from class: com.adyen.checkout.cashapppay.internal.provider.CashAppPayComponentProvider$get$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<CashAppPayComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                cashAppPayComponent.getComponentEventHandler$cashapppay_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<CashAppPayComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return cashAppPayComponent;
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public boolean isPaymentMethodSupported(@NotNull PaymentMethod paymentMethod) {
        paymentMethod.getClass();
        return CollectionsKt.I(CashAppPayComponent.PAYMENT_METHOD_TYPES, paymentMethod.getType());
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public boolean isPaymentMethodSupported(@NotNull StoredPaymentMethod storedPaymentMethod) {
        storedPaymentMethod.getClass();
        return CollectionsKt.I(CashAppPayComponent.PAYMENT_METHOD_TYPES, storedPaymentMethod.getType());
    }

    public CashAppPayComponentProvider(@Nullable DropInOverrideParams dropInOverrideParams, @Nullable AnalyticsManager analyticsManager, @NotNull LocaleProvider localeProvider) {
        localeProvider.getClass();
        this.dropInOverrideParams = dropInOverrideParams;
        this.analyticsManager = analyticsManager;
        this.localeProvider = localeProvider;
    }

    private final void assertSupported(StoredPaymentMethod paymentMethod) {
        if (!isPaymentMethodSupported(paymentMethod)) {
            throw new ComponentException(f.k("Unsupported payment method ", paymentMethod.getType()), null, 2, null);
        }
    }

    public CashAppPayComponentProvider() {
        this(null, null, null, 7, null);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public CashAppPayComponent get(@NotNull ComponentActivity componentActivity, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<CashAppPayComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (CashAppPayComponent) PaymentComponentProvider.DefaultImpls.get((PaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<CashAppPayComponentState>>) this, componentActivity, paymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public CashAppPayComponent get(@NotNull ComponentActivity componentActivity, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CashAppPayConfiguration cashAppPayConfiguration, @NotNull ComponentCallback<CashAppPayComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (CashAppPayComponent) StoredPaymentComponentProvider.DefaultImpls.get(this, componentActivity, storedPaymentMethod, cashAppPayConfiguration, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    @NotNull
    public CashAppPayComponent get(@NotNull ComponentActivity componentActivity, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<CashAppPayComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (CashAppPayComponent) StoredPaymentComponentProvider.DefaultImpls.get((StoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<CashAppPayComponentState>>) this, componentActivity, storedPaymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public CashAppPayComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CashAppPayConfiguration cashAppPayConfiguration, @NotNull SessionComponentCallback<CashAppPayComponentState> sessionComponentCallback, @Nullable String str) {
        return (CashAppPayComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, paymentMethod, cashAppPayConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public CashAppPayComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<CashAppPayComponentState> sessionComponentCallback, @Nullable String str) {
        return (CashAppPayComponent) SessionPaymentComponentProvider.DefaultImpls.get((SessionPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<CashAppPayComponentState>>) this, componentActivity, checkoutSession, paymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public CashAppPayComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull SessionComponentCallback<CashAppPayComponentState> sessionComponentCallback, @Nullable String str) {
        return (CashAppPayComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, paymentMethod, sessionComponentCallback, str);
    }

    @NotNull
    public CashAppPayComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CashAppPayConfiguration cashAppPayConfiguration, @NotNull SessionComponentCallback<CashAppPayComponentState> sessionComponentCallback, @Nullable String str) {
        return (CashAppPayComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, storedPaymentMethod, cashAppPayConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    @NotNull
    public CashAppPayComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<CashAppPayComponentState> sessionComponentCallback, @Nullable String str) {
        return (CashAppPayComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get((SessionStoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<CashAppPayComponentState>>) this, componentActivity, checkoutSession, storedPaymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    @NotNull
    public CashAppPayComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull SessionComponentCallback<CashAppPayComponentState> sessionComponentCallback, @Nullable String str) {
        return (CashAppPayComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, storedPaymentMethod, sessionComponentCallback, str);
    }

    @NotNull
    public CashAppPayComponent get(@NotNull Fragment fragment, @NotNull PaymentMethod paymentMethod, @NotNull CashAppPayConfiguration cashAppPayConfiguration, @NotNull ComponentCallback<CashAppPayComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (CashAppPayComponent) PaymentComponentProvider.DefaultImpls.get(this, fragment, paymentMethod, cashAppPayConfiguration, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public CashAppPayComponent get(@NotNull Fragment fragment, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<CashAppPayComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (CashAppPayComponent) PaymentComponentProvider.DefaultImpls.get((PaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<CashAppPayComponentState>>) this, fragment, paymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public CashAppPayComponent get(@NotNull Fragment fragment, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CashAppPayConfiguration cashAppPayConfiguration, @NotNull ComponentCallback<CashAppPayComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (CashAppPayComponent) StoredPaymentComponentProvider.DefaultImpls.get(this, fragment, storedPaymentMethod, cashAppPayConfiguration, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    @NotNull
    public CashAppPayComponent get(@NotNull Fragment fragment, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<CashAppPayComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (CashAppPayComponent) StoredPaymentComponentProvider.DefaultImpls.get((StoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<CashAppPayComponentState>>) this, fragment, storedPaymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public CashAppPayComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CashAppPayConfiguration cashAppPayConfiguration, @NotNull SessionComponentCallback<CashAppPayComponentState> sessionComponentCallback, @Nullable String str) {
        return (CashAppPayComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, paymentMethod, cashAppPayConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public CashAppPayComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<CashAppPayComponentState> sessionComponentCallback, @Nullable String str) {
        return (CashAppPayComponent) SessionPaymentComponentProvider.DefaultImpls.get((SessionPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<CashAppPayComponentState>>) this, fragment, checkoutSession, paymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public CashAppPayComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull SessionComponentCallback<CashAppPayComponentState> sessionComponentCallback, @Nullable String str) {
        return (CashAppPayComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, paymentMethod, sessionComponentCallback, str);
    }

    @NotNull
    public CashAppPayComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CashAppPayConfiguration cashAppPayConfiguration, @NotNull SessionComponentCallback<CashAppPayComponentState> sessionComponentCallback, @Nullable String str) {
        return (CashAppPayComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, storedPaymentMethod, cashAppPayConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    @NotNull
    public CashAppPayComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<CashAppPayComponentState> sessionComponentCallback, @Nullable String str) {
        return (CashAppPayComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get((SessionStoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<CashAppPayComponentState>>) this, fragment, checkoutSession, storedPaymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    @NotNull
    public CashAppPayComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull SessionComponentCallback<CashAppPayComponentState> sessionComponentCallback, @Nullable String str) {
        return (CashAppPayComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, storedPaymentMethod, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, paymentMethod, checkoutConfiguration, (ComponentCallback<CashAppPayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, PaymentMethod paymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, paymentMethod, (CashAppPayConfiguration) configuration, (ComponentCallback<CashAppPayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, storedPaymentMethod, checkoutConfiguration, (ComponentCallback<CashAppPayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, StoredPaymentMethod storedPaymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, storedPaymentMethod, (CashAppPayConfiguration) configuration, (ComponentCallback<CashAppPayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, checkoutConfiguration, (SessionComponentCallback<CashAppPayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, (CashAppPayConfiguration) configuration, (SessionComponentCallback<CashAppPayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, (SessionComponentCallback<CashAppPayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, storedPaymentMethod, checkoutConfiguration, (SessionComponentCallback<CashAppPayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, storedPaymentMethod, (CashAppPayConfiguration) configuration, (SessionComponentCallback<CashAppPayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, storedPaymentMethod, (SessionComponentCallback<CashAppPayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, paymentMethod, checkoutConfiguration, (ComponentCallback<CashAppPayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, PaymentMethod paymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, paymentMethod, (CashAppPayConfiguration) configuration, (ComponentCallback<CashAppPayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, storedPaymentMethod, checkoutConfiguration, (ComponentCallback<CashAppPayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, StoredPaymentMethod storedPaymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, storedPaymentMethod, (CashAppPayConfiguration) configuration, (ComponentCallback<CashAppPayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, checkoutConfiguration, (SessionComponentCallback<CashAppPayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, (CashAppPayConfiguration) configuration, (SessionComponentCallback<CashAppPayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, (SessionComponentCallback<CashAppPayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, storedPaymentMethod, checkoutConfiguration, (SessionComponentCallback<CashAppPayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, storedPaymentMethod, (CashAppPayConfiguration) configuration, (SessionComponentCallback<CashAppPayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, storedPaymentMethod, (SessionComponentCallback<CashAppPayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, paymentMethod, checkoutConfiguration, application, (ComponentCallback<CashAppPayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, PaymentMethod paymentMethod, Configuration configuration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, paymentMethod, (CashAppPayConfiguration) configuration, application, (ComponentCallback<CashAppPayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, storedPaymentMethod, checkoutConfiguration, application, (ComponentCallback<CashAppPayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, StoredPaymentMethod storedPaymentMethod, Configuration configuration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, storedPaymentMethod, (CashAppPayConfiguration) configuration, application, (ComponentCallback<CashAppPayComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, paymentMethod, checkoutConfiguration, application, (SessionComponentCallback<CashAppPayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, paymentMethod, (CashAppPayConfiguration) configuration, application, (SessionComponentCallback<CashAppPayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, storedPaymentMethod, checkoutConfiguration, application, (SessionComponentCallback<CashAppPayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, Configuration configuration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, storedPaymentMethod, (CashAppPayConfiguration) configuration, application, (SessionComponentCallback<CashAppPayComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public CashAppPayComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final PaymentMethod paymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final ComponentCallback<CashAppPayComponentState> componentCallback, @Nullable final OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        paymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(paymentMethod);
        final CashAppPayComponent cashAppPayComponent = (CashAppPayComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, CashAppPayComponent>() { // from class: com.adyen.checkout.cashapppay.internal.provider.CashAppPayComponentProvider$get$viewModelFactory$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CashAppPayComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                CashAppPayComponentParams cashAppPayComponentParamsMapToParams = new CashAppPayComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, (SessionParams) null, paymentMethod, application);
                AnalyticsManager analyticsManagerProvide = this.analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = paymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(cashAppPayComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), null);
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                return this.createComponent(checkoutConfiguration, c1Var, application, new DefaultCashAppPayDelegate(new SubmitHandler(c1Var), analyticsManager, new PaymentObserverRepository(null, 1, null), paymentMethod, order, cashAppPayComponentParamsMapToParams, b.f45803a, null, new DefaultSdkDataProvider(analyticsManager), 128, null), new DefaultComponentEventHandler());
            }
        }), key, CashAppPayComponent.class);
        cashAppPayComponent.observe$cashapppay_release(lifecycleOwner, new Function1<PaymentComponentEvent<CashAppPayComponentState>, Unit>() { // from class: com.adyen.checkout.cashapppay.internal.provider.CashAppPayComponentProvider$get$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<CashAppPayComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                cashAppPayComponent.getComponentEventHandler$cashapppay_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<CashAppPayComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return cashAppPayComponent;
    }

    @NotNull
    public CashAppPayComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull PaymentMethod paymentMethod, @NotNull CashAppPayConfiguration configuration, @NotNull Application application, @NotNull ComponentCallback<CashAppPayComponentState> componentCallback, @Nullable OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        paymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, paymentMethod, CashAppPayConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, order, key);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    @NotNull
    public CashAppPayComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final StoredPaymentMethod storedPaymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final ComponentCallback<CashAppPayComponentState> componentCallback, @Nullable final OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        storedPaymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(storedPaymentMethod);
        final CashAppPayComponent cashAppPayComponent = (CashAppPayComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, CashAppPayComponent>() { // from class: com.adyen.checkout.cashapppay.internal.provider.CashAppPayComponentProvider$get$viewModelFactory$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CashAppPayComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                CashAppPayComponentParams cashAppPayComponentParamsMapToParams = new CashAppPayComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, (SessionParams) null, storedPaymentMethod, application);
                AnalyticsManager analyticsManagerProvide = this.analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = storedPaymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(cashAppPayComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), null);
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                return this.createComponent(checkoutConfiguration, c1Var, application, new StoredCashAppPayDelegate(analyticsManager, new PaymentObserverRepository(null, 1, null), storedPaymentMethod, order, cashAppPayComponentParamsMapToParams, new DefaultSdkDataProvider(analyticsManager)), new DefaultComponentEventHandler());
            }
        }), key, CashAppPayComponent.class);
        cashAppPayComponent.observe$cashapppay_release(lifecycleOwner, new Function1<PaymentComponentEvent<CashAppPayComponentState>, Unit>() { // from class: com.adyen.checkout.cashapppay.internal.provider.CashAppPayComponentProvider$get$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<CashAppPayComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                cashAppPayComponent.getComponentEventHandler$cashapppay_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<CashAppPayComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return cashAppPayComponent;
    }

    @NotNull
    public CashAppPayComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CashAppPayConfiguration configuration, @NotNull Application application, @NotNull ComponentCallback<CashAppPayComponentState> componentCallback, @Nullable OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        storedPaymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, storedPaymentMethod, CashAppPayConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, order, key);
    }

    @NotNull
    public CashAppPayComponent get(@NotNull ComponentActivity componentActivity, @NotNull PaymentMethod paymentMethod, @NotNull CashAppPayConfiguration cashAppPayConfiguration, @NotNull ComponentCallback<CashAppPayComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (CashAppPayComponent) PaymentComponentProvider.DefaultImpls.get(this, componentActivity, paymentMethod, cashAppPayConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public CashAppPayComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CashAppPayConfiguration configuration, @NotNull Application application, @NotNull SessionComponentCallback<CashAppPayComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        paymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, checkoutSession, paymentMethod, CashAppPayConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, key);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    @NotNull
    public CashAppPayComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final CheckoutSession checkoutSession, @NotNull final StoredPaymentMethod storedPaymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final SessionComponentCallback<CashAppPayComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        storedPaymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(storedPaymentMethod);
        final CashAppPayComponent cashAppPayComponent = (CashAppPayComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, CashAppPayComponent>() { // from class: com.adyen.checkout.cashapppay.internal.provider.CashAppPayComponentProvider$get$viewModelFactory$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CashAppPayComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                CashAppPayComponentParams cashAppPayComponentParamsMapToParams = new CashAppPayComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, SessionParamsFactory.INSTANCE.create(checkoutSession), storedPaymentMethod, application);
                HttpClient httpClient = HttpClientFactory.INSTANCE.getHttpClient(cashAppPayComponentParamsMapToParams.getEnvironment());
                AnalyticsManager analyticsManagerProvide = this.analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = storedPaymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(cashAppPayComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), checkoutSession.getSessionSetupResponse().getId());
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                return this.createComponent(checkoutConfiguration, c1Var, application, new StoredCashAppPayDelegate(analyticsManager, new PaymentObserverRepository(null, 1, null), storedPaymentMethod, checkoutSession.getOrder(), cashAppPayComponentParamsMapToParams, new DefaultSdkDataProvider(analyticsManager)), this.createSessionComponentEventHandler(c1Var, checkoutSession, httpClient, cashAppPayComponentParamsMapToParams));
            }
        }), key, CashAppPayComponent.class);
        cashAppPayComponent.observe$cashapppay_release(lifecycleOwner, new Function1<PaymentComponentEvent<CashAppPayComponentState>, Unit>() { // from class: com.adyen.checkout.cashapppay.internal.provider.CashAppPayComponentProvider$get$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<CashAppPayComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                cashAppPayComponent.getComponentEventHandler$cashapppay_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<CashAppPayComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return cashAppPayComponent;
    }

    @NotNull
    public CashAppPayComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CashAppPayConfiguration configuration, @NotNull Application application, @NotNull SessionComponentCallback<CashAppPayComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        storedPaymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, checkoutSession, storedPaymentMethod, CashAppPayConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, key);
    }
}
