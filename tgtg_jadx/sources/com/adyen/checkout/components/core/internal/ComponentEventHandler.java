package com.adyen.checkout.components.core.internal;

import com.adyen.checkout.components.core.PaymentComponentState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ComponentEventHandler;", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "T", "", "Lv80/b0;", "coroutineScope", "", "initialize", "(Lv80/b0;)V", "onCleared", "()V", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "event", "Lcom/adyen/checkout/components/core/internal/BaseComponentCallback;", "componentCallback", "onPaymentComponentEvent", "(Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;Lcom/adyen/checkout/components/core/internal/BaseComponentCallback;)V", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ComponentEventHandler<T extends PaymentComponentState<?>> {
    void initialize(@NotNull b0 coroutineScope);

    void onCleared();

    void onPaymentComponentEvent(@NotNull PaymentComponentEvent<T> event, @NotNull BaseComponentCallback componentCallback);
}
