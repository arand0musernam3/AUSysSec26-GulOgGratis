package com.adyen.checkout.card.internal.ui.model;

import com.adyen.checkout.card.InstallmentConfiguration;
import com.adyen.checkout.card.InstallmentOptions;
import com.adyen.checkout.card.internal.ui.model.InstallmentOptionParams;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.internal.ui.model.SessionInstallmentConfiguration;
import com.adyen.checkout.components.core.internal.ui.model.SessionInstallmentOptionsParams;
import com.adyen.checkout.core.CardBrand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bJ+\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bJ\u0016\u0010\r\u001a\u00020\u000e*\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\f\u0010\u0012\u001a\u00020\u000e*\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u0015*\u0004\u0018\u00010\u000fH\u0002J\u000e\u0010\u0016\u001a\u00020\u0015*\u0004\u0018\u00010\u0017H\u0002¨\u0006\u0019"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/model/InstallmentsParamsMapper;", "", "()V", "mapToInstallmentParams", "Lcom/adyen/checkout/card/internal/ui/model/InstallmentParams;", "installmentConfiguration", "Lcom/adyen/checkout/card/InstallmentConfiguration;", "amount", "Lcom/adyen/checkout/components/core/Amount;", "shopperLocale", "Ljava/util/Locale;", "mapToInstallmentParams$card_release", "Lcom/adyen/checkout/components/core/internal/ui/model/SessionInstallmentConfiguration;", "mapToCardBasedInstallmentOptions", "Lcom/adyen/checkout/card/internal/ui/model/InstallmentOptionParams$CardBasedInstallmentOptions;", "Lcom/adyen/checkout/components/core/internal/ui/model/SessionInstallmentOptionsParams;", "txVariant", "", "mapToCardBasedInstallmentOptionsParams", "Lcom/adyen/checkout/card/InstallmentOptions$CardBasedInstallmentOptions;", "mapToDefaultInstallmentOptions", "Lcom/adyen/checkout/card/internal/ui/model/InstallmentOptionParams$DefaultInstallmentOptions;", "mapToDefaultInstallmentOptionsParam", "Lcom/adyen/checkout/card/InstallmentOptions$DefaultInstallmentOptions;", "Companion", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInstallmentsParamsMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstallmentsParamsMapper.kt\ncom/adyen/checkout/card/internal/ui/model/InstallmentsParamsMapper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n216#2,2:92\n1557#3:94\n1628#3,3:95\n*S KotlinDebug\n*F\n+ 1 InstallmentsParamsMapper.kt\ncom/adyen/checkout/card/internal/ui/model/InstallmentsParamsMapper\n*L\n31#1:92,2\n56#1:94\n56#1:95,3\n*E\n"})
public final class InstallmentsParamsMapper {

    @NotNull
    private static final String DEFAULT_INSTALLMENT_OPTION = "card";

    private final InstallmentOptionParams.CardBasedInstallmentOptions mapToCardBasedInstallmentOptions(SessionInstallmentOptionsParams sessionInstallmentOptionsParams, String str) {
        List<Integer> values;
        List<String> plans;
        if (sessionInstallmentOptionsParams == null || (values = sessionInstallmentOptionsParams.getValues()) == null) {
            values = n0.f26529a;
        }
        return new InstallmentOptionParams.CardBasedInstallmentOptions(values, (sessionInstallmentOptionsParams == null || (plans = sessionInstallmentOptionsParams.getPlans()) == null) ? false : CollectionsKt.I(plans, InstallmentOption.REVOLVING.getType()), new CardBrand(str));
    }

    private final InstallmentOptionParams.CardBasedInstallmentOptions mapToCardBasedInstallmentOptionsParams(InstallmentOptions.CardBasedInstallmentOptions cardBasedInstallmentOptions) {
        return new InstallmentOptionParams.CardBasedInstallmentOptions(cardBasedInstallmentOptions.getValues(), cardBasedInstallmentOptions.getIncludeRevolving(), cardBasedInstallmentOptions.getCardBrand());
    }

