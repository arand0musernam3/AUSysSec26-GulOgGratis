package com.adyen.checkout.ideal;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.adyen.checkout.action.core.internal.ActionHandlingComponent;
import com.adyen.checkout.action.core.internal.DefaultActionHandlingComponent;
import com.adyen.checkout.action.core.internal.ui.GenericActionDelegate;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ActionComponentEventKt;
import com.adyen.checkout.components.core.internal.ButtonComponent;
import com.adyen.checkout.components.core.internal.ComponentEventHandler;
import com.adyen.checkout.components.core.internal.PaymentComponent;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.ideal.internal.provider.IdealComponentProvider;
import com.adyen.checkout.ideal.internal.ui.IdealDelegate;
import com.adyen.checkout.ui.core.internal.ui.ViewableComponent;
import com.adyen.checkout.ui.core.internal.util.FlowExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import u70.d;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001EB/\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010!\u001a\u00020\u00182\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u001fH\u0096\u0001¢\u0006\u0004\b!\u0010\"J1\u0010*\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#2\u0018\u0010'\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0&\u0012\u0004\u0012\u00020\u00180%H\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010-\u001a\u00020\u0018H\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0013H\u0017¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0018H\u0017¢\u0006\u0004\b3\u0010,J\u000f\u00104\u001a\u00020\u0018H\u0014¢\u0006\u0004\b4\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00107R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010:R\"\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lcom/adyen/checkout/ideal/IdealComponent;", "Landroidx/lifecycle/l1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewableComponent;", "Lcom/adyen/checkout/components/core/internal/ButtonComponent;", "Lcom/adyen/checkout/action/core/internal/ActionHandlingComponent;", "Lcom/adyen/checkout/ideal/internal/ui/IdealDelegate;", "idealDelegate", "Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "genericActionDelegate", "Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;", "actionHandlingComponent", "Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "Lcom/adyen/checkout/ideal/IdealComponentState;", "componentEventHandler", "<init>", "(Lcom/adyen/checkout/ideal/internal/ui/IdealDelegate;Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;)V", "Lcom/adyen/checkout/components/core/action/Action;", "action", "", "canHandleAction", "(Lcom/adyen/checkout/components/core/action/Action;)Z", "Landroid/app/Activity;", "activity", "", "handleAction", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "Landroid/content/Intent;", "intent", "handleIntent", "(Landroid/content/Intent;)V", "Lkotlin/Function0;", "listener", "setOnRedirectListener", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "callback", "observe$ideal_release", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;)V", "observe", "removeObserver$ideal_release", "()V", "removeObserver", "isInteractionBlocked", "setInteractionBlocked", "(Z)V", "isConfirmationRequired", "()Z", "submit", "onCleared", "Lcom/adyen/checkout/ideal/internal/ui/IdealDelegate;", "Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;", "Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "getComponentEventHandler$ideal_release", "()Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "Ly80/i;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "viewFlow", "Ly80/i;", "getViewFlow", "()Ly80/i;", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "getDelegate", "()Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "delegate", "Companion", "ideal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIdealComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdealComponent.kt\ncom/adyen/checkout/ideal/IdealComponent\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,98:1\n16#2,17:99\n*S KotlinDebug\n*F\n+ 1 IdealComponent.kt\ncom/adyen/checkout/ideal/IdealComponent\n*L\n84#1:99,17\n*E\n"})
public final class IdealComponent extends l1 implements PaymentComponent, ViewableComponent, ButtonComponent, ActionHandlingComponent {

    @NotNull
    private final DefaultActionHandlingComponent actionHandlingComponent;

    @NotNull
    private final ComponentEventHandler<IdealComponentState> componentEventHandler;

    @NotNull
    private final GenericActionDelegate genericActionDelegate;

    @NotNull
    private final IdealDelegate idealDelegate;

    @NotNull
    private final i viewFlow;

    @NotNull
    public static final IdealComponentProvider PROVIDER = new IdealComponentProvider(null, null, null, 7, null);

    @NotNull
    public static final List<String> PAYMENT_METHOD_TYPES = c0.c("ideal");

    public IdealComponent(@NotNull IdealDelegate idealDelegate, @NotNull GenericActionDelegate genericActionDelegate, @NotNull DefaultActionHandlingComponent defaultActionHandlingComponent, @NotNull ComponentEventHandler<IdealComponentState> componentEventHandler) {
        idealDelegate.getClass();
        genericActionDelegate.getClass();
        defaultActionHandlingComponent.getClass();
        componentEventHandler.getClass();
        this.idealDelegate = idealDelegate;
        this.genericActionDelegate = genericActionDelegate;
        this.actionHandlingComponent = defaultActionHandlingComponent;
        this.componentEventHandler = componentEventHandler;
        this.viewFlow = FlowExtensionsKt.mergeViewFlows$default(m1.d(this), idealDelegate.getViewFlow(), genericActionDelegate.getViewFlow(), null, null, 24, null);
        idealDelegate.initialize(m1.d(this));
        genericActionDelegate.initialize(m1.d(this));
        componentEventHandler.initialize(m1.d(this));
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public boolean canHandleAction(@NotNull Action action) {
        action.getClass();
        return this.actionHandlingComponent.canHandleAction(action);
    }

    @NotNull
    public final ComponentEventHandler<IdealComponentState> getComponentEventHandler$ideal_release() {
        return this.componentEventHandler;
    }

    @Override // com.adyen.checkout.components.core.internal.Component
    @NotNull
    public ComponentDelegate getDelegate() {
        return this.actionHandlingComponent.getActiveDelegate();
    }

    @Override // com.adyen.checkout.ui.core.internal.ui.ViewableComponent
    @NotNull
    public i getViewFlow() {
        return this.viewFlow;
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void handleAction(@NotNull Action action, @NotNull Activity activity) {
        action.getClass();
        activity.getClass();
        this.actionHandlingComponent.handleAction(action, activity);
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void handleIntent(@NotNull Intent intent) {
        intent.getClass();
        this.actionHandlingComponent.handleIntent(intent);
    }

    @Override // com.adyen.checkout.components.core.internal.ButtonComponent
    @d
    public boolean isConfirmationRequired() {
        return false;
    }

    public final void observe$ideal_release(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super PaymentComponentEvent<IdealComponentState>, Unit> callback) {
        lifecycleOwner.getClass();
        callback.getClass();
        this.idealDelegate.observe(lifecycleOwner, m1.d(this), callback);
        this.genericActionDelegate.observe(lifecycleOwner, m1.d(this), ActionComponentEventKt.toActionCallback(callback));
    }

    @Override // androidx.lifecycle.l1
    public void onCleared() {
        super.onCleared();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = IdealComponent.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "onCleared", null);
        }
        this.idealDelegate.onCleared();
        this.genericActionDelegate.onCleared();
        this.componentEventHandler.onCleared();
    }

    public final void removeObserver$ideal_release() {
        this.idealDelegate.removeObserver();
        this.genericActionDelegate.removeObserver();
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void setOnRedirectListener(@NotNull Function0<Unit> listener) {
        listener.getClass();
        this.actionHandlingComponent.setOnRedirectListener(listener);
    }

    @Override // com.adyen.checkout.components.core.internal.ButtonComponent
    @d
    public void submit() {
    }

    @Override // com.adyen.checkout.components.core.internal.PaymentComponent
    public void setInteractionBlocked(boolean isInteractionBlocked) {
    }
}
