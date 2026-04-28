package com.adyen.checkout.components.core.internal.ui.model;

import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.core.Environment;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParamsMapper;", "", "()V", "mapToParams", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParamsMapperData;", "checkoutConfiguration", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "deviceLocale", "Ljava/util/Locale;", "dropInOverrideParams", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "componentSessionParams", "Lcom/adyen/checkout/components/core/internal/ui/model/SessionParams;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CommonComponentParamsMapper {
    @NotNull
    public final CommonComponentParamsMapperData mapToParams(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull Locale deviceLocale, @Nullable DropInOverrideParams dropInOverrideParams, @Nullable SessionParams componentSessionParams) {
        Environment environment;
        String clientKey;
        Amount amount;
        SessionParams sessionParams;
        checkoutConfiguration.getClass();
        deviceLocale.getClass();
        if (dropInOverrideParams != null && (sessionParams = dropInOverrideParams.getSessionParams()) != null) {
            componentSessionParams = sessionParams;
        }
        Locale shopperLocale = checkoutConfiguration.getShopperLocale();
        if (shopperLocale == null) {
            shopperLocale = componentSessionParams != null ? componentSessionParams.getShopperLocale() : null;
            if (shopperLocale == null) {
                shopperLocale = deviceLocale;
            }
        }
        if (componentSessionParams == null || (environment = componentSessionParams.getEnvironment()) == null) {
            environment = checkoutConfiguration.getEnvironment();
        }
        if (componentSessionParams == null || (clientKey = componentSessionParams.getClientKey()) == null) {
            clientKey = checkoutConfiguration.getClientKey();
        }
        AnalyticsParams analyticsParams = new AnalyticsParams(checkoutConfiguration.getAnalyticsConfiguration(), checkoutConfiguration.getClientKey());
        boolean z11 = dropInOverrideParams != null;
        if (componentSessionParams == null || (amount = componentSessionParams.getAmount()) == null) {
            Amount amount2 = dropInOverrideParams != null ? dropInOverrideParams.getAmount() : null;
            amount = amount2 == null ? checkoutConfiguration.getAmount() : amount2;
        }
        return new CommonComponentParamsMapperData(new CommonComponentParams(shopperLocale, environment, clientKey, analyticsParams, z11, amount), componentSessionParams);
    }
}
