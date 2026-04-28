package gd;

import a3.x1;
import android.os.Trace;
import g9.r0;
import i4.w;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3.e2;
import m3.k1;
import v80.b0;
import v80.b2;
import v80.d0;
import v80.f0;
import v80.i1;
import v80.p0;
import v80.x;
import y80.a2;
import y80.h1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends n4.b implements e2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final r0 f20372v = new r0(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f20375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20376i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i1 f20377j;
    public b0 l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Function1 f20380n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public k f20383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f20384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a2 f20385s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a2 f20386t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final h1 f20387u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f20373f = m3.i.w(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f20374g = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f20378k = 9205357640488583168L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function1 f20379m = f20372v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public z4.m f20381o = z4.l.f47167b;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20382p = 1;

    public i(c cVar) {
        this.f20384r = cVar;
        this.f20385s = r.c(cVar);
        a2 a2VarC = r.c(d.f20366a);
        this.f20386t = a2VarC;
        this.f20387u = new h1(a2VarC);
    }

    public static final td.i j(i iVar, td.i iVar2, boolean z11) {
        td.e eVarA = td.i.a(iVar2);
        eVarA.f39960d = new dn.k(13, iVar2, iVar);
        td.g gVar = iVar2.f40014t;
        if (gVar.f39993g == null) {
            eVarA.f39969n = ud.i.f41062a1;
        }
        if (gVar.f39994h == null) {
            z4.m mVar = iVar.f20381o;
            int i11 = hd.h.f21865b;
            eVarA.f39970o = (Intrinsics.areEqual(mVar, z4.l.f47167b) || Intrinsics.areEqual(mVar, z4.l.f47170e)) ? ud.g.FIT : ud.g.FILL;
        }
        if (gVar.f39995i == null) {
            eVarA.f39971p = ud.d.INEXACT;
        }
        if (z11) {
            kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f26549a;
            eVarA.f39964h = gVar2;
            eVarA.f39965i = gVar2;
            eVarA.f39966j = gVar2;
        }
        return eVarA.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(gd.i r3, gd.h r4) {
        /*
            y80.a2 r0 = r3.f20386t
            java.lang.Object r1 = r0.getValue()
            gd.h r1 = (gd.h) r1
            kotlin.jvm.functions.Function1 r2 = r3.f20379m
            java.lang.Object r4 = r2.invoke(r4)
            gd.h r4 = (gd.h) r4
            r0.j(r4)
            boolean r0 = r4 instanceof gd.g
            if (r0 == 0) goto L1d
            r0 = r4
            gd.g r0 = (gd.g) r0
            td.q r0 = r0.f20371b
            goto L26
        L1d:
            boolean r0 = r4 instanceof gd.e
            if (r0 == 0) goto L35
            r0 = r4
            gd.e r0 = (gd.e) r0
            td.d r0 = r0.f20368b
        L26:
            td.i r0 = r0.e()
            fd.j r2 = td.k.f40020a
            java.lang.Object r0 = fd.o.e(r0, r2)
            zd.a r0 = (zd.a) r0
            r0.getClass()
        L35:
            n4.b r0 = r4.a()
            m3.k1 r2 = r3.f20373f
            r2.setValue(r0)
            n4.b r0 = r1.a()
            n4.b r2 = r4.a()
            if (r0 == r2) goto L6a
            n4.b r0 = r1.a()
            boolean r1 = r0 instanceof m3.e2
            r2 = 0
            if (r1 == 0) goto L54
            m3.e2 r0 = (m3.e2) r0
            goto L55
        L54:
            r0 = r2
        L55:
            if (r0 == 0) goto L5a
            r0.c()
        L5a:
            n4.b r0 = r4.a()
            boolean r1 = r0 instanceof m3.e2
            if (r1 == 0) goto L65
            r2 = r0
            m3.e2 r2 = (m3.e2) r2
        L65:
            if (r2 == 0) goto L6a
            r2.d()
        L6a:
            kotlin.jvm.functions.Function1 r3 = r3.f20380n
            if (r3 == 0) goto L71
            r3.invoke(r4)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.i.k(gd.i, gd.h):void");
    }

    @Override // n4.b
    public final boolean a(float f11) {
        this.f20374g = f11;
        return true;
    }

    @Override // m3.e2
    public final void b() {
        i1 i1Var = this.f20377j;
        if (i1Var != null) {
            i1Var.a(null);
        }
        this.f20377j = null;
        Object objL = l();
        e2 e2Var = objL instanceof e2 ? (e2) objL : null;
        if (e2Var != null) {
            e2Var.b();
        }
        this.f20376i = false;
    }

    @Override // m3.e2
    public final void c() {
        i1 i1Var = this.f20377j;
        if (i1Var != null) {
            i1Var.a(null);
        }
        this.f20377j = null;
        Object objL = l();
        e2 e2Var = objL instanceof e2 ? (e2) objL : null;
        if (e2Var != null) {
            e2Var.c();
        }
        this.f20376i = false;
    }

    @Override // m3.e2
    public final void d() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object objL = l();
            e2 e2Var = objL instanceof e2 ? (e2) objL : null;
            if (e2Var != null) {
                e2Var.d();
            }
            m();
            this.f20376i = true;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // n4.b
    public final boolean e(w wVar) {
        this.f20375h = wVar;
        return true;
    }

    @Override // n4.b
    public final long h() {
        n4.b bVarL = l();
        if (bVarL != null) {
            return bVarL.h();
        }
        return 9205357640488583168L;
    }

    @Override // n4.b
    public final void i(k4.d dVar) {
        long jD = dVar.d();
        if (!h4.e.a(this.f20378k, jD)) {
            this.f20378k = jD;
        }
        n4.b bVarL = l();
        if (bVarL != null) {
            bVarL.g(dVar, dVar.d(), this.f20374g, this.f20375h);
        }
    }

    public final n4.b l() {
        return (n4.b) this.f20373f.getValue();
    }

    public final void m() {
        c cVar = this.f20384r;
        if (cVar == null) {
            return;
        }
        b0 b0Var = this.l;
        x70.c cVar2 = null;
        if (b0Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scope");
            b0Var = null;
        }
        x1 x1Var = new x1(this, cVar, cVar2, 25);
        CoroutineContext coroutineContext = b0Var.getCoroutineContext();
        int i11 = hd.h.f21865b;
        x xVar = (x) coroutineContext.get(x.f42171a);
        b2 b2VarA = (xVar == null || Intrinsics.areEqual(xVar, p0.f42145b)) ? f0.A(b0Var, p0.f42145b, d0.UNDISPATCHED, x1Var) : f0.A(f0.b(new hd.d(b0Var.getCoroutineContext())), new hd.e(xVar), d0.UNDISPATCHED, x1Var);
        i1 i1Var = this.f20377j;
        if (i1Var != null) {
            i1Var.a(null);
        }
        this.f20377j = b2VarA;
    }

    public final void n(c cVar) {
        if (Intrinsics.areEqual(this.f20384r, cVar)) {
            return;
        }
        this.f20384r = cVar;
        if (cVar == null) {
            i1 i1Var = this.f20377j;
            if (i1Var != null) {
                i1Var.a(null);
            }
            this.f20377j = null;
        } else if (this.f20376i) {
            m();
        }
        if (cVar != null) {
            a2 a2Var = this.f20385s;
            a2Var.getClass();
            a2Var.k(null, cVar);
        }
    }
}
