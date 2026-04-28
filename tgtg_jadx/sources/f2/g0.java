package f2;

import m3.h1;
import z4.m1;
import z4.t0;
import z4.v0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends b4.s implements b5.c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f17121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h1 f17122p;

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final v0 mo58measure3p2s80s(w0 w0Var, t0 t0Var, long j9) {
        h1 h1Var = this.f17122p;
        int iRound = (h1Var == null || ((Number) h1Var.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) h1Var.getValue()).floatValue() * this.f17121o);
        int iK = iRound != Integer.MAX_VALUE ? iRound : z5.a.k(j9);
        int iJ = z5.a.j(j9);
        if (iRound == Integer.MAX_VALUE) {
            iRound = z5.a.i(j9);
        }
        m1 m1VarD = t0Var.D(z5.b.a(iK, iRound, iJ, z5.a.h(j9)));
        return w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new d2.k(m1VarD, 5));
    }
}
