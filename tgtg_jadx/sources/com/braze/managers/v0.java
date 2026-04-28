package com.braze.managers;

import android.content.Context;
import com.adyen.checkout.components.core.Address;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.o2;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
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
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f10099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o2 f10101c;

    public v0(Context context, String str) {
        Map linkedHashMap;
        Map map;
        Map map2;
        m90.f0 f0VarJ;
        context.getClass();
        str.getClass();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f10099a = reentrantLock;
        ArrayList arrayList = new ArrayList();
        this.f10100b = arrayList;
        o2 o2Var = new o2(context, str);
        this.f10101c = o2Var;
        reentrantLock.lock();
        try {
            arrayList.clear();
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object data = o2Var.readData(dataStoreKey, "");
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
                                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) s0.f10090a, 6, (Object) null);
                                    map2 = kotlin.collections.o0.f26530a;
                                    map2.getClass();
                                    map = map2;
                                }
                                Object objB = n90.c.f30748d.b(f0VarJ, str2);
                                objB.getClass();
                                map2 = (Map) objB;
                                map = map2;
                            } catch (Exception e5) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                                map = kotlin.collections.o0.f26530a;
                                map.getClass();
                            }
                        }
                        linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                    }
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new com.braze.storage.l0(dataStoreKey), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                this.f10100b.add(new com.braze.models.push.a((String) entry.getKey(), ((Number) entry.getValue()).longValue()));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(ArrayList arrayList) {
        Map linkedHashMap;
        Map map;
        m90.f0 f0VarJ;
        String strC;
        arrayList.getClass();
        ReentrantLock reentrantLock = this.f10099a;
        reentrantLock.lock();
        try {
            o2 o2Var = this.f10101c;
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object data = o2Var.readData(dataStoreKey, "");
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
                                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) u0.f10096a, 6, (Object) null);
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
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new com.braze.storage.l0(dataStoreKey), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            Map map2 = linkedHashMap;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.braze.models.push.a aVar = (com.braze.models.push.a) it.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.textcell.c(aVar, 13), 7, (Object) null);
                map2.remove(aVar.f());
            }
            o2 o2Var2 = this.f10101c;
            DataStoreKey dataStoreKey2 = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey2), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    try {
                        n90.b bVar = n90.c.f30748d;
                        bVar.getClass();
                        strC = bVar.c(new m90.f0(r1.f29848a, m90.q0.f29842a, 1), map2);
                    } catch (Exception e12) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                        strC = (!(map2 instanceof Map) && (map2 instanceof List)) ? "[]" : "{}";
                    }
                    o2Var2.writeData(dataStoreKey2, strC);
                } catch (Exception e13) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) new com.braze.storage.r0(dataStoreKey2), 8, (Object) null);
                }
            }
            this.f10100b.removeAll(arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new cw.a(arrayList, 11), 7, (Object) null);
        ReentrantLock reentrantLock = this.f10099a;
        reentrantLock.lock();
        try {
            this.f10100b.addAll(arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String b(String str) {
        return e0.f.k("Adding push campaign to storage with uid ", str);
    }

    public final void a(String str) throws Throwable {
        Map linkedHashMap;
        Map map;
        m90.f0 f0VarJ;
        String strC;
        str.getClass();
        ReentrantLock reentrantLock = this.f10099a;
        reentrantLock.lock();
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xv.a(str, 20), 7, (Object) null);
            try {
                long jNowInSeconds = DateTimeUtils.nowInSeconds();
                o2 o2Var = this.f10101c;
                DataStoreKey dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
                if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                    BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                } else {
                    try {
                        Object data = o2Var.readData(dataStoreKey, "");
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
                                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
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
                                        try {
                                            BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) t0.f10094a, 6, (Object) null);
                                            map = kotlin.collections.o0.f26530a;
                                            map.getClass();
                                        } catch (Exception e5) {
                                            e = e5;
                                            dataStoreUtils = dataStoreUtils;
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                                            map = kotlin.collections.o0.f26530a;
                                            map.getClass();
                                        }
                                    }
                                    Object objB = n90.c.f30748d.b(f0VarJ, str2);
                                    objB.getClass();
                                    map = (Map) objB;
                                } catch (Exception e11) {
                                    e = e11;
                                }
                            }
                            linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                        }
                    } catch (Exception e12) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) new com.braze.storage.l0(dataStoreKey), 8, (Object) null);
                        linkedHashMap = new LinkedHashMap();
                    }
                }
                linkedHashMap.put(str, Long.valueOf(jNowInSeconds));
                o2 o2Var2 = this.f10101c;
                DataStoreKey dataStoreKey2 = DataStoreKey.PUSH_DELIVERY_EVENTS;
                if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey2), 12, (Object) null);
                } else {
                    try {
                        DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                        try {
                            n90.b bVar = n90.c.f30748d;
                            bVar.getClass();
                            strC = bVar.c(new m90.f0(r1.f29848a, m90.q0.f29842a, 1), linkedHashMap);
                        } catch (Exception e13) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                            strC = "{}";
                        }
                        o2Var2.writeData(dataStoreKey2, strC);
                    } catch (Exception e14) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e14, false, (Function0) new com.braze.storage.r0(dataStoreKey2), 8, (Object) null);
                    }
                }
                this.f10100b.add(new com.braze.models.push.a(str, jNowInSeconds));
                reentrantLock.unlock();
            } catch (Throwable th2) {
                th = th2;
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final String a(List list) {
        return "Re-adding PDEs to storage: " + list;
    }

    public static final String a(com.braze.models.push.a aVar) {
        return e0.f.k("Clearing PDE from storage with uid ", aVar.f());
    }
}
