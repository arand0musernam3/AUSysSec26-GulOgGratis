package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import com.braze.models.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements IPutIntoJson, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f10209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONArray f10210b;

    public l(JSONObject jSONObject) {
        jSONObject.getClass();
        this.f10209a = jSONObject;
        this.f10210b = new JSONArray().put(jSONObject);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getJsonObject() {
        JSONArray jSONArray = this.f10210b;
        jSONArray.getClass();
        return jSONArray;
    }

    @Override // com.braze.models.m
    public final boolean isEmpty() {
        return this.f10209a.length() == 0 || (this.f10209a.length() == 1 && this.f10209a.has("user_id"));
    }
}
