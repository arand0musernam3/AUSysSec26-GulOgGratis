package com.braze.requests.framework;

import com.braze.p0;
import com.braze.requests.o;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.text.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f10416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f10419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f10421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10423h;

    public h(o oVar, long j9, long j11) {
        i iVar = i.PENDING_START;
        oVar.getClass();
        iVar.getClass();
        this.f10416a = oVar;
        this.f10417b = j9;
        this.f10418c = j11;
        this.f10419d = iVar;
        this.f10420e = 0;
        this.f10421f = null;
        this.f10422g = j11;
    }

    public final String a(long j9) {
        int iHashCode = this.f10416a.hashCode();
        com.braze.requests.util.d dVarE = ((com.braze.requests.b) this.f10416a).e();
        long j11 = this.f10417b - j9;
        long j12 = this.f10418c - j9;
        i iVar = this.f10419d;
        long j13 = this.f10422g - j9;
        int i11 = this.f10423h;
        StringBuilder sb2 = new StringBuilder("\n            |RequestInfo for ");
        sb2.append(iHashCode);
        sb2.append(" \n            | at ");
        sb2.append(j9);
        sb2.append("\n            | request.target = ");
        sb2.append(dVarE);
        sb2.append("\n            | nextAdvance = ");
        sb2.append(j11);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, "\n            | createdAt = ", j12, "\n            | state = ");
        sb2.append(iVar);
        sb2.append("\n            | lastStateMovedAt = ");
        sb2.append(j13);
        sb2.append("\n            | timesMovedToRetry = ");
        sb2.append(i11);
        sb2.append("\n        ");
        return s.d(sb2.toString());
    }

    public static final String a(h hVar, i iVar, long j9) {
        return "Moving from " + hVar.f10419d + " -> " + iVar + " with time " + j9 + " for \n" + hVar.a(j9);
    }

    public static final String a(h hVar, long j9) {
        return "Moving to pending retry.Updated retry count: " + hVar.f10423h + " for: \n" + hVar.a(j9);
    }

    public final void a(long j9, i iVar) {
        iVar.getClass();
        if (this.f10419d != iVar) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.V;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, true, (Function0) new p0(this, iVar, j9, 3), 2, (Object) null);
            this.f10422g = j9;
            this.f10419d = iVar;
            if (iVar == i.PENDING_RETRY) {
                this.f10423h++;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, true, (Function0) new iw.b(this, j9, 3), 2, (Object) null);
            }
        }
    }
}
