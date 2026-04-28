package com.adyen.checkout.cashapppay.internal.ui.model;

import android.content.Context;
import com.adyen.checkout.cashapppay.CashAppPayComponent;
import com.adyen.checkout.cashapppay.CashAppPayConfiguration;
import com.adyen.checkout.cashapppay.CashAppPayConfigurationKt;
import com.adyen.checkout.cashapppay.CashAppPayEnvironment;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.Configuration;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.StoredPaymentMethod;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParams;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapper;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapperData;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.components.core.internal.ui.model.SessionParams;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.core.exception.ComponentException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J.\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001c\u0010\u0013\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J:\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0012J:\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0012JR\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010$\u001a\u0004\u0018\u00010\f2\b\u0010%\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayComponentParamsMapper;", "", "commonComponentParamsMapper", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParamsMapper;", "(Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParamsMapper;)V", "getCashAppPayEnvironment", "Lcom/adyen/checkout/cashapppay/CashAppPayEnvironment;", "environment", "Lcom/adyen/checkout/core/Environment;", "cashAppPayConfiguration", "Lcom/adyen/checkout/cashapppay/CashAppPayConfiguration;", "getReturnUrl", "", "sessionParams", "Lcom/adyen/checkout/components/core/internal/ui/model/SessionParams;", "isCreatedByDropIn", "", "context", "Landroid/content/Context;", "getShowStorePaymentField", "mapToParams", "Lcom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayComponentParams;", "checkoutConfiguration", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "deviceLocale", "Ljava/util/Locale;", "dropInOverrideParams", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "componentSessionParams", "paymentMethod", "Lcom/adyen/checkout/components/core/PaymentMethod;", "storedPaymentMethod", "Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "mapToParamsInternal", "commonComponentParams", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;", Bayeux.KEY_CLIENT_ID, "scopeId", "cashapppay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashAppPayComponentParamsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashAppPayComponentParamsMapper.kt\ncom/adyen/checkout/cashapppay/internal/ui/model/CashAppPayComponentParamsMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
public final class CashAppPayComponentParamsMapper {

    @NotNull
    private final CommonComponentParamsMapper commonComponentParamsMapper;

    public CashAppPayComponentParamsMapper(@NotNull CommonComponentParamsMapper commonComponentParamsMapper) {
        commonComponentParamsMapper.getClass();
        this.commonComponentParamsMapper = commonComponentParamsMapper;
    }

    private final CashAppPayEnvironment getCashAppPayEnvironment(Environment environment, CashAppPayConfiguration cashAppPayConfiguration) {
        return (cashAppPayConfiguration != null ? cashAppPayConfiguration.getCashAppPayEnvironment() : null) != null ? cashAppPayConfiguration.getCashAppPayEnvironment() : Intrinsics.areEqual(environment, Environment.TEST) ? CashAppPayEnvironment.SANDBOX : CashAppPayEnvironment.PRODUCTION;
    }

    private final String getReturnUrl(SessionParams sessionParams, boolean isCreatedByDropIn, CashAppPayConfiguration cashAppPayConfiguration, Context context) {
        String returnUrl;
        if (sessionParams != null && (returnUrl = sessionParams.getReturnUrl()) != null) {
            return returnUrl;
        }
        String returnUrl2 = cashAppPayConfiguration != null ? cashAppPayConfiguration.getReturnUrl() : null;
        if (returnUrl2 != null) {
            return returnUrl2;
        }
        String returnUrl3 = CashAppPayComponent.INSTANCE.getReturnUrl(context);
        if (isCreatedByDropIn) {
            return returnUrl3;
        }
        return null;
    }

    private final boolean getShowStorePaymentField(SessionParams sessionParams, CashAppPayConfiguration cashAppPayConfiguration) {
        Boolean enableStoreDetails;
        if (sessionParams != null && (enableStoreDetails = sessionParams.getEnableStoreDetails()) != null) {
            return enableStoreDetails.booleanValue();
        }
        Boolean showStorePaymentField = cashAppPayConfiguration != null ? cashAppPayConfiguration.getShowStorePaymentField() : null;
        if (showStorePaymentField != null) {
            return showStorePaymentField.booleanValue();
        }
        return true;
    }

