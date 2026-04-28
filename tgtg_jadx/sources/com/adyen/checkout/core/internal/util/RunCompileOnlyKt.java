package com.adyen.checkout.core.internal.util;

import com.adyen.checkout.core.AdyenLogLevel;
import com.adyen.checkout.core.AdyenLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, d2 = {"runCompileOnly", "R", "", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "checkout-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRunCompileOnly.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunCompileOnly.kt\ncom/adyen/checkout/core/internal/util/RunCompileOnlyKt\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n*L\n1#1,26:1\n44#2,4:27\n44#2,4:31\n*S KotlinDebug\n*F\n+ 1 RunCompileOnly.kt\ncom/adyen/checkout/core/internal/util/RunCompileOnlyKt\n*L\n19#1:27,4\n21#1:31,4\n*E\n"})
public final class RunCompileOnlyKt {
    @Nullable
    public static final <R> R runCompileOnly(@NotNull Function0<? extends R> function0) {
        function0.getClass();
        try {
            return (R) function0.invoke();
        } catch (ClassNotFoundException e5) {
            AdyenLogLevel adyenLogLevel = AdyenLogLevel.WARN;
            if (!AdyenLogger.INSTANCE.getLogger().shouldLog(adyenLogLevel)) {
                return null;
            }
            AdyenLogger.INSTANCE.getLogger().log(adyenLogLevel, "CO.runCompileOnly", "Class not found. Are you missing a dependency?", e5);
            return null;
        } catch (NoClassDefFoundError e11) {
            AdyenLogLevel adyenLogLevel2 = AdyenLogLevel.WARN;
            if (!AdyenLogger.INSTANCE.getLogger().shouldLog(adyenLogLevel2)) {
                return null;
            }
            AdyenLogger.INSTANCE.getLogger().log(adyenLogLevel2, "CO.runCompileOnly", "Class not found. Are you missing a dependency?", e11);
            return null;
        }
    }
}
