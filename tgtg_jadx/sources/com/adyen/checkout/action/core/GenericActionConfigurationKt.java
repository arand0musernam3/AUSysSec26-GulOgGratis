package com.adyen.checkout.action.core;

import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.internal.Configuration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toCheckoutConfiguration", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "Lcom/adyen/checkout/action/core/GenericActionConfiguration;", "action-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class GenericActionConfigurationKt {
    @NotNull
    public static final CheckoutConfiguration toCheckoutConfiguration(@NotNull final GenericActionConfiguration genericActionConfiguration) {
        genericActionConfiguration.getClass();
        return new CheckoutConfiguration(genericActionConfiguration.getEnvironment(), genericActionConfiguration.getClientKey(), genericActionConfiguration.getShopperLocale(), genericActionConfiguration.getAmount(), genericActionConfiguration.getAnalyticsConfiguration(), new Function1<CheckoutConfiguration, Unit>() { // from class: com.adyen.checkout.action.core.GenericActionConfigurationKt.toCheckoutConfiguration.1
            {
                super(1);
            }

            public final void invoke(@NotNull CheckoutConfiguration checkoutConfiguration) {
                checkoutConfiguration.getClass();
                Iterator<T> it = genericActionConfiguration.getAllConfigurations().iterator();
                while (it.hasNext()) {
                    checkoutConfiguration.addActionConfiguration((Configuration) it.next());
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CheckoutConfiguration) obj);
                return Unit.f26487a;
            }
        });
    }
}
