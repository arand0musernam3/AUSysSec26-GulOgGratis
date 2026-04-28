package o6;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f32017k = new int[2];

    public static void m(int[] iArr, int i11, int i12, int i13, int i14, float f11, int i15) {
        int i16 = i12 - i11;
        int i17 = i14 - i13;
        if (i15 != -1) {
            if (i15 == 0) {
                iArr[0] = (int) ((i17 * f11) + 0.5f);
                iArr[1] = i17;
                return;
            } else {
                if (i15 != 1) {
                    return;
                }
                iArr[0] = i16;
                iArr[1] = (int) ((i16 * f11) + 0.5f);
                return;
            }
        }
        int i18 = (int) ((i17 * f11) + 0.5f);
        int i19 = (int) ((i16 / f11) + 0.5f);
        if (i18 <= i16) {
            iArr[0] = i18;
            iArr[1] = i17;
        } else if (i19 <= i17) {
            iArr[0] = i16;
            iArr[1] = i19;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0262  */
    @Override // o6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(o6.e r23) {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.m.a(o6.e):void");
    }

    @Override // o6.t
    public final void d() {
        n6.g gVar;
        n6.g gVar2;
        n6.f fVar;
        n6.g gVar3;
        n6.g gVar4;
        n6.f fVar2;
        n6.g gVar5 = this.f32030b;
        boolean z11 = gVar5.f30574a;
        h hVar = this.f32033e;
        if (z11) {
            hVar.d(gVar5.s());
        }
        boolean z12 = hVar.f32012j;
        ArrayList arrayList = hVar.f32013k;
        ArrayList arrayList2 = hVar.l;
        g gVar6 = this.f32037i;
        g gVar7 = this.f32036h;
        if (z12) {
            n6.f fVar3 = this.f32032d;
            n6.f fVar4 = n6.f.MATCH_PARENT;
            if (fVar3 == fVar4 && (gVar2 = (gVar = this.f32030b).W) != null && ((fVar = gVar2.V[0]) == n6.f.FIXED || fVar == fVar4)) {
                t.b(gVar7, gVar2.f30580d.f32036h, gVar.K.e());
                t.b(gVar6, gVar2.f30580d.f32037i, -this.f32030b.M.e());
                return;
            }
        } else {
            n6.g gVar8 = this.f32030b;
            n6.f fVar5 = gVar8.V[0];
            this.f32032d = fVar5;
            if (fVar5 != n6.f.MATCH_CONSTRAINT) {
                n6.f fVar6 = n6.f.MATCH_PARENT;
                if (fVar5 == fVar6 && (gVar4 = gVar8.W) != null && ((fVar2 = gVar4.V[0]) == n6.f.FIXED || fVar2 == fVar6)) {
                    int iS = (gVar4.s() - this.f32030b.K.e()) - this.f32030b.M.e();
                    t.b(gVar7, gVar4.f30580d.f32036h, this.f32030b.K.e());
                    t.b(gVar6, gVar4.f30580d.f32037i, -this.f32030b.M.e());
                    hVar.d(iS);
                    return;
                }
                if (fVar5 == n6.f.FIXED) {
                    hVar.d(gVar8.s());
                }
            }
        }
        if (hVar.f32012j) {
            n6.g gVar9 = this.f32030b;
            if (gVar9.f30574a) {
                n6.d[] dVarArr = gVar9.S;
                n6.d dVar = dVarArr[0];
                n6.d dVar2 = dVar.f30569f;
                if (dVar2 != null && dVarArr[1].f30569f != null) {
                    boolean z13 = gVar9.z();
                    n6.g gVar10 = this.f32030b;
                    if (z13) {
                        gVar7.f32008f = gVar10.S[0].e();
                        gVar6.f32008f = -this.f32030b.S[1].e();
                        return;
                    }
                    g gVarH = t.h(gVar10.S[0]);
                    if (gVarH != null) {
                        t.b(gVar7, gVarH, this.f32030b.S[0].e());
                    }
                    g gVarH2 = t.h(this.f32030b.S[1]);
                    if (gVarH2 != null) {
                        t.b(gVar6, gVarH2, -this.f32030b.S[1].e());
                    }
                    gVar7.f32004b = true;
                    gVar6.f32004b = true;
                    return;
                }
                if (dVar2 != null) {
                    g gVarH3 = t.h(dVar);
                    if (gVarH3 != null) {
                        t.b(gVar7, gVarH3, this.f32030b.S[0].e());
                        t.b(gVar6, gVar7, hVar.f32009g);
                        return;
                    }
                    return;
                }
                n6.d dVar3 = dVarArr[1];
                if (dVar3.f30569f != null) {
                    g gVarH4 = t.h(dVar3);
                    if (gVarH4 != null) {
                        t.b(gVar6, gVarH4, -this.f32030b.S[1].e());
                        t.b(gVar7, gVar6, -hVar.f32009g);
                        return;
                    }
                    return;
                }
                if ((gVar9 instanceof n6.m) || gVar9.W == null || gVar9.k(n6.c.CENTER).f30569f != null) {
                    return;
                }
                n6.g gVar11 = this.f32030b;
                t.b(gVar7, gVar11.W.f30580d.f32036h, gVar11.t());
                t.b(gVar6, gVar7, hVar.f32009g);
                return;
            }
        }
        if (this.f32032d == n6.f.MATCH_CONSTRAINT) {
            n6.g gVar12 = this.f32030b;
            int i11 = gVar12.f30609s;
            if (i11 == 2) {
                n6.g gVar13 = gVar12.W;
                if (gVar13 != null) {
                    h hVar2 = gVar13.f30582e.f32033e;
                    arrayList2.add(hVar2);
                    hVar2.f32013k.add(hVar);
                    hVar.f32004b = true;
                    arrayList.add(gVar7);
                    arrayList.add(gVar6);
                }
            } else if (i11 == 3) {
                if (gVar12.f30611t == 3) {
                    gVar7.f32003a = this;
                    gVar6.f32003a = this;
                    p pVar = gVar12.f30582e;
                    pVar.f32036h.f32003a = this;
                    pVar.f32037i.f32003a = this;
                    hVar.f32003a = this;
                    if (gVar12.A()) {
                        arrayList2.add(this.f32030b.f30582e.f32033e);
                        this.f32030b.f30582e.f32033e.f32013k.add(hVar);
                        p pVar2 = this.f32030b.f30582e;
                        pVar2.f32033e.f32003a = this;
                        arrayList2.add(pVar2.f32036h);
                        arrayList2.add(this.f32030b.f30582e.f32037i);
                        this.f32030b.f30582e.f32036h.f32013k.add(hVar);
                        this.f32030b.f30582e.f32037i.f32013k.add(hVar);
                    } else {
                        boolean z14 = this.f32030b.z();
                        n6.g gVar14 = this.f32030b;
                        if (z14) {
                            gVar14.f30582e.f32033e.l.add(hVar);
                            arrayList.add(this.f32030b.f30582e.f32033e);
                        } else {
                            gVar14.f30582e.f32033e.l.add(hVar);
                        }
                    }
                } else {
                    h hVar3 = gVar12.f30582e.f32033e;
                    arrayList2.add(hVar3);
                    hVar3.f32013k.add(hVar);
                    this.f32030b.f30582e.f32036h.f32013k.add(hVar);
                    this.f32030b.f30582e.f32037i.f32013k.add(hVar);
                    hVar.f32004b = true;
                    arrayList.add(gVar7);
                    arrayList.add(gVar6);
                    gVar7.l.add(hVar);
                    gVar6.l.add(hVar);
                }
            }
        }
        n6.g gVar15 = this.f32030b;
        n6.d[] dVarArr2 = gVar15.S;
        n6.d dVar4 = dVarArr2[0];
        n6.d dVar5 = dVar4.f30569f;
        if (dVar5 != null && dVarArr2[1].f30569f != null) {
            boolean z15 = gVar15.z();
            n6.g gVar16 = this.f32030b;
            if (z15) {
                gVar7.f32008f = gVar16.S[0].e();
                gVar6.f32008f = -this.f32030b.S[1].e();
                return;
            }
            g gVarH5 = t.h(gVar16.S[0]);
            g gVarH6 = t.h(this.f32030b.S[1]);
            if (gVarH5 != null) {
                gVarH5.b(this);
            }
            if (gVarH6 != null) {
                gVarH6.b(this);
            }
            this.f32038j = s.CENTER;
            return;
        }
        if (dVar5 != null) {
            g gVarH7 = t.h(dVar4);
            if (gVarH7 != null) {
                t.b(gVar7, gVarH7, this.f32030b.S[0].e());
                c(gVar6, gVar7, 1, hVar);
                return;
            }
            return;
        }
        n6.d dVar6 = dVarArr2[1];
        if (dVar6.f30569f != null) {
            g gVarH8 = t.h(dVar6);
            if (gVarH8 != null) {
                t.b(gVar6, gVarH8, -this.f32030b.S[1].e());
                c(gVar7, gVar6, -1, hVar);
                return;
            }
            return;
        }
        if ((gVar15 instanceof n6.m) || (gVar3 = gVar15.W) == null) {
            return;
        }
        t.b(gVar7, gVar3.f30580d.f32036h, gVar15.t());
        c(gVar6, gVar7, 1, hVar);
    }

    @Override // o6.t
    public final void e() {
        g gVar = this.f32036h;
        if (gVar.f32012j) {
            this.f32030b.f30577b0 = gVar.f32009g;
        }
    }

    @Override // o6.t
    public final void f() {
        this.f32031c = null;
        this.f32036h.c();
        this.f32037i.c();
        this.f32033e.c();
        this.f32035g = false;
    }

    @Override // o6.t
    public final boolean k() {
        return this.f32032d != n6.f.MATCH_CONSTRAINT || this.f32030b.f30609s == 0;
    }

    public final void n() {
        this.f32035g = false;
        g gVar = this.f32036h;
        gVar.c();
        gVar.f32012j = false;
        g gVar2 = this.f32037i;
        gVar2.c();
        gVar2.f32012j = false;
        this.f32033e.f32012j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f32030b.f30596l0;
    }
}
