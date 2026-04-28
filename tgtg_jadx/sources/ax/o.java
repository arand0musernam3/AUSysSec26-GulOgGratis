package ax;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static o f4974e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile o f4976g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9.c f4977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Parcelable f4979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r40.d f4973d = new r40.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n20.f f4975f = new n20.f(9);

    public o(d9.c cVar, p0 p0Var) {
        cVar.getClass();
        this.f4977a = cVar;
        this.f4978b = p0Var;
    }

    public void a(o0 o0Var, boolean z11) {
        o0 o0Var2 = (o0) this.f4979c;
        this.f4979c = o0Var;
        if (z11) {
            SharedPreferences sharedPreferences = ((p0) this.f4978b).f4990a;
            if (o0Var != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", o0Var.f4980a);
                    jSONObject.put("first_name", o0Var.f4981b);
                    jSONObject.put("middle_name", o0Var.f4982c);
                    jSONObject.put("last_name", o0Var.f4983d);
                    jSONObject.put("name", o0Var.f4984e);
                    Uri uri = o0Var.f4985f;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = o0Var.f4986g;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (o0Var2 == null ? o0Var == null : Intrinsics.areEqual(o0Var2, o0Var)) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", o0Var2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", o0Var);
        this.f4977a.c(intent);
    }

    public o(d9.c cVar, a50.c cVar2) {
        cVar.getClass();
        this.f4977a = cVar;
        this.f4978b = cVar2;
    }
}
