package of;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f32521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f32522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f32523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f32524d;

    public o(Map map, Map map2, LinkedHashMap linkedHashMap, List list) {
        this.f32521a = map;
        this.f32522b = map2;
        this.f32523c = linkedHashMap;
        this.f32524d = list;
    }

    public final String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map map = this.f32521a;
        if (map != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
            }
            jSONObject.put("tags", jSONObject2);
        }
        Map map2 = this.f32522b;
        if (map2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry entry2 : map2.entrySet()) {
                jSONObject3.put((String) entry2.getKey(), ((Number) entry2.getValue()).longValue());
            }
            jSONObject.put("counters", jSONObject3);
        }
        Map map3 = this.f32523c;
        if (map3 != null) {
            JSONObject jSONObject4 = new JSONObject();
            for (Map.Entry entry3 : map3.entrySet()) {
                String str = (String) entry3.getKey();
                w wVar = (w) entry3.getValue();
                wVar.getClass();
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("count", wVar.f32539a);
                jSONObject5.put("min", wVar.f32540b);
                jSONObject5.put("max", wVar.f32541c);
                jSONObject5.put("avg", wVar.f32542d);
                jSONObject4.put(str, jSONObject5);
            }
            jSONObject.put("histogram", jSONObject4);
        }
        List list = this.f32524d;
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((n) it.next()).a());
            }
            jSONObject.put("events", jSONArray);
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f32521a, oVar.f32521a) && Intrinsics.areEqual(this.f32522b, oVar.f32522b) && Intrinsics.areEqual(this.f32523c, oVar.f32523c) && Intrinsics.areEqual(this.f32524d, oVar.f32524d);
    }

    public final int hashCode() {
        Map map = this.f32521a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.f32522b;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.f32523c;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        List list = this.f32524d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "DiagnosticsPayload(tags=" + this.f32521a + ", counters=" + this.f32522b + ", histograms=" + this.f32523c + ", events=" + this.f32524d + ')';
    }
}
