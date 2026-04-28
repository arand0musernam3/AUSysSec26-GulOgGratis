package com.braze.requests;

import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n f10444k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i3 i3Var, String str, String str2) {
        super(new com.braze.requests.util.d(r8.k.l(str, "feature_flags/sync")), str2, i3Var, 8);
        i3Var.getClass();
        str.getClass();
        this.f10444k = n.f10450e;
    }

    public static final String l() {
        return "Experienced JSONException while creating Feature Flags request. Returning null.";
    }

    public static final String m() {
        return "FeatureFlagsSyncRequest failed.";
    }

    public static final String n() {
        return "FeatureFlagsSyncRequest executed successfully.";
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e eVar, com.braze.events.e eVar2, com.braze.models.response.d dVar) {
        eVar.getClass();
        eVar2.getClass();
        dVar.getClass();
        super.a(eVar, eVar2, dVar);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new hw.f(5), 6, (Object) null);
        ((com.braze.events.d) eVar).b(new com.braze.events.internal.j(), com.braze.events.internal.j.class);
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new hw.f(6), 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.f10444k;
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e eVar, com.braze.events.e eVar2, com.braze.models.response.g gVar) {
        eVar.getClass();
        eVar2.getClass();
        gVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hw.f(7), 7, (Object) null);
        ((com.braze.events.d) eVar).b(new com.braze.events.internal.k(this), com.braze.events.internal.k.class);
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        return false;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(HashMap map) {
        map.getClass();
        super.a(map);
        map.put("X-Braze-DataRequest", "true");
        map.put("X-Braze-FeatureFlagsRequest", "true");
    }
}
