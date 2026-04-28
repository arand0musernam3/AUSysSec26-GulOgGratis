package mx;

import android.os.Bundle;
import ax.a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import tx.c0;
import tx.n0;
import tx.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f30253b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f30252a = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HashSet f30254c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HashMap f30255d = new HashMap();

    public static final void b(Bundle bundle, String str) {
        if (yx.a.f46339a.contains(h.class)) {
            return;
        }
        try {
            str.getClass();
            if (f30253b && bundle != null) {
                if (!f30254c.isEmpty() || f30255d.containsKey(str)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        HashSet hashSet = (HashSet) f30255d.get(str);
                        for (String str2 : new ArrayList(bundle.keySet())) {
                            h hVar = f30252a;
                            str2.getClass();
                            if (!yx.a.f46339a.contains(hVar)) {
                                try {
                                    if (f30254c.contains(str2) || (hashSet != null && !hashSet.isEmpty() && hashSet.contains(str2))) {
                                        bundle.remove(str2);
                                        jSONArray.put(str2);
                                    }
                                } catch (Throwable th2) {
                                    yx.a.a(hVar, th2);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString("_filteredKey", jSONArray.toString());
                    }
                }
            }
        } catch (Throwable th3) {
            yx.a.a(h.class, th3);
        }
    }

    public final void a() {
        HashSet hashSetE;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            z zVarK = c0.k(a0.b(), false);
            if (zVarK == null) {
                return;
            }
            try {
                f30254c = new HashSet();
                f30255d = new HashMap();
                JSONArray jSONArray = zVarK.f40600s;
                if (jSONArray == null || jSONArray.length() == 0) {
                    return;
                }
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    boolean zHas = jSONObject.has("key");
                    boolean zHas2 = jSONObject.has("value");
                    if (zHas && zHas2) {
                        String string = jSONObject.getString("key");
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        if (jSONArray2 != null && (hashSetE = n0.e(jSONArray2)) != null) {
                            if (string.equals("_MTSDK_Default_")) {
                                f30254c = hashSetE;
                            } else {
                                f30255d.put(string, hashSetE);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
