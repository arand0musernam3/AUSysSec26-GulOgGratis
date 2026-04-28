package com.braze.models.outgoing.event;

import com.braze.Constants;
import com.braze.a2;
import com.braze.b2;
import com.braze.c2;
import com.braze.enums.c;
import com.braze.enums.d;
import com.braze.enums.g;
import com.braze.f1;
import com.braze.m1;
import com.braze.models.FeatureFlag;
import com.braze.models.IBrazeLocation;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.n;
import com.braze.models.k;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.q;
import com.braze.models.r;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.text.b0;
import kotlin.text.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final k a(BrazeProperties brazeProperties, String str, String str2, BigDecimal bigDecimal, int i11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pid", str);
        jSONObject.put("c", str2);
        bigDecimal.getClass();
        BigDecimal scale = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        scale.getClass();
        jSONObject.put(Constants.BRAZE_PUSH_PRIORITY_KEY, scale.doubleValue());
        jSONObject.put("q", i11);
        if (brazeProperties != null && brazeProperties.getSize() > 0) {
            jSONObject.put("pr", brazeProperties.getJsonObject());
        }
        return new b(d.f9711f, jSONObject, 0.0d, 12);
    }

    public static final k b(Throwable th2, q qVar, boolean z11) throws JSONException {
        String str;
        String name = th2.getClass().getName();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (qVar != null) {
            str = "session_id: " + qVar;
        } else {
            str = null;
        }
        b.f10176g.getClass();
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        string.getClass();
        JSONObject jSONObjectPut = new JSONObject().put("e", s.c("\n                original_sdk_version: 41.1.1\n                exception_class: " + name + "\n                available_cpus: " + iAvailableProcessors + "\n                " + str + "\n                " + b0.x(InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS, string) + "\n            "));
        if (!z11) {
            jSONObjectPut.put("nop", true);
        }
        d dVar = d.f9715j;
        jSONObjectPut.getClass();
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k d(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("id", str);
        if (str2 != null && str2.length() > 0) {
            jSONObjectPut.put("bid", str2);
        }
        d dVar = d.G;
        jSONObjectPut.getClass();
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k f(String str, String str2) throws JSONException {
        q qVar;
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("name");
        c cVar = d.f9707b;
        string.getClass();
        cVar.getClass();
        string.getClass();
        Object obj = d.f9708c.get(string);
        if (obj == null) {
            obj = d.I;
        }
        d dVar = (d) obj;
        JSONObject jSONObject2 = jSONObject.getJSONObject(Bayeux.KEY_DATA);
        double d3 = jSONObject.getDouble("time");
        String optionalString = JsonUtils.getOptionalString(jSONObject, "user_id");
        String optionalString2 = JsonUtils.getOptionalString(jSONObject, "session_id");
        jSONObject2.getClass();
        dVar.getClass();
        jSONObject2.getClass();
        str2.getClass();
        b bVar = new b(dVar, jSONObject2, d3, str2);
        bVar.f10182e.setValue(bVar, b.f10177h[0], optionalString);
        if (optionalString2 != null) {
            UUID uuidFromString = UUID.fromString(optionalString2);
            uuidFromString.getClass();
            qVar = new q(uuidFromString);
        } else {
            qVar = null;
        }
        bVar.a(qVar);
        return bVar;
    }

    public static final k h(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("geo_id", str).put("event_type", str2);
        d dVar = d.f9716k;
        jSONObjectPut.getClass();
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k j(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(d.f9717m, jSONObject, 0.0d, 12);
    }

    public static final k l(String str, String str2) {
        return new b(d.f9725u, b.f10176g.a(str, (String) null, str2), 0.0d, 12);
    }

    public static final k n(String str) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str);
        d dVar = d.B;
        jSONObjectPut.getClass();
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k p(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, str).put(Constants.BRAZE_PUSH_CONTENT_KEY, str2);
        d dVar = d.f9712g;
        jSONObjectPut.getClass();
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k r(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str).put("value", str2);
        d dVar = d.f9722r;
        jSONObjectPut.getClass();
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k t(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(Constants.BRAZE_PUSH_CONTENT_KEY, str).put("l", str2);
        d dVar = d.f9728x;
        jSONObjectPut.getClass();
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public final k c(String str) {
        str.getClass();
        return a(new n(str, 29));
    }

    public final k e(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new f1(str, str2, 16));
    }

    public final k g(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new f1(str, str2, 10));
    }

    public final k i(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new f1(str, str2, 14));
    }

    public final k k(String str, String str2) {
        str.getClass();
        return a(new f1(str, str2, 19));
    }

    public final k m(String str, String str2) {
        str.getClass();
        return a(new f1(str, str2, 11));
    }

    public final k o(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new f1(str, str2, 17));
    }

    public final k q(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new f1(str, str2, 12));
    }

    public final k s(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new f1(str, str2, 18));
    }

    public final k c(String str, String str2) {
        str.getClass();
        return a(new f1(str, str2, 13));
    }

    public final k k(String str) {
        str.getClass();
        return a(new dw.d(str, 2));
    }

    public final k m(String str) {
        return a(new n(str, 28));
    }

    public final k e(String str) {
        str.getClass();
        return a(new dw.d(str, 0));
    }

    public final k g(String str) {
        str.getClass();
        return a(new dw.d(str, 1));
    }

    public final k i(String str) {
        str.getClass();
        return a(new dw.d(str, 3));
    }

    public static final k l(String str) {
        return new b(d.f9726v, b.f10176g.a(str, (String) null, (String) null), 0.0d, 12);
    }

    public static final k n(String str, String str2) {
        return new b(d.f9724t, b.f10176g.a(str, (String) null, str2), 0.0d, 12);
    }

    public static final k j(String str, String str2) {
        return new b(d.f9727w, b.f10176g.a(str, str2, (String) null), 0.0d, 12);
    }

    public static final k h(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(d.f9719o, jSONObject, 0.0d, 12);
    }

    public static final k d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(d.l, jSONObject, 0.0d, 12);
    }

    public final k a(final String str, final String str2, final BigDecimal bigDecimal, final int i11, final BrazeProperties brazeProperties) {
        str.getClass();
        str2.getClass();
        bigDecimal.getClass();
        return a(new Function0() { // from class: dw.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.models.outgoing.event.a.a(brazeProperties, str, str2, bigDecimal, i11);
            }
        });
    }

    public final k a(String str, BrazeProperties brazeProperties) {
        str.getClass();
        return a(new m1(str, brazeProperties, 2));
    }

    public final k a(IBrazeLocation iBrazeLocation) {
        iBrazeLocation.getClass();
        return a(new dw.c(iBrazeLocation, 0));
    }

    public final k a(Throwable th2, q qVar, boolean z11) {
        th2.getClass();
        return a(new bg.b(th2, qVar, z11, 4));
    }

    public final k a(FeatureFlag featureFlag) {
        featureFlag.getClass();
        return a(new r(featureFlag, 4));
    }

    public final k a(String str) {
        str.getClass();
        return a(new dw.d(str, 4));
    }

    public final k a(String str, int i11) {
        str.getClass();
        return a(new a2(str, i11, 1));
    }

    public final k a(String str, String str2) {
        str.getClass();
        str2.getClass();
        return a(new f1(str, str2, 15));
    }

    public final k a(String str, String[] strArr) {
        str.getClass();
        return a(new bs.b(20, str, strArr));
    }

    public final k a(q qVar) {
        qVar.getClass();
        return a(new cw.b(qVar, 5));
    }

    public final k a(long j9) {
        return a(new dw.b(j9, 0));
    }

    public final k a(String str, double d3, double d11) {
        str.getClass();
        return a(new c2(str, d3, d11, 1));
    }

    public final k a(String str, JSONObject jSONObject) {
        str.getClass();
        jSONObject.getClass();
        return a(new b2(str, jSONObject, 1));
    }

    public final k a(String str, g gVar) {
        str.getClass();
        gVar.getClass();
        return a(new bs.b(21, str, gVar));
    }

    public final JSONObject a(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (str != null && str.length() != 0) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("trigger_ids", jSONArray);
        }
        if (str2 != null && str2.length() != 0) {
            jSONObject.put("bid", str2);
        }
        if (str3 != null) {
            jSONObject.put(InAppMessageBase.MESSAGE_EXTRAS, str3);
            return jSONObject;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new db0.c(18), 6, (Object) null);
        return jSONObject;
    }

    public static final String a() {
        return "Message extras are null, not adding to event";
    }

    public final k a(Function0 function0) {
        try {
            return (k) function0.invoke();
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new db0.c(17), 4, (Object) null);
            return null;
        }
    }

    public static final k f(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONObject.put("ids", jSONArray);
        return new b(d.f9718n, jSONObject, 0.0d, 12);
    }

    public static final k b(IBrazeLocation iBrazeLocation) {
        return new b(d.f9709d, iBrazeLocation.getJsonObject(), 0.0d, 12);
    }

    public static final k b(String str, BrazeProperties brazeProperties) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, str);
        if (brazeProperties != null && brazeProperties.getSize() > 0) {
            jSONObjectPut.put(Constants.BRAZE_PUSH_PRIORITY_KEY, brazeProperties.getJsonObject());
        }
        d dVar = d.f9710e;
        jSONObjectPut.getClass();
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k b(FeatureFlag featureFlag) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("fid", featureFlag.getId()).put(FeatureFlag.TRACKING_STRING, featureFlag.getTrackingString$android_sdk_base_release());
        d dVar = d.E;
        jSONObjectPut.getClass();
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k b(String str) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("ids", JsonUtils.constructJsonArray(new String[]{str}));
        d dVar = d.F;
        jSONObjectPut.getClass();
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k b(String str, int i11) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str).put("value", i11);
        d dVar = d.f9720p;
        jSONObjectPut.getClass();
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k b(String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str).put("value", str2);
        d dVar = d.f9721q;
        jSONObjectPut.getClass();
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k b(String str, String[] strArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", str);
        if (strArr == null) {
            jSONObject.put("value", JSONObject.NULL);
        } else {
            jSONObject.put("value", JsonUtils.constructJsonArray(strArr));
        }
        return new b(d.f9723s, jSONObject, 0.0d, 12);
    }

    public static final k b(q qVar) {
        b bVar = new b(d.f9729y, (JSONObject) null, 0.0d, 14);
        bVar.a(qVar);
        return bVar;
    }

    public static final k b(long j9) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, j9);
        d dVar = d.f9730z;
        jSONObjectPut.getClass();
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k b(String str, double d3, double d11) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str).put("latitude", d3).put("longitude", d11);
        d dVar = d.A;
        jSONObjectPut.getClass();
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k b(String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("key", str).put("value", jSONObject);
        d dVar = d.C;
        jSONObjectPut.getClass();
        return new b(dVar, jSONObjectPut, 0.0d, 12);
    }

    public static final k b(String str, g gVar) throws JSONException {
        String str2;
        JSONObject jSONObjectPut = new JSONObject().put("group_id", str);
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            str2 = "subscribed";
        } else if (iOrdinal == 1) {
            str2 = "unsubscribed";
        } else {
            e40.a.f();
            return null;
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("status", str2);
        d dVar = d.D;
        jSONObjectPut2.getClass();
        return new b(dVar, jSONObjectPut2, 0.0d, 12);
    }

    public static final String b() {
        return "Failed to create event";
    }
}