    private final InstallmentOptionParams.DefaultInstallmentOptions mapToDefaultInstallmentOptions(SessionInstallmentOptionsParams sessionInstallmentOptionsParams) {
        List<Integer> values;
        List<String> plans;
        if (sessionInstallmentOptionsParams == null || (values = sessionInstallmentOptionsParams.getValues()) == null) {
            values = n0.f26529a;
        }
        return new InstallmentOptionParams.DefaultInstallmentOptions(values, (sessionInstallmentOptionsParams == null || (plans = sessionInstallmentOptionsParams.getPlans()) == null) ? false : CollectionsKt.I(plans, InstallmentOption.REVOLVING.getType()));
    }

    private final InstallmentOptionParams.DefaultInstallmentOptions mapToDefaultInstallmentOptionsParam(InstallmentOptions.DefaultInstallmentOptions defaultInstallmentOptions) {
        List<Integer> values;
        if (defaultInstallmentOptions == null || (values = defaultInstallmentOptions.getValues()) == null) {
            values = n0.f26529a;
        }
        return new InstallmentOptionParams.DefaultInstallmentOptions(values, defaultInstallmentOptions != null ? defaultInstallmentOptions.getIncludeRevolving() : false);
    }

    @Nullable
    public final InstallmentParams mapToInstallmentParams$card_release(@Nullable SessionInstallmentConfiguration installmentConfiguration, @Nullable Amount amount, @NotNull Locale shopperLocale) {
        shopperLocale.getClass();
        InstallmentOptionParams.DefaultInstallmentOptions defaultInstallmentOptionsMapToDefaultInstallmentOptions = null;
        if (installmentConfiguration == null || installmentConfiguration.getInstallmentOptions() == null) {
            return null;
        }
        Boolean showInstallmentAmount = installmentConfiguration.getShowInstallmentAmount();
        boolean zBooleanValue = showInstallmentAmount != null ? showInstallmentAmount.booleanValue() : false;
        ArrayList arrayList = new ArrayList();
        Map<String, SessionInstallmentOptionsParams> installmentOptions = installmentConfiguration.getInstallmentOptions();
        if (installmentOptions != null) {
            for (Map.Entry<String, SessionInstallmentOptionsParams> entry : installmentOptions.entrySet()) {
                String key = entry.getKey();
                SessionInstallmentOptionsParams value = entry.getValue();
                if (Intrinsics.areEqual(key, DEFAULT_INSTALLMENT_OPTION)) {
                    defaultInstallmentOptionsMapToDefaultInstallmentOptions = mapToDefaultInstallmentOptions(value);
                } else {
                    arrayList.add(mapToCardBasedInstallmentOptions(value, key));
                }
            }
        }
        return new InstallmentParams(defaultInstallmentOptionsMapToDefaultInstallmentOptions, arrayList, amount, shopperLocale, zBooleanValue);
    }

    @Nullable
    public final InstallmentParams mapToInstallmentParams$card_release(@Nullable InstallmentConfiguration installmentConfiguration, @Nullable Amount amount, @NotNull Locale shopperLocale) {
        shopperLocale.getClass();
        if (installmentConfiguration == null) {
            return null;
        }
        InstallmentOptions.DefaultInstallmentOptions defaultOptions = installmentConfiguration.getDefaultOptions();
        InstallmentOptionParams.DefaultInstallmentOptions defaultInstallmentOptionsMapToDefaultInstallmentOptionsParam = defaultOptions != null ? mapToDefaultInstallmentOptionsParam(defaultOptions) : null;
        List<InstallmentOptions.CardBasedInstallmentOptions> cardBasedOptions = installmentConfiguration.getCardBasedOptions();
        ArrayList arrayList = new ArrayList(e0.o(cardBasedOptions, 10));
        Iterator<T> it = cardBasedOptions.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToCardBasedInstallmentOptionsParams((InstallmentOptions.CardBasedInstallmentOptions) it.next()));
        }
        return new InstallmentParams(defaultInstallmentOptionsMapToDefaultInstallmentOptionsParam, arrayList, amount, shopperLocale, installmentConfiguration.getShowInstallmentAmount());
    }
}
