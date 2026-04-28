package n6;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f30545x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f30546y0 = true;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f30547z0 = 0;
    public boolean A0 = false;

    @Override // n6.g
    public final boolean C() {
        return this.A0;
    }

    @Override // n6.g
    public final boolean D() {
        return this.A0;
    }

    public final boolean Z() {
        int i11;
        int i12;
        int i13;
        boolean z11 = true;
        int i14 = 0;
        while (true) {
            i11 = this.f30655w0;
            if (i14 >= i11) {
                break;
            }
            g gVar = this.f30654v0[i14];
            if ((this.f30546y0 || gVar.d()) && ((((i12 = this.f30545x0) == 0 || i12 == 1) && !gVar.C()) || (((i13 = this.f30545x0) == 2 || i13 == 3) && !gVar.D()))) {
                z11 = false;
            }
            i14++;
        }
        if (!z11 || i11 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z12 = false;
        for (int i15 = 0; i15 < this.f30655w0; i15++) {
            g gVar2 = this.f30654v0[i15];
            if (this.f30546y0 || gVar2.d()) {
                if (!z12) {
                    int i16 = this.f30545x0;
                    if (i16 == 0) {
                        iMax = gVar2.k(c.LEFT).d();
                    } else if (i16 == 1) {
                        iMax = gVar2.k(c.RIGHT).d();
                    } else if (i16 == 2) {
                        iMax = gVar2.k(c.TOP).d();
                    } else if (i16 == 3) {
                        iMax = gVar2.k(c.BOTTOM).d();
                    }
                    z12 = true;
                }
                int i17 = this.f30545x0;
                if (i17 == 0) {
                    iMax = Math.min(iMax, gVar2.k(c.LEFT).d());
                } else if (i17 == 1) {
                    iMax = Math.max(iMax, gVar2.k(c.RIGHT).d());
                } else if (i17 == 2) {
                    iMax = Math.min(iMax, gVar2.k(c.TOP).d());
                } else if (i17 == 3) {
                    iMax = Math.max(iMax, gVar2.k(c.BOTTOM).d());
                }
            }
        }
        int i18 = iMax + this.f30547z0;
        int i19 = this.f30545x0;
        if (i19 == 0 || i19 == 1) {
            M(i18, i18);
        } else {
            N(i18, i18);
        }
        this.A0 = true;
        return true;
    }

    public final int a0() {
        int i11 = this.f30545x0;
        if (i11 == 0 || i11 == 1) {
            return 0;
        }
        return (i11 == 2 || i11 == 3) ? 1 : -1;
    }

    @Override // n6.g
    public final void c(g6.c cVar, boolean z11) {
        boolean z12;
        int i11;
        int i12;
        d[] dVarArr = this.S;
        d dVar = this.K;
        dVarArr[0] = dVar;
        int i13 = 2;
        d dVar2 = this.L;
        dVarArr[2] = dVar2;
        d dVar3 = this.M;
        dVarArr[1] = dVar3;
        d dVar4 = this.N;
        dVarArr[3] = dVar4;
        for (d dVar5 : dVarArr) {
            dVar5.f30572i = cVar.k(dVar5);
        }
        int i14 = this.f30545x0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        d dVar6 = dVarArr[i14];
        if (!this.A0) {
            Z();
        }
        if (this.A0) {
            this.A0 = false;
            int i15 = this.f30545x0;
            if (i15 == 0 || i15 == 1) {
                cVar.d(dVar.f30572i, this.f30577b0);
                cVar.d(dVar3.f30572i, this.f30577b0);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    cVar.d(dVar2.f30572i, this.f30579c0);
                    cVar.d(dVar4.f30572i, this.f30579c0);
                    return;
                }
                return;
            }
        }
        for (int i16 = 0; i16 < this.f30655w0; i16++) {
            g gVar = this.f30654v0[i16];
            if ((this.f30546y0 || gVar.d()) && ((((i12 = this.f30545x0) == 0 || i12 == 1) && gVar.V[0] == f.MATCH_CONSTRAINT && gVar.K.f30569f != null && gVar.M.f30569f != null) || ((i12 == 2 || i12 == 3) && gVar.V[1] == f.MATCH_CONSTRAINT && gVar.L.f30569f != null && gVar.N.f30569f != null))) {
                z12 = true;
                break;
            }
        }
        z12 = false;
        boolean z13 = dVar.g() || dVar3.g();
        boolean z14 = dVar2.g() || dVar4.g();
        int i17 = !(!z12 && (((i11 = this.f30545x0) == 0 && z13) || ((i11 == 2 && z14) || ((i11 == 1 && z13) || (i11 == 3 && z14))))) ? 4 : 5;
        int i18 = 0;
        while (i18 < this.f30655w0) {
            g gVar2 = this.f30654v0[i18];
            if (this.f30546y0 || gVar2.d()) {
                g6.h hVarK = cVar.k(gVar2.S[this.f30545x0]);
                d[] dVarArr2 = gVar2.S;
                int i19 = this.f30545x0;
                d dVar7 = dVarArr2[i19];
                dVar7.f30572i = hVarK;
                d dVar8 = dVar7.f30569f;
                int i21 = (dVar8 == null || dVar8.f30567d != this) ? 0 : dVar7.f30570g;
                if (i19 == 0 || i19 == i13) {
                    g6.h hVar = dVar6.f30572i;
                    int i22 = this.f30547z0 - i21;
                    g6.b bVarL = cVar.l();
                    g6.h hVarM = cVar.m();
                    hVarM.f20047d = 0;
                    bVarL.c(hVar, hVarK, hVarM, i22);
                    cVar.c(bVarL);
                } else {
                    g6.h hVar2 = dVar6.f30572i;
                    int i23 = this.f30547z0 + i21;
                    g6.b bVarL2 = cVar.l();
                    g6.h hVarM2 = cVar.m();
                    hVarM2.f20047d = 0;
                    bVarL2.b(hVar2, hVarK, hVarM2, i23);
                    cVar.c(bVarL2);
                }
                cVar.e(dVar6.f30572i, hVarK, this.f30547z0 + i21, i17);
            }
            i18++;
            i13 = 2;
        }
        int i24 = this.f30545x0;
        if (i24 == 0) {
            cVar.e(dVar3.f30572i, dVar.f30572i, 0, 8);
            cVar.e(dVar.f30572i, this.W.M.f30572i, 0, 4);
            cVar.e(dVar.f30572i, this.W.K.f30572i, 0, 0);
            return;
        }
        if (i24 == 1) {
            cVar.e(dVar.f30572i, dVar3.f30572i, 0, 8);
            cVar.e(dVar.f30572i, this.W.K.f30572i, 0, 4);
            cVar.e(dVar.f30572i, this.W.M.f30572i, 0, 0);
        } else if (i24 == 2) {
            cVar.e(dVar4.f30572i, dVar2.f30572i, 0, 8);
            cVar.e(dVar2.f30572i, this.W.N.f30572i, 0, 4);
            cVar.e(dVar2.f30572i, this.W.L.f30572i, 0, 0);
        } else if (i24 == 3) {
            cVar.e(dVar2.f30572i, dVar4.f30572i, 0, 8);
            cVar.e(dVar2.f30572i, this.W.L.f30572i, 0, 4);
            cVar.e(dVar2.f30572i, this.W.N.f30572i, 0, 0);
        }
    }

    @Override // n6.g
    public final boolean d() {
        return true;
    }

    @Override // n6.m, n6.g
    public final void h(g gVar, HashMap map) {
        super.h(gVar, map);
        a aVar = (a) gVar;
        this.f30545x0 = aVar.f30545x0;
        this.f30546y0 = aVar.f30546y0;
        this.f30547z0 = aVar.f30547z0;
    }

    @Override // n6.g
    public final String toString() {
        String strP = r8.k.p(new StringBuilder("[Barrier] "), this.f30596l0, " {");
        for (int i11 = 0; i11 < this.f30655w0; i11++) {
            g gVar = this.f30654v0[i11];
            if (i11 > 0) {
                strP = strP.concat(", ");
            }
            StringBuilder sbO = b3.i.o(strP);
            sbO.append(gVar.f30596l0);
            strP = sbO.toString();
        }
        return strP.concat("}");
    }
}
