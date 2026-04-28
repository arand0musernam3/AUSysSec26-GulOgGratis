package com.adyen.checkout.await;

import com.adyen.checkout.await.AwaitConfiguration;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.AnalyticsConfiguration;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0000*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "Lkotlin/Function1;", "Lcom/adyen/checkout/await/AwaitConfiguration$Builder;", "", "Lcom/adyen/checkout/components/core/internal/util/CheckoutConfigurationMarker;", "configuration", "await", "(Lcom/adyen/checkout/components/core/CheckoutConfiguration;Lkotlin/jvm/functions/Function1;)Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "Lcom/adyen/checkout/await/AwaitConfiguration;", "getAwaitConfiguration", "(Lcom/adyen/checkout/components/core/CheckoutConfiguration;)Lcom/adyen/checkout/await/AwaitConfiguration;", "toCheckoutConfiguration", "(Lcom/adyen/checkout/await/AwaitConfiguration;)Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "await_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAwaitConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwaitConfiguration.kt\ncom/adyen/checkout/await/AwaitConfigurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class AwaitConfigurationKt {
    @NotNull
    public static final CheckoutConfiguration await(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull Function1<? super AwaitConfiguration.Builder, Unit> function1) {
        checkoutConfiguration.getClass();
        function1.getClass();
        AwaitConfiguration.Builder builder = new AwaitConfiguration.Builder(checkoutConfiguration.getEnvironment(), checkoutConfiguration.getClientKey());
        Locale shopperLocale = checkoutConfiguration.getShopperLocale();
        if (shopperLocale != null) {
            builder.setShopperLocale(shopperLocale);
        }
        Amount amount = checkoutConfiguration.getAmount();
        if (amount != null) {
            builder.setAmount(amount);
        }
        AnalyticsConfiguration analyticsConfiguration = checkoutConfiguration.getAnalyticsConfiguration();
        if (analyticsConfiguration != null) {
            builder.setAnalyticsConfiguration(analyticsConfiguration);
        }
        function1.invoke(builder);
        checkoutConfiguration.addActionConfiguration(builder.build());
        return checkoutConfiguration;
    }

    public static /* synthetic */ CheckoutConfiguration await$default(CheckoutConfiguration checkoutConfiguration, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function1 = new Function1<AwaitConfiguration.Builder, Unit>() { // from class: com.adyen.checkout.await.AwaitConfigurationKt.await.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AwaitConfiguration.Builder) obj2);
                    return Unit.f26487a;
                }

                public final void invoke(@NotNull AwaitConfiguration.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return await(checkoutConfiguration, function1);
    }

    @Nullable
    public static final AwaitConfiguration getAwaitConfiguration(@NotNull CheckoutConfiguration checkoutConfiguration) {
        checkoutConfiguration.getClass();
        return (AwaitConfiguration) checkoutConfiguration.getActionConfiguration(AwaitConfiguration.class);
    }

    @NotNull
    public static final CheckoutConfiguration toCheckoutConfiguration(@NotNull final AwaitConfiguration awaitConfiguration) {
        awaitConfiguration.getClass();
        return new CheckoutConfiguration(awaitConfiguration.getEnvironment(), awaitConfiguration.getClientKey(), awaitConfiguration.getShopperLocale(), awaitConfiguration.getAmount(), awaitConfiguration.getAnalyticsConfiguration(), new Function1<CheckoutConfiguration, Unit>() { // from class: com.adyen.checkout.await.AwaitConfigurationKt.toCheckoutConfiguration.1
            {
                super(1);
            }

            public final void invoke(@NotNull CheckoutConfiguration checkoutConfiguration) {
                checkoutConfiguration.getClass();
                checkoutConfiguration.addActionConfiguration(awaitConfiguration);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CheckoutConfiguration) obj);
                return Unit.f26487a;
            }
        });
    }
}
