package m6;

import a40.i;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import n6.f;
import n6.g;
import n6.h;
import n6.p;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends p {
    public h I0;
    public g[] J0;
    public boolean K0;
    public int L0;
    public int M0;
    public int N0;
    public int O0;
    public float P0;
    public float Q0;
    public String R0;
    public String S0;
    public String T0;
    public String U0;
    public int V0;
    public int W0;
    public boolean[][] X0;
    public HashSet Y0;
    public int[][] Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f29679a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int[][] f29680b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public int f29681c1;

    public static void b0(g gVar) {
        gVar.f30602o0[1] = -1.0f;
        gVar.L.j();
        gVar.N.j();
        gVar.O.j();
    }

    public static float[] k0(int i11, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(MessageLogView.COMMA_SEPARATOR);
        float[] fArr = new float[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 < strArrSplit.length) {
                try {
                    fArr[i12] = Float.parseFloat(strArrSplit[i12]);
                } catch (Exception e5) {
                    System.err.println("Error parsing `" + strArrSplit[i12] + "`: " + e5.getMessage());
                    fArr[i12] = 1.0f;
                }
            } else {
                fArr[i12] = 1.0f;
            }
        }
        return fArr;
    }

    @Override // n6.p
    public final void Z(int i11, int i12, int i13, int i14) {
        int[][] iArrJ0;
        this.I0 = (h) this.W;
        if (this.L0 >= 1 && this.N0 >= 1) {
            this.W0 = 0;
            String str = this.U0;
            if (str != null && !str.trim().isEmpty() && (iArrJ0 = j0(this.U0, false)) != null) {
                f0(iArrJ0);
            }
            String str2 = this.T0;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.f29680b1 = j0(this.T0, true);
            }
            int iMax = Math.max(this.L0, this.N0);
            g[] gVarArr = this.J0;
            if (gVarArr == null) {
                this.J0 = new g[iMax];
                int i15 = 0;
                while (true) {
                    g[] gVarArr2 = this.J0;
                    if (i15 >= gVarArr2.length) {
                        break;
                    }
                    g gVar = new g();
                    f[] fVarArr = gVar.V;
                    f fVar = f.MATCH_CONSTRAINT;
                    fVarArr[0] = fVar;
                    fVarArr[1] = fVar;
                    gVar.f30594k = String.valueOf(gVar.hashCode());
                    gVarArr2[i15] = gVar;
                    i15++;
                }
            } else if (iMax != gVarArr.length) {
                g[] gVarArr3 = new g[iMax];
                for (int i16 = 0; i16 < iMax; i16++) {
                    g[] gVarArr4 = this.J0;
                    if (i16 < gVarArr4.length) {
                        gVarArr3[i16] = gVarArr4[i16];
                    } else {
                        g gVar2 = new g();
                        f[] fVarArr2 = gVar2.V;
                        f fVar2 = f.MATCH_CONSTRAINT;
                        fVarArr2[0] = fVar2;
                        fVarArr2[1] = fVar2;
                        gVar2.f30594k = String.valueOf(gVar2.hashCode());
                        gVarArr3[i16] = gVar2;
                    }
                }
                while (true) {
                    g[] gVarArr5 = this.J0;
                    if (iMax >= gVarArr5.length) {
                        break;
                    }
                    g gVar3 = gVarArr5[iMax];
                    this.I0.f30619v0.remove(gVar3);
                    gVar3.E();
                    iMax++;
                }
                this.J0 = gVarArr3;
            }
            int[][] iArr = this.f29680b1;
            if (iArr != null) {
                g0(iArr);
            }
        }
        h hVar = this.I0;
        g[] gVarArr6 = this.J0;
        hVar.getClass();
        for (g gVar4 : gVarArr6) {
            hVar.W(gVar4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01b3  */
    @Override // n6.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(g6.c r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.a.c(g6.c, boolean):void");
    }

    public final void c0(g gVar, int i11, int i12, int i13, int i14) {
        gVar.K.a(this.J0[i12].K, 0);
        gVar.L.a(this.J0[i11].L, 0);
        gVar.M.a(this.J0[(i12 + i14) - 1].M, 0);
        gVar.N.a(this.J0[(i11 + i13) - 1].N, 0);
    }

    public final int d0(int i11) {
        return this.V0 == 1 ? i11 / this.L0 : i11 % this.N0;
    }

    public final int e0(int i11) {
        return this.V0 == 1 ? i11 % this.L0 : i11 / this.N0;
    }

    public final void f0(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!i0(e0(iArr2[0]), d0(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    public final void g0(int[][] iArr) {
        if ((this.f29679a1 & 2) > 0) {
            return;
        }
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int iE0 = e0(iArr[i11][0]);
            int iD0 = d0(iArr[i11][0]);
            int[] iArr2 = iArr[i11];
            if (!i0(iE0, iD0, iArr2[1], iArr2[2])) {
                break;
            }
            g gVar = this.f30654v0[i11];
            int[] iArr3 = iArr[i11];
            c0(gVar, iE0, iD0, iArr3[1], iArr3[2]);
            this.Y0.add(this.f30654v0[i11].f30594k);
        }
    }

    public final void h0() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.L0, this.N0);
        this.X0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i11 = this.f30655w0;
        if (i11 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11, 4);
            this.Z0 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final boolean i0(int i11, int i12, int i13, int i14) {
        for (int i15 = i11; i15 < i11 + i13; i15++) {
            for (int i16 = i12; i16 < i12 + i14; i16++) {
                boolean[][] zArr = this.X0;
                if (i15 < zArr.length && i16 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i15];
                    if (zArr2[i16]) {
                        zArr2[i16] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final int[][] j0(String str, boolean z11) {
        int i11;
        int i12;
        try {
            String[] strArrSplit = str.split(MessageLogView.COMMA_SEPARATOR);
            Arrays.sort(strArrSplit, new i(10));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.L0 != 1 && this.N0 != 1) {
                for (int i13 = 0; i13 < strArrSplit.length; i13++) {
                    String[] strArrSplit2 = strArrSplit[i13].trim().split(":");
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i13][0] = Integer.parseInt(strArrSplit2[0]);
                    if ((this.f29679a1 & 1) > 0) {
                        iArr[i13][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i13][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i13][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i13][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < strArrSplit.length; i16++) {
                String[] strArrSplit4 = strArrSplit[i16].trim().split(":");
                iArr[i16][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i16];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.N0 == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i14 += iArr[i16][1];
                    if (z11) {
                        i14--;
                    }
                }
                if (this.L0 == 1) {
                    iArr[i16][2] = Integer.parseInt(strArrSplit4[1]);
                    i15 += iArr[i16][2];
                    if (z11) {
                        i15--;
                    }
                }
            }
            if (i14 != 0 && !this.K0 && (i12 = this.L0 + i14) <= 50 && this.M0 != i12) {
                this.M0 = i12;
                l0();
                h0();
            }
            if (i15 != 0 && !this.K0 && (i11 = this.N0 + i15) <= 50 && this.O0 != i11) {
                this.O0 = i11;
                l0();
                h0();
            }
            this.K0 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void l0() {
        int i11;
        int i12 = this.M0;
        if (i12 != 0 && (i11 = this.O0) != 0) {
            this.L0 = i12;
            this.N0 = i11;
            return;
        }
        int i13 = this.O0;
        if (i13 > 0) {
            this.N0 = i13;
            this.L0 = ((this.f30655w0 + i13) - 1) / i13;
        } else if (i12 > 0) {
            this.L0 = i12;
            this.N0 = ((this.f30655w0 + i12) - 1) / i12;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f30655w0) + 1.5d);
            this.L0 = iSqrt;
            this.N0 = ((this.f30655w0 + iSqrt) - 1) / iSqrt;
        }
    }
}
