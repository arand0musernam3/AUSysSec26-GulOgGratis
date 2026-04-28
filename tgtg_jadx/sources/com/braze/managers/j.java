package com.braze.managers;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import com.adyen.checkout.components.core.Address;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.Banner;
import com.braze.storage.DataStoreProvider;
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
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
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
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static v80.i1 f10001j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.events.e f10006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i3 f10007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f10008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.braze.storage.e f10009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f10010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f10011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f9999h = new g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LinkedHashMap f10000i = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ReentrantLock f10002k = new ReentrantLock();
    public static final ArrayList l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ReentrantLock f10003m = new ReentrantLock();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ArrayList f10004n = new ArrayList();

    public j(Context context, String str, String str2, com.braze.events.e eVar, com.braze.events.e eVar2, i3 i3Var, r rVar) {
        context.getClass();
        str.getClass();
        eVar.getClass();
        eVar2.getClass();
        i3Var.getClass();
        rVar.getClass();
        this.f10005a = str2;
        this.f10006b = eVar2;
        this.f10007c = i3Var;
        this.f10008d = rVar;
        this.f10009e = new com.braze.storage.e(context, str2, str);
        this.f10010f = kotlin.collections.n0.f26529a;
        final int i11 = 0;
        this.f10011g = new AtomicInteger(0);
        e();
        com.braze.events.d dVar = (com.braze.events.d) eVar;
        dVar.c(com.braze.events.internal.q.class, new IEventSubscriber(this) { // from class: zv.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.braze.managers.j f48124b;

            {
                this.f48124b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i11) {
                    case 0:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.q) obj);
                        break;
                    case 1:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.c) obj);
                        break;
                    case 2:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.b) obj);
                        break;
                    case 3:
                        com.braze.managers.j.a(this.f48124b, (BrazeUserChangeEvent) obj);
                        break;
                    default:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.d) obj);
                        break;
                }
            }
        });
        final int i12 = 1;
        dVar.c(com.braze.events.internal.c.class, new IEventSubscriber(this) { // from class: zv.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.braze.managers.j f48124b;

            {
                this.f48124b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i12) {
                    case 0:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.q) obj);
                        break;
                    case 1:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.c) obj);
                        break;
                    case 2:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.b) obj);
                        break;
                    case 3:
                        com.braze.managers.j.a(this.f48124b, (BrazeUserChangeEvent) obj);
                        break;
                    default:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.d) obj);
                        break;
                }
            }
        });
        final int i13 = 2;
        dVar.c(com.braze.events.internal.b.class, new IEventSubscriber(this) { // from class: zv.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.braze.managers.j f48124b;

            {
                this.f48124b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i13) {
                    case 0:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.q) obj);
                        break;
                    case 1:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.c) obj);
                        break;
                    case 2:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.b) obj);
                        break;
                    case 3:
                        com.braze.managers.j.a(this.f48124b, (BrazeUserChangeEvent) obj);
                        break;
                    default:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.d) obj);
                        break;
                }
            }
        });
        final int i14 = 3;
        dVar.d(BrazeUserChangeEvent.class, new IEventSubscriber(this) { // from class: zv.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.braze.managers.j f48124b;

            {
                this.f48124b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i14) {
                    case 0:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.q) obj);
                        break;
                    case 1:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.c) obj);
                        break;
                    case 2:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.b) obj);
                        break;
                    case 3:
                        com.braze.managers.j.a(this.f48124b, (BrazeUserChangeEvent) obj);
                        break;
                    default:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.d) obj);
                        break;
                }
            }
        });
        final int i15 = 4;
        dVar.c(com.braze.events.internal.d.class, new IEventSubscriber(this) { // from class: zv.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.braze.managers.j f48124b;

            {
                this.f48124b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i15) {
                    case 0:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.q) obj);
                        break;
                    case 1:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.c) obj);
                        break;
                    case 2:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.b) obj);
                        break;
                    case 3:
                        com.braze.managers.j.a(this.f48124b, (BrazeUserChangeEvent) obj);
                        break;
                    default:
                        com.braze.managers.j.a(this.f48124b, (com.braze.events.internal.d) obj);
                        break;
                }
            }
        });
    }

    public static final String c(Banner banner) {
        return "Error converting Banner to JSON: " + banner;
    }

    public static final String d(String str) {
        return e0.f.k("Encountered unexpected exception while parsing stored banner: ", str);
    }

    public static final String g(String str) {
        return w.a0.p("Not logging a Banner impression for Banner with placement id ", str, ". The Banner was not present in cache.");
    }

    public static final String i() {
        return "Resetting BannersManager for new session.";
    }

    public static final String k() {
        return "View is not an IBannerView. Cannot update banner data.";
    }

    public final BannersUpdatedEvent a(JSONObject jSONObject) {
        String strC;
        String string;
        jSONObject.getClass();
        Banner.Companion.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            Banner bannerA = Banner.Companion.a(jSONObject.optJSONObject(itKeys.next()));
            if (bannerA != null) {
                arrayList.add(bannerA);
            }
        }
        ArrayList<Banner> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Banner) obj).getIsTestSend()) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        for (Banner banner : arrayList2) {
            f10000i.put(banner.getPlacementId(), banner);
        }
        this.f10010f = arrayList3;
        ArrayList<Banner> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!((Banner) obj2).isExpired()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Banner banner2 : arrayList4) {
            try {
                string = banner2.getJsonObject().toString();
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new zv.h(banner2, 0), 4, (Object) null);
                string = null;
            }
            if (string != null) {
                arrayList5.add(string);
            }
        }
        com.braze.storage.e eVar = this.f10009e;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.o0(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    n90.b bVar = n90.c.f30748d;
                    bVar.getClass();
                    strC = bVar.c(new m90.d(r1.f29848a, 0), arrayList5);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                    strC = arrayList5 instanceof Map ? "{}" : "[]";
                }
                eVar.writeData(dataStoreKey, strC);
            } catch (Exception e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) new com.braze.storage.p0(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i90.j(7, arrayList5), 7, (Object) null);
        j();
        List list = this.f10010f;
        ArrayList arrayList6 = new ArrayList(kotlin.collections.e0.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList6.add(((Banner) it.next()).deepcopy$android_sdk_base_release());
        }
        return new BannersUpdatedEvent(arrayList6);
    }

    public final boolean b(List list) {
        String trackingId;
        Object next;
        list.getClass();
        if (this.f10011g.get() > 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.textcell.c(this, 10), 7, (Object) null);
            return false;
        }
        if (list.size() > this.f10007c.p()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new yl.e(17, this, list), 7, (Object) null);
        }
        this.f10011g.incrementAndGet();
        List<String> listM0 = CollectionsKt.m0(list, this.f10007c.p());
        listM0.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : listM0) {
            Iterator it = this.f10010f.iterator();
            while (true) {
                trackingId = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((Banner) next).getPlacementId(), str)) {
                    break;
                }
            }
            Banner banner = (Banner) next;
            if (banner != null) {
                trackingId = banner.getTrackingId();
            }
            arrayList.add(new Pair(str, trackingId));
        }
        this.f10008d.a(arrayList);
        return true;
    }

    public final void e() {
        ArrayList<String> arrayList;
        Collection collection;
        com.braze.storage.e eVar = this.f10009e;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = eVar.readData(dataStoreKey, "");
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
                            collection = (List) bVar.b(new m90.d(r1.f29848a, 0), str);
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.f(22), 7, (Object) null);
            this.f10010f = kotlin.collections.n0.f26529a;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            try {
                if (StringsKt.H(str2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zv.f(23), 6, (Object) null);
                } else {
                    Banner bannerA = Banner.Companion.a(new JSONObject(str2));
                    if (bannerA != null) {
                        arrayList2.add(bannerA);
                    }
                }
            } catch (Exception e12) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) new xv.a(str2, 11), 4, (Object) null);
            }
        }
        this.f10010f = arrayList2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new i90.j(8, arrayList2), 7, (Object) null);
    }

    public final boolean f(String str) {
        Map linkedHashMap;
        Map map;
        m90.f0 f0VarJ;
        Map linkedHashMap2;
        Map map2;
        m90.f0 f0VarJ2;
        String strC;
        Object next;
        str.getClass();
        Banner banner = (Banner) f10000i.get(str);
        if (banner == null) {
            Iterator it = this.f10010f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(str, ((Banner) next).getPlacementId())) {
                    break;
                }
            }
            banner = (Banner) next;
        }
        Banner banner2 = banner;
        if (banner2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new xv.a(str, 6), 6, (Object) null);
            return false;
        }
        String trackingId = banner2.getTrackingId();
        trackingId.getClass();
        com.braze.storage.e eVar = this.f10009e;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS_IMPRESSION_MAP;
        DataStoreValueType type = dataStoreKey.getType();
        DataStoreValueType dataStoreValueType = DataStoreValueType.MAP;
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Boolean.TYPE;
        Class cls5 = Long.TYPE;
        if (type != dataStoreValueType) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = eVar.readData(dataStoreKey, "");
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
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Boolean.class);
                            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                r1 r1Var = r1.f29848a;
                                f0VarJ = o30.f0.j(r1Var, r1Var);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls5))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                r1 r1Var2 = r1.f29848a;
                                o30.f0.Q(LongCompanionObject.INSTANCE);
                                f0VarJ = o30.f0.j(r1Var2, m90.q0.f29842a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls4))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                r1 r1Var3 = r1.f29848a;
                                o30.f0.M(BooleanCompanionObject.INSTANCE);
                                f0VarJ = o30.f0.j(r1Var3, m90.g.f29797a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls3))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                r1 r1Var4 = r1.f29848a;
                                o30.f0.P(IntCompanionObject.INSTANCE);
                                f0VarJ = o30.f0.j(r1Var4, m90.l0.f29821a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls2))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                r1 r1Var5 = r1.f29848a;
                                o30.f0.N(DoubleCompanionObject.INSTANCE);
                                f0VarJ = o30.f0.j(r1Var5, m90.v.f29868a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(cls))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                r1 r1Var6 = r1.f29848a;
                                o30.f0.O(FloatCompanionObject.INSTANCE);
                                f0VarJ = o30.f0.j(r1Var6, m90.c0.f29762a);
                            } else {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) i.f9995a, 6, (Object) null);
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
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new com.braze.storage.l0(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        if (Intrinsics.areEqual(linkedHashMap.get(trackingId), Boolean.TRUE)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zv.h(banner2, 1), 6, (Object) null);
            return true;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xv.a(str, 7), 7, (Object) null);
        com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f10176g.a(banner2.getTrackingId());
        if (kVarA != null) {
            this.f10008d.a(kVarA);
        }
        com.braze.storage.e eVar2 = this.f10009e;
        DataStoreKey dataStoreKey2 = DataStoreKey.BANNERS_IMPRESSION_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.k0(dataStoreKey2), 12, (Object) null);
            linkedHashMap2 = new LinkedHashMap();
        } else {
            try {
                Object data2 = eVar2.readData(dataStoreKey2, "");
                data2.getClass();
                String str3 = (String) data2;
                if (StringsKt.H(str3)) {
                    linkedHashMap2 = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str3)) {
                        map2 = kotlin.collections.o0.f26530a;
                        map2.getClass();
                    } else if (Intrinsics.areEqual(StringsKt.e0(str3).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                        map2 = kotlin.collections.o0.f26530a;
                        map2.getClass();
                    } else {
                        try {
                            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Boolean.class);
                            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(String.class))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                r1 r1Var7 = r1.f29848a;
                                f0VarJ2 = o30.f0.j(r1Var7, r1Var7);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls5))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                r1 r1Var8 = r1.f29848a;
                                o30.f0.Q(LongCompanionObject.INSTANCE);
                                f0VarJ2 = o30.f0.j(r1Var8, m90.q0.f29842a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls4))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                r1 r1Var9 = r1.f29848a;
                                o30.f0.M(BooleanCompanionObject.INSTANCE);
                                f0VarJ2 = o30.f0.j(r1Var9, m90.g.f29797a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls3))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                r1 r1Var10 = r1.f29848a;
                                o30.f0.P(IntCompanionObject.INSTANCE);
                                f0VarJ2 = o30.f0.j(r1Var10, m90.l0.f29821a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls2))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                r1 r1Var11 = r1.f29848a;
                                o30.f0.N(DoubleCompanionObject.INSTANCE);
                                f0VarJ2 = o30.f0.j(r1Var11, m90.v.f29868a);
                            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(cls))) {
                                o30.f0.R(StringCompanionObject.INSTANCE);
                                r1 r1Var12 = r1.f29848a;
                                o30.f0.O(FloatCompanionObject.INSTANCE);
                                f0VarJ2 = o30.f0.j(r1Var12, m90.c0.f29762a);
                            } else {
                                BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) h.f9981a, 6, (Object) null);
                                map2 = kotlin.collections.o0.f26530a;
                                map2.getClass();
                            }
                            Object objB2 = n90.c.f30748d.b(f0VarJ2, str3);
                            objB2.getClass();
                            map2 = (Map) objB2;
                        } catch (Exception e12) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) new com.braze.support.f(str3), 4, (Object) null);
                            map2 = kotlin.collections.o0.f26530a;
                            map2.getClass();
                        }
                    }
                    linkedHashMap2 = TypeIntrinsics.asMutableMap(new LinkedHashMap(map2));
                }
            } catch (Exception e13) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e13, false, (Function0) new com.braze.storage.l0(dataStoreKey2), 8, (Object) null);
                linkedHashMap2 = new LinkedHashMap();
            }
        }
        linkedHashMap2.put(trackingId, Boolean.TRUE);
        com.braze.storage.e eVar3 = this.f10009e;
        DataStoreKey dataStoreKey3 = DataStoreKey.BANNERS_IMPRESSION_MAP;
        if (dataStoreKey3.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.q0(dataStoreKey3), 12, (Object) null);
            return true;
        }
        try {
            DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
            try {
                n90.b bVar = n90.c.f30748d;
                bVar.getClass();
                strC = bVar.c(new m90.f0(r1.f29848a, m90.g.f29797a, 1), linkedHashMap2);
            } catch (Exception e14) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e14, false, (Function0) com.braze.support.i.f10761a, 4, (Object) null);
                strC = "{}";
            }
            eVar3.writeData(dataStoreKey3, strC);
            return true;
        } catch (Exception e15) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e15, false, (Function0) new com.braze.storage.r0(dataStoreKey3), 8, (Object) null);
            return true;
        }
    }

    public final void h() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new zv.f(17), 6, (Object) null);
        this.f10009e.clearData(DataStoreKey.BANNERS_IMPRESSION_MAP);
        g.b();
    }

    public final void j() {
        ArrayList arrayList = new ArrayList();
        ReentrantLock reentrantLock = f10002k;
        reentrantLock.lock();
        try {
            List<d> listR0 = CollectionsKt.r0(l);
            reentrantLock.unlock();
            for (d dVar : listR0) {
                try {
                    KeyEvent.Callback callback = (View) dVar.f9957b.get();
                    if (callback == null) {
                        arrayList.add(dVar);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.d(dVar, 4), 7, (Object) null);
                    } else if (callback instanceof IBannerView) {
                        ((IBannerView) callback).initBanner(dVar.f9956a);
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zv.f(19), 6, (Object) null);
                        arrayList.add(dVar);
                    }
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new zv.d(dVar, 5), 4, (Object) null);
                    arrayList.add(dVar);
                }
            }
            f10002k.lock();
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    l.remove((d) it.next());
                }
            } finally {
            }
        } finally {
        }
    }

    public final void l() {
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new dw.b(jNowInSeconds, 8), 6, (Object) null);
        this.f10009e.writeData(DataStoreKey.LAST_REFRESH_IN_SECONDS, Long.valueOf(jNowInSeconds));
    }

    public static final String d() {
        return "Banners have moved to disabled. Clearing banners data.";
    }

    public static final String g() {
        return "Received blank serialized Banner string from DataStore. Not parsing.";
    }

    public static final String c(String str) {
        return w.a0.p("Banner with placement id ", str, " not found in cache. Returning null for this Banner.");
    }

    public static final String c() {
        return "Refreshing Banners on forced internal refresh.";
    }

    public static final String c(List list) {
        return r8.k.h(list.size(), "Added ", " new Banners to DataStore.");
    }

    public static final String h(String str) {
        return w.a0.p("Logging impression for Banner with placement id ", str, ".");
    }

    public static final String b() {
        return "Cached Banners placement IDs are empty. Not refreshing Banners on forced internal call.";
    }

    public static final String b(BrazeUserChangeEvent brazeUserChangeEvent) {
        return w.a0.p("Done updating banners because of user change to ", brazeUserChangeEvent.getCurrentUserId(), ".");
    }

    public static final String b(String str) {
        return w.a0.p("Returning test Banner with placement id ", str, ".");
    }

    public static final String b(Banner banner) {
        return "Not logging a Banner impression for Banner " + banner + ". The Banner already had an impression logged in the current session";
    }

    public static final String b(String str, String str2) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("Logging click for Banner with placement id ", str, " with buttonID of ", str2, ".");
    }

    public static final String b(d dVar) {
        return w.a0.p("Error checking banner visibility for ", dVar.a(), ".Removing banner from visibility monitoring.");
    }

    public static final String e(String str) {
        return w.a0.p("Not logging a Banner click for Banner with placement id ", str, ". The Banner was not present in cache.");
    }

    public static final void a(j jVar, com.braze.events.internal.q qVar) {
        qVar.getClass();
        if (qVar.f9820a instanceof com.braze.requests.a) {
            jVar.f10011g.decrementAndGet();
        }
    }

    public static final void a(j jVar, com.braze.events.internal.c cVar) {
        cVar.getClass();
        jVar.l();
    }

    public static final void a(j jVar, com.braze.events.internal.b bVar) {
        bVar.getClass();
        ((com.braze.events.d) jVar.f10006b).b(bVar, com.braze.events.internal.b.class);
    }

    public static final void a(j jVar, BrazeUserChangeEvent brazeUserChangeEvent) {
        brazeUserChangeEvent.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) jVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.inappmessage.e(brazeUserChangeEvent, 1), 7, (Object) null);
        jVar.j();
        BrazeLogger.brazelog$default(brazeLogger, (Object) jVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.inappmessage.e(brazeUserChangeEvent, 2), 7, (Object) null);
    }

    public static final String a(BrazeUserChangeEvent brazeUserChangeEvent) {
        return w.a0.p("Updating banners because of user change to ", brazeUserChangeEvent.getCurrentUserId(), ".");
    }

    public final void a() {
        ReentrantLock reentrantLock = f10003m;
        reentrantLock.lock();
        try {
            ArrayList arrayListT0 = CollectionsKt.t0(f10004n);
            reentrantLock.unlock();
            if (arrayListT0.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.f(20), 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.f(21), 7, (Object) null);
                b(arrayListT0);
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String a(j jVar) {
        return r8.k.h(jVar.f10011g.get(), "Not refreshing Banners since another ", " request is currently in-flight.");
    }

    public static final String a(j jVar, List list) {
        int iP = jVar.f10007c.p();
        int size = list.size();
        List listM0 = CollectionsKt.m0(list, jVar.f10007c.p());
        List listSubList = list.subList(jVar.f10007c.p(), list.size());
        StringBuilder sbR = r8.k.r(iP, size, "The number of Banner placements requested exceeds the maximum allowed by the server. The server allows a maximum of ", " placements, but ", " were requested. Truncating request to fit.\nPlacements that will be requested: ");
        sbR.append(listM0);
        sbR.append("\nTruncated placements not requested: ");
        sbR.append(listSubList);
        return sbR.toString();
    }

    public final Banner a(String str) {
        Object next;
        str.getClass();
        Banner banner = (Banner) f10000i.get(str);
        if (banner != null) {
            if (banner.isExpired()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new zv.h(banner, 2), 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new xv.a(str, 8), 6, (Object) null);
                banner.setUserId(this.f10005a);
                return banner;
            }
        }
        Iterator it = this.f10010f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Banner) next).getPlacementId(), str)) {
                break;
            }
        }
        Banner banner2 = (Banner) next;
        if (banner2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new xv.a(str, 9), 6, (Object) null);
            return null;
        }
        if (banner2.isExpired()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new yl.e(18, str, banner2), 6, (Object) null);
            return null;
        }
        banner2.setUserId(this.f10005a);
        return banner2;
    }

    public static final String a(Banner banner) {
        return "Found test banner, but it is expired. Attempting to find non-test banner. " + banner;
    }

    public static final String a(String str, Banner banner) {
        return "Banner with placement id " + str + " has expired. Returning null for this Banner " + banner;
    }

    public final void a(String str, String str2) {
        Object next;
        str.getClass();
        Banner banner = (Banner) f10000i.get(str);
        if (banner == null) {
            Iterator it = this.f10010f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.areEqual(str, ((Banner) next).getPlacementId())) {
                        break;
                    }
                }
            }
            banner = (Banner) next;
        }
        if (banner == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new xv.a(str, 10), 6, (Object) null);
            return;
        }
        String trackingId = banner.getTrackingId();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.d(str, str2, 8), 7, (Object) null);
        com.braze.models.k kVarC = com.braze.models.outgoing.event.b.f10176g.c(trackingId, str2);
        if (kVarC != null) {
            this.f10008d.a(kVarC);
        }
    }

    public static final void a(j jVar, com.braze.events.internal.d dVar) {
        dVar.getClass();
        if (!dVar.f9785a.G || dVar.f9786b.G) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) jVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.f(18), 7, (Object) null);
        jVar.getClass();
        jVar.f10010f = kotlin.collections.n0.f26529a;
        jVar.f10009e.clearData(DataStoreKey.BANNERS);
        jVar.j();
    }

    public static final String a(long j9) {
        return e0.f.i(j9, "Updating last Banners refresh time: ");
    }

    public static final String a(List list) {
        return r8.k.h(list.size(), "Loaded ", " banners from DataStore.");
    }

    public static final String a(d dVar) {
        return w.a0.p("Banner ", dVar.a(), " removed because view is null");
    }

    public static final String f() {
        return "Did not find stored Banners in DataStore.";
    }
}
