package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H%¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0005@\u0004X\u0085\f¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016"}, d2 = {"Lcom/appsflyer/internal/AFi1pSDK;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "getRevenue", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFi1wSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFi1wSDK;", "Landroid/net/NetworkInfo;", "", "v_", "(Landroid/net/NetworkInfo;)Z", "getCurrencyIso4217Code", "()Z", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "getMonetizationNetwork", "Landroid/telephony/TelephonyManager;", "Landroid/telephony/TelephonyManager;", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AFi1pSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @Nullable
    ConnectivityManager getMonetizationNetwork;

    @Nullable
    private final TelephonyManager getRevenue;

    public AFi1pSDK(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        this.getMonetizationNetwork = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        Object systemService2 = context.getSystemService("phone");
        this.getRevenue = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
    }

    public static boolean v_(@Nullable NetworkInfo p02) {
        if (p02 != null) {
            return p02.isConnectedOrConnecting();
        }
        return false;
    }

    @NotNull
    public final AFi1wSDK AFAdRevenueData() {
        Throwable th2;
        String str;
        String simOperatorName;
        String networkOperatorName = null;
        try {
            TelephonyManager telephonyManager = this.getRevenue;
            if (telephonyManager != null) {
                simOperatorName = telephonyManager.getSimOperatorName();
                try {
                    networkOperatorName = telephonyManager.getNetworkOperatorName();
                    if (networkOperatorName == null || networkOperatorName.length() == 0) {
                        if (telephonyManager.getPhoneType() == 2) {
                            networkOperatorName = "CDMA";
                        }
                    }
                } catch (Throwable th3) {
                    str = networkOperatorName;
                    networkOperatorName = simOperatorName;
                    th2 = th3;
                    AFLogger.afErrorLog("Exception while collecting network info. ", th2);
                    simOperatorName = networkOperatorName;
                    networkOperatorName = str;
                }
            } else {
                simOperatorName = null;
            }
        } catch (Throwable th4) {
            th2 = th4;
            str = null;
        }
        return new AFi1wSDK(getRevenue(), networkOperatorName, simOperatorName, getCurrencyIso4217Code());
    }

    public abstract boolean getCurrencyIso4217Code();

    @NotNull
    public abstract String getRevenue();
}
