package z3;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f46994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f46995f;

    public e(long j9, k kVar, Function1 function1, g gVar) {
        super(j9, kVar);
        this.f46994e = function1;
        this.f46995f = gVar;
        gVar.k();
    }

    @Override // z3.g
    public final void c() {
        g gVar = this.f46995f;
        if (this.f47003c) {
            return;
        }
        if (this.f47002b != gVar.g()) {
            a();
        }
        gVar.l();
        this.f47003c = true;
        synchronized (l.f47038c) {
            o();
        }
    }

    @Override // z3.g
    public final Function1 e() {
        return this.f46994e;
    }

    @Override // z3.g
    public final boolean f() {
        return true;
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
    public final void n(d0 d0Var) {
        yj.m mVar = l.f47036a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // z3.g
    public final g u(Function1 function1) {
        return new e(this.f47002b, this.f47001a, l.k(function1, this.f46994e, true), this.f46995f);
    }

    @Override // z3.g
    public final void m() {
    }
}
