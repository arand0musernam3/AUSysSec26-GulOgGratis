package com.adyen.checkout.card.internal.ui.model;

import com.adyen.checkout.card.AddressConfiguration;
import com.adyen.checkout.card.CardConfiguration;
import com.adyen.checkout.card.CardConfigurationKt;
import com.adyen.checkout.card.KCPAuthVisibility;
import com.adyen.checkout.card.SocialSecurityNumberVisibility;
import com.adyen.checkout.card.internal.ui.model.AddressFieldPolicyParams;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.StoredPaymentMethod;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParams;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapper;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapperData;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.components.core.internal.ui.model.SessionParams;
import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import com.adyen.checkout.core.CardBrand;
import com.adyen.checkout.ui.core.internal.ui.model.AddressFieldPolicy;
import com.adyen.checkout.ui.core.internal.ui.model.AddressParams;
import e40.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J0\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001c\u0010\u0011\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J2\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\u0017J2\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010 \u001a\u00020!J@\u0010\u0018\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J6\u0010$\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\f\u0010%\u001a\u00020&*\u00020'H\u0002J\f\u0010(\u001a\u00020)*\u00020*H\u0002J\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/CardComponentParamsMapper;", "", "commonComponentParamsMapper", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParamsMapper;", "installmentsParamsMapper", "Lcom/adyen/checkout/card/internal/ui/model/InstallmentsParamsMapper;", "(Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParamsMapper;Lcom/adyen/checkout/card/internal/ui/model/InstallmentsParamsMapper;)V", "getInstallmentParams", "Lcom/adyen/checkout/card/internal/ui/model/InstallmentParams;", "sessionParams", "Lcom/adyen/checkout/components/core/internal/ui/model/SessionParams;", "cardConfiguration", "Lcom/adyen/checkout/card/CardConfiguration;", "amount", "Lcom/adyen/checkout/components/core/Amount;", "shopperLocale", "Ljava/util/Locale;", "getStorePaymentFieldVisible", "", "getSupportedCardBrands", "", "Lcom/adyen/checkout/core/CardBrand;", "paymentMethod", "Lcom/adyen/checkout/components/core/PaymentMethod;", "mapToParams", "Lcom/adyen/checkout/card/internal/ui/model/CardComponentParams;", "checkoutConfiguration", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "deviceLocale", "dropInOverrideParams", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "componentSessionParams", "storedPaymentMethod", "Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "commonComponentParams", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;", "mapToParamsInternal", "mapToAddressParam", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressParams;", "Lcom/adyen/checkout/card/AddressConfiguration;", "mapToAddressParamFieldPolicy", "Lcom/adyen/checkout/ui/core/internal/ui/model/AddressFieldPolicy;", "Lcom/adyen/checkout/card/AddressConfiguration$CardAddressFieldPolicy;", "removeRestrictedCards", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCardComponentParamsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardComponentParamsMapper.kt\ncom/adyen/checkout/card/internal/ui/model/CardComponentParamsMapper\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,240:1\n16#2,17:241\n16#2,17:258\n16#2,17:279\n1557#3:275\n1628#3,3:276\n774#3:296\n865#3,2:297\n*S KotlinDebug\n*F\n+ 1 CardComponentParamsMapper.kt\ncom/adyen/checkout/card/internal/ui/model/CardComponentParamsMapper\n*L\n147#1:241,17\n152#1:258,17\n159#1:279,17\n153#1:275\n153#1:276,3\n166#1:296\n166#1:297,2\n*E\n"})
public final class CardComponentParamsMapper {

    @NotNull
    private final CommonComponentParamsMapper commonComponentParamsMapper;

    @NotNull
    private final InstallmentsParamsMapper installmentsParamsMapper;

    public CardComponentParamsMapper(@NotNull CommonComponentParamsMapper commonComponentParamsMapper, @NotNull InstallmentsParamsMapper installmentsParamsMapper) {
        commonComponentParamsMapper.getClass();
        installmentsParamsMapper.getClass();
        this.commonComponentParamsMapper = commonComponentParamsMapper;
        this.installmentsParamsMapper = installmentsParamsMapper;
    }

