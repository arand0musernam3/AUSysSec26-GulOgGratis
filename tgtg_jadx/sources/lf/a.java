package lf;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import ax.f0;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import pz.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f27766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f27767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f27768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f0 f27769k;

    public a(f0 f0Var) {
        String string;
        String str;
        String networkOperatorName;
        String country;
        TelephonyManager telephonyManager;
        String networkCountryIso;
        Context context = (Context) f0Var.f4906c;
        this.f27769k = f0Var;
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        this.f27762d = str2;
        String str3 = Build.BRAND;
        str3.getClass();
        this.f27763e = str3;
        String str4 = Build.MANUFACTURER;
        str4.getClass();
        this.f27764f = str4;
        String str5 = Build.MODEL;
        str5.getClass();
        this.f27765g = str5;
        String language = a().getLanguage();
        language.getClass();
        this.f27767i = language;
        String str6 = null;
        if (!f0Var.f4904a) {
            string = null;
        } else if (Intrinsics.areEqual("Amazon", str4)) {
            ContentResolver contentResolver = context.getContentResolver();
            Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0);
            string = Settings.Secure.getString(contentResolver, "advertising_id");
        } else {
            try {
                Object objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
                Object objInvoke2 = objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(objInvoke, null);
                Boolean bool = objInvoke2 instanceof Boolean ? (Boolean) objInvoke2 : null;
                if (bool != null) {
                    bool.booleanValue();
                }
                Object objInvoke3 = objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
                objInvoke3.getClass();
                string = (String) objInvoke3;
            } catch (ClassNotFoundException unused) {
                b.f27770c.d("Google Play Services SDK not found for advertising id!");
                string = null;
            } catch (InvocationTargetException unused2) {
                b.f27770c.d("Google Play Services not available for advertising id");
                string = null;
            } catch (Exception unused3) {
                b.f27770c.a("Encountered an error connecting to Google Play Services for advertising id");
                string = null;
            }
        }
        this.f27759a = string;
        Context context2 = (Context) this.f27769k.f4906c;
        try {
            PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0);
            packageInfo.getClass();
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException | Exception unused4) {
            str = null;
        }
        this.f27761c = str;
        try {
            Object systemService = ((Context) this.f27769k.f4906c).getSystemService("phone");
            systemService.getClass();
            networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
        } catch (Exception unused5) {
            networkOperatorName = null;
        }
        this.f27766h = networkOperatorName;
        try {
            Object systemService2 = ((Context) this.f27769k.f4906c).getSystemService("phone");
            systemService2.getClass();
            telephonyManager = (TelephonyManager) systemService2;
        } catch (Exception unused6) {
        }
        if (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
            country = null;
        } else {
            Locale locale = Locale.US;
            locale.getClass();
            country = networkCountryIso.toUpperCase(locale);
            country.getClass();
        }
        if (country == null || country.length() == 0) {
            country = a().getCountry();
            country.getClass();
        }
        this.f27760b = country;
        try {
            AtomicBoolean atomicBoolean = e.f35655a;
            Object objInvoke4 = e.class.getMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, (Context) this.f27769k.f4906c);
            Integer num = objInvoke4 instanceof Integer ? (Integer) objInvoke4 : null;
            if (num != null) {
                num.intValue();
            }
        } catch (ClassNotFoundException unused7) {
            b.f27770c.d("Google Play Services Util not found!");
        } catch (IllegalAccessException unused8) {
            b.f27770c.d("Google Play Services not available");
        } catch (NoSuchMethodException unused9) {
            b.f27770c.d("Google Play Services not available");
        } catch (Exception e5) {
            b.f27770c.d("Error when checking for Google Play Services: " + e5);
        } catch (NoClassDefFoundError unused10) {
            b.f27770c.d("Google Play Services Util not found!");
        } catch (InvocationTargetException unused11) {
            b.f27770c.d("Google Play Services not available");
        }
        if (this.f27769k.f4905b) {
            try {
                Object objInvoke5 = Class.forName("com.google.android.gms.appset.AppSet").getMethod("getClient", Context.class).invoke(null, (Context) this.f27769k.f4906c);
                Object objInvoke6 = Tasks.class.getMethod("await", Task.class).invoke(null, objInvoke5.getClass().getMethod("getAppSetIdInfo", null).invoke(objInvoke5, null));
                Object objInvoke7 = objInvoke6.getClass().getMethod("getId", null).invoke(objInvoke6, null);
                objInvoke7.getClass();
                str6 = (String) objInvoke7;
            } catch (ClassNotFoundException unused12) {
                b.f27770c.d("Google Play Services SDK not found for app set id!");
            } catch (InvocationTargetException unused13) {
                b.f27770c.d("Google Play Services not available for app set id");
            } catch (Exception unused14) {
                b.f27770c.a("Encountered an error connecting to Google Play Services for app set id");
            }
        }
        this.f27768j = str6;
    }

    public static Locale a() {
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        locales.getClass();
        Locale locale = locales.isEmpty() ? Locale.getDefault() : locales.get(0);
        locale.getClass();
        return locale;
    }
}
