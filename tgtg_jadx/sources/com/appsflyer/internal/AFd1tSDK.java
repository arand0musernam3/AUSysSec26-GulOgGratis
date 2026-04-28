package com.appsflyer.internal;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nThrowableExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThrowableExtensions.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ThrowableExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n11653#2,9:36\n13579#2:45\n13580#2:47\n11662#2:48\n1#3:46\n*S KotlinDebug\n*F\n+ 1 ThrowableExtensions.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ThrowableExtensionsKt\n*L\n10#1:36,9\n10#1:45\n10#1:47\n10#1:48\n10#1:46\n*E\n"})
public final class AFd1tSDK {
    @NotNull
    private static String AFAdRevenueData(@NotNull Throwable th2) {
        th2.getClass();
        StackTraceElement[] stackTrace = th2.getStackTrace();
        stackTrace.getClass();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            className.getClass();
            if (!y.p(className, "com.appsflyer", false)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        return AFd1pSDK.getMediationNetwork(th2 + "\n" + CollectionsKt.U(arrayList, "\n", null, null, new Function1<StackTraceElement, CharSequence>() { // from class: com.appsflyer.internal.AFd1tSDK.5
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@NotNull StackTraceElement stackTraceElement2) {
                stackTraceElement2.getClass();
                return "at " + stackTraceElement2;
            }
        }, 30), "SHA-256");
    }

    @NotNull
    public static final AFc1bSDK AFAdRevenueData(@NotNull Throwable th2, @NotNull String str) {
        th2.getClass();
        str.getClass();
        th2.getClass();
        return new AFc1bSDK(r8.k.m(th2.getClass().getName(), ": ", str), AFAdRevenueData(th2), u70.e.b(th2), 0, 8, null);
    }
}
