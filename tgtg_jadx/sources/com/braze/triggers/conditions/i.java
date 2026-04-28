package com.braze.triggers.conditions;

import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f10815d = BrazeLogger.getBrazeLogTag((Class<?>) i.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10816c;

    public i(JSONObject jSONObject) {
        super(jSONObject);
        this.f10816c = jSONObject.getJSONObject(Bayeux.KEY_DATA).getString("product_id");
    }

    @Override // com.braze.triggers.conditions.c
    public final boolean a(com.braze.triggers.events.b bVar) {
        if (!(bVar instanceof com.braze.triggers.events.f) || StringUtils.isNullOrBlank(this.f10816c)) {
            return false;
        }
        com.braze.triggers.events.f fVar = (com.braze.triggers.events.f) bVar;
        if (!StringUtils.isNullOrBlank(fVar.f10843f) && fVar.f10843f.equals(this.f10816c)) {
            return this.f10819a.a(bVar);
        }
        return false;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getJsonObject() {
        JSONObject jSONObjectC = super.c();
        try {
            jSONObjectC.put("type", "purchase_property");
            JSONObject jSONObject = jSONObjectC.getJSONObject(Bayeux.KEY_DATA);
            jSONObject.put("product_id", this.f10816c);
            jSONObjectC.put(Bayeux.KEY_DATA, jSONObject);
            return jSONObjectC;
        } catch (JSONException e5) {
            BrazeLogger.e(f10815d, "Caught exception creating Json.", e5);
            return jSONObjectC;
        }
    }
}
