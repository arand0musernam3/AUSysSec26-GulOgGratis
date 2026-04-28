package z3;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f46997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46998f;

    public f(long j9, k kVar, Function1 function1) {
        super(j9, kVar);
        this.f46997e = function1;
        this.f46998f = 1;
    }

    @Override // z3.g
    public final void c() {
        if (this.f47003c) {
            return;
        }
        l();
        this.f47003c = true;
        synchronized (l.f47038c) {
            o();
        }
    }

    @Override // z3.g
    public final Function1 e() {
        return this.f46997e;
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
        this.f46998f++;
    }

    @Override // z3.g
    public final void l() {
        int i11 = this.f46998f - 1;
        this.f46998f = i11;
        if (i11 == 0) {
            a();
        }
    }

    @Override // z3.g
    public final void n(d0 d0Var) {
        yj.m mVar = l.f47036a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // z3.g
    public final g u(Function1 function1) {
        l.c(this);
        return new e(this.f47002b, this.f47001a, l.k(function1, this.f46997e, true), this);
    }

    @Override // z3.g
    public final void m() {
    }
}
