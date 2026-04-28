package zx;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f48407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f48408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f48409c;

    public a(String str) {
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f48409c = lValueOf;
        this.f48408b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        stringBuffer.append(lValueOf.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        string.getClass();
        this.f48407a = string;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f48409c;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.f48408b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }
}
