package com.braze.support;

import a3.l0;
import android.os.Bundle;
import c5.l3;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import h7.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m0;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\u001aC\u0010\u0002\u001a\u0002H\u0003\"\u0010\b\u0000\u0010\u0003*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00030\t2\u0006\u0010\n\u001a\u0002H\u0003¢\u0006\u0002\u0010\u000b\u001a8\u0010\u0002\u001a\u0002H\u0003\"\u0010\b\u0000\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\n\u001a\u0002H\u0003H\u0086\b¢\u0006\u0002\u0010\f\u001a2\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\u0010\b\u0000\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\r\u001a\u001c\u0010\u000e\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0010*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u00120\u0011\u001a\u001b\u0010\u000e\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u0013¢\u0006\u0002\u0010\u0014\u001a\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u001a\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0018\u001a\u0018\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u001a*\u0004\u0018\u00010\u0006\u001a\u0012\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c*\u0004\u0018\u00010\u000f\u001a\u0016\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006\u001a\u0015\u0010 \u001a\u00020\u0006*\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0086\u0002\u001a\f\u0010\"\u001a\u00020\u0001*\u0004\u0018\u00010\u0006\u001a\f\u0010\"\u001a\u00020\u0001*\u0004\u0018\u00010\u000f\u001a\u001d\u0010#\u001a\u0004\u0018\u00010$*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010%\u001a\u001a\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0006\u001a\u0016\u0010*\u001a\u00020'*\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\n\u0010+\u001a\u00020\u0006*\u00020\u0006\u001a\f\u0010,\u001a\u00020-*\u0004\u0018\u00010\u0001\u001a\u001d\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00100/\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u0004\u0018\u00010\u000fH\u0086\n\u001a\u001b\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00100/\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u0006H\u0086\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"TAG", "", "optEnum", "TargetEnum", "", "jsonObject", "Lorg/json/JSONObject;", "key", "targetEnumClass", "Ljava/lang/Class;", "defaultEnum", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Enum;", "constructJsonArray", "Lorg/json/JSONArray;", "T", "", "Lcom/braze/models/IPutIntoJson;", "", "([Ljava/lang/Object;)Lorg/json/JSONArray;", "getOptionalString", "getDoubleOrNull", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Double;", "convertJSONObjectToMap", "", "convertStringJsonArrayToList", "", "mergeJsonObjects", "oldJson", "newJson", "plus", "otherJson", "getPrettyPrintedString", "getColorIntegerOrNull", "", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "areJsonObjectsEqual", "", "target", "source", "isEqualTo", "deepcopy", "parseJsonObjectIntoBundle", "Landroid/os/Bundle;", "iterator", "", "android-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JsonUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("JsonUtils");

    public static final boolean areJsonObjectsEqual(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null || jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                return false;
            }
            Object objOpt = jSONObject.opt(next);
            Object objOpt2 = jSONObject2.opt(next);
            if ((objOpt instanceof JSONObject) && (objOpt2 instanceof JSONObject)) {
                if (!isEqualTo((JSONObject) objOpt, (JSONObject) objOpt2)) {
                    return false;
                }
            } else if (objOpt != null && objOpt2 != null && !Intrinsics.areEqual(objOpt, objOpt2)) {
                return false;
            }
        }
        return true;
    }

    public static final <T> JSONArray constructJsonArray(Collection<? extends IPutIntoJson<T>> collection) {
        collection.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends IPutIntoJson<T>> it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getJsonObject());
        }
        return jSONArray;
    }

    public static final Map<String, String> convertJSONObjectToMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            o0 o0Var = o0.f26530a;
            o0Var.getClass();
            return o0Var;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, jSONObject.getString(next));
        }
        return linkedHashMap;
    }

    public static final List<String> convertStringJsonArrayToList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    String string = jSONArray.getString(i11);
                    string.getClass();
                    arrayList.add(string);
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new l0(i11, jSONArray, 6), 8, (Object) null);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String convertStringJsonArrayToList$lambda$1(int i11, JSONArray jSONArray) {
        return "Failed to get string for item at index: " + i11 + " and array: " + jSONArray;
    }

    public static final JSONObject deepcopy(JSONObject jSONObject) {
        jSONObject.getClass();
        return new JSONObject(jSONObject.toString());
    }

    public static final Integer getColorIntegerOrNull(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        if (str != null && jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (Throwable th2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th2, false, (Function0) new m60.a(21), 8, (Object) null);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getColorIntegerOrNull$lambda$8() {
        return "Failed to retrieve color integer from JSON";
    }

    public static final Double getDoubleOrNull(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return Double.valueOf(jSONObject.optDouble(str));
    }

    public static final String getOptionalString(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public static final String getPrettyPrintedString(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        try {
            return jSONObject.toString(2);
        } catch (Throwable th2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th2, false, (Function0) new m60.a(18), 8, (Object) null);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getPrettyPrintedString$lambda$6() {
        return "Caught Throwable while generating pretty printed json. Returning blank string.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getPrettyPrintedString$lambda$7() {
        return "Caught Throwable while generating pretty printed json. Returning blank string.";
    }

    public static final boolean isEqualTo(JSONObject jSONObject, JSONObject jSONObject2) {
        return areJsonObjectsEqual(jSONObject, jSONObject2);
    }

    public static final <T> Iterator<T> iterator(JSONArray jSONArray) {
        if (jSONArray == null) {
            n0.f26529a.getClass();
            return m0.f26528a;
        }
        l3 l3VarF = CollectionsKt.F(n80.p.j(0, jSONArray.length()));
        Intrinsics.needClassReification();
        o80.f fVarH = o80.r.h(l3VarF, new t(jSONArray));
        Intrinsics.needClassReification();
        return new h0(o80.r.m(fVarH, new u(jSONArray)));
    }

    public static final JSONObject mergeJsonObjects(JSONObject jSONObject, JSONObject jSONObject2) {
        jSONObject.getClass();
        jSONObject2.getClass();
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject3.put(next, jSONObject.get(next));
            } catch (JSONException e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new mw.d(next, 5), 8, (Object) null);
            }
        }
        Iterator<String> itKeys2 = jSONObject2.keys();
        itKeys2.getClass();
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            try {
                jSONObject3.put(next2, jSONObject2.get(next2));
            } catch (JSONException e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new mw.d(next2, 6), 8, (Object) null);
            }
        }
        return jSONObject3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mergeJsonObjects$lambda$3$lambda$2(String str) {
        return e0.f.k("Caught exception merging JSON for old key ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mergeJsonObjects$lambda$5$lambda$4(String str) {
        return e0.f.k("Caught exception merging JSON for new key ", str);
    }

    public static final /* synthetic */ <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jSONObject, String str, TargetEnum targetenum) {
        jSONObject.getClass();
        str.getClass();
        targetenum.getClass();
        try {
            k kVar = k.f10763a;
            String string = jSONObject.getString(str);
            string.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            string.toUpperCase(locale).getClass();
            Intrinsics.reifiedOperationMarker(5, "TargetEnum");
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused) {
            return targetenum;
        }
    }

    public static final Bundle parseJsonObjectIntoBundle(String str) {
        Bundle bundle = new Bundle();
        if (str != null && !StringsKt.H(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new m60.a(19), 8, (Object) null);
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseJsonObjectIntoBundle$lambda$10() {
        return "Unable parse JSON into a bundle.";
    }

    public static final JSONObject plus(JSONObject jSONObject, JSONObject jSONObject2) {
        jSONObject.getClass();
        jSONObject2.getClass();
        return mergeJsonObjects(jSONObject, jSONObject2);
    }

    public static final <T> JSONArray constructJsonArray(T[] tArr) {
        tArr.getClass();
        JSONArray jSONArray = new JSONArray();
        for (T t9 : tArr) {
            jSONArray.put(t9);
        }
        return jSONArray;
    }

    public static final String getPrettyPrintedString(JSONArray jSONArray) {
        if (jSONArray == null) {
            return "";
        }
        try {
            return jSONArray.toString(2);
        } catch (Throwable th2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th2, false, (Function0) new m60.a(20), 8, (Object) null);
            return "";
        }
    }

    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jSONObject, String str, Class<TargetEnum> cls, TargetEnum targetenum) {
        TargetEnum targetenum2;
        jSONObject.getClass();
        str.getClass();
        cls.getClass();
        try {
            String string = jSONObject.getString(str);
            string.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = string.toUpperCase(locale);
            upperCase.getClass();
            upperCase.getClass();
            cls.getClass();
            targetenum2 = (TargetEnum) Enum.valueOf(cls, upperCase);
        } catch (Exception unused) {
        }
        return targetenum2 == null ? targetenum : targetenum2;
    }

    public static final /* synthetic */ <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        str.getClass();
        try {
            k kVar = k.f10763a;
            String string = jSONObject.getString(str);
            string.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            string.toUpperCase(locale).getClass();
            Intrinsics.reifiedOperationMarker(5, "TargetEnum");
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused) {
            return null;
        }
    }

    public static final <T> Iterator<T> iterator(JSONObject jSONObject) {
        jSONObject.getClass();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        o80.a aVarB = o80.o.b(itKeys);
        Intrinsics.needClassReification();
        o80.f fVarH = o80.r.h(aVarB, new v(jSONObject));
        Intrinsics.needClassReification();
        return new h0(o80.r.m(fVarH, new w(jSONObject)));
    }
}
