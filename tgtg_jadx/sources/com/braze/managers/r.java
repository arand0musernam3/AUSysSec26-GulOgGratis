package com.braze.managers;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.braze.BrazeFlushPushDeliveryReceiver;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.events.IEventSubscriber;
import com.braze.events.internal.u;
import com.braze.events.internal.v;
import com.braze.models.IBrazeLocation;
import com.braze.storage.c3;
import com.braze.storage.i3;
import com.braze.storage.t1;
import com.braze.storage.t2;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements m0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String[] f10066u = {"android.os.deadsystemexception"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f10069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.braze.events.e f10070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BrazeConfigurationProvider f10071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i3 f10072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0 f10073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f10074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c3 f10075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0 f10076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v0 f10077k;
    public final t2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.braze.storage.t0 f10078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicInteger f10079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicInteger f10080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ReentrantLock f10081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v80.i1 f10082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t1 f10083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile String f10084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f10085t;

    public r(Context context, String str, String str2, w wVar, com.braze.events.e eVar, BrazeConfigurationProvider brazeConfigurationProvider, i3 i3Var, h0 h0Var, s sVar, c3 c3Var, y0 y0Var, v0 v0Var, t2 t2Var, com.braze.storage.t0 t0Var) {
        context.getClass();
        str2.getClass();
        wVar.getClass();
        eVar.getClass();
        brazeConfigurationProvider.getClass();
        i3Var.getClass();
        h0Var.getClass();
        sVar.getClass();
        c3Var.getClass();
        y0Var.getClass();
        v0Var.getClass();
        t2Var.getClass();
        t0Var.getClass();
        this.f10067a = context;
        this.f10068b = str;
        this.f10069c = wVar;
        this.f10070d = eVar;
        this.f10071e = brazeConfigurationProvider;
        this.f10072f = i3Var;
        this.f10073g = h0Var;
        this.f10074h = sVar;
        this.f10075i = c3Var;
        this.f10076j = y0Var;
        this.f10077k = v0Var;
        this.l = t2Var;
        this.f10078m = t0Var;
        this.f10079n = new AtomicInteger(0);
        this.f10080o = new AtomicInteger(0);
        this.f10081p = new ReentrantLock();
        this.f10082q = v80.f0.c();
        this.f10083r = new t1(context, str, str2);
        this.f10084s = "";
        this.f10085t = new AtomicBoolean(false);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new zv.l(26), 6, (Object) null);
        final int i11 = 0;
        com.braze.events.d dVar = (com.braze.events.d) eVar;
        dVar.c(com.braze.events.internal.s.class, new IEventSubscriber(this) { // from class: zv.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.braze.managers.r f48145b;

            {
                this.f48145b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i11) {
                    case 0:
                        com.braze.managers.r.a(this.f48145b, (com.braze.events.internal.s) obj);
                        break;
                    case 1:
                        com.braze.managers.r.a(this.f48145b, (u) obj);
                        break;
                    default:
                        com.braze.managers.r.a(this.f48145b, (v) obj);
                        break;
                }
            }
        });
        final int i12 = 1;
        dVar.c(com.braze.events.internal.u.class, new IEventSubscriber(this) { // from class: zv.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.braze.managers.r f48145b;

            {
                this.f48145b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i12) {
                    case 0:
                        com.braze.managers.r.a(this.f48145b, (com.braze.events.internal.s) obj);
                        break;
                    case 1:
                        com.braze.managers.r.a(this.f48145b, (u) obj);
                        break;
                    default:
                        com.braze.managers.r.a(this.f48145b, (v) obj);
                        break;
                }
            }
        });
        final int i13 = 2;
        dVar.c(com.braze.events.internal.v.class, new IEventSubscriber(this) { // from class: zv.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.braze.managers.r f48145b;

            {
                this.f48145b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i13) {
                    case 0:
                        com.braze.managers.r.a(this.f48145b, (com.braze.events.internal.s) obj);
                        break;
                    case 1:
                        com.braze.managers.r.a(this.f48145b, (u) obj);
                        break;
                    default:
                        com.braze.managers.r.a(this.f48145b, (v) obj);
                        break;
                }
            }
        });
    }

    public static final String c(r rVar) {
        return "SDK delayed initialization mode: " + rVar.f10078m.c() + " and GDPR disabled mode: " + rVar.f10075i.a() + ". Not closing session.";
    }

    public static final String e(r rVar) {
        return "SDK delayed initialization mode: " + rVar.f10078m.c() + " and GDPR disabled mode: " + rVar.f10075i.a() + ". Not opening session.";
    }

    public static final String f(r rVar) {
        return "SDK delayed initialization mode: " + rVar.f10078m.c() + " and GDPR disabled mode: " + rVar.f10075i.a() + ". Not opening session.";
    }

    public static final String h() {
        return "Publishing an internal push body clicked event for any awaiting triggers.";
    }

    public static final String i() {
        return "Adding push click to dispatcher pending list";
    }

    public static final String j() {
        return "Session in background, data syncing event on delay";
    }

    public static final String k() {
        return "Logging push max campaign";
    }

    public static final String m() {
        return "Flushing Push Delivery Events now";
    }

    public static final String n() {
        return "Attempted to flush Push Delivery events, but no events are available";
    }

    public static final String o() {
        return "Posting geofence report for geofence event.";
    }

    public static final String p() {
        return "Posting banners refresh request.";
    }

    public static final String r() {
        return "Posting feature flags refresh request.";
    }

    public static final String s() {
        return "Disallowing Content Cards sync due to Content Cards not being enabled.";
    }

    public static final String u() {
        return "Requesting DUST mite";
    }

    public static final String v() {
        return "Posting geofence request for location.";
    }

    public static final String x() {
        return "Sending Push Max data";
    }

    public static final String y() {
        return "Posting SDK Debugger Logs request.";
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.braze.models.k r16) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.managers.r.a(com.braze.models.k):boolean");
    }

    public final void b(a aVar) {
        aVar.getClass();
        if (this.f10075i.a() || this.f10078m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zv.p(this, 1), 6, (Object) null);
        } else {
            this.f10069c.c(aVar.f9947a.toString());
            this.f10074h.b();
        }
    }

    public final void d() {
        if (this.f10075i.a() || this.f10078m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zv.p(this, 2), 6, (Object) null);
        } else {
            this.f10069c.l();
        }
    }

    public final void g(com.braze.models.k kVar) {
        kVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.l(17), 7, (Object) null);
        com.braze.models.outgoing.event.b bVar = (com.braze.models.outgoing.event.b) kVar;
        bVar.f10182e.setValue(bVar, com.braze.models.outgoing.event.b.f10177h[0], this.f10068b);
        a(new com.braze.requests.l(this.f10072f, this.f10071e.getBaseUrlForRequests(), bVar));
    }

    public final void l() {
        if (this.f10075i.a() || this.f10078m.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zv.p(this, 5), 6, (Object) null);
        } else {
            this.f10069c.c((String) null);
        }
    }

    public final void q() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.l(23), 7, (Object) null);
        a(new com.braze.requests.j(this.f10072f, this.f10071e.getBaseUrlForRequests(), this.f10068b));
    }

    public final void t() {
        if (this.f10072f.F()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new zv.l(25), 6, (Object) null);
            a(new com.braze.requests.h(this.f10072f, this.f10071e.getBaseUrlForRequests(), this.f10068b));
        }
    }

    public final void w() {
        List listR0;
        if (this.f10072f.L()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.l(15), 7, (Object) null);
            i3 i3Var = this.f10072f;
            String baseUrlForRequests = this.f10071e.getBaseUrlForRequests();
            String str = this.f10068b;
            y0 y0Var = this.f10076j;
            Object data = y0Var.f10127b.readData(DataStoreKey.PUSH_MAX_LAST_UPDATE, -1L);
            data.getClass();
            long jLongValue = ((Long) data).longValue() - y0Var.f10126a.u();
            List listA = y0Var.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (((w0) obj).f10118b > jLongValue) {
                    arrayList.add(obj);
                }
            }
            List listR02 = CollectionsKt.r0(arrayList);
            ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(listR02, 10));
            Iterator it = listR02.iterator();
            while (it.hasNext()) {
                arrayList2.add(((w0) it.next()).f10117a);
            }
            Object data2 = this.f10076j.f10127b.readData(DataStoreKey.PUSH_MAX_LAST_UPDATE, -1L);
            data2.getClass();
            long jLongValue2 = ((Long) data2).longValue();
            t2 t2Var = this.l;
            long jV = this.f10072f.v();
            if (jV <= 0) {
                listR0 = kotlin.collections.n0.f26529a;
            } else {
                long jNowInSeconds = DateTimeUtils.nowInSeconds() - jV;
                Map mapA = t2Var.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapA.entrySet()) {
                    if (((Number) entry.getValue()).longValue() >= jNowInSeconds) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                listR0 = CollectionsKt.r0(linkedHashMap.keySet());
            }
            a(new com.braze.requests.s(i3Var, baseUrlForRequests, str, arrayList2, jLongValue2, listR0));
        }
    }

    public static final String c(com.braze.models.k kVar) {
        return "Not processing event after validation failed: " + kVar;
    }

    public static final String e() {
        return "BrazeManager got SdkDebuggerInitializationRequestedEvent";
    }

    public static final String f() {
        return "Braze SDK Debugger logs being sent";
    }

    public static final String e(com.braze.models.k kVar) {
        return e0.f.k("Not adding user id to event: ", JsonUtils.getPrettyPrintedString((JSONObject) ((com.braze.models.outgoing.event.b) kVar).getJsonObject()));
    }

    public static final String f(com.braze.models.k kVar) {
        return e0.f.k("Attempting to log event: ", JsonUtils.getPrettyPrintedString((JSONObject) ((com.braze.models.outgoing.event.b) kVar).getJsonObject()));
    }

    public final void c(String str) {
        str.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.l(29), 7, (Object) null);
        this.f10076j.a(str);
    }

    public static final String d(r rVar) {
        return "SDK delayed initialization mode: " + rVar.f10078m.c() + " and GDPR disabled mode: " + rVar.f10075i.a() + ". Not force closing session.";
    }

    public static final String c() {
        return "Requesting SDK Debugger Handshake";
    }

    public static final String d(com.braze.models.k kVar) {
        return e0.f.k("Not adding session id to event: ", JsonUtils.getPrettyPrintedString((JSONObject) ((com.braze.models.outgoing.event.b) kVar).getJsonObject()));
    }

    public static final String g() {
        return "Failed to log error.";
    }

    public static final String b(com.braze.models.k kVar) {
        return e0.f.k("BrazeManager logEvent called for: ", JsonUtils.getPrettyPrintedString((JSONObject) ((com.braze.models.outgoing.event.b) kVar).getJsonObject()));
    }

    public static final String b(r rVar) {
        return "SDK delayed initialization mode: " + rVar.f10078m.c() + " and GDPR disabled mode: " + rVar.f10075i.a() + ". Not adding request to dispatch.";
    }

    public final void b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, true, (Function0) new zv.l(27), 2, (Object) null);
        a(new com.braze.requests.x(this.f10072f, this.f10071e.getBaseUrlForRequests(), this.f10068b, arrayList));
    }

    public static final String b(Throwable th2) {
        return "Not logging duplicate error: " + th2;
    }

    public static final String b(long j9) {
        return l1.e("Scheduling Push Delivery Events Flush in ", j9, " ms");
    }

    public static final String b(String str) {
        return e0.f.k("Logging push delivery event for campaign id: ", str);
    }

    public final void b() {
        if (this.f10072f.M()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new zv.l(14), 6, (Object) null);
            a(new com.braze.requests.w(this.f10072f, this.f10071e.getBaseUrlForRequests(), this.f10068b));
        }
    }

    public static final void a(r rVar, com.braze.events.internal.s sVar) {
        sVar.getClass();
        throw null;
    }

    public static final void a(r rVar, com.braze.events.internal.u uVar) {
        uVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) rVar, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new zv.r(2), 6, (Object) null);
        rVar.b();
    }

    public static final void a(r rVar, com.braze.events.internal.v vVar) {
        vVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) rVar, BrazeLogger.Priority.D, (Throwable) null, true, (Function0) new zv.l(19), 2, (Object) null);
        rVar.b(vVar.f9823a);
    }

    public final void a(boolean z11) {
        this.f10085t.set(z11);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new zv.p(this, 3), 6, (Object) null);
    }

    public static final String a(r rVar) {
        return "Updated shouldRequestTriggersInNextRequest to: " + rVar.f10085t;
    }

    public final void a(a aVar) {
        aVar.getClass();
        if (!this.f10075i.a() && !this.f10078m.c()) {
            this.f10074h.e();
            w wVar = this.f10069c;
            String string = aVar.f9947a.toString();
            string.getClass();
            wVar.a(string);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zv.p(this, 0), 6, (Object) null);
    }

    public static final String a() {
        return "BrazeManager init called";
    }

    public static final String a(r rVar, com.braze.models.k kVar) {
        StringBuilder sbP = b3.i.p("SDK delayed initialization mode: ", rVar.f10078m.c(), " and GDPR disabled mode: ", rVar.f10075i.a(), ". Not logging event: ");
        sbP.append(kVar);
        return sbP.toString();
    }

    public final void a(com.braze.models.outgoing.j jVar) {
        jVar.getClass();
        Pair pairA = this.f10072f.a();
        if (pairA != null) {
            jVar.f10205c = new com.braze.models.outgoing.i(((Number) pairA.f26485a).longValue(), ((Boolean) pairA.f26486b).booleanValue());
        }
        if (this.f10085t.get()) {
            jVar.f10204b = Boolean.TRUE;
        }
        jVar.f10203a = this.f10068b;
        a(new com.braze.requests.g(this.f10072f, this.f10071e.getBaseUrlForRequests(), jVar.a()));
        this.f10085t.set(false);
    }

    public final void a(IBrazeLocation iBrazeLocation) {
        iBrazeLocation.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.l(20), 7, (Object) null);
        com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f10176g.a(iBrazeLocation);
        if (kVarA != null) {
            com.braze.models.outgoing.event.b bVar = (com.braze.models.outgoing.event.b) kVarA;
            bVar.f10182e.setValue(bVar, com.braze.models.outgoing.event.b.f10177h[0], this.f10068b);
            a(new com.braze.requests.k(this.f10072f, this.f10071e.getBaseUrlForRequests(), kVarA, this.f10068b));
        }
    }

    public final void a(ArrayList arrayList) {
        arrayList.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.l(18), 7, (Object) null);
        a(new com.braze.requests.a(arrayList, this.f10072f, this.f10071e.getBaseUrlForRequests(), this.f10068b));
    }

    public final void a(com.braze.requests.b bVar) {
        bVar.getClass();
        if (!this.f10075i.a() && !this.f10078m.c()) {
            bVar.f10356b = this.f10068b;
            ((com.braze.events.d) this.f10070d).b(new com.braze.events.internal.dispatchmanager.c(com.braze.events.internal.dispatchmanager.b.ADD_REQUEST, null, null, bVar, 6), com.braze.events.internal.dispatchmanager.c.class);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zv.p(this, 4), 6, (Object) null);
    }

    public final void a(long j9, long j11, int i11, com.braze.requests.c cVar) {
        cVar.getClass();
        if (!this.f10072f.E()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zv.l(28), 6, (Object) null);
        } else {
            a(new com.braze.requests.f(this.f10072f, this.f10071e.getBaseUrlForRequests(), j9, j11, this.f10068b, i11, cVar));
        }
    }

    public final boolean a(Throwable th2) {
        ReentrantLock reentrantLock = this.f10081p;
        reentrantLock.lock();
        try {
            this.f10079n.getAndIncrement();
            if (Intrinsics.areEqual(this.f10084s, th2.getMessage()) && this.f10080o.get() > 3 && this.f10079n.get() < 25) {
                reentrantLock.unlock();
                return true;
            }
            boolean zAreEqual = Intrinsics.areEqual(this.f10084s, th2.getMessage());
            AtomicInteger atomicInteger = this.f10080o;
            if (zAreEqual) {
                atomicInteger.getAndIncrement();
            } else {
                atomicInteger.set(0);
            }
            if (this.f10079n.get() >= 25) {
                this.f10079n.set(0);
            }
            this.f10084s = th2.getMessage();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(Throwable th2, boolean z11) {
        com.braze.models.k kVarA;
        th2.getClass();
        try {
            if (a(th2)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new zendesk.ui.android.conversation.textcell.c(th2, 12), 6, (Object) null);
                return;
            }
            String string = th2.toString();
            String str = f10066u[0];
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = string.toLowerCase(locale);
            lowerCase.getClass();
            if (StringsKt.z(lowerCase, str, false) || (kVarA = com.braze.models.outgoing.event.b.f10176g.a(th2, this.f10069c.h(), z11)) == null) {
                return;
            }
            a(kVarA);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new zv.l(16), 4, (Object) null);
        }
    }

    public final void a(long j9) {
        Object systemService = this.f10067a.getSystemService("alarm");
        systemService.getClass();
        AlarmManager alarmManager = (AlarmManager) systemService;
        Intent intent = new Intent(this.f10067a, (Class<?>) BrazeFlushPushDeliveryReceiver.class);
        intent.setAction(BrazeFlushPushDeliveryReceiver.FLUSH_BRAZE_PUSH_DELIVERIES_ACTION);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f10067a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 134217728);
        if (j9 <= 0) {
            alarmManager.cancel(broadcast);
            v0 v0Var = this.f10077k;
            v0Var.getClass();
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = v0Var.f10099a;
            reentrantLock.lock();
            try {
                for (com.braze.models.push.a aVar : v0Var.f10100b) {
                    if (arrayList.size() >= 32) {
                        break;
                    } else {
                        arrayList.add(aVar);
                    }
                }
                v0Var.f10100b.removeAll(arrayList);
                reentrantLock.unlock();
                if (!arrayList.isEmpty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.r(0), 7, (Object) null);
                    a(new com.braze.requests.r(this.f10072f, this.f10071e.getBaseUrlForRequests(), this.f10068b, arrayList));
                    return;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new zv.r(1), 7, (Object) null);
                    return;
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new dw.b(j9, 12), 7, (Object) null);
        alarmManager.set(2, SystemClock.elapsedRealtime() + j9, broadcast);
    }

    public final void a(String str) {
        str.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xv.a(str, 19), 7, (Object) null);
        this.f10077k.a(str);
    }
}
