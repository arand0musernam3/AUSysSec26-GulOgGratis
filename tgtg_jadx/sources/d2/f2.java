package d2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f2 {
    public static final z4.v0 a(e2 e2Var, int i11, int i12, int i13, int i14, int i15, z4.w0 w0Var, List list, z4.m1[] m1VarArr, int i16, int i17, int[] iArr, int i18) {
        int i19;
        float f11;
        long j9;
        int i21;
        int i22;
        int i23;
        List list2 = list;
        long j11 = i15;
        int i24 = i17 - i16;
        int[] iArr2 = new int[i24];
        int i25 = i16;
        int iMax = 0;
        int i26 = 0;
        int i27 = 0;
        int iMin = 0;
        float f12 = 0.0f;
        while (i25 < i17) {
            z4.t0 t0Var = (z4.t0) list2.get(i25);
            float fB = d2.b(d2.a(t0Var));
            if (fB > 0.0f) {
                f12 += fB;
                i26++;
                j9 = j11;
                i21 = i25;
            } else {
                int i28 = i13 - i27;
                z4.m1 m1VarD = m1VarArr[i25];
                j9 = j11;
                if (m1VarD == null) {
                    if (i13 == Integer.MAX_VALUE) {
                        i21 = i25;
                        i22 = i26;
                        i23 = Integer.MAX_VALUE;
                    } else {
                        i21 = i25;
                        i22 = i26;
                        i23 = i28 < 0 ? 0 : i28;
                    }
                    m1VarD = t0Var.D(e2Var.f(0, i23, i14, false));
                } else {
                    i21 = i25;
                    i22 = i26;
                }
                z4.m1 m1Var = m1VarD;
                int iH = e2Var.h(m1Var);
                int i29 = e2Var.i(m1Var);
                iArr2[i21 - i16] = iH;
                int i31 = i28 - iH;
                if (i31 < 0) {
                    i31 = 0;
                }
                iMin = Math.min(i15, i31);
                i27 += iH + iMin;
                iMax = Math.max(iMax, i29);
                m1VarArr[i21] = m1Var;
                i26 = i22;
            }
            i25 = i21 + 1;
            j11 = j9;
        }
        long j12 = j11;
        int i32 = i26;
        if (i32 == 0) {
            i27 -= iMin;
            i19 = 0;
        } else {
            long j13 = ((long) (i32 - 1)) * j12;
            long jRound = ((long) ((i13 != Integer.MAX_VALUE ? i13 : i11) - i27)) - j13;
            if (jRound < 0) {
                jRound = 0;
            }
            float f13 = jRound / f12;
            for (int i33 = i16; i33 < i17; i33++) {
                jRound -= (long) Math.round(d2.b(d2.a((z4.t0) list2.get(i33))) * f13);
            }
            int i34 = i16;
            int i35 = iMax;
            int i36 = 0;
            while (i34 < i17) {
                if (m1VarArr[i34] == null) {
                    z4.t0 t0Var2 = (z4.t0) list2.get(i34);
                    f11 = f13;
                    g2 g2VarA = d2.a(t0Var2);
                    float fB2 = d2.b(g2VarA);
                    if (fB2 <= 0.0f) {
                        e2.a.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j14 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fB2 * f11) + iSignum);
                    z4.m1 m1VarD2 = t0Var2.D(e2Var.f((!(g2VarA != null ? g2VarA.f13794b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i14, true));
                    int iH2 = e2Var.h(m1VarD2);
                    int i37 = e2Var.i(m1VarD2);
                    iArr2[i34 - i16] = iH2;
                    i36 += iH2;
                    int iMax3 = Math.max(i35, i37);
                    m1VarArr[i34] = m1VarD2;
                    i35 = iMax3;
                    jRound = j14;
                } else {
                    f11 = f13;
                }
                i34++;
                list2 = list;
                f13 = f11;
            }
            i19 = (int) (((long) i36) + j13);
            int i38 = i13 - i27;
            if (i19 < 0) {
                i19 = 0;
            }
            if (i19 > i38) {
                i19 = i38;
            }
            iMax = i35;
        }
        int i39 = i19 + i27;
        if (i39 < 0) {
            i39 = 0;
        }
        int iMax4 = Math.max(i39, i11);
        int iMax5 = Math.max(iMax, Math.max(i12, 0));
        int[] iArr3 = new int[i24];
        e2Var.g(iMax4, iArr2, iArr3, w0Var);
        return e2Var.j(m1VarArr, w0Var, iArr3, iMax4, iMax5, iArr, i18, i16, i17);
    }
}
