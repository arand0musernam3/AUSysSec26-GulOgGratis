package com.adyen.checkout.components.core.internal.provider;

import android.app.Application;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c1;
import androidx.lifecycle.s1;
import com.adyen.checkout.components.core.ActionComponentCallback;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ActionComponent;
import com.adyen.checkout.components.core.internal.Configuration;
import com.adyen.checkout.components.core.internal.ui.ActionDelegate;
import com.adyen.checkout.components.core.internal.util.FragmentExtensionsKt;
import com.braze.h2;
import ea.f;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\b\u0012\u0004\u0012\u00028\u00000\u0007J3\u0010\u0010\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0014JK\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0010\u0010\u001dJ'\u0010 \u001a\u00028\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001bH'¢\u0006\u0004\b \u0010!J3\u0010\u0010\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010#J3\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010$JK\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0010\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020(2\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b+\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/adyen/checkout/components/core/internal/provider/ActionComponentProvider;", "Lcom/adyen/checkout/components/core/internal/ActionComponent;", "ComponentT", "Lcom/adyen/checkout/components/core/internal/Configuration;", "ConfigurationT", "Lcom/adyen/checkout/components/core/internal/ui/ActionDelegate;", "DelegateT", "Lcom/adyen/checkout/components/core/internal/provider/ComponentProvider;", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "checkoutConfiguration", "Lcom/adyen/checkout/components/core/ActionComponentCallback;", "callback", "", "key", "get", "(Landroidx/fragment/app/Fragment;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Lcom/adyen/checkout/components/core/ActionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/ActionComponent;", "Landroidx/activity/ComponentActivity;", "activity", "(Landroidx/activity/ComponentActivity;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Lcom/adyen/checkout/components/core/ActionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/ActionComponent;", "Lea/f;", "savedStateRegistryOwner", "Landroidx/lifecycle/s1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroid/app/Application;", "application", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Lcom/adyen/checkout/components/core/ActionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/ActionComponent;", "Landroidx/lifecycle/c1;", "savedStateHandle", "getDelegate", "(Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroidx/lifecycle/c1;Landroid/app/Application;)Lcom/adyen/checkout/components/core/internal/ui/ActionDelegate;", "configuration", "(Landroidx/fragment/app/Fragment;Lcom/adyen/checkout/components/core/internal/Configuration;Lcom/adyen/checkout/components/core/ActionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/ActionComponent;", "(Landroidx/activity/ComponentActivity;Lcom/adyen/checkout/components/core/internal/Configuration;Lcom/adyen/checkout/components/core/ActionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/ActionComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lcom/adyen/checkout/components/core/internal/Configuration;Lcom/adyen/checkout/components/core/ActionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/ActionComponent;", "Lcom/adyen/checkout/components/core/action/Action;", "action", "", "canHandleAction", "(Lcom/adyen/checkout/components/core/action/Action;)Z", "providesDetails", "", "getSupportedActionTypes", "()Ljava/util/List;", "supportedActionTypes", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ActionComponentProvider<ComponentT extends ActionComponent, ConfigurationT extends Configuration, DelegateT extends ActionDelegate> extends ComponentProvider<ComponentT> {
    boolean canHandleAction(@NotNull Action action);

    @NotNull
    ComponentT get(@NotNull ComponentActivity activity, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ActionComponentCallback callback, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull ComponentActivity activity, @NotNull ConfigurationT configuration, @NotNull ActionComponentCallback callback, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull Fragment fragment, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ActionComponentCallback callback, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull Fragment fragment, @NotNull ConfigurationT configuration, @NotNull ActionComponentCallback callback, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull Application application, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ActionComponentCallback callback, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull Application application, @NotNull ConfigurationT configuration, @NotNull ActionComponentCallback callback, @Nullable String key);

    @NotNull
    DelegateT getDelegate(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull c1 savedStateHandle, @NotNull Application application);

    @NotNull
    List<String> getSupportedActionTypes();

    boolean providesDetails(@NotNull Action action);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static <ComponentT extends ActionComponent, ConfigurationT extends Configuration, DelegateT extends ActionDelegate> ComponentT get(@NotNull ActionComponentProvider<ComponentT, ConfigurationT, DelegateT> actionComponentProvider, @NotNull Fragment fragment, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ActionComponentCallback actionComponentCallback, @Nullable String str) {
            fragment.getClass();
            checkoutConfiguration.getClass();
            actionComponentCallback.getClass();
            LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            return (ComponentT) actionComponentProvider.get((f) fragment, (s1) fragment, viewLifecycleOwner, FragmentExtensionsKt.requireApplication(fragment), checkoutConfiguration, actionComponentCallback, str);
        }

        public static /* synthetic */ ActionComponent get$default(ActionComponentProvider actionComponentProvider, f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, Application application, CheckoutConfiguration checkoutConfiguration, ActionComponentCallback actionComponentCallback, String str, int i11, Object obj) {
            if (obj == null) {
                return actionComponentProvider.get(fVar, s1Var, lifecycleOwner, application, checkoutConfiguration, actionComponentCallback, (i11 & 64) != 0 ? null : str);
            }
            h2.a("Super calls with default arguments not supported in this target, function: get");
            return null;
        }

        @NotNull
        public static <ComponentT extends ActionComponent, ConfigurationT extends Configuration, DelegateT extends ActionDelegate> ComponentT get(@NotNull ActionComponentProvider<ComponentT, ConfigurationT, DelegateT> actionComponentProvider, @NotNull ComponentActivity componentActivity, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ActionComponentCallback actionComponentCallback, @Nullable String str) {
            componentActivity.getClass();
            checkoutConfiguration.getClass();
            actionComponentCallback.getClass();
            Application application = componentActivity.getApplication();
            application.getClass();
            return (ComponentT) actionComponentProvider.get((f) componentActivity, (s1) componentActivity, (LifecycleOwner) componentActivity, application, checkoutConfiguration, actionComponentCallback, str);
        }

        public static /* synthetic */ ActionComponent get$default(ActionComponentProvider actionComponentProvider, ComponentActivity componentActivity, CheckoutConfiguration checkoutConfiguration, ActionComponentCallback actionComponentCallback, String str, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: get");
                return null;
            }
            if ((i11 & 8) != 0) {
                str = null;
            }
            return actionComponentProvider.get(componentActivity, checkoutConfiguration, actionComponentCallback, str);
        }

        public static /* synthetic */ ActionComponent get$default(ActionComponentProvider actionComponentProvider, Fragment fragment, CheckoutConfiguration checkoutConfiguration, ActionComponentCallback actionComponentCallback, String str, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: get");
                return null;
            }
            if ((i11 & 8) != 0) {
                str = null;
            }
            return actionComponentProvider.get(fragment, checkoutConfiguration, actionComponentCallback, str);
        }

        @NotNull
        public static <ComponentT extends ActionComponent, ConfigurationT extends Configuration, DelegateT extends ActionDelegate> ComponentT get(@NotNull ActionComponentProvider<ComponentT, ConfigurationT, DelegateT> actionComponentProvider, @NotNull Fragment fragment, @NotNull ConfigurationT configurationt, @NotNull ActionComponentCallback actionComponentCallback, @Nullable String str) {
            fragment.getClass();
            configurationt.getClass();
            actionComponentCallback.getClass();
            LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            return (ComponentT) actionComponentProvider.get(fragment, fragment, viewLifecycleOwner, FragmentExtensionsKt.requireApplication(fragment), configurationt, actionComponentCallback, str);
        }

        public static /* synthetic */ ActionComponent get$default(ActionComponentProvider actionComponentProvider, Fragment fragment, Configuration configuration, ActionComponentCallback actionComponentCallback, String str, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: get");
                return null;
            }
            if ((i11 & 8) != 0) {
                str = null;
            }
            return actionComponentProvider.get(fragment, configuration, actionComponentCallback, str);
        }

        public static /* synthetic */ ActionComponent get$default(ActionComponentProvider actionComponentProvider, ComponentActivity componentActivity, Configuration configuration, ActionComponentCallback actionComponentCallback, String str, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: get");
                return null;
            }
            if ((i11 & 8) != 0) {
                str = null;
            }
            return actionComponentProvider.get(componentActivity, configuration, actionComponentCallback, str);
        }

        public static /* synthetic */ ActionComponent get$default(ActionComponentProvider actionComponentProvider, f fVar, s1 s1Var, LifecycleOwner lifecycleOwner, Application application, Configuration configuration, ActionComponentCallback actionComponentCallback, String str, int i11, Object obj) {
            if (obj == null) {
                return actionComponentProvider.get(fVar, s1Var, lifecycleOwner, application, configuration, actionComponentCallback, (i11 & 64) != 0 ? null : str);
            }
            h2.a("Super calls with default arguments not supported in this target, function: get");
            return null;
        }

        @NotNull
        public static <ComponentT extends ActionComponent, ConfigurationT extends Configuration, DelegateT extends ActionDelegate> ComponentT get(@NotNull ActionComponentProvider<ComponentT, ConfigurationT, DelegateT> actionComponentProvider, @NotNull ComponentActivity componentActivity, @NotNull ConfigurationT configurationt, @NotNull ActionComponentCallback actionComponentCallback, @Nullable String str) {
            componentActivity.getClass();
            configurationt.getClass();
            actionComponentCallback.getClass();
            Application application = componentActivity.getApplication();
            application.getClass();
            return (ComponentT) actionComponentProvider.get(componentActivity, componentActivity, componentActivity, application, configurationt, actionComponentCallback, str);
        }
    }
}
