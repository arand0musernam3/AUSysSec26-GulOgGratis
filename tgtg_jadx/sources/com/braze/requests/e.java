package com.braze.requests;

import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.internal.h0;
import com.braze.managers.d1;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.storage.h1;
import com.braze.storage.i3;
import com.braze.storage.j1;
import com.braze.storage.k1;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONObject;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.requests.framework.h f10371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.communication.e f10372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.braze.events.e f10373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.braze.events.e f10374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.braze.managers.r f10375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i3 f10376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.braze.storage.p f10377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.braze.requests.util.a f10378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.braze.requests.framework.c f10379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f10380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o f10381k;

    public e(com.braze.requests.framework.h hVar, com.braze.communication.e eVar, com.braze.events.e eVar2, com.braze.events.e eVar3, com.braze.managers.r rVar, i3 i3Var, com.braze.storage.p pVar, com.braze.requests.util.a aVar, com.braze.requests.framework.c cVar) {
        hVar.getClass();
        eVar.getClass();
        eVar2.getClass();
        eVar3.getClass();
        rVar.getClass();
        i3Var.getClass();
        pVar.getClass();
        aVar.getClass();
        cVar.getClass();
        this.f10371a = hVar;
        this.f10372b = eVar;
        this.f10373c = eVar2;
        this.f10374d = eVar3;
        this.f10375e = rVar;
        this.f10376f = i3Var;
        this.f10377g = pVar;
        this.f10378h = aVar;
        this.f10379i = cVar;
        HashMap map = new HashMap();
        map.put("Accept-Encoding", "gzip, deflate");
        map.put("Content-Type", "application/json");
        this.f10380j = map;
        o oVar = hVar.f10416a;
        this.f10381k = oVar;
        oVar.a(map);
    }

    public static final Unit b(e eVar, List list) {
        ((com.braze.events.d) eVar.f10373c).b(new h0(list), h0.class);
        return Unit.f26487a;
    }

    public static final String d() {
        return "Api response was null, failing task.";
    }

    public final com.braze.models.response.a a() throws Throwable {
        ((b) this.f10381k).f10359e = Long.valueOf(DateTimeUtils.nowInSeconds());
        com.braze.requests.util.d dVarE = ((b) this.f10381k).e();
        JSONObject jSONObjectB = this.f10381k.b();
        if (jSONObjectB == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new hw.e(dVarE, 0), 6, (Object) null);
            return new com.braze.models.response.n(this.f10381k, new com.braze.communication.d(-1, (Map) null, 6));
        }
        com.braze.requests.util.a aVar = this.f10378h;
        aVar.getClass();
        dVarE.getClass();
        String strB = com.braze.requests.util.a.b(dVarE.f10479a);
        long jA = aVar.f10471a.a(strB);
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        k1 k1Var = aVar.f10471a;
        k1Var.getClass();
        strB.getClass();
        f0.E(kotlin.coroutines.g.f26549a, new j1(k1Var, strB, jNowInMilliseconds, null));
        this.f10380j.put("X-Braze-Last-Req-Ms-Ago", String.valueOf(Math.min(jNowInMilliseconds - jA, 7200000L)));
        HashMap map = this.f10380j;
        com.braze.requests.util.a aVar2 = this.f10378h;
        aVar2.getClass();
        String strA = com.braze.requests.util.a.a(dVarE.f10479a);
        long jA2 = aVar2.f10471a.a(strA, 1L);
        k1 k1Var2 = aVar2.f10471a;
        k1Var2.getClass();
        strA.getClass();
        f0.E(kotlin.coroutines.g.f26549a, new h1(k1Var2, strA, jA2 + 1, null));
        map.put("X-Braze-Req-Attempt", String.valueOf(jA2));
        this.f10380j.put("X-Braze-Req-Tokens-Remaining", String.valueOf(this.f10371a.f10420e));
        Integer num = this.f10371a.f10421f;
        if (num != null) {
            this.f10380j.put("X-Braze-Ept-Req-Tokens-Remaining", String.valueOf(num.intValue()));
        }
        int i11 = com.braze.communication.c.f9591a;
        com.braze.communication.d dVarA = this.f10372b.a(dVarE, this.f10380j, jSONObjectB);
        if (dVarA.f9594c != null) {
            return new com.braze.models.response.g(this.f10381k, dVarA, this.f10375e);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new hp.f0(28), 6, (Object) null);
        ((com.braze.events.d) this.f10374d).b(new BrazeNetworkFailureEvent(this.f10381k, dVarA), BrazeNetworkFailureEvent.class);
        return new com.braze.models.response.n(this.f10381k, dVarA);
    }

    public final void c() {
        com.braze.models.response.a aVarA = a();
        if (!(aVarA instanceof com.braze.models.response.g)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new hp.f0(29), 6, (Object) null);
            com.braze.models.response.f fVar = new com.braze.models.response.f(this.f10381k, aVarA.f10219a);
            this.f10381k.a(this.f10373c, this.f10374d, fVar);
            ((com.braze.events.d) this.f10373c).b(new com.braze.events.internal.f(this.f10381k), com.braze.events.internal.f.class);
            a(fVar);
            this.f10379i.a(aVarA);
            return;
        }
        com.braze.models.response.g gVar = (com.braze.models.response.g) aVarA;
        com.braze.models.response.d dVar = gVar.f10232d;
        if (dVar == null) {
            com.braze.requests.util.a aVar = this.f10378h;
            com.braze.requests.util.d dVarE = ((b) this.f10381k).e();
            aVar.getClass();
            dVarE.getClass();
            String strA = com.braze.requests.util.a.a(dVarE.f10479a);
            k1 k1Var = aVar.f10471a;
            k1Var.getClass();
            strA.getClass();
            f0.E(kotlin.coroutines.g.f26549a, new h1(k1Var, strA, 1L, null));
            this.f10381k.a(this.f10373c, this.f10374d, gVar);
            this.f10379i.a(gVar);
        } else {
            a(dVar);
            this.f10381k.a(this.f10373c, this.f10374d, gVar.f10232d);
            this.f10379i.a((com.braze.models.response.a) gVar);
        }
        a(gVar);
        boolean z11 = gVar.f10232d instanceof com.braze.models.response.h;
        com.braze.events.e eVar = this.f10373c;
        o oVar = this.f10381k;
        if (z11) {
            ((com.braze.events.d) eVar).b(new com.braze.events.internal.f(oVar), com.braze.events.internal.f.class);
        } else {
            ((com.braze.events.d) eVar).b(new com.braze.events.internal.g(oVar), com.braze.events.internal.g.class);
        }
    }

    public static final String b(com.braze.models.response.d dVar) {
        return e0.f.k("Received server error from request: ", dVar.a());
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            d.a(arrayList, new hw.c(this, arrayList, 0));
        }
    }

    public static final String b() {
        return "Experienced network communication exception processing API response. Sending network error event.";
    }

    public static final String a(com.braze.requests.util.d dVar) {
        return "Could not parse request parameters for POST request to " + dVar + ", cancelling request.";
    }

    public final void a(com.braze.models.response.g gVar) {
        gVar.getClass();
        String str = this.f10375e.f10068b;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new dw.d(str, 6), 6, (Object) null);
        a(gVar.f10234f, str);
        a(gVar.f10237i);
        b(gVar.f10236h);
        a(gVar.f10238j);
        a(gVar.f10239k);
        a(gVar.f10235g, str);
        String str2 = gVar.l;
        String str3 = gVar.f10240m;
        String str4 = gVar.f10241n;
        if (str2 != null && str3 != null && str4 != null) {
            ((com.braze.events.d) this.f10373c).b(new com.braze.events.internal.h(str2, str3, str4), com.braze.events.internal.h.class);
        }
        a(gVar.f10243p);
        d1 d1Var = gVar.f10244q;
        if (d1Var != null) {
            ((com.braze.events.d) this.f10373c).b(new com.braze.events.internal.t(d1Var), com.braze.events.internal.t.class);
        }
    }

    public static final String a(String str) {
        return e0.f.k("Processing server response payload for user with id: ", str);
    }

    public final void a(com.braze.models.response.d dVar) {
        dVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new hw.d(dVar, 0), 6, (Object) null);
        ((com.braze.events.d) this.f10373c).b(new com.braze.events.internal.x(dVar), com.braze.events.internal.x.class);
        o oVar = this.f10381k;
        if (oVar instanceof y) {
            com.braze.events.e eVar = this.f10374d;
            String strA = ((y) oVar).l.a();
            strA.getClass();
            ((com.braze.events.d) eVar).b(new NoMatchingTriggerEvent(strA), NoMatchingTriggerEvent.class);
        }
    }

    public final void a(com.braze.models.response.c cVar, String str) {
        if (cVar != null) {
            d.a(cVar, new a0.g(this, cVar, str, 21));
        }
    }

    public static final Unit a(e eVar, com.braze.models.response.c cVar, String str) {
        ContentCardsUpdatedEvent contentCardsUpdatedEventA = eVar.f10377g.a(cVar, str);
        if (contentCardsUpdatedEventA != null) {
            ((com.braze.events.d) eVar.f10374d).b(contentCardsUpdatedEventA, ContentCardsUpdatedEvent.class);
        }
        return Unit.f26487a;
    }

    public final void a(com.braze.models.response.m mVar) {
        if (mVar != null) {
            d.a(mVar, new ep.l(28, this, mVar));
        }
    }

    public static final Unit a(e eVar, com.braze.models.response.m mVar) throws Throwable {
        eVar.f10376f.a(mVar);
        ((com.braze.events.d) eVar.f10373c).b(new com.braze.events.internal.w(mVar), com.braze.events.internal.w.class);
        mVar.getClass();
        d1 d1Var = new d1(mVar.f10280z, mVar.B, mVar.A, mVar.C, mVar.D, mVar.E);
        ((com.braze.events.d) eVar.f10373c).b(new com.braze.events.internal.t(d1Var), com.braze.events.internal.t.class);
        return Unit.f26487a;
    }

    public final void a(ArrayList arrayList) {
        if (arrayList != null) {
            d.a(arrayList, new hw.c(this, arrayList, 1));
        }
    }

    public static final Unit a(e eVar, List list) {
        ((com.braze.events.d) eVar.f10373c).b(new com.braze.events.internal.l(list), com.braze.events.internal.l.class);
        return Unit.f26487a;
    }

    public final void a(JSONArray jSONArray) {
        if (jSONArray != null) {
            d.a(jSONArray, new ep.l(27, this, jSONArray));
        }
    }

    public static final Unit a(e eVar, JSONArray jSONArray) {
        ((com.braze.events.d) eVar.f10373c).b(new com.braze.events.internal.i(jSONArray), com.braze.events.internal.i.class);
        return Unit.f26487a;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            d.a(jSONObject, new ep.l(29, this, jSONObject));
        }
    }

    public static final Unit a(e eVar, JSONObject jSONObject) {
        ((com.braze.events.d) eVar.f10373c).b(new com.braze.events.internal.a(jSONObject), com.braze.events.internal.a.class);
        return Unit.f26487a;
    }

    public final void a(InAppMessageBase inAppMessageBase, String str) {
        if (inAppMessageBase != null) {
            d.a(inAppMessageBase, new a0.g(this, inAppMessageBase, str, 20));
        }
    }

    public static final Unit a(e eVar, IInAppMessage iInAppMessage, String str) {
        o oVar = eVar.f10381k;
        if (oVar instanceof y) {
            iInAppMessage.setExpirationTimestamp(((y) oVar).f10502p);
            com.braze.events.e eVar2 = eVar.f10373c;
            y yVar = (y) eVar.f10381k;
            ((com.braze.events.d) eVar2).b(new com.braze.events.internal.m(yVar.l, yVar.f10503q, iInAppMessage, str), com.braze.events.internal.m.class);
        }
        return Unit.f26487a;
    }
}
