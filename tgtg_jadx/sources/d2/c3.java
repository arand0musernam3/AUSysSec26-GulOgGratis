package d2;

import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 extends b4.s implements b5.c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e0 f13769o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Function2 f13770p;

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        z4.m1 m1VarD = t0Var.D(z5.b.a(this.f13769o != e0.Vertical ? 0 : z5.a.k(j9), z5.a.i(j9), this.f13769o == e0.Horizontal ? z5.a.j(j9) : 0, z5.a.h(j9)));
        int iC = n80.p.c(m1VarD.f47183a, z5.a.k(j9), z5.a.i(j9));
        int iC2 = n80.p.c(m1VarD.f47184b, z5.a.j(j9), z5.a.h(j9));
        return z4.w0.f(w0Var, iC, iC2, new b3(this, iC, m1VarD, iC2, w0Var));
    }
}
