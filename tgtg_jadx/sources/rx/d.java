package rx;

import android.app.Activity;
import ax.a0;
import ex.i;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import ox.g;
import tx.c0;
import tx.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f38254a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f38255b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f38256c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f38257d = new LinkedHashSet();

    public static final synchronized void a() {
        if (yx.a.f46339a.contains(d.class)) {
            return;
        }
        try {
            a0.c().execute(new bx.c(21));
        } catch (Throwable th2) {
            yx.a.a(d.class, th2);
        }
    }

    public static final void d(Activity activity) {
        Set set = yx.a.f46339a;
        if (set.contains(d.class)) {
            return;
        }
        try {
            if (f38255b.get()) {
                boolean z11 = false;
                if (!set.contains(a.class)) {
                    try {
                        z11 = a.f38247f;
                    } catch (Throwable th2) {
                        yx.a.a(a.class, th2);
                    }
                }
                if (z11) {
                    if (f38256c.isEmpty()) {
                        if (!f38257d.isEmpty()) {
                        }
                    }
                    HashMap map = e.f38258d;
                    i.J(activity);
                    return;
                }
            }
            HashMap map2 = e.f38258d;
            i.K(activity);
        } catch (Exception unused) {
        } catch (Throwable th3) {
            yx.a.a(d.class, th3);
        }
    }

    public final void b() {
        String str;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            z zVarK = c0.k(a0.b(), false);
            if (zVarK != null && (str = zVarK.f40594m) != null) {
                c(str);
                if (f38256c.isEmpty() && f38257d.isEmpty()) {
                    return;
                }
                File fileD = g.d(ox.d.MTML_APP_EVENT_PREDICTION);
                if (fileD == null) {
                    return;
                }
                a.f(fileD);
                WeakReference weakReference = nx.c.l;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if (activity != null) {
                    d(activity);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void c(String str) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    LinkedHashSet linkedHashSet = f38256c;
                    String string = jSONArray.getString(i11);
                    string.getClass();
                    linkedHashSet.add(string);
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                int length2 = jSONArray2.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    LinkedHashSet linkedHashSet2 = f38257d;
                    String string2 = jSONArray2.getString(i12);
                    string2.getClass();
                    linkedHashSet2.add(string2);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