    private final InstallmentParams getInstallmentParams(SessionParams sessionParams, CardConfiguration cardConfiguration, Amount amount, Locale shopperLocale) {
        InstallmentsParamsMapper installmentsParamsMapper = this.installmentsParamsMapper;
        if (sessionParams != null) {
            return installmentsParamsMapper.mapToInstallmentParams$card_release(sessionParams.getInstallmentConfiguration(), amount, shopperLocale);
        }
        return installmentsParamsMapper.mapToInstallmentParams$card_release(cardConfiguration != null ? cardConfiguration.getInstallmentConfiguration() : null, amount, shopperLocale);
    }

    private final boolean getStorePaymentFieldVisible(SessionParams sessionParams, CardConfiguration cardConfiguration) {
        Boolean enableStoreDetails;
        if (sessionParams != null && (enableStoreDetails = sessionParams.getEnableStoreDetails()) != null) {
            return enableStoreDetails.booleanValue();
        }
        Boolean isStorePaymentFieldVisible = cardConfiguration != null ? cardConfiguration.getIsStorePaymentFieldVisible() : null;
        if (isStorePaymentFieldVisible != null) {
            return isStorePaymentFieldVisible.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.adyen.checkout.card.internal.ui.model.CardComponentParamsMapper] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.List] */
    private final List<CardBrand> getSupportedCardBrands(CardConfiguration cardConfiguration, PaymentMethod paymentMethod) {
        ?? supportedCardBrands = cardConfiguration != null ? cardConfiguration.getSupportedCardBrands() : 0;
        if (supportedCardBrands == 0 || supportedCardBrands.isEmpty()) {
            List<String> brands = paymentMethod != null ? paymentMethod.getBrands() : null;
            if (brands == null) {
                brands = n0.f26529a;
            }
            if (brands.isEmpty()) {
                AdyenLogLevel adyenLogLevel = AdyenLogLevel.VERBOSE;
                AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
                if (companion.getLogger().shouldLog(adyenLogLevel)) {
                    String name = CardComponentParamsMapper.class.getName();
                    String strY = StringsKt.Y(name, '$');
                    String strW = StringsKt.W('.', strY, strY);
                    if (strW.length() != 0) {
                        name = StringsKt.O(strW, "Kt");
                    }
                    companion.getLogger().log(adyenLogLevel, "CO.".concat(name), "Falling back to CardConfiguration.DEFAULT_SUPPORTED_CARDS_LIST", null);
                }
                supportedCardBrands = CardConfiguration.INSTANCE.getDEFAULT_SUPPORTED_CARDS_LIST();
            } else {
                AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.VERBOSE;
                AdyenLogger.Companion companion2 = AdyenLogger.INSTANCE;
                if (companion2.getLogger().shouldLog(adyenLogLevel2)) {
                    String name2 = CardComponentParamsMapper.class.getName();
                    String strY2 = StringsKt.Y(name2, '$');
                    String strW2 = StringsKt.W('.', strY2, strY2);
                    if (strW2.length() != 0) {
                        name2 = StringsKt.O(strW2, "Kt");
                    }
                    companion2.getLogger().log(adyenLogLevel2, "CO.".concat(name2), "Reading supportedCardTypes from API brands", null);
                }
                List<String> brands2 = paymentMethod != null ? paymentMethod.getBrands() : null;
                if (brands2 == null) {
                    brands2 = n0.f26529a;
                }
                supportedCardBrands = new ArrayList(e0.o(brands2, 10));
                Iterator it = brands2.iterator();
                while (it.hasNext()) {
                    supportedCardBrands.add(new CardBrand((String) it.next()));
                }
            }
        } else {
            AdyenLogLevel adyenLogLevel3 = AdyenLogLevel.VERBOSE;
            AdyenLogger.Companion companion3 = AdyenLogger.INSTANCE;
            if (companion3.getLogger().shouldLog(adyenLogLevel3)) {
                String name3 = CardComponentParamsMapper.class.getName();
                String strY3 = StringsKt.Y(name3, '$');
                String strW3 = StringsKt.W('.', strY3, strY3);
                if (strW3.length() != 0) {
                    name3 = StringsKt.O(strW3, "Kt");
                }
                companion3.getLogger().log(adyenLogLevel3, "CO.".concat(name3), "Reading supportedCardTypes from configuration", null);
            }
        }
        return removeRestrictedCards(supportedCardBrands);
    }

