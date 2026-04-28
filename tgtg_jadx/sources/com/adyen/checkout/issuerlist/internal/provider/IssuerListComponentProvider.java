package com.adyen.checkout.issuerlist.internal.provider;

import android.app.Application;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c1;
import androidx.lifecycle.r1;
import androidx.lifecycle.s1;
import com.adyen.checkout.action.core.internal.DefaultActionHandlingComponent;
import com.adyen.checkout.action.core.internal.provider.GenericActionComponentProvider;
import com.adyen.checkout.action.core.internal.ui.GenericActionDelegate;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.ComponentCallback;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.internal.ComponentEventHandler;
import com.adyen.checkout.components.core.internal.DefaultComponentEventHandler;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.PaymentObserverRepository;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManagerFactory;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsSource;
import com.adyen.checkout.components.core.internal.provider.DefaultSdkDataProvider;
import com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider;
import com.adyen.checkout.components.core.internal.provider.SdkDataProvider;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapper;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.components.core.internal.util.ViewModelExtKt;
import com.adyen.checkout.components.core.paymentmethod.IssuerListPaymentMethod;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.core.internal.data.api.HttpClient;
import com.adyen.checkout.core.internal.data.api.HttpClientFactory;
import com.adyen.checkout.core.internal.util.LocaleProvider;
import com.adyen.checkout.issuerlist.internal.IssuerListComponent;
import com.adyen.checkout.issuerlist.internal.IssuerListConfiguration;
import com.adyen.checkout.issuerlist.internal.ui.DefaultIssuerListDelegate;
import com.adyen.checkout.issuerlist.internal.ui.IssuerListDelegate;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerListComponentParams;
import com.adyen.checkout.issuerlist.internal.ui.model.IssuerListComponentParamsMapper;
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
import e0.f;
import i80.n;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u0005*\u000e\b\u0003\u0010\b*\b\u0012\u0004\u0012\u00028\u00020\u00072 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\t2 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\f0\u000bBA\b\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018Je\u0010+\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00030\n2\u000e\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,Je\u0010+\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010-\u001a\u00028\u00012\u0006\u0010$\u001a\u00020#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00030\n2\u000e\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010.J]\u0010+\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00100\u001a\u00020/2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00030\f2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u00101J]\u0010+\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00100\u001a\u00020/2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010-\u001a\u00028\u00012\u0006\u0010$\u001a\u00020#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00030\f2\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u00102J-\u00107\u001a\u00028\u00032\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u0002032\u0006\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u0013H$¢\u0006\u0004\b7\u00108JA\u0010A\u001a\u00028\u00002\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003092\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00030?H$¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00028\u0002H$¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\b\u0012\u0004\u0012\u00020)0EH$¢\u0006\u0004\bF\u0010GJ\u0019\u0010H\u001a\u0004\u0018\u00018\u00012\u0006\u0010\"\u001a\u00020!H$¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020!2\u0006\u0010-\u001a\u00028\u0001H$¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\bL\u0010MJS\u0010U\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030T2\u0006\u0010O\u001a\u00020N2\u0006\u0010 \u001a\u00020\u001f2\u000e\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'2\u0006\u0010Q\u001a\u00020P2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020W2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bX\u0010YR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010ZR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010[R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\\R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010]R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010^¨\u0006_"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/provider/IssuerListComponentProvider;", "Lcom/adyen/checkout/issuerlist/internal/IssuerListComponent;", "ComponentT", "Lcom/adyen/checkout/issuerlist/internal/IssuerListConfiguration;", "ConfigurationT", "Lcom/adyen/checkout/components/core/paymentmethod/IssuerListPaymentMethod;", "PaymentMethodT", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "ComponentStateT", "Lcom/adyen/checkout/components/core/internal/provider/PaymentComponentProvider;", "Lcom/adyen/checkout/components/core/ComponentCallback;", "Lcom/adyen/checkout/sessions/core/internal/provider/SessionPaymentComponentProvider;", "Lcom/adyen/checkout/sessions/core/SessionComponentCallback;", "Ljava/lang/Class;", "componentClass", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "", "hideIssuerLogosDefaultValue", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "localeProvider", "<init>", "(Ljava/lang/Class;Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;ZLcom/adyen/checkout/core/internal/util/LocaleProvider;)V", "Lea/f;", "savedStateRegistryOwner", "Landroidx/lifecycle/s1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/adyen/checkout/components/core/PaymentMethod;", "paymentMethod", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "checkoutConfiguration", "Landroid/app/Application;", "application", "componentCallback", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/Order;", "order", "", "key", "get", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/issuerlist/internal/IssuerListComponent;", "configuration", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/issuerlist/internal/IssuerListConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/issuerlist/internal/IssuerListComponent;", "Lcom/adyen/checkout/sessions/core/CheckoutSession;", "checkoutSession", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/issuerlist/internal/IssuerListComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/issuerlist/internal/IssuerListConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/issuerlist/internal/IssuerListComponent;", "Lcom/adyen/checkout/components/core/PaymentComponentData;", Bayeux.KEY_DATA, "isInputValid", "isReady", "createComponentState", "(Lcom/adyen/checkout/components/core/PaymentComponentData;ZZ)Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListDelegate;", "delegate", "Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "genericActionDelegate", "Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;", "actionHandlingComponent", "Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "componentEventHandler", "createComponent", "(Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListDelegate;Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;)Lcom/adyen/checkout/issuerlist/internal/IssuerListComponent;", "createPaymentMethod", "()Lcom/adyen/checkout/components/core/paymentmethod/IssuerListPaymentMethod;", "", "getSupportedPaymentMethods", "()Ljava/util/List;", "getConfiguration", "(Lcom/adyen/checkout/components/core/CheckoutConfiguration;)Lcom/adyen/checkout/issuerlist/internal/IssuerListConfiguration;", "getCheckoutConfiguration", "(Lcom/adyen/checkout/issuerlist/internal/IssuerListConfiguration;)Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "isPaymentMethodSupported", "(Lcom/adyen/checkout/components/core/PaymentMethod;)Z", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListComponentParams;", "componentParams", "Landroidx/lifecycle/c1;", "savedStateHandle", "Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;", "sdkDataProvider", "Lcom/adyen/checkout/issuerlist/internal/ui/DefaultIssuerListDelegate;", "createDefaultDelegate", "(Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListComponentParams;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/OrderRequest;Landroidx/lifecycle/c1;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/components/core/internal/provider/SdkDataProvider;)Lcom/adyen/checkout/issuerlist/internal/ui/DefaultIssuerListDelegate;", "", "assertSupported", "(Lcom/adyen/checkout/components/core/PaymentMethod;)V", "Ljava/lang/Class;", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Z", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class IssuerListComponentProvider<ComponentT extends IssuerListComponent<PaymentMethodT, ComponentStateT>, ConfigurationT extends IssuerListConfiguration, PaymentMethodT extends IssuerListPaymentMethod, ComponentStateT extends PaymentComponentState<PaymentMethodT>> implements PaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<ComponentStateT>>, SessionPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<ComponentStateT>> {

    @Nullable
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final Class<ComponentT> componentClass;

    @Nullable
    private final DropInOverrideParams dropInOverrideParams;
    private final boolean hideIssuerLogosDefaultValue;

    @NotNull
    private final LocaleProvider localeProvider;

    /* JADX INFO: renamed from: com.adyen.checkout.issuerlist.internal.provider.IssuerListComponentProvider$createDefaultDelegate$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<PaymentMethodT> {
        public AnonymousClass1(Object obj) {
            super(0, obj, IssuerListComponentProvider.class, "createPaymentMethod", "createPaymentMethod()Lcom/adyen/checkout/components/core/paymentmethod/IssuerListPaymentMethod;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final PaymentMethodT invoke() {
            return (PaymentMethodT) ((IssuerListComponentProvider) this.receiver).createPaymentMethod();
        }
    }

    public /* synthetic */ IssuerListComponentProvider(Class cls, DropInOverrideParams dropInOverrideParams, AnalyticsManager analyticsManager, boolean z11, LocaleProvider localeProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, dropInOverrideParams, (i11 & 4) != 0 ? null : analyticsManager, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? new LocaleProvider() : localeProvider);
    }

    private final void assertSupported(PaymentMethod paymentMethod) {
        if (!isPaymentMethodSupported(paymentMethod)) {
            throw new ComponentException(f.k("Unsupported payment method ", paymentMethod.getType()), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DefaultIssuerListDelegate<PaymentMethodT, ComponentStateT> createDefaultDelegate(IssuerListComponentParams componentParams, PaymentMethod paymentMethod, OrderRequest order, c1 savedStateHandle, AnalyticsManager analyticsManager, SdkDataProvider sdkDataProvider) {
        return new DefaultIssuerListDelegate<>(new PaymentObserverRepository(null, 1, null), componentParams, paymentMethod, order, analyticsManager, new SubmitHandler(savedStateHandle), new AnonymousClass1(this), new AnonymousClass2(this), sdkDataProvider);
    }

    @NotNull
    public abstract ComponentT createComponent(@NotNull IssuerListDelegate<PaymentMethodT, ComponentStateT> delegate, @NotNull GenericActionDelegate genericActionDelegate, @NotNull DefaultActionHandlingComponent actionHandlingComponent, @NotNull ComponentEventHandler<ComponentStateT> componentEventHandler);

    @NotNull
    public abstract ComponentStateT createComponentState(@NotNull PaymentComponentData<PaymentMethodT> data, boolean isInputValid, boolean isReady);

    @NotNull
    public abstract PaymentMethodT createPaymentMethod();

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public final ComponentT get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final CheckoutSession checkoutSession, @NotNull final PaymentMethod paymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final SessionComponentCallback<ComponentStateT> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        paymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(paymentMethod);
        final ComponentT componentt = (ComponentT) ViewModelExtKt.get(new r1(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, ComponentT>(this) { // from class: com.adyen.checkout.issuerlist.internal.provider.IssuerListComponentProvider$get$genericFactory$2
            final /* synthetic */ IssuerListComponentProvider<ComponentT, ConfigurationT, PaymentMethodT, ComponentStateT> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/lifecycle/c1;)TComponentT; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final IssuerListComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                IssuerListComponentParams issuerListComponentParamsMapToParams = new IssuerListComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, ((IssuerListComponentProvider) this.this$0).localeProvider.getLocale(application), ((IssuerListComponentProvider) this.this$0).dropInOverrideParams, SessionParamsFactory.INSTANCE.create(checkoutSession), this.this$0.getConfiguration(checkoutConfiguration), ((IssuerListComponentProvider) this.this$0).hideIssuerLogosDefaultValue);
                HttpClient httpClient = HttpClientFactory.INSTANCE.getHttpClient(issuerListComponentParamsMapToParams.getEnvironment());
                AnalyticsManager analyticsManagerProvide = ((IssuerListComponentProvider) this.this$0).analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = paymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(issuerListComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), checkoutSession.getSessionSetupResponse().getId());
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                DefaultIssuerListDelegate defaultIssuerListDelegateCreateDefaultDelegate = this.this$0.createDefaultDelegate(issuerListComponentParamsMapToParams, paymentMethod, checkoutSession.getOrder(), c1Var, analyticsManager, new DefaultSdkDataProvider(analyticsManager));
                GenericActionDelegate delegate = new GenericActionComponentProvider(analyticsManager, ((IssuerListComponentProvider) this.this$0).dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, c1Var, application);
                SessionSavedStateHandleContainer sessionSavedStateHandleContainer = new SessionSavedStateHandleContainer(c1Var, checkoutSession);
                SessionRepository sessionRepository = new SessionRepository(new SessionService(httpClient, null, 2, null), issuerListComponentParamsMapToParams.getClientKey());
                SessionModel sessionModel = sessionSavedStateHandleContainer.getSessionModel();
                Boolean boolIsFlowTakenOver = sessionSavedStateHandleContainer.isFlowTakenOver();
                return this.this$0.createComponent(defaultIssuerListDelegateCreateDefaultDelegate, delegate, new DefaultActionHandlingComponent(delegate, defaultIssuerListDelegateCreateDefaultDelegate), new SessionComponentEventHandler(new SessionInteractor(sessionRepository, sessionModel, boolIsFlowTakenOver != null ? boolIsFlowTakenOver.booleanValue() : false, analyticsManager), sessionSavedStateHandleContainer));
            }
        })), key, this.componentClass);
        componentt.observe$issuer_list_release(lifecycleOwner, new Function1<PaymentComponentEvent<ComponentStateT>, Unit>() { // from class: com.adyen.checkout.issuerlist.internal.provider.IssuerListComponentProvider$get$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TComponentT;Lcom/adyen/checkout/sessions/core/SessionComponentCallback<TComponentStateT;>;)V */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<ComponentStateT> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                componentt.getComponentEventHandler$issuer_list_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent) obj);
                return Unit.f26487a;
            }
        });
        return componentt;
    }

    @NotNull
    public abstract CheckoutConfiguration getCheckoutConfiguration(@NotNull ConfigurationT configuration);

    @Nullable
    public abstract ConfigurationT getConfiguration(@NotNull CheckoutConfiguration checkoutConfiguration);

    @NotNull
    public abstract List<String> getSupportedPaymentMethods();

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public final boolean isPaymentMethodSupported(@NotNull PaymentMethod paymentMethod) {
        paymentMethod.getClass();
        return CollectionsKt.I(getSupportedPaymentMethods(), paymentMethod.getType());
    }

    /* JADX INFO: renamed from: com.adyen.checkout.issuerlist.internal.provider.IssuerListComponentProvider$createDefaultDelegate$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements n {
        public AnonymousClass2(Object obj) {
            super(3, obj, IssuerListComponentProvider.class, "createComponentState", "createComponentState(Lcom/adyen/checkout/components/core/PaymentComponentData;ZZ)Lcom/adyen/checkout/components/core/PaymentComponentState;", 0);
        }

        @Override // i80.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((PaymentComponentData) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
        }

        @NotNull
        public final ComponentStateT invoke(@NotNull PaymentComponentData<PaymentMethodT> paymentComponentData, boolean z11, boolean z12) {
            paymentComponentData.getClass();
            return (ComponentStateT) ((IssuerListComponentProvider) this.receiver).createComponentState(paymentComponentData, z11, z12);
        }
    }

    public IssuerListComponentProvider(@NotNull Class<ComponentT> cls, @Nullable DropInOverrideParams dropInOverrideParams, @Nullable AnalyticsManager analyticsManager, boolean z11, @NotNull LocaleProvider localeProvider) {
        cls.getClass();
        localeProvider.getClass();
        this.componentClass = cls;
        this.dropInOverrideParams = dropInOverrideParams;
        this.analyticsManager = analyticsManager;
        this.hideIssuerLogosDefaultValue = z11;
        this.localeProvider = localeProvider;
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public ComponentT get(@NotNull ComponentActivity componentActivity, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<ComponentStateT> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (ComponentT) PaymentComponentProvider.DefaultImpls.get((PaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<ComponentStateT>>) this, componentActivity, paymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public ComponentT get(@NotNull ComponentActivity componentActivity, @NotNull PaymentMethod paymentMethod, @NotNull ConfigurationT configurationt, @NotNull ComponentCallback<ComponentStateT> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (ComponentT) PaymentComponentProvider.DefaultImpls.get(this, componentActivity, paymentMethod, configurationt, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public ComponentT get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<ComponentStateT> sessionComponentCallback, @Nullable String str) {
        return (ComponentT) SessionPaymentComponentProvider.DefaultImpls.get((SessionPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<ComponentStateT>>) this, componentActivity, checkoutSession, paymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public ComponentT get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull ConfigurationT configurationt, @NotNull SessionComponentCallback<ComponentStateT> sessionComponentCallback, @Nullable String str) {
        return (ComponentT) SessionPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, paymentMethod, configurationt, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public ComponentT get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull SessionComponentCallback<ComponentStateT> sessionComponentCallback, @Nullable String str) {
        return (ComponentT) SessionPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, paymentMethod, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public ComponentT get(@NotNull Fragment fragment, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<ComponentStateT> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (ComponentT) PaymentComponentProvider.DefaultImpls.get((PaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<ComponentStateT>>) this, fragment, paymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public ComponentT get(@NotNull Fragment fragment, @NotNull PaymentMethod paymentMethod, @NotNull ConfigurationT configurationt, @NotNull ComponentCallback<ComponentStateT> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (ComponentT) PaymentComponentProvider.DefaultImpls.get(this, fragment, paymentMethod, configurationt, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public ComponentT get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<ComponentStateT> sessionComponentCallback, @Nullable String str) {
        return (ComponentT) SessionPaymentComponentProvider.DefaultImpls.get((SessionPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<ComponentStateT>>) this, fragment, checkoutSession, paymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public ComponentT get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull ConfigurationT configurationt, @NotNull SessionComponentCallback<ComponentStateT> sessionComponentCallback, @Nullable String str) {
        return (ComponentT) SessionPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, paymentMethod, configurationt, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public ComponentT get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull SessionComponentCallback<ComponentStateT> sessionComponentCallback, @Nullable String str) {
        return (ComponentT) SessionPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, paymentMethod, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public final ComponentT get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final PaymentMethod paymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final ComponentCallback<ComponentStateT> componentCallback, @Nullable final OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        paymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(paymentMethod);
        final ComponentT componentt = (ComponentT) ViewModelExtKt.get(new r1(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, ComponentT>(this) { // from class: com.adyen.checkout.issuerlist.internal.provider.IssuerListComponentProvider$get$genericFactory$1
            final /* synthetic */ IssuerListComponentProvider<ComponentT, ConfigurationT, PaymentMethodT, ComponentStateT> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/lifecycle/c1;)TComponentT; */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final IssuerListComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                IssuerListComponentParamsMapper issuerListComponentParamsMapper = new IssuerListComponentParamsMapper(new CommonComponentParamsMapper());
                Locale locale = ((IssuerListComponentProvider) this.this$0).localeProvider.getLocale(application);
                DropInOverrideParams dropInOverrideParams = ((IssuerListComponentProvider) this.this$0).dropInOverrideParams;
                boolean z11 = ((IssuerListComponentProvider) this.this$0).hideIssuerLogosDefaultValue;
                IssuerListComponentParams issuerListComponentParamsMapToParams = issuerListComponentParamsMapper.mapToParams(checkoutConfiguration, locale, dropInOverrideParams, null, this.this$0.getConfiguration(checkoutConfiguration), z11);
                AnalyticsManager analyticsManagerProvide = ((IssuerListComponentProvider) this.this$0).analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = paymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(issuerListComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), null);
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                DefaultIssuerListDelegate defaultIssuerListDelegateCreateDefaultDelegate = this.this$0.createDefaultDelegate(issuerListComponentParamsMapToParams, paymentMethod, order, c1Var, analyticsManager, new DefaultSdkDataProvider(analyticsManager));
                GenericActionDelegate delegate = new GenericActionComponentProvider(analyticsManager, ((IssuerListComponentProvider) this.this$0).dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, c1Var, application);
                return this.this$0.createComponent(defaultIssuerListDelegateCreateDefaultDelegate, delegate, new DefaultActionHandlingComponent(delegate, defaultIssuerListDelegateCreateDefaultDelegate), new DefaultComponentEventHandler());
            }
        })), key, this.componentClass);
        componentt.observe$issuer_list_release(lifecycleOwner, new Function1<PaymentComponentEvent<ComponentStateT>, Unit>() { // from class: com.adyen.checkout.issuerlist.internal.provider.IssuerListComponentProvider$get$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (TComponentT;Lcom/adyen/checkout/components/core/ComponentCallback<TComponentStateT;>;)V */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<ComponentStateT> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                componentt.getComponentEventHandler$issuer_list_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent) obj);
                return Unit.f26487a;
            }
        });
        return componentt;
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public final ComponentT get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull PaymentMethod paymentMethod, @NotNull ConfigurationT configuration, @NotNull Application application, @NotNull ComponentCallback<ComponentStateT> componentCallback, @Nullable OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        paymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return (ComponentT) get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, paymentMethod, getCheckoutConfiguration(configuration), application, (ComponentCallback) componentCallback, order, key);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public final ComponentT get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull ConfigurationT configuration, @NotNull Application application, @NotNull SessionComponentCallback<ComponentStateT> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        paymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return (ComponentT) get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, checkoutSession, paymentMethod, getCheckoutConfiguration(configuration), application, (SessionComponentCallback) componentCallback, key);
    }
}
