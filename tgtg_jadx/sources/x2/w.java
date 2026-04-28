package x2;

import a3.j0;
import a3.k0;
import a3.x2;
import c5.t1;
import g3.x1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import m2.m1;
import m3.i0;
import m3.k1;
import m5.q0;
import m5.t0;
import v80.d0;
import v80.f0;
import w2.c0;
import w2.o1;
import w2.s1;
import w4.m0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f43781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f43782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z5.c f43783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s2.l f43785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v80.b0 f43786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a3.u f43787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t1 f43788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r4.a f43790j;
    public Function0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function0 f43792m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k1 f43797r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k1 f43798s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k1 f43799t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x2 f43800u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f43801v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b2.n f43802w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i0 f43803x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c40.i f43804y;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k1 f43791k = m3.i.w(Boolean.TRUE);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k1 f43793n = m3.i.w(new h4.b(9205357640488583168L));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k1 f43794o = m3.i.w(new h4.b(9205357640488583168L));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k1 f43795p = m3.i.w(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k1 f43796q = m3.i.w(k.None);

    public w(s1 s1Var, o1 o1Var, z5.c cVar, boolean z11, boolean z12, s2.l lVar, v80.b0 b0Var, a3.u uVar, t1 t1Var) {
        this.f43781a = s1Var;
        this.f43782b = o1Var;
        this.f43783c = cVar;
        this.f43784d = z12;
        this.f43785e = lVar;
        this.f43786f = b0Var;
        this.f43787g = uVar;
        this.f43788h = t1Var;
        this.f43789i = z11;
        Boolean bool = Boolean.FALSE;
        this.f43797r = m3.i.w(bool);
        this.f43798s = m3.i.w(b0.None);
        this.f43799t = m3.i.w(bool);
        this.f43801v = -1;
        this.f43803x = m3.i.q(new m2.g(this, 4));
        this.f43804y = new c40.i(this.f43788h, (byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(x2.w r9, w4.y r10, z70.c r11) throws java.lang.Throwable {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof x2.o
            if (r0 == 0) goto L17
            r0 = r11
            x2.o r0 = (x2.o) r0
            int r1 = r0.f43762n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f43762n = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            x2.o r0 = new x2.o
            r0.<init>(r9, r11)
            goto L15
        L1d:
            java.lang.Object r11 = r6.l
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r6.f43762n
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            kotlin.jvm.internal.Ref$LongRef r10 = r6.f43760k
            kotlin.jvm.internal.Ref$LongRef r1 = r6.f43759j
            ba0.g.M(r11)     // Catch: java.lang.Throwable -> L30
            goto L7b
        L30:
            r0 = move-exception
            r11 = r0
            goto L86
        L33:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L3a:
            ba0.g.M(r11)
            kotlin.jvm.internal.Ref$LongRef r11 = new kotlin.jvm.internal.Ref$LongRef
            r11.<init>()
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r11.element = r3
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            r7.element = r3
            r1 = r2
            m2.h0 r2 = new m2.h0     // Catch: java.lang.Throwable -> L81
            r3 = 24
            r2.<init>(r11, r9, r7, r3)     // Catch: java.lang.Throwable -> L81
            x2.j r3 = new x2.j     // Catch: java.lang.Throwable -> L81
            r4 = 0
            r3.<init>(r11, r7, r9, r4)     // Catch: java.lang.Throwable -> L81
            x2.j r4 = new x2.j     // Catch: java.lang.Throwable -> L81
            r5 = 1
            r4.<init>(r11, r7, r9, r5)     // Catch: java.lang.Throwable -> L81
            rs.b r5 = new rs.b     // Catch: java.lang.Throwable -> L81
            r8 = 13
            r5.<init>(r7, r9, r11, r8)     // Catch: java.lang.Throwable -> L81
            r6.f43759j = r11     // Catch: java.lang.Throwable -> L81
            r6.f43760k = r7     // Catch: java.lang.Throwable -> L81
            r6.f43762n = r1     // Catch: java.lang.Throwable -> L81
            r1 = r10
            java.lang.Object r10 = z1.y0.e(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L81
            if (r10 != r0) goto L79
            return r0
        L79:
            r1 = r11
            r10 = r7
        L7b:
            g(r1, r10, r9)
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        L81:
            r0 = move-exception
            r10 = r0
            r1 = r11
            r11 = r10
            r10 = r7
        L86:
            g(r1, r10, r9)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.w.a(x2.w, w4.y, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(x2.w r14, w4.y r15, boolean r16, z70.c r17) throws java.lang.Throwable {
        /*
            r0 = r17
            boolean r1 = r0 instanceof x2.p
            if (r1 == 0) goto L16
            r1 = r0
            x2.p r1 = (x2.p) r1
            int r2 = r1.f43767o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r3
            if (r5 == 0) goto L16
            int r2 = r2 - r3
            r1.f43767o = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            x2.p r1 = new x2.p
            r1.<init>(r14, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f43765m
            y70.a r8 = y70.a.COROUTINE_SUSPENDED
            int r1 = r7.f43767o
            r6 = 1
            if (r1 == 0) goto L3c
            if (r1 != r6) goto L35
            m2.t0 r1 = r7.l
            kotlin.jvm.internal.Ref$LongRef r2 = r7.f43764k
            kotlin.jvm.internal.Ref$LongRef r3 = r7.f43763j
            ba0.g.M(r0)     // Catch: java.lang.Throwable -> L32
            goto L96
        L32:
            r0 = move-exception
            goto Lb0
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r0)
            r0 = 0
            return r0
        L3c:
            ba0.g.M(r0)
            kotlin.jvm.internal.Ref$LongRef r1 = new kotlin.jvm.internal.Ref$LongRef
            r1.<init>()
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r1.element = r2
            kotlin.jvm.internal.Ref$LongRef r2 = new kotlin.jvm.internal.Ref$LongRef
            r2.<init>()
            r9 = 0
            r2.element = r9
            if (r16 == 0) goto L5a
            m2.t0 r0 = m2.t0.SelectionStart
        L58:
            r3 = r0
            goto L5d
        L5a:
            m2.t0 r0 = m2.t0.SelectionEnd
            goto L58
        L5d:
            g3.w2 r0 = new g3.w2     // Catch: java.lang.Throwable -> Lab
            r4 = r14
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lab
            r9 = r0
            x2.j r10 = new x2.j     // Catch: java.lang.Throwable -> Lab
            r0 = 2
            r10.<init>(r1, r14, r2, r0)     // Catch: java.lang.Throwable -> Lab
            x2.j r11 = new x2.j     // Catch: java.lang.Throwable -> Lab
            r0 = 3
            r11.<init>(r1, r14, r2, r0)     // Catch: java.lang.Throwable -> Lab
            bg.d r0 = new bg.d     // Catch: java.lang.Throwable -> Lab
            r4 = r2
            r2 = r1
            r1 = r4
            r4 = r14
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La6
            r12 = r1
            r13 = r2
            r1 = r3
            r7.f43763j = r13     // Catch: java.lang.Throwable -> La2
            r7.f43764k = r12     // Catch: java.lang.Throwable -> La2
            r7.l = r1     // Catch: java.lang.Throwable -> La2
            r7.f43767o = r6     // Catch: java.lang.Throwable -> La2
            r2 = r15
            r6 = r0
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r0 = z1.y0.e(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> La2
            if (r0 != r8) goto L94
            return r8
        L94:
            r2 = r12
            r3 = r13
        L96:
            m2.t0 r0 = r14.l()
            if (r0 != r1) goto L9f
            h(r3, r2, r14)
        L9f:
            kotlin.Unit r0 = kotlin.Unit.f26487a
            return r0
        La2:
            r0 = move-exception
        La3:
            r2 = r12
        La4:
            r3 = r13
            goto Lb0
        La6:
            r0 = move-exception
            r12 = r1
            r13 = r2
            r1 = r3
            goto La3
        Lab:
            r0 = move-exception
            r13 = r1
            r12 = r2
            r1 = r3
            goto La4
        Lb0:
            m2.t0 r4 = r14.l()
            if (r4 != r1) goto Lb9
            h(r3, r2, r14)
        Lb9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.w.b(x2.w, w4.y, boolean, z70.c):java.lang.Object");
    }

    public static final void g(Ref.LongRef longRef, Ref.LongRef longRef2, w wVar) {
        if ((longRef.element & 9223372034707292159L) != 9205357640488583168L) {
            longRef.element = 9205357640488583168L;
            longRef2.element = 9205357640488583168L;
            wVar.d();
        }
    }

    public static final void h(Ref.LongRef longRef, Ref.LongRef longRef2, w wVar) {
        if ((longRef.element & 9223372034707292159L) != 9205357640488583168L) {
            wVar.d();
            longRef.element = 9205357640488583168L;
            longRef2.element = 0L;
            wVar.f43801v = -1;
        }
    }

    public final long A(v2.b bVar, int i11, int i12, boolean z11, j0 j0Var, boolean z12, boolean z13) {
        long jB;
        r4.a aVar;
        long j9 = bVar.f41929d;
        t0 t0Var = new t0(j9);
        if (z13 || (!z12 && t0.d(j9))) {
            t0Var = null;
        }
        q0 q0VarG = this.f43782b.f43008b.g();
        boolean z14 = false;
        if (q0VarG == null) {
            jB = t0.f29648b;
        } else if (t0Var == null && Intrinsics.areEqual(j0Var, k0.f432e)) {
            jB = m5.k0.b(i11, i12);
        } else {
            x2 x2VarA = a3.s1.a(q0VarG, i11, i12, this.f43801v, t0Var != null ? t0Var.f29650a : t0.f29648b, t0Var == null, z11);
            if (t0Var == null || x2VarA.i(this.f43800u)) {
                a3.i0 i0VarA = j0Var.a(x2VarA);
                long jB2 = m5.k0.b(i0VarA.f385a.f367b, i0VarA.f386b.f367b);
                this.f43800u = x2VarA;
                this.f43801v = z11 ? i11 : i12;
                jB = jB2;
            } else {
                jB = t0Var.f29650a;
            }
        }
        if (!t0.c(jB, j9)) {
            if (t0.h(jB) != t0.h(j9) && t0.c(m5.k0.b((int) (4294967295L & jB), (int) (jB >> 32)), j9)) {
                z14 = true;
            }
            if (((Boolean) this.f43791k.getValue()).booleanValue() && !z14 && (aVar = this.f43790j) != null) {
                aVar.a(9);
            }
        }
        return jB;
    }

    public final h4.c c(q0 q0Var, v2.b bVar) {
        if (!t0.d(bVar.f41929d)) {
            return h4.c.f21379e;
        }
        h4.c cVarC = q0Var.c((int) (bVar.f41929d >> 32));
        float fFloor = (float) Math.floor(this.f43783c.c0(m1.f29018a));
        if (fFloor < 1.0f) {
            fFloor = 1.0f;
        }
        float f11 = q0Var.f29617a.f29610h == z5.m.Ltr ? (fFloor / 2) + cVarC.f21380a : cVarC.f21382c - (fFloor / 2);
        float f12 = fFloor / 2;
        float f13 = ((int) (q0Var.f29619c >> 32)) - f12;
        if (f11 > f13) {
            f11 = f13;
        }
        if (f11 < f12) {
            f11 = f12;
        }
        float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f11)) + 0.5f : (float) Math.rint(f11);
        return new h4.c(fFloor2 - f12, cVarC.f21381b, fFloor2 + f12, cVarC.f21383d);
    }

    public final void d() {
        this.f43795p.setValue(null);
        this.f43794o.setValue(new h4.b(9205357640488583168L));
        this.f43793n.setValue(new h4.b(9205357640488583168L));
    }

    public final Unit e(boolean z11, z70.i iVar) {
        m5.h hVar;
        s1 s1Var = this.f43781a;
        if (t0.d(s1Var.d().f41929d)) {
            hVar = null;
        } else {
            v2.b bVarD = s1Var.d();
            hVar = new m5.h(bVarD.f41928c.subSequence(t0.g(bVarD.f41929d), t0.f(bVarD.f41929d)).toString());
            if (z11) {
                s1Var.a();
            }
        }
        if (hVar == null) {
            return Unit.f26487a;
        }
        Unit unitA = ((c5.i) this.f43788h).a(c2.b.a(hVar));
        return unitA == y70.a.COROUTINE_SUSPENDED ? unitA : Unit.f26487a;
    }

    public final Unit f(z70.i iVar) {
        m5.h hVar;
        s1 s1Var = this.f43781a;
        if (t0.d(s1Var.d().f41929d) || !m()) {
            hVar = null;
        } else {
            v2.b bVarD = s1Var.d();
            hVar = new m5.h(bVarD.f41928c.subSequence(t0.g(bVarD.f41929d), t0.f(bVarD.f41929d)).toString());
            s1Var.c();
        }
        if (hVar == null) {
            return Unit.f26487a;
        }
        Unit unitA = ((c5.i) this.f43788h).a(c2.b.a(hVar));
        return unitA == y70.a.COROUTINE_SUSPENDED ? unitA : Unit.f26487a;
    }

    public final Object i(w4.y yVar, z70.i iVar) {
        Object objL0 = ((m0) yVar).L0(new x1(this, null, 4), iVar);
        return objL0 == y70.a.COROUTINE_SUSPENDED ? objL0 : Unit.f26487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x2.d j(boolean r9) {
        /*
            r8 = this;
            w2.s1 r0 = r8.f43781a
            v2.b r0 = r0.d()
            m3.k1 r1 = r8.f43797r
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            m3.k1 r2 = r8.f43796q
            java.lang.Object r2 = r2.getValue()
            x2.k r2 = (x2.k) r2
            x2.k r3 = x2.k.None
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L22
            r2 = r4
            goto L23
        L22:
            r2 = r5
        L23:
            m2.t0 r3 = r8.l()
            if (r1 == 0) goto L79
            if (r2 == 0) goto L79
            long r1 = r0.f41929d
            boolean r1 = m5.t0.d(r1)
            if (r1 == 0) goto L79
            kotlin.Pair r1 = r0.f41931f
            if (r1 != 0) goto L79
            java.lang.CharSequence r0 = r0.f41928c
            int r0 = r0.length()
            if (r0 <= 0) goto L79
            m2.t0 r0 = m2.t0.Cursor
            if (r3 == r0) goto L7a
            z3.g r1 = z3.v.c()
            if (r1 == 0) goto L4f
            kotlin.jvm.functions.Function1 r0 = r1.e()
        L4d:
            r2 = r0
            goto L51
        L4f:
            r0 = 0
            goto L4d
        L51:
            z3.g r3 = z3.v.d(r1)
            h4.c r0 = r8.k()     // Catch: java.lang.Throwable -> L73
            long r6 = r0.c()     // Catch: java.lang.Throwable -> L73
            z3.v.f(r1, r3, r2)
            z4.z r0 = r8.q()
            if (r0 == 0) goto L6f
            h4.c r0 = a3.l2.c(r0)
            boolean r0 = a3.l2.a(r6, r0)
            goto L70
        L6f:
            r0 = r5
        L70:
            if (r0 == 0) goto L79
            goto L7a
        L73:
            r0 = move-exception
            r9 = r0
            z3.v.f(r1, r3, r2)
            throw r9
        L79:
            r4 = r5
        L7a:
            if (r4 != 0) goto L7f
            x2.d r9 = x2.d.f43726f
            return r9
        L7f:
            x2.d r0 = new x2.d
            if (r9 == 0) goto L8d
            h4.c r9 = r8.k()
            long r1 = r9.c()
        L8b:
            r2 = r1
            goto L93
        L8d:
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L8b
        L93:
            x5.j r5 = x5.j.Ltr
            r6 = 0
            r1 = 1
            r4 = 0
            r0.<init>(r1, r2, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.w.j(boolean):x2.d");
    }

    public final h4.c k() {
        q0 q0VarG = this.f43782b.f43008b.g();
        return q0VarG == null ? h4.c.f21379e : c(q0VarG, this.f43781a.d());
    }

    public final m2.t0 l() {
        return (m2.t0) this.f43795p.getValue();
    }

    public final boolean m() {
        return this.f43789i;
    }

    public final long n() {
        k1 k1Var = this.f43794o;
        if ((((h4.b) k1Var.getValue()).f21378a & 9223372034707292159L) == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        k1 k1Var2 = this.f43793n;
        if ((((h4.b) k1Var2.getValue()).f21378a & 9223372034707292159L) == 9205357640488583168L) {
            return c0.k(this.f43782b, ((h4.b) k1Var.getValue()).f21378a);
        }
        long j9 = ((h4.b) k1Var.getValue()).f21378a;
        long j11 = ((h4.b) k1Var2.getValue()).f21378a;
        z4.z zVarQ = q();
        return h4.b.f(j9, h4.b.e(j11, zVarQ != null ? zVarQ.e(0L) : 9205357640488583168L));
    }

    public final long o(boolean z11) {
        long j9;
        q0 q0VarG = this.f43782b.f43008b.g();
        if (q0VarG == null) {
            return 0L;
        }
        long j11 = this.f43781a.d().f41929d;
        if (z11) {
            int i11 = t0.f29649c;
            j9 = j11 >> 32;
        } else {
            int i12 = t0.f29649c;
            j9 = 4294967295L & j11;
        }
        return na0.a.p0(q0VarG, (int) j9, z11, t0.h(j11));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x2.d p(boolean r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            if (r18 == 0) goto L7
            m2.t0 r1 = m2.t0.SelectionStart
            goto L9
        L7:
            m2.t0 r1 = m2.t0.SelectionEnd
        L9:
            w2.o1 r2 = r0.f43782b
            w2.k1 r2 = r2.f43008b
            m5.q0 r2 = r2.g()
            if (r2 != 0) goto L16
            x2.d r1 = x2.d.f43726f
            return r1
        L16:
            w2.s1 r3 = r0.f43781a
            v2.b r4 = r3.d()
            long r4 = r4.f41929d
            boolean r6 = m5.t0.d(r4)
            if (r6 == 0) goto L27
            x2.d r1 = x2.d.f43726f
            return r1
        L27:
            long r6 = r17.o(r18)
            m3.k1 r8 = r0.f43796q
            java.lang.Object r8 = r8.getValue()
            x2.k r8 = (x2.k) r8
            x2.k r9 = x2.k.None
            r10 = 1
            r11 = 0
            if (r8 != r9) goto L53
            m2.t0 r8 = r0.l()
            if (r8 == r1) goto L51
            z4.z r1 = r0.q()
            if (r1 == 0) goto L4e
            h4.c r1 = a3.l2.c(r1)
            boolean r1 = a3.l2.a(r6, r1)
            goto L4f
        L4e:
            r1 = r11
        L4f:
            if (r1 == 0) goto L53
        L51:
            r1 = r10
            goto L54
        L53:
            r1 = r11
        L54:
            if (r1 != 0) goto L59
            x2.d r1 = x2.d.f43726f
            return r1
        L59:
            v2.b r1 = r3.d()
            kotlin.Pair r1 = r1.f41931f
            if (r1 != 0) goto L63
            r1 = r10
            goto L64
        L63:
            r1 = r11
        L64:
            if (r1 != 0) goto L69
            x2.d r1 = x2.d.f43726f
            return r1
        L69:
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r1 = 32
            if (r18 == 0) goto L76
            long r10 = r4 >> r1
            int r3 = (int) r10
            goto L7e
        L76:
            long r12 = r4 & r8
            int r3 = (int) r12
            int r3 = r3 - r10
            int r3 = java.lang.Math.max(r3, r11)
        L7e:
            x5.j r15 = r2.a(r3)
            boolean r16 = m5.t0.h(r4)
            if (r19 == 0) goto L98
            z4.z r3 = r0.q()
            if (r3 == 0) goto L96
            h4.c r3 = a3.l2.c(r3)
            long r6 = w2.c0.i(r6, r3)
        L96:
            r12 = r6
            goto L9e
        L98:
            r6 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L96
        L9e:
            if (r18 == 0) goto La4
            long r3 = r4 >> r1
        La2:
            int r1 = (int) r3
            goto La7
        La4:
            long r3 = r4 & r8
            goto La2
        La7:
            x2.d r10 = new x2.d
            r11 = 1
            float r14 = m2.g0.z(r2, r1)
            r10.<init>(r11, r12, r14, r15, r16)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.w.p(boolean, boolean):x2.d");
    }

    public final z4.z q() {
        z4.z zVarD = this.f43782b.d();
        if (zVarD == null || !zVarD.n()) {
            return null;
        }
        return zVarD;
    }

    public final void r() {
        a3.u uVar = this.f43787g;
        if (uVar != null) {
            s1 s1Var = this.f43781a;
            CharSequence charSequence = s1Var.d().f41928c;
            long j9 = s1Var.d().f41929d;
            if (charSequence.length() > 0 && !t0.d(j9)) {
                f0.B(this.f43786f, null, d0.UNDISPATCHED, new a3.w(uVar, charSequence, j9, this, (x70.c) null), 1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (t(r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if (t(r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(z70.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof x2.s
            if (r0 == 0) goto L13
            r0 = r6
            x2.s r0 = (x2.s) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            x2.s r0 = new x2.s
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f43771j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L52
            if (r2 == r3) goto L4e
            r3 = 2
            r4 = 3
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2d
            ba0.g.M(r6)
            goto L44
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
        L32:
            r6 = 0
            return r6
        L34:
            ba0.g.M(r6)
            c5.r1 r6 = (c5.r1) r6
            if (r6 != 0) goto L47
            r0.l = r4
            java.lang.Object r6 = r5.t(r0)
            if (r6 != r1) goto L44
            goto L6c
        L44:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        L47:
            android.content.ClipData r6 = r6.f7359a
            r6.getDescription()
            r6 = 0
            throw r6
        L4e:
            ba0.g.M(r6)
            goto L6d
        L52:
            ba0.g.M(r6)
            kotlin.jvm.functions.Function0 r6 = r5.f43792m
            if (r6 == 0) goto L64
            java.lang.Object r6 = r6.invoke()
            if (r6 != 0) goto L60
            goto L64
        L60:
            org.bouncycastle.jce.provider.a.c()
            goto L32
        L64:
            r0.l = r3
            java.lang.Object r6 = r5.t(r0)
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.w.s(z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(z70.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof x2.t
            if (r0 == 0) goto L13
            r0 = r8
            x2.t r0 = (x2.t) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            x2.t r0 = new x2.t
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f43773j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L37
            if (r2 == r6) goto L33
            if (r2 != r5) goto L2c
            ba0.g.M(r8)
            goto L72
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L33:
            ba0.g.M(r8)
            goto L55
        L37:
            ba0.g.M(r8)
            c5.t1 r8 = r7.f43788h
            r0.l = r6
            c5.i r8 = (c5.i) r8
            c5.j r8 = r8.f7248a
            android.content.ClipboardManager r8 = r8.f7260a
            android.content.ClipData r8 = r8.getPrimaryClip()
            if (r8 == 0) goto L51
            c5.r1 r2 = new c5.r1
            r2.<init>(r8)
            r8 = r2
            goto L52
        L51:
            r8 = r4
        L52:
            if (r8 != r1) goto L55
            goto L71
        L55:
            c5.r1 r8 = (c5.r1) r8
            if (r8 == 0) goto L83
            r0.l = r5
            android.content.ClipData r8 = r8.f7359a
            android.content.ClipData$Item r8 = r8.getItemAt(r3)
            if (r8 == 0) goto L6e
            java.lang.CharSequence r8 = r8.getText()
            if (r8 == 0) goto L6e
            java.lang.String r8 = r8.toString()
            goto L6f
        L6e:
            r8 = r4
        L6f:
            if (r8 != r1) goto L72
        L71:
            return r1
        L72:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L77
            goto L83
        L77:
            y2.c r0 = y2.c.NeverMerge
            r1 = 10
            w2.s1 r2 = r7.f43781a
            w2.s1.h(r2, r8, r0, r3, r1)
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        L83:
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.w.t(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(long r19) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.w.u(long):boolean");
    }

    public final void v(boolean z11) {
        this.f43797r.setValue(Boolean.valueOf(z11));
    }

    public final void w(b0 b0Var) {
        this.f43798s.setValue(b0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
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
    public final java.lang.Object x(z70.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof x2.v
            if (r0 == 0) goto L13
            r0 = r9
            x2.v r0 = (x2.v) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            x2.v r0 = new x2.v
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f43779j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            s2.l r3 = r8.f43785e
            m3.k1 r4 = r8.f43798s
            r5 = 0
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L36
            if (r2 != r7) goto L2f
            ba0.g.M(r9)     // Catch: java.lang.Throwable -> L2d
            goto L49
        L2d:
            r9 = move-exception
            goto L69
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L36:
            ba0.g.M(r9)
            rf.c r9 = new rf.c     // Catch: java.lang.Throwable -> L2d
            r2 = 20
            r9.<init>(r8, r5, r2)     // Catch: java.lang.Throwable -> L2d
            r0.l = r7     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r9 = v80.f0.n(r9, r0)     // Catch: java.lang.Throwable -> L2d
            if (r9 != r1) goto L49
            return r1
        L49:
            v80.i1 r9 = (v80.i1) r9     // Catch: java.lang.Throwable -> L2d
            r8.v(r6)
            java.lang.Object r9 = r4.getValue()
            x2.b0 r9 = (x2.b0) r9
            x2.b0 r0 = x2.b0.None
            if (r9 == r0) goto L66
            s2.j r9 = r3.f38778a
            if (r9 == 0) goto L66
            v80.b2 r0 = r9.f38775u
            if (r0 != 0) goto L61
            goto L66
        L61:
            r0.a(r5)
            r9.f38775u = r5
        L66:
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        L69:
            r8.v(r6)
            java.lang.Object r0 = r4.getValue()
            x2.b0 r0 = (x2.b0) r0
            x2.b0 r1 = x2.b0.None
            if (r0 == r1) goto L84
            s2.j r0 = r3.f38778a
            if (r0 == 0) goto L84
            v80.b2 r1 = r0.f38775u
            if (r1 != 0) goto L7f
            goto L84
        L7f:
            r1.a(r5)
            r0.f38775u = r5
        L84:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.w.x(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit y() {
        /*
            r3 = this;
            c40.i r0 = r3.f43804y
            java.lang.Object r1 = r0.f7070b
            c5.t1 r1 = (c5.t1) r1
            c5.i r1 = (c5.i) r1
            c5.j r2 = r1.f7248a
            android.content.ClipboardManager r2 = r2.f7260a
            boolean r2 = r2.hasPrimaryClip()
            if (r2 == 0) goto L26
            c5.j r1 = r1.f7248a
            android.content.ClipboardManager r1 = r1.f7260a
            android.content.ClipDescription r1 = r1.getPrimaryClipDescription()
            if (r1 == 0) goto L26
            java.lang.String r2 = "text/*"
            boolean r1 = r1.hasMimeType(r2)
            r2 = 1
            if (r1 != r2) goto L26
            goto L27
        L26:
            r2 = 0
        L27:
            r0.f7069a = r2
            kotlin.Unit r0 = kotlin.Unit.f26487a
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.w.y():kotlin.Unit");
    }

    public final void z(m2.t0 t0Var, long j9) {
        this.f43795p.setValue(t0Var);
        this.f43794o.setValue(new h4.b(j9));
    }
}
