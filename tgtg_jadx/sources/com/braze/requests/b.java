package com.braze.requests;

import com.braze.Braze;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import hp.f0;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends t implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i3 f10357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f10358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f10359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f10360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f10361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f10362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.braze.models.outgoing.h f10363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f10364j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.braze.requests.util.d dVar, String str, i3 i3Var, c cVar) {
        super(dVar);
        dVar.getClass();
        i3Var.getClass();
        cVar.getClass();
        this.f10356b = str;
        this.f10357c = i3Var;
        this.f10358d = cVar;
    }

    public static final String c(b bVar) {
        return bVar + " for " + bVar.c() + " executed successfully.";
    }

    public static final String d() {
        return "Experienced JSONException while retrieving parameters. Returning null.";
    }

    public static final String f() {
        return "******************************************************************";
    }

    public static final String g() {
        return "******************************************************************";
    }

    public static final String h() {
        return "**                        !! WARNING !!                         **";
    }

    public static final String i() {
        return "**  The current API key/endpoint combination is invalid. This   **";
    }

    public static final String j() {
        return "** is potentially an integration error. Please ensure that your **";
    }

    public static final String k() {
        return "**     API key AND custom endpoint information are correct.     **";
    }

    @Override // com.braze.requests.p
    public void a(com.braze.events.e eVar, com.braze.events.e eVar2, com.braze.models.response.d dVar) {
        eVar.getClass();
        eVar2.getClass();
        dVar.getClass();
        String strA = dVar.a();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new dw.d(strA, 5), 6, (Object) null);
        if (dVar instanceof com.braze.models.response.e) {
            ((com.braze.events.d) eVar).b(dVar, com.braze.models.response.e.class);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new f0(23), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new f0(24), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new f0(25), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new f0(26), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new f0(27), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new hw.a(this, 1), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new hw.a(this, 2), 6, (Object) null);
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new f0(21), 6, (Object) null);
        }
        if (dVar instanceof com.braze.models.response.h) {
            ((com.braze.events.d) eVar2).b(new BrazeSdkAuthenticationErrorEvent((com.braze.models.response.h) dVar), BrazeSdkAuthenticationErrorEvent.class);
        }
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.braze.models.outgoing.h hVar = this.f10363i;
            if (hVar != null && !hVar.isEmpty()) {
                jSONObject.put("device", hVar.getValue());
            }
            String str = this.f10360f;
            if (str != null) {
                jSONObject.put("device_id", str);
            }
            Long l = this.f10359e;
            if (l != null) {
                jSONObject.put("time", l);
            }
            String str2 = this.f10361g;
            if (str2 != null) {
                jSONObject.put("api_key", str2);
            }
            String str3 = this.f10362h;
            if (str3 != null) {
                jSONObject.put("sdk_version", str3);
            }
            return jSONObject;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new f0(22), 4, (Object) null);
            return null;
        }
    }

    public final com.braze.requests.util.d e() {
        return new com.braze.requests.util.d(Braze.INSTANCE.getApiEndpoint(this.f10467a.f10480b));
    }

    public String toString() {
        return hashCode() + " - " + JsonUtils.getPrettyPrintedString(b()) + "\nto target: " + e();
    }

    public /* synthetic */ b(com.braze.requests.util.d dVar, String str, i3 i3Var, int i11) {
        this(dVar, (i11 & 2) != 0 ? null : str, i3Var, c.UNKNOWN);
    }

    public static final String b(b bVar) {
        return e0.f.k(">> API key    : ", bVar.f10361g);
    }

    @Override // com.braze.requests.p
    public void a(com.braze.events.e eVar, com.braze.events.e eVar2, com.braze.models.response.g gVar) {
        eVar.getClass();
        eVar2.getClass();
        gVar.getClass();
        com.braze.models.response.i iVar = gVar.f10233e;
        if (iVar != null) {
            ((com.braze.events.d) eVar2).b(new BrazeSdkAuthenticationErrorEvent(new com.braze.models.response.h(iVar.f10249a, iVar.f10250b, iVar.f10251c, null)), BrazeSdkAuthenticationErrorEvent.class);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c() == n.f10458n, new hw.a(this, 0), 3, (Object) null);
    }

    public static final String a(String str) {
        return e0.f.k("Error occurred while executing Braze request: ", str);
    }

    public static final String a(b bVar) {
        return ">> Request Uri: " + bVar.e();
    }

    @Override // com.braze.requests.p
    public void a(com.braze.events.d dVar) {
        dVar.getClass();
        dVar.b(new com.braze.events.internal.r(this), com.braze.events.internal.r.class);
    }

    @Override // com.braze.requests.p
    public void a(com.braze.events.e eVar) {
        eVar.getClass();
        ((com.braze.events.d) eVar).b(new com.braze.events.internal.q(this), com.braze.events.internal.q.class);
    }

    public void a(HashMap map) {
        map.getClass();
        map.put("X-Braze-Api-Key", this.f10361g);
        String str = this.f10364j;
        if (str != null && str.length() != 0) {
            map.put("X-Braze-Auth-Signature", this.f10364j);
        }
        c cVar = this.f10358d;
        if (cVar != c.UNKNOWN) {
            map.put("X-Braze-Request-Initiated-By", cVar.f10370a);
        }
    }
}
