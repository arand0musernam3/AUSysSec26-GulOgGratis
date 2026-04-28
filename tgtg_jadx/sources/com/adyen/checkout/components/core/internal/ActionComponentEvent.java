package com.adyen.checkout.components.core.internal;

import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.ComponentError;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.adyen.checkout.core.PermissionHandlerCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", "Lcom/adyen/checkout/components/core/internal/ComponentEvent;", "()V", "ActionDetails", "Error", "PermissionRequest", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent$ActionDetails;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent$Error;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent$PermissionRequest;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ActionComponentEvent implements ComponentEvent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ActionComponentEvent$ActionDetails;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", Bayeux.KEY_DATA, "Lcom/adyen/checkout/components/core/ActionComponentData;", "(Lcom/adyen/checkout/components/core/ActionComponentData;)V", "getData", "()Lcom/adyen/checkout/components/core/ActionComponentData;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionDetails extends ActionComponentEvent {

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
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ActionComponentEvent$Error;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", StatusResponseUtils.RESULT_ERROR, "Lcom/adyen/checkout/components/core/ComponentError;", "(Lcom/adyen/checkout/components/core/ComponentError;)V", "getError", "()Lcom/adyen/checkout/components/core/ComponentError;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Error extends ActionComponentEvent {

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
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ActionComponentEvent$PermissionRequest;", "Lcom/adyen/checkout/components/core/internal/ActionComponentEvent;", "requiredPermission", "", "permissionCallback", "Lcom/adyen/checkout/core/PermissionHandlerCallback;", "(Ljava/lang/String;Lcom/adyen/checkout/core/PermissionHandlerCallback;)V", "getPermissionCallback", "()Lcom/adyen/checkout/core/PermissionHandlerCallback;", "getRequiredPermission", "()Ljava/lang/String;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PermissionRequest extends ActionComponentEvent {

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

    public /* synthetic */ ActionComponentEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ActionComponentEvent() {
    }
}
