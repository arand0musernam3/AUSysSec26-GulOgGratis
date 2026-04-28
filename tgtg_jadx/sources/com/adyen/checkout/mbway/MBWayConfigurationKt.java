package com.adyen.checkout.mbway;

import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.AnalyticsConfiguration;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.internal.Configuration;
import com.adyen.checkout.mbway.MBWayConfiguration;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0000*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "Lkotlin/Function1;", "Lcom/adyen/checkout/mbway/MBWayConfiguration$Builder;", "", "Lcom/adyen/checkout/components/core/internal/util/CheckoutConfigurationMarker;", "configuration", "mbWay", "(Lcom/adyen/checkout/components/core/CheckoutConfiguration;Lkotlin/jvm/functions/Function1;)Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "Lcom/adyen/checkout/mbway/MBWayConfiguration;", "getMBWayConfiguration", "(Lcom/adyen/checkout/components/core/CheckoutConfiguration;)Lcom/adyen/checkout/mbway/MBWayConfiguration;", "toCheckoutConfiguration", "(Lcom/adyen/checkout/mbway/MBWayConfiguration;)Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "mbway_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMBWayConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MBWayConfiguration.kt\ncom/adyen/checkout/mbway/MBWayConfigurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
public final class MBWayConfigurationKt {
    @Nullable
    public static final MBWayConfiguration getMBWayConfiguration(@NotNull CheckoutConfiguration checkoutConfiguration) {
        checkoutConfiguration.getClass();
        return (MBWayConfiguration) checkoutConfiguration.getConfiguration("mbway");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final CheckoutConfiguration mbWay(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull Function1<? super MBWayConfiguration.Builder, Unit> function1) {
        checkoutConfiguration.getClass();
        function1.getClass();
        MBWayConfiguration.Builder builder = new MBWayConfiguration.Builder(checkoutConfiguration.getEnvironment(), checkoutConfiguration.getClientKey());
        Locale shopperLocale = checkoutConfiguration.getShopperLocale();
        if (shopperLocale != null) {
        }
        Amount amount = checkoutConfiguration.getAmount();
        if (amount != null) {
        }
        AnalyticsConfiguration analyticsConfiguration = checkoutConfiguration.getAnalyticsConfiguration();
        if (analyticsConfiguration != null) {
        }
        Boolean isSubmitButtonVisible = builder.getIsSubmitButtonVisible();
        if (isSubmitButtonVisible != null) {
            builder.setSubmitButtonVisible(isSubmitButtonVisible.booleanValue());
        }
        function1.invoke(builder);
        checkoutConfiguration.addConfiguration("mbway", (MBWayConfiguration) builder.build());
        return checkoutConfiguration;
    }

    public static /* synthetic */ CheckoutConfiguration mbWay$default(CheckoutConfiguration checkoutConfiguration, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function1 = new Function1<MBWayConfiguration.Builder, Unit>() { // from class: com.adyen.checkout.mbway.MBWayConfigurationKt.mbWay.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((MBWayConfiguration.Builder) obj2);
                    return Unit.f26487a;
                }

                public final void invoke(@NotNull MBWayConfiguration.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return mbWay(checkoutConfiguration, function1);
    }

    @NotNull
    public static final CheckoutConfiguration toCheckoutConfiguration(@NotNull final MBWayConfiguration mBWayConfiguration) {
        mBWayConfiguration.getClass();
        return new CheckoutConfiguration(mBWayConfiguration.getEnvironment(), mBWayConfiguration.getClientKey(), mBWayConfiguration.getShopperLocale(), mBWayConfiguration.getAmount(), mBWayConfiguration.getAnalyticsConfiguration(), mBWayConfiguration.getIsSubmitButtonVisible(), new Function1<CheckoutConfiguration, Unit>() { // from class: com.adyen.checkout.mbway.MBWayConfigurationKt.toCheckoutConfiguration.1
            {
                super(1);
            }

            public final void invoke(@NotNull CheckoutConfiguration checkoutConfiguration) {
                checkoutConfiguration.getClass();
                checkoutConfiguration.addConfiguration("mbway", mBWayConfiguration);
                Iterator<T> it = mBWayConfiguration.getGenericActionConfiguration().getAllConfigurations().iterator();
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
