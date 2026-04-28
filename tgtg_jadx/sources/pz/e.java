package pz;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f35656b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f35657c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f35659e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f35655a = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f35658d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f35657c) {
                try {
                    PackageInfo packageInfoD = xz.c.a(context).d(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                    f.a(context);
                    if (packageInfoD == null || f.c(packageInfoD, false) || !f.c(packageInfoD, true)) {
                        f35656b = false;
                    } else {
                        f35656b = true;
                    }
                    f35657c = true;
                } catch (PackageManager.NameNotFoundException e5) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e5);
                    f35657c = true;
                }
            }
            return f35656b || !"user".equals(Build.TYPE);
        } catch (Throwable th2) {
            f35657c = true;
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pz.e.b(android.content.Context, int):int");
    }

    public static boolean c(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
