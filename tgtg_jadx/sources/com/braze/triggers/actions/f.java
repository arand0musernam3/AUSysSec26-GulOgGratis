package com.braze.triggers.actions;

import android.content.Context;
import com.braze.managers.r;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.requests.y;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import m2.b2;
import n80.p;
import o80.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r8.k;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f10794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f10795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f10796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f10797j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(JSONObject jSONObject, r rVar) throws JSONException {
        super(jSONObject);
        jSONObject.getClass();
        rVar.getClass();
        this.f10796i = new ArrayList();
        this.f10797j = -1L;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new bw.a(jSONObject, 18), 7, (Object) null);
        this.f10794g = rVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject(Bayeux.KEY_DATA);
        this.f10795h = jSONObject2.getString(InAppMessageBase.TRIGGER_ID);
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("prefetch_image_urls");
        if (jSONArrayOptJSONArray != null) {
            a(jSONArrayOptJSONArray, com.braze.triggers.enums.b.IMAGE);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("prefetch_zip_urls");
        if (jSONArrayOptJSONArray2 != null) {
            a(jSONArrayOptJSONArray2, com.braze.triggers.enums.b.ZIP);
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray("prefetch_file_urls");
        if (jSONArrayOptJSONArray3 != null) {
            a(jSONArrayOptJSONArray3, com.braze.triggers.enums.b.FILE);
        }
    }

    public static final String e() {
        return "Could not convert TemplatedTriggeredAction to JSON";
    }

    public final void a(JSONArray jSONArray, com.braze.triggers.enums.b bVar) {
        s sVarM = o80.r.m(o80.r.h(CollectionsKt.F(p.j(0, jSONArray.length())), new d(jSONArray)), new e(jSONArray));
        Iterator it = sVarM.f32132a.iterator();
        while (it.hasNext()) {
            this.f10796i.add(new com.braze.triggers.utils.a(bVar, (String) sVarM.f32133b.invoke(it.next())));
        }
    }

    @Override // com.braze.triggers.actions.a
    public final ArrayList b() {
        return new ArrayList(this.f10796i);
    }

    public final String f() {
        return this.f10795h;
    }

    @Override // com.braze.triggers.actions.g, com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final JSONObject getJsonObject() {
        try {
            JSONObject jsonObject = super.getJsonObject();
            if (jsonObject == null) {
                return null;
            }
            jsonObject.put("type", "templated_iam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InAppMessageBase.TRIGGER_ID, this.f10795h);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            for (com.braze.triggers.utils.a aVar : this.f10796i) {
                int iOrdinal = aVar.f10885a.ordinal();
                if (iOrdinal == 0) {
                    jSONArray2.put(aVar.f10886b);
                } else if (iOrdinal == 1) {
                    jSONArray.put(aVar.f10886b);
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jSONArray3.put(aVar.f10886b);
                }
            }
            jSONObject.put("prefetch_image_urls", jSONArray);
            jSONObject.put("prefetch_zip_urls", jSONArray2);
            jSONObject.put("prefetch_file_urls", jSONArray3);
            jsonObject.put(Bayeux.KEY_DATA, jSONObject);
            return jsonObject;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new n90.p(26), 4, (Object) null);
            return null;
        }
    }

    public final long g() {
        return this.f10797j;
    }

    @Override // com.braze.triggers.actions.a
    public final void a(Context context, com.braze.events.e eVar, com.braze.triggers.events.b bVar, long j9) {
        context.getClass();
        eVar.getClass();
        bVar.getClass();
        this.f10797j = j9;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b2(this, 9), 7, (Object) null);
        r rVar = this.f10794g;
        rVar.getClass();
        rVar.a(new y(rVar.f10072f, rVar.f10071e.getBaseUrlForRequests(), this, bVar, rVar.f10068b));
    }

    public static final String a(f fVar) {
        return k.h(fVar.d().d(), "Posting templating request after delay of ", " seconds.");
    }

    public static final String a(JSONObject jSONObject) {
        return e0.f.k("Parsing templated triggered action with JSON: ", JsonUtils.getPrettyPrintedString(jSONObject));
    }
}
