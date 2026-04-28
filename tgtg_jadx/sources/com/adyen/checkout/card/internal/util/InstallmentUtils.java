package com.adyen.checkout.card.internal.util;

import android.content.Context;
import com.adyen.checkout.card.InstallmentConfiguration;
import com.adyen.checkout.card.InstallmentOptions;
import com.adyen.checkout.card.R;
import com.adyen.checkout.card.internal.ui.model.InstallmentOption;
import com.adyen.checkout.card.internal.ui.model.InstallmentOptionParams;
import com.adyen.checkout.card.internal.ui.model.InstallmentParams;
import com.adyen.checkout.card.internal.ui.view.InstallmentModel;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.Installments;
import com.adyen.checkout.components.core.internal.util.CurrencyUtils;
import com.adyen.checkout.components.core.internal.util.NumberExtensionKt;
import com.adyen.checkout.core.CardBrand;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0016\u0010\r\u001a\u00020\u00042\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fJ2\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u0004¨\u0006!"}, d2 = {"Lcom/adyen/checkout/card/internal/util/InstallmentUtils;", "", "()V", "areInstallmentValuesValid", "", "installmentConfiguration", "Lcom/adyen/checkout/card/InstallmentConfiguration;", "getTextForInstallmentOption", "", "context", "Landroid/content/Context;", "installmentModel", "Lcom/adyen/checkout/card/internal/ui/view/InstallmentModel;", "isCardBasedOptionsValid", "cardBasedInstallmentOptions", "", "Lcom/adyen/checkout/card/InstallmentOptions$CardBasedInstallmentOptions;", "makeInstallmentModelList", "installmentOptions", "Lcom/adyen/checkout/card/internal/ui/model/InstallmentOptionParams;", "amount", "Lcom/adyen/checkout/components/core/Amount;", "shopperLocale", "Ljava/util/Locale;", "showAmount", "makeInstallmentModelObject", "Lcom/adyen/checkout/components/core/Installments;", "makeInstallmentOptions", "installmentParams", "Lcom/adyen/checkout/card/internal/ui/model/InstallmentParams;", "cardBrand", "Lcom/adyen/checkout/core/CardBrand;", "isCardTypeReliable", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInstallmentUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstallmentUtils.kt\ncom/adyen/checkout/card/internal/util/InstallmentUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,180:1\n1755#2,3:181\n295#2,2:184\n1557#2:186\n1628#2,3:187\n1485#2:190\n1510#2,3:191\n1513#2,3:201\n1755#2,3:204\n1755#2,2:207\n1755#2,3:209\n1757#2:212\n381#3,7:194\n*S KotlinDebug\n*F\n+ 1 InstallmentUtils.kt\ncom/adyen/checkout/card/internal/util/InstallmentUtils\n*L\n42#1:181,3\n47#1:184,2\n97#1:186\n97#1:187,3\n160#1:190\n160#1:191,3\n160#1:201,3\n162#1:204,3\n174#1:207,2\n175#1:209,3\n174#1:212\n160#1:194,7\n*E\n"})
public final class InstallmentUtils {

