package com.braze.triggers.managers;

import com.adyen.checkout.components.core.Address;
import com.braze.c1;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.k0;
import com.braze.storage.r0;
import com.braze.storage.t3;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.e0;
import kotlin.collections.o0;
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
import m2.b2;
import m90.c0;
import m90.f0;
import m90.l0;
import m90.q0;
import m90.r1;
import m90.v;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3 f10882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f10883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f10884c;

    public h(t3 t3Var) {
        t3Var.getClass();
        this.f10882a = t3Var;
        this.f10883b = a();
        this.f10884c = new LinkedHashMap();
    }

    public static final String b(long j9, com.braze.triggers.config.a aVar) {
        return "Trigger action is re-eligible for display since " + (DateTimeUtils.nowInSeconds() - j9) + " seconds have passed since the last time it was triggered (minimum interval: " + ((com.braze.triggers.config.b) aVar).d() + ").";
    }

    public static final String c(com.braze.triggers.actions.a aVar) {
        return a0.p("Triggered action id ", ((com.braze.triggers.actions.g) aVar).c(), " no longer eligible due to having been triggered in the past and is only eligible once.");
    }

    public final Map a() {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map map;
        KClass orCreateKotlinClass;
        f0 f0VarJ;
        t3 t3Var = this.f10882a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = t3Var.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (StringsKt.H(str)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str)) {
                        map = o0.f26530a;
                        map.getClass();
                    } else if (Intrinsics.areEqual(StringsKt.e0(str).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                        map = o0.f26530a;
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
                                f0VarJ = o30.f0.j(r1Var5, v.f29868a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                r1 r1Var6 = r1.f29848a;
                                o30.f0.O(FloatCompanionObject.INSTANCE);
                                f0VarJ = o30.f0.j(r1Var6, c0.f29762a);
                            } else {
                                dataStoreUtils = dataStoreUtils2;
                                try {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) g.f10881a, 6, (Object) null);
                                    map = o0.f26530a;
                                    map.getClass();
                                } catch (Exception e11) {
                                    e = e11;
                                    exc = e;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str), 4, (Object) null);
                                    map = o0.f26530a;
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
                            map = o0.f26530a;
                            map.getClass();
                        }
                    }
                    linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                }
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) new com.braze.storage.l0(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        Map map2 = linkedHashMap;
        if (map2.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.c(13), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b2(map2, 23), 7, (Object) null);
            Iterator it = map2.entrySet().iterator();
            while (it.hasNext()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.e((String) ((Map.Entry) it.next()).getKey(), 5), 7, (Object) null);
            }
        }
        return map2;
    }

    public final void d(com.braze.triggers.actions.a aVar) {
        String strC;
        aVar.getClass();
        com.braze.triggers.actions.g gVar = (com.braze.triggers.actions.g) aVar;
        if (gVar.d().e().e()) {
            this.f10883b.remove(gVar.c());
        } else {
            Long l = (Long) this.f10884c.get(gVar.c());
            long jLongValue = l != null ? l.longValue() : 0L;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c1(3, jLongValue, gVar), 7, (Object) null);
            this.f10883b.put(gVar.c(), Long.valueOf(jLongValue));
        }
        t3 t3Var = this.f10882a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        Map map = this.f10883b;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new f0(r1.f29848a, q0.f29842a, 1), map);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) i.f10761a, 4, (Object) null);
                strC = (!(map instanceof Map) && (map instanceof List)) ? "[]" : "{}";
            }
            t3Var.writeData(dataStoreKey, strC);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new r0(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String c(String str) {
        return a0.p("Retrieving triggered action id ", str, " eligibility information from DataStore.");
    }

    public static final String b(com.braze.triggers.actions.a aVar) {
        return a0.p("Triggered action id ", ((com.braze.triggers.actions.g) aVar).c(), " always eligible via never having been triggered. Returning true for eligibility status");
    }

    public static final String b(String str) {
        return a0.p("Deleting outdated triggered action id ", str, " from stored re-eligibility list.");
    }

    public static final String b(com.braze.triggers.actions.a aVar, long j9) {
        return "Resetting re-eligibility for action Id " + ((com.braze.triggers.actions.g) aVar).c() + " to " + j9;
    }

    public static final String b(Map map) {
        return k.h(map.size(), "Retrieved ", " trigger re-eligibility entries from DataStore");
    }

    public static final String b() {
        return "No trigger re-eligibility information found in DataStore";
    }

    public static final String a(String str) {
        return a0.p("Retaining triggered action ", str, " in re-eligibility list.");
    }

    public static final String a(Map map) {
        return k.h(map.size(), "Successfully updated re-eligibility map in DataStore with ", " entries");
    }

    public static final String a(com.braze.triggers.actions.a aVar) {
        return a0.p("Triggered action id ", ((com.braze.triggers.actions.g) aVar).c(), " always eligible via configuration. Returning true for eligibility status");
    }

    public static final String a(long j9, com.braze.triggers.config.a aVar) {
        return "Trigger action is not re-eligible for display since only " + (DateTimeUtils.nowInSeconds() - j9) + " seconds have passed since the last time it was triggered (minimum interval: " + ((com.braze.triggers.config.b) aVar).d() + ").";
    }

    public final void a(com.braze.triggers.actions.h hVar, long j9) {
        String strC;
        hVar.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.h(hVar, j9, 1), 7, (Object) null);
        LinkedHashMap linkedHashMap = this.f10884c;
        String strC2 = hVar.c();
        Long l = (Long) this.f10883b.get(hVar.c());
        linkedHashMap.put(strC2, Long.valueOf(l != null ? l.longValue() : 0L));
        this.f10883b.put(hVar.c(), Long.valueOf(j9));
        t3 t3Var = this.f10882a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        Map map = this.f10883b;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new f0(r1.f29848a, q0.f29842a, 1), map);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) i.f10761a, 4, (Object) null);
                strC = (!(map instanceof Map) && (map instanceof List)) ? "[]" : "{}";
            }
            t3Var.writeData(dataStoreKey, strC);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new r0(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String a(com.braze.triggers.actions.a aVar, long j9) {
        StringBuilder sbN = b3.i.n(j9, "Updating re-eligibility for action Id ", ((com.braze.triggers.actions.g) aVar).c(), " to time ");
        sbN.append(".");
        return sbN.toString();
    }

    public final boolean a(com.braze.triggers.actions.g gVar) {
        gVar.getClass();
        final com.braze.triggers.config.b bVar = gVar.f10799b.f10828f;
        if (bVar.f10822a == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.a(gVar, 7), 7, (Object) null);
            return true;
        }
        if (!this.f10883b.containsKey(gVar.f10798a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.a(gVar, 8), 7, (Object) null);
            return true;
        }
        if (bVar.e()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.a(gVar, 9), 7, (Object) null);
            return false;
        }
        Long l = (Long) this.f10883b.get(gVar.f10798a);
        final long jLongValue = l != null ? l.longValue() : 0L;
        long jNowInSeconds = DateTimeUtils.nowInSeconds() + ((long) gVar.f10799b.f10826d);
        Integer numD = bVar.d();
        if (jNowInSeconds >= ((long) (numD != null ? numD.intValue() : 0)) + jLongValue) {
            final int i11 = 0;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: qw.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            return com.braze.triggers.managers.h.b(jLongValue, bVar);
                        default:
                            return com.braze.triggers.managers.h.a(jLongValue, bVar);
                    }
                }
            }, 7, (Object) null);
            return true;
        }
        final int i12 = 1;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: qw.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return com.braze.triggers.managers.h.b(jLongValue, bVar);
                    default:
                        return com.braze.triggers.managers.h.a(jLongValue, bVar);
                }
            }
        }, 7, (Object) null);
        return false;
    }

    public final void a(List list) {
        String strC;
        h hVar = this;
        list.getClass();
        ArrayList arrayList = new ArrayList(e0.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.braze.triggers.actions.g) ((com.braze.triggers.actions.a) it.next())).c());
        }
        Map map = hVar.f10883b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            boolean zContains = arrayList.contains(str);
            if (zContains) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) hVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.e(str, 6), 7, (Object) null);
                hVar = this;
            } else {
                hVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) hVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.e(str, 7), 7, (Object) null);
            }
            if (zContains) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        t3 t3Var = hVar.f10882a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    n90.b bVar = n90.c.f30748d;
                    bVar.getClass();
                    strC = bVar.c(new f0(r1.f29848a, q0.f29842a, 1), linkedHashMap);
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) i.f10761a, 4, (Object) null);
                    strC = "{}";
                }
                t3Var.writeData(dataStoreKey, strC);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new r0(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) hVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.e(linkedHashMap, 6), 7, (Object) null);
    }
}
