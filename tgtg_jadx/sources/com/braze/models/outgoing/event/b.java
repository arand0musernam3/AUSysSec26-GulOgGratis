package com.braze.models.outgoing.event;

import com.braze.enums.d;
import com.braze.models.k;
import com.braze.models.q;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import db0.c;
import j4.s;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f10178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f10179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f10180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.braze.support.delegates.a f10182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.braze.support.delegates.a f10183f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f10177h = {s.t(b.class, "userId", "getUserId()Ljava/lang/String;", 0), s.t(b.class, "sessionId", "getSessionId()Lcom/braze/models/SessionId;", 0)};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f10176g = new a();

    public b(d dVar, JSONObject jSONObject, double d3, String str) {
        dVar.getClass();
        jSONObject.getClass();
        str.getClass();
        this.f10178a = dVar;
        this.f10179b = jSONObject;
        this.f10180c = d3;
        this.f10181d = str;
        this.f10182e = new com.braze.support.delegates.a();
        this.f10183f = new com.braze.support.delegates.a();
        if (dVar != d.I) {
            return;
        }
        i4.a.f("Event type cannot be unknown.");
        throw null;
    }

    public static final String c() {
        return "Caught exception creating Braze event json";
    }

    public final void a(q qVar) {
        this.f10183f.setValue(this, f10177h[1], qVar);
    }

    public final d d() {
        return this.f10178a;
    }

    public final String e() {
        return this.f10181d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(getClass(), obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.f10181d, ((b) obj).f10181d);
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final JSONObject getJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f10178a.f9731a);
            jSONObject.put(Bayeux.KEY_DATA, this.f10179b);
            jSONObject.put("time", this.f10180c);
            com.braze.support.delegates.a aVar = this.f10182e;
            KProperty[] kPropertyArr = f10177h;
            KProperty kProperty = kPropertyArr[0];
            aVar.getClass();
            kProperty.getClass();
            String str = (String) aVar.f10756a;
            if (str != null && str.length() != 0) {
                com.braze.support.delegates.a aVar2 = this.f10182e;
                KProperty kProperty2 = kPropertyArr[0];
                aVar2.getClass();
                kProperty2.getClass();
                jSONObject.put("user_id", (String) aVar2.f10756a);
            }
            com.braze.support.delegates.a aVar3 = this.f10183f;
            KProperty kProperty3 = kPropertyArr[1];
            aVar3.getClass();
            kProperty3.getClass();
            q qVar = (q) aVar3.f10756a;
            if (qVar != null) {
                jSONObject.put("session_id", qVar.f10216b);
            }
            return jSONObject;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new c(19), 4, (Object) null);
            return jSONObject;
        }
    }

    public final int hashCode() {
        return this.f10181d.hashCode();
    }

    public final String toString() {
        return a();
    }

    public /* synthetic */ b(d dVar, JSONObject jSONObject, double d3, int i11) {
        this(dVar, (i11 & 2) != 0 ? new JSONObject() : jSONObject, (i11 & 4) != 0 ? DateTimeUtils.nowInSecondsPrecise() : d3, UUID.randomUUID().toString());
    }
}
