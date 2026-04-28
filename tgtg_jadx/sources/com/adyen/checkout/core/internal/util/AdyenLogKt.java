package com.adyen.checkout.core.internal.util;

import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0087\bø\u0001\u0000\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"adyenLog", "", "level", "Lcom/adyen/checkout/core/AdyenLogLevel;", "tag", "", "throwable", "", "log", "Lkotlin/Function0;", "", "checkout-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AdyenLogKt {
    public static final void adyenLog(@NotNull Object obj, @NotNull AdyenLogLevel adyenLogLevel, @Nullable Throwable th2, @NotNull Function0<String> function0) {
        obj.getClass();
        adyenLogLevel.getClass();
        function0.getClass();
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = obj.getClass().getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), (String) function0.invoke(), th2);
        }
    }

    public static /* synthetic */ void adyenLog$default(Object obj, AdyenLogLevel adyenLogLevel, Throwable th2, Function0 function0, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        obj.getClass();
        adyenLogLevel.getClass();
        function0.getClass();
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            String name = obj.getClass().getName();
            String strY = StringsKt.Y(name, '$');
            String strW = StringsKt.W('.', strY, strY);
            if (strW.length() != 0) {
                name = StringsKt.O(strW, "Kt");
            }
            companion.getLogger().log(adyenLogLevel, "CO.".concat(name), (String) function0.invoke(), th2);
        }
    }

    public static final void adyenLog(@NotNull AdyenLogLevel adyenLogLevel, @NotNull String str, @Nullable Throwable th2, @NotNull Function0<String> function0) {
        adyenLogLevel.getClass();
        str.getClass();
        function0.getClass();
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            companion.getLogger().log(adyenLogLevel, f.k("CO.", str), (String) function0.invoke(), th2);
        }
    }

    public static /* synthetic */ void adyenLog$default(AdyenLogLevel adyenLogLevel, String str, Throwable th2, Function0 function0, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        adyenLogLevel.getClass();
        str.getClass();
        function0.getClass();
        AdyenLogger.Companion companion = AdyenLogger.INSTANCE;
        if (companion.getLogger().shouldLog(adyenLogLevel)) {
            companion.getLogger().log(adyenLogLevel, f.k("CO.", str), (String) function0.invoke(), th2);
        }
    }
}
