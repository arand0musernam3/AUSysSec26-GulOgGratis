package com.braze.triggers.conditions;

import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10814a;

    public h(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Bayeux.KEY_DATA);
        if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.isNull("product_id")) {
            return;
        }
        this.f10814a = jSONObjectOptJSONObject.optString("product_id", null);
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (!(bVar instanceof com.braze.triggers.events.f)) {
            return false;
        }
        if (StringUtils.isNullOrBlank(this.f10814a)) {
            return true;
        }
        com.braze.triggers.events.f fVar = (com.braze.triggers.events.f) bVar;
        return !StringUtils.isNullOrBlank(fVar.f10843f) && fVar.f10843f.equals(this.f10814a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "purchase");
            if (this.f10814a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("product_id", this.f10814a);
                jSONObject.putOpt(Bayeux.KEY_DATA, jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
