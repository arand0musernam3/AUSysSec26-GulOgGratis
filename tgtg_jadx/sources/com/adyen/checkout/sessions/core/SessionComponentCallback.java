package com.adyen.checkout.sessions.core;

import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.components.core.ComponentError;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.BaseComponentCallback;
import com.adyen.checkout.core.PermissionHandlerCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0015\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/adyen/checkout/sessions/core/SessionComponentCallback;", "T", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/internal/BaseComponentCallback;", "onAction", "", "action", "Lcom/adyen/checkout/components/core/action/Action;", "onAdditionalDetails", "", "actionComponentData", "Lcom/adyen/checkout/components/core/ActionComponentData;", "onError", "componentError", "Lcom/adyen/checkout/components/core/ComponentError;", "onFinished", "result", "Lcom/adyen/checkout/sessions/core/SessionPaymentResult;", "onLoading", "isLoading", "onPermissionRequest", "requiredPermission", "", "permissionCallback", "Lcom/adyen/checkout/core/PermissionHandlerCallback;", "onStateChanged", "state", "(Lcom/adyen/checkout/components/core/PaymentComponentState;)V", "onSubmit", "(Lcom/adyen/checkout/components/core/PaymentComponentState;)Z", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SessionComponentCallback<T extends PaymentComponentState<?>> extends BaseComponentCallback {
    void onAction(@NotNull Action action);

    boolean onAdditionalDetails(@NotNull ActionComponentData actionComponentData);

    void onError(@NotNull ComponentError componentError);

    void onFinished(@NotNull SessionPaymentResult result);

    void onLoading(boolean isLoading);

    void onPermissionRequest(@NotNull String requiredPermission, @NotNull PermissionHandlerCallback permissionCallback);

    void onStateChanged(@NotNull T state);

    boolean onSubmit(@NotNull T state);

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T extends PaymentComponentState<?>> boolean onAdditionalDetails(@NotNull SessionComponentCallback<T> sessionComponentCallback, @NotNull ActionComponentData actionComponentData) {
            actionComponentData.getClass();
            return false;
        }

        public static <T extends PaymentComponentState<?>> void onPermissionRequest(@NotNull SessionComponentCallback<T> sessionComponentCallback, @NotNull String str, @NotNull PermissionHandlerCallback permissionHandlerCallback) {
            str.getClass();
            permissionHandlerCallback.getClass();
            permissionHandlerCallback.onPermissionRequestNotHandled(str);
        }

        public static <T extends PaymentComponentState<?>> void onStateChanged(@NotNull SessionComponentCallback<T> sessionComponentCallback, @NotNull T t9) {
            t9.getClass();
        }

        public static <T extends PaymentComponentState<?>> boolean onSubmit(@NotNull SessionComponentCallback<T> sessionComponentCallback, @NotNull T t9) {
            t9.getClass();
            return false;
        }

        public static <T extends PaymentComponentState<?>> void onLoading(@NotNull SessionComponentCallback<T> sessionComponentCallback, boolean z11) {
        }
    }
}
