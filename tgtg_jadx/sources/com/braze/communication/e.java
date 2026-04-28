package com.braze.communication;

import com.braze.communication.e;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.s;
import lw.o;
import org.json.JSONObject;
import u70.j;
import u70.l;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f9634a;

    public e(b bVar) {
        bVar.getClass();
        this.f9634a = bVar;
    }

    public static final String a(j jVar, com.braze.requests.util.d dVar, e eVar, Map map, JSONObject jSONObject) {
        Object value = jVar.getValue();
        eVar.getClass();
        return s.d("\n                |Making request with id => \"" + value + "\"\n                |to url: " + dVar + "\n                \n                |with headers:\n                " + a(map) + "\n                |\n                |" + (jSONObject == null ? "" : e0.f.k("and JSON :\n", JsonUtils.getPrettyPrintedString(jSONObject))) + "\n                ");
    }

    public static final String b() {
        return "Exception while logging result: ";
    }

    public static final String a(com.braze.requests.util.d dVar, Map map, JSONObject jSONObject) {
        Object[] objArr = {dVar, map, jSONObject};
        String str = q.f10769a;
        long jHashCode = 1;
        for (int i11 = 0; i11 < 3; i11++) {
            jHashCode *= (long) objArr[i11].hashCode();
        }
        String hexString = Long.toHexString(jHashCode);
        hexString.getClass();
        return hexString;
    }

    public final void a(com.braze.requests.util.d dVar, HashMap map, j jVar, JSONObject jSONObject) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, dVar.f10482d, new cg.d(jVar, dVar, this, map, jSONObject, 6), 3, (Object) null);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new p9.a(15), 4, (Object) null);
        }
    }

    public final d a(com.braze.requests.util.d dVar, HashMap map, JSONObject jSONObject) {
        dVar.getClass();
        map.getClass();
        jSONObject.getClass();
        t tVarB = l.b(new o(dVar, map, jSONObject, 11));
        a(dVar, map, tVarB, jSONObject);
        long jCurrentTimeMillis = System.currentTimeMillis();
        d dVarA = this.f9634a.a(dVar, map, jSONObject);
        a(tVarB, dVar, dVarA.f9593b, dVarA.f9594c, System.currentTimeMillis() - jCurrentTimeMillis);
        return dVarA;
    }

    public static final String a() {
        return "Exception while logging request: ";
    }

    public final void a(final j jVar, final com.braze.requests.util.d dVar, final Map map, final JSONObject jSONObject, final long j9) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: pv.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.a(jVar, dVar, j9, this, map, jSONObject);
                }
            }, 7, (Object) null);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new p9.a(16), 4, (Object) null);
        }
    }

    public static final String a(j jVar, com.braze.requests.util.d dVar, long j9, e eVar, Map map, JSONObject jSONObject) {
        Object value = jVar.getValue();
        eVar.getClass();
        return s.d("\n                |Made request with id => \"" + value + "\"\n                |to url: " + dVar + "\n                |took: " + j9 + "ms\n                \n                |with response headers:\n                " + a(map) + "\n                |\n                |and response JSON:\n                |" + JsonUtils.getPrettyPrintedString(jSONObject) + "\n                ");
    }

    public static String a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(org.bouncycastle.jcajce.provider.asymmetric.a.d("|\"", (String) entry.getKey(), "\" => \"", (String) entry.getValue(), "\""));
        }
        return CollectionsKt.U(arrayList, "\n", null, null, null, 62);
    }
}
