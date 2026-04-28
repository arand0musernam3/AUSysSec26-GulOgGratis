package com.adyen.checkout.card;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.adyen.checkout.action.core.internal.ActionHandlingComponent;
import com.adyen.checkout.action.core.internal.DefaultActionHandlingComponent;
import com.adyen.checkout.action.core.internal.ui.GenericActionDelegate;
import com.adyen.checkout.card.internal.provider.CardComponentProvider;
import com.adyen.checkout.card.internal.ui.CardDelegate;
import com.adyen.checkout.components.core.AddressLookupCallback;
import com.adyen.checkout.components.core.AddressLookupResult;
import com.adyen.checkout.components.core.LookupAddress;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ActionComponentEventKt;
import com.adyen.checkout.components.core.internal.AddressLookupComponent;
import com.adyen.checkout.components.core.internal.ButtonComponent;
import com.adyen.checkout.components.core.internal.ComponentEventHandler;
import com.adyen.checkout.components.core.internal.PaymentComponent;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.ui.core.internal.ui.ButtonDelegate;
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
import org.jetbrains.annotations.Nullable;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 W2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001WB/\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010\"\u001a\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190 H\u0096\u0001¢\u0006\u0004\b\"\u0010#J1\u0010)\u001a\u00020\u00192\u0006\u0010%\u001a\u00020$2\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0'\u0012\u0004\u0012\u00020\u00190&H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0019H\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0019H\u0016¢\u0006\u0004\b/\u0010,J\u0017\u00101\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0014H\u0016¢\u0006\u0004\b1\u00102J#\u00104\u001a\u00020\u00192\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0019\u0018\u00010&¢\u0006\u0004\b4\u00105J)\u00108\u001a\u00020\u00192\u001a\u0010!\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020706\u0012\u0004\u0012\u00020\u0019\u0018\u00010&¢\u0006\u0004\b8\u00105J\u0017\u0010;\u001a\u00020\u00192\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u001d\u0010?\u001a\u00020\u00192\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=06H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u00192\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u0014¢\u0006\u0004\bE\u0010.J\u000f\u0010F\u001a\u00020\u0019H\u0014¢\u0006\u0004\bF\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010GR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010HR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010IR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010J\u001a\u0004\bK\u0010LR\"\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010V\u001a\u00020S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lcom/adyen/checkout/card/CardComponent;", "Landroidx/lifecycle/l1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewableComponent;", "Lcom/adyen/checkout/components/core/internal/ButtonComponent;", "Lcom/adyen/checkout/components/core/internal/AddressLookupComponent;", "Lcom/adyen/checkout/action/core/internal/ActionHandlingComponent;", "Lcom/adyen/checkout/card/internal/ui/CardDelegate;", "cardDelegate", "Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "genericActionDelegate", "Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;", "actionHandlingComponent", "Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "Lcom/adyen/checkout/card/CardComponentState;", "componentEventHandler", "<init>", "(Lcom/adyen/checkout/card/internal/ui/CardDelegate;Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;)V", "Lcom/adyen/checkout/components/core/action/Action;", "action", "", "canHandleAction", "(Lcom/adyen/checkout/components/core/action/Action;)Z", "Landroid/app/Activity;", "activity", "", "handleAction", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "Landroid/content/Intent;", "intent", "handleIntent", "(Landroid/content/Intent;)V", "Lkotlin/Function0;", "listener", "setOnRedirectListener", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "()V", "isConfirmationRequired", "()Z", "submit", "isInteractionBlocked", "setInteractionBlocked", "(Z)V", "", "setOnBinValueListener", "(Lkotlin/jvm/functions/Function1;)V", "", "Lcom/adyen/checkout/card/BinLookupData;", "setOnBinLookupListener", "Lcom/adyen/checkout/components/core/AddressLookupCallback;", "addressLookupCallback", "setAddressLookupCallback", "(Lcom/adyen/checkout/components/core/AddressLookupCallback;)V", "Lcom/adyen/checkout/components/core/LookupAddress;", "options", "updateAddressLookupOptions", "(Ljava/util/List;)V", "Lcom/adyen/checkout/components/core/AddressLookupResult;", "addressLookupResult", "setAddressLookupResult", "(Lcom/adyen/checkout/components/core/AddressLookupResult;)V", "handleBackPress", "onCleared", "Lcom/adyen/checkout/card/internal/ui/CardDelegate;", "Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;", "Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "getComponentEventHandler$card_release", "()Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "Ly80/i;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "viewFlow", "Ly80/i;", "getViewFlow", "()Ly80/i;", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "getDelegate", "()Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "delegate", "Companion", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCardComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardComponent.kt\ncom/adyen/checkout/card/CardComponent\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,157:1\n16#2,17:158\n16#2,17:175\n16#2,17:192\n*S KotlinDebug\n*F\n+ 1 CardComponent.kt\ncom/adyen/checkout/card/CardComponent\n*L\n96#1:158,17\n101#1:175,17\n142#1:192,17\n*E\n"})
public class CardComponent extends l1 implements PaymentComponent, ViewableComponent, ButtonComponent, AddressLookupComponent, ActionHandlingComponent {

