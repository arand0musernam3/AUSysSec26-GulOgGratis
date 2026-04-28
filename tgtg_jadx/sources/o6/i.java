package o6;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f32015a = new b();

    public static boolean a(n6.g gVar) {
        n6.f fVar;
        n6.f fVar2;
        n6.f[] fVarArr = gVar.V;
        n6.f fVar3 = fVarArr[0];
        n6.f fVar4 = fVarArr[1];
        n6.g gVar2 = gVar.W;
        n6.h hVar = gVar2 != null ? (n6.h) gVar2 : null;
        if (hVar != null) {
            n6.f fVar5 = hVar.V[0];
            n6.f fVar6 = n6.f.FIXED;
        }
        if (hVar != null) {
            n6.f fVar7 = hVar.V[1];
            n6.f fVar8 = n6.f.FIXED;
        }
        n6.f fVar9 = n6.f.FIXED;
        boolean z11 = fVar3 == fVar9 || gVar.C() || fVar3 == n6.f.WRAP_CONTENT || (fVar3 == (fVar2 = n6.f.MATCH_CONSTRAINT) && gVar.f30609s == 0 && gVar.Z == 0.0f && gVar.v(0)) || (fVar3 == fVar2 && gVar.f30609s == 1 && gVar.w(0, gVar.s()));
        boolean z12 = fVar4 == fVar9 || gVar.D() || fVar4 == n6.f.WRAP_CONTENT || (fVar4 == (fVar = n6.f.MATCH_CONSTRAINT) && gVar.f30611t == 0 && gVar.Z == 0.0f && gVar.v(1)) || (fVar4 == fVar && gVar.f30611t == 1 && gVar.w(1, gVar.m()));
        return (gVar.Z > 0.0f && (z11 || z12)) || (z11 && z12);
    }

    public static q b(n6.g gVar, int i11, ArrayList arrayList, q qVar) {
        int i12;
        int i13 = i11 == 0 ? gVar.t0 : gVar.f30613u0;
        if (i13 != -1 && (qVar == null || i13 != qVar.f32024b)) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                q qVar2 = (q) arrayList.get(i14);
                if (qVar2.f32024b == i13) {
                    if (qVar != null) {
                        qVar.c(i11, qVar2);
                        arrayList.remove(qVar);
                    }
                    qVar = qVar2;
                } else {
                    i14++;
                }
            }
        } else if (i13 != -1) {
            return qVar;
        }
        if (qVar == null) {
            if (gVar instanceof n6.m) {
                n6.m mVar = (n6.m) gVar;
                int i15 = 0;
                while (true) {
                    if (i15 >= mVar.f30655w0) {
                        i12 = -1;
                        break;
                    }
                    n6.g gVar2 = mVar.f30654v0[i15];
                    if ((i11 == 0 && (i12 = gVar2.t0) != -1) || (i11 == 1 && (i12 = gVar2.f30613u0) != -1)) {
                        break;
                    }
                    i15++;
                }
                if (i12 != -1) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList.size()) {
                            break;
                        }
                        q qVar3 = (q) arrayList.get(i16);
                        if (qVar3.f32024b == i12) {
                            qVar = qVar3;
                            break;
                        }
                        i16++;
                    }
                }
            }
            if (qVar == null) {
                qVar = new q();
                qVar.f32023a = new ArrayList();
                qVar.f32026d = null;
                qVar.f32027e = -1;
                int i17 = q.f32022f;
                q.f32022f = i17 + 1;
                qVar.f32024b = i17;
                qVar.f32025c = i11;
            }
            arrayList.add(qVar);
        }
        ArrayList arrayList2 = qVar.f32023a;
        if (arrayList2.contains(gVar)) {
            return qVar;
        }
        arrayList2.add(gVar);
        if (gVar instanceof n6.l) {
            n6.l lVar = (n6.l) gVar;
            lVar.f30652y0.c(lVar.f30653z0 == 0 ? 1 : 0, arrayList, qVar);
        }
        int i18 = qVar.f32024b;
        if (i11 == 0) {
            gVar.t0 = i18;
            gVar.K.c(i11, arrayList, qVar);
            gVar.M.c(i11, arrayList, qVar);
        } else {
            gVar.f30613u0 = i18;
            gVar.L.c(i11, arrayList, qVar);
            gVar.O.c(i11, arrayList, qVar);
            gVar.N.c(i11, arrayList, qVar);
        }
        gVar.R.c(i11, arrayList, qVar);
        return qVar;
    }

    public static void c(int i11, n6.g gVar, c cVar, boolean z11) {
        n6.d dVar;
        n6.d dVar2;
        char c3;
        n6.d dVar3;
        n6.d dVar4;
        if (gVar.f30599n) {
            return;
        }
        if (!(gVar instanceof n6.h) && gVar.B() && a(gVar)) {
            n6.h.c0(gVar, cVar, new b());
        }
        n6.d dVarK = gVar.k(n6.c.LEFT);
        n6.d dVarK2 = gVar.k(n6.c.RIGHT);
        int iD = dVarK.d();
        int iD2 = dVarK2.d();
        HashSet<n6.d> hashSet = dVarK.f30564a;
        if (hashSet != null && dVarK.f30566c) {
            for (n6.d dVar5 : hashSet) {
                n6.g gVar2 = dVar5.f30567d;
                int i12 = i11 + 1;
                boolean zA = a(gVar2);
                n6.d dVar6 = gVar2.K;
                n6.d dVar7 = gVar2.M;
                if (gVar2.B() && zA) {
                    c3 = 0;
                    n6.h.c0(gVar2, cVar, new b());
                } else {
                    c3 = 0;
                }
                char c7 = ((dVar5 == dVar6 && (dVar4 = dVar7.f30569f) != null && dVar4.f30566c) || (dVar5 == dVar7 && (dVar3 = dVar6.f30569f) != null && dVar3.f30566c)) ? (char) 1 : c3;
                n6.f fVar = gVar2.V[c3];
                n6.f fVar2 = n6.f.MATCH_CONSTRAINT;
                if (fVar != fVar2 || zA) {
                    if (!gVar2.B()) {
                        if (dVar5 == dVar6 && dVar7.f30569f == null) {
                            int iE = dVar6.e() + iD;
                            gVar2.M(iE, gVar2.s() + iE);
                            c(i12, gVar2, cVar, z11);
                        } else if (dVar5 == dVar7 && dVar6.f30569f == null) {
                            int iE2 = iD - dVar7.e();
                            gVar2.M(iE2 - gVar2.s(), iE2);
                            c(i12, gVar2, cVar, z11);
                        } else if (c7 != 0 && !gVar2.z()) {
                            d(i12, gVar2, cVar, z11);
                        }
                    }
                } else if (fVar == fVar2 && gVar2.f30615w >= 0 && gVar2.f30614v >= 0 && (gVar2.f30593j0 == 8 || (gVar2.f30609s == 0 && gVar2.Z == 0.0f))) {
                    if (!gVar2.z() && !gVar2.H && c7 != 0 && !gVar2.z()) {
                        e(i12, gVar, cVar, gVar2, z11);
                    }
                }
            }
        }
        if (gVar instanceof n6.l) {
            return;
        }
        HashSet<n6.d> hashSet2 = dVarK2.f30564a;
        if (hashSet2 != null && dVarK2.f30566c) {
            for (n6.d dVar8 : hashSet2) {
                n6.g gVar3 = dVar8.f30567d;
                int i13 = i11 + 1;
                boolean zA2 = a(gVar3);
                n6.d dVar9 = gVar3.K;
                n6.d dVar10 = gVar3.M;
                if (gVar3.B() && zA2) {
                    n6.h.c0(gVar3, cVar, new b());
                }
                boolean z12 = (dVar8 == dVar9 && (dVar2 = dVar10.f30569f) != null && dVar2.f30566c) || (dVar8 == dVar10 && (dVar = dVar9.f30569f) != null && dVar.f30566c);
                n6.f fVar3 = gVar3.V[0];
                n6.f fVar4 = n6.f.MATCH_CONSTRAINT;
                if (fVar3 != fVar4 || zA2) {
                    if (!gVar3.B()) {
                        if (dVar8 == dVar9 && dVar10.f30569f == null) {
                            int iE3 = dVar9.e() + iD2;
                            gVar3.M(iE3, gVar3.s() + iE3);
                            c(i13, gVar3, cVar, z11);
                        } else if (dVar8 == dVar10 && dVar9.f30569f == null) {
                            int iE4 = iD2 - dVar10.e();
                            gVar3.M(iE4 - gVar3.s(), iE4);
                            c(i13, gVar3, cVar, z11);
                        } else if (z12 && !gVar3.z()) {
                            d(i13, gVar3, cVar, z11);
                        }
                    }
                } else if (fVar3 == fVar4 && gVar3.f30615w >= 0 && gVar3.f30614v >= 0) {
                    if (gVar3.f30593j0 == 8 || (gVar3.f30609s == 0 && gVar3.Z == 0.0f)) {
                        if (!gVar3.z() && !gVar3.H && z12 && !gVar3.z()) {
                            e(i13, gVar, cVar, gVar3, z11);
                        }
                    }
                }
            }
        }
        gVar.f30599n = true;
    }

    public static void d(int i11, n6.g gVar, c cVar, boolean z11) {
        float f11 = gVar.f30587g0;
        n6.d dVar = gVar.K;
        int iD = dVar.f30569f.d();
        n6.d dVar2 = gVar.M;
        int iD2 = dVar2.f30569f.d();
        int iE = dVar.e() + iD;
        int iE2 = iD2 - dVar2.e();
        if (iD == iD2) {
            f11 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iS = gVar.s();
        int i12 = (iD2 - iD) - iS;
        if (iD > iD2) {
            i12 = (iD - iD2) - iS;
        }
        int i13 = ((int) (i12 > 0 ? (f11 * i12) + 0.5f : f11 * i12)) + iD;
        int i14 = i13 + iS;
        if (iD > iD2) {
            i14 = i13 - iS;
        }
        gVar.M(i13, i14);
        c(i11 + 1, gVar, cVar, z11);
    }

    public static void e(int i11, n6.g gVar, c cVar, n6.g gVar2, boolean z11) {
        float f11 = gVar2.f30587g0;
        n6.d dVar = gVar2.K;
        int iE = dVar.e() + dVar.f30569f.d();
        n6.d dVar2 = gVar2.M;
        int iD = dVar2.f30569f.d() - dVar2.e();
        if (iD >= iE) {
            int iS = gVar2.s();
            if (gVar2.f30593j0 != 8) {
                int i12 = gVar2.f30609s;
                if (i12 == 2) {
                    iS = (int) (gVar2.f30587g0 * 0.5f * (gVar instanceof n6.h ? gVar.s() : gVar.W.s()));
                } else if (i12 == 0) {
                    iS = iD - iE;
                }
                iS = Math.max(gVar2.f30614v, iS);
                int i13 = gVar2.f30615w;
                if (i13 > 0) {
                    iS = Math.min(i13, iS);
                }
            }
            int i14 = iE + ((int) ((f11 * ((iD - iE) - iS)) + 0.5f));
            gVar2.M(i14, iS + i14);
            c(i11 + 1, gVar2, cVar, z11);
        }
    }

    public static void f(int i11, n6.g gVar, c cVar) {
        float f11 = gVar.f30589h0;
        n6.d dVar = gVar.L;
        int iD = dVar.f30569f.d();
        n6.d dVar2 = gVar.N;
        int iD2 = dVar2.f30569f.d();
        int iE = dVar.e() + iD;
        int iE2 = iD2 - dVar2.e();
        if (iD == iD2) {
            f11 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iM = gVar.m();
        int i12 = (iD2 - iD) - iM;
        if (iD > iD2) {
            i12 = (iD - iD2) - iM;
        }
        int i13 = (int) (i12 > 0 ? (f11 * i12) + 0.5f : f11 * i12);
        int i14 = iD + i13;
        int i15 = i14 + iM;
        if (iD > iD2) {
            i14 = iD - i13;
            i15 = i14 - iM;
        }
        gVar.N(i14, i15);
        i(i11 + 1, gVar, cVar);
    }

    public static void g(int i11, n6.g gVar, c cVar, n6.g gVar2) {
        float f11 = gVar2.f30589h0;
        n6.d dVar = gVar2.L;
        int iE = dVar.e() + dVar.f30569f.d();
        n6.d dVar2 = gVar2.N;
        int iD = dVar2.f30569f.d() - dVar2.e();
        if (iD >= iE) {
            int iM = gVar2.m();
            if (gVar2.f30593j0 != 8) {
                int i12 = gVar2.f30611t;
                if (i12 == 2) {
                    iM = (int) (f11 * 0.5f * (gVar instanceof n6.h ? gVar.m() : gVar.W.m()));
                } else if (i12 == 0) {
                    iM = iD - iE;
                }
                iM = Math.max(gVar2.f30617y, iM);
                int i13 = gVar2.f30618z;
                if (i13 > 0) {
                    iM = Math.min(i13, iM);
                }
            }
            int i14 = iE + ((int) ((f11 * ((iD - iE) - iM)) + 0.5f));
            gVar2.N(i14, iM + i14);
            i(i11 + 1, gVar2, cVar);
        }
    }

    public static boolean h(n6.f fVar, n6.f fVar2, n6.f fVar3, n6.f fVar4) {
        n6.f fVar5;
        n6.f fVar6;
        n6.f fVar7 = n6.f.FIXED;
        return (fVar3 == fVar7 || fVar3 == (fVar6 = n6.f.WRAP_CONTENT) || (fVar3 == n6.f.MATCH_PARENT && fVar != fVar6)) || (fVar4 == fVar7 || fVar4 == (fVar5 = n6.f.WRAP_CONTENT) || (fVar4 == n6.f.MATCH_PARENT && fVar2 != fVar5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    public static void i(int i11, n6.g gVar, c cVar) {
        boolean z11;
        n6.d dVar;
        n6.d dVar2;
        float f11;
        n6.d dVar3;
        n6.d dVar4;
        if (gVar.f30601o) {
            return;
        }
        if (!(gVar instanceof n6.h) && gVar.B() && a(gVar)) {
            n6.h.c0(gVar, cVar, new b());
        }
        n6.d dVarK = gVar.k(n6.c.TOP);
        n6.d dVarK2 = gVar.k(n6.c.BOTTOM);
        int iD = dVarK.d();
        int iD2 = dVarK2.d();
        HashSet<n6.d> hashSet = dVarK.f30564a;
        char c3 = 1;
        if (hashSet != null && dVarK.f30566c) {
            for (n6.d dVar5 : hashSet) {
                n6.g gVar2 = dVar5.f30567d;
                int i12 = i11 + 1;
                boolean zA = a(gVar2);
                n6.d dVar6 = gVar2.L;
                n6.d dVar7 = gVar2.N;
                if (gVar2.B() && zA) {
                    f11 = 0.0f;
                    n6.h.c0(gVar2, cVar, new b());
                } else {
                    f11 = 0.0f;
                }
                char c7 = ((dVar5 == dVar6 && (dVar4 = dVar7.f30569f) != null && dVar4.f30566c) || (dVar5 == dVar7 && (dVar3 = dVar6.f30569f) != null && dVar3.f30566c)) ? c3 : (char) 0;
                n6.f fVar = gVar2.V[c3];
                char c8 = c3;
                n6.f fVar2 = n6.f.MATCH_CONSTRAINT;
                if (fVar != fVar2 || zA) {
                    if (!gVar2.B()) {
                        if (dVar5 == dVar6 && dVar7.f30569f == null) {
                            int iE = dVar6.e() + iD;
                            gVar2.N(iE, gVar2.m() + iE);
                            i(i12, gVar2, cVar);
                        } else if (dVar5 == dVar7 && dVar6.f30569f == null) {
                            int iE2 = iD - dVar7.e();
                            gVar2.N(iE2 - gVar2.m(), iE2);
                            i(i12, gVar2, cVar);
                        } else if (c7 != 0 && !gVar2.A()) {
                            f(i12, gVar2, cVar);
                        }
                    }
                } else if (fVar == fVar2 && gVar2.f30618z >= 0 && gVar2.f30617y >= 0 && ((gVar2.f30593j0 == 8 || (gVar2.f30611t == 0 && gVar2.Z == f11)) && !gVar2.A() && !gVar2.H && c7 != 0 && !gVar2.A())) {
                    g(i12, gVar, cVar, gVar2);
                }
                c3 = c8;
            }
        }
        ?? r17 = c3;
        if (gVar instanceof n6.l) {
            return;
        }
        HashSet<n6.d> hashSet2 = dVarK2.f30564a;
        if (hashSet2 != null && dVarK2.f30566c) {
            for (n6.d dVar8 : hashSet2) {
                n6.g gVar3 = dVar8.f30567d;
                int i13 = i11 + 1;
                boolean zA2 = a(gVar3);
                n6.d dVar9 = gVar3.L;
                n6.d dVar10 = gVar3.N;
                if (gVar3.B() && zA2) {
                    n6.h.c0(gVar3, cVar, new b());
                }
                ?? r11 = ((dVar8 == dVar9 && (dVar2 = dVar10.f30569f) != null && dVar2.f30566c) || (dVar8 == dVar10 && (dVar = dVar9.f30569f) != null && dVar.f30566c)) ? r17 == true ? 1 : 0 : 0;
                n6.f fVar3 = gVar3.V[r17 == true ? 1 : 0];
                n6.f fVar4 = n6.f.MATCH_CONSTRAINT;
                if (fVar3 != fVar4 || zA2) {
                    if (!gVar3.B()) {
                        if (dVar8 == dVar9 && dVar10.f30569f == null) {
                            int iE3 = dVar9.e() + iD2;
                            gVar3.N(iE3, gVar3.m() + iE3);
                            i(i13, gVar3, cVar);
                        } else if (dVar8 == dVar10 && dVar9.f30569f == null) {
                            int iE4 = iD2 - dVar10.e();
                            gVar3.N(iE4 - gVar3.m(), iE4);
                            i(i13, gVar3, cVar);
                        } else if (r11 != 0 && !gVar3.A()) {
                            f(i13, gVar3, cVar);
                        }
                    }
                } else if (fVar3 == fVar4 && gVar3.f30618z >= 0 && gVar3.f30617y >= 0 && (gVar3.f30593j0 == 8 || (gVar3.f30611t == 0 && gVar3.Z == 0.0f))) {
                    if (!gVar3.A() && !gVar3.H && r11 != 0 && !gVar3.A()) {
                        g(i13, gVar, cVar, gVar3);
                    }
                }
            }
        }
        n6.d dVarK3 = gVar.k(n6.c.BASELINE);
        if (dVarK3.f30564a != null && dVarK3.f30566c) {
            int iD3 = dVarK3.d();
            for (n6.d dVar11 : dVarK3.f30564a) {
                n6.g gVar4 = dVar11.f30567d;
                int i14 = i11 + 1;
                boolean zA3 = a(gVar4);
                n6.d dVar12 = gVar4.O;
                if (gVar4.B() && zA3) {
                    n6.h.c0(gVar4, cVar, new b());
                }
                if (gVar4.V[r17 == true ? 1 : 0] != n6.f.MATCH_CONSTRAINT || zA3) {
                    if (!gVar4.B()) {
                        if (dVar11 == dVar12) {
                            int iE5 = dVar11.e() + iD3;
                            if (gVar4.F) {
                                int i15 = iE5 - gVar4.f30581d0;
                                int i16 = gVar4.Y + i15;
                                gVar4.f30579c0 = i15;
                                gVar4.L.l(i15);
                                gVar4.N.l(i16);
                                dVar12.l(iE5);
                                z11 = r17 == true ? 1 : 0;
                                gVar4.f30597m = z11;
                            } else {
                                z11 = r17 == true ? 1 : 0;
                            }
                            i(i14, gVar4, cVar);
                        }
                        r17 = z11;
                    }
                }
                z11 = r17 == true ? 1 : 0;
                r17 = z11;
            }
        }
        gVar.f30601o = r17;
    }
}