    private final AddressParams mapToAddressParam(AddressConfiguration addressConfiguration) {
        if (addressConfiguration instanceof AddressConfiguration.FullAddress) {
            AddressConfiguration.FullAddress fullAddress = (AddressConfiguration.FullAddress) addressConfiguration;
            return new AddressParams.FullAddress(fullAddress.getDefaultCountryCode(), fullAddress.getSupportedCountryCodes(), mapToAddressParamFieldPolicy(fullAddress.getAddressFieldPolicy()));
        }
        if (Intrinsics.areEqual(addressConfiguration, AddressConfiguration.None.INSTANCE)) {
            return AddressParams.None.INSTANCE;
        }
        if (addressConfiguration instanceof AddressConfiguration.PostalCode) {
            return new AddressParams.PostalCode(mapToAddressParamFieldPolicy(((AddressConfiguration.PostalCode) addressConfiguration).getAddressFieldPolicy()));
        }
        if (addressConfiguration instanceof AddressConfiguration.Lookup) {
            return new AddressParams.Lookup();
        }
        a.f();
        return null;
    }

    private final AddressFieldPolicy mapToAddressParamFieldPolicy(AddressConfiguration.CardAddressFieldPolicy cardAddressFieldPolicy) {
        if (cardAddressFieldPolicy instanceof AddressConfiguration.CardAddressFieldPolicy.Optional) {
            return AddressFieldPolicyParams.Optional.INSTANCE;
        }
        if (cardAddressFieldPolicy instanceof AddressConfiguration.CardAddressFieldPolicy.OptionalForCardTypes) {
            return new AddressFieldPolicyParams.OptionalForCardTypes(((AddressConfiguration.CardAddressFieldPolicy.OptionalForCardTypes) cardAddressFieldPolicy).getBrands());
        }
        if (cardAddressFieldPolicy instanceof AddressConfiguration.CardAddressFieldPolicy.Required) {
            return AddressFieldPolicyParams.Required.INSTANCE;
        }
        a.f();
        return null;
    }

