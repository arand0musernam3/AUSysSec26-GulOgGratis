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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f10692c = 604800000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f10693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e90.a f10694b;

    public t1(Context context, String str, String str2) throws Throwable {
        context.getClass();
        str2.getClass();
        this.f10693a = new v1(context, str, str2);
        this.f10694b = e90.d.a();
        b();
    }

    public final Map a() {
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map map;
        KClass orCreateKotlinClass;
        m90.f0 f0VarJ;
        v1 v1Var = this.f10693a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey), 12, (Object) null);
            return new LinkedHashMap();
        }
        try {
            Object data = v1Var.readData(dataStoreKey, "");
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
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) s1.f10686a, 6, (Object) null);
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

    public final void b() throws Throwable {
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        for (Map.Entry entry : a().entrySet()) {
            try {
                if (jNowInMilliseconds >= ((Number) entry.getValue()).longValue()) {
                    v80.f0.E(kotlin.coroutines.g.f26549a, new r1(this, (String) entry.getKey(), null));
                }
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new jt.g(entry, 24), 4, (Object) null);
                v80.f0.E(kotlin.coroutines.g.f26549a, new r1(this, (String) entry.getKey(), null));
            }
        }
    }

    public static final String b(com.braze.models.k kVar) {
        return "Event already seen in cache. Ignoring duplicate: " + kVar;
    }

    public static final void a(t1 t1Var, Map map) {
        String strC;
        v1 v1Var = t1Var.f10693a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new m90.f0(m90.r1.f29848a, m90.q0.f29842a, 1), map);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = "{}";
            }
            v1Var.writeData(dataStoreKey, strC);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new r0(dataStoreKey), 8, (Object) null);
        }
    }

    public final boolean a(com.braze.models.k kVar) throws Throwable {
        kVar.getClass();
        if (((com.braze.models.outgoing.event.b) kVar).f10178a != com.braze.enums.d.f9713h) {
            return true;
        }
        b();
        String strA = p1.a(kVar);
        if (a().containsKey(strA)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.n(kVar, 1), 7, (Object) null);
            return false;
        }
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds() + f10692c;
        strA.getClass();
        v80.f0.E(kotlin.coroutines.g.f26549a, new q1(this, strA, jNowInMilliseconds, null));
        return true;
    }

    public static final String a(Map.Entry entry) {
        return "Failed to get expiration time. Deleting entry: " + entry;
    }
}
