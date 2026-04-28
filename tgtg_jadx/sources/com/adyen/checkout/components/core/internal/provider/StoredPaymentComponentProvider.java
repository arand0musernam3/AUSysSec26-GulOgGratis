package com.adyen.checkout.components.core.internal.provider;

import android.app.Application;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.s1;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.ComponentCallback;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.StoredPaymentMethod;
import com.adyen.checkout.components.core.internal.Configuration;
import com.adyen.checkout.components.core.internal.PaymentComponent;
import com.adyen.checkout.components.core.internal.util.FragmentExtensionsKt;
import com.braze.h2;
import ea.f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\f\b\u0002\u0010\u0006*\u0006\u0012\u0002\b\u00030\u0005*\u000e\b\u0003\u0010\b*\b\u0012\u0004\u0012\u00028\u00020\u00072\u00020\tJM\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JM\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u001aJa\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00028\u00032\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0016\u0010$JM\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010%\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00028\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010&JM\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010%\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00028\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010'Ja\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010%\u001a\u00028\u00012\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00028\u00032\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0016\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/adyen/checkout/components/core/internal/provider/StoredPaymentComponentProvider;", "Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "ComponentT", "Lcom/adyen/checkout/components/core/internal/Configuration;", "ConfigurationT", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "ComponentStateT", "Lcom/adyen/checkout/components/core/ComponentCallback;", "ComponentCallbackT", "", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "storedPaymentMethod", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "checkoutConfiguration", "callback", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/Order;", "order", "", "key", "get", "(Landroidx/fragment/app/Fragment;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "Landroidx/activity/ComponentActivity;", "activity", "(Landroidx/activity/ComponentActivity;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "Lea/f;", "savedStateRegistryOwner", "Landroidx/lifecycle/s1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroid/app/Application;", "application", "componentCallback", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "configuration", "(Landroidx/fragment/app/Fragment;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/internal/Configuration;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "(Landroidx/activity/ComponentActivity;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/internal/Configuration;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/internal/Configuration;Landroid/app/Application;Lcom/adyen/checkout/components/core/ComponentCallback;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "", "isPaymentMethodSupported", "(Lcom/adyen/checkout/components/core/StoredPaymentMethod;)Z", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface StoredPaymentComponentProvider<ComponentT extends PaymentComponent, ConfigurationT extends Configuration, ComponentStateT extends PaymentComponentState<?>, ComponentCallbackT extends ComponentCallback<ComponentStateT>> {
    @NotNull
    ComponentT get(@NotNull ComponentActivity activity, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallbackT callback, @Nullable OrderRequest order, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull ComponentActivity activity, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull ConfigurationT configuration, @NotNull ComponentCallbackT callback, @Nullable OrderRequest order, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull Fragment fragment, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallbackT callback, @Nullable OrderRequest order, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull Fragment fragment, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull ConfigurationT configuration, @NotNull ComponentCallbackT callback, @Nullable OrderRequest order, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull Application application, @NotNull ComponentCallbackT componentCallback, @Nullable OrderRequest order, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull ConfigurationT configuration, @NotNull Application application, @NotNull ComponentCallbackT componentCallback, @Nullable OrderRequest order, @Nullable String key);

    boolean isPaymentMethodSupported(@NotNull StoredPaymentMethod storedPaymentMethod);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static <ComponentT extends PaymentComponent, ConfigurationT extends Configuration, ComponentStateT extends PaymentComponentState<?>, ComponentCallbackT extends ComponentCallback<ComponentStateT>> ComponentT get(@NotNull StoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallbackT> storedPaymentComponentProvider, @NotNull Fragment fragment, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallbackT componentcallbackt, @Nullable OrderRequest orderRequest, @Nullable String str) {
            fragment.getClass();
            storedPaymentMethod.getClass();
            checkoutConfiguration.getClass();
            componentcallbackt.getClass();
            LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            return (ComponentT) storedPaymentComponentProvider.get((f) fragment, (s1) fragment, viewLifecycleOwner, storedPaymentMethod, checkoutConfiguration, FragmentExtensionsKt.requireApplication(fragment), (ComponentCallback) componentcallbackt, orderRequest, str);
        }

        public static /* synthetic */ PaymentComponent get$default(StoredPaymentComponentProvider storedPaymentComponentProvider, Fragment fragment, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: get");
                return null;
            }
            if ((i11 & 16) != 0) {
                orderRequest = null;
            }
            if ((i11 & 32) != 0) {
                str = null;
            }
            return storedPaymentComponentProvider.get(fragment, storedPaymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
        }

        public static /* synthetic */ PaymentComponent get$default(StoredPaymentComponentProvider storedPaymentComponentProvider, ComponentActivity componentActivity, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, ComponentCallback componentCallback, OrderRequest orderRequest, String str, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: get");
                return null;
            }
            if ((i11 & 16) != 0) {
                orderRequest = null;
            }
            if ((i11 & 32) != 0) {
                str = null;
            }
            return storedPaymentComponentProvider.get(componentActivity, storedPaymentMethod, checkoutConfiguration, componentCallback, orderRequest, str);
        }

        public static /* synthetic */ PaymentComponent get$default(StoredPaymentComponentProvider storedPaymentComponentProvider, Fragment fragment, StoredPaymentMethod storedPaymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: get");
                return null;
            }
            if ((i11 & 16) != 0) {
                orderRequest = null;
            }
            if ((i11 & 32) != 0) {
                str = null;
            }
            return storedPaymentComponentProvider.get(fragment, storedPaymentMethod, configuration, componentCallback, orderRequest, str);
        }

        public static /* synthetic */ PaymentComponent get$default(StoredPaymentComponentProvider storedPaymentComponentProvider, ComponentActivity componentActivity, StoredPaymentMethod storedPaymentMethod, Configuration configuration, ComponentCallback componentCallback, OrderRequest orderRequest, String str, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: get");
                return null;
            }
            if ((i11 & 16) != 0) {
                orderRequest = null;
            }
            if ((i11 & 32) != 0) {
                str = null;
            }
            return storedPaymentComponentProvider.get(componentActivity, storedPaymentMethod, configuration, componentCallback, orderRequest, str);
        }

        @NotNull
        public static <ComponentT extends PaymentComponent, ConfigurationT extends Configuration, ComponentStateT extends PaymentComponentState<?>, ComponentCallbackT extends ComponentCallback<ComponentStateT>> ComponentT get(@NotNull StoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallbackT> storedPaymentComponentProvider, @NotNull ComponentActivity componentActivity, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallbackT componentcallbackt, @Nullable OrderRequest orderRequest, @Nullable String str) {
            componentActivity.getClass();
            storedPaymentMethod.getClass();
            checkoutConfiguration.getClass();
            componentcallbackt.getClass();
            Application application = componentActivity.getApplication();
            application.getClass();
            return (ComponentT) storedPaymentComponentProvider.get((f) componentActivity, (s1) componentActivity, (LifecycleOwner) componentActivity, storedPaymentMethod, checkoutConfiguration, application, (ComponentCallback) componentcallbackt, orderRequest, str);
        }

        @NotNull
        public static <ComponentT extends PaymentComponent, ConfigurationT extends Configuration, ComponentStateT extends PaymentComponentState<?>, ComponentCallbackT extends ComponentCallback<ComponentStateT>> ComponentT get(@NotNull StoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallbackT> storedPaymentComponentProvider, @NotNull Fragment fragment, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull ConfigurationT configurationt, @NotNull ComponentCallbackT componentcallbackt, @Nullable OrderRequest orderRequest, @Nullable String str) {
            fragment.getClass();
            storedPaymentMethod.getClass();
            configurationt.getClass();
            componentcallbackt.getClass();
            LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            return (ComponentT) storedPaymentComponentProvider.get(fragment, fragment, viewLifecycleOwner, storedPaymentMethod, configurationt, FragmentExtensionsKt.requireApplication(fragment), componentcallbackt, orderRequest, str);
        }

        @NotNull
        public static <ComponentT extends PaymentComponent, ConfigurationT extends Configuration, ComponentStateT extends PaymentComponentState<?>, ComponentCallbackT extends ComponentCallback<ComponentStateT>> ComponentT get(@NotNull StoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallbackT> storedPaymentComponentProvider, @NotNull ComponentActivity componentActivity, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull ConfigurationT configurationt, @NotNull ComponentCallbackT componentcallbackt, @Nullable OrderRequest orderRequest, @Nullable String str) {
            componentActivity.getClass();
            storedPaymentMethod.getClass();
            configurationt.getClass();
            componentcallbackt.getClass();
            Application application = componentActivity.getApplication();
            application.getClass();
            return (ComponentT) storedPaymentComponentProvider.get(componentActivity, componentActivity, componentActivity, storedPaymentMethod, configurationt, application, componentcallbackt, orderRequest, str);
        }
    }
}
