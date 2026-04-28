package z4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b5.v0 f47231a;

    public s0(b5.v0 v0Var) {
        this.f47231a = v0Var;
    }

    @Override // z4.z
    public final long F(long j9) {
        return h4.b.f(this.f47231a.f6007p.F(j9), a());
    }

    @Override // z4.z
    public final void J(z zVar, float[] fArr) {
        this.f47231a.f6007p.J(zVar, fArr);
    }

    @Override // z4.z
    public final z K() {
        b5.v0 v0VarB1;
        if (!n()) {
            y4.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        b5.s1 s1Var = this.f47231a.f6007p.f5966p.G.f5858d.f5968r;
        if (s1Var == null || (v0VarB1 = s1Var.b1()) == null) {
            return null;
        }
        return v0VarB1.f6010s;
    }

    @Override // z4.z
    public final long P(long j9) {
        return h4.b.f(this.f47231a.f6007p.P(j9), a());
    }

    @Override // z4.z
    public final long S(long j9) {
        return this.f47231a.f6007p.S(h4.b.f(j9, a()));
    }

    public final long a() {
        b5.v0 v0Var = this.f47231a;
        b5.v0 v0VarK = c0.k(v0Var);
        return h4.b.e(q(v0VarK.f6010s, 0L), v0Var.f6007p.q(v0VarK.f6007p, 0L));
    }

    @Override // z4.z
    public final long e(long j9) {
        return this.f47231a.f6007p.e(h4.b.f(j9, a()));
    }

    @Override // z4.z
    public final long g(z zVar, long j9) {
        return q(zVar, j9);
    }

    @Override // z4.z
    public final boolean n() {
        return this.f47231a.f6007p.n();
    }

    @Override // z4.z
    public final void o(float[] fArr) {
        this.f47231a.f6007p.o(fArr);
    }

    @Override // z4.z
    public final long q(z zVar, long j9) {
        boolean z11 = zVar instanceof s0;
        b5.v0 v0Var = this.f47231a;
        if (!z11) {
            b5.v0 v0VarK = c0.k(v0Var);
            s0 s0Var = v0VarK.f6010s;
            b5.s1 s1Var = v0VarK.f6007p;
            long jQ = q(s0Var, j9);
            long j11 = v0VarK.f6008q;
            long jE = h4.b.e(jQ, (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j11 >> 32)) << 32));
            if (!s1Var.n()) {
                y4.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            s1Var.m1();
            b5.s1 s1Var2 = s1Var.f5968r;
            if (s1Var2 != null) {
                s1Var = s1Var2;
            }
            return h4.b.f(jE, s1Var.q(zVar, 0L));
        }
        b5.v0 v0Var2 = ((s0) zVar).f47231a;
        b5.s1 s1Var3 = v0Var2.f6007p;
        s1Var3.m1();
        b5.v0 v0VarB1 = v0Var.f6007p.Z0(s1Var3).b1();
        if (v0VarB1 != null) {
            long jC = z5.j.c(z5.j.d(v0Var2.V0(v0VarB1, false), a.a.J(j9)), v0Var.V0(v0VarB1, false));
            return (((long) Float.floatToRawIntBits((int) (jC >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jC & 4294967295L))) & 4294967295L);
        }
        b5.v0 v0VarK2 = c0.k(v0Var2);
        long jD = z5.j.d(z5.j.d(v0Var2.V0(v0VarK2, false), v0VarK2.f6008q), a.a.J(j9));
        b5.v0 v0VarK3 = c0.k(v0Var);
        long jC2 = z5.j.c(jD, z5.j.d(v0Var.V0(v0VarK3, false), v0VarK3.f6008q));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jC2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jC2 & 4294967295L))) & 4294967295L;
        b5.s1 s1Var4 = v0VarK3.f6007p.f5968r;
        s1Var4.getClass();
        b5.s1 s1Var5 = v0VarK2.f6007p.f5968r;
        s1Var5.getClass();
        return s1Var4.q(s1Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // z4.z
    public final long u() {
        b5.v0 v0Var = this.f47231a;
        return (((long) v0Var.f47183a) << 32) | (((long) v0Var.f47184b) & 4294967295L);
    }

    @Override // z4.z
    public final h4.c v(z zVar, boolean z11) {
        return this.f47231a.f6007p.v(zVar, z11);
    }

    @Override // z4.z
    public final long z(long j9) {
        return this.f47231a.f6007p.z(h4.b.f(0L, a()));
    }
}
