package com.adyen.checkout.action.core.internal.provider;

import android.app.Application;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c1;
import androidx.lifecycle.s1;
import b3.i;
import com.adyen.checkout.action.core.GenericActionComponent;
import com.adyen.checkout.action.core.GenericActionConfiguration;
import com.adyen.checkout.action.core.GenericActionConfigurationKt;
import com.adyen.checkout.action.core.internal.ui.ActionDelegateProvider;
import com.adyen.checkout.action.core.internal.ui.DefaultGenericActionDelegate;
import com.adyen.checkout.action.core.internal.ui.GenericActionDelegate;
import com.adyen.checkout.components.core.ActionComponentCallback;
import com.adyen.checkout.components.core.CheckoutConfiguration;
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
import ea.f;
import i4.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B+\b\u0007\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JI\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b#\u0010$JI\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010)R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u001d0.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/adyen/checkout/action/core/internal/provider/GenericActionComponentProvider;", "Lcom/adyen/checkout/components/core/internal/provider/ActionComponentProvider;", "Lcom/adyen/checkout/action/core/GenericActionComponent;", "Lcom/adyen/checkout/action/core/GenericActionConfiguration;", "Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "localeProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lcom/adyen/checkout/core/internal/util/LocaleProvider;)V", "Lcom/adyen/checkout/components/core/action/Action;", "action", "getProvider", "(Lcom/adyen/checkout/components/core/action/Action;)Lcom/adyen/checkout/components/core/internal/provider/ActionComponentProvider;", "Lea/f;", "savedStateRegistryOwner", "Landroidx/lifecycle/s1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroid/app/Application;", "application", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "checkoutConfiguration", "Lcom/adyen/checkout/components/core/ActionComponentCallback;", "callback", "", "key", "get", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Lcom/adyen/checkout/components/core/ActionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/action/core/GenericActionComponent;", "Landroidx/lifecycle/c1;", "savedStateHandle", "getDelegate", "(Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroidx/lifecycle/c1;Landroid/app/Application;)Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "configuration", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lcom/adyen/checkout/action/core/GenericActionConfiguration;Lcom/adyen/checkout/components/core/ActionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/action/core/GenericActionComponent;", "", "canHandleAction", "(Lcom/adyen/checkout/components/core/action/Action;)Z", "providesDetails", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "", "getSupportedActionTypes", "()Ljava/util/List;", "supportedActionTypes", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GenericActionComponentProvider implements ActionComponentProvider<GenericActionComponent, GenericActionConfiguration, GenericActionDelegate> {

    @Nullable
    private final AnalyticsManager analyticsManager;

    @Nullable
    private final DropInOverrideParams dropInOverrideParams;

    @NotNull
    private final LocaleProvider localeProvider;

    public /* synthetic */ GenericActionComponentProvider(AnalyticsManager analyticsManager, DropInOverrideParams dropInOverrideParams, LocaleProvider localeProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : analyticsManager, (i11 & 2) != 0 ? null : dropInOverrideParams, (i11 & 4) != 0 ? new LocaleProvider() : localeProvider);
    }

    private final ActionComponentProvider<?, ?, ?> getProvider(Action action) {
        ActionComponentProvider<?, ?, ?> actionProviderFor = ActionComponentExtensionsKt.getActionProviderFor(action);
        if (actionProviderFor != null) {
            return actionProviderFor;
        }
        a.f("No provider available for this action");
        return null;
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    public boolean canHandleAction(@NotNull Action action) {
        action.getClass();
        return getProvider(action).canHandleAction(action);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    @NotNull
    public GenericActionComponent get(@NotNull f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Application application, @NotNull final CheckoutConfiguration checkoutConfiguration, @NotNull final ActionComponentCallback callback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        application.getClass();
        checkoutConfiguration.getClass();
        callback.getClass();
        final GenericActionComponent genericActionComponent = (GenericActionComponent) i.d(viewModelStoreOwner, ViewModelExtKt.viewModelFactory(savedStateRegistryOwner, null, new Function1<c1, GenericActionComponent>() { // from class: com.adyen.checkout.action.core.internal.provider.GenericActionComponentProvider$get$genericActionFactory$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final GenericActionComponent invoke(@NotNull c1 c1Var) {
                c1Var.getClass();
                return new GenericActionComponent(this.this$0.getDelegate(checkoutConfiguration, c1Var, application), new DefaultActionComponentEventHandler());
            }
        }), key, GenericActionComponent.class);
        genericActionComponent.observe$action_core_release(lifecycleOwner, new Function1<ActionComponentEvent, Unit>() { // from class: com.adyen.checkout.action.core.internal.provider.GenericActionComponentProvider$get$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(@NotNull ActionComponentEvent actionComponentEvent) {
                actionComponentEvent.getClass();
                genericActionComponent.getActionComponentEventHandler().onActionComponentEvent(actionComponentEvent, callback);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ActionComponentEvent) obj);
                return Unit.f26487a;
            }
        });
        return genericActionComponent;
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    @NotNull
    public GenericActionDelegate getDelegate(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull c1 savedStateHandle, @NotNull Application application) {
        checkoutConfiguration.getClass();
        savedStateHandle.getClass();
        application.getClass();
        return new DefaultGenericActionDelegate(new ActionObserverRepository(null, 1, null), savedStateHandle, checkoutConfiguration, new GenericComponentParamsMapper(new CommonComponentParamsMapper()).mapToParams(checkoutConfiguration, this.localeProvider.getLocale(application), this.dropInOverrideParams, null), new ActionDelegateProvider(this.analyticsManager, this.dropInOverrideParams, null, 4, null), application);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    @NotNull
    public List<String> getSupportedActionTypes() {
        return d0.h("await", "qrCode", "redirect", "threeDS2", "threeDS2Challenge", "threeDS2Fingerprint", "voucher", "sdk");
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    public boolean providesDetails(@NotNull Action action) {
        action.getClass();
        return getProvider(action).providesDetails(action);
    }

    public GenericActionComponentProvider(@Nullable AnalyticsManager analyticsManager, @Nullable DropInOverrideParams dropInOverrideParams, @NotNull LocaleProvider localeProvider) {
        localeProvider.getClass();
        this.analyticsManager = analyticsManager;
        this.dropInOverrideParams = dropInOverrideParams;
        this.localeProvider = localeProvider;
    }

    public GenericActionComponentProvider() {
        this(null, null, null, 7, null);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    @NotNull
    public GenericActionComponent get(@NotNull ComponentActivity componentActivity, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ActionComponentCallback actionComponentCallback, @Nullable String str) {
        return (GenericActionComponent) ActionComponentProvider.DefaultImpls.get((ActionComponentProvider) this, componentActivity, checkoutConfiguration, actionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    @NotNull
    public GenericActionComponent get(@NotNull Fragment fragment, @NotNull GenericActionConfiguration genericActionConfiguration, @NotNull ActionComponentCallback actionComponentCallback, @Nullable String str) {
        return (GenericActionComponent) ActionComponentProvider.DefaultImpls.get(this, fragment, genericActionConfiguration, actionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    @NotNull
    public GenericActionComponent get(@NotNull Fragment fragment, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ActionComponentCallback actionComponentCallback, @Nullable String str) {
        return (GenericActionComponent) ActionComponentProvider.DefaultImpls.get((ActionComponentProvider) this, fragment, checkoutConfiguration, actionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    @NotNull
    public GenericActionComponent get(@NotNull ComponentActivity componentActivity, @NotNull GenericActionConfiguration genericActionConfiguration, @NotNull ActionComponentCallback actionComponentCallback, @Nullable String str) {
        return (GenericActionComponent) ActionComponentProvider.DefaultImpls.get(this, componentActivity, genericActionConfiguration, actionComponentCallback, str);
    }

    @Override // com.adyen.checkout.components.core.internal.provider.ActionComponentProvider
    @NotNull
    public GenericActionComponent get(@NotNull f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull Application application, @NotNull GenericActionConfiguration configuration, @NotNull ActionComponentCallback callback, @Nullable String key) {
        savedStateRegistryOwner.getClass();
        viewModelStoreOwner.getClass();
        lifecycleOwner.getClass();
        application.getClass();
        configuration.getClass();
        callback.getClass();
        return get(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, application, GenericActionConfigurationKt.toCheckoutConfiguration(configuration), callback, key);
    }
}
