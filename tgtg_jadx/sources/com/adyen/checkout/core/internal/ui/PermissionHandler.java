package com.adyen.checkout.core.internal.ui;

import android.content.Context;
import com.adyen.checkout.core.PermissionHandlerCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/core/internal/ui/PermissionHandler;", "", "requestPermission", "", "context", "Landroid/content/Context;", "requiredPermission", "", "callback", "Lcom/adyen/checkout/core/PermissionHandlerCallback;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PermissionHandler {
    void requestPermission(@NotNull Context context, @NotNull String requiredPermission, @NotNull PermissionHandlerCallback callback);
}
