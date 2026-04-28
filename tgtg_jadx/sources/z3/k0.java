package z3;

import kotlin.jvm.functions.Function1;
import q1.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f47030o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f47031p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f47032q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Function1 f47033r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Function1 f47034s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f47035t;

    /* JADX WARN: Illegal instructions before constructor call */
    public k0(c cVar, Function1 function1, Function1 function12, boolean z11, boolean z12) {
        Function1 function1I;
        Function1 function1E;
        yj.m mVar = l.f47036a;
        super(0L, k.f47025e, l.k(function1, (cVar == null || (function1E = cVar.e()) == null) ? l.f47045j.f46978e : function1E, z11), l.l(function12, (cVar == null || (function1I = cVar.i()) == null) ? l.f47045j.f46979f : function1I));
        this.f47030o = cVar;
        this.f47031p = z11;
        this.f47032q = z12;
        this.f47033r = this.f46978e;
        this.f47034s = this.f46979f;
        this.f47035t = u3.e.c();
    }

    @Override // z3.c
    public final void B(u0 u0Var) {
        v.g();
        throw null;
    }

    @Override // z3.c
    public final c C(Function1 function1, Function1 function12) {
        Function1 function1K = l.k(function1, this.f47033r, true);
        Function1 function1L = l.l(function12, this.f47034s);
        return !this.f47031p ? new k0(D().C(null, function1L), function1K, function1L, false, true) : D().C(function1K, function1L);
    }

    public final c D() {
        c cVar = this.f47030o;
        return cVar == null ? l.f47045j : cVar;
    }

    @Override // z3.c, z3.g
    public final void c() {
        c cVar;
        this.f47003c = true;
        if (!this.f47032q || (cVar = this.f47030o) == null) {
            return;
        }
        cVar.c();
    }

    @Override // z3.g
    public final k d() {
        return D().d();
    }

    @Override // z3.c, z3.g
    public final Function1 e() {
        return this.f47033r;
    }

    @Override // z3.c, z3.g
    public final boolean f() {
        return D().f();
    }

    @Override // z3.g
    public final long g() {
        return D().g();
    }

    @Override // z3.c, z3.g
    public final int h() {
        return D().h();
    }

    @Override // z3.c, z3.g
    public final Function1 i() {
        return this.f47034s;
    }

    @Override // z3.c, z3.g
    public final void k() {
        v.g();
        throw null;
    }

    @Override // z3.c, z3.g
    public final void l() {
        v.g();
        throw null;
    }

    @Override // z3.c, z3.g
    public final void m() {
        D().m();
    }

    @Override // z3.c, z3.g
    public final void n(d0 d0Var) {
        D().n(d0Var);
    }

    @Override // z3.g
    public final void r(k kVar) {
        v.g();
        throw null;
    }

    @Override // z3.g
    public final void s(long j9) {
        v.g();
        throw null;
    }

    @Override // z3.c, z3.g
    public final void t(int i11) {
        D().t(i11);
    }

    @Override // z3.c, z3.g
    public final g u(Function1 function1) {
        Function1 function1K = l.k(function1, this.f47033r, true);
        return !this.f47031p ? l.g(D().u(null), function1K, true) : D().u(function1K);
    }

    @Override // z3.c
    public final v w() {
        return D().w();
    }

    @Override // z3.c
    public final u0 x() {
        return D().x();
    }

    @Override // z3.c
    /* JADX INFO: renamed from: y */
    public final Function1 e() {
        return this.f47033r;
    }
}
