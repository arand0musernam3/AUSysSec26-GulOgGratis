package com.braze.managers;

import android.content.Context;
import com.adyen.checkout.components.core.Address;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.managers.k0;
import com.braze.models.FeatureFlag;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.a2;
import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;
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
import org.json.JSONArray;
import org.json.JSONObject;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.events.e f10039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.events.e f10040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i3 f10041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f10042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2 f10043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f10044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f10045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f10046h;

    public k0(Context context, String str, String str2, com.braze.events.e eVar, com.braze.events.e eVar2, i3 i3Var, r rVar) {
        context.getClass();
        str.getClass();
        eVar.getClass();
        eVar2.getClass();
        i3Var.getClass();
        rVar.getClass();
        this.f10039a = eVar;
        this.f10040b = eVar2;
        this.f10041c = i3Var;
        this.f10042d = rVar;
        this.f10043e = new a2(context, str2, str);
        this.f10044f = kotlin.collections.n0.f26529a;
        this.f10045g = new AtomicBoolean(false);
        this.f10046h = new AtomicInteger(0);
        c();
        f();
    }

    public static final String b(k0 k0Var) {
        return e0.f.m("Added new Feature Flags:", " to DataStore.", k0Var.f10044f);
    }

    public static final String g() {
        return "Features flags have moved to disabled. Clearing feature flag data.";
    }

    public final void a(String str) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map map;
        KClass orCreateKotlinClass;
        m90.f0 f0VarJ;
        str.getClass();
        FeatureFlag featureFlag = (FeatureFlag) CollectionsKt.firstOrNull(c(str));
        if ((featureFlag != null ? featureFlag.getTrackingString$android_sdk_base_release() : null) == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new xv.a(str, 12), 6, (Object) null);
            return;
        }
        String id2 = featureFlag.getId();
        id2.getClass();
        a2 a2Var = this.f10043e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = a2Var.readData(dataStoreKey, "");
                data.getClass();
                String str2 = (String) data;
                if (StringsKt.H(str2)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str2)) {
                        map = kotlin.collections.o0.f26530a;
                        map.getClass();
                    } else if (Intrinsics.areEqual(StringsKt.e0(str2).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                        map = kotlin.collections.o0.f26530a;
                        map.getClass();
                    } else {
                        try {
                            orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) j0.f10012a, 6, (Object) null);
                                    map = kotlin.collections.o0.f26530a;
                                    map.getClass();
                                } catch (Exception e11) {
                                    e = e11;
                                    exc = e;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                                    map = kotlin.collections.o0.f26530a;
                                    map.getClass();
                                }
                            }
                            Object objB = n90.c.f30748d.b(f0VarJ, str2);
                            objB.getClass();
                            map = (Map) objB;
                        } catch (Exception e12) {
                            exc = e12;
                            dataStoreUtils = dataStoreUtils2;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                            map = kotlin.collections.o0.f26530a;
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
        if (Intrinsics.areEqual(linkedHashMap.get(id2), Boolean.TRUE)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new com.braze.models.r(featureFlag, 6), 6, (Object) null);
            return;
        }
        com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f10176g.a(featureFlag);
        if (kVarA != null) {
            this.f10042d.a(kVarA);
        }
        d(featureFlag.getId());
    }

    public final void c() {
        ArrayList arrayList;
        Collection collection;
        a2 a2Var = this.f10043e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = a2Var.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (StringsKt.H(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str) || Intrinsics.areEqual(StringsKt.e0(str).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                        collection = kotlin.collections.n0.f26529a;
                    } else {
                        try {
                            n90.b bVar = n90.c.f30748d;
                            bVar.getClass();
                            collection = (List) bVar.b(new m90.d(FeatureFlag.Companion.serializer(), 0), str);
                        } catch (Exception e5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.support.e(str), 4, (Object) null);
                            collection = kotlin.collections.n0.f26529a;
                        }
                    }
                    arrayList = CollectionsKt.t0(collection);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new com.braze.storage.i0(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zv.f(26), 6, (Object) null);
            this.f10044f = kotlin.collections.n0.f26529a;
        } else {
            this.f10044f = arrayList;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i90.j(9, arrayList), 7, (Object) null);
        }
    }

    public final void d(String str) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map map;
        KClass orCreateKotlinClass;
        m90.f0 f0VarJ;
        String strC;
        str.getClass();
        a2 a2Var = this.f10043e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = a2Var.readData(dataStoreKey, "");
                data.getClass();
                String str2 = (String) data;
                if (StringsKt.H(str2)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str2)) {
                        map = kotlin.collections.o0.f26530a;
                        map.getClass();
                    } else if (Intrinsics.areEqual(StringsKt.e0(str2).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                        map = kotlin.collections.o0.f26530a;
                        map.getClass();
                    } else {
                        try {
                            orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) i0.f9996a, 6, (Object) null);
                                    map = kotlin.collections.o0.f26530a;
                                    map.getClass();
                                } catch (Exception e11) {
                                    e = e11;
                                    exc = e;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                                    map = kotlin.collections.o0.f26530a;
                                    map.getClass();
                                }
                            }
                            Object objB = n90.c.f30748d.b(f0VarJ, str2);
                            objB.getClass();
                            map = (Map) objB;
                        } catch (Exception e12) {
                            exc = e12;
                            dataStoreUtils = dataStoreUtils2;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new com.braze.support.f(str2), 4, (Object) null);
                            map = kotlin.collections.o0.f26530a;
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
        linkedHashMap.put(str, Boolean.TRUE);
        a2 a2Var2 = this.f10043e;
        DataStoreKey dataStoreKey2 = DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey2), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                try {
                    n90.b bVar = n90.c.f30748d;
                    bVar.getClass();
                    strC = bVar.c(new m90.f0(r1.f29848a, m90.g.f29797a, 1), linkedHashMap);
                } catch (Exception e14) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e14, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                    strC = "{}";
                }
                a2Var2.writeData(dataStoreKey2, strC);
            } catch (Exception e15) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e15, false, (Function0) new com.braze.storage.r0(dataStoreKey2), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xv.a(str, 13), 7, (Object) null);
    }

    public final void e() {
        if (this.f10046h.get() > 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.j(this, 1), 7, (Object) null);
            return;
        }
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        Object data = this.f10043e.readData(DataStoreKey.LAST_REFRESH_IN_SECONDS, 0L);
        data.getClass();
        if (jNowInSeconds - ((Long) data).longValue() >= this.f10041c.m()) {
            this.f10042d.q();
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new com.braze.c1(5, jNowInSeconds, this), 6, (Object) null);
        ((com.braze.events.d) this.f10039a).b(new com.braze.events.internal.j(), com.braze.events.internal.j.class);
    }

    public final void f() {
        final int i11 = 0;
        ((com.braze.events.d) this.f10039a).c(com.braze.events.internal.r.class, new IEventSubscriber(this) { // from class: zv.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f48128b;

            {
                this.f48128b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i11) {
                    case 0:
                        k0.a(this.f48128b, (com.braze.events.internal.r) obj);
                        break;
                    case 1:
                        k0.a(this.f48128b, (com.braze.events.internal.q) obj);
                        break;
                    case 2:
                        k0.a(this.f48128b, (com.braze.events.internal.k) obj);
                        break;
                    case 3:
                        k0.a(this.f48128b, (com.braze.events.internal.j) obj);
                        break;
                    default:
                        k0.a(this.f48128b, (com.braze.events.internal.d) obj);
                        break;
                }
            }
        });
        final int i12 = 1;
        ((com.braze.events.d) this.f10039a).c(com.braze.events.internal.q.class, new IEventSubscriber(this) { // from class: zv.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f48128b;

            {
                this.f48128b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i12) {
                    case 0:
                        k0.a(this.f48128b, (com.braze.events.internal.r) obj);
                        break;
                    case 1:
                        k0.a(this.f48128b, (com.braze.events.internal.q) obj);
                        break;
                    case 2:
                        k0.a(this.f48128b, (com.braze.events.internal.k) obj);
                        break;
                    case 3:
                        k0.a(this.f48128b, (com.braze.events.internal.j) obj);
                        break;
                    default:
                        k0.a(this.f48128b, (com.braze.events.internal.d) obj);
                        break;
                }
            }
        });
        final int i13 = 2;
        ((com.braze.events.d) this.f10039a).c(com.braze.events.internal.k.class, new IEventSubscriber(this) { // from class: zv.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f48128b;

            {
                this.f48128b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i13) {
                    case 0:
                        k0.a(this.f48128b, (com.braze.events.internal.r) obj);
                        break;
                    case 1:
                        k0.a(this.f48128b, (com.braze.events.internal.q) obj);
                        break;
                    case 2:
                        k0.a(this.f48128b, (com.braze.events.internal.k) obj);
                        break;
                    case 3:
                        k0.a(this.f48128b, (com.braze.events.internal.j) obj);
                        break;
                    default:
                        k0.a(this.f48128b, (com.braze.events.internal.d) obj);
                        break;
                }
            }
        });
        final int i14 = 3;
        ((com.braze.events.d) this.f10039a).c(com.braze.events.internal.j.class, new IEventSubscriber(this) { // from class: zv.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f48128b;

            {
                this.f48128b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i14) {
                    case 0:
                        k0.a(this.f48128b, (com.braze.events.internal.r) obj);
                        break;
                    case 1:
                        k0.a(this.f48128b, (com.braze.events.internal.q) obj);
                        break;
                    case 2:
                        k0.a(this.f48128b, (com.braze.events.internal.k) obj);
                        break;
                    case 3:
                        k0.a(this.f48128b, (com.braze.events.internal.j) obj);
                        break;
                    default:
                        k0.a(this.f48128b, (com.braze.events.internal.d) obj);
                        break;
                }
            }
        });
        final int i15 = 4;
        ((com.braze.events.d) this.f10039a).c(com.braze.events.internal.d.class, new IEventSubscriber(this) { // from class: zv.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f48128b;

            {
                this.f48128b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i15) {
                    case 0:
                        k0.a(this.f48128b, (com.braze.events.internal.r) obj);
                        break;
                    case 1:
                        k0.a(this.f48128b, (com.braze.events.internal.q) obj);
                        break;
                    case 2:
                        k0.a(this.f48128b, (com.braze.events.internal.k) obj);
                        break;
                    case 3:
                        k0.a(this.f48128b, (com.braze.events.internal.j) obj);
                        break;
                    default:
                        k0.a(this.f48128b, (com.braze.events.internal.d) obj);
                        break;
                }
            }
        });
    }

    public final void h() {
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new dw.b(jNowInSeconds, 9), 6, (Object) null);
        this.f10043e.writeData(DataStoreKey.LAST_REFRESH_IN_SECONDS, Long.valueOf(jNowInSeconds));
    }

    public static final String b(String str) {
        return w.a0.p("Not logging a Feature Flag impression for Feature Flag with id ", str, ". The Feature Flag was not part of any matching campaign");
    }

    public static final String b() {
        return "Clearing Feature Flags.";
    }

    public static final String e(String str) {
        return w.a0.p("Stored impression logged for Feature Flag with id:", str, ".");
    }

    public final ArrayList c(String str) {
        List list = this.f10044f;
        if (str != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((FeatureFlag) obj).getId(), str)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
        }
        return arrayList2;
    }

    public static final void a(k0 k0Var, com.braze.events.internal.d dVar) {
        dVar.getClass();
        if (!dVar.f9785a.f10267m || dVar.f9786b.f10267m) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) k0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.f(24), 7, (Object) null);
        k0Var.a();
    }

    public static final void a(k0 k0Var, com.braze.events.internal.r rVar) {
        rVar.getClass();
        if (rVar.f9821a instanceof com.braze.requests.j) {
            k0Var.f10046h.incrementAndGet();
        }
    }

    public static final void a(k0 k0Var, com.braze.events.internal.q qVar) {
        qVar.getClass();
        if (qVar.f9820a instanceof com.braze.requests.j) {
            k0Var.f10046h.decrementAndGet();
        }
    }

    public static final String a(k0 k0Var, long j9) {
        Object data = k0Var.f10043e.readData(DataStoreKey.LAST_REFRESH_IN_SECONDS, 0L);
        data.getClass();
        return l1.e("Not enough time has passed since last Feature Flags refresh. Not refreshing Feature Flags. ", (((Long) data).longValue() - j9) + ((long) k0Var.f10041c.m()), " seconds remaining until next available flush.");
    }

    public static final void a(k0 k0Var, com.braze.events.internal.k kVar) {
        kVar.getClass();
        k0Var.f10045g.set(true);
        k0Var.h();
    }

    public static final void a(k0 k0Var, com.braze.events.internal.j jVar) {
        jVar.getClass();
        k0Var.f10045g.set(true);
        if (k0Var.f10045g.get()) {
            List list = k0Var.f10044f;
            ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
            }
            ((com.braze.events.d) k0Var.f10040b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
        }
    }

    public static final String d() {
        return "Did not find stored Feature Flags in DataStore.";
    }

    public static final String a(k0 k0Var) {
        return r8.k.h(k0Var.f10046h.get(), "Not refreshing Feature Flags since another ", " request is currently in-flight.");
    }

    public final FeatureFlagsUpdatedEvent a(JSONArray jSONArray) {
        String strC;
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        o80.s sVarM = o80.r.m(o80.r.h(CollectionsKt.F(n80.p.j(0, jSONArray.length())), new com.braze.support.l(jSONArray)), new com.braze.support.m(jSONArray));
        Iterator it = sVarM.f32132a.iterator();
        while (it.hasNext()) {
            FeatureFlag featureFlagA = com.braze.support.n.f10766a.a((JSONObject) sVarM.f32133b.invoke(it.next()));
            if (featureFlagA != null) {
                arrayList.add(featureFlagA);
            }
        }
        this.f10044f = arrayList;
        a2 a2Var = this.f10043e;
        DataStoreKey dataStoreKey = DataStoreKey.FEATURE_FLAGS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.o0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    n90.b bVar = n90.c.f30748d;
                    bVar.getClass();
                    strC = bVar.c(new m90.d(FeatureFlag.Companion.serializer(), 0), arrayList);
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                    strC = arrayList instanceof Map ? "{}" : "[]";
                }
                a2Var.writeData(dataStoreKey, strC);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new com.braze.storage.p0(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.j(this, 0), 7, (Object) null);
        List list = this.f10044f;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((FeatureFlag) it2.next()).deepcopy$android_sdk_base_release());
        }
        return new FeatureFlagsUpdatedEvent(arrayList2);
    }

    public static final String a(FeatureFlag featureFlag) {
        return w.a0.p("Not logging a Feature Flag impression for Feature Flag with id ", featureFlag.getId(), ". The Feature Flag already had an impression logged in the current session");
    }

    public static final String a(long j9) {
        return e0.f.i(j9, "Updating last Feature Flags refresh time: ");
    }

    public static final String a(List list) {
        return r8.k.h(list.size(), "Loaded ", " Feature Flags from DataStore.");
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.f(25), 7, (Object) null);
        this.f10043e.clearData(DataStoreKey.FEATURE_FLAGS);
        this.f10044f = kotlin.collections.n0.f26529a;
        if (this.f10045g.get()) {
            List list = this.f10044f;
            ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FeatureFlag) it.next()).deepcopy$android_sdk_base_release());
            }
            ((com.braze.events.d) this.f10040b).b(new FeatureFlagsUpdatedEvent(arrayList), FeatureFlagsUpdatedEvent.class);
        }
    }
}
