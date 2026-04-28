package b5;

import androidx.compose.ui.node.Owner;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends z4.m1 implements z4.t0, b, i1 {
    public boolean B;
    public float F;
    public boolean G;
    public Function1 H;
    public l4.b I;
    public float K;
    public boolean M;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q0 f5799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5800g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5804k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5805m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function1 f5807o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l4.b f5808p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f5809q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f5811s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5813u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5814v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5815w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5816x;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5801h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5802i = Integer.MAX_VALUE;
    public j0 l = j0.NotUsed;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5806n = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5810r = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n0 f5817y = new n0(this, 0);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final o3.e f5818z = new o3.e(new f1[16], 0);
    public boolean A = true;
    public long C = z5.b.b(0, 0, 15);
    public final e1 D = new e1(this, 1);
    public final e1 E = new e1(this, 0);
    public long J = 0;
    public final e1 L = new e1(this, 2);

    public f1(q0 q0Var) {
        this.f5799f = q0Var;
    }

    public final void C0() {
        q0 q0Var = this.f5799f;
        if (q0Var.l > 0) {
            o3.e eVarA = q0Var.f5928a.A();
            Object[] objArr = eVarA.f31830a;
            int i11 = eVarA.f31832c;
            for (int i12 = 0; i12 < i11; i12++) {
                m0 m0Var = (m0) objArr[i12];
                q0 q0Var2 = m0Var.H;
                boolean z11 = q0Var2.f5937j;
                f1 f1Var = q0Var2.f5942p;
                if ((z11 || q0Var2.f5938k) && !f1Var.f5815w) {
                    m0Var.X(false);
                }
                f1Var.C0();
            }
        }
    }

    @Override // z4.t0
    public final z4.m1 D(long j9) {
        j0 j0Var;
        q0 q0Var = this.f5799f;
        m0 m0Var = q0Var.f5928a;
        m0 m0Var2 = q0Var.f5928a;
        j0 j0Var2 = m0Var.D;
        j0 j0Var3 = j0.NotUsed;
        if (j0Var2 == j0Var3) {
            m0Var.e();
        }
        if (o.l(m0Var2)) {
            z0 z0Var = q0Var.f5943q;
            z0Var.getClass();
            z0Var.f6023j = j0Var3;
            z0Var.D(j9);
        }
        m0 m0VarW = m0Var2.w();
        if (m0VarW != null) {
            q0 q0Var2 = m0VarW.H;
            if (this.l != j0Var3 && !m0Var2.F) {
                y4.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i11 = d1.$EnumSwitchMapping$0[q0Var2.f5931d.ordinal()];
            if (i11 == 1) {
                j0Var = j0.InMeasureBlock;
            } else {
                if (i11 != 2) {
                    m0.i1.q(q0Var2.f5931d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                j0Var = j0.InLayoutBlock;
            }
            this.l = j0Var;
        } else {
            this.l = j0Var3;
        }
        L0(j9);
        return this;
    }

    public final void E0() {
        q0 q0Var = this.f5799f;
        m0.Y(q0Var.f5928a, false, 7);
        m0 m0Var = q0Var.f5928a;
        m0 m0VarW = m0Var.w();
        if (m0VarW == null || m0Var.D != j0.NotUsed) {
            return;
        }
        int i11 = d1.$EnumSwitchMapping$0[m0VarW.H.f5931d.ordinal()];
        m0Var.D = i11 != 1 ? i11 != 2 ? m0VarW.D : j0.InLayoutBlock : j0.InMeasureBlock;
    }

    public final void F0() {
        this.G = true;
        q0 q0Var = this.f5799f;
        m0 m0VarW = q0Var.f5928a.w();
        float f11 = j().B;
        m0 m0Var = q0Var.f5928a;
        l1 l1Var = m0Var.G;
        s1 s1Var = l1Var.f5858d;
        x xVar = l1Var.f5857c;
        while (s1Var != xVar) {
            s1Var.getClass();
            e0 e0Var = (e0) s1Var;
            f11 += e0Var.B;
            s1Var = e0Var.f5967q;
        }
        if (f11 != this.F) {
            this.F = f11;
            if (m0VarW != null) {
                m0VarW.P();
            }
            if (m0VarW != null) {
                m0VarW.D();
            }
        }
        if (!j().f5997k) {
            boolean z11 = this.f5812t;
            if (!z11 || this.f5817y.d()) {
                v0();
            }
            if (z11) {
                m0Var.G.f5857c.o1();
            } else {
                if (m0VarW != null) {
                    m0VarW.D();
                }
                if (this.f5800g && m0VarW != null) {
                    m0VarW.X(false);
                }
            }
        }
        if (m0VarW != null) {
            q0 q0Var2 = m0VarW.H;
            if (!this.f5800g && q0Var2.f5931d == h0.LayingOut) {
                if (this.f5802i != Integer.MAX_VALUE) {
                    y4.a.b("Place was called on a node which was placed already");
                }
                int i11 = q0Var2.f5936i;
                this.f5802i = i11;
                q0Var2.f5936i = i11 + 1;
            }
        } else {
            this.f5802i = 0;
        }
        N();
    }

    @Override // z4.m1, z4.t
    public final Object G() {
        return this.f5811s;
    }

    public final void H0(long j9, float f11, Function1 function1, l4.b bVar) {
        q0 q0Var = this.f5799f;
        m0 m0Var = q0Var.f5928a;
        m0 m0Var2 = q0Var.f5928a;
        if (m0Var.T) {
            y4.a.a("place is called on a deactivated node");
        }
        q0Var.f5931d = h0.LayingOut;
        this.f5806n = j9;
        this.f5809q = f11;
        this.f5807o = function1;
        this.f5808p = bVar;
        this.G = false;
        Owner ownerA = p0.a(m0Var2);
        if (this.f5815w || !this.f5812t) {
            this.f5817y.f5899g = false;
            q0Var.f(false);
            this.H = function1;
            this.J = j9;
            this.K = f11;
            this.I = bVar;
            f2 snapshotObserver = ((c5.y) ownerA).getSnapshotObserver();
            snapshotObserver.f5819a.d(m0Var2, snapshotObserver.f5824f, this.L);
        } else {
            s1 s1VarA = q0Var.a();
            s1VarA.t1(z5.j.d(j9, s1VarA.f47187e), f11, function1, bVar);
            F0();
        }
        q0Var.f5931d = h0.Idle;
        if (q0Var.a().f5997k && (q0Var.f5938k || q0Var.f5937j)) {
            requestLayout();
        }
        this.f5804k = true;
    }

    public final void I0(long j9, float f11, Function1 function1, l4.b bVar) {
        z4.l1 placementScope;
        q0 q0Var = this.f5799f;
        m0 m0Var = q0Var.f5928a;
        m0 m0Var2 = q0Var.f5928a;
        try {
            this.f5813u = true;
            if (!z5.j.b(j9, this.f5806n) || this.M) {
                if (q0Var.f5938k || q0Var.f5937j || this.M) {
                    this.f5815w = true;
                    this.M = false;
                }
                C0();
            }
            z0 z0Var = q0Var.f5943q;
            if (z0Var != null) {
                q0 q0Var2 = z0Var.f6019f;
                if (z0Var.f6030r == w0.IsNotPlaced && !o.l(q0Var2.f5928a)) {
                    q0Var2.f5930c = true;
                }
            }
            z0 z0Var2 = q0Var.f5943q;
            if (z0Var2 != null && z0Var2.u0()) {
                s1 s1Var = q0Var.a().f5968r;
                if (s1Var == null || (placementScope = s1Var.l) == null) {
                    placementScope = ((c5.y) p0.a(m0Var2)).getPlacementScope();
                }
                z0 z0Var3 = q0Var.f5943q;
                z0Var3.getClass();
                m0 m0VarW = m0Var2.w();
                if (m0VarW != null) {
                    m0VarW.H.f5935h = 0;
                }
                z0Var3.f6022i = Integer.MAX_VALUE;
                placementScope.j(z0Var3, (int) (j9 >> 32), (int) (4294967295L & j9), 0.0f);
            }
            z0 z0Var4 = q0Var.f5943q;
            if (z0Var4 != null && !z0Var4.l) {
                y4.a.b("Error: Placement happened before lookahead.");
            }
            H0(j9, f11, function1, bVar);
        } catch (Throwable th2) {
            m0Var.b0(th2);
            throw null;
        }
    }

    @Override // b5.i1
    public final void L(boolean z11) {
        q0 q0Var = this.f5799f;
        if (z11 != q0Var.a().f5995i) {
            q0Var.a().f5995i = z11;
            this.M = true;
        }
    }

    public final boolean L0(long j9) {
        q0 q0Var = this.f5799f;
        m0 m0Var = q0Var.f5928a;
        m0 m0Var2 = q0Var.f5928a;
        try {
            if (m0Var.T) {
                y4.a.a("measure is called on a deactivated node");
            }
            Owner ownerA = p0.a(m0Var2);
            m0 m0VarW = m0Var2.w();
            boolean z11 = true;
            m0Var2.F = m0Var2.F || (m0VarW != null && m0VarW.F);
            if (!m0Var2.r() && z5.a.c(this.f47186d, j9)) {
                ((c5.y) ownerA).l(m0Var2, false);
                m0Var2.a0();
                return false;
            }
            this.f5817y.f5898f = false;
            Q(d.f5780k);
            this.f5803j = true;
            long j11 = q0Var.a().f47185c;
            p0(j9);
            h0 h0Var = q0Var.f5931d;
            h0 h0Var2 = h0.Idle;
            if (h0Var != h0Var2) {
                y4.a.b("layout state is not idle before measure starts");
            }
            this.C = j9;
            h0 h0Var3 = h0.Measuring;
            q0Var.f5931d = h0Var3;
            this.f5814v = false;
            f2 snapshotObserver = ((c5.y) p0.a(m0Var2)).getSnapshotObserver();
            snapshotObserver.f5819a.d(m0Var2, snapshotObserver.f5821c, this.D);
            if (q0Var.f5931d == h0Var3) {
                this.f5815w = true;
                this.f5816x = true;
                q0Var.f5931d = h0Var2;
            }
            if (z5.l.a(q0Var.a().f47185c, j11) && q0Var.a().f47183a == this.f47183a && q0Var.a().f47184b == this.f47184b) {
                z11 = false;
            }
            o0((((long) q0Var.a().f47184b) & 4294967295L) | (((long) q0Var.a().f47183a) << 32));
            return z11;
        } catch (Throwable th2) {
            m0Var.b0(th2);
            throw null;
        }
    }

    @Override // b5.b
    public final void N() {
        this.B = true;
        n0 n0Var = this.f5817y;
        n0Var.h();
        boolean z11 = this.f5815w;
        q0 q0Var = this.f5799f;
        if (z11) {
            o3.e eVarA = q0Var.f5928a.A();
            Object[] objArr = eVarA.f31830a;
            int i11 = eVarA.f31832c;
            for (int i12 = 0; i12 < i11; i12++) {
                m0 m0Var = (m0) objArr[i12];
                if (m0Var.r() && m0Var.s() == j0.InMeasureBlock && m0.R(m0Var)) {
                    m0.Y(q0Var.f5928a, false, 7);
                }
            }
        }
        if (this.f5816x || (!this.f5805m && !j().f5997k && this.f5815w)) {
            this.f5815w = false;
            h0 h0Var = q0Var.f5931d;
            q0Var.f5931d = h0.LayingOut;
            q0Var.g(false);
            m0 m0Var2 = q0Var.f5928a;
            f2 snapshotObserver = ((c5.y) p0.a(m0Var2)).getSnapshotObserver();
            snapshotObserver.f5819a.d(m0Var2, snapshotObserver.f5823e, this.E);
            q0Var.f5931d = h0Var;
            this.f5816x = false;
        }
        if (n0Var.f5896d) {
            n0Var.f5897e = true;
        }
        if (n0Var.f5894b && n0Var.e()) {
            n0Var.g();
        }
        this.B = false;
    }

    @Override // b5.b
    public final void Q(Function1 function1) {
        o3.e eVarA = this.f5799f.f5928a.A();
        Object[] objArr = eVarA.f31830a;
        int i11 = eVarA.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            function1.invoke(((m0) objArr[i12]).H.f5942p);
        }
    }

    @Override // b5.b
    public final void U() {
        m0.Y(this.f5799f.f5928a, false, 7);
    }

    @Override // z4.t
    public final int V(int i11) {
        q0 q0Var = this.f5799f;
        if (!o.l(q0Var.f5928a)) {
            E0();
            return q0Var.a().V(i11);
        }
        z0 z0Var = q0Var.f5943q;
        z0Var.getClass();
        return z0Var.V(i11);
    }

    @Override // z4.t
    public final int b(int i11) {
        q0 q0Var = this.f5799f;
        if (!o.l(q0Var.f5928a)) {
            E0();
            return q0Var.a().b(i11);
        }
        z0 z0Var = q0Var.f5943q;
        z0Var.getClass();
        return z0Var.b(i11);
    }

    @Override // z4.m1
    public final int b0(z4.a aVar) {
        q0 q0Var = this.f5799f;
        m0 m0VarW = q0Var.f5928a.w();
        h0 h0Var = m0VarW != null ? m0VarW.H.f5931d : null;
        h0 h0Var2 = h0.Measuring;
        n0 n0Var = this.f5817y;
        if (h0Var == h0Var2) {
            n0Var.f5895c = true;
        } else {
            m0 m0VarW2 = q0Var.f5928a.w();
            if ((m0VarW2 != null ? m0VarW2.H.f5931d : null) == h0.LayingOut) {
                n0Var.f5896d = true;
            }
        }
        this.f5805m = true;
        int iB0 = q0Var.a().b0(aVar);
        this.f5805m = false;
        return iB0;
    }

    @Override // b5.b
    public final n0 c() {
        return this.f5817y;
    }

    @Override // z4.m1
    public final int d0() {
        return this.f5799f.a().d0();
    }

    @Override // z4.m1
    public final int e0() {
        return this.f5799f.a().e0();
    }

    @Override // z4.m1
    public final void h0(long j9, float f11, Function1 function1) {
        I0(j9, f11, function1, null);
    }

    @Override // b5.b
    public final x j() {
        return this.f5799f.f5928a.G.f5857c;
    }

    @Override // b5.b
    public final b k() {
        q0 q0Var;
        m0 m0VarW = this.f5799f.f5928a.w();
        if (m0VarW == null || (q0Var = m0VarW.H) == null) {
            return null;
        }
        return q0Var.f5942p;
    }

    @Override // z4.m1
    public final void l0(long j9, float f11, l4.b bVar) {
        I0(j9, f11, null, bVar);
    }

    @Override // b5.b
    public final void requestLayout() {
        m0 m0Var = this.f5799f.f5928a;
        g0 g0Var = m0.V;
        m0Var.X(false);
    }

    public final List u0() {
        q0 q0Var = this.f5799f;
        q0Var.f5928a.i0();
        boolean z11 = this.A;
        o3.e eVar = this.f5818z;
        if (!z11) {
            return eVar.f();
        }
        m0 m0Var = q0Var.f5928a;
        o3.e eVarA = m0Var.A();
        Object[] objArr = eVarA.f31830a;
        int i11 = eVarA.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            m0 m0Var2 = (m0) objArr[i12];
            if (eVar.f31832c <= i12) {
                eVar.b(m0Var2.H.f5942p);
            } else {
                f1 f1Var = m0Var2.H.f5942p;
                Object[] objArr2 = eVar.f31830a;
                Object obj = objArr2[i12];
                objArr2[i12] = f1Var;
            }
        }
        eVar.m(((o3.e) ((o3.b) m0Var.n()).f31822b).f31832c, eVar.f31832c);
        this.A = false;
        return eVar.f();
    }

    public final void v0() {
        boolean z11 = this.f5812t;
        this.f5812t = true;
        q0 q0Var = this.f5799f;
        m0 m0Var = q0Var.f5928a;
        l1 l1Var = m0Var.G;
        if (!z11) {
            l1Var.f5857c.o1();
            ((c5.y) p0.a(m0Var)).getRectManager().f(q0Var.f5928a, true);
            if (m0Var.r()) {
                m0.Y(m0Var, true, 6);
            } else if (m0Var.H.f5932e) {
                m0.W(m0Var, true, 6);
            }
        }
        s1 s1Var = l1Var.f5857c.f5967q;
        for (s1 s1Var2 = l1Var.f5858d; !Intrinsics.areEqual(s1Var2, s1Var) && s1Var2 != null; s1Var2 = s1Var2.f5967q) {
            if (s1Var2.L) {
                s1Var2.k1();
            }
        }
        o3.e eVarA = m0Var.A();
        Object[] objArr = eVarA.f31830a;
        int i11 = eVarA.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            m0 m0Var2 = (m0) objArr[i12];
            if (m0Var2.x() != Integer.MAX_VALUE) {
                m0Var2.H.f5942p.v0();
                m0.Z(m0Var2);
            }
        }
    }

    @Override // z4.t
    public final int w(int i11) {
        q0 q0Var = this.f5799f;
        if (!o.l(q0Var.f5928a)) {
            E0();
            return q0Var.a().w(i11);
        }
        z0 z0Var = q0Var.f5943q;
        z0Var.getClass();
        return z0Var.w(i11);
    }

    @Override // b5.b
    public final int x() {
        return this.f5802i;
    }

    @Override // z4.t
    public final int y(int i11) {
        q0 q0Var = this.f5799f;
        if (!o.l(q0Var.f5928a)) {
            E0();
            return q0Var.a().y(i11);
        }
        z0 z0Var = q0Var.f5943q;
        z0Var.getClass();
        return z0Var.y(i11);
    }

    public final void y0() {
        if (this.f5812t) {
            this.f5812t = false;
            q0 q0Var = this.f5799f;
            m0 m0Var = q0Var.f5928a;
            m0 m0Var2 = q0Var.f5928a;
            ((c5.y) p0.a(m0Var)).getRectManager().h(m0Var2);
            l1 l1Var = m0Var2.G;
            s1 s1Var = l1Var.f5857c.f5967q;
            for (s1 s1Var2 = l1Var.f5858d; !Intrinsics.areEqual(s1Var2, s1Var) && s1Var2 != null; s1Var2 = s1Var2.f5967q) {
                s1Var2.q1();
                s1Var2.v1();
            }
            o3.e eVarA = m0Var2.A();
            Object[] objArr = eVarA.f31830a;
            int i11 = eVarA.f31832c;
            for (int i12 = 0; i12 < i11; i12++) {
                ((m0) objArr[i12]).H.f5942p.y0();
            }
        }
    }
}
