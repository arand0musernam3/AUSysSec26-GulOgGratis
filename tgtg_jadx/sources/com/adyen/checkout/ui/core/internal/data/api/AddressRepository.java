package com.adyen.checkout.ui.core.internal.data.api;

import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import y80.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/data/api/AddressRepository;", "", "Ljava/util/Locale;", "shopperLocale", "", "countryCode", "Lv80/b0;", "coroutineScope", "", "getStateList", "(Ljava/util/Locale;Ljava/lang/String;Lv80/b0;)V", "getCountryList", "(Ljava/util/Locale;Lv80/b0;)V", "Ly80/i;", "", "Lcom/adyen/checkout/ui/core/internal/data/model/AddressItem;", "getStatesFlow", "()Ly80/i;", "statesFlow", "getCountriesFlow", "countriesFlow", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AddressRepository {
    @NotNull
    i getCountriesFlow();

    void getCountryList(@NotNull Locale shopperLocale, @NotNull b0 coroutineScope);

    void getStateList(@NotNull Locale shopperLocale, @Nullable String countryCode, @NotNull b0 coroutineScope);

    @NotNull
    i getStatesFlow();
}
