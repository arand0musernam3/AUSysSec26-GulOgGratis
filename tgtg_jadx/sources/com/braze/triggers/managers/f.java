package com.braze.triggers.managers;

import android.content.Context;
import com.adyen.checkout.components.core.Address;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.internal.c0;
import com.braze.managers.r;
import com.braze.requests.n;
import com.braze.requests.o;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.h0;
import com.braze.storage.i0;
import com.braze.storage.o0;
import com.braze.storage.p0;
import com.braze.storage.t3;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.i;
import i90.j;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlin.text.s;
import m2.b2;
import m90.r1;
import org.json.JSONObject;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f10865p = new c();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f10866q = 30000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f10868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.braze.events.e f10869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.braze.events.e f10870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t3 f10872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f10873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f10874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Queue f10875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f10876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f10877k;
    public volatile long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ReentrantLock f10878m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ReentrantLock f10879n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.braze.requests.framework.g f10880o;

    public f(Context context, r rVar, com.braze.events.e eVar, com.braze.events.e eVar2, BrazeConfigurationProvider brazeConfigurationProvider, String str, String str2, com.braze.requests.framework.g gVar) {
        context.getClass();
        rVar.getClass();
        eVar.getClass();
        eVar2.getClass();
        brazeConfigurationProvider.getClass();
        str2.getClass();
        gVar.getClass();
        this.f10878m = new ReentrantLock();
        this.f10879n = new ReentrantLock();
        this.f10867a = context.getApplicationContext();
        this.f10868b = rVar;
        this.f10869c = eVar;
        eVar2.getClass();
        this.f10870d = eVar2;
        this.f10871e = brazeConfigurationProvider.getTriggerActionMinimumTimeIntervalInSeconds();
        t3 t3Var = new t3(context, str, str2);
        this.f10872f = t3Var;
        this.f10873g = new b(context, str2);
        this.f10874h = new h(t3Var);
        this.f10876j = g();
        this.f10875i = new ArrayDeque();
        this.f10880o = gVar;
        l();
    }

    public static final String c(com.braze.triggers.actions.a aVar) {
        return a0.p("Trigger manager received reenqueue with action with id: <", ((com.braze.triggers.actions.g) aVar).c(), ">.");
    }

    public static final String e(com.braze.triggers.actions.a aVar) {
        return a0.p("Retrieving templated triggered action id ", ((com.braze.triggers.actions.g) aVar).c(), " from DataStore.");
    }

    public static final String f(com.braze.triggers.actions.a aVar) {
        return a0.p("Trigger manager received failed triggered action with id: <", ((com.braze.triggers.actions.g) aVar).c(), ">. Will attempt to perform fallback triggered actions, if present.");
    }

    public static final String h() {
        return "No triggered actions found in DataStore";
    }

    public static final String i() {
        return "Skipping blank triggered action string from DataStore";
    }

    public static final String j() {
        return "Triggered action has no trigger metadata and cannot fallback. Doing nothing.";
    }

    public static final String k() {
        return "Triggered action has no fallback action to perform. Doing nothing.";
    }

    public static final String m() {
        return "Subscribing to trigger dispatch events.";
    }

    public static final String n() {
        return "Executing pending events after trigger dispatch completed.";
    }

    public final void a(List list) throws Throwable {
        String strC;
        list.getClass();
        com.braze.triggers.events.h hVar = new com.braze.triggers.events.h();
        ReentrantLock reentrantLock = this.f10878m;
        reentrantLock.lock();
        try {
            this.f10876j.clear();
            t3 t3Var = this.f10872f;
            t3 t3Var2 = null;
            if (t3Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("triggerDataStoreProvider");
                t3Var = null;
            }
            t3Var.clearData(DataStoreKey.TRIGGERED_ACTIONS);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new cw.a(list, 7), 7, (Object) null);
            Iterator it = list.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                try {
                    com.braze.triggers.actions.a aVar = (com.braze.triggers.actions.a) it.next();
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.a(aVar, 3), 7, (Object) null);
                    this.f10876j.put(((com.braze.triggers.actions.g) aVar).f10798a, aVar);
                    if (((com.braze.triggers.actions.g) aVar).b(hVar)) {
                        z11 = true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    reentrantLock.unlock();
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList(e0.o(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(((com.braze.triggers.actions.a) it2.next()).getJsonObject()));
            }
            t3 t3Var3 = this.f10872f;
            if (t3Var3 != null) {
                t3Var2 = t3Var3;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("triggerDataStoreProvider");
            }
            DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        n90.b bVar = n90.c.f30748d;
                        bVar.getClass();
                        strC = bVar.c(new m90.d(r1.f29848a, 0), arrayList);
                    } catch (Exception e5) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) i.f10761a, 4, (Object) null);
                        strC = arrayList instanceof Map ? "{}" : "[]";
                    }
                    t3Var2.writeData(dataStoreKey, strC);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
                }
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new cw.a(list, 8), 7, (Object) null);
            reentrantLock.unlock();
            this.f10874h.a(list);
            this.f10873g.a(list);
            if (!z11) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.c(5), 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new qw.c(4), 6, (Object) null);
                a((com.braze.triggers.events.i) hVar);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void b() throws Throwable {
        ReentrantLock reentrantLock = this.f10879n;
        reentrantLock.lock();
        try {
            if (a()) {
                reentrantLock.unlock();
                return;
            }
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.c(7), 7, (Object) null);
                while (!((ArrayDeque) this.f10875i).isEmpty()) {
                    com.braze.triggers.events.b bVar = (com.braze.triggers.events.b) ((ArrayDeque) this.f10875i).poll();
                    if (bVar != null) {
                        a(bVar);
                    }
                }
                reentrantLock.unlock();
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        reentrantLock.unlock();
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, com.braze.triggers.actions.g, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final com.braze.triggers.actions.a d(com.braze.triggers.events.b bVar) {
        com.braze.triggers.events.b bVar2;
        com.braze.triggers.events.b bVar3 = bVar;
        bVar3.getClass();
        ReentrantLock reentrantLock = this.f10878m;
        reentrantLock.lock();
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f10876j.values().iterator();
            int i11 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                ?? r42 = (com.braze.triggers.actions.g) ((com.braze.triggers.actions.a) it.next());
                if (r42.b(bVar3) && this.f10874h.a((com.braze.triggers.actions.g) r42)) {
                    bVar2 = bVar3;
                    if (f10865p.a(bVar3, r42, this.l, this.f10871e)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b2(r42, 21), 7, (Object) null);
                        int i12 = r42.f10799b.f10825c;
                        if (i12 > i11) {
                            objectRef.element = r42;
                            i11 = i12;
                        }
                        arrayList.add(r42);
                    }
                } else {
                    bVar2 = bVar3;
                }
                bVar3 = bVar2;
            }
            com.braze.triggers.events.b bVar4 = bVar3;
            Object obj = objectRef.element;
            if (obj == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ow.b(bVar4, 2), 7, (Object) null);
                reentrantLock.unlock();
                return null;
            }
            arrayList.remove(obj);
            ((com.braze.triggers.actions.g) ((com.braze.triggers.actions.a) objectRef.element)).f10801d = new com.braze.triggers.utils.b(arrayList);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.b(2, bVar4, objectRef), 7, (Object) null);
            com.braze.triggers.actions.a aVar = (com.braze.triggers.actions.a) objectRef.element;
            reentrantLock.unlock();
            return aVar;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final LinkedHashMap g() {
        ArrayList arrayList;
        Collection collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        t3 t3Var = this.f10872f;
        if (t3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("triggerDataStoreProvider");
            t3Var = null;
        }
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = t3Var.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (StringsKt.H(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.H(str) || Intrinsics.areEqual(StringsKt.e0(str).toString(), Address.ADDRESS_NULL_PLACEHOLDER)) {
                        collection = n0.f26529a;
                    } else {
                        try {
                            n90.b bVar = n90.c.f30748d;
                            bVar.getClass();
                            collection = (List) bVar.b(new m90.d(r1.f29848a, 0), str);
                        } catch (Exception e5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.support.e(str), 4, (Object) null);
                            collection = n0.f26529a;
                        }
                    }
                    arrayList = CollectionsKt.t0(collection);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new i0(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        ArrayList<String> arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.c(6), 7, (Object) null);
            return linkedHashMap;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j(5, arrayList2), 7, (Object) null);
        for (String str2 : arrayList2) {
            if (StringsKt.H(str2)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.c(8), 7, (Object) null);
            } else {
                try {
                    com.braze.triggers.actions.h hVarB = com.braze.triggers.utils.c.f10889a.b(new JSONObject(str2), this.f10868b);
                    if (hVarB != null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b2(hVarB, 22), 7, (Object) null);
                        linkedHashMap.put(hVarB.f10798a, hVarB);
                    }
                } catch (Exception e12) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e12, false, (Function0) new qw.e(str2, 4), 4, (Object) null);
                }
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new lw.e(linkedHashMap, 5), 7, (Object) null);
        return linkedHashMap;
    }

    public final void l() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new qw.c(9), 6, (Object) null);
        ((com.braze.events.d) this.f10869c).c(c0.class, new qw.g(this, 0));
    }

    public static final String c(List list) {
        return k.h(list.size(), "Successfully saved ", " triggered actions to DataStore");
    }

    public static final String e(com.braze.triggers.events.b bVar) {
        return a0.p("Failed to match triggered action for incoming <", bVar.a(), ">.");
    }

    public static final String f() {
        return "No test triggered actions found.";
    }

    public static final String c(com.braze.triggers.events.b bVar) {
        return a0.p("No action found for ", bVar.a(), " event, publishing NoMatchingTriggerEvent");
    }

    public static final String e() {
        return "Test triggered actions found, triggering test event.";
    }

    public static final String c() {
        return "In flight trigger requests is empty. Executing any pending trigger events.";
    }

    public static final String b(List list) {
        return k.h(list.size(), "Registering ", " new triggered actions.");
    }

    public final void b(com.braze.triggers.actions.a aVar) {
        aVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.a(aVar, 6), 7, (Object) null);
        b(this.f10877k);
        this.f10877k = 0L;
        this.f10874h.d(aVar);
    }

    public static final String b(com.braze.triggers.events.b bVar) {
        return a0.p("New incoming <", bVar.a(), ">. Searching for matching triggers.");
    }

    public final void b(long j9) {
        this.f10877k = this.l;
        this.l = j9;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.b(j9, 2), 7, (Object) null);
    }

    public static final String d() {
        return "Trigger request is in-flight. Not processing trigger event.";
    }

    public static final String d(com.braze.triggers.actions.a aVar) {
        return a0.p("Registering triggered action id ", ((com.braze.triggers.actions.g) aVar).c(), " ");
    }

    public static final String d(List list) {
        return k.h(list.size(), "Retrieved ", " triggered actions from DataStore");
    }

    public static final String g(com.braze.triggers.actions.a aVar) {
        return e0.f.k("Fallback trigger has expired. Trigger id: ", ((com.braze.triggers.actions.g) aVar).c());
    }

    public static final String a(long j9) {
        return e0.f.i(j9, "TriggerManager lastDisplayTimeSeconds updated to ");
    }

    public final void a(com.braze.triggers.events.i iVar) {
        iVar.getClass();
        ReentrantLock reentrantLock = this.f10879n;
        reentrantLock.lock();
        try {
            ((ArrayDeque) this.f10875i).add(iVar);
            if (!a()) {
                b();
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.c(12), 7, (Object) null);
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void a(com.braze.triggers.events.b bVar, com.braze.triggers.actions.a aVar) {
        bVar.getClass();
        aVar.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.a(aVar, 4), 7, (Object) null);
        com.braze.triggers.utils.b bVar2 = ((com.braze.triggers.actions.g) aVar).f10801d;
        if (bVar2 == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.c(10), 7, (Object) null);
            return;
        }
        com.braze.triggers.actions.a aVar2 = (com.braze.triggers.actions.a) bVar2.f10888a.poll();
        if (aVar2 == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.c(11), 7, (Object) null);
            return;
        }
        com.braze.triggers.actions.g gVar = (com.braze.triggers.actions.g) aVar2;
        gVar.f10801d = bVar2;
        Map mapA = this.f10873g.a(aVar2);
        mapA.getClass();
        ((com.braze.triggers.actions.h) aVar2).f10803f = new HashMap(mapA);
        long j9 = ((com.braze.triggers.events.i) bVar).f10848b;
        long j11 = gVar.f10799b.f10827e;
        long millis = TimeUnit.SECONDS.toMillis(r1.f10826d);
        long j12 = j11 != -1 ? j11 + j9 : j9 + millis + f10866q;
        if (j12 < DateTimeUtils.nowInMilliseconds()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.a(aVar2, 5), 7, (Object) null);
            a(bVar, aVar2);
        } else {
            long jMax = Math.max(0L, (millis + j9) - DateTimeUtils.nowInMilliseconds());
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.h(aVar2, jMax, 0), 7, (Object) null);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(jMax), null, new e(aVar2, this, bVar, j12, null), 2, null);
        }
    }

    public static final String a(com.braze.triggers.actions.a aVar, long j9) {
        StringBuilder sbN = b3.i.n(j9, "Performing fallback triggered action with id: <", ((com.braze.triggers.actions.g) aVar).c(), "> with a delay: ");
        sbN.append(" ms");
        return sbN.toString();
    }

    public static final void a(f fVar, c0 c0Var) {
        c0Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) fVar, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new qw.c(3), 6, (Object) null);
        fVar.b();
    }

    public final void a(com.braze.triggers.events.b bVar) {
        bVar.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ow.b(bVar, 3), 7, (Object) null);
        com.braze.triggers.actions.a aVarD = d(bVar);
        if (aVarD != null) {
            Map mapA = this.f10873g.a(aVarD);
            mapA.getClass();
            ((com.braze.triggers.actions.h) aVarD).f10803f = new HashMap(mapA);
            int i11 = ((com.braze.triggers.actions.g) aVarD).f10799b.f10827e;
            long j9 = i11 != -1 ? ((com.braze.triggers.events.i) bVar).f10848b + ((long) i11) : -1L;
            long millis = TimeUnit.SECONDS.toMillis(r0.f10826d);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(millis), null, new d(this, aVarD, bVar, j9, millis, null), 2, null);
            return;
        }
        String strA = bVar.a();
        int iHashCode = strA.hashCode();
        if (iHashCode != 3417674) {
            if (iHashCode != 717572172) {
                if (iHashCode != 1743324417 || !strA.equals("purchase")) {
                    return;
                }
            } else if (!strA.equals("custom_event")) {
                return;
            }
        } else if (!strA.equals("open")) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ow.b(bVar, 4), 7, (Object) null);
        com.braze.events.e eVar = this.f10870d;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("externalEventMessenger");
            eVar = null;
        }
        String strA2 = bVar.a();
        strA2.getClass();
        ((com.braze.events.d) eVar).b(new NoMatchingTriggerEvent(strA2), NoMatchingTriggerEvent.class);
    }

    public static final String a(com.braze.triggers.actions.a aVar) {
        return a0.p("Found potential triggered action for incoming trigger event. Action id ", ((com.braze.triggers.actions.g) aVar).c(), ".");
    }

    public static final String a(com.braze.triggers.events.b bVar, Ref.ObjectRef objectRef) {
        String prettyPrintedString;
        com.braze.triggers.events.i iVar = (com.braze.triggers.events.i) bVar;
        if (iVar.b() != null) {
            prettyPrintedString = JsonUtils.getPrettyPrintedString((JSONObject) ((com.braze.models.outgoing.event.b) iVar.b()).getJsonObject());
        } else {
            prettyPrintedString = "";
        }
        return s.c("\n     Found best triggered action for incoming trigger event " + prettyPrintedString + ".\n     Matched Action id: " + ((com.braze.triggers.actions.g) ((com.braze.triggers.actions.a) objectRef.element)).c() + ".\n                ");
    }

    public static final String a(String str) {
        return a0.p("Failed to parse triggered action JSON:'", str, "' from DataStore.");
    }

    public static final String a(Map map) {
        return k.h(map.size(), "Successfully loaded ", " triggered actions from DataStore");
    }

    public final boolean a() {
        com.braze.requests.framework.b bVar = (com.braze.requests.framework.b) this.f10880o.f10408e.get(n.f10451f);
        if (bVar == null || !(bVar instanceof com.braze.requests.framework.queue.c)) {
            return false;
        }
        ArrayList<com.braze.requests.framework.h> arrayList = ((com.braze.requests.framework.queue.c) bVar).f10390e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (com.braze.requests.framework.h hVar : arrayList) {
            o oVar = hVar.f10416a;
            if ((oVar instanceof com.braze.requests.g) && ((com.braze.requests.g) oVar).f10434k.c() && hVar.f10419d == com.braze.requests.framework.i.IN_FLIGHT) {
                return true;
            }
        }
        return false;
    }
}
