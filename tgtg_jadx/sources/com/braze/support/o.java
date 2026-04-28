package com.braze.support;

import com.braze.models.BrazeGeofence;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f10767a = new o();

    public static final ArrayList a(JSONArray jSONArray) {
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
            if (jSONObjectOptJSONObject == null) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f10767a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.e(21), 6, (Object) null);
                } catch (JSONException e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f10767a, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new bw.a(jSONObjectOptJSONObject, 13), 4, (Object) null);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f10767a, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new bw.a(jSONObjectOptJSONObject, 12), 4, (Object) null);
                }
            } else {
                arrayList.add(new BrazeGeofence(jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    public static final String b(JSONObject jSONObject) {
        return "Failed to deserialize geofence Json:" + jSONObject;
    }

    public static final String a() {
        return "Received null or blank geofence Json. Not parsing.";
    }

    public static final String a(JSONObject jSONObject) {
        return "Failed to deserialize geofence Json due to JSONException: " + jSONObject;
    }
}
