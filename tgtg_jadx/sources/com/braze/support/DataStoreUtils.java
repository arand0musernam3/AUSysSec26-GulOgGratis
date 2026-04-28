package com.braze.support;

import com.adyen.checkout.components.core.Address;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import m90.c0;
import m90.f0;
import m90.l0;
import m90.q0;
import m90.r1;
import zendesk.faye.internal.Bayeux;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0006\u0010\u0007\u001a\u0002H\u0006H\u0086\b¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00060\n\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00060\r\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\bJ9\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00060\n\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0086\b¨\u0006\u0012"}, d2 = {"Lcom/braze/support/DataStoreUtils;", "", "<init>", "()V", "toJsonString", "", "T", Bayeux.KEY_DATA, "(Ljava/lang/Object;)Ljava/lang/String;", "jsonStringToStringMap", "", "jsonString", "jsonStringToList", "", "stringToMap", "string", "entryDelimiter", "keyValueDelimiter", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataStoreUtils {
    public static final DataStoreUtils INSTANCE = new DataStoreUtils();

    private DataStoreUtils() {
    }

    public static Map stringToMap$default(DataStoreUtils dataStoreUtils, String str, String str2, String str3, int i11, Object obj) {
        Object obj2;
        if ((i11 & 2) != 0) {
            str2 = MessageLogView.COMMA_SEPARATOR;
        }
        if ((i11 & 4) != 0) {
            str3 = ":";
        }
        str.getClass();
        str2.getClass();
        str3.getClass();
        if (StringsKt.H(str)) {
            o0 o0Var = o0.f26530a;
            o0Var.getClass();
            return o0Var;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{str2}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(e0.o(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.e0((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (((String) obj3).length() > 0) {
                    arrayList2.add(obj3);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                List listSplit$default2 = StringsKt__StringsKt.split$default((String) it2.next(), new String[]{str3}, false, 2, 2, null);
                ArrayList arrayList3 = new ArrayList(e0.o(listSplit$default2, 10));
                Iterator it3 = listSplit$default2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(StringsKt.e0((String) it3.next()).toString());
                }
                String str4 = (String) arrayList3.get(0);
                String str5 = (String) arrayList3.get(1);
                Intrinsics.reifiedOperationMarker(4, "T");
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                    Intrinsics.reifiedOperationMarker(1, "T");
                    obj2 = str5;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    Integer intOrNull = StringsKt.toIntOrNull(str5);
                    Intrinsics.reifiedOperationMarker(2, "T");
                    obj2 = intOrNull;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    Long lD0 = StringsKt.d0(str5);
                    Intrinsics.reifiedOperationMarker(2, "T");
                    obj2 = lD0;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    Double dF = kotlin.text.x.f(str5);
                    Intrinsics.reifiedOperationMarker(2, "T");
                    obj2 = dF;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                    Float fG = kotlin.text.x.g(str5);
                    Intrinsics.reifiedOperationMarker(2, "T");
                    obj2 = fG;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    Boolean boolC0 = StringsKt.c0(str5);
                    Intrinsics.reifiedOperationMarker(2, "T");
                    obj2 = boolC0;
                } else {
                    obj2 = null;
                }
                if (obj2 != null) {
                    linkedHashMap.put(str4, obj2);
                }
            }
            return linkedHashMap;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new h(str), 4, (Object) null);
            return linkedHashMap;
        }
    }

    public final <T> List<T> jsonStringToList(String jsonString) {
        jsonString.getClass();
        if (StringsKt.H(jsonString)) {
            return n0.f26529a;
        }
        if (Intrinsics.areEqual(StringsKt.e0(jsonString).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
            return n0.f26529a;
        }
        try {
            n90.b bVar = n90.c.f30748d;
            i2.x xVar = bVar.f30750b;
            Intrinsics.reifiedOperationMarker(6, "T");
            MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
            return (List) bVar.b(new m90.d(ba0.g.H(xVar, null), 0), jsonString);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new e(jsonString), 4, (Object) null);
            return n0.f26529a;
        }
    }

    public final <T> Map<String, T> jsonStringToStringMap(String jsonString) {
        Map<String, T> map;
        f0 f0VarJ;
        jsonString.getClass();
        if (StringsKt.H(jsonString)) {
            o0 o0Var = o0.f26530a;
            o0Var.getClass();
            return o0Var;
        }
        if (Intrinsics.areEqual(StringsKt.e0(jsonString).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
            o0 o0Var2 = o0.f26530a;
            o0Var2.getClass();
            return o0Var2;
        }
        try {
            Intrinsics.reifiedOperationMarker(4, "T");
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                o30.f0.R(StringCompanionObject.INSTANCE);
                r1 r1Var = r1.f29848a;
                f0VarJ = o30.f0.j(r1Var, r1Var);
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                o30.f0.R(StringCompanionObject.INSTANCE);
                r1 r1Var2 = r1.f29848a;
                o30.f0.Q(LongCompanionObject.INSTANCE);
                f0VarJ = o30.f0.j(r1Var2, q0.f29842a);
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                o30.f0.R(StringCompanionObject.INSTANCE);
                r1 r1Var3 = r1.f29848a;
                o30.f0.M(BooleanCompanionObject.INSTANCE);
                f0VarJ = o30.f0.j(r1Var3, m90.g.f29797a);
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                o30.f0.R(StringCompanionObject.INSTANCE);
                r1 r1Var4 = r1.f29848a;
                o30.f0.P(IntCompanionObject.INSTANCE);
                f0VarJ = o30.f0.j(r1Var4, l0.f29821a);
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                o30.f0.R(StringCompanionObject.INSTANCE);
                r1 r1Var5 = r1.f29848a;
                o30.f0.N(DoubleCompanionObject.INSTANCE);
                f0VarJ = o30.f0.j(r1Var5, m90.v.f29868a);
            } else {
                if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    BrazeLogger.Priority priority = BrazeLogger.Priority.E;
                    Intrinsics.needClassReification();
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) g.f10759a, 6, (Object) null);
                    o0 o0Var3 = o0.f26530a;
                    o0Var3.getClass();
                    return o0Var3;
                }
                o30.f0.R(StringCompanionObject.INSTANCE);
                r1 r1Var6 = r1.f29848a;
                o30.f0.O(FloatCompanionObject.INSTANCE);
                f0VarJ = o30.f0.j(r1Var6, c0.f29762a);
            }
            Object objB = n90.c.f30748d.b(f0VarJ, jsonString);
            objB.getClass();
            map = (Map) objB;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new f(jsonString), 4, (Object) null);
            map = o0.f26530a;
            map.getClass();
        }
        return map;
    }

    public final <T> Map<String, T> stringToMap(String string, String entryDelimiter, String keyValueDelimiter) {
        Object obj;
        string.getClass();
        entryDelimiter.getClass();
        keyValueDelimiter.getClass();
        if (StringsKt.H(string)) {
            o0 o0Var = o0.f26530a;
            o0Var.getClass();
            return o0Var;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{entryDelimiter}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(e0.o(listSplit$default, 10));
            Iterator<T> it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(StringsKt.e0((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((String) obj2).length() > 0) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                List listSplit$default2 = StringsKt__StringsKt.split$default((String) it2.next(), new String[]{keyValueDelimiter}, false, 2, 2, null);
                ArrayList arrayList3 = new ArrayList(e0.o(listSplit$default2, 10));
                Iterator<T> it3 = listSplit$default2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(StringsKt.e0((String) it3.next()).toString());
                }
                String str = (String) arrayList3.get(0);
                String str2 = (String) arrayList3.get(1);
                Intrinsics.reifiedOperationMarker(4, "T");
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                    Intrinsics.reifiedOperationMarker(1, "T");
                    obj = str2;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                    Integer intOrNull = StringsKt.toIntOrNull(str2);
                    Intrinsics.reifiedOperationMarker(2, "T");
                    obj = intOrNull;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                    Long lD0 = StringsKt.d0(str2);
                    Intrinsics.reifiedOperationMarker(2, "T");
                    obj = lD0;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                    Double dF = kotlin.text.x.f(str2);
                    Intrinsics.reifiedOperationMarker(2, "T");
                    obj = dF;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                    Float fG = kotlin.text.x.g(str2);
                    Intrinsics.reifiedOperationMarker(2, "T");
                    obj = fG;
                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    Boolean boolC0 = StringsKt.c0(str2);
                    Intrinsics.reifiedOperationMarker(2, "T");
                    obj = boolC0;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    linkedHashMap.put(str, obj);
                }
            }
            return linkedHashMap;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new h(string), 4, (Object) null);
            return linkedHashMap;
        }
    }

    public final <T> String toJsonString(T data) {
        try {
            n90.b bVar = n90.c.f30748d;
            i2.x xVar = bVar.f30750b;
            Intrinsics.reifiedOperationMarker(6, "T");
            MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
            return bVar.c(ba0.g.H(xVar, null), data);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) i.f10761a, 4, (Object) null);
            return (!(data instanceof Map) && (data instanceof List)) ? "[]" : "{}";
        }
    }
}
