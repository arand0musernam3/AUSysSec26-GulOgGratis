package com.adyen.checkout.cashapppay;

import com.adyen.checkout.cashapppay.CashAppPayConfiguration;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.AnalyticsConfiguration;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.internal.Configuration;
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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0000*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "Lkotlin/Function1;", "Lcom/adyen/checkout/cashapppay/CashAppPayConfiguration$Builder;", "", "Lcom/adyen/checkout/components/core/internal/util/CheckoutConfigurationMarker;", "configuration", "cashAppPay", "(Lcom/adyen/checkout/components/core/CheckoutConfiguration;Lkotlin/jvm/functions/Function1;)Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "Lcom/adyen/checkout/cashapppay/CashAppPayConfiguration;", "getCashAppPayConfiguration", "(Lcom/adyen/checkout/components/core/CheckoutConfiguration;)Lcom/adyen/checkout/cashapppay/CashAppPayConfiguration;", "toCheckoutConfiguration", "(Lcom/adyen/checkout/cashapppay/CashAppPayConfiguration;)Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "cashapppay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashAppPayConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashAppPayConfiguration.kt\ncom/adyen/checkout/cashapppay/CashAppPayConfigurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
public final class CashAppPayConfigurationKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final CheckoutConfiguration cashAppPay(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull Function1<? super CashAppPayConfiguration.Builder, Unit> function1) {
        checkoutConfiguration.getClass();
        function1.getClass();
        CashAppPayConfiguration.Builder builder = new CashAppPayConfiguration.Builder(checkoutConfiguration.getEnvironment(), checkoutConfiguration.getClientKey());
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
        checkoutConfiguration.addConfiguration("cashapp", (CashAppPayConfiguration) builder.build());
        return checkoutConfiguration;
    }

    public static /* synthetic */ CheckoutConfiguration cashAppPay$default(CheckoutConfiguration checkoutConfiguration, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function1 = new Function1<CashAppPayConfiguration.Builder, Unit>() { // from class: com.adyen.checkout.cashapppay.CashAppPayConfigurationKt.cashAppPay.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((CashAppPayConfiguration.Builder) obj2);
                    return Unit.f26487a;
                }

                public final void invoke(@NotNull CashAppPayConfiguration.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return cashAppPay(checkoutConfiguration, function1);
    }

    @Nullable
    public static final CashAppPayConfiguration getCashAppPayConfiguration(@NotNull CheckoutConfiguration checkoutConfiguration) {
        checkoutConfiguration.getClass();
        return (CashAppPayConfiguration) checkoutConfiguration.getConfiguration("cashapp");
    }

    @NotNull
    public static final CheckoutConfiguration toCheckoutConfiguration(@NotNull final CashAppPayConfiguration cashAppPayConfiguration) {
        cashAppPayConfiguration.getClass();
        return new CheckoutConfiguration(cashAppPayConfiguration.getEnvironment(), cashAppPayConfiguration.getClientKey(), cashAppPayConfiguration.getShopperLocale(), cashAppPayConfiguration.getAmount(), cashAppPayConfiguration.getAnalyticsConfiguration(), cashAppPayConfiguration.getIsSubmitButtonVisible(), new Function1<CheckoutConfiguration, Unit>() { // from class: com.adyen.checkout.cashapppay.CashAppPayConfigurationKt.toCheckoutConfiguration.1
            {
                super(1);
            }

            public final void invoke(@NotNull CheckoutConfiguration checkoutConfiguration) {
                checkoutConfiguration.getClass();
                checkoutConfiguration.addConfiguration("cashapp", cashAppPayConfiguration);
                Iterator<T> it = cashAppPayConfiguration.getGenericActionConfiguration().getAllConfigurations().iterator();
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
