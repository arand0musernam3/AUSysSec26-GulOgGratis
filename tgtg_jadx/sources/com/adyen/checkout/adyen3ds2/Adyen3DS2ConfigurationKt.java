package com.adyen.checkout.adyen3ds2;

import com.adyen.checkout.adyen3ds2.Adyen3DS2Configuration;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0000*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "Lkotlin/Function1;", "Lcom/adyen/checkout/adyen3ds2/Adyen3DS2Configuration$Builder;", "", "Lcom/adyen/checkout/components/core/internal/util/CheckoutConfigurationMarker;", "configuration", "adyen3DS2", "(Lcom/adyen/checkout/components/core/CheckoutConfiguration;Lkotlin/jvm/functions/Function1;)Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "Lcom/adyen/checkout/adyen3ds2/Adyen3DS2Configuration;", "getAdyen3DS2Configuration", "(Lcom/adyen/checkout/components/core/CheckoutConfiguration;)Lcom/adyen/checkout/adyen3ds2/Adyen3DS2Configuration;", "toCheckoutConfiguration", "(Lcom/adyen/checkout/adyen3ds2/Adyen3DS2Configuration;)Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "3ds2_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAdyen3DS2Configuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Adyen3DS2Configuration.kt\ncom/adyen/checkout/adyen3ds2/Adyen3DS2ConfigurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1#2:167\n*E\n"})
public final class Adyen3DS2ConfigurationKt {
    @NotNull
    public static final CheckoutConfiguration adyen3DS2(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull Function1<? super Adyen3DS2Configuration.Builder, Unit> function1) {
        checkoutConfiguration.getClass();
        function1.getClass();
        Adyen3DS2Configuration.Builder builder = new Adyen3DS2Configuration.Builder(checkoutConfiguration.getEnvironment(), checkoutConfiguration.getClientKey());
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

    public static /* synthetic */ CheckoutConfiguration adyen3DS2$default(CheckoutConfiguration checkoutConfiguration, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function1 = new Function1<Adyen3DS2Configuration.Builder, Unit>() { // from class: com.adyen.checkout.adyen3ds2.Adyen3DS2ConfigurationKt.adyen3DS2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Adyen3DS2Configuration.Builder) obj2);
                    return Unit.f26487a;
                }

                public final void invoke(@NotNull Adyen3DS2Configuration.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return adyen3DS2(checkoutConfiguration, function1);
    }

    @Nullable
    public static final Adyen3DS2Configuration getAdyen3DS2Configuration(@NotNull CheckoutConfiguration checkoutConfiguration) {
        checkoutConfiguration.getClass();
        return (Adyen3DS2Configuration) checkoutConfiguration.getActionConfiguration(Adyen3DS2Configuration.class);
    }

    @NotNull
    public static final CheckoutConfiguration toCheckoutConfiguration(@NotNull final Adyen3DS2Configuration adyen3DS2Configuration) {
        adyen3DS2Configuration.getClass();
        return new CheckoutConfiguration(adyen3DS2Configuration.getEnvironment(), adyen3DS2Configuration.getClientKey(), adyen3DS2Configuration.getShopperLocale(), adyen3DS2Configuration.getAmount(), adyen3DS2Configuration.getAnalyticsConfiguration(), new Function1<CheckoutConfiguration, Unit>() { // from class: com.adyen.checkout.adyen3ds2.Adyen3DS2ConfigurationKt.toCheckoutConfiguration.1
            {
                super(1);
            }

            public final void invoke(@NotNull CheckoutConfiguration checkoutConfiguration) {
                checkoutConfiguration.getClass();
                checkoutConfiguration.addActionConfiguration(adyen3DS2Configuration);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CheckoutConfiguration) obj);
                return Unit.f26487a;
            }
        });
    }
}
