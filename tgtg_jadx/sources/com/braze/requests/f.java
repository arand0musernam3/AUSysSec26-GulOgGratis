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
public final class f extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f10382k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10383m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f10384n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i3 i3Var, String str, long j9, long j11, String str2, int i11, c cVar) {
        super(new com.braze.requests.util.d(r8.k.l(str, "content_cards/sync")), str2, i3Var, cVar);
        i3Var.getClass();
        str.getClass();
        cVar.getClass();
        this.f10382k = j9;
        this.l = j11;
        this.f10383m = i11;
        this.f10384n = n.f10449d;
    }

    public static final String l() {
        return "Experienced JSONException while creating Content Cards request. Returning null.";
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(HashMap map) {
        map.getClass();
        super.a(map);
        map.put("X-Braze-DataRequest", "true");
        map.put("X-Braze-ContentCardsRequest", "true");
        map.put("BRAZE-SYNC-RETRY-COUNT", String.valueOf(this.f10383m));
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final JSONObject b() {
        JSONObject jSONObjectB = super.b();
        if (jSONObjectB == null) {
            return null;
        }
        try {
            jSONObjectB.put("last_full_sync_at", this.l);
            jSONObjectB.put("last_card_updated_at", this.f10382k);
            String str = this.f10356b;
            if (str != null && !StringsKt.H(str)) {
                jSONObjectB.put("user_id", this.f10356b);
                return jSONObjectB;
            }
            return jSONObjectB;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new hw.f(0), 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.f10384n;
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        return false;
    }
}
