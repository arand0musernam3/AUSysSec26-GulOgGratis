package b4;

import b5.c0;
import z4.m1;
import z4.t0;
import z4.v0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends s implements c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f5731o;

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final v0 mo58measure3p2s80s(w0 w0Var, t0 t0Var, long j9) {
        m1 m1VarD = t0Var.D(j9);
        return w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new x(0, m1VarD, this));
    }

    public final String toString() {
        return r8.k.n(new StringBuilder("ZIndexModifier(zIndex="), this.f5731o, ')');
    }
}
