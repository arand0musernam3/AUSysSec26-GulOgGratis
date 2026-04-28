package com.braze.storage;

import android.content.Context;
import com.adyen.checkout.components.core.Address;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.Iterator;
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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f10695b = 3888000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2 f10696a;

    public t2(Context context, String str, String str2) {
        context.getClass();
        this.f10696a = new r2(context, str2, str);
        b();
    }

    public static final String c() {
        return "Push dedupe id is blank. Returning true.";
    }

    public final Map a() {
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map map;
        KClass orCreateKotlinClass;
        m90.f0 f0VarJ;
        r2 r2Var = this.f10696a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey), 12, (Object) null);
            return new LinkedHashMap();
        }
        try {
            Object data = r2Var.readData(dataStoreKey, "");
            data.getClass();
            String str = (String) data;
            if (StringsKt.H(str)) {
                return new LinkedHashMap();
            }
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            if (StringsKt.H(str)) {
                map = kotlin.collections.o0.f26530a;
                map.getClass();
            } else if (Intrinsics.areEqual(StringsKt.e0(str).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                map = kotlin.collections.o0.f26530a;
                map.getClass();
            } else {
                try {
                    orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
                } catch (Exception e5) {
                    e = e5;
                    dataStoreUtils = dataStoreUtils2;
                }
                try {
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
                        dataStoreUtils = dataStoreUtils2;
                        try {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) s2.f10687a, 6, (Object) null);
                            map = kotlin.collections.o0.f26530a;
                            map.getClass();
                        } catch (Exception e11) {
                            e = e11;
                            exc = e;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str), 4, (Object) null);
                            map = kotlin.collections.o0.f26530a;
                            map.getClass();
                        }
                    }
                    Object objB = n90.c.f30748d.b(f0VarJ, str);
                    objB.getClass();
                    map = (Map) objB;
                } catch (Exception e12) {
                    exc = e12;
                    dataStoreUtils = dataStoreUtils2;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str), 4, (Object) null);
                    map = kotlin.collections.o0.f26530a;
                    map.getClass();
                }
            }
            return TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
        } catch (Exception e13) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) new l0(dataStoreKey), 8, (Object) null);
            return new LinkedHashMap();
        }
    }

    public final void b() {
        String strC;
        long jNowInSeconds = DateTimeUtils.nowInSeconds() - f10695b;
        LinkedHashMap linkedHashMapM = kotlin.collections.x0.m(a());
        Iterator it = linkedHashMapM.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((Number) entry.getValue()).longValue() < jNowInSeconds) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new com.braze.c1(2, jNowInSeconds, entry), 6, (Object) null);
                it.remove();
            }
        }
        r2 r2Var = this.f10696a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new m90.f0(m90.r1.f29848a, m90.q0.f29842a, 1), linkedHashMapM);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = "{}";
            }
            r2Var.writeData(dataStoreKey, strC);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new r0(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String b(String str) {
        return w.a0.p("Push dedupe id ", str, " has already been seen. Returning false.");
    }

    public static final String a(Map.Entry entry, long j9) {
        return "Evicting push id key " + entry.getKey() + " based on cutoff: " + j9;
    }

    public final boolean a(String str) {
        String strC;
        str.getClass();
        if (StringsKt.H(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.l(28), 7, (Object) null);
            return true;
        }
        if (a().containsKey(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.m(str, 17), 7, (Object) null);
            return false;
        }
        b();
        LinkedHashMap linkedHashMapM = kotlin.collections.x0.m(a());
        linkedHashMapM.put(str, Long.valueOf(DateTimeUtils.nowInSeconds()));
        r2 r2Var = this.f10696a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey), 12, (Object) null);
            return true;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new m90.f0(m90.r1.f29848a, m90.q0.f29842a, 1), linkedHashMapM);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = "{}";
            }
            r2Var.writeData(dataStoreKey, strC);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new r0(dataStoreKey), 8, (Object) null);
        }
        return true;
    }
}
