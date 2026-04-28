package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import com.appsflyer.internal.AFa1tSDK;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        if (intent == null) {
            return;
        }
        try {
            stringExtra = intent.getStringExtra("referrer");
        } catch (Throwable th2) {
            AFLogger.afErrorLog("error in BroadcastReceiver ", th2);
            stringExtra = null;
        }
        if (stringExtra != null && ((SharedPreferences) AFa1tSDK.getMonetizationNetwork(new Object[]{context}, 1469250199, -1469250196, (int) System.currentTimeMillis())).getString("referrer", null) != null) {
            AFa1tSDK.getMediationNetwork().getMediationNetwork(context, stringExtra);
            return;
        }
        AFLogger.afInfoLog("MultipleInstallBroadcastReceiver called");
        AFa1tSDK.getMediationNetwork().b_(context, intent);
        for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
            String action = intent.getAction();
            if (((PackageItemInfo) resolveInfo.activityInfo).packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !getClass().getName().equals(((PackageItemInfo) resolveInfo.activityInfo).name)) {
                StringBuilder sb2 = new StringBuilder("trigger onReceive: class: ");
                sb2.append(((PackageItemInfo) resolveInfo.activityInfo).name);
                AFLogger.afInfoLog(sb2.toString());
                try {
                    ((BroadcastReceiver) Class.forName(((PackageItemInfo) resolveInfo.activityInfo).name).newInstance()).onReceive(context, intent);
                } catch (Throwable th3) {
                    StringBuilder sb3 = new StringBuilder("error in BroadcastReceiver ");
                    sb3.append(((PackageItemInfo) resolveInfo.activityInfo).name);
                    AFLogger.afErrorLog(sb3.toString(), th3);
                }
            }
        }
    }
}
