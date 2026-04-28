package com.braze.managers;

import android.content.Context;
import com.adyen.checkout.components.core.Address;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.f2;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.i3;
import com.braze.storage.v2;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
import m90.r1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3 f10126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2 f10127b;

    public y0(Context context, String str, String str2, com.braze.events.d dVar, i3 i3Var) {
        context.getClass();
        str.getClass();
        dVar.getClass();
        i3Var.getClass();
        this.f10126a = i3Var;
        this.f10127b = new v2(context, str2, str);
        dVar.c(com.braze.events.internal.p.class, new qw.g(this, 3));
        c();
    }

    public static final String b(String str, long j9) {
        return "Adding push campaign to storage with uid " + str + " and time " + j9;
    }

    public final List a() {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map map;
        m90.f0 f0VarJ;
        try {
            v2 v2Var = this.f10127b;
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object data = v2Var.readData(dataStoreKey, "");
                    data.getClass();
                    String str = (String) data;
                    if (StringsKt.H(str)) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                        if (StringsKt.H(str)) {
                            map = kotlin.collections.o0.f26530a;
                            map.getClass();
                        } else if (Intrinsics.areEqual(StringsKt.e0(str).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                            map = kotlin.collections.o0.f26530a;
                            map.getClass();
                        } else {
                            try {
                                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
                                try {
                                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                        o30.f0.R(StringCompanionObject.INSTANCE);
                                        r1 r1Var = r1.f29848a;
                                        f0VarJ = o30.f0.j(r1Var, r1Var);
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                                        o30.f0.R(StringCompanionObject.INSTANCE);
                                        r1 r1Var2 = r1.f29848a;
                                        o30.f0.Q(LongCompanionObject.INSTANCE);
                                        f0VarJ = o30.f0.j(r1Var2, m90.q0.f29842a);
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                                        o30.f0.R(StringCompanionObject.INSTANCE);
                                        r1 r1Var3 = r1.f29848a;
                                        o30.f0.M(BooleanCompanionObject.INSTANCE);
                                        f0VarJ = o30.f0.j(r1Var3, m90.g.f29797a);
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                                        o30.f0.R(StringCompanionObject.INSTANCE);
                                        r1 r1Var4 = r1.f29848a;
                                        o30.f0.P(IntCompanionObject.INSTANCE);
                                        f0VarJ = o30.f0.j(r1Var4, m90.l0.f29821a);
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                                        o30.f0.R(StringCompanionObject.INSTANCE);
                                        r1 r1Var5 = r1.f29848a;
                                        o30.f0.N(DoubleCompanionObject.INSTANCE);
                                        f0VarJ = o30.f0.j(r1Var5, m90.v.f29868a);
                                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                        o30.f0.R(StringCompanionObject.INSTANCE);
                                        r1 r1Var6 = r1.f29848a;
                                        o30.f0.O(FloatCompanionObject.INSTANCE);
                                        f0VarJ = o30.f0.j(r1Var6, m90.c0.f29762a);
                                    } else {
                                        dataStoreUtils = dataStoreUtils2;
                                        try {
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) x0.f10124a, 6, (Object) null);
                                            map = kotlin.collections.o0.f26530a;
                                            map.getClass();
                                        } catch (Exception e5) {
                                            e = e5;
                                            exc = e;
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str), 4, (Object) null);
                                            map = kotlin.collections.o0.f26530a;
                                            map.getClass();
                                        }
                                    }
                                    Object objB = n90.c.f30748d.b(f0VarJ, str);
                                    objB.getClass();
                                    map = (Map) objB;
                                } catch (Exception e11) {
                                    exc = e11;
                                    dataStoreUtils = dataStoreUtils2;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str), 4, (Object) null);
                                    map = kotlin.collections.o0.f26530a;
                                    map.getClass();
                                }
                            } catch (Exception e12) {
                                e = e12;
                                dataStoreUtils = dataStoreUtils2;
                            }
                        }
                        linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                    }
                } catch (Exception e13) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) new com.braze.storage.l0(dataStoreKey), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new w0((String) entry.getKey(), ((Number) entry.getValue()).longValue()));
            }
            return arrayList;
        } catch (Exception e14) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e14, false, (Function0) new zv.r(19), 4, (Object) null);
            return kotlin.collections.n0.f26529a;
        }
    }

    public final void c() {
        String strC;
        long jNowInSeconds = DateTimeUtils.nowInSeconds() - 3888000;
        List listA = a();
        ArrayList<w0> arrayList = new ArrayList();
        for (Object obj : listA) {
            if (((w0) obj).b() >= jNowInSeconds) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != listA.size()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new yl.e(21, listA, arrayList), 7, (Object) null);
            int iA = kotlin.collections.w0.a(kotlin.collections.e0.o(arrayList, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (w0 w0Var : arrayList) {
                linkedHashMap.put(w0Var.a(), Long.valueOf(w0Var.b()));
            }
            boolean zIsEmpty = linkedHashMap.isEmpty();
            v2 v2Var = this.f10127b;
            if (zIsEmpty) {
                v2Var.clearData(DataStoreKey.PUSH_MAX_CAMPAIGNS);
                return;
            }
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey), 12, (Object) null);
                return;
            }
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    n90.b bVar = n90.c.f30748d;
                    bVar.getClass();
                    strC = bVar.c(new m90.f0(r1.f29848a, m90.q0.f29842a, 1), linkedHashMap);
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                    strC = "{}";
                }
                v2Var.writeData(dataStoreKey, strC);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new com.braze.storage.r0(dataStoreKey), 8, (Object) null);
            }
        }
    }

    public static final String b(String str) {
        return e0.f.k("Adding push campaign to storage with uid ", str);
    }

    public static final String b() {
        return "Error reading push max campaign data from DataStore.";
    }

    public final void a(String str) {
        str.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xv.a(str, 24), 7, (Object) null);
        if (StringsKt.H(str)) {
            return;
        }
        a(str, DateTimeUtils.nowInSeconds());
    }

    public static final String a(List list, List list2) {
        return r8.k.h(list.size() - list2.size(), "Pruning ", " expired campaigns");
    }

    public final void a(String str, long j9) {
        String strC;
        str.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new f2(1, j9, str), 7, (Object) null);
        List<w0> listA = a();
        int iA = kotlin.collections.w0.a(kotlin.collections.e0.o(listA, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (w0 w0Var : listA) {
            linkedHashMap.put(w0Var.a(), Long.valueOf(w0Var.b()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(str, Long.valueOf(j9));
        v2 v2Var = this.f10127b;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new m90.f0(r1.f29848a, m90.q0.f29842a, 1), linkedHashMap2);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = "{}";
            }
            v2Var.writeData(dataStoreKey, strC);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new com.braze.storage.r0(dataStoreKey), 8, (Object) null);
        }
    }

    public static final void a(y0 y0Var, com.braze.events.internal.p pVar) {
        pVar.getClass();
        y0Var.f10127b.writeData(DataStoreKey.PUSH_MAX_LAST_UPDATE, Long.valueOf(pVar.f9819a));
    }
}
