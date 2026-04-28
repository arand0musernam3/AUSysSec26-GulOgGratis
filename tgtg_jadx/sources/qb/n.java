package qb;

import ib.f0;
import ib.g0;
import ib.h0;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f36812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ib.h f36813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f36815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f36816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ib.e f36817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f36818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ib.a f36819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f36820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f36821k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f36822m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f36823n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f36824o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f36825p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f36826q;

    public n(String str, g0 g0Var, ib.h hVar, long j9, long j11, long j12, ib.e eVar, int i11, ib.a aVar, long j13, long j14, int i12, int i13, long j15, int i14, List list, List list2) {
        str.getClass();
        g0Var.getClass();
        hVar.getClass();
        aVar.getClass();
        list.getClass();
        list2.getClass();
        this.f36811a = str;
        this.f36812b = g0Var;
        this.f36813c = hVar;
        this.f36814d = j9;
        this.f36815e = j11;
        this.f36816f = j12;
        this.f36817g = eVar;
        this.f36818h = i11;
        this.f36819i = aVar;
        this.f36820j = j13;
        this.f36821k = j14;
        this.l = i12;
        this.f36822m = i13;
        this.f36823n = j15;
        this.f36824o = i14;
        this.f36825p = list;
        this.f36826q = list2;
    }

    public final h0 a() {
        int i11;
        long j9;
        long jK;
        List list = this.f36826q;
        ib.h hVar = !list.isEmpty() ? (ib.h) list.get(0) : ib.h.f23726b;
        UUID uuidFromString = UUID.fromString(this.f36811a);
        uuidFromString.getClass();
        HashSet hashSet = new HashSet(this.f36825p);
        long j11 = this.f36815e;
        f0 f0Var = j11 != 0 ? new f0(j11, this.f36816f) : null;
        g0 g0Var = g0.ENQUEUED;
        int i12 = this.f36818h;
        long j12 = this.f36814d;
        g0 g0Var2 = this.f36812b;
        if (g0Var2 == g0Var) {
            int i13 = o.f36827z;
            j9 = j12;
            jK = w0.e.k(g0Var2 == g0Var && i12 > 0, i12, this.f36819i, this.f36820j, this.f36821k, this.l, j11 != 0, j9, this.f36816f, j11, this.f36823n);
            i11 = i12;
        } else {
            i11 = i12;
            j9 = j12;
            jK = LongCompanionObject.MAX_VALUE;
        }
        return new h0(uuidFromString, this.f36812b, hashSet, this.f36813c, hVar, i11, this.f36822m, this.f36817g, j9, f0Var, jK, this.f36824o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f36811a, nVar.f36811a) && this.f36812b == nVar.f36812b && Intrinsics.areEqual(this.f36813c, nVar.f36813c) && this.f36814d == nVar.f36814d && this.f36815e == nVar.f36815e && this.f36816f == nVar.f36816f && Intrinsics.areEqual(this.f36817g, nVar.f36817g) && this.f36818h == nVar.f36818h && this.f36819i == nVar.f36819i && this.f36820j == nVar.f36820j && this.f36821k == nVar.f36821k && this.l == nVar.l && this.f36822m == nVar.f36822m && this.f36823n == nVar.f36823n && this.f36824o == nVar.f36824o && Intrinsics.areEqual(this.f36825p, nVar.f36825p) && Intrinsics.areEqual(this.f36826q, nVar.f36826q);
    }

    public final int hashCode() {
        return this.f36826q.hashCode() + e0.f.c(this.f36825p, r8.k.b(this.f36824o, e0.f.b(r8.k.b(this.f36822m, r8.k.b(this.l, e0.f.b(e0.f.b((this.f36819i.hashCode() + r8.k.b(this.f36818h, (this.f36817g.hashCode() + e0.f.b(e0.f.b(e0.f.b((this.f36813c.hashCode() + ((this.f36812b.hashCode() + (this.f36811a.hashCode() * 31)) * 31)) * 31, 31, this.f36814d), 31, this.f36815e), 31, this.f36816f)) * 31, 31)) * 31, 31, this.f36820j), 31, this.f36821k), 31), 31), 31, this.f36823n), 31), 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.f36811a + ", state=" + this.f36812b + ", output=" + this.f36813c + ", initialDelay=" + this.f36814d + ", intervalDuration=" + this.f36815e + ", flexDuration=" + this.f36816f + ", constraints=" + this.f36817g + ", runAttemptCount=" + this.f36818h + ", backoffPolicy=" + this.f36819i + ", backoffDelayDuration=" + this.f36820j + ", lastEnqueueTime=" + this.f36821k + ", periodCount=" + this.l + ", generation=" + this.f36822m + ", nextScheduleTimeOverride=" + this.f36823n + ", stopReason=" + this.f36824o + ", tags=" + this.f36825p + ", progress=" + this.f36826q + ')';
    }
}
