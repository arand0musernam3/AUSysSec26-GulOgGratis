package com.adyen.checkout.googlepay.internal.ui.model;

import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.Configuration;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParams;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapper;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapperData;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.components.core.internal.ui.model.SessionParams;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.googlepay.AllowedAuthMethods;
import com.adyen.checkout.googlepay.AllowedCardNetworks;
import com.adyen.checkout.googlepay.GooglePayConfiguration;
import com.adyen.checkout.googlepay.GooglePayConfigurationKt;
import com.adyen.checkout.googlepay.MerchantInfo;
import com.adyen.checkout.googlepay.ShippingAddressParameters;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J2\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\b\u001a\u00020\tJ*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\"\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u0004\u0018\u00010\u000fH\u0002J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010\"\u001a\u00020\u0007*\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParamsMapper;", "", "commonComponentParamsMapper", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParamsMapper;", "(Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParamsMapper;)V", "getAvailableCardNetworksFromApi", "", "", "paymentMethod", "Lcom/adyen/checkout/components/core/PaymentMethod;", "getGooglePayEnvironment", "", "environment", "Lcom/adyen/checkout/core/Environment;", "googlePayConfiguration", "Lcom/adyen/checkout/googlepay/GooglePayConfiguration;", "mapBrandToGooglePayNetwork", "brand", "mapToParams", "Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;", "checkoutConfiguration", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "deviceLocale", "Ljava/util/Locale;", "dropInOverrideParams", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "componentSessionParams", "Lcom/adyen/checkout/components/core/internal/ui/model/SessionParams;", "commonComponentParams", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;", "shouldShowSubmitButton", "", "getAvailableAuthMethods", "getAvailableCardNetworks", "getPreferredGatewayMerchantId", "Companion", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGooglePayComponentParamsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayComponentParamsMapper.kt\ncom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParamsMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1611#2,9:172\n1863#2:181\n1864#2:200\n1620#2:201\n16#3,17:182\n1#4:199\n*S KotlinDebug\n*F\n+ 1 GooglePayComponentParamsMapper.kt\ncom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParamsMapper\n*L\n138#1:172,9\n138#1:181\n138#1:200\n138#1:201\n141#1:182,17\n138#1:199\n*E\n"})
public final class GooglePayComponentParamsMapper {

    @NotNull
    private static final Amount DEFAULT_AMOUNT = new Amount("USD", 0);

    @NotNull
    private static final String DEFAULT_TOTAL_PRICE_STATUS = "FINAL";

    @NotNull
    private final CommonComponentParamsMapper commonComponentParamsMapper;

    public GooglePayComponentParamsMapper(@NotNull CommonComponentParamsMapper commonComponentParamsMapper) {
        commonComponentParamsMapper.getClass();
        this.commonComponentParamsMapper = commonComponentParamsMapper;
    }

    private final List<String> getAvailableAuthMethods(GooglePayConfiguration googlePayConfiguration) {
        List<String> allowedAuthMethods;
        return (googlePayConfiguration == null || (allowedAuthMethods = googlePayConfiguration.getAllowedAuthMethods()) == null) ? AllowedAuthMethods.INSTANCE.getAllAllowedAuthMethods$googlepay_release() : allowedAuthMethods;
    }

    private final List<String> getAvailableCardNetworks(GooglePayConfiguration googlePayConfiguration, PaymentMethod paymentMethod) {
        List<String> allowedCardNetworks;
        if (googlePayConfiguration != null && (allowedCardNetworks = googlePayConfiguration.getAllowedCardNetworks()) != null) {
            return allowedCardNetworks;
        }
        List<String> availableCardNetworksFromApi = getAvailableCardNetworksFromApi(paymentMethod);
        return availableCardNetworksFromApi == null ? AllowedCardNetworks.INSTANCE.getAllAllowedCardNetworks$googlepay_release() : availableCardNetworksFromApi;
    }

