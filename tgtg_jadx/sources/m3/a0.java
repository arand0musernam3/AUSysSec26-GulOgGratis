package m3;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements g0, i2, x1, l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f29175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b5.r2 f29176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f29177c = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f29178d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1.w0 f29179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m2 f29180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q1.t0 f29181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q1.u0 f29182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q1.u0 f29183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q1.t0 f29184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n3.a f29185k;
    public final n3.a l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q1.t0 f29186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q1.t0 f29187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f29188o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public wy.o f29189p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p1 f29190q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a0 f29191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f29192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jb.b f29193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g0.c f29194u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s f29195v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f29196w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Function2 f29197x;

    public a0(x xVar, b5.r2 r2Var) {
        this.f29175a = xVar;
        this.f29176b = r2Var;
        q1.w0 w0Var = new q1.w0(new q1.u0());
        this.f29179e = w0Var;
        m2 m2Var = new m2();
        if (xVar.e()) {
            m2Var.f29347k = new q1.g0();
        }
        if (xVar.g()) {
            m2Var.d();
        }
        this.f29180f = m2Var;
        this.f29181g = v0.n.u();
        this.f29182h = new q1.u0();
        this.f29183i = new q1.u0();
        this.f29184j = v0.n.u();
        n3.a aVar = new n3.a();
        this.f29185k = aVar;
        n3.a aVar2 = new n3.a();
        this.l = aVar2;
        this.f29186m = v0.n.u();
        this.f29187n = v0.n.u();
        jb.b bVar = new jb.b(xVar);
        this.f29193t = bVar;
        this.f29194u = new g0.c();
        s sVar = new s(r2Var, xVar, m2Var, w0Var, aVar, aVar2, bVar, this);
        xVar.s(sVar);
        this.f29195v = sVar;
        this.f29197x = i.f29297a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(o3.h hVar) {
        Object obj;
        while (true) {
            Object obj2 = this.f29177c.get();
            if (obj2 == null || Intrinsics.areEqual(obj2, i.f29299c)) {
                obj = hVar;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, hVar};
            } else {
                if (!(obj2 instanceof Object[])) {
                    wy.o.h(this.f29177c, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = hVar;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f29177c;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.f29178d) {
                    r();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f29178d
            monitor-enter(r0)
            r14.x(r15)     // Catch: java.lang.Throwable -> L4f
            q1.t0 r1 = r14.f29184j     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.d(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof q1.u0     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            q1.u0 r15 = (q1.u0) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.f35769b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.f35768a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            m3.i0 r10 = (m3.i0) r10     // Catch: java.lang.Throwable -> L4f
            r14.x(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            m3.i0 r15 = (m3.i0) r15     // Catch: java.lang.Throwable -> L4f
            r14.x(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.a0.B(java.lang.Object):void");
    }

    public final void C(Function2 function2) {
        boolean zL = l();
        t();
        x xVar = this.f29175a;
        if (!zL) {
            this.f29197x = function2;
            xVar.a(this, function2);
            return;
        }
        s sVar = this.f29195v;
        sVar.f29441z = 0;
        sVar.f29440y = true;
        this.f29197x = function2;
        xVar.a(this, function2);
        sVar.t();
    }

    @Override // m3.x1
    public final void a() {
        this.f29188o = true;
        this.f29193t.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // m3.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.a0.b(java.lang.Object):void");
    }

    @Override // m3.x1
    public final s0 c(w1 w1Var, Object obj) {
        a0 a0Var;
        int i11 = w1Var.f29474b;
        if ((i11 & 2) != 0) {
            w1Var.f29474b = i11 | 4;
        }
        a aVar = w1Var.f29475c;
        if (aVar == null || !aVar.a()) {
            return s0.IGNORED;
        }
        if (this.f29180f.h(aVar)) {
            if (w1Var.f29476d == null) {
                return s0.IGNORED;
            }
            s0 s0VarW = w(w1Var, aVar, obj);
            if (s0VarW != s0.IGNORED) {
                this.f29193t.q();
            }
            return s0VarW;
        }
        synchronized (this.f29178d) {
            a0Var = this.f29191r;
        }
        if (a0Var != null) {
            s sVar = a0Var.f29195v;
            if (sVar.F && sVar.g0(w1Var, obj)) {
                return s0.IMMINENT;
            }
        }
        return s0.IGNORED;
    }

    public final void d() {
        this.f29177c.set(null);
        this.f29185k.f30437h.G();
        this.l.f30437h.G();
        q1.w0 w0Var = this.f29179e;
        if (w0Var.f35851a.b()) {
            return;
        }
        g0.c cVar = this.f29194u;
        try {
            cVar.g(w0Var, this.f29195v.A());
            cVar.b();
        } finally {
            cVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            q1.t0 r2 = r0.f29181g
            java.lang.Object r2 = r2.d(r1)
            if (r2 == 0) goto L9a
            boolean r3 = r2 instanceof q1.u0
            q1.u0 r4 = r0.f29182h
            q1.u0 r5 = r0.f29183i
            q1.t0 r6 = r0.f29186m
            if (r3 == 0) goto L7d
            q1.u0 r2 = (q1.u0) r2
            java.lang.Object[] r3 = r2.f35769b
            long[] r2 = r2.f35768a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L9a
            r9 = 0
        L22:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L3c:
            if (r14 >= r12) goto L75
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L6c
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r3[r15]
            m3.w1 r15 = (m3.w1) r15
            boolean r16 = v0.n.E(r6, r1, r15)
            if (r16 != 0) goto L6c
            m3.s0 r8 = r15.c(r1)
            r17 = r13
            m3.s0 r13 = m3.s0.IGNORED
            if (r8 == r13) goto L6e
            q1.t0 r8 = r15.f29479g
            if (r8 == 0) goto L68
            if (r21 != 0) goto L68
            r5.d(r15)
            goto L6e
        L68:
            r4.d(r15)
            goto L6e
        L6c:
            r17 = r13
        L6e:
            long r10 = r10 >> r17
            int r14 = r14 + 1
            r13 = r17
            goto L3c
        L75:
            r8 = r13
            if (r12 != r8) goto L9a
        L78:
            if (r9 == r7) goto L9a
            int r9 = r9 + 1
            goto L22
        L7d:
            m3.w1 r2 = (m3.w1) r2
            boolean r3 = v0.n.E(r6, r1, r2)
            if (r3 != 0) goto L9a
            m3.s0 r1 = r2.c(r1)
            m3.s0 r3 = m3.s0.IGNORED
            if (r1 == r3) goto L9a
            q1.t0 r1 = r2.f29479g
            if (r1 == 0) goto L97
            if (r21 != 0) goto L97
            r5.d(r2)
            return
        L97:
            r4.d(r2)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.a0.e(java.lang.Object, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:224:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.Set r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.a0.f(java.util.Set, boolean):void");
    }

    public final void g() {
        synchronized (this.f29178d) {
            try {
                h(this.f29185k);
                r();
            } catch (Throwable th2) {
                try {
                    if (!this.f29179e.f35851a.b()) {
                        g0.c cVar = this.f29194u;
                        try {
                            cVar.g(this.f29179e, this.f29195v.A());
                            cVar.b();
                            cVar.a();
                        } catch (Throwable th3) {
                            cVar.a();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    d();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(n3.a r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.a0.h(n3.a):void");
    }

    public final void i() {
        synchronized (this.f29178d) {
            try {
                if (this.l.f30437h.J()) {
                    h(this.l);
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f29179e.f35851a.b()) {
                        g0.c cVar = this.f29194u;
                        try {
                            cVar.g(this.f29179e, this.f29195v.A());
                            cVar.b();
                            cVar.a();
                        } catch (Throwable th3) {
                            cVar.a();
                            throw th3;
                        }
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    public final void j() {
        g0.c cVar;
        synchronized (this.f29178d) {
            try {
                this.f29195v.f29437v = null;
                if (!this.f29179e.f35851a.b()) {
                    cVar = this.f29194u;
                    try {
                        cVar.g(this.f29179e, this.f29195v.A());
                        cVar.b();
                        cVar.a();
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f29179e.f35851a.b()) {
                        cVar = this.f29194u;
                        try {
                            cVar.g(this.f29179e, this.f29195v.A());
                            cVar.b();
                            cVar.a();
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    d();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.a0.k():void");
    }

    public final boolean l() {
        boolean z11;
        synchronized (this.f29178d) {
            z11 = true;
            if (this.f29196w != 1) {
                z11 = false;
            }
            if (z11) {
                this.f29196w = 0;
            }
        }
        return z11;
    }

    public final void m(Function2 function2) {
        try {
            synchronized (this.f29178d) {
                q();
                q1.t0 t0Var = this.f29187n;
                this.f29187n = v0.n.u();
                try {
                    s sVar = this.f29195v;
                    wy.o oVar = this.f29189p;
                    if (!sVar.f29421e.f30437h.I()) {
                        v.a("Expected applyChanges() to have been called");
                    }
                    sVar.P = oVar;
                    try {
                        sVar.o(t0Var, function2);
                    } finally {
                        sVar.P = null;
                    }
                } catch (Throwable th2) {
                    this.f29187n = t0Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.f29179e.f35851a.b()) {
                    g0.c cVar = this.f29194u;
                    try {
                        cVar.g(this.f29179e, this.f29195v.A());
                        cVar.b();
                        cVar.a();
                    } catch (Throwable th4) {
                        cVar.a();
                        throw th4;
                    }
                }
                throw th3;
            } catch (Throwable th5) {
                d();
                throw th5;
            }
        }
    }

    public final p1 n(boolean z11, Function2 function2) {
        if (this.f29190q != null) {
            s1.b("A pausable composition is in progress");
        }
        p1 p1Var = new p1(this, this.f29175a, this.f29195v, this.f29179e, function2, z11, this.f29176b, this.f29178d);
        this.f29190q = p1Var;
        return p1Var;
    }

    public final void o() {
        synchronized (this.f29178d) {
            try {
                if (this.f29190q != null) {
                    s1.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z11 = this.f29180f.f29338b > 0;
                if (z11 || !this.f29179e.f35851a.b()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        g0.c cVar = this.f29194u;
                        try {
                            cVar.g(this.f29179e, this.f29195v.A());
                            if (z11) {
                                q2 q2VarG = this.f29180f.g();
                                try {
                                    q2VarG.n(q2VarG.f29400t, new kq.c(7, this.f29194u, q2VarG));
                                    q2VarG.e(true);
                                    this.f29176b.o();
                                    cVar.c();
                                } catch (Throwable th2) {
                                    q2VarG.e(false);
                                    throw th2;
                                }
                            }
                            cVar.b();
                            cVar.a();
                        } catch (Throwable th3) {
                            cVar.a();
                            throw th3;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.f29181g.g();
                this.f29184j.g();
                this.f29187n.g();
                this.f29185k.f30437h.G();
                this.l.f30437h.G();
                s sVar = this.f29195v;
                sVar.E.clear();
                sVar.f29434s.clear();
                sVar.f29421e.f30437h.G();
                sVar.f29437v = null;
                this.f29196w = 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void p() {
        synchronized (this.f29178d) {
            try {
                if (this.f29195v.F) {
                    s1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f29196w != 3) {
                    this.f29196w = 3;
                    this.f29197x = i.f29298b;
                    n3.a aVar = this.f29195v.L;
                    if (aVar != null) {
                        h(aVar);
                    }
                    boolean z11 = this.f29180f.f29338b > 0;
                    if (z11 || !this.f29179e.f35851a.b()) {
                        g0.c cVar = this.f29194u;
                        try {
                            cVar.g(this.f29179e, this.f29195v.A());
                            if (z11) {
                                q2 q2VarG = this.f29180f.g();
                                try {
                                    q2VarG.n(q2VarG.f29400t, new lk.a(this.f29194u, 13));
                                    q2VarG.J();
                                    q2VarG.e(true);
                                    this.f29176b.a();
                                    this.f29176b.o();
                                    cVar.c();
                                } catch (Throwable th2) {
                                    q2VarG.e(false);
                                    throw th2;
                                }
                            }
                            cVar.b();
                            cVar.a();
                        } catch (Throwable th3) {
                            cVar.a();
                            throw th3;
                        }
                    }
                    s sVar = this.f29195v;
                    sVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        sVar.f29418b.x(sVar);
                        sVar.E.clear();
                        sVar.f29434s.clear();
                        sVar.f29421e.f30437h.G();
                        sVar.f29437v = null;
                        sVar.f29417a.a();
                        Trace.endSection();
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        this.f29175a.y(this);
    }

    public final void q() {
        Object obj = i.f29299c;
        AtomicReference atomicReference = this.f29177c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (Intrinsics.areEqual(andSet, obj)) {
                v.b("pending composition has not been applied");
                qc.y.m();
                return;
            }
            if (andSet instanceof Set) {
                f((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                v.b("corrupt pendingModifications drain: " + atomicReference);
                qc.y.m();
                return;
            }
            for (Set set : (Set[]) andSet) {
                f(set, true);
            }
        }
    }

    public final void r() {
        AtomicReference atomicReference = this.f29177c;
        Object andSet = atomicReference.getAndSet(null);
        if (Intrinsics.areEqual(andSet, i.f29299c)) {
            return;
        }
        if (andSet instanceof Set) {
            f((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                f(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.f29190q == null) {
                v.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            v.b("corrupt pendingModifications drain: " + atomicReference);
            qc.y.m();
        }
    }

    public final void s() {
        kotlin.collections.p0 p0Var = kotlin.collections.p0.f26531a;
        AtomicReference atomicReference = this.f29177c;
        Object andSet = atomicReference.getAndSet(p0Var);
        if (Intrinsics.areEqual(andSet, i.f29299c) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            f((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            v.b("corrupt pendingModifications drain: " + atomicReference);
            qc.y.m();
            return;
        }
        for (Set set : (Set[]) andSet) {
            f(set, false);
        }
    }

    public final void t() {
        int i11 = this.f29196w;
        if (i11 != 0) {
            s1.b(i11 != 1 ? i11 != 2 ? i11 != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f29190q == null) {
            return;
        }
        s1.b("A pausable composition is in progress");
    }

    public final void u(ArrayList arrayList) {
        q1.w0 w0Var = this.f29179e;
        s sVar = this.f29195v;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (!Intrinsics.areEqual(((a1) ((Pair) arrayList.get(i11)).f26485a).f29200c, this)) {
                    v.a("Check failed");
                    break;
                }
                i11++;
            }
        }
        try {
            sVar.getClass();
            try {
                sVar.C(arrayList);
                sVar.i();
            } catch (Throwable th2) {
                sVar.a();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!w0Var.f35851a.b()) {
                    g0.c cVar = this.f29194u;
                    try {
                        cVar.g(w0Var, sVar.A());
                        cVar.b();
                        cVar.a();
                    } catch (Throwable th4) {
                        cVar.a();
                        throw th4;
                    }
                }
                throw th3;
            } catch (Throwable th5) {
                d();
                throw th5;
            }
        }
    }

    public final void v() {
        synchronized (this.f29178d) {
            try {
                for (Object obj : this.f29180f.f29339c) {
                    w1 w1Var = obj instanceof w1 ? (w1) obj : null;
                    if (w1Var != null) {
                        w1Var.b();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2 A[Catch: all -> 0x0042, EDGE_INSN: B:81:0x00d2->B:66:0x00d2 BREAK  A[LOOP:0: B:48:0x0089->B:62:0x00ca], EDGE_INSN: B:82:0x00d2->B:66:0x00d2 BREAK  A[LOOP:0: B:48:0x0089->B:62:0x00ca], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:40:0x006d, B:41:0x0073, B:43:0x0079, B:45:0x007d, B:48:0x0089, B:50:0x0099, B:52:0x00a5, B:54:0x00af, B:58:0x00be, B:62:0x00ca, B:63:0x00cd, B:66:0x00d2), top: B:79:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m3.s0 w(m3.w1 r21, m3.a r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.a0.w(m3.w1, m3.a, java.lang.Object):m3.s0");
    }

    public final void x(Object obj) {
        Object objD = this.f29181g.d(obj);
        if (objD == null) {
            return;
        }
        boolean z11 = objD instanceof q1.u0;
        q1.t0 t0Var = this.f29186m;
        if (!z11) {
            w1 w1Var = (w1) objD;
            if (w1Var.c(obj) == s0.IMMINENT) {
                v0.n.p(t0Var, obj, w1Var);
                return;
            }
            return;
        }
        q1.u0 u0Var = (q1.u0) objD;
        Object[] objArr = u0Var.f35769b;
        long[] jArr = u0Var.f35768a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j9 = jArr[i11];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j9) < 128) {
                        w1 w1Var2 = (w1) objArr[(i11 << 3) + i13];
                        if (w1Var2.c(obj) == s0.IMMINENT) {
                            v0.n.p(t0Var, obj, w1Var2);
                        }
                    }
                    j9 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof o3.h
            q1.t0 r3 = r0.f29184j
            q1.t0 r4 = r0.f29181g
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            o3.h r1 = (o3.h) r1
            q1.i1 r1 = r1.f31843a
            java.lang.Object[] r2 = r1.f35769b
            long[] r1 = r1.f35768a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.b(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.b(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.b(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.b(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.a0.y(java.util.Set):boolean");
    }

    public final boolean z() {
        synchronized (this.f29178d) {
            p1 p1Var = this.f29190q;
            boolean zJ = false;
            if (p1Var != null && (p1Var.f29370h.get() != q1.Recomposing || p1Var.f29371i != u3.e.c())) {
                AtomicReference atomicReference = p1Var.f29370h;
                q1 q1Var = q1.ApplyPending;
                q1 q1Var2 = q1.RecomposePending;
                while (!atomicReference.compareAndSet(q1Var, q1Var2) && atomicReference.get() == q1Var) {
                }
                p1Var.l.f29255a.c(9);
                return false;
            }
            q();
            try {
                q1.t0 t0Var = this.f29187n;
                this.f29187n = v0.n.u();
                try {
                    s sVar = this.f29195v;
                    wy.o oVar = this.f29189p;
                    n3.m0 m0Var = sVar.f29421e.f30437h;
                    if (!m0Var.I()) {
                        v.a("Expected applyChanges() to have been called");
                    }
                    if (t0Var.f35756e > 0 || !sVar.f29434s.isEmpty()) {
                        sVar.P = oVar;
                        try {
                            sVar.o(t0Var, null);
                            sVar.P = null;
                            zJ = m0Var.J();
                        } catch (Throwable th2) {
                            sVar.P = null;
                            throw th2;
                        }
                    }
                    if (!zJ) {
                        r();
                    }
                    return zJ;
                } catch (Throwable th3) {
                    this.f29187n = t0Var;
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    if (!this.f29179e.f35851a.b()) {
                        g0.c cVar = this.f29194u;
                        try {
                            cVar.g(this.f29179e, this.f29195v.A());
                            cVar.b();
                            cVar.a();
                        } catch (Throwable th5) {
                            cVar.a();
                            throw th5;
                        }
                    }
                    throw th4;
                } catch (Throwable th6) {
                    d();
                    throw th6;
                }
            }
        }
    }
}
