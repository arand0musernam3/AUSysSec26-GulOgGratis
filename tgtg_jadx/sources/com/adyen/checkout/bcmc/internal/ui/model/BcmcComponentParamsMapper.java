package com.adyen.checkout.bcmc.internal.ui.model;

import com.adyen.checkout.bcmc.BcmcConfiguration;
import com.adyen.checkout.bcmc.BcmcConfigurationKt;
import com.adyen.checkout.card.KCPAuthVisibility;
import com.adyen.checkout.card.SocialSecurityNumberVisibility;
import com.adyen.checkout.card.internal.ui.model.CVCVisibility;
import com.adyen.checkout.card.internal.ui.model.CardComponentParams;
import com.adyen.checkout.card.internal.ui.model.StoredCVCVisibility;
import com.adyen.checkout.components.core.CheckoutConfiguration;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParams;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapper;
import com.adyen.checkout.components.core.internal.ui.model.CommonComponentParamsMapperData;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.components.core.internal.ui.model.SessionParams;
import com.adyen.checkout.core.CardBrand;
import com.adyen.checkout.core.CardType;
import com.adyen.checkout.ui.core.internal.ui.model.AddressParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J2\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fJ>\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/adyen/checkout/bcmc/internal/ui/model/BcmcComponentParamsMapper;", "", "commonComponentParamsMapper", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParamsMapper;", "(Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParamsMapper;)V", "getStorePaymentFieldVisible", "", "sessionParams", "Lcom/adyen/checkout/components/core/internal/ui/model/SessionParams;", "bcmcConfiguration", "Lcom/adyen/checkout/bcmc/BcmcConfiguration;", "getSupportedCardBrands", "", "Lcom/adyen/checkout/core/CardBrand;", "paymentMethod", "Lcom/adyen/checkout/components/core/PaymentMethod;", "mapToParams", "Lcom/adyen/checkout/card/internal/ui/model/CardComponentParams;", "checkoutConfiguration", "Lcom/adyen/checkout/components/core/CheckoutConfiguration;", "deviceLocale", "Ljava/util/Locale;", "dropInOverrideParams", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "componentSessionParams", "commonComponentParams", "Lcom/adyen/checkout/components/core/internal/ui/model/CommonComponentParams;", "Companion", "bcmc_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBcmcComponentParamsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BcmcComponentParamsMapper.kt\ncom/adyen/checkout/bcmc/internal/ui/model/BcmcComponentParamsMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1557#2:105\n1628#2,3:106\n*S KotlinDebug\n*F\n+ 1 BcmcComponentParamsMapper.kt\ncom/adyen/checkout/bcmc/internal/ui/model/BcmcComponentParamsMapper\n*L\n93#1:105\n93#1:106,3\n*E\n"})
public final class BcmcComponentParamsMapper {

    @NotNull
    private static final List<CardBrand> DEFAULT_SUPPORTED_CARD_BRANDS = d0.h(new CardBrand(CardType.BCMC), new CardBrand(CardType.MAESTRO), new CardBrand(CardType.VISA));

    @NotNull
    private final CommonComponentParamsMapper commonComponentParamsMapper;

    public BcmcComponentParamsMapper(@NotNull CommonComponentParamsMapper commonComponentParamsMapper) {
        commonComponentParamsMapper.getClass();
        this.commonComponentParamsMapper = commonComponentParamsMapper;
    }

    private final boolean getStorePaymentFieldVisible(SessionParams sessionParams, BcmcConfiguration bcmcConfiguration) {
        Boolean enableStoreDetails;
        if (sessionParams != null && (enableStoreDetails = sessionParams.getEnableStoreDetails()) != null) {
            return enableStoreDetails.booleanValue();
        }
        Boolean isStorePaymentFieldVisible = bcmcConfiguration != null ? bcmcConfiguration.getIsStorePaymentFieldVisible() : null;
        if (isStorePaymentFieldVisible != null) {
            return isStorePaymentFieldVisible.booleanValue();
        }
        return false;
    }

    private final List<CardBrand> getSupportedCardBrands(PaymentMethod paymentMethod) {
        List<String> brands = paymentMethod.getBrands();
        if (brands == null) {
            return DEFAULT_SUPPORTED_CARD_BRANDS;
        }
        ArrayList arrayList = new ArrayList(e0.o(brands, 10));
        Iterator<T> it = brands.iterator();
        while (it.hasNext()) {
            arrayList.add(new CardBrand((String) it.next()));
        }
        return arrayList;
    }

    private final CardComponentParams mapToParams(CommonComponentParams commonComponentParams, SessionParams sessionParams, DropInOverrideParams dropInOverrideParams, BcmcConfiguration bcmcConfiguration, PaymentMethod paymentMethod, CheckoutConfiguration checkoutConfiguration) {
        boolean zBooleanValue;
        Boolean isHolderNameRequired;
        if (dropInOverrideParams != null) {
            zBooleanValue = dropInOverrideParams.isSubmitButtonVisible();
        } else {
            Boolean isSubmitButtonVisible = bcmcConfiguration != null ? bcmcConfiguration.getIsSubmitButtonVisible() : null;
            zBooleanValue = (isSubmitButtonVisible == null && (isSubmitButtonVisible = checkoutConfiguration.getIsSubmitButtonVisible()) == null) ? true : isSubmitButtonVisible.booleanValue();
        }
        boolean z11 = zBooleanValue;
        boolean zBooleanValue2 = (bcmcConfiguration == null || (isHolderNameRequired = bcmcConfiguration.getIsHolderNameRequired()) == null) ? false : isHolderNameRequired.booleanValue();
        String shopperReference = bcmcConfiguration != null ? bcmcConfiguration.getShopperReference() : null;
        boolean storePaymentFieldVisible = getStorePaymentFieldVisible(sessionParams, bcmcConfiguration);
        AddressParams.None none = AddressParams.None.INSTANCE;
        return new CardComponentParams(commonComponentParams, z11, zBooleanValue2, getSupportedCardBrands(paymentMethod), shopperReference, storePaymentFieldVisible, SocialSecurityNumberVisibility.HIDE, KCPAuthVisibility.HIDE, null, none, CVCVisibility.HIDE_FIRST, StoredCVCVisibility.HIDE);
    }

    @NotNull
    public final CardComponentParams mapToParams(@NotNull CheckoutConfiguration checkoutConfiguration, @NotNull Locale deviceLocale, @Nullable DropInOverrideParams dropInOverrideParams, @Nullable SessionParams componentSessionParams, @NotNull PaymentMethod paymentMethod) {
        checkoutConfiguration.getClass();
        deviceLocale.getClass();
        paymentMethod.getClass();
        CommonComponentParamsMapperData commonComponentParamsMapperDataMapToParams = this.commonComponentParamsMapper.mapToParams(checkoutConfiguration, deviceLocale, dropInOverrideParams, componentSessionParams);
        return mapToParams(commonComponentParamsMapperDataMapToParams.getCommonComponentParams(), commonComponentParamsMapperDataMapToParams.getSessionParams(), dropInOverrideParams, BcmcConfigurationKt.getBcmcConfiguration(checkoutConfiguration), paymentMethod, checkoutConfiguration);
    }
}
