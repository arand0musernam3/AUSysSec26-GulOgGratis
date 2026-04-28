package lx;

import android.content.SharedPreferences;
import ax.a0;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.x0;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f28409a = new o();

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:13:0x001a, B:11:0x0014, B:8:0x0010), top: B:91:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static lx.k c(android.content.Context r20) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.o.c(android.content.Context):lx.k");
    }

    public static r d() {
        Class clsE = u.E("com.android.billingclient.api.SkuDetailsParams");
        Class clsE2 = u.E("com.android.billingclient.api.SkuDetailsParams$Builder");
        if (clsE == null || clsE2 == null) {
            return null;
        }
        Method methodG = u.G(clsE, "newBuilder", new Class[0]);
        Method methodG2 = u.G(clsE2, "setType", String.class);
        Method methodG3 = u.G(clsE2, "setSkusList", List.class);
        Method methodG4 = u.G(clsE2, "build", new Class[0]);
        if (methodG == null || methodG2 == null || methodG3 == null || methodG4 == null) {
            return null;
        }
        r rVar = new r(clsE, clsE2, methodG, methodG2, methodG3, methodG4);
        if (!yx.a.f46339a.contains(r.class)) {
            try {
                r.f28416h = rVar;
            } catch (Throwable th2) {
                yx.a.a(r.class, th2);
            }
        }
        if (yx.a.f46339a.contains(r.class)) {
            return null;
        }
        try {
            return r.f28416h;
        } catch (Throwable th3) {
            yx.a.a(r.class, th3);
            return null;
        }
    }

    public static final void e() {
        if (yx.a.f46339a.contains(o.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = a0.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = a0.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
            a0.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0).edit().clear().apply();
        } catch (Throwable th2) {
            yx.a.a(o.class, th2);
        }
    }

    public static final void f(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, boolean z11, String str, s sVar, boolean z12) {
        Set set = yx.a.f46339a;
        if (set.contains(o.class)) {
            return;
        }
        try {
            concurrentHashMap.getClass();
            concurrentHashMap2.getClass();
            str.getClass();
            o oVar = f28409a;
            LinkedHashMap linkedHashMapB = oVar.b(oVar.a(concurrentHashMap, z11), concurrentHashMap2, str);
            if (set.contains(oVar)) {
                return;
            }
            try {
                for (Map.Entry entry : linkedHashMapB.entrySet()) {
                    nx.j.d((String) entry.getKey(), (String) entry.getValue(), z11, sVar, z12);
                }
            } catch (Throwable th2) {
                yx.a.a(oVar, th2);
            }
        } catch (Throwable th3) {
            yx.a.a(o.class, th3);
        }
    }

    public static ConcurrentHashMap g() {
        if (yx.a.f46339a.contains(k.class)) {
            return null;
        }
        try {
            return k.f28360o;
        } catch (Throwable th2) {
            yx.a.a(k.class, th2);
            return null;
        }
    }

    public static ConcurrentHashMap h() {
        if (yx.a.f46339a.contains(k.class)) {
            return null;
        }
        try {
            return k.f28362q;
        } catch (Throwable th2) {
            yx.a.a(k.class, th2);
            return null;
        }
    }

    public static ConcurrentHashMap i() {
        if (yx.a.f46339a.contains(k.class)) {
            return null;
        }
        try {
            return k.f28361p;
        } catch (Throwable th2) {
            yx.a.a(k.class, th2);
            return null;
        }
    }

    public static final void j() {
        if (yx.a.f46339a.contains(o.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = a0.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long jMax = Math.max(Math.max(sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 0L), sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 0L)), 1736528400000L);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            SharedPreferences sharedPreferences2 = a0.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            if (sharedPreferences2.contains("PURCHASE_DETAILS_SET")) {
                Collection stringSet = sharedPreferences2.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                copyOnWriteArraySet.addAll(stringSet == null ? new HashSet() : stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        long j9 = Long.parseLong((String) StringsKt__StringsKt.split$default((String) it.next(), new String[]{";"}, false, 2, 2, null).get(1)) * 1000;
                        if (Math.abs(String.valueOf(j9).length() - 13) < Math.log10(1000.0d)) {
                            jMax = Math.max(jMax, j9);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
            e();
        } catch (Throwable th2) {
            yx.a.a(o.class, th2);
        }
    }

    public static final void k() {
        if (yx.a.f46339a.contains(o.class)) {
            return;
        }
        try {
            try {
                a0.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).edit().putBoolean("APP_HAS_BEEN_LAUNCHED_KEY", true).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            yx.a.a(o.class, th2);
        }
    }

    public static final void l() {
        if (yx.a.f46339a.contains(o.class)) {
            return;
        }
        try {
            k();
            try {
                SharedPreferences sharedPreferences = a0.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jCurrentTimeMillis).apply();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jCurrentTimeMillis).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            yx.a.a(o.class, th2);
        }
    }

    public HashMap a(Map map, boolean z11) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            map.getClass();
            SharedPreferences sharedPreferences = a0.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long j9 = z11 ? sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 1736528400000L) : sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 1736528400000L);
            long jMax = 0;
            for (Map.Entry entry : x0.k(map).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j11 = jSONObject.getLong("purchaseTime");
                        if (j11 <= j9) {
                            map.remove(str);
                        }
                        jMax = Math.max(jMax, j11);
                    }
                } catch (Exception unused) {
                }
            }
            if (jMax >= j9) {
                if (z11) {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
                } else {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
                }
            }
            return new HashMap(map);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public LinkedHashMap b(HashMap map, Map map2, String str) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            map.getClass();
            map2.getClass();
            str.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) map2.get(str2);
                try {
                    jSONObject.put("packageName", str);
                    if (jSONObject2 != null) {
                        String string = jSONObject.toString();
                        string.getClass();
                        String string2 = jSONObject2.toString();
                        string2.getClass();
                        linkedHashMap.put(string, string2);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }
}
