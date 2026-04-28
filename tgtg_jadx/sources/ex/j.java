package ex;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import ao.l0;
import ax.a0;
import ax.h0;
import ax.k0;
import ax.m0;
import com.google.firebase.messaging.r;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import tx.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f16545e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f16547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Timer f16548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16549d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f16546a = new Handler(Looper.getMainLooper());

    static {
        String canonicalName = j.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f16545e = canonicalName;
    }

    public j(Activity activity) {
        this.f16547b = new WeakReference(activity);
    }

    public static final String a() {
        if (yx.a.f46339a.contains(j.class)) {
            return null;
        }
        try {
            return f16545e;
        } catch (Throwable th2) {
            yx.a.a(j.class, th2);
            return null;
        }
    }

    public final void b(h0 h0Var, String str) {
        String str2 = f16545e;
        Set set = yx.a.f46339a;
        if (set.contains(this) || h0Var == null) {
            return;
        }
        try {
            k0 k0VarC = h0Var.c();
            try {
                JSONObject jSONObject = k0VarC.f4942b;
                if (jSONObject == null) {
                    Log.e(str2, "Error sending UI component tree to Facebook: " + k0VarC.f4943c);
                    return;
                }
                if (Intrinsics.areEqual("true", jSONObject.optString("success"))) {
                    l50.a aVar = f0.f40508d;
                    l50.a.z(m0.APP_EVENTS, str2, "Successfully send UI component tree to server");
                    this.f16549d = str;
                }
                if (jSONObject.has("is_app_indexing_enabled")) {
                    boolean z11 = jSONObject.getBoolean("is_app_indexing_enabled");
                    if (set.contains(d.class)) {
                        return;
                    }
                    try {
                        d.f16517g.set(z11);
                    } catch (Throwable th2) {
                        yx.a.a(d.class, th2);
                    }
                }
            } catch (JSONException e5) {
                Log.e(str2, "Error decoding server response.", e5);
            }
        } catch (Throwable th3) {
            yx.a.a(this, th3);
        }
    }

    public final void c() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            try {
                a0.c().execute(new r(14, this, new l0(this, 1)));
            } catch (RejectedExecutionException e5) {
                Log.e(f16545e, "Error scheduling indexing job", e5);
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
