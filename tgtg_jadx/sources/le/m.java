package le;

import b0.z;
import b5.c0;
import z4.m1;
import z4.t0;
import z4.v0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends b4.s implements c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f27740o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f27741p;

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final v0 mo58measure3p2s80s(w0 w0Var, t0 t0Var, long j9) {
        long jA;
        t0Var.getClass();
        long jD = z5.b.d(j9, z.c(this.f27740o, this.f27741p));
        if (z5.a.h(j9) == Integer.MAX_VALUE && z5.a.i(j9) != Integer.MAX_VALUE) {
            int i11 = (int) (jD >> 32);
            int i12 = (this.f27741p * i11) / this.f27740o;
            jA = z5.b.a(i11, i11, i12, i12);
        } else if (z5.a.i(j9) != Integer.MAX_VALUE || z5.a.h(j9) == Integer.MAX_VALUE) {
            int i13 = (int) (jD >> 32);
            int i14 = (int) (jD & 4294967295L);
            jA = z5.b.a(i13, i13, i14, i14);
        } else {
            int i15 = (int) (jD & 4294967295L);
            int i16 = (this.f27740o * i15) / this.f27741p;
            jA = z5.b.a(i16, i16, i15, i15);
        }
        m1 m1VarD = t0Var.D(jA);
        return w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new c5.l(m1VarD, 3));
    }
}
