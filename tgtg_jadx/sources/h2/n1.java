package h2;

import android.os.Trace;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements x0, o1, y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a8.h f21185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f21186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z5.a f21187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z4.w1 f21188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f21192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m1 f21194k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f21195m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f21196n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f21197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ c40.q f21198p;

    public n1(c40.q qVar, int i11, a8.h hVar, Function1 function1) {
        this.f21198p = qVar;
        this.f21184a = i11;
        this.f21185b = hVar;
        this.f21186c = function1;
        p80.u.f34584a.getClass();
        p80.s.f34581a.getClass();
        this.f21197o = p80.s.b();
    }

    @Override // h2.x0
    public final void a() {
        this.l = true;
    }

    public final void b() {
        z4.w1 w1Var = this.f21188e;
        if (w1Var != null) {
            w1Var.a();
        }
        this.f21188e = null;
        this.f21194k = null;
    }

    public final boolean c(a aVar) {
        boolean zD;
        if (!this.f21198p.f7092b) {
            return false;
        }
        if (this.l) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(aVar);
            } finally {
                Trace.endSection();
            }
        } else {
            zD = d(aVar);
        }
        b6.a.A(-1L, "compose:lazy:prefetch:execute:item");
        return zD;
    }

    @Override // h2.x0
    public final void cancel() {
        if (this.f21190g) {
            return;
        }
        this.f21190g = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0345 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(h2.a r19) {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.n1.d(h2.a):boolean");
    }

    public final boolean e() {
        return this.f21191h;
    }

    public final boolean f(long j9, long j11) {
        if (this.l) {
            j11 = 0;
        }
        return j9 > j11;
    }

    public final void g() {
        long jD;
        p80.u.f34584a.getClass();
        p80.s sVar = p80.s.f34581a;
        sVar.getClass();
        long jB = p80.s.b();
        long j9 = this.f21197o;
        sVar.getClass();
        p80.h hVar = p80.h.NANOSECONDS;
        hVar.getClass();
        long j11 = (j9 - 1) | 1;
        long j12 = LongCompanionObject.MAX_VALUE;
        if (j11 != LongCompanionObject.MAX_VALUE) {
            jD = (1 | (jB - 1)) == LongCompanionObject.MAX_VALUE ? p80.o.d(jB) : p80.o.h(jB, j9, hVar);
        } else if (jB == j9) {
            p80.d.f34559b.getClass();
            jD = 0;
        } else {
            jD = p80.d.l(p80.o.d(j9));
        }
        long j13 = jD >> 1;
        p80.c cVar = p80.d.f34559b;
        if ((1 & ((int) jD)) == 0) {
            j12 = j13;
        } else if (j13 <= 9223372036854L) {
            j12 = j13 < -9223372036854L ? Long.MIN_VALUE : j13 * ((long) 1000000);
        }
        this.f21196n = j12;
        long j14 = this.f21195m - j12;
        this.f21195m = j14;
        this.f21197o = jB;
        b6.a.A(j14, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HandleAndRequestImpl { index = ");
        sb2.append(this.f21184a);
        sb2.append(", constraints = ");
        sb2.append(this.f21187d);
        sb2.append(", isComposed = ");
        sb2.append(e());
        sb2.append(", isMeasured = ");
        sb2.append(this.f21189f);
        sb2.append(", isCanceled = ");
        return j4.s.o(sb2, this.f21190g, " }");
    }
}
