package com.adyen.checkout.components.core.internal.util;

import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"formatToLocalizedString", "", "", "locale", "Ljava/util/Locale;", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class NumberExtensionKt {
    @NotNull
    public static final String formatToLocalizedString(int i11, @NotNull Locale locale) {
        locale.getClass();
        String str = NumberFormat.getInstance(locale).format(Integer.valueOf(i11));
        str.getClass();
        return str;
    }
}
