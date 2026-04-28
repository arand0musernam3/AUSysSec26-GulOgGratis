package tx;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.braze.h2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w2.l1;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f40497a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f40498b = kotlin.collections.d0.h("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", l1.f(new StringBuilder("app_events_config.os_version("), Build.VERSION.RELEASE, ')'));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f40499c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f40500d = new AtomicReference(b0.NOT_LOADED);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f40501e = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f40502f;

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f40498b);
        bundle.putString("fields", TextUtils.join(MessageLogView.COMMA_SEPARATOR, arrayList));
        String str = ax.h0.f4915j;
        ax.h0 h0VarY = qb.e.y(null, "app", null);
        h0VarY.f4925i = true;
        h0VarY.f4920d = bundle;
        JSONObject jSONObject = h0VarY.c().f4944d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final z b(String str) {
        return (z) f40499c.get(str);
    }

    public static final HashMap c() {
        JSONObject jSONObject;
        Context contextA = ax.a0.a();
        String strB = ax.a0.b();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = contextA.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strB}, 1)), null);
        if (!n0.x(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    ax.a0 a0Var = ax.a0.f4849a;
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    return h(jSONObject);
                }
            } else {
                h2.b("Required value was null.");
            }
        }
        return null;
    }

    public static final void d() {
        Context contextA = ax.a0.a();
        String strB = ax.a0.b();
        boolean zX = n0.x(strB);
        c0 c0Var = f40497a;
        AtomicReference atomicReference = f40500d;
        if (zX) {
            atomicReference.set(b0.ERROR);
            c0Var.j();
            return;
        }
        if (f40499c.containsKey(strB)) {
            atomicReference.set(b0.SUCCESS);
            c0Var.j();
            return;
        }
        b0 b0Var = b0.NOT_LOADED;
        b0 b0Var2 = b0.LOADING;
        while (true) {
            if (atomicReference.compareAndSet(b0Var, b0Var2)) {
                break;
            }
            if (atomicReference.get() != b0Var) {
                b0 b0Var3 = b0.ERROR;
                b0 b0Var4 = b0.LOADING;
                while (!atomicReference.compareAndSet(b0Var3, b0Var4)) {
                    if (atomicReference.get() != b0Var3) {
                        c0Var.j();
                        return;
                    }
                }
            }
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        ax.a0.c().execute(new x(contextA, String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strB}, 1)), strB));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static tx.z e(java.lang.String r46, org.json.JSONObject r47) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.c0.e(java.lang.String, org.json.JSONObject):tx.z");
    }

    public static ArrayList f(String str, JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                if (Intrinsics.areEqual(jSONObject2.getString("key"), "prod_keys")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                    int length2 = jSONArray2.length();
                    for (int i12 = 0; i12 < length2; i12++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i12);
                        if (Intrinsics.areEqual(jSONObject3.getString("key"), str)) {
                            JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                            ArrayList arrayList = new ArrayList();
                            int length3 = jSONArray3.length();
                            for (int i13 = 0; i13 < length3; i13++) {
                                arrayList.add(jSONArray3.getJSONObject(i13).getString("value"));
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(arrayList);
                            return arrayList2;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static ArrayList g(JSONObject jSONObject, boolean z11) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
            String string = jSONObject2.getString("key");
            if ((!Intrinsics.areEqual(string, "prod_keys") || !z11) && (!Intrinsics.areEqual(string, "test_keys") || z11)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i12);
                    String string2 = jSONObject3.getString("key");
                    if (!Intrinsics.areEqual(string2, "_valueToSum") && !Intrinsics.areEqual(string2, "fb_currency")) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList2 = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i13 = 0; i13 < length3; i13++) {
                            try {
                                arrayList2.add(jSONArray3.getJSONObject(i13).getString("value"));
                            } catch (Exception unused2) {
                                return null;
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new Pair(string2, arrayList2));
                    }
                }
            }
        }
        return arrayList;
    }

    public static HashMap h(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                map.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException unused) {
                ax.a0 a0Var = ax.a0.f4849a;
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                map.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException unused2) {
                ax.a0 a0Var2 = ax.a0.f4849a;
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public static JSONArray i(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    public static final z k(String str, boolean z11) {
        str.getClass();
        if (!z11) {
            ConcurrentHashMap concurrentHashMap = f40499c;
            if (concurrentHashMap.containsKey(str)) {
                return (z) concurrentHashMap.get(str);
            }
        }
        z zVarE = e(str, a());
        if (Intrinsics.areEqual(str, ax.a0.b())) {
            f40500d.set(b0.SUCCESS);
            f40497a.j();
        }
        return zVarE;
    }

    public final synchronized void j() {
        b0 b0Var = (b0) f40500d.get();
        if (b0.NOT_LOADED != b0Var && b0.LOADING != b0Var) {
            z zVar = (z) f40499c.get(ax.a0.b());
            Handler handler = new Handler(Looper.getMainLooper());
            if (b0.ERROR == b0Var) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = f40501e;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    } else {
                        handler.post(new a0((bx.n) concurrentLinkedQueue.poll()));
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = f40501e;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    } else {
                        handler.post(new a0((bx.n) concurrentLinkedQueue2.poll(), zVar));
                    }
                }
            }
        }
    }
}
