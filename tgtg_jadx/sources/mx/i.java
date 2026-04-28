package mx;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;
import tx.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f30257b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f30256a = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f30258c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f30259d = new HashMap();

    public static final void d(Bundle bundle) {
        i iVar = f30256a;
        HashMap map = f30259d;
        if (yx.a.f46339a.contains(i.class)) {
            return;
        }
        try {
            if (f30257b && bundle != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : bundle.keySet()) {
                    String strValueOf = String.valueOf(bundle.get(str));
                    HashMap map2 = f30258c;
                    boolean z11 = false;
                    boolean z12 = map2.get(str) != null;
                    boolean z13 = map.get(str) != null;
                    if (z12 || z13) {
                        Set set = (Set) map2.get(str);
                        if (!yx.a.f46339a.contains(iVar) && set != null) {
                            try {
                                Set set2 = set;
                                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                    Iterator it = set2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (new Regex((String) it.next()).e(strValueOf)) {
                                                z11 = true;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                yx.a.a(iVar, th2);
                            }
                        }
                        boolean zB = iVar.b(strValueOf, (Set) map.get(str));
                        if (!z11 && !zB) {
                            str.getClass();
                            arrayList.add(str);
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    bundle.remove((String) it2.next());
                }
            }
        } catch (Throwable th3) {
            yx.a.a(i.class, th3);
        }
    }

    public final void a(JSONArray jSONArray) {
        HashMap map = f30258c;
        HashMap map2 = f30259d;
        if (yx.a.f46339a.contains(this) || jSONArray == null) {
            return;
        }
        try {
            if (f30257b) {
                return;
            }
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                String string = jSONObject.getString("key");
                if (string != null && string.length() != 0) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        for (int i12 = 0; i12 < length2; i12++) {
                            boolean z11 = jSONArray2.getJSONObject(i12).getBoolean("require_exact_match");
                            HashSet hashSetC = c(jSONArray2.getJSONObject(i12).getJSONArray("potential_matches"));
                            if (z11) {
                                HashSet hashSet = (HashSet) map2.get(string);
                                if (hashSet != null) {
                                    hashSet.addAll(hashSetC);
                                    hashSetC = hashSet;
                                }
                                map2.put(string, hashSetC);
                            } else {
                                HashSet hashSet2 = (HashSet) map.get(string);
                                if (hashSet2 != null) {
                                    hashSet2.addAll(hashSetC);
                                    hashSetC = hashSet2;
                                }
                                map.put(string, hashSetC);
                            }
                        }
                    } catch (Exception unused) {
                        map2.remove(string);
                        map.remove(string);
                    }
                }
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final boolean b(String str, Set set) {
        if (!yx.a.f46339a.contains(this) && set != null) {
            try {
                Set<String> set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (String str2 : set2) {
                        Locale locale = Locale.ROOT;
                        String lowerCase = str2.toLowerCase(locale);
                        lowerCase.getClass();
                        String lowerCase2 = str.toLowerCase(locale);
                        lowerCase2.getClass();
                        if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
            }
        }
        return false;
    }

    public final HashSet c(JSONArray jSONArray) {
        try {
            if (yx.a.f46339a.contains(this)) {
                return null;
            }
            try {
                HashSet hashSetE = n0.e(jSONArray);
                return hashSetE == null ? new HashSet() : hashSetE;
            } catch (Exception unused) {
                return new HashSet();
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }
}
