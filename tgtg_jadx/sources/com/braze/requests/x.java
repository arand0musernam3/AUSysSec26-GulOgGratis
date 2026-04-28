package com.braze.requests;

import com.braze.managers.d1;
import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w.a0;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f10497k;
    public final n l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(i3 i3Var, String str, String str2, ArrayList arrayList) {
        super(new com.braze.requests.util.d(r8.k.l(str, "debugger/log"), true), str2, i3Var, 8);
        i3Var.getClass();
        str.getClass();
        arrayList.getClass();
        this.f10497k = arrayList;
        this.l = n.f10458n;
    }

    public static final String d() {
        return "Experienced JSONException while creating SDK Debugger Log request. Returning null.";
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e eVar, com.braze.events.e eVar2, com.braze.models.response.d dVar) {
        eVar.getClass();
        eVar2.getClass();
        dVar.getClass();
        super.a(eVar, eVar2, dVar);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new hw.d(dVar, 2), 3, (Object) null);
        ((com.braze.events.d) eVar).b(new com.braze.events.internal.t(new d1()), com.braze.events.internal.t.class);
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final JSONObject b() {
        JSONObject jSONObjectB = super.b();
        if (jSONObjectB == null) {
            return null;
        }
        try {
            String str = this.f10356b;
            if (str != null && !StringsKt.H(str)) {
                jSONObjectB.put("user_id", this.f10356b);
            }
            JSONArray jSONArray = new JSONArray();
            for (com.braze.models.o oVar : this.f10497k) {
                oVar.getClass();
                jSONArray.put(new JSONObject().put("log", oVar.f10173a).put("time", oVar.f10174b));
            }
            jSONObjectB.put(Bayeux.KEY_DATA, new JSONArray().put(new JSONObject().put("type", "sdk_event_log").put(Bayeux.KEY_DATA, jSONArray)));
            return jSONObjectB;
        } catch (JSONException e5) {
            BrazeLogger.INSTANCE.brazelog((Object) this, BrazeLogger.Priority.E, (Throwable) e5, true, (Function0<String>) new hw.f(14));
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.l;
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        return this.f10497k.isEmpty();
    }

    public static final String a(com.braze.models.response.d dVar) {
        return a0.p("SDK Debugger Log Request failed ", dVar.a(), ". Disabling SDK Debugger.");
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(HashMap map) {
        map.getClass();
        super.a(map);
        map.put("X-Braze-Rec-Auth-Code", this.f10357c.y());
    }
}
