package com.adyen.checkout.components.core.internal;

import android.app.Application;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.ComponentAvailableCallback;
import com.adyen.checkout.components.core.PaymentMethod;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/components/core/internal/AlwaysAvailablePaymentMethod;", "Lcom/adyen/checkout/components/core/internal/PaymentMethodAvailabilityCheck;", "Lcom/adyen/checkout/components/core/internal/Configuration;", "()V", "isAvailable", "", "application", "Landroid/app/Application;", "paymentMethod", "Lcom/adyen/checkout/components/core/PaymentMethod;", "checkoutConfiguration", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "callback", "Lcom/adyen/checkout/components/core/ComponentAvailableCallback;", "applicationContext", "configuration", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AlwaysAvailablePaymentMethod implements PaymentMethodAvailabilityCheck<Configuration> {
    @Override // com.adyen.checkout.components.core.internal.PaymentMethodAvailabilityCheck
    public void isAvailable(@NotNull Application application, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentAvailableCallback callback) {
        application.getClass();
        paymentMethod.getClass();
        checkoutConfiguration.getClass();
        callback.getClass();
        callback.onAvailabilityResult(true, paymentMethod);
    }

    @Override // com.adyen.checkout.components.core.internal.PaymentMethodAvailabilityCheck
    public void isAvailable(@NotNull Application applicationContext, @NotNull PaymentMethod paymentMethod, @Nullable Configuration configuration, @NotNull ComponentAvailableCallback callback) {
        applicationContext.getClass();
        paymentMethod.getClass();
        callback.getClass();
        callback.onAvailabilityResult(true, paymentMethod);
    }
}
