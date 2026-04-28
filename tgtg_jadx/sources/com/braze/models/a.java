package com.braze.models;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize banner Json: " + jSONObject;
    }

    public final Banner a(JSONObject jSONObject) {
        if (jSONObject == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new com.app.tgtg.model.remote.item.response.a(13), 6, (Object) null);
            return null;
        }
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Banner.BANNER_KEY);
            if (jSONObjectOptJSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new com.app.tgtg.model.remote.item.response.a(14), 6, (Object) null);
                return null;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("properties");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            String string = jSONObjectOptJSONObject.getString("id");
            string.getClass();
            String string2 = jSONObjectOptJSONObject.getString(Banner.PLACEMENT_ID);
            string2.getClass();
            String string3 = jSONObjectOptJSONObject.getString(Banner.HTML);
            string3.getClass();
            return new Banner(string, string2, string3, jSONObjectOptJSONObject.getBoolean("is_control"), jSONObjectOptJSONObject.getLong(Banner.EXPIRATION), jSONObjectOptJSONObject.getBoolean("is_test_send"), jSONObjectOptJSONObject2);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new bw.a(jSONObject, 1), 4, (Object) null);
            return null;
        }
    }

    public static final String b() {
        return "Received null inner banner object. Not parsing.";
    }

    public static final String a() {
        return "Received null banner object. Not parsing.";
    }
}
