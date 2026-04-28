package com.braze.requests;

import com.braze.managers.d1;
import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n f10496k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(i3 i3Var, String str, String str2) {
        super(new com.braze.requests.util.d(r8.k.l(str, "debugger/init"), true), str2, i3Var, 8);
        i3Var.getClass();
        str.getClass();
        this.f10496k = n.f10457m;
    }

    public static final String l() {
        return "Experienced JSONException while creating SDK Initialization request. Returning null.";
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e eVar, com.braze.events.e eVar2, com.braze.models.response.d dVar) {
        eVar.getClass();
        eVar2.getClass();
        dVar.getClass();
        super.a(eVar, eVar2, dVar);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new hw.d(dVar, 1), 3, (Object) null);
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
                return jSONObjectB;
            }
            return jSONObjectB;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new hw.f(13), 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.f10496k;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(HashMap map) {
        map.getClass();
        super.a(map);
        map.put("X-Braze-Rec-Auth-Code", this.f10357c.y());
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        return false;
    }

    public static final String a(com.braze.models.response.d dVar) {
        return a0.p("SDK Debugger Initialization Request failed ", dVar.a(), ". Disabling SDK Debugger.");
    }
}
