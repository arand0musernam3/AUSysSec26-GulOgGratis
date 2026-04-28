package com.adyen.checkout.sessions.core.internal.provider;

import android.app.Application;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.s1;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.StoredPaymentMethod;
import com.adyen.checkout.components.core.internal.Configuration;
import com.adyen.checkout.components.core.internal.PaymentComponent;
import com.adyen.checkout.components.core.internal.util.FragmentExtensionsKt;
import com.adyen.checkout.sessions.core.CheckoutSession;
import com.adyen.checkout.sessions.core.SessionComponentCallback;
import com.braze.h2;
import ea.f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\f\b\u0002\u0010\u0006*\u0006\u0012\u0002\b\u00030\u0005*\u000e\b\u0003\u0010\b*\b\u0012\u0004\u0012\u00028\u00020\u00072\u00020\tJC\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00028\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0017JC\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u001aJ;\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00028\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u001bJY\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00028\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0015\u0010$JC\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010%\u001a\u00028\u00012\u0006\u0010\u0012\u001a\u00028\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010&JC\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010%\u001a\u00028\u00012\u0006\u0010\u0012\u001a\u00028\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010'JY\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010%\u001a\u00028\u00012\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00028\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0015\u0010(¨\u0006)"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/provider/SessionStoredPaymentComponentProvider;", "Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "ComponentT", "Lcom/adyen/checkout/components/core/internal/Configuration;", "ConfigurationT", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "ComponentStateT", "Lcom/adyen/checkout/sessions/core/SessionComponentCallback;", "ComponentCallbackT", "", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/adyen/checkout/sessions/core/CheckoutSession;", "checkoutSession", "Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "storedPaymentMethod", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "checkoutConfiguration", "componentCallback", "", "key", "get", "(Landroidx/fragment/app/Fragment;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "(Landroidx/fragment/app/Fragment;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "Landroidx/activity/ComponentActivity;", "activity", "(Landroidx/activity/ComponentActivity;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "(Landroidx/activity/ComponentActivity;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "Lea/f;", "savedStateRegistryOwner", "Landroidx/lifecycle/s1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroid/app/Application;", "application", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/CheckoutConfiguration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "configuration", "(Landroidx/fragment/app/Fragment;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/internal/Configuration;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "(Landroidx/activity/ComponentActivity;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/internal/Configuration;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "(Lea/f;Landroidx/lifecycle/s1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/sessions/core/CheckoutSession;Lcom/adyen/checkout/components/core/StoredPaymentMethod;Lcom/adyen/checkout/components/core/internal/Configuration;Landroid/app/Application;Lcom/adyen/checkout/sessions/core/SessionComponentCallback;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SessionStoredPaymentComponentProvider<ComponentT extends PaymentComponent, ConfigurationT extends Configuration, ComponentStateT extends PaymentComponentState<?>, ComponentCallbackT extends SessionComponentCallback<ComponentStateT>> {
    @NotNull
    ComponentT get(@NotNull ComponentActivity activity, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallbackT componentCallback, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull ComponentActivity activity, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull ConfigurationT configuration, @NotNull ComponentCallbackT componentCallback, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull ComponentActivity activity, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull ComponentCallbackT componentCallback, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallbackT componentCallback, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull ConfigurationT configuration, @NotNull ComponentCallbackT componentCallback, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull ComponentCallbackT componentCallback, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull Application application, @NotNull ComponentCallbackT componentCallback, @Nullable String key);

    @NotNull
    ComponentT get(@NotNull f savedStateRegistryOwner, @NotNull s1 viewModelStoreOwner, @NotNull LifecycleOwner lifecycleOwner, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull ConfigurationT configuration, @NotNull Application application, @NotNull ComponentCallbackT componentCallback, @Nullable String key);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static <ComponentT extends PaymentComponent, ConfigurationT extends Configuration, ComponentStateT extends PaymentComponentState<?>, ComponentCallbackT extends SessionComponentCallback<ComponentStateT>> ComponentT get(@NotNull SessionStoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallbackT> sessionStoredPaymentComponentProvider, @NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallbackT componentcallbackt, @Nullable String str) {
            fragment.getClass();
            checkoutSession.getClass();
            storedPaymentMethod.getClass();
            checkoutConfiguration.getClass();
            componentcallbackt.getClass();
            LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            return (ComponentT) sessionStoredPaymentComponentProvider.get((f) fragment, (s1) fragment, viewLifecycleOwner, checkoutSession, storedPaymentMethod, checkoutConfiguration, FragmentExtensionsKt.requireApplication(fragment), (SessionComponentCallback) componentcallbackt, str);
        }

        public static /* synthetic */ PaymentComponent get$default(SessionStoredPaymentComponentProvider sessionStoredPaymentComponentProvider, Fragment fragment, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: get");
                return null;
            }
            if ((i11 & 32) != 0) {
                str = null;
            }
            return sessionStoredPaymentComponentProvider.get(fragment, checkoutSession, storedPaymentMethod, checkoutConfiguration, sessionComponentCallback, str);
        }

        public static /* synthetic */ PaymentComponent get$default(SessionStoredPaymentComponentProvider sessionStoredPaymentComponentProvider, Fragment fragment, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, SessionComponentCallback sessionComponentCallback, String str, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: get");
                return null;
            }
            if ((i11 & 16) != 0) {
                str = null;
            }
            return sessionStoredPaymentComponentProvider.get(fragment, checkoutSession, storedPaymentMethod, sessionComponentCallback, str);
        }

        public static /* synthetic */ PaymentComponent get$default(SessionStoredPaymentComponentProvider sessionStoredPaymentComponentProvider, ComponentActivity componentActivity, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, CheckoutConfiguration checkoutConfiguration, SessionComponentCallback sessionComponentCallback, String str, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: get");
                return null;
            }
            if ((i11 & 32) != 0) {
                str = null;
            }
            return sessionStoredPaymentComponentProvider.get(componentActivity, checkoutSession, storedPaymentMethod, checkoutConfiguration, sessionComponentCallback, str);
        }

        public static /* synthetic */ PaymentComponent get$default(SessionStoredPaymentComponentProvider sessionStoredPaymentComponentProvider, ComponentActivity componentActivity, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, SessionComponentCallback sessionComponentCallback, String str, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: get");
                return null;
            }
            if ((i11 & 16) != 0) {
                str = null;
            }
            return sessionStoredPaymentComponentProvider.get(componentActivity, checkoutSession, storedPaymentMethod, sessionComponentCallback, str);
        }

        public static /* synthetic */ PaymentComponent get$default(SessionStoredPaymentComponentProvider sessionStoredPaymentComponentProvider, Fragment fragment, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: get");
                return null;
            }
            if ((i11 & 32) != 0) {
                str = null;
            }
            return sessionStoredPaymentComponentProvider.get(fragment, checkoutSession, storedPaymentMethod, configuration, sessionComponentCallback, str);
        }

        public static /* synthetic */ PaymentComponent get$default(SessionStoredPaymentComponentProvider sessionStoredPaymentComponentProvider, ComponentActivity componentActivity, CheckoutSession checkoutSession, StoredPaymentMethod storedPaymentMethod, Configuration configuration, SessionComponentCallback sessionComponentCallback, String str, int i11, Object obj) {
            if (obj != null) {
                h2.a("Super calls with default arguments not supported in this target, function: get");
                return null;
            }
            if ((i11 & 32) != 0) {
                str = null;
            }
            return sessionStoredPaymentComponentProvider.get(componentActivity, checkoutSession, storedPaymentMethod, configuration, sessionComponentCallback, str);
        }

        @NotNull
        public static <ComponentT extends PaymentComponent, ConfigurationT extends Configuration, ComponentStateT extends PaymentComponentState<?>, ComponentCallbackT extends SessionComponentCallback<ComponentStateT>> ComponentT get(@NotNull SessionStoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallbackT> sessionStoredPaymentComponentProvider, @NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull ComponentCallbackT componentcallbackt, @Nullable String str) {
            fragment.getClass();
            checkoutSession.getClass();
            storedPaymentMethod.getClass();
            componentcallbackt.getClass();
            return (ComponentT) get$default((SessionStoredPaymentComponentProvider) sessionStoredPaymentComponentProvider, fragment, checkoutSession, storedPaymentMethod, checkoutSession.getConfiguration(), (SessionComponentCallback) componentcallbackt, (String) null, 32, (Object) null);
        }

        @NotNull
        public static <ComponentT extends PaymentComponent, ConfigurationT extends Configuration, ComponentStateT extends PaymentComponentState<?>, ComponentCallbackT extends SessionComponentCallback<ComponentStateT>> ComponentT get(@NotNull SessionStoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallbackT> sessionStoredPaymentComponentProvider, @NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentCallbackT componentcallbackt, @Nullable String str) {
            componentActivity.getClass();
            checkoutSession.getClass();
            storedPaymentMethod.getClass();
            checkoutConfiguration.getClass();
            componentcallbackt.getClass();
            Application application = componentActivity.getApplication();
            application.getClass();
            return (ComponentT) sessionStoredPaymentComponentProvider.get((f) componentActivity, (s1) componentActivity, (LifecycleOwner) componentActivity, checkoutSession, storedPaymentMethod, checkoutConfiguration, application, (SessionComponentCallback) componentcallbackt, str);
        }

        @NotNull
        public static <ComponentT extends PaymentComponent, ConfigurationT extends Configuration, ComponentStateT extends PaymentComponentState<?>, ComponentCallbackT extends SessionComponentCallback<ComponentStateT>> ComponentT get(@NotNull SessionStoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallbackT> sessionStoredPaymentComponentProvider, @NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull ComponentCallbackT componentcallbackt, @Nullable String str) {
            componentActivity.getClass();
            checkoutSession.getClass();
            storedPaymentMethod.getClass();
            componentcallbackt.getClass();
            return (ComponentT) get$default((SessionStoredPaymentComponentProvider) sessionStoredPaymentComponentProvider, componentActivity, checkoutSession, storedPaymentMethod, checkoutSession.getConfiguration(), (SessionComponentCallback) componentcallbackt, (String) null, 32, (Object) null);
        }

        @NotNull
        public static <ComponentT extends PaymentComponent, ConfigurationT extends Configuration, ComponentStateT extends PaymentComponentState<?>, ComponentCallbackT extends SessionComponentCallback<ComponentStateT>> ComponentT get(@NotNull SessionStoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallbackT> sessionStoredPaymentComponentProvider, @NotNull Fragment fragment, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull ConfigurationT configurationt, @NotNull ComponentCallbackT componentcallbackt, @Nullable String str) {
            fragment.getClass();
            checkoutSession.getClass();
            storedPaymentMethod.getClass();
            configurationt.getClass();
            componentcallbackt.getClass();
            LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            return (ComponentT) sessionStoredPaymentComponentProvider.get(fragment, fragment, viewLifecycleOwner, checkoutSession, storedPaymentMethod, configurationt, FragmentExtensionsKt.requireApplication(fragment), componentcallbackt, str);
        }

        @NotNull
        public static <ComponentT extends PaymentComponent, ConfigurationT extends Configuration, ComponentStateT extends PaymentComponentState<?>, ComponentCallbackT extends SessionComponentCallback<ComponentStateT>> ComponentT get(@NotNull SessionStoredPaymentComponentProvider<ComponentT, ConfigurationT, ComponentStateT, ComponentCallbackT> sessionStoredPaymentComponentProvider, @NotNull ComponentActivity componentActivity, @NotNull CheckoutSession checkoutSession, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull ConfigurationT configurationt, @NotNull ComponentCallbackT componentcallbackt, @Nullable String str) {
            componentActivity.getClass();
            checkoutSession.getClass();
            storedPaymentMethod.getClass();
            configurationt.getClass();
            componentcallbackt.getClass();
            Application application = componentActivity.getApplication();
            application.getClass();
            return (ComponentT) sessionStoredPaymentComponentProvider.get(componentActivity, componentActivity, componentActivity, checkoutSession, storedPaymentMethod, configurationt, application, componentcallbackt, str);
        }
    }
}
