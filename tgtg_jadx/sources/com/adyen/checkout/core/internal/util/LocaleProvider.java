package com.adyen.checkout.core.internal.util;

import android.content.Context;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "", "()V", "getLocale", "Ljava/util/Locale;", "context", "Landroid/content/Context;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LocaleProvider {
    @NotNull
    public final Locale getLocale(@NotNull Context context) {
        context.getClass();
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        locale.getClass();
        return locale;
    }
}
