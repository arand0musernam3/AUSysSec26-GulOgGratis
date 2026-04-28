package com.adyen.checkout.components.core.internal;

import androidx.lifecycle.LifecycleOwner;
import com.adyen.checkout.components.core.ComponentError;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import com.adyen.checkout.core.exception.CheckoutException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Ju\u0010\u0016\u001a\u00020\u0014\"\u0010\b\u0000\u0010\b*\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/adyen/checkout/components/core/internal/PaymentObserverRepository;", "", "Lcom/adyen/checkout/components/core/internal/ObserverContainer;", "observerContainer", "<init>", "(Lcom/adyen/checkout/components/core/internal/ObserverContainer;)V", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "T", "Ly80/i;", "stateFlow", "Lcom/adyen/checkout/core/exception/CheckoutException;", "exceptionFlow", "submitFlow", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lv80/b0;", "coroutineScope", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "", "callback", "addObservers", "(Ly80/i;Ly80/i;Ly80/i;Landroidx/lifecycle/LifecycleOwner;Lv80/b0;Lkotlin/jvm/functions/Function1;)V", "removeObservers", "()V", "Lcom/adyen/checkout/components/core/internal/ObserverContainer;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentObserverRepository {

    @NotNull
    private final ObserverContainer observerContainer;

    public /* synthetic */ PaymentObserverRepository(ObserverContainer observerContainer, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ObserverContainer() : observerContainer);
    }

    public final <T extends PaymentComponentState<? extends PaymentMethodDetails>> void addObservers(@NotNull i stateFlow, @Nullable i exceptionFlow, @NotNull i submitFlow, @NotNull LifecycleOwner lifecycleOwner, @NotNull b0 coroutineScope, @NotNull final Function1<? super PaymentComponentEvent<T>, Unit> callback) {
        stateFlow.getClass();
        submitFlow.getClass();
        lifecycleOwner.getClass();
        coroutineScope.getClass();
        callback.getClass();
        ObserverContainer observerContainer = this.observerContainer;
        observerContainer.removeObservers$components_core_release();
        observerContainer.observe$components_core_release(stateFlow, lifecycleOwner, coroutineScope, new Function1<T, Unit>() { // from class: com.adyen.checkout.components.core.internal.PaymentObserverRepository$addObservers$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)V */
            public final void invoke(@NotNull PaymentComponentState paymentComponentState) {
                paymentComponentState.getClass();
                callback.invoke(new PaymentComponentEvent.StateChanged(paymentComponentState));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentState) obj);
                return Unit.f26487a;
            }
        });
        if (exceptionFlow != null) {
            observerContainer.observe$components_core_release(exceptionFlow, lifecycleOwner, coroutineScope, new Function1<CheckoutException, Unit>() { // from class: com.adyen.checkout.components.core.internal.PaymentObserverRepository$addObservers$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void invoke(@NotNull CheckoutException checkoutException) {
                    checkoutException.getClass();
                    callback.invoke(new PaymentComponentEvent.Error(new ComponentError(checkoutException)));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((CheckoutException) obj);
                    return Unit.f26487a;
                }
            });
        }
        observerContainer.observe$components_core_release(submitFlow, lifecycleOwner, coroutineScope, new Function1<T, Unit>() { // from class: com.adyen.checkout.components.core.internal.PaymentObserverRepository$addObservers$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)V */
            public final void invoke(@NotNull PaymentComponentState paymentComponentState) {
                paymentComponentState.getClass();
                callback.invoke(new PaymentComponentEvent.Submit(paymentComponentState));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PaymentComponentState) obj);
                return Unit.f26487a;
            }
        });
    }

    public final void removeObservers() {
        this.observerContainer.removeObservers$components_core_release();
    }

    public PaymentObserverRepository(@NotNull ObserverContainer observerContainer) {
        observerContainer.getClass();
        this.observerContainer = observerContainer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentObserverRepository() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
