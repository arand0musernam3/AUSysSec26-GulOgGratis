package com.braze.requests.framework;

import com.braze.p0;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import j4.s;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f10398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f10399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f10400c;

    public e(g gVar, h hVar, b bVar) {
        this.f10398a = gVar;
        this.f10399b = hVar;
        this.f10400c = bVar;
    }

    @Override // com.braze.requests.framework.c
    public final void a(com.braze.models.response.a aVar) {
        g gVar;
        aVar.getClass();
        g gVar2 = this.f10398a;
        ReentrantLock reentrantLock = gVar2.f10410g;
        h hVar = this.f10399b;
        b bVar = this.f10400c;
        reentrantLock.lock();
        try {
            long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
            com.braze.models.response.g gVar3 = aVar instanceof com.braze.models.response.g ? (com.braze.models.response.g) aVar : null;
            com.braze.models.response.d dVar = gVar3 != null ? gVar3.f10232d : null;
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, g.f10401n, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new p0(hVar, jNowInMillisecondsSystemClock, dVar, 1), 14, (Object) null);
            hVar.a(jNowInMillisecondsSystemClock, i.PENDING_RETRY);
            bVar.a(jNowInMillisecondsSystemClock, hVar, aVar);
            if (dVar instanceof com.braze.models.response.h) {
                gVar2.f10412i = jNowInMillisecondsSystemClock;
                gVar2.f10411h = ((com.braze.requests.b) ((com.braze.models.response.h) dVar).f10245a).f10364j;
                gVar = gVar2;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new p0(gVar2, hVar, jNowInMillisecondsSystemClock, 2), 7, (Object) null);
                gVar.f10413j = jNowInMillisecondsSystemClock + g.f10402o;
            } else {
                gVar = gVar2;
            }
            if (dVar instanceof com.braze.models.response.e) {
                gVar.f10414k.incrementAndGet();
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hi.d(gVar, 19), 7, (Object) null);
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String a(h hVar, long j9) {
        return e0.f.k("Request success received for ", hVar.a(j9));
    }

    @Override // com.braze.requests.framework.c
    public final void a(com.braze.models.response.g gVar) {
        gVar.getClass();
        ReentrantLock reentrantLock = this.f10398a.f10410g;
        h hVar = this.f10399b;
        b bVar = this.f10400c;
        reentrantLock.lock();
        try {
            long jNowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, g.f10401n, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new iw.b(hVar, jNowInMillisecondsSystemClock, 1), 6, (Object) null);
            hVar.a(jNowInMillisecondsSystemClock, i.COMPLETE);
            bVar.a(jNowInMillisecondsSystemClock, hVar, gVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(h hVar, long j9, com.braze.models.response.d dVar) {
        return "Request failure received " + hVar.a(j9) + " \n" + dVar;
    }

    public static final String a(g gVar, h hVar, long j9) {
        return s.k("Got failed token ", gVar.d(), " for\n ", hVar.a(j9));
    }

    public static final String a(g gVar) {
        return s.f(gVar.c().get(), "Incremented invalidApiKeyErrorCounter to ");
    }
}
