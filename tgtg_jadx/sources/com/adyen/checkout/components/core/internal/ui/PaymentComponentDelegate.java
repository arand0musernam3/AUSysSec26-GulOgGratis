package com.adyen.checkout.components.core.internal.ui;

import androidx.lifecycle.LifecycleOwner;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import v80.b0;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0010\b\u0000\u0010\u0003*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\u00020\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\u000e0\fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/PaymentComponentDelegate;", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "ComponentStateT", "Lcom/adyen/checkout/components/core/internal/ui/ComponentDelegate;", "", "getPaymentMethodType", "()Ljava/lang/String;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lv80/b0;", "coroutineScope", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "", "callback", "observe", "(Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObserver", "()V", "Ly80/i;", "getSubmitFlow", "()Ly80/i;", "submitFlow", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PaymentComponentDelegate<ComponentStateT extends PaymentComponentState<? extends PaymentMethodDetails>> extends ComponentDelegate {
    @NotNull
    String getPaymentMethodType();

    @NotNull
    i getSubmitFlow();

    void observe(@NotNull LifecycleOwner lifecycleOwner, @NotNull b0 coroutineScope, @NotNull Function1<? super PaymentComponentEvent<ComponentStateT>, Unit> callback);

    void removeObserver();
}
