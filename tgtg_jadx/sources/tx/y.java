package tx;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f40577a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f40578b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f40579c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f40580d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Long f40581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile u6.f f40582f;

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        bundle.putString("platform", AnalyticsPlatformParams.channel);
        ax.a0 a0Var = ax.a0.f4849a;
        bundle.putString("sdk_version", "18.2.3");
        bundle.putString("fields", "gatekeepers");
        String str = ax.h0.f4915j;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        ax.h0 h0VarY = qb.e.y(null, String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1)), null);
        h0VarY.f4920d = bundle;
        JSONObject jSONObject = h0VarY.c().f4944d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final boolean b(String str, String str2, boolean z11) {
        HashMap map;
        ConcurrentHashMap concurrentHashMap;
        Boolean bool;
        y yVar = f40577a;
        ArrayList<ux.a> arrayList = null;
        d(null);
        if (yVar.c(str2) == null) {
            map = new HashMap();
        } else {
            u6.f fVar = f40582f;
            if (fVar != null && (concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) fVar.f40820a).get(str2)) != null) {
                arrayList = new ArrayList(concurrentHashMap.size());
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((ux.a) ((Map.Entry) it.next()).getValue());
                }
            }
            if (arrayList != null) {
                map = new HashMap();
                for (ux.a aVar : arrayList) {
                    map.put(aVar.f41566a, Boolean.valueOf(aVar.f41567b));
                }
            } else {
                HashMap map2 = new HashMap();
                JSONObject jSONObjectC = yVar.c(str2);
                if (jSONObjectC == null) {
                    jSONObjectC = new JSONObject();
                }
                Iterator<String> itKeys = jSONObjectC.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    next.getClass();
                    map2.put(next, Boolean.valueOf(jSONObjectC.optBoolean(next)));
                }
                u6.f fVar2 = f40582f;
                if (fVar2 == null) {
                    fVar2 = new u6.f(1);
                }
                ArrayList<ux.a> arrayList2 = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    arrayList2.add(new ux.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                for (ux.a aVar2 : arrayList2) {
                    concurrentHashMap2.put(aVar2.f41566a, aVar2);
                }
                ((ConcurrentHashMap) fVar2.f40820a).put(str2, concurrentHashMap2);
                f40582f = fVar2;
                map = map2;
            }
        }
        return (map.containsKey(str) && (bool = (Boolean) map.get(str)) != null) ? bool.booleanValue() : z11;
    }

    public static final synchronized void d(v vVar) {
        if (vVar != null) {
            try {
                f40579c.add(vVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        String strB = ax.a0.b();
        y yVar = f40577a;
        Long l = f40581e;
        if (l != null && System.currentTimeMillis() - l.longValue() < 3600000 && yVar.c(strB) != null) {
            f();
            return;
        }
        Context contextA = ax.a0.a();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strB}, 1));
        if (contextA == null) {
            return;
        }
        JSONObject jSONObject = null;
        String string = contextA.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
        if (!n0.x(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException unused) {
                ax.a0 a0Var = ax.a0.f4849a;
            }
            if (jSONObject != null) {
                e(strB, jSONObject);
            }
        }
        Executor executorC = ax.a0.c();
        if (f40578b.compareAndSet(false, true)) {
            executorC.execute(new x(strB, contextA, str));
        }
    }

    public static final synchronized JSONObject e(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        try {
            JSONObject jSONObjectC = f40577a.c(str);
            jSONObject2 = jSONObjectC != null ? new JSONObject(jSONObjectC.toString()) : new JSONObject();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(Bayeux.KEY_DATA);
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.optJSONObject(0) : null;
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
            if (jSONArrayOptJSONArray2 == null) {
                jSONArrayOptJSONArray2 = new JSONArray();
            }
            int length = jSONArrayOptJSONArray2.length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i11);
                    jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
                } catch (JSONException unused) {
                    ax.a0 a0Var = ax.a0.f4849a;
                }
            }
            synchronized (f40577a) {
                f40580d.put(str, jSONObject2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject2;
    }

    public static void f() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f40579c;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            v vVar = (v) concurrentLinkedQueue.poll();
            if (vVar != null) {
                handler.post(new m0.l(vVar, 24));
            }
        }
    }

    public final synchronized JSONObject c(String str) {
        return (JSONObject) f40580d.get(str);
    }
}
