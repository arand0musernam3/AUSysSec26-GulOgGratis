package b5;

import androidx.compose.ui.node.Owner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends z4.m1 implements z4.t0, b, i1 {
    public boolean C;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q0 f6019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6020g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6024k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public z5.a f6026n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Function1 f6028p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l4.b f6029q;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6034v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f6037y;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6021h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6022i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j0 f6023j = j0.NotUsed;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f6027o = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public w0 f6030r = w0.IsNotPlaced;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n0 f6031s = new n0(this, 1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o3.e f6032t = new o3.e(new z0[16], 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6033u = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y0 f6035w = new y0(this, 0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6036x = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f6038z = z5.b.b(0, 0, 15);
    public final y0 A = new y0(this, 2);
    public final y0 B = new y0(this, 1);

    public z0(q0 q0Var) {
        this.f6019f = q0Var;
        this.f6037y = q0Var.f5942p.f5811s;
    }

    public final void C0() {
        q0 q0Var = this.f6019f;
        if (q0Var.f5941o > 0) {
            o3.e eVarA = q0Var.f5928a.A();
            Object[] objArr = eVarA.f31830a;
            int i11 = eVarA.f31832c;
            for (int i12 = 0; i12 < i11; i12++) {
                m0 m0Var = (m0) objArr[i12];
                q0 q0Var2 = m0Var.H;
                if ((q0Var2.f5939m || q0Var2.f5940n) && !q0Var2.f5933f) {
                    m0Var.V(false);
                }
                z0 z0Var = q0Var2.f5943q;
                if (z0Var != null) {
                    z0Var.C0();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // z4.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z4.m1 D(long r6) {
        /*
            r5 = this;
            b5.q0 r0 = r5.f6019f
            b5.m0 r1 = r0.f5928a
            b5.m0 r2 = r0.f5928a
            b5.m0 r1 = r1.w()
            r3 = 0
            if (r1 == 0) goto L12
            b5.q0 r1 = r1.H
            b5.h0 r1 = r1.f5931d
            goto L13
        L12:
            r1 = r3
        L13:
            b5.h0 r4 = b5.h0.LookaheadMeasuring
            if (r1 == r4) goto L25
            b5.m0 r1 = r2.w()
            if (r1 == 0) goto L21
            b5.q0 r1 = r1.H
            b5.h0 r3 = r1.f5931d
        L21:
            b5.h0 r1 = b5.h0.LookaheadLayingOut
            if (r3 != r1) goto L28
        L25:
            r1 = 0
            r0.f5929b = r1
        L28:
            b5.m0 r0 = r2.w()
            if (r0 == 0) goto L68
            b5.q0 r0 = r0.H
            b5.j0 r1 = r5.f6023j
            b5.j0 r3 = b5.j0.NotUsed
            if (r1 == r3) goto L40
            boolean r1 = r2.F
            if (r1 == 0) goto L3b
            goto L40
        L3b:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            y4.a.b(r1)
        L40:
            b5.h0 r1 = r0.f5931d
            int[] r3 = b5.x0.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r3[r1]
            r3 = 1
            if (r1 == r3) goto L63
            r3 = 2
            if (r1 == r3) goto L63
            r3 = 3
            if (r1 == r3) goto L60
            r3 = 4
            if (r1 != r3) goto L57
            goto L60
        L57:
            java.lang.String r6 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            b5.h0 r7 = r0.f5931d
            m0.i1.q(r7, r6)
            r6 = 0
            return r6
        L60:
            b5.j0 r0 = b5.j0.InLayoutBlock
            goto L65
        L63:
            b5.j0 r0 = b5.j0.InMeasureBlock
        L65:
            r5.f6023j = r0
            goto L6c
        L68:
            b5.j0 r0 = b5.j0.NotUsed
            r5.f6023j = r0
        L6c:
            b5.j0 r0 = r2.D
            b5.j0 r1 = b5.j0.NotUsed
            if (r0 != r1) goto L75
            r2.e()
        L75:
            r5.I0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.z0.D(long):z4.m1");
    }

    public final void E0() {
        q0 q0Var = this.f6019f;
        m0.W(q0Var.f5928a, false, 7);
        m0 m0Var = q0Var.f5928a;
        m0 m0VarW = m0Var.w();
        if (m0VarW == null || m0Var.D != j0.NotUsed) {
            return;
        }
        int i11 = x0.$EnumSwitchMapping$0[m0VarW.H.f5931d.ordinal()];
        m0Var.D = i11 != 2 ? i11 != 3 ? m0VarW.D : j0.InLayoutBlock : j0.InMeasureBlock;
    }

    public final void F0() {
        h0 h0Var;
        this.C = true;
        q0 q0Var = this.f6019f;
        m0 m0VarW = q0Var.f5928a.w();
        w0 w0Var = this.f6030r;
        if ((w0Var != w0.IsPlacedInLookahead && !q0Var.f5930c) || (w0Var != w0.IsPlacedInApproach && q0Var.f5930c)) {
            y0();
            if (this.f6020g && m0VarW != null) {
                m0VarW.V(false);
            }
        }
        if (m0VarW != null) {
            q0 q0Var2 = m0VarW.H;
            if (!this.f6020g && ((h0Var = q0Var2.f5931d) == h0.LayingOut || h0Var == h0.LookaheadLayingOut)) {
                if (this.f6022i != Integer.MAX_VALUE) {
                    y4.a.b("Place was called on a node which was placed already");
                }
                int i11 = q0Var2.f5935h;
                this.f6022i = i11;
                q0Var2.f5935h = i11 + 1;
            }
        } else {
            this.f6022i = 0;
        }
        N();
    }

    @Override // z4.m1, z4.t
    public final Object G() {
        return this.f6037y;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006f A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001e, B:14:0x0022, B:15:0x0027, B:17:0x0036, B:19:0x003a, B:22:0x0040, B:21:0x003e, B:23:0x0043, B:25:0x004d, B:30:0x0057, B:32:0x0085, B:31:0x006f), top: B:36:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H0(long r10, kotlin.jvm.functions.Function1 r12, l4.b r13) {
        /*
            r9 = this;
            b5.q0 r0 = r9.f6019f
            b5.m0 r1 = r0.f5928a
            b5.m0 r2 = r0.f5928a
            r3 = 0
            b5.m0 r4 = r1.w()     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L12
            b5.q0 r4 = r4.H     // Catch: java.lang.Throwable -> L1b
            b5.h0 r4 = r4.f5931d     // Catch: java.lang.Throwable -> L1b
            goto L13
        L12:
            r4 = r3
        L13:
            b5.h0 r5 = b5.h0.LookaheadLayingOut     // Catch: java.lang.Throwable -> L1b
            r6 = 0
            if (r4 != r5) goto L1e
            r0.f5930c = r6     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r10 = move-exception
            goto L8e
        L1e:
            boolean r4 = r2.T     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L27
            java.lang.String r4 = "place is called on a deactivated node"
            y4.a.a(r4)     // Catch: java.lang.Throwable -> L1b
        L27:
            r0.f5931d = r5     // Catch: java.lang.Throwable -> L1b
            r4 = 1
            r9.l = r4     // Catch: java.lang.Throwable -> L1b
            r9.C = r6     // Catch: java.lang.Throwable -> L1b
            long r7 = r9.f6027o     // Catch: java.lang.Throwable -> L1b
            boolean r5 = z5.j.b(r10, r7)     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L43
            boolean r5 = r0.f5940n     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L3e
            boolean r5 = r0.f5939m     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L40
        L3e:
            r0.f5933f = r4     // Catch: java.lang.Throwable -> L1b
        L40:
            r9.C0()     // Catch: java.lang.Throwable -> L1b
        L43:
            androidx.compose.ui.node.Owner r5 = b5.p0.a(r2)     // Catch: java.lang.Throwable -> L1b
            r9.f6027o = r10     // Catch: java.lang.Throwable -> L1b
            boolean r7 = r0.f5933f     // Catch: java.lang.Throwable -> L1b
            if (r7 != 0) goto L6f
            b5.w0 r7 = r9.f6030r     // Catch: java.lang.Throwable -> L1b
            b5.w0 r8 = b5.w0.IsNotPlaced     // Catch: java.lang.Throwable -> L1b
            if (r7 == r8) goto L54
            goto L55
        L54:
            r4 = r6
        L55:
            if (r4 == 0) goto L6f
            b5.s1 r2 = r0.a()     // Catch: java.lang.Throwable -> L1b
            b5.v0 r2 = r2.b1()     // Catch: java.lang.Throwable -> L1b
            r2.getClass()     // Catch: java.lang.Throwable -> L1b
            long r4 = r2.f47187e     // Catch: java.lang.Throwable -> L1b
            long r10 = z5.j.d(r10, r4)     // Catch: java.lang.Throwable -> L1b
            r2.U0(r10)     // Catch: java.lang.Throwable -> L1b
            r9.F0()     // Catch: java.lang.Throwable -> L1b
            goto L85
        L6f:
            r0.h(r6)     // Catch: java.lang.Throwable -> L1b
            b5.n0 r10 = r9.f6031s     // Catch: java.lang.Throwable -> L1b
            r10.f5899g = r6     // Catch: java.lang.Throwable -> L1b
            c5.y r5 = (c5.y) r5     // Catch: java.lang.Throwable -> L1b
            b5.f2 r10 = r5.getSnapshotObserver()     // Catch: java.lang.Throwable -> L1b
            b5.y0 r11 = r9.B     // Catch: java.lang.Throwable -> L1b
            b5.d r4 = r10.f5825g     // Catch: java.lang.Throwable -> L1b
            z3.x r10 = r10.f5819a     // Catch: java.lang.Throwable -> L1b
            r10.d(r2, r4, r11)     // Catch: java.lang.Throwable -> L1b
        L85:
            r9.f6028p = r12     // Catch: java.lang.Throwable -> L1b
            r9.f6029q = r13     // Catch: java.lang.Throwable -> L1b
            b5.h0 r10 = b5.h0.Idle     // Catch: java.lang.Throwable -> L1b
            r0.f5931d = r10     // Catch: java.lang.Throwable -> L1b
            return
        L8e:
            r1.b0(r10)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.z0.H0(long, kotlin.jvm.functions.Function1, l4.b):void");
    }

    public final boolean I0(long j9) {
        long j11;
        q0 q0Var = this.f6019f;
        m0 m0Var = q0Var.f5928a;
        m0 m0Var2 = q0Var.f5928a;
        try {
            if (m0Var.T) {
                y4.a.a("measure is called on a deactivated node");
            }
            m0 m0VarW = m0Var2.w();
            m0Var2.F = m0Var2.F || (m0VarW != null && m0VarW.F);
            if (!m0Var2.H.f5932e) {
                z5.a aVar = this.f6026n;
                if (aVar == null ? false : z5.a.c(aVar.f47271a, j9)) {
                    Owner owner = m0Var2.f5878o;
                    if (owner != null) {
                        ((c5.y) owner).l(m0Var2, true);
                    }
                    m0Var2.a0();
                    return false;
                }
            }
            this.f6026n = new z5.a(j9);
            p0(j9);
            this.f6031s.f5898f = false;
            Q(d.f5777h);
            if (this.f6025m) {
                j11 = this.f47185c;
            } else {
                long j12 = Integer.MIN_VALUE;
                j11 = (j12 & 4294967295L) | (j12 << 32);
            }
            this.f6025m = true;
            v0 v0VarB1 = q0Var.a().b1();
            if (!(v0VarB1 != null)) {
                y4.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            q0Var.c(j9);
            o0((((long) v0VarB1.f47184b) & 4294967295L) | (((long) v0VarB1.f47183a) << 32));
            return (((int) (j11 >> 32)) == v0VarB1.f47183a && ((int) (j11 & 4294967295L)) == v0VarB1.f47184b) ? false : true;
        } catch (Throwable th2) {
            m0Var.b0(th2);
            throw null;
        }
    }

    @Override // b5.i1
    public final void L(boolean z11) {
        v0 v0VarB1;
        q0 q0Var = this.f6019f;
        v0 v0VarB12 = q0Var.a().b1();
        if (Intrinsics.areEqual(Boolean.valueOf(z11), v0VarB12 != null ? Boolean.valueOf(v0VarB12.f5995i) : null) || (v0VarB1 = q0Var.a().b1()) == null) {
            return;
        }
        v0VarB1.f5995i = z11;
    }

    @Override // b5.b
    public final void N() {
        this.f6034v = true;
        n0 n0Var = this.f6031s;
        n0Var.h();
        q0 q0Var = this.f6019f;
        boolean z11 = q0Var.f5933f;
        m0 m0Var = q0Var.f5928a;
        if (z11) {
            o3.e eVarA = m0Var.A();
            Object[] objArr = eVarA.f31830a;
            int i11 = eVarA.f31832c;
            for (int i12 = 0; i12 < i11; i12++) {
                m0 m0Var2 = (m0) objArr[i12];
                q0 q0Var2 = m0Var2.H;
                if (q0Var2.f5932e && m0Var2.t() == j0.InMeasureBlock) {
                    z0 z0Var = q0Var2.f5943q;
                    z0Var.getClass();
                    z0 z0Var2 = q0Var2.f5943q;
                    z5.a aVar = z0Var2 != null ? z0Var2.f6026n : null;
                    aVar.getClass();
                    if (z0Var.I0(aVar.f47271a)) {
                        m0.W(m0Var, false, 7);
                    }
                }
            }
        }
        w wVar = j().Z;
        wVar.getClass();
        if (q0Var.f5934g || (!this.f6024k && !wVar.f5997k && q0Var.f5933f)) {
            q0Var.f5933f = false;
            h0 h0Var = q0Var.f5931d;
            q0Var.f5931d = h0.LookaheadLayingOut;
            q0Var.i(false);
            f2 snapshotObserver = ((c5.y) p0.a(m0Var)).getSnapshotObserver();
            snapshotObserver.f5819a.d(m0Var, snapshotObserver.f5826h, this.f6035w);
            q0Var.f5931d = h0Var;
            if (q0Var.f5939m && wVar.f5997k) {
                requestLayout();
            }
            q0Var.f5934g = false;
        }
        if (n0Var.f5896d) {
            n0Var.f5897e = true;
        }
        if (n0Var.f5894b && n0Var.e()) {
            n0Var.g();
        }
        this.f6034v = false;
    }

    @Override // b5.b
    public final void Q(Function1 function1) {
        o3.e eVarA = this.f6019f.f5928a.A();
        Object[] objArr = eVarA.f31830a;
        int i11 = eVarA.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            z0 z0Var = ((m0) objArr[i12]).H.f5943q;
            z0Var.getClass();
            function1.invoke(z0Var);
        }
    }

    @Override // b5.b
    public final void U() {
        m0.W(this.f6019f.f5928a, false, 7);
    }

    @Override // z4.t
    public final int V(int i11) {
        E0();
        v0 v0VarB1 = this.f6019f.a().b1();
        v0VarB1.getClass();
        return v0VarB1.V(i11);
    }

    @Override // z4.t
    public final int b(int i11) {
        E0();
        v0 v0VarB1 = this.f6019f.a().b1();
        v0VarB1.getClass();
        return v0VarB1.b(i11);
    }

    @Override // z4.m1
    public final int b0(z4.a aVar) {
        q0 q0Var = this.f6019f;
        m0 m0VarW = q0Var.f5928a.w();
        h0 h0Var = m0VarW != null ? m0VarW.H.f5931d : null;
        h0 h0Var2 = h0.LookaheadMeasuring;
        n0 n0Var = this.f6031s;
        if (h0Var == h0Var2) {
            n0Var.f5895c = true;
        } else {
            m0 m0VarW2 = q0Var.f5928a.w();
            if ((m0VarW2 != null ? m0VarW2.H.f5931d : null) == h0.LookaheadLayingOut) {
                n0Var.f5896d = true;
            }
        }
        this.f6024k = true;
        v0 v0VarB1 = q0Var.a().b1();
        v0VarB1.getClass();
        int iB0 = v0VarB1.b0(aVar);
        this.f6024k = false;
        return iB0;
    }

    @Override // b5.b
    public final n0 c() {
        return this.f6031s;
    }

    @Override // z4.m1
    public final int d0() {
        v0 v0VarB1 = this.f6019f.a().b1();
        v0VarB1.getClass();
        return v0VarB1.d0();
    }

    @Override // z4.m1
    public final int e0() {
        v0 v0VarB1 = this.f6019f.a().b1();
        v0VarB1.getClass();
        return v0VarB1.e0();
    }

    @Override // z4.m1
    public final void h0(long j9, float f11, Function1 function1) {
        H0(j9, function1, null);
    }

    @Override // b5.b
    public final x j() {
        return this.f6019f.f5928a.G.f5857c;
    }

    @Override // b5.b
    public final b k() {
        q0 q0Var;
        m0 m0VarW = this.f6019f.f5928a.w();
        if (m0VarW == null || (q0Var = m0VarW.H) == null) {
            return null;
        }
        return q0Var.f5943q;
    }

    @Override // z4.m1
    public final void l0(long j9, float f11, l4.b bVar) {
        H0(j9, null, bVar);
    }

    @Override // b5.b
    public final void requestLayout() {
        m0 m0Var = this.f6019f.f5928a;
        g0 g0Var = m0.V;
        m0Var.V(false);
    }

    public final boolean u0() {
        q0 q0Var = this.f6019f;
        return o.l(q0Var.f5928a) || q0Var.f5930c;
    }

    public final void v0(boolean z11) {
        if (z11 && u0()) {
            return;
        }
        if (z11 || u0()) {
            this.f6030r = w0.IsNotPlaced;
            o3.e eVarA = this.f6019f.f5928a.A();
            Object[] objArr = eVarA.f31830a;
            int i11 = eVarA.f31832c;
            for (int i12 = 0; i12 < i11; i12++) {
                z0 z0Var = ((m0) objArr[i12]).H.f5943q;
                z0Var.getClass();
                z0Var.v0(true);
            }
        }
    }

    @Override // z4.t
    public final int w(int i11) {
        E0();
        v0 v0VarB1 = this.f6019f.a().b1();
        v0VarB1.getClass();
        return v0VarB1.w(i11);
    }

    @Override // b5.b
    public final int x() {
        return this.f6022i;
    }

    @Override // z4.t
    public final int y(int i11) {
        E0();
        v0 v0VarB1 = this.f6019f.a().b1();
        v0VarB1.getClass();
        return v0VarB1.y(i11);
    }

    public final void y0() {
        w0 w0Var = this.f6030r;
        q0 q0Var = this.f6019f;
        boolean z11 = q0Var.f5930c;
        m0 m0Var = q0Var.f5928a;
        if (z11) {
            this.f6030r = w0.IsPlacedInApproach;
        } else {
            this.f6030r = w0.IsPlacedInLookahead;
        }
        if (w0Var != w0.IsPlacedInLookahead && q0Var.f5932e) {
            m0.W(m0Var, true, 6);
        }
        o3.e eVarA = m0Var.A();
        Object[] objArr = eVarA.f31830a;
        int i11 = eVarA.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            m0 m0Var2 = (m0) objArr[i12];
            z0 z0Var = m0Var2.H.f5943q;
            if (z0Var == null) {
                i4.a.f("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (z0Var.f6022i != Integer.MAX_VALUE) {
                z0Var.y0();
                m0.Z(m0Var2);
            }
        }
    }
}
