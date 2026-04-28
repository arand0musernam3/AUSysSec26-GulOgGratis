package s0;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f38310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f38311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1.j f38312c;

    public d(i0 i0Var, c cVar) {
        this.f38310a = i0Var;
        this.f38311b = cVar;
        z zVar = cVar.f38305c;
        f0 f0VarF = i0Var.f();
        zVar.p();
        this.f38312c = new g1.j(f0VarF);
    }

    @Override // s0.i0
    public final ListenableFuture a() {
        return this.f38310a.a();
    }

    @Override // s0.i0, m0.k
    public final m0.q b() {
        return this.f38311b;
    }

    @Override // m0.l1
    public final void c(m0.m1 m1Var) {
        this.f38310a.c(m1Var);
    }

    @Override // s0.i0
    public final boolean d() {
        return this.f38310a.d();
    }

    @Override // m0.l1
    public final void e(m0.m1 m1Var) {
        this.f38310a.e(m1Var);
    }

    @Override // s0.i0
    public final f0 f() {
        return this.f38312c;
    }

    @Override // m0.l1
    public final void g(m0.m1 m1Var) {
        this.f38310a.g(m1Var);
    }

    @Override // s0.i0
    public final z h() {
        return this.f38310a.h();
    }

    @Override // s0.i0
    public final void i(z zVar) {
        this.f38310a.i(zVar);
    }

    @Override // s0.i0
    public final void j(boolean z11) {
        this.f38310a.j(z11);
    }

    @Override // s0.i0
    public final boolean k() {
        return this.f38310a.k();
    }

    @Override // s0.i0
    public final void l(Collection collection) {
        this.f38310a.l(collection);
    }

    @Override // s0.i0
    public final void m(ArrayList arrayList) {
        this.f38310a.m(arrayList);
    }

    @Override // s0.i0
    public final boolean o() {
        return this.f38310a.o();
    }

    @Override // s0.i0
    public final void p(boolean z11) {
        this.f38310a.p(z11);
    }

    @Override // s0.i0
    public final g0 q() {
        return this.f38311b;
    }

    @Override // m0.l1
    public final void r(m0.m1 m1Var) {
        this.f38310a.r(m1Var);
    }
}
