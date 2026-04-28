package i4;

import b5.l2;
import b5.s1;
import kotlin.jvm.functions.Function1;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends b4.s implements b5.c0, l2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function1 f23277o;

    public q(Function1 function1) {
        this.f23277o = function1;
    }

    @Override // b5.l2
    public final boolean c() {
        return false;
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b5.l2
    public final void h0(j5.b0 b0Var) {
        boolean z11;
        v0 v0Var;
        s1 s1VarE = b5.m.e(this, 2);
        if (s1VarE.G) {
            v0 v0Var2 = s1VarE.E;
            z11 = s1VarE.F;
            v0Var = v0Var2;
        } else {
            s0 s0Var = g0.f23253a;
            if (s0Var == null) {
                g0.f23253a = new s0();
            } else {
                s0Var.b();
            }
            s0 s0Var2 = g0.f23253a;
            s0Var2.getClass();
            s0Var2.f23298r = s1VarE.f5966p.f5889z;
            s0Var2.f23297q = b0.z.z(s1VarE.f47185c);
            z3.g gVarC = z3.v.c();
            Function1 function1E = gVarC != null ? gVarC.e() : null;
            z3.g gVarD = z3.v.d(gVarC);
            try {
                this.f23277o.invoke(s0Var2);
                z3.v.f(gVarC, gVarD, function1E);
                v0Var = s0Var2.f23295o;
                z11 = s0Var2.f23296p;
            } catch (Throwable th2) {
                z3.v.f(gVarC, gVarD, function1E);
                throw th2;
            }
        }
        if (z11) {
            j5.z.n(b0Var, v0Var);
        }
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        m1 m1VarD = t0Var.D(j9);
        return z4.w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new b4.x(12, m1VarD, this));
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f23277o + ')';
    }
}