    @NotNull
    private final DefaultActionHandlingComponent actionHandlingComponent;

    @NotNull
    private final CardDelegate cardDelegate;

    @NotNull
    private final ComponentEventHandler<CardComponentState> componentEventHandler;

    @NotNull
    private final GenericActionDelegate genericActionDelegate;

    @NotNull
    private final i viewFlow;

    @NotNull
    public static final CardComponentProvider PROVIDER = new CardComponentProvider(null, null, null, 7, null);

    @NotNull
    public static final List<String> PAYMENT_METHOD_TYPES = c0.c("scheme");

    public CardComponent(@NotNull CardDelegate cardDelegate, @NotNull GenericActionDelegate genericActionDelegate, @NotNull DefaultActionHandlingComponent defaultActionHandlingComponent, @NotNull ComponentEventHandler<CardComponentState> componentEventHandler) {
        cardDelegate.getClass();
        genericActionDelegate.getClass();
        defaultActionHandlingComponent.getClass();
        componentEventHandler.getClass();
        this.cardDelegate = cardDelegate;
        this.genericActionDelegate = genericActionDelegate;
        this.actionHandlingComponent = defaultActionHandlingComponent;
        this.componentEventHandler = componentEventHandler;
        this.viewFlow = FlowExtensionsKt.mergeViewFlows$default(m1.d(this), cardDelegate.getViewFlow(), genericActionDelegate.getViewFlow(), null, null, 24, null);
        cardDelegate.initialize(m1.d(this));
        genericActionDelegate.initialize(m1.d(this));
        componentEventHandler.initialize(m1.d(this));
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public boolean canHandleAction(@NotNull Action action) {
        action.getClass();
        return this.actionHandlingComponent.canHandleAction(action);
    }

    @NotNull
    public final ComponentEventHandler<CardComponentState> getComponentEventHandler$card_release() {
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

    public final boolean handleBackPress() {
        ComponentDelegate delegate = getDelegate();
        CardDelegate cardDelegate = delegate instanceof CardDelegate ? (CardDelegate) delegate : null;
        if (cardDelegate != null) {
            return cardDelegate.handleBackPress();
        }
        return false;
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void handleIntent(@NotNull Intent intent) {
        intent.getClass();
        this.actionHandlingComponent.handleIntent(intent);
    }

    @Override // com.adyen.checkout.components.core.internal.ButtonComponent
    public boolean isConfirmationRequired() {
        return this.cardDelegate.isConfirmationRequired();
    }

    public final void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super PaymentComponentEvent<CardComponentState>, Unit> callback) {
        lifecycleOwner.getClass();
        callback.getClass();
        this.cardDelegate.observe(lifecycleOwner, m1.d(this), callback);
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
        this.cardDelegate.onCleared();
        this.genericActionDelegate.onCleared();
        this.componentEventHandler.onCleared();
    }

    public final void removeObserver() {
        this.cardDelegate.removeObserver();
        this.genericActionDelegate.removeObserver();
    }

    @Override // com.adyen.checkout.components.core.internal.AddressLookupComponent
    public void setAddressLookupCallback(@NotNull AddressLookupCallback addressLookupCallback) {
        addressLookupCallback.getClass();
        this.cardDelegate.setAddressLookupCallback(addressLookupCallback);
    }

    @Override // com.adyen.checkout.components.core.internal.AddressLookupComponent
    public void setAddressLookupResult(@NotNull AddressLookupResult addressLookupResult) {
        addressLookupResult.getClass();
        this.cardDelegate.setAddressLookupResult(addressLookupResult);
    }

    @Override // com.adyen.checkout.components.core.internal.PaymentComponent
    public void setInteractionBlocked(boolean isInteractionBlocked) {
        Unit unit;
        ComponentDelegate delegate = getDelegate();
        CardDelegate cardDelegate = delegate instanceof CardDelegate ? (CardDelegate) delegate : null;
        if (cardDelegate != null) {
            cardDelegate.setInteractionBlocked(isInteractionBlocked);
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

    public final void setOnBinLookupListener(@Nullable Function1<? super List<BinLookupData>, Unit> listener) {
        this.cardDelegate.setOnBinLookupListener(listener);
    }

    public final void setOnBinValueListener(@Nullable Function1<? super String, Unit> listener) {
        this.cardDelegate.setOnBinValueListener(listener);
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

    @Override // com.adyen.checkout.components.core.internal.AddressLookupComponent
    public void updateAddressLookupOptions(@NotNull List<LookupAddress> options) {
        options.getClass();
        this.cardDelegate.updateAddressLookupOptions(options);
    }
}
