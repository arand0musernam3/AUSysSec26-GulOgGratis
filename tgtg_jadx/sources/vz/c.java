package vz;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f42623a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f42624b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f42625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f42626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f42627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f42628f;

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean d(Context context, int i11) {
        if (g(context, "com.google.android.gms", i11)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                pz.f fVarA = pz.f.a(context);
                fVarA.getClass();
                if (packageInfo != null) {
                    if (!pz.f.c(packageInfo, false)) {
                        if (pz.f.c(packageInfo, true)) {
                            if (!pz.e.a(fVarA.f35661a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f42625c == null) {
            f42625c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f42625c.booleanValue();
        if (f42626d == null) {
            f42626d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f42626d.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static List f(Object... objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]) : Collections.EMPTY_LIST;
    }

    public static boolean g(Context context, String str, int i11) {
        ky.b bVarA = xz.c.a(context);
        bVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) bVarA.f26684a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i11, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
