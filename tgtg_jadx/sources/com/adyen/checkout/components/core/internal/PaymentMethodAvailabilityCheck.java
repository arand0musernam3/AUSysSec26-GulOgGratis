package com.adyen.checkout.components.core.internal;

import android.app.Application;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.ComponentAvailableCallback;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.internal.Configuration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J/\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\rJ(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/components/core/internal/PaymentMethodAvailabilityCheck;", "ConfigurationT", "Lcom/adyen/checkout/components/core/internal/Configuration;", "", "isAvailable", "", "applicationContext", "Landroid/app/Application;", "paymentMethod", "Lcom/adyen/checkout/components/core/PaymentMethod;", "configuration", "callback", "Lcom/adyen/checkout/components/core/ComponentAvailableCallback;", "(Landroid/app/Application;Lcom/adyen/checkout/components/core/PaymentMethod;Lcom/adyen/checkout/components/core/internal/Configuration;Lcom/adyen/checkout/components/core/ComponentAvailableCallback;)V", "application", "checkoutConfiguration", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PaymentMethodAvailabilityCheck<ConfigurationT extends Configuration> {
    void isAvailable(@NotNull Application application, @NotNull PaymentMethod paymentMethod, @NotNull CheckoutConfiguration checkoutConfiguration, @NotNull ComponentAvailableCallback callback);

    void isAvailable(@NotNull Application applicationContext, @NotNull PaymentMethod paymentMethod, @Nullable ConfigurationT configuration, @NotNull ComponentAvailableCallback callback);
}
