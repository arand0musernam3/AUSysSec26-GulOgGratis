package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import com.braze.models.m;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements IPutIntoJson, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10202b;

    public i(long j9, boolean z11) {
        this.f10201a = j9;
        this.f10202b = z11;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("config_time", this.f10201a);
        return jSONObject;
    }

    @Override // com.braze.models.m
    public final boolean isEmpty() {
        return !this.f10202b;
    }
}
