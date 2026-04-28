package vx;

import android.os.Build;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f42529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONArray f42530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f42534g;

    public final boolean a() {
        String str = this.f42533f;
        Long l = this.f42534g;
        b bVar = this.f42529b;
        int i11 = bVar == null ? -1 : c.$EnumSwitchMapping$0[bVar.ordinal()];
        return i11 != 1 ? i11 != 2 ? ((i11 != 3 && i11 != 4 && i11 != 5) || str == null || l == null) ? false : true : (str == null || this.f42532e == null || l == null) ? false : true : (this.f42530c == null || l == null) ? false : true;
    }

    public final void b() {
        if (a()) {
            p30.b.F(this.f42528a, toString());
        }
    }

    public final String toString() {
        Long l = this.f42534g;
        b bVar = this.f42529b;
        int i11 = bVar == null ? -1 : c.$EnumSwitchMapping$0[bVar.ordinal()];
        JSONObject jSONObject = null;
        try {
            if (i11 == 1) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = this.f42530c;
                if (jSONArray != null) {
                    jSONObject2.put("feature_names", jSONArray);
                }
                if (l != null) {
                    jSONObject2.put("timestamp", l);
                }
                jSONObject = jSONObject2;
            } else if (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("device_os_version", Build.VERSION.RELEASE);
                jSONObject3.put("device_model", Build.MODEL);
                String str = this.f42531d;
                if (str != null) {
                    jSONObject3.put("app_version", str);
                }
                if (l != null) {
                    jSONObject3.put("timestamp", l);
                }
                String str2 = this.f42532e;
                if (str2 != null) {
                    jSONObject3.put("reason", str2);
                }
                String str3 = this.f42533f;
                if (str3 != null) {
                    jSONObject3.put("callstack", str3);
                }
                if (bVar != null) {
                    jSONObject3.put("type", bVar);
                }
                jSONObject = jSONObject3;
            }
        } catch (JSONException unused) {
        }
        if (jSONObject == null) {
            String string = new JSONObject().toString();
            string.getClass();
            return string;
        }
        String string2 = jSONObject.toString();
        string2.getClass();
        return string2;
    }
}
