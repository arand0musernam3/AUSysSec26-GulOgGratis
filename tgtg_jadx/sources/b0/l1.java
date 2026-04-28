package b0;

import android.util.Log;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f5283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f5284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k3 f5285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g2 f5286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z.a f5287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o2 f5288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile int f5289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile y0.f f5290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v80.q f5291i;

    public l1(n nVar, w1 w1Var, k3 k3Var, g2 g2Var, z.a aVar) {
        nVar.getClass();
        w1Var.getClass();
        k3Var.getClass();
        g2Var.getClass();
        this.f5283a = nVar;
        this.f5284b = w1Var;
        this.f5285c = k3Var;
        this.f5286d = g2Var;
        this.f5287e = aVar;
        this.f5289g = 2;
        v80.f0.a(Unit.f26487a);
    }

    @Override // b0.h2
    public final void a(o2 o2Var) {
        this.f5288f = o2Var;
        d(this.f5289g, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r17, z70.c r19) {
        /*
            r16 = this;
            r3 = r16
            r0 = r19
            boolean r1 = r0 instanceof b0.g1
            if (r1 == 0) goto L18
            r1 = r0
            b0.g1 r1 = (b0.g1) r1
            int r2 = r1.f5193n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L18
            int r2 = r2 - r4
            r1.f5193n = r2
        L16:
            r6 = r1
            goto L1e
        L18:
            b0.g1 r1 = new b0.g1
            r1.<init>(r3, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r6.l
            y70.a r7 = y70.a.COROUTINE_SUSPENDED
            int r1 = r6.f5193n
            r8 = 1
            if (r1 == 0) goto L3a
            if (r1 != r8) goto L33
            long r1 = r6.f5190j
            v80.q r4 = r6.f5191k
            ba0.g.M(r0)
            r11 = r4
        L31:
            r12 = r1
            goto L64
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r0)
            r0 = 0
            return r0
        L3a:
            ba0.g.M(r0)
            v80.q r9 = new v80.q
            r9.<init>()
            w.z r4 = new w.z
            r0 = 12
            r4.<init>(r9, r0)
            c90.f r0 = v80.p0.f42144a
            w80.c r10 = a90.p.f1044a
            b0.h1 r0 = new b0.h1
            r5 = 0
            r1 = r17
            r0.<init>(r1, r3, r4, r5)
            r6.f5191k = r9
            r6.f5190j = r1
            r6.f5193n = r8
            java.lang.Object r0 = v80.f0.K(r10, r0, r6)
            if (r0 != r7) goto L62
            return r7
        L62:
            r11 = r9
            goto L31
        L64:
            b0.k3 r0 = r3.f5285c
            a90.d r0 = r0.f5265a
            a3.v1 r10 = new a3.v1
            r15 = 1
            r14 = 0
            r10.<init>(r11, r12, r14, r15)
            r1 = 3
            v80.j0 r0 = v80.f0.f(r0, r14, r14, r10, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.l1.b(long, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(z70.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof b0.i1
            if (r0 == 0) goto L13
            r0 = r7
            b0.i1 r0 = (b0.i1) r0
            int r1 = r0.f5230m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5230m = r1
            goto L18
        L13:
            b0.i1 r0 = new b0.i1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f5229k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f5230m
            r3 = 3
            r4 = 1
            java.lang.String r5 = "CXCP"
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2c
            int r0 = r0.f5228j
            ba0.g.M(r7)
            goto L5a
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L33:
            ba0.g.M(r7)
            boolean r7 = wd.a.B(r3, r5)
            if (r7 == 0) goto L41
            java.lang.String r7 = "FlashControl: Waiting for any ongoing update to be completed"
            android.util.Log.d(r5, r7)
        L41:
            int r7 = r6.f5289g
            v80.q r2 = r6.f5291i
            if (r2 == 0) goto L48
            goto L4e
        L48:
            kotlin.Unit r2 = kotlin.Unit.f26487a
            v80.q r2 = v80.f0.a(r2)
        L4e:
            r0.f5228j = r7
            r0.f5230m = r4
            java.lang.Object r0 = r2.B(r0)
            if (r0 != r1) goto L59
            return r1
        L59:
            r0 = r7
        L5a:
            boolean r7 = wd.a.B(r3, r5)
            if (r7 == 0) goto L71
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "awaitFlashModeUpdate: initialFlashMode = "
            r7.<init>(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r5, r7)
        L71:
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.l1.c(z70.c):java.lang.Object");
    }

    public final v80.q d(int i11, boolean z11) {
        if (wd.a.B(3, "CXCP")) {
            StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "setFlashAsync: flashMode = ", ", requestControl = ");
            sbK.append(this.f5288f);
            Log.d("CXCP", sbK.toString());
        }
        v80.q qVar = new v80.q();
        if (this.f5288f == null) {
            w2.l1.k("Camera is not active.", qVar);
            return qVar;
        }
        this.f5289g = i11;
        v80.q qVar2 = this.f5291i;
        if (z11) {
            if (qVar2 != null) {
                w2.l1.k("There is a new flash mode being set or camera was closed", qVar2);
            }
            this.f5291i = null;
        } else if (qVar2 != null) {
            v0.n.C(qVar, qVar2);
        }
        this.f5291i = qVar;
        w1 w1Var = this.f5284b;
        synchronized (w1Var.f5470d) {
            w1Var.f5474h = i11;
        }
        v0.n.C(w1Var.f(), qVar);
        return qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
    
        if (v80.f0.g(r6, r1) == r2) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(z70.c r10) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.l1.e(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(z70.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof b0.k1
            if (r0 == 0) goto L13
            r0 = r7
            b0.k1 r0 = (b0.k1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            b0.k1 r0 = new b0.k1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f5262j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            ba0.g.M(r7)
            goto L44
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            return r3
        L2e:
            ba0.g.M(r7)
            c90.f r7 = v80.p0.f42144a
            w80.c r7 = a90.p.f1044a
            a3.y r2 = new a3.y
            r5 = 3
            r2.<init>(r6, r3, r5)
            r0.l = r4
            java.lang.Object r7 = v80.f0.K(r7, r2, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            b0.n r7 = r6.f5283a
            e0.v r7 = r7.f5321b
            boolean r7 = z20.b.r(r7)
            r0 = 0
            if (r7 == 0) goto L5e
            b0.w1 r7 = r6.f5284b
            java.lang.Object r1 = r7.f5470d
            monitor-enter(r1)
            r7.f5476j = r0     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r1)
            r7.f()
            goto L5e
        L5b:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        L5e:
            z.a r7 = r6.f5287e
            boolean r7 = r7.g()
            if (r7 == 0) goto L6c
            b0.g2 r7 = r6.f5286d
            r1 = 2
            b0.g2.d(r7, r0, r1)
        L6c:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.l1.f(z70.c):java.lang.Object");
    }

    @Override // b0.h2
    public final void reset() {
        this.f5289g = 2;
        this.f5290h = null;
        v80.q qVar = this.f5291i;
        if (qVar != null) {
            w2.l1.k("There is a new flash mode being set or camera was closed", qVar);
        }
        this.f5291i = null;
        d(2, true);
    }
}
