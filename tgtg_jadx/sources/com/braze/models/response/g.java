package com.braze.models.response;

import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.braze.managers.d1;
import com.braze.managers.h1;
import com.braze.managers.r;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.requests.o;
import com.braze.requests.w;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f10231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f10232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f10233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f10234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InAppMessageBase f10235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f10236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f10237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f10238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final JSONArray f10239k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f10240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f10241n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f10242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final JSONObject f10243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d1 f10244q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, com.braze.communication.d dVar, r rVar) {
        c cVar;
        m mVar;
        super(oVar, dVar);
        oVar.getClass();
        dVar.getClass();
        rVar.getClass();
        JSONObject jSONObject = dVar.f9594c;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f10231c = jSONObject;
        String optionalString = JsonUtils.getOptionalString(jSONObject, StatusResponseUtils.RESULT_ERROR);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("auth_error");
        d hVar = jSONObjectOptJSONObject != null ? new h(oVar, jSONObjectOptJSONObject.optInt("error_code", -1), JsonUtils.getOptionalString(jSONObjectOptJSONObject, "reason"), optionalString) : Intrinsics.areEqual(optionalString, "invalid_api_key") ? new e(optionalString, oVar) : optionalString != null ? new b(optionalString, oVar) : null;
        this.f10232d = hVar;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("optional_auth_error");
        this.f10233e = jSONObjectOptJSONObject2 != null ? new i(oVar, jSONObjectOptJSONObject2.optInt("error_code", -1), JsonUtils.getOptionalString(jSONObjectOptJSONObject2, "reason")) : null;
        this.f10239k = jSONObject.optJSONArray("feature_flags");
        this.f10242o = jSONObject.optLong("last_sync_at", -1L);
        this.f10243p = jSONObject.optJSONObject("banners");
        if (hVar == null && (oVar instanceof com.braze.requests.f)) {
            try {
                cVar = new c(jSONObject);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new fw.a(this, 0), 4, (Object) null);
                cVar = null;
            }
        } else {
            cVar = null;
        }
        this.f10234f = cVar;
        ArrayList arrayListA = com.braze.triggers.utils.c.f10889a.a(this.f10231c.optJSONArray("triggers"), rVar);
        this.f10236h = arrayListA;
        if (arrayListA != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new fw.a(this, 1), 6, (Object) null);
        }
        JSONObject jSONObjectOptJSONObject3 = this.f10231c.optJSONObject("config");
        if (jSONObjectOptJSONObject3 != null) {
            try {
                mVar = new m(jSONObjectOptJSONObject3);
            } catch (Exception e11) {
                e = e11;
                mVar = null;
            }
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new bw.a(jSONObjectOptJSONObject3, 2), 6, (Object) null);
            } catch (Exception e12) {
                e = e12;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new bw.a(jSONObjectOptJSONObject3, 3), 4, (Object) null);
            }
        } else {
            mVar = null;
        }
        this.f10237i = mVar;
        this.f10235g = com.braze.triggers.utils.c.a(this.f10231c.optJSONObject("templated_message"), rVar);
        JSONArray jSONArrayOptJSONArray = this.f10231c.optJSONArray("geofences");
        this.f10238j = jSONArrayOptJSONArray != null ? com.braze.support.o.a(jSONArrayOptJSONArray) : null;
        if (oVar instanceof com.braze.requests.h) {
            this.l = JsonUtils.getOptionalString(this.f10231c, "mite");
            this.f10240m = JsonUtils.getOptionalString(this.f10231c, "host");
            this.f10241n = JsonUtils.getOptionalString(this.f10231c, "auth");
        } else {
            this.l = null;
            this.f10240m = null;
            this.f10241n = null;
        }
        this.f10244q = oVar instanceof w ? h1.f9984k.a(this.f10231c, true) : null;
    }

    public static final String a(g gVar) {
        return "Encountered Exception processing Content Cards response: " + gVar.f10231c;
    }

    public static final String b(g gVar) {
        return r8.k.h(gVar.f10236h.size(), "Found ", " triggered actions in server response.");
    }

    public static final String b(JSONObject jSONObject) {
        return "Encountered Exception processing server config: " + jSONObject;
    }

    public static final String a(JSONObject jSONObject) {
        return e0.f.k("Got server config: ", JsonUtils.getPrettyPrintedString(jSONObject));
    }
}
