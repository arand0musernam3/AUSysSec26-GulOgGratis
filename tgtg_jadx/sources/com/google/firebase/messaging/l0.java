package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f12845a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c10.a f12846b;

    public static void a(Context context) {
        if (f12846b == null) {
            c10.a aVar = new c10.a(context);
            f12846b = aVar;
            synchronized (aVar.f6925a) {
                aVar.f6931g = true;
            }
        }
    }

    public static byte[] b(ArrayDeque arrayDeque, int i11) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i11) {
            return bArr;
        }
        int length = i11 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i11);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i11 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static void c(Intent intent) {
        synchronized (f12845a) {
            try {
                if (f12846b != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f12846b.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            p30.g.c();
            p30.g gVarC = p30.g.c();
            gVarC.a();
            Context context = gVarC.f34222a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static SharedPreferences e(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9 A[PHI: r5
      0x00d9: PHI (r5v21 java.lang.String) = (r5v20 java.lang.String), (r5v41 java.lang.String) binds: [B:44:0x00c1, B:48:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(android.content.Intent r26) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.l0.f(android.content.Intent):void");
    }

    public static void g(Bundle bundle, String str) {
        try {
            p30.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString(AnnotatedPrivateKey.LABEL, string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e5) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e5);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String str2 = a50.c.y(bundle) ? "display" : Bayeux.KEY_DATA;
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            r30.a aVar = (r30.a) p30.g.c().b(r30.a.class);
            if (aVar != null) {
                ((r30.b) aVar).a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void h(Context context, q qVar, boolean z11) {
        d10.o oVarC;
        int i11;
        if (Build.VERSION.SDK_INT >= 29) {
            SharedPreferences sharedPreferencesE = e(context);
            if (sharedPreferencesE.contains("proxy_retention") && sharedPreferencesE.getBoolean("proxy_retention", false) == z11) {
                return;
            }
            oz.b bVar = qVar.f12869c;
            if (bVar.f33805c.w() >= 241100000) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("proxy_retention", z11);
                oz.o oVarD = oz.o.d(bVar.f33804b);
                synchronized (oVarD) {
                    i11 = oVarD.f33844a;
                    oVarD.f33844a = i11 + 1;
                }
                oVarC = oVarD.e(new oz.n(i11, 4, bundle, 0));
            } else {
                oVarC = Tasks.c(new IOException("SERVICE_NOT_AVAILABLE"));
            }
            oVarC.h(new l0.b(0), new x(context, z11));
        }
    }

    public static boolean i(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static ComponentName j(Context context, Intent intent) {
        synchronized (f12845a) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f12846b.a();
                }
                return componentNameStartService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static byte[] k(d dVar) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i11 = 0;
        while (i11 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i11);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i12 = 0;
            while (i12 < iMin2) {
                int i13 = dVar.read(bArr, i12, iMin2 - i12);
                if (i13 == -1) {
                    return b(arrayDeque, i11);
                }
                i12 += i13;
                i11 += i13;
            }
            long j9 = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            iMin = j9 > 2147483647L ? Integer.MAX_VALUE : j9 < -2147483648L ? Integer.MIN_VALUE : (int) j9;
        }
        if (dVar.read() == -1) {
            return b(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