    private final CashAppPayComponentParams mapToParamsInternal(CommonComponentParams commonComponentParams, SessionParams sessionParams, DropInOverrideParams dropInOverrideParams, CashAppPayConfiguration cashAppPayConfiguration, String clientId, String scopeId, Context context, CheckoutConfiguration checkoutConfiguration) {
        boolean zBooleanValue;
        Boolean storePaymentMethod;
        if (dropInOverrideParams != null) {
            zBooleanValue = dropInOverrideParams.isSubmitButtonVisible();
        } else {
            Boolean isSubmitButtonVisible = cashAppPayConfiguration != null ? cashAppPayConfiguration.getIsSubmitButtonVisible() : null;
            zBooleanValue = (isSubmitButtonVisible == null && (isSubmitButtonVisible = checkoutConfiguration.getIsSubmitButtonVisible()) == null) ? true : isSubmitButtonVisible.booleanValue();
        }
        return new CashAppPayComponentParams(commonComponentParams, zBooleanValue, getCashAppPayEnvironment(commonComponentParams.getEnvironment(), cashAppPayConfiguration), getReturnUrl(sessionParams, commonComponentParams.isCreatedByDropIn(), cashAppPayConfiguration, context), getShowStorePaymentField(sessionParams, cashAppPayConfiguration), (cashAppPayConfiguration == null || (storePaymentMethod = cashAppPayConfiguration.getStorePaymentMethod()) == null) ? false : storePaymentMethod.booleanValue(), clientId, scopeId);
    }

    @NotNull
    public final CashAppPayComponentParams mapToParams(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull Locale deviceLocale, @Nullable DropInOverrideParams dropInOverrideParams, @Nullable SessionParams componentSessionParams, @NotNull PaymentMethod paymentMethod, @NotNull Context context) {
        String clientId;
        String scopeId;
        checkoutConfiguration.getClass();
        deviceLocale.getClass();
        paymentMethod.getClass();
        context.getClass();
        Configuration configuration = paymentMethod.getConfiguration();
        if (configuration == null || (clientId = configuration.getClientId()) == null) {
            throw new ComponentException("Cannot launch Cash App Pay, clientId is missing in the payment method object.", null, 2, null);
        }
        Configuration configuration2 = paymentMethod.getConfiguration();
        if (configuration2 == null || (scopeId = configuration2.getScopeId()) == null) {
            throw new ComponentException("Cannot launch Cash App Pay, scopeId is missing in the payment method object.", null, 2, null);
        }
        CommonComponentParamsMapperData commonComponentParamsMapperDataMapToParams = this.commonComponentParamsMapper.mapToParams(checkoutConfiguration, deviceLocale, dropInOverrideParams, componentSessionParams);
        CashAppPayComponentParams cashAppPayComponentParamsMapToParamsInternal = mapToParamsInternal(commonComponentParamsMapperDataMapToParams.getCommonComponentParams(), commonComponentParamsMapperDataMapToParams.getSessionParams(), dropInOverrideParams, CashAppPayConfigurationKt.getCashAppPayConfiguration(checkoutConfiguration), clientId, scopeId, context, checkoutConfiguration);
        if (cashAppPayComponentParamsMapToParamsInternal.getReturnUrl() != null) {
            return cashAppPayComponentParamsMapToParamsInternal;
        }
        throw new ComponentException("Cannot launch Cash App Pay, set the returnUrl in your CashAppPayConfiguration.Builder", null, 2, null);
    }

    @NotNull
    public final CashAppPayComponentParams mapToParams(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull Locale deviceLocale, @Nullable DropInOverrideParams dropInOverrideParams, @Nullable SessionParams componentSessionParams, @NotNull StoredPaymentMethod storedPaymentMethod, @NotNull Context context) {
        checkoutConfiguration.getClass();
        deviceLocale.getClass();
        storedPaymentMethod.getClass();
        context.getClass();
        CommonComponentParamsMapperData commonComponentParamsMapperDataMapToParams = this.commonComponentParamsMapper.mapToParams(checkoutConfiguration, deviceLocale, dropInOverrideParams, componentSessionParams);
        return mapToParamsInternal(commonComponentParamsMapperDataMapToParams.getCommonComponentParams(), commonComponentParamsMapperDataMapToParams.getSessionParams(), dropInOverrideParams, CashAppPayConfigurationKt.getCashAppPayConfiguration(checkoutConfiguration), null, null, context, checkoutConfiguration);
    }
}
