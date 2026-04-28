package com.adyen.checkout.voucher.internal.provider;

import android.app.Application;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c1;
import androidx.lifecycle.s1;
import b3.i;
import com.adyen.checkout.components.core.ActionComponentCallback;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ActionComponentEvent;
import com.adyen.checkout.components.core.internal.ActionObserverRepository;
import com.adyen.checkout.components.core.internal.DefaultActionComponentEventHandler;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.provider.ActionComponentProvider;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapper;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.components.core.internal.ui.model.GenericComponentParamsMapper;
import com.adyen.checkout.components.core.internal.util.ViewModelExtKt;
import com.adyen.checkout.core.internal.util.LocaleProvider;
import com.adyen.checkout.ui.core.internal.util.ImageSaver;
import com.adyen.checkout.ui.core.internal.util.PdfOpener;
import com.adyen.checkout.voucher.VoucherComponent;
import com.adyen.checkout.voucher.VoucherConfiguration;
import com.adyen.checkout.voucher.VoucherConfigurationKt;
import com.adyen.checkout.voucher.internal.ui.DefaultVoucherDelegate;
import com.adyen.checkout.voucher.internal.ui.VoucherDelegate;
import ea.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 02\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00010B+\b\u0007\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 JI\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b(\u0010'R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00190,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/adyen/checkout/voucher/internal/provider/VoucherComponentProvider;", "Lcom/adyen/checkout/components/core/internal/provider/ActionComponentProvider;", "Lcom/adyen/checkout/voucher/VoucherComponent;", "Lcom/adyen/checkout/voucher/VoucherConfiguration;", "Lcom/adyen/checkout/voucher/internal/ui/VoucherDelegate;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "localeProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lcom/adyen/checkout/core/internal/util/LocaleProvider;)V", "Lea/f;", "savedStateRegistryOwner", "Landroidx/lifecycle/s1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroid/app/Application;", "application", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "checkoutConfiguration", "Lcom/adyen/checkout/components/core/ActionComponentCallback;", "callback", "", "key", "get", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Lcom/adyen/checkout/components/core/ActionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/voucher/VoucherComponent;", "Landroidx/lifecycle/c1;", "savedStateHandle", "getDelegate", "(Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroidx/lifecycle/c1;Landroid/app/Application;)Lcom/adyen/checkout/voucher/internal/ui/VoucherDelegate;", "configuration", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lcom/adyen/checkout/voucher/VoucherConfiguration;Lcom/adyen/checkout/components/core/ActionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/voucher/VoucherComponent;", "Lcom/adyen/checkout/components/core/action/Action;", "action", "", "canHandleAction", "(Lcom/adyen/checkout/components/core/action/Action;)Z", "providesDetails", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "", "getSupportedActionTypes", "()Ljava/util/List;", "supportedActionTypes", "Companion", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VoucherComponentProvider implements ActionComponentProvider<VoucherComponent, VoucherConfiguration, VoucherDelegate> {

    @NotNull
    private static final List<String> PAYMENT_METHODS = d0.h("directdebit_GB", PaymentMethodTypes.BOLETOBANCARIO, PaymentMethodTypes.BOLETOBANCARIO_BANCODOBRASIL, PaymentMethodTypes.BOLETOBANCARIO_BRADESCO, PaymentMethodTypes.BOLETOBANCARIO_HSBC, PaymentMethodTypes.BOLETOBANCARIO_ITAU, PaymentMethodTypes.BOLETOBANCARIO_SANTANDER, PaymentMethodTypes.BOLETO_PRIMEIRO_PAY, "econtext_atm", "econtext_online", "econtext_seven_eleven", "econtext_stores", PaymentMethodTypes.MULTIBANCO);

    @Nullable
    private final AnalyticsManager analyticsManager;

    @Nullable
    private final DropInOverrideParams dropInOverrideParams;

    @NotNull
    private final LocaleProvider localeProvider;

    public /* synthetic */ VoucherComponentProvider(AnalyticsManager analyticsManager, DropInOverrideParams dropInOverrideParams, LocaleProvider localeProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : analyticsManager, (i11 & 2) != 0 ? null : dropInOverrideParams, (i11 & 4) != 0 ? new LocaleProvider() : localeProvider);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    public boolean canHandleAction(@NotNull Action action) {
        action.getClass();
        return CollectionsKt.I(getSupportedActionTypes(), action.getType()) && CollectionsKt.I(PAYMENT_METHODS, action.getPaymentMethodType());
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    @NotNull
    public VoucherComponent get(@NotNull f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Application application, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final ActionComponentCallback callback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        application.getClass();
        checkoutConfiguration.getClass();
        callback.getClass();
        final VoucherComponent voucherComponent = (VoucherComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, VoucherComponent>() { // from class: com.adyen.checkout.voucher.internal.provider.VoucherComponentProvider$get$voucherFactory$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final VoucherComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                return new VoucherComponent(this.this$0.getDelegate(checkoutConfiguration, c1Var, application), new DefaultActionComponentEventHandler());
            }
        }), key, VoucherComponent.class);
        voucherComponent.observe$voucher_release(lifecycleOwner, new Function1<ActionComponentEvent, Unit>() { // from class: com.adyen.checkout.voucher.internal.provider.VoucherComponentProvider$get$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull ActionComponentEvent actionComponentEvent) {
                actionComponentEvent.getClass();
                voucherComponent.getActionComponentEventHandler$voucher_release().onActionComponentEvent(actionComponentEvent, callback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ActionComponentEvent) obj);
                return Unit.f26487a;
            }
        });
        return voucherComponent;
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    @NotNull
    public VoucherDelegate getDelegate(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull c1 savedStateHandle, @NotNull Application application) {
        checkoutConfiguration.getClass();
        savedStateHandle.getClass();
        application.getClass();
        return new DefaultVoucherDelegate(new ActionObserverRepository(null, 1, null), savedStateHandle, new GenericComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, null), new PdfOpener(), new ImageSaver(null, 1, null), this.analyticsManager);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    @NotNull
    public List<String> getSupportedActionTypes() {
        return c0.c("voucher");
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    public boolean providesDetails(@NotNull Action action) {
        action.getClass();
        return false;
    }

    public VoucherComponentProvider(@Nullable AnalyticsManager analyticsManager, @Nullable DropInOverrideParams dropInOverrideParams, @NotNull LocaleProvider localeProvider) {
        localeProvider.getClass();
        this.analyticsManager = analyticsManager;
        this.dropInOverrideParams = dropInOverrideParams;
        this.localeProvider = localeProvider;
    }

    public VoucherComponentProvider() {
        this(null, null, null, 7, null);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    @NotNull
    public VoucherComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ActionComponentCallback actionComponentCallback, @Nullable String str) {
        return (VoucherComponent) ActionComponentProvider.DefaultImpls.get((ActionComponentProvider) this, componentActivity, checkoutConfiguration, actionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    @NotNull
    public VoucherComponent get(@NotNull ComponentActivity componentActivity, @NotNull VoucherConfiguration voucherConfiguration, @NotNull ActionComponentCallback actionComponentCallback, @Nullable String str) {
        return (VoucherComponent) ActionComponentProvider.DefaultImpls.get(this, componentActivity, voucherConfiguration, actionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    @NotNull
    public VoucherComponent get(@NotNull Fragment fragment, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ActionComponentCallback actionComponentCallback, @Nullable String str) {
        return (VoucherComponent) ActionComponentProvider.DefaultImpls.get((ActionComponentProvider) this, fragment, checkoutConfiguration, actionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    @NotNull
    public VoucherComponent get(@NotNull Fragment fragment, @NotNull VoucherConfiguration voucherConfiguration, @NotNull ActionComponentCallback actionComponentCallback, @Nullable String str) {
        return (VoucherComponent) ActionComponentProvider.DefaultImpls.get(this, fragment, voucherConfiguration, actionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    @NotNull
    public VoucherComponent get(@NotNull f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull Application application, @NotNull VoucherConfiguration configuration, @NotNull ActionComponentCallback callback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        application.getClass();
        configuration.getClass();
        callback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, application, VoucherConfigurationKt.toCheckoutConfiguration(configuration), callback, key);
    }
}
