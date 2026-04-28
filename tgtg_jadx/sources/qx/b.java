package qx;

import android.util.Log;
import ax.a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import tx.c0;
import tx.n0;
import tx.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f37300b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f37299a = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f37301c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CopyOnWriteArraySet f37302d = new CopyOnWriteArraySet();

    public final String a(String str, String str2) {
        try {
            if (!yx.a.f46339a.contains(this)) {
                try {
                    for (a aVar : new ArrayList(f37301c)) {
                        if (aVar != null && Intrinsics.areEqual(str, aVar.f37297a)) {
                            for (String str3 : aVar.f37298b.keySet()) {
                                if (Intrinsics.areEqual(str2, str3)) {
                                    return (String) aVar.f37298b.get(str3);
                                }
                            }
                        }
                    }
                } catch (Exception e5) {
                    Log.w("qx.b", "getMatchedRuleType failed", e5);
                }
            }
            return null;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public final void b() {
        String str;
        CopyOnWriteArraySet copyOnWriteArraySet = f37302d;
        ArrayList arrayList = f37301c;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            z zVarK = c0.k(a0.b(), false);
            if (zVarK != null && (str = zVarK.f40595n) != null && str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                arrayList.clear();
                copyOnWriteArraySet.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        next.getClass();
                        HashMap map = new HashMap();
                        a aVar = new a();
                        aVar.f37297a = next;
                        aVar.f37298b = map;
                        if (jSONObjectOptJSONObject != null) {
                            aVar.f37298b = n0.h(jSONObjectOptJSONObject);
                            arrayList.add(aVar);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            copyOnWriteArraySet.add(next);
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
