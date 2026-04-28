package gx;

import ax.a0;
import bx.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import tx.c0;
import tx.n0;
import tx.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f20912b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f20911a = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f20913c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f20914d = new HashSet();

    public static final void b(ArrayList arrayList) {
        if (yx.a.f46339a.contains(b.class)) {
            return;
        }
        try {
            arrayList.getClass();
            if (f20912b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (f20914d.contains(((g) it.next()).f6722e)) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th2) {
            yx.a.a(b.class, th2);
        }
    }

    public final synchronized void a() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            z zVarK = c0.k(a0.b(), false);
            if (zVarK == null) {
                return;
            }
            String str = zVarK.f40595n;
            if (str != null && str.length() > 0) {
                JSONObject jSONObject = new JSONObject(str);
                f20913c.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            HashSet hashSet = f20914d;
                            next.getClass();
                            hashSet.add(next);
                        } else {
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            next.getClass();
                            ArrayList arrayList = new ArrayList();
                            a aVar = new a();
                            aVar.f20909a = next;
                            aVar.f20910b = arrayList;
                            if (jSONArrayOptJSONArray != null) {
                                aVar.f20910b = n0.f(jSONArrayOptJSONArray);
                            }
                            f20913c.add(aVar);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
