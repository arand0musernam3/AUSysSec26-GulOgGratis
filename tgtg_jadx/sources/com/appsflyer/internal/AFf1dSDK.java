package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFf1dSDK implements AFf1cSDK {

    @NotNull
    private final Context getCurrencyIso4217Code;

    @NotNull
    private final AppsFlyerProperties getMonetizationNetwork;

    public AFf1dSDK(@NotNull Context context, @NotNull AppsFlyerProperties appsFlyerProperties) {
        context.getClass();
        appsFlyerProperties.getClass();
        this.getCurrencyIso4217Code = context;
        this.getMonetizationNetwork = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFf1cSDK
    @Nullable
    public final AFf1fSDK getMediationNetwork() {
        String string;
        if (!Boolean.parseBoolean(this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.getCurrencyIso4217Code);
            int i11 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i12 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i13 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i14 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i11 == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                str = string;
            }
            return new AFf1fSDK(i13, i11, i12, i14, str);
        } catch (Exception e5) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DMA, "TCF data collection exception", e5, false, false, false, false, 120, null);
            return null;
        }
    }
}
