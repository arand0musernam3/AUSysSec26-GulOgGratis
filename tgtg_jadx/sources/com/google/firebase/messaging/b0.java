package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12787c;

    public b0(String str, String str2, long j9) {
        this.f12785a = str;
        this.f12786b = str2;
        this.f12787c = j9;
    }

    public static String a(String str, long j9, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j9);
            return jSONObject.toString();
        } catch (JSONException e5) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e5);
            return null;
        }
    }

    public static b0 b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new b0(str, null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new b0(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e5) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e5);
            return null;
        }
    }
}
