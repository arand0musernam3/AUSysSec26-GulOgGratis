package com.braze.triggers.actions;

import android.content.Context;
import com.braze.enums.inappmessage.MessageType;
import com.braze.events.internal.m;
import com.braze.managers.r;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n90.p;
import org.json.JSONException;
import org.json.JSONObject;
import r8.k;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InAppMessageBase f10789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JSONObject f10790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f10791i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(JSONObject jSONObject, r rVar) throws JSONException {
        super(jSONObject);
        jSONObject.getClass();
        rVar.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new bw.a(jSONObject, 17), 6, (Object) null);
        JSONObject jSONObject2 = jSONObject.getJSONObject(Bayeux.KEY_DATA);
        this.f10791i = rVar;
        this.f10790h = jSONObject2;
        jSONObject2.getClass();
        InAppMessageBase inAppMessageBaseA = s.a(jSONObject2, rVar);
        this.f10789g = inAppMessageBaseA;
        if (inAppMessageBaseA != null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new p(23), 6, (Object) null);
        i4.a.f(e0.f.k("Failed to parse in-app message triggered action with JSON: ", JsonUtils.getPrettyPrintedString(jSONObject)));
        throw null;
    }

    public static final String c(com.braze.triggers.events.b bVar) {
        return "Cannot perform triggered action for " + bVar + " due to in-app message json being null";
    }

    public static final String d(com.braze.triggers.events.b bVar) {
        return "Cannot perform triggered action for " + bVar + " due to deserialized in-app message being null";
    }

    public static final String e() {
        return "In-app message has no remote assets for prefetch. Returning empty list.";
    }

    public static final String f() {
        return "Failed to parse in-app message triggered action.";
    }

    public static final String g() {
        return "Caught exception while performing triggered action.";
    }

    @Override // com.braze.triggers.actions.a
    public final void a(Context context, com.braze.events.e eVar, com.braze.triggers.events.b bVar, long j9) {
        context.getClass();
        eVar.getClass();
        bVar.getClass();
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ow.a(this, 0), 7, (Object) null);
            JSONObject jSONObject = this.f10790h;
            if (jSONObject == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ow.b(bVar, 0), 6, (Object) null);
                return;
            }
            InAppMessageBase inAppMessageBaseA = s.a(jSONObject, this.f10791i);
            String strA = bVar.a();
            int i11 = com.braze.triggers.events.h.f10845e;
            if (Intrinsics.areEqual(strA, "test")) {
                if (inAppMessageBaseA != null) {
                    inAppMessageBaseA.setTestSend(true);
                }
                this.f10790h.put("is_test_send", true);
            }
            if (inAppMessageBaseA == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ow.b(bVar, 1), 6, (Object) null);
                return;
            }
            inAppMessageBaseA.setLocalPrefetchedAssetPaths(x0.k(this.f10803f));
            inAppMessageBaseA.setExpirationTimestamp(j9);
            ((com.braze.events.d) eVar).b(new m(bVar, this, inAppMessageBaseA, this.f10791i.f10068b), m.class);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new p(24), 4, (Object) null);
        }
    }

    @Override // com.braze.triggers.actions.a
    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        InAppMessageBase inAppMessageBase = this.f10789g;
        List<String> remoteAssetPathsForPrefetch = inAppMessageBase != null ? inAppMessageBase.getRemoteAssetPathsForPrefetch() : null;
        if (remoteAssetPathsForPrefetch == null || remoteAssetPathsForPrefetch.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new p(25), 7, (Object) null);
            return arrayList;
        }
        InAppMessageBase inAppMessageBase2 = this.f10789g;
        MessageType messageType = inAppMessageBase2 != null ? inAppMessageBase2.getMessageType() : null;
        int i11 = messageType == null ? -1 : b.f10788a[messageType.ordinal()];
        if (i11 == 1) {
            arrayList.add(new com.braze.triggers.utils.a(com.braze.triggers.enums.b.ZIP, remoteAssetPathsForPrefetch.get(0)));
            return arrayList;
        }
        if (i11 == 2 || i11 == 3 || i11 == 4) {
            arrayList.add(new com.braze.triggers.utils.a(com.braze.triggers.enums.b.IMAGE, remoteAssetPathsForPrefetch.get(0)));
            return arrayList;
        }
        if (i11 != 5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ow.a(this, 1), 6, (Object) null);
            return arrayList;
        }
        Iterator<String> it = remoteAssetPathsForPrefetch.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.braze.triggers.utils.a(com.braze.triggers.enums.b.FILE, it.next()));
        }
        return arrayList;
    }

    @Override // com.braze.triggers.actions.g, com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: forJsonPut */
    public final Object getJsonObject() {
        try {
            JSONObject jsonObject = super.getJsonObject();
            if (jsonObject != null) {
                InAppMessageBase inAppMessageBase = this.f10789g;
                jsonObject.put(Bayeux.KEY_DATA, inAppMessageBase != null ? inAppMessageBase.getJsonObject() : null);
                jsonObject.put("type", "inapp");
                return jsonObject;
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public static final String a(JSONObject jSONObject) {
        return e0.f.k("Attempting to parse in-app message triggered action with JSON: ", JsonUtils.getPrettyPrintedString(jSONObject));
    }

    public static final String a(c cVar) {
        InAppMessageBase inAppMessageBase = cVar.f10789g;
        return "Failed to return remote paths to assets for type: " + (inAppMessageBase != null ? inAppMessageBase.getMessageType() : null);
    }

    public static final String b(c cVar) {
        return k.h(cVar.d().d(), "Attempting to publish in-app message after delay of ", " seconds.");
    }
}
