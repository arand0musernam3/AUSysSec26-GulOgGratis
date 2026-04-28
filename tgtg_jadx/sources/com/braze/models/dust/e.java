package com.braze.models.dust;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f10145a = new e();

    public static final String b(JSONObject jSONObject) {
        return "Failed to parse json. Returning unknown.\n" + jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.braze.models.dust.g a(org.json.JSONObject r13) throws org.json.JSONException {
        /*
            r12 = this;
            r13.getClass()
            java.lang.String r0 = "type"
            java.lang.String r0 = r13.getString(r0)
            com.braze.models.dust.f r1 = com.braze.models.dust.f.UNKNOWN
            java.lang.String r1 = "ccr"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r1 == 0) goto L19
            com.braze.models.dust.a r13 = new com.braze.models.dust.a
            r13.<init>()
            return r13
        L19:
            java.lang.String r1 = "ttl"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            java.lang.String r2 = "body"
            r3 = 0
            if (r1 == 0) goto L55
            org.json.JSONObject r13 = r13.optJSONObject(r2)
            if (r13 == 0) goto L3d
            java.lang.String r0 = "t_ms"
            r1 = -1
            long r0 = r13.optLong(r0, r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L3d
            goto L3e
        L3d:
            r2 = r3
        L3e:
            if (r13 == 0) goto L4f
            java.lang.String r0 = "rcs"
            java.lang.String r13 = r13.optString(r0)
            if (r13 == 0) goto L4f
            int r0 = r13.length()
            if (r0 <= 0) goto L4f
            r3 = r13
        L4f:
            com.braze.models.dust.c r13 = new com.braze.models.dust.c
            r13.<init>(r2, r3)
            return r13
        L55:
            java.lang.String r1 = "ddr"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L82
            org.json.JSONObject r13 = r13.optJSONObject(r2)
            r0 = 500(0x1f4, double:2.47E-321)
            if (r13 == 0) goto L6b
            java.lang.String r2 = "r_ms"
            long r0 = r13.optLong(r2, r0)
        L6b:
            if (r13 == 0) goto L7c
            java.lang.String r2 = "e"
            java.lang.String r13 = r13.optString(r2)
            if (r13 == 0) goto L7c
            int r2 = r13.length()
            if (r2 <= 0) goto L7c
            r3 = r13
        L7c:
            com.braze.models.dust.b r13 = new com.braze.models.dust.b
            r13.<init>(r0, r3)
            return r13
        L82:
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE
            bw.a r9 = new bw.a
            r0 = 0
            r9.<init>(r13, r0)
            r10 = 7
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r5 = r12
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)
            com.braze.models.dust.d r13 = new com.braze.models.dust.d
            r13.<init>()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.models.dust.e.a(org.json.JSONObject):com.braze.models.dust.g");
    }
}
