package bx;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import ax.a0;
import com.appsflyer.AdRevenueScheme;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import tx.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SharedPreferences f6763b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f6762a = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f6764c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f6765d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f6766e = new ConcurrentHashMap();

    public static final void d(Bundle bundle) {
        if (yx.a.f46339a.contains(z.class)) {
            return;
        }
        try {
            String str = m.f6734c;
            if (m.b() == null) {
                r40.d.t();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = m.b();
            if (scheduledThreadPoolExecutorB == null) {
                throw new IllegalStateException("Required value was null.");
            }
            scheduledThreadPoolExecutorB.execute(new al.u(bundle, 12));
        } catch (Throwable th2) {
            yx.a.a(z.class, th2);
        }
    }

    public static final void e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (yx.a.f46339a.contains(z.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString("em", str);
            }
            if (str2 != null) {
                bundle.putString("fn", str2);
            }
            if (str3 != null) {
                bundle.putString("ln", str3);
            }
            if (str4 != null) {
                bundle.putString("ph", str4);
            }
            if (str5 != null) {
                bundle.putString("db", str5);
            }
            bundle.putString("ge", str6);
            if (str7 != null) {
                bundle.putString("ct", str7);
            }
            if (str8 != null) {
                bundle.putString("st", str8);
            }
            if (str9 != null) {
                bundle.putString("zp", str9);
            }
            if (str10 != null) {
                bundle.putString(AdRevenueScheme.COUNTRY, str10);
            }
            d(bundle);
        } catch (Throwable th2) {
            yx.a.a(z.class, th2);
        }
    }

    public final HashMap a() {
        ConcurrentHashMap concurrentHashMap = f6766e;
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            CopyOnWriteArraySet copyOnWriteArraySet = cx.c.f13461d;
            HashSet hashSet = new HashSet();
            Iterator it = cx.c.a().iterator();
            while (it.hasNext()) {
                hashSet.add(((cx.c) it.next()).b());
            }
            for (String str : concurrentHashMap.keySet()) {
                if (hashSet.contains(str)) {
                    map.put(str, concurrentHashMap.get(str));
                }
            }
            return map;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public final synchronized void b() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f6764c;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(a0.a());
            defaultSharedPreferences.getClass();
            f6763b = defaultSharedPreferences;
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences = f6763b;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                sharedPreferences = null;
            }
            String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            f6765d.putAll(n0.A(string));
            f6766e.putAll(n0.A(string2));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final String c(String str, String str2) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                boolean z12 = Intrinsics.compare((int) str2.charAt(!z11 ? i11 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    }
                    length--;
                } else if (z12) {
                    i11++;
                } else {
                    z11 = true;
                }
            }
            String lowerCase = str2.subSequence(i11, length + 1).toString().toLowerCase();
            lowerCase.getClass();
            if (Intrinsics.areEqual("em", str)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    Log.e("z", "Setting email failure: this is not a valid email address");
                    return "";
                }
            } else {
                if (Intrinsics.areEqual("ph", str)) {
                    return new Regex("[^0-9]").replace(lowerCase, "");
                }
                if (Intrinsics.areEqual("ge", str)) {
                    String strSubstring = lowerCase.length() > 0 ? lowerCase.substring(0, 1) : "";
                    if (!Intrinsics.areEqual("f", strSubstring) && !Intrinsics.areEqual("m", strSubstring)) {
                        Log.e("z", "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return strSubstring;
                }
            }
            return lowerCase;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public final void f(Bundle bundle) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null) {
                    String string = obj.toString();
                    boolean zE = false;
                    if (!yx.a.f46339a.contains(this)) {
                        try {
                            zE = new Regex("[A-Fa-f0-9]{64}").e(string);
                        } catch (Throwable th2) {
                            yx.a.a(this, th2);
                        }
                    }
                    ConcurrentHashMap concurrentHashMap = f6765d;
                    if (zE) {
                        String lowerCase = string.toLowerCase();
                        lowerCase.getClass();
                        concurrentHashMap.put(str, lowerCase);
                    } else {
                        str.getClass();
                        String strH = n0.H(c(str, string));
                        if (strH != null) {
                            concurrentHashMap.put(str, strH);
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            yx.a.a(this, th3);
        }
    }

    public final void g(String str, String str2) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            a0.c().execute(new y(str, str2, 0));
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
