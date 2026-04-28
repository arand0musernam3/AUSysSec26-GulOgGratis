package n6;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends p {

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public g[] f30646f1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public int L0 = -1;
    public int M0 = -1;
    public int N0 = -1;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public float T0 = 0.5f;
    public int U0 = 0;
    public int V0 = 0;
    public int W0 = 2;
    public int X0 = 2;
    public int Y0 = 0;
    public int Z0 = -1;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f30641a1 = 0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final ArrayList f30642b1 = new ArrayList();

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public g[] f30643c1 = null;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public g[] f30644d1 = null;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int[] f30645e1 = null;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f30647g1 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0102  */
    @Override // n6.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(int r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 1791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.j.Z(int, int, int, int):void");
    }

    public final int b0(g gVar, int i11) {
        g gVar2;
        if (gVar == null) {
            return 0;
        }
        if (gVar.V[1] == f.MATCH_CONSTRAINT) {
            int i12 = gVar.f30611t;
            if (i12 == 0) {
                return 0;
            }
            if (i12 == 2) {
                int i13 = (int) (gVar.A * i11);
                if (i13 != gVar.m()) {
                    gVar.f30586g = true;
                    a0(gVar, gVar.V[0], gVar.s(), f.FIXED, i13);
                }
                return i13;
            }
            gVar2 = gVar;
            if (i12 == 1) {
                return gVar2.m();
            }
            if (i12 == 3) {
                return (int) ((gVar2.s() * gVar2.Z) + 0.5f);
            }
        } else {
            gVar2 = gVar;
        }
        return gVar2.m();
    }

    @Override // n6.g
    public final void c(g6.c cVar, boolean z11) {
        g gVar;
        float f11;
        int i11;
        super.c(cVar, z11);
        g gVar2 = this.W;
        boolean z12 = gVar2 != null && ((h) gVar2).A0;
        int i12 = this.Y0;
        ArrayList arrayList = this.f30642b1;
        if (i12 != 0) {
            if (i12 == 1) {
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    ((i) arrayList.get(i13)).b(i13, z12, i13 == size + (-1));
                    i13++;
                }
            } else if (i12 != 2) {
                if (i12 == 3) {
                    int size2 = arrayList.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        ((i) arrayList.get(i14)).b(i14, z12, i14 == size2 + (-1));
                        i14++;
                    }
                }
            } else if (this.f30645e1 != null && this.f30644d1 != null && this.f30643c1 != null) {
                for (int i15 = 0; i15 < this.f30647g1; i15++) {
                    this.f30646f1[i15].F();
                }
                int[] iArr = this.f30645e1;
                int i16 = iArr[0];
                int i17 = iArr[1];
                float f12 = this.O0;
                g gVar3 = null;
                int i18 = 0;
                while (i18 < i16) {
                    if (z12) {
                        i11 = (i16 - i18) - 1;
                        f11 = 1.0f - this.O0;
                    } else {
                        f11 = f12;
                        i11 = i18;
                    }
                    g gVar4 = this.f30644d1[i11];
                    if (gVar4 != null) {
                        d dVar = gVar4.K;
                        if (gVar4.f30593j0 != 8) {
                            if (i18 == 0) {
                                gVar4.g(dVar, this.K, this.B0);
                                gVar4.f30598m0 = this.I0;
                                gVar4.f30587g0 = f11;
                            }
                            if (i18 == i16 - 1) {
                                gVar4.g(gVar4.M, this.M, this.C0);
                            }
                            if (i18 > 0 && gVar3 != null) {
                                d dVar2 = gVar3.M;
                                gVar4.g(dVar, dVar2, this.U0);
                                gVar3.g(dVar2, dVar, 0);
                            }
                            gVar3 = gVar4;
                        }
                    }
                    i18++;
                    f12 = f11;
                }
                for (int i19 = 0; i19 < i17; i19++) {
                    g gVar5 = this.f30643c1[i19];
                    if (gVar5 != null) {
                        d dVar3 = gVar5.L;
                        if (gVar5.f30593j0 != 8) {
                            if (i19 == 0) {
                                gVar5.g(dVar3, this.L, this.f30657x0);
                                gVar5.f30600n0 = this.J0;
                                gVar5.f30589h0 = this.P0;
                            }
                            if (i19 == i17 - 1) {
                                gVar5.g(gVar5.N, this.N, this.f30658y0);
                            }
                            if (i19 > 0 && gVar3 != null) {
                                d dVar4 = gVar3.N;
                                gVar5.g(dVar3, dVar4, this.V0);
                                gVar3.g(dVar4, dVar3, 0);
                            }
                            gVar3 = gVar5;
                        }
                    }
                }
                for (int i21 = 0; i21 < i16; i21++) {
                    for (int i22 = 0; i22 < i17; i22++) {
                        int i23 = (i22 * i16) + i21;
                        if (this.f30641a1 == 1) {
                            i23 = (i21 * i17) + i22;
                        }
                        g[] gVarArr = this.f30646f1;
                        if (i23 < gVarArr.length && (gVar = gVarArr[i23]) != null && gVar.f30593j0 != 8) {
                            g gVar6 = this.f30644d1[i21];
                            g gVar7 = this.f30643c1[i22];
                            if (gVar != gVar6) {
                                gVar.g(gVar.K, gVar6.K, 0);
                                gVar.g(gVar.M, gVar6.M, 0);
                            }
                            if (gVar != gVar7) {
                                gVar.g(gVar.L, gVar7.L, 0);
                                gVar.g(gVar.N, gVar7.N, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((i) arrayList.get(0)).b(0, z12, true);
        }
        this.D0 = false;
    }

    public final int c0(g gVar, int i11) {
        g gVar2;
        if (gVar == null) {
            return 0;
        }
        if (gVar.V[0] == f.MATCH_CONSTRAINT) {
            int i12 = gVar.f30609s;
            if (i12 == 0) {
                return 0;
            }
            if (i12 == 2) {
                int i13 = (int) (gVar.f30616x * i11);
                if (i13 != gVar.s()) {
                    gVar.f30586g = true;
                    a0(gVar, f.FIXED, i13, gVar.V[1], gVar.m());
                }
                return i13;
            }
            gVar2 = gVar;
            if (i12 == 1) {
                return gVar2.s();
            }
            if (i12 == 3) {
                return (int) ((gVar2.m() * gVar2.Z) + 0.5f);
            }
        } else {
            gVar2 = gVar;
        }
        return gVar2.s();
    }

    @Override // n6.m, n6.g
    public final void h(g gVar, HashMap map) {
        super.h(gVar, map);
        j jVar = (j) gVar;
        this.I0 = jVar.I0;
        this.J0 = jVar.J0;
        this.K0 = jVar.K0;
        this.L0 = jVar.L0;
        this.M0 = jVar.M0;
        this.N0 = jVar.N0;
        this.O0 = jVar.O0;
        this.P0 = jVar.P0;
        this.Q0 = jVar.Q0;
        this.R0 = jVar.R0;
        this.S0 = jVar.S0;
        this.T0 = jVar.T0;
        this.U0 = jVar.U0;
        this.V0 = jVar.V0;
        this.W0 = jVar.W0;
        this.X0 = jVar.X0;
        this.Y0 = jVar.Y0;
        this.Z0 = jVar.Z0;
        this.f30641a1 = jVar.f30641a1;
    }
}
