package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFe1iSDK extends AFe1bSDK<String> {

    @NonNull
    private final String component2;
    private final AFk1ySDK copy;
    private final AFc1kSDK copydefault;

    public AFe1iSDK(@NonNull AFd1zSDK aFd1zSDK, @NonNull String str, AFk1ySDK aFk1ySDK) {
        super(AFe1lSDK.IMPRESSIONS, new AFe1lSDK[]{AFe1lSDK.RC_CDN, AFe1lSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, str);
        this.component2 = str;
        this.copy = aFk1ySDK;
        this.copydefault = aFd1zSDK.AFAdRevenueData();
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AppsFlyerRequestListener component1() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final boolean copy() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final void getMonetizationNetwork() {
        super.getMonetizationNetwork();
        AFe1ySDK<Result> aFe1ySDK = ((AFe1bSDK) this).component4;
        if (aFe1ySDK != 0) {
            int statusCode = aFe1ySDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb2 = new StringBuilder("Cross promotion impressions success: ");
                sb2.append(this.component2);
                AFLogger.afInfoLog(sb2.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb3 = new StringBuilder("call to ");
                sb3.append(this.component2);
                sb3.append(" failed: ");
                sb3.append(statusCode);
                AFLogger.afInfoLog(sb3.toString());
                return;
            }
            StringBuilder sb4 = new StringBuilder("Cross promotion redirection success: ");
            sb4.append(this.component2);
            AFLogger.afInfoLog(sb4.toString(), false);
            String strAFAdRevenueData = aFe1ySDK.AFAdRevenueData("Location");
            AFk1ySDK aFk1ySDK = this.copy;
            if (aFk1ySDK == null || strAFAdRevenueData == null) {
                return;
            }
            aFk1ySDK.getMonetizationNetwork = strAFAdRevenueData;
            Context context = aFk1ySDK.getRevenue.get();
            if (context != null) {
                try {
                    if (aFk1ySDK.getMonetizationNetwork != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFk1ySDK.getMonetizationNetwork)).setFlags(268435456));
                    }
                } catch (Exception e5) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e5)), e5);
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final AFd1fSDK<String> getRevenue(@NonNull String str) {
        AFd1mSDK aFd1mSDK = ((AFe1bSDK) this).component3;
        String monetizationNetwork = this.copydefault.getMonetizationNetwork();
        boolean mediationNetwork = AFk1zSDK.getMediationNetwork(monetizationNetwork);
        String string = this.component2;
        if (!mediationNetwork) {
            string = Uri.parse(string).buildUpon().appendQueryParameter("advertising_id", monetizationNetwork).build().toString();
        }
        return aFd1mSDK.getCurrencyIso4217Code(string);
    }
}
