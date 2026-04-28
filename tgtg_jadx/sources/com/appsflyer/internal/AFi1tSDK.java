package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNetworkDataCollectorApi31.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkDataCollectorApi31.kt\ncom/appsflyer/internal/network/NetworkDataCollectorApi31\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public final class AFi1tSDK extends AFi1pSDK {

    @NotNull
    private String getCurrencyIso4217Code;

    @Nullable
    private Network getRevenue;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class AFa1uSDK extends ConnectivityManager.NetworkCallback {
        public AFa1uSDK() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@NotNull Network network) {
            network.getClass();
            AFi1tSDK.this.getRevenue = network;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NotNull Network network) {
            network.getClass();
            AFi1tSDK.this.getRevenue = network;
            AFi1tSDK.this.getCurrencyIso4217Code = "NetworkLost";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1tSDK(@NotNull Context context) {
        super(context);
        context.getClass();
        this.getCurrencyIso4217Code = PaymentMethodTypes.UNKNOWN;
        AFa1uSDK aFa1uSDK = new AFa1uSDK();
        try {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), aFa1uSDK);
            }
        } catch (Throwable th2) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DEVICE_DATA, "Error at attempt to register network callback with ConnectivityManager", th2, true, false, false, false, 96, null);
        }
    }

    private static boolean y_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    public final boolean getCurrencyIso4217Code() {
        Network network = this.getRevenue;
        if (network == null) {
            return false;
        }
        if (Intrinsics.areEqual(this.getCurrencyIso4217Code, "NetworkLost")) {
            network = null;
        }
        if (network == null) {
            return false;
        }
        ConnectivityManager connectivityManager = this.getMonetizationNetwork;
        NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
        if (networkCapabilities != null) {
            return y_(networkCapabilities);
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFi1pSDK
    @NotNull
    public final String getRevenue() {
        Network network = this.getRevenue;
        if (network != null) {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return "WIFI";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "MOBILE";
                }
            }
        }
        return PaymentMethodTypes.UNKNOWN;
    }
}
