package y00;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.j6;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n1 implements x1 {
    public static volatile n1 F;
    public int A;
    public int B;
    public final long D;
    public final long E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ky.p f44984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f44985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e1 f44986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w0 f44987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l1 f44988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u3 f44989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r4 f44990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r0 f44991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final vz.b f44992k;
    public final d3 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t2 f44993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a0 f44994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w2 f44995o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f44996p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public q0 f44997q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m3 f44998r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p f44999s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o0 f45000t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x2 f45001u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f45003w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f45004x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile Boolean f45005y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f45006z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f45002v = false;
    public final AtomicInteger C = new AtomicInteger(0);

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n1(y00.e2 r11) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.n1.<init>(y00.e2):void");
    }

    public static final void j(b0 b0Var) {
        if (b0Var != null) {
            return;
        }
        com.braze.h2.b("Component not created");
    }

    public static final void k(h2.s0 s0Var) {
        if (s0Var != null) {
            return;
        }
        com.braze.h2.b("Component not created");
    }

    public static final void l(i0 i0Var) {
        if (i0Var == null) {
            com.braze.h2.b("Component not created");
        } else {
            if (i0Var.f44850c) {
                return;
            }
            com.braze.h2.b("Component not initialized: ".concat(String.valueOf(i0Var.getClass())));
        }
    }

    public static final void m(w1 w1Var) {
        if (w1Var == null) {
            com.braze.h2.b("Component not created");
        } else {
            if (w1Var.f45268c) {
                return;
            }
            com.braze.h2.b("Component not initialized: ".concat(String.valueOf(w1Var.getClass())));
        }
    }

    public static n1 s(Context context, j6 j6Var, Long l, Long l7) {
        Bundle bundle;
        if (j6Var != null) {
            Bundle bundle2 = j6Var.f11515d;
            j6Var = new j6(j6Var.f11512a, j6Var.f11513b, j6Var.f11514c, bundle2, null);
        }
        com.google.android.gms.common.internal.i0.h(context);
        com.google.android.gms.common.internal.i0.h(context.getApplicationContext());
        if (F == null) {
            synchronized (n1.class) {
                try {
                    if (F == null) {
                        F = new n1(new e2(context, j6Var, l, l7));
                    }
                } finally {
                }
            }
        } else if (j6Var != null && (bundle = j6Var.f11515d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.google.android.gms.common.internal.i0.h(F);
            F.f45005y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.google.android.gms.common.internal.i0.h(F);
        return F;
    }

    @Override // y00.x1
    public final ky.p a() {
        return this.f44984c;
    }

    @Override // y00.x1
    public final w0 b() {
        w0 w0Var = this.f44987f;
        m(w0Var);
        return w0Var;
    }

    @Override // y00.x1
    public final vz.b c() {
        return this.f44992k;
    }

    @Override // y00.x1
    public final l1 d() {
        l1 l1Var = this.f44988g;
        m(l1Var);
        return l1Var;
    }

    public final boolean e() {
        return g() == 0;
    }

    @Override // y00.x1
    public final Context f() {
        return this.f44982a;
    }

    public final int g() {
        l1 l1Var = this.f44988g;
        m(l1Var);
        l1Var.p();
        g gVar = this.f44985d;
        if (gVar.D()) {
            return 1;
        }
        m(l1Var);
        l1Var.p();
        if (!this.f45006z) {
            return 8;
        }
        e1 e1Var = this.f44986e;
        k(e1Var);
        e1Var.p();
        Boolean boolValueOf = e1Var.t().contains("measurement_enabled") ? Boolean.valueOf(e1Var.t().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        ky.p pVar = ((n1) gVar.f21216b).f44984c;
        Boolean boolC = gVar.C("firebase_analytics_collection_enabled");
        return boolC != null ? boolC.booleanValue() ? 0 : 4 : (this.f45005y == null || this.f45005y.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r6 = this;
            boolean r0 = r6.f45002v
            if (r0 == 0) goto L96
            y00.l1 r0 = r6.f44988g
            m(r0)
            r0.p()
            java.lang.Boolean r0 = r6.f45003w
            vz.b r1 = r6.f44992k
            if (r0 == 0) goto L34
            long r2 = r6.f45004x
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8f
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f45004x
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L8f
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f45004x = r0
            y00.r4 r0 = r6.f44990i
            k(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.T(r1)
            r2 = 0
            if (r1 == 0) goto L75
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.T(r1)
            if (r1 == 0) goto L75
            android.content.Context r1 = r6.f44982a
            ky.b r3 = xz.c.a(r1)
            boolean r3 = r3.e()
            r4 = 1
            if (r3 != 0) goto L74
            y00.g r3 = r6.f44985d
            boolean r3 = r3.s()
            if (r3 != 0) goto L74
            boolean r3 = y00.r4.l0(r1)
            if (r3 == 0) goto L75
            boolean r1 = y00.r4.K(r1)
            if (r1 == 0) goto L75
        L74:
            r2 = r4
        L75:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r6.f45003w = r1
            if (r2 == 0) goto L8f
            y00.o0 r1 = r6.r()
            java.lang.String r1 = r1.w()
            boolean r0 = r0.v(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f45003w = r0
        L8f:
            java.lang.Boolean r0 = r6.f45003w
            boolean r0 = r0.booleanValue()
            return r0
        L96:
            java.lang.String r0 = "AppMeasurement is not initialized"
            com.braze.h2.b(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.n1.h():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r20, java.lang.Throwable r21, byte[] r22) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.n1.i(int, java.lang.Throwable, byte[]):void");
    }

    public final r0 n() {
        return this.f44991j;
    }

    public final q0 o() {
        l(this.f44997q);
        return this.f44997q;
    }

    public final m3 p() {
        l(this.f44998r);
        return this.f44998r;
    }

    public final p q() {
        m(this.f44999s);
        return this.f44999s;
    }

    public final o0 r() {
        l(this.f45000t);
        return this.f45000t;
    }
}
