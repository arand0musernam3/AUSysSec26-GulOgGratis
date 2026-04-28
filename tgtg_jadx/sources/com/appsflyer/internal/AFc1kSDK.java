package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFc1kSDK {
    private static String getMonetizationNetwork = "374";
    private final Executor areAllFieldsValid;
    private PackageInfo component2;
    public final AFc1jSDK getCurrencyIso4217Code;
    public final AFc1gSDK getMediationNetwork;
    public final AFc1fSDK getRevenue;
    private Bundle component1 = null;
    public String AFAdRevenueData = "";

    public AFc1kSDK(AFc1fSDK aFc1fSDK, AFc1jSDK aFc1jSDK, AFc1gSDK aFc1gSDK, Executor executor) {
        this.getRevenue = aFc1fSDK;
        this.getCurrencyIso4217Code = aFc1jSDK;
        this.getMediationNetwork = aFc1gSDK;
        this.areAllFieldsValid = executor;
    }

    public static String areAllFieldsValid() {
        StringBuilder sb2 = new StringBuilder("version: 6.18.0 (build ");
        sb2.append(getMonetizationNetwork);
        sb2.append(")");
        return sb2.toString();
    }

    public final String component1() {
        String string = AppsFlyerProperties.getInstance().getString("channel");
        if (string == null) {
            string = getMonetizationNetwork("CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public final String getCurrencyIso4217Code(Context context) {
        try {
            return new AFb1kSDK(context, this.areAllFieldsValid).getCurrencyIso4217Code();
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.PUBLIC_API, "Exception while collecting facebook's attribution ID. ", th2, true, false, false);
            return null;
        }
    }

    public final boolean getMediationNetwork(String str) {
        String monetizationNetwork = getMonetizationNetwork(str);
        if (monetizationNetwork != null) {
            return Boolean.parseBoolean(monetizationNetwork);
        }
        return false;
    }

    public final String getMonetizationNetwork(String str) {
        Object obj;
        try {
            if (this.component1 == null) {
                this.component1 = ((PackageItemInfo) this.getRevenue.getCurrencyIso4217Code.getPackageManager().getApplicationInfo(this.getRevenue.getCurrencyIso4217Code.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.component1;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Could not load manifest metadata!");
            sb2.append(th2.getMessage());
            AFLogger.afErrorLog(sb2.toString(), th2);
            return null;
        }
    }

    @SuppressLint({"DiscouragedApi"})
    public final String getRevenue(String str) {
        try {
            int identifier = this.getRevenue.getCurrencyIso4217Code.getResources().getIdentifier(str, "string", this.getRevenue.getCurrencyIso4217Code.getPackageName());
            if (identifier != 0) {
                return this.getRevenue.getCurrencyIso4217Code.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e5) {
            StringBuilder sb2 = new StringBuilder("Could not load string resource!");
            sb2.append(e5.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e5);
            return null;
        }
    }

    @NonNull
    public final PackageInfo n_() {
        if (this.component2 == null) {
            try {
                int i11 = Build.VERSION.SDK_INT;
                AFc1fSDK aFc1fSDK = this.getRevenue;
                if (i11 >= 33) {
                    this.component2 = aFc1fSDK.getCurrencyIso4217Code.getPackageManager().getPackageInfo(this.getRevenue.getCurrencyIso4217Code.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                } else {
                    this.component2 = aFc1fSDK.getCurrencyIso4217Code.getPackageManager().getPackageInfo(this.getRevenue.getCurrencyIso4217Code.getPackageName(), 0);
                }
            } catch (PackageManager.NameNotFoundException e5) {
                AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while trying fo get PackageInfo", e5, false, false, true, false);
            }
        }
        return this.component2;
    }

    public final boolean getMediationNetwork() {
        return !this.getMediationNetwork.AFAdRevenueData();
    }

    public static String getCurrencyIso4217Code() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    @NonNull
    public static String getRevenue() {
        return "6.18.0";
    }

    public final String getMonetizationNetwork() {
        AFh1rSDK aFh1rSDK = this.getMediationNetwork.component2;
        AFb1mSDK aFb1mSDK = aFh1rSDK != null ? new AFb1mSDK(aFh1rSDK.AFAdRevenueData, aFh1rSDK.component4) : null;
        if (aFb1mSDK != null) {
            return aFb1mSDK.getRevenue;
        }
        return null;
    }

    public final boolean getMonetizationNetwork(Context context) {
        try {
        } catch (PackageManager.NameNotFoundException e5) {
            AFLogger.INSTANCE.e(AFg1cSDK.PUBLIC_API, "Could not check if app is pre installed", e5);
        }
        return (this.getRevenue.getCurrencyIso4217Code.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0;
    }
}
