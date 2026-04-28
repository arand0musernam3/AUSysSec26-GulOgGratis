package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends b4.s implements b5.c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f13943o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f13944p;

    @Override // b5.c0
    public final int maxIntrinsicHeight(z4.u uVar, z4.t tVar, int i11) {
        int iB = tVar.b(i11);
        int iQ0 = !Float.isNaN(this.f13944p) ? uVar.q0(this.f13944p) : 0;
        return iB < iQ0 ? iQ0 : iB;
    }

    @Override // b5.c0
    public final int maxIntrinsicWidth(z4.u uVar, z4.t tVar, int i11) {
        int iY = tVar.y(i11);
        int iQ0 = !Float.isNaN(this.f13943o) ? uVar.q0(this.f13943o) : 0;
        return iY < iQ0 ? iQ0 : iY;
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        int iK;
        int iJ;
        if (Float.isNaN(this.f13943o) || z5.a.k(j9) != 0) {
            iK = z5.a.k(j9);
        } else {
            int iQ0 = w0Var.q0(this.f13943o);
            iK = z5.a.i(j9);
            if (iQ0 < 0) {
                iQ0 = 0;
            }
            if (iQ0 <= iK) {
                iK = iQ0;
            }
        }
        int i11 = z5.a.i(j9);
        if (Float.isNaN(this.f13944p) || z5.a.j(j9) != 0) {
            iJ = z5.a.j(j9);
        } else {
            int iQ02 = w0Var.q0(this.f13944p);
            iJ = z5.a.h(j9);
            int i12 = iQ02 >= 0 ? iQ02 : 0;
            if (i12 <= iJ) {
                iJ = i12;
            }
        }
        z4.m1 m1VarD = t0Var.D(z5.b.a(iK, i11, iJ, z5.a.h(j9)));
        return z4.w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new k(m1VarD, 4));
    }

    @Override // b5.c0
    public final int minIntrinsicHeight(z4.u uVar, z4.t tVar, int i11) {
        int iV = tVar.V(i11);
        int iQ0 = !Float.isNaN(this.f13944p) ? uVar.q0(this.f13944p) : 0;
        return iV < iQ0 ? iQ0 : iV;
    }

    @Override // b5.c0
    public final int minIntrinsicWidth(z4.u uVar, z4.t tVar, int i11) {
        int iW = tVar.w(i11);
        int iQ0 = !Float.isNaN(this.f13943o) ? uVar.q0(this.f13943o) : 0;
        return iW < iQ0 ? iQ0 : iW;
    }
}
