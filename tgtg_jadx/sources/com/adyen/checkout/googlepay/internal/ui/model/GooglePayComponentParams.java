package com.adyen.checkout.googlepay.internal.ui.model;

import b3.i;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.internal.ui.model.AnalyticsParams;
import com.adyen.checkout.components.core.internal.ui.model.ButtonParams;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParams;
import com.adyen.checkout.components.core.internal.ui.model.ComponentParams;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.googlepay.BillingAddressParameters;
import com.adyen.checkout.googlepay.GooglePayButtonStyling;
import com.adyen.checkout.googlepay.MerchantInfo;
import com.adyen.checkout.googlepay.ShippingAddressParameters;
import e0.f;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002Bé\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\n\u0012\b\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0002\u0010$J\t\u0010M\u001a\u00020\u0004HÂ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\n0\u0012HÆ\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012HÆ\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012HÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010@J\u0010\u0010S\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010@J\t\u0010T\u001a\u00020\bHÆ\u0003J\t\u0010U\u001a\u00020\bHÆ\u0003J\t\u0010V\u001a\u00020\bHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\t\u0010X\u001a\u00020\u0006HÆ\u0003J\t\u0010Y\u001a\u00020\bHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010#HÆ\u0003J\t\u0010]\u001a\u00020\bHÆ\u0003J\t\u0010^\u001a\u00020\nHÆ\u0003J\t\u0010_\u001a\u00020\fHÆ\u0003J\t\u0010`\u001a\u00020\nHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000f\u0010c\u001a\b\u0012\u0004\u0012\u00020\n0\u0012HÆ\u0003J \u0002\u0010d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00122\b\b\u0002\u0010\u0016\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#HÆ\u0001¢\u0006\u0002\u0010eJ\u0013\u0010f\u001a\u00020\b2\b\u0010g\u001a\u0004\u0018\u00010hHÖ\u0003J\t\u0010i\u001a\u00020\fHÖ\u0001J\t\u0010j\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0012\u0010+\u001a\u00020,X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0013\u0010!\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0012\u00104\u001a\u00020\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u00103R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0012\u00107\u001a\u000208X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010A\u001a\u0004\b\u0017\u0010@R\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010BR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010A\u001a\u0004\b\u0018\u0010@R\u0011\u0010\u001e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010BR\u0012\u0010C\u001a\u00020\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010BR\u0011\u0010\u0019\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010BR\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010BR\u0011\u0010\u001b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010BR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010BR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0012\u0010H\u001a\u00020IX\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bL\u00103¨\u0006k"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;", "Lcom/adyen/checkout/components/core/internal/ui/model/ComponentParams;", "Lcom/adyen/checkout/components/core/internal/ui/model/ButtonParams;", "commonComponentParams", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;", "amount", "Lcom/adyen/checkout/components/core/Amount;", "isSubmitButtonVisible", "", "gatewayMerchantId", "", "googlePayEnvironment", "", "totalPriceStatus", "countryCode", "merchantInfo", "Lcom/adyen/checkout/googlepay/MerchantInfo;", "allowedAuthMethods", "", "allowedCardNetworks", "allowedIssuerCountryCodes", "blockedIssuerCountryCodes", "isAllowPrepaidCards", "isAllowCreditCards", "isAssuranceDetailsRequired", "isEmailRequired", "isExistingPaymentMethodRequired", "isShippingAddressRequired", "shippingAddressParameters", "Lcom/adyen/checkout/googlepay/ShippingAddressParameters;", "isBillingAddressRequired", "billingAddressParameters", "Lcom/adyen/checkout/googlepay/BillingAddressParameters;", "checkoutOption", "googlePayButtonStyling", "Lcom/adyen/checkout/googlepay/GooglePayButtonStyling;", "(Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;Lcom/adyen/checkout/components/core/Amount;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/googlepay/MerchantInfo;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;ZZZLcom/adyen/checkout/googlepay/ShippingAddressParameters;ZLcom/adyen/checkout/googlepay/BillingAddressParameters;Ljava/lang/String;Lcom/adyen/checkout/googlepay/GooglePayButtonStyling;)V", "getAllowedAuthMethods", "()Ljava/util/List;", "getAllowedCardNetworks", "getAllowedIssuerCountryCodes", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "analyticsParams", "Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "getAnalyticsParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/AnalyticsParams;", "getBillingAddressParameters", "()Lcom/adyen/checkout/googlepay/BillingAddressParameters;", "getBlockedIssuerCountryCodes", "getCheckoutOption", "()Ljava/lang/String;", "clientKey", "getClientKey", "getCountryCode", "environment", "Lcom/adyen/checkout/core/Environment;", "getEnvironment", "()Lcom/adyen/checkout/core/Environment;", "getGatewayMerchantId", "getGooglePayButtonStyling", "()Lcom/adyen/checkout/googlepay/GooglePayButtonStyling;", "getGooglePayEnvironment", "()I", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "isCreatedByDropIn", "getMerchantInfo", "()Lcom/adyen/checkout/googlepay/MerchantInfo;", "getShippingAddressParameters", "()Lcom/adyen/checkout/googlepay/ShippingAddressParameters;", "shopperLocale", "Ljava/util/Locale;", "getShopperLocale", "()Ljava/util/Locale;", "getTotalPriceStatus", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;Lcom/adyen/checkout/components/core/Amount;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/googlepay/MerchantInfo;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/Boolean;ZZZLcom/adyen/checkout/googlepay/ShippingAddressParameters;ZLcom/adyen/checkout/googlepay/BillingAddressParameters;Ljava/lang/String;Lcom/adyen/checkout/googlepay/GooglePayButtonStyling;)Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;", "equals", "other", "", "hashCode", "toString", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GooglePayComponentParams implements ComponentParams, ButtonParams {

    @NotNull
    private final List<String> allowedAuthMethods;

    @NotNull
    private final List<String> allowedCardNetworks;

    @Nullable
    private final List<String> allowedIssuerCountryCodes;

    @NotNull
    private final Amount amount;

    @Nullable
    private final BillingAddressParameters billingAddressParameters;

    @Nullable
    private final List<String> blockedIssuerCountryCodes;

    @Nullable
    private final String checkoutOption;

    @NotNull
    private final CommonComponentParams commonComponentParams;

    @Nullable
    private final String countryCode;

    @NotNull
    private final String gatewayMerchantId;

    @Nullable
    private final GooglePayButtonStyling googlePayButtonStyling;
    private final int googlePayEnvironment;

    @Nullable
    private final Boolean isAllowCreditCards;
    private final boolean isAllowPrepaidCards;

    @Nullable
    private final Boolean isAssuranceDetailsRequired;
    private final boolean isBillingAddressRequired;
    private final boolean isEmailRequired;
    private final boolean isExistingPaymentMethodRequired;
    private final boolean isShippingAddressRequired;
    private final boolean isSubmitButtonVisible;

    @Nullable
    private final MerchantInfo merchantInfo;

    @Nullable
    private final ShippingAddressParameters shippingAddressParameters;

    @NotNull
    private final String totalPriceStatus;

    public GooglePayComponentParams(@NotNull CommonComponentParams commonComponentParams, @NotNull Amount amount, boolean z11, @NotNull String str, int i11, @NotNull String str2, @Nullable String str3, @Nullable MerchantInfo merchantInfo, @NotNull List<String> list, @NotNull List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4, boolean z12, @Nullable Boolean bool, @Nullable Boolean bool2, boolean z13, boolean z14, boolean z15, @Nullable ShippingAddressParameters shippingAddressParameters, boolean z16, @Nullable BillingAddressParameters billingAddressParameters, @Nullable String str4, @Nullable GooglePayButtonStyling googlePayButtonStyling) {
        commonComponentParams.getClass();
        amount.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.commonComponentParams = commonComponentParams;
        this.amount = amount;
        this.isSubmitButtonVisible = z11;
        this.gatewayMerchantId = str;
        this.googlePayEnvironment = i11;
        this.totalPriceStatus = str2;
        this.countryCode = str3;
        this.merchantInfo = merchantInfo;
        this.allowedAuthMethods = list;
        this.allowedCardNetworks = list2;
        this.allowedIssuerCountryCodes = list3;
        this.blockedIssuerCountryCodes = list4;
        this.isAllowPrepaidCards = z12;
        this.isAllowCreditCards = bool;
        this.isAssuranceDetailsRequired = bool2;
        this.isEmailRequired = z13;
        this.isExistingPaymentMethodRequired = z14;
        this.isShippingAddressRequired = z15;
        this.shippingAddressParameters = shippingAddressParameters;
        this.isBillingAddressRequired = z16;
        this.billingAddressParameters = billingAddressParameters;
        this.checkoutOption = str4;
        this.googlePayButtonStyling = googlePayButtonStyling;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final CommonComponentParams getCommonComponentParams() {
        return this.commonComponentParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GooglePayComponentParams copy$default(GooglePayComponentParams googlePayComponentParams, CommonComponentParams commonComponentParams, Amount amount, boolean z11, String str, int i11, String str2, String str3, MerchantInfo merchantInfo, List list, List list2, List list3, List list4, boolean z12, Boolean bool, Boolean bool2, boolean z13, boolean z14, boolean z15, ShippingAddressParameters shippingAddressParameters, boolean z16, BillingAddressParameters billingAddressParameters, String str4, GooglePayButtonStyling googlePayButtonStyling, int i12, Object obj) {
        GooglePayButtonStyling googlePayButtonStyling2;
        String str5;
        CommonComponentParams commonComponentParams2 = (i12 & 1) != 0 ? googlePayComponentParams.commonComponentParams : commonComponentParams;
        Amount amount2 = (i12 & 2) != 0 ? googlePayComponentParams.amount : amount;
        boolean z17 = (i12 & 4) != 0 ? googlePayComponentParams.isSubmitButtonVisible : z11;
        String str6 = (i12 & 8) != 0 ? googlePayComponentParams.gatewayMerchantId : str;
        int i13 = (i12 & 16) != 0 ? googlePayComponentParams.googlePayEnvironment : i11;
        String str7 = (i12 & 32) != 0 ? googlePayComponentParams.totalPriceStatus : str2;
        String str8 = (i12 & 64) != 0 ? googlePayComponentParams.countryCode : str3;
        MerchantInfo merchantInfo2 = (i12 & 128) != 0 ? googlePayComponentParams.merchantInfo : merchantInfo;
        List list5 = (i12 & 256) != 0 ? googlePayComponentParams.allowedAuthMethods : list;
        List list6 = (i12 & 512) != 0 ? googlePayComponentParams.allowedCardNetworks : list2;
        List list7 = (i12 & 1024) != 0 ? googlePayComponentParams.allowedIssuerCountryCodes : list3;
        List list8 = (i12 & NewHope.SENDB_BYTES) != 0 ? googlePayComponentParams.blockedIssuerCountryCodes : list4;
        boolean z18 = (i12 & 4096) != 0 ? googlePayComponentParams.isAllowPrepaidCards : z12;
        Boolean bool3 = (i12 & 8192) != 0 ? googlePayComponentParams.isAllowCreditCards : bool;
        CommonComponentParams commonComponentParams3 = commonComponentParams2;
        Boolean bool4 = (i12 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? googlePayComponentParams.isAssuranceDetailsRequired : bool2;
        boolean z19 = (i12 & 32768) != 0 ? googlePayComponentParams.isEmailRequired : z13;
        boolean z21 = (i12 & 65536) != 0 ? googlePayComponentParams.isExistingPaymentMethodRequired : z14;
        boolean z22 = (i12 & 131072) != 0 ? googlePayComponentParams.isShippingAddressRequired : z15;
        ShippingAddressParameters shippingAddressParameters2 = (i12 & 262144) != 0 ? googlePayComponentParams.shippingAddressParameters : shippingAddressParameters;
        boolean z23 = (i12 & 524288) != 0 ? googlePayComponentParams.isBillingAddressRequired : z16;
        BillingAddressParameters billingAddressParameters2 = (i12 & 1048576) != 0 ? googlePayComponentParams.billingAddressParameters : billingAddressParameters;
        String str9 = (i12 & 2097152) != 0 ? googlePayComponentParams.checkoutOption : str4;
        if ((i12 & 4194304) != 0) {
            str5 = str9;
            googlePayButtonStyling2 = googlePayComponentParams.googlePayButtonStyling;
        } else {
            googlePayButtonStyling2 = googlePayButtonStyling;
            str5 = str9;
        }
        return googlePayComponentParams.copy(commonComponentParams3, amount2, z17, str6, i13, str7, str8, merchantInfo2, list5, list6, list7, list8, z18, bool3, bool4, z19, z21, z22, shippingAddressParameters2, z23, billingAddressParameters2, str5, googlePayButtonStyling2);
    }

    @NotNull
    public final List<String> component10() {
        return this.allowedCardNetworks;
    }

    @Nullable
    public final List<String> component11() {
        return this.allowedIssuerCountryCodes;
    }

    @Nullable
    public final List<String> component12() {
        return this.blockedIssuerCountryCodes;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsAllowPrepaidCards() {
        return this.isAllowPrepaidCards;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getIsAllowCreditCards() {
        return this.isAllowCreditCards;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getIsAssuranceDetailsRequired() {
        return this.isAssuranceDetailsRequired;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsEmailRequired() {
        return this.isEmailRequired;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getIsExistingPaymentMethodRequired() {
        return this.isExistingPaymentMethodRequired;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsShippingAddressRequired() {
        return this.isShippingAddressRequired;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final ShippingAddressParameters getShippingAddressParameters() {
        return this.shippingAddressParameters;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getIsBillingAddressRequired() {
        return this.isBillingAddressRequired;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BillingAddressParameters getBillingAddressParameters() {
        return this.billingAddressParameters;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getCheckoutOption() {
        return this.checkoutOption;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final GooglePayButtonStyling getGooglePayButtonStyling() {
        return this.googlePayButtonStyling;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSubmitButtonVisible() {
        return this.isSubmitButtonVisible;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGatewayMerchantId() {
        return this.gatewayMerchantId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getGooglePayEnvironment() {
        return this.googlePayEnvironment;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTotalPriceStatus() {
        return this.totalPriceStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    @NotNull
    public final List<String> component9() {
        return this.allowedAuthMethods;
    }

    @NotNull
    public final GooglePayComponentParams copy(@NotNull CommonComponentParams commonComponentParams, @NotNull Amount amount, boolean isSubmitButtonVisible, @NotNull String gatewayMerchantId, int googlePayEnvironment, @NotNull String totalPriceStatus, @Nullable String countryCode, @Nullable MerchantInfo merchantInfo, @NotNull List<String> allowedAuthMethods, @NotNull List<String> allowedCardNetworks, @Nullable List<String> allowedIssuerCountryCodes, @Nullable List<String> blockedIssuerCountryCodes, boolean isAllowPrepaidCards, @Nullable Boolean isAllowCreditCards, @Nullable Boolean isAssuranceDetailsRequired, boolean isEmailRequired, boolean isExistingPaymentMethodRequired, boolean isShippingAddressRequired, @Nullable ShippingAddressParameters shippingAddressParameters, boolean isBillingAddressRequired, @Nullable BillingAddressParameters billingAddressParameters, @Nullable String checkoutOption, @Nullable GooglePayButtonStyling googlePayButtonStyling) {
        commonComponentParams.getClass();
        amount.getClass();
        gatewayMerchantId.getClass();
        totalPriceStatus.getClass();
        allowedAuthMethods.getClass();
        allowedCardNetworks.getClass();
        return new GooglePayComponentParams(commonComponentParams, amount, isSubmitButtonVisible, gatewayMerchantId, googlePayEnvironment, totalPriceStatus, countryCode, merchantInfo, allowedAuthMethods, allowedCardNetworks, allowedIssuerCountryCodes, blockedIssuerCountryCodes, isAllowPrepaidCards, isAllowCreditCards, isAssuranceDetailsRequired, isEmailRequired, isExistingPaymentMethodRequired, isShippingAddressRequired, shippingAddressParameters, isBillingAddressRequired, billingAddressParameters, checkoutOption, googlePayButtonStyling);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayComponentParams)) {
            return false;
        }
        GooglePayComponentParams googlePayComponentParams = (GooglePayComponentParams) other;
        return Intrinsics.areEqual(this.commonComponentParams, googlePayComponentParams.commonComponentParams) && Intrinsics.areEqual(this.amount, googlePayComponentParams.amount) && this.isSubmitButtonVisible == googlePayComponentParams.isSubmitButtonVisible && Intrinsics.areEqual(this.gatewayMerchantId, googlePayComponentParams.gatewayMerchantId) && this.googlePayEnvironment == googlePayComponentParams.googlePayEnvironment && Intrinsics.areEqual(this.totalPriceStatus, googlePayComponentParams.totalPriceStatus) && Intrinsics.areEqual(this.countryCode, googlePayComponentParams.countryCode) && Intrinsics.areEqual(this.merchantInfo, googlePayComponentParams.merchantInfo) && Intrinsics.areEqual(this.allowedAuthMethods, googlePayComponentParams.allowedAuthMethods) && Intrinsics.areEqual(this.allowedCardNetworks, googlePayComponentParams.allowedCardNetworks) && Intrinsics.areEqual(this.allowedIssuerCountryCodes, googlePayComponentParams.allowedIssuerCountryCodes) && Intrinsics.areEqual(this.blockedIssuerCountryCodes, googlePayComponentParams.blockedIssuerCountryCodes) && this.isAllowPrepaidCards == googlePayComponentParams.isAllowPrepaidCards && Intrinsics.areEqual(this.isAllowCreditCards, googlePayComponentParams.isAllowCreditCards) && Intrinsics.areEqual(this.isAssuranceDetailsRequired, googlePayComponentParams.isAssuranceDetailsRequired) && this.isEmailRequired == googlePayComponentParams.isEmailRequired && this.isExistingPaymentMethodRequired == googlePayComponentParams.isExistingPaymentMethodRequired && this.isShippingAddressRequired == googlePayComponentParams.isShippingAddressRequired && Intrinsics.areEqual(this.shippingAddressParameters, googlePayComponentParams.shippingAddressParameters) && this.isBillingAddressRequired == googlePayComponentParams.isBillingAddressRequired && Intrinsics.areEqual(this.billingAddressParameters, googlePayComponentParams.billingAddressParameters) && Intrinsics.areEqual(this.checkoutOption, googlePayComponentParams.checkoutOption) && Intrinsics.areEqual(this.googlePayButtonStyling, googlePayComponentParams.googlePayButtonStyling);
    }

    @NotNull
    public final List<String> getAllowedAuthMethods() {
        return this.allowedAuthMethods;
    }

    @NotNull
    public final List<String> getAllowedCardNetworks() {
        return this.allowedCardNetworks;
    }

    @Nullable
    public final List<String> getAllowedIssuerCountryCodes() {
        return this.allowedIssuerCountryCodes;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public Amount getAmount() {
        return this.amount;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public AnalyticsParams getAnalyticsParams() {
        return this.commonComponentParams.getAnalyticsParams();
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

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public String getClientKey() {
        return this.commonComponentParams.getClientKey();
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public Environment getEnvironment() {
        return this.commonComponentParams.getEnvironment();
    }

    @NotNull
    public final String getGatewayMerchantId() {
        return this.gatewayMerchantId;
    }

    @Nullable
    public final GooglePayButtonStyling getGooglePayButtonStyling() {
        return this.googlePayButtonStyling;
    }

    public final int getGooglePayEnvironment() {
        return this.googlePayEnvironment;
    }

    @Nullable
    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    @Nullable
    public final ShippingAddressParameters getShippingAddressParameters() {
        return this.shippingAddressParameters;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    @NotNull
    public Locale getShopperLocale() {
        return this.commonComponentParams.getShopperLocale();
    }

    @NotNull
    public final String getTotalPriceStatus() {
        return this.totalPriceStatus;
    }

    public int hashCode() {
        int iB = l1.b(k.b(this.googlePayEnvironment, l1.b(k.e((this.amount.hashCode() + (this.commonComponentParams.hashCode() * 31)) * 31, 31, this.isSubmitButtonVisible), 31, this.gatewayMerchantId), 31), 31, this.totalPriceStatus);
        String str = this.countryCode;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        MerchantInfo merchantInfo = this.merchantInfo;
        int iC = f.c(this.allowedCardNetworks, f.c(this.allowedAuthMethods, (iHashCode + (merchantInfo == null ? 0 : merchantInfo.hashCode())) * 31, 31), 31);
        List<String> list = this.allowedIssuerCountryCodes;
        int iHashCode2 = (iC + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.blockedIssuerCountryCodes;
        int iE = k.e((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.isAllowPrepaidCards);
        Boolean bool = this.isAllowCreditCards;
        int iHashCode3 = (iE + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAssuranceDetailsRequired;
        int iE2 = k.e(k.e(k.e((iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.isEmailRequired), 31, this.isExistingPaymentMethodRequired), 31, this.isShippingAddressRequired);
        ShippingAddressParameters shippingAddressParameters = this.shippingAddressParameters;
        int iE3 = k.e((iE2 + (shippingAddressParameters == null ? 0 : shippingAddressParameters.hashCode())) * 31, 31, this.isBillingAddressRequired);
        BillingAddressParameters billingAddressParameters = this.billingAddressParameters;
        int iHashCode4 = (iE3 + (billingAddressParameters == null ? 0 : billingAddressParameters.hashCode())) * 31;
        String str2 = this.checkoutOption;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        GooglePayButtonStyling googlePayButtonStyling = this.googlePayButtonStyling;
        return iHashCode5 + (googlePayButtonStyling != null ? googlePayButtonStyling.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAllowCreditCards() {
        return this.isAllowCreditCards;
    }

    public final boolean isAllowPrepaidCards() {
        return this.isAllowPrepaidCards;
    }

    @Nullable
    public final Boolean isAssuranceDetailsRequired() {
        return this.isAssuranceDetailsRequired;
    }

    public final boolean isBillingAddressRequired() {
        return this.isBillingAddressRequired;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ComponentParams
    public boolean isCreatedByDropIn() {
        return this.commonComponentParams.isCreatedByDropIn();
    }

    public final boolean isEmailRequired() {
        return this.isEmailRequired;
    }

    public final boolean isExistingPaymentMethodRequired() {
        return this.isExistingPaymentMethodRequired;
    }

    public final boolean isShippingAddressRequired() {
        return this.isShippingAddressRequired;
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.ButtonParams
    public boolean isSubmitButtonVisible() {
        return this.isSubmitButtonVisible;
    }

    @NotNull
    public String toString() {
        CommonComponentParams commonComponentParams = this.commonComponentParams;
        Amount amount = this.amount;
        boolean z11 = this.isSubmitButtonVisible;
        String str = this.gatewayMerchantId;
        int i11 = this.googlePayEnvironment;
        String str2 = this.totalPriceStatus;
        String str3 = this.countryCode;
        MerchantInfo merchantInfo = this.merchantInfo;
        List<String> list = this.allowedAuthMethods;
        List<String> list2 = this.allowedCardNetworks;
        List<String> list3 = this.allowedIssuerCountryCodes;
        List<String> list4 = this.blockedIssuerCountryCodes;
        boolean z12 = this.isAllowPrepaidCards;
        Boolean bool = this.isAllowCreditCards;
        Boolean bool2 = this.isAssuranceDetailsRequired;
        boolean z13 = this.isEmailRequired;
        boolean z14 = this.isExistingPaymentMethodRequired;
        boolean z15 = this.isShippingAddressRequired;
        ShippingAddressParameters shippingAddressParameters = this.shippingAddressParameters;
        boolean z16 = this.isBillingAddressRequired;
        BillingAddressParameters billingAddressParameters = this.billingAddressParameters;
        String str4 = this.checkoutOption;
        GooglePayButtonStyling googlePayButtonStyling = this.googlePayButtonStyling;
        StringBuilder sb2 = new StringBuilder("GooglePayComponentParams(commonComponentParams=");
        sb2.append(commonComponentParams);
        sb2.append(", amount=");
        sb2.append(amount);
        sb2.append(", isSubmitButtonVisible=");
        sb2.append(z11);
        sb2.append(", gatewayMerchantId=");
        sb2.append(str);
        sb2.append(", googlePayEnvironment=");
        sb2.append(i11);
        sb2.append(", totalPriceStatus=");
        sb2.append(str2);
        sb2.append(", countryCode=");
        sb2.append(str3);
        sb2.append(", merchantInfo=");
        sb2.append(merchantInfo);
        sb2.append(", allowedAuthMethods=");
        sb2.append(list);
        sb2.append(", allowedCardNetworks=");
        sb2.append(list2);
        sb2.append(", allowedIssuerCountryCodes=");
        sb2.append(list3);
        sb2.append(", blockedIssuerCountryCodes=");
        sb2.append(list4);
        sb2.append(", isAllowPrepaidCards=");
        sb2.append(z12);
        sb2.append(", isAllowCreditCards=");
        sb2.append(bool);
        sb2.append(", isAssuranceDetailsRequired=");
        sb2.append(bool2);
        sb2.append(", isEmailRequired=");
        sb2.append(z13);
        sb2.append(", isExistingPaymentMethodRequired=");
        i.C(sb2, z14, ", isShippingAddressRequired=", z15, ", shippingAddressParameters=");
        sb2.append(shippingAddressParameters);
        sb2.append(", isBillingAddressRequired=");
        sb2.append(z16);
        sb2.append(", billingAddressParameters=");
        sb2.append(billingAddressParameters);
        sb2.append(", checkoutOption=");
        sb2.append(str4);
        sb2.append(", googlePayButtonStyling=");
        sb2.append(googlePayButtonStyling);
        sb2.append(")");
        return sb2.toString();
    }
}
