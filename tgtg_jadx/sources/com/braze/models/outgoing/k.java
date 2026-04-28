package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import com.braze.models.m;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements IPutIntoJson, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f10207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f10208c;

    public k(String str, Boolean bool, i iVar) {
        this.f10206a = str;
        this.f10207b = bool;
        this.f10208c = iVar;
    }

    public final boolean c() {
        return this.f10207b != null;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final JSONObject getPropertiesJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f10206a;
        if (str != null && str.length() != 0) {
            jSONObject.put("user_id", this.f10206a);
        }
        Boolean bool = this.f10207b;
        if (bool != null) {
            jSONObject.put("triggers", bool.booleanValue());
        }
        i iVar = this.f10208c;
        if (iVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("config_time", iVar.f10201a);
            jSONObject.put("config", jSONObject2);
        }
        return jSONObject;
    }

    @Override // com.braze.models.m
    public final boolean isEmpty() throws JSONException {
        i iVar;
        JSONObject value = getPropertiesJSONObject();
        if (value.length() == 0) {
            return true;
        }
        if (this.f10207b == null && (iVar = this.f10208c) != null) {
            return !iVar.f10202b;
        }
        if (value.length() == 1) {
            return value.has("user_id");
        }
        return false;
    }
}
