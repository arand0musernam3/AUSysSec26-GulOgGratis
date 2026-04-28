package com.braze.storage;

import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u0 {
    public static final String b() {
        return "shouldReportPushPermissionsAsGranted: Returning true given that push is permissible now and notifications enabled transitioned to true.";
    }

    public static final String c() {
        return "shouldReportPushPermissionsAsGranted: Returning true since notifications enabled is true and device has upgraded to Tiramisu or beyond.";
    }

    public static final String d() {
        return "Returning false for shouldReportPushPermissionsAsGranted.";
    }

    public final boolean a(JSONObject jSONObject, JSONObject jSONObject2, int i11, int i12) {
        jSONObject.getClass();
        jSONObject2.getClass();
        boolean z11 = i12 >= 33;
        boolean z12 = i11 < 33 && z11;
        DeviceKey deviceKey = DeviceKey.NOTIFICATIONS_ENABLED;
        boolean zOptBoolean = jSONObject2.optBoolean(deviceKey.getKey(), false);
        boolean z13 = zOptBoolean && !jSONObject.optBoolean(deviceKey.getKey(), false);
        if (z11 && z13) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.l(29), 7, (Object) null);
            return true;
        }
        if (zOptBoolean && z12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.p(0), 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.p(1), 6, (Object) null);
        return false;
    }

    public static final String a() {
        return "Caught json exception while creating the diff. Returning null";
    }

    public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject2.opt(next);
            Object objOpt2 = jSONObject.opt(next);
            if (objOpt != null) {
                try {
                    if (objOpt instanceof JSONObject) {
                        if (objOpt2 == null || !JsonUtils.areJsonObjectsEqual((JSONObject) objOpt, (JSONObject) objOpt2)) {
                            jSONObject3.put(next, objOpt);
                        }
                    } else if (!Intrinsics.areEqual(objOpt, objOpt2)) {
                        jSONObject3.put(next, objOpt);
                    }
                } catch (JSONException e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.p(2), 4, (Object) null);
                    return null;
                }
            }
        }
        return jSONObject3;
    }
}
