package com.braze.triggers.conditions;

import com.braze.support.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f10808b = new HashSet();

    public e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject(Bayeux.KEY_DATA);
        this.f10807a = jSONObject2.getString("id");
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("buttons");
        if (jSONArrayOptJSONArray != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                this.f10808b.add(jSONArrayOptJSONArray.getString(i11));
            }
        }
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (bVar instanceof com.braze.triggers.events.d) {
            com.braze.triggers.events.d dVar = (com.braze.triggers.events.d) bVar;
            if (!StringUtils.isNullOrBlank(dVar.f10841e) && dVar.f10841e.equals(this.f10807a)) {
                int size = this.f10808b.size();
                String str = dVar.f10842f;
                return size > 0 ? !StringUtils.isNullOrBlank(str) && this.f10808b.contains(dVar.f10842f) : StringUtils.isNullOrBlank(str);
            }
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", this.f10807a);
            if (this.f10808b.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f10808b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject2.put("buttons", jSONArray);
            }
            jSONObject.put(Bayeux.KEY_DATA, jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
