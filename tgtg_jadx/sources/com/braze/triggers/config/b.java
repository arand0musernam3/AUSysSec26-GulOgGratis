package com.braze.triggers.config;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10822a;

    public b(JSONObject jSONObject) {
        jSONObject.getClass();
        this.f10822a = jSONObject.optInt("re_eligibility", -1);
    }

    public static final String c() {
        return "Could not convert ReEligibilityConfig to JSON";
    }

    public final Integer d() {
        int i11 = this.f10822a;
        if (i11 > 0) {
            return Integer.valueOf(i11);
        }
        return null;
    }

    public final boolean e() {
        return this.f10822a == -1;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final JSONObject getJsonObject() {
        try {
            return new JSONObject().put("re_eligibility", this.f10822a);
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new p9.a(19), 4, (Object) null);
            return null;
        }
    }
}
