package com.braze.models.response;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONArray f10226d;

    public c(JSONObject jSONObject) {
        jSONObject.getClass();
        this.f10223a = jSONObject.optLong("last_card_updated_at", -1L);
        this.f10224b = jSONObject.optLong("last_full_sync_at", -1L);
        this.f10225c = jSONObject.optBoolean("full_sync", false);
        this.f10226d = jSONObject.optJSONArray("cards");
    }

    public c(String str) {
        str.getClass();
        this.f10225c = false;
        this.f10223a = -1L;
        this.f10224b = -1L;
        this.f10226d = new JSONArray().put(new JSONObject(str));
    }
}
