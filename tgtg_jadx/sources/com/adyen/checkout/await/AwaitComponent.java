package com.adyen.checkout.await;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.adyen.checkout.await.internal.provider.AwaitComponentProvider;
import com.adyen.checkout.await.internal.ui.AwaitDelegate;
import com.adyen.checkout.components.core.RedirectableActionComponent;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ActionComponent;
import com.adyen.checkout.components.core.internal.ActionComponentEvent;
import com.adyen.checkout.components.core.internal.ActionComponentEventHandler;
import com.adyen.checkout.components.core.internal.provider.ActionComponentProvider;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.ui.core.internal.ui.ViewableComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00010B\u0019\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0014¢\u0006\u0004\b$\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/adyen/checkout/await/AwaitComponent;", "Landroidx/lifecycle/l1;", "Lcom/adyen/checkout/components/core/internal/ActionComponent;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewableComponent;", "Lcom/adyen/checkout/components/core/RedirectableActionComponent;", "Lcom/adyen/checkout/await/internal/ui/AwaitDelegate;", "delegate", "Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;", "actionComponentEventHandler", "<init>", "(Lcom/adyen/checkout/await/internal/ui/AwaitDelegate;Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", "", "callback", "observe$await_release", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;)V", "observe", "removeObserver$await_release", "()V", "removeObserver", "Lcom/adyen/checkout/components/core/action/Action;", "action", "", "canHandleAction", "(Lcom/adyen/checkout/components/core/action/Action;)Z", "Landroid/app/Activity;", "activity", "handleAction", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "Lkotlin/Function0;", "listener", "setOnRedirectListener", "(Lkotlin/jvm/functions/Function0;)V", "onCleared", "Lcom/adyen/checkout/await/internal/ui/AwaitDelegate;", "getDelegate", "()Lcom/adyen/checkout/await/internal/ui/AwaitDelegate;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;", "getActionComponentEventHandler$await_release", "()Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;", "Ly80/i;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "getViewFlow", "()Ly80/i;", "viewFlow", "Companion", "await_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAwaitComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwaitComponent.kt\ncom/adyen/checkout/await/AwaitComponent\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,78:1\n16#2,17:79\n*S KotlinDebug\n*F\n+ 1 AwaitComponent.kt\ncom/adyen/checkout/await/AwaitComponent\n*L\n67#1:79,17\n*E\n"})
public final class AwaitComponent extends l1 implements ActionComponent, ViewableComponent, RedirectableActionComponent {

    @NotNull
    public static final ActionComponentProvider<AwaitComponent, AwaitConfiguration, AwaitDelegate> PROVIDER = new AwaitComponentProvider(null, null, null, 7, null);

    @NotNull
    private final ActionComponentEventHandler actionComponentEventHandler;

    @NotNull
    private final AwaitDelegate delegate;

    public AwaitComponent(@NotNull AwaitDelegate awaitDelegate, @NotNull ActionComponentEventHandler actionComponentEventHandler) {
        awaitDelegate.getClass();
        actionComponentEventHandler.getClass();
        this.delegate = awaitDelegate;
        this.actionComponentEventHandler = actionComponentEventHandler;
        getDelegate().initialize(m1.d(this));
    }

    @Override // com.adyen.checkout.components.core.internal.ActionComponent, com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public boolean canHandleAction(@NotNull Action action) {
        action.getClass();
        return PROVIDER.canHandleAction(action);
    }

    @NotNull
    /* JADX INFO: renamed from: getActionComponentEventHandler$await_release, reason: from getter */
    public final ActionComponentEventHandler getActionComponentEventHandler() {
        return this.actionComponentEventHandler;
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ViewableComponent
    @NotNull
    public i getViewFlow() {
        return getDelegate().getViewFlow();
    }

    @Override // com.adyen.checkout.components.core.internal.ActionComponent, com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void handleAction(@NotNull Action action, @NotNull Activity activity) {
        action.getClass();
        activity.getClass();
        getDelegate().handleAction(action, activity);
    }

    public final void observe$await_release(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super ActionComponentEvent, Unit> callback) {
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
            String name = AwaitComponent.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "onCleared", null);
        }
        getDelegate().onCleared();
    }

    public final void removeObserver$await_release() {
        getDelegate().removeObserver();
    }

    @Override // com.adyen.checkout.components.core.RedirectableActionComponent
    public void setOnRedirectListener(@NotNull Function0<Unit> listener) {
        listener.getClass();
        getDelegate().setOnRedirectListener(listener);
    }

    @Override // com.adyen.checkout.components.core.internal.Component
    @NotNull
    public AwaitDelegate getDelegate() {
        return this.delegate;
    }
}
