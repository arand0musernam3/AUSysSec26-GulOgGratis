package com.braze.requests;

import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f10464k;
    public final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f10465m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f10466n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(i3 i3Var, String str, String str2, ArrayList arrayList, long j9, List list) {
        super(new com.braze.requests.util.d(r8.k.l(str, "push/redeliver")), str2, i3Var, 8);
        i3Var.getClass();
        str.getClass();
        arrayList.getClass();
        list.getClass();
        this.f10464k = arrayList;
        this.l = j9;
        this.f10465m = list;
        this.f10466n = n.f10456k;
    }

    public static final String l() {
        return "Experienced JSONException while creating PushMaxSendRequest. Returning null.";
    }

    public static final String m() {
        return "PushMaxSendRequest executed successfully.";
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e eVar, com.braze.events.e eVar2, com.braze.models.response.g gVar) {
        eVar.getClass();
        eVar2.getClass();
        gVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hw.f(11), 7, (Object) null);
        long j9 = gVar.f10242o;
        if (j9 != -1) {
            ((com.braze.events.d) eVar).b(new com.braze.events.internal.p(j9), com.braze.events.internal.p.class);
        }
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
            jSONObjectB.put("campaign_ids", new JSONArray((Collection) this.f10464k));
            jSONObjectB.put("last_sync_at", this.l);
            if (!this.f10465m.isEmpty()) {
                jSONObjectB.put("dedupe_ids", new JSONArray((Collection) this.f10465m));
            }
            return jSONObjectB;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new hw.f(12), 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.f10466n;
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        return false;
    }
}
