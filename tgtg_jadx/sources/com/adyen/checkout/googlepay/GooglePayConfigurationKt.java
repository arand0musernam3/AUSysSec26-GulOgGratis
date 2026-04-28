package com.adyen.checkout.googlepay;

import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.AnalyticsConfiguration;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.internal.Configuration;
import com.adyen.checkout.googlepay.GooglePayConfiguration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0000*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "Lkotlin/Function1;", "Lcom/adyen/checkout/googlepay/GooglePayConfiguration$Builder;", "", "Lcom/adyen/checkout/components/core/internal/util/CheckoutConfigurationMarker;", "configuration", "googlePay", "(Lcom/adyen/checkout/components/core/CheckoutConfiguration;Lkotlin/jvm/functions/Function1;)Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "Lcom/adyen/checkout/googlepay/GooglePayConfiguration;", "getGooglePayConfiguration", "(Lcom/adyen/checkout/components/core/CheckoutConfiguration;)Lcom/adyen/checkout/googlepay/GooglePayConfiguration;", "toCheckoutConfiguration", "(Lcom/adyen/checkout/googlepay/GooglePayConfiguration;)Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "googlepay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGooglePayConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayConfiguration.kt\ncom/adyen/checkout/googlepay/GooglePayConfigurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,569:1\n1#2:570\n1863#3,2:571\n*S KotlinDebug\n*F\n+ 1 GooglePayConfiguration.kt\ncom/adyen/checkout/googlepay/GooglePayConfigurationKt\n*L\n540#1:571,2\n*E\n"})
public final class GooglePayConfigurationKt {
    @Nullable
    public static final GooglePayConfiguration getGooglePayConfiguration(@NotNull CheckoutConfiguration checkoutConfiguration) {
        checkoutConfiguration.getClass();
        Iterator<T> it = GooglePayComponent.PAYMENT_METHOD_TYPES.iterator();
        while (it.hasNext()) {
            GooglePayConfiguration googlePayConfiguration = (GooglePayConfiguration) checkoutConfiguration.getConfiguration((String) it.next());
            if (googlePayConfiguration != null) {
                return googlePayConfiguration;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final CheckoutConfiguration googlePay(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull Function1<? super GooglePayConfiguration.Builder, Unit> function1) {
        checkoutConfiguration.getClass();
        function1.getClass();
        GooglePayConfiguration.Builder builder = new GooglePayConfiguration.Builder(checkoutConfiguration.getEnvironment(), checkoutConfiguration.getClientKey());
        Locale shopperLocale = checkoutConfiguration.getShopperLocale();
        if (shopperLocale != null) {
        }
        Amount amount = checkoutConfiguration.getAmount();
        if (amount != null) {
            builder.setAmount(amount);
        }
        AnalyticsConfiguration analyticsConfiguration = checkoutConfiguration.getAnalyticsConfiguration();
        if (analyticsConfiguration != null) {
        }
        Boolean isSubmitButtonVisible = builder.getIsSubmitButtonVisible();
        if (isSubmitButtonVisible != null) {
            builder.setSubmitButtonVisible(isSubmitButtonVisible.booleanValue());
        }
        function1.invoke(builder);
        GooglePayConfiguration googlePayConfiguration = (GooglePayConfiguration) builder.build();
        Iterator<T> it = GooglePayComponent.PAYMENT_METHOD_TYPES.iterator();
        while (it.hasNext()) {
            checkoutConfiguration.addConfiguration((String) it.next(), googlePayConfiguration);
        }
        return checkoutConfiguration;
    }

    public static /* synthetic */ CheckoutConfiguration googlePay$default(CheckoutConfiguration checkoutConfiguration, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function1 = new Function1<GooglePayConfiguration.Builder, Unit>() { // from class: com.adyen.checkout.googlepay.GooglePayConfigurationKt.googlePay.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((GooglePayConfiguration.Builder) obj2);
                    return Unit.f26487a;
                }

                public final void invoke(@NotNull GooglePayConfiguration.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return googlePay(checkoutConfiguration, function1);
    }

    @NotNull
    public static final CheckoutConfiguration toCheckoutConfiguration(@NotNull final GooglePayConfiguration googlePayConfiguration) {
        googlePayConfiguration.getClass();
        return new CheckoutConfiguration(googlePayConfiguration.getEnvironment(), googlePayConfiguration.getClientKey(), googlePayConfiguration.getShopperLocale(), googlePayConfiguration.getAmount(), googlePayConfiguration.getAnalyticsConfiguration(), googlePayConfiguration.getIsSubmitButtonVisible(), new Function1<CheckoutConfiguration, Unit>() { // from class: com.adyen.checkout.googlepay.GooglePayConfigurationKt.toCheckoutConfiguration.1
            {
                super(1);
            }

            public final void invoke(@NotNull CheckoutConfiguration checkoutConfiguration) {
                checkoutConfiguration.getClass();
                List<String> list = GooglePayComponent.PAYMENT_METHOD_TYPES;
                GooglePayConfiguration googlePayConfiguration2 = googlePayConfiguration;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    checkoutConfiguration.addConfiguration((String) it.next(), googlePayConfiguration2);
                }
                Iterator<T> it2 = googlePayConfiguration.getGenericActionConfiguration().getAllConfigurations().iterator();
                while (it2.hasNext()) {
                    checkoutConfiguration.addActionConfiguration((Configuration) it2.next());
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