    private final CardComponentParams mapToParams(CommonComponentParams commonComponentParams, SessionParams sessionParams, DropInOverrideParams dropInOverrideParams, CardConfiguration cardConfiguration, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration) {
        boolean zBooleanValue;
        SocialSecurityNumberVisibility socialSecurityNumberVisibility;
        KCPAuthVisibility kcpAuthVisibility;
        AddressParams addressParamsMapToAddressParam;
        AddressConfiguration addressConfiguration;
        Boolean isHolderNameRequired;
        boolean zBooleanValue2 = (cardConfiguration == null || (isHolderNameRequired = cardConfiguration.getIsHolderNameRequired()) == null) ? false : isHolderNameRequired.booleanValue();
        if (dropInOverrideParams != null) {
            zBooleanValue = dropInOverrideParams.isSubmitButtonVisible();
        } else {
            Boolean isSubmitButtonVisible = cardConfiguration != null ? cardConfiguration.getIsSubmitButtonVisible() : null;
            zBooleanValue = (isSubmitButtonVisible == null && (isSubmitButtonVisible = checkoutConfiguration.getIsSubmitButtonVisible()) == null) ? true : isSubmitButtonVisible.booleanValue();
        }
        boolean z11 = zBooleanValue;
        List<CardBrand> supportedCardBrands = getSupportedCardBrands(cardConfiguration, paymentMethod);
        String shopperReference = cardConfiguration != null ? cardConfiguration.getShopperReference() : null;
        boolean storePaymentFieldVisible = getStorePaymentFieldVisible(sessionParams, cardConfiguration);
        if (cardConfiguration == null || (socialSecurityNumberVisibility = cardConfiguration.getSocialSecurityNumberVisibility()) == null) {
            socialSecurityNumberVisibility = SocialSecurityNumberVisibility.HIDE;
        }
        SocialSecurityNumberVisibility socialSecurityNumberVisibility2 = socialSecurityNumberVisibility;
        if (cardConfiguration == null || (kcpAuthVisibility = cardConfiguration.getKcpAuthVisibility()) == null) {
            kcpAuthVisibility = KCPAuthVisibility.HIDE;
        }
        KCPAuthVisibility kCPAuthVisibility = kcpAuthVisibility;
        InstallmentParams installmentParams = getInstallmentParams(sessionParams, cardConfiguration, commonComponentParams.getAmount(), commonComponentParams.getShopperLocale());
        if (cardConfiguration == null || (addressConfiguration = cardConfiguration.getAddressConfiguration()) == null || (addressParamsMapToAddressParam = mapToAddressParam(addressConfiguration)) == null) {
            addressParamsMapToAddressParam = AddressParams.None.INSTANCE;
        }
        return new CardComponentParams(commonComponentParams, z11, zBooleanValue2, supportedCardBrands, shopperReference, storePaymentFieldVisible, socialSecurityNumberVisibility2, kCPAuthVisibility, installmentParams, addressParamsMapToAddressParam, cardConfiguration != null ? Intrinsics.areEqual(cardConfiguration.getIsHideCvc(), Boolean.TRUE) : false ? CVCVisibility.ALWAYS_HIDE : CVCVisibility.ALWAYS_SHOW, cardConfiguration != null ? Intrinsics.areEqual(cardConfiguration.getIsHideCvcStoredCard(), Boolean.TRUE) : false ? StoredCVCVisibility.HIDE : StoredCVCVisibility.SHOW);
    }

    private final CardComponentParams mapToParamsInternal(CheckoutConfiguration checkoutConfiguration, Locale deviceLocale, DropInOverrideParams dropInOverrideParams, SessionParams componentSessionParams, PaymentMethod paymentMethod) {
        CommonComponentParamsMapperData commonComponentParamsMapperDataMapToParams = this.commonComponentParamsMapper.mapToParams(checkoutConfiguration, deviceLocale, dropInOverrideParams, componentSessionParams);
        return mapToParams(commonComponentParamsMapperDataMapToParams.getCommonComponentParams(), commonComponentParamsMapperDataMapToParams.getSessionParams(), dropInOverrideParams, CardConfigurationKt.getCardConfiguration(checkoutConfiguration), paymentMethod, checkoutConfiguration);
    }

    private final List<CardBrand> removeRestrictedCards(List<CardBrand> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!RestrictedCardType.INSTANCE.isRestrictedCardType(((CardBrand) obj).getTxVariant())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public final CardComponentParams mapToParams(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull Locale deviceLocale, @Nullable DropInOverrideParams dropInOverrideParams, @Nullable SessionParams componentSessionParams, @NotNull StoredPaymentMethod storedPaymentMethod) {
        checkoutConfiguration.getClass();
        deviceLocale.getClass();
        storedPaymentMethod.getClass();
        return mapToParamsInternal(checkoutConfiguration, deviceLocale, dropInOverrideParams, componentSessionParams, null);
    }

    @NotNull
    public final CardComponentParams mapToParams(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull Locale deviceLocale, @Nullable DropInOverrideParams dropInOverrideParams, @Nullable SessionParams componentSessionParams, @NotNull PaymentMethod paymentMethod) {
        checkoutConfiguration.getClass();
        deviceLocale.getClass();
        paymentMethod.getClass();
        return mapToParamsInternal(checkoutConfiguration, deviceLocale, dropInOverrideParams, componentSessionParams, paymentMethod);
    }
}
