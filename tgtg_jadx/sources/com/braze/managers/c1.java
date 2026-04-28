package com.braze.managers;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c1 {
    public static final String b() {
        return "Error getting required SDK debugging fields in SdkDebugManager. Disabling SDK debugging.";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[Catch: JSONException -> 0x001d, TryCatch #0 {JSONException -> 0x001d, blocks: (B:4:0x0012, B:11:0x0023, B:13:0x002b, B:14:0x0031, B:16:0x0037, B:17:0x0041, B:19:0x0067, B:24:0x0085, B:26:0x0089, B:28:0x0095, B:23:0x0071), top: B:35:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[Catch: JSONException -> 0x001d, TryCatch #0 {JSONException -> 0x001d, blocks: (B:4:0x0012, B:11:0x0023, B:13:0x002b, B:14:0x0031, B:16:0x0037, B:17:0x0041, B:19:0x0067, B:24:0x0085, B:26:0x0089, B:28:0x0095, B:23:0x0071), top: B:35:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[Catch: JSONException -> 0x001d, TryCatch #0 {JSONException -> 0x001d, blocks: (B:4:0x0012, B:11:0x0023, B:13:0x002b, B:14:0x0031, B:16:0x0037, B:17:0x0041, B:19:0x0067, B:24:0x0085, B:26:0x0089, B:28:0x0095, B:23:0x0071), top: B:35:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[Catch: JSONException -> 0x001d, TryCatch #0 {JSONException -> 0x001d, blocks: (B:4:0x0012, B:11:0x0023, B:13:0x002b, B:14:0x0031, B:16:0x0037, B:17:0x0041, B:19:0x0067, B:24:0x0085, B:26:0x0089, B:28:0x0095, B:23:0x0071), top: B:35:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.braze.managers.d1 a(org.json.JSONObject r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.c1.a(org.json.JSONObject, boolean):com.braze.managers.d1");
    }

    public static final String a(JSONObject jSONObject) {
        return "sdkDebuggerObject contains invalid values. Disabling SDK debugging. " + jSONObject;
    }

    public static final String a() {
        return "SDK Debugger expiration time is in the past. Disabling SDK debugging.";
    }
}
