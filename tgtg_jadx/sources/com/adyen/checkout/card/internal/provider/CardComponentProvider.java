package com.adyen.checkout.card.internal.provider;

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
import com.adyen.checkout.card.CardComponent;
import com.adyen.checkout.card.CardComponentState;
import com.adyen.checkout.card.CardConfiguration;
import com.adyen.checkout.card.CardConfigurationKt;
import com.adyen.checkout.card.internal.data.api.BinLookupService;
import com.adyen.checkout.card.internal.data.api.DefaultDetectCardTypeRepository;
import com.adyen.checkout.card.internal.ui.CardConfigDataGenerator;
import com.adyen.checkout.card.internal.ui.CardValidationMapper;
import com.adyen.checkout.card.internal.ui.DefaultCardDelegate;
import com.adyen.checkout.card.internal.ui.StoredCardDelegate;
import com.adyen.checkout.card.internal.ui.model.CardComponentParams;
import com.adyen.checkout.card.internal.ui.model.CardComponentParamsMapper;
import com.adyen.checkout.card.internal.ui.model.InstallmentsParamsMapper;
import com.adyen.checkout.card.internal.util.DualBrandedCardHandler;
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
import com.adyen.checkout.components.core.internal.data.api.DefaultPublicKeyRepository;
import com.adyen.checkout.components.core.internal.data.api.PublicKeyService;
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
import com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider;
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
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00012 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00062 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00072 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\tB+\b\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jg\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%Jg\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010'J_\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010*J_\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010+Jg\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010.Jg\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010-\u001a\u00020,2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010/J_\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u00100J_\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(2\u0006\u0010-\u001a\u00020,2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u00101J\u0017\u00103\u001a\u0002022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00103\u001a\u0002022\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b3\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b7\u00108J\u0017\u00107\u001a\u0002062\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b7\u00109R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<¨\u0006="}, d2 = {"Lcom/adyen/checkout/card/internal/provider/CardComponentProvider;", "Lcom/adyen/checkout/components/core/internal/provider/PaymentComponentProvider;", "Lcom/adyen/checkout/card/CardComponent;", "Lcom/adyen/checkout/card/CardConfiguration;", "Lcom/adyen/checkout/card/CardComponentState;", "Lcom/adyen/checkout/components/core/ComponentCallback;", "Lcom/adyen/checkout/components/core/internal/provider/StoredPaymentComponentProvider;", "Lcom/adyen/checkout/sessions/core/internal/provider/SessionPaymentComponentProvider;", "Lcom/adyen/checkout/sessions/core/SessionComponentCallback;", "Lcom/adyen/checkout/sessions/core/internal/provider/SessionStoredPaymentComponentProvider;", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "localeProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/core/internal/util/LocaleProvider;)V", "Lea/f;", "savedStateRegistryOwner", "Landroidx/lifecycle/s1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/adyen/checkout/components/core/PaymentMethod;", "paymentMethod", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "checkoutConfiguration", "Landroid/app/Application;", "application", "componentCallback", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/Order;", "order", "", "key", "get", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/card/CardComponent;", "configuration", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/card/CardConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/card/CardComponent;", "Lcom/adyen/checkout/sessions/core/CheckoutSession;", "checkoutSession", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/card/CardComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/card/CardConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/card/CardComponent;", "Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "storedPaymentMethod", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/card/CardComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/card/CardConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/card/CardComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/card/CardComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/card/CardConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/card/CardComponent;", "", "isPaymentMethodSupported", "(Lcom/adyen/checkout/components/core/PaymentMethod;)Z", "(Lcom/adyen/checkout/components/core/StoredPaymentMethod;)Z", "", "assertSupported", "(Lcom/adyen/checkout/components/core/PaymentMethod;)V", "(Lcom/adyen/checkout/components/core/StoredPaymentMethod;)V", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardComponentProvider implements PaymentComponentProvider<CardComponent, CardConfiguration, CardComponentState, ComponentCallback<CardComponentState>>, StoredPaymentComponentProvider<CardComponent, CardConfiguration, CardComponentState, ComponentCallback<CardComponentState>>, SessionPaymentComponentProvider<CardComponent, CardConfiguration, CardComponentState, SessionComponentCallback<CardComponentState>>, SessionStoredPaymentComponentProvider<CardComponent, CardConfiguration, CardComponentState, SessionComponentCallback<CardComponentState>> {

    @Nullable
    private final AnalyticsManager analyticsManager;

    @Nullable
    private final DropInOverrideParams dropInOverrideParams;

    @NotNull
    private final LocaleProvider localeProvider;

    public /* synthetic */ CardComponentProvider(DropInOverrideParams dropInOverrideParams, AnalyticsManager analyticsManager, LocaleProvider localeProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : dropInOverrideParams, (i11 & 2) != 0 ? null : analyticsManager, (i11 & 4) != 0 ? new LocaleProvider() : localeProvider);
    }

    private final void assertSupported(PaymentMethod paymentMethod) {
        if (!isPaymentMethodSupported(paymentMethod)) {
            throw new ComponentException(f.k("Unsupported payment method ", paymentMethod.getType()), null, 2, null);
        }
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public CardComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final CheckoutSession checkoutSession, @NotNull final PaymentMethod paymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final SessionComponentCallback<CardComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        paymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(paymentMethod);
        final CardComponent cardComponent = (CardComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, CardComponent>() { // from class: com.adyen.checkout.card.internal.provider.CardComponentProvider$get$factory$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CardComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                CardComponentParams cardComponentParamsMapToParams = new CardComponentParamsMapper(new CommonComponentParamsMapper(), new InstallmentsParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, SessionParamsFactory.INSTANCE.create(checkoutSession), paymentMethod);
                HttpClient httpClient = HttpClientFactory.INSTANCE.getHttpClient(cardComponentParamsMapToParams.getEnvironment());
                BaseGenericEncryptor baseGenericEncryptorProvide = GenericEncryptorFactory.INSTANCE.provide();
                BaseCardEncryptor baseCardEncryptorProvide = CardEncryptorFactory.INSTANCE.provide();
                int i11 = 2;
                DefaultDetectCardTypeRepository defaultDetectCardTypeRepository = new DefaultDetectCardTypeRepository(baseCardEncryptorProvide, new BinLookupService(httpClient, null, 2, null));
                DefaultPublicKeyRepository defaultPublicKeyRepository = new DefaultPublicKeyRepository(new PublicKeyService(httpClient, null, 2, null));
                DefaultAddressRepository defaultAddressRepository = new DefaultAddressRepository(new AddressService(httpClient, null, 2, null), null, 2, null);
                CardValidationMapper cardValidationMapper = new CardValidationMapper();
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
                DefaultCardDelegate defaultCardDelegate = new DefaultCardDelegate(new PaymentObserverRepository(null, 1, null), defaultPublicKeyRepository, cardComponentParamsMapToParams, paymentMethod, checkoutSession.getOrder(), analyticsManager, defaultAddressRepository, defaultDetectCardTypeRepository, cardValidationMapper, baseCardEncryptorProvide, baseGenericEncryptorProvide, new SubmitHandler(c1Var), new DefaultAddressLookupDelegate(new DefaultAddressRepository(new AddressService(httpClient, null, 2, null), null, 2, null), cardComponentParamsMapToParams.getShopperLocale()), new CardConfigDataGenerator(), new DualBrandedCardHandler(cardComponentParamsMapToParams.getEnvironment()), new DefaultSdkDataProvider(analyticsManager));
                GenericActionDelegate delegate = new GenericActionComponentProvider(analyticsManager, this.dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, c1Var, application);
                SessionSavedStateHandleContainer sessionSavedStateHandleContainer = new SessionSavedStateHandleContainer(c1Var, checkoutSession);
                SessionRepository sessionRepository = new SessionRepository(new SessionService(httpClient, null, i11, 0 == true ? 1 : 0), cardComponentParamsMapToParams.getClientKey());
                SessionModel sessionModel = sessionSavedStateHandleContainer.getSessionModel();
                Boolean boolIsFlowTakenOver = sessionSavedStateHandleContainer.isFlowTakenOver();
                return new CardComponent(defaultCardDelegate, delegate, new DefaultActionHandlingComponent(delegate, defaultCardDelegate), new SessionComponentEventHandler(new SessionInteractor(sessionRepository, sessionModel, boolIsFlowTakenOver != null ? boolIsFlowTakenOver.booleanValue() : false, analyticsManager), sessionSavedStateHandleContainer));
            }
        }), key, CardComponent.class);
        cardComponent.observe(lifecycleOwner, new Function1<PaymentComponentEvent<CardComponentState>, Unit>() { // from class: com.adyen.checkout.card.internal.provider.CardComponentProvider$get$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<CardComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                cardComponent.getComponentEventHandler$card_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<CardComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return cardComponent;
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public boolean isPaymentMethodSupported(@NotNull PaymentMethod paymentMethod) {
        paymentMethod.getClass();
        return CollectionsKt.I(CardComponent.PAYMENT_METHOD_TYPES, paymentMethod.getType());
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public boolean isPaymentMethodSupported(@NotNull StoredPaymentMethod storedPaymentMethod) {
        storedPaymentMethod.getClass();
        return CollectionsKt.I(CardComponent.PAYMENT_METHOD_TYPES, storedPaymentMethod.getType());
    }

    public CardComponentProvider(@Nullable DropInOverrideParams dropInOverrideParams, @Nullable AnalyticsManager analyticsManager, @NotNull LocaleProvider localeProvider) {
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

    public CardComponentProvider() {
        this(null, null, null, 7, null);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public CardComponent get(@NotNull ComponentActivity componentActivity, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<CardComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (CardComponent) PaymentComponentProvider.DefaultImpls.get((PaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<CardComponentState>>) this, componentActivity, paymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public CardComponent get(@NotNull ComponentActivity componentActivity, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CardConfiguration cardConfiguration, @NotNull ComponentCallback<CardComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (CardComponent) StoredPaymentComponentProvider.DefaultImpls.get(this, componentActivity, storedPaymentMethod, cardConfiguration, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    @NotNull
    public CardComponent get(@NotNull ComponentActivity componentActivity, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<CardComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (CardComponent) StoredPaymentComponentProvider.DefaultImpls.get((StoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<CardComponentState>>) this, componentActivity, storedPaymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public CardComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CardConfiguration cardConfiguration, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (CardComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, paymentMethod, cardConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public CardComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (CardComponent) SessionPaymentComponentProvider.DefaultImpls.get((SessionPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<CardComponentState>>) this, componentActivity, checkoutSession, paymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public CardComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (CardComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, paymentMethod, sessionComponentCallback, str);
    }

    @NotNull
    public CardComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CardConfiguration cardConfiguration, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (CardComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, storedPaymentMethod, cardConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    @NotNull
    public CardComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (CardComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get((SessionStoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<CardComponentState>>) this, componentActivity, checkoutSession, storedPaymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    @NotNull
    public CardComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (CardComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get(this, componentActivity, checkoutSession, storedPaymentMethod, sessionComponentCallback, str);
    }

    @NotNull
    public CardComponent get(@NotNull Fragment fragment, @NotNull PaymentMethod paymentMethod, @NotNull CardConfiguration cardConfiguration, @NotNull ComponentCallback<CardComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (CardComponent) PaymentComponentProvider.DefaultImpls.get(this, fragment, paymentMethod, cardConfiguration, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public CardComponent get(@NotNull Fragment fragment, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<CardComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (CardComponent) PaymentComponentProvider.DefaultImpls.get((PaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<CardComponentState>>) this, fragment, paymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public CardComponent get(@NotNull Fragment fragment, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CardConfiguration cardConfiguration, @NotNull ComponentCallback<CardComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (CardComponent) StoredPaymentComponentProvider.DefaultImpls.get(this, fragment, storedPaymentMethod, cardConfiguration, componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    @NotNull
    public CardComponent get(@NotNull Fragment fragment, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallback<CardComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (CardComponent) StoredPaymentComponentProvider.DefaultImpls.get((StoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallback<CardComponentState>>) this, fragment, storedPaymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public CardComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CardConfiguration cardConfiguration, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (CardComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, paymentMethod, cardConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public CardComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (CardComponent) SessionPaymentComponentProvider.DefaultImpls.get((SessionPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<CardComponentState>>) this, fragment, checkoutSession, paymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    @NotNull
    public CardComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (CardComponent) SessionPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, paymentMethod, sessionComponentCallback, str);
    }

    @NotNull
    public CardComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CardConfiguration cardConfiguration, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (CardComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, storedPaymentMethod, cardConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    @NotNull
    public CardComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (CardComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get((SessionStoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, SessionComponentCallback<CardComponentState>>) this, fragment, checkoutSession, storedPaymentMethod, checkoutConfiguration, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    @NotNull
    public CardComponent get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull SessionComponentCallback<CardComponentState> sessionComponentCallback, @Nullable String str) {
        return (CardComponent) SessionStoredPaymentComponentProvider.DefaultImpls.get(this, fragment, checkoutSession, storedPaymentMethod, sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, paymentMethod, checkoutConfiguration, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, PaymentMethod paymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, paymentMethod, (CardConfiguration) configuration, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, storedPaymentMethod, checkoutConfiguration, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, StoredPaymentMethod storedPaymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(componentActivity, storedPaymentMethod, (CardConfiguration) configuration, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, checkoutConfiguration, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, (CardConfiguration) configuration, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, PaymentMethod paymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, paymentMethod, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, storedPaymentMethod, checkoutConfiguration, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, storedPaymentMethod, (CardConfiguration) configuration, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ComponentActivity componentActivity, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(componentActivity, checkoutSession, storedPaymentMethod, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, paymentMethod, checkoutConfiguration, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, PaymentMethod paymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, paymentMethod, (CardConfiguration) configuration, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, storedPaymentMethod, checkoutConfiguration, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, StoredPaymentMethod storedPaymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fragment, storedPaymentMethod, (CardConfiguration) configuration, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, checkoutConfiguration, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, (CardConfiguration) configuration, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, PaymentMethod paymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, paymentMethod, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, storedPaymentMethod, checkoutConfiguration, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, storedPaymentMethod, (CardConfiguration) configuration, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(Fragment fragment, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fragment, checkoutSession, storedPaymentMethod, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, paymentMethod, checkoutConfiguration, application, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, PaymentMethod paymentMethod, Configuration configuration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, paymentMethod, (CardConfiguration) configuration, application, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, storedPaymentMethod, checkoutConfiguration, application, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, StoredPaymentMethod storedPaymentMethod, Configuration configuration, Application application, ComponentCallback componentCallback, OrderRequest orderRequest, String str) {
        return get(fVar, s1Var, lifecycleOwner, storedPaymentMethod, (CardConfiguration) configuration, application, (ComponentCallback<CardComponentState>) componentCallback, orderRequest, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, paymentMethod, checkoutConfiguration, application, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, PaymentMethod paymentMethod, Configuration configuration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, paymentMethod, (CardConfiguration) configuration, application, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, storedPaymentMethod, checkoutConfiguration, application, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    public /* bridge */ /* synthetic */ PaymentComponent get(ea.f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, Configuration configuration, Application application, SessionComponentCallback sessionComponentCallback, String str) {
        return get(fVar, s1Var, lifecycleOwner, checkoutSession, storedPaymentMethod, (CardConfiguration) configuration, application, (SessionComponentCallback<CardComponentState>) sessionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.PaymentComponentProvider
    @NotNull
    public CardComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final PaymentMethod paymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final ComponentCallback<CardComponentState> componentCallback, @Nullable final OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        paymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(paymentMethod);
        final CardComponent cardComponent = (CardComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, CardComponent>() { // from class: com.adyen.checkout.card.internal.provider.CardComponentProvider$get$factory$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CardComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                CardComponentParams cardComponentParamsMapToParams = new CardComponentParamsMapper(new CommonComponentParamsMapper(), new InstallmentsParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, (SessionParams) null, paymentMethod);
                HttpClient httpClient = HttpClientFactory.INSTANCE.getHttpClient(cardComponentParamsMapToParams.getEnvironment());
                BaseGenericEncryptor baseGenericEncryptorProvide = GenericEncryptorFactory.INSTANCE.provide();
                BaseCardEncryptor baseCardEncryptorProvide = CardEncryptorFactory.INSTANCE.provide();
                DefaultDetectCardTypeRepository defaultDetectCardTypeRepository = new DefaultDetectCardTypeRepository(baseCardEncryptorProvide, new BinLookupService(httpClient, null, 2, null));
                DefaultPublicKeyRepository defaultPublicKeyRepository = new DefaultPublicKeyRepository(new PublicKeyService(httpClient, null, 2, null));
                DefaultAddressRepository defaultAddressRepository = new DefaultAddressRepository(new AddressService(httpClient, null, 2, null), null, 2, null);
                CardValidationMapper cardValidationMapper = new CardValidationMapper();
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
                DefaultCardDelegate defaultCardDelegate = new DefaultCardDelegate(new PaymentObserverRepository(null, 1, null), defaultPublicKeyRepository, cardComponentParamsMapToParams, paymentMethod, order, analyticsManager, defaultAddressRepository, defaultDetectCardTypeRepository, cardValidationMapper, baseCardEncryptorProvide, baseGenericEncryptorProvide, new SubmitHandler(c1Var), new DefaultAddressLookupDelegate(new DefaultAddressRepository(new AddressService(httpClient, null, 2, null), null, 2, null), cardComponentParamsMapToParams.getShopperLocale()), new CardConfigDataGenerator(), new DualBrandedCardHandler(cardComponentParamsMapToParams.getEnvironment()), new DefaultSdkDataProvider(analyticsManager));
                GenericActionDelegate delegate = new GenericActionComponentProvider(analyticsManager, this.dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, c1Var, application);
                return new CardComponent(defaultCardDelegate, delegate, new DefaultActionHandlingComponent(delegate, defaultCardDelegate), new DefaultComponentEventHandler());
            }
        }), key, CardComponent.class);
        cardComponent.observe(lifecycleOwner, new Function1<PaymentComponentEvent<CardComponentState>, Unit>() { // from class: com.adyen.checkout.card.internal.provider.CardComponentProvider$get$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<CardComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                cardComponent.getComponentEventHandler$card_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<CardComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return cardComponent;
    }

    @NotNull
    public CardComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull PaymentMethod paymentMethod, @NotNull CardConfiguration configuration, @NotNull Application application, @NotNull ComponentCallback<CardComponentState> componentCallback, @Nullable OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        paymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, paymentMethod, CardConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, order, key);
    }

    @NotNull
    public CardComponent get(@NotNull ComponentActivity componentActivity, @NotNull PaymentMethod paymentMethod, @NotNull CardConfiguration cardConfiguration, @NotNull ComponentCallback<CardComponentState> componentCallback, @Nullable OrderRequest orderRequest, @Nullable String str) {
        return (CardComponent) PaymentComponentProvider.DefaultImpls.get(this, componentActivity, paymentMethod, cardConfiguration, componentCallback, orderRequest, str);
    }

    @NotNull
    public CardComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull CheckoutSession checkoutSession, @NotNull PaymentMethod paymentMethod, @NotNull CardConfiguration configuration, @NotNull Application application, @NotNull SessionComponentCallback<CardComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        paymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, checkoutSession, paymentMethod, CardConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, key);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.StoredPaymentComponentProvider
    @NotNull
    public CardComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final StoredPaymentMethod storedPaymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final ComponentCallback<CardComponentState> componentCallback, @Nullable final OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        storedPaymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(storedPaymentMethod);
        final CardComponent cardComponent = (CardComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, CardComponent>() { // from class: com.adyen.checkout.card.internal.provider.CardComponentProvider$get$factory$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CardComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                CardComponentParams cardComponentParamsMapToParams = new CardComponentParamsMapper(new CommonComponentParamsMapper(), new InstallmentsParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, (SessionParams) null, storedPaymentMethod);
                DefaultPublicKeyRepository defaultPublicKeyRepository = new DefaultPublicKeyRepository(new PublicKeyService(HttpClientFactory.INSTANCE.getHttpClient(cardComponentParamsMapToParams.getEnvironment()), null, 2, null));
                BaseCardEncryptor baseCardEncryptorProvide = CardEncryptorFactory.INSTANCE.provide();
                AnalyticsManager analyticsManagerProvide = this.analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = storedPaymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(cardComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), null);
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                StoredCardDelegate storedCardDelegate = new StoredCardDelegate(new PaymentObserverRepository(null, 1, null), storedPaymentMethod, order, cardComponentParamsMapToParams, analyticsManager, baseCardEncryptorProvide, defaultPublicKeyRepository, new SubmitHandler(c1Var), new CardConfigDataGenerator(), new CardValidationMapper(), new DefaultSdkDataProvider(analyticsManager));
                GenericActionDelegate delegate = new GenericActionComponentProvider(analyticsManager, this.dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, c1Var, application);
                return new CardComponent(storedCardDelegate, delegate, new DefaultActionHandlingComponent(delegate, storedCardDelegate), new DefaultComponentEventHandler());
            }
        }), key, CardComponent.class);
        cardComponent.observe(lifecycleOwner, new Function1<PaymentComponentEvent<CardComponentState>, Unit>() { // from class: com.adyen.checkout.card.internal.provider.CardComponentProvider$get$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<CardComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                cardComponent.getComponentEventHandler$card_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<CardComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return cardComponent;
    }

    @NotNull
    public CardComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CardConfiguration configuration, @NotNull Application application, @NotNull ComponentCallback<CardComponentState> componentCallback, @Nullable OrderRequest order, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        storedPaymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, storedPaymentMethod, CardConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, order, key);
    }

    @Override // com.adyen.checkout.sessions.core.internal.provider.SessionStoredPaymentComponentProvider
    @NotNull
    public CardComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final CheckoutSession checkoutSession, @NotNull final StoredPaymentMethod storedPaymentMethod, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final Application application, @NotNull final SessionComponentCallback<CardComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        storedPaymentMethod.getClass();
        checkoutConfiguration.getClass();
        application.getClass();
        componentCallback.getClass();
        assertSupported(storedPaymentMethod);
        final CardComponent cardComponent = (CardComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, CardComponent>() { // from class: com.adyen.checkout.card.internal.provider.CardComponentProvider$get$factory$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CardComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                CardComponentParams cardComponentParamsMapToParams = new CardComponentParamsMapper(new CommonComponentParamsMapper(), new InstallmentsParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, SessionParamsFactory.INSTANCE.create(checkoutSession), storedPaymentMethod);
                HttpClient httpClient = HttpClientFactory.INSTANCE.getHttpClient(cardComponentParamsMapToParams.getEnvironment());
                x xVar = null;
                Object[] objArr = 0;
                int i11 = 2;
                DefaultPublicKeyRepository defaultPublicKeyRepository = new DefaultPublicKeyRepository(new PublicKeyService(httpClient, null, 2, null));
                BaseCardEncryptor baseCardEncryptorProvide = CardEncryptorFactory.INSTANCE.provide();
                AnalyticsManager analyticsManagerProvide = this.analyticsManager;
                if (analyticsManagerProvide == null) {
                    AnalyticsManagerFactory analyticsManagerFactory = new AnalyticsManagerFactory();
                    Application application2 = application;
                    String type = storedPaymentMethod.getType();
                    if (type == null) {
                        type = "";
                    }
                    analyticsManagerProvide = analyticsManagerFactory.provide(cardComponentParamsMapToParams, application2, new AnalyticsSource.PaymentComponent(type), checkoutSession.getSessionSetupResponse().getId());
                }
                AnalyticsManager analyticsManager = analyticsManagerProvide;
                StoredCardDelegate storedCardDelegate = new StoredCardDelegate(new PaymentObserverRepository(null, 1, null), storedPaymentMethod, checkoutSession.getOrder(), cardComponentParamsMapToParams, analyticsManager, baseCardEncryptorProvide, defaultPublicKeyRepository, new SubmitHandler(c1Var), new CardConfigDataGenerator(), new CardValidationMapper(), new DefaultSdkDataProvider(analyticsManager));
                GenericActionDelegate delegate = new GenericActionComponentProvider(analyticsManager, this.dropInOverrideParams, null, 4, null).getDelegate(checkoutConfiguration, c1Var, application);
                SessionSavedStateHandleContainer sessionSavedStateHandleContainer = new SessionSavedStateHandleContainer(c1Var, checkoutSession);
                SessionRepository sessionRepository = new SessionRepository(new SessionService(httpClient, xVar, i11, objArr == true ? 1 : 0), cardComponentParamsMapToParams.getClientKey());
                SessionModel sessionModel = sessionSavedStateHandleContainer.getSessionModel();
                Boolean boolIsFlowTakenOver = sessionSavedStateHandleContainer.isFlowTakenOver();
                return new CardComponent(storedCardDelegate, delegate, new DefaultActionHandlingComponent(delegate, storedCardDelegate), new SessionComponentEventHandler(new SessionInteractor(sessionRepository, sessionModel, boolIsFlowTakenOver != null ? boolIsFlowTakenOver.booleanValue() : false, analyticsManager), sessionSavedStateHandleContainer));
            }
        }), key, CardComponent.class);
        cardComponent.observe(lifecycleOwner, new Function1<PaymentComponentEvent<CardComponentState>, Unit>() { // from class: com.adyen.checkout.card.internal.provider.CardComponentProvider$get$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull PaymentComponentEvent<CardComponentState> paymentComponentEvent) {
                paymentComponentEvent.getClass();
                cardComponent.getComponentEventHandler$card_release().onPaymentComponentEvent(paymentComponentEvent, componentCallback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentEvent<CardComponentState>) obj);
                return Unit.f26487a;
            }
        });
        return cardComponent;
    }

    @NotNull
    public CardComponent get(@NotNull ea.f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CardConfiguration configuration, @NotNull Application application, @NotNull SessionComponentCallback<CardComponentState> componentCallback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        checkoutSession.getClass();
        storedPaymentMethod.getClass();
        configuration.getClass();
        application.getClass();
        componentCallback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, checkoutSession, storedPaymentMethod, CardConfigurationKt.toCheckoutConfiguration(configuration), application, componentCallback, key);
    }
}
