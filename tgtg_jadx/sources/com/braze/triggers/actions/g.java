package com.braze.triggers.actions;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import m90.z;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.triggers.config.c f10799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.braze.triggers.utils.b f10801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f10802e;

    public g(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        ArrayList arrayList = new ArrayList();
        this.f10802e = arrayList;
        this.f10798a = jSONObject.getString("id");
        this.f10799b = new com.braze.triggers.config.c(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("trigger_condition");
        if (jSONArray.length() > 0) {
            arrayList.addAll(com.braze.triggers.utils.c.a(jSONArray));
        }
        this.f10800c = jSONObject.optBoolean("prefetch", true);
    }

    public static final String a(g gVar, com.braze.triggers.events.b bVar) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("Triggered action ", gVar.f10798a, " not eligible to be triggered by ", bVar.a(), " event. Current device time outside triggered action time window.");
    }

    public final boolean b(com.braze.triggers.events.b bVar) {
        bVar.getClass();
        if ((this.f10799b.f10823a != -1 && DateTimeUtils.nowInSeconds() <= this.f10799b.f10823a) || (this.f10799b.f10824b != -1 && DateTimeUtils.nowInSeconds() >= this.f10799b.f10824b)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z(21, this, bVar), 7, (Object) null);
            return false;
        }
        Iterator it = this.f10802e.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (((com.braze.triggers.conditions.d) it.next()).a(bVar)) {
                break;
            }
            i11++;
        }
        return i11 != -1;
    }

    public final String c() {
        return this.f10798a;
    }

    public final com.braze.triggers.config.c d() {
        return this.f10799b;
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public JSONObject getKey() {
        try {
            JSONObject key = this.f10799b.getKey();
            if (key == null) {
                return null;
            }
            key.put("id", this.f10798a);
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f10802e.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.braze.triggers.conditions.d) it.next()).getKey());
            }
            key.put("trigger_condition", jSONArray);
            key.put("prefetch", this.f10800c);
            return key;
        } catch (JSONException unused) {
            return null;
        }
    }
}
