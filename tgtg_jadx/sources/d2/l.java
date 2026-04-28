package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends b4.s implements b5.c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f13825o;

    public final long L0(long j9, boolean z11) {
        int iRound;
        int iH = z5.a.h(j9);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH * this.f13825o)) <= 0) {
            return 0L;
        }
        if (!z11 || c.s(iRound, iH, j9)) {
            return (((long) iRound) << 32) | (((long) iH) & 4294967295L);
        }
        return 0L;
    }

    public final long M0(long j9, boolean z11) {
        int iRound;
        int i11 = z5.a.i(j9);
        if (i11 == Integer.MAX_VALUE || (iRound = Math.round(i11 / this.f13825o)) <= 0) {
            return 0L;
        }
        if (!z11 || c.s(i11, iRound, j9)) {
            return (((long) i11) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long N0(long j9, boolean z11) {
        int iJ = z5.a.j(j9);
        int iRound = Math.round(iJ * this.f13825o);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z11 || c.s(iRound, iJ, j9)) {
            return (((long) iRound) << 32) | (((long) iJ) & 4294967295L);
        }
        return 0L;
    }

    public final long O0(long j9, boolean z11) {
        int iK = z5.a.k(j9);
        int iRound = Math.round(iK / this.f13825o);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z11 || c.s(iK, iRound, j9)) {
            return (((long) iK) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // b5.c0
    public final int maxIntrinsicHeight(z4.u uVar, z4.t tVar, int i11) {
        return i11 != Integer.MAX_VALUE ? Math.round(i11 / this.f13825o) : tVar.b(i11);
    }

    @Override // b5.c0
    public final int maxIntrinsicWidth(z4.u uVar, z4.t tVar, int i11) {
        return i11 != Integer.MAX_VALUE ? Math.round(i11 * this.f13825o) : tVar.y(i11);
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        long jM0 = M0(j9, true);
        if (z5.l.a(jM0, 0L)) {
            jM0 = L0(j9, true);
            if (z5.l.a(jM0, 0L)) {
                jM0 = O0(j9, true);
                if (z5.l.a(jM0, 0L)) {
                    jM0 = N0(j9, true);
                    if (z5.l.a(jM0, 0L)) {
                        jM0 = M0(j9, false);
                        if (z5.l.a(jM0, 0L)) {
                            jM0 = L0(j9, false);
                            if (z5.l.a(jM0, 0L)) {
                                jM0 = O0(j9, false);
                                if (z5.l.a(jM0, 0L)) {
                                    jM0 = N0(j9, false);
                                    if (z5.l.a(jM0, 0L)) {
                                        jM0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!z5.l.a(jM0, 0L)) {
            int i11 = (int) (jM0 >> 32);
            int i12 = (int) (jM0 & 4294967295L);
            if (!((i12 >= 0) & (i11 >= 0))) {
                z5.i.a("width and height must be >= 0");
            }
            j9 = z5.b.h(i11, i11, i12, i12);
        }
        z4.m1 m1VarD = t0Var.D(j9);
        return z4.w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new k(m1VarD, 0));
    }

    @Override // b5.c0
    public final int minIntrinsicHeight(z4.u uVar, z4.t tVar, int i11) {
        return i11 != Integer.MAX_VALUE ? Math.round(i11 / this.f13825o) : tVar.V(i11);
    }

    @Override // b5.c0
    public final int minIntrinsicWidth(z4.u uVar, z4.t tVar, int i11) {
        return i11 != Integer.MAX_VALUE ? Math.round(i11 * this.f13825o) : tVar.w(i11);
    }
}
