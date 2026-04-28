package g1;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import m0.m1;
import s0.f0;
import s0.g0;
import s0.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f18092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f18093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f18094c;

    public f(i0 i0Var, h hVar, e.b bVar) {
        this.f18094c = hVar;
        this.f18092a = new j(i0Var.f(), bVar);
        this.f18093b = new k(i0Var.q());
    }

    @Override // s0.i0
    public final ListenableFuture a() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // m0.l1
    public final void c(m1 m1Var) {
        a.a.t();
        this.f18094c.c(m1Var);
    }

    @Override // m0.l1
    public final void e(m1 m1Var) {
        a.a.t();
        this.f18094c.e(m1Var);
    }

    @Override // s0.i0
    public final f0 f() {
        return this.f18092a;
    }

    @Override // m0.l1
    public final void g(m1 m1Var) {
        a.a.t();
        this.f18094c.g(m1Var);
    }

    @Override // s0.i0
    public final void l(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // s0.i0
    public final void m(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // s0.i0
    public final boolean o() {
        return false;
    }

    @Override // s0.i0
    public final g0 q() {
        return this.f18093b;
    }

    @Override // m0.l1
    public final void r(m1 m1Var) {
        a.a.t();
        this.f18094c.r(m1Var);
    }
}
