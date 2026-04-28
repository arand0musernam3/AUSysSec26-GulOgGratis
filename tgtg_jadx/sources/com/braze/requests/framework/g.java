package com.braze.requests.framework;

import cg.k;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.events.IEventSubscriber;
import com.braze.events.internal.o;
import com.braze.managers.j1;
import com.braze.requests.n;
import com.braze.requests.q;
import com.braze.requests.v;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import v80.d0;
import v80.f0;
import v80.i0;
import v80.j0;
import v80.s1;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f10401n = BrazeLogger.getBrazeLogTag((Class<?>) g.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f10402o = 3600000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f10403p = TimeConstants.ONE_MINUTE_DIFFERENCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.dispatch.h f10404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f10405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f10408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i0 f10409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantLock f10410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f10411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f10412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f10413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f10414k;
    public final com.braze.requests.util.g l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.braze.enums.e f10415m;

    public g(com.braze.dispatch.h hVar, v vVar, boolean z11, boolean z12) {
        hVar.getClass();
        vVar.getClass();
        this.f10404a = hVar;
        this.f10405b = vVar;
        this.f10406c = z11;
        this.f10407d = z12;
        this.f10408e = new LinkedHashMap();
        this.f10410g = new ReentrantLock();
        this.f10412i = -1L;
        this.f10413j = -1L;
        this.f10414k = new AtomicInteger(0);
        this.l = new com.braze.requests.util.g(hVar.f9696a.f10026o.n(), hVar.f9696a.f10026o.o(), com.braze.requests.util.f.a(hVar, "com.braze.requestframework.tokenbucket", ""));
        this.f10415m = com.braze.enums.e.GOOD;
        final int i11 = 0;
        hVar.f9696a.f10025n.c(com.braze.events.internal.dispatchmanager.c.class, new IEventSubscriber(this) { // from class: iw.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.braze.requests.framework.g f24228b;

            {
                this.f24228b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i11) {
                    case 0:
                        com.braze.requests.framework.g.a(this.f24228b, (com.braze.events.internal.dispatchmanager.c) obj);
                        break;
                    default:
                        com.braze.requests.framework.g.a(this.f24228b, (o) obj);
                        break;
                }
            }
        });
        final int i12 = 1;
        hVar.f9696a.f10025n.c(o.class, new IEventSubscriber(this) { // from class: iw.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.braze.requests.framework.g f24228b;

            {
                this.f24228b = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                switch (i12) {
                    case 0:
                        com.braze.requests.framework.g.a(this.f24228b, (com.braze.events.internal.dispatchmanager.c) obj);
                        break;
                    default:
                        com.braze.requests.framework.g.a(this.f24228b, (o) obj);
                        break;
                }
            }
        });
    }

    public static final String e() {
        return "Skipping request sending due to lacking a global request rate limiting token.";
    }

    public static final String f() {
        return "Skipping request sending due to lacking an endpoint request rate limiting token.";
    }

    public static final String h() {
        return "Got call to shutdown request framework";
    }

    public static final String j() {
        return "Kicking off request framework.";
    }

    public final void a(long j9, b bVar, h hVar) throws Throwable {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, bVar.c(), new iw.b(j9, hVar), 3, (Object) null);
        if (!a(j9)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new iu.a(13), 7, (Object) null);
            return;
        }
        com.braze.requests.util.g gVarB = bVar.b();
        if (gVarB != null && gVarB.a(j9) < 1.0d) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new iu.a(9), 7, (Object) null);
            com.braze.requests.util.g gVarB2 = bVar.b();
            hVar.f10417b = (gVarB2 != null ? gVarB2.a() : 0L) + j9;
            return;
        }
        com.braze.requests.o oVarA = this.f10404a.a(hVar.f10416a);
        e eVar = new e(this, hVar, bVar);
        hVar.a(j9, i.IN_FLIGHT);
        com.braze.requests.util.g gVarB3 = bVar.b();
        Integer numValueOf = null;
        Integer numValueOf2 = gVarB3 == null ? null : Integer.valueOf((int) gVarB3.a(j9));
        if (numValueOf2 != null) {
            int iIntValue = numValueOf2.intValue() - 1;
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            numValueOf = Integer.valueOf(iIntValue);
        }
        hVar.f10421f = numValueOf;
        int iA = ((int) this.l.a(j9)) - 1;
        hVar.f10420e = iA >= 0 ? iA : 0;
        if (a(j9, oVarA, hVar, eVar, false)) {
            return;
        }
        a(j9, hVar);
        bVar.a(j9, hVar);
    }

    public final String b(long j9) {
        LinkedHashMap linkedHashMap = this.f10408e;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((b) ((Map.Entry) it.next()).getValue());
        }
        String strU = CollectionsKt.U(arrayList, "\n\n", null, null, new k(j9, 3), 30);
        boolean z11 = this.f10406c;
        String str = this.f10411h;
        long j11 = this.f10412i - j9;
        long j12 = this.f10413j - j9;
        int i11 = this.f10414k.get();
        com.braze.requests.util.g gVar = this.l;
        com.braze.enums.e eVar = this.f10415m;
        String strA = this.f10404a.f9696a.f10033v.a();
        StringBuilder sb2 = new StringBuilder("RequestFramework->\n            |mockAllNetworkRequests=");
        sb2.append(z11);
        sb2.append("\n            |lastSdkAuthFailedToken=");
        sb2.append(str);
        sb2.append("\n            |lastSdkAuthFailureAt=");
        sb2.append(j11);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, "\n            |sdkAuthFailureBackoffUntil=", j12, "\n            |invalidApiKeyErrorCounter=");
        sb2.append(i11);
        sb2.append("\n            |globalRequestRateLimiter=");
        sb2.append(gVar);
        sb2.append("\n            |lastNetworkLevel=");
        sb2.append(eVar);
        sb2.append("\n            |currentSdkAuthToken=");
        sb2.append(strA);
        sb2.append("\n            |endpointQueues=\n            | \n            |");
        sb2.append(strU);
        sb2.append("\n            |  \n            |\n        ");
        return s.d(sb2.toString());
    }

    public final AtomicInteger c() {
        return this.f10414k;
    }

    public final String d() {
        return this.f10411h;
    }

    public final void g() throws Throwable {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10401n, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new iu.a(11), 14, (Object) null);
        CoroutineContext.Element element = this.f10409f;
        if (element != null) {
            ((s1) element).a(null);
        }
        j1 j1Var = this.f10404a.f9696a;
        com.braze.requests.g gVar = new com.braze.requests.g(j1Var.f10026o, j1Var.f10014b.getBaseUrlForRequests(), new com.braze.models.outgoing.k(null, null, null));
        this.f10404a.a((com.braze.requests.o) gVar);
        long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        a(jNowInMillisecondsSystemClock, gVar, new h(gVar, jNowInMillisecondsSystemClock, jNowInMillisecondsSystemClock), new f(), false);
    }

    public final void i() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new iu.a(12), 7, (Object) null);
        a();
    }

    public static final String b(long j9, h hVar) {
        return "Running at " + j9 + " for request " + hVar.a(j9);
    }

    public static final String b(g gVar, long j9) {
        return gVar.b(j9);
    }

    public static final String b() {
        return "Starting request sweeper job.";
    }

    public static final CharSequence b(long j9, b bVar) {
        bVar.getClass();
        return bVar.d(j9);
    }

    public final void a(long j9, b bVar) throws Throwable {
        bVar.getClass();
        if (j9 <= bVar.f10391f) {
            return;
        }
        bVar.b(j9);
        ArrayList arrayList = bVar.f10390e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            h hVar = (h) obj;
            if (hVar.f10419d.a() && j9 >= hVar.f10417b) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a(j9, bVar, (h) it.next());
        }
    }

    public static final void a(g gVar, o oVar) {
        oVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10401n, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new iw.f(oVar, 0), 14, (Object) null);
        gVar.f10415m = oVar.f9818b;
    }

    public static final String a(o oVar) {
        return "Got network change event: " + oVar;
    }

    public static void a(g gVar) {
        long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        ReentrantLock reentrantLock = gVar.f10410g;
        reentrantLock.lock();
        try {
            if ((!gVar.f10407d || gVar.f10415m != com.braze.enums.e.NONE) && ((gVar.f10411h == null || jNowInMillisecondsSystemClock >= gVar.f10413j || !Intrinsics.areEqual(gVar.f10404a.f9696a.f10033v.a(), gVar.f10411h)) && gVar.a(jNowInMillisecondsSystemClock))) {
                Iterator it = gVar.f10408e.entrySet().iterator();
                while (it.hasNext()) {
                    gVar.a(jNowInMillisecondsSystemClock, (b) ((Map.Entry) it.next()).getValue());
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a() {
        i0 i0Var = this.f10409f;
        if (i0Var == null || !i0Var.g()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new iu.a(10), 6, (Object) null);
            j0 j0VarF = f0.f(BrazeCoroutineScope.INSTANCE, null, d0.LAZY, new d(this, null), 1);
            this.f10409f = j0VarF;
            j0VarF.start();
        }
    }

    public static final void a(g gVar, com.braze.events.internal.dispatchmanager.c cVar) {
        cVar.getClass();
        com.braze.events.internal.dispatchmanager.b bVar = cVar.f9794a;
        com.braze.requests.o oVar = cVar.f9797d;
        ReentrantLock reentrantLock = gVar.f10410g;
        reentrantLock.lock();
        try {
            if (bVar == com.braze.events.internal.dispatchmanager.b.ADD_REQUEST && oVar != null) {
                gVar.a(oVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean a(final long j9, com.braze.requests.o oVar, final h hVar, c cVar, boolean z11) {
        q qVar;
        final boolean z12 = oVar.a() || this.f10406c;
        if (z12) {
            qVar = this.f10404a.f9696a.E;
        } else {
            qVar = this.f10405b;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: iw.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.requests.framework.g.a(z12, hVar, j9);
            }
        }, 3, (Object) null);
        qVar.a(hVar, cVar, z11);
        return z12;
    }

    public static final String a(boolean z11, h hVar, long j9) {
        return j4.s.k("Running on ", z11 ? "no-op" : "network", " executor for ", hVar.a(j9));
    }

    public final void a(com.braze.requests.o oVar) {
        b aVar;
        oVar.getClass();
        n nVarC = oVar.c();
        if (!this.f10408e.containsKey(nVarC)) {
            int iOrdinal = nVarC.ordinal();
            if (iOrdinal == 0) {
                aVar = new com.braze.requests.framework.queue.a(this.f10404a);
            } else if (iOrdinal == 1) {
                aVar = new com.braze.requests.framework.queue.f(this.f10404a);
            } else if (iOrdinal == 2) {
                aVar = new com.braze.requests.framework.queue.c(this.f10404a);
            } else if (iOrdinal != 3) {
                switch (iOrdinal) {
                    case 9:
                        aVar = new com.braze.requests.framework.queue.g(this.f10404a);
                        break;
                    case 10:
                        aVar = new com.braze.requests.framework.queue.h(this.f10404a);
                        break;
                    case 11:
                        aVar = new com.braze.requests.framework.queue.e(this.f10404a);
                        break;
                    default:
                        aVar = new com.braze.requests.framework.queue.d(nVarC, this.f10404a);
                        break;
                }
            } else {
                aVar = new com.braze.requests.framework.queue.i(this.f10404a);
            }
            this.f10408e.put(nVarC, aVar);
        } else {
            aVar = (b) this.f10408e.get(nVarC);
        }
        if (aVar == null) {
            return;
        }
        long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        aVar.a(jNowInMillisecondsSystemClock, oVar);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new iw.e(this, jNowInMillisecondsSystemClock, 0), 3, (Object) null);
        a();
    }

    public static final String a(g gVar, long j9) {
        return gVar.b(j9);
    }

    public final void a(long j9, h hVar) {
        hVar.getClass();
        com.braze.requests.util.g gVar = this.l;
        gVar.getClass();
        long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        double dA = gVar.a(jNowInMillisecondsSystemClock);
        gVar.f10488e = dA;
        com.braze.requests.util.e eVar = gVar.f10486c;
        DataStoreKey dataStoreKey = DataStoreKey.TOKEN_BUCKET_CURRENT_TOKEN_COUNT;
        eVar.writeData(dataStoreKey, Float.valueOf((float) dA));
        gVar.f10487d = jNowInMillisecondsSystemClock;
        gVar.f10486c.writeData(DataStoreKey.TOKEN_BUCKET_LAST_CALL_AT_MS, Long.valueOf(jNowInMillisecondsSystemClock));
        double d3 = gVar.f10488e;
        if (d3 >= 1.0d) {
            double d11 = d3 - ((double) 1);
            gVar.f10488e = d11;
            gVar.f10486c.writeData(dataStoreKey, Float.valueOf((float) d11));
        }
        if (!a(j9)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new iw.c(hVar, j9, this.l.a(), this, 1), 7, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new iw.e(this, j9, 1), 3, (Object) null);
    }

    public static final String a(h hVar, long j9, long j11, g gVar) {
        String strA = hVar.a(j9);
        String dateFromMillis$default = DateTimeUtils.formatDateFromMillis$default(j9 + j11, null, null, 3, null);
        com.braze.requests.util.g gVar2 = gVar.l;
        StringBuilder sbN = b3.i.n(j11, "Delaying next request after ", strA, " until next token is available in ");
        sbN.append("ms - '");
        sbN.append(dateFromMillis$default);
        sbN.append("'\n");
        sbN.append(gVar2);
        return sbN.toString();
    }

    public final boolean a(long j9) {
        return !this.f10404a.f9696a.f10026o.K() || this.l.a(j9) >= 1.0d;
    }
}
