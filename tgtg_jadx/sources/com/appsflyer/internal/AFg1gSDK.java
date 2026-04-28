package com.appsflyer.internal;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nExcManagerClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExcManagerClient.kt\ncom/appsflyer/internal/logger/ExcManagerClient\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n*L\n1#1,26:1\n36#2:27\n*S KotlinDebug\n*F\n+ 1 ExcManagerClient.kt\ncom/appsflyer/internal/logger/ExcManagerClient\n*L\n21#1:27\n*E\n"})
public final class AFg1gSDK extends AFg1hSDK {

    @NotNull
    private final AFd1zSDK AFAdRevenueData;

    public AFg1gSDK(@NotNull AFd1zSDK aFd1zSDK) {
        aFd1zSDK.getClass();
        this.AFAdRevenueData = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2, boolean z11, boolean z12, boolean z13, boolean z14) {
        aFg1cSDK.getClass();
        str.getClass();
        th2.getClass();
        if (z13) {
            if (StringsKt.H(str)) {
                str = "missing label";
            }
            this.AFAdRevenueData.afLogForce().getMediationNetwork(th2, withTag$SDK_prodRelease(str, aFg1cSDK));
        }
    }
}
