package com.braze.requests;

import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.braze.models.k f10445k;
    public final n l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i3 i3Var, String str, com.braze.models.k kVar, String str2) {
        super(new com.braze.requests.util.d(r8.k.l(str, "geofence/request")), str2, i3Var, 8);
        i3Var.getClass();
        str.getClass();
        kVar.getClass();
        this.f10445k = kVar;
        this.l = n.f10454i;
    }

    public static final String l() {
        return "Experienced JSONException while creating geofence refresh request. Returning null.";
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        return false;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final JSONObject b() {
        JSONObject jSONObjectB = super.b();
        if (jSONObjectB == null) {
            return null;
        }
        try {
            jSONObjectB.put("location_event", ((com.braze.models.outgoing.event.b) this.f10445k).getJsonObject());
            return jSONObjectB;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new hw.f(8), 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.l;
    }
}
