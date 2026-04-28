package com.braze.requests;

import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DeviceKey;
import com.braze.enums.SdkFlavor;
import com.braze.events.internal.c0;
import com.braze.events.internal.d0;
import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.braze.models.outgoing.k f10434k;
    public SdkFlavor l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.braze.models.outgoing.l f10435m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public com.braze.models.b f10436n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EnumSet f10437o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f10438p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f10439q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f10440r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i3 i3Var, String str, com.braze.models.outgoing.k kVar) {
        super(new com.braze.requests.util.d(r8.k.l(str, Bayeux.KEY_DATA)), (String) null, i3Var, 10);
        i3Var.getClass();
        str.getClass();
        kVar.getClass();
        this.f10434k = kVar;
        this.f10440r = n.f10451f;
    }

    public static final String d() {
        return "Remote notifications enabled field set on request, but push token field not set. Not sending remote notifications enabled field.";
    }

    public static final String l() {
        return "Experienced JSONException while retrieving parameters. Returning empty object.";
    }

    public static final String m() {
        return "Trigger dispatch completed. Alerting subscribers.";
    }

    @Override // com.braze.requests.o
    public final boolean a() {
        ArrayList<com.braze.models.m> arrayList = new ArrayList();
        arrayList.add(this.f10363i);
        arrayList.add(this.f10435m);
        arrayList.add(this.f10436n);
        arrayList.add(this.f10434k);
        if (!arrayList.isEmpty()) {
            for (com.braze.models.m mVar : arrayList) {
                if (mVar != null && !mVar.isEmpty()) {
                    return false;
                }
            }
        }
        ArrayList<com.braze.models.m> arrayList2 = new ArrayList();
        arrayList2.add(this.f10363i);
        for (com.braze.models.m mVar2 : arrayList2) {
            if (mVar2 != null && !mVar2.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final JSONObject b() {
        com.braze.models.outgoing.l lVar;
        com.braze.models.outgoing.h hVar = this.f10363i;
        if (hVar == null || !hVar.getJsonObject().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey()) || ((lVar = this.f10435m) != null && lVar.f10209a.has(DataStoreKey.PUSH_TOKEN.getKey()))) {
            com.braze.models.outgoing.h hVar2 = this.f10363i;
            if (hVar2 != null) {
                hVar2.f10200m = true;
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hw.f(1), 7, (Object) null);
            com.braze.models.outgoing.h hVar3 = this.f10363i;
            if (hVar3 != null) {
                hVar3.f10200m = false;
            }
        }
        JSONObject jSONObjectB = super.b();
        if (jSONObjectB == null) {
            return null;
        }
        try {
            String str = this.f10438p;
            if (str != null) {
                jSONObjectB.put("app_version", str);
            }
            String str2 = this.f10439q;
            if (str2 != null && !StringsKt.H(str2)) {
                jSONObjectB.put("app_version_code", this.f10439q);
            }
            com.braze.models.outgoing.l lVar2 = this.f10435m;
            if (lVar2 != null && !lVar2.isEmpty()) {
                JSONArray jSONArray = lVar2.f10210b;
                jSONArray.getClass();
                jSONObjectB.put("attributes", jSONArray);
            }
            com.braze.models.b bVar = this.f10436n;
            if (bVar != null && !bVar.f10134b) {
                jSONObjectB.put("events", JsonUtils.constructJsonArray(bVar.f10133a));
            }
            SdkFlavor sdkFlavor = this.l;
            if (sdkFlavor != null) {
                jSONObjectB.put("sdk_flavor", sdkFlavor.getJsonObject());
            }
            EnumSet enumSet = this.f10437o;
            if (enumSet != null) {
                BrazeSdkMetadata.Companion.getClass();
                ArrayList arrayList = new ArrayList(e0.o(enumSet, 10));
                Iterator it = enumSet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((BrazeSdkMetadata) it.next()).jsonKey);
                }
                jSONObjectB.put("sdk_metadata", new JSONArray((Collection) CollectionsKt.k0(arrayList)));
            }
            jSONObjectB.put("respond_with", this.f10434k.getJsonObject());
            return jSONObjectB;
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new hw.f(2), 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.requests.o
    public final n c() {
        return this.f10440r;
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.d dVar) {
        dVar.getClass();
        if (this.f10434k.c()) {
            dVar.b(new d0(this), d0.class);
        }
    }

    @Override // com.braze.requests.b, com.braze.requests.p
    public final void a(com.braze.events.e eVar) {
        eVar.getClass();
        if (this.f10434k.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hw.f(3), 7, (Object) null);
            ((com.braze.events.d) eVar).b(new c0(this), c0.class);
        }
    }

    @Override // com.braze.requests.b, com.braze.requests.o
    public final void a(HashMap map) {
        map.getClass();
        super.a(map);
        if (!this.f10434k.isEmpty() && this.f10434k.c()) {
            map.put("X-Braze-TriggersRequest", "true");
            map.put("X-Braze-DataRequest", "true");
        }
    }
}
