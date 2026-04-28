package com.braze.support;

import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f10766a = new n();

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize feature flag Json: " + jSONObject;
    }

    public final FeatureFlag a(JSONObject jSONObject) {
        jSONObject.getClass();
        try {
            String string = jSONObject.getString("id");
            string.getClass();
            boolean z11 = jSONObject.getBoolean(FeatureFlag.ENABLED);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("properties");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            return new FeatureFlag(string, z11, jSONObjectOptJSONObject, JsonUtils.getOptionalString(jSONObject, FeatureFlag.TRACKING_STRING));
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new bw.a(jSONObject, 11), 4, (Object) null);
            return null;
        }
    }
}