    @NotNull
    public static final InstallmentUtils INSTANCE = new InstallmentUtils();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstallmentOption.values().length];
            try {
                iArr[InstallmentOption.ONE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstallmentOption.REVOLVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InstallmentOption.REGULAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private InstallmentUtils() {
    }

    private final List<InstallmentModel> makeInstallmentModelList(InstallmentOptionParams installmentOptions, Amount amount, Locale shopperLocale, boolean showAmount) {
        if (installmentOptions == null) {
            return n0.f26529a;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InstallmentModel(null, InstallmentOption.ONE_TIME, amount, shopperLocale, showAmount));
        if (installmentOptions.getIncludeRevolving()) {
            arrayList.add(new InstallmentModel(1, InstallmentOption.REVOLVING, amount, shopperLocale, showAmount));
        }
        List<Integer> values = installmentOptions.getValues();
        ArrayList arrayList2 = new ArrayList(e0.o(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList2.add(new InstallmentModel(Integer.valueOf(((Number) it.next()).intValue()), InstallmentOption.REGULAR, amount, shopperLocale, showAmount));
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final boolean areInstallmentValuesValid(@NotNull InstallmentConfiguration installmentConfiguration) {
        installmentConfiguration.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(installmentConfiguration.getDefaultOptions());
        arrayList.addAll(installmentConfiguration.getCardBasedOptions());
        ArrayList arrayListM = CollectionsKt.M(arrayList);
        boolean z11 = false;
        if (!arrayListM.isEmpty()) {
            Iterator it = arrayListM.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List<Integer> values = ((InstallmentOptions) it.next()).getValues();
                if (values == null || !values.isEmpty()) {
                    Iterator<T> it2 = values.iterator();
                    while (it2.hasNext()) {
                        if (((Number) it2.next()).intValue() <= 1) {
                            z11 = true;
                            break loop0;
                        }
                    }
                }
            }
        }
        return !z11;
    }

    @NotNull
    public final String getTextForInstallmentOption(@NotNull Context context, @Nullable InstallmentModel installmentModel) {
        context.getClass();
        InstallmentOption option = installmentModel != null ? installmentModel.getOption() : null;
        int i11 = option == null ? -1 : WhenMappings.$EnumSwitchMapping$0[option.ordinal()];
        if (i11 == 1) {
            String string = context.getString(R.string.checkout_card_installments_option_one_time);
            string.getClass();
            return string;
        }
        if (i11 == 2) {
            String string2 = context.getString(R.string.checkout_card_installments_option_revolving);
            string2.getClass();
            return string2;
        }
        if (i11 != 3) {
            return "";
        }
        Integer numberOfInstallments = installmentModel.getNumberOfInstallments();
        int iIntValue = numberOfInstallments != null ? numberOfInstallments.intValue() : 1;
        Amount amount = installmentModel.getAmount();
        Amount amountCopy$default = amount != null ? Amount.copy$default(amount, null, installmentModel.getAmount().getValue() / ((long) iIntValue), 1, null) : null;
        String toLocalizedString = NumberExtensionKt.formatToLocalizedString(iIntValue, installmentModel.getShopperLocale());
        String string3 = (!installmentModel.getShowAmount() || amountCopy$default == null) ? context.getString(R.string.checkout_card_installments_option_regular, toLocalizedString) : context.getString(R.string.checkout_card_installments_option_regular_with_price, toLocalizedString, CurrencyUtils.INSTANCE.formatAmount(amountCopy$default, installmentModel.getShopperLocale()));
        string3.getClass();
        return string3;
    }

    public final boolean isCardBasedOptionsValid(@Nullable List<InstallmentOptions.CardBasedInstallmentOptions> cardBasedInstallmentOptions) {
        boolean z11 = false;
        if (cardBasedInstallmentOptions != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : cardBasedInstallmentOptions) {
                CardBrand cardBrand = ((InstallmentOptions.CardBasedInstallmentOptions) obj).getCardBrand();
                Object arrayList = linkedHashMap.get(cardBrand);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(cardBrand, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            Collection collectionValues = linkedHashMap.values();
            if (collectionValues != null) {
                Collection collection = collectionValues;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((List) it.next()).size() > 1) {
                            z11 = true;
                            break;
                        }
                    }
                }
            }
        }
        return !z11;
    }

    @Nullable
    public final Installments makeInstallmentModelObject(@Nullable InstallmentModel installmentModel) {
        InstallmentOption option = installmentModel != null ? installmentModel.getOption() : null;
        int i11 = option == null ? -1 : WhenMappings.$EnumSwitchMapping$0[option.ordinal()];
        if (i11 == 2 || i11 == 3) {
            return new Installments(installmentModel.getOption().getType(), installmentModel.getNumberOfInstallments());
        }
        return null;
    }

    @NotNull
    public final List<InstallmentModel> makeInstallmentOptions(@Nullable InstallmentParams installmentParams, @Nullable CardBrand cardBrand, boolean isCardTypeReliable) {
        List<InstallmentOptionParams.CardBasedInstallmentOptions> cardBasedOptions;
        if (installmentParams == null) {
            return n0.f26529a;
        }
        boolean zIsEmpty = installmentParams.getCardBasedOptions().isEmpty();
        InstallmentOptionParams.DefaultInstallmentOptions defaultOptions = installmentParams.getDefaultOptions();
        Object obj = null;
        List<Integer> values = defaultOptions != null ? defaultOptions.getValues() : null;
        boolean z11 = values == null || values.isEmpty();
        if (!zIsEmpty && isCardTypeReliable && ((cardBasedOptions = installmentParams.getCardBasedOptions()) == null || !cardBasedOptions.isEmpty())) {
            Iterator<T> it = cardBasedOptions.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((InstallmentOptionParams.CardBasedInstallmentOptions) it.next()).getCardBrand(), cardBrand)) {
                    InstallmentUtils installmentUtils = INSTANCE;
                    Iterator<T> it2 = installmentParams.getCardBasedOptions().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (Intrinsics.areEqual(((InstallmentOptionParams.CardBasedInstallmentOptions) next).getCardBrand(), cardBrand)) {
                            obj = next;
                            break;
                        }
                    }
                    return installmentUtils.makeInstallmentModelList((InstallmentOptionParams) obj, installmentParams.getAmount(), installmentParams.getShopperLocale(), installmentParams.getShowInstallmentAmount());
                }
            }
        }
        return !z11 ? INSTANCE.makeInstallmentModelList(installmentParams.getDefaultOptions(), installmentParams.getAmount(), installmentParams.getShopperLocale(), installmentParams.getShowInstallmentAmount()) : n0.f26529a;
    }
}
