package com.adyen.checkout.action.core;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.adyen.checkout.action.core.internal.ActionHandlingComponent;
import com.adyen.checkout.action.core.internal.provider.GenericActionComponentProvider;
import com.adyen.checkout.action.core.internal.ui.GenericActionDelegate;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ActionComponent;
import com.adyen.checkout.components.core.internal.ActionComponentEvent;
import com.adyen.checkout.components.core.internal.ActionComponentEventHandler;
import com.adyen.checkout.components.core.internal.IntentHandlingComponent;
import com.adyen.checkout.components.core.internal.provider.ActionComponentProvider;
import com.adyen.checkout.components.core.internal.ui.ActionDelegate;
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
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00017B\u0019\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00102\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0010H\u0014¢\u0006\u0004\b)\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u000103028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/adyen/checkout/action/core/GenericActionComponent;", "Landroidx/lifecycle/l1;", "Lcom/adyen/checkout/components/core/internal/ActionComponent;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewableComponent;", "Lcom/adyen/checkout/components/core/internal/IntentHandlingComponent;", "Lcom/adyen/checkout/action/core/internal/ActionHandlingComponent;", "Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "genericActionDelegate", "Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;", "actionComponentEventHandler", "<init>", "(Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", "", "callback", "observe$action_core_release", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;)V", "observe", "removeObserver$action_core_release", "()V", "removeObserver", "Lcom/adyen/checkout/components/core/action/Action;", "action", "", "canHandleAction", "(Lcom/adyen/checkout/components/core/action/Action;)Z", "Landroid/app/Activity;", "activity", "handleAction", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "Landroid/content/Intent;", "intent", "handleIntent", "(Landroid/content/Intent;)V", "Lkotlin/Function0;", "listener", "setOnRedirectListener", "(Lkotlin/jvm/functions/Function0;)V", "onCleared", "Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;", "getActionComponentEventHandler$action_core_release", "()Lcom/adyen/checkout/components/core/internal/ActionComponentEventHandler;", "Lcom/adyen/checkout/components/core/internal/ui/ActionDelegate;", "getDelegate", "()Lcom/adyen/checkout/components/core/internal/ui/ActionDelegate;", "delegate", "Ly80/i;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "getViewFlow", "()Ly80/i;", "viewFlow", "Companion", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGenericActionComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GenericActionComponent.kt\ncom/adyen/checkout/action/core/GenericActionComponent\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,93:1\n16#2,17:94\n*S KotlinDebug\n*F\n+ 1 GenericActionComponent.kt\ncom/adyen/checkout/action/core/GenericActionComponent\n*L\n79#1:94,17\n*E\n"})
public final class GenericActionComponent extends l1 implements ActionComponent, ViewableComponent, IntentHandlingComponent, ActionHandlingComponent {

    @NotNull
    public static final ActionComponentProvider<GenericActionComponent, GenericActionConfiguration, GenericActionDelegate> PROVIDER = new GenericActionComponentProvider(null, null, null, 7, null);

    @NotNull
    private final ActionComponentEventHandler actionComponentEventHandler;

    @NotNull
    private final GenericActionDelegate genericActionDelegate;

    public GenericActionComponent(@NotNull GenericActionDelegate genericActionDelegate, @NotNull ActionComponentEventHandler actionComponentEventHandler) {
        genericActionDelegate.getClass();
        actionComponentEventHandler.getClass();
        this.genericActionDelegate = genericActionDelegate;
        this.actionComponentEventHandler = actionComponentEventHandler;
        genericActionDelegate.initialize(m1.d(this));
    }

    @Override // com.adyen.checkout.components.core.internal.ActionComponent, com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public boolean canHandleAction(@NotNull Action action) {
        action.getClass();
        return PROVIDER.canHandleAction(action);
    }

    @NotNull
    /* JADX INFO: renamed from: getActionComponentEventHandler$action_core_release, reason: from getter */
    public final ActionComponentEventHandler getActionComponentEventHandler() {
        return this.actionComponentEventHandler;
    }

    @Override // com.adyen.checkout.components.core.internal.Component
    @NotNull
    public ActionDelegate getDelegate() {
        return this.genericActionDelegate.getDelegate();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ViewableComponent
    @NotNull
    public i getViewFlow() {
        return this.genericActionDelegate.getViewFlow();
    }

    @Override // com.adyen.checkout.components.core.internal.ActionComponent, com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void handleAction(@NotNull Action action, @NotNull Activity activity) {
        action.getClass();
        activity.getClass();
        this.genericActionDelegate.handleAction(action, activity);
    }

    @Override // com.adyen.checkout.components.core.internal.IntentHandlingComponent, com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void handleIntent(@NotNull Intent intent) {
        intent.getClass();
        this.genericActionDelegate.handleIntent(intent);
    }

    public final void observe$action_core_release(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super ActionComponentEvent, Unit> callback) {
        lifecycleOwner.getClass();
        callback.getClass();
        this.genericActionDelegate.observe(lifecycleOwner, m1.d(this), callback);
    }

    @Override // androidx.lifecycle.l1
    public void onCleared() {
        super.onCleared();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = GenericActionComponent.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "onCleared", null);
        }
        this.genericActionDelegate.onCleared();
    }

    public final void removeObserver$action_core_release() {
        this.genericActionDelegate.removeObserver();
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void setOnRedirectListener(@NotNull Function0<Unit> listener) {
        listener.getClass();
        this.genericActionDelegate.setOnRedirectListener(listener);
    }
}
