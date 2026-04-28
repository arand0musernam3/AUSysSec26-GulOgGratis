package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.os.LocaleListCompat;
import com.app.tgtg.R;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.iana.AEADAlgorithm;
import q1.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1 f11209a = new k1(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Locale f11210b;

    public static String a(Context context, int i11) {
        Resources resources = context.getResources();
        switch (i11) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return f(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return f(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
            case 19:
            default:
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 22);
                sb2.append("Unexpected error code ");
                sb2.append(i11);
                Log.e("GoogleApiAvailability", sb2.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return f(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return f(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String b(Context context, int i11) {
        Resources resources = context.getResources();
        String strD = d(context);
        if (i11 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strD);
        }
        if (i11 == 2) {
            return vz.c.e(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strD);
        }
        if (i11 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strD);
        }
        if (i11 == 5) {
            return e(context, "common_google_play_services_invalid_account_text", strD);
        }
        if (i11 == 7) {
            return e(context, "common_google_play_services_network_error_text", strD);
        }
        if (i11 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strD);
        }
        if (i11 == 20) {
            return e(context, "common_google_play_services_restricted_profile_text", strD);
        }
        switch (i11) {
            case 16:
                return e(context, "common_google_play_services_api_unavailable_text", strD);
            case 17:
                return e(context, "common_google_play_services_sign_in_failed_text", strD);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strD);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strD);
        }
    }

    public static String c(Context context, int i11) {
        Resources resources = context.getResources();
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? resources.getString(android.R.string.ok) : resources.getString(R.string.common_google_play_services_enable_button) : resources.getString(R.string.common_google_play_services_update_button) : resources.getString(R.string.common_google_play_services_install_button);
    }

    public static String d(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = xz.c.a(context).f26684a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String e(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strF = f(context, str);
        if (strF == null) {
            strF = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strF, str2);
    }

    public static String f(Context context, String str) {
        Resources resourcesForApplication;
        k1 k1Var = f11209a;
        synchronized (k1Var) {
            try {
                Locale localeC = LocaleListCompat.i(context.getResources().getConfiguration().getLocales()).c(0);
                if (!localeC.equals(f11210b)) {
                    k1Var.clear();
                    f11210b = localeC;
                }
                String str2 = (String) k1Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = pz.e.f35655a;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        StringBuilder sb2 = new StringBuilder(str.length() + 18);
                        sb2.append("Missing resource: ");
                        sb2.append(str);
                        Log.w("GoogleApiAvailability", sb2.toString());
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            k1Var.put(str, string);
                            return string;
                        }
                        StringBuilder sb3 = new StringBuilder(str.length() + 20);
                        sb3.append("Got empty resource: ");
                        sb3.append(str);
                        Log.w("GoogleApiAvailability", sb3.toString());
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
