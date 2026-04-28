package com.braze.triggers.conditions;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f10818b = BrazeLogger.getBrazeLogTag((Class<?>) l.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.conditions.logical.a f10819a;

    public l(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONObject(Bayeux.KEY_DATA).getJSONArray("property_filters");
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i11);
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                arrayList2.add(new g(jSONArray2.getJSONObject(i12)));
            }
            arrayList.add(new com.braze.triggers.conditions.logical.c(arrayList2));
        }
        this.f10819a = new com.braze.triggers.conditions.logical.a(arrayList);
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("property_filters", this.f10819a.getJsonObject());
            jSONObject.put(Bayeux.KEY_DATA, jSONObject2);
            return jSONObject;
        } catch (JSONException e5) {
            BrazeLogger.e(f10818b, "Caught exception creating Json.", e5);
            return jSONObject;
        }
    }
}
