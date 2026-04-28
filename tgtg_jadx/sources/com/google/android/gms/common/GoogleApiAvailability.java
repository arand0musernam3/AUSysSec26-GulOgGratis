package com.google.android.gms.common;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.o;
import androidx.core.app.r;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0;
import com.braze.Constants;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.internal.z;
import j4.s;
import pz.c;
import pz.e;
import pz.g;
import pz.h;
import qz.j;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class GoogleApiAvailability extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f11043c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final GoogleApiAvailability f11044d = new GoogleApiAvailability();

    public static AlertDialog d(Activity activity, int i11, z zVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i11 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(w.b(activity, i11));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strC = w.c(activity, i11);
        if (strC != null) {
            if (zVar == null) {
                zVar = null;
            }
            builder.setPositiveButton(strC, zVar);
        }
        String strA = w.a(activity, i11);
        if (strA != null) {
            builder.setTitle(strA);
        }
        Log.w("GoogleApiAvailability", s.f(i11, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof o0) {
                FragmentManager supportFragmentManager = ((o0) activity).getSupportFragmentManager();
                g gVar = new g();
                i0.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                gVar.f35663a = alertDialog;
                if (onCancelListener != null) {
                    gVar.f35664b = onCancelListener;
                }
                gVar.show(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        i0.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f35648a = alertDialog;
        if (onCancelListener != null) {
            cVar.f35649b = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final AlertDialog c(Activity activity, int i11, int i12, GoogleApiActivity googleApiActivity) {
        return d(activity, i11, z.b(activity, super.a(activity, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, i11), i12), googleApiActivity);
    }

    public final void e(Activity activity, j jVar, int i11, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i11, z.c(jVar, super.a(activity, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, i11), 2), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        g(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void f(Context context, int i11, PendingIntent pendingIntent) {
        int i12;
        Log.w("GoogleApiAvailability", k.h(i11, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i11 == 18) {
            new h(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i11 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strF = i11 == 6 ? w.f(context, "common_google_play_services_resolution_required_title") : w.a(context, i11);
        if (strF == null) {
            strF = context.getResources().getString(com.app.tgtg.R.string.common_google_play_services_notification_ticker);
        }
        String strE = (i11 == 6 || i11 == 19) ? w.e(context, "common_google_play_services_resolution_required_text", w.d(context)) : w.b(context, i11);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        i0.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        androidx.core.app.s sVar = new androidx.core.app.s(context, null);
        sVar.f2676n = true;
        sVar.c(16, true);
        sVar.f2668e = androidx.core.app.s.b(strF);
        r rVar = new r();
        rVar.f2661a = androidx.core.app.s.b(strE);
        sVar.e(rVar);
        PackageManager packageManager = context.getPackageManager();
        if (vz.c.f42625c == null) {
            vz.c.f42625c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean zBooleanValue = vz.c.f42625c.booleanValue();
        int i13 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i14 = context.getApplicationInfo().icon;
            if (i14 != 0) {
                i13 = i14;
            }
            sVar.f2687y.icon = i13;
            sVar.f2673j = 2;
            if (vz.c.e(context)) {
                sVar.f2665b.add(new o(IconCompat.d(null, "", 2131231061), resources.getString(com.app.tgtg.R.string.common_open_on_phone), pendingIntent, new Bundle(), null, true, true));
            } else {
                sVar.f2670g = pendingIntent;
            }
        } else {
            sVar.f2687y.icon = R.drawable.stat_sys_warning;
            sVar.f2687y.tickerText = androidx.core.app.s.b(resources.getString(com.app.tgtg.R.string.common_google_play_services_notification_ticker));
            sVar.f2687y.when = System.currentTimeMillis();
            sVar.f2670g = pendingIntent;
            sVar.f2669f = androidx.core.app.s.b(strE);
        }
        synchronized (f11043c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.app.tgtg.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        sVar.f2684v = "com.google.android.gms.availability";
        Notification notificationA = sVar.a();
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            e.f35655a.set(false);
            i12 = 10436;
        } else {
            i12 = 39789;
        }
        notificationManager.notify(i12, notificationA);
    }
}
