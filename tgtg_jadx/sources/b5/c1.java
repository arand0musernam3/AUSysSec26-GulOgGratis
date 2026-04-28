package b5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f5762a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5765d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z5.a f5770i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a8.h f5763b = new a8.h(5);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w2.z f5766e = new w2.z(14);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o3.e f5767f = new o3.e(new d2[16], 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f5768g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o3.e f5769h = new o3.e(new a1[16], 0);

    public c1(m0 m0Var) {
        this.f5762a = m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(b5.m0 r5, z5.a r6) {
        /*
            b5.m0 r0 = r5.f5873i
            b5.q0 r1 = r5.H
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            b5.z0 r0 = r1.f5943q
            r0.getClass()
            long r3 = r6.f47271a
            boolean r6 = r0.I0(r3)
            goto L2f
        L18:
            r6 = r2
            goto L2f
        L1a:
            b5.z0 r6 = r1.f5943q
            if (r6 == 0) goto L21
            z5.a r1 = r6.f6026n
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L18
            if (r0 == 0) goto L18
            r6.getClass()
            long r0 = r1.f47271a
            boolean r6 = r6.I0(r0)
        L2f:
            b5.m0 r0 = r5.w()
            if (r6 == 0) goto L57
            if (r0 == 0) goto L57
            b5.m0 r1 = r0.f5873i
            r3 = 3
            if (r1 != 0) goto L40
            b5.m0.Y(r0, r2, r3)
            return r6
        L40:
            b5.j0 r1 = r5.t()
            b5.j0 r4 = b5.j0.InMeasureBlock
            if (r1 != r4) goto L4c
            b5.m0.W(r0, r2, r3)
            return r6
        L4c:
            b5.j0 r5 = r5.t()
            b5.j0 r1 = b5.j0.InLayoutBlock
            if (r5 != r1) goto L57
            r0.V(r2)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.c1.b(b5.m0, z5.a):boolean");
    }

    public static boolean c(m0 m0Var, z5.a aVar) {
        boolean zQ = aVar != null ? m0Var.Q(aVar) : m0.R(m0Var);
        m0 m0VarW = m0Var.w();
        if (zQ && m0VarW != null) {
            if (m0Var.s() == j0.InMeasureBlock) {
                m0.Y(m0VarW, false, 3);
                return zQ;
            }
            if (m0Var.s() == j0.InLayoutBlock) {
                m0VarW.X(false);
            }
        }
        return zQ;
    }

    public static boolean h(m0 m0Var) {
        z0 z0Var;
        n0 n0Var;
        if (m0Var.H.f5932e) {
            return (m0Var.t() == j0.NotUsed && ((z0Var = m0Var.H.f5943q) == null || (n0Var = z0Var.f6031s) == null || !n0Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean i(m0 m0Var) {
        if (!m0Var.r()) {
            return false;
        }
        do {
            if (m0Var.s() == j0.NotUsed && !m0Var.H.f5942p.f5817y.e()) {
                m0 m0VarW = m0Var.w();
                if ((m0VarW != null ? m0VarW.H.f5931d : null) != h0.Measuring) {
                    return false;
                }
            }
            m0Var = m0Var.w();
            if (m0Var == null) {
                return false;
            }
        } while (!m0Var.J());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r8) {
        /*
            r7 = this;
            r0 = 1
            w2.z r1 = r7.f5766e
            if (r8 == 0) goto L17
            java.lang.Object r8 = r1.f43083b
            o3.e r8 = (o3.e) r8
            b5.m0 r2 = r7.f5762a
            int r3 = r2.Q
            if (r3 <= 0) goto L17
            r8.g()
            r8.b(r2)
            r2.P = r0
        L17:
            java.lang.Object r8 = r1.f43083b
            o3.e r8 = (o3.e) r8
            int r2 = r8.f31832c
            if (r2 == 0) goto L62
            b5.a2 r3 = b5.a2.f5758b
            java.lang.Object[] r4 = r8.f31830a
            r5 = 0
            java.util.Arrays.sort(r4, r5, r2, r3)
            int r2 = r8.f31832c
            java.lang.Object r3 = r1.f43084c
            b5.m0[] r3 = (b5.m0[]) r3
            if (r3 == 0) goto L32
            int r4 = r3.length
            if (r4 >= r2) goto L3a
        L32:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r2)
            b5.m0[] r3 = new b5.m0[r3]
        L3a:
            r4 = 0
            r1.f43084c = r4
        L3d:
            if (r5 >= r2) goto L48
            java.lang.Object[] r6 = r8.f31830a
            r6 = r6[r5]
            r3[r5] = r6
            int r5 = r5 + 1
            goto L3d
        L48:
            r8.g()
            int r2 = r2 - r0
        L4c:
            r8 = -1
            if (r8 >= r2) goto L60
            r8 = r3[r2]
            r8.getClass()
            boolean r0 = r8.P
            if (r0 == 0) goto L5b
            w2.z.l(r8)
        L5b:
            r3[r2] = r4
            int r2 = r2 + (-1)
            goto L4c
        L60:
            r1.f43084c = r3
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.c1.a(boolean):void");
    }

    public final void d() {
        o3.e eVar = this.f5769h;
        int i11 = eVar.f31832c;
        if (i11 != 0) {
            Object[] objArr = eVar.f31830a;
            for (int i12 = 0; i12 < i11; i12++) {
                a1 a1Var = (a1) objArr[i12];
                if (a1Var.f5755a.I()) {
                    boolean z11 = a1Var.f5756b;
                    m0 m0Var = a1Var.f5755a;
                    boolean z12 = a1Var.f5757c;
                    if (z11) {
                        m0.W(m0Var, z12, 2);
                    } else {
                        m0.Y(m0Var, z12, 2);
                    }
                }
            }
            eVar.g();
        }
    }

    public final void e(m0 m0Var) {
        o3.e eVarA = m0Var.A();
        Object[] objArr = eVarA.f31830a;
        int i11 = eVarA.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            m0 m0Var2 = (m0) objArr[i12];
            if (Intrinsics.areEqual(m0Var2.K(), Boolean.TRUE) && !m0Var2.T) {
                if (this.f5763b.f(m0Var2)) {
                    m0Var2.L();
                }
                e(m0Var2);
            }
        }
    }

    public final void f(m0 m0Var, boolean z11) {
        if (!this.f5764c) {
            y4.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z11 ? m0Var.H.f5932e : m0Var.r()) {
            y4.a.a("node not yet measured");
        }
        g(m0Var, z11);
    }

    public final void g(m0 m0Var, boolean z11) {
        z0 z0Var;
        n0 n0Var;
        o3.e eVarA = m0Var.A();
        Object[] objArr = eVarA.f31830a;
        int i11 = eVarA.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            m0 m0Var2 = (m0) objArr[i12];
            if ((!z11 && (m0Var2.s() == j0.InMeasureBlock || m0Var2.H.f5942p.f5817y.e())) || (z11 && (m0Var2.t() == j0.InMeasureBlock || ((z0Var = m0Var2.H.f5943q) != null && (n0Var = z0Var.f6031s) != null && n0Var.e())))) {
                boolean zL = o.l(m0Var2);
                q0 q0Var = m0Var2.H;
                if (zL && !z11) {
                    if (q0Var.f5932e && this.f5763b.f(m0Var2)) {
                        m(m0Var2, true, false);
                    } else {
                        f(m0Var2, true);
                    }
                }
                if (z11 ? q0Var.f5932e : m0Var2.r()) {
                    m(m0Var2, z11, false);
                }
                if (!(z11 ? q0Var.f5932e : m0Var2.r())) {
                    g(m0Var2, z11);
                }
            }
        }
        if (z11 ? m0Var.H.f5932e : m0Var.r()) {
            m(m0Var, z11, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean j(c5.t tVar) {
        boolean z11;
        b4.s parent$ui;
        int i11;
        ?? B;
        boolean z12;
        m0 m0Var;
        boolean z13;
        a8.h hVar = this.f5763b;
        m0 m0Var2 = this.f5762a;
        if (!m0Var2.I()) {
            y4.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!m0Var2.J()) {
            y4.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f5764c) {
            y4.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.f5770i != null) {
            this.f5764c = true;
            this.f5765d = true;
            try {
                boolean zS = hVar.s();
                a50.c cVar = (a50.c) hVar.f973b;
                if (zS) {
                    z11 = false;
                    while (true) {
                        a50.c cVar2 = (a50.c) hVar.f975d;
                        a50.c cVar3 = (a50.c) hVar.f974c;
                        if (!((m2) cVar.f822b).isEmpty()) {
                            m0Var = (m0) ((m2) cVar.f822b).first();
                            cVar.D(m0Var);
                            z13 = m0Var.f5873i != null;
                            z12 = false;
                        } else if (!((m2) cVar3.f822b).isEmpty()) {
                            m0Var = (m0) ((m2) cVar3.f822b).first();
                            cVar3.D(m0Var);
                            z13 = m0Var.f5873i != null;
                            z12 = true;
                        } else {
                            if (((m2) cVar2.f822b).isEmpty()) {
                                break;
                            }
                            m0 m0Var3 = (m0) ((m2) cVar2.f822b).first();
                            cVar2.D(m0Var3);
                            z12 = true;
                            m0Var = m0Var3;
                            z13 = false;
                        }
                        boolean zM = m(m0Var, z13, z12);
                        if (!z12) {
                            if (m0Var.H.f5933f) {
                                hVar.a(m0Var, z.LookaheadPlacement);
                            }
                            if (m0Var.q()) {
                                hVar.a(m0Var, z.Placement);
                            }
                        }
                        if (m0Var == m0Var2 && zM) {
                            z11 = true;
                        }
                    }
                    if (tVar != null) {
                        tVar.invoke();
                    }
                } else {
                    z11 = false;
                }
            } finally {
            }
        } else {
            z11 = false;
        }
        o3.e eVar = this.f5767f;
        Object[] objArr = eVar.f31830a;
        int i12 = eVar.f31832c;
        for (int i13 = 0; i13 < i12; i13++) {
            l1 l1Var = ((m0) ((d2) objArr[i13])).G;
            x xVar = l1Var.f5857c;
            int i14 = 4194304;
            boolean zH = t1.h(4194304);
            if (zH) {
                parent$ui = xVar.Y;
            } else {
                parent$ui = xVar.Y.getParent$ui();
                if (parent$ui == null) {
                }
            }
            d dVar = s1.O;
            b4.s sVarF1 = xVar.f1(zH);
            while (sVarF1 != null && (sVarF1.getAggregateChildKindSet$ui() & i14) != 0) {
                if ((sVarF1.getKindSet$ui() & i14) != 0) {
                    ?? r13 = sVarF1;
                    ?? eVar2 = 0;
                    while (r13 != 0) {
                        if (r13 instanceof b0) {
                            ((b0) r13).u(l1Var.f5857c);
                        } else {
                            if ((r13.getKindSet$ui() & i14) != 0 && (r13 instanceof n)) {
                                b4.s child$ui = ((n) r13).f5892p;
                                i11 = i14;
                                int i15 = 0;
                                B = r13;
                                eVar2 = eVar2;
                                while (child$ui != null) {
                                    if ((child$ui.getKindSet$ui() & i11) != 0) {
                                        i15++;
                                        eVar2 = eVar2;
                                        if (i15 == 1) {
                                            B = child$ui;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new o3.e(new b4.s[16], 0);
                                            }
                                            if (B != 0) {
                                                eVar2.b(B);
                                                B = 0;
                                            }
                                            eVar2.b(child$ui);
                                        }
                                    }
                                    child$ui = child$ui.getChild$ui();
                                    B = B;
                                    eVar2 = eVar2;
                                }
                                if (i15 == 1) {
                                }
                                i14 = i11;
                                r13 = B;
                                eVar2 = eVar2;
                            }
                            B = m.b(eVar2);
                            i14 = i11;
                            r13 = B;
                            eVar2 = eVar2;
                        }
                        i11 = i14;
                        B = m.b(eVar2);
                        i14 = i11;
                        r13 = B;
                        eVar2 = eVar2;
                    }
                }
                int i16 = i14;
                if (sVarF1 != parent$ui) {
                    sVarF1 = sVarF1.getChild$ui();
                    i14 = i16;
                }
            }
        }
        eVar.g();
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final void k(m0 m0Var, long j9) {
        b4.s parent$ui;
        ?? B;
        if (m0Var.T) {
            return;
        }
        m0 m0Var2 = this.f5762a;
        if (Intrinsics.areEqual(m0Var, m0Var2)) {
            y4.a.a("measureAndLayout called on root");
        }
        if (!m0Var2.I()) {
            y4.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!m0Var2.J()) {
            y4.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f5764c) {
            y4.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.f5770i != null) {
            this.f5764c = true;
            this.f5765d = false;
            try {
                a8.h hVar = this.f5763b;
                ((a50.c) hVar.f973b).D(m0Var);
                ((a50.c) hVar.f974c).D(m0Var);
                ((a50.c) hVar.f975d).D(m0Var);
                if ((b(m0Var, new z5.a(j9)) || m0Var.H.f5933f) && Intrinsics.areEqual(m0Var.K(), Boolean.TRUE)) {
                    m0Var.L();
                }
                e(m0Var);
                c(m0Var, new z5.a(j9));
                if (m0Var.q() && m0Var.J()) {
                    m0Var.U();
                    w2.z zVar = this.f5766e;
                    zVar.getClass();
                    if (m0Var.Q > 0) {
                        ((o3.e) zVar.f43083b).b(m0Var);
                        m0Var.P = true;
                    }
                }
                d();
            } finally {
            }
        }
        o3.e eVar = this.f5767f;
        Object[] objArr = eVar.f31830a;
        int i11 = eVar.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            l1 l1Var = ((m0) ((d2) objArr[i12])).G;
            x xVar = l1Var.f5857c;
            int i13 = 4194304;
            boolean zH = t1.h(4194304);
            if (zH) {
                parent$ui = xVar.Y;
            } else {
                parent$ui = xVar.Y.getParent$ui();
                if (parent$ui == null) {
                }
            }
            d dVar = s1.O;
            b4.s sVarF1 = xVar.f1(zH);
            while (sVarF1 != null && (sVarF1.getAggregateChildKindSet$ui() & i13) != 0) {
                if ((sVarF1.getKindSet$ui() & i13) != 0) {
                    ?? r12 = sVarF1;
                    ?? eVar2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof b0) {
                            ((b0) r12).u(l1Var.f5857c);
                        } else {
                            if ((r12.getKindSet$ui() & i13) != 0 && (r12 instanceof n)) {
                                b4.s child$ui = ((n) r12).f5892p;
                                int i14 = 0;
                                B = r12;
                                eVar2 = eVar2;
                                while (child$ui != null) {
                                    if ((child$ui.getKindSet$ui() & i13) != 0) {
                                        i14++;
                                        eVar2 = eVar2;
                                        if (i14 == 1) {
                                            B = child$ui;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new o3.e(new b4.s[16], 0);
                                            }
                                            if (B != 0) {
                                                eVar2.b(B);
                                                B = 0;
                                            }
                                            eVar2.b(child$ui);
                                        }
                                    }
                                    child$ui = child$ui.getChild$ui();
                                    i13 = 4194304;
                                    B = B;
                                    eVar2 = eVar2;
                                }
                                if (i14 == 1) {
                                }
                            }
                            i13 = 4194304;
                            r12 = B;
                            eVar2 = eVar2;
                        }
                        B = m.b(eVar2);
                        i13 = 4194304;
                        r12 = B;
                        eVar2 = eVar2;
                    }
                }
                if (sVarF1 != parent$ui) {
                    sVarF1 = sVarF1.getChild$ui();
                    i13 = 4194304;
                }
            }
        }
        eVar.g();
    }

    public final void l() {
        a8.h hVar = this.f5763b;
        if (hVar.s()) {
            m0 m0Var = this.f5762a;
            if (!m0Var.I()) {
                y4.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!m0Var.J()) {
                y4.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f5764c) {
                y4.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f5770i != null) {
                this.f5764c = true;
                this.f5765d = false;
                try {
                    if (!((m2) ((a50.c) hVar.f975d).f822b).isEmpty() && !((m2) ((a50.c) hVar.f973b).f822b).isEmpty()) {
                        if (m0Var.f5873i != null) {
                            o(m0Var, true);
                        } else {
                            n(m0Var);
                        }
                    }
                    o(m0Var, false);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                        this.f5764c = false;
                        this.f5765d = false;
                    }
                }
            }
        }
    }

    public final boolean m(m0 m0Var, boolean z11, boolean z12) {
        z5.a aVar;
        boolean zB;
        z4.l1 placementScope;
        x xVar;
        m0 m0VarW;
        z0 z0Var;
        n0 n0Var;
        boolean z13 = m0Var.T;
        q0 q0Var = m0Var.H;
        if (z13 || (!m0Var.J() && !q0Var.f5942p.f5813u && !i(m0Var) && !Intrinsics.areEqual(m0Var.K(), Boolean.TRUE) && !h(m0Var) && !q0Var.f5942p.f5817y.e() && ((z0Var = q0Var.f5943q) == null || (n0Var = z0Var.f6031s) == null || !n0Var.e()))) {
            return false;
        }
        m0 m0Var2 = this.f5762a;
        if (m0Var == m0Var2) {
            aVar = this.f5770i;
            aVar.getClass();
        } else {
            aVar = null;
        }
        if (z11) {
            zB = q0Var.f5932e ? b(m0Var, aVar) : false;
            if (z12 && ((zB || q0Var.f5933f) && Intrinsics.areEqual(m0Var.K(), Boolean.TRUE))) {
                m0Var.L();
            }
        } else {
            boolean zC = m0Var.r() ? c(m0Var, aVar) : false;
            if (z12 && m0Var.q() && (m0Var == m0Var2 || ((m0VarW = m0Var.w()) != null && m0VarW.J() && q0Var.f5942p.f5813u))) {
                if (m0Var == m0Var2) {
                    if (m0Var.D == j0.NotUsed) {
                        m0Var.f();
                    }
                    m0 m0VarW2 = m0Var.w();
                    if (m0VarW2 == null || (xVar = m0VarW2.G.f5857c) == null || (placementScope = xVar.l) == null) {
                        placementScope = ((c5.y) p0.a(m0Var)).getPlacementScope();
                    }
                    z4.l1.o(placementScope, q0Var.f5942p, 0, 0);
                } else {
                    m0Var.U();
                }
                w2.z zVar = this.f5766e;
                zVar.getClass();
                if (m0Var.Q > 0) {
                    ((o3.e) zVar.f43083b).b(m0Var);
                    m0Var.P = true;
                }
            }
            zB = zC;
        }
        d();
        return zB;
    }

    public final void n(m0 m0Var) {
        o3.e eVarA = m0Var.A();
        Object[] objArr = eVarA.f31830a;
        int i11 = eVarA.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            m0 m0Var2 = (m0) objArr[i12];
            if (m0Var2.s() == j0.InMeasureBlock || m0Var2.H.f5942p.f5817y.e()) {
                if (o.l(m0Var2)) {
                    o(m0Var2, true);
                } else {
                    n(m0Var2);
                }
            }
        }
    }

    public final void o(m0 m0Var, boolean z11) {
        z5.a aVar;
        if (m0Var.T) {
            return;
        }
        if (m0Var == this.f5762a) {
            aVar = this.f5770i;
            aVar.getClass();
        } else {
            aVar = null;
        }
        if (z11) {
            b(m0Var, aVar);
        } else {
            c(m0Var, aVar);
        }
    }

    public final boolean p(m0 m0Var, boolean z11) {
        int i11 = b1.$EnumSwitchMapping$0[m0Var.H.f5931d.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3 || i11 == 4) {
                this.f5769h.b(new a1(m0Var, false, z11));
            } else {
                if (i11 != 5) {
                    e40.a.f();
                    return false;
                }
                if (!m0Var.r() || z11) {
                    m0Var.H.f5942p.f5814v = true;
                    if (!m0Var.T && (m0Var.J() || i(m0Var))) {
                        m0 m0VarW = m0Var.w();
                        if (m0VarW == null || !m0VarW.r()) {
                            this.f5763b.a(m0Var, z.Measurement);
                        }
                        if (!this.f5765d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j9) {
        z5.a aVar = this.f5770i;
        if (aVar == null ? false : z5.a.c(aVar.f47271a, j9)) {
            return;
        }
        if (this.f5764c) {
            y4.a.a("updateRootConstraints called while measuring");
        }
        this.f5770i = new z5.a(j9);
        m0 m0Var = this.f5762a;
        m0 m0Var2 = m0Var.f5873i;
        q0 q0Var = m0Var.H;
        if (m0Var2 != null) {
            q0Var.f5932e = true;
        }
        q0Var.f5942p.f5814v = true;
        this.f5763b.a(m0Var, m0Var2 != null ? z.LookaheadMeasurement : z.Measurement);
    }
}
