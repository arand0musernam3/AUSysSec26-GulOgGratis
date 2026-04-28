package com.braze.models;

import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class p implements IPutIntoJson {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f10211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f10212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Double f10213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10214d;

    public p(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        String string = jSONObject.getString("session_id");
        string.getClass();
        string.getClass();
        UUID uuidFromString = UUID.fromString(string);
        uuidFromString.getClass();
        this.f10211a = new q(uuidFromString);
        this.f10212b = jSONObject.getDouble("start_time");
        this.f10214d = jSONObject.getBoolean("is_sealed");
        this.f10213c = JsonUtils.getDoubleOrNull(jSONObject, "end_time");
    }

    public static final String a(double d3, p pVar) {
        return "End time '" + d3 + "' for session is less than the start time '" + pVar.f10212b + "' for this session.";
    }

    public static final String c() {
        return "Caught exception creating Session Json.";
    }

    public final long d() {
        Double dE = e();
        if (dE == null) {
            return -1L;
        }
        double dDoubleValue = dE.doubleValue();
        long j9 = (long) (dDoubleValue - this.f10212b);
        if (j9 < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new uk.o(dDoubleValue, this), 6, (Object) null);
        }
        return j9;
    }

    public Double e() {
        return this.f10213c;
    }

    public final q f() {
        return this.f10211a;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final JSONObject getJsonKey() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("session_id", this.f10211a);
            jSONObject.put("start_time", this.f10212b);
            jSONObject.put("is_sealed", this.f10214d);
            if (e() == null) {
                return jSONObject;
            }
            jSONObject.put("end_time", e());
            return jSONObject;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.models.inappmessage.m(11), 4, (Object) null);
            return jSONObject;
        }
    }

    public final double g() {
        return this.f10212b;
    }

    public final boolean h() {
        return this.f10214d;
    }

    public String toString() {
        return "\nSession(sessionId=" + this.f10211a + ", startTime=" + this.f10212b + ", endTime=" + e() + ", isSealed=" + this.f10214d + ", duration=" + d() + ")";
    }

    public p(q qVar, double d3, Double d11, boolean z11) {
        qVar.getClass();
        this.f10211a = qVar;
        this.f10212b = d3;
        ((n) this).f10213c = d11;
        this.f10214d = z11;
    }
}
