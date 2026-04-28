package com.braze.requests;

import com.braze.events.internal.g0;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import java.util.concurrent.TimeUnit;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.braze.triggers.actions.f f10498k;
    public final com.braze.triggers.events.b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f10499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f10500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f10501o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f10502p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.braze.triggers.actions.f f10503q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.braze.models.outgoing.k f10504r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(i3 i3Var, String str, com.braze.triggers.actions.f fVar, com.braze.triggers.events.b bVar, String str2) {
        long millis;
        super(new com.braze.requests.util.d(r8.k.l(str, "template")), str2, i3Var, 8);
        i3Var.getClass();
        str.getClass();
        fVar.getClass();
        bVar.getClass();
        this.f10498k = fVar;
        this.l = bVar;
        this.f10499m = n.f10452g;
        this.f10500n = fVar.f();
        int i11 = fVar.d().f10827e;
        if (i11 == -1) {
            millis = TimeUnit.SECONDS.toMillis(r3.f10826d + 30);
        } else {
            millis = i11;
        }
        this.f10501o = millis;
        this.f10502p = fVar.g();
        this.f10503q = fVar;
        this.f10504r = new com.braze.models.outgoing.j().a(str2).a();
    }

    public static final String l() {
        return "Experienced JSONException while retrieving parameters. Returning null.";
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e eVar, com.braze.events.e eVar2, com.braze.models.response.d dVar) {
        eVar.getClass();
        eVar2.getClass();
        dVar.getClass();
        super.a(eVar, eVar2, dVar);
        if (dVar instanceof com.braze.models.response.b) {
            ((com.braze.events.d) eVar).b(new g0(this.l, this.f10498k), g0.class);
        }
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final JSONObject b() {
        JSONObject jSONObjectB = super.b();
        if (jSONObjectB == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(InAppMessageBase.TRIGGER_ID, this.f10500n);
            jSONObject.put("trigger_event_type", this.l.a());
            com.braze.models.k kVar = ((com.braze.triggers.events.i) this.l).f10849c;
            jSONObject.put(Bayeux.KEY_DATA, kVar != null ? ((com.braze.models.outgoing.event.b) kVar).getJsonObject() : null);
            jSONObjectB.put("template", jSONObject);
            String str = this.f10504r.f10206a;
            if (str != null && str.length() != 0) {
                jSONObjectB.put("respond_with", this.f10504r.getJsonObject());
            }
            return jSONObjectB;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new hw.f(15), 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.f10499m;
    }

    @Override // com.braze.requests.b
    public final String toString() {
        com.braze.triggers.actions.f fVar = this.f10498k;
        com.braze.triggers.events.b bVar = this.l;
        String str = this.f10500n;
        long j9 = this.f10502p;
        long j11 = ((com.braze.triggers.events.i) bVar).f10848b + this.f10501o;
        com.braze.triggers.actions.f fVar2 = this.f10503q;
        StringBuilder sb2 = new StringBuilder("TemplateRequest(templatedTriggeredAction=");
        sb2.append(fVar);
        sb2.append(", triggerEvent=");
        sb2.append(bVar);
        sb2.append(", triggerAnalyticsId='");
        sb2.append(str);
        sb2.append("', templatePayloadExpirationTimestamp=");
        sb2.append(j9);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, ", getTemplatedDataExpiration=", j11, "triggeredAction=");
        sb2.append(fVar2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e eVar, com.braze.events.e eVar2, com.braze.models.response.g gVar) {
        eVar.getClass();
        eVar2.getClass();
        gVar.getClass();
        InAppMessageBase inAppMessageBase = gVar.f10235g;
        if (inAppMessageBase != null) {
            inAppMessageBase.setLocalPrefetchedAssetPaths(x0.k(this.f10498k.f10803f));
        }
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        return false;
    }
}
