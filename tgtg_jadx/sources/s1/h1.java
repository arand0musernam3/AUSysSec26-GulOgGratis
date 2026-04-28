package s1;

import f0.q2;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends d2.j1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t1.i f38608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f38609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f38610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f38611s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m3.k1 f38612t;

    public h1(t1.i iVar) {
        super(1);
        this.f38608p = iVar;
        this.f38609q = b0.f38528a;
        this.f38610r = z5.b.b(0, 0, 15);
        this.f38612t = m3.i.w(null);
    }

    @Override // d2.j1, b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        m1 m1VarD;
        char c3;
        long j11;
        f1 f1Var;
        long jD;
        f1 f1Var2;
        if (w0Var.Z()) {
            this.f38610r = j9;
            this.f38611s = true;
            m1VarD = t0Var.D(j9);
        } else {
            m1VarD = t0Var.D(this.f38611s ? this.f38610r : j9);
        }
        m1 m1Var = m1VarD;
        long j12 = (((long) m1Var.f47184b) & 4294967295L) | (((long) m1Var.f47183a) << 32);
        if (w0Var.Z()) {
            this.f38609q = j12;
            c3 = ' ';
            jD = j12;
            j11 = jD;
        } else {
            long j13 = !z5.l.a(this.f38609q, b0.f38528a) ? this.f38609q : j12;
            m3.k1 k1Var = this.f38612t;
            f1 f1Var3 = (f1) k1Var.getValue();
            if (f1Var3 != null) {
                t1.b bVar = f1Var3.f38588a;
                c3 = ' ';
                j11 = j12;
                boolean z11 = (z5.l.a(j13, ((z5.l) bVar.d()).f47286a) || bVar.e()) ? false : true;
                if (!z5.l.a(j13, ((z5.l) bVar.f39361e.getValue()).f47286a) || z11) {
                    f1Var3.f38589b = ((z5.l) bVar.d()).f47286a;
                    f1Var2 = f1Var3;
                    v80.f0.B(getCoroutineScope(), null, null, new q2(f1Var2, j13, this, (x70.c) null), 3);
                } else {
                    f1Var2 = f1Var3;
                }
                f1Var = f1Var2;
            } else {
                c3 = ' ';
                j11 = j12;
                long j14 = 1;
                f1Var = new f1(new t1.b(new z5.l(j13), t1.c.f39395q, new z5.l((j14 << 32) | (j14 & 4294967295L)), 8), j13);
            }
            k1Var.setValue(f1Var);
            jD = z5.b.d(j9, ((z5.l) f1Var.f38588a.d()).f47286a);
        }
        int i11 = (int) (jD >> c3);
        int i12 = (int) (jD & 4294967295L);
        return z4.w0.f(w0Var, i11, i12, new g1(this, j11, i11, i12, w0Var, m1Var));
    }

    @Override // b4.s
    public final void onAttach() {
        this.f38609q = b0.f38528a;
        this.f38611s = false;
    }

    @Override // b4.s
    public final void onReset() {
        super.onReset();
        this.f38612t.setValue(null);
    }
}
