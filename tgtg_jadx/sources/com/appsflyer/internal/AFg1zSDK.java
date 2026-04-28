package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFg1zSDK {

    @Nullable
    private final PackageManager AFAdRevenueData;

    @NotNull
    private final Map<String, Object> getCurrencyIso4217Code;

    @NotNull
    private final String getMonetizationNetwork;

    public AFg1zSDK(@NotNull AFc1fSDK aFc1fSDK, @NotNull AFc1kSDK aFc1kSDK) {
        aFc1fSDK.getClass();
        aFc1kSDK.getClass();
        this.getCurrencyIso4217Code = new LinkedHashMap();
        Context context = aFc1fSDK.getCurrencyIso4217Code;
        this.AFAdRevenueData = context != null ? context.getPackageManager() : null;
        String packageName = aFc1kSDK.getRevenue.getCurrencyIso4217Code.getPackageName();
        packageName.getClass();
        this.getMonetizationNetwork = packageName;
    }

    private final Map<String, Object> getMonetizationNetwork() {
        InstallSourceInfo installSourceInfo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String str = this.getMonetizationNetwork;
            PackageManager packageManager = this.AFAdRevenueData;
            if (packageManager != null && (installSourceInfo = packageManager.getInstallSourceInfo(str)) != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                if (initiatingPackageName != null) {
                    linkedHashMap2.put("initiating_package", initiatingPackageName);
                }
                String installingPackageName = installSourceInfo.getInstallingPackageName();
                if (installingPackageName != null) {
                    linkedHashMap2.put("installing_package", installingPackageName);
                }
                String originatingPackageName = installSourceInfo.getOriginatingPackageName();
                if (originatingPackageName != null) {
                    linkedHashMap2.put("originating_package", originatingPackageName);
                }
                return linkedHashMap2;
            }
        } catch (Throwable th2) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DEVICE_DATA, "Failed to get the app install source info", th2, true, false, true, true, 16, null);
        }
        return linkedHashMap;
    }

    @NotNull
    public final Map<String, Object> getCurrencyIso4217Code() {
        String installerPackageName;
        if (this.getCurrencyIso4217Code.isEmpty()) {
            try {
                PackageManager packageManager = this.AFAdRevenueData;
                if (packageManager != null && (installerPackageName = packageManager.getInstallerPackageName(this.getMonetizationNetwork)) != null) {
                    this.getCurrencyIso4217Code.put("installer_package", installerPackageName);
                }
            } catch (Exception e5) {
                AFLogger.afErrorLog("Exception while getting the app's installer package. ", e5);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                this.getCurrencyIso4217Code.put("install_source_info", getMonetizationNetwork());
            }
        }
        return this.getCurrencyIso4217Code;
    }
}
