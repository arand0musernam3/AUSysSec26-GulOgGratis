package cy;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f13470a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static w f13471b;

    public static final a8.h a(JSONObject jSONObject) throws JSONException {
        String strOptString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray(Bayeux.KEY_DATA);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
            String strOptString2 = jSONObjectOptJSONObject.optString("permission");
            strOptString2.getClass();
            if (strOptString2.length() != 0 && !Intrinsics.areEqual(strOptString2, "installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                int iHashCode = strOptString.hashCode();
                if (iHashCode != -1309235419) {
                    if (iHashCode != 280295099) {
                        if (iHashCode == 568196142 && strOptString.equals("declined")) {
                            arrayList2.add(strOptString2);
                        }
                    } else if (strOptString.equals("granted")) {
                        arrayList.add(strOptString2);
                    }
                } else if (strOptString.equals("expired")) {
                    arrayList3.add(strOptString2);
                }
            }
        }
        a8.h hVar = new a8.h(14, false);
        hVar.f973b = arrayList;
        hVar.f974c = arrayList2;
        hVar.f975d = arrayList3;
        return hVar;
    }

    public static final Bundle b(String str) {
        ScheduledExecutorService scheduledExecutorService = w.f13596d;
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    public b0 c() {
        if (b0.f13475k == null) {
            synchronized (this) {
                b0.f13475k = new b0();
            }
        }
        b0 b0Var = b0.f13475k;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("instance");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x000f A[Catch: all -> 0x0008, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized cy.w d(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto La
            android.content.Context r3 = ax.a0.a()     // Catch: java.lang.Throwable -> L8
            goto La
        L8:
            r3 = move-exception
            goto L22
        La:
            if (r3 != 0) goto Lf
            monitor-exit(r2)
            r3 = 0
            return r3
        Lf:
            cy.w r0 = cy.a0.f13471b     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L1e
            cy.w r0 = new cy.w     // Catch: java.lang.Throwable -> L8
            java.lang.String r1 = ax.a0.b()     // Catch: java.lang.Throwable -> L8
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L8
            cy.a0.f13471b = r0     // Catch: java.lang.Throwable -> L8
        L1e:
            cy.w r3 = cy.a0.f13471b     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return r3
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cy.a0.d(android.content.Context):cy.w");
    }
}
