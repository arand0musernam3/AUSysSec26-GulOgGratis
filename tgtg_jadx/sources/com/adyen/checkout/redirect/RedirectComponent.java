package com.adyen.checkout.redirect;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.adyen.checkout.components.core.RedirectableActionComponent;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ActionComponent;
import com.adyen.checkout.components.core.internal.ActionComponentEvent;
import com.adyen.checkout.components.core.internal.ActionComponentEventHandler;
import com.adyen.checkout.components.core.internal.IntentHandlingComponent;
import com.adyen.checkout.components.core.internal.provider.ActionComponentProvider;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.redirect.internal.provider.RedirectComponentProvider;
import com.adyen.checkout.redirect.internal.ui.RedirectDelegate;
import com.adyen.checkout.ui.core.internal.ui.ViewableComponent;
import e0.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00016B\u0019\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00102\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0010H\u0014¢\u0006\u0004\b)\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\"\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u000101008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/adyen/checkout/redirect/RedirectComponent;", "Landroidx/lifecycle/l1;", "Lcom/adyen/checkout/components/core/internal/ActionComponent;", "Lcom/adyen/checkout/components/core/internal/IntentHandlingComponent;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewableComponent;", "Lcom/adyen/checkout/components/core/RedirectableActionComponent;", "Lcom/adyen/checkout/redirect/internal/ui/RedirectDelegate;", "delegate", "Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;", "actionComponentEventHandler", "<init>", "(Lcom/adyen/checkout/redirect/internal/ui/RedirectDelegate;Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", "", "callback", "observe$redirect_release", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;)V", "observe", "removeObserver$redirect_release", "()V", "removeObserver", "Lcom/adyen/checkout/components/core/action/Action;", "action", "", "canHandleAction", "(Lcom/adyen/checkout/components/core/action/Action;)Z", "Landroid/app/Activity;", "activity", "handleAction", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "Landroid/content/Intent;", "intent", "handleIntent", "(Landroid/content/Intent;)V", "Lkotlin/Function0;", "listener", "setOnRedirectListener", "(Lkotlin/jvm/functions/Function0;)V", "onCleared", "Lcom/adyen/checkout/redirect/internal/ui/RedirectDelegate;", "getDelegate", "()Lcom/adyen/checkout/redirect/internal/ui/RedirectDelegate;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;", "getActionComponentEventHandler$redirect_release", "()Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;", "Ly80/i;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "viewFlow", "Ly80/i;", "getViewFlow", "()Ly80/i;", "Companion", "redirect_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRedirectComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedirectComponent.kt\ncom/adyen/checkout/redirect/RedirectComponent\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,108:1\n16#2,17:109\n*S KotlinDebug\n*F\n+ 1 RedirectComponent.kt\ncom/adyen/checkout/redirect/RedirectComponent\n*L\n81#1:109,17\n*E\n"})
public final class RedirectComponent extends l1 implements ActionComponent, IntentHandlingComponent, ViewableComponent, RedirectableActionComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final ActionComponentProvider<RedirectComponent, RedirectConfiguration, RedirectDelegate> PROVIDER = new RedirectComponentProvider(null, null, null, 7, null);

    @NotNull
    public static final String REDIRECT_RESULT_SCHEME = "adyencheckout://";

    @NotNull
    private final ActionComponentEventHandler actionComponentEventHandler;

    @NotNull
    private final RedirectDelegate delegate;

    @NotNull
    private final i viewFlow;

    public RedirectComponent(@NotNull RedirectDelegate redirectDelegate, @NotNull ActionComponentEventHandler actionComponentEventHandler) {
        redirectDelegate.getClass();
        actionComponentEventHandler.getClass();
        this.delegate = redirectDelegate;
        this.actionComponentEventHandler = actionComponentEventHandler;
        this.viewFlow = getDelegate().getViewFlow();
        getDelegate().initialize(m1.d(this));
    }

    @Override // com.adyen.checkout.components.core.internal.ActionComponent, com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public boolean canHandleAction(@NotNull Action action) {
        action.getClass();
        return PROVIDER.canHandleAction(action);
    }

    @NotNull
    /* JADX INFO: renamed from: getActionComponentEventHandler$redirect_release, reason: from getter */
    public final ActionComponentEventHandler getActionComponentEventHandler() {
        return this.actionComponentEventHandler;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ViewableComponent
    @NotNull
    public i getViewFlow() {
        return this.viewFlow;
    }

    @Override // com.adyen.checkout.components.core.internal.ActionComponent, com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void handleAction(@NotNull Action action, @NotNull Activity activity) {
        action.getClass();
        activity.getClass();
        getDelegate().handleAction(action, activity);
    }

    @Override // com.adyen.checkout.components.core.internal.IntentHandlingComponent, com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void handleIntent(@NotNull Intent intent) {
        intent.getClass();
        getDelegate().handleIntent(intent);
    }

    public final void observe$redirect_release(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super ActionComponentEvent, Unit> callback) {
        lifecycleOwner.getClass();
        callback.getClass();
        getDelegate().observe(lifecycleOwner, m1.d(this), callback);
    }

    @Override // androidx.lifecycle.l1
    public void onCleared() {
        super.onCleared();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = RedirectComponent.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "onCleared", null);
        }
        getDelegate().onCleared();
    }

    public final void removeObserver$redirect_release() {
        getDelegate().removeObserver();
    }

    @Override // com.adyen.checkout.components.core.RedirectableActionComponent
    public void setOnRedirectListener(@NotNull Function0<Unit> listener) {
        listener.getClass();
        getDelegate().setOnRedirectListener(listener);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fR\"\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/redirect/RedirectComponent$Companion;", "", "()V", "PROVIDER", "Lcom/adyen/checkout/components/core/internal/provider/ActionComponentProvider;", "Lcom/adyen/checkout/redirect/RedirectComponent;", "Lcom/adyen/checkout/redirect/RedirectConfiguration;", "Lcom/adyen/checkout/redirect/internal/ui/RedirectDelegate;", "REDIRECT_RESULT_SCHEME", "", "getReturnUrl", "context", "Landroid/content/Context;", "redirect_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getReturnUrl(@NotNull Context context) {
            context.getClass();
            return f.k(RedirectComponent.REDIRECT_RESULT_SCHEME, context.getPackageName());
        }

        private Companion() {
        }
    }

    @Override // com.adyen.checkout.components.core.internal.Component
    @NotNull
    public RedirectDelegate getDelegate() {
        return this.delegate;
    }
}
