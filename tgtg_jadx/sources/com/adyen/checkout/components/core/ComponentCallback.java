package com.adyen.checkout.components.core;

import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.internal.BaseComponentCallback;
import com.adyen.checkout.core.PermissionHandlerCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/adyen/checkout/components/core/ComponentCallback;", "T", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/internal/BaseComponentCallback;", "onAdditionalDetails", "", "actionComponentData", "Lcom/adyen/checkout/components/core/ActionComponentData;", "onError", "componentError", "Lcom/adyen/checkout/components/core/ComponentError;", "onPermissionRequest", "requiredPermission", "", "permissionCallback", "Lcom/adyen/checkout/core/PermissionHandlerCallback;", "onStateChanged", "state", "(Lcom/adyen/checkout/components/core/PaymentComponentState;)V", "onSubmit", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ComponentCallback<T extends PaymentComponentState<?>> extends BaseComponentCallback {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T extends PaymentComponentState<?>> void onPermissionRequest(@NotNull ComponentCallback<T> componentCallback, @NotNull String str, @NotNull PermissionHandlerCallback permissionHandlerCallback) {
            str.getClass();
            permissionHandlerCallback.getClass();
            permissionHandlerCallback.onPermissionRequestNotHandled(str);
        }

        public static <T extends PaymentComponentState<?>> void onStateChanged(@NotNull ComponentCallback<T> componentCallback, @NotNull T t9) {
            t9.getClass();
        }
    }

    void onAdditionalDetails(@NotNull ActionComponentData actionComponentData);

    void onError(@NotNull ComponentError componentError);

    void onPermissionRequest(@NotNull String requiredPermission, @NotNull PermissionHandlerCallback permissionCallback);

    void onStateChanged(@NotNull T state);

    void onSubmit(@NotNull T state);
}
