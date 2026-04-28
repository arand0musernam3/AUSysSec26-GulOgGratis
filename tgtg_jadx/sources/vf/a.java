package vf;

import h2.s0;
import java.util.Set;
import jb.u;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p0;
import kotlin.collections.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f42300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f42301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f42302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f42303g;

    public a(JSONObject jSONObject) throws JSONException {
        super(f.BAD_REQUEST, 3);
        this.f42299c = u.E(jSONObject);
        p0 p0Var = p0.f26531a;
        this.f42300d = p0Var;
        this.f42301e = p0Var;
        this.f42302f = p0Var;
        this.f42303g = p0Var;
        if (jSONObject.has("events_with_invalid_fields")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("events_with_invalid_fields");
            jSONObject2.getClass();
            this.f42300d = u.y(jSONObject2);
        }
        if (jSONObject.has("events_with_missing_fields")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("events_with_missing_fields");
            jSONObject3.getClass();
            this.f42301e = u.y(jSONObject3);
        }
        if (jSONObject.has("silenced_devices")) {
            Object jSONArray = jSONObject.getJSONArray("silenced_devices");
            jSONArray.getClass();
            Set setV0 = CollectionsKt.v0((Iterable) jSONArray);
            setV0.getClass();
            this.f42303g = setV0;
        }
        if (jSONObject.has("silenced_events")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("silenced_events");
            jSONArray2.getClass();
            this.f42302f = y.V(u.S(jSONArray2));
        }
    }
}
