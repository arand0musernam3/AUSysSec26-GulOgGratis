package com.adyen.checkout.components.core.internal;

import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.ComponentError;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import com.adyen.checkout.core.PermissionHandlerCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0010\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u00020\u0004:\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "ComponentStateT", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "Lcom/adyen/checkout/components/core/internal/ComponentEvent;", "()V", "ActionDetails", "Error", "PermissionRequest", "StateChanged", "Submit", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent$ActionDetails;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent$Error;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent$PermissionRequest;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent$StateChanged;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent$Submit;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class PaymentComponentEvent<ComponentStateT extends PaymentComponentState<? extends PaymentMethodDetails>> implements ComponentEvent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0010\b\u0001\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent$ActionDetails;", "ComponentStateT", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", Bayeux.KEY_DATA, "Lcom/adyen/checkout/components/core/ActionComponentData;", "(Lcom/adyen/checkout/components/core/ActionComponentData;)V", "getData", "()Lcom/adyen/checkout/components/core/ActionComponentData;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionDetails<ComponentStateT extends PaymentComponentState<? extends PaymentMethodDetails>> extends PaymentComponentEvent<ComponentStateT> {

        @NotNull
        private final ActionComponentData data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionDetails(@NotNull ActionComponentData actionComponentData) {
            super(null);
            actionComponentData.getClass();
            this.data = actionComponentData;
        }

        @NotNull
        public final ActionComponentData getData() {
            return this.data;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0010\b\u0001\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent$Error;", "ComponentStateT", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", StatusResponseUtils.RESULT_ERROR, "Lcom/adyen/checkout/components/core/ComponentError;", "(Lcom/adyen/checkout/components/core/ComponentError;)V", "getError", "()Lcom/adyen/checkout/components/core/ComponentError;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error<ComponentStateT extends PaymentComponentState<? extends PaymentMethodDetails>> extends PaymentComponentEvent<ComponentStateT> {

        @NotNull
        private final ComponentError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull ComponentError componentError) {
            super(null);
            componentError.getClass();
            this.error = componentError;
        }

        @NotNull
        public final ComponentError getError() {
            return this.error;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0010\b\u0001\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent$PermissionRequest;", "ComponentStateT", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "requiredPermission", "", "permissionCallback", "Lcom/adyen/checkout/core/PermissionHandlerCallback;", "(Ljava/lang/String;Lcom/adyen/checkout/core/PermissionHandlerCallback;)V", "getPermissionCallback", "()Lcom/adyen/checkout/core/PermissionHandlerCallback;", "getRequiredPermission", "()Ljava/lang/String;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PermissionRequest<ComponentStateT extends PaymentComponentState<? extends PaymentMethodDetails>> extends PaymentComponentEvent<ComponentStateT> {

        @NotNull
        private final PermissionHandlerCallback permissionCallback;

        @NotNull
        private final String requiredPermission;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PermissionRequest(@NotNull String str, @NotNull PermissionHandlerCallback permissionHandlerCallback) {
            super(null);
            str.getClass();
            permissionHandlerCallback.getClass();
            this.requiredPermission = str;
            this.permissionCallback = permissionHandlerCallback;
        }

        @NotNull
        public final PermissionHandlerCallback getPermissionCallback() {
            return this.permissionCallback;
        }

        @NotNull
        public final String getRequiredPermission() {
            return this.requiredPermission;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0010\b\u0001\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0005\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent$StateChanged;", "ComponentStateT", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "state", "(Lcom/adyen/checkout/components/core/PaymentComponentState;)V", "getState", "()Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StateChanged<ComponentStateT extends PaymentComponentState<? extends PaymentMethodDetails>> extends PaymentComponentEvent<ComponentStateT> {

        @NotNull
        private final ComponentStateT state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateChanged(@NotNull ComponentStateT componentstatet) {
            super(null);
            componentstatet.getClass();
            this.state = componentstatet;
        }

        @NotNull
        public final ComponentStateT getState() {
            return this.state;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0010\b\u0001\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0005\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent$Submit;", "ComponentStateT", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "Lcom/adyen/checkout/components/core/internal/PaymentComponentEvent;", "state", "(Lcom/adyen/checkout/components/core/PaymentComponentState;)V", "getState", "()Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Submit<ComponentStateT extends PaymentComponentState<? extends PaymentMethodDetails>> extends PaymentComponentEvent<ComponentStateT> {

        @NotNull
        private final ComponentStateT state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Submit(@NotNull ComponentStateT componentstatet) {
            super(null);
            componentstatet.getClass();
            this.state = componentstatet;
        }

        @NotNull
        public final ComponentStateT getState() {
            return this.state;
        }
    }

    public /* synthetic */ PaymentComponentEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PaymentComponentEvent() {
    }
}
