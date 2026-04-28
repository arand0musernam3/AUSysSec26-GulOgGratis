package m3;

import android.os.Trace;
import com.app.tgtg.model.local.AppConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements n {
    public int A;
    public int B;
    public boolean C;
    public final r D;
    public final ArrayList E;
    public boolean F;
    public l2 G;
    public m2 H;
    public q2 I;
    public boolean J;
    public u3.i K;
    public n3.a L;
    public final n3.b M;
    public a N;
    public n3.c O;
    public wy.o P;
    public final a4.h Q;
    public final CoroutineContext R;
    public boolean S;
    public long T;
    public z U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b5.r2 f29417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f29418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2 f29419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q1.w0 f29420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n3.a f29421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n3.a f29422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jb.b f29423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0 f29424h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r1 f29426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29427k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29428m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f29430o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q1.e0 f29431p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f29432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f29433r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q1.g0 f29437v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f29438w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f29440y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f29425i = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b5.y f29429n = new b5.y();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f29434s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b5.y f29435t = new b5.y();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public u3.i f29436u = u3.i.f40658g;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b5.y f29439x = new b5.y();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f29441z = -1;

    public s(b5.r2 r2Var, x xVar, m2 m2Var, q1.w0 w0Var, n3.a aVar, n3.a aVar2, jb.b bVar, a0 a0Var) {
        this.f29417a = r2Var;
        this.f29418b = xVar;
        this.f29419c = m2Var;
        this.f29420d = w0Var;
        this.f29421e = aVar;
        this.f29422f = aVar2;
        this.f29423g = bVar;
        this.f29424h = a0Var;
        this.C = xVar.g() || xVar.e();
        this.D = new r(this, 0);
        this.E = new ArrayList();
        l2 l2VarE = m2Var.e();
        l2VarE.c();
        this.G = l2VarE;
        m2 m2Var2 = new m2();
        if (xVar.g()) {
            m2Var2.d();
        }
        if (xVar.e()) {
            m2Var2.f29347k = new q1.g0();
        }
        this.H = m2Var2;
        q2 q2VarG = m2Var2.g();
        q2VarG.e(true);
        this.I = q2VarG;
        this.M = new n3.b(this, aVar);
        l2 l2VarE2 = this.H.e();
        try {
            a aVarA = l2VarE2.a(0);
            l2VarE2.c();
            this.N = aVarA;
            this.O = new n3.c();
            this.Q = new a4.h(this);
            CoroutineContext coroutineContextK = xVar.k();
            CoroutineContext coroutineContextA = A();
            this.R = coroutineContextK.plus(coroutineContextA == null ? kotlin.coroutines.g.f26549a : coroutineContextA);
        } catch (Throwable th2) {
            l2VarE2.c();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final m3.a1 O(int r13, m3.s r14) {
        /*
            m3.l2 r0 = r14.G
            int r0 = r0.i(r13)
            m3.l2 r1 = r14.G
            int[] r2 = r1.f29320b
            java.lang.Object r1 = r1.p(r13, r2)
            r2 = 126665345(0x78cc281, float:2.1179178E-34)
            r3 = 0
            if (r0 != r2) goto L94
            boolean r0 = r1 instanceof m3.y0
            if (r0 == 0) goto L94
            m3.l2 r0 = r14.G
            boolean r0 = r0.d(r13)
            if (r0 == 0) goto L30
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            P(r14, r0, r13)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L30
            r12 = r0
            goto L31
        L30:
            r12 = r3
        L31:
            m3.l2 r0 = r14.G
            int[] r1 = r0.f29320b
            java.lang.Object r0 = r0.p(r13, r1)
            r0.getClass()
            r5 = r0
            m3.y0 r5 = (m3.y0) r5
            m3.l2 r0 = r14.G
            r1 = 0
            java.lang.Object r6 = r0.h(r13, r1)
            m3.l2 r0 = r14.G
            m3.a r9 = r0.a(r13)
            m3.l2 r0 = r14.G
            int[] r0 = r0.f29320b
            int r1 = r13 * 5
            int r1 = r1 + 3
            r0 = r0[r1]
            int r0 = r0 + r13
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r1 = r14.f29434s
            int r2 = m3.t.c(r13, r1)
            if (r2 >= 0) goto L67
            int r2 = r2 + 1
            int r2 = -r2
        L67:
            int r3 = r1.size()
            if (r2 >= r3) goto L86
            java.lang.Object r3 = r1.get(r2)
            m3.r0 r3 = (m3.r0) r3
            int r4 = r3.f29408b
            if (r4 >= r0) goto L86
            m3.w1 r4 = r3.f29407a
            java.lang.Object r3 = r3.f29409c
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r4, r3)
            r10.add(r7)
            int r2 = r2 + 1
            goto L67
        L86:
            m3.a1 r4 = new m3.a1
            m3.a0 r7 = r14.f29424h
            m3.m2 r8 = r14.f29419c
            u3.i r11 = r14.m(r13)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L94:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.s.O(int, m3.s):m3.a1");
    }

    public static final void P(s sVar, ArrayList arrayList, int i11) {
        int i12 = sVar.G.f29320b[(i11 * 5) + 3] + i11;
        int i13 = i11 + 1;
        while (i13 < i12) {
            if (sVar.G.j(i13)) {
                a1 a1VarO = O(i13, sVar);
                if (a1VarO != null) {
                    arrayList.add(a1VarO);
                }
            } else if (sVar.G.d(i13)) {
                P(sVar, arrayList, i13);
            }
            i13 += sVar.G.f29320b[(i13 * 5) + 3];
        }
    }

    public static final int Q(s sVar, int i11, int i12, boolean z11, int i13) {
        l2 l2Var = sVar.G;
        x xVar = sVar.f29418b;
        n3.b bVar = sVar.M;
        boolean zJ = l2Var.j(i12);
        int[] iArr = l2Var.f29320b;
        if (zJ) {
            int i14 = l2Var.i(i12);
            Object objP = l2Var.p(i12, iArr);
            if (i14 == 126665345 && (objP instanceof y0)) {
                a1 a1VarO = O(i12, sVar);
                if (a1VarO != null) {
                    xVar.c(a1VarO);
                    bVar.e();
                    a0 a0Var = sVar.f29424h;
                    x xVar2 = sVar.f29418b;
                    n3.m0 m0Var = bVar.f30440b.f30437h;
                    m0Var.K(n3.w.f30491c);
                    na0.a.v0(m0Var, a0Var, xVar2, a1VarO);
                }
                if (!z11 || i12 == i11) {
                    return l2Var.o(i12);
                }
                bVar.c();
                bVar.b();
                s sVar2 = bVar.f30439a;
                int iO = sVar2.G.l(i12) ? 1 : sVar2.G.o(i12);
                if (iO > 0) {
                    bVar.f(i13, iO);
                }
                return 0;
            }
            if (i14 == 206 && Intrinsics.areEqual(objP, v.f29461e)) {
                Object objH = l2Var.h(i12, 0);
                f2 f2Var = objH instanceof f2 ? (f2) objH : null;
                e2 e2Var = f2Var != null ? f2Var.f29279a : null;
                p pVar = e2Var instanceof p ? (p) e2Var : null;
                if (pVar != null) {
                    for (s sVar3 : pVar.f29358a.f29378e) {
                        m2 m2Var = sVar3.f29419c;
                        if (m2Var.f29338b > 0 && (m2Var.f29337a[1] & 67108864) != 0) {
                            a0 a0Var2 = sVar3.f29424h;
                            synchronized (a0Var2.f29178d) {
                                a0Var2.s();
                                q1.t0 t0Var = a0Var2.f29187n;
                                a0Var2.f29187n = v0.n.u();
                                try {
                                    a0Var2.f29195v.h0(t0Var);
                                } finally {
                                }
                            }
                            n3.a aVar = new n3.a();
                            sVar3.L = aVar;
                            l2 l2VarE = sVar3.f29419c.e();
                            try {
                                sVar3.G = l2VarE;
                                n3.b bVar2 = sVar3.M;
                                n3.a aVar2 = bVar2.f30440b;
                                try {
                                    bVar2.f30440b = aVar;
                                    sVar3.N(0);
                                    n3.b bVar3 = sVar3.M;
                                    bVar3.b();
                                    if (bVar3.f30441c) {
                                        bVar3.f30440b.f30437h.K(n3.d0.f30455c);
                                        if (bVar3.f30441c) {
                                            bVar3.d(false);
                                            bVar3.d(false);
                                            bVar3.f30440b.f30437h.K(n3.m.f30472c);
                                            bVar3.f30441c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                l2VarE.c();
                            }
                        }
                        xVar.u(sVar3.f29424h);
                    }
                }
                return l2Var.o(i12);
            }
            if (!l2Var.l(i12)) {
                return l2Var.o(i12);
            }
        } else if (l2Var.d(i12)) {
            int i15 = iArr[(i12 * 5) + 3] + i12;
            int iQ = 0;
            for (int i16 = i12 + 1; i16 < i15; i16 += iArr[(i16 * 5) + 3]) {
                boolean zL = l2Var.l(i16);
                if (zL) {
                    bVar.c();
                    Object objN = l2Var.n(i16);
                    bVar.c();
                    bVar.f30446h.add(objN);
                }
                iQ += Q(sVar, i11, i16, zL || z11, zL ? 0 : i13 + iQ);
                if (zL) {
                    bVar.c();
                    bVar.a();
                }
            }
            if (!l2Var.l(i12)) {
                return iQ;
            }
        } else if (!l2Var.l(i12)) {
            return l2Var.o(i12);
        }
        return 1;
    }

    public final a4.h A() {
        if (this.f29418b.l()) {
            return this.Q;
        }
        return null;
    }

    public final boolean B() {
        w1 w1VarY;
        return (this.S || this.f29440y || this.f29438w || (w1VarY = y()) == null || (w1VarY.f29474b & 8) != 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0135 A[Catch: all -> 0x00b4, TryCatch #9 {all -> 0x00b4, blocks: (B:3:0x000c, B:5:0x001c, B:7:0x004f, B:9:0x0057, B:11:0x005d, B:12:0x0062, B:13:0x0065, B:26:0x00a8, B:89:0x020b, B:35:0x00c3, B:36:0x00c6, B:37:0x00c7, B:39:0x00cf, B:42:0x00d6, B:44:0x00de, B:45:0x00e3, B:49:0x00ed, B:51:0x00fa, B:56:0x011a, B:57:0x011c, B:59:0x012c, B:61:0x0135, B:63:0x0140, B:65:0x0151, B:67:0x0157, B:69:0x016a, B:88:0x0208, B:120:0x025c, B:121:0x025f, B:123:0x0261, B:124:0x0264, B:52:0x0108, B:48:0x00e8, B:40:0x00d2, B:125:0x0265, B:58:0x0125), top: B:148:0x000c, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f6 A[Catch: all -> 0x021f, TRY_LEAVE, TryCatch #15 {all -> 0x021f, blocks: (B:84:0x01e9, B:86:0x01f6, B:112:0x024b, B:113:0x024d), top: B:159:0x01e9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(java.util.ArrayList r25) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.s.C(java.util.ArrayList):void");
    }

    public final void D(y0 y0Var, u3.i iVar, Object obj, boolean z11) {
        Y(126665345, y0Var);
        E();
        l0(obj);
        long j9 = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                q2.z(this.I);
            }
            boolean z12 = (this.S || Intrinsics.areEqual(this.G.f(), iVar)) ? false : true;
            if (z12) {
                K(iVar);
            }
            V(AppConstants.PERMISSIONS_REQUEST_CALL_PHONE, v.f29459c, iVar, 0);
            this.K = null;
            if (!this.S || z11) {
                boolean z13 = this.f29438w;
                this.f29438w = z12;
                y0Var.getClass();
                u3.e.d(this, new u3.d(new kq.c(6, y0Var, obj), true, 1436390959));
                this.f29438w = z13;
            } else {
                this.J = true;
                q2 q2Var = this.I;
                this.f29418b.m(new a1(y0Var, obj, this.f29424h, this.H, q2Var.b(q2Var.G(q2Var.f29402v, q2Var.f29383b)), kotlin.collections.n0.f26529a, l(), null));
            }
        } catch (Throwable th2) {
            try {
                a4.e.b(th2, new o(1, this));
                throw th2;
            } finally {
                q(false);
                this.K = null;
                this.T = j9;
                q(false);
            }
        }
    }

    public final Object E() {
        boolean z11 = this.S;
        f fVar = m.f29332a;
        if (!z11) {
            Object objM = this.G.m();
            if (!this.f29440y || (objM instanceof j2)) {
                return objM;
            }
        } else if (this.f29433r) {
            v.a("A call to createNode(), emitNode() or useNode() expected");
            return fVar;
        }
        return fVar;
    }

    public final List F() {
        x xVar = this.f29418b;
        w wVarI = xVar.i();
        a0 a0Var = wVarI != null ? (a0) wVarI : null;
        if (a0Var == null) {
            return kotlin.collections.n0.f26529a;
        }
        m2 m2Var = a0Var.f29180f;
        l2 l2VarE = m2Var.e();
        try {
            Integer numB = a4.c.b(l2VarE, xVar, 0, l2VarE.f29321c);
            if (numB == null) {
                return kotlin.collections.n0.f26529a;
            }
            l2VarE = m2Var.e();
            try {
                ArrayList arrayListC = a4.c.c(l2VarE, numB.intValue(), 0);
                l2VarE.c();
                return CollectionsKt.d0(a0Var.f29195v.F(), arrayListC);
            } finally {
            }
        } finally {
        }
    }

    public final int G(int i11) {
        int iQ = this.G.q(i11) + 1;
        int i12 = 0;
        while (iQ < i11) {
            if (!this.G.k(iQ)) {
                i12++;
            }
            iQ += this.G.f29320b[(iQ * 5) + 3];
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:17:0x0036, B:19:0x003a, B:22:0x0042, B:24:0x004c, B:26:0x0052, B:27:0x0056, B:28:0x0057, B:30:0x005d, B:23:0x0048), top: B:37:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(m3.g0 r9, m3.g0 r10, java.lang.Integer r11, java.util.List r12, kotlin.jvm.functions.Function0 r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.f29427k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.f29427k = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            kotlin.Pair r6 = (kotlin.Pair) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.f26485a     // Catch: java.lang.Throwable -> L24
            m3.w1 r7 = (m3.w1) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.f26486b     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.g0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L66
        L26:
            r8.g0(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L5d
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            m3.a0 r9 = (m3.a0) r9     // Catch: java.lang.Throwable -> L24
            if (r10 == 0) goto L57
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r9)     // Catch: java.lang.Throwable -> L24
            if (r12 != 0) goto L57
            if (r11 < 0) goto L57
            m3.a0 r10 = (m3.a0) r10     // Catch: java.lang.Throwable -> L24
            r9.f29191r = r10     // Catch: java.lang.Throwable -> L24
            r9.f29192s = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L51
            r9.f29191r = r5     // Catch: java.lang.Throwable -> L24
            r9.f29192s = r2     // Catch: java.lang.Throwable -> L24
            goto L5b
        L51:
            r10 = move-exception
            r9.f29191r = r5     // Catch: java.lang.Throwable -> L24
            r9.f29192s = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L57:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L5b:
            if (r10 != 0) goto L61
        L5d:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L61:
            r8.F = r0
            r8.f29427k = r1
            return r10
        L66:
            r8.F = r0
            r8.f29427k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.s.H(m3.g0, m3.g0, java.lang.Integer, java.util.List, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() {
        /*
            Method dump skipped, instruction units count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.s.I():void");
    }

    public final void J() {
        N(this.G.f29325g);
        n3.b bVar = this.M;
        bVar.d(false);
        bVar.e();
        bVar.f30440b.f30437h.K(n3.z.f30494c);
        int i11 = bVar.f30444f;
        l2 l2Var = bVar.f30439a.G;
        bVar.f30444f = l2Var.f29320b[(l2Var.f29325g * 5) + 3] + i11;
    }

    public final void K(u3.i iVar) {
        q1.g0 g0Var = this.f29437v;
        if (g0Var == null) {
            g0Var = new q1.g0();
            this.f29437v = g0Var;
        }
        g0Var.i(this.G.f29325g, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(int r7, int r8, int r9) {
        /*
            r6 = this;
            m3.l2 r0 = r6.G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            n3.b r1 = r6.M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.p(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.s.L(int, int, int):void");
    }

    public final Object M() {
        boolean z11 = this.S;
        f fVar = m.f29332a;
        if (!z11) {
            Object objM = this.G.m();
            if (!this.f29440y || (objM instanceof j2)) {
                return objM instanceof f2 ? ((f2) objM).f29279a : objM;
            }
        } else if (this.f29433r) {
            v.a("A call to createNode(), emitNode() or useNode() expected");
            return fVar;
        }
        return fVar;
    }

    public final void N(int i11) {
        boolean zL = this.G.l(i11);
        n3.b bVar = this.M;
        if (zL) {
            bVar.c();
            Object objN = this.G.n(i11);
            bVar.c();
            bVar.f30446h.add(objN);
        }
        Q(this, i11, i11, zL, 0);
        bVar.c();
        if (zL) {
            bVar.a();
        }
    }

    public final boolean R(int i11, boolean z11) {
        if ((i11 & 1) == 0 && (this.S || this.f29440y)) {
            wy.o oVar = this.P;
            if (oVar != null && y() != null) {
                oVar.getClass();
            }
        } else if (!z11 && B()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S() {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.s.S():void");
    }

    public final void T() {
        l2 l2Var = this.G;
        int i11 = l2Var.f29327i;
        this.l = i11 >= 0 ? l2Var.f29320b[(i11 * 5) + 1] & 67108863 : 0;
        l2Var.t();
    }

    public final void U() {
        if (this.l != 0) {
            v.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        w1 w1VarY = y();
        if (w1VarY != null) {
            int i11 = w1VarY.f29474b;
            if ((i11 & 128) == 0) {
                w1VarY.f29474b = i11 | 16;
            }
        }
        if (this.f29434s.isEmpty()) {
            T();
        } else {
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(int r28, java.lang.Object r29, java.lang.Object r30, int r31) {
        /*
            Method dump skipped, instruction units count: 871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.s.V(int, java.lang.Object, java.lang.Object, int):void");
    }

    public final void W() {
        V(-127, null, null, 0);
    }

    public final void X(int i11, e1 e1Var) {
        V(i11, e1Var, null, 0);
    }

    public final void Y(int i11, Object obj) {
        V(i11, obj, null, 0);
    }

    public final void Z(Object obj, boolean z11) {
        if (z11) {
            l2 l2Var = this.G;
            if (l2Var.f29329k <= 0) {
                if ((l2Var.f29320b[(l2Var.f29325g * 5) + 1] & 1073741824) == 0) {
                    s1.a("Expected a node group");
                }
                l2Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            n3.b bVar = this.M;
            bVar.getClass();
            bVar.d(false);
            n3.m0 m0Var = bVar.f30440b.f30437h;
            m0Var.K(n3.g0.f30461c);
            na0.a.t0(m0Var, 0, obj);
        }
        this.G.u();
    }

    public final void a() {
        i();
        this.f29425i.clear();
        this.f29429n.f6016b = 0;
        this.f29435t.f6016b = 0;
        this.f29439x.f6016b = 0;
        this.f29437v = null;
        n3.c cVar = this.O;
        cVar.f30452i.G();
        cVar.f30451h.G();
        this.T = 0;
        this.A = 0;
        this.f29433r = false;
        this.S = false;
        this.f29440y = false;
        this.F = false;
        this.f29441z = -1;
        l2 l2Var = this.G;
        if (!l2Var.f29324f) {
            l2Var.c();
        }
        if (this.I.f29403w) {
            return;
        }
        w();
    }

    public final void a0(int i11) {
        int i12;
        int i13;
        if (this.f29426j != null) {
            V(i11, null, null, 0);
            return;
        }
        if (this.f29433r) {
            v.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i11), 3) ^ ((long) this.f29428m);
        this.f29428m++;
        l2 l2Var = this.G;
        boolean z11 = this.S;
        f fVar = m.f29332a;
        if (z11) {
            l2Var.f29329k++;
            this.I.S(fVar, fVar, false, i11);
            v(false, null);
            return;
        }
        if (l2Var.g() == i11 && ((i13 = l2Var.f29325g) >= l2Var.f29326h || (l2Var.f29320b[(i13 * 5) + 1] & 536870912) == 0)) {
            l2Var.u();
            v(false, null);
            return;
        }
        if (l2Var.f29329k <= 0 && (i12 = l2Var.f29325g) != l2Var.f29326h) {
            int i14 = this.f29427k;
            J();
            this.M.f(i14, l2Var.s());
            t.a(this.f29434s, i12, l2Var.f29325g);
        }
        l2Var.f29329k++;
        this.S = true;
        this.K = null;
        if (this.I.f29403w) {
            q2 q2VarG = this.H.g();
            this.I = q2VarG;
            q2VarG.O();
            this.J = false;
            this.K = null;
        }
        q2 q2Var = this.I;
        q2Var.d();
        int i15 = q2Var.f29400t;
        q2Var.S(fVar, fVar, false, i11);
        this.N = q2Var.b(i15);
        v(false, null);
    }

    public final void b(Object obj, Function2 function2) {
        if (this.S) {
            n3.m0 m0Var = this.O.f30451h;
            m0Var.K(n3.h0.f30463c);
            na0.a.t0(m0Var, 0, obj);
            function2.getClass();
            na0.a.t0(m0Var, 1, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2));
            return;
        }
        n3.b bVar = this.M;
        bVar.b();
        n3.m0 m0Var2 = bVar.f30440b.f30437h;
        m0Var2.K(n3.h0.f30463c);
        function2.getClass();
        na0.a.u0(m0Var2, 0, obj, 1, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2));
    }

    public final void b0(int i11) {
        V(i11, null, null, 0);
    }

    public final boolean c(float f11) {
        Object objE = E();
        if ((objE instanceof Float) && f11 == ((Number) objE).floatValue()) {
            return false;
        }
        l0(Float.valueOf(f11));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m3.s c0(int r7) {
        /*
            r6 = this;
            r6.a0(r7)
            boolean r7 = r6.S
            jb.b r0 = r6.f29423g
            java.util.ArrayList r1 = r6.E
            m3.a0 r2 = r6.f29424h
            if (r7 == 0) goto L26
            m3.w1 r7 = new m3.w1
            r7.<init>(r2)
            r1.add(r7)
            r6.l0(r7)
            int r1 = r6.B
            r7.f29477e = r1
            int r1 = r7.f29474b
            r1 = r1 & (-17)
            r7.f29474b = r1
            r0.q()
            return r6
        L26:
            m3.l2 r7 = r6.G
            int r7 = r7.f29327i
            java.util.ArrayList r3 = r6.f29434s
            int r7 = m3.t.c(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            m3.r0 r7 = (m3.r0) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            m3.l2 r3 = r6.G
            java.lang.Object r3 = r3.m()
            m3.f r4 = m3.m.f29332a
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r4 == 0) goto L51
            m3.w1 r3 = new m3.w1
            r3.<init>(r2)
            r6.l0(r3)
            goto L56
        L51:
            r3.getClass()
            m3.w1 r3 = (m3.w1) r3
        L56:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L6e
            int r7 = r3.f29474b
            r5 = r7 & 64
            if (r5 == 0) goto L62
            r5 = r4
            goto L63
        L62:
            r5 = r2
        L63:
            if (r5 == 0) goto L69
            r7 = r7 & (-65)
            r3.f29474b = r7
        L69:
            if (r5 == 0) goto L6c
            goto L6e
        L6c:
            r7 = r2
            goto L6f
        L6e:
            r7 = r4
        L6f:
            int r5 = r3.f29474b
            if (r7 == 0) goto L76
            r7 = r5 | 8
            goto L78
        L76:
            r7 = r5 & (-9)
        L78:
            r3.f29474b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.f29477e = r7
            int r7 = r3.f29474b
            r7 = r7 & (-17)
            r3.f29474b = r7
            r0.q()
            int r7 = r3.f29474b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lba
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.f29474b = r7
            n3.b r7 = r6.M
            n3.a r7 = r7.f30440b
            n3.m0 r7 = r7.f30437h
            n3.e0 r0 = n3.e0.f30457c
            r7.K(r0)
            na0.a.t0(r7, r2, r3)
            boolean r7 = r6.f29440y
            if (r7 != 0) goto Lba
            int r7 = r3.f29474b
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lba
            r6.f29440y = r4
            m3.l2 r0 = r6.G
            int r0 = r0.f29327i
            r6.f29441z = r0
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.f29474b = r7
        Lba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.s.c0(int):m3.s");
    }

    public final boolean d(int i11) {
        Object objE = E();
        if ((objE instanceof Integer) && i11 == ((Number) objE).intValue()) {
            return false;
        }
        l0(Integer.valueOf(i11));
        return true;
    }

    public final void d0(Object obj) {
        if (!this.S && this.G.g() == 207 && !Intrinsics.areEqual(this.G.f(), obj) && this.f29441z < 0) {
            this.f29441z = this.G.f29325g;
            this.f29440y = true;
        }
        V(207, null, obj, 0);
    }

    public final boolean e(long j9) {
        Object objE = E();
        if ((objE instanceof Long) && j9 == ((Number) objE).longValue()) {
            return false;
        }
        l0(Long.valueOf(j9));
        return true;
    }

    public final void e0() {
        V(125, null, null, 2);
        this.f29433r = true;
    }

    public final boolean f(Object obj) {
        if (Intrinsics.areEqual(E(), obj)) {
            return false;
        }
        l0(obj);
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f0() {
        this.f29428m = 0;
        this.G = this.f29419c.e();
        V(100, null, null, 0);
        x xVar = this.f29418b;
        xVar.w();
        u3.i iVarJ = xVar.j();
        this.f29439x.c(this.f29438w ? 1 : 0);
        this.f29438w = f(iVarJ);
        this.K = null;
        if (!this.f29432q) {
            this.f29432q = xVar.f();
        }
        if (!this.C) {
            this.C = xVar.g();
        }
        if (this.C) {
            d3 d3Var = a4.i.f686a;
            d3Var.getClass();
            iVarJ = iVarJ.j(d3Var, new e3(A()));
        }
        this.f29436u = iVarJ;
        Set set = (Set) i.y(iVarJ, a4.j.f687a);
        if (set != null) {
            set.add(x());
            xVar.r(set);
        }
        V(Long.hashCode(xVar.h()), null, null, 0);
    }

    public final boolean g(boolean z11) {
        Object objE = E();
        if ((objE instanceof Boolean) && z11 == ((Boolean) objE).booleanValue()) {
            return false;
        }
        l0(Boolean.valueOf(z11));
        return true;
    }

    public final boolean g0(w1 w1Var, Object obj) {
        a aVar = w1Var.f29475c;
        if (aVar == null) {
            return false;
        }
        int iB = this.G.f29319a.b(aVar);
        if (!this.F || iB < this.G.f29325g) {
            return false;
        }
        ArrayList arrayList = this.f29434s;
        int iC = t.c(iB, arrayList);
        if (iC < 0) {
            int i11 = -(iC + 1);
            if (!(obj instanceof i0)) {
                obj = null;
            }
            arrayList.add(i11, new r0(w1Var, iB, obj));
            return true;
        }
        r0 r0Var = (r0) arrayList.get(iC);
        if (!(obj instanceof i0)) {
            r0Var.f29409c = null;
            return true;
        }
        Object obj2 = r0Var.f29409c;
        if (obj2 == null) {
            r0Var.f29409c = obj;
            return true;
        }
        if (obj2 instanceof q1.u0) {
            ((q1.u0) obj2).d(obj);
            return true;
        }
        q1.u0 u0Var = q1.j1.f35777a;
        q1.u0 u0Var2 = new q1.u0(2);
        u0Var2.j(obj2);
        u0Var2.j(obj);
        r0Var.f29409c = u0Var2;
        return true;
    }

    public final boolean h(Object obj) {
        if (E() == obj) {
            return false;
        }
        l0(obj);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0(q1.t0 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.ArrayList r2 = r0.f29434s
            int r3 = kotlin.collections.d0.g(r2)
        La:
            r4 = -1
            if (r4 >= r3) goto L2e
            java.lang.Object r4 = r2.get(r3)
            m3.r0 r4 = (m3.r0) r4
            m3.w1 r5 = r4.f29407a
            m3.a r5 = r5.f29475c
            if (r5 == 0) goto L28
            boolean r6 = r5.a()
            if (r6 == 0) goto L28
            int r6 = r4.f29408b
            int r5 = r5.f29174a
            if (r6 == r5) goto L2b
            r4.f29408b = r5
            goto L2b
        L28:
            r2.remove(r3)
        L2b:
            int r3 = r3 + (-1)
            goto La
        L2e:
            java.lang.Object[] r3 = r1.f35753b
            java.lang.Object[] r4 = r1.f35754c
            long[] r1 = r1.f35752a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L89
            r7 = 0
        L3a:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L84
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L54:
            if (r12 >= r10) goto L82
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L7e
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            r14.getClass()
            m3.w1 r14 = (m3.w1) r14
            m3.a r15 = r14.f29475c
            if (r15 == 0) goto L7e
            int r15 = r15.f29174a
            m3.f r6 = m3.f.f29274f
            if (r13 != r6) goto L76
            r13 = 0
        L76:
            m3.r0 r6 = new m3.r0
            r6.<init>(r14, r15, r13)
            r2.add(r6)
        L7e:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L54
        L82:
            if (r10 != r11) goto L89
        L84:
            if (r7 == r5) goto L89
            int r7 = r7 + 1
            goto L3a
        L89:
            a40.i r1 = m3.t.f29443a
            kotlin.collections.h0.r(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.s.h0(q1.t0):void");
    }

    public final void i() {
        this.f29426j = null;
        this.f29427k = 0;
        this.l = 0;
        this.T = 0L;
        this.f29433r = false;
        n3.b bVar = this.M;
        bVar.f30441c = false;
        bVar.f30442d.f6016b = 0;
        bVar.f30444f = 0;
        bVar.f30443e = true;
        bVar.f30445g = 0;
        bVar.f30446h.clear();
        bVar.f30447i = -1;
        bVar.f30448j = -1;
        bVar.f30449k = -1;
        bVar.l = 0;
        this.E.clear();
        this.f29430o = null;
        this.f29431p = null;
    }

    public final void i0(int i11, int i12) {
        if (m0(i11) != i12) {
            if (i11 < 0) {
                q1.e0 e0Var = this.f29431p;
                if (e0Var == null) {
                    e0Var = new q1.e0();
                    this.f29431p = e0Var;
                }
                e0Var.f(i11, i12);
                return;
            }
            int[] iArr = this.f29430o;
            if (iArr == null) {
                int i13 = this.G.f29321c;
                int[] iArr2 = new int[i13];
                Arrays.fill(iArr2, 0, i13, -1);
                this.f29430o = iArr2;
                iArr = iArr2;
            }
            iArr[i11] = i12;
        }
    }

    public final Object j(u1 u1Var) {
        return i.y(l(), u1Var);
    }

    public final void j0(int i11, int i12) {
        int iM0 = m0(i11);
        if (iM0 != i12) {
            int i13 = i12 - iM0;
            ArrayList arrayList = this.f29425i;
            int size = arrayList.size() - 1;
            while (i11 != -1) {
                int iM02 = m0(i11) + i13;
                i0(i11, iM02);
                int i14 = size;
                while (true) {
                    if (-1 < i14) {
                        r1 r1Var = (r1) arrayList.get(i14);
                        if (r1Var != null && r1Var.a(i11, iM02)) {
                            size = i14 - 1;
                            break;
                        }
                        i14--;
                    } else {
                        break;
                    }
                }
                l2 l2Var = this.G;
                if (i11 < 0) {
                    i11 = l2Var.f29327i;
                } else if (l2Var.l(i11)) {
                    return;
                } else {
                    i11 = this.G.q(i11);
                }
            }
        }
    }

    public final void k(Function0 function0) {
        if (!this.f29433r) {
            v.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f29433r = false;
        if (!this.S) {
            v.a("createNode() can only be called when inserting");
        }
        b5.y yVar = this.f29429n;
        int i11 = yVar.f6015a[yVar.f6016b - 1];
        q2 q2Var = this.I;
        a aVarB = q2Var.b(q2Var.f29402v);
        this.l++;
        n3.c cVar = this.O;
        n3.m0 m0Var = cVar.f30451h;
        m0Var.K(n3.r.f30482d);
        na0.a.t0(m0Var, 0, function0);
        m0Var.f30475j[m0Var.f30476k - m0Var.f30473h[m0Var.f30474i - 1].f30469a] = i11;
        na0.a.t0(m0Var, 1, aVarB);
        n3.m0 m0Var2 = cVar.f30452i;
        m0Var2.K(n3.r.f30483e);
        m0Var2.f30475j[m0Var2.f30476k - m0Var2.f30473h[m0Var2.f30474i - 1].f30469a] = i11;
        na0.a.t0(m0Var2, 0, aVarB);
    }

    public final void k0(Object obj) {
        if (obj instanceof e2) {
            f2 f2Var = new f2((e2) obj, this.f29428m - 1);
            if (this.S) {
                n3.m0 m0Var = this.M.f30440b.f30437h;
                m0Var.K(n3.x.f30492c);
                na0.a.t0(m0Var, 0, f2Var);
            }
            this.f29420d.add(obj);
            obj = f2Var;
        }
        l0(obj);
    }

    public final u3.i l() {
        u3.i iVar = this.K;
        return iVar != null ? iVar : m(this.G.f29327i);
    }

    public final void l0(Object obj) {
        if (this.S) {
            this.I.U(obj);
            return;
        }
        l2 l2Var = this.G;
        boolean z11 = l2Var.f29331n;
        n3.b bVar = this.M;
        if (!z11) {
            a aVarA = l2Var.a(l2Var.f29327i);
            n3.m0 m0Var = bVar.f30440b.f30437h;
            m0Var.K(n3.e.f30456c);
            na0.a.u0(m0Var, 0, aVarA, 1, obj);
            return;
        }
        int iB = (l2Var.l - o2.b(l2Var.f29327i, l2Var.f29320b)) - 1;
        if (bVar.f30439a.G.f29327i - bVar.f30444f >= 0) {
            bVar.d(true);
            n3.m0 m0Var2 = bVar.f30440b.f30437h;
            m0Var2.K(n3.r.f30485g);
            na0.a.t0(m0Var2, 0, obj);
            m0Var2.f30475j[m0Var2.f30476k - m0Var2.f30473h[m0Var2.f30474i - 1].f30469a] = iB;
            return;
        }
        l2 l2Var2 = this.G;
        a aVarA2 = l2Var2.a(l2Var2.f29327i);
        n3.m0 m0Var3 = bVar.f30440b.f30437h;
        m0Var3.K(n3.r.f30484f);
        na0.a.u0(m0Var3, 0, obj, 1, aVarA2);
        m0Var3.f30475j[m0Var3.f30476k - m0Var3.f30473h[m0Var3.f30474i - 1].f30469a] = iB;
    }

    public final u3.i m(int i11) {
        u3.i iVar;
        boolean z11 = this.S;
        e1 e1Var = v.f29459c;
        if (z11 && this.J) {
            int iG = this.I.f29402v;
            while (iG > 0) {
                if (this.I.s(iG) == 202 && Intrinsics.areEqual(this.I.t(iG), e1Var)) {
                    Object objQ = this.I.q(iG);
                    objQ.getClass();
                    u3.i iVar2 = (u3.i) objQ;
                    this.K = iVar2;
                    return iVar2;
                }
                q2 q2Var = this.I;
                iG = q2Var.G(iG, q2Var.f29383b);
            }
        }
        if (this.G.f29321c > 0) {
            while (i11 > 0) {
                if (this.G.i(i11) == 202) {
                    l2 l2Var = this.G;
                    if (Intrinsics.areEqual(l2Var.p(i11, l2Var.f29320b), e1Var)) {
                        q1.g0 g0Var = this.f29437v;
                        if (g0Var == null || (iVar = (u3.i) g0Var.b(i11)) == null) {
                            l2 l2Var2 = this.G;
                            Object objB = l2Var2.b(i11, l2Var2.f29320b);
                            objB.getClass();
                            iVar = (u3.i) objB;
                        }
                        this.K = iVar;
                        return iVar;
                    }
                }
                i11 = this.G.q(i11);
            }
        }
        u3.i iVar3 = this.f29436u;
        this.K = iVar3;
        return iVar3;
    }

    public final int m0(int i11) {
        int i12;
        if (i11 >= 0) {
            int[] iArr = this.f29430o;
            return (iArr == null || (i12 = iArr[i11]) < 0) ? this.G.o(i11) : i12;
        }
        q1.e0 e0Var = this.f29431p;
        if (e0Var == null || e0Var.a(i11) < 0) {
            return 0;
        }
        int iA = e0Var.a(i11);
        if (iA >= 0) {
            return e0Var.f35774c[iA];
        }
        qc.y.h(j4.s.f(i11, "Cannot find value for key "));
        return 0;
    }

    public final a4.a n() {
        Collection collection;
        if (!this.f29418b.l()) {
            return null;
        }
        v70.e eVarB = kotlin.collections.c0.b();
        q2 q2Var = this.I;
        eVarB.addAll(a4.c.a(q2Var, null, q2Var.f29400t, null));
        l2 l2Var = this.G;
        boolean z11 = l2Var.f29324f;
        int[] iArr = l2Var.f29320b;
        if (z11 || l2Var.f29321c == 0) {
            collection = kotlin.collections.n0.f26529a;
        } else {
            a4.m mVar = new a4.m(l2Var);
            int iQ = l2Var.f29327i;
            Object objValueOf = Integer.valueOf(l2Var.l - o2.b(iQ, iArr));
            while (iQ >= 0) {
                mVar.c(l2Var.i(iQ), l2Var.k(iQ) ? l2Var.p(iQ, iArr) : m.f29332a, l2Var.f29319a.i(iQ), objValueOf);
                objValueOf = l2Var.a(iQ);
                iQ = l2Var.q(iQ);
            }
            collection = mVar.f681a;
        }
        eVarB.addAll(collection);
        eVarB.addAll(F());
        return new a4.a(kotlin.collections.c0.a(eVarB));
    }

    public final void n0() {
        if (!this.f29433r) {
            v.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f29433r = false;
        if (this.S) {
            v.a("useNode() called while inserting");
        }
        l2 l2Var = this.G;
        Object objN = l2Var.n(l2Var.f29327i);
        n3.b bVar = this.M;
        bVar.c();
        bVar.f30446h.add(objN);
        if (this.f29440y && (objN instanceof j)) {
            bVar.b();
            bVar.f30440b.f30437h.K(n3.j0.f30467c);
        }
    }

    public final void o(q1.t0 t0Var, Function2 function2) {
        ArrayList arrayList = this.f29434s;
        if (this.F) {
            v.a("Reentrant composition is not supported");
        }
        this.f29423g.q();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(z3.l.j().g());
            this.f29437v = null;
            h0(t0Var);
            this.f29427k = 0;
            this.F = true;
            try {
                f0();
                Object objE = E();
                if (objE != function2 && function2 != null) {
                    l0(function2);
                }
                r rVar = this.D;
                o3.e eVarP = i.p();
                try {
                    eVarP.b(rVar);
                    e1 e1Var = v.f29457a;
                    if (function2 != null) {
                        X(200, e1Var);
                        u3.e.d(this, function2);
                        q(false);
                    } else if (!this.f29438w || objE == null || Intrinsics.areEqual(objE, m.f29332a)) {
                        S();
                    } else {
                        X(200, e1Var);
                        u3.e.d(this, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(objE, 2));
                        q(false);
                    }
                    eVarP.l(eVarP.f31832c - 1);
                    u();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.f29403w) {
                        v.a("Check failed");
                    }
                    w();
                } catch (Throwable th2) {
                    eVarP.l(eVarP.f31832c - 1);
                    throw th2;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void p(int i11, int i12) {
        if (i11 <= 0 || i11 == i12) {
            return;
        }
        p(this.G.q(i11), i12);
        if (this.G.l(i11)) {
            Object objN = this.G.n(i11);
            n3.b bVar = this.M;
            bVar.c();
            bVar.f30446h.add(objN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a5  */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(boolean r43) {
        /*
            Method dump skipped, instruction units count: 1386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.s.q(boolean):void");
    }

    public final void r() {
        q(false);
        w1 w1VarY = y();
        if (w1VarY != null) {
            int i11 = w1VarY.f29474b;
            if ((i11 & 1) != 0) {
                w1VarY.f29474b = i11 | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[EDGE_INSN: B:61:0x0083->B:28:0x0083 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x0080], EDGE_INSN: B:62:0x0083->B:28:0x0083 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x0080]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m3.w1 s() {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.s.s():m3.w1");
    }

    public final void t() {
        if (this.F || this.f29441z != 0) {
            s1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f29441z = -1;
        this.f29440y = false;
    }

    public final void u() {
        q(false);
        this.f29418b.d();
        q(false);
        n3.b bVar = this.M;
        if (bVar.f30441c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f30440b.f30437h.K(n3.m.f30472c);
            bVar.f30441c = false;
        }
        bVar.b();
        if (bVar.f30442d.f6016b != 0) {
            v.a("Missed recording an endGroup()");
        }
        if (!this.f29425i.isEmpty()) {
            v.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.f29438w = this.f29439x.b() != 0;
    }

    public final void v(boolean z11, r1 r1Var) {
        this.f29425i.add(this.f29426j);
        this.f29426j = r1Var;
        int i11 = this.l;
        b5.y yVar = this.f29429n;
        yVar.c(i11);
        yVar.c(this.f29428m);
        yVar.c(this.f29427k);
        if (z11) {
            this.f29427k = 0;
        }
        this.l = 0;
        this.f29428m = 0;
    }

    public final void w() {
        m2 m2Var = new m2();
        if (this.C) {
            m2Var.d();
        }
        if (this.f29418b.e()) {
            m2Var.f29347k = new q1.g0();
        }
        this.H = m2Var;
        q2 q2VarG = m2Var.g();
        q2VarG.e(true);
        this.I = q2VarG;
    }

    public final a4.f x() {
        z zVar = this.U;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this.f29424h);
        this.U = zVar2;
        return zVar2;
    }

    public final w1 y() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (w1) j4.s.d(1, arrayList);
    }

    public final boolean z() {
        if (!B() || this.f29438w) {
            return true;
        }
        w1 w1VarY = y();
        return (w1VarY == null || (w1VarY.f29474b & 4) == 0) ? false : true;
    }
}
