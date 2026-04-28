package tx;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookSdkNotInitializedException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f40523a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f40524b = 0;

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137 A[Catch: all -> 0x00e6, Exception -> 0x00ea, TryCatch #8 {Exception -> 0x00ea, all -> 0x00e6, blocks: (B:40:0x00c5, B:42:0x00d3, B:44:0x00d7, B:51:0x00ef, B:53:0x0109, B:55:0x0114, B:62:0x0131, B:64:0x0137, B:67:0x0143, B:69:0x0147, B:70:0x0150, B:58:0x011e, B:60:0x0129, B:92:0x01b3, B:93:0x01ba), top: B:114:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0143 A[Catch: all -> 0x00e6, Exception -> 0x00ea, TryCatch #8 {Exception -> 0x00ea, all -> 0x00e6, blocks: (B:40:0x00c5, B:42:0x00d3, B:44:0x00d7, B:51:0x00ef, B:53:0x0109, B:55:0x0114, B:62:0x0131, B:64:0x0137, B:67:0x0143, B:69:0x0147, B:70:0x0150, B:58:0x011e, B:60:0x0129, B:92:0x01b3, B:93:0x01ba), top: B:114:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147 A[Catch: all -> 0x00e6, Exception -> 0x00ea, TryCatch #8 {Exception -> 0x00ea, all -> 0x00e6, blocks: (B:40:0x00c5, B:42:0x00d3, B:44:0x00d7, B:51:0x00ef, B:53:0x0109, B:55:0x0114, B:62:0x0131, B:64:0x0137, B:67:0x0143, B:69:0x0147, B:70:0x0150, B:58:0x011e, B:60:0x0129, B:92:0x01b3, B:93:0x01ba), top: B:114:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150 A[Catch: all -> 0x00e6, Exception -> 0x00ea, TRY_LEAVE, TryCatch #8 {Exception -> 0x00ea, all -> 0x00e6, blocks: (B:40:0x00c5, B:42:0x00d3, B:44:0x00d7, B:51:0x00ef, B:53:0x0109, B:55:0x0114, B:62:0x0131, B:64:0x0137, B:67:0x0143, B:69:0x0147, B:70:0x0150, B:58:0x011e, B:60:0x0129, B:92:0x01b3, B:93:0x01ba), top: B:114:0x00c5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static tx.c a(android.content.Context r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.j.a(android.content.Context):tx.c");
    }

    public static final String b() {
        if (!yx.a.f46339a.contains(j.class)) {
            try {
                Context contextA = ax.a0.a();
                List<ResolveInfo> listQueryIntentServices = contextA.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                listQueryIntentServices.getClass();
                String[] strArr = f40523a;
                HashSet hashSet = new HashSet(w0.a(3));
                kotlin.collections.y.O(strArr, hashSet);
                Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            } catch (Throwable th2) {
                yx.a.a(j.class, th2);
                return null;
            }
        }
        return null;
    }

    public static final String c() {
        if (yx.a.f46339a.contains(j.class)) {
            return null;
        }
        try {
            return "fbconnect://cct." + ax.a0.a().getPackageName();
        } catch (Throwable th2) {
            yx.a.a(j.class, th2);
            return null;
        }
    }

    public static final String d() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("m.%s", Arrays.copyOf(new Object[]{ax.a0.f4866s}, 1));
    }

    public static final String e() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("m.%s", Arrays.copyOf(new Object[]{ax.a0.f4865r}, 1));
    }

    public static void f(Context context) {
        context.getClass();
        if (d.a() != null) {
            d.a();
            return;
        }
        d dVar = new d(context);
        Set set = yx.a.f46339a;
        if (!set.contains(d.class)) {
            try {
                if (!set.contains(dVar)) {
                    try {
                        d9.c cVarA = d9.c.a((Context) dVar.f40505b);
                        cVarA.getClass();
                        cVarA.b(dVar, new IntentFilter("com.parse.bolts.measurement_event"));
                    } catch (Throwable th2) {
                        yx.a.a(dVar, th2);
                    }
                }
            } catch (Throwable th3) {
                yx.a.a(d.class, th3);
            }
        }
        if (!yx.a.f46339a.contains(d.class)) {
            try {
                d.f40503c = dVar;
            } catch (Throwable th4) {
                yx.a.a(d.class, th4);
            }
        }
        d.a();
    }

    public static final String g(String str) {
        if (yx.a.f46339a.contains(j.class)) {
            return null;
        }
        try {
            return h(ax.a0.a(), str) ? str : h(ax.a0.a(), c()) ? c() : "";
        } catch (Throwable th2) {
            yx.a.a(j.class, th2);
            return null;
        }
    }

    public static final boolean h(Context context, String str) {
        List<ResolveInfo> listQueryIntentActivities;
        context.getClass();
        str.getClass();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities == null) {
            return false;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!Intrinsics.areEqual(activityInfo.name, "com.facebook.CustomTabActivity") || !Intrinsics.areEqual(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z11 = true;
        }
        return z11;
    }

    public static final void i(Context context) {
        ActivityInfo activityInfo;
        context.getClass();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = null;
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null) {
            Log.w("tx.j", "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
    }

    public static boolean j(Context context) {
        Method methodQ = n0.q("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodQ != null) {
            Object objS = n0.s(null, methodQ, context);
            if ((objS instanceof Integer) && Intrinsics.areEqual(objS, (Object) 0)) {
                return true;
            }
        }
        return false;
    }

    public static final void k(String str, String str2) {
        str.getClass();
        if (str.length() > 0) {
            return;
        }
        i4.a.i(w.a0.p("Argument '", str2, "' cannot be empty"));
    }

    public static final void l(ax.j0 j0Var) {
        j0Var.getClass();
        Iterator it = j0Var.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                c50.w.l("Container 'requests' cannot contain null values");
                return;
            }
        }
        if (j0Var.isEmpty()) {
            i4.a.i("Container 'requests' cannot be empty");
        }
    }

    public static final void m(String str, String str2) {
        if (str == null || str.length() <= 0) {
            i4.a.i(w.a0.p("Argument '", str2, "' cannot be null or empty"));
        }
    }

    public static final void n() {
        if (!ax.a0.f4864q.get()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
