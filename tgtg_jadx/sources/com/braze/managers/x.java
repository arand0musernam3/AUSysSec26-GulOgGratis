package com.braze.managers;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f10120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.braze.storage.x0 f10122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PackageInfo f10123e;

    public x(Context context, BrazeConfigurationProvider brazeConfigurationProvider) {
        context.getClass();
        brazeConfigurationProvider.getClass();
        this.f10119a = context;
        this.f10120b = brazeConfigurationProvider;
        PackageInfo packageInfoJ = j();
        this.f10121c = packageInfoJ != null ? packageInfoJ.versionName : null;
        this.f10122d = new com.braze.storage.x0(context);
    }

    public static final String a(String str) {
        return w.a0.p("Unable to inspect package [", str, "]");
    }

    public static final String e() {
        return "Failed to read notifications enabled state from NotificationManagerCompat.";
    }

    public static final String g() {
        return "Failed to collect background restriction information from Activity Manager";
    }

    public static final String i() {
        return "Caught exception while reading the phone carrier name.";
    }

    public final com.braze.models.outgoing.h b() {
        BrazeConfigurationProvider brazeConfigurationProvider = this.f10120b;
        brazeConfigurationProvider.getClass();
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        String strH = h();
        String str = Build.BRAND;
        if (str == null || StringsKt.H(str)) {
            str = null;
        }
        String str2 = Build.MODEL;
        Locale locale = Locale.getDefault();
        locale.getClass();
        locale.getClass();
        String string = locale.toString();
        string.getClass();
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        return new com.braze.models.outgoing.h(brazeConfigurationProvider, strValueOf, strH, str, str2, string, timeZone.getID(), Boolean.valueOf(d()), Boolean.valueOf(f()), this.f10122d.readString(DataStoreKey.GOOGLE_ADVERTISING_ID, null), this.f10122d.readBoolean(DataStoreKey.AD_TRACKING_ENABLED, null));
    }

    public final String c() {
        PackageInfo packageInfoJ = j();
        if (packageInfoJ == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.r(18), 7, (Object) null);
            return null;
        }
        int i11 = Build.VERSION.SDK_INT;
        long longVersionCode = (i11 < 28 && i11 < 28) ? packageInfoJ.versionCode : packageInfoJ.getLongVersionCode();
        return longVersionCode + ".0.0.0";
    }

    public final boolean d() {
        Object systemService = this.f10119a.getSystemService("notification");
        systemService.getClass();
        return ((NotificationManager) systemService).areNotificationsEnabled();
    }

    public final boolean f() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            Object systemService = this.f10119a.getSystemService("activity");
            systemService.getClass();
            return ((ActivityManager) systemService).isBackgroundRestricted();
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new zv.r(17), 4, (Object) null);
            return false;
        }
    }

    public final String h() {
        try {
            Object systemService = this.f10119a.getSystemService("phone");
            systemService.getClass();
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            if (networkOperatorName != null) {
                return StringsKt.e0(networkOperatorName).toString();
            }
            return null;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new zv.r(16), 4, (Object) null);
            return null;
        }
    }

    public final PackageInfo j() {
        PackageInfo packageInfo = this.f10123e;
        if (packageInfo != null) {
            return packageInfo;
        }
        String packageName = this.f10119a.getPackageName();
        try {
            int i11 = Build.VERSION.SDK_INT;
            Context context = this.f10119a;
            PackageInfo packageInfo2 = i11 >= 33 ? context.getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : context.getPackageManager().getPackageInfo(packageName, 0);
            this.f10123e = packageInfo2;
            return packageInfo2;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new xv.a(packageName, 23), 4, (Object) null);
            ApplicationInfo applicationInfo = this.f10119a.getApplicationInfo();
            int i12 = Build.VERSION.SDK_INT;
            Context context2 = this.f10119a;
            PackageInfo packageArchiveInfo = i12 >= 33 ? context2.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, PackageManager.PackageInfoFlags.of(0L)) : context2.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, 0);
            this.f10123e = packageArchiveInfo;
            return packageArchiveInfo;
        }
    }

    public static final String a() {
        return "App version code could not be read. Returning null";
    }
}