    private final List<String> getAvailableCardNetworksFromApi(PaymentMethod paymentMethod) {
        List<String> brands = paymentMethod.getBrands();
        if (brands == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : brands) {
            String strMapBrandToGooglePayNetwork = mapBrandToGooglePayNetwork(str);
            if (strMapBrandToGooglePayNetwork == null) {
                AdyenLogLevel adyenLogLevel = AdyenLogLevel.ERROR;
                AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
                if (companion.getLogger().shouldLog(adyenLogLevel)) {
                    String name = GooglePayComponentParamsMapper.class.getName();
                    String strY = StringsKt.Y(name, '$');
                    String strW = StringsKt.W('.', strY, strY);
                    if (strW.length() != 0) {
                        name = StringsKt.O(strW, "Kt");
                    }
                    companion.getLogger().log(adyenLogLevel, "CO.".concat(name), a0.p("skipping brand ", str, ", as it is not an allowed card network."), null);
                }
            }
            if (strMapBrandToGooglePayNetwork != null) {
                arrayList.add(strMapBrandToGooglePayNetwork);
            }
        }
        return arrayList;
    }

    private final int getGooglePayEnvironment(Environment environment, GooglePayConfiguration googlePayConfiguration) {
        return (googlePayConfiguration != null ? googlePayConfiguration.getGooglePayEnvironment() : null) != null ? googlePayConfiguration.getGooglePayEnvironment().intValue() : Intrinsics.areEqual(environment, Environment.TEST) ? 3 : 1;
    }

    private final String getPreferredGatewayMerchantId(GooglePayConfiguration googlePayConfiguration, PaymentMethod paymentMethod) {
        String merchantAccount;
        if (googlePayConfiguration != null && (merchantAccount = googlePayConfiguration.getMerchantAccount()) != null) {
            return merchantAccount;
        }
        Configuration configuration = paymentMethod.getConfiguration();
        String gatewayMerchantId = configuration != null ? configuration.getGatewayMerchantId() : null;
        if (gatewayMerchantId != null) {
            return gatewayMerchantId;
        }
        throw new ComponentException("GooglePay merchantAccount not found. Update your API version or pass it manually inside your GooglePayConfiguration", null, 2, null);
    }

    private final String mapBrandToGooglePayNetwork(String brand) {
        if (Intrinsics.areEqual(brand, "mc")) {
            return AllowedCardNetworks.MASTERCARD;
        }
        List<String> allAllowedCardNetworks$googlepay_release = AllowedCardNetworks.INSTANCE.getAllAllowedCardNetworks$googlepay_release();
        Locale locale = Locale.ROOT;
        String upperCase = brand.toUpperCase(locale);
        upperCase.getClass();
        if (!allAllowedCardNetworks$googlepay_release.contains(upperCase)) {
            return null;
        }
        String upperCase2 = brand.toUpperCase(locale);
        upperCase2.getClass();
        return upperCase2;
    }

