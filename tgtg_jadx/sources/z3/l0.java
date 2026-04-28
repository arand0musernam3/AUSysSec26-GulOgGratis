package z3;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f47047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f47048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f47049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Function1 f47050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f47051i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(g gVar, Function1 function1, boolean z11, boolean z12) {
        Function1 function1E;
        super(0L, k.f47025e);
        yj.m mVar = l.f47036a;
        this.f47047e = gVar;
        this.f47048f = z11;
        this.f47049g = z12;
        this.f47050h = l.k(function1, (gVar == null || (function1E = gVar.e()) == null) ? l.f47045j.f46978e : function1E, z11);
        this.f47051i = u3.e.c();
    }

    @Override // z3.g
    public final void c() {
        g gVar;
        this.f47003c = true;
        if (!this.f47049g || (gVar = this.f47047e) == null) {
            return;
        }
        gVar.c();
    }

    @Override // z3.g
    public final k d() {
        return v().d();
    }

    @Override // z3.g
    public final Function1 e() {
        return this.f47050h;
    }

    @Override // z3.g
    public final boolean f() {
        return v().f();
    }

    @Override // z3.g
    public final long g() {
        return v().g();
    }

    @Override // z3.g
    public final Function1 i() {
        return null;
    }

    @Override // z3.g
    public final void k() {
        v.g();
        throw null;
    }

    @Override // z3.g
    public final void l() {
        v.g();
        throw null;
    }

    @Override // z3.g
    public final void m() {
        v().m();
    }

    @Override // z3.g
    public final void n(d0 d0Var) {
        v().n(d0Var);
    }

    @Override // z3.g
    public final g u(Function1 function1) {
        Function1 function1K = l.k(function1, this.f47050h, true);
        return !this.f47048f ? l.g(v().u(null), function1K, true) : v().u(function1K);
    }

    public final g v() {
        g gVar = this.f47047e;
        return gVar == null ? l.f47045j : gVar;
    }
}
