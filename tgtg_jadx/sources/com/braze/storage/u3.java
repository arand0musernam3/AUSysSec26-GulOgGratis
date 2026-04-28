package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u3 extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.managers.q0 f10704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c3 f10705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t0 f10706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v3 f10707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f10708f;

    public u3(Context context, com.braze.managers.q0 q0Var, c3 c3Var, t0 t0Var, String str, String str2) {
        context.getClass();
        q0Var.getClass();
        c3Var.getClass();
        t0Var.getClass();
        this.f10704b = q0Var;
        this.f10705c = c3Var;
        this.f10706d = t0Var;
        this.f10707e = new v3(context, str, str2);
        this.f10708f = str;
    }

    public static final String d(String str, Object obj) {
        return "Failed to write to user object json from DataStore with key: [" + str + "] value: [" + obj + "]";
    }

    public static final String e() {
        return "No push token available to add to attributes object.";
    }

    public static final String f() {
        return "Couldn't add push token to outbound json";
    }

    public static final String i() {
        return "Failed to add merged custom attributes back to user object.";
    }

    public static final String k() {
        return "Push token cache cleared via sendPushTokenOnNextExport.";
    }

    @Override // com.braze.storage.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(com.braze.models.outgoing.l lVar, boolean z11) {
        u3 u3Var;
        lVar.getClass();
        JSONObject jSONObject = lVar.f10209a;
        if (z11) {
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_TOKEN;
            if (jSONObject.has(dataStoreKey.getKey())) {
                v3 v3Var = this.f10707e;
                String strOptString = jSONObject.optString("push_token");
                strOptString.getClass();
                v3Var.writeData(dataStoreKey, strOptString);
                return;
            }
            return;
        }
        JSONObject jSONObjectH = h();
        JSONObject jSONObjectPlus = JsonUtils.plus(jSONObject, jSONObjectH);
        jSONObjectPlus.remove("push_token");
        JSONObject jSONObjectOptJSONObject = jSONObjectH.optJSONObject("custom");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("custom");
        try {
        } catch (JSONException e5) {
            u3Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) u3Var, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.p(3), 4, (Object) null);
        }
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject2 != null) {
            jSONObjectPlus.put("custom", JsonUtils.plus(jSONObjectOptJSONObject2, jSONObjectOptJSONObject));
        } else {
            if (jSONObjectOptJSONObject == null) {
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectPlus.put("custom", jSONObjectOptJSONObject2);
                }
                u3Var = this;
                v3 v3Var2 = u3Var.f10707e;
                DataStoreKey dataStoreKey2 = DataStoreKey.SERIALIZED_USER_OBJECT;
                String string = jSONObjectPlus.toString();
                string.getClass();
                v3Var2.writeData(dataStoreKey2, string);
            }
            jSONObjectPlus.put("custom", jSONObjectOptJSONObject);
        }
        u3Var = this;
        v3 v3Var22 = u3Var.f10707e;
        DataStoreKey dataStoreKey22 = DataStoreKey.SERIALIZED_USER_OBJECT;
        String string2 = jSONObjectPlus.toString();
        string2.getClass();
        v3Var22.writeData(dataStoreKey22, string2);
    }

    public final void b(JSONObject jSONObject) {
        JSONObject jSONObjectH = h();
        try {
            if (jSONObject == null) {
                jSONObjectH.put("ab_install_attribution", JSONObject.NULL);
            } else {
                JSONObject jSONObjectOptJSONObject = jSONObjectH.optJSONObject("ab_install_attribution");
                if (jSONObjectOptJSONObject != null) {
                    jSONObjectH.put("ab_install_attribution", JsonUtils.plus(jSONObjectOptJSONObject, jSONObject));
                } else {
                    jSONObjectH.put("ab_install_attribution", jSONObject);
                }
            }
            c(jSONObjectH);
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new bw.a(jSONObject, 9), 4, (Object) null);
        }
    }

    public final boolean c(JSONObject jSONObject) {
        if (this.f10705c.a() || this.f10706d.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new jt.g(this, 25), 6, (Object) null);
            return false;
        }
        v3 v3Var = this.f10707e;
        DataStoreKey dataStoreKey = DataStoreKey.SERIALIZED_USER_OBJECT;
        String string = jSONObject.toString();
        string.getClass();
        v3Var.writeData(dataStoreKey, string);
        return true;
    }

    public final JSONObject g() {
        JSONObject jSONObjectH = h();
        if (jSONObjectH.has("custom")) {
            try {
                JSONObject jSONObject = jSONObjectH.getJSONObject("custom");
                jSONObject.getClass();
                return jSONObject;
            } catch (JSONException e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.p(4), 4, (Object) null);
            }
        }
        return new JSONObject();
    }

    public final JSONObject h() {
        String string = this.f10707e.readString(DataStoreKey.SERIALIZED_USER_OBJECT, null);
        if (string == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.m(string, 19), 4, (Object) null);
            return new JSONObject();
        }
    }

    public final synchronized void j() {
        try {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new lw.p(5), 6, (Object) null);
                this.f10707e.clearData(DataStoreKey.PUSH_TOKEN);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // com.braze.storage.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final com.braze.models.outgoing.l c() {
        StringUtils.ifNonEmpty(this.f10708f, new jd.a(this, 20));
        JSONObject jSONObjectH = h();
        a(jSONObjectH);
        this.f10707e.clearData(DataStoreKey.SERIALIZED_USER_OBJECT);
        return new com.braze.models.outgoing.l(jSONObjectH);
    }

    public static final String d() {
        return "Could not create custom attributes json object from DataStore.";
    }

    public final boolean c(String str, Object obj) {
        Object obj2;
        str.getClass();
        JSONObject jSONObjectH = h();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.z1(obj, 8, str), 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        jSONObjectH.put(str, obj2);
        return c(jSONObjectH);
    }

    public static final String b(String str, Object obj) {
        return "Could not write to custom attributes json object with key: [" + str + "] value: [" + obj + "]";
    }

    public static final String a(String str) {
        return e0.f.k("Failed to load user object json from DataStore with json string: ", str);
    }

    public final void a(JSONObject jSONObject) {
        jSONObject.getClass();
        try {
            String strB = ((com.braze.managers.z0) this.f10704b).b();
            if (strB == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.p(6), 7, (Object) null);
            } else {
                if (Intrinsics.areEqual(strB, this.f10707e.readString(DataStoreKey.PUSH_TOKEN, null))) {
                    return;
                }
                jSONObject.put("push_token", strB);
            }
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.p(7), 4, (Object) null);
        }
    }

    public static final Unit a(u3 u3Var, String str) {
        str.getClass();
        u3Var.c("user_id", str);
        return Unit.f26487a;
    }

    public static final String a(u3 u3Var) {
        return "SDK delayed initialization mode: " + u3Var.f10706d.c() + " and GDPR disabled mode: " + u3Var.f10705c.a() + ". Not writing to user cache.";
    }

    public static final String a(String str, JSONObject jSONObject) {
        return "Failed to write to user object json from DataStore with key: [" + str + "] value: [" + jSONObject + "] ";
    }

    public final boolean a(String str, Object obj) {
        Object obj2;
        str.getClass();
        JSONObject jSONObjectG = g();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.z1(obj, 7, str), 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        jSONObjectG.put(str, obj2);
        return c("custom", jSONObjectG);
    }
}
