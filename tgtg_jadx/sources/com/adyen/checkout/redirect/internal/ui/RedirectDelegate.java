package com.adyen.checkout.redirect.internal.ui;

import com.adyen.checkout.components.core.internal.ui.ActionDelegate;
import com.adyen.checkout.components.core.internal.ui.DetailsEmittingDelegate;
import com.adyen.checkout.components.core.internal.ui.IntentHandlingDelegate;
import com.adyen.checkout.components.core.internal.ui.RedirectableDelegate;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.ui.core.internal.ui.ViewProvidingDelegate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/adyen/checkout/redirect/internal/ui/RedirectDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/ActionDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/DetailsEmittingDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/IntentHandlingDelegate;", "Lcom/adyen/checkout/ui/core/internal/ui/ViewProvidingDelegate;", "Lcom/adyen/checkout/components/core/internal/ui/RedirectableDelegate;", "redirect_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface RedirectDelegate extends ActionDelegate, DetailsEmittingDelegate, IntentHandlingDelegate, ViewProvidingDelegate, RedirectableDelegate {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onError(@NotNull RedirectDelegate redirectDelegate, @NotNull CheckoutException checkoutException) {
            checkoutException.getClass();
            ActionDelegate.DefaultImpls.onError(redirectDelegate, checkoutException);
        }
    }
}
