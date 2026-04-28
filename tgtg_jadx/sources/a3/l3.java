package a3;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 {
    public boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2.h2 f448a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m2.e1 f451d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function0 f453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c5.t1 f454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v80.b0 f455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u f456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r4.a f457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g4.v f458k;
    public final m3.k1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m3.k1 f459m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f460n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m5.t0 f461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f462p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m3.k1 f463q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m3.k1 f464r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f465s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r5.y f466t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x2 f467u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m5.t0 f468v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m3.k1 f469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s2.l f470x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j3 f471y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final i3 f472z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r5.s f449b = m2.i2.f28912a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function1 f450c = new defpackage.g(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m3.k1 f452e = m3.i.w(new r5.y(7, 0, (String) null));

    public l3(m2.h2 h2Var) {
        this.f448a = h2Var;
        Boolean bool = Boolean.TRUE;
        this.l = m3.i.w(bool);
        this.f459m = m3.i.w(bool);
        this.f460n = 0L;
        this.f462p = 0L;
        this.f463q = m3.i.w(null);
        this.f464r = m3.i.w(null);
        this.f465s = -1;
        this.f466t = new r5.y(7, 0L, (String) null);
        this.f469w = m3.i.w(Boolean.FALSE);
        this.f470x = new s2.l();
        this.f471y = new j3(this);
        i3 i3Var = new i3();
        i3Var.f396c = this;
        i3Var.f394a = true;
        this.f472z = i3Var;
    }

    public static final Pair a(l3 l3Var) {
        String str;
        m5.t0 t0Var;
        m5.h hVarM = l3Var.m();
        if (hVarM == null || (str = hVarM.f29538b) == null || (t0Var = l3Var.f468v) == null) {
            return null;
        }
        long j9 = t0Var.f29650a;
        return new Pair(str, new m5.t0(m5.k0.b(l3Var.f449b.r((int) (j9 >> 32)), l3Var.f449b.r((int) (j9 & 4294967295L)))));
    }

    public static final void b(l3 l3Var, m5.t0 t0Var) {
        m5.h hVarM;
        String str;
        v80.b0 b0Var;
        if (t0Var == null) {
            return;
        }
        long j9 = t0Var.f29650a;
        u uVar = l3Var.f456i;
        if (uVar == null || (hVarM = l3Var.m()) == null || (str = hVarM.f29538b) == null) {
            return;
        }
        r5.s sVar = l3Var.f449b;
        long jB = m5.k0.b(sVar.r((int) (j9 >> 32)), sVar.r((int) (j9 & 4294967295L)));
        if (str.length() <= 0 || m5.t0.d(jB) || (b0Var = l3Var.f455h) == null) {
            return;
        }
        v80.f0.B(b0Var, null, null, new h3(uVar, str, jB, t0Var, l3Var, sVar, (x70.c) null), 3);
    }

    public static final long c(l3 l3Var, r5.y yVar, long j9, boolean z11, boolean z12, j0 j0Var, boolean z13) {
        m2.a2 a2VarD;
        char c3;
        r4.a aVar;
        m2.e1 e1Var = l3Var.f451d;
        if (e1Var == null || (a2VarD = e1Var.d()) == null) {
            return m5.t0.f29648b;
        }
        r5.s sVar = l3Var.f449b;
        long j11 = yVar.f37715b;
        m5.h hVar = yVar.f37714a;
        int i11 = m5.t0.f29649c;
        long jB = m5.k0.b(sVar.r((int) (j11 >> 32)), l3Var.f449b.r((int) (j11 & 4294967295L)));
        boolean z14 = false;
        int iB = a2VarD.b(j9, false);
        int i12 = (z12 || z11) ? iB : (int) (jB >> 32);
        int i13 = (!z12 || z11) ? iB : (int) (jB & 4294967295L);
        x2 x2Var = l3Var.f467u;
        int i14 = -1;
        if (z11 || x2Var == null) {
            c3 = ' ';
        } else {
            c3 = ' ';
            int i15 = l3Var.f465s;
            if (i15 != -1) {
                i14 = i15;
            }
        }
        x2 x2VarA = s1.a(a2VarD.f28762a, i12, i13, i14, jB, z11, z12);
        if (x2VarA.i(x2Var)) {
            l3Var.f467u = x2VarA;
            l3Var.f465s = iB;
            i0 i0VarA = j0Var.a(x2VarA);
            long jB2 = m5.k0.b(l3Var.f449b.i(i0VarA.f385a.f367b), l3Var.f449b.i(i0VarA.f386b.f367b));
            if (!m5.t0.c(jB2, j11)) {
                boolean z15 = m5.t0.h(jB2) != m5.t0.h(j11) && m5.t0.c(m5.k0.b((int) (4294967295L & jB2), (int) (jB2 >> c3)), j11);
                boolean z16 = m5.t0.d(jB2) && m5.t0.d(j11);
                if (z13 && hVar.f29538b.length() > 0 && !z15 && !z16 && (aVar = l3Var.f457j) != null) {
                    aVar.a(9);
                }
                l3Var.f450c.invoke(e(hVar, jB2));
                l3Var.f468v = new m5.t0(jB2);
                if (!z13) {
                    l3Var.t(!m5.t0.d(jB2));
                }
                m2.e1 e1Var2 = l3Var.f451d;
                if (e1Var2 != null) {
                    e1Var2.f28833q.setValue(Boolean.valueOf(z13));
                }
                m2.e1 e1Var3 = l3Var.f451d;
                if (e1Var3 != null) {
                    e1Var3.f28829m.setValue(Boolean.valueOf(!m5.t0.d(jB2) && m0.c.e0(l3Var, true)));
                }
                m2.e1 e1Var4 = l3Var.f451d;
                if (e1Var4 != null) {
                    e1Var4.f28830n.setValue(Boolean.valueOf(!m5.t0.d(jB2) && m0.c.e0(l3Var, false)));
                }
                m2.e1 e1Var5 = l3Var.f451d;
                if (e1Var5 != null) {
                    if (m5.t0.d(jB2) && m0.c.e0(l3Var, true)) {
                        z14 = true;
                    }
                    e1Var5.f28831o.setValue(Boolean.valueOf(z14));
                }
                return jB2;
            }
        }
        return j11;
    }

    public static r5.y e(m5.h hVar, long j9) {
        return new r5.y(hVar, j9, (m5.t0) null);
    }

    public final v80.b2 d(boolean z11) {
        v80.b0 b0Var = this.f455h;
        x70.c cVar = null;
        if (b0Var != null) {
            return v80.f0.B(b0Var, null, v80.d0.UNDISPATCHED, new f3(this, z11, cVar, 0), 1);
        }
        return null;
    }

    public final void f() {
        v80.b0 b0Var = this.f455h;
        if (b0Var != null) {
            v80.f0.B(b0Var, null, v80.d0.UNDISPATCHED, new d3(this, null, 1), 1);
        }
    }

    public final void g(h4.b bVar) {
        if (!m5.t0.d(n().f37715b)) {
            m2.e1 e1Var = this.f451d;
            m2.a2 a2VarD = e1Var != null ? e1Var.d() : null;
            int iF = (bVar == null || a2VarD == null) ? m5.t0.f(n().f37715b) : this.f449b.i(a2VarD.b(bVar.f21378a, true));
            r5.y yVarB = r5.y.b(n(), null, m5.k0.b(iF, iF), 5);
            this.f450c.invoke(yVarB);
            this.f468v = new m5.t0(yVarB.f37715b);
        }
        q((bVar == null || n().f37714a.f29538b.length() <= 0) ? m2.u0.None : m2.u0.Cursor);
        t(false);
    }

    public final void h(boolean z11) {
        g4.v vVar;
        m2.e1 e1Var = this.f451d;
        if (e1Var != null && !e1Var.b() && (vVar = this.f458k) != null) {
            g4.v.a(vVar);
        }
        this.f466t = n();
        t(z11);
        q(m2.u0.Selection);
    }

    public final h4.b i() {
        return (h4.b) this.f464r.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.f459m.getValue()).booleanValue();
    }

    public final long l(boolean z11) {
        m2.a2 a2VarD;
        long j9;
        m2.e1 e1Var = this.f451d;
        if (e1Var == null || (a2VarD = e1Var.d()) == null) {
            return 9205357640488583168L;
        }
        m5.q0 q0Var = a2VarD.f28762a;
        m5.h hVarM = m();
        if (hVarM == null) {
            return 9205357640488583168L;
        }
        if (!Intrinsics.areEqual(hVarM.f29538b, q0Var.f29617a.f29603a.f29538b)) {
            return 9205357640488583168L;
        }
        r5.y yVarN = n();
        if (z11) {
            long j11 = yVarN.f37715b;
            int i11 = m5.t0.f29649c;
            j9 = j11 >> 32;
        } else {
            long j12 = yVarN.f37715b;
            int i12 = m5.t0.f29649c;
            j9 = j12 & 4294967295L;
        }
        return na0.a.p0(q0Var, this.f449b.r((int) j9), z11, m5.t0.h(n().f37715b));
    }

    public final m5.h m() {
        m2.e1 e1Var = this.f451d;
        if (e1Var != null) {
            return e1Var.f28818a.f28954a;
        }
        return null;
    }

    public final r5.y n() {
        return (r5.y) this.f452e.getValue();
    }

    public final void o() {
        v80.b2 b2Var;
        s2.j jVar = this.f470x.f38778a;
        if (jVar == null || (b2Var = jVar.f38775u) == null) {
            return;
        }
        b2Var.a(null);
        jVar.f38775u = null;
    }

    public final void p() {
        v80.b0 b0Var = this.f455h;
        if (b0Var != null) {
            v80.f0.B(b0Var, null, v80.d0.UNDISPATCHED, new d3(this, null, 2), 1);
        }
    }

    public final void q(m2.u0 u0Var) {
        m2.e1 e1Var = this.f451d;
        if (e1Var != null) {
            if (e1Var.a() == u0Var) {
                e1Var = null;
            }
            if (e1Var != null) {
                e1Var.f28828k.setValue(u0Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (((java.lang.Boolean) r3.f28833q.getValue()).booleanValue() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r4 = this;
            z3.g r0 = z3.v.c()
            if (r0 == 0) goto Lb
            kotlin.jvm.functions.Function1 r1 = r0.e()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            z3.g r2 = z3.v.d(r0)
            boolean r3 = r4.k()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L34
            m2.e1 r3 = r4.f451d     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L29
            m3.k1 r3 = r3.f28833q     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L32
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L29
            goto L34
        L29:
            z3.v.f(r0, r2, r1)
            s2.l r0 = r4.f470x
            r0.a()
            return
        L32:
            r3 = move-exception
            goto L38
        L34:
            z3.v.f(r0, r2, r1)
            return
        L38:
            z3.v.f(r0, r2, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.l3.r():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(z70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a3.k3
            if (r0 == 0) goto L13
            r0 = r5
            a3.k3 r0 = (a3.k3) r0
            int r1 = r0.f439m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f439m = r1
            goto L18
        L13:
            a3.k3 r0 = new a3.k3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f438k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f439m
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            a3.l3 r0 = r0.f437j
            ba0.g.M(r5)
            goto L5a
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L30:
            ba0.g.M(r5)
            c5.t1 r5 = r4.f454g
            if (r5 == 0) goto L64
            r0.f437j = r4
            r0.f439m = r3
            c5.i r5 = (c5.i) r5
            c5.j r5 = r5.f7248a
            android.content.ClipboardManager r5 = r5.f7260a
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            r0 = 0
            if (r5 == 0) goto L51
            java.lang.String r2 = "text/*"
            boolean r5 = r5.hasMimeType(r2)
            if (r5 != r3) goto L51
            goto L52
        L51:
            r3 = r0
        L52:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            if (r5 != r1) goto L59
            return r1
        L59:
            r0 = r4
        L5a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            m3.k1 r0 = r0.f469w
            r0.setValue(r5)
        L64:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.l3.s(z70.c):java.lang.Object");
    }

    public final void t(boolean z11) {
        m2.e1 e1Var = this.f451d;
        if (e1Var != null) {
            e1Var.l.setValue(Boolean.valueOf(z11));
        }
        if (z11) {
            r();
        } else {
            o();
        }
    }
}
