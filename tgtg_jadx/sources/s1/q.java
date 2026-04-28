package s1;

import t1.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends d2.j1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m1 f38660p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m3.b1 f38661q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public s f38662r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f38663s;

    @Override // d2.j1, b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        long j11;
        z4.m1 m1VarD = t0Var.D(j9);
        if (w0Var.Z()) {
            j11 = (((long) m1VarD.f47183a) << 32) | (((long) m1VarD.f47184b) & 4294967295L);
        } else {
            m1 m1Var = this.f38660p;
            int i11 = m1VarD.f47183a;
            if (m1Var == null) {
                j11 = (((long) i11) << 32) | (((long) m1VarD.f47184b) & 4294967295L);
                this.f38663s = j11;
            } else {
                long j12 = (((long) m1VarD.f47184b) & 4294967295L) | (((long) i11) << 32);
                t1.l1 l1VarA = m1Var.a(new p(this, j12, 0), new p(this, j12, 1));
                this.f38662r.f38678f = l1VarA;
                j11 = ((z5.l) l1VarA.getValue()).f47286a;
                this.f38663s = ((z5.l) l1VarA.getValue()).f47286a;
            }
        }
        return z4.w0.f(w0Var, (int) (j11 >> 32), (int) (4294967295L & j11), new o(this, m1VarD, j11));
    }

    @Override // b4.s
    public final void onReset() {
        super.onReset();
        this.f38663s = i.f38613a;
    }
}
