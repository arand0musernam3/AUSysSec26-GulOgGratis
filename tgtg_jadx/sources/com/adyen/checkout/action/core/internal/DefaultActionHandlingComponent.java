package com.adyen.checkout.action.core.internal;

import android.app.Activity;
import android.content.Intent;
import com.adyen.checkout.action.core.GenericActionComponent;
import com.adyen.checkout.action.core.internal.ui.GenericActionDelegate;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ui.ComponentDelegate;
import com.adyen.checkout.components.core.internal.ui.PaymentComponentDelegate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\u00020\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0016R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/adyen/checkout/action/core/internal/DefaultActionHandlingComponent;", "Lcom/adyen/checkout/action/core/internal/ActionHandlingComponent;", "genericActionDelegate", "Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "paymentDelegate", "Lcom/adyen/checkout/components/core/internal/ui/PaymentComponentDelegate;", "(Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;Lcom/adyen/checkout/components/core/internal/ui/PaymentComponentDelegate;)V", "activeDelegate", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "getActiveDelegate", "()Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "isHandlingAction", "", "canHandleAction", "action", "Lcom/adyen/checkout/components/core/action/Action;", "handleAction", "", "activity", "Landroid/app/Activity;", "handleIntent", "intent", "Landroid/content/Intent;", "setOnRedirectListener", "listener", "Lkotlin/Function0;", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultActionHandlingComponent implements ActionHandlingComponent {

    @NotNull
    private final GenericActionDelegate genericActionDelegate;
    private boolean isHandlingAction;

    @NotNull
    private final PaymentComponentDelegate<?> paymentDelegate;

    public DefaultActionHandlingComponent(@NotNull GenericActionDelegate genericActionDelegate, @NotNull PaymentComponentDelegate<?> paymentComponentDelegate) {
        genericActionDelegate.getClass();
        paymentComponentDelegate.getClass();
        this.genericActionDelegate = genericActionDelegate;
        this.paymentDelegate = paymentComponentDelegate;
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public boolean canHandleAction(@NotNull Action action) {
        action.getClass();
        return GenericActionComponent.PROVIDER.canHandleAction(action);
    }

    @NotNull
    public final ComponentDelegate getActiveDelegate() {
        return this.isHandlingAction ? this.genericActionDelegate.getDelegate() : this.paymentDelegate;
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void handleAction(@NotNull Action action, @NotNull Activity activity) {
        action.getClass();
        activity.getClass();
        this.isHandlingAction = true;
        this.genericActionDelegate.handleAction(action, activity);
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void handleIntent(@NotNull Intent intent) {
        intent.getClass();
        this.genericActionDelegate.handleIntent(intent);
    }

    @Override // com.adyen.checkout.action.core.internal.ActionHandlingComponent
    public void setOnRedirectListener(@NotNull Function0<Unit> listener) {
        listener.getClass();
        this.genericActionDelegate.setOnRedirectListener(listener);
    }
}
