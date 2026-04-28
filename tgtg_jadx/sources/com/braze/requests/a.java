package com.braze.requests;

import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import hp.f0;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f10355k;
    public final n l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ArrayList arrayList, i3 i3Var, String str, String str2) {
        super(new com.braze.requests.util.d(r8.k.l(str, "banners/sync")), str2, i3Var, 8);
        arrayList.getClass();
        i3Var.getClass();
        str.getClass();
        this.f10355k = arrayList;
        this.l = n.l;
    }

    public static final String g() {
        return "BannersSyncRequest failed.";
    }

    public static final String l() {
        return "Experienced JSONException while creating Banners Sync request. Returning null.";
    }

    public static final String m() {
        return "BannersSyncRequest executed successfully.";
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e eVar, com.braze.events.e eVar2, com.braze.models.response.d dVar) {
        eVar.getClass();
        eVar2.getClass();
        dVar.getClass();
        super.a(eVar, eVar2, dVar);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new f0(20), 6, (Object) null);
        ((com.braze.events.d) eVar).b(new com.braze.events.internal.b(), com.braze.events.internal.b.class);
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final JSONObject b() {
        JSONObject jSONObjectB = super.b();
        if (jSONObjectB == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (Pair pair : this.f10355k) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", pair.f26485a);
                jSONArray.put(jSONObject);
            }
            String str = this.f10356b;
            if (str != null && !StringsKt.H(str)) {
                jSONObjectB.put("user_id", this.f10356b);
            }
            jSONObjectB.put("placements", jSONArray);
            return jSONObjectB;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new f0(18), 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.l;
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e eVar, com.braze.events.e eVar2, com.braze.models.response.g gVar) {
        eVar.getClass();
        eVar2.getClass();
        gVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new f0(19), 7, (Object) null);
        ((com.braze.events.d) eVar).b(new com.braze.events.internal.c(this), com.braze.events.internal.c.class);
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
        map.put("X-Braze-BannersRequest", "true");
    }
}
