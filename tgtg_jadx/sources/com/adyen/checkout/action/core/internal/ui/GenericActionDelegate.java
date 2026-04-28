package com.adyen.checkout.action.core.internal.ui;

import com.adyen.checkout.components.core.internal.ui.ActionDelegate;
import com.adyen.checkout.components.core.internal.ui.DetailsEmittingDelegate;
import com.adyen.checkout.components.core.internal.ui.IntentHandlingDelegate;
import com.adyen.checkout.components.core.internal.ui.PermissionRequestingDelegate;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.ui.core.internal.ui.ViewProvidingDelegate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\b\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rH&R\u0012\u0010\u0006\u001a\u00020\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/adyen/checkout/action/core/internal/ui/GenericActionDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/ActionDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/DetailsEmittingDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/IntentHandlingDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewProvidingDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/PermissionRequestingDelegate;", "delegate", "getDelegate", "()Lcom/adyen/checkout/components/core/internal/ui/ActionDelegate;", "refreshStatus", "", "setOnRedirectListener", "listener", "Lkotlin/Function0;", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface GenericActionDelegate extends ActionDelegate, DetailsEmittingDelegate, IntentHandlingDelegate, ViewProvidingDelegate, PermissionRequestingDelegate {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onError(@NotNull GenericActionDelegate genericActionDelegate, @NotNull CheckoutException checkoutException) {
            checkoutException.getClass();
            ActionDelegate.DefaultImpls.onError(genericActionDelegate, checkoutException);
        }
    }

    @NotNull
    ActionDelegate getDelegate();

    void refreshStatus();

    void setOnRedirectListener(@NotNull Function0<Unit> listener);
}
