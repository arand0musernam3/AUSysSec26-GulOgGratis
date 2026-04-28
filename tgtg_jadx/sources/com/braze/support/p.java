package com.braze.support;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.braze.support.BrazeLogger;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f10768a = new p();

    public static final boolean a(Context context) {
        context.getClass();
        int iB = GoogleApiAvailability.f11044d.b(context, com.google.android.gms.common.a.f11047a);
        if (iB == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f10768a, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mw.e(22), 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f10768a, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.models.inappmessage.l(iB, 18), 7, (Object) null);
        return false;
    }

    public static final boolean b(Context context) {
        context.getClass();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.getPackageManager().getPackageInfo("com.google.android.gsf", PackageManager.PackageInfoFlags.of(0L));
                return true;
            }
            context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f10768a, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new mw.e(23), 4, (Object) null);
            return false;
        }
    }

    public static final String c() {
        return "Unexpected exception while checking for com.google.android.gsf";
    }

    public static final String a() {
        return "Google Play Services Availability API not found. Google Play Services not enabled.";
    }

    public static final String a(int i11) {
        return j4.s.f(i11, "Google Play Services is unavailable. Connection result: ");
    }

    public static final String b() {
        return "Google Play Services is available.";
    }
}
