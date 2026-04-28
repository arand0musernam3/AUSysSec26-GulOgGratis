package com.braze.triggers.conditions;

import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10804a;

    public a(JSONObject jSONObject) {
        this.f10804a = jSONObject.getJSONObject(Bayeux.KEY_DATA).getString("event_name");
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (!(bVar instanceof com.braze.triggers.events.a)) {
            return false;
        }
        com.braze.triggers.events.a aVar = (com.braze.triggers.events.a) bVar;
        return !StringUtils.isNullOrBlank(aVar.f10840f) && aVar.f10840f.equals(this.f10804a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "custom_event");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", this.f10804a);
            jSONObject.put(Bayeux.KEY_DATA, jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
