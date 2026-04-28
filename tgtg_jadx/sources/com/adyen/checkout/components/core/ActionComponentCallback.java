package com.adyen.checkout.components.core;

import com.adyen.checkout.core.PermissionHandlerCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/adyen/checkout/components/core/ActionComponentCallback;", "", "onAdditionalDetails", "", "actionComponentData", "Lcom/adyen/checkout/components/core/ActionComponentData;", "onError", "componentError", "Lcom/adyen/checkout/components/core/ComponentError;", "onPermissionRequest", "requiredPermission", "", "permissionCallback", "Lcom/adyen/checkout/core/PermissionHandlerCallback;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ActionComponentCallback {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onPermissionRequest(@NotNull ActionComponentCallback actionComponentCallback, @NotNull String str, @NotNull PermissionHandlerCallback permissionHandlerCallback) {
            str.getClass();
            permissionHandlerCallback.getClass();
            permissionHandlerCallback.onPermissionRequestNotHandled(str);
        }
    }

    void onAdditionalDetails(@NotNull ActionComponentData actionComponentData);

    void onError(@NotNull ComponentError componentError);

    void onPermissionRequest(@NotNull String requiredPermission, @NotNull PermissionHandlerCallback permissionCallback);
}
