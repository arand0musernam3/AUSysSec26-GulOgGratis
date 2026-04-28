package com.adyen.checkout.googlepay;

import android.app.Activity;
import android.content.Intent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import com.adyen.checkout.action.core.internal.ActionHandlingComponent;
import com.adyen.checkout.action.core.internal.DefaultActionHandlingComponent;
import com.adyen.checkout.action.core.internal.ui.GenericActionDelegate;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ActionComponentEventKt;
import com.adyen.checkout.components.core.internal.ActivityResultHandlingComponent;
import com.adyen.checkout.components.core.internal.ButtonComponent;
import com.adyen.checkout.components.core.internal.ComponentEventHandler;
import com.adyen.checkout.components.core.internal.PaymentComponent;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.googlepay.internal.provider.GooglePayComponentProvider;
import com.adyen.checkout.googlepay.internal.ui.DefaultGooglePayDelegate;
import com.adyen.checkout.googlepay.internal.ui.GooglePayDelegate;
import com.adyen.checkout.ui.core.internal.ui.ButtonDelegate;
import com.adyen.checkout.ui.core.internal.ui.ViewableComponent;
import com.adyen.checkout.ui.core.internal.util.FlowExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;
import y80.i;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 Q2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001QB/\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010\"\u001a\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190 H\u0096\u0001¢\u0006\u0004\b\"\u0010#J1\u0010+\u001a\u00020\u00192\u0006\u0010%\u001a\u00020$2\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0'\u0012\u0004\u0012\u00020\u00190&H\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010.\u001a\u00020\u0019H\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0019H\u0016¢\u0006\u0004\b3\u0010-J\u0017\u00105\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u0014H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0014H\u0016¢\u0006\u0004\b7\u00108J\r\u0010:\u001a\u000209¢\u0006\u0004\b:\u0010;J!\u0010>\u001a\u00020\u00192\u0006\u0010<\u001a\u00020/2\b\u0010=\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0019H\u0014¢\u0006\u0004\b@\u0010-R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010AR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010BR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010CR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010FR\"\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006R"}, d2 = {"Lcom/adyen/checkout/googlepay/GooglePayComponent;", "Landroidx/lifecycle/l1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponent;", "Lcom/adyen/checkout/components/core/internal/ActivityResultHandlingComponent;", "Lcom/adyen/checkout/components/core/internal/ButtonComponent;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewableComponent;", "Lcom/adyen/checkout/action/core/internal/ActionHandlingComponent;", "Lcom/adyen/checkout/googlepay/internal/ui/GooglePayDelegate;", "googlePayDelegate", "Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "genericActionDelegate", "Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;", "actionHandlingComponent", "Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "Lcom/adyen/checkout/googlepay/GooglePayComponentState;", "componentEventHandler", "<init>", "(Lcom/adyen/checkout/googlepay/internal/ui/GooglePayDelegate;Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;)V", "Lcom/adyen/checkout/components/core/action/Action;", "action", "", "canHandleAction", "(Lcom/adyen/checkout/components/core/action/Action;)Z", "Landroid/app/Activity;", "activity", "", "handleAction", "(Lcom/adyen/checkout/components/core/action/Action;Landroid/app/Activity;)V", "Landroid/content/Intent;", "intent", "handleIntent", "(Landroid/content/Intent;)V", "Lkotlin/Function0;", "listener", "setOnRedirectListener", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "callback", "observe$googlepay_release", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;)V", "observe", "removeObserver$googlepay_release", "()V", "removeObserver", "", "requestCode", "startGooglePayScreen", "(Landroid/app/Activity;I)V", "submit", "isInteractionBlocked", "setInteractionBlocked", "(Z)V", "isConfirmationRequired", "()Z", "Lcom/adyen/checkout/googlepay/GooglePayButtonParameters;", "getGooglePayButtonParameters", "()Lcom/adyen/checkout/googlepay/GooglePayButtonParameters;", StatusResponse.RESULT_CODE, Bayeux.KEY_DATA, "handleActivityResult", "(ILandroid/content/Intent;)V", "onCleared", "Lcom/adyen/checkout/googlepay/internal/ui/GooglePayDelegate;", "Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;", "Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "getComponentEventHandler$googlepay_release", "()Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "Ly80/i;", "Lcom/adyen/checkout/ui/core/internal/ui/ComponentViewType;", "viewFlow", "Ly80/i;", "getViewFlow", "()Ly80/i;", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "getDelegate", "()Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "delegate", "Companion", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGooglePayComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayComponent.kt\ncom/adyen/checkout/googlepay/GooglePayComponent\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,143:1\n16#2,17:144\n16#2,17:161\n16#2,17:178\n*S KotlinDebug\n*F\n+ 1 GooglePayComponent.kt\ncom/adyen/checkout/googlepay/GooglePayComponent\n*L\n97#1:144,17\n102#1:161,17\n128#1:178,17\n*E\n"})
public final class GooglePayComponent extends l1 implements PaymentComponent, ActivityResultHandlingComponent, ButtonComponent, ViewableComponent, ActionHandlingComponent {

    @NotNull
    private final DefaultActionHandlingComponent actionHandlingComponent;

