package ax;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f4998a = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f4999b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f5000c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r0 f5001d = new r0(true, "com.facebook.sdk.AutoInitEnabled");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r0 f5002e = new r0(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r0 f5003f = new r0(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r0 f5004g = new r0(false, "auto_event_setup_enabled");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r0 f5005h = new r0(true, "com.facebook.sdk.MonitorEnabled");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static SharedPreferences f5006i;

    public static final boolean b() {
        if (yx.a.f46339a.contains(s0.class)) {
            return false;
        }
        try {
            f4998a.e();
            return f5003f.a();
        } catch (Throwable th2) {
            yx.a.a(s0.class, th2);
            return false;
        }
    }

    public static final boolean c() {
        if (yx.a.f46339a.contains(s0.class)) {
            return false;
        }
        try {
            s0 s0Var = f4998a;
            s0Var.e();
            return s0Var.a();
        } catch (Throwable th2) {
            yx.a.a(s0.class, th2);
            return false;
        }
    }

    public static final Boolean j() {
        String str = "";
        if (!yx.a.f46339a.contains(s0.class)) {
            try {
                f4998a.l();
                try {
                    SharedPreferences sharedPreferences = f5006i;
                    if (sharedPreferences == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                        sharedPreferences = null;
                    }
                    String string = sharedPreferences.getString((String) f5002e.f4994c, "");
                    if (string != null) {
                        str = string;
                    }
                    if (str.length() > 0) {
                        return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                    }
                } catch (JSONException unused) {
                    a0 a0Var = a0.f4849a;
                }
            } catch (Throwable th2) {
                yx.a.a(s0.class, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e A[PHI: r0
      0x003e: PHI (r0v8 java.lang.Boolean) = (r0v6 java.lang.Boolean), (r0v7 java.lang.Boolean) binds: [B:21:0x003c, B:24:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r5 = this;
            java.util.Set r0 = yx.a.f46339a
            boolean r1 = r0.contains(r5)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.HashMap r1 = tx.c0.c()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L5b
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L17
            goto L5b
        L17:
            java.lang.String r3 = "auto_log_app_events_enabled"
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "auto_log_app_events_default"
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            boolean r0 = r3.booleanValue()     // Catch: java.lang.Throwable -> L2e
            return r0
        L2e:
            r0 = move-exception
            goto L62
        L30:
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            if (r0 == 0) goto L38
            goto L4b
        L38:
            java.lang.Boolean r0 = j()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L40
        L3e:
            r3 = r0
            goto L4b
        L40:
            java.lang.Boolean r0 = r5.f()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L4b
            goto L3e
        L47:
            r0 = move-exception
            yx.a.a(r5, r0)     // Catch: java.lang.Throwable -> L2e
        L4b:
            if (r3 == 0) goto L52
            boolean r0 = r3.booleanValue()     // Catch: java.lang.Throwable -> L2e
            return r0
        L52:
            if (r1 == 0) goto L59
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L2e
            return r0
        L59:
            r0 = 1
            return r0
        L5b:
            ax.r0 r0 = ax.s0.f5002e     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L2e
            return r0
        L62:
            yx.a.a(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.s0.a():boolean");
    }

    public final void d() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            r0 r0Var = f5004g;
            k(r0Var);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (((Boolean) r0Var.f4995d) == null || jCurrentTimeMillis - r0Var.f4992a >= 604800000) {
                r0Var.f4995d = null;
                r0Var.f4992a = 0L;
                if (f5000c.compareAndSet(false, true)) {
                    a0.c().execute(new Runnable() { // from class: ax.q0
                        @Override // java.lang.Runnable
                        public final void run() {
                            tx.z zVarK;
                            long j9 = jCurrentTimeMillis;
                            if (yx.a.f46339a.contains(s0.class)) {
                                return;
                            }
                            try {
                                if (s0.f5003f.a() && (zVarK = tx.c0.k(a0.b(), false)) != null && zVarK.f40591i) {
                                    tx.c cVarA = tx.j.a(a0.a());
                                    String strA = (cVarA == null || cVarA.a() == null) ? null : cVarA.a();
                                    if (strA != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("advertiser_id", strA);
                                        bundle.putString("fields", "auto_event_setup_enabled");
                                        String str = h0.f4915j;
                                        h0 h0VarY = qb.e.y(null, "app", null);
                                        h0VarY.f4920d = bundle;
                                        JSONObject jSONObject = h0VarY.c().f4942b;
                                        if (jSONObject != null) {
                                            r0 r0Var2 = s0.f5004g;
                                            r0Var2.f4995d = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                            r0Var2.f4992a = j9;
                                            s0.f4998a.m(r0Var2);
                                        }
                                    }
                                }
                                s0.f5000c.set(false);
                            } catch (Throwable th2) {
                                yx.a.a(s0.class, th2);
                            }
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void e() {
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (a0.f4864q.get()) {
                if (f4999b.compareAndSet(false, true)) {
                    SharedPreferences sharedPreferences = a0.a().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                    sharedPreferences.getClass();
                    f5006i = sharedPreferences;
                    r0[] r0VarArr = {f5002e, f5003f, f5001d};
                    if (!set.contains(this)) {
                        for (int i11 = 0; i11 < 3; i11++) {
                            try {
                                r0 r0Var = r0VarArr[i11];
                                if (r0Var == f5004g) {
                                    d();
                                } else if (((Boolean) r0Var.f4995d) == null) {
                                    k(r0Var);
                                    if (((Boolean) r0Var.f4995d) == null) {
                                        g(r0Var);
                                    }
                                } else {
                                    m(r0Var);
                                }
                            } catch (Throwable th2) {
                                yx.a.a(this, th2);
                                d();
                                i();
                                h();
                            }
                        }
                    }
                    d();
                    i();
                    h();
                }
            }
        } catch (Throwable th3) {
            yx.a.a(this, th3);
        }
    }

    public final Boolean f() {
        if (!yx.a.f46339a.contains(this)) {
            try {
                l();
                try {
                    Context contextA = a0.a();
                    ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                    applicationInfo.getClass();
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle != null) {
                        r0 r0Var = f5002e;
                        if (bundle.containsKey((String) r0Var.f4994c)) {
                            return Boolean.valueOf(applicationInfo.metaData.getBoolean((String) r0Var.f4994c));
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    a0 a0Var = a0.f4849a;
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final void g(r0 r0Var) {
        String str = (String) r0Var.f4994c;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            l();
            try {
                Context contextA = a0.a();
                ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                applicationInfo.getClass();
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(str)) {
                    return;
                }
                r0Var.f4995d = Boolean.valueOf(applicationInfo.metaData.getBoolean(str, r0Var.f4993b));
                return;
            } catch (PackageManager.NameNotFoundException unused) {
                a0 a0Var = a0.f4849a;
                return;
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
        yx.a.a(this, th2);
    }

    public final void h() {
        int i11;
        int i12;
        ApplicationInfo applicationInfo;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            if (f4999b.get() && a0.f4864q.get()) {
                Context contextA = a0.a();
                int i13 = (f5001d.a() ? 1 : 0) | ((f5002e.a() ? 1 : 0) << 1) | ((f5003f.a() ? 1 : 0) << 2) | ((f5005h.a() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = f5006i;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                int i14 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i14 != i13) {
                    SharedPreferences sharedPreferences2 = f5006i;
                    if (sharedPreferences2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                        sharedPreferences2 = null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i13).apply();
                    try {
                        applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                        applicationInfo.getClass();
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if (applicationInfo.metaData != null) {
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                        boolean[] zArr = {true, true, true, true};
                        i11 = 0;
                        i12 = 0;
                        for (int i15 = 0; i15 < 4; i15++) {
                            try {
                                i12 |= (applicationInfo.metaData.containsKey(strArr[i15]) ? 1 : 0) << i15;
                                i11 |= (applicationInfo.metaData.getBoolean(strArr[i15], zArr[i15]) ? 1 : 0) << i15;
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                    bx.m mVar = new bx.m(contextA, (String) null);
                    Bundle bundle = new Bundle();
                    bundle.putInt("usage", i12);
                    bundle.putInt("initial", i11);
                    bundle.putInt("previous", i14);
                    bundle.putInt("current", i13);
                    if (((bundle.getInt("previous") & 2) != 0) || c()) {
                        mVar.g(bundle, "fb_sdk_settings_changed");
                    }
                }
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void i() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            Context contextA = a0.a();
            ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
            applicationInfo.getClass();
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w("ax.s0", "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (b()) {
                    return;
                }
                Log.w("ax.s0", "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void k(r0 r0Var) {
        String str = "";
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            l();
            try {
                SharedPreferences sharedPreferences = f5006i;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString((String) r0Var.f4994c, "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    r0Var.f4995d = Boolean.valueOf(jSONObject.getBoolean("value"));
                    r0Var.f4992a = jSONObject.getLong("last_timestamp");
                    return;
                }
                return;
            } catch (JSONException unused) {
                a0 a0Var = a0.f4849a;
                return;
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
        yx.a.a(this, th2);
    }

    public final void l() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            if (f4999b.get()) {
            } else {
                throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void m(r0 r0Var) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            l();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", (Boolean) r0Var.f4995d);
                jSONObject.put("last_timestamp", r0Var.f4992a);
                SharedPreferences sharedPreferences = f5006i;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userSettingPref");
                    sharedPreferences = null;
                }
                sharedPreferences.edit().putString((String) r0Var.f4994c, jSONObject.toString()).apply();
                h();
            } catch (Exception unused) {
                a0 a0Var = a0.f4849a;
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