    private final GooglePayComponentParams mapToParams(CommonComponentParams commonComponentParams, GooglePayConfiguration googlePayConfiguration, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration) {
        String totalPriceStatus;
        Boolean isBillingAddressRequired;
        Boolean isShippingAddressRequired;
        Boolean isExistingPaymentMethodRequired;
        Boolean isEmailRequired;
        Boolean isAllowPrepaidCards;
        Amount amount = commonComponentParams.getAmount();
        if (amount == null) {
            amount = DEFAULT_AMOUNT;
        }
        Amount amount2 = amount;
        boolean zShouldShowSubmitButton = shouldShowSubmitButton(commonComponentParams, googlePayConfiguration, checkoutConfiguration);
        String preferredGatewayMerchantId = getPreferredGatewayMerchantId(googlePayConfiguration, paymentMethod);
        List<String> availableAuthMethods = getAvailableAuthMethods(googlePayConfiguration);
        List<String> availableCardNetworks = getAvailableCardNetworks(googlePayConfiguration, paymentMethod);
        List<String> allowedIssuerCountryCodes = googlePayConfiguration != null ? googlePayConfiguration.getAllowedIssuerCountryCodes() : null;
        List<String> blockedIssuerCountryCodes = googlePayConfiguration != null ? googlePayConfiguration.getBlockedIssuerCountryCodes() : null;
        int googlePayEnvironment = getGooglePayEnvironment(commonComponentParams.getEnvironment(), googlePayConfiguration);
        if (googlePayConfiguration == null || (totalPriceStatus = googlePayConfiguration.getTotalPriceStatus()) == null) {
            totalPriceStatus = DEFAULT_TOTAL_PRICE_STATUS;
        }
        String str = totalPriceStatus;
        String countryCode = googlePayConfiguration != null ? googlePayConfiguration.getCountryCode() : null;
        MerchantInfo merchantInfo = googlePayConfiguration != null ? googlePayConfiguration.getMerchantInfo() : null;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = (googlePayConfiguration == null || (isAllowPrepaidCards = googlePayConfiguration.getIsAllowPrepaidCards()) == null) ? false : isAllowPrepaidCards.booleanValue();
        Boolean isAllowCreditCards = googlePayConfiguration != null ? googlePayConfiguration.getIsAllowCreditCards() : null;
        Boolean isAssuranceDetailsRequired = googlePayConfiguration != null ? googlePayConfiguration.getIsAssuranceDetailsRequired() : null;
        boolean zBooleanValue3 = (googlePayConfiguration == null || (isEmailRequired = googlePayConfiguration.getIsEmailRequired()) == null) ? false : isEmailRequired.booleanValue();
        boolean zBooleanValue4 = (googlePayConfiguration == null || (isExistingPaymentMethodRequired = googlePayConfiguration.getIsExistingPaymentMethodRequired()) == null) ? false : isExistingPaymentMethodRequired.booleanValue();
        boolean zBooleanValue5 = (googlePayConfiguration == null || (isShippingAddressRequired = googlePayConfiguration.getIsShippingAddressRequired()) == null) ? false : isShippingAddressRequired.booleanValue();
        ShippingAddressParameters shippingAddressParameters = googlePayConfiguration != null ? googlePayConfiguration.getShippingAddressParameters() : null;
        if (googlePayConfiguration != null && (isBillingAddressRequired = googlePayConfiguration.getIsBillingAddressRequired()) != null) {
            zBooleanValue = isBillingAddressRequired.booleanValue();
        }
        return new GooglePayComponentParams(commonComponentParams, amount2, zShouldShowSubmitButton, preferredGatewayMerchantId, googlePayEnvironment, str, countryCode, merchantInfo, availableAuthMethods, availableCardNetworks, allowedIssuerCountryCodes, blockedIssuerCountryCodes, zBooleanValue2, isAllowCreditCards, isAssuranceDetailsRequired, zBooleanValue3, zBooleanValue4, zBooleanValue5, shippingAddressParameters, zBooleanValue, googlePayConfiguration != null ? googlePayConfiguration.getBillingAddressParameters() : null, googlePayConfiguration != null ? googlePayConfiguration.getCheckoutOption() : null, googlePayConfiguration != null ? googlePayConfiguration.getGooglePayButtonStyling() : null);
    }

    private final boolean shouldShowSubmitButton(CommonComponentParams commonComponentParams, GooglePayConfiguration googlePayConfiguration, CheckoutConfiguration checkoutConfiguration) {
        Boolean isSubmitButtonVisible;
        if (commonComponentParams.isCreatedByDropIn()) {
            return false;
        }
        if (googlePayConfiguration != null && (isSubmitButtonVisible = googlePayConfiguration.getIsSubmitButtonVisible()) != null) {
            return isSubmitButtonVisible.booleanValue();
        }
        Boolean isSubmitButtonVisible2 = checkoutConfiguration.getIsSubmitButtonVisible();
        if (isSubmitButtonVisible2 != null) {
            return isSubmitButtonVisible2.booleanValue();
        }
        return false;
    }

    @NotNull
    public final GooglePayComponentParams mapToParams(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull Locale deviceLocale, @Nullable DropInOverrideParams dropInOverrideParams, @Nullable SessionParams componentSessionParams, @NotNull PaymentMethod paymentMethod) {
        checkoutConfiguration.getClass();
        deviceLocale.getClass();
        paymentMethod.getClass();
        CommonComponentParamsMapperData commonComponentParamsMapperDataMapToParams = this.commonComponentParamsMapper.mapToParams(checkoutConfiguration, deviceLocale, dropInOverrideParams, componentSessionParams);
        return mapToParams(commonComponentParamsMapperDataMapToParams.getCommonComponentParams(), GooglePayConfigurationKt.getGooglePayConfiguration(checkoutConfiguration), paymentMethod, checkoutConfiguration);
    }
}
