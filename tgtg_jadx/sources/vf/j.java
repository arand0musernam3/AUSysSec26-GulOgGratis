package vf;

import h2.s0;
import jb.u;
import kotlin.collections.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42316c;

    public j(JSONObject jSONObject) throws JSONException {
        super(f.TOO_MANY_REQUESTS, 3);
        this.f42316c = u.E(jSONObject);
        if (jSONObject.has("exceeded_daily_quota_users")) {
            jSONObject.getJSONObject("exceeded_daily_quota_users").keySet().getClass();
        }
        if (jSONObject.has("exceeded_daily_quota_devices")) {
            jSONObject.getJSONObject("exceeded_daily_quota_devices").keySet().getClass();
        }
        if (jSONObject.has("throttled_events")) {
            JSONArray jSONArray = jSONObject.getJSONArray("throttled_events");
            jSONArray.getClass();
            y.V(u.S(jSONArray));
        }
        if (jSONObject.has("throttled_users")) {
            jSONObject.getJSONObject("throttled_users").keySet().getClass();
        }
        if (jSONObject.has("throttled_devices")) {
            jSONObject.getJSONObject("throttled_devices").keySet().getClass();
        }
    }
}
