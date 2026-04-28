package com.braze.events;

import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.internal.a0;
import com.braze.events.internal.e0;
import com.braze.events.internal.f0;
import com.braze.events.internal.g;
import com.braze.events.internal.g0;
import com.braze.events.internal.m;
import com.braze.events.internal.n;
import com.braze.events.internal.u;
import com.braze.events.internal.w;
import com.braze.events.internal.y;
import com.braze.events.internal.z;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.managers.h0;
import com.braze.managers.j;
import com.braze.managers.k0;
import com.braze.managers.p;
import com.braze.managers.r;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.l;
import com.braze.requests.o;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.d3;
import com.braze.storage.f3;
import com.braze.storage.i3;
import com.braze.storage.o0;
import com.braze.storage.p0;
import com.braze.storage.u3;
import com.braze.storage.v0;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.i;
import com.braze.support.k;
import com.braze.triggers.managers.f;
import com.braze.triggers.managers.h;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m90.r1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public final AtomicBoolean A;
    public final AtomicBoolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f9744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f9745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f9746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u3 f9747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v0 f9748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f9749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f9750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h0 f9751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BrazeGeofenceManager f9752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f9753k;
    public final BrazeConfigurationProvider l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.braze.storage.p f9754m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d3 f9755n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i3 f9756o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k0 f9757p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.braze.managers.v0 f9758q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f9759r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f9760s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f9761t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public e0 f9762u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f9763v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f9764w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f9765x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f9766y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AtomicBoolean f9767z;

    public a(Context context, p pVar, e eVar, r rVar, u3 u3Var, v0 v0Var, f fVar, h hVar, h0 h0Var, BrazeGeofenceManager brazeGeofenceManager, e eVar2, BrazeConfigurationProvider brazeConfigurationProvider, com.braze.storage.p pVar2, d3 d3Var, i3 i3Var, k0 k0Var, com.braze.managers.v0 v0Var2, j jVar) {
        context.getClass();
        pVar.getClass();
        eVar.getClass();
        rVar.getClass();
        u3Var.getClass();
        v0Var.getClass();
        fVar.getClass();
        hVar.getClass();
        h0Var.getClass();
        brazeGeofenceManager.getClass();
        eVar2.getClass();
        brazeConfigurationProvider.getClass();
        pVar2.getClass();
        d3Var.getClass();
        i3Var.getClass();
        k0Var.getClass();
        v0Var2.getClass();
        jVar.getClass();
        this.f9743a = context;
        this.f9744b = pVar;
        this.f9745c = eVar;
        this.f9746d = rVar;
        this.f9747e = u3Var;
        this.f9748f = v0Var;
        this.f9749g = fVar;
        this.f9750h = hVar;
        this.f9751i = h0Var;
        this.f9752j = brazeGeofenceManager;
        this.f9753k = eVar2;
        this.l = brazeConfigurationProvider;
        this.f9754m = pVar2;
        this.f9755n = d3Var;
        this.f9756o = i3Var;
        this.f9757p = k0Var;
        this.f9758q = v0Var2;
        this.f9759r = jVar;
        this.f9760s = new AtomicBoolean(false);
        this.f9761t = new AtomicBoolean(false);
        this.f9763v = new AtomicBoolean(false);
        this.f9764w = new AtomicBoolean(false);
        this.f9765x = new AtomicBoolean(false);
        this.f9766y = new AtomicBoolean(false);
        this.f9767z = new AtomicBoolean(false);
        this.A = new AtomicBoolean(false);
        this.B = new AtomicBoolean(false);
    }

    public static final String J() {
        return "Requesting Banners refresh on session created event due to configuration.";
    }

    public static final String K() {
        return "Banners already initialized. Not retrieving.";
    }

    public static final String M() {
        return "Requesting Content Card refresh on session created event due to configuration.";
    }

    public static final String N() {
        return "Content Cards already initialized. Not retrieving.";
    }

    public static final String P() {
        return "Starting DUST subscription due to configuration.";
    }

    public static final String Q() {
        return "DUST initial subscription already started. Not starting again.";
    }

    public static final String S() {
        return "Requesting Feature Flags refresh on session created event due to configuration.";
    }

    public static final String T() {
        return "Feature Flags already initialized. Not retrieving.";
    }

    public static final String V() {
        return "Requesting Push Max request on session created event due to configuration.";
    }

    public static final String W() {
        return "Push Max already requested for this session. Not requesting again.";
    }

    public static final String Y() {
        return "Doing Debugger Handshake.";
    }

    public static final String Z() {
        return "Debugger Initialization already attempted. Not doing Debugger initialization again.";
    }

    public static final void a(a aVar, g gVar) {
        String strC;
        gVar.getClass();
        o oVar = gVar.f9802a;
        com.braze.models.outgoing.h hVar = ((com.braze.requests.b) oVar).f10363i;
        if (hVar != null) {
            aVar.f9748f.a((Object) hVar, true);
        }
        if (oVar instanceof com.braze.requests.g) {
            com.braze.requests.g gVar2 = (com.braze.requests.g) oVar;
            l lVar = gVar2.f10435m;
            if (lVar != null) {
                aVar.f9747e.a((Object) lVar, true);
            }
            com.braze.models.b bVar = gVar2.f10436n;
            if (bVar != null) {
                aVar.f9751i.a(bVar.f10133a);
            }
            if (gVar2.f10434k.c()) {
                aVar.f9746d.a(false);
            }
            EnumSet enumSet = gVar2.f10437o;
            if (enumSet != null) {
                d3 d3Var = aVar.f9755n;
                d3Var.getClass();
                f3 f3Var = d3Var.f10547a;
                DataStoreKey dataStoreKey = DataStoreKey.SDK_METADATA;
                List listR0 = CollectionsKt.r0(k.a(enumSet));
                if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(dataStoreKey), 12, (Object) null);
                } else {
                    try {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        try {
                            n90.b bVar2 = n90.c.f30748d;
                            bVar2.getClass();
                            strC = bVar2.c(new m90.d(r1.f29848a, 0), listR0);
                        } catch (Exception e5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) i.f10761a, 4, (Object) null);
                            strC = ((listR0 instanceof Map) || listR0 == null) ? "{}" : "[]";
                        }
                        f3Var.writeData(dataStoreKey, strC);
                    } catch (Exception e11) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e11, false, (Function0) new p0(dataStoreKey), 8, (Object) null);
                    }
                }
            }
            if (gVar2.f10434k.f10208c != null) {
                aVar.f9756o.N();
            }
        }
        if (oVar instanceof com.braze.requests.r) {
            aVar.f9758q.a(((com.braze.requests.r) oVar).f10462k);
        }
    }

    public static final String b() {
        return "Failed to request a content card refresh.";
    }

    public static final String b0() {
        return "Performing push delivery event flush";
    }

    public static final String c() {
        return "Requesting Braze Geofence refresh on session created event due to configuration.";
    }

    public static final String d() {
        return "Not automatically requesting Braze Geofence refresh on session created event due to configuration.";
    }

    public static final String d0() {
        return "Requesting trigger refresh in next sync";
    }

    public static final String e() {
        return "Session created event for new session received.";
    }

    public static final String f() {
        return "Session start event for new session received.";
    }

    public static final String g() {
        return "Not automatically requesting Content Card refresh on session created event due to server configuration.";
    }

    public static final String h() {
        return "Not automatically requesting Feature Flags refresh on session created event due to server configuration.";
    }

    public static final String i() {
        return "Not automatically requesting Push Max on session created event due to server configuration.";
    }

    public static final String j() {
        return "Not automatically starting DUST subscription on session created event due to server configuration.";
    }

    public static final String k() {
        return "Not automatically requesting Banners refresh on session created event due to server configuration.";
    }

    public static final String l() {
        return "Not automatically starting SDK Debugger on session created event due to server configuration.";
    }

    public static final String m() {
        return "Failed to log the storage exception.";
    }

    public static final String n() {
        return "Requesting trigger update due to trigger-eligible push click event";
    }

    public static final String u() {
        return "Failed to log error.";
    }

    public final IEventSubscriber A() {
        return new vv.a(this, 14);
    }

    public final IEventSubscriber B() {
        return new vv.a(this, 2);
    }

    public final IEventSubscriber C() {
        return new vv.a(this, 9);
    }

    public final IEventSubscriber D() {
        return new vv.a(this, 17);
    }

    public final IEventSubscriber E() {
        return new vv.a(this, 13);
    }

    public final IEventSubscriber F() {
        return new vv.a(this, 11);
    }

    public final IEventSubscriber G() {
        return new vv.a(this, 4);
    }

    public final IEventSubscriber H() {
        return new vv.a(this, 3);
    }

    public final void I() {
        if (!this.A.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(11), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(10), 7, (Object) null);
            this.f9759r.a();
        }
    }

    public final void L() {
        if (!this.f9764w.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new uu.a(26), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new uu.a(25), 7, (Object) null);
        r rVar = this.f9746d;
        com.braze.storage.p pVar = this.f9754m;
        rVar.a(pVar.f10649d, pVar.f10650e, 0, com.braze.requests.c.SESSION_START);
    }

    public final void O() {
        if (!this.f9767z.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(13), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(12), 7, (Object) null);
            this.f9746d.t();
        }
    }

    public final void R() {
        if (!this.f9765x.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(8), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(7), 7, (Object) null);
            this.f9757p.f10042d.q();
        }
    }

    public final void U() {
        if (!this.f9766y.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(19), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(18), 7, (Object) null);
            this.f9746d.w();
        }
    }

    public final void X() {
        if (!this.B.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(15), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(14), 7, (Object) null);
        ((d) this.f9745c).b(new u(), u.class);
    }

    public final void a0() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new uu.a(29), 7, (Object) null);
        this.f9746d.a(0L);
    }

    public final void c0() {
        a aVar;
        com.braze.models.outgoing.j jVar = new com.braze.models.outgoing.j();
        if (this.f9746d.f10085t.get()) {
            this.f9760s.set(true);
            aVar = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new uu.a(24), 7, (Object) null);
            jVar.f10204b = Boolean.TRUE;
            aVar.f9746d.a(false);
        } else {
            aVar = this;
        }
        if (Intrinsics.areEqual(jVar.f10204b, Boolean.TRUE)) {
            aVar.f9746d.a(jVar);
        }
    }

    public final IEventSubscriber o() {
        return new vv.a(this, 5);
    }

    public final IEventSubscriber p() {
        return new vv.a(this, 0);
    }

    public final IEventSubscriber q() {
        return new vv.a(this, 1);
    }

    public final IEventSubscriber r() {
        return new vv.a(this, 18);
    }

    public final IEventSubscriber s() {
        return new vv.a(this, 7);
    }

    public final IEventSubscriber t() {
        return new vv.a(this, 8);
    }

    public final IEventSubscriber v() {
        return new vv.a(this, 6);
    }

    public final IEventSubscriber w() {
        return new vv.a(this, 12);
    }

    public final IEventSubscriber x() {
        return new vv.a(this, 15);
    }

    public final IEventSubscriber y() {
        return new vv.a(this, 10);
    }

    public final IEventSubscriber z() {
        return new vv.a(this, 16);
    }

    public static final void a(a aVar, com.braze.events.internal.f fVar) {
        e0 e0Var;
        fVar.getClass();
        o oVar = fVar.f9800a;
        com.braze.models.outgoing.h hVar = ((com.braze.requests.b) oVar).f10363i;
        if (hVar != null) {
            aVar.f9748f.a((Object) hVar, false);
        }
        if (oVar instanceof com.braze.requests.g) {
            com.braze.requests.g gVar = (com.braze.requests.g) oVar;
            if (gVar.f10434k.c()) {
                if (aVar.f9760s.compareAndSet(true, false)) {
                    aVar.f9749g.a((com.braze.triggers.events.i) new com.braze.triggers.events.e());
                }
                if (aVar.f9761t.compareAndSet(true, false) && (e0Var = aVar.f9762u) != null) {
                    aVar.f9749g.a((com.braze.triggers.events.i) new com.braze.triggers.events.g(e0Var.f9798a, e0Var.f9799b));
                    aVar.f9762u = null;
                }
                aVar.f9746d.a(true);
            }
            l lVar = gVar.f10435m;
            if (lVar != null) {
                aVar.f9747e.a((Object) lVar, false);
                if (lVar.f10209a.has(DataStoreKey.PUSH_TOKEN.getKey())) {
                    aVar.f9747e.j();
                    aVar.f9748f.e();
                }
            }
            com.braze.models.b bVar = gVar.f10436n;
            if (bVar != null) {
                for (com.braze.models.k kVar : bVar.f10133a) {
                    e eVar = aVar.f9745c;
                    List listC = c0.c(kVar);
                    listC.getClass();
                    ((d) eVar).b(new com.braze.events.internal.dispatchmanager.c(com.braze.events.internal.dispatchmanager.b.ADD_BRAZE_EVENTS, listC, null, null, 12), com.braze.events.internal.dispatchmanager.c.class);
                }
            }
            if (gVar.f10434k.f10208c != null) {
                aVar.f9756o.N();
            }
        }
        if (oVar instanceof com.braze.requests.r) {
            aVar.f9758q.b(((com.braze.requests.r) oVar).f10462k);
        }
    }

    public static final void a(a aVar, com.braze.events.internal.a aVar2) {
        aVar2.getClass();
        ((d) aVar.f9753k).b(aVar.f9759r.a(aVar2.f9780a), BannersUpdatedEvent.class);
    }

    public static final void a(a aVar, com.braze.events.internal.i iVar) {
        iVar.getClass();
        ((d) aVar.f9753k).b(aVar.f9757p.a(iVar.f9809a), FeatureFlagsUpdatedEvent.class);
    }

    public static final void a(a aVar, com.braze.events.internal.l lVar) {
        lVar.getClass();
        aVar.f9752j.registerGeofences(lVar.f9811a);
    }

    public static final void a(a aVar, m mVar) {
        mVar.getClass();
        com.braze.triggers.events.b bVar = mVar.f9812a;
        com.braze.triggers.actions.h hVar = mVar.f9813b;
        IInAppMessage iInAppMessage = mVar.f9814c;
        String str = mVar.f9815d;
        synchronized (aVar.f9750h) {
            try {
                if (aVar.f9750h.a((com.braze.triggers.actions.g) hVar)) {
                    ((d) aVar.f9753k).b(new InAppMessageEvent(bVar, hVar, iInAppMessage, str), InAppMessageEvent.class);
                    aVar.f9750h.a(hVar, DateTimeUtils.nowInSeconds());
                    aVar.f9749g.b(DateTimeUtils.nowInSeconds());
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.a(hVar, 10), 7, (Object) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void a(a aVar, w wVar) {
        wVar.getClass();
        com.braze.models.response.m mVar = wVar.f9824a;
        aVar.f9752j.configureFromServerConfig(mVar);
        if (aVar.f9763v.get()) {
            if (mVar.f10265j) {
                aVar.L();
            }
            if (mVar.f10267m) {
                aVar.R();
            }
            if (mVar.f10269o) {
                aVar.U();
            }
            if (mVar.f10274t) {
                aVar.O();
            }
            if (mVar.G) {
                aVar.I();
            }
            if (mVar.f10280z) {
                aVar.X();
            }
        }
    }

    public static final void a(a aVar, f0 f0Var) {
        f0Var.getClass();
        aVar.f9749g.a((com.braze.triggers.events.i) f0Var.f9801a);
    }

    public static final void a(a aVar, g0 g0Var) {
        g0Var.getClass();
        aVar.f9749g.a(g0Var.f9803a, g0Var.f9804b);
    }

    public static final void a(a aVar, com.braze.events.internal.h0 h0Var) {
        e0 e0Var;
        h0Var.getClass();
        aVar.f9749g.a(h0Var.f9808a);
        if (aVar.f9760s.compareAndSet(true, false)) {
            aVar.f9749g.a((com.braze.triggers.events.i) new com.braze.triggers.events.e());
        }
        if (!aVar.f9761t.compareAndSet(true, false) || (e0Var = aVar.f9762u) == null) {
            return;
        }
        aVar.f9749g.a((com.braze.triggers.events.i) new com.braze.triggers.events.g(e0Var.f9798a, e0Var.f9799b));
        aVar.f9762u = null;
    }

    public static final void a(a aVar, com.braze.events.internal.d dVar) {
        dVar.getClass();
        if (!dVar.f9785a.f10265j || dVar.f9786b.f10265j) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new uu.a(23), 7, (Object) null);
        aVar.f9754m.a();
    }

    public static final void a(a aVar, y yVar) {
        yVar.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(9), 7, (Object) null);
        aVar.f9764w.set(false);
        aVar.f9765x.set(false);
        aVar.f9766y.set(false);
        aVar.f9767z.set(false);
        aVar.B.set(false);
        aVar.f9744b.f();
        com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f10176g.a(yVar.f9826a.f10211a);
        if (kVarA != null) {
            ((com.braze.models.outgoing.event.b) kVarA).a(yVar.f9826a.f10211a);
        }
        if (kVarA != null) {
            aVar.f9746d.a(kVarA);
        }
        aVar.f9746d.a(true);
        aVar.f9747e.j();
        aVar.f9748f.e();
        aVar.a0();
        if (aVar.l.isAutomaticGeofenceRequestsEnabled()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(16), 7, (Object) null);
            BrazeInternal.requestGeofenceRefresh(aVar.f9743a, false);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(17), 7, (Object) null);
        }
        aVar.f9757p.f10043e.clearData(DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP);
        aVar.f9759r.h();
        aVar.c0();
    }

    public static final void a(a aVar, a0 a0Var) {
        a0Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(0), 7, (Object) null);
        aVar.f9763v.set(true);
        if (aVar.f9756o.E()) {
            aVar.L();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(1), 7, (Object) null);
        }
        if (aVar.f9756o.H()) {
            aVar.R();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(2), 7, (Object) null);
        }
        if (aVar.f9756o.L()) {
            aVar.U();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(3), 7, (Object) null);
        }
        if (aVar.f9756o.F()) {
            aVar.O();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(4), 7, (Object) null);
        }
        if (aVar.f9756o.d()) {
            aVar.I();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(5), 7, (Object) null);
        }
        if (aVar.f9756o.M()) {
            aVar.X();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) aVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vv.b(6), 7, (Object) null);
        }
    }

    public static final void a(a aVar, n nVar) {
        nVar.getClass();
        aVar.f9746d.a(true);
        aVar.c0();
    }

    public static final void a(a aVar, z zVar) {
        zVar.getClass();
        aVar.getClass();
        com.braze.models.p pVar = zVar.f9827a;
        com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f10176g.a(pVar.d());
        if (kVarA != null) {
            ((com.braze.models.outgoing.event.b) kVarA).a(pVar.f10211a);
            aVar.f9746d.a(kVarA);
        }
        Braze.INSTANCE.getInstance(aVar.f9743a).requestImmediateDataFlush();
        aVar.a0();
    }

    public static final void a(a aVar, e0 e0Var) {
        e0Var.getClass();
        aVar.f9761t.set(true);
        aVar.f9762u = e0Var;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new uu.a(22), 6, (Object) null);
        r rVar = aVar.f9746d;
        com.braze.models.outgoing.j jVar = new com.braze.models.outgoing.j();
        jVar.f10204b = Boolean.TRUE;
        rVar.a(jVar);
    }

    public static final String a(com.braze.triggers.actions.a aVar) {
        return e0.f.k("Could not publish in-app message with trigger action id: ", ((com.braze.triggers.actions.g) aVar).c());
    }

    public static final void a(a aVar, com.braze.exceptions.b bVar) {
        bVar.getClass();
        try {
            r rVar = aVar.f9746d;
            bVar.getClass();
            rVar.a((Throwable) bVar, false);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new uu.a(28), 4, (Object) null);
        }
    }

    public static final void a(a aVar, com.braze.events.internal.e eVar) {
        eVar.getClass();
        try {
            r rVar = aVar.f9746d;
            com.braze.storage.p pVar = aVar.f9754m;
            long j9 = pVar.f10649d;
            long j11 = pVar.f10650e;
            eVar.getClass();
            rVar.a(j9, j11, 0, com.braze.requests.c.DUST_INITIATED);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) aVar, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new uu.a(21), 4, (Object) null);
        }
    }

    public static final String a() {
        return "Content cards have moved to disabled. Clearing content card data.";
    }

    public final void a(d dVar) {
        dVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new rv.a(dVar, 18), 7, (Object) null);
        dVar.c(com.braze.events.internal.f.class, r());
        dVar.c(g.class, s());
        dVar.c(y.class, A());
        dVar.c(a0.class, C());
        dVar.c(z.class, B());
        dVar.c(e0.class, E());
        dVar.c(w.class, z());
        dVar.c(Throwable.class, t());
        dVar.c(com.braze.exceptions.b.class, D());
        dVar.c(com.braze.events.internal.h0.class, H());
        dVar.c(n.class, y());
        dVar.c(com.braze.events.internal.l.class, w());
        dVar.c(com.braze.events.internal.i.class, v());
        dVar.c(com.braze.events.internal.a.class, o());
        dVar.c(f0.class, F());
        dVar.c(m.class, x());
        dVar.c(g0.class, G());
        dVar.c(com.braze.events.internal.e.class, q());
        dVar.c(com.braze.events.internal.d.class, p());
    }

    public static final String a(e eVar) {
        return "Subscribing to events with " + eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.braze.events.a r8, java.util.concurrent.Semaphore r9, java.lang.Throwable r10) {
        /*
            if (r10 == 0) goto L2a
            com.braze.managers.r r0 = r8.f9746d     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> Lc
            r1 = 1
            r0.a(r10, r1)     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> Lc
            goto L2a
        L9:
            r0 = move-exception
            r8 = r0
            goto L24
        Lc:
            r0 = move-exception
            r10 = r0
            r3 = r10
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> L9
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.E     // Catch: java.lang.Throwable -> L9
            uu.a r5 = new uu.a     // Catch: java.lang.Throwable -> L9
            r10 = 27
            r5.<init>(r10)     // Catch: java.lang.Throwable -> L9
            r6 = 4
            r7 = 0
            r4 = 0
            r1 = r8
            com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9
            if (r9 == 0) goto L2f
            goto L2c
        L24:
            if (r9 == 0) goto L29
            r9.release()
        L29:
            throw r8
        L2a:
            if (r9 == 0) goto L2f
        L2c:
            r9.release()
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.events.a.a(com.braze.events.a, java.util.concurrent.Semaphore, java.lang.Throwable):void");
    }
}
