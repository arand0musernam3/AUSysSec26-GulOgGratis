package com.adyen.checkout.ui.core.internal.util;

import com.adyen.checkout.components.core.internal.util.CountryInfo;
import com.adyen.checkout.ui.core.internal.ui.model.CountryModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w70.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\f¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/util/CountryUtils;", "", "()V", "getLocalizedCountries", "", "Lcom/adyen/checkout/ui/core/internal/ui/model/CountryModel;", "shopperLocale", "Ljava/util/Locale;", "allowedISOCodes", "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCountryUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryUtils.kt\ncom/adyen/checkout/ui/core/internal/util/CountryUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1557#2:36\n1628#2,3:37\n*S KotlinDebug\n*F\n+ 1 CountryUtils.kt\ncom/adyen/checkout/ui/core/internal/util/CountryUtils\n*L\n25#1:36\n25#1:37,3\n*E\n"})
public final class CountryUtils {

    @NotNull
    public static final CountryUtils INSTANCE = new CountryUtils();

    private CountryUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List getLocalizedCountries$default(CountryUtils countryUtils, Locale locale, List list, Comparator comparator, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = null;
        }
        if ((i11 & 4) != 0) {
            comparator = new Comparator() { // from class: com.adyen.checkout.ui.core.internal.util.CountryUtils$getLocalizedCountries$default$$inlined$compareBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t9, T t11) {
                    return a.a(((CountryModel) t9).getCountryName(), ((CountryModel) t11).getCountryName());
                }
            };
        }
        return countryUtils.getLocalizedCountries(locale, list, comparator);
    }

    @NotNull
    public final List<CountryModel> getLocalizedCountries(@NotNull Locale shopperLocale, @Nullable List<String> allowedISOCodes, @NotNull Comparator<CountryModel> comparator) {
        shopperLocale.getClass();
        comparator.getClass();
        List<CountryInfo> countries = com.adyen.checkout.components.core.internal.util.CountryUtils.getCountries(allowedISOCodes);
        ArrayList arrayList = new ArrayList(e0.o(countries, 10));
        for (CountryInfo countryInfo : countries) {
            arrayList.add(new CountryModel(countryInfo.getIsoCode(), com.adyen.checkout.components.core.internal.util.CountryUtils.getCountryName(countryInfo.getIsoCode(), shopperLocale), countryInfo.getCallingCode()));
        }
        return CollectionsKt.l0(arrayList, comparator);
    }
}
