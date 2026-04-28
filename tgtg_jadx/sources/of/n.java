package of;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f32519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f32520c;

    public n(String str, double d3, Map map) {
        str.getClass();
        this.f32518a = str;
        this.f32519b = d3;
        this.f32520c = map;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_name", this.f32518a);
        jSONObject.put("time", this.f32519b);
        Map map = this.f32520c;
        if (map != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject2.put((String) entry.getKey(), android.support.v4.media.session.a.N(entry.getValue()));
            }
            jSONObject.put("event_properties", jSONObject2);
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f32518a, nVar.f32518a) && Double.compare(this.f32519b, nVar.f32519b) == 0 && Intrinsics.areEqual(this.f32520c, nVar.f32520c);
    }

    public final int hashCode() {
        int iB = j4.s.b(this.f32519b, this.f32518a.hashCode() * 31, 31);
        Map map = this.f32520c;
        return iB + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "DiagnosticsEvent(eventName=" + this.f32518a + ", time=" + this.f32519b + ", eventProperties=" + this.f32520c + ')';
    }
}