    @NotNull
    private final ComponentEventHandler<GooglePayComponentState> componentEventHandler;

    @NotNull
    private final GenericActionDelegate genericActionDelegate;

    @NotNull
    private final GooglePayDelegate googlePayDelegate;

    @NotNull
    private final i viewFlow;

    @NotNull
    public static final GooglePayComponentProvider PROVIDER = new GooglePayComponentProvider(null, null, null, 7, null);

    @NotNull
    public static final List<String> PAYMENT_METHOD_TYPES = d0.h(PaymentMethodTypes.GOOGLE_PAY, PaymentMethodTypes.GOOGLE_PAY_LEGACY);

    public GooglePayComponent(@NotNull GooglePayDelegate googlePayDelegate, @NotNull GenericActionDelegate genericActionDelegate, @NotNull DefaultActionHandlingComponent defaultActionHandlingComponent, @NotNull ComponentEventHandler<GooglePayComponentState> componentEventHandler) {
        googlePayDelegate.getClass();
        genericActionDelegate.getClass();
        defaultActionHandlingComponent.getClass();
        componentEventHandler.getClass();
        this.googlePayDelegate = googlePayDelegate;
        this.genericActionDelegate = genericActionDelegate;
        this.actionHandlingComponent = defaultActionHandlingComponent;
        this.componentEventHandler = componentEventHandler;
        this.viewFlow = FlowExtensionsKt.mergeViewFlows$default(m1.d(this), googlePayDelegate.getViewFlow(), genericActionDelegate.getViewFlow(), null, null, 24, null);
        googlePayDelegate.initialize(m1.d(this));
        genericActionDelegate.initialize(m1.d(this));
        componentEventHandler.initialize(m1.d(this));
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public boolean canHandleAction(@NotNull Action action) {
        action.getClass();
        return this.actionHandlingComponent.canHandleAction(action);
    }

    @NotNull
    public final ComponentEventHandler<GooglePayComponentState> getComponentEventHandler$googlepay_release() {
        return this.componentEventHandler;
    }

    @Override // com.adyen.checkout.components.core.internal.Component
    @NotNull
    public ComponentDelegate getDelegate() {
        return this.actionHandlingComponent.getActiveDelegate();
    }

    @NotNull
    public final GooglePayButtonParameters getGooglePayButtonParameters() {
        return this.googlePayDelegate.getGooglePayButtonParameters();
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

    @Override // com.adyen.checkout.components.core.internal.ActivityResultHandlingComponent
    @d
    public void handleActivityResult(int resultCode, @Nullable Intent data) {
        this.googlePayDelegate.handleActivityResult(resultCode, data);
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void handleIntent(@NotNull Intent intent) {
        intent.getClass();
        this.actionHandlingComponent.handleIntent(intent);
    }

    @Override // com.adyen.checkout.components.core.internal.ButtonComponent
    public boolean isConfirmationRequired() {
        ComponentDelegate delegate = getDelegate();
        ButtonDelegate buttonDelegate = delegate instanceof ButtonDelegate ? (ButtonDelegate) delegate : null;
        if (buttonDelegate != null) {
            return buttonDelegate.isConfirmationRequired();
        }
        return false;
    }

    public final void observe$googlepay_release(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super PaymentComponentEvent<GooglePayComponentState>, Unit> callback) {
        lifecycleOwner.getClass();
        callback.getClass();
        this.googlePayDelegate.observe(lifecycleOwner, m1.d(this), callback);
        this.genericActionDelegate.observe(lifecycleOwner, m1.d(this), ActionComponentEventKt.toActionCallback(callback));
    }

    @Override // androidx.lifecycle.l1
    public void onCleared() {
        super.onCleared();
        AdyenLogLevel adyenLogLevel = AdyenLogLevel.DEBUG;
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = GooglePayComponent.class.getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "onCleared", null);
        }
        this.googlePayDelegate.onCleared();
        this.genericActionDelegate.onCleared();
        this.componentEventHandler.onCleared();
    }

    public final void removeObserver$googlepay_release() {
        this.googlePayDelegate.removeObserver();
        this.genericActionDelegate.removeObserver();
    }

    @Override // com.adyen.checkout.components.core.internal.PaymentComponent
    public void setInteractionBlocked(boolean isInteractionBlocked) {
        Unit unit;
        ComponentDelegate delegate = getDelegate();
        DefaultGooglePayDelegate defaultGooglePayDelegate = delegate instanceof DefaultGooglePayDelegate ? (DefaultGooglePayDelegate) delegate : null;
        if (defaultGooglePayDelegate != null) {
            defaultGooglePayDelegate.setInteractionBlocked$googlepay_release(isInteractionBlocked);
            unit = Unit.f26487a;
        } else {
            unit = null;
        }
        if (unit == null) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
            AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
            if (companion.getLogger().shouldLog(adyenLogLevel)) {
                String name = GooglePayComponent.class.getName();
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

    @d
    public final void startGooglePayScreen(@NotNull Activity activity, int requestCode) {
        activity.getClass();
        this.googlePayDelegate.startGooglePayScreen(activity, requestCode);
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
                String name = GooglePayComponent.class.getName();
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
