package com.adyen.checkout.issuerlist.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.adyen.checkout.action.core.internal.ActionHandlingComponent;
import com.adyen.checkout.action.core.internal.DefaultActionHandlingComponent;
import com.adyen.checkout.action.core.internal.ui.GenericActionDelegate;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ActionComponentEventKt;
import com.adyen.checkout.components.core.internal.ButtonComponent;
import com.adyen.checkout.components.core.internal.ComponentEventHandler;
import com.adyen.checkout.components.core.internal.PaymentComponent;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.components.core.paymentmethod.IssuerListPaymentMethod;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.issuerlist.internal.ui.IssuerListDelegate;
import com.adyen.checkout.ui.core.internal.ui.ButtonDelegate;
import com.adyen.checkout.ui.core.internal.ui.ViewableComponent;
import com.adyen.checkout.ui.core.internal.util.FlowExtensionsKt;
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
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\tB;\b\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b \u0010!J\u001e\u0010$\u001a\u00020\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\"H\u0096\u0001¢\u0006\u0004\b$\u0010%J1\u0010-\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&2\u0018\u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010)\u0012\u0004\u0012\u00020\u001b0(H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u00100\u001a\u00020\u001bH\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u00020\u0016H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u001bH\u0016¢\u0006\u0004\b3\u0010/J\u0017\u00105\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u0016H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001bH\u0014¢\u0006\u0004\b7\u0010/R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00108R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00109R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010:R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b<\u0010=R\"\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0011\u0010G\u001a\u00020D8F¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/IssuerListComponent;", "Lcom/adyen/checkout/components/core/paymentmethod/IssuerListPaymentMethod;", "IssuerListPaymentMethodT", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "ComponentStateT", "Landroidx/lifecycle/l1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewableComponent;", "Lcom/adyen/checkout/components/core/internal/ButtonComponent;", "Lcom/adyen/checkout/action/core/internal/ActionHandlingComponent;", "Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListDelegate;", "issuerListDelegate", "Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "genericActionDelegate", "Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;", "actionHandlingComponent", "Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "componentEventHandler", "<init>", "(Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListDelegate;Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;)V", "Lcom/adyen/checkout/components/core/action/Action;", "action", "", "canHandleAction", "(Lcom/adyen/checkout/components/core/action/Action;)Z", "Landroid/app/Activity;", "activity", "", "handleAction", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "Landroid/content/Intent;", "intent", "handleIntent", "(Landroid/content/Intent;)V", "Lkotlin/Function0;", "listener", "setOnRedirectListener", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "callback", "observe$issuer_list_release", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;)V", "observe", "removeObserver$issuer_list_release", "()V", "removeObserver", "isConfirmationRequired", "()Z", "submit", "isInteractionBlocked", "setInteractionBlocked", "(Z)V", "onCleared", "Lcom/adyen/checkout/issuerlist/internal/ui/IssuerListDelegate;", "Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;", "Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "getComponentEventHandler$issuer_list_release", "()Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "Ly80/i;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "viewFlow", "Ly80/i;", "getViewFlow", "()Ly80/i;", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "getDelegate", "()Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "delegate", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIssuerListComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssuerListComponent.kt\ncom/adyen/checkout/issuerlist/internal/IssuerListComponent\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,97:1\n16#2,17:98\n16#2,17:115\n16#2,17:132\n*S KotlinDebug\n*F\n+ 1 IssuerListComponent.kt\ncom/adyen/checkout/issuerlist/internal/IssuerListComponent\n*L\n81#1:98,17\n86#1:115,17\n91#1:132,17\n*E\n"})
public abstract class IssuerListComponent<IssuerListPaymentMethodT extends IssuerListPaymentMethod, ComponentStateT extends PaymentComponentState<IssuerListPaymentMethodT>> extends l1 implements PaymentComponent, ViewableComponent, ButtonComponent, ActionHandlingComponent {

    @NotNull
    private final DefaultActionHandlingComponent actionHandlingComponent;

    @NotNull
    private final ComponentEventHandler<ComponentStateT> componentEventHandler;

    @NotNull
    private final GenericActionDelegate genericActionDelegate;

    @NotNull
    private final IssuerListDelegate<IssuerListPaymentMethodT, ComponentStateT> issuerListDelegate;

