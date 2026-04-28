package com.adyen.checkout.googlepay;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.adyen.checkout.action.core.GenericActionConfiguration;
import com.adyen.checkout.action.core.internal.ActionHandlingPaymentMethodConfigurationBuilder;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.AnalyticsConfiguration;
import com.adyen.checkout.components.core.internal.ButtonConfiguration;
import com.adyen.checkout.components.core.internal.ButtonConfigurationBuilder;
import com.adyen.checkout.components.core.internal.Configuration;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.core.exception.CheckoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001TB§\u0002\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0017\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0017\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0017\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000e\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\u0006\u0010)\u001a\u00020*¢\u0006\u0002\u0010+J\t\u0010N\u001a\u00020\u0011HÖ\u0001J\u0019\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b6\u0010-R\u0013\u0010&\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b:\u00108R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0014\u0010)\u001a\u00020*X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010C\u001a\u0004\bA\u0010BR\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010E\u001a\u0004\b\u001c\u0010DR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010E\u001a\u0004\b\u001b\u0010DR\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010E\u001a\u0004\b\u001d\u0010DR\u0015\u0010#\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010E\u001a\u0004\b#\u0010DR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010E\u001a\u0004\b\u001e\u0010DR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010E\u001a\u0004\b\u001f\u0010DR\u0015\u0010 \u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010E\u001a\u0004\b \u0010DR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\n\n\u0002\u0010E\u001a\u0004\b\r\u0010DR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bF\u00108R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bM\u00108¨\u0006U"}, d2 = {"Lcom/adyen/checkout/googlepay/GooglePayConfiguration;", "Lcom/adyen/checkout/components/core/internal/Configuration;", "Lcom/adyen/checkout/components/core/internal/ButtonConfiguration;", "shopperLocale", "Ljava/util/Locale;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "analyticsConfiguration", "Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "amount", "Lcom/adyen/checkout/components/core/Amount;", "isSubmitButtonVisible", "", "merchantAccount", "googlePayEnvironment", "", "totalPriceStatus", "countryCode", "merchantInfo", "Lcom/adyen/checkout/googlepay/MerchantInfo;", "allowedAuthMethods", "", "allowedCardNetworks", "allowedIssuerCountryCodes", "blockedIssuerCountryCodes", "isAllowPrepaidCards", "isAllowCreditCards", "isAssuranceDetailsRequired", "isEmailRequired", "isExistingPaymentMethodRequired", "isShippingAddressRequired", "shippingAddressParameters", "Lcom/adyen/checkout/googlepay/ShippingAddressParameters;", "isBillingAddressRequired", "billingAddressParameters", "Lcom/adyen/checkout/googlepay/BillingAddressParameters;", "checkoutOption", "googlePayButtonStyling", "Lcom/adyen/checkout/googlepay/GooglePayButtonStyling;", "genericActionConfiguration", "Lcom/adyen/checkout/action/core/GenericActionConfiguration;", "(Ljava/util/Locale;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;Lcom/adyen/checkout/components/core/AnalyticsConfiguration;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/googlepay/MerchantInfo;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/adyen/checkout/googlepay/ShippingAddressParameters;Ljava/lang/Boolean;Lcom/adyen/checkout/googlepay/BillingAddressParameters;Ljava/lang/String;Lcom/adyen/checkout/googlepay/GooglePayButtonStyling;Lcom/adyen/checkout/action/core/GenericActionConfiguration;)V", "getAllowedAuthMethods", "()Ljava/util/List;", "getAllowedCardNetworks", "getAllowedIssuerCountryCodes", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "getAnalyticsConfiguration", "()Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "getBillingAddressParameters", "()Lcom/adyen/checkout/googlepay/BillingAddressParameters;", "getBlockedIssuerCountryCodes", "getCheckoutOption", "()Ljava/lang/String;", "getClientKey", "getCountryCode", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "getGenericActionConfiguration$googlepay_release", "()Lcom/adyen/checkout/action/core/GenericActionConfiguration;", "getGooglePayButtonStyling", "()Lcom/adyen/checkout/googlepay/GooglePayButtonStyling;", "getGooglePayEnvironment", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMerchantAccount", "getMerchantInfo", "()Lcom/adyen/checkout/googlepay/MerchantInfo;", "getShippingAddressParameters", "()Lcom/adyen/checkout/googlepay/ShippingAddressParameters;", "getShopperLocale", "()Ljava/util/Locale;", "getTotalPriceStatus", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class GooglePayConfiguration implements Configuration, ButtonConfiguration {

    @NotNull
    public static final Parcelable.Creator<GooglePayConfiguration> CREATOR = new Creator();

    @Nullable
    private final List<String> allowedAuthMethods;

    @Nullable
    private final List<String> allowedCardNetworks;

    @Nullable
    private final List<String> allowedIssuerCountryCodes;

    @Nullable
    private final Amount amount;

    @Nullable
    private final AnalyticsConfiguration analyticsConfiguration;

    @Nullable
    private final BillingAddressParameters billingAddressParameters;

    @Nullable
    private final List<String> blockedIssuerCountryCodes;

    @Nullable
    private final String checkoutOption;

    @NotNull
    private final String clientKey;

    @Nullable
    private final String countryCode;

    @NotNull
    private final Environment environment;

    @NotNull
    private final GenericActionConfiguration genericActionConfiguration;

    @Nullable
    private final GooglePayButtonStyling googlePayButtonStyling;

    @Nullable
    private final Integer googlePayEnvironment;

    @Nullable
    private final Boolean isAllowCreditCards;

    @Nullable
    private final Boolean isAllowPrepaidCards;

    @Nullable
    private final Boolean isAssuranceDetailsRequired;

    @Nullable
    private final Boolean isBillingAddressRequired;

    @Nullable
    private final Boolean isEmailRequired;

    @Nullable
    private final Boolean isExistingPaymentMethodRequired;

    @Nullable
    private final Boolean isShippingAddressRequired;

    @Nullable
    private final Boolean isSubmitButtonVisible;

    @Nullable
    private final String merchantAccount;

    @Nullable
    private final MerchantInfo merchantInfo;

    @Nullable
    private final ShippingAddressParameters shippingAddressParameters;

    @Nullable
    private final Locale shopperLocale;

    @Nullable
    private final String totalPriceStatus;

    private GooglePayConfiguration(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, Boolean bool, String str2, Integer num, String str3, String str4, MerchantInfo merchantInfo, List<String> list, List<String> list2, List<String> list3, List<String> list4, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, ShippingAddressParameters shippingAddressParameters, Boolean bool8, BillingAddressParameters billingAddressParameters, String str5, GooglePayButtonStyling googlePayButtonStyling, GenericActionConfiguration genericActionConfiguration) {
        this.shopperLocale = locale;
        this.environment = environment;
        this.clientKey = str;
        this.analyticsConfiguration = analyticsConfiguration;
        this.amount = amount;
        this.isSubmitButtonVisible = bool;
        this.merchantAccount = str2;
        this.googlePayEnvironment = num;
        this.totalPriceStatus = str3;
        this.countryCode = str4;
        this.merchantInfo = merchantInfo;
        this.allowedAuthMethods = list;
        this.allowedCardNetworks = list2;
        this.allowedIssuerCountryCodes = list3;
        this.blockedIssuerCountryCodes = list4;
        this.isAllowPrepaidCards = bool2;
        this.isAllowCreditCards = bool3;
        this.isAssuranceDetailsRequired = bool4;
        this.isEmailRequired = bool5;
        this.isExistingPaymentMethodRequired = bool6;
        this.isShippingAddressRequired = bool7;
        this.shippingAddressParameters = shippingAddressParameters;
        this.isBillingAddressRequired = bool8;
        this.billingAddressParameters = billingAddressParameters;
        this.checkoutOption = str5;
        this.googlePayButtonStyling = googlePayButtonStyling;
        this.genericActionConfiguration = genericActionConfiguration;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final List<String> getAllowedAuthMethods() {
        return this.allowedAuthMethods;
    }

    @Nullable
    public final List<String> getAllowedCardNetworks() {
        return this.allowedCardNetworks;
    }

    @Nullable
    public final List<String> getAllowedIssuerCountryCodes() {
        return this.allowedIssuerCountryCodes;
    }

    @Override // com.adyen.checkout.components.core.internal.Configuration
    @Nullable
    public Amount getAmount() {
        return this.amount;
    }

    @Override // com.adyen.checkout.components.core.internal.Configuration
    @Nullable
    public AnalyticsConfiguration getAnalyticsConfiguration() {
        return this.analyticsConfiguration;
    }

    @Nullable
    public final BillingAddressParameters getBillingAddressParameters() {
        return this.billingAddressParameters;
    }

    @Nullable
    public final List<String> getBlockedIssuerCountryCodes() {
        return this.blockedIssuerCountryCodes;
    }

    @Nullable
    public final String getCheckoutOption() {
        return this.checkoutOption;
    }

    @Override // com.adyen.checkout.components.core.internal.Configuration
    @NotNull
    public String getClientKey() {
        return this.clientKey;
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Override // com.adyen.checkout.components.core.internal.Configuration
    @NotNull
    public Environment getEnvironment() {
        return this.environment;
    }

    @NotNull
    /* JADX INFO: renamed from: getGenericActionConfiguration$googlepay_release, reason: from getter */
    public final GenericActionConfiguration getGenericActionConfiguration() {
        return this.genericActionConfiguration;
    }

    @Nullable
    public final GooglePayButtonStyling getGooglePayButtonStyling() {
        return this.googlePayButtonStyling;
    }

    @Nullable
    public final Integer getGooglePayEnvironment() {
        return this.googlePayEnvironment;
    }

    @Nullable
    public final String getMerchantAccount() {
        return this.merchantAccount;
    }

    @Nullable
    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    @Nullable
    public final ShippingAddressParameters getShippingAddressParameters() {
        return this.shippingAddressParameters;
    }

    @Override // com.adyen.checkout.components.core.internal.Configuration
    @Nullable
    public Locale getShopperLocale() {
        return this.shopperLocale;
    }

    @Nullable
    public final String getTotalPriceStatus() {
        return this.totalPriceStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: isAllowCreditCards, reason: from getter */
    public final Boolean getIsAllowCreditCards() {
        return this.isAllowCreditCards;
    }

    @Nullable
    /* JADX INFO: renamed from: isAllowPrepaidCards, reason: from getter */
    public final Boolean getIsAllowPrepaidCards() {
        return this.isAllowPrepaidCards;
    }

    @Nullable
    /* JADX INFO: renamed from: isAssuranceDetailsRequired, reason: from getter */
    public final Boolean getIsAssuranceDetailsRequired() {
        return this.isAssuranceDetailsRequired;
    }

    @Nullable
    /* JADX INFO: renamed from: isBillingAddressRequired, reason: from getter */
    public final Boolean getIsBillingAddressRequired() {
        return this.isBillingAddressRequired;
    }

    @Nullable
    /* JADX INFO: renamed from: isEmailRequired, reason: from getter */
    public final Boolean getIsEmailRequired() {
        return this.isEmailRequired;
    }

    @Nullable
    /* JADX INFO: renamed from: isExistingPaymentMethodRequired, reason: from getter */
    public final Boolean getIsExistingPaymentMethodRequired() {
        return this.isExistingPaymentMethodRequired;
    }

    @Nullable
    /* JADX INFO: renamed from: isShippingAddressRequired, reason: from getter */
    public final Boolean getIsShippingAddressRequired() {
        return this.isShippingAddressRequired;
    }

    @Override // com.adyen.checkout.components.core.internal.ButtonConfiguration
    @Nullable
    /* JADX INFO: renamed from: isSubmitButtonVisible, reason: from getter */
    public Boolean getIsSubmitButtonVisible() {
        return this.isSubmitButtonVisible;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeSerializable(this.shopperLocale);
        parcel.writeParcelable(this.environment, flags);
        parcel.writeString(this.clientKey);
        parcel.writeParcelable(this.analyticsConfiguration, flags);
        parcel.writeParcelable(this.amount, flags);
        Boolean bool = this.isSubmitButtonVisible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool);
        }
        parcel.writeString(this.merchantAccount);
        Integer num = this.googlePayEnvironment;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            i.w(parcel, 1, num);
        }
        parcel.writeString(this.totalPriceStatus);
        parcel.writeString(this.countryCode);
        MerchantInfo merchantInfo = this.merchantInfo;
        if (merchantInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            merchantInfo.writeToParcel(parcel, flags);
        }
        parcel.writeStringList(this.allowedAuthMethods);
        parcel.writeStringList(this.allowedCardNetworks);
        parcel.writeStringList(this.allowedIssuerCountryCodes);
        parcel.writeStringList(this.blockedIssuerCountryCodes);
        Boolean bool2 = this.isAllowPrepaidCards;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool2);
        }
        Boolean bool3 = this.isAllowCreditCards;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool3);
        }
        Boolean bool4 = this.isAssuranceDetailsRequired;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool4);
        }
        Boolean bool5 = this.isEmailRequired;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool5);
        }
        Boolean bool6 = this.isExistingPaymentMethodRequired;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool6);
        }
        Boolean bool7 = this.isShippingAddressRequired;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool7);
        }
        ShippingAddressParameters shippingAddressParameters = this.shippingAddressParameters;
        if (shippingAddressParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingAddressParameters.writeToParcel(parcel, flags);
        }
        Boolean bool8 = this.isBillingAddressRequired;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool8);
        }
        BillingAddressParameters billingAddressParameters = this.billingAddressParameters;
        if (billingAddressParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            billingAddressParameters.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.checkoutOption);
        GooglePayButtonStyling googlePayButtonStyling = this.googlePayButtonStyling;
        if (googlePayButtonStyling == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            googlePayButtonStyling.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.genericActionConfiguration, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003B\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0017\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bB\u001f\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\b\u0010b\u001a\u00020\u0002H\u0014J\u0017\u0010c\u001a\u00020;2\b\u0010\u0004\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0002\u0010dJ\u0010\u0010=\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;H\u0007J\u0010\u0010A\u001a\u00020\u00002\u0006\u0010@\u001a\u00020;H\u0007J\u0018\u0010\u0013\u001a\u00020\u00002\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010H\u0007J\u0018\u0010\u0017\u001a\u00020\u00002\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010H\u0007J\u0016\u0010\u001a\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0007J\u0010\u0010e\u001a\u00020\u00002\u0006\u0010f\u001a\u00020gH\u0017J\u0010\u0010C\u001a\u00020\u00002\u0006\u0010B\u001a\u00020;H\u0007J\u0012\u0010\u001f\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J\u0010\u0010E\u001a\u00020\u00002\u0006\u0010D\u001a\u00020;H\u0007J\u0016\u0010#\u001a\u00020\u00002\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0007J\u0010\u0010'\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0007H\u0007J\u0012\u0010+\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010G\u001a\u00020\u00002\u0006\u0010F\u001a\u00020;H\u0007J\u0010\u0010I\u001a\u00020\u00002\u0006\u0010H\u001a\u00020;H\u0007J\u0010\u00100\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-H\u0007J\u0010\u00107\u001a\u00020\u00002\u0006\u00104\u001a\u000203H\u0007J\u0010\u0010R\u001a\u00020\u00002\u0006\u0010P\u001a\u00020\u0007H\u0007J\u0012\u0010W\u001a\u00020\u00002\b\u0010S\u001a\u0004\u0018\u00010TH\u0007J\u0012\u0010]\u001a\u00020\u00002\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0007J\u0010\u0010K\u001a\u00020\u00002\u0006\u0010J\u001a\u00020;H\u0007J\u0010\u0010O\u001a\u00020\u00002\u0006\u0010L\u001a\u00020;H\u0017J\u0010\u0010a\u001a\u00020\u00002\u0006\u0010_\u001a\u00020\u0007H\u0007R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001c\u0010$\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00104\u001a\u0004\u0018\u0001032\b\u00102\u001a\u0004\u0018\u000103@FX\u0086\u000e¢\u0006\u0010\n\u0002\u00109\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\b:\u0010<\"\u0004\b=\u0010>R\u001e\u0010@\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R\u001e\u0010B\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\bB\u0010<\"\u0004\bC\u0010>R\u001e\u0010D\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\bD\u0010<\"\u0004\bE\u0010>R\u001e\u0010F\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\bF\u0010<\"\u0004\bG\u0010>R\u001e\u0010H\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\bH\u0010<\"\u0004\bI\u0010>R\u001e\u0010J\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u0010\n\u0002\u0010?\u001a\u0004\bJ\u0010<\"\u0004\bK\u0010>R(\u0010L\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010?\u0012\u0004\bM\u0010N\u001a\u0004\bL\u0010<\"\u0004\bO\u0010>R\u001c\u0010P\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010&\"\u0004\bR\u0010(R\u001c\u0010S\u001a\u0004\u0018\u00010TX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010Y\u001a\u0004\u0018\u00010ZX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001c\u0010_\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010&\"\u0004\ba\u0010(¨\u0006h"}, d2 = {"Lcom/adyen/checkout/googlepay/GooglePayConfiguration$Builder;", "Lcom/adyen/checkout/action/core/internal/ActionHandlingPaymentMethodConfigurationBuilder;", "Lcom/adyen/checkout/googlepay/GooglePayConfiguration;", "Lcom/adyen/checkout/components/core/internal/ButtonConfigurationBuilder;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "(Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "shopperLocale", "Ljava/util/Locale;", "(Ljava/util/Locale;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "allowedAuthMethods", "", "getAllowedAuthMethods", "()Ljava/util/List;", "setAllowedAuthMethods", "(Ljava/util/List;)V", "allowedCardNetworks", "getAllowedCardNetworks", "setAllowedCardNetworks", "allowedIssuerCountryCodes", "getAllowedIssuerCountryCodes", "setAllowedIssuerCountryCodes", "billingAddressParameters", "Lcom/adyen/checkout/googlepay/BillingAddressParameters;", "getBillingAddressParameters", "()Lcom/adyen/checkout/googlepay/BillingAddressParameters;", "setBillingAddressParameters", "(Lcom/adyen/checkout/googlepay/BillingAddressParameters;)V", "blockedIssuerCountryCodes", "getBlockedIssuerCountryCodes", "setBlockedIssuerCountryCodes", "checkoutOption", "getCheckoutOption", "()Ljava/lang/String;", "setCheckoutOption", "(Ljava/lang/String;)V", "countryCode", "getCountryCode", "setCountryCode", "googlePayButtonStyling", "Lcom/adyen/checkout/googlepay/GooglePayButtonStyling;", "getGooglePayButtonStyling", "()Lcom/adyen/checkout/googlepay/GooglePayButtonStyling;", "setGooglePayButtonStyling", "(Lcom/adyen/checkout/googlepay/GooglePayButtonStyling;)V", "value", "", "googlePayEnvironment", "getGooglePayEnvironment", "()Ljava/lang/Integer;", "setGooglePayEnvironment", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isAllowCreditCards", "", "()Ljava/lang/Boolean;", "setAllowCreditCards", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isAllowPrepaidCards", "setAllowPrepaidCards", "isAssuranceDetailsRequired", "setAssuranceDetailsRequired", "isBillingAddressRequired", "setBillingAddressRequired", "isEmailRequired", "setEmailRequired", "isExistingPaymentMethodRequired", "setExistingPaymentMethodRequired", "isShippingAddressRequired", "setShippingAddressRequired", "isSubmitButtonVisible", "isSubmitButtonVisible$annotations", "()V", "setSubmitButtonVisible", "merchantAccount", "getMerchantAccount", "setMerchantAccount", "merchantInfo", "Lcom/adyen/checkout/googlepay/MerchantInfo;", "getMerchantInfo", "()Lcom/adyen/checkout/googlepay/MerchantInfo;", "setMerchantInfo", "(Lcom/adyen/checkout/googlepay/MerchantInfo;)V", "shippingAddressParameters", "Lcom/adyen/checkout/googlepay/ShippingAddressParameters;", "getShippingAddressParameters", "()Lcom/adyen/checkout/googlepay/ShippingAddressParameters;", "setShippingAddressParameters", "(Lcom/adyen/checkout/googlepay/ShippingAddressParameters;)V", "totalPriceStatus", "getTotalPriceStatus", "setTotalPriceStatus", "buildInternal", "isGooglePayEnvironmentValid", "(Ljava/lang/Integer;)Z", "setAmount", "amount", "Lcom/adyen/checkout/components/core/Amount;", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Builder extends ActionHandlingPaymentMethodConfigurationBuilder<GooglePayConfiguration, Builder> implements ButtonConfigurationBuilder {

        @Nullable
        private List<String> allowedAuthMethods;

        @Nullable
        private List<String> allowedCardNetworks;

        @Nullable
        private List<String> allowedIssuerCountryCodes;

        @Nullable
        private BillingAddressParameters billingAddressParameters;

        @Nullable
        private List<String> blockedIssuerCountryCodes;

        @Nullable
        private String checkoutOption;

        @Nullable
        private String countryCode;

        @Nullable
        private GooglePayButtonStyling googlePayButtonStyling;

        @Nullable
        private Integer googlePayEnvironment;

        @Nullable
        private Boolean isAllowCreditCards;

        @Nullable
        private Boolean isAllowPrepaidCards;

        @Nullable
        private Boolean isAssuranceDetailsRequired;

        @Nullable
        private Boolean isBillingAddressRequired;

        @Nullable
        private Boolean isEmailRequired;

        @Nullable
        private Boolean isExistingPaymentMethodRequired;

        @Nullable
        private Boolean isShippingAddressRequired;

        @Nullable
        private Boolean isSubmitButtonVisible;

        @Nullable
        private String merchantAccount;

        @Nullable
        private MerchantInfo merchantInfo;

        @Nullable
        private ShippingAddressParameters shippingAddressParameters;

        @Nullable
        private String totalPriceStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @d
        public Builder(@NotNull Context context, @NotNull Environment environment, @NotNull String str) {
            super(context, environment, str);
            context.getClass();
            environment.getClass();
            str.getClass();
        }

        private final boolean isGooglePayEnvironmentValid(Integer environment) {
            return (environment != null && environment.intValue() == 3) || (environment != null && environment.intValue() == 1);
        }

        @Override // com.adyen.checkout.components.core.internal.BaseConfigurationBuilder
        @NotNull
        public GooglePayConfiguration buildInternal() {
            if (this.allowedIssuerCountryCodes == null || this.blockedIssuerCountryCodes == null) {
                return new GooglePayConfiguration(getShopperLocale(), getEnvironment(), getClientKey(), getAnalyticsConfiguration(), getAmount(), this.isSubmitButtonVisible, this.merchantAccount, this.googlePayEnvironment, this.totalPriceStatus, this.countryCode, this.merchantInfo, this.allowedAuthMethods, this.allowedCardNetworks, this.allowedIssuerCountryCodes, this.blockedIssuerCountryCodes, this.isAllowPrepaidCards, this.isAllowCreditCards, this.isAssuranceDetailsRequired, this.isEmailRequired, this.isExistingPaymentMethodRequired, this.isShippingAddressRequired, this.shippingAddressParameters, this.isBillingAddressRequired, this.billingAddressParameters, this.checkoutOption, this.googlePayButtonStyling, getGenericActionConfigurationBuilder().build(), null);
            }
            throw new CheckoutException("allowedIssuerCountryCodes and blockedIssuerCountryCodes are mutually exclusive, please set only one at a time", null, 2, null);
        }

        @Nullable
        public final List<String> getAllowedAuthMethods() {
            return this.allowedAuthMethods;
        }

        @Nullable
        public final List<String> getAllowedCardNetworks() {
            return this.allowedCardNetworks;
        }

        @Nullable
        public final List<String> getAllowedIssuerCountryCodes() {
            return this.allowedIssuerCountryCodes;
        }

        @Nullable
        public final BillingAddressParameters getBillingAddressParameters() {
            return this.billingAddressParameters;
        }

        @Nullable
        public final List<String> getBlockedIssuerCountryCodes() {
            return this.blockedIssuerCountryCodes;
        }

        @Nullable
        public final String getCheckoutOption() {
            return this.checkoutOption;
        }

        @Nullable
        public final String getCountryCode() {
            return this.countryCode;
        }

        @Nullable
        public final GooglePayButtonStyling getGooglePayButtonStyling() {
            return this.googlePayButtonStyling;
        }

        @Nullable
        public final Integer getGooglePayEnvironment() {
            return this.googlePayEnvironment;
        }

        @Nullable
        public final String getMerchantAccount() {
            return this.merchantAccount;
        }

        @Nullable
        public final MerchantInfo getMerchantInfo() {
            return this.merchantInfo;
        }

        @Nullable
        public final ShippingAddressParameters getShippingAddressParameters() {
            return this.shippingAddressParameters;
        }

        @Nullable
        public final String getTotalPriceStatus() {
            return this.totalPriceStatus;
        }

        @Nullable
        /* JADX INFO: renamed from: isAllowCreditCards, reason: from getter */
        public final Boolean getIsAllowCreditCards() {
            return this.isAllowCreditCards;
        }

        @Nullable
        /* JADX INFO: renamed from: isAllowPrepaidCards, reason: from getter */
        public final Boolean getIsAllowPrepaidCards() {
            return this.isAllowPrepaidCards;
        }

        @Nullable
        /* JADX INFO: renamed from: isAssuranceDetailsRequired, reason: from getter */
        public final Boolean getIsAssuranceDetailsRequired() {
            return this.isAssuranceDetailsRequired;
        }

        @Nullable
        /* JADX INFO: renamed from: isBillingAddressRequired, reason: from getter */
        public final Boolean getIsBillingAddressRequired() {
            return this.isBillingAddressRequired;
        }

        @Nullable
        /* JADX INFO: renamed from: isEmailRequired, reason: from getter */
        public final Boolean getIsEmailRequired() {
            return this.isEmailRequired;
        }

        @Nullable
        /* JADX INFO: renamed from: isExistingPaymentMethodRequired, reason: from getter */
        public final Boolean getIsExistingPaymentMethodRequired() {
            return this.isExistingPaymentMethodRequired;
        }

        @Nullable
        /* JADX INFO: renamed from: isShippingAddressRequired, reason: from getter */
        public final Boolean getIsShippingAddressRequired() {
            return this.isShippingAddressRequired;
        }

        @Nullable
        /* JADX INFO: renamed from: isSubmitButtonVisible, reason: from getter */
        public final Boolean getIsSubmitButtonVisible() {
            return this.isSubmitButtonVisible;
        }

        @d
        @NotNull
        public final Builder setAllowCreditCards(boolean isAllowCreditCards) {
            this.isAllowCreditCards = Boolean.valueOf(isAllowCreditCards);
            return this;
        }

        @d
        @NotNull
        public final Builder setAllowPrepaidCards(boolean isAllowPrepaidCards) {
            this.isAllowPrepaidCards = Boolean.valueOf(isAllowPrepaidCards);
            return this;
        }

        /* JADX INFO: renamed from: setAllowedAuthMethods, reason: collision with other method in class */
        public final void m91setAllowedAuthMethods(@Nullable List<String> list) {
            this.allowedAuthMethods = list;
        }

        /* JADX INFO: renamed from: setAllowedCardNetworks, reason: collision with other method in class */
        public final void m92setAllowedCardNetworks(@Nullable List<String> list) {
            this.allowedCardNetworks = list;
        }

        @d
        @NotNull
        public final Builder setAllowedIssuerCountryCodes(@NotNull List<String> allowedIssuerCountryCodes) {
            allowedIssuerCountryCodes.getClass();
            this.allowedIssuerCountryCodes = allowedIssuerCountryCodes;
            return this;
        }

        @Override // com.adyen.checkout.components.core.internal.BaseConfigurationBuilder
        @d
        @NotNull
        public Builder setAmount(@NotNull Amount amount) {
            amount.getClass();
            return (Builder) super.setAmount(amount);
        }

        @d
        @NotNull
        public final Builder setAssuranceDetailsRequired(boolean isAssuranceDetailsRequired) {
            this.isAssuranceDetailsRequired = Boolean.valueOf(isAssuranceDetailsRequired);
            return this;
        }

        /* JADX INFO: renamed from: setBillingAddressParameters, reason: collision with other method in class */
        public final void m94setBillingAddressParameters(@Nullable BillingAddressParameters billingAddressParameters) {
            this.billingAddressParameters = billingAddressParameters;
        }

        @d
        @NotNull
        public final Builder setBillingAddressRequired(boolean isBillingAddressRequired) {
            this.isBillingAddressRequired = Boolean.valueOf(isBillingAddressRequired);
            return this;
        }

        @d
        @NotNull
        public final Builder setBlockedIssuerCountryCodes(@NotNull List<String> blockedIssuerCountryCodes) {
            blockedIssuerCountryCodes.getClass();
            this.blockedIssuerCountryCodes = blockedIssuerCountryCodes;
            return this;
        }

        @d
        @NotNull
        public final Builder setCheckoutOption(@NotNull String checkoutOption) {
            checkoutOption.getClass();
            this.checkoutOption = checkoutOption;
            return this;
        }

        /* JADX INFO: renamed from: setCountryCode, reason: collision with other method in class */
        public final void m97setCountryCode(@Nullable String str) {
            this.countryCode = str;
        }

        @d
        @NotNull
        public final Builder setEmailRequired(boolean isEmailRequired) {
            this.isEmailRequired = Boolean.valueOf(isEmailRequired);
            return this;
        }

        @d
        @NotNull
        public final Builder setExistingPaymentMethodRequired(boolean isExistingPaymentMethodRequired) {
            this.isExistingPaymentMethodRequired = Boolean.valueOf(isExistingPaymentMethodRequired);
            return this;
        }

        @d
        @NotNull
        public final Builder setGooglePayButtonStyling(@NotNull GooglePayButtonStyling googlePayButtonStyling) {
            googlePayButtonStyling.getClass();
            this.googlePayButtonStyling = googlePayButtonStyling;
            return this;
        }

        public final void setGooglePayEnvironment(@Nullable Integer num) {
            if (num != null && !isGooglePayEnvironmentValid(num)) {
                throw new CheckoutException("Invalid value for Google Environment. Use either WalletConstants.ENVIRONMENT_TEST or WalletConstants.ENVIRONMENT_PRODUCTION", null, 2, null);
            }
            this.googlePayEnvironment = num;
        }

        @d
        @NotNull
        public final Builder setMerchantAccount(@NotNull String merchantAccount) {
            merchantAccount.getClass();
            this.merchantAccount = merchantAccount;
            return this;
        }

        /* JADX INFO: renamed from: setMerchantInfo, reason: collision with other method in class */
        public final void m100setMerchantInfo(@Nullable MerchantInfo merchantInfo) {
            this.merchantInfo = merchantInfo;
        }

        /* JADX INFO: renamed from: setShippingAddressParameters, reason: collision with other method in class */
        public final void m101setShippingAddressParameters(@Nullable ShippingAddressParameters shippingAddressParameters) {
            this.shippingAddressParameters = shippingAddressParameters;
        }

        @d
        @NotNull
        public final Builder setShippingAddressRequired(boolean isShippingAddressRequired) {
            this.isShippingAddressRequired = Boolean.valueOf(isShippingAddressRequired);
            return this;
        }

        @Override // com.adyen.checkout.components.core.internal.ButtonConfigurationBuilder
        @d
        @NotNull
        public Builder setSubmitButtonVisible(boolean isSubmitButtonVisible) {
            this.isSubmitButtonVisible = Boolean.valueOf(isSubmitButtonVisible);
            return this;
        }

        @d
        @NotNull
        public final Builder setTotalPriceStatus(@NotNull String totalPriceStatus) {
            totalPriceStatus.getClass();
            this.totalPriceStatus = totalPriceStatus;
            return this;
        }

        @d
        @NotNull
        public final Builder setAllowedAuthMethods(@Nullable List<String> allowedAuthMethods) {
            this.allowedAuthMethods = allowedAuthMethods;
            return this;
        }

        @d
        @NotNull
        public final Builder setAllowedCardNetworks(@Nullable List<String> allowedCardNetworks) {
            this.allowedCardNetworks = allowedCardNetworks;
            return this;
        }

        @d
        @NotNull
        public final Builder setBillingAddressParameters(@Nullable BillingAddressParameters billingAddressParameters) {
            this.billingAddressParameters = billingAddressParameters;
            return this;
        }

        @d
        @NotNull
        public final Builder setCountryCode(@Nullable String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        @d
        @NotNull
        public final Builder setMerchantInfo(@Nullable MerchantInfo merchantInfo) {
            this.merchantInfo = merchantInfo;
            return this;
        }

        @d
        @NotNull
        public final Builder setShippingAddressParameters(@Nullable ShippingAddressParameters shippingAddressParameters) {
            this.shippingAddressParameters = shippingAddressParameters;
            return this;
        }

        /* JADX INFO: renamed from: setAllowedIssuerCountryCodes, reason: collision with other method in class */
        public final void m93setAllowedIssuerCountryCodes(@Nullable List<String> list) {
            this.allowedIssuerCountryCodes = list;
        }

        /* JADX INFO: renamed from: setBlockedIssuerCountryCodes, reason: collision with other method in class */
        public final void m95setBlockedIssuerCountryCodes(@Nullable List<String> list) {
            this.blockedIssuerCountryCodes = list;
        }

        /* JADX INFO: renamed from: setCheckoutOption, reason: collision with other method in class */
        public final void m96setCheckoutOption(@Nullable String str) {
            this.checkoutOption = str;
        }

        /* JADX INFO: renamed from: setGooglePayButtonStyling, reason: collision with other method in class */
        public final void m98setGooglePayButtonStyling(@Nullable GooglePayButtonStyling googlePayButtonStyling) {
            this.googlePayButtonStyling = googlePayButtonStyling;
        }

        /* JADX INFO: renamed from: setMerchantAccount, reason: collision with other method in class */
        public final void m99setMerchantAccount(@Nullable String str) {
            this.merchantAccount = str;
        }

        /* JADX INFO: renamed from: setTotalPriceStatus, reason: collision with other method in class */
        public final void m102setTotalPriceStatus(@Nullable String str) {
            this.totalPriceStatus = str;
        }

        public final void setAllowCreditCards(@Nullable Boolean bool) {
            this.isAllowCreditCards = bool;
        }

        public final void setAllowPrepaidCards(@Nullable Boolean bool) {
            this.isAllowPrepaidCards = bool;
        }

        public final void setAssuranceDetailsRequired(@Nullable Boolean bool) {
            this.isAssuranceDetailsRequired = bool;
        }

        public final void setBillingAddressRequired(@Nullable Boolean bool) {
            this.isBillingAddressRequired = bool;
        }

        public final void setEmailRequired(@Nullable Boolean bool) {
            this.isEmailRequired = bool;
        }

        public final void setExistingPaymentMethodRequired(@Nullable Boolean bool) {
            this.isExistingPaymentMethodRequired = bool;
        }

        public final void setShippingAddressRequired(@Nullable Boolean bool) {
            this.isShippingAddressRequired = bool;
        }

        public final void setSubmitButtonVisible(@Nullable Boolean bool) {
            this.isSubmitButtonVisible = bool;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull Environment environment, @NotNull String str) {
            super(environment, str);
            environment.getClass();
            str.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull Locale locale, @NotNull Environment environment, @NotNull String str) {
            super(locale, environment, str);
            locale.getClass();
            environment.getClass();
            str.getClass();
        }

        @d
        public static /* synthetic */ void isSubmitButtonVisible$annotations() {
        }

        @d
        @NotNull
        public final Builder setGooglePayEnvironment(int googlePayEnvironment) {
            setGooglePayEnvironment(Integer.valueOf(googlePayEnvironment));
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GooglePayConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GooglePayConfiguration createFromParcel(@NotNull Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Boolean boolValueOf7;
            Locale locale;
            ShippingAddressParameters shippingAddressParametersCreateFromParcel;
            Boolean boolValueOf8;
            ShippingAddressParameters shippingAddressParameters;
            BillingAddressParameters billingAddressParametersCreateFromParcel;
            parcel.getClass();
            Locale locale2 = (Locale) parcel.readSerializable();
            Environment environment = (Environment) parcel.readParcelable(GooglePayConfiguration.class.getClassLoader());
            String string = parcel.readString();
            AnalyticsConfiguration analyticsConfiguration = (AnalyticsConfiguration) parcel.readParcelable(GooglePayConfiguration.class.getClassLoader());
            Amount amount = (Amount) parcel.readParcelable(GooglePayConfiguration.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            MerchantInfo merchantInfoCreateFromParcel = parcel.readInt() == 0 ? null : MerchantInfo.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Boolean bool = boolValueOf;
            Integer num = numValueOf;
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            boolean z11 = false;
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList4 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf7 = null;
            } else {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                locale = locale2;
                shippingAddressParametersCreateFromParcel = null;
            } else {
                locale = locale2;
                shippingAddressParametersCreateFromParcel = ShippingAddressParameters.CREATOR.createFromParcel(parcel);
            }
            ShippingAddressParameters shippingAddressParameters2 = shippingAddressParametersCreateFromParcel;
            if (parcel.readInt() == 0) {
                boolValueOf8 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                boolValueOf8 = Boolean.valueOf(z11);
            }
            if (parcel.readInt() == 0) {
                shippingAddressParameters = shippingAddressParameters2;
                billingAddressParametersCreateFromParcel = null;
            } else {
                shippingAddressParameters = shippingAddressParameters2;
                billingAddressParametersCreateFromParcel = BillingAddressParameters.CREATOR.createFromParcel(parcel);
            }
            return new GooglePayConfiguration(locale, environment, string, analyticsConfiguration, amount, bool, string2, num, string3, string4, merchantInfoCreateFromParcel, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, arrayListCreateStringArrayList4, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, shippingAddressParameters, boolValueOf8, billingAddressParametersCreateFromParcel, parcel.readString(), parcel.readInt() == 0 ? null : GooglePayButtonStyling.CREATOR.createFromParcel(parcel), (GenericActionConfiguration) parcel.readParcelable(GooglePayConfiguration.class.getClassLoader()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final GooglePayConfiguration[] newArray(int i11) {
            return new GooglePayConfiguration[i11];
        }
    }

    public /* synthetic */ GooglePayConfiguration(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, Boolean bool, String str2, Integer num, String str3, String str4, MerchantInfo merchantInfo, List list, List list2, List list3, List list4, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, ShippingAddressParameters shippingAddressParameters, Boolean bool8, BillingAddressParameters billingAddressParameters, String str5, GooglePayButtonStyling googlePayButtonStyling, GenericActionConfiguration genericActionConfiguration, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale, environment, str, analyticsConfiguration, amount, bool, str2, num, str3, str4, merchantInfo, list, list2, list3, list4, bool2, bool3, bool4, bool5, bool6, bool7, shippingAddressParameters, bool8, billingAddressParameters, str5, googlePayButtonStyling, genericActionConfiguration);
    }
}
