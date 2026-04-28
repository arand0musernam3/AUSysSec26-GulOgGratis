package com.braze.dispatch;

import com.adyen.checkout.components.core.Address;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.enums.DeviceKey;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.managers.j1;
import com.braze.managers.n0;
import com.braze.managers.r0;
import com.braze.managers.x;
import com.braze.managers.y;
import com.braze.models.k;
import com.braze.models.outgoing.l;
import com.braze.models.q;
import com.braze.requests.o;
import com.braze.requests.r;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.d3;
import com.braze.storage.f3;
import com.braze.storage.h0;
import com.braze.storage.i0;
import com.braze.storage.p;
import com.braze.storage.u3;
import com.braze.storage.v0;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m90.r1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f9695d = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f9696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f9697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f9698c;

    public h(j1 j1Var) {
        j1Var.getClass();
        this.f9696a = j1Var;
        this.f9697b = new ConcurrentHashMap();
        this.f9698c = new ConcurrentHashMap();
        j1Var.f10025n.c(com.braze.events.internal.dispatchmanager.c.class, new qw.g(this, 1));
    }

    public static final String b() {
        return "Push permissions were granted, but blocking automatic opt-in";
    }

    public static final String c() {
        return "Push permissions were granted, setting user push notifications to opt-in";
    }

    public static final String d() {
        return "Flushing pending events to dispatcher map";
    }

    public final void a(com.braze.requests.g gVar) throws Throwable {
        ArrayList arrayList;
        Collection collection;
        String jsonObject;
        gVar.getClass();
        j1 j1Var = this.f9696a;
        gVar.f10438p = ((x) j1Var.f10017e).f10121c;
        gVar.l = j1Var.f10014b.getSdkFlavor();
        gVar.f10439q = ((x) this.f9696a.f10017e).c();
        j1 j1Var2 = this.f9696a;
        n0 n0Var = j1Var2.f10017e;
        v0 v0Var = j1Var2.f10024m;
        if (v0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
            v0Var = null;
        }
        x xVar = (x) n0Var;
        xVar.getClass();
        v0Var.getClass();
        v0Var.f10713d = xVar.b();
        com.braze.models.outgoing.h hVar = (com.braze.models.outgoing.h) v0Var.a();
        gVar.f10363i = hVar;
        if (hVar != null && hVar.l) {
            if (this.f9696a.f10014b.getShouldOptInWhenPushAuthorized()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new tr.e(16), 6, (Object) null);
                u3 u3VarD = this.f9696a.d();
                NotificationSubscriptionType notificationSubscriptionType = NotificationSubscriptionType.OPTED_IN;
                synchronized (u3VarD) {
                    if (notificationSubscriptionType != null) {
                        try {
                            jsonObject = notificationSubscriptionType.getJsonObject();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        jsonObject = null;
                    }
                    u3VarD.c("push_subscribe", jsonObject);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new tr.e(17), 6, (Object) null);
            }
        }
        if (hVar != null && hVar.getJsonObject().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey())) {
            this.f9696a.d().j();
        }
        gVar.f10435m = (l) this.f9696a.d().a();
        com.braze.models.b bVarE = e();
        gVar.f10436n = bVarE;
        LinkedHashSet linkedHashSet = bVarE.f10133a;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (((com.braze.models.outgoing.event.b) ((k) it.next())).f10178a == com.braze.enums.d.f9729y) {
                j1 j1Var3 = this.f9696a;
                d3 d3Var = j1Var3.f10035x;
                EnumSet<BrazeSdkMetadata> sdkMetadata = j1Var3.f10014b.getSdkMetadata();
                d3Var.getClass();
                sdkMetadata.getClass();
                f3 f3Var = d3Var.f10547a;
                DataStoreKey dataStoreKey = DataStoreKey.SDK_METADATA;
                if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(dataStoreKey), 12, (Object) null);
                    arrayList = new ArrayList();
                } else {
                    try {
                        Object data = f3Var.readData(dataStoreKey, "");
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
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new i0(dataStoreKey), 8, (Object) null);
                        arrayList = new ArrayList();
                    }
                }
                gVar.f10437o = Intrinsics.areEqual(com.braze.support.k.a(sdkMetadata), CollectionsKt.v0(arrayList)) ? null : sdkMetadata;
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        com.braze.support.BrazeLogger.brazelog$default(r4, (java.lang.Object) r12, com.braze.support.BrazeLogger.Priority.I, (java.lang.Throwable) null, false, (kotlin.jvm.functions.Function0) new tr.e(18), 6, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.braze.models.b e() throws java.lang.Throwable {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.concurrent.ConcurrentHashMap r0 = r12.f9697b     // Catch: java.lang.Throwable -> L55
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L55
            r0.getClass()     // Catch: java.lang.Throwable -> L55
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L55
            r1.<init>()     // Catch: java.lang.Throwable -> L55
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L55
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L55
            r3.getClass()     // Catch: java.lang.Throwable -> L55
            com.braze.models.k r3 = (com.braze.models.k) r3     // Catch: java.lang.Throwable -> L55
            r1.add(r3)     // Catch: java.lang.Throwable -> L55
            r0.remove(r3)     // Catch: java.lang.Throwable -> L55
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> L55
            lw.n r9 = new lw.n     // Catch: java.lang.Throwable -> L55
            r5 = 2
            r9.<init>(r3, r5)     // Catch: java.lang.Throwable -> L55
            r10 = 7
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r5 = r12
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L53
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L55
            r5 = 32
            if (r3 < r5) goto L58
            com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.I     // Catch: java.lang.Throwable -> L55
            tr.e r9 = new tr.e     // Catch: java.lang.Throwable -> L55
            r0 = 18
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L55
            r10 = 6
            r11 = 0
            r7 = 0
            r8 = 0
            r5 = r12
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L53
            goto L5b
        L53:
            r0 = move-exception
            goto L62
        L55:
            r0 = move-exception
            r5 = r12
            goto L62
        L58:
            r5 = r12
            goto L13
        L5a:
            r5 = r12
        L5b:
            com.braze.models.b r0 = new com.braze.models.b     // Catch: java.lang.Throwable -> L53
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r12)
            return r0
        L62:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L53
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.dispatch.h.e():com.braze.models.b");
    }

    public final r0 f() {
        return this.f9696a;
    }

    public static final void a(h hVar, com.braze.events.internal.dispatchmanager.c cVar) {
        cVar.getClass();
        com.braze.events.internal.dispatchmanager.b bVar = cVar.f9794a;
        List<k> list = cVar.f9795b;
        q qVar = cVar.f9796c;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            hVar.getClass();
            list.getClass();
            for (k kVar : list) {
                hVar.f9698c.putIfAbsent(((com.braze.models.outgoing.event.b) kVar).f10181d, kVar);
            }
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return;
            }
            hVar.a(qVar);
        } else {
            hVar.getClass();
            list.getClass();
            for (k kVar2 : list) {
                hVar.f9697b.putIfAbsent(((com.braze.models.outgoing.event.b) kVar2).f10181d, kVar2);
            }
        }
    }

    public static final String a(k kVar) {
        com.braze.models.outgoing.event.b bVar = (com.braze.models.outgoing.event.b) kVar;
        return "Event dispatched: " + bVar.getJsonObject() + " with uid: " + bVar.e();
    }

    public static final String a() {
        return "Max number of events per dispatch reached: 32 . No more events will be included in this dispatch";
    }

    public final void a(q qVar) {
        if (qVar != null) {
            ConcurrentHashMap concurrentHashMap = this.f9698c;
            if (!concurrentHashMap.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new tr.e(15), 7, (Object) null);
                Collection collectionValues = concurrentHashMap.values();
                collectionValues.getClass();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    ((com.braze.models.outgoing.event.b) ((k) it.next())).a(qVar);
                }
                this.f9697b.putAll(concurrentHashMap);
                Set setKeySet = concurrentHashMap.keySet();
                setKeySet.getClass();
                Iterator it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    this.f9698c.remove((String) it2.next());
                }
            }
        }
    }

    public final o a(o oVar) throws Throwable {
        oVar.getClass();
        g gVar = f9695d;
        j1 j1Var = this.f9696a;
        gVar.a(j1Var.f10014b, j1Var.f10033v, oVar, ((y) j1Var.f10015c).a());
        if (oVar instanceof com.braze.requests.g) {
            a((com.braze.requests.g) oVar);
            return oVar;
        }
        if (oVar instanceof r) {
            ((r) oVar).f10363i = ((x) this.f9696a.f10017e).b();
            return oVar;
        }
        if (oVar instanceof com.braze.requests.f) {
            p pVar = this.f9696a.D;
            com.braze.requests.f fVar = (com.braze.requests.f) oVar;
            fVar.f10382k = pVar.f10649d;
            fVar.l = pVar.f10650e;
        }
        return oVar;
    }
}
