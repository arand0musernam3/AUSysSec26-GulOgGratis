package com.braze.triggers.conditions;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f10805d = BrazeLogger.getBrazeLogTag((Class<?>) b.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10806c;

    public b(JSONObject jSONObject) {
        super(jSONObject);
        this.f10806c = jSONObject.getJSONObject(Bayeux.KEY_DATA).getString("event_name");
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (!(bVar instanceof com.braze.triggers.events.a)) {
            return false;
        }
        com.braze.triggers.events.a aVar = (com.braze.triggers.events.a) bVar;
        if (StringUtils.isNullOrBlank(aVar.f10840f) || !aVar.f10840f.equals(this.f10806c)) {
            return false;
        }
        return this.f10819a.a(bVar);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getJsonObject() {
        JSONObject jSONObjectC = super.c();
        try {
            jSONObjectC.put("type", "custom_event_property");
            JSONObject jSONObject = jSONObjectC.getJSONObject(Bayeux.KEY_DATA);
            jSONObject.put("event_name", this.f10806c);
            jSONObjectC.put(Bayeux.KEY_DATA, jSONObject);
            return jSONObjectC;
        } catch (JSONException e5) {
            BrazeLogger.e(f10805d, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", e5);
            return jSONObjectC;
        }
    }
}
