package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends b4.s implements b5.c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e0 f13796o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f13797p;

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        int iK;
        int i11;
        int iH;
        int iH2;
        if (!z5.a.e(j9) || this.f13796o == e0.Vertical) {
            iK = z5.a.k(j9);
            i11 = z5.a.i(j9);
        } else {
            int iRound = Math.round(z5.a.i(j9) * this.f13797p);
            int iK2 = z5.a.k(j9);
            iK = z5.a.i(j9);
            if (iRound < iK2) {
                iRound = iK2;
            }
            if (iRound <= iK) {
                iK = iRound;
            }
            i11 = iK;
        }
        if (!z5.a.d(j9) || this.f13796o == e0.Horizontal) {
            int iJ = z5.a.j(j9);
            iH = z5.a.h(j9);
            iH2 = iJ;
        } else {
            int iRound2 = Math.round(z5.a.h(j9) * this.f13797p);
            int iJ2 = z5.a.j(j9);
            iH2 = z5.a.h(j9);
            if (iRound2 < iJ2) {
                iRound2 = iJ2;
            }
            if (iRound2 <= iH2) {
                iH2 = iRound2;
            }
            iH = iH2;
        }
        z4.m1 m1VarD = t0Var.D(z5.b.a(iK, i11, iH2, iH));
        return z4.w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new k(m1VarD, 1));
    }
}
