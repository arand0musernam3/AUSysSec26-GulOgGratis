package f0;

import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements e0.j {
    public Object A;
    public v80.b2 B;
    public v80.b2 C;
    public v80.b2 D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v80.b0 f16814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.n f16815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0.q1 f16816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0.n f16817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0.v f16818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0.h0 f16819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v0 f16820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k2 f16821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.n1 f16822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q3 f16823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e0.h0 f16824k;
    public final n1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h0.m f16825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e0.r f16826n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g0 f16827o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i0.g0 f16828p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f16829q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f16830r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public na0.a f16831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j0.m f16832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public e0.l f16833u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h0.o f16834v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v80.b2 f16835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v80.q f16836x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f4 f16837y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public s2 f16838z;

    public p0(v80.b0 b0Var, h0.n nVar, e0.q1 q1Var, e0.n nVar2, i0.v vVar, i0.h0 h0Var, v0 v0Var, k2 k2Var, androidx.lifecycle.n1 n1Var, q3 q3Var, e0.h0 h0Var2, n1 n1Var2, h0.m mVar, e0.r rVar, g0 g0Var, i0.g0 g0Var2, v2 v2Var) {
        b0Var.getClass();
        nVar.getClass();
        q1Var.getClass();
        nVar2.getClass();
        v0Var.getClass();
        k2Var.getClass();
        q3Var.getClass();
        h0Var2.getClass();
        n1Var2.getClass();
        mVar.getClass();
        v2Var.getClass();
        this.f16814a = b0Var;
        this.f16815b = nVar;
        this.f16816c = q1Var;
        this.f16817d = nVar2;
        this.f16818e = vVar;
        this.f16819f = h0Var;
        this.f16820g = v0Var;
        this.f16821h = k2Var;
        this.f16822i = n1Var;
        this.f16823j = q3Var;
        this.f16824k = h0Var2;
        this.l = n1Var2;
        this.f16825m = mVar;
        this.f16826n = rVar;
        this.f16827o = g0Var;
        this.f16828p = g0Var2;
        this.f16829q = new Object();
        this.f16830r = true;
        this.f16831s = e0.i.f15353k;
        this.f16832t = new j0.k(nVar2.f15369a);
        this.f16836x = new v80.q();
        x70.c cVar = null;
        this.C = v80.f0.B(b0Var, null, null, new m0(this, cVar, 0), 3);
        this.D = v80.f0.B(b0Var, null, null, new m0(this, cVar, 1), 3);
    }

    public static final void a(p0 p0Var, j0.m mVar) {
        Log.d("CXCP", p0Var + " (" + ((Object) e0.s.b(p0Var.f16817d.f15369a)) + ") camera status changed: " + mVar);
        synchronized (p0Var.f16829q) {
            try {
                if (p0Var.e()) {
                    return;
                }
                if ((mVar instanceof j0.i) || (mVar instanceof j0.k)) {
                    p0Var.f16832t = mVar;
                } else if (mVar instanceof j0.j) {
                    p0Var.f16825m.getClass();
                    p0Var.f16834v = new h0.o(SystemClock.elapsedRealtimeNanos());
                }
                p0Var.g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void b(p0 p0Var) {
        if (p0Var.e()) {
            Log.w("CXCP", "Ignoring stop(): " + p0Var + " is already closed");
            return;
        }
        na0.a aVar = p0Var.f16831s;
        e0.i iVar = e0.i.l;
        if (Intrinsics.areEqual(aVar, iVar) || Intrinsics.areEqual(p0Var.f16831s, e0.i.f15353k)) {
            Log.w("CXCP", "Ignoring stop(): " + p0Var + " already stopping or stopped");
            return;
        }
        f4 f4Var = p0Var.f16837y;
        s2 s2Var = p0Var.f16838z;
        p0Var.f16837y = null;
        p0Var.f16838z = null;
        p0Var.f16831s = iVar;
        Log.d("CXCP", "Stopping " + p0Var);
        p0Var.d(s2Var, f4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(z70.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof f0.n0
            if (r0 == 0) goto L13
            r0 = r6
            f0.n0 r0 = (f0.n0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            f0.n0 r0 = new f0.n0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f16780j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L28
            ba0.g.M(r6)
            goto La1
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L2f:
            ba0.g.M(r6)
            java.lang.String r6 = "CXCP"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r4 = "#awaitClosed"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r6, r2)
            java.lang.Object r6 = r5.f16829q
            monitor-enter(r6)
            na0.a r2 = r5.f16831s     // Catch: java.lang.Throwable -> L6f
            e0.i r4 = e0.i.f15348f     // Catch: java.lang.Throwable -> L6f
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L71
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            r1.append(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "#awaitClosed: Controller is already closed."
            r1.append(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6f
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r6)
            return r0
        L6f:
            r0 = move-exception
            goto La4
        L71:
            na0.a r2 = r5.f16831s     // Catch: java.lang.Throwable -> L6f
            e0.i r4 = e0.i.f15349g     // Catch: java.lang.Throwable -> L6f
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto L95
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            r1.append(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = "#awaitClosed: Controller isn't closing!"
            r1.append(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6f
            android.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r6)
            return r0
        L95:
            monitor-exit(r6)
            v80.q r6 = r5.f16836x
            r0.l = r3
            java.lang.Object r6 = r6.m(r0)
            if (r6 != r1) goto La1
            return r1
        La1:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        La4:
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.p0.c(z70.c):java.lang.Object");
    }

    public final void d(s2 s2Var, f4 f4Var) {
        v80.b2 b2VarB = v80.f0.B(this.f16814a, null, null, new aa.l0(s2Var, f4Var, (x70.c) null, 16), 3);
        if (Intrinsics.areEqual(this.f16831s, e0.i.f15349g)) {
            b2VarB.J(new k0(this, 0));
        }
    }

    public final boolean e() {
        return Intrinsics.areEqual(this.f16831s, e0.i.f15349g) || Intrinsics.areEqual(this.f16831s, e0.i.f15348f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    public final void f() {
        if (e()) {
            Log.i("CXCP", "Ignoring start(): " + this + " is already closed");
            return;
        }
        na0.a aVar = this.f16831s;
        e0.i iVar = e0.i.f15352j;
        if (Intrinsics.areEqual(aVar, iVar)) {
            Log.w("CXCP", "Ignoring start(): " + this + " is already started");
            return;
        }
        x70.c cVar = null;
        this.f16833u = null;
        e0.n nVar = this.f16817d;
        String str = nVar.f15369a;
        List listR0 = CollectionsKt.r0(kotlin.collections.i1.f(kotlin.collections.g1.b(new e0.s(str)), new e0.s(str)));
        k0 k0Var = new k0(this, 1);
        q3 q3Var = this.f16823j;
        q3Var.getClass();
        str.getClass();
        listR0.getClass();
        v80.b0 b0Var = q3Var.f16859d;
        i0.v vVar = this.f16818e;
        f4 f4Var = new f4(str, vVar, b0Var);
        if (((x80.i) q3Var.f16860e.f48337e).h(new u3(f4Var, listR0, vVar, k0Var)) instanceof x80.o) {
            Log.e("CXCP", "Camera open request failed for " + ((Object) e0.s.b(str)) + '!');
            vVar.a(new e0.m0(12, false));
            f4Var = null;
        }
        if (f4Var == null) {
            Log.e("CXCP", "Failed to start " + this + ": Open request submission failed");
            return;
        }
        if (this.f16837y != null) {
            com.braze.h2.b("Check failed.");
            return;
        }
        if (this.f16838z != null) {
            com.braze.h2.b("Check failed.");
            return;
        }
        this.f16837y = f4Var;
        s2 s2Var = new s2(vVar, this.f16821h, this.f16822i, this.f16824k, this.f16825m, nVar.f15382o, null, this.f16828p, this.f16816c, this.f16815b, this.f16814a);
        this.f16838z = s2Var;
        ?? r22 = this.A;
        if (r22 != 0) {
            s2Var.k(r22);
        }
        this.f16831s = iVar;
        Log.d("CXCP", "Started " + this);
        v80.b2 b2Var = this.B;
        if (b2Var != null) {
            b2Var.a(null);
        }
        this.B = v80.f0.B(this.f16814a, null, null, new m0(this, cVar, 2), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
    
        if (r3.f15363a != 8) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.p0.g():void");
    }

    public final String toString() {
        return "Camera2CameraController(" + this.f16826n + ')';
    }
}
