package com.braze.requests.framework;

import cg.k;
import com.braze.enums.DataStoreKey;
import com.braze.models.response.j;
import com.braze.models.response.m;
import com.braze.requests.n;
import com.braze.requests.o;
import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.s;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f10385j = BrazeLogger.getBrazeLogTag((Class<?>) b.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f10386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.dispatch.h f10387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f10390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.braze.requests.util.b f10393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.braze.requests.util.g f10394i;

    public b(n nVar, com.braze.dispatch.h hVar) {
        nVar.getClass();
        hVar.getClass();
        this.f10386a = nVar;
        this.f10387b = hVar;
        this.f10390e = new ArrayList();
        int iOrdinal = nVar.ordinal();
        this.f10392g = iOrdinal != 0 ? iOrdinal != 2 ? 0L : 75L : 25L;
        this.f10393h = new com.braze.requests.util.b(hVar.f9696a.f10026o.j(), com.braze.requests.util.b.f10472g, hVar.f9696a.f10026o.k(), hVar.f9696a.f10026o.l());
    }

    public abstract void a(long j9);

    public final void a(long j9, h hVar) {
        hVar.getClass();
        com.braze.requests.util.g gVarB = b();
        if (gVarB == null) {
            return;
        }
        long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        double dA = gVarB.a(jNowInMillisecondsSystemClock);
        gVarB.f10488e = dA;
        com.braze.requests.util.e eVar = gVarB.f10486c;
        DataStoreKey dataStoreKey = DataStoreKey.TOKEN_BUCKET_CURRENT_TOKEN_COUNT;
        eVar.writeData(dataStoreKey, Float.valueOf((float) dA));
        gVarB.f10487d = jNowInMillisecondsSystemClock;
        gVarB.f10486c.writeData(DataStoreKey.TOKEN_BUCKET_LAST_CALL_AT_MS, Long.valueOf(jNowInMillisecondsSystemClock));
        double d3 = gVarB.f10488e;
        if (d3 >= 1.0d) {
            double d11 = d3 - ((double) 1);
            gVarB.f10488e = d11;
            gVarB.f10486c.writeData(dataStoreKey, Float.valueOf((float) d11));
        }
        com.braze.requests.util.g gVarB2 = b();
        if (gVarB2 != null && gVarB2.a(j9) < 1.0d) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new iw.c(hVar, j9, gVarB.a(), gVarB, 0), 3, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new iw.d(this, j9, 0), 7, (Object) null);
    }

    public final void b(long j9) {
        a(j9);
        ArrayList arrayList = this.f10390e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((h) obj).f10419d == i.BATCHED) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            if (!it.hasNext()) {
                i1.c();
                return;
            }
            int i11 = ((h) it.next()).f10423h;
            while (it.hasNext()) {
                int i12 = ((h) it.next()).f10423h;
                if (i11 < i12) {
                    i11 = i12;
                }
            }
            ArrayList arrayList3 = this.f10390e;
            ArrayList<h> arrayList4 = new ArrayList();
            for (Object obj2 : arrayList3) {
                if (((h) obj2).f10419d.a()) {
                    arrayList4.add(obj2);
                }
            }
            for (h hVar : arrayList4) {
                hVar.f10423h = i11;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new iw.a(hVar, j9, i11), 3, (Object) null);
            }
        }
        ArrayList<h> arrayList5 = new ArrayList();
        ArrayList arrayList6 = this.f10390e;
        ArrayList arrayList7 = new ArrayList();
        for (Object obj3 : arrayList6) {
            i iVar = ((h) obj3).f10419d;
            if (iVar == i.BATCHED || iVar == i.COMPLETE) {
                arrayList7.add(obj3);
            }
        }
        arrayList5.addAll(arrayList7);
        ArrayList arrayList8 = this.f10390e;
        ArrayList arrayList9 = new ArrayList();
        for (Object obj4 : arrayList8) {
            h hVar2 = (h) obj4;
            if (hVar2.f10423h >= 15 && hVar2.f10419d.a()) {
                arrayList9.add(obj4);
            }
        }
        arrayList5.addAll(arrayList9);
        for (h hVar3 : arrayList5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10385j, (BrazeLogger.Priority) null, (Throwable) null, c(), (Function0) new iw.b(hVar3, j9, 0), 6, (Object) null);
            hVar3.f10416a.a((com.braze.events.e) this.f10387b.f9696a.f10025n);
        }
        this.f10390e.removeAll(arrayList5);
    }

    public final void c(long j9) {
        ArrayList arrayList = this.f10390e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((h) obj).f10419d.a()) {
                arrayList2.add(obj);
            }
        }
        List listL0 = CollectionsKt.l0(arrayList2, new a());
        if (listL0.size() >= 2) {
            int size = listL0.size();
            for (int i11 = 1; i11 < size; i11++) {
                h hVar = (h) listL0.get(i11);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10385j, (BrazeLogger.Priority) null, (Throwable) null, c(), (Function0) new hi.d(hVar, 18), 6, (Object) null);
                hVar.a(j9, i.BATCHED);
            }
        }
    }

    public final String d(long j9) {
        String string;
        String strU = CollectionsKt.U(this.f10390e, "\n\n", null, null, new k(j9, 2), 30);
        n nVar = this.f10386a;
        long j11 = this.f10388c - j9;
        long j12 = this.f10389d - j9;
        long j13 = this.f10391f - j9;
        long j14 = this.f10392g;
        com.braze.requests.util.g gVar = this.f10394i;
        if (gVar == null || (string = gVar.toString()) == null) {
            string = "unset";
        }
        StringBuilder sb2 = new StringBuilder("\n            |EndpointQueue: ");
        sb2.append(nVar);
        sb2.append("\n            |   lastFailureAt = ");
        sb2.append(j11);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, "\n            |   lastSuccessAt = ", j12, "\n            |   failureBackoffUntil = ");
        sb2.append(j13);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, "\n            |   pendingWaitDuration = ", j14, "\n            |   endpointRateLimiter = ");
        sb2.append(string);
        sb2.append("\n            |   requestInfoQueue: \n            |");
        sb2.append(strU);
        sb2.append("\n        ");
        return s.d(sb2.toString());
    }

    public boolean c() {
        return false;
    }

    public static final String c(b bVar, long j9) {
        return e0.f.k("New state after request error ", bVar.d(j9));
    }

    public static final String d(b bVar, long j9) {
        return e0.f.k("New state after request success\n", bVar.d(j9));
    }

    public final void a(long j9, o oVar) {
        oVar.getClass();
        oVar.a(this.f10387b.f9696a.f10025n);
        this.f10390e.add(new h(oVar, j9 + this.f10392g, j9));
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new iw.d(this, j9, 2), 3, (Object) null);
    }

    public com.braze.requests.util.b a() {
        return this.f10393h;
    }

    public static final String a(b bVar, long j9) {
        return e0.f.k("Added request now to queue ", bVar.d(j9));
    }

    public static final String a(h hVar, long j9, int i11) {
        return "Set retry count for " + hVar.a(j9) + " to " + i11;
    }

    public static final String a(h hVar, long j9) {
        return e0.f.k("Marking request as framework complete \n", hVar.a(j9));
    }

    public static final String a(h hVar, long j9, long j11, com.braze.requests.util.g gVar) {
        String strA = hVar.a(j9);
        String dateFromMillis$default = DateTimeUtils.formatDateFromMillis$default(j9 + j11, null, null, 3, null);
        StringBuilder sbN = b3.i.n(j11, "Delaying next request after '", strA, "' until next token is available in ");
        sbN.append("ms - '");
        sbN.append(dateFromMillis$default);
        sbN.append("'\n");
        sbN.append(gVar);
        return sbN.toString();
    }

    public static final String a(h hVar) {
        return "About to batch request " + hVar;
    }

    public void a(long j9, h hVar, com.braze.models.response.a aVar) {
        hVar.getClass();
        aVar.getClass();
        com.braze.models.response.g gVar = aVar instanceof com.braze.models.response.g ? (com.braze.models.response.g) aVar : null;
        com.braze.models.response.d dVar = gVar != null ? gVar.f10232d : null;
        Long l = aVar.f10220b;
        long jLongValue = l != null ? l.longValue() : 0L;
        this.f10388c = j9;
        if (!(dVar instanceof com.braze.models.response.h)) {
            com.braze.requests.util.b bVarA = a();
            this.f10391f = jLongValue + j9 + ((long) bVarA.a(bVarA.f10474b));
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10385j, (BrazeLogger.Priority) null, (Throwable) null, c(), (Function0) new iw.d(this, j9, 3), 6, (Object) null);
    }

    public void a(long j9, h hVar, com.braze.models.response.g gVar) {
        hVar.getClass();
        gVar.getClass();
        a().f10478f = 0;
        this.f10389d = j9;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f10385j, (BrazeLogger.Priority) null, (Throwable) null, c(), (Function0) new iw.d(this, j9, 1), 6, (Object) null);
    }

    public final com.braze.requests.util.g b() {
        Map mapW;
        i3 i3Var = this.f10387b.f9696a.f10026o;
        ReentrantLock reentrantLock = i3Var.f10589c;
        reentrantLock.lock();
        try {
            m mVar = i3Var.f10591e;
            if (mVar == null || (mapW = mVar.F) == null) {
                mapW = i3Var.w();
            }
            reentrantLock.unlock();
            j jVar = (j) mapW.get(this.f10386a);
            if (jVar == null) {
                this.f10394i = null;
                return null;
            }
            com.braze.requests.util.g gVar = this.f10394i;
            int i11 = jVar.f10253b;
            int i12 = jVar.f10252a;
            if (gVar == null) {
                gVar = new com.braze.requests.util.g(i12, i11, com.braze.requests.util.f.a(this.f10387b, "com.braze.endpointqueue.tokenbucket", String.valueOf(this.f10386a.f10461a.hashCode())));
            } else {
                gVar.a(i12, i11);
            }
            this.f10394i = gVar;
            return gVar;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String b(b bVar, long j9) {
        return bVar.d(j9);
    }

    public static final CharSequence b(long j9, h hVar) {
        hVar.getClass();
        return hVar.a(j9);
    }
}
