package rx;

import android.content.SharedPreferences;
import android.view.View;
import ax.a0;
import fx.h;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tx.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static SharedPreferences f38250c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f38248a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f38249b = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f38251d = new AtomicBoolean(false);

    public static final void a(String str, String str2) {
        if (yx.a.f46339a.contains(b.class)) {
            return;
        }
        try {
            str2.getClass();
            if (!f38251d.get()) {
                f38248a.c();
            }
            LinkedHashMap linkedHashMap = f38249b;
            linkedHashMap.put(str, str2);
            SharedPreferences sharedPreferences = f38250c;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shardPreferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", n0.B(x0.k(linkedHashMap))).apply();
        } catch (Throwable th2) {
            yx.a.a(b.class, th2);
        }
    }

    public static final String b(View view, String str) {
        if (yx.a.f46339a.contains(b.class)) {
            return null;
        }
        try {
            str.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TextBundle.TEXT_ENTRY, str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = h.i(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return n0.H(jSONObject.toString());
        } catch (Throwable th2) {
            yx.a.a(b.class, th2);
            return null;
        }
    }

    public final void c() {
        String str = "";
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f38251d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = a0.a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            sharedPreferences.getClass();
            f38250c = sharedPreferences;
            LinkedHashMap linkedHashMap = f38249b;
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            linkedHashMap.putAll(n0.A(str));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
