package fx;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17981d;

    public d(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        String string = jSONObject.getString("name");
        string.getClass();
        this.f17978a = string;
        String strOptString = jSONObject.optString("value");
        strOptString.getClass();
        this.f17979b = strOptString;
        String strOptString2 = jSONObject.optString("path_type", "absolute");
        strOptString2.getClass();
        this.f17981d = strOptString2;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("path");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                jSONObject2.getClass();
                arrayList.add(new f(jSONObject2));
            }
        }
        this.f17980c = arrayList;
    }
}
