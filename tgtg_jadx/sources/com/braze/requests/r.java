package com.braze.requests;

import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f10462k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f10463m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(i3 i3Var, String str, String str2, ArrayList arrayList) {
        super(new com.braze.requests.util.d(r8.k.l(str, "push/delivery_events")), str2, i3Var, 8);
        i3Var.getClass();
        str.getClass();
        arrayList.getClass();
        this.f10462k = arrayList;
        this.l = arrayList.isEmpty();
        this.f10463m = n.f10453h;
    }

    public static final String d() {
        return "Experienced JSONException while creating PushDeliverySendRequest. Returning null.";
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        return this.l;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final JSONObject b() {
        JSONObject jSONObjectB = super.b();
        if (jSONObjectB == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (com.braze.models.push.a aVar : this.f10462k) {
                aVar.f10182e.setValue(aVar, com.braze.models.outgoing.event.b.f10177h[0], this.f10356b);
                jSONArray.put(aVar.getJsonObject());
            }
            jSONObjectB.put("events", jSONArray);
            String str = this.f10356b;
            if (str != null && !StringsKt.H(str)) {
                jSONObjectB.put("user_id", this.f10356b);
            }
            return jSONObjectB;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new hw.f(10), 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.f10463m;
    }
}
