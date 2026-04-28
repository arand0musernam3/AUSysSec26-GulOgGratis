package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.google.firebase.messaging.FirebaseMessagingService;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFf1bSDK {
    public final AFc1jSDK getCurrencyIso4217Code;

    public AFf1bSDK(@NonNull Context context) {
        this.getCurrencyIso4217Code = AFa1tSDK.getMediationNetwork().getMediationNetwork(context);
    }

    public static boolean getRevenue(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
            return AFj1pSDK.L_(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class));
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th2);
            return false;
        }
    }

    public final AFg1xSDK getMonetizationNetwork() {
        String string;
        String string2;
        String revenue = this.getCurrencyIso4217Code.getRevenue("afUninstallToken", (String) null);
        long mediationNetwork = this.getCurrencyIso4217Code.getMediationNetwork("afUninstallToken_received_time", 0L);
        boolean revenue2 = this.getCurrencyIso4217Code.getRevenue("afUninstallToken_queued");
        this.getCurrencyIso4217Code.getRevenue("afUninstallToken_queued", false);
        if (revenue == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            revenue = string2.split(MessageLogView.COMMA_SEPARATOR)[r0.length - 1];
        }
        if (mediationNetwork == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] strArrSplit = string.split(MessageLogView.COMMA_SEPARATOR);
            if (strArrSplit.length >= 2) {
                try {
                    mediationNetwork = Long.parseLong(strArrSplit[strArrSplit.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (revenue != null) {
            return new AFg1xSDK(revenue, mediationNetwork, revenue2);
        }
        return null;
    }

    public static boolean getMonetizationNetwork(@NonNull AFc1jSDK aFc1jSDK) {
        return aFc1jSDK.getRevenue("sentRegisterRequestToAF");
    }
}
