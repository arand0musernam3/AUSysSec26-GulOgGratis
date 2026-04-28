package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.appsflyer.AFLogger;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNetworkDataCollectorApiPre21.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkDataCollectorApiPre21.kt\ncom/appsflyer/internal/network/NetworkDataCollectorApiPre21\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1747#2,3:44\n*S KotlinDebug\n*F\n+ 1 NetworkDataCollectorApiPre21.kt\ncom/appsflyer/internal/network/NetworkDataCollectorApiPre21\n*L\n36#1:44,3\n*E\n"})
public final class AFi1sSDK extends AFi1pSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1sSDK(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final boolean getCurrencyIso4217Code() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            networkInterfaces.getClass();
            ArrayList<NetworkInterface> list = Collections.list(networkInterfaces);
            list.getClass();
            if (list != null && list.isEmpty()) {
                return false;
            }
            for (NetworkInterface networkInterface : list) {
                if (networkInterface.isUp() && Intrinsics.areEqual(networkInterface.getName(), "tun0")) {
                    return true;
                }
            }
            return false;
        } catch (Exception e5) {
            AFLogger.afErrorLog("Failed collecting ivc data", e5);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    @NotNull
    public final String getRevenue() {
        ConnectivityManager connectivityManager = this.getMonetizationNetwork;
        if (connectivityManager != null) {
            if (AFi1pSDK.v_(connectivityManager.getNetworkInfo(1))) {
                return "WIFI";
            }
            if (AFi1pSDK.v_(connectivityManager.getNetworkInfo(0))) {
                return "MOBILE";
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                return type != 0 ? type != 1 ? PaymentMethodTypes.UNKNOWN : "WIFI" : "MOBILE";
            }
        }
        return PaymentMethodTypes.UNKNOWN;
    }
}
