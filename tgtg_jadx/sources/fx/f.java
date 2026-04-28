package fx;

import org.bouncycastle.i18n.TextBundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17989h;

    public f(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        String string = jSONObject.getString("class_name");
        string.getClass();
        this.f17982a = string;
        this.f17983b = jSONObject.optInt("index", -1);
        this.f17984c = jSONObject.optInt("id");
        String strOptString = jSONObject.optString(TextBundle.TEXT_ENTRY);
        strOptString.getClass();
        this.f17985d = strOptString;
        String strOptString2 = jSONObject.optString("tag");
        strOptString2.getClass();
        this.f17986e = strOptString2;
        String strOptString3 = jSONObject.optString("description");
        strOptString3.getClass();
        this.f17987f = strOptString3;
        String strOptString4 = jSONObject.optString("hint");
        strOptString4.getClass();
        this.f17988g = strOptString4;
        this.f17989h = jSONObject.optInt("match_bitmask");
    }
}
