package com.braze.storage;

import android.content.Context;
import com.adyen.checkout.components.core.Address;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3 f10644a;

    public o3(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        this.f10644a = new k3(context, str, str2);
    }

    public static final String b() {
        return "Could not create new mutable session for open session.";
    }

    public static final String d() {
        return "Failed to set end time to now for session json data";
    }

    public final void a(com.braze.models.p pVar) {
        Map linkedHashMap;
        Map map;
        m90.f0 f0VarJ;
        String strC;
        pVar.getClass();
        String string = pVar.f().toString();
        JSONObject jsonObject = pVar.getJsonObject();
        a(jsonObject);
        k3 k3Var = this.f10644a;
        DataStoreKey dataStoreKey = DataStoreKey.SESSION_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = k3Var.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (StringsKt.H(str)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str)) {
                        map = kotlin.collections.o0.f26530a;
                        map.getClass();
                    } else if (Intrinsics.areEqual(StringsKt.e0(str).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                        map = kotlin.collections.o0.f26530a;
                        map.getClass();
                    } else {
                        try {
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
                            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                m90.r1 r1Var = m90.r1.f29848a;
                                f0VarJ = o30.f0.j(r1Var, r1Var);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                m90.r1 r1Var2 = m90.r1.f29848a;
                                o30.f0.Q(LongCompanionObject.INSTANCE);
                                f0VarJ = o30.f0.j(r1Var2, m90.q0.f29842a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                m90.r1 r1Var3 = m90.r1.f29848a;
                                o30.f0.M(BooleanCompanionObject.INSTANCE);
                                f0VarJ = o30.f0.j(r1Var3, m90.g.f29797a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                m90.r1 r1Var4 = m90.r1.f29848a;
                                o30.f0.P(IntCompanionObject.INSTANCE);
                                f0VarJ = o30.f0.j(r1Var4, m90.l0.f29821a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                m90.r1 r1Var5 = m90.r1.f29848a;
                                o30.f0.N(DoubleCompanionObject.INSTANCE);
                                f0VarJ = o30.f0.j(r1Var5, m90.v.f29868a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                m90.r1 r1Var6 = m90.r1.f29848a;
                                o30.f0.O(FloatCompanionObject.INSTANCE);
                                f0VarJ = o30.f0.j(r1Var6, m90.c0.f29762a);
                            } else {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) n3.f10636a, 6, (Object) null);
                                map = kotlin.collections.o0.f26530a;
                                map.getClass();
                            }
                            Object objB = n90.c.f30748d.b(f0VarJ, str);
                            objB.getClass();
                            map = (Map) objB;
                        } catch (Exception e5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.support.f(str), 4, (Object) null);
                            map = kotlin.collections.o0.f26530a;
                            map.getClass();
                        }
                    }
                    linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new l0(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        LinkedHashMap linkedHashMapM = kotlin.collections.x0.m(linkedHashMap);
        linkedHashMapM.put(string, jsonObject.toString());
        k3 k3Var2 = this.f10644a;
        DataStoreKey dataStoreKey2 = DataStoreKey.SESSION_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey2), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                try {
                    n90.b bVar = n90.c.f30748d;
                    bVar.getClass();
                    m90.r1 r1Var7 = m90.r1.f29848a;
                    strC = bVar.c(new m90.f0(r1Var7, r1Var7, 1), linkedHashMapM);
                } catch (Exception e12) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                    strC = "{}";
                }
                k3Var2.writeData(dataStoreKey2, strC);
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) new r0(dataStoreKey2), 8, (Object) null);
            }
        }
        boolean zH = pVar.h();
        k3 k3Var3 = this.f10644a;
        if (!zH) {
            k3Var3.writeData(DataStoreKey.CURRENT_OPEN_SESSION_ID, string);
            return;
        }
        DataStoreKey dataStoreKey3 = DataStoreKey.CURRENT_OPEN_SESSION_ID;
        if (Intrinsics.areEqual(k3Var3.readString(dataStoreKey3, ""), string)) {
            this.f10644a.clearData(dataStoreKey3);
        }
    }

    public final com.braze.models.p c() {
        Map linkedHashMap;
        Map map;
        m90.f0 f0VarJ;
        String str = "";
        k3 k3Var = this.f10644a;
        DataStoreKey dataStoreKey = DataStoreKey.CURRENT_OPEN_SESSION_ID;
        if (!k3Var.contains(dataStoreKey)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.l(16), 7, (Object) null);
            return null;
        }
        try {
            String string = this.f10644a.readString(dataStoreKey, "");
            k3 k3Var2 = this.f10644a;
            DataStoreKey dataStoreKey2 = DataStoreKey.SESSION_STORAGE_MAP;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey2), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object data = k3Var2.readData(dataStoreKey2, "");
                    data.getClass();
                    String str2 = (String) data;
                    if (StringsKt.H(str2)) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        if (StringsKt.H(str2)) {
                            map = kotlin.collections.o0.f26530a;
                            map.getClass();
                        } else if (Intrinsics.areEqual(StringsKt.e0(str2).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                            map = kotlin.collections.o0.f26530a;
                            map.getClass();
                        } else {
                            try {
                                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
                                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                    o30.f0.R(StringCompanionObject.INSTANCE);
                                    m90.r1 r1Var = m90.r1.f29848a;
                                    f0VarJ = o30.f0.j(r1Var, r1Var);
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                    o30.f0.R(StringCompanionObject.INSTANCE);
                                    m90.r1 r1Var2 = m90.r1.f29848a;
                                    o30.f0.Q(LongCompanionObject.INSTANCE);
                                    f0VarJ = o30.f0.j(r1Var2, m90.q0.f29842a);
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                    o30.f0.R(StringCompanionObject.INSTANCE);
                                    m90.r1 r1Var3 = m90.r1.f29848a;
                                    o30.f0.M(BooleanCompanionObject.INSTANCE);
                                    f0VarJ = o30.f0.j(r1Var3, m90.g.f29797a);
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                    o30.f0.R(StringCompanionObject.INSTANCE);
                                    m90.r1 r1Var4 = m90.r1.f29848a;
                                    o30.f0.P(IntCompanionObject.INSTANCE);
                                    f0VarJ = o30.f0.j(r1Var4, m90.l0.f29821a);
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                                    o30.f0.R(StringCompanionObject.INSTANCE);
                                    m90.r1 r1Var5 = m90.r1.f29848a;
                                    o30.f0.N(DoubleCompanionObject.INSTANCE);
                                    f0VarJ = o30.f0.j(r1Var5, m90.v.f29868a);
                                } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                    o30.f0.R(StringCompanionObject.INSTANCE);
                                    m90.r1 r1Var6 = m90.r1.f29848a;
                                    o30.f0.O(FloatCompanionObject.INSTANCE);
                                    f0VarJ = o30.f0.j(r1Var6, m90.c0.f29762a);
                                } else {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) m3.f10630a, 6, (Object) null);
                                    map = kotlin.collections.o0.f26530a;
                                    map.getClass();
                                }
                                Object objB = n90.c.f30748d.b(f0VarJ, str2);
                                objB.getClass();
                                map = (Map) objB;
                            } catch (Exception e5) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                                map = kotlin.collections.o0.f26530a;
                                map.getClass();
                            }
                        }
                        linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                    }
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new l0(dataStoreKey2), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            String str3 = (String) linkedHashMap.get(string);
            if (str3 != null) {
                str = str3;
            }
            return new com.braze.models.p(new JSONObject(str));
        } catch (JSONException e12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) new lw.l(17), 4, (Object) null);
            return null;
        }
    }

    public static final String a() {
        return "No stored open session in storage.";
    }

    public final void a(String str) {
        Map linkedHashMap;
        Map map;
        m90.f0 f0VarJ;
        String strC;
        str.getClass();
        k3 k3Var = this.f10644a;
        DataStoreKey dataStoreKey = DataStoreKey.SESSION_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = k3Var.readData(dataStoreKey, "");
                data.getClass();
                String str2 = (String) data;
                if (StringsKt.H(str2)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str2)) {
                        map = kotlin.collections.o0.f26530a;
                        map.getClass();
                    } else if (Intrinsics.areEqual(StringsKt.e0(str2).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                        map = kotlin.collections.o0.f26530a;
                        map.getClass();
                    } else {
                        try {
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
                            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                m90.r1 r1Var = m90.r1.f29848a;
                                f0VarJ = o30.f0.j(r1Var, r1Var);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                m90.r1 r1Var2 = m90.r1.f29848a;
                                o30.f0.Q(LongCompanionObject.INSTANCE);
                                f0VarJ = o30.f0.j(r1Var2, m90.q0.f29842a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                m90.r1 r1Var3 = m90.r1.f29848a;
                                o30.f0.M(BooleanCompanionObject.INSTANCE);
                                f0VarJ = o30.f0.j(r1Var3, m90.g.f29797a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                m90.r1 r1Var4 = m90.r1.f29848a;
                                o30.f0.P(IntCompanionObject.INSTANCE);
                                f0VarJ = o30.f0.j(r1Var4, m90.l0.f29821a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                m90.r1 r1Var5 = m90.r1.f29848a;
                                o30.f0.N(DoubleCompanionObject.INSTANCE);
                                f0VarJ = o30.f0.j(r1Var5, m90.v.f29868a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                m90.r1 r1Var6 = m90.r1.f29848a;
                                o30.f0.O(FloatCompanionObject.INSTANCE);
                                f0VarJ = o30.f0.j(r1Var6, m90.c0.f29762a);
                            } else {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) l3.f10620a, 6, (Object) null);
                                map = kotlin.collections.o0.f26530a;
                                map.getClass();
                            }
                            Object objB = n90.c.f30748d.b(f0VarJ, str2);
                            objB.getClass();
                            map = (Map) objB;
                        } catch (Exception e5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                            map = kotlin.collections.o0.f26530a;
                            map.getClass();
                        }
                    }
                    linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new l0(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        LinkedHashMap linkedHashMapM = kotlin.collections.x0.m(linkedHashMap);
        linkedHashMapM.remove(str);
        k3 k3Var2 = this.f10644a;
        DataStoreKey dataStoreKey2 = DataStoreKey.SESSION_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey2), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                try {
                    n90.b bVar = n90.c.f30748d;
                    bVar.getClass();
                    m90.r1 r1Var7 = m90.r1.f29848a;
                    strC = bVar.c(new m90.f0(r1Var7, r1Var7, 1), linkedHashMapM);
                } catch (Exception e12) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                    strC = "{}";
                }
                k3Var2.writeData(dataStoreKey2, strC);
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) new r0(dataStoreKey2), 8, (Object) null);
            }
        }
        k3 k3Var3 = this.f10644a;
        DataStoreKey dataStoreKey3 = DataStoreKey.CURRENT_OPEN_SESSION_ID;
        if (Intrinsics.areEqual(str, k3Var3.readString(dataStoreKey3, null))) {
            this.f10644a.clearData(dataStoreKey3);
        }
    }

    public final void a(JSONObject jSONObject) {
        jSONObject.getClass();
        if (jSONObject.has("end_time")) {
            return;
        }
        try {
            jSONObject.put("end_time", DateTimeUtils.nowInSecondsPrecise());
        } catch (JSONException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new lw.l(18), 4, (Object) null);
        }
    }
}
