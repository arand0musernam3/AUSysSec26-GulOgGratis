package com.adyen.checkout.components.core.internal;

import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.internal.ActionComponentEvent;
import com.adyen.checkout.components.core.internal.PaymentComponentEvent;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a<\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0010\b\u0000\u0010\u0004*\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005*\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0007\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¨\u0006\b"}, d2 = {"toActionCallback", "Lkotlin/Function1;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", "", "T", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ActionComponentEventKt {
    @NotNull
    public static final <T extends PaymentComponentState<? extends PaymentMethodDetails>> Function1<ActionComponentEvent, Unit> toActionCallback(@NotNull final Function1<? super PaymentComponentEvent<T>, Unit> function1) {
        function1.getClass();
        return new Function1<ActionComponentEvent, Unit>() { // from class: com.adyen.checkout.components.core.internal.ActionComponentEventKt.toActionCallback.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void invoke(@NotNull ActionComponentEvent actionComponentEvent) {
                actionComponentEvent.getClass();
                if (actionComponentEvent instanceof ActionComponentEvent.ActionDetails) {
                    function1.invoke(new PaymentComponentEvent.ActionDetails(((ActionComponentEvent.ActionDetails) actionComponentEvent).getData()));
                    return;
                }
                if (actionComponentEvent instanceof ActionComponentEvent.Error) {
                    function1.invoke(new PaymentComponentEvent.Error(((ActionComponentEvent.Error) actionComponentEvent).getError()));
                } else if (actionComponentEvent instanceof ActionComponentEvent.PermissionRequest) {
                    ActionComponentEvent.PermissionRequest permissionRequest = (ActionComponentEvent.PermissionRequest) actionComponentEvent;
                    function1.invoke(new PaymentComponentEvent.PermissionRequest(permissionRequest.getRequiredPermission(), permissionRequest.getPermissionCallback()));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ActionComponentEvent) obj);
                return Unit.f26487a;
            }
        };
    }
}
