package com.braze.triggers.config;

import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements IPutIntoJson {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f10828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10829g;

    public c(JSONObject jSONObject) {
        jSONObject.getClass();
        this.f10823a = jSONObject.optLong("start_time", -1L);
        this.f10824b = jSONObject.optLong("end_time", -1L);
        this.f10825c = jSONObject.optInt("priority", 0);
        this.f10829g = jSONObject.optInt("min_seconds_since_last_trigger", -1);
        this.f10826d = jSONObject.optInt("delay", 0);
        this.f10827e = jSONObject.optInt("timeout", -1);
        this.f10828f = new b(jSONObject);
    }

    public static final String c() {
        return "Could not convert ScheduleConfig to JSON";
    }

    public final int d() {
        return this.f10826d;
    }

    public final b e() {
        return this.f10828f;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final JSONObject getJsonObject() {
        try {
            JSONObject key = this.f10828f.getJsonObject();
            if (key == null) {
                return null;
            }
            key.put("start_time", this.f10823a);
            key.put("end_time", this.f10824b);
            key.put("priority", this.f10825c);
            key.put("min_seconds_since_last_trigger", this.f10829g);
            key.put("timeout", this.f10827e);
            key.put("delay", this.f10826d);
            return key;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new p9.a(20), 4, (Object) null);
            return null;
        }
    }
}
