package com.braze.managers;

import com.adyen.checkout.components.core.Address;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.enums.GeofenceTransitionType;
import com.braze.models.BrazeGeofence;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
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
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import m90.r1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GeofenceDataStoreProvider f10053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f10055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10059g;

    public n(i3 i3Var, com.braze.events.e eVar, GeofenceDataStoreProvider geofenceDataStoreProvider) {
        i3Var.getClass();
        eVar.getClass();
        geofenceDataStoreProvider.getClass();
        this.f10053a = geofenceDataStoreProvider;
        ((com.braze.events.d) eVar).c(com.braze.events.internal.y.class, new qw.g(this, 2));
        this.f10054b = a();
        this.f10055c = new AtomicBoolean(false);
        Object data = geofenceDataStoreProvider.readData(DataStoreKey.GLOBAL_LAST_REQUEST, 0L);
        data.getClass();
        this.f10056d = ((Long) data).longValue();
        Object data2 = geofenceDataStoreProvider.readData(DataStoreKey.GLOBAL_LAST_REPORT, 0L);
        data2.getClass();
        this.f10057e = ((Long) data2).longValue();
        this.f10058f = i3Var.t();
        this.f10059g = i3Var.s();
    }

    public static final String b(long j9, int i11, String str, GeofenceTransitionType geofenceTransitionType) {
        return j9 + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + i11 + "). id:" + str + " transition:" + geofenceTransitionType;
    }

    public static final String c(String str) {
        return w.a0.p("Deleting outdated id ", str, " from re-eligibility list.");
    }

    public static final String d(String str) {
        return w.a0.p("Retaining id ", str, " in re-eligibility list.");
    }

    public final boolean a(long j9, BrazeGeofence brazeGeofence, final GeofenceTransitionType geofenceTransitionType) {
        String str;
        Map linkedHashMap;
        Map map;
        m90.f0 f0VarJ;
        String strC;
        brazeGeofence.getClass();
        geofenceTransitionType.getClass();
        final String id2 = brazeGeofence.getId();
        final long j11 = j9 - this.f10057e;
        if (this.f10059g > j11) {
            final int i11 = 0;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: zv.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            return com.braze.managers.n.a(j11, this, id2);
                        default:
                            return com.braze.managers.n.b(j11, this, id2);
                    }
                }
            }, 7, (Object) null);
            return false;
        }
        String strA = a(id2, geofenceTransitionType);
        final int cooldownEnterSeconds = geofenceTransitionType == GeofenceTransitionType.ENTER ? brazeGeofence.getCooldownEnterSeconds() : brazeGeofence.getCooldownExitSeconds();
        if (this.f10054b.containsKey(strA)) {
            Long l = (Long) this.f10054b.get(strA);
            if (l != null) {
                final long jLongValue = j9 - l.longValue();
                if (cooldownEnterSeconds > jLongValue) {
                    final int i12 = 0;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: zv.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i12) {
                                case 0:
                                    return com.braze.managers.n.a(jLongValue, cooldownEnterSeconds, id2, geofenceTransitionType);
                                default:
                                    return com.braze.managers.n.b(jLongValue, cooldownEnterSeconds, id2, geofenceTransitionType);
                            }
                        }
                    }, 7, (Object) null);
                    return false;
                }
                final int i13 = 1;
                str = id2;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: zv.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                return com.braze.managers.n.a(jLongValue, cooldownEnterSeconds, id2, geofenceTransitionType);
                            default:
                                return com.braze.managers.n.b(jLongValue, cooldownEnterSeconds, id2, geofenceTransitionType);
                        }
                    }
                }, 7, (Object) null);
            } else {
                str = id2;
            }
        } else {
            str = id2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.c(str, geofenceTransitionType, 1), 7, (Object) null);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        final int i14 = 1;
        final String str2 = str;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: zv.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return com.braze.managers.n.a(j11, this, str2);
                    default:
                        return com.braze.managers.n.b(j11, this, str2);
                }
            }
        }, 7, (Object) null);
        this.f10054b.put(strA, Long.valueOf(j9));
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.f10053a;
        DataStoreKey dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = geofenceDataStoreProvider.readData(dataStoreKey, "");
                data.getClass();
                String str3 = (String) data;
                if (StringsKt.H(str3)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str3)) {
                        map = kotlin.collections.o0.f26530a;
                        map.getClass();
                    } else if (Intrinsics.areEqual(StringsKt.e0(str3).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
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
                                    BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) l.f10047a, 6, (Object) null);
                                    map = kotlin.collections.o0.f26530a;
                                    map.getClass();
                                } catch (Exception e5) {
                                    e = e5;
                                    dataStoreUtils = dataStoreUtils;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.f(str3), 4, (Object) null);
                                    map = kotlin.collections.o0.f26530a;
                                    map.getClass();
                                }
                            }
                            Object objB = n90.c.f30748d.b(f0VarJ, str3);
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
        linkedHashMap.put(strA, Long.valueOf(j9));
        GeofenceDataStoreProvider geofenceDataStoreProvider2 = this.f10053a;
        DataStoreKey dataStoreKey2 = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
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
                geofenceDataStoreProvider2.writeData(dataStoreKey2, strC);
            } catch (Exception e14) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e14, false, (Function0) new com.braze.storage.r0(dataStoreKey2), 8, (Object) null);
            }
        }
        this.f10057e = j9;
        this.f10053a.writeData(DataStoreKey.GLOBAL_LAST_REPORT, Long.valueOf(j9));
        return true;
    }

    public static final String c() {
        return "Geofences have already been requested for the current session. Geofence request not eligible.";
    }

    public static final String c(long j9) {
        return e0.f.i(j9, "Updating the last successful location request time to: ");
    }

    public static final String b(String str, GeofenceTransitionType geofenceTransitionType) {
        return "Geofence report eligible since this geofence/transition combination has never been reported.id:" + str + " transition:" + geofenceTransitionType;
    }

    public static final String b(long j9, n nVar, String str) {
        int i11 = nVar.f10059g;
        StringBuilder sb2 = new StringBuilder("Geofence report eligible since ");
        sb2.append(j9);
        sb2.append(" seconds have passed since the last time geofences were reported globally (minimum interval: ");
        sb2.append(i11);
        return r8.k.p(sb2, "). id:", str);
    }

    public static final String b(long j9, n nVar) {
        return "Geofence request suppressed since only " + j9 + " seconds have passed since the last time geofences were requested (minimum interval: " + nVar.f10058f + ").";
    }

    public static final String b() {
        return "Geofences have not been requested for the current session yet. Request is eligible.";
    }

    public final void b(long j9) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.b(j9, 10), 7, (Object) null);
        this.f10056d = j9;
        this.f10053a.writeData(DataStoreKey.GLOBAL_LAST_REQUEST, Long.valueOf(j9));
    }

    public static final String b(String str) {
        return e0.f.k("Exception trying to parse re-eligibility id: ", str);
    }

    public static final String b(int i11) {
        return r8.k.h(i11, "Min time since last geofence report reset via server configuration: ", ".");
    }

    public static final void a(n nVar, com.braze.events.internal.y yVar) {
        yVar.getClass();
        nVar.f10055c.set(false);
    }

    public final void a(List list) {
        Map linkedHashMap;
        Map map;
        m90.f0 f0VarJ;
        String strC;
        list.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((BrazeGeofence) it.next()).getId());
        }
        HashSet hashSet = new HashSet(this.f10054b.keySet());
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.f10053a;
        DataStoreKey dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = geofenceDataStoreProvider.readData(dataStoreKey, "");
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) m.f10052a, 6, (Object) null);
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
        Iterator it2 = hashSet.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            str2.getClass();
            if (!linkedHashSet.contains(a(str2))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xv.a(str2, 17), 7, (Object) null);
                this.f10054b.remove(str2);
                map2.remove(str2);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xv.a(str2, 18), 7, (Object) null);
            }
        }
        GeofenceDataStoreProvider geofenceDataStoreProvider2 = this.f10053a;
        DataStoreKey dataStoreKey2 = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey2), 12, (Object) null);
            return;
        }
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
            geofenceDataStoreProvider2.writeData(dataStoreKey2, strC);
        } catch (Exception e13) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) new com.braze.storage.r0(dataStoreKey2), 8, (Object) null);
        }
    }

    public final void a(com.braze.models.response.m mVar) {
        mVar.getClass();
        int i11 = mVar.f10260e;
        if (i11 >= 0) {
            this.f10058f = i11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new com.braze.models.inappmessage.l(i11, 22), 6, (Object) null);
        }
        int i12 = mVar.f10261f;
        if (i12 >= 0) {
            this.f10059g = i12;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new com.braze.models.inappmessage.l(i12, 23), 6, (Object) null);
        }
    }

    public static final String a(long j9, n nVar, String str) {
        int i11 = nVar.f10059g;
        StringBuilder sb2 = new StringBuilder("Geofence report suppressed since only ");
        sb2.append(j9);
        sb2.append(" seconds have passed since the last time geofences were reported globally (minimum interval: ");
        sb2.append(i11);
        return r8.k.p(sb2, "). id:", str);
    }

    public static final String a(long j9, int i11, String str, GeofenceTransitionType geofenceTransitionType) {
        return "Geofence report suppressed since only " + j9 + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + i11 + "). id:" + str + " transition:" + geofenceTransitionType;
    }

    public final boolean a(boolean z11, long j9) {
        final long j11 = j9 - this.f10056d;
        if (!z11 && this.f10058f > j11) {
            final int i11 = 0;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: zv.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            return com.braze.managers.n.b(j11, this);
                        default:
                            return com.braze.managers.n.a(j11, this);
                    }
                }
            }, 7, (Object) null);
            return false;
        }
        if (z11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.b(j11, 11), 7, (Object) null);
        } else {
            final int i12 = 1;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: zv.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            return com.braze.managers.n.b(j11, this);
                        default:
                            return com.braze.managers.n.a(j11, this);
                    }
                }
            }, 7, (Object) null);
        }
        if (this.f10055c.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.l(7), 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.l(8), 7, (Object) null);
        return false;
    }

    public static final String a(long j9) {
        return e0.f.i(j9, "Ignoring rate limit for this geofence request. Elapsed time since last request:");
    }

    public static final String a(long j9, n nVar) {
        return j9 + " seconds have passed since the last time geofences were requested (minimum interval: " + nVar.f10058f + ").";
    }

    public final String a(String str) {
        str.getClass();
        try {
            return (String) new Regex("_").g(2, str).get(1);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new xv.a(str, 16), 4, (Object) null);
            return null;
        }
    }

    public static String a(String str, GeofenceTransitionType geofenceTransitionType) {
        str.getClass();
        geofenceTransitionType.getClass();
        String string = geofenceTransitionType.toString();
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        return r8.k.m(lowerCase, "_", str);
    }

    public static final String a(int i11) {
        return r8.k.h(i11, "Min time since last geofence request reset via server configuration: ", ".");
    }

    public final ConcurrentHashMap a() {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map map;
        m90.f0 f0VarJ;
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.f10053a;
        DataStoreKey dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = geofenceDataStoreProvider.readData(dataStoreKey, "");
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
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) k.f10038a, 6, (Object) null);
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
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            long jLongValue = ((Number) entry.getValue()).longValue();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new yl.e(19, this, str2), 7, (Object) null);
            concurrentHashMap.put(str2, Long.valueOf(jLongValue));
        }
        return concurrentHashMap;
    }

    public static final String a(n nVar, String str) {
        return w.a0.p("Retrieving geofence id ", nVar.a(str), " eligibility information from local storage.");
    }
}
