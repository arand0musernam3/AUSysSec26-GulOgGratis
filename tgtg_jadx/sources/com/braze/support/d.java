package com.braze.support;

import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import m2.b2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f10754a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f10755b = d0.h("$add", "$remove", "$update", "$identifier_key", "$identifier_value", "$new_object");

    public static final String b(String str) {
        return a0.p("Custom attribute key cannot be blocklisted attribute: ", str, ".");
    }

    public static final boolean c(String str) {
        if (str != null) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f10754a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.e(18), 6, (Object) null);
        return false;
    }

    public static final String d(Object obj) {
        return r8.k.h(((JSONObject) obj).toString().length(), "JSON Object size (", " bytes) exceeds 76800");
    }

    public final Object a(Object obj, int i11) {
        obj.getClass();
        if ((obj instanceof Boolean) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof String) {
            return ValidationUtils.ensureBrazeFieldLength((String) obj);
        }
        if (obj instanceof Date) {
            try {
                return DateTimeUtils.formatDate$default((Date) obj, BrazeDateFormat.LONG, null, 2, null);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new b2((Date) obj, 2), 4, (Object) null);
                return null;
            }
        }
        if (obj instanceof JSONObject) {
            if (i11 == 0) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.toString().length() > 76800) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new bw.a(jSONObject, 10), 6, (Object) null);
                    return null;
                }
            }
            return a((JSONObject) obj, i11 + 1);
        }
        if (!(obj instanceof JSONArray)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new hw.b(obj, 5), 6, (Object) null);
            return null;
        }
        if (i11 == 0) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.toString().length() > 76800) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.g(0, jSONArray), 6, (Object) null);
                return null;
            }
        }
        return a((JSONArray) obj, i11 + 1);
    }

    public static final String b() {
        return "JSON Object nested too deep (limit 50). Returning null.";
    }

    public static final String b(Object obj) {
        return j4.s.j(obj, "Could not add unsupported custom attribute type with value: ");
    }

    public static final String d() {
        return "Custom attribute value cannot be null.";
    }

    public static final String c() {
        return "Custom attribute key cannot be null.";
    }

    public static final String c(Object obj) {
        return j4.s.j(obj, "Error parsing date ");
    }

    public final JSONObject a(JSONObject jSONObject, int i11) throws JSONException {
        if (i11 > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mw.e(17), 7, (Object) null);
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(next);
            d dVar = f10754a;
            if ((StringsKt.H(strEnsureBrazeFieldLength) | StringsKt.z(strEnsureBrazeFieldLength, "$", false) | StringsKt.z(strEnsureBrazeFieldLength, ".", false)) & (!f10755b.contains(strEnsureBrazeFieldLength))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dVar, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.d(next, 17), 6, (Object) null);
            }
            if (!StringsKt.H(strEnsureBrazeFieldLength)) {
                if (jSONObject.isNull(next)) {
                    jSONObject2.put(next, JSONObject.NULL);
                } else {
                    Object obj = jSONObject.get(next);
                    obj.getClass();
                    Object objA = dVar.a(obj, i11);
                    if (objA == null) {
                        return null;
                    }
                    jSONObject2.put(strEnsureBrazeFieldLength, objA);
                }
            }
        }
        return jSONObject2;
    }

    public static final String a(String str) {
        return a0.p("Nested Custom Attribute Key '", str, "' is invalid.");
    }

    public final JSONArray a(JSONArray jSONArray, int i11) throws JSONException {
        if (i11 > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mw.e(20), 7, (Object) null);
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i12 = 0; i12 < length; i12++) {
            Object obj = jSONArray.get(i12);
            obj.getClass();
            Object objA = a(obj, i11);
            if (objA == null) {
                return null;
            }
            jSONArray2.put(objA);
        }
        return jSONArray2;
    }

    public static final String a() {
        return "JSON Object nested too deep (limit 50). Returning null.";
    }

    public static final boolean a(String str, Set set) {
        set.getClass();
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f10754a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.e(19), 6, (Object) null);
            return false;
        }
        if (!set.contains(str)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f10754a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.d(str, 18), 6, (Object) null);
        return false;
    }

    public static final String a(Object obj) {
        return r8.k.h(((JSONArray) obj).toString().length(), "JSON Array size (", " bytes) exceeds 76800");
    }
}