    @NotNull
    private final i viewFlow;

    public IssuerListComponent(@NotNull IssuerListDelegate<IssuerListPaymentMethodT, ComponentStateT> issuerListDelegate, @NotNull GenericActionDelegate genericActionDelegate, @NotNull DefaultActionHandlingComponent defaultActionHandlingComponent, @NotNull ComponentEventHandler<ComponentStateT> componentEventHandler) {
        issuerListDelegate.getClass();
        genericActionDelegate.getClass();
        defaultActionHandlingComponent.getClass();
        componentEventHandler.getClass();
        this.issuerListDelegate = issuerListDelegate;
        this.genericActionDelegate = genericActionDelegate;
        this.actionHandlingComponent = defaultActionHandlingComponent;
        this.componentEventHandler = componentEventHandler;
        this.viewFlow = FlowExtensionsKt.mergeViewFlows$default(m1.d(this), issuerListDelegate.getViewFlow(), genericActionDelegate.getViewFlow(), null, null, 24, null);
        issuerListDelegate.initialize(m1.d(this));
        genericActionDelegate.initialize(m1.d(this));
        componentEventHandler.initialize(m1.d(this));
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public boolean canHandleAction(@NotNull Action action) {
        action.getClass();
        return this.actionHandlingComponent.canHandleAction(action);
    }

    @NotNull
    public final ComponentEventHandler<ComponentStateT> getComponentEventHandler$issuer_list_release() {
        return this.componentEventHandler;
    }

    @Override // com.adyen.checkout.components.core.internal.Component
    @NotNull
    public final ComponentDelegate getDelegate() {
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
    public boolean isConfirmationRequired() {
        return this.issuerListDelegate.isConfirmationRequired();
    }

    public final void observe$issuer_list_release(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super PaymentComponentEvent<ComponentStateT>, Unit> callback) {
        lifecycleOwner.getClass();
        callback.getClass();
        this.issuerListDelegate.observe(lifecycleOwner, m1.d(this), callback);
        this.genericActionDelegate.observe(lifecycleOwner, m1.d(this), ActionComponentEventKt.toActionCallback(callback));
    }

    @Override // androidx.lifecycle.l1
    public void onCleared() {
        super.onCleared();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = getClass().getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "onCleared", null);
        }
        this.issuerListDelegate.onCleared();
        this.genericActionDelegate.onCleared();
        this.componentEventHandler.onCleared();
    }

    public final void removeObserver$issuer_list_release() {
        this.issuerListDelegate.removeObserver();
        this.genericActionDelegate.removeObserver();
    }

    @Override // com.adyen.checkout.components.core.internal.PaymentComponent
    public void setInteractionBlocked(boolean isInteractionBlocked) {
        Unit unit;
        ComponentDelegate delegate = getDelegate();
        IssuerListDelegate issuerListDelegate = delegate instanceof IssuerListDelegate ? (IssuerListDelegate) delegate : null;
        if (issuerListDelegate != null) {
            issuerListDelegate.setInteractionBlocked(isInteractionBlocked);
            unit = Unit.f26487a;
        } else {
            unit = null;
        }
        if (unit == null) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = getClass().getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Payment component is not interactable, ignoring.", null);
            }
        }
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void setOnRedirectListener(@NotNull Function0<Unit> listener) {
        listener.getClass();
        this.actionHandlingComponent.setOnRedirectListener(listener);
    }

    @Override // com.adyen.checkout.components.core.internal.ButtonComponent
    public void submit() {
        Unit unit;
        ComponentDelegate delegate = getDelegate();
        ButtonDelegate buttonDelegate = delegate instanceof ButtonDelegate ? (ButtonDelegate) delegate : null;
        if (buttonDelegate != null) {
            buttonDelegate.onSubmit();
            unit = Unit.f26487a;
        } else {
            unit = null;
        }
        if (unit == null) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = getClass().getName();
                String strY = StringsKt.Y(name, '$');
                String strW = StringsKt.W('.', strY, strY);
                if (strW.length() != 0) {
                    name = StringsKt.O(strW, "Kt");
                }
                companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Component is currently not submittable, ignoring.", null);
            }
        }
    }
}
