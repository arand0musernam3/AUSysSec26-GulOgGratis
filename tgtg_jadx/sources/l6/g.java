package l6;

import f6.t;
import java.util.HashSet;
import n6.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k6.g {
    public String A0;
    public int B0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public m6.a f27411n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f27412o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f27413p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f27414q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f27415r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f27416s0;
    public int t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f27417u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public float f27418v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f27419w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f27420x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f27421y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public String f27422z0;

    public g(t tVar, k6.l lVar) {
        super(tVar, lVar);
        this.f27412o0 = 0;
        this.f27413p0 = 0;
        this.f27414q0 = 0;
        this.f27415r0 = 0;
        if (lVar == k6.l.ROW) {
            this.t0 = 1;
        } else if (lVar == k6.l.COLUMN) {
            this.f27417u0 = 1;
        }
    }

    @Override // k6.g, k6.b, k6.h
    public final void apply() {
        s();
        m6.a aVar = this.f27411n0;
        int i11 = this.f27416s0;
        aVar.getClass();
        if ((i11 == 0 || i11 == 1) && aVar.V0 != i11) {
            aVar.V0 = i11;
        }
        int i12 = this.t0;
        if (i12 != 0) {
            m6.a aVar2 = this.f27411n0;
            if (i12 > 50) {
                aVar2.getClass();
            } else if (aVar2.M0 != i12) {
                aVar2.M0 = i12;
                aVar2.l0();
                aVar2.h0();
            }
        }
        int i13 = this.f27417u0;
        if (i13 != 0) {
            m6.a aVar3 = this.f27411n0;
            if (i13 > 50) {
                aVar3.getClass();
            } else if (aVar3.O0 != i13) {
                aVar3.O0 = i13;
                aVar3.l0();
                aVar3.h0();
            }
        }
        float f11 = this.f27418v0;
        if (f11 != 0.0f) {
            m6.a aVar4 = this.f27411n0;
            if (f11 < 0.0f) {
                aVar4.getClass();
            } else if (aVar4.P0 != f11) {
                aVar4.P0 = f11;
            }
        }
        float f12 = this.f27419w0;
        if (f12 != 0.0f) {
            m6.a aVar5 = this.f27411n0;
            if (f12 < 0.0f) {
                aVar5.getClass();
            } else if (aVar5.Q0 != f12) {
                aVar5.Q0 = f12;
            }
        }
        String str = this.f27420x0;
        if (str != null && !str.isEmpty()) {
            m6.a aVar6 = this.f27411n0;
            String str2 = this.f27420x0;
            String str3 = aVar6.R0;
            if (str3 == null || !str3.equals(str2)) {
                aVar6.R0 = str2;
            }
        }
        String str4 = this.f27421y0;
        if (str4 != null && !str4.isEmpty()) {
            m6.a aVar7 = this.f27411n0;
            String str5 = this.f27421y0;
            String str6 = aVar7.S0;
            if (str6 == null || !str6.equals(str5)) {
                aVar7.S0 = str5;
            }
        }
        String str7 = this.f27422z0;
        if (str7 != null && !str7.isEmpty()) {
            m6.a aVar8 = this.f27411n0;
            String str8 = this.f27422z0;
            String str9 = aVar8.T0;
            if (str9 == null || !str9.equals(str8.toString())) {
                aVar8.K0 = false;
                aVar8.T0 = str8.toString();
            }
        }
        String str10 = this.A0;
        if (str10 != null && !str10.isEmpty()) {
            m6.a aVar9 = this.f27411n0;
            String str11 = this.A0;
            String str12 = aVar9.U0;
            if (str12 == null || !str12.equals(str11)) {
                aVar9.K0 = false;
                aVar9.U0 = str11;
            }
        }
        m6.a aVar10 = this.f27411n0;
        aVar10.f29679a1 = this.B0;
        int i14 = this.f27412o0;
        aVar10.f30659z0 = i14;
        aVar10.B0 = i14;
        aVar10.C0 = i14;
        aVar10.A0 = this.f27413p0;
        aVar10.f30657x0 = this.f27414q0;
        aVar10.f30658y0 = this.f27415r0;
        r();
    }

    @Override // k6.g
    public final m s() {
        int[][] iArrJ0;
        int[][] iArrJ02;
        boolean[][] zArr;
        if (this.f27411n0 == null) {
            m6.a aVar = new m6.a();
            aVar.K0 = false;
            aVar.W0 = 0;
            aVar.Y0 = new HashSet();
            aVar.f29681c1 = 0;
            aVar.l0();
            int[][] iArr = aVar.Z0;
            boolean z11 = iArr != null && iArr.length == aVar.f30655w0 && (zArr = aVar.X0) != null && zArr.length == aVar.L0 && zArr[0].length == aVar.N0;
            if (!z11) {
                aVar.h0();
            }
            if (z11) {
                for (int i11 = 0; i11 < aVar.X0.length; i11++) {
                    int i12 = 0;
                    while (true) {
                        boolean[][] zArr2 = aVar.X0;
                        if (i12 < zArr2[0].length) {
                            zArr2[i11][i12] = true;
                            i12++;
                        }
                    }
                }
                for (int i13 = 0; i13 < aVar.Z0.length; i13++) {
                    int i14 = 0;
                    while (true) {
                        int[][] iArr2 = aVar.Z0;
                        if (i14 < iArr2[0].length) {
                            iArr2[i13][i14] = -1;
                            i14++;
                        }
                    }
                }
            }
            aVar.W0 = 0;
            String str = aVar.U0;
            if (str != null && !str.trim().isEmpty() && (iArrJ02 = aVar.j0(aVar.U0, false)) != null) {
                aVar.f0(iArrJ02);
            }
            String str2 = aVar.T0;
            if (str2 != null && !str2.trim().isEmpty() && (iArrJ0 = aVar.j0(aVar.T0, true)) != null) {
                aVar.g0(iArrJ0);
            }
            this.f27411n0 = aVar;
        }
        return this.f27411n0;
    }
}
